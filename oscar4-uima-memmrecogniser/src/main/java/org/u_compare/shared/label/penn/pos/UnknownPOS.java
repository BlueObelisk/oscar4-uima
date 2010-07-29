

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.label.penn.pos;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.u_compare.shared.label.POS;


/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class UnknownPOS extends POS {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(UnknownPOS.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected UnknownPOS() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnknownPOS(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnknownPOS(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: posType

  /** getter for posType - gets 
   * @generated */
  public String getPosType() {
    if (UnknownPOS_Type.featOkTst && ((UnknownPOS_Type)jcasType).casFeat_posType == null)
      jcasType.jcas.throwFeatMissing("posType", "org.u_compare.shared.label.penn.pos.UnknownPOS");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnknownPOS_Type)jcasType).casFeatCode_posType);}
    
  /** setter for posType - sets  
   * @generated */
  public void setPosType(String v) {
    if (UnknownPOS_Type.featOkTst && ((UnknownPOS_Type)jcasType).casFeat_posType == null)
      jcasType.jcas.throwFeatMissing("posType", "org.u_compare.shared.label.penn.pos.UnknownPOS");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnknownPOS_Type)jcasType).casFeatCode_posType, v);}    
  }

    