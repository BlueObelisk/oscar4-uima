

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.comparable;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Aug 16 14:00:43 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class Capability extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Capability.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Capability() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Capability(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Capability(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: types

  /** getter for types - gets 
   * @generated */
  public StringArray getTypes() {
    if (Capability_Type.featOkTst && ((Capability_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.u_compare.shared.comparable.Capability");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types)));}
    
  /** setter for types - sets  
   * @generated */
  public void setTypes(StringArray v) {
    if (Capability_Type.featOkTst && ((Capability_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.u_compare.shared.comparable.Capability");
    jcasType.ll_cas.ll_setRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for types - gets an indexed value - 
   * @generated */
  public String getTypes(int i) {
    if (Capability_Type.featOkTst && ((Capability_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.u_compare.shared.comparable.Capability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types), i);}

  /** indexed setter for types - sets an indexed value - 
   * @generated */
  public void setTypes(int i, String v) { 
    if (Capability_Type.featOkTst && ((Capability_Type)jcasType).casFeat_types == null)
      jcasType.jcas.throwFeatMissing("types", "org.u_compare.shared.comparable.Capability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Capability_Type)jcasType).casFeatCode_types), i, v);}
  }

    