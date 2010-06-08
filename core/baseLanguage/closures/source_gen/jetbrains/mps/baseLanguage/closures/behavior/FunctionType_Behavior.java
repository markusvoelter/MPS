package jetbrains.mps.baseLanguage.closures.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class FunctionType_Behavior {
  private static Class[] PARAMETERS_1213877404927 = {SNode.class};
  private static Class[] PARAMETERS_1230472987259 = {SNode.class};
  private static Class[] PARAMETERS_1230475757059 = {SNode.class};
  private static Class[] PARAMETERS_1232032188607 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getPresentation_1213877396640(SNode thisNode) {
    StringBuffer sb = new StringBuffer("{");
    String sep = "";
    for (SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      sb.append(sep).append(BaseConcept_Behavior.call_getPresentation_1213877396640(pt));
      sep = ",";
    }
    sb.append("=>").append(BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(thisNode, "resultType", true)));
    return sb.append("}").toString();
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return new FunctionType_Behavior.QuotationClass_ksvwin_a0a0c().createNode();
  }

  public static String virtual_getRuntimeSignature_1213877404927(SNode thisNode) {
    StringBuilder sb = new StringBuilder();
    if ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null)) {
      sb.append("_return");
    } else {
      sb.append("_void");
    }
    sb.append("_P").append(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameterType", true)).count());
    sb.append("_E").append(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "throwsType", true)).count());
    return sb.toString();
  }

  public static String virtual_getRuntimeClassName_1230472987259(SNode thisNode) {
    return "_FunctionTypes";
  }

  @Deprecated
  public static String call_getSignature_1213877405047(SNode thisNode) {
    if (thisNode == null) {
      return "???invalid signature???";
    }
    StringBuffer buf = new StringBuffer();
    FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, SLinkOperations.getTarget(thisNode, "resultType", true), buf);
    String sep = "_from";
    for (SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      buf.append(sep);
      sep = "_and";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, pt, buf);
    }
    sep = "_throws";
    for (SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      buf.append(sep);
      sep = "_and";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, tt, buf);
    }
    return buf.toString();
  }

  @Deprecated
  public static void call_fillTypeSignature_1213877405099(SNode thisNode, SNode t, StringBuffer buf) {
    buf.append("_");
    if (SNodeOperations.isInstanceOf(t, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")) {
      buf.append(FunctionType_Behavior.call_getSignature_1213877405047(SNodeOperations.cast(t, "jetbrains.mps.baseLanguage.closures.structure.FunctionType")));
      return;
    }
    SNode ct = TypeChecker.getInstance().getRuntimeSupport().coerce_(t, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
    String pres;
    if ((ct != null)) {
      String[] nn = SPropertyOperations.getString(SLinkOperations.getTarget(ct, "classifier", false), "name").split("\\\\.");
      buf.append(nn[nn.length - 1]);
    } else
    if (SConceptPropertyOperations.getString(t, "alias") != null) {
      buf.append(SConceptPropertyOperations.getString(t, "alias"));
    } else
    if ((pres = BaseConcept_Behavior.call_getPresentation_1213877396640(t)) != null) {
      buf.append(pres);
    } else {
      buf.append(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(t), "name"));
    }
    // TODO: sort children by role 
    List<SNode> paramTypes = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode c : SNodeOperations.getChildren(t)) {
      if (SNodeOperations.isInstanceOf(c, "jetbrains.mps.baseLanguage.structure.Type")) {
        ListSequence.fromList(paramTypes).addElement(c);
      }
    }
    String sep = "_of";
    for (SNode pt : paramTypes) {
      buf.append(sep);
      sep = "_x";
      FunctionType_Behavior.call_fillTypeSignature_1213877405099(thisNode, pt, buf);
    }
  }

  public static SNode virtual_getResultType_1230475757059(SNode thisNode) {
    SNode rt = SLinkOperations.getTarget(thisNode, "resultType", true);
    rt = FunctionType_Behavior.call_unmeet_1237318764946(thisNode, rt);
    if (SNodeOperations.isInstanceOf(rt, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      return null;
    }
    if (SNodeOperations.isInstanceOf(rt, "jetbrains.mps.baseLanguage.structure.NullType")) {
      return new FunctionType_Behavior.QuotationClass_ksvwin_a0a0d0h().createNode();
    }
    return SNodeOperations.cast(rt, "jetbrains.mps.baseLanguage.structure.Type");
  }

  public static SNode call_unmeet_1237318764946(SNode thisNode, SNode possiblyMeet) {
    SNode tmp = possiblyMeet;
with_meet:
    while (SNodeOperations.isInstanceOf(tmp, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(tmp, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        if (!(SNodeOperations.isInstanceOf(arg, "jetbrains.mps.baseLanguage.structure.VoidType"))) {
          tmp = arg;
          continue with_meet;
        }
      }
      return new FunctionType_Behavior.QuotationClass_ksvwin_a0b0b0i().createNode();
    }
    if (SNodeOperations.isInstanceOf(tmp, "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      List<SNode> params = SLinkOperations.getTargets(SNodeOperations.cast(tmp, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
      for (SNode p : params) {
        SNode up = FunctionType_Behavior.call_unmeet_1237318764946(thisNode, p);
        if (up != p) {
          SNodeOperations.replaceWithAnother(p, up);
        }
      }
    }
    return tmp;
  }

  public static SNode virtual_getTerminateType_1232032188607(SNode thisNode) {
    return null;
  }

  public static SNode call_getDeclarationRuntimeType_1230319610063(SNode thisNode) {
    String rtCls = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(thisNode) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(thisNode);
    SNode ice = MapSequence.fromMap(RuntimeUtils.getRuntimeClassifiersMap()).get(rtCls);
    if (ice == null) {
      return null;
    }
    SNode ct = new FunctionType_Behavior.QuotationClass_ksvwin_a0a3a01().createNode(ice);
    if ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getResultType_1230475757059(thisNode)), true));
    }
    if ((FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode)), true));
    }
    for (SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt), false));
    }
    for (SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(tt, true));
    }
    return ct;
  }

  public static SNode call_getRuntimeType_1230319150573(SNode thisNode) {
    String rtCls = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(thisNode) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(thisNode);
    SNode ice = MapSequence.fromMap(RuntimeUtils.getRuntimeClassifiersMap()).get(rtCls);
    if (ice == null) {
      return null;
    }
    SNode ct = new FunctionType_Behavior.QuotationClass_ksvwin_a0a3a11().createNode(ice);
    if ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getResultType_1230475757059(thisNode))));
    }
    if ((FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode))));
    }
    for (SNode pt : SLinkOperations.getTargets(thisNode, "parameterType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt)));
    }
    for (SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(tt));
    }
    return ct;
  }

  public static SNode call_getDeclarationRuntimeType_811905832257074290(SNode thisNode, List<SNode> parameterType) {
    String rtCls = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(thisNode) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(thisNode);
    SNode ice = MapSequence.fromMap(RuntimeUtils.getRuntimeClassifiersMap()).get(rtCls);
    if (ice == null) {
      return null;
    }
    SNode ct = new FunctionType_Behavior.QuotationClass_ksvwin_a0a3a21().createNode(ice);
    if ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getResultType_1230475757059(thisNode)), true));
    }
    if ((FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode)), true));
    }
    for (SNode pt : parameterType) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt), false));
    }
    for (SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(tt, true));
    }
    return ct;
  }

  public static SNode call_getRuntimeType_1230320203983(SNode thisNode, List<SNode> parameterType) {
    String rtCls = FunctionType_Behavior.call_getRuntimeClassName_1230472987259(thisNode) + "." + FunctionType_Behavior.call_getRuntimeSignature_1213877404927(thisNode);
    SNode ice = MapSequence.fromMap(RuntimeUtils.getRuntimeClassifiersMap()).get(rtCls);
    if (ice == null) {
      return null;
    }
    SNode ct = new FunctionType_Behavior.QuotationClass_ksvwin_a0a3a31().createNode(ice);
    if ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getResultType_1230475757059(thisNode))));
    }
    if ((FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode) != null)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode))));
    }
    for (SNode pt : parameterType) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(ClassifierTypeUtil.getTypeCoercedToClassifierType(pt)));
    }
    for (SNode tt : SLinkOperations.getTargets(thisNode, "throwsType", true)) {
      ListSequence.fromList(SLinkOperations.getTargets(ct, "parameter", true)).addElement(ClassifierTypeUtil.copyTypeRecursively(tt));
    }
    return ct;
  }

  public static SNode call_getNormalizedReturnType_1213877405252(SNode thisNode) {
    return ((FunctionType_Behavior.call_getResultType_1230475757059(thisNode) != null) ?
      ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getResultType_1230475757059(thisNode)) :
      new FunctionType_Behavior.QuotationClass_ksvwin_a0a0a41().createNode()
    );
  }

  public static SNode call_getNormalizedTerminateType_1232036646585(SNode thisNode) {
    return ((FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode) != null) ?
      ClassifierTypeUtil.getTypeCoercedToClassifierType(FunctionType_Behavior.call_getTerminateType_1232032188607(thisNode)) :
      new FunctionType_Behavior.QuotationClass_ksvwin_a0a0a51().createNode()
    );
  }

  public static SNode call_getNormalizedSequenceParameterReturnType_1213877405260(SNode thisNode) {
    {
      IMatchingPattern pattern_ksvwin_a0p = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType");
      SNode coercedNode_ksvwin_a0p = TypeChecker.getInstance().getRuntimeSupport().coerce_(SLinkOperations.getTarget(thisNode, "resultType", true), pattern_ksvwin_a0p);
      if (coercedNode_ksvwin_a0p != null) {
        return ClassifierTypeUtil.getTypeCoercedToClassifierType(SLinkOperations.getTarget(coercedNode_ksvwin_a0p, "elementType", true));
      } else {
      }
    }
    return null;
  }

  public static List<SNode> call_getNormalizedParameterTypes_1213877405276(SNode thisNode) {
    List<SNode> resList = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> paramTypes = SLinkOperations.getTargets(thisNode, "parameterType", true);
    int idx = 0;
    for (SNode p : paramTypes) {
      SNode pct = ClassifierTypeUtil.getTypeCoercedToClassifierType(p);
      ListSequence.fromList(resList).addElement(pct);
      idx++;
    }
    return resList;
  }

  public static String call_getRuntimeSignature_1213877404927(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "virtual_getRuntimeSignature_1213877404927", PARAMETERS_1213877404927);
  }

  public static String call_getRuntimeClassName_1230472987259(SNode thisNode) {
    return (String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "virtual_getRuntimeClassName_1230472987259", PARAMETERS_1230472987259);
  }

  public static SNode call_getResultType_1230475757059(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "virtual_getResultType_1230475757059", PARAMETERS_1230475757059);
  }

  public static SNode call_getTerminateType_1232032188607(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), "virtual_getTerminateType_1232032188607", PARAMETERS_1232032188607);
  }

  public static String callSuper_getRuntimeSignature_1213877404927(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), callerConceptFqName, "virtual_getRuntimeSignature_1213877404927", PARAMETERS_1213877404927);
  }

  public static String callSuper_getRuntimeClassName_1230472987259(SNode thisNode, String callerConceptFqName) {
    return (String) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), callerConceptFqName, "virtual_getRuntimeClassName_1230472987259", PARAMETERS_1230472987259);
  }

  public static SNode callSuper_getResultType_1230475757059(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), callerConceptFqName, "virtual_getResultType_1230475757059", PARAMETERS_1230475757059);
  }

  public static SNode callSuper_getTerminateType_1232032188607(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), callerConceptFqName, "virtual_getTerminateType_1232032188607", PARAMETERS_1232032188607);
  }

  public static class QuotationClass_ksvwin_a0a0c {
    public QuotationClass_ksvwin_a0a0c() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierClassExpression", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ksvwin_a0a0d0h {
    public QuotationClass_ksvwin_a0a0d0h() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#java.lang(java.lang@java_stub)"), SNodeId.fromString("~Object")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ksvwin_a0b0b0i {
    public QuotationClass_ksvwin_a0b0b0i() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ksvwin_a0a3a01 {
    public QuotationClass_ksvwin_a0a3a01() {
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

  public static class QuotationClass_ksvwin_a0a3a11 {
    public QuotationClass_ksvwin_a0a3a11() {
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

  public static class QuotationClass_ksvwin_a0a3a21 {
    public QuotationClass_ksvwin_a0a3a21() {
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

  public static class QuotationClass_ksvwin_a0a3a31 {
    public QuotationClass_ksvwin_a0a3a31() {
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

  public static class QuotationClass_ksvwin_a0a0a41 {
    public QuotationClass_ksvwin_a0a0a41() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_ksvwin_a0a0a51 {
    public QuotationClass_ksvwin_a0a0a51() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VoidType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
