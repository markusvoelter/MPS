package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;

public class OverridingMethods_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder");

  public String getDescription() {
    return "Overriding Methods";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getParent(node) == null || !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    for (SNode classNode : ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder", SNodeOperations.getParent(node), scope, indicator))) {
      Iterable<SNode> methodsOfSameKind;
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration")) {
        methodsOfSameKind = SLinkOperations.getTargets(SNodeOperations.cast(classNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true);
      } else {
        methodsOfSameKind = SLinkOperations.getTargets(SNodeOperations.cast(classNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "staticMethod", true);
      }
      for (SNode sMethod : Sequence.fromIterable(methodsOfSameKind)) {
        if (BaseMethodDeclaration_Behavior.call_hasSameSignature_1213877350435(sMethod, node)) {
          ListSequence.fromList(_results).addElement(sMethod);
        }
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Overriding Methods";
  }
}
