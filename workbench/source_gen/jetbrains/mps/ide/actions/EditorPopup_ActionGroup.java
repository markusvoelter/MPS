package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.nodes.GoByReferenceGroup;

public class EditorPopup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorPopup";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_vcs = ID + "vcs";

  public EditorPopup_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new GoByReferenceGroup());
      this.addAction("jetbrains.mps.workbench.actions.nodes.GoByCurrentReferenceAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.HighlightUsagesAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.HighlightInstancesAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.ShowInProject_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.SelectInActionAdapter", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.GoToConceptDeclaration_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.GoToRulesAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ShowNodeInExplorer_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ShowNodeInInspector_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.generate.GenerateFilesFromModelsAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.generate.GenerateTextFromModelsAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.lang.generator.plugin.actions.GoToUsageInMappingConfigAction", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.GenerateCodeAction_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.lang.generator.plugin.debug.actions.ShowGenerationTraceAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ShowGenerationTraceback_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.workbench.actions.nodes.FindSpecificNodeUsagesAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.FastFindUsagesNodeAction", "jetbrains.mps.ide");
      this.addAnchor(EditorPopup_ActionGroup.LABEL_ID_find_instances);
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.ShowClassInHierarchy_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action", "jetbrains.mps.ide");
      this.addAnchor(EditorPopup_ActionGroup.LABEL_ID_structure);
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.CloneRoot_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.baseLanguage.ShowParametersAction", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ModelPropertiesWOShortcut_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAnchor(EditorPopup_ActionGroup.LABEL_ID_vcs);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
