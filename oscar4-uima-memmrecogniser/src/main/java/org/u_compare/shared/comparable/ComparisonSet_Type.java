
/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
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

/** 
 * Updated by JCasGen Wed Jul 28 16:01:38 BST 2010
 * @generated */
public class ComparisonSet_Type extends AnnotationGroup_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ComparisonSet_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ComparisonSet_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ComparisonSet(addr, ComparisonSet_Type.this);
  			   ComparisonSet_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ComparisonSet(addr, ComparisonSet_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ComparisonSet.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.comparable.ComparisonSet");
 
  /** @generated */
  final Feature casFeat_goldAnnotations;
  /** @generated */
  final int     casFeatCode_goldAnnotations;
  /** @generated */ 
  public int getGoldAnnotations(int addr) {
        if (featOkTst && casFeat_goldAnnotations == null)
      jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations);
  }
  /** @generated */    
  public void setGoldAnnotations(int addr, int v) {
        if (featOkTst && casFeat_goldAnnotations == null)
      jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_goldAnnotations, v);}
    
   /** @generated */
  public int getGoldAnnotations(int addr, int i) {
        if (featOkTst && casFeat_goldAnnotations == null)
      jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i);
  }
   
  /** @generated */ 
  public void setGoldAnnotations(int addr, int i, int v) {
        if (featOkTst && casFeat_goldAnnotations == null)
      jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotations), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_testAnnotations;
  /** @generated */
  final int     casFeatCode_testAnnotations;
  /** @generated */ 
  public int getTestAnnotations(int addr) {
        if (featOkTst && casFeat_testAnnotations == null)
      jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations);
  }
  /** @generated */    
  public void setTestAnnotations(int addr, int v) {
        if (featOkTst && casFeat_testAnnotations == null)
      jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_testAnnotations, v);}
    
   /** @generated */
  public int getTestAnnotations(int addr, int i) {
        if (featOkTst && casFeat_testAnnotations == null)
      jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i);
  }
   
  /** @generated */ 
  public void setTestAnnotations(int addr, int i, int v) {
        if (featOkTst && casFeat_testAnnotations == null)
      jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotations), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_matchedAnnotations;
  /** @generated */
  final int     casFeatCode_matchedAnnotations;
  /** @generated */ 
  public int getMatchedAnnotations(int addr) {
        if (featOkTst && casFeat_matchedAnnotations == null)
      jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations);
  }
  /** @generated */    
  public void setMatchedAnnotations(int addr, int v) {
        if (featOkTst && casFeat_matchedAnnotations == null)
      jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_matchedAnnotations, v);}
    
   /** @generated */
  public int getMatchedAnnotations(int addr, int i) {
        if (featOkTst && casFeat_matchedAnnotations == null)
      jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i);
  }
   
  /** @generated */ 
  public void setMatchedAnnotations(int addr, int i, int v) {
        if (featOkTst && casFeat_matchedAnnotations == null)
      jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_matchedAnnotations), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_goldAnnotationGroup;
  /** @generated */
  final int     casFeatCode_goldAnnotationGroup;
  /** @generated */ 
  public int getGoldAnnotationGroup(int addr) {
        if (featOkTst && casFeat_goldAnnotationGroup == null)
      jcas.throwFeatMissing("goldAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_goldAnnotationGroup);
  }
  /** @generated */    
  public void setGoldAnnotationGroup(int addr, int v) {
        if (featOkTst && casFeat_goldAnnotationGroup == null)
      jcas.throwFeatMissing("goldAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_goldAnnotationGroup, v);}
    
  
 
  /** @generated */
  final Feature casFeat_testAnnotationGroup;
  /** @generated */
  final int     casFeatCode_testAnnotationGroup;
  /** @generated */ 
  public int getTestAnnotationGroup(int addr) {
        if (featOkTst && casFeat_testAnnotationGroup == null)
      jcas.throwFeatMissing("testAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_testAnnotationGroup);
  }
  /** @generated */    
  public void setTestAnnotationGroup(int addr, int v) {
        if (featOkTst && casFeat_testAnnotationGroup == null)
      jcas.throwFeatMissing("testAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_testAnnotationGroup, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ComparisonSet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_goldAnnotations = jcas.getRequiredFeatureDE(casType, "goldAnnotations", "uima.cas.FSArray", featOkTst);
    casFeatCode_goldAnnotations  = (null == casFeat_goldAnnotations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goldAnnotations).getCode();

 
    casFeat_testAnnotations = jcas.getRequiredFeatureDE(casType, "testAnnotations", "uima.cas.FSArray", featOkTst);
    casFeatCode_testAnnotations  = (null == casFeat_testAnnotations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testAnnotations).getCode();

 
    casFeat_matchedAnnotations = jcas.getRequiredFeatureDE(casType, "matchedAnnotations", "uima.cas.FSArray", featOkTst);
    casFeatCode_matchedAnnotations  = (null == casFeat_matchedAnnotations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_matchedAnnotations).getCode();

 
    casFeat_goldAnnotationGroup = jcas.getRequiredFeatureDE(casType, "goldAnnotationGroup", "org.u_compare.shared.comparable.AnnotationGroup", featOkTst);
    casFeatCode_goldAnnotationGroup  = (null == casFeat_goldAnnotationGroup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_goldAnnotationGroup).getCode();

 
    casFeat_testAnnotationGroup = jcas.getRequiredFeatureDE(casType, "testAnnotationGroup", "org.u_compare.shared.comparable.AnnotationGroup", featOkTst);
    casFeatCode_testAnnotationGroup  = (null == casFeat_testAnnotationGroup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_testAnnotationGroup).getCode();

  }
}



    