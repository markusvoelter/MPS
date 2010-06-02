package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.closures.behavior.RuntimeUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper.ClosureLiteralUtil;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class supertypesOf_FunctionType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  public supertypesOf_FunctionType_SubtypingRule() {
  }

  public List<SNode> getSubOrSuperTypes(SNode ft, TypeCheckingContext typeCheckingContext) {
    List<SNode> supertypes = null;
    SNode ct = null;
    if ((SLinkOperations.getTarget(ft, "runtimeIface", false) == null)) {
      String rtSig = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(ft) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(ft);
      SNode ice = MapSequence.fromMap(RuntimeUtils.getRuntimeClassifiersMap()).get(rtSig);
      if (SNodeOperations.isInstanceOf(ice, "jetbrains.mps.baseLanguage.structure.Interface")) {
        ct = new supertypesOf_FunctionType_SubtypingRule.QuotationClass_8hodjs_a0a0a2a2a0().createNode(ice, typeCheckingContext);
      }
      if ((ct != null)) {
        if ((FunctionType_Behavior.call_getResultType_1230475757059(ft) != null)) {
          ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(SNodeOperations.copyNode(FunctionType_Behavior.call_getResultType_1230475757059(ft)));
        }
        for (SNode pt : SLinkOperations.getTargets(ft, "parameterType", true)) {
          ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(SNodeOperations.copyNode(pt));
        }
        supertypes = ListSequence.fromListAndArray(new ArrayList<SNode>(), ct);
      }
    } else {
      ct = ClosureLiteralUtil.fillParams(new supertypesOf_FunctionType_SubtypingRule.QuotationClass_8hodjs_a0a0a0a2a0().createNode(SLinkOperations.getTarget(ft, "runtimeIface", false), typeCheckingContext), ft);
      supertypes = ListSequence.fromListAndArray(new ArrayList<SNode>(), ct);
    }
    // turn off the rule temporarily 
    // <node> 
    return null;
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_8hodjs_a0a0a2a2a0 {
    public QuotationClass_8hodjs_a0a0a2a2a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_8hodjs_a0a0a0a2a0 {
    public QuotationClass_8hodjs_a0a0a0a2a0() {
    }

    public SNode createNode(Object parameter_3, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("classifier", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
