package jetbrains.mps.lang.core.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.BaseQuickFixProvider;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import java.util.List;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.search.SModelSearchUtil;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_Constraints_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  private static Logger LOG = Logger.getLogger(check_Constraints_NonTypesystemRule.class);

  public check_Constraints_NonTypesystemRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (BaseConcept_Behavior.call_getMetaLevel_3981318653438234726(node) != 0) {
      return;
    }

    IOperationContext operationContext = typeCheckingContext.getOperationContext();
    if (operationContext == null) {
      return;
    }

    ModelConstraintsManager cm = ModelConstraintsManager.getInstance();

    if (SNodeOperations.getParent(node) != null && !(jetbrains.mps.smodel.SNodeOperations.isUnknown(SNodeOperations.getParent(node)))) {
      SNode link = SNodeOperations.getContainingLinkDeclaration(node);
      if (link == null && !(node.isAttribute())) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Child in a role with unknown link", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "4950342498455637390", intentionProvider, errorTarget);
        }
        return;
      }

      if (!(cm.canBeChild(node.getConceptFqName(), operationContext, SNodeOperations.getParent(node), link))) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Node isn't applicable in the context", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074610949", intentionProvider, errorTarget);
          {
            SNode _foreign_34989546 = cm.getCanBeChildBlock(operationContext, node.getConceptFqName());
            if (_foreign_34989546 != null) {
              _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
            }
          }
        }
      }
    }

    if (node.isRoot() && !(cm.canBeRoot(operationContext, node.getConceptFqName(), SNodeOperations.getModel(node)))) {
      {
        BaseQuickFixProvider intentionProvider = null;
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Not rootable concept added as root", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074611001", intentionProvider, errorTarget);
        {
          SNode _foreign_34989546 = cm.getCanBeRootBlock(operationContext, node.getConceptFqName());
          if (_foreign_34989546 != null) {
            _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
          }
        }
      }
    }

    for (SNode child : SNodeOperations.getChildren(node)) {
      SNode childConcept = SNodeOperations.getConceptDeclaration(child);
      SNode childLink = SNodeOperations.getContainingLinkDeclaration(child);
      if (childLink == null) {
        continue;
      }
      if (!(cm.canBeParent(node, childConcept, childLink, operationContext))) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Node isn't applicable in the context", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "5622704259074611096", intentionProvider, errorTarget);
          {
            SNode _foreign_34989546 = cm.getCanBeParentBlock(node, operationContext);
            if (_foreign_34989546 != null) {
              _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
            }
          }
        }
      }
      SNode rule = cm.canBeAncestorReturnBlock(node, childConcept, operationContext);
      if (rule != null) {
        {
          BaseQuickFixProvider intentionProvider = null;
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(child, "Node isn't applicable in the context", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "1998770035420757821", intentionProvider, errorTarget);
          {
            SNode _foreign_34989546 = rule;
            if (_foreign_34989546 != null) {
              _reporter_2309309498.addAdditionalRuleId(_foreign_34989546.getModel().toString(), _foreign_34989546.getId());
            }
          }
        }
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

        {
          BaseQuickFixProvider intentionProvider = null;
          intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.core.typesystem.RemoveUndeclaredProperty_QuickFix", false);
          intentionProvider.putArgument("propertyName", p.getName());
          MessageTarget errorTarget = new NodeMessageTarget();
          errorTarget = new PropertyMessageTarget(p.getName());
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(node, "Property constraint violation for property \"" + p.getName() + "\"", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "3618120580763111372", intentionProvider, errorTarget);
        }
      }
    }

    for (String name : SetSequence.fromSet(node.getPropertyNames())) {
      if (SModelSearchUtil.findPropertyDeclaration(((AbstractConceptDeclaration) SNodeOperations.getAdapter(concept)), name) == null) {
        {
          BaseQuickFixProvider intentionProvider = null;
          intentionProvider = new BaseQuickFixProvider("jetbrains.mps.lang.core.typesystem.RemoveUndeclaredProperty_QuickFix", false);
          intentionProvider.putArgument("propertyName", name);
          MessageTarget errorTarget = new NodeMessageTarget();
          IErrorReporter _reporter_2309309498 = typeCheckingContext.reportWarning(node, "Usage of undeclared property \"" + name + "\"", "r:cec599e3-51d2-48a7-af31-989e3cbd593c(jetbrains.mps.lang.core.typesystem)", "4049502122675887138", intentionProvider, errorTarget);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
