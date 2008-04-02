package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;

import java.util.List;

import jetbrains.mps.ide.progress.IAdaptiveProgressMonitor;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import org.jetbrains.annotations.Nullable;

public class OverridingFields_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.OverridingFields_Finder");

  public boolean isVisible() {
    return true;
  }

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
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) == null) {
      return false;
    }
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
      return false;
    }
    return true;
  }

  protected void doFind(SNode node, IScope scope, List<SNode> _results, IAdaptiveProgressMonitor monitor) {
    {
      ICursor<SNode> _zCursor8 = CursorFactory.createCursor(this.executeFinder("jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder", SNodeOperations.getParent(node, null, false, false), scope, monitor));
      try {
        while (_zCursor8.moveToNext()) {
          SNode classNode = _zCursor8.getCurrent();
          {
            Iterable<SNode> fieldsOfSameKind;
            if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration")) {
              fieldsOfSameKind = SLinkOperations.getTargets(classNode, "field", true);
            } else {
              fieldsOfSameKind = SLinkOperations.getTargets(classNode, "staticField", true);
            }
            {
              ICursor<SNode> _zCursor9 = CursorFactory.createCursor(fieldsOfSameKind);
              try {
                while (_zCursor9.moveToNext()) {
                  SNode field = _zCursor9.getCurrent();
                  if (SPropertyOperations.getString(field, "name").equals(SPropertyOperations.getString(node, "name")) && Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(field, "type", true)).equals(Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(node, "type", true)))) {
                    ListOperations.addElement(_results, field);
                  }
                }
              } finally {
                _zCursor9.release();
              }
            }
          }
        }
      } finally {
        _zCursor8.release();
      }
    }
  }

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    ListOperations.addElement(_results, node);
  }

  public String getNodeCategory(SNode node) {
    return "Overriding Fields";
  }

  @Nullable()
  public String getNodePresentation(SNode node) {
    return null;
  }

}
