
/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.comparable;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * @generated */
public class MatchedPair_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MatchedPair_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MatchedPair_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MatchedPair(addr, MatchedPair_Type.this);
  			   MatchedPair_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MatchedPair(addr, MatchedPair_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = MatchedPair.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.comparable.MatchedPair");
 
  /** @generated */
  final Feature casFeat_goldAnnotation;
  /** @generated */
  final int     casFeatCode_goldAnnotation;
  /** @generated */ 
  public int getGoldAnnotation(int addr) {
        if (featOkTst && casFeat_goldAnnotation == null)
      jcas.throwFeatMissing("goldAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotation);
  }
  /** @generated */    
  public void setGoldAnnotation(int addr, int v) {
        if (featOkTst && casFeat_goldAnnotation == null)
      jcas.throwFeatMissing("goldAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_goldAnnotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_testAnnotation;
  /** @generated */
  final int     casFeatCode_testAnnotation;
  /** @generated */ 
  public int getTestAnnotation(int addr) {
        if (featOkTst && casFeat_testAnnotation == null)
      jcas.throwFeatMissing("testAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    return ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotation);
  }
  /** @generated */    
  public void setTestAnnotation(int addr, int v) {
        if (featOkTst && casFeat_testAnnotation == null)
      jcas.throwFeatMissing("testAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    ll_cas.ll_setRefValue(addr, casFeatCode_testAnnotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.u_compare.shared.comparable.MatchedPair");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "org.u_compare.shared.comparable.MatchedPair");
    ll_cas.ll_setFloatValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MatchedPair_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_goldAnnotation = jcas.getRequiredFeatureDE(casType, "goldAnnotation", "uima.cas.TOP", featOkTst);
    casFeatCode_goldAnnotation  = (null == casFeat_goldAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goldAnnotation).getCode();

 
    casFeat_testAnnotation = jcas.getRequiredFeatureDE(casType, "testAnnotation", "uima.cas.TOP", featOkTst);
    casFeatCode_testAnnotation  = (null == casFeat_testAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testAnnotation).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Float", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    