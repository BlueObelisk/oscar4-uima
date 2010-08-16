
/* First created by JCasGen Wed Jul 28 16:01:38 BST 2010 */
package org.u_compare.shared.label.penn.function.grammatical;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

/** logical subjects in passives<BR></BR>
 * Updated by JCasGen Mon Aug 16 14:00:44 BST 2010
 * @generated */
public class LGS_Type extends GrammaticalFunctionLabel_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LGS_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LGS_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LGS(addr, LGS_Type.this);
  			   LGS_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LGS(addr, LGS_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = LGS.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.function.grammatical.LGS");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public LGS_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    