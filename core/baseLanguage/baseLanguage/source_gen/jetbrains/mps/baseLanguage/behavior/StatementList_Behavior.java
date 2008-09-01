package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.dataFlow.DataFlow;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.util.ArrayList;
import java.util.HashSet;

public class StatementList_Behavior {

  public static void init(SNode thisNode) {
  }

  public static void call_checkDataFlow_1213877327382(SNode thisNode) {
    StatementList_Behavior.call_checkUnreachable_1213877327433(thisNode);
    StatementList_Behavior.call_checkUninitializedReads_1213877327450(thisNode);
    StatementList_Behavior.call_checkUnusedAssignments_1213877327497(thisNode);
    StatementList_Behavior.call_checkUnusedVariables_1216892728097(thisNode);
  }

  public static void call_checkReturns_1213877327397(SNode thisNode) {
    Set<SNode> expectedReturns = DataFlow.getExpectedReturns(thisNode);
    for(SNode n : expectedReturns) {
      if (n != null) {
        SNode nodeToSelect;
        SNode sl = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
        if ((sl != null) && ((StatementList)SNodeOperations.getAdapter(sl)).getStatementsCount() > 0) {
          SNodeOperations.getAncestor(nodeToSelect = n, "jetbrains.mps.baseLanguage.structure.Statement", true, false);
        } else
        {
          nodeToSelect = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.StatementList", false, false);
        }
        if (nodeToSelect != null) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(nodeToSelect, "Return expected", "jetbrains.mps.baseLanguage.behavior@3_0", "1215433086400", intentionProvider);
          }
        } else
        {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportTypeError(n, "Return expected", "jetbrains.mps.baseLanguage.behavior@3_0", "1215433086408", intentionProvider);
          }
        }
      }
    }
  }

  public static void call_checkUnreachable_1213877327433(SNode thisNode) {
    Set<SNode> unreachable = DataFlow.getUnreachableNodes(thisNode);
    for(SNode n : unreachable) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(n, "Unreachable node", "jetbrains.mps.baseLanguage.behavior@3_0", "1213877327444", intentionProvider);
      }
    }
  }

  public static void call_checkUninitializedReads_1213877327450(SNode thisNode) {
    Set<SNode> uninitializedReads = DataFlow.getUninitializedReads(thisNode);
    List<SNode> referencedInClosures = StatementList_Behavior.call_getVariablesReferencedInClosures_1213877327584(thisNode);
    for(SNode read : uninitializedReads) {
      if (SNodeOperations.isInstanceOf(read, "jetbrains.mps.baseLanguage.structure.LocalVariableReference")) {
        SNode ref = read;
        if (ListSequence.fromList(referencedInClosures).contains(SLinkOperations.getTarget(ref, "variableDeclaration", false)) || VariableReference_Behavior.call_isClosureReference_1213877348225(ref)) {
          continue;
        }
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(read, "Variable used before it is initialized", "jetbrains.mps.baseLanguage.behavior@3_0", "1213877327487", intentionProvider);
        }
      }
    }
  }

  public static void call_checkUnusedAssignments_1213877327497(SNode thisNode) {
    Set<SNode> unusedAssignments = DataFlow.getUnusedAssignments(thisNode);
    List<SNode> referencedInClosure = StatementList_Behavior.call_getVariablesReferencedInClosures_1213877327584(thisNode);
    for(SNode write : unusedAssignments) {
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression")) {
        SNode assignment = write;
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.ParameterReference")) {
          SNode ref = SLinkOperations.getTarget(assignment, "lValue", true);
          if (ListSequence.fromList(referencedInClosure).contains(SLinkOperations.getTarget(ref, "variableDeclaration", false)) || VariableReference_Behavior.call_isClosureReference_1213877348225(ref)) {
            continue;
          }
          {
            BaseIntentionProvider intentionProvider = null;
            intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.constraints.RemoveUnusedAssignment_QuickFix");
            TypeChecker.getInstance().reportWarning(assignment, "Unused assignment", "jetbrains.mps.baseLanguage.behavior", "1213877327543", intentionProvider);
          }
        }
      }
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
        if (ListSequence.fromList(referencedInClosure).contains(write)) {
          continue;
        }
        {
          BaseIntentionProvider intentionProvider = null;
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.constraints.RemoveUnusedAssignment_QuickFix");
          TypeChecker.getInstance().reportWarning(write, "Unused assignment", "jetbrains.mps.baseLanguage.behavior", "1213877327573", intentionProvider);
        }
      }
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")) {
        SNode method = ((SNode)SNodeOperations.getParent(write));
        if (SPropertyOperations.getBoolean(method, "isFinal") || SNodeOperations.isInstanceOf(method, "jetbrains.mps.baseLanguage.structure.Visible") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(((SNode)method), "visibility", true), "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
          {
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().reportWarning(write, "Unused parameter", "jetbrains.mps.baseLanguage.behavior", "1220266223599", intentionProvider);
          }
        }
      }
    }
  }

  public static void call_checkUnusedVariables_1216892728097(SNode thisNode) {
    Set<SNode> unusedVariables = DataFlow.getUnusedVariables(thisNode);
    for(SNode var : unusedVariables) {
      if (!(SNodeOperations.isInstanceOf(SNodeOperations.getParent(var), "jetbrains.mps.baseLanguage.structure.CatchClause"))) {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportWarning(var, "Unused variable", "jetbrains.mps.baseLanguage.behavior", "1220012814436", intentionProvider);
        }
      }
    }
  }

  public static List<SNode> call_getVariablesReferencedInClosures_1213877327584(SNode thisNode) {
    List<SNode> referencedInClosures = new ArrayList<SNode>();
    for(SNode varRef : SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.VariableReference", false)) {
      SNode closure = SNodeOperations.getAncestor(varRef, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
      if ((closure != null) && closure != SNodeOperations.getParent(thisNode)) {
        ListSequence.fromList(referencedInClosures).addElement(SLinkOperations.getTarget(varRef, "variableDeclaration", false));
      }
    }
    return referencedInClosures;
  }

  public static Set<SNode> call_getExternalVariablesDeclarations_1214501165480(SNode thisNode) {
    HashSet<SNode> declarations = new HashSet<SNode>();
    for(SNode ref : SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.LocalVariableReference", false)) {
      boolean statementsContainsVar = false;
      for(SNode parent : SNodeOperations.getAncestors(SLinkOperations.getTarget(ref, "variableDeclaration", false), null, false)) {
        if (parent == thisNode) {
          statementsContainsVar = true;
        }
      }
      if (!(statementsContainsVar)) {
        declarations.add(SLinkOperations.getTarget(ref, "variableDeclaration", false));
      }
    }
    return declarations;
  }

}
