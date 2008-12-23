package jetbrains.mps.lang.structure.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class NodeAndDescendantsUsages_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.lang.structure.findUsages.NodeAndDescendantsUsages_Finder");

  public String getDescription() {
    return "Node & Descendants Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    Set<SNode> nodes = new HashSet<SNode>();
    nodes.add(node);
    for(SNode child : ListSequence.fromList(SNodeOperations.getDescendants(node, null, false))) {
      nodes.add(child);
    }
    // 
    Set<SReference> resRefs = FindUsagesManager.getInstance().findUsages(nodes, scope, new FindUsagesManager.ProgressAdapter(indicator), false);
    for(SReference reference : resRefs) {
      if (!(nodes.contains(reference.getSourceNode()))) {
        ListOperations.addElement(_results, reference.getSourceNode());
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    for(SNode child : ListSequence.fromList(SNodeOperations.getDescendants(node, null, false))) {
      ListOperations.addElement(_results, child);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Node Descendants Usages";
  }

}
