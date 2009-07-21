package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.classifiers.structure.BaseClassifierType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SingletabbedEditorTabType extends BaseClassifierType {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.SingletabbedEditorTabType";

  public SingletabbedEditorTabType(SNode node) {
    super(node);
  }

  public static SingletabbedEditorTabType newInstance(SModel sm, boolean init) {
    return (SingletabbedEditorTabType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.SingletabbedEditorTabType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SingletabbedEditorTabType newInstance(SModel sm) {
    return SingletabbedEditorTabType.newInstance(sm, false);
  }

}
