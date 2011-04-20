package uk.ac.nactem.cheta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.apache.commons.io.IOUtils;
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

import uk.ac.cam.ch.wwmm.oscar.Oscar;
import uk.ac.cam.ch.wwmm.oscar.document.NamedEntity;
import uk.ac.cam.ch.wwmm.oscar.document.TokenSequence;
import ch.unibe.jexample.Given;
import ch.unibe.jexample.JExample;
@RunWith(JExample.class)
public class OscarUimaMEMMTest {

	private static String memmFolder = "uk/ac/nactem/cheta/memmrecogniser/";

	@Test
	public OscarUimaMEMM testConstructor() throws Exception {
		OscarUimaMEMM oscarMEMM = new OscarUimaMEMM();
		Assert.assertNotNull(oscarMEMM);
		return oscarMEMM;
	}

	@Test
	@Given("testConstructor")
	/***************************************
	 * Compares OscarMEMM to OscarUIMA-MEMM
	 */
	public String[] testUIMAMemmRecogniser(OscarUimaMEMM uimaMEMM)
			throws ValidityException, ParsingException, IOException, Exception {

		File dir = new File(ClassLoader.getSystemResource(memmFolder)
				.getFile());
		OscarUIMATokeniser uimaTokeniser = new OscarUIMATokeniser();
		String filenames[] = dir.list();
		for (String tokeniseFile : filenames) {
			JCas aJCas = createJCas();
			String memmPath = memmFolder + tokeniseFile;
            String docText = getContentAsString(memmPath);
			
			aJCas.setDocumentText(docText);
			List<String> oscarTokenList = uimaTokeniser.getOscarTokens(docText);
			uimaMEMM.convertOscarToSyntaxTokens(oscarTokenList, docText,
					aJCas);
			
		    	

			
			List<NamedEntity> oscarEntities = getOscarEntities(docText);
			
			List<NamedEntity> uimaEntities = uimaMEMM.recogniseNEs(aJCas, docText);

			
//			writeToFile(tokeniseFile, uimaEntities);

			Assert.assertEquals("UIMA and OSCAR are the same",
					oscarEntities, uimaEntities);
			

		}
		return filenames;
	}

	private void writeToFile(String tokeniseFile, List<NamedEntity> uimaEntities)
			throws UnsupportedEncodingException, FileNotFoundException,
			IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("target/" + tokeniseFile), "UTF8"));

		for (NamedEntity namedEntity : uimaEntities) {
			if (namedEntity.getType().getName().equals("CM"))
				out.write(namedEntity.getSurface() + " : " + namedEntity.getConfidence()
						+ "\n");
				
		}
			out.close();
	}

	private List<NamedEntity> getOscarEntities(String text) {
		Oscar oscar = new Oscar();
		List<NamedEntity> neList = new ArrayList<NamedEntity>();
		try {
//			text = oscar.normalise(text);
			List<TokenSequence> tokens = oscar.tokenise(text);
			neList = oscar.recogniseNamedEntities(tokens);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return neList;
	}

	private JCas createJCas() throws UIMAException, IOException,
			ResourceInitializationException {
		TypeSystemDescription typeSystemDescription = TypeSystemDescriptionFactory
				.createTypeSystemDescription(NamedEntity.class);
		typeSystemDescription.setName("OscarMEMM");
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
