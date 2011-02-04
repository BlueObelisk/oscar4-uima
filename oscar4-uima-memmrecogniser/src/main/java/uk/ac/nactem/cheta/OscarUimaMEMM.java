package uk.ac.nactem.cheta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.uima.analysis_engine.ResultSpecification;
import org.apache.uima.analysis_engine.annotator.AnnotatorConfigurationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorContext;
import org.apache.uima.analysis_engine.annotator.AnnotatorInitializationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorProcessException;
import org.apache.uima.analysis_engine.annotator.JTextAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.u_compare.shared.AnnotationMetadata;

import uk.ac.cam.ch.wwmm.oscar.document.IToken;
import uk.ac.cam.ch.wwmm.oscar.document.ITokenSequence;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.document.ProcessingDocument;
import uk.ac.cam.ch.wwmm.oscar.document.Token;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;
import uk.ac.cam.ch.wwmm.oscar.exceptions.ResourceInitialisationException;
import uk.ac.cam.ch.wwmm.oscarMEMM.MEMMRecogniser;
public class OscarUimaMEMM extends JTextAnnotator_ImplBase {
	private   MEMMRecogniser memmRecogniser;
	ProcessingDocument procDoc = null;
	java.util.List<NamedEntity> Entities;
	String localNE;
	private static final Logger LOG = Logger.getLogger(OscarUimaMEMM.class);


	public OscarUimaMEMM(){
		memmRecogniser = new MEMMRecogniser();
	}
	public void initialize(AnnotatorContext aContext)
			throws AnnotatorInitializationException,
			AnnotatorConfigurationException {
		super.initialize(aContext);
		
	}

