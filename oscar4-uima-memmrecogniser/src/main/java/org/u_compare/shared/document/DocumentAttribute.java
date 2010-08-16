

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.document;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.u_compare.shared.ExternalReference;
import org.apache.uima.jcas.cas.TOP;


/** Abstract type for document attributes, which appear in the document tags. <br></br>
 * Updated by JCasGen Mon Aug 16 14:00:43 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class DocumentAttribute extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(DocumentAttribute.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DocumentAttribute() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DocumentAttribute(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DocumentAttribute(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: attributeName

  /** getter for attributeName - gets 
   * @generated */
  public ExternalReference getAttributeName() {
    if (DocumentAttribute_Type.featOkTst && ((DocumentAttribute_Type)jcasType).casFeat_attributeName == null)
      jcasType.jcas.throwFeatMissing("attributeName", "org.u_compare.shared.document.DocumentAttribute");
    return (ExternalReference)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentAttribute_Type)jcasType).casFeatCode_attributeName)));}
    
  /** setter for attributeName - sets  
   * @generated */
  public void setAttributeName(ExternalReference v) {
    if (DocumentAttribute_Type.featOkTst && ((DocumentAttribute_Type)jcasType).casFeat_attributeName == null)
      jcasType.jcas.throwFeatMissing("attributeName", "org.u_compare.shared.document.DocumentAttribute");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentAttribute_Type)jcasType).casFeatCode_attributeName, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    