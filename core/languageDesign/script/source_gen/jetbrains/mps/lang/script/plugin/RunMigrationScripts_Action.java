package jetbrains.mps.lang.script.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import java.awt.Frame;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.script.structure.MigrationScript;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class RunMigrationScripts_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(RunMigrationScripts_Action.class);

  private MPSProject project;
  private Frame frame;
  private IOperationContext context;
  private List<SModelDescriptor> models;
  private List<IModule> modules;
  private List<MigrationScript> scripts;
  private boolean selectionOnly;

  public RunMigrationScripts_Action(List<MigrationScript> scripts_par, boolean selectionOnly_par) {
    super("More...", "", ICON);
    this.scripts = scripts_par;
    this.selectionOnly = selectionOnly_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RunMigrationScripts", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.models = event.getData(MPSDataKeys.MODELS);
    this.modules = event.getData(MPSDataKeys.MODULES);
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      IScope scope = AbstractMigrationScriptHelper.createMigrationScope(RunMigrationScripts_Action.this.models, RunMigrationScripts_Action.this.modules, RunMigrationScripts_Action.this.selectionOnly);
      if (scope.getModelDescriptors().isEmpty()) {
        return;
      }
      ScriptsActionGroupHelper.sortScripts(RunMigrationScripts_Action.this.scripts);
      RunMigrationScriptsDialog dialog = new RunMigrationScriptsDialog(RunMigrationScripts_Action.this.frame, RunMigrationScripts_Action.this.scripts, ScriptsActionGroupHelper.getSelectedScripts());
      int x = RunMigrationScripts_Action.this.frame.getX() + RunMigrationScripts_Action.this.frame.getWidth() / 2 - dialog.getWidth() / 2;
      int y = RunMigrationScripts_Action.this.frame.getY() + RunMigrationScripts_Action.this.frame.getHeight() / 2 - dialog.getHeight() / 2;
      dialog.setLocation(x, y);
      dialog.setVisible(true);
      if (dialog.isRunChecked()) {
        AbstractMigrationScriptHelper.doRunScripts(dialog.getCheckedScripts(), scope, RunMigrationScripts_Action.this.context);
      } else if (dialog.isOpenSelected())
      {
        RunMigrationScripts_Action.this.project.getComponent(MPSEditorOpener.class).editNode(dialog.getSelectedScripts().get(0).getNode(), RunMigrationScripts_Action.this.context);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RunMigrationScripts", t);
    }
  }

  @NotNull()
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(RunMigrationScripts_Action.class.getName());
    res.append("#");
    res.append(scripts_State((List<MigrationScript>)this.scripts));
    res.append("!");
    res.append(((Object)this.selectionOnly).toString());
    res.append("!");
    return res.toString();
  }


  public static String scripts_State(List<MigrationScript> object) {
    return "";
  }

}
