package jetbrains.mps.lang.script.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import java.util.Set;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.BaseAction;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import java.util.List;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.ide.actions.ModelActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.GeneratorActions_ActionGroup;
import jetbrains.mps.ide.actions.SolutionActions_ActionGroup;

public class ScriptsForSelection_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ScriptsForSelection_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.script.plugin.ScriptsForSelection";

  private Set<Pair<ActionPlace, Condition<BaseAction>>> myPlaces = SetSequence.fromSet(new HashSet<Pair<ActionPlace, Condition<BaseAction>>>());
  private List<AnAction> myAllActions;

  public ScriptsForSelection_ActionGroup() {
    super("Scripts", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void doUpdate(AnActionEvent event) {
    try {
      ScriptsForSelection_ActionGroup.this.removeAll();
      event.getPresentation().setVisible(true);
      IOperationContext context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      if (context == null || context.getProject() == null) {
        event.getPresentation().setEnabled(false);
        return;
      }
      event.getPresentation().setEnabled(true);
      // 
      ScriptsMenuBuilder menuBuilder = new ScriptsMenuBuilder(true);
      ScriptsForSelection_ActionGroup.this.add(menuBuilder.create_ByCategoryPopup());
      ScriptsForSelection_ActionGroup.this.add(menuBuilder.create_ByBuildPopup());
      ScriptsForSelection_ActionGroup.this.add(menuBuilder.create_ByLanguagePopup());
      // 
      ScriptsForSelection_ActionGroup.this.addAction("jetbrains.mps.lang.script.plugin.RunMigrationScripts_Action", "jetbrains.mps.lang.script", menuBuilder.getAllScripts(), true);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
    for (Pair<ActionPlace, Condition<BaseAction>> p : this.myPlaces) {
      this.addPlace(p.first, p.second);
    }
  }

  public void addPlace(ActionPlace place, @Nullable Condition<BaseAction> cond) {
    SetSequence.fromSet(this.myPlaces).addElement(new Pair<ActionPlace, Condition<BaseAction>>(place, cond));
  }

  public void adjust() {
    this.insertGroupIntoAnother(ModelActions_ActionGroup.ID, null);
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, null);
    this.insertGroupIntoAnother(GeneratorActions_ActionGroup.ID, null);
    this.insertGroupIntoAnother(SolutionActions_ActionGroup.ID, null);
  }
}
