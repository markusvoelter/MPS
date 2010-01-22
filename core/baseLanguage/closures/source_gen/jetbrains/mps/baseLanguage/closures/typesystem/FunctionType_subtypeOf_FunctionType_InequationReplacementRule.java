package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInequationReplacementRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class FunctionType_subtypeOf_FunctionType_InequationReplacementRule extends AbstractInequationReplacementRule_Runtime {
  public FunctionType_subtypeOf_FunctionType_InequationReplacementRule() {
  }

  public void processInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo, final TypeCheckingContext typeCheckingContext) {
    if (SNodeOperations.getConceptDeclaration(subtype) != SNodeOperations.getConceptDeclaration(supertype)) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "incompatible types", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1229719015332", intentionProvider, errorTarget);
        _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
      }
      return;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameterType", true)).count()) {
      {
        BaseIntentionProvider intentionProvider = null;
        IErrorTarget errorTarget = new NodeErrorTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(equationInfo.getNodeWithError(), "different parameter numbers", "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1201618945543", intentionProvider, errorTarget);
        _reporter_2309309498.addAdditionalRuleIdsFromInfo(equationInfo);
      }
      return;
    }
    // priority should be less than priority of typeof_ClosureLiteral type-creating inequations 
    {
      SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
      BaseIntentionProvider intentionProvider = null;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "4160512568111333309", 0, intentionProvider);
      _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
      _info_12389875345.setInequationGroup("priority_1_1759628044690732298");
      _info_12389875345.addInequationGroupBefore("default");
      typeCheckingContext.createLessThanInequation((SNode) new FunctionType_subtypeOf_FunctionType_InequationReplacementRule.QuotationClass_5899_0().createNode(SLinkOperations.getTarget(subtype, "resultType", true), typeCheckingContext), (SNode) SLinkOperations.getTarget(supertype, "resultType", true), false, _info_12389875345);
    }
    if (SNodeOperations.isInstanceOf(subtype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType") && SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType")) {
      {
        final SNode superTerminate = SLinkOperations.getTarget(SNodeOperations.cast(supertype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true);
        typeCheckingContext.whenConcrete(superTerminate, new Runnable() {
          public void run() {
            if (!(SNodeOperations.isInstanceOf(typeCheckingContext.getEquationManager().getRepresentator(superTerminate), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
              {
                SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
                BaseIntentionProvider intentionProvider = null;
                EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237814209725", 0, intentionProvider);
                _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
                _info_12389875345.setInequationGroup("default");
                typeCheckingContext.createLessThanInequation((SNode) SLinkOperations.getTarget(SNodeOperations.cast(subtype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true), (SNode) typeCheckingContext.getEquationManager().getRepresentator(superTerminate), false, _info_12389875345);
              }
            }
          }
        }, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1237814165989", false, false);
      }
    }
    {
      SNode paramType1;
      SNode paramType2;
      Iterator<SNode> paramType1_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).iterator();
      Iterator<SNode> paramType2_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameterType", true)).iterator();
      while (true) {
        if (!(paramType1_iterator.hasNext())) {
          break;
        }
        if (!(paramType2_iterator.hasNext())) {
          break;
        }
        paramType1 = paramType1_iterator.next();
        paramType2 = paramType2_iterator.next();
        {
          SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1201614990748", 0, intentionProvider);
          _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode) paramType2, (SNode) paramType1, false, _info_12389875345);
        }
      }
    }
    SNode join = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.JoinType", null);
    ListSequence.fromList(SLinkOperations.getTargets(join, "argument", true)).addElement(new FunctionType_subtypeOf_FunctionType_InequationReplacementRule.QuotationClass_5899_2().createNode(typeCheckingContext));
    for (SNode superThrows : ListSequence.fromList(SLinkOperations.getTargets(supertype, "throwsType", true))) {
      ListSequence.fromList(SLinkOperations.getTargets(join, "argument", true)).addElement(SNodeOperations.copyNode(superThrows));
    }
    for (SNode subThrows : ListSequence.fromList(SLinkOperations.getTargets(subtype, "throwsType", true))) {
      {
        SNode _nodeToCheck_1029348928467 = equationInfo.getNodeWithError();
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590337(jetbrains.mps.baseLanguage.closures.typesystem)", "1214834519072", 0, intentionProvider);
        _info_12389875345.getOuterRulesIdFromInfo(equationInfo);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequation((SNode) subThrows, (SNode) join, false, _info_12389875345);
      }
    }
  }

  public boolean checkInequation(final SNode subtype, final SNode supertype, final EquationInfo equationInfo) {
    boolean result_14532009 = true;
    {
      if (SNodeOperations.getConceptDeclaration(subtype) != SNodeOperations.getConceptDeclaration(supertype)) {
        result_14532009 = false;
        return result_14532009;
      }
      if (ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).count() != ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameterType", true)).count()) {
        result_14532009 = false;
        return result_14532009;
      }
      // priority should be less than priority of typeof_ClosureLiteral type-creating inequations 
      result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) new FunctionType_subtypeOf_FunctionType_InequationReplacementRule.QuotationClass_5899_1().createNode(SLinkOperations.getTarget(subtype, "resultType", true)), (SNode) SLinkOperations.getTarget(supertype, "resultType", true), true);
      if (SNodeOperations.isInstanceOf(subtype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType") && SNodeOperations.isInstanceOf(supertype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType")) {
        {
          final SNode superTerminate = SLinkOperations.getTarget(SNodeOperations.cast(supertype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true);
          if (!(SNodeOperations.isInstanceOf(superTerminate, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
            result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) SLinkOperations.getTarget(SNodeOperations.cast(subtype, "jetbrains.mps.baseLanguage.closures.structure.UnrestrictedFunctionType"), "terminateType", true), (SNode) superTerminate, true);
          }
        }
      }
      {
        SNode paramType1;
        SNode paramType2;
        Iterator<SNode> paramType1_iterator = ListSequence.fromList(SLinkOperations.getTargets(subtype, "parameterType", true)).iterator();
        Iterator<SNode> paramType2_iterator = ListSequence.fromList(SLinkOperations.getTargets(supertype, "parameterType", true)).iterator();
        while (true) {
          if (!(paramType1_iterator.hasNext())) {
            break;
          }
          if (!(paramType2_iterator.hasNext())) {
            break;
          }
          paramType1 = paramType1_iterator.next();
          paramType2 = paramType2_iterator.next();
          result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) paramType2, (SNode) paramType1, true);
        }
      }
      SNode join = SConceptOperations.createNewNode("jetbrains.mps.lang.typesystem.structure.JoinType", null);
      ListSequence.fromList(SLinkOperations.getTargets(join, "argument", true)).addElement(new FunctionType_subtypeOf_FunctionType_InequationReplacementRule.QuotationClass_5899_3().createNode());
      for (SNode superThrows : ListSequence.fromList(SLinkOperations.getTargets(supertype, "throwsType", true))) {
        ListSequence.fromList(SLinkOperations.getTargets(join, "argument", true)).addElement(SNodeOperations.copyNode(superThrows));
      }
      for (SNode subThrows : ListSequence.fromList(SLinkOperations.getTargets(subtype, "throwsType", true))) {
        result_14532009 = result_14532009 && TypeChecker.getInstance().getSubtypingManager().isSubtype((SNode) subThrows, (SNode) join, true);
      }
    }
    return result_14532009;
  }

  public boolean isWeak() {
    return true;
  }

  public boolean isApplicableSubtype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSubtypeConceptFQName());
  }

  public boolean isApplicableSupertype(SNode node) {
    return SModelUtil_new.isAssignableConcept(node.getConceptFqName(), this.getApplicableSupertypeConceptFQName());
  }

  public String getApplicableSubtypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }

  public String getApplicableSupertypeConceptFQName() {
    return "jetbrains.mps.baseLanguage.closures.structure.FunctionType";
  }

  public static class QuotationClass_5899_0 {
    public QuotationClass_5899_0() {
    }

    public SNode createNode(Object parameter_5899_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_0 = null;
      SNode quotedNode_5899_1 = null;
      SNode quotedNode_5899_2 = null;
      {
        quotedNode_5899_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.MeetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_0 = quotedNode_5899_0;
        {
          quotedNode_5899_1 = (SNode) parameter_5899_0;
          SNode quotedNode1_15;
          if (_parameterValues_129834374.contains(quotedNode_5899_1)) {
            quotedNode1_15 = CopyUtil.copy(quotedNode_5899_1);
          } else {
            _parameterValues_129834374.add(quotedNode_5899_1);
            quotedNode1_15 = quotedNode_5899_1;
          }
          if (quotedNode1_15 != null) {
            quotedNode_5899_0.addChild("argument", HUtil.copyIfNecessary(quotedNode1_15, typeCheckingContext));
          }
        }
        {
          quotedNode_5899_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5899_1 = quotedNode_5899_2;
          quotedNode_5899_0.addChild("argument", quotedNode1_5899_1);
        }
        result = quotedNode1_5899_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_5899_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_0 = null;
      SNode quotedNode_5899_1 = null;
      SNode quotedNode_5899_2 = null;
      {
        quotedNode_5899_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.MeetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_0 = quotedNode_5899_0;
        {
          quotedNode_5899_1 = (SNode) parameter_5899_0;
          SNode quotedNode1_15;
          if (_parameterValues_129834374.contains(quotedNode_5899_1)) {
            quotedNode1_15 = CopyUtil.copy(quotedNode_5899_1);
          } else {
            _parameterValues_129834374.add(quotedNode_5899_1);
            quotedNode1_15 = quotedNode_5899_1;
          }
          if (quotedNode1_15 != null) {
            quotedNode_5899_0.addChild("argument", HUtil.copyIfNecessary(quotedNode1_15));
          }
        }
        {
          quotedNode_5899_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5899_1 = quotedNode_5899_2;
          quotedNode_5899_0.addChild("argument", quotedNode1_5899_1);
        }
        result = quotedNode1_5899_0;
      }
      return result;
    }
  }

  public static class QuotationClass_5899_1 {
    public QuotationClass_5899_1() {
    }

    public SNode createNode(Object parameter_5899_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_4 = null;
      SNode quotedNode_5899_5 = null;
      SNode quotedNode_5899_6 = null;
      {
        quotedNode_5899_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.MeetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_3 = quotedNode_5899_4;
        {
          quotedNode_5899_5 = (SNode) parameter_5899_1;
          SNode quotedNode1_16;
          if (_parameterValues_129834374.contains(quotedNode_5899_5)) {
            quotedNode1_16 = CopyUtil.copy(quotedNode_5899_5);
          } else {
            _parameterValues_129834374.add(quotedNode_5899_5);
            quotedNode1_16 = quotedNode_5899_5;
          }
          if (quotedNode1_16 != null) {
            quotedNode_5899_4.addChild("argument", HUtil.copyIfNecessary(quotedNode1_16));
          }
        }
        {
          quotedNode_5899_6 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5899_4 = quotedNode_5899_6;
          quotedNode_5899_4.addChild("argument", quotedNode1_5899_4);
        }
        result = quotedNode1_5899_3;
      }
      return result;
    }
  }

  public static class QuotationClass_5899_2 {
    public QuotationClass_5899_2() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_3 = null;
      {
        quotedNode_5899_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_2 = quotedNode_5899_3;
        quotedNode1_5899_2.addReference(SReference.create("classifier", quotedNode1_5899_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_5899_2;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_3 = null;
      {
        quotedNode_5899_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_2 = quotedNode_5899_3;
        quotedNode1_5899_2.addReference(SReference.create("classifier", quotedNode1_5899_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_5899_2;
      }
      return result;
    }
  }

  public static class QuotationClass_5899_3 {
    public QuotationClass_5899_3() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_5899_7 = null;
      {
        quotedNode_5899_7 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_5899_5 = quotedNode_5899_7;
        quotedNode1_5899_5.addReference(SReference.create("classifier", quotedNode1_5899_5, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~RuntimeException")));
        result = quotedNode1_5899_5;
      }
      return result;
    }
  }
}
