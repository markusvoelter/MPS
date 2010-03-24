package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParametrizedExecuteConsole extends ParametrizedExecuteConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.ParametrizedExecuteConsole";

  public ParametrizedExecuteConsole(SNode node) {
    super(node);
  }

  public static ParametrizedExecuteConsole newInstance(SModel sm, boolean init) {
    return (ParametrizedExecuteConsole) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.ParametrizedExecuteConsole", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParametrizedExecuteConsole newInstance(SModel sm) {
    return ParametrizedExecuteConsole.newInstance(sm, false);
  }
}
