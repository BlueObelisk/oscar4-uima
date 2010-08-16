

/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.comparable;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class ComparisonSet extends AnnotationGroup {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ComparisonSet.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ComparisonSet() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ComparisonSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ComparisonSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: goldAnnotations

  /** getter for goldAnnotations - gets A set of "gold" annotations. Should be filled by developers.
   * @generated */
  public FSArray getGoldAnnotations() {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotations == null)
      jcasType.jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations)));}
    
  /** setter for goldAnnotations - sets A set of "gold" annotations. Should be filled by developers. 
   * @generated */
  public void setGoldAnnotations(FSArray v) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotations == null)
      jcasType.jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for goldAnnotations - gets an indexed value - A set of "gold" annotations. Should be filled by developers.
   * @generated */
  public TOP getGoldAnnotations(int i) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotations == null)
      jcasType.jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations), i)));}

  /** indexed setter for goldAnnotations - sets an indexed value - A set of "gold" annotations. Should be filled by developers.
   * @generated */
  public void setGoldAnnotations(int i, TOP v) { 
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotations == null)
      jcasType.jcas.throwFeatMissing("goldAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotations), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: testAnnotations

  /** getter for testAnnotations - gets A set of "test" annotations. Should be filled by developers.
   * @generated */
  public FSArray getTestAnnotations() {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotations == null)
      jcasType.jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations)));}
    
  /** setter for testAnnotations - sets A set of "test" annotations. Should be filled by developers. 
   * @generated */
  public void setTestAnnotations(FSArray v) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotations == null)
      jcasType.jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for testAnnotations - gets an indexed value - A set of "test" annotations. Should be filled by developers.
   * @generated */
  public TOP getTestAnnotations(int i) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotations == null)
      jcasType.jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations), i)));}

  /** indexed setter for testAnnotations - sets an indexed value - A set of "test" annotations. Should be filled by developers.
   * @generated */
  public void setTestAnnotations(int i, TOP v) { 
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotations == null)
      jcasType.jcas.throwFeatMissing("testAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotations), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: matchedAnnotations

  /** getter for matchedAnnotations - gets A set of annotations, which are recoginized as "matched" through comparison of gold and test annotations. Should be filled by developers.
   * @generated */
  public FSArray getMatchedAnnotations() {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_matchedAnnotations == null)
      jcasType.jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations)));}
    
  /** setter for matchedAnnotations - sets A set of annotations, which are recoginized as "matched" through comparison of gold and test annotations. Should be filled by developers. 
   * @generated */
  public void setMatchedAnnotations(FSArray v) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_matchedAnnotations == null)
      jcasType.jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matchedAnnotations - gets an indexed value - A set of annotations, which are recoginized as "matched" through comparison of gold and test annotations. Should be filled by developers.
   * @generated */
  public MatchedPair getMatchedAnnotations(int i) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_matchedAnnotations == null)
      jcasType.jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations), i);
    return (MatchedPair)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations), i)));}

  /** indexed setter for matchedAnnotations - sets an indexed value - A set of annotations, which are recoginized as "matched" through comparison of gold and test annotations. Should be filled by developers.
   * @generated */
  public void setMatchedAnnotations(int i, MatchedPair v) { 
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_matchedAnnotations == null)
      jcasType.jcas.throwFeatMissing("matchedAnnotations", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_matchedAnnotations), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: goldAnnotationGroup

  /** getter for goldAnnotationGroup - gets Reference to the original gold AnnotationGroup. Developers should iterate and pick proper annotations from this FSList.
   * @generated */
  public AnnotationGroup getGoldAnnotationGroup() {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotationGroup == null)
      jcasType.jcas.throwFeatMissing("goldAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    return (AnnotationGroup)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotationGroup)));}
    
  /** setter for goldAnnotationGroup - sets Reference to the original gold AnnotationGroup. Developers should iterate and pick proper annotations from this FSList. 
   * @generated */
  public void setGoldAnnotationGroup(AnnotationGroup v) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_goldAnnotationGroup == null)
      jcasType.jcas.throwFeatMissing("goldAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_goldAnnotationGroup, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: testAnnotationGroup

  /** getter for testAnnotationGroup - gets Reference to the original test AnnotationGroup. Developers should iterate and pick proper annotations from this FSList.
   * @generated */
  public AnnotationGroup getTestAnnotationGroup() {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotationGroup == null)
      jcasType.jcas.throwFeatMissing("testAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    return (AnnotationGroup)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotationGroup)));}
    
  /** setter for testAnnotationGroup - sets Reference to the original test AnnotationGroup. Developers should iterate and pick proper annotations from this FSList. 
   * @generated */
  public void setTestAnnotationGroup(AnnotationGroup v) {
    if (ComparisonSet_Type.featOkTst && ((ComparisonSet_Type)jcasType).casFeat_testAnnotationGroup == null)
      jcasType.jcas.throwFeatMissing("testAnnotationGroup", "org.u_compare.shared.comparable.ComparisonSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((ComparisonSet_Type)jcasType).casFeatCode_testAnnotationGroup, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    