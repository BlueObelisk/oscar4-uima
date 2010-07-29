package uk.ac.nactem.cheta;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.uima.analysis_engine.ResultSpecification;
import org.apache.uima.analysis_engine.annotator.AnnotatorConfigurationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorContext;
import org.apache.uima.analysis_engine.annotator.AnnotatorInitializationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorProcessException;
import org.apache.uima.analysis_engine.annotator.JTextAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.examples.SourceDocumentInformation;
import org.apache.uima.jcas.JCas;
import org.u_compare.shared.AnnotationMetadata;

import uk.ac.cam.ch.wwmm.oscarMEMM.MEMMRecogniser;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.document.ProcessingDocument;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.document.ProcessingDocumentFactory;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.document.Token;
import uk.ac.cam.ch.wwmm.oscarMEMM.memm.document.TokenSequence;

public class OscarMER extends JTextAnnotator_ImplBase {
	private MEMMRecogniser MER;
	ProcessingDocument procDoc = null;
	java.util.List<NamedEntity> Entities;
	String localNE;

	public void initialize(AnnotatorContext aContext)
			throws AnnotatorInitializationException,
			AnnotatorConfigurationException {
		super.initialize(aContext);
		MER = new MEMMRecogniser();
	}

	public void process(JCas aJCas, ResultSpecification rs)
			throws AnnotatorProcessException {

		String docText = aJCas.getDocumentText();
		// try {
		// byte[] docArray = docText.getBytes("ISO-8859-1");
		// docText = new String(docArray);
		// } catch (UnsupportedEncodingException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		FSIterator it = aJCas
				.getAnnotationIndex(SourceDocumentInformation.type).iterator();
		String filename = "";
		if (it.hasNext()) {
			String feature = it.next().toString();
			if (feature.contains("file")) {
				int begin = feature.lastIndexOf("/") + 1;
				int end = feature.indexOf(".xml");
				filename = feature.substring(begin, end);
			}
		}

		try {
			ProcessingDocument procDoc = getProcessingDocument(docText);
			List<TokenSequence> tokenSequences = procDoc.getTokenSequences();
			List<org.u_compare.shared.syntactic.Token> syntaxTokens = new ArrayList<org.u_compare.shared.syntactic.Token>();
			List<String> oscarTokenList = getOscarTokens(tokenSequences);

			syntaxTokens = convertOscarToSyntaxTokens(oscarTokenList, docText,
					aJCas);

			// ////////////////////////////////////

			// String docText = aJCas.getDocumentText();

			/*******
			 *** Create oscartokens from syntactic tokens
			 ***********/
			List<Token> oscarTokens = convertSyntaxToOscarTokens(aJCas);
			List<TokenSequence> toxicList = makeTokenSequences(docText,
					oscarTokens);

			Entities = MER.findNamedEntities(toxicList);
			int beginAnnot, endAnnot = 0;
			float confAnnot = 0;

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("target/" + filename), "UTF8"));

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

				String oscarType = namedEntity.getType();

