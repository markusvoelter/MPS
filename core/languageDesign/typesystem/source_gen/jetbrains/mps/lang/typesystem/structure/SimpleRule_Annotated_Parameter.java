package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleRule_Annotated_Parameter extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.SimpleRule_Annotated_Parameter";

  public SimpleRule_Annotated_Parameter(SNode node) {
    super(node);
  }

  public static SimpleRule_Annotated_Parameter newInstance(SModel sm, boolean init) {
    return (SimpleRule_Annotated_Parameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.SimpleRule_Annotated_Parameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleRule_Annotated_Parameter newInstance(SModel sm) {
    return SimpleRule_Annotated_Parameter.newInstance(sm, false);
  }

}
