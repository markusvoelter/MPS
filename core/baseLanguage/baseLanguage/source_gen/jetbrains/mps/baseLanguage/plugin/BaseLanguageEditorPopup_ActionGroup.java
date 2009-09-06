package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class BaseLanguageEditorPopup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLanguageEditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup";

  public BaseLanguageEditorPopup_ActionGroup() {
    super("BaseLanguageEditorPopup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      BaseLanguageEditorPopup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.CommentStatements_Action", "jetbrains.mps.baseLanguage");
      BaseLanguageEditorPopup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.UncommentStatements_Action", "jetbrains.mps.baseLanguage");
      BaseLanguageEditorPopup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.RunClassConcept_Action", "jetbrains.mps.baseLanguage");
      BaseLanguageEditorPopup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.GoToOverridingMethod_Action", "jetbrains.mps.baseLanguage", ListSequence.fromListAndArray(new ArrayList<String>(), "jetbrains.mps.baseLanguage.findUsages.OverridingMethods_Finder", "jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder"));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, null);
  }
}
