

/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class UnknownDependencyLabel extends DependencyLabel {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(UnknownDependencyLabel.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected UnknownDependencyLabel() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnknownDependencyLabel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnknownDependencyLabel(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated */
  public String getLabel() {
    if (UnknownDependencyLabel_Type.featOkTst && ((UnknownDependencyLabel_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.u_compare.shared.label.UnknownDependencyLabel");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnknownDependencyLabel_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated */
  public void setLabel(String v) {
    if (UnknownDependencyLabel_Type.featOkTst && ((UnknownDependencyLabel_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.u_compare.shared.label.UnknownDependencyLabel");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnknownDependencyLabel_Type)jcasType).casFeatCode_label, v);}    
  }

    