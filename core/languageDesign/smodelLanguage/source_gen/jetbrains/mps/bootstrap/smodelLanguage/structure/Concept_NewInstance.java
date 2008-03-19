package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class Concept_NewInstance extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_NewInstance";
  public static String PROTOTYPE_NODE = "prototypeNode";

  public  Concept_NewInstance(SNode node) {
    super(node);
  }

  public static Concept_NewInstance newInstance(SModel sm, boolean init) {
    return (Concept_NewInstance)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_NewInstance", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Concept_NewInstance newInstance(SModel sm) {
    return Concept_NewInstance.newInstance(sm, false);
  }


  public Expression getPrototypeNode() {
    return (Expression)this.getChild(Concept_NewInstance.PROTOTYPE_NODE);
  }

  public void setPrototypeNode(Expression node) {
    super.setChild(Concept_NewInstance.PROTOTYPE_NODE, node);
  }

}
