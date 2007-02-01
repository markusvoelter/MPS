package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class SModelType extends Type {

  public  SModelType(SNode node) {
    super(node);
  }

  public static SModelType newInstance(SModel sm) {
    return (SModelType)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.SModelType", sm, GlobalScope.getInstance()).getAdaptor();
  }
}
