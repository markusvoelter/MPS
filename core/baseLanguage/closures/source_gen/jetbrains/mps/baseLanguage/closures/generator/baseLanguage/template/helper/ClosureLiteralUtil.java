package jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import java.util.Map;
import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import java.util.HashMap;

public class ClosureLiteralUtil {
  public static boolean hasYieldStatement(SNode cl) {
    for (SNode desc : SNodeOperations.getDescendants(cl, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement", false, new String[]{})) {
      if (cl == SNodeOperations.getAncestorWhereConceptInList(desc, new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral","jetbrains.mps.baseLanguage.structure.IStatementListContainer","jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock"}, false, false)) {
        return true;
      }
    }
    return false;
  }

  public static List<SNode> collectNonFinalVariableDeclarations(SNode cl) {
    List<SNode> vrefs = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode desc : SNodeOperations.getDescendants(cl, null, false, new String[]{})) {
      if (SNodeOperations.isInstanceOf(desc, "jetbrains.mps.baseLanguage.structure.VariableReference") && cl == SNodeOperations.getAncestor(desc, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)) {
        SNode vd = SLinkOperations.getTarget(SNodeOperations.cast(desc, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false);
        if (cl != SNodeOperations.getAncestor(vd, "jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", false, false)) {
          if (!(SPropertyOperations.getBoolean(vd, "isFinal")) && (SNodeOperations.isInstanceOf(vd, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration") || SNodeOperations.isInstanceOf(vd, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration"))) {
            ListSequence.fromList(vrefs).addElement(SLinkOperations.getTarget(SNodeOperations.cast(desc, "jetbrains.mps.baseLanguage.structure.VariableReference"), "variableDeclaration", false));
          }
        }
      }
    }
    return vrefs;
  }

  public static void addAdaptableClosureLiteralTarget(TemplateQueryContext genContext, SNode literal, SNode target) {
    SNode trgCopy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(trgCopy, "classifier", SLinkOperations.getTarget(target, "classifier", false), false);
    matchParameters(genContext, target, trgCopy, SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(literal), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), literal);
    Values.LITERAL.set(trgCopy, literal);
    Values.LITERAL_TARGET.set(literal, trgCopy);
  }

  private static void matchParameters(TemplateQueryContext genContext, SNode origCT, SNode ctNoParams, SNode ft, SNode literal) {
    Map<String, SNode> map = null;
    List<SNode> imds = SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "method", true);
    SNode absRetCT = null;
    if (ListSequence.fromList(imds).count() > 0) {
      if (ListSequence.fromList(imds).count() != 1) {
        genContext.showWarningMessage(literal, "The adaptation target interface has more than one method");
      }
      SNode method = ListSequence.fromList(imds).getElement(0);
      if ((SLinkOperations.getTarget(method, "returnType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
        /*
          map = matchType(SLinkOperations.getTarget(method, "returnType", true), FunctionType_Behavior.call_getNormalizedReturnType_1213877405252(ft), map);
        */
        map = matchReturnType(SLinkOperations.getTarget(method, "returnType", true), FunctionType_Behavior.call_getNormalizedReturnType_1213877405252(ft), map);
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
          absRetCT = SNodeOperations.copyNode(SNodeOperations.cast(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"));
        }
      }
      List<SNode> ptypes = FunctionType_Behavior.call_getNormalizedParameterTypes_1213877405276(ft);
      int idx = 0;
      for (SNode pd : SLinkOperations.getTargets(method, "parameter", true)) {
        if (idx >= ListSequence.fromList(ptypes).count()) {
          genContext.showErrorMessage(literal, "Closure parameters count doesn't match method '" + SPropertyOperations.getString(method, "name") + "' in " + JavaNameUtil.fqClassName(SLinkOperations.getTarget(ctNoParams, "classifier", false), SPropertyOperations.getString(SLinkOperations.getTarget(ctNoParams, "classifier", false), "name")));
          return;
        }
        map = matchType(SLinkOperations.getTarget(pd, "type", true), ListSequence.fromList(ptypes).getElement(idx), map);
        idx++;
      }
    }
    Values.TYPE_MAP.set(ctNoParams, map);
    if ((absRetCT != null)) {
      SNode ftResCT = SNodeOperations.cast(FunctionTypeUtil.unmeet(FunctionType_Behavior.call_getNormalizedReturnType_1213877405252(ft)), "jetbrains.mps.baseLanguage.structure.ClassifierType");
      /*
        if (SLinkOperations.getTarget(ftResCT, "classifier", false) == SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "classifier", false)) {
          SLinkOperations.setTarget(ftResCT, "classifier", SLinkOperations.getTarget(new _Quotations.QuotationClass_1().createNode(), "classifier", false), false);
        }
      */
      String adapterName = JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(absRetCT, "classifier", false), "name")) + JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(ftResCT, "classifier", false), "name")) + "Adapter";
      for (SNode cls : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(absRetCT, "classifier", false)), "jetbrains.mps.baseLanguage.structure.Classifier")) {
        if (adapterName.equals(JavaNameUtil.shortName(SPropertyOperations.getString(cls, "name")))) {
          SNode newRetCT = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
          SLinkOperations.setTarget(newRetCT, "classifier", cls, false);
          /*
            for (SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(absRetCT, "classifier", false), "typeVariableDeclaration", true)) {
              SLinkOperations.addChild(newRetCT, "parameter", MapSequence.fromMap(map).get(SPropertyOperations.getString(tvar, "name")));
            }
          */
          Values.RETURN_TYPE.set(ctNoParams, newRetCT);
          break;
        }
      }
    }
    /*
      for (SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "typeVariableDeclaration", true)) {
        SLinkOperations.addChild(ctNoParams, "parameter", MapSequence.fromMap(map).get(SPropertyOperations.getString(tvar, "name")));
      }
    */
    List<SNode> varDecls = SLinkOperations.getTargets(SLinkOperations.getTarget(origCT, "classifier", false), "typeVariableDeclaration", true);
    int idx = 0;
    for (SNode p : SLinkOperations.getTargets(origCT, "parameter", true)) {
      if (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.LowerBoundType")) {
        p = (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.UpperBoundType") ?
          SLinkOperations.getTarget(SNodeOperations.cast(p, "jetbrains.mps.baseLanguage.structure.UpperBoundType"), "bound", true) :
          SLinkOperations.getTarget(SNodeOperations.cast(p, "jetbrains.mps.baseLanguage.structure.LowerBoundType"), "bound", true)
        );
      }
      if (SNodeOperations.isInstanceOf(p, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        if (idx < ListSequence.fromList(varDecls).count()) {
          SNode tvd = ListSequence.fromList(varDecls).getElement(idx);
          SLinkOperations.addChild(ctNoParams, "parameter", (map != null ?
            MapSequence.fromMap(map).get(SPropertyOperations.getString(tvd, "name")) :
            null
          ));
        }
      } else {
        SLinkOperations.addChild(ctNoParams, "parameter", SNodeOperations.copyNode(p));
      }
      idx++;
    }
  }

  public static Map<String, SNode> matchReturnType(SNode absType, SNode realType, Map<String, SNode> map) {
    Set<String> visited = SetSequence.fromSet(new HashSet<String>());
    List<SNode> queue = new ArrayList<SNode>();
    if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      for (SNode arg : SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true)) {
        ListSequence.fromList(queue).addElement(arg);
      }
    } else {
      ListSequence.fromList(queue).addElement(realType);
    }
    /*
      ListSequence.fromList(queue).addElement(absType);
    */
    while (!(ListSequence.fromList(queue).isEmpty())) {
      SNode candidate = ListSequence.fromList(queue).removeElementAt(0);
      if (!(SetSequence.fromSet(visited).contains(BaseConcept_Behavior.call_getPresentation_1213877396640(candidate)))) {
        /*
          SNode matched = null;
        */
        /*
          if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
            matched = whichTypeMatching(SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true), candidate);
          } else if (isTypeMatching(realType, candidate)) {
            matched = realType;
          }
        */
        /*
          if ((matched != null)) {
            map = matchType(candidate, matched, map);
            return map;
          }
        */
        if (isTypeMatching(absType, candidate)) {
          map = matchType(absType, candidate, map);
          return map;
        }
        SetSequence.fromSet(visited).addElement(BaseConcept_Behavior.call_getPresentation_1213877396640(candidate));
        for (SNode superType : TypeChecker.getInstance().getSubtypingManager().collectImmediateSupertypes(candidate)) {
          ListSequence.fromList(queue).addElement(superType);
        }
      }
    }
    return map;
  }

  private static SNode whichTypeMatching(List<SNode> leftList, SNode right) {
    for (SNode left : leftList) {
      if (isTypeMatching(left, right)) {
        return left;
      }
    }
    return null;
  }

  private static boolean isTypeMatching(SNode left, SNode right) {
    if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.VoidType") || SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguage.structure.VoidType")) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguage.structure.TypeVariableReference") || SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
      return true;
    }
    if (SNodeOperations.getConceptDeclaration(left) == SNodeOperations.getConceptDeclaration(right)) {
      if (!(SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
        return true;
      }
      return SLinkOperations.getTarget(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SLinkOperations.getTarget(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) && SLinkOperations.getCount(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter") == SLinkOperations.getCount(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter");
    }
    return false;
  }

  private static Map<String, SNode> matchType(SNode absType, SNode realType, Map<String, SNode> map) {
    SNode matched = null;
    if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      matched = whichTypeMatching(SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true), absType);
    } else if (isTypeMatching(realType, absType)) {
      matched = realType;
    }
    if ((matched != null)) {
      if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        MapSequence.fromMap((map = getMap(map))).put(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false), "name"), SNodeOperations.copyNode(matched));
      } else {
        int idx = 0;
        List<SNode> mptypes = SLinkOperations.getTargets(SNodeOperations.as(absType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        List<SNode> rptypes = SLinkOperations.getTargets(SNodeOperations.as(matched, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        for (int i = 0; i < ListSequence.fromList(mptypes).count() && i < ListSequence.fromList(rptypes).count(); i++) {
          map = matchType(ListSequence.fromList(mptypes).getElement(i), ListSequence.fromList(rptypes).getElement(i), getMap(map));
        }
      }
    }
    return map;
  }

  private static Map<String, SNode> getMap(Map<String, SNode> map) {
    if (map == null) {
      map = MapSequence.fromMap(new HashMap<String, SNode>());
    }
    return map;
  }
}
