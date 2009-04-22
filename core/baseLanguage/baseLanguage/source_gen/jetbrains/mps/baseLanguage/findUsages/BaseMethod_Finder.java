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
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class BaseMethod_Finder extends GeneratedFinder {
  private static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.BaseMethod_Finder");

  public String getDescription() {
    return "Base Methods";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null && SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Interface", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    List<SNode> allAncestors = ;
    SNode method = node;
    boolean isStatic = SNodeOperations.isInstanceOf(method, "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration");
    SNode classNode = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    SNode interfaceNode = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Interface", false, false);
    if (classNode != null) {
      ListSequence.fromList(allAncestors).addElement(classNode);
      ListSequence.fromList(allAncestors).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder", classNode, scope, indicator)));
      ListSequence.fromList(allAncestors).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.ImplementedInterfaces_Finder", classNode, scope, indicator)));
    } else if (interfaceNode != null) {
      ListSequence.fromList(allAncestors).addElement(interfaceNode);
      ListSequence.fromList(allAncestors).addSequence(ListSequence.fromList(FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.InterfaceAncestors_Finder", interfaceNode, scope, indicator)));
    }
    Set<SNode> results = SetSequence.fromSet(new HashSet<SNode>());
    for(SNode ancestor : ListSequence.fromList(allAncestors)) {
      List<SNode> classMethods = null;
      if (isStatic) {
        if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          classMethods = SLinkOperations.getTargets(SNodeOperations.cast(ancestor, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "staticMethod", true);
        }
      } else
      {
        if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          classMethods = SLinkOperations.getTargets(SNodeOperations.cast(ancestor, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true);
        } else
        {
          classMethods = SLinkOperations.getTargets(SNodeOperations.cast(ancestor, "jetbrains.mps.baseLanguage.structure.Interface"), "method", true);
        }
      }
      for(SNode classMethod : ListSequence.fromList(classMethods)) {
        if () {
          SetSequence.fromSet(results).addElement(classMethod);
        }
      }
    }
    for(SNode result : SetSequence.fromSet(results)) {
      ListOperations.addElement(_results, result);
    }
  }

  public String getNodeCategory(SNode node) {
    return "Base methods";
  }

}
