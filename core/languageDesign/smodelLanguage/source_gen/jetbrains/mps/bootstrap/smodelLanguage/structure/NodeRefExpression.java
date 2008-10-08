package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeRefExpression extends Expression {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.NodeRefExpression";
  public static String REFERENT_NODE = "referentNode";

  public NodeRefExpression(SNode node) {
    super(node);
  }

  public INamedConcept getReferentNode() {
    return (INamedConcept)this.getReferent(NodeRefExpression.REFERENT_NODE);
  }

  public void setReferentNode(INamedConcept node) {
    super.setReferent(NodeRefExpression.REFERENT_NODE, node);
  }


  public static NodeRefExpression newInstance(SModel sm, boolean init) {
    return (NodeRefExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.NodeRefExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeRefExpression newInstance(SModel sm) {
    return NodeRefExpression.newInstance(sm, false);
  }

}
