

/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.semantic;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.u_compare.shared.ReferenceAnnotation;


/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * XML source: /home/lezan/galWorkspace/oscar4-uima/oscar4-uima-memmrecogniser/src/main/resources/uk/ac/nactem/cheta/uimaDescriptor/OscarMER1.xml
 * @generated */
public class SemanticAnnotation extends ReferenceAnnotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SemanticAnnotation.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SemanticAnnotation() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SemanticAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SemanticAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SemanticAnnotation(JCas jcas, int begin, int end) {
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

    