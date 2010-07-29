

/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label.penn.function.grammatical;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.u_compare.shared.label.penn.function.FunctionLabel;


/** Abstract function tag type for grammatical functions.
 * Updated by JCasGen Wed Jul 28 16:01:38 BST 2010
 * XML source: /home/keybo/workspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER.xml
 * @generated */
public class GrammaticalFunctionLabel extends FunctionLabel {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(GrammaticalFunctionLabel.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GrammaticalFunctionLabel() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GrammaticalFunctionLabel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GrammaticalFunctionLabel(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    