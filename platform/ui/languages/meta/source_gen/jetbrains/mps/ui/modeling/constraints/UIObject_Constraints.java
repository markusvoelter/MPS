package jetbrains.mps.ui.modeling.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ui.modeling.behavior.UIObject_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.smodel.SNodePointer;

public class UIObject_Constraints extends ConstraintsDataHolder {
  public UIObject_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.ui.modeling.structure.UIObject";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.ui.modeling.structure.UIObject";
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
    result.put("belongsTo", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        List<SNode> nodes = SModelOperations.getNodesIncludingImported(_context.getModel(), GlobalScope.getInstance(), "jetbrains.mps.ui.modeling.structure.UIObject");
        if ((_context.getReferenceNode() == null)) {
          return nodes;
        }
        SNode uio = SNodeOperations.cast(_context.getReferenceNode(), "jetbrains.mps.ui.modeling.structure.UIObject");
        // respect extending object's "belongsTo" ref 
        final SNode mbt = UIObject_Behavior.call_mustBelongTo_1719339442171055203(uio);
        if (mbt != null) {
          ListSequence.fromList(nodes).removeWhere(new IWhereFilter<SNode>() {
            public boolean accept(SNode n) {
              return !(Sequence.fromIterable(UIObject_Behavior.call_allExtends_8115675450774407592(n)).contains(mbt));
            }
          });
        }
        return nodes;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:3cad8b0f-ef3c-442c-8c6f-1ab422f65805(jetbrains.mps.ui.modeling.constraints)", "1719339442170193747");
      }
    });
    return result;
  }
}
