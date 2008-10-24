package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public class OverridingFields_Finder extends GeneratedFinder {
private    static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder");

  public String getDescription() {
    return "Overriding Fields";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
  }

  public boolean isApplicable(SNode node) {
    if (SNodeOperations.getParent(node) == null || !(SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator) {
    for(SNode classNode : FindUtils.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder", SNodeOperations.getParent(node), scope, indicator)) {
      Iterable<SNode> fieldsOfSameKind;
      if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
        fieldsOfSameKind = SLinkOperations.getTargets(classNode, "field", true);
      } else
      {
        fieldsOfSameKind = SLinkOperations.getTargets(classNode, "staticField", true);
      }
      for(SNode field : fieldsOfSameKind) {
        if (SPropertyOperations.getString(field, "name").equals(SPropertyOperations.getString(node, "name")) && Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(field, "type", true)).equals(Type_Behavior.call_getErasureSignature_1213877337313(SLinkOperations.getTarget(node, "type", true)))) {
          ListOperations.addElement(_results, field);
        }
      }
    }
  }

  public String getNodeCategory(SNode node) {
    return "Overriding Fields";
  }

}
