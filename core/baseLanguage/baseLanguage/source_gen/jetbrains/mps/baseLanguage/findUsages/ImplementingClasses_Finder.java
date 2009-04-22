package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;
import com.intellij.openapi.progress.EmptyProgressIndicator;

public class ImplementingClasses_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder");

  public String getDescription() {
    return "Implementing Classes";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> derivedInterfaces = FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder", node, scope, indicator);
    ListSequence.fromList(derivedInterfaces).addElement(node);
    // 
    List<SNode> derivedInterfacesUsages = ;
    for(SNode derivedInterface : derivedInterfaces) {
      ListSequence.fromList(derivedInterfacesUsages).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.lang.structure.findUsages.NodeUsages_Finder", derivedInterface, scope, indicator)));
    }
    // 
    for(SNode interfaceNode : derivedInterfacesUsages) {
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(interfaceNode), "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
        if (SNodeOperations.hasRole(interfaceNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", "implementedInterface")) {
          ListOperations.addElement(_results, SNodeOperations.getParent(interfaceNode));
          for(SNode classNode : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder", SNodeOperations.getParent(interfaceNode), scope, indicator))) {
            ListOperations.addElement(_results, classNode);
          }
        }
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
    for(SNode derivedInterface : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder", node, scope, new EmptyProgressIndicator()))) {
      ListOperations.addElement(_results, derivedInterface);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Implementing Classes";
  }

}
