package jetbrains.mps.lang.smodel.typesystem;

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
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeof_Reference_GetLinkDeclarationOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Reference_GetLinkDeclarationOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = operation;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1892129828611705349", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1892129828611702808", true), (SNode) new typeof_Reference_GetLinkDeclarationOperation_InferenceRule.QuotationClass_7375_l523emnf6wyu().createNode(typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Reference_GetLinkDeclarationOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_7375_l523emnf6wyu {
    public QuotationClass_7375_l523emnf6wyu() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7375_l523emnf6q73 = null;
      {
        quotedNode_7375_l523emnf6q73 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7375_l523emnf6q73 = quotedNode_7375_l523emnf6q73;
        quotedNode1_7375_l523emnf6q73.addReference(SReference.create("concept", quotedNode1_7375_l523emnf6q73, SModelReference.fromString("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)"), SNodeId.fromString("1071489288298")));
        result = quotedNode1_7375_l523emnf6q73;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_7375_l523emnf6q73 = null;
      {
        quotedNode_7375_l523emnf6q73 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_7375_l523emnf6q73 = quotedNode_7375_l523emnf6q73;
        quotedNode1_7375_l523emnf6q73.addReference(SReference.create("concept", quotedNode1_7375_l523emnf6q73, SModelReference.fromString("r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)"), SNodeId.fromString("1071489288298")));
        result = quotedNode1_7375_l523emnf6q73;
      }
      return result;
    }
  }
}
