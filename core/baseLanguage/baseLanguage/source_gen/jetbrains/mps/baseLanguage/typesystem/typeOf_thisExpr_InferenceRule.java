package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.ClassConcept_Behavior;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeOf_thisExpr_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_thisExpr_InferenceRule() {
  }

  public void applyRule(final SNode thisExpr, final TypeCheckingContext typeCheckingContext) {
    SNode classifier;
    if ((SLinkOperations.getTarget(thisExpr, "classConcept", false) != null)) {
      classifier = SLinkOperations.getTarget(thisExpr, "classConcept", false);
    } else {
      classifier = ClassConcept_Behavior.getContextClass_8008512149545173402(thisExpr);
    }
    List<SNode> typeVarRefs = new ArrayList<SNode>();
    for (SNode typeVariableDeclaration : SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)) {
      ListSequence.fromList(typeVarRefs).addElement(new typeOf_thisExpr_InferenceRule.QuotationClass_ausror_a0a0a0d0a().createNode(typeVariableDeclaration, typeCheckingContext));
    }
    {
      SNode _nodeToCheck_1029348928467 = thisExpr;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1215004810737", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1215004810739", true), (SNode) new typeOf_thisExpr_InferenceRule.QuotationClass_ausror_a0a4a0().createNode(typeVarRefs, classifier, typeCheckingContext), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ThisExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_ausror_a0a0a0d0a {
    public QuotationClass_ausror_a0a0a0d0a() {
    }

    public SNode createNode(Object parameter_ausror_a0a0a0a0d0a, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_ausror_a0a0a0d0a = null;
      {
        quotedNode_ausror_a0a0a0d0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_ausror_a0a0a0d0a = quotedNode_ausror_a0a0a0d0a;
        quotedNode1_ausror_a0a0a0d0a.setReferent("typeVariableDeclaration", (SNode) parameter_ausror_a0a0a0a0d0a);
        result = quotedNode1_ausror_a0a0a0d0a;
      }
      return result;
    }

    public SNode createNode(Object parameter_ausror_a0a0a0a0d0a) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_ausror_a0a0a0d0a = null;
      {
        quotedNode_ausror_a0a0a0d0a = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableReference", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_ausror_a0a0a0d0a = quotedNode_ausror_a0a0a0d0a;
        quotedNode1_ausror_a0a0a0d0a.setReferent("typeVariableDeclaration", (SNode) parameter_ausror_a0a0a0a0d0a);
        result = quotedNode1_ausror_a0a0a0d0a;
      }
      return result;
    }
  }

  public static class QuotationClass_ausror_a0a4a0 {
    public QuotationClass_ausror_a0a4a0() {
    }

    public SNode createNode(Object parameter_ausror_a0a0a0e0a, Object parameter_ausror_a0a0a4a0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_ausror_a0a4a0 = null;
      SNode quotedNode_ausror_a0a0e0a = null;
      {
        quotedNode_ausror_a0a4a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_ausror_a0a4a0 = quotedNode_ausror_a0a4a0;
        quotedNode1_ausror_a0a4a0.setReferent("classifier", (SNode) parameter_ausror_a0a0a4a0);
        {
          List<SNode> nodes = (List<SNode>) parameter_ausror_a0a0a0e0a;
          for (SNode child : nodes) {
            quotedNode_ausror_a0a4a0.addChild("parameter", HUtil.copyIfNecessary(child, typeCheckingContext));
          }
        }
        result = quotedNode1_ausror_a0a4a0;
      }
      return result;
    }

    public SNode createNode(Object parameter_ausror_a0a0a0e0a, Object parameter_ausror_a0a0a4a0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_ausror_a0a4a0 = null;
      SNode quotedNode_ausror_a0a0e0a = null;
      {
        quotedNode_ausror_a0a4a0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_ausror_a0a4a0 = quotedNode_ausror_a0a4a0;
        quotedNode1_ausror_a0a4a0.setReferent("classifier", (SNode) parameter_ausror_a0a0a4a0);
        {
          List<SNode> nodes = (List<SNode>) parameter_ausror_a0a0a0e0a;
          for (SNode child : nodes) {
            quotedNode_ausror_a0a4a0.addChild("parameter", HUtil.copyIfNecessary(child));
          }
        }
        result = quotedNode1_ausror_a0a4a0;
      }
      return result;
    }
  }
}
