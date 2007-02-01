package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class NodeSubstituteActionsBuilder extends BaseAdapter {
  public static String DESCRIPTION = "description";
  public static String ACTIONS_FACTORY_ASPECT_ID = "actionsFactoryAspectId";
  public static String ACTIONS_FILTER_ASPECT_ID = "actionsFilterAspectId";
  public static String PRECONDITION_ASPECT_ID = "preconditionAspectId";
  public static String APPLICABLE_CONCEPT = "applicableConcept";
  public static String PRECONDITION = "precondition";

  public  NodeSubstituteActionsBuilder(SNode node) {
    super(node);
  }

  public static NodeSubstituteActionsBuilder newInstance(SModel sm) {
    return (NodeSubstituteActionsBuilder)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder", sm, GlobalScope.getInstance()).getAdaptor();
  }

  public String getDescription() {
    return this.getProperty(NodeSubstituteActionsBuilder.DESCRIPTION);
  }
  public void setDescription(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.DESCRIPTION, value);
  }
  public String getActionsFactoryAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.ACTIONS_FACTORY_ASPECT_ID);
  }
  public void setActionsFactoryAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.ACTIONS_FACTORY_ASPECT_ID, value);
  }
  public String getActionsFilterAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.ACTIONS_FILTER_ASPECT_ID);
  }
  public void setActionsFilterAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.ACTIONS_FILTER_ASPECT_ID, value);
  }
  public String getPreconditionAspectId() {
    return this.getProperty(NodeSubstituteActionsBuilder.PRECONDITION_ASPECT_ID);
  }
  public void setPreconditionAspectId(String value) {
    this.setProperty(NodeSubstituteActionsBuilder.PRECONDITION_ASPECT_ID, value);
  }
  public ConceptDeclaration getApplicableConcept() {
    return (ConceptDeclaration)this.getReferent(NodeSubstituteActionsBuilder.APPLICABLE_CONCEPT);
  }
  public void setApplicableConcept(ConceptDeclaration node) {
    super.setReferent(NodeSubstituteActionsBuilder.APPLICABLE_CONCEPT, node);
  }
  public NodeSubstitutePreconditionFunction getPrecondition() {
    return (NodeSubstitutePreconditionFunction)this.getChild(NodeSubstituteActionsBuilder.PRECONDITION);
  }
  public void setPrecondition(NodeSubstitutePreconditionFunction node) {
    super.setChild(NodeSubstituteActionsBuilder.PRECONDITION, node);
  }
}
