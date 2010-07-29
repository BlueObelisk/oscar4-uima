

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Jul 28 16:01:36 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class DictionaryNamedEntity extends NamedEntity {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(DictionaryNamedEntity.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DictionaryNamedEntity() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DictionaryNamedEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DictionaryNamedEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DictionaryNamedEntity(JCas jcas, int begin, int end) {
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
  //* Feature: surface

  /** getter for surface - gets Surface string in the dictionary which is used to match the string.
   * @generated */
  public String getSurface() {
    if (DictionaryNamedEntity_Type.featOkTst && ((DictionaryNamedEntity_Type)jcasType).casFeat_surface == null)
      jcasType.jcas.throwFeatMissing("surface", "org.u_compare.shared.semantic.DictionaryNamedEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DictionaryNamedEntity_Type)jcasType).casFeatCode_surface);}
    
  /** setter for surface - sets Surface string in the dictionary which is used to match the string. 
   * @generated */
  public void setSurface(String v) {
    if (DictionaryNamedEntity_Type.featOkTst && ((DictionaryNamedEntity_Type)jcasType).casFeat_surface == null)
      jcasType.jcas.throwFeatMissing("surface", "org.u_compare.shared.semantic.DictionaryNamedEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((DictionaryNamedEntity_Type)jcasType).casFeatCode_surface, v);}    
  }

    