package jetbrains.mps.baseLanguage.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.behavior.FunctionType_Behavior;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.*;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.JavaNameUtil;

import java.util.*;

public class ClosureLiteralUtil {
  public static boolean hasYieldStatement(SNode cl) {
    for (SNode desc : SNodeOperations.getDescendants(cl, "jetbrains.mps.baseLanguage.closures.structure.YieldStatement", false, new String[]{})) {
      if (cl == SNodeOperations.getAncestorWhereConceptInList(desc, new String[]{"jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", "jetbrains.mps.baseLanguage.structure.IStatementListContainer", "jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock"}, false, false)) {
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

  public static SNode fillParams(SNode ctNoParams, SNode ft) {
    Map<SNode, SNode> map = null;
    List<SNode> imds = SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "method", true);
    if (ListSequence.fromList(imds).count() > 0) {
      SNode method = ListSequence.fromList(imds).getElement(0);
      if ((SLinkOperations.getTarget(method, "returnType", true) != null) && !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"))) {
        map = matchReturnType(SLinkOperations.getTarget(method, "returnType", true), FunctionType_Behavior.call_getNormalizedReturnType_1213877405252(ft), map);
      }
      List<SNode> ptypes = FunctionType_Behavior.call_getNormalizedParameterTypes_1213877405276(ft);
      int idx = 0;
      for (SNode pd : SLinkOperations.getTargets(method, "parameter", true)) {
        map = matchType(SLinkOperations.getTarget(pd, "type", true), ListSequence.fromList(ptypes).getElement(idx), map);
        idx++;
      }
    }
    SNode ctWithParams = SNodeOperations.copyNode(ctNoParams);
    if (map != null) {
      for (SNode tvd : SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "typeVariableDeclaration", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(ctWithParams, "parameter", true)).addElement(SNodeOperations.cast(MapSequence.fromMap(map).get(tvd), "jetbrains.mps.baseLanguage.structure.Type"));
      }
    }
    return ctWithParams;
  }

  public static void addAdaptableClosureLiteralTarget(TemplateQueryContext genContext, SNode literal, SNode target) {
    SNode trgCopy = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
    SLinkOperations.setTarget(trgCopy, "classifier", SLinkOperations.getTarget(target, "classifier", false), false);
    matchParameters(genContext, target, trgCopy, SNodeOperations.cast(TypeChecker.getInstance().getTypeOf(literal), "jetbrains.mps.baseLanguage.closures.structure.FunctionType"), literal);
    Values.LITERAL.set(genContext, trgCopy, literal);
    Values.LITERAL_TARGET.set(genContext, literal, trgCopy);
  }

  private static void matchParameters(TemplateQueryContext genContext, SNode origCT, SNode ctNoParams, SNode ft, SNode literal) {
    Map<SNode, SNode> map = null;
    List<SNode> imds = SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "method", true);
    SNode absRetCT = null;
    List<SNode> meths = ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "method", true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode m) {
        return !("equals".equals(SPropertyOperations.getString(m, "name"))) && SPropertyOperations.getBoolean(m, "isAbstract");
      }
    }).toListSequence();
    if (ListSequence.fromList(meths).count() > 0) {
      if (ListSequence.fromList(meths).count() > 1) {
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
    Values.TYPE_MAP.set(genContext, ctNoParams, map);
    if ((absRetCT != null)) {
      SNode ftResCT = FunctionTypeUtil.unmeet(FunctionType_Behavior.call_getNormalizedReturnType_1213877405252(ft));
      String adapterName = JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(absRetCT, "classifier", false), "name")) + JavaNameUtil.shortName(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.as(FunctionTypeUtil.unbound(ftResCT), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "name")) + "Adapter";
      for (SNode cls : SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(absRetCT, "classifier", false)), "jetbrains.mps.baseLanguage.structure.Classifier")) {
        if (adapterName.equals(JavaNameUtil.shortName(SPropertyOperations.getString(cls, "name")))) {
          SNode newRetCT = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ClassifierType", null);
          SLinkOperations.setTarget(newRetCT, "classifier", cls, false);
          /*
            for (SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(absRetCT, "classifier", false), "typeVariableDeclaration", true)) {
              ListSequence.fromList(SLinkOperations.getTargets(newRetCT, "parameter", true)).addElement(MapSequence.fromMap(map).get(SPropertyOperations.getString(tvar, "name")));
            }
          */
          Values.RETURN_TYPE.set(genContext, ctNoParams, newRetCT);
          break;
        }
      }
    }
    /*
      for (SNode tvar : SLinkOperations.getTargets(SLinkOperations.getTarget(ctNoParams, "classifier", false), "typeVariableDeclaration", true)) {
        ListSequence.fromList(SLinkOperations.getTargets(ctNoParams, "parameter", true)).addElement(MapSequence.fromMap(map).get(SPropertyOperations.getString(tvar, "name")));
      }
    */
    List<SNode> varDecls = SLinkOperations.getTargets(SLinkOperations.getTarget(origCT, "classifier", false), "typeVariableDeclaration", true);
    int idx = 0;
    for (SNode p : SLinkOperations.getTargets(origCT, "parameter", true)) {
      List<SNode> queue = ListSequence.fromListAndArray(new LinkedList<SNode>(), ListSequence.fromList(SLinkOperations.getTargets(ctNoParams, "parameter", true)).addElement(SNodeOperations.copyNode(p)));
      while (!(ListSequence.fromList(queue).isEmpty())) {
        SNode n = ListSequence.fromList(queue).removeElementAt(0);
        if (SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
          if (idx < ListSequence.fromList(varDecls).count() && map != null && MapSequence.fromMap(map).containsKey(ListSequence.fromList(varDecls).getElement(idx))) {
            n = SNodeOperations.replaceWithAnother(n, (map != null ?
              MapSequence.fromMap(map).get(ListSequence.fromList(varDecls).getElement(idx)) :
              null
            ));
          }
        } else {
          if (n != null && (SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.UpperBoundType") || SNodeOperations.isInstanceOf(n, "jetbrains.mps.baseLanguage.structure.LowerBoundType"))) {
            ListSequence.fromList(queue).addSequence(ListSequence.fromList(SNodeOperations.getChildren(n)));
          }
        }
      }
      idx++;
    }
  }

  public static Map<SNode, SNode> matchReturnType(SNode absType, SNode realType, Map<SNode, SNode> map) {
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
      return SLinkOperations.getTarget(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) == SLinkOperations.getTarget(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false) && ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).count() == ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true)).count();
    }
    return false;
  }

  private static Map<SNode, SNode> matchType(SNode absType, SNode realType, Map<SNode, SNode> map) {
    SNode matched = null;
    if (SNodeOperations.isInstanceOf(realType, "jetbrains.mps.lang.typesystem.structure.MeetType")) {
      matched = whichTypeMatching(SLinkOperations.getTargets(SNodeOperations.cast(realType, "jetbrains.mps.lang.typesystem.structure.MeetType"), "argument", true), absType);
    } else if (isTypeMatching(realType, absType)) {
      matched = realType;
    }
    if ((matched != null)) {
      if (SNodeOperations.isInstanceOf(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference")) {
        MapSequence.fromMap((map = getMap(map))).put(SLinkOperations.getTarget(SNodeOperations.cast(absType, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false), SNodeOperations.copyNode(matched));
      } else {
        int idx = 0;
        List<SNode> mptypes = SLinkOperations.getTargets(SNodeOperations.as(absType, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        List<SNode> rptypes = SLinkOperations.getTargets(SNodeOperations.as(matched, "jetbrains.mps.baseLanguage.structure.ClassifierType"), "parameter", true);
        for (int i = 0; i < ListSequence.fromList(mptypes).count() && i < ListSequence.fromList(rptypes).count(); i++) {
          map = matchType(ListSequence.fromList(mptypes).getElement(i), ListSequence.fromList(rptypes).getElement(i), map);
        }
      }
    }
    return map;
  }

  private static Map<SNode, SNode> getMap(Map<SNode, SNode> map) {
    if (map == null) {
      map = MapSequence.fromMap(new HashMap<SNode, SNode>());
    }
    return map;
  }
}
