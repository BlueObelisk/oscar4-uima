

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.syntactic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class RichToken extends POSToken {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(RichToken.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected RichToken() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public RichToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public RichToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public RichToken(JCas jcas, int begin, int end) {
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
  //* Feature: base

  /** getter for base - gets 
   * @generated */
  public String getBase() {
    if (RichToken_Type.featOkTst && ((RichToken_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "org.u_compare.shared.syntactic.RichToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RichToken_Type)jcasType).casFeatCode_base);}
    
  /** setter for base - sets  
   * @generated */
  public void setBase(String v) {
    if (RichToken_Type.featOkTst && ((RichToken_Type)jcasType).casFeat_base == null)
      jcasType.jcas.throwFeatMissing("base", "org.u_compare.shared.syntactic.RichToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((RichToken_Type)jcasType).casFeatCode_base, v);}    
  }

    