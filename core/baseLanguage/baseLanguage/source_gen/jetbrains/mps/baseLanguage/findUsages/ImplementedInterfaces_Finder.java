package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import java.util.ArrayList;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ImplementedInterfaces_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ImplementedInterfaces_Finder");

  public String getDescription() {
    return "Implemented Interfaces";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> classNodes = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder", node, scope, indicator);
    ListSequence.fromList(classNodes).addElement(node);
    for (SNode classNode : ListSequence.fromList(classNodes)) {
      for (SNode implementedInterface : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(classNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "implementedInterface", true))) {
        SNode interfaceNode = (SNode) SLinkOperations.getTarget(implementedInterface, "classifier", false);
        ListSequence.fromList(result).addElement(interfaceNode);
        ListSequence.fromList(result).addSequence(ListSequence.fromList((List<SNode>) FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder", interfaceNode, scope, indicator)));
      }
    }
    for (SNode interfaceNode : ListSequence.fromList(result)) {
      ListSequence.fromList(_results).addElement(interfaceNode);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Implemented Interfaces";
  }
}
