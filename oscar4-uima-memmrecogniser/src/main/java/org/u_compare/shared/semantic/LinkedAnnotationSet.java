

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.u_compare.shared.ExternalReference;
import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class LinkedAnnotationSet extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(LinkedAnnotationSet.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected LinkedAnnotationSet() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public LinkedAnnotationSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public LinkedAnnotationSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: linkingRelation

  /** getter for linkingRelation - gets 
   * @generated */
  public ExternalReference getLinkingRelation() {
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkingRelation == null)
      jcasType.jcas.throwFeatMissing("linkingRelation", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    return (ExternalReference)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkingRelation)));}
    
  /** setter for linkingRelation - sets  
   * @generated */
  public void setLinkingRelation(ExternalReference v) {
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkingRelation == null)
      jcasType.jcas.throwFeatMissing("linkingRelation", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkingRelation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: linkedAnnotations

  /** getter for linkedAnnotations - gets 
   * @generated */
  public FSArray getLinkedAnnotations() {
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkedAnnotations == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotations", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations)));}
    
  /** setter for linkedAnnotations - sets  
   * @generated */
  public void setLinkedAnnotations(FSArray v) {
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkedAnnotations == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotations", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for linkedAnnotations - gets an indexed value - 
   * @generated */
  public SemanticClassAnnotation getLinkedAnnotations(int i) {
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkedAnnotations == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotations", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations), i);
    return (SemanticClassAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations), i)));}

  /** indexed setter for linkedAnnotations - sets an indexed value - 
   * @generated */
  public void setLinkedAnnotations(int i, SemanticClassAnnotation v) { 
    if (LinkedAnnotationSet_Type.featOkTst && ((LinkedAnnotationSet_Type)jcasType).casFeat_linkedAnnotations == null)
      jcasType.jcas.throwFeatMissing("linkedAnnotations", "org.u_compare.shared.semantic.LinkedAnnotationSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LinkedAnnotationSet_Type)jcasType).casFeatCode_linkedAnnotations), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    