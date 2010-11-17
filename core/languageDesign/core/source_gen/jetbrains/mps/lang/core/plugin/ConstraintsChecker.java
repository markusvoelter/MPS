package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.List;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;

public class ConstraintsChecker extends AbstractConstraintsChecker {
  private static Logger LOG = Logger.getLogger(ConstraintsChecker.class);

  public ConstraintsChecker() {
  }

  public void checkNode(SNode node, LanguageErrorsComponent component, IOperationContext operationContext) {
    ModelConstraintsManager cm = ModelConstraintsManager.getInstance();
    if (SNodeOperations.getParent(node) != null && !(jetbrains.mps.smodel.SNodeOperations.isUnknown(SNodeOperations.getParent(node)))) {
      SNode link = SNodeOperations.getContainingLinkDeclaration(node);
      if (link == null && !(node.isAttribute())) {
        component.addError(node, "Child in a role with unknown link", (SNode) null, SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.getParent(node)), new NodeMessageTarget());
        return;
      }

      if (!(cm.canBeChild(node.getConceptFqName(), operationContext, SNodeOperations.getParent(node), link))) {
        SNode rule = cm.getCanBeChildBlock(operationContext, node.getConceptFqName());
        component.addError(node, "Node isn't applicable in the context", rule, SetSequence.fromSetAndArray(new HashSet<SNode>(), SNodeOperations.getParent(node)), new NodeMessageTarget());
      }
    }

    if (node.isRoot() && !(cm.canBeRoot(operationContext, node.getConceptFqName(), SNodeOperations.getModel(node)))) {
      SNode rule = cm.getCanBeRootBlock(operationContext, node.getConceptFqName());
      component.addError(node, "Not rootable concept added as root", rule);
    }

    for (SNode child : SNodeOperations.getChildren(node)) {
      SNode childConcept = SNodeOperations.getConceptDeclaration(child);
      SNode childLink = SNodeOperations.getContainingLinkDeclaration(child);
      if (childLink == null) {
        continue;
      }
      if (!(cm.canBeParent(node, childConcept, childLink, operationContext))) {
        SNode rule = cm.getCanBeParentBlock(node, operationContext);
        component.addError(node, "Node isn't applicable in the context", rule);
      }
      SNode rule = cm.canBeAncestorReturnBlock(node, childConcept, operationContext);
      if (rule != null) {
        component.addError(child, "Node isn't applicable in the context", rule, SetSequence.fromSetAndArray(new HashSet<SNode>(), node), new NodeMessageTarget());
      }
    }

    // Properties validation 
    SNode concept = SNodeOperations.getConceptDeclaration(node);
    ConceptAndSuperConceptsScope chs = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration) SNodeOperations.getAdapter(concept)));
    List<PropertyDeclaration> props = chs.getAdapters(PropertyDeclaration.class);
    for (PropertyDeclaration p : ListSequence.fromList(props)) {
      PropertySupport ps = PropertySupport.getPropertySupport(p);
      String propertyName = p.getName();
      if (propertyName == null) {
        LOG.error("Property declaration has a null name, declaration id: " + p.getNode().getSNodeId() + ", model: " + p.getModel().getSModelFqName());
        continue;
      }
      String value = ps.fromInternalValue(node.getProperty(propertyName));
      if (!(ps.canSetValue(node, p.getName(), value, operationContext.getScope(), false))) {
        // TODO this is a hack for anonymous classes 
        if ("name".equals(p.getName()) && "AnonymousClass".equals(SPropertyOperations.getString(concept, "name"))) {
          continue;
        }
        // todo find a rule 
        component.addError(node, "Property constraint violation for property \"" + p.getName() + "\"", (SNode) null, SetSequence.fromSet(new HashSet<SNode>()), new PropertyMessageTarget(p.getName()));
      }
    }
  }
}
