
/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label.stanford;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** Stanford Dependency: prt
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * @generated */
public class prt_Type extends StanfordDependencyLabel_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (prt_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = prt_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new prt(addr, prt_Type.this);
  			   prt_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new prt(addr, prt_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = prt.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.stanford.prt");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public prt_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    