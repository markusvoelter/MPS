package jetbrains.mps.bootstrap.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.dataFlow.framework.Program;
import jetbrains.mps.dataFlow.DataFlowManager;
import jetbrains.mps.dataFlow.framework.AnalysisResult;
import java.util.Set;
import jetbrains.mps.dataFlow.framework.analyzers.InitializedVariablesAnalyzer;

public class PrintInitializationInformation_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(PrintInitializationInformation_Action.class);
  public static final Icon ICON = null;

  private SNode node;

  public PrintInitializationInformation_Action() {
    super("Print DFA Initialization Information", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "PrintInitializationInformation", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      {
        SNode node = new ActionEventData(event).getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      Program program = DataFlowManager.getInstance().buildProgramFor(this.node);
      AnalysisResult<Set<Object>> result = program.analyze(new InitializedVariablesAnalyzer());
      System.out.println(result.toString());
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "PrintInitializationInformation", t);
    }
  }

}
