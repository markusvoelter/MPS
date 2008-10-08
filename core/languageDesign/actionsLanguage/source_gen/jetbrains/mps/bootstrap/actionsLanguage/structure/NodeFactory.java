package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeFactory extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory";
  public static String DESCRIPTION = "description";
  public static String APPLICABLE_CONCEPT = "applicableConcept";
  public static String SETUP_FUNCTION = "setupFunction";

  public NodeFactory(SNode node) {
    super(node);
  }

  public String getDescription() {
    return this.getProperty(NodeFactory.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(NodeFactory.DESCRIPTION, value);
  }

  public ConceptDeclaration getApplicableConcept() {
    return (ConceptDeclaration)this.getReferent(NodeFactory.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(ConceptDeclaration node) {
    super.setReferent(NodeFactory.APPLICABLE_CONCEPT, node);
  }

  public NodeSetupFunction getSetupFunction() {
    return (NodeSetupFunction)this.getChild(NodeFactory.SETUP_FUNCTION);
  }

  public void setSetupFunction(NodeSetupFunction node) {
    super.setChild(NodeFactory.SETUP_FUNCTION, node);
  }


  public static NodeFactory newInstance(SModel sm, boolean init) {
    return (NodeFactory)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeFactory newInstance(SModel sm) {
    return NodeFactory.newInstance(sm, false);
  }

}
