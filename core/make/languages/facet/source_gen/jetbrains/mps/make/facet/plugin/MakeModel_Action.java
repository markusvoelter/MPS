package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.make.runtime.script.ScriptBuilder;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;

public class MakeModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(MakeModel_Action.class);

  private IOperationContext context;

  public MakeModel_Action() {
    super("_Make", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "MakeModel", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.context = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      System.out.println("*** WOO-HOO!!!!");
      ScriptBuilder scb = new ScriptBuilder();
      IScript scr = scb.withFacet(new IFacet.Name("Generator")).withTarget(new ITarget.Name("GenerateFiles")).toScript();
      System.out.println("*** Script valid: " + scr.isValid());
      IResult res = scr.execute(new IMonitor() {
        public boolean pleaseStop() {
          return false;
        }

        public <T extends IOption> T relayQuery(IQuery<T> query) {
          return new UIQueryRelayStrategy().relayQuery(query, MakeModel_Action.this.context);
        }

        public <T> T variables(ITarget<T> target) {
          return null;
        }
      });
      System.out.println("*** Success: " + res.isSucessful());
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "MakeModel", t);
    }
  }
}
