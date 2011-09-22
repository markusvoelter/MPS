package jetbrains.mps.traceInfo.testLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomType extends Type {
  public static final String concept = "jetbrains.mps.traceInfo.testLanguage.structure.CustomType";

  public CustomType(SNode node) {
    super(node);
  }

  public static CustomType newInstance(SModel sm, boolean init) {
    return (CustomType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.traceInfo.testLanguage.structure.CustomType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomType newInstance(SModel sm) {
    return CustomType.newInstance(sm, false);
  }
}
