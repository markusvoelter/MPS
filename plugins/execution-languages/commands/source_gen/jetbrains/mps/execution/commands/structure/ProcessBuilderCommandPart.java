package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProcessBuilderCommandPart extends Expression {
  public static final String concept = "jetbrains.mps.execution.commands.structure.ProcessBuilderCommandPart";

  public ProcessBuilderCommandPart(SNode node) {
    super(node);
  }

  public static ProcessBuilderCommandPart newInstance(SModel sm, boolean init) {
    return (ProcessBuilderCommandPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.ProcessBuilderCommandPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProcessBuilderCommandPart newInstance(SModel sm) {
    return ProcessBuilderCommandPart.newInstance(sm, false);
  }
}
