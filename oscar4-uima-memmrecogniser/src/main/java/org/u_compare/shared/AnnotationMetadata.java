

/* First created by JCasGen Wed Jul 28 16:01:35 BST 2010 */
package org.u_compare.shared;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** THIS TYPE WILL BE CHANGED TO INHERIT APACHE UIMA ANNOTATIONMETADATA TYPE, WHEN IT RELEASED. <br></br>
 * Updated by JCasGen Wed Jul 28 16:01:35 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class AnnotationMetadata extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(AnnotationMetadata.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationMetadata() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotationMetadata(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotationMetadata(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets Range of confidence value should be between 0.0 (lowest) and 1.0 (highest).
   * @generated */
  public float getConfidence() {
    if (AnnotationMetadata_Type.featOkTst && ((AnnotationMetadata_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.u_compare.shared.AnnotationMetadata");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnnotationMetadata_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets Range of confidence value should be between 0.0 (lowest) and 1.0 (highest). 
   * @generated */
  public void setConfidence(float v) {
    if (AnnotationMetadata_Type.featOkTst && ((AnnotationMetadata_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "org.u_compare.shared.AnnotationMetadata");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnnotationMetadata_Type)jcasType).casFeatCode_confidence, v);}    
  }

    