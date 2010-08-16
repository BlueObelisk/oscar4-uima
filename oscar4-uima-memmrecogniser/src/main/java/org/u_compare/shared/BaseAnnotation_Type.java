
/* First created by JCasGen Wed Jul 28 16:01:35 BST 2010 */
package org.u_compare.shared;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Base abstract type for annotations with AnnotationMetadata. <br></br>
 * Updated by JCasGen Mon Aug 16 14:00:41 BST 2010
 * @generated */
public class BaseAnnotation_Type extends DiscontinuousAnnotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BaseAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BaseAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BaseAnnotation(addr, BaseAnnotation_Type.this);
  			   BaseAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BaseAnnotation(addr, BaseAnnotation_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = BaseAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.BaseAnnotation");
 
  /** @generated */
  final Feature casFeat_metadata;
  /** @generated */
  final int     casFeatCode_metadata;
  /** @generated */ 
  public int getMetadata(int addr) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.u_compare.shared.BaseAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_metadata);
  }
  /** @generated */    
  public void setMetadata(int addr, int v) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.u_compare.shared.BaseAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_metadata, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BaseAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_metadata = jcas.getRequiredFeatureDE(casType, "metadata", "org.u_compare.shared.AnnotationMetadata", featOkTst);
    casFeatCode_metadata  = (null == casFeat_metadata) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_metadata).getCode();

  }
}



    