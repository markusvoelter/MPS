package jetbrains.mps.lang.typesystem.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.BaseNodeReferenceSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;

public class ApplicableNodeReference_Constraints extends ConstraintsDataHolder {
  public ApplicableNodeReference_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    return result;
  }

  public Map<String, INodePropertySetter> getNodePropertySetters() {
    HashMap<String, INodePropertySetter> result = new HashMap<String, INodePropertySetter>();
    return result;
  }

  public Map<String, INodePropertyValidator> getNodePropertyValidators() {
    HashMap<String, INodePropertyValidator> result = new HashMap<String, INodePropertyValidator>();
    return result;
  }

  public Map<String, INodeReferentSetEventHandler> getNodeReferentSetEventHandlers() {
    HashMap<String, INodeReferentSetEventHandler> result = new HashMap<String, INodeReferentSetEventHandler>();
    return result;
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    result.put("applicableNode", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        List<SNode> result = new ArrayList<SNode>();
        SNode rule = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.typesystem.structure.AbstractRule", false, false);
        if (rule != null) {
          SNode appNode = SLinkOperations.getTarget(rule, "applicableNode", true);
          if (appNode != null) {
            ListSequence.fromList(result).addElement(appNode);
          }
          if (SNodeOperations.isInstanceOf(rule, "jetbrains.mps.lang.typesystem.structure.ComparisonRule")) {
            SNode appNode2 = SLinkOperations.getTarget(SNodeOperations.cast(rule, "jetbrains.mps.lang.typesystem.structure.ComparisonRule"), "anotherNode", true);
            if (appNode2 != null) {
              ListSequence.fromList(result).addElement(appNode2);
            }
          }
          if (SNodeOperations.isInstanceOf(rule, "jetbrains.mps.lang.typesystem.structure.InequationReplacementRule")) {
            SNode appNode2 = SLinkOperations.getTarget(SNodeOperations.cast(rule, "jetbrains.mps.lang.typesystem.structure.InequationReplacementRule"), "supertypeNode", true);
            if (appNode2 != null) {
              ListSequence.fromList(result).addElement(appNode2);
            }
          }
        }
        SNode coerceStatement = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.typesystem.structure.CoerceStatement", false, false);
        while (coerceStatement != null) {
          if (SLinkOperations.getTarget(coerceStatement, "pattern", true) != null) {
            ListSequence.fromList(result).addElement(SLinkOperations.getTarget(coerceStatement, "pattern", true));
          }
          coerceStatement = SNodeOperations.getAncestor(coerceStatement, "jetbrains.mps.lang.typesystem.structure.CoerceStatement", false, false);
        }
        SNode matchStatementItem = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.typesystem.structure.MatchStatementItem", false, false);
        while (matchStatementItem != null) {
          if (SLinkOperations.getTarget(matchStatementItem, "condition", true) != null) {
            ListSequence.fromList(result).addElement(SLinkOperations.getTarget(matchStatementItem, "condition", true));
          }
          matchStatementItem = SNodeOperations.getAncestor(matchStatementItem, "jetbrains.mps.lang.typesystem.structure.MatchStatementItem", false, false);
        }
        return result;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)", "1213104858865");
      }
    });
    return result;
  }
}
