package jetbrains.mps.lang.generator.constraints;

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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class ITemplateCall_Constraints extends ConstraintsDataHolder {
  public ITemplateCall_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.generator.structure.ITemplateCall";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.generator.structure.ITemplateCall";
  }

  @Nullable
  @Override
  public CanBeASomethingMethod<CanBeAParentContext> getCanBeAParentMethod() {
    return new CanBeASomethingMethod<CanBeAParentContext>() {
      private SNodePointer breakingNode = new SNodePointer("r:00000000-0000-4000-0000-011c895902e2(jetbrains.mps.lang.generator.constraints)", "4035562641222637870");

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
    if (_context.getLink() == SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.generator.structure.ITemplateCall", "actualArgument")) {
      return SConceptOperations.isSubConceptOf(_context.getChildConcept(), "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef") || SConceptOperations.isSubConceptOf(_context.getChildConcept(), "jetbrains.mps.lang.generator.structure.TemplateArgumentQueryExpression") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateArgumentParameterExpression") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerConstant") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.BooleanConstant") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral");
    }
    return false;
  }
}
