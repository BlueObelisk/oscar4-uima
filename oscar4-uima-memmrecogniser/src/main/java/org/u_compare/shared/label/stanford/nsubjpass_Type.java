
/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label.stanford;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Stanford Dependency: nsubjpass
 * Updated by JCasGen Wed Jul 28 16:01:38 BST 2010
 * @generated */
public class nsubjpass_Type extends StanfordDependencyLabel_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (nsubjpass_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = nsubjpass_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new nsubjpass(addr, nsubjpass_Type.this);
  			   nsubjpass_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new nsubjpass(addr, nsubjpass_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = nsubjpass.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.stanford.nsubjpass");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public nsubjpass_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    