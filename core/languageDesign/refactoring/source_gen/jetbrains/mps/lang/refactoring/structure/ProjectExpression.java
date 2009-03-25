package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ProjectExpression extends jetbrains.mps.lang.refactoring.structure.AbstractUIArgumentExpression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ProjectExpression";

  public ProjectExpression(SNode node) {
    super(node);
  }

  public static ProjectExpression newInstance(SModel sm, boolean init) {
    return (ProjectExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ProjectExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ProjectExpression newInstance(SModel sm) {
    return ProjectExpression.newInstance(sm, false);
  }

}
