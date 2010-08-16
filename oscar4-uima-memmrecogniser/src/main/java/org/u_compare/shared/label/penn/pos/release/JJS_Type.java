
/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.label.penn.pos.release;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.u_compare.shared.label.penn.pos.general.Adjective_Type;

/** Adjective, superative
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * @generated */
public class JJS_Type extends Adjective_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (JJS_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = JJS_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new JJS(addr, JJS_Type.this);
  			   JJS_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new JJS(addr, JJS_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = JJS.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.pos.release.JJS");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public JJS_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    