package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;

public class DerivedClasses_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder");

  public String getDescription() {
    return "Derived Classes";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> derived = ListOperations.<SNode>createList();
    ListSequence.fromList(derived).addElement((SNode)node);
    // 
    int passed = 0;
    while (ListSequence.fromList(derived).count() != passed) {
      SNode passingNode = ListSequence.fromList(derived).getElement(passed);
      for(SNode classNode : FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.StraightDerivedClasses_Finder", passingNode, scope, indicator)) {
        ListSequence.fromList(derived).addElement(classNode);
      }
      if (passingNode != node) {
        ListOperations.addElement(_results, passingNode);
      }
      passed = passed + 1;
    }
  }

  public String getNodeCategory(SNode node) {
    return "Derived Classes";
  }

}
