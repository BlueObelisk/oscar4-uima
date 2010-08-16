
/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.label;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * @generated */
public class UniqueLabel_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UniqueLabel_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UniqueLabel_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UniqueLabel(addr, UniqueLabel_Type.this);
  			   UniqueLabel_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UniqueLabel(addr, UniqueLabel_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = UniqueLabel.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.UniqueLabel");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UniqueLabel_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    