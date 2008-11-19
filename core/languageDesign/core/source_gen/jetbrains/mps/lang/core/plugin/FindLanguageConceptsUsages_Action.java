package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.findalgorithm.finders.specific.LanguageConceptsUsagesFinder;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;

public class FindLanguageConceptsUsages_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(FindLanguageConceptsUsages_Action.class);
  private static final Icon ICON = null;

  public IModule module;
  public IOperationContext context;
  public IScope scope;

  public FindLanguageConceptsUsages_Action() {
    super("Find Concepts Usages", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt F8";
  }

  public boolean isApplicable(AnActionEvent event) {
    if (!(FindLanguageConceptsUsages_Action.this.module instanceof Language)) {
      return false;
    }
    Language language = (Language) FindLanguageConceptsUsages_Action.this.module;
    SModelDescriptor structureModelDescriptor = language.getStructureModelDescriptor();
    if (structureModelDescriptor == null) {
      return false;
    }
    if (structureModelDescriptor.getSModel().getRoots().isEmpty()) {
      return false;
    }
    return true;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "FindLanguageConceptsUsages", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.scope = event.getData(MPSDataKeys.SCOPE);
    if (this.scope == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final SearchQuery[] query = new SearchQuery[1];
      final IResultProvider[] provider = new IResultProvider[1];
      final IModule module = FindLanguageConceptsUsages_Action.this.module;
      final IScope scope = FindLanguageConceptsUsages_Action.this.scope;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          query[0] = new SearchQuery(module, scope);
          provider[0] = FindUtils.makeProvider(new LanguageConceptsUsagesFinder());
        }

      });
      FindLanguageConceptsUsages_Action.this.context.getComponent(UsagesViewTool.class).findUsages(provider[0], query[0], true, true, false, "There are no usages of language's concepts");
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "FindLanguageConceptsUsages", t);
    }
  }


  @NotNull()
  public static String getActionId(Object... args) {
    StringBuilder res = new StringBuilder(500);
    res.append(FindLanguageConceptsUsages_Action.class.getName());
    res.append("#");
    int i = 0;
    return res.toString();
  }

}
