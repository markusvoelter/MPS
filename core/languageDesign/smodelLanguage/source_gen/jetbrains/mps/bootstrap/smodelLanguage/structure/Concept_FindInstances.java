package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class Concept_FindInstances extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_FindInstances";
  public static String SCOPE = "scope";

  public  Concept_FindInstances(SNode node) {
    super(node);
  }

  public static Concept_FindInstances newInstance(SModel sm, boolean init) {
    return (Concept_FindInstances)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_FindInstances", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_FindInstances newInstance(SModel sm) {
    return Concept_FindInstances.newInstance(sm, false);
  }


  public Expression getScope() {
    return (Expression)this.getChild(Concept_FindInstances.SCOPE);
  }

  public void setScope(Expression node) {
    super.setChild(Concept_FindInstances.SCOPE, node);
  }

}
