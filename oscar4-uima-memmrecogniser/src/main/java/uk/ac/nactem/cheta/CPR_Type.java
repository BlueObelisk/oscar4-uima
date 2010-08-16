
/* First created by JCasGen Wed Jan 20 15:12:13 GMT 2010 */
package uk.ac.nactem.cheta;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


/** Chemical prefix
 * Updated by JCasGen Mon Aug 16 14:00:43 BST 2010
 * @generated */
public class CPR_Type extends ChemicalEntity_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CPR_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CPR_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CPR(addr, CPR_Type.this);
  			   CPR_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CPR(addr, CPR_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = CPR.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uk.ac.nactem.cheta.CPR");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public CPR_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    