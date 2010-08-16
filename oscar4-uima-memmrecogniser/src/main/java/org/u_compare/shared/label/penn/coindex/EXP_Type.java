
/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label.penn.coindex;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** EXPletive<BR></BR>
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * @generated */
public class EXP_Type extends NullElementLabel_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EXP_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EXP_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EXP(addr, EXP_Type.this);
  			   EXP_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EXP(addr, EXP_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = EXP.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.coindex.EXP");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EXP_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    