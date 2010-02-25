package jetbrains.mps.lang.smodel.typesystem;

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

public class typeOf_Model_NodesIncludingImportedOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_Model_NodesIncludingImportedOperation_InferenceRule() {
  }

  public void applyRule(final SNode node, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = node;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203711969136", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1203711969138", true), (SNode) new typeOf_Model_NodesIncludingImportedOperation_InferenceRule.QuotationClass_6591_l523emnf6uqh().createNode(SLinkOperations.getTarget(node, "concept", false), typeCheckingContext), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(node, "scope", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1182512146610", 0, intentionProvider);
      _info_12389875345.setInequationGroup("default");
      typeCheckingContext.createLessThanInequation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "1182512146613", true), (SNode) new typeOf_Model_NodesIncludingImportedOperation_InferenceRule.QuotationClass_6591_l523emnf6us9().createNode(typeCheckingContext), false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Model_NodesIncludingImportedOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

  public static class QuotationClass_6591_l523emnf6uqh {
    public QuotationClass_6591_l523emnf6uqh() {
    }

    public SNode createNode(Object parameter_6591_l523emnf6ngc, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6591_l523emnf6nga = null;
      {
        quotedNode_6591_l523emnf6nga = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6591_l523emnf6nga = quotedNode_6591_l523emnf6nga;
        quotedNode1_6591_l523emnf6nga.setReferent("elementConcept", (SNode) parameter_6591_l523emnf6ngc);
        result = quotedNode1_6591_l523emnf6nga;
      }
      return result;
    }

    public SNode createNode(Object parameter_6591_l523emnf6ngc) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6591_l523emnf6nga = null;
      {
        quotedNode_6591_l523emnf6nga = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6591_l523emnf6nga = quotedNode_6591_l523emnf6nga;
        quotedNode1_6591_l523emnf6nga.setReferent("elementConcept", (SNode) parameter_6591_l523emnf6ngc);
        result = quotedNode1_6591_l523emnf6nga;
      }
      return result;
    }
  }

  public static class QuotationClass_6591_l523emnf6us9 {
    public QuotationClass_6591_l523emnf6us9() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6591_l523emnf6ngj = null;
      {
        quotedNode_6591_l523emnf6ngj = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6591_l523emnf6ngj = quotedNode_6591_l523emnf6ngj;
        quotedNode1_6591_l523emnf6ngj.addReference(SReference.create("classifier", quotedNode1_6591_l523emnf6ngj, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~IScope")));
        result = quotedNode1_6591_l523emnf6ngj;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_6591_l523emnf6ngj = null;
      {
        quotedNode_6591_l523emnf6ngj = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_6591_l523emnf6ngj = quotedNode_6591_l523emnf6ngj;
        quotedNode1_6591_l523emnf6ngj.addReference(SReference.create("classifier", quotedNode1_6591_l523emnf6ngj, SModelReference.fromString("f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)"), SNodeId.fromString("~IScope")));
        result = quotedNode1_6591_l523emnf6ngj;
      }
      return result;
    }
  }
}
