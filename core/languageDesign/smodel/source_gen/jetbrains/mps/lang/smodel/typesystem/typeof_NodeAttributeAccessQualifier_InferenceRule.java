package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class typeof_NodeAttributeAccessQualifier_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_NodeAttributeAccessQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck, final TypeCheckingContext typeCheckingContext) {
    SNode annotationLink = SLinkOperations.getTarget(nodeToCheck, "annotationLink", false);
    if (annotationLink == null) {
      return;
    }
    // assign type 
    if (SPropertyOperations.hasValue(annotationLink, "sourceCardinality", "0..1", "0..1")) {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741151", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741153", true), (SNode) new typeof_NodeAttributeAccessQualifier_InferenceRule.QuotationClass_4880_0().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = nodeToCheck;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741170", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5458013232459741179", true), (SNode) new typeof_NodeAttributeAccessQualifier_InferenceRule.QuotationClass_4880_1().createNode(SLinkOperations.getTarget(annotationLink, "target", false), typeCheckingContext), _info_12389875345);
      }
    }
    // --- 
    if (!(SPropertyOperations.hasValue(annotationLink, "stereotype", "node", "node"))) {
      BaseIntentionProvider intentionProvider = null;
      IErrorTarget errorTarget = new NodeErrorTarget();
      IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(nodeToCheck, "node annotation link is expected", "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1204764593904", intentionProvider, errorTarget);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.NodeAttributeAccessQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_4880_0 {
    public QuotationClass_4880_0() {
    }

    public SNode createNode(Object parameter_4880_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4880_0 = null;
      {
        quotedNode_4880_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4880_0 = quotedNode_4880_0;
        quotedNode1_4880_0.setReferent("concept", (SNode) parameter_4880_0);
        result = quotedNode1_4880_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_4880_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4880_0 = null;
      {
        quotedNode_4880_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4880_0 = quotedNode_4880_0;
        quotedNode1_4880_0.setReferent("concept", (SNode) parameter_4880_0);
        result = quotedNode1_4880_0;
      }
      return result;
    }
  }

  public static class QuotationClass_4880_1 {
    public QuotationClass_4880_1() {
    }

    public SNode createNode(Object parameter_4880_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4880_1 = null;
      {
        quotedNode_4880_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4880_1 = quotedNode_4880_1;
        quotedNode1_4880_1.setReferent("elementConcept", (SNode) parameter_4880_1);
        result = quotedNode1_4880_1;
      }
      return result;
    }

    public SNode createNode(Object parameter_4880_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_4880_1 = null;
      {
        quotedNode_4880_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4880_1 = quotedNode_4880_1;
        quotedNode1_4880_1.setReferent("elementConcept", (SNode) parameter_4880_1);
        result = quotedNode1_4880_1;
      }
      return result;
    }
  }
}
