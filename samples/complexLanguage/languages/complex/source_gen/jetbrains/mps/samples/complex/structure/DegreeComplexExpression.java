package jetbrains.mps.samples.complex.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.IntegerLiteral;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DegreeComplexExpression extends SingleComplexExpression {
  public static final String concept = "jetbrains.mps.samples.complex.structure.DegreeComplexExpression";
  public static final String DEGREE = "degree";

  public DegreeComplexExpression(SNode node) {
    super(node);
  }

  public IntegerLiteral getDegree() {
    return (IntegerLiteral) this.getChild(IntegerLiteral.class, DegreeComplexExpression.DEGREE);
  }

  public void setDegree(IntegerLiteral node) {
    super.setChild(DegreeComplexExpression.DEGREE, node);
  }

  public static DegreeComplexExpression newInstance(SModel sm, boolean init) {
    return (DegreeComplexExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.complex.structure.DegreeComplexExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DegreeComplexExpression newInstance(SModel sm) {
    return DegreeComplexExpression.newInstance(sm, false);
  }
}
