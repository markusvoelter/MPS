package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DeprecatedBlockDocTag extends BaseBlockDocTag {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.DeprecatedBlockDocTag";

  public DeprecatedBlockDocTag(SNode node) {
    super(node);
  }

  public static DeprecatedBlockDocTag newInstance(SModel sm, boolean init) {
    return (DeprecatedBlockDocTag) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.DeprecatedBlockDocTag", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DeprecatedBlockDocTag newInstance(SModel sm) {
    return DeprecatedBlockDocTag.newInstance(sm, false);
  }
}
