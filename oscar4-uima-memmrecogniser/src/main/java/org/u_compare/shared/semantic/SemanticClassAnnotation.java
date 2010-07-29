

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class SemanticClassAnnotation extends SemanticAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SemanticClassAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SemanticClassAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SemanticClassAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SemanticClassAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SemanticClassAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: linkedAnnotationSets

  /** getter for linkedAnnotationSets - gets 
   * @generated */
  public FSArray getLinkedAnnotationSets() {
    if (SemanticClassAnnotation_Type.featOkTst && ((SemanticClassAnnotation_Type)jcasType).casFeat_linkedAnnotationSets == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotationSets", "org.u_compare.shared.semantic.SemanticClassAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets)));}
    
  /** setter for linkedAnnotationSets - sets  
   * @generated */
  public void setLinkedAnnotationSets(FSArray v) {
    if (SemanticClassAnnotation_Type.featOkTst && ((SemanticClassAnnotation_Type)jcasType).casFeat_linkedAnnotationSets == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotationSets", "org.u_compare.shared.semantic.SemanticClassAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for linkedAnnotationSets - gets an indexed value - 
   * @generated */
  public LinkedAnnotationSet getLinkedAnnotationSets(int i) {
    if (SemanticClassAnnotation_Type.featOkTst && ((SemanticClassAnnotation_Type)jcasType).casFeat_linkedAnnotationSets == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotationSets", "org.u_compare.shared.semantic.SemanticClassAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets), i);
    return (LinkedAnnotationSet)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets), i)));}

  /** indexed setter for linkedAnnotationSets - sets an indexed value - 
   * @generated */
  public void setLinkedAnnotationSets(int i, LinkedAnnotationSet v) { 
    if (SemanticClassAnnotation_Type.featOkTst && ((SemanticClassAnnotation_Type)jcasType).casFeat_linkedAnnotationSets == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotationSets", "org.u_compare.shared.semantic.SemanticClassAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SemanticClassAnnotation_Type)jcasType).casFeatCode_linkedAnnotationSets), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    