package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CopySrcListMacro_Behavior {

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getInputNodeTypeInsideOfMacro_1213877290799(SNode thisNode) {
    SNode queryType = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(thisNode, "sourceNodesQuery", true));
    {
      Pattern_0 pattern_0 = new Pattern_0();
      SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(queryType, pattern_0);
      if (coercedNode_0 != null) {
        return pattern_0.PatternVar0;
      } else
      {
      }
    }
    return null;
  }

}
