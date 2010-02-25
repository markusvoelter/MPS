package jetbrains.mps.lang.refactoring.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_RefactoringContext_ConceptFunctionParameter_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_RefactoringContext_ConceptFunctionParameter_InferenceRule() {
  }

  public void applyRule(final SNode parameter, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = parameter;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "7953996722066536536", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.typesystem)", "7953996722066536533", true), (SNode) new typeof_RefactoringContext_ConceptFunctionParameter_InferenceRule.QuotationClass_1103_l523emnf4cow().createNode(typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.RefactoringContext_ConceptFunctionParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_1103_l523emnf4cow {
    public QuotationClass_1103_l523emnf4cow() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1103_l523emnf4al5 = null;
      {
        quotedNode_1103_l523emnf4al5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ContextType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1103_l523emnf4al5 = quotedNode_1103_l523emnf4al5;
        result = quotedNode1_1103_l523emnf4al5;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1103_l523emnf4al5 = null;
      {
        quotedNode_1103_l523emnf4al5 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ContextType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1103_l523emnf4al5 = quotedNode_1103_l523emnf4al5;
        result = quotedNode1_1103_l523emnf4al5;
      }
      return result;
    }
  }
}
