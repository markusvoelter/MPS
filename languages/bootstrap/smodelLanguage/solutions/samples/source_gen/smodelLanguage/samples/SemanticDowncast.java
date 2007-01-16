package smodelLanguage.samples;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import java.util.List;

public class SemanticDowncast {

  public void invoke_getID_method_1(SNode ifStatement) {
    String id_verbose = ((SNode)ifStatement).getId();
    String id_briefly = ifStatement.getId();
  }
  public void invoke_getID_method_2(SNode ifStatement) {
    String id_verbose = ((SNode)((SNode)SLinkOperations.getTarget(ifStatement, "condition", true))).getId();
    String id_briefly = SLinkOperations.getTarget(ifStatement, "condition", true).getId();
  }
  public void countChildren(SNode methodCall) {
    int count_verbose_not_efficient = ((List<SNode>)SLinkOperations.getTargets(methodCall, "actualArgument", true)).size();
    int count_not_efficient = SLinkOperations.getTargets(methodCall, "actualArgument", true).size();
    int count_best = SLinkOperations.getCount(methodCall, "actualArgument");
  }
}
