

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.syntactic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.u_compare.shared.label.DependencyLabel;


/** Abstract Dependency
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class Dependency extends SyntacticAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Dependency.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Dependency() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Dependency(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Dependency(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Dependency(JCas jcas, int begin, int end) {
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
  //* Feature: label

  /** getter for label - gets 
   * @generated */
  public DependencyLabel getLabel() {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.u_compare.shared.syntactic.Dependency");
    return (DependencyLabel)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_label)));}
    
  /** setter for label - sets  
   * @generated */
  public void setLabel(DependencyLabel v) {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.u_compare.shared.syntactic.Dependency");
    jcasType.ll_cas.ll_setRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_label, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated */
  public Token getSource() {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.u_compare.shared.syntactic.Dependency");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated */
  public void setSource(Token v) {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.u_compare.shared.syntactic.Dependency");
    jcasType.ll_cas.ll_setRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated */
  public Token getTarget() {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.u_compare.shared.syntactic.Dependency");
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_target)));}
    
  /** setter for target - sets  
   * @generated */
  public void setTarget(Token v) {
    if (Dependency_Type.featOkTst && ((Dependency_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.u_compare.shared.syntactic.Dependency");
    jcasType.ll_cas.ll_setRefValue(addr, ((Dependency_Type)jcasType).casFeatCode_target, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    