package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public String getDescription() {
    return "Derived Interfaces";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> derived = new ArrayList<SNode>();
    ListSequence.fromList(derived).addElement(node);
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    int passed = 0;
    while (ListSequence.fromList(derived).count() != passed) {
      SNode passingNode = ListSequence.fromList(derived).getElement(passed);
      for (SNode nodeUsage : FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", passingNode, scope, indicator)) {
        if (SNodeOperations.hasRole(nodeUsage, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface")) {
          ListSequence.fromList(derived).addElement(SNodeOperations.cast(SNodeOperations.getParent(nodeUsage), "jetbrains.mps.baseLanguage.structure.Interface"));
        }
      }
      if (passingNode != node) {
        ListSequence.fromList(_results).addElement(passingNode);
      }
      passed++;
    }
  }

  public String getNodeCategory(SNode node) {
    return "Derived Interfaces";
  }
}
