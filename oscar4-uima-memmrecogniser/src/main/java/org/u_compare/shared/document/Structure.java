

/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.document;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Abstract type for structural document annotations. <br></br>
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class Structure extends DocumentClassAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Structure.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Structure() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Structure(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Structure(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Structure(JCas jcas, int begin, int end) {
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
     
}

    