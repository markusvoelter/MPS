package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.dataFlow.DataFlow;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;

public class StatementList_Behavior {

  public static void init(SNode thisNode) {
  }

  public static void call_checkDataFlow_1213877327382(SNode thisNode) {
    StatementList_Behavior.call_checkUnreachable_1213877327433(thisNode);
    StatementList_Behavior.call_checkUninitializedReads_1213877327450(thisNode);
    StatementList_Behavior.call_checkUnusedAssignments_1213877327497(thisNode);
  }

  public static void call_checkReturns_1213877327397(SNode thisNode) {
    Set<SNode> expectedReturns = DataFlow.getExpectedReturns(thisNode);
    for(SNode n : expectedReturns) {
      SNode statement = SNodeOperations.getAncestor(n, "jetbrains.mps.baseLanguage.structure.Statement", true, false);
      if (statement != null) {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(statement, "Return expected", "jetbrains.mps.baseLanguage.behavior", "1213877327419", intentionProvider);
        }
      } else
      {
        {
          BaseIntentionProvider intentionProvider = null;
          TypeChecker.getInstance().reportTypeError(n, "Return expected", "jetbrains.mps.baseLanguage.behavior", "1213877327427", intentionProvider);
        }
      }
    }
  }

  public static void call_checkUnreachable_1213877327433(SNode thisNode) {
    Set<SNode> unreachable = DataFlow.getUnreachableNodes(thisNode);
    for(SNode n : unreachable) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(n, "Unreachable node", "jetbrains.mps.baseLanguage.behavior", "1213877327444", intentionProvider);
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
          TypeChecker.getInstance().reportTypeError(read, "Variable used before it is initialized", "jetbrains.mps.baseLanguage.behavior", "1213877327487", intentionProvider);
        }
      }
    }
  }

  public static void call_checkUnusedAssignments_1213877327497(SNode thisNode) {
    Set<SNode> unusedAssignments = DataFlow.getUnusedAssignments(thisNode);
    List<SNode> referencedInClosure = StatementList_Behavior.call_getVariablesReferencedInClosures_1213877327584(thisNode);
    for(SNode write : unusedAssignments) {
      if (SNodeOperations.isInstanceOf(write, "jetbrains.mps.baseLanguage.structure.AssignmentExpression")) {
        SNode assignment = write;
        if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.LocalVariableReference") || SNodeOperations.isInstanceOf(SLinkOperations.getTarget(assignment, "lValue", true), "jetbrains.mps.baseLanguage.structure.ParameterReference")) {
          SNode ref = SLinkOperations.getTarget(assignment, "lValue", true);
          if (ListSequence.fromList(referencedInClosure).contains(SLinkOperations.getTarget(ref, "variableDeclaration", false)) || VariableReference_Behavior.call_isClosureReference_1213877348225(ref)) {
            continue;
          }
          {
            BaseIntentionProvider intentionProvider = null;
            intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.constraints.RemoveUnusedAssignment_Intention");
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
          intentionProvider = new BaseIntentionProvider("jetbrains.mps.baseLanguage.constraints.RemoveUnusedAssignment_Intention");
          TypeChecker.getInstance().reportWarning(write, "Unused assignment", "jetbrains.mps.baseLanguage.behavior", "1213877327573", intentionProvider);
        }
      }
    }
  }

  public static List<SNode> call_getVariablesReferencedInClosures_1213877327584(SNode thisNode) {
    List<SNode> referencedInClosures = new ArrayList<SNode>();
    for(SNode varRef : SNodeOperations.getDescendants(thisNode, "jetbrains.mps.baseLanguage.structure.VariableReference", false)) {
      SNode closure = SNodeOperations.getAncestor(varRef, "jetbrains.mps.baseLanguage.structure.Closure", false, false);
      if ((closure != null) && closure != SNodeOperations.getParent(thisNode, null, false, false)) {
        ListSequence.fromList(referencedInClosures).addElement(SLinkOperations.getTarget(varRef, "variableDeclaration", false));
      }
    }
    return referencedInClosures;
  }

}
