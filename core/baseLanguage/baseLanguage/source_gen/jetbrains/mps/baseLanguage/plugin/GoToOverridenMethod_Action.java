package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.Set;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.smodel.SNodePointer;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.awt.Rectangle;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Point;
import com.intellij.ui.awt.RelativePoint;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.ide.project.ProjectHelper;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.HashSet;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class GoToOverridenMethod_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(GoToOverridenMethod_Action.class);

  public GoToOverridenMethod_Action() {
    super("Go to Overriden Method", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return (GoToOverridenMethod_Action.this.getInstanceMethodDeclaration(_params) != null) && (GoToOverridenMethod_Action.this.getClassifier(_params) != null);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToOverridenMethod", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("selectedNode", node);
    }
    if (MapSequence.fromMap(_params).get("selectedNode") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorContext", event.getData(MPSDataKeys.EDITOR_CONTEXT));
    if (MapSequence.fromMap(_params).get("editorContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<Set<Tuples._2<SNodePointer, SNode>>> overridenMethods = new Wrappers._T<Set<Tuples._2<SNodePointer, SNode>>>();
      final String[] methodName = new String[1];
      ProgressManager.getInstance().run(new Task.Modal(((Project) MapSequence.fromMap(_params).get("project")), "Searching...", true) {
        public void run(@NotNull ProgressIndicator p0) {
          ModelAccess.instance().runReadAction(new Runnable() {
            public void run() {
              overridenMethods.value = GoToOverridenMethod_Action.this.getOverridenMethod(_params);
              methodName[0] = SPropertyOperations.getString(GoToOverridenMethod_Action.this.getInstanceMethodDeclaration(_params), "name");
            }
          });
        }
      });
      Rectangle cellBounds = ((EditorContext) MapSequence.fromMap(_params).get("editorContext")).getSelectedCell().getBounds();
      Point point = new Point(((int) cellBounds.getMinX()), ((int) cellBounds.getMaxY()));
      RelativePoint relPoint = new RelativePoint(((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")), point);

      GoToHelper.showOverridenMethodsMenu(SetSequence.fromSet(overridenMethods.value).select(new ISelector<Tuples._2<SNodePointer, SNode>, SNodePointer>() {
        public SNodePointer select(Tuples._2<SNodePointer, SNode> it) {
          return it._0();
        }
      }).toListSequence(), relPoint, ProjectHelper.toMPSProject(((Project) MapSequence.fromMap(_params).get("project"))), methodName[0]);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToOverridenMethod", t);
    }
  }

  private SNode getInstanceMethodDeclaration(final Map<String, Object> _params) {
    return SNodeOperations.getAncestor(((SNode) MapSequence.fromMap(_params).get("selectedNode")), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", true, false);
  }

  private SNode getClassifier(final Map<String, Object> _params) {
    return SNodeOperations.getAncestor(GoToOverridenMethod_Action.this.getInstanceMethodDeclaration(_params), "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
  }

  private Set<Tuples._2<SNodePointer, SNode>> getOverridenMethod(final Map<String, Object> _params) {
    SNode method = GoToOverridenMethod_Action.this.getInstanceMethodDeclaration(_params);
    SNode classifier = GoToOverridenMethod_Action.this.getClassifier(_params);
    Set<Tuples._2<SNode, SNode>> overridenMethods = new OverridingMethodsFinder(classifier, Sequence.<SNode>singleton(method)).getOverridenMethods(method);
    Set<Tuples._2<SNodePointer, SNode>> result = SetSequence.fromSet(new HashSet<Tuples._2<SNodePointer, SNode>>());
    if (overridenMethods != null) {
      for (Tuples._2<SNode, SNode> entry : overridenMethods) {
        SetSequence.fromSet(result).addElement(MultiTuple.<SNodePointer,SNode>from(new SNodePointer(entry._0()), entry._1()));
      }
    }
    return result;
  }
}
