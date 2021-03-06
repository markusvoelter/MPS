package jetbrains.mps.execution.settings.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class typeof_GridBagConstraints_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_GridBagConstraints_InferenceRule() {
  }

  public void applyRule(final SNode gridBagConstraints, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = gridBagConstraints;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "2722628536112115610", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "2722628536112115607", true), (SNode) new typeof_GridBagConstraints_InferenceRule.QuotationClass_b7f1sc_a0a0a0().createNode(typeCheckingContext), _info_12389875345);
    }
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(gridBagConstraints, "order", true);
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "2158326176673575456", 0, null);
      typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:e115237b-80f4-4ca3-87d6-2ac891492994(jetbrains.mps.execution.settings.typesystem)", "2158326176673575458", true), (SNode) new typeof_GridBagConstraints_InferenceRule.QuotationClass_b7f1sc_a0a1a0().createNode(typeCheckingContext), false, false, _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.execution.settings.structure.GridBagConstraints";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_b7f1sc_a0a0a0 {
    public QuotationClass_b7f1sc_a0a0a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.awt(JDK/java.awt@java_stub)"), SNodeId.fromString("~GridBagConstraints")));
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.awt(JDK/java.awt@java_stub)"), SNodeId.fromString("~GridBagConstraints")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_b7f1sc_a0a1a0 {
    public QuotationClass_b7f1sc_a0a1a0() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("argument", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Integer")));
          quotedNode_1.addChild("argument", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.JoinType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.IntegerType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode_1.addChild("argument", quotedNode1_5);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_3;
          quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~Integer")));
          quotedNode_1.addChild("argument", quotedNode1_6);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
