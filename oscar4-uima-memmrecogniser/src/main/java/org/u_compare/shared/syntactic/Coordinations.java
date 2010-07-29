

/* First created by JCasGen Wed Jul 28 16:01:37 BST 2010 */
package org.u_compare.shared.syntactic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;


/** Contains an array of constituents which are marked as Coordinations. Corresponds to syn="COOD" in the Genia Treebank.
 * Updated by JCasGen Wed Jul 28 16:01:37 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class Coordinations extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Coordinations.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Coordinations() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Coordinations(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Coordinations(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: coordinationMarkedConstituents

  /** getter for coordinationMarkedConstituents - gets 
   * @generated */
  public FSArray getCoordinationMarkedConstituents() {
    if (Coordinations_Type.featOkTst && ((Coordinations_Type)jcasType).casFeat_coordinationMarkedConstituents == null)
      jcasType.jcas.throwFeatMissing("coordinationMarkedConstituents", "org.u_compare.shared.syntactic.Coordinations");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents)));}
    
  /** setter for coordinationMarkedConstituents - sets  
   * @generated */
  public void setCoordinationMarkedConstituents(FSArray v) {
    if (Coordinations_Type.featOkTst && ((Coordinations_Type)jcasType).casFeat_coordinationMarkedConstituents == null)
      jcasType.jcas.throwFeatMissing("coordinationMarkedConstituents", "org.u_compare.shared.syntactic.Coordinations");
    jcasType.ll_cas.ll_setRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for coordinationMarkedConstituents - gets an indexed value - 
   * @generated */
  public Constituent getCoordinationMarkedConstituents(int i) {
    if (Coordinations_Type.featOkTst && ((Coordinations_Type)jcasType).casFeat_coordinationMarkedConstituents == null)
      jcasType.jcas.throwFeatMissing("coordinationMarkedConstituents", "org.u_compare.shared.syntactic.Coordinations");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents), i);
    return (Constituent)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents), i)));}

  /** indexed setter for coordinationMarkedConstituents - sets an indexed value - 
   * @generated */
  public void setCoordinationMarkedConstituents(int i, Constituent v) { 
    if (Coordinations_Type.featOkTst && ((Coordinations_Type)jcasType).casFeat_coordinationMarkedConstituents == null)
      jcasType.jcas.throwFeatMissing("coordinationMarkedConstituents", "org.u_compare.shared.syntactic.Coordinations");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Coordinations_Type)jcasType).casFeatCode_coordinationMarkedConstituents), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    