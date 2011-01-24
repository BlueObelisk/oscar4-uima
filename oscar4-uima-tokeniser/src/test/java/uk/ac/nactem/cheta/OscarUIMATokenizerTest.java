package uk.ac.nactem.cheta;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.uima.UIMAException;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.metadata.TypeSystemDescription;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.uimafit.factory.AnalysisEngineFactory;
import org.uimafit.factory.TypeSystemDescriptionFactory;

import uk.ac.cam.ch.wwmm.oscar.document.Token;
import ch.unibe.jexample.Given;
import ch.unibe.jexample.JExample;

@RunWith(JExample.class)

public class OscarUIMATokenizerTest {

	private static String tokeniseFolder = "uk/ac/nactem/cheta/tokenization/";
	private static final Logger LOG = Logger
			.getLogger(OscarUIMATokenizerTest.class);

	@Test
	public OscarUIMATokenizer testConstructor() throws Exception {
		OscarUIMATokenizer oscarUIMATokenizer = new OscarUIMATokenizer();
		Assert.assertNotNull(oscarUIMATokenizer);
		return oscarUIMATokenizer;
	}

	@Test
	@Given("testConstructor")
	/*****************************
	 * A slightly unnecessary test
	 * to see if JCAS alters the input
	 * of text in anyway
	 */
	public String[] testUIMAOscarTokenisation(OscarUIMATokenizer oscarUIMATokenizer)
			throws ValidityException, ParsingException, IOException, Exception {

		
		File dir = new File(ClassLoader.getSystemResource(tokeniseFolder)
				.getFile());

		String filenames[] = dir.list();
		for (String tokeniseFile : filenames) {
			JCas aJCas = createJCas();
			String docText = getContentAsString(tokeniseFolder + tokeniseFile);
			aJCas.setDocumentText(docText);

			List<String> oscarUimaTokenList = oscarUIMATokenizer
					.getOscarTokens(aJCas.getDocumentText());
			List<String> oscarTokenList = oscarUIMATokenizer
					.getOscarTokens(docText);
			Assert.assertEquals("UIMA and OSCAR tokenise the same",
					oscarTokenList, oscarUimaTokenList);

		}
         return filenames;
	}

	@Test
	@Given("testConstructor, testUIMAOscarTokenisation")
	/************************************************
	 * Check if Uima oscar tokenisation produces the same
	 * output as oscar tokenisation
	 * 
	 ************************************************/
	public void testOscarSyntaxTokens(OscarUIMATokenizer oscarUIMATokenizer,
			String[] filenames) throws ValidityException, ParsingException,
			IOException, Exception {
		for (String tokeniseFile : filenames) {
			String docText = getContentAsString(new File(tokeniseFile)
					.getCanonicalPath());

			JCas aJCas = createJCas();
			if (docText != null) {
				aJCas.setDocumentText(docText);

				List<String> oscarTokenList = oscarUIMATokenizer
						.getOscarTokens(docText);

				aJCas.setDocumentText(docText);

				List<org.u_compare.shared.syntactic.Token> syntaxTokens = oscarUIMATokenizer
						.convertOscarToSyntaxTokens(oscarTokenList, docText,
								aJCas);
				List<String> stringSyntaxTokens = convertToStringList(syntaxTokens);
				Assert.assertEquals(stringSyntaxTokens, oscarTokenList);
			}
		}
	}

	private JCas createJCas() throws UIMAException, IOException,
			ResourceInitializationException {
		TypeSystemDescription typeSystemDescription = TypeSystemDescriptionFactory
				.createTypeSystemDescription(Token.class);
		typeSystemDescription.setName("OscarTokeniser");
		AnalysisEngine engine = AnalysisEngineFactory
				.createAnalysisEngine(typeSystemDescription.getName());
		JCas aJCas = engine.newJCas();
		return aJCas;
	}

	private String getContentAsString(String pathName) throws IOException {

		InputStream is = ClassLoader.getSystemResourceAsStream(pathName);
		if (is != null)
			return IOUtils.toString(is, "UTF-8");
		else
			return null;

	}

	private List<String> convertToStringList(
			List<org.u_compare.shared.syntactic.Token> syntaxTokens) {
		List<String> stringTokenList = new ArrayList<String>();
		for (org.u_compare.shared.syntactic.Token token : syntaxTokens) {
			stringTokenList.add(token.getCoveredText());
		}

		return stringTokenList;
	}

}
