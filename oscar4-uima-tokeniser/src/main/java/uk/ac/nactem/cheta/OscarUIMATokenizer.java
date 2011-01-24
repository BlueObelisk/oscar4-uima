package uk.ac.nactem.cheta;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.uima.analysis_engine.ResultSpecification;
import org.apache.uima.analysis_engine.annotator.AnnotatorConfigurationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorContext;
import org.apache.uima.analysis_engine.annotator.AnnotatorInitializationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorProcessException;
import org.apache.uima.analysis_engine.annotator.JTextAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;

import uk.ac.cam.ch.wwmm.oscar.document.IProcessingDocument;
import uk.ac.cam.ch.wwmm.oscar.document.IToken;
import uk.ac.cam.ch.wwmm.oscar.document.ITokenSequence;
import uk.ac.cam.ch.wwmm.oscar.document.ProcessingDocumentFactory;
import uk.ac.cam.ch.wwmm.oscartokeniser.Tokeniser;

public class OscarUIMATokenizer extends JTextAnnotator_ImplBase {

	String localNE;
	int index = 0;
	private static final Logger LOG = Logger.getLogger(OscarUIMATokenizer.class);

	public void initialize(AnnotatorContext aContext)
			throws AnnotatorInitializationException,
			AnnotatorConfigurationException {
		super.initialize(aContext);
	}

	public void process(JCas aJCas, ResultSpecification rs)
			throws AnnotatorProcessException {
		String docText = aJCas.getDocumentText();


		List<String> oscarTokenList = getOscarTokens(docText);

		convertOscarToSyntaxTokens(oscarTokenList, docText, aJCas);
	}

	public List<org.u_compare.shared.syntactic.Token> convertOscarToSyntaxTokens(
			List<String> oscarTokenList, String docText, JCas aJCas) {
		int tokeniseIndex = -1;
		int lastFoundIndex = 0;

		List<org.u_compare.shared.syntactic.Token> syntaxTokens = new ArrayList<org.u_compare.shared.syntactic.Token>();
		for (String oscarValue : oscarTokenList) {
//			oscarValue = org.apache.commons.lang.StringEscapeUtils
//					.escapeHtml(oscarValue);
			if (lastFoundIndex == 0)
				tokeniseIndex = docText.indexOf(oscarValue);
			else
				tokeniseIndex = docText.indexOf(oscarValue, lastFoundIndex);
			if (tokeniseIndex == -1) {
//				oscarValue = org.apache.commons.lang.StringEscapeUtils
//						.unescapeHtml(oscarValue);
				tokeniseIndex = docText.indexOf(oscarValue, lastFoundIndex);

			}

			if (tokeniseIndex >= 0) {
				org.u_compare.shared.syntactic.Token tok = new org.u_compare.shared.syntactic.Token(
						aJCas);
				tok.setBegin(tokeniseIndex);
				tok.setEnd(tokeniseIndex + oscarValue.length());
				lastFoundIndex = tok.getEnd();
				tok.addToIndexes();
				syntaxTokens.add(tok);
			}

			else {
				LOG.error("Error: can't parse the character: " + oscarValue);
			}
		}
		return syntaxTokens;
	}

	public List<String> getOscarTokens(String docText) {
				
		IProcessingDocument procDoc = ProcessingDocumentFactory.getInstance()
				.makeTokenisedDocument(Tokeniser.getInstance(), docText);

		List<ITokenSequence> tokenSequences = procDoc.getTokenSequences();

		List<String> oscarTokenList = new ArrayList<String>();

		for (int j = 0; j < tokenSequences.size(); j++) {
			ITokenSequence tokenSequence = tokenSequences.get(j);

			for (IToken oscarToken : tokenSequence.getTokens()) {
				String oscarValue = oscarToken.getValue();
				oscarTokenList.add(oscarValue);
			}
		}
		return oscarTokenList;
	}
}
