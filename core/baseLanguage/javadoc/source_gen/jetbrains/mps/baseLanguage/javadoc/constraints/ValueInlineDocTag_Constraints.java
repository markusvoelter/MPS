package jetbrains.mps.baseLanguage.javadoc.constraints;

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

public class ValueInlineDocTag_Constraints extends ConstraintsDataHolder {
  public ValueInlineDocTag_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.baseLanguage.javadoc.structure.ValueInlineDocTag";
  }

  @Nullable
  @Override
  public CanBeASomethingMethod<CanBeAParentContext> getCanBeAParentMethod() {
    return new CanBeASomethingMethod<CanBeAParentContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:0c8b4715-852a-45a2-a74c-d96af699ad1c(jetbrains.mps.baseLanguage.javadoc.constraints@1_0)", "3941416111380671266");

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
    //  TODO check for constant 
    return true;
  }
}
