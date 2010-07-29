

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.comparable;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class MatchedPair extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(MatchedPair.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MatchedPair() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MatchedPair(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MatchedPair(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: goldAnnotation

  /** getter for goldAnnotation - gets 
   * @generated */
  public TOP getGoldAnnotation() {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_goldAnnotation == null)
      jcasType.jcas.throwFeatMissing("goldAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_goldAnnotation)));}
    
  /** setter for goldAnnotation - sets  
   * @generated */
  public void setGoldAnnotation(TOP v) {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_goldAnnotation == null)
      jcasType.jcas.throwFeatMissing("goldAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_goldAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: testAnnotation

  /** getter for testAnnotation - gets 
   * @generated */
  public TOP getTestAnnotation() {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_testAnnotation == null)
      jcasType.jcas.throwFeatMissing("testAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_testAnnotation)));}
    
  /** setter for testAnnotation - sets  
   * @generated */
  public void setTestAnnotation(TOP v) {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_testAnnotation == null)
      jcasType.jcas.throwFeatMissing("testAnnotation", "org.u_compare.shared.comparable.MatchedPair");
    jcasType.ll_cas.ll_setRefValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_testAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public float getConfidence() {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.u_compare.shared.comparable.MatchedPair");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(float v) {
    if (MatchedPair_Type.featOkTst && ((MatchedPair_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.u_compare.shared.comparable.MatchedPair");
    jcasType.ll_cas.ll_setFloatValue(addr, ((MatchedPair_Type)jcasType).casFeatCode_confidence, v);}    
  }

    