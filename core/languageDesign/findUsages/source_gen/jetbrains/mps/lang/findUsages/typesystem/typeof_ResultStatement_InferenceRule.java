package jetbrains.mps.lang.findUsages.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
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

public class typeof_ResultStatement_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_ResultStatement_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(nodeToCheck, "foundNode", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.typesystem)", "1200308962544", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c8959035a(jetbrains.mps.lang.findUsages.typesystem)", "1200308962549", true), (SNode) new typeof_ResultStatement_InferenceRule.QuotationClass_3786_l523emnexien().createNode(typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.findUsages.structure.ResultStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_3786_l523emnexien {
    public QuotationClass_3786_l523emnexien() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3786_l523emnexi86 = null;
      {
        quotedNode_3786_l523emnexi86 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3786_l523emnexi86 = quotedNode_3786_l523emnexi86;
        quotedNode1_3786_l523emnexi86.addReference(SReference.create("classifier", quotedNode1_3786_l523emnexi86, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SNode")));
        result = quotedNode1_3786_l523emnexi86;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_3786_l523emnexi86 = null;
      {
        quotedNode_3786_l523emnexi86 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3786_l523emnexi86 = quotedNode_3786_l523emnexi86;
        quotedNode1_3786_l523emnexi86.addReference(SReference.create("classifier", quotedNode1_3786_l523emnexi86, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~SNode")));
        result = quotedNode1_3786_l523emnexi86;
      }
      return result;
    }
  }
}