	public void process(JCas aJCas, ResultSpecification rs)
			throws AnnotatorProcessException {

		

		try {
			 String docText = aJCas.getDocumentText();

			/*******
			 *** Create oscartokens from syntactic tokens
			 ***********/
			Entities = recogniseNEs(aJCas, docText);
			int beginAnnot, endAnnot = 0;
			float confAnnot = 0;


			for (NamedEntity namedEntity : Entities) {

				// set the begin, end, confidence surface of the ne;
				AnnotationMetadata annMeta = new AnnotationMetadata(aJCas);
				beginAnnot = namedEntity.getStart();
				endAnnot = namedEntity.getEnd();

				localNE = namedEntity.getSurface();

				int index = 0;
				index = docText.indexOf(localNE, index);

				if (namedEntity.getConfidence() == Double.NaN) {
					confAnnot = 0;
				} else {
					confAnnot = (float) namedEntity.getConfidence();
				}

				String oscarType = namedEntity.getType().getName();

				if (oscarType.equals("CM")) {

					CM cm = new CM(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					cm.setMetadata(annMeta);
					cm.addToIndexes();
					
				} else if (oscarType.equals("RN")) {
					RN rn = new RN(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					rn.setMetadata(annMeta);
					rn.addToIndexes();
				} else if (oscarType.equals("ASE")) {
					ASE ase = new ASE(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					ase.setMetadata(annMeta);
					ase.addToIndexes();
				} else if (oscarType.equals("CPR")) {
					CPR cpr = new CPR(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					cpr.setMetadata(annMeta);
					cpr.addToIndexes();
				} else if (oscarType.equals("CJ")) {
					CJ cj = new CJ(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					cj.setMetadata(annMeta);
					cj.addToIndexes();
				} else if (oscarType.equals("ONT")) {
					ONT om = new ONT(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					om.setMetadata(annMeta);
					om.addToIndexes();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<NamedEntity> recogniseNEs(JCas aJCas, String docText) throws ResourceInitialisationException {
		List<IToken> oscarTokens = convertSyntaxToOscarTokens(aJCas);
		
		List<ITokenSequence> toxicList = makeTokenSequences(docText,
				oscarTokens);
       
		return memmRecogniser.findNamedEntities(toxicList);
	}

	public List<ITokenSequence> postProcess(List<ITokenSequence> toxicList) {

		List<ITokenSequence> newToxicList = new ArrayList<ITokenSequence>();

		for (ITokenSequence tokenSequence : toxicList) {
			for (IToken token : tokenSequence.getTokens()) {
				token.setTokenSequence(tokenSequence);

			}
			TokenSequence newToxic = new TokenSequence(
					tokenSequence.getSurface(), tokenSequence.getOffset(),
					tokenSequence.getDoc(), tokenSequence.getTokens());
			newToxicList.add(newToxic);
		}

		return newToxicList;
	}

	public List<ITokenSequence> makeTokenSequences(String docText,
			List<IToken> oscarTokens) {

		TokenSequence toxic = new TokenSequence(docText, 0, null, oscarTokens);

		List<ITokenSequence> toxicList = new ArrayList<ITokenSequence>();
		toxicList.add(toxic);
		toxicList = postProcess(toxicList);

		return toxicList;
	}

	public List<IToken> convertSyntaxToOscarTokens(JCas aJCas) {
		FSIndex tokenIndex = aJCas
				.getAnnotationIndex(org.u_compare.shared.syntactic.Token.type);
		FSIterator tokenIterator = tokenIndex.iterator();

		int id = 0;
		int counter = 0;
		List<IToken> oscarTokens = new LinkedList<IToken>();
		boolean endFlag = true;
		String regex = "<[a-zA-Z\\/][^>]*>";

		while (tokenIterator.hasNext()) {

			counter++;
			org.u_compare.shared.syntactic.Token syntaxToken = (org.u_compare.shared.syntactic.Token) tokenIterator
					.get();
			String tokenValue = syntaxToken.getCoveredText();
			IToken oscarTok = new Token(tokenValue, syntaxToken.getBegin(),
					syntaxToken.getEnd(), null, null, null);

			oscarTok.setId(id);

			oscarTokens.add(oscarTok);
			id++;
			if (syntaxToken.getCoveredText().equals(".") & !endFlag) {
				id = 0;
				endFlag = true;
			}
			tokenIterator.moveToNext();
		}
		return oscarTokens;
	}

	public List<org.u_compare.shared.syntactic.Token> convertOscarToSyntaxTokens(
			List<String> oscarTokenList, String docText, JCas aJCas) {
		int tokeniseIndex = -1;
		int lastFoundIndex = 0;

		
		List<org.u_compare.shared.syntactic.Token> syntaxTokens = new ArrayList<org.u_compare.shared.syntactic.Token>();
		for (String oscarValue : oscarTokenList) {
			oscarValue = org.apache.commons.lang.StringEscapeUtils
					.escapeHtml(oscarValue);

			
			tokeniseIndex = docText.indexOf(oscarValue, lastFoundIndex);
			
			if (tokeniseIndex == -1) {
				oscarValue = org.apache.commons.lang.StringEscapeUtils
						.unescapeHtml(oscarValue);
				tokeniseIndex = docText.indexOf(oscarValue, lastFoundIndex);

			}

			if (tokeniseIndex > -1) {
				org.u_compare.shared.syntactic.Token tok = new org.u_compare.shared.syntactic.Token(
						aJCas);
				tok.setBegin(tokeniseIndex);
				tok.setEnd(tokeniseIndex + oscarValue.length());
				lastFoundIndex = tok.getEnd();
				tok.addToIndexes();
				syntaxTokens.add(tok);
			}

			else {
				LOG.debug("What is this i am not supposed to be here "
						+ oscarValue);
			}
		}
		return syntaxTokens;
	}

	public List<String> getOscarTokens(List<ITokenSequence> tokenSequences) {
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

	private List<IToken> createOscarTokens(
			List<org.u_compare.shared.syntactic.Token> syntacticTokens) {

		List<IToken> oscarTokens = new LinkedList<IToken>();
		int id = 0;
		for (org.u_compare.shared.syntactic.Token syntaxToken : syntacticTokens)

		{
			IToken oscarTok = new Token(syntaxToken.getCoveredText(),
					syntaxToken.getBegin(), syntaxToken.getEnd(), null, null,
					null);
			oscarTok.setId(id);
			oscarTokens.add(oscarTok);
			id++;
		}

		return oscarTokens;
	}

}
