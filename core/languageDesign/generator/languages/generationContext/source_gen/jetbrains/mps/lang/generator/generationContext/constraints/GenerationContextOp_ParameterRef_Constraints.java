package jetbrains.mps.lang.generator.generationContext.constraints;

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
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNodePointer;

public class GenerationContextOp_ParameterRef_Constraints extends ConstraintsDataHolder {
  public GenerationContextOp_ParameterRef_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ParameterRef";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_ParameterRef";
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
    result.put("parameter", new BaseNodeReferenceSearchScopeProvider() {
      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        List<SNode> result = new ArrayList<SNode>();
        SNode templDeclaration = SNodeOperations.getAncestor(_context.getEnclosingNode(), "jetbrains.mps.lang.generator.structure.TemplateDeclaration", false, false);
        if ((templDeclaration != null) && ListSequence.fromList(SLinkOperations.getTargets(templDeclaration, "parameter", true)).isNotEmpty()) {
          ListSequence.fromList(result).addSequence(ListSequence.fromList(SLinkOperations.getTargets(templDeclaration, "parameter", true)));
        }
        return result;
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:00000000-0000-4000-0000-011c895902ee(jetbrains.mps.lang.generator.generationContext.constraints)", "5190093307972812910");
      }
    });
    return result;
  }
}
