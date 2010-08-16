
/* First created by JCasGen Wed Jan 20 15:12:13 GMT 2010 */
package uk.ac.nactem.cheta;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;


/** Reaction
 * Updated by JCasGen Mon Aug 16 14:00:43 BST 2010
 * @generated */
public class RN_Type extends ChemicalEntity_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RN_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RN_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RN(addr, RN_Type.this);
  			   RN_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RN(addr, RN_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = RN.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uk.ac.nactem.cheta.RN");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public RN_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    