

/* First created by JCasGen Wed Jul 28 16:01:37 BST 2010 */
package org.u_compare.shared.label.penn.bracket;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Simple declarative sentence
 * Updated by JCasGen Mon Aug 16 14:00:43 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class ROOT extends Clause {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ROOT.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ROOT() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ROOT(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ROOT(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    