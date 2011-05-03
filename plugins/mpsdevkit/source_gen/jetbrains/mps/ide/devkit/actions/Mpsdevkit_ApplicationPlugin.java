package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.GeneratorActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.ToolsInternal_ActionGroup;
import jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.Tools_ActionGroup;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageNewActions_ActionGroup;
import jetbrains.mps.ide.actions.ModulePropertiesGroup_ActionGroup;
import jetbrains.mps.ide.actions.EditorTabActions_ActionGroup;
import jetbrains.mps.ide.actions.GoToEditorPopupAddition_ActionGroup;
import jetbrains.mps.ide.actions.Goto_ActionGroup;
import jetbrains.mps.ide.actions.DevkitActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;
import jetbrains.mps.ide.actions.DebugActions_ActionGroup;
import java.util.List;
import jetbrains.mps.workbench.action.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Mpsdevkit_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.ide.mpsdevkit");

  public Mpsdevkit_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new AddAccessoryModel_Action());
    addAction(new AddGeneralPurposeDevKitToLanguageModels_Action());
    addAction(new AddLanguageDesingDevKitToLanguages_Action());
    addAction(new CellProperties_Action());
    addAction(new DeleteGenerator_Action());
    addAction(new DevkitProperties_Action());
    addAction(new DumpKeyStrokes_Action());
    addAction(new FixDependenciesEverywhere_Action());
    addAction(new GenerationIntentions_Action());
    addAction(new GeneratorProperties_Action());
    addAction(new GoToConceptDeclaration_Action());
    addAction(new GoToEditorDeclaration_Action());
    addAction(new GoToRules_Action());
    addAction(new GoToUsageInMappingConfig_Action());
    addAction(new HighlightCellDependencies_Action());
    addAction(new InstallIDEAPlugin_Action());
    addAction(new LanguageHierarchy_Action());
    addAction(new LanguagePaths_Action());
    addAction(new LanguageProperties_Action());
    addAction(new LoadNonStubModels_Action());
    addAction(new NewAccessoryModel_Action());
    addAction(new NewDevKit_Action());
    addAction(new NewGenerator_Action());
    addAction(new OptimizeImportsInGlobalScope_Action());
    addAction(new PrintNodeID_Action());
    addAction(new ReloadAll_Action());
    addAction(new ReloadStubs_Action());
    addAction(new RemoveBootstrapLanguagesDevKitFromLanguageModels_Action());
    addAction(new RemoveLanguageDesignDevKitFromModels_Action());
    addAction(new RenameAspects_Action());
    addAction(new RenameLanguage_Action());
    addAction(new ShowCellInExplorer_Action());
    addAction(new ShowGenerationTrace_Action());
    addAction(new ShowGenerationTraceback_Action());
    addAction(new ShowModelRepository_Action());
    addAction(new ShowModuleRepository_Action());
    addAction(new ShowNodeInExplorer_Action());
    addAction(new ShowTypeSystemTraceIncremental_Action());
    addAction(new ShowTypeSystemTrace_Action());
    addAction(new SurroundWithIntentions_Action());
    addAction(new TestNodePath_Action());
    // groups 
    addGroup(new AccessoriesGroupActions_ActionGroup());
    addGroup(new DevKitTools_ActionGroup());
    addGroup(new DevkitActionsEx_ActionGroup());
    addGroup(new EditorInternalEx_ActionGroup());
    addGroup(new GenerateEditorPopup_ActionGroup());
    addGroup(new GenerateGeneratorPopup_ActionGroup());
    addGroup(new GenerationIntentions_ActionGroup());
    addGroup(new GenerationTraceActions_ActionGroup());
    addGroup(new GeneratorActions_Delete_ActionGroup());
    addGroup(new GeneratorActions_Properties_ActionGroup());
    addGroup(new GotoConceptAspect_ActionGroup());
    addGroup(new LanguageActionsEx_ActionGroup());
    addGroup(new LanguageNewActionsEx_ActionGroup());
    addGroup(new LanguageNewCustomPartActions_ActionGroup());
    addGroup(new LanguageNewGenerator_ActionGroup());
    addGroup(new LanguageRefactoring_ActionGroup());
    addGroup(new ModulePropertiesGroupEx_ActionGroup());
    addGroup(new ProjectNewActionsEx_ActionGroup());
    addGroup(new RepositoryToolsGroup_ActionGroup());
    addGroup(new ShowNodeIn_ActionGroup());
    addGroup(new SurroundWithIntentions_ActionGroup());
    addGroup(new ToolsInternalEx_ActionGroup());
    addGroup(new TraceActions_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(GenerateGeneratorPopup_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_generate);
    insertGroupIntoAnother(GenerateEditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_goto);
    insertGroupIntoAnother(ToolsInternalEx_ActionGroup.ID, ToolsInternal_ActionGroup.ID, ToolsInternal_ActionGroup.LABEL_ID_internal);
    insertGroupIntoAnother(ProjectNewActionsEx_ActionGroup.ID, ProjectNewActions_ActionGroup.ID, ProjectNewActions_ActionGroup.LABEL_ID_end);
    insertGroupIntoAnother(LanguageRefactoring_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_refactoring);
    insertGroupIntoAnother(RepositoryToolsGroup_ActionGroup.ID, Tools_ActionGroup.ID, Tools_ActionGroup.LABEL_ID_customTools);
    insertGroupIntoAnother(GenerationTraceActions_ActionGroup.ID, EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_gentrace);
    insertGroupIntoAnother(GenerationTraceActions_ActionGroup.ID, NodeActions_ActionGroup.ID, NodeActions_ActionGroup.LABEL_ID_gentrace);
    insertGroupIntoAnother(LanguageNewGenerator_ActionGroup.ID, LanguageNewActions_ActionGroup.ID, LanguageNewActions_ActionGroup.LABEL_ID_newSubModule);
    insertGroupIntoAnother(LanguageNewActionsEx_ActionGroup.ID, LanguageNewActions_ActionGroup.ID, LanguageNewActions_ActionGroup.LABEL_ID_newModel);
    insertGroupIntoAnother(GeneratorActions_Delete_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_delete);
    insertGroupIntoAnother(GeneratorActions_Properties_ActionGroup.ID, GeneratorActions_ActionGroup.ID, GeneratorActions_ActionGroup.LABEL_ID_properties);
    insertGroupIntoAnother(ModulePropertiesGroupEx_ActionGroup.ID, ModulePropertiesGroup_ActionGroup.ID, ModulePropertiesGroup_ActionGroup.LABEL_ID_extensions);
    insertGroupIntoAnother(GotoConceptAspect_ActionGroup.ID, EditorTabActions_ActionGroup.ID, EditorTabActions_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(GotoConceptAspect_ActionGroup.ID, GoToEditorPopupAddition_ActionGroup.ID, GoToEditorPopupAddition_ActionGroup.LABEL_ID_other);
    insertGroupIntoAnother(GotoConceptAspect_ActionGroup.ID, Goto_ActionGroup.ID, Goto_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(GotoConceptAspect_ActionGroup.ID, NodeActions_ActionGroup.ID, NodeActions_ActionGroup.LABEL_ID_gotoConceptAspects);
    insertGroupIntoAnother(DevkitActionsEx_ActionGroup.ID, DevkitActions_ActionGroup.ID, DevkitActions_ActionGroup.LABEL_ID_properties);
    insertGroupIntoAnother(LanguageActionsEx_ActionGroup.ID, LanguageActions_ActionGroup.ID, LanguageActions_ActionGroup.LABEL_ID_properties);
    insertGroupIntoAnother(DevKitTools_ActionGroup.ID, Tools_ActionGroup.ID, Tools_ActionGroup.LABEL_ID_devkitTools);
    insertGroupIntoAnother(EditorInternalEx_ActionGroup.ID, EditorInternal_ActionGroup.ID, EditorInternal_ActionGroup.LABEL_ID_workbench);
    insertGroupIntoAnother(LanguageNewCustomPartActions_ActionGroup.ID, LanguageNewActions_ActionGroup.ID, LanguageNewActions_ActionGroup.LABEL_ID_newAspect);
    insertGroupIntoAnother(TraceActions_ActionGroup.ID, DebugActions_ActionGroup.ID, null);
    insertGroupIntoAnother(ShowNodeIn_ActionGroup.ID, EditorPopup_ActionGroup.ID, EditorPopup_ActionGroup.LABEL_ID_showIn);
    insertGroupIntoAnother(ShowNodeIn_ActionGroup.ID, EditorTabActions_ActionGroup.ID, EditorTabActions_ActionGroup.LABEL_ID_showIn);
    insertGroupIntoAnother(ShowNodeIn_ActionGroup.ID, NodeActions_ActionGroup.ID, NodeActions_ActionGroup.LABEL_ID_showIn);
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    ListSequence.fromList(res).addElement(new Mac_KeymapChanges());
    ListSequence.fromList(res).addElement(new Trace_KeymapChanges());
    return res;
  }
}
