package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AppendUIObjectStatement extends UIObjectStatement {
  public static final String concept = "jetbrains.mps.ui.structure.AppendUIObjectStatement";

  public AppendUIObjectStatement(SNode node) {
    super(node);
  }

  public static AppendUIObjectStatement newInstance(SModel sm, boolean init) {
    return (AppendUIObjectStatement) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.AppendUIObjectStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AppendUIObjectStatement newInstance(SModel sm) {
    return AppendUIObjectStatement.newInstance(sm, false);
  }
}
