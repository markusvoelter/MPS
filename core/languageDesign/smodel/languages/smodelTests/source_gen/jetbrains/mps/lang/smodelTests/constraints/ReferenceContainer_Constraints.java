package jetbrains.mps.lang.smodelTests.constraints;

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
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.PresentationReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SNodePointer;

public class ReferenceContainer_Constraints extends ConstraintsDataHolder {
  public ReferenceContainer_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.smodelTests.structure.ReferenceContainer";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.smodelTests.structure.ReferenceContainer";
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
    result.put("root", new BaseNodeReferenceSearchScopeProvider() {
      public boolean hasPresentation() {
        return true;
      }

      public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
        return SPropertyOperations.getString(_context.getParameterNode(), "name");
      }

      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        return SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.smodelTests.structure.Root");
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:c3114115-c401-467f-8766-388ee2aa9908(jetbrains.mps.lang.smodelTests.constraints)", "8758390115029091796");
      }
    });
    result.put("rightChild", new BaseNodeReferenceSearchScopeProvider() {
      public boolean hasPresentation() {
        return true;
      }

      public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
        return SPropertyOperations.getString(_context.getParameterNode(), "name");
      }

      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        return SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.smodelTests.structure.Child");
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:c3114115-c401-467f-8766-388ee2aa9908(jetbrains.mps.lang.smodelTests.constraints)", "8758390115029225986");
      }
    });
    result.put("leftChild", new BaseNodeReferenceSearchScopeProvider() {
      public boolean hasPresentation() {
        return true;
      }

      public String getPresentation(final IOperationContext operationContext, final PresentationReferentConstraintContext _context) {
        return SPropertyOperations.getString(_context.getParameterNode(), "name");
      }

      public void registerSelf(ModelConstraintsManager manager) {
      }

      public void unRegisterSelf(ModelConstraintsManager manager) {
      }

      public Object createSearchScopeOrListOfNodes(final IOperationContext operationContext, final ReferentConstraintContext _context) {
        return SModelOperations.getNodes(_context.getModel(), "jetbrains.mps.lang.smodelTests.structure.Child");
      }

      public SNodePointer getSearchScopeValidatorNodePointer() {
        return new SNodePointer("r:c3114115-c401-467f-8766-388ee2aa9908(jetbrains.mps.lang.smodelTests.constraints)", "8758390115029226005");
      }
    });
    return result;
  }
}
