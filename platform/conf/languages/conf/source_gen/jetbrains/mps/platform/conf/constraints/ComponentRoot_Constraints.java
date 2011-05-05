package jetbrains.mps.platform.conf.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.structure.CanBeASomethingMethod;
import jetbrains.mps.smodel.constraints.CanBeAParentContext;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.structure.CheckingNodeContext;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;

public class ComponentRoot_Constraints extends ConstraintsDataHolder {
  public ComponentRoot_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.platform.conf.structure.ComponentRoot";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.platform.conf.structure.ComponentRoot";
  }

  @Nullable
  @Override
  public CanBeASomethingMethod<CanBeAParentContext> getCanBeAParentMethod() {
    return new CanBeASomethingMethod<CanBeAParentContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:2fe958f4-f755-4faa-af2a-c5125dc0cfc1(jetbrains.mps.platform.conf.constraints)", "5246455451713054249");

      public boolean canBe(IOperationContext operationContext, CanBeAParentContext _context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = canBeAParent(operationContext, _context);
        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.breakingNodePointer = breakingNode;
        }
        return result;
      }
    };
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
    return result;
  }

  public static boolean canBeAParent(final IOperationContext operationContext, final CanBeAParentContext _context) {
    return ConfigurationXmlRootNode_constraintsUtil.canBeParent(_context.getLink(), _context.getChildConcept());
  }
}
