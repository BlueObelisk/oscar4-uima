

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.syntactic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class TemplateMappedConstituent extends FunctionTaggedConstituent {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(TemplateMappedConstituent.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TemplateMappedConstituent() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TemplateMappedConstituent(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TemplateMappedConstituent(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TemplateMappedConstituent(JCas jcas, int begin, int end) {
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
  //* Feature: mappedConstituent

  /** getter for mappedConstituent - gets 
   * @generated */
  public Constituent getMappedConstituent() {
    if (TemplateMappedConstituent_Type.featOkTst && ((TemplateMappedConstituent_Type)jcasType).casFeat_mappedConstituent == null)
      jcasType.jcas.throwFeatMissing("mappedConstituent", "org.u_compare.shared.syntactic.TemplateMappedConstituent");
    return (Constituent)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TemplateMappedConstituent_Type)jcasType).casFeatCode_mappedConstituent)));}
    
  /** setter for mappedConstituent - sets  
   * @generated */
  public void setMappedConstituent(Constituent v) {
    if (TemplateMappedConstituent_Type.featOkTst && ((TemplateMappedConstituent_Type)jcasType).casFeat_mappedConstituent == null)
      jcasType.jcas.throwFeatMissing("mappedConstituent", "org.u_compare.shared.syntactic.TemplateMappedConstituent");
    jcasType.ll_cas.ll_setRefValue(addr, ((TemplateMappedConstituent_Type)jcasType).casFeatCode_mappedConstituent, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: not

  /** getter for not - gets 
   * @generated */
  public boolean getNot() {
    if (TemplateMappedConstituent_Type.featOkTst && ((TemplateMappedConstituent_Type)jcasType).casFeat_not == null)
      jcasType.jcas.throwFeatMissing("not", "org.u_compare.shared.syntactic.TemplateMappedConstituent");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TemplateMappedConstituent_Type)jcasType).casFeatCode_not);}
    
  /** setter for not - sets  
   * @generated */
  public void setNot(boolean v) {
    if (TemplateMappedConstituent_Type.featOkTst && ((TemplateMappedConstituent_Type)jcasType).casFeat_not == null)
      jcasType.jcas.throwFeatMissing("not", "org.u_compare.shared.syntactic.TemplateMappedConstituent");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TemplateMappedConstituent_Type)jcasType).casFeatCode_not, v);}    
  }

    