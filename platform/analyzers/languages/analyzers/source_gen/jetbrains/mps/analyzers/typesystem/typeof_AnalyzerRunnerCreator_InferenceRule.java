package jetbrains.mps.analyzers.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_AnalyzerRunnerCreator_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_AnalyzerRunnerCreator_InferenceRule() {
  }

  public void applyRule(final SNode analyzerRunnerCreator, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = analyzerRunnerCreator;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:139daa25-c5a7-4ac9-85a2-eb14d22e8f56(jetbrains.mps.analyzers.typesystem)", "178770917832644953", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:139daa25-c5a7-4ac9-85a2-eb14d22e8f56(jetbrains.mps.analyzers.typesystem)", "178770917832644950", true), (SNode) new typeof_AnalyzerRunnerCreator_InferenceRule.QuotationClass_tazfkf_a0a0a0().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(analyzerRunnerCreator, "analyzer", false), "latticeElementType", true), typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.analyzers.structure.AnalyzerRunnerCreator";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_tazfkf_a0a0a0 {
    public QuotationClass_tazfkf_a0a0a0() {
    }

    public SNode createNode(Object parameter_5, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.addReference(SReference.create("classifier", quotedNode1_3, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.dataFlow.framework(jetbrains.mps.lang.dataFlow.framework@java_stub)"), SNodeId.fromString("~AnalyzerRunner")));
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_4, typeCheckingContext));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }

    public SNode createNode(Object parameter_5) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_3 = quotedNode_1;
        quotedNode1_3.addReference(SReference.create("classifier", quotedNode1_3, SModelReference.fromString("f:java_stub#jetbrains.mps.lang.dataFlow.framework(jetbrains.mps.lang.dataFlow.framework@java_stub)"), SNodeId.fromString("~AnalyzerRunner")));
        {
          quotedNode_2 = (SNode) parameter_5;
          SNode quotedNode1_4;
          if (_parameterValues_129834374.contains(quotedNode_2)) {
            quotedNode1_4 = CopyUtil.copy(quotedNode_2);
          } else {
            _parameterValues_129834374.add(quotedNode_2);
            quotedNode1_4 = quotedNode_2;
          }
          if (quotedNode1_4 != null) {
            quotedNode_1.addChild("parameter", HUtil.copyIfNecessary(quotedNode1_4));
          }
        }
        result = quotedNode1_3;
      }
      return result;
    }
  }
}
