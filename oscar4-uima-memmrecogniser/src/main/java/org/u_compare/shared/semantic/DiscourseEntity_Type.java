
/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.semantic;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * @generated */
public class DiscourseEntity_Type extends SemanticClassAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DiscourseEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DiscourseEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DiscourseEntity(addr, DiscourseEntity_Type.this);
  			   DiscourseEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DiscourseEntity(addr, DiscourseEntity_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DiscourseEntity.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.semantic.DiscourseEntity");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DiscourseEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    