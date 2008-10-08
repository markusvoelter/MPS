package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeReferentConstraint extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint";
  public static String SEARCH_SCOPE_DESCRIPTION = "searchScopeDescription";
  public static String APPLICABLE_LINK = "applicableLink";
  public static String SEARCH_SCOPE_CAN_CREATE = "searchScopeCanCreate";
  public static String SEARCH_SCOPE_FACTORY = "searchScopeFactory";
  public static String REFERENT_SET_HANDLER = "referentSetHandler";

  public NodeReferentConstraint(SNode node) {
    super(node);
  }

  public String getSearchScopeDescription() {
    return this.getProperty(NodeReferentConstraint.SEARCH_SCOPE_DESCRIPTION);
  }

  public void setSearchScopeDescription(String value) {
    this.setProperty(NodeReferentConstraint.SEARCH_SCOPE_DESCRIPTION, value);
  }

  public LinkDeclaration getApplicableLink() {
    return (LinkDeclaration)this.getReferent(NodeReferentConstraint.APPLICABLE_LINK);
  }

  public void setApplicableLink(LinkDeclaration node) {
    super.setReferent(NodeReferentConstraint.APPLICABLE_LINK, node);
  }

  public ConstraintFunction_ReferentSearchScope_CanCreate getSearchScopeCanCreate() {
    return (ConstraintFunction_ReferentSearchScope_CanCreate)this.getChild(NodeReferentConstraint.SEARCH_SCOPE_CAN_CREATE);
  }

  public void setSearchScopeCanCreate(ConstraintFunction_ReferentSearchScope_CanCreate node) {
    super.setChild(NodeReferentConstraint.SEARCH_SCOPE_CAN_CREATE, node);
  }

  public ConstraintFunction_ReferentSearchScope_Factory getSearchScopeFactory() {
    return (ConstraintFunction_ReferentSearchScope_Factory)this.getChild(NodeReferentConstraint.SEARCH_SCOPE_FACTORY);
  }

  public void setSearchScopeFactory(ConstraintFunction_ReferentSearchScope_Factory node) {
    super.setChild(NodeReferentConstraint.SEARCH_SCOPE_FACTORY, node);
  }

  public ConstraintFunction_ReferentSetHandler getReferentSetHandler() {
    return (ConstraintFunction_ReferentSetHandler)this.getChild(NodeReferentConstraint.REFERENT_SET_HANDLER);
  }

  public void setReferentSetHandler(ConstraintFunction_ReferentSetHandler node) {
    super.setChild(NodeReferentConstraint.REFERENT_SET_HANDLER, node);
  }


  public static NodeReferentConstraint newInstance(SModel sm, boolean init) {
    return (NodeReferentConstraint)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.structure.NodeReferentConstraint", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeReferentConstraint newInstance(SModel sm) {
    return NodeReferentConstraint.newInstance(sm, false);
  }

}