				if (oscarType.equals("CM")) {

					CM cm = new CM(aJCas, beginAnnot, endAnnot);
					annMeta.setConfidence(confAnnot);
					cm.setMetadata(annMeta);
					cm.addToIndexes();
					out.write(namedEntity.getSurface() + " : " + confAnnot+"\n");
					//
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
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// private Map<String, String> getNormalisedMap(String docText) {
	// Map<String, String> normalisedWordMap = new HashMap<String, String>();
	// int wordBegin = 0;
	// int wordEnd = 0;
	// int startIndex = 0;
	// String newDocText = docText.replace("<HEADER>",
	// " <HEADER> ").replace("</HEADER>", " </HEADER> ").replace("<DIV>",
	// " <DIV> ").replace("</DIV>", " </DIV> ") ;
	// for (String word : newDocText.split(" ")) {
	// if ((word.contains("<B>") || (word.contains("<IT>") || (word
	// .contains("<SB>") || (word.contains("<SP>"))))) &
	// (!word.contains("TABLE"))
	// &(!word.contains("TGROUP"))&(!word.contains("ENTRY"))&(!word.contains("FIGURE"))&(!word.contains("XREF"))
	// &(!word.contains("XREF"))) {
	// wordBegin = docText.indexOf(word, startIndex);
	// wordEnd = word.length();
	// startIndex = wordEnd;
	// //TaggedWord tw = new TaggedWord(word, wordBegin, wordEnd);
	// normalisedWordMap.put(tw.getNormalisedWord(), tw.getOriginalWord());
	// //
	// System.out.println(tw.getNormalisedWord()+" :: "+tw.getOriginalWord());
	// }
	// }
	// return normalisedWordMap;
	// }

	private String makeSourceString(List<TokenSequence> tokenSequences) {
		String sourceString = "";
		for (TokenSequence tokenSequence : tokenSequences) {
			sourceString += tokenSequence.getSourceString() + " ";
		}

		return sourceString;
	}

	public List<TokenSequence> postProcess(List<TokenSequence> toxicList) {

		List<TokenSequence> newToxicList = new ArrayList<TokenSequence>();

		for (TokenSequence tokenSequence : toxicList) {
			for (Token token : tokenSequence.getTokens()) {
				token.tokenSequence = tokenSequence;

			}
			TokenSequence newToxic = new TokenSequence(tokenSequence
					.getSourceString(), tokenSequence.getOffset(),
					tokenSequence.getDoc(), tokenSequence.getTokens());
			newToxicList.add(newToxic);
		}

		return newToxicList;
	}

	public List<TokenSequence> makeTokenSequences(String docText,
			List<Token> oscarTokens) {

		TokenSequence toxic = new TokenSequence(docText, 0, null, oscarTokens);

		List<TokenSequence> toxicList = new ArrayList<TokenSequence>();
		toxicList.add(toxic);
		toxicList = postProcess(toxicList);

		return toxicList;
	}

	public List<Token> convertSyntaxToOscarTokens(JCas aJCas) {
		FSIndex tokenIndex = aJCas
				.getAnnotationIndex(org.u_compare.shared.syntactic.Token.type);
		FSIterator tokenIterator = tokenIndex.iterator();

		int id = 0;
		int counter = 0;
		List<Token> oscarTokens = new LinkedList<Token>();
		boolean endFlag = true;
		String regex = "<[a-zA-Z\\/][^>]*>";

		while (tokenIterator.hasNext()) {

			counter++;
			org.u_compare.shared.syntactic.Token syntaxToken = (org.u_compare.shared.syntactic.Token) tokenIterator
					.get();
			String tokenValue = syntaxToken.getCoveredText();
			// if ((tokenValue.contains("<B>") || (tokenValue.contains("<IT>")
			// || (tokenValue
			// .contains("<SB>") || (tokenValue.contains("<SP>")))))) {
			// tokenValue = tokenValue.replaceAll(regex, "");
			//
			// }
			Token oscarTok = new Token(tokenValue, syntaxToken.getBegin(),
					syntaxToken.getEnd(), null, "O", null);

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

		if (docText.contains("CURRENT_TITLE>")) {
			tokeniseIndex = docText.indexOf("CURRENT_TITLE>");
		}
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



			if (tokeniseIndex > 0) {
				org.u_compare.shared.syntactic.Token tok = new org.u_compare.shared.syntactic.Token(
						aJCas);
				tok.setBegin(tokeniseIndex);
				tok.setEnd(tokeniseIndex + oscarValue.length());
				lastFoundIndex = tok.getEnd();
				tok.addToIndexes();
				syntaxTokens.add(tok);
			}

			else {
				 System.err.println("What is this i am not supposed to be here "
				 + oscarValue);
			}
		}
		return syntaxTokens;
	}

	public List<String> getOscarTokens(List<TokenSequence> tokenSequences) {
		List<String> oscarTokenList = new ArrayList<String>();

		for (int j = 0; j < tokenSequences.size(); j++) {
			TokenSequence tokenSequence = tokenSequences.get(j);

			for (Token oscarToken : tokenSequence.getTokens()) {
				// System.out.println(oscarToken.getValue());
				String oscarValue = oscarToken.getValue();

				oscarTokenList.add(oscarValue);

				// String oscarValue =
				// org.apache.commons.lang.StringEscapeUtils.unescapeHtml(oscarToken.getValue());

			}
		}
		return oscarTokenList;
	}

	private ProcessingDocument getProcessingDocument(String docText)
			throws ParsingException, ValidityException, IOException, Exception {
		Document sourceDoc = new Builder().build(docText, "");
		// Document sourceDoc = TextToSciXML.textToSciXML(docText);

		ProcessingDocument procDoc = ProcessingDocumentFactory.getInstance()
				.makeTokenisedDocument(sourceDoc, true, true, false);
		List<Token> oscarTokenList = null;
		try {
			procDoc = new ProcessingDocumentFactory().makeTokenisedDocument(
					sourceDoc, true, false, false);
		} catch (Exception e) {
			System.err.println("Can't find file, please check your path");
			e.printStackTrace();
		}
		return procDoc;
	}

	//
	// public void writeToFile(String filename){
	// try {
	// FileWriter outFile = new FileWriter(filename);
	// PrintWriter out = new PrintWriter(outFile);
	//
	// // Also could be written as follows on one line
	// // Printwriter out = new PrintWriter(new FileWriter(args[0]));
	//
	// // Write text to file
	// out.println("This is line 1");
	// out.println("This is line 2");
	// out.print("This is line3 part 1, ");
	// out.println("this is line 3 part 2");
	// out.close();
	// } catch (IOException e){
	// e.printStackTrace();
	// }
	// }
	private List<Token> createOscarTokens(
			List<org.u_compare.shared.syntactic.Token> syntacticTokens) {

		List<Token> oscarTokens = new LinkedList<Token>();
		int id = 0;
		for (org.u_compare.shared.syntactic.Token syntaxToken : syntacticTokens)

		{
			Token oscarTok = new Token(syntaxToken.getCoveredText(),
					syntaxToken.getBegin(), syntaxToken.getEnd(), null, "0",
					null);
			oscarTok.setId(id);
			oscarTokens.add(oscarTok);
			id++;
		}

		return oscarTokens;
	}

}
