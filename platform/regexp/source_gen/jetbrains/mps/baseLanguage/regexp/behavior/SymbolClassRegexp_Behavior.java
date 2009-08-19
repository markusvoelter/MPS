package jetbrains.mps.baseLanguage.regexp.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SymbolClassRegexp_Behavior {
  private static Class[] PARAMETERS_1222857578599 = {SNode.class ,List.class};

  public static void init(SNode thisNode) {
  }

  public static String virtual_getString_1222432436326(SNode thisNode, List<SNode> vars) {
    return SConceptPropertyOperations.getString(thisNode, "alias") + SymbolClassRegexp_Behavior.call_partsToString_1222859184809(thisNode) + "]";
  }

  public static String call_partsToString_1222859184809(SNode thisNode) {
    return SymbolClassRegexp_Behavior.call_partsToString_1222857748873(thisNode, SLinkOperations.getTargets(thisNode, "part", true));
  }

  public static String call_partsToString_1222857748873(SNode thisNode, List<SNode> parts) {
    StringBuilder result = new StringBuilder();
    for (SNode part : parts) {
      if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart")) {
        SNode cscp = SNodeOperations.cast(part, "jetbrains.mps.baseLanguage.regexp.structure.CharacterSymbolClassPart");
        if (Regexp_Behavior.call_checkStringForUnicode_1222857160881(thisNode, SPropertyOperations.getString(cscp, "character"))) {
          result.append(SPropertyOperations.getString(cscp, "character"));
        } else {
          result.append(Regexp_Behavior.call_quote_1222857178958(thisNode, SPropertyOperations.getString(cscp, "character").charAt(0)));
        }
      } else if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart")) {
        result.append("\\").append(SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(part, "jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassSymbolClassPart"), "declaration", false), "name"));
      } else if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart")) {
        SNode iscp = SNodeOperations.cast(part, "jetbrains.mps.baseLanguage.regexp.structure.IntervalSymbolClassPart");
        String start;
        String end = "";
        if (Regexp_Behavior.call_checkStringForUnicode_1222857160881(thisNode, SPropertyOperations.getString(iscp, "start"))) {
          start = SPropertyOperations.getString(iscp, "start");
          if (Regexp_Behavior.call_checkStringForUnicode_1222857160881(thisNode, SPropertyOperations.getString(iscp, "end"))) {
            end = SPropertyOperations.getString(iscp, "end");
          }
        } else {
          start = Regexp_Behavior.call_quote_1222857178958(thisNode, SPropertyOperations.getString(iscp, "start").charAt(0));
          end = Regexp_Behavior.call_quote_1222857178958(thisNode, SPropertyOperations.getString(iscp, "end").charAt(0));
        }
        result.append(start).append("-").append(end);
      } else if (SNodeOperations.isInstanceOf(part, "jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart")) {
        SNode iscp = SNodeOperations.cast(part, "jetbrains.mps.baseLanguage.regexp.structure.IntersectionSymbolClassPart");
        SNode left = SLinkOperations.getTarget(iscp, "left", true);
        if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp")) {
          SNode tmLeft = SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp");
          result.append(Regexp_Behavior.call_getString_1222432436326(tmLeft, new ArrayList<SNode>()));
        } else if (SNodeOperations.isInstanceOf(left, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassPart")) {
          SNode tmLeft = SNodeOperations.cast(left, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassPart");
          List<SNode> tr = new ArrayList<SNode>();
          ListSequence.fromList(tr).addElement(tmLeft);
          result.append(SymbolClassRegexp_Behavior.call_partsToString_1222857748873(thisNode, tr));
        } else {
          throw new RuntimeException("NOT SUPPORTED: " + part.getClass());
        }
        result.append("&&");
        SNode right = SNodeOperations.cast(SLinkOperations.getTarget(iscp, "left", true), "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexpAndPart");
        if (SNodeOperations.isInstanceOf(right, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp")) {
          SNode tmrRight = SNodeOperations.cast(right, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassPart");
          List<SNode> tr = new ArrayList<SNode>();
          ListSequence.fromList(tr).addElement(tmrRight);
          result.append(SymbolClassRegexp_Behavior.call_partsToString_1222857748873(thisNode, tr));
        } else {
          throw new RuntimeException("NOT SUPPORTED: " + part.getClass());
        }
      } else {
        throw new RuntimeException("NOT SUPPORTED: " + part.getClass());
      }
    }
    return result.toString();
  }

  public static String call_getString_1222857578599(SNode thisNode, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), "virtual_getString_1222432436326", PARAMETERS_1222857578599, vars);
  }

  public static String callSuper_getString_1222857578599(SNode thisNode, String callerConceptFqName, List<SNode> vars) {
    return (String)BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp"), callerConceptFqName, "virtual_getString_1222432436326", PARAMETERS_1222857578599, vars);
  }
}
