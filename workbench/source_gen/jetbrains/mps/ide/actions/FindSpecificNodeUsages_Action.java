package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.ide.findusages.view.optionseditor.FindUsagesOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.FindUsagesDialog;
import com.intellij.openapi.project.Project;
import java.awt.Frame;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ViewOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.options.FindersOptions;
import jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.ide.findusages.view.optionseditor.DefaultSearchOptionsComponent;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindSpecificNodeUsages_Action extends GeneratedAction {
  private static final Icon ICON = new ImageIcon(FindSpecificNodeUsages_Action.class.getResource("find.png"));
  protected static Log log = LogFactory.getLog(FindSpecificNodeUsages_Action.class);

  public FindSpecificNodeUsages_Action() {
    super("Find Usages...", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
    this.setMnemonic("U".charAt(0));
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return FindSpecificNodeUsages_Action.this.getTool(_params) != null && FindSpecificNodeUsages_Action.this.getOptionsComponent(_params) != null;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "FindSpecificNodeUsages", t);
      }
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
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.CONTEXT_MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("cell", event.getData(MPSDataKeys.EDITOR_CELL));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      // get node 
      final Wrappers._T<SNode> operationNode = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          operationNode.value = (((EditorCell) MapSequence.fromMap(_params).get("cell")) == null ?
            ((SNode) MapSequence.fromMap(_params).get("node")) :
            ((EditorCell) MapSequence.fromMap(_params).get("cell")).getSNodeWRTReference()
          );
        }
      });
      // show dialog 
      final Wrappers._T<FindUsagesOptions> options = new Wrappers._T<FindUsagesOptions>(FindSpecificNodeUsages_Action.this.getOptionsComponent(_params).getDefaultSearchOptions());
      FindUsagesDialog dialog = new FindUsagesDialog(options.value, operationNode.value, ((Project) MapSequence.fromMap(_params).get("project")), ((Frame) MapSequence.fromMap(_params).get("frame")));
      dialog.showDialog();
      if (dialog.isCancelled()) {
        return;
      }
      options.value = dialog.getResult();
      FindSpecificNodeUsages_Action.this.getOptionsComponent(_params).setDefaultSearchOptions(options.value);
      // start 
      final Wrappers._T<IResultProvider> provider = new Wrappers._T<IResultProvider>();
      final Wrappers._T<SearchQuery> query = new Wrappers._T<SearchQuery>();
      final Wrappers._T<ViewOptions> viewOptions = new Wrappers._T<ViewOptions>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          provider.value = options.value.getOption(FindersOptions.class).getResult();
          query.value = options.value.getOption(ScopeOptions.class).getResult(operationNode.value, ((IOperationContext) MapSequence.fromMap(_params).get("context")), ((SModelDescriptor) MapSequence.fromMap(_params).get("model")));
          viewOptions.value = options.value.getOption(ViewOptions.class);
        }
      });
      FindSpecificNodeUsages_Action.this.getTool(_params).findUsages(provider.value, query.value, true, viewOptions.value.myShowOneResult, viewOptions.value.myNewTab, "No usages for that node");
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "FindSpecificNodeUsages", t);
      }
    }
  }

  private DefaultSearchOptionsComponent getOptionsComponent(final Map<String, Object> _params) {
    return ((Project) MapSequence.fromMap(_params).get("project")).getComponent(DefaultSearchOptionsComponent.class);
  }

  private UsagesViewTool getTool(final Map<String, Object> _params) {
    return ((Project) MapSequence.fromMap(_params).get("project")).getComponent(UsagesViewTool.class);
  }
}
