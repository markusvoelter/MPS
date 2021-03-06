package jetbrains.mps.lang.editor.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class DefaultBaseLine_Behavior {
  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isApplicableTo_1214304723440(SNode thisNode, SNode cellModel) {
    {
      SNode matchedNode_q0zywl_a0a = cellModel;
      {
        boolean matches_q0zywl_a0a0 = false;
        {
          SNode matchingNode_q0zywl_a0a0 = cellModel;
          if (matchingNode_q0zywl_a0a0 != null) {
            matches_q0zywl_a0a0 = SModelUtil_new.isAssignableConcept(matchingNode_q0zywl_a0a0.getConceptFqName(), "jetbrains.mps.lang.editor.structure.CellModel_RefNodeList");
          }
        }
        if (matches_q0zywl_a0a0) {
          return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_q0zywl_a0a, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical") || (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_q0zywl_a0a, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Table"));
        } else {
          boolean matches_q0zywl_b0a0 = false;
          {
            SNode matchingNode_q0zywl_b0a0 = cellModel;
            if (matchingNode_q0zywl_b0a0 != null) {
              matches_q0zywl_b0a0 = SModelUtil_new.isAssignableConcept(matchingNode_q0zywl_b0a0.getConceptFqName(), "jetbrains.mps.lang.editor.structure.CellModel_Collection");
            }
          }
          if (matches_q0zywl_b0a0) {
            return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_q0zywl_a0a, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Vertical") || (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(matchedNode_q0zywl_a0a, "cellLayout", true), "jetbrains.mps.lang.editor.structure.CellLayout_Table"));
          } else
          return false;
        }
      }
    }
  }
}
