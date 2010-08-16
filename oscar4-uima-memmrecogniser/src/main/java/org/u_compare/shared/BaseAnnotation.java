

/* First created by JCasGen Wed Jul 28 16:01:35 BST 2010 */
package org.u_compare.shared;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Base abstract type for annotations with AnnotationMetadata. <br></br>
 * Updated by JCasGen Mon Aug 16 14:00:41 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class BaseAnnotation extends DiscontinuousAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: metadata

  /** getter for metadata - gets 
   * @generated */
  public AnnotationMetadata getMetadata() {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_metadata == null)
      jcasType.jcas.throwFeatMissing("metadata", "org.u_compare.shared.BaseAnnotation");
    return (AnnotationMetadata)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_metadata)));}
    
  /** setter for metadata - sets  
   * @generated */
  public void setMetadata(AnnotationMetadata v) {
    if (BaseAnnotation_Type.featOkTst && ((BaseAnnotation_Type)jcasType).casFeat_metadata == null)
      jcasType.jcas.throwFeatMissing("metadata", "org.u_compare.shared.BaseAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((BaseAnnotation_Type)jcasType).casFeatCode_metadata, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    