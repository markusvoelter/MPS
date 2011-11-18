package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.ide.findusages.model.SearchResult;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.components.ShowImplementationComponent;
import jetbrains.mps.smodel.IOperationContext;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;
import com.intellij.ui.awt.RelativePoint;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Point;
import jetbrains.mps.project.MPSProject;

public class ShowImplementations_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowImplementations_Action.class);

  public ShowImplementations_Action() {
    super("Show Implementation", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.Interface") || SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.ClassConcept") && SPropertyOperations.getBoolean(SNodeOperations.cast(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass") || SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(((SNode) MapSequence.fromMap(_params).get("node"))), "jetbrains.mps.baseLanguage.structure.Classifier");
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowImplementations", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("cell", event.getData(MPSDataKeys.EDITOR_CELL));
    if (MapSequence.fromMap(_params).get("cell") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final List<SNode> nodes = new ArrayList<SNode>();
      ListSequence.fromList(nodes).addElement(((SNode) MapSequence.fromMap(_params).get("node")));

      SearchResults<SNode> results;
      if (SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.Interface")) {
        results = FindUtils.getSearchResults(new EmptyProgressMonitor(), ((SNode) MapSequence.fromMap(_params).get("node")), GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder");
      } else if (SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.ClassConcept") && SPropertyOperations.getBoolean(SNodeOperations.cast(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass")) {
        results = FindUtils.getSearchResults(new EmptyProgressMonitor(), ((SNode) MapSequence.fromMap(_params).get("node")), GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.DerivedClasses_Finder");
      } else if (SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(((SNode) MapSequence.fromMap(_params).get("node"))), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.hasRole(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.Interface", "method")) {
        results = FindUtils.getSearchResults(new EmptyProgressMonitor(), ((SNode) MapSequence.fromMap(_params).get("node")), GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder");
      } else if (SNodeOperations.isInstanceOf(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SNodeOperations.isInstanceOf(SNodeOperations.getParent(((SNode) MapSequence.fromMap(_params).get("node"))), "jetbrains.mps.baseLanguage.structure.Classifier")) {
        results = FindUtils.getSearchResults(new EmptyProgressMonitor(), ((SNode) MapSequence.fromMap(_params).get("node")), GlobalScope.getInstance(), "jetbrains.mps.baseLanguage.findUsages.DerivedMethods_Finder");
      } else {
        return;
      }
      for (SearchResult<SNode> searchResult : results.getSearchResults()) {
        SNode foundNode = searchResult.getObject();
        if ((foundNode != null)) {
          ListSequence.fromList(nodes).addElement(foundNode);
        }
      }
      Project project = ((Project) MapSequence.fromMap(_params).get("project"));
      ModelAccess.instance().runWriteActionInCommandAsync(new Runnable() {
        public void run() {
          String title = "Definition of " + ((SNode) MapSequence.fromMap(_params).get("node")).getPresentation();
          ShowImplementationComponent component = new ShowImplementationComponent(nodes, ((IOperationContext) MapSequence.fromMap(_params).get("context")));
          JBPopup popup = JBPopupFactory.getInstance().createComponentPopupBuilder(component, component.getPrefferedFocusableComponent()).setRequestFocus(true).setProject(((Project) MapSequence.fromMap(_params).get("project"))).setMovable(true).setResizable(true).setTitle(title).createPopup();
          popup.show(new RelativePoint(((EditorCell) MapSequence.fromMap(_params).get("cell")).getEditor(), new Point(((EditorCell) MapSequence.fromMap(_params).get("cell")).getX(), ((EditorCell) MapSequence.fromMap(_params).get("cell")).getY())));
          component.getPrefferedFocusableComponent().setRequestFocusEnabled(true);
          component.setPopup(popup);
        }
      }, (project != null ?
        project.getComponent(MPSProject.class) :
        null
      ));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowImplementations", t);
      }
    }
  }
}
