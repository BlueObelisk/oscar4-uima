
/* First created by JCasGen Wed Jul 28 16:01:36 BST 2010 */
package org.u_compare.shared.syntactic;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Aug 16 14:00:42 BST 2010
 * @generated */
public class FunctionTaggedConstituent_Type extends Constituent_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FunctionTaggedConstituent_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FunctionTaggedConstituent_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FunctionTaggedConstituent(addr, FunctionTaggedConstituent_Type.this);
  			   FunctionTaggedConstituent_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FunctionTaggedConstituent(addr, FunctionTaggedConstituent_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = FunctionTaggedConstituent.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.syntactic.FunctionTaggedConstituent");
 
  /** @generated */
  final Feature casFeat_function;
  /** @generated */
  final int     casFeatCode_function;
  /** @generated */ 
  public int getFunction(int addr) {
        if (featOkTst && casFeat_function == null)
      jcas.throwFeatMissing("function", "org.u_compare.shared.syntactic.FunctionTaggedConstituent");
    return ll_cas.ll_getRefValue(addr, casFeatCode_function);
  }
  /** @generated */    
  public void setFunction(int addr, int v) {
        if (featOkTst && casFeat_function == null)
      jcas.throwFeatMissing("function", "org.u_compare.shared.syntactic.FunctionTaggedConstituent");
    ll_cas.ll_setRefValue(addr, casFeatCode_function, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public FunctionTaggedConstituent_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_function = jcas.getRequiredFeatureDE(casType, "function", "org.u_compare.shared.label.penn.function.FunctionLabel", featOkTst);
    casFeatCode_function  = (null == casFeat_function) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_function).getCode();

  }
}



    