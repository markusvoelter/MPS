package jetbrains.mps.ide.properties;

/*Generated by MPS */

import javax.swing.JPanel;
import jetbrains.mps.workbench.dialogs.project.IBindedDialog;
import java.util.List;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.util.Condition;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.workbench.dialogs.project.components.parts.boundpanels.BoundListPanel;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.ModelChooser;
import javax.swing.DefaultListCellRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ModelRenderer;
import javax.swing.TransferHandler;
import jetbrains.mps.workbench.dialogs.project.components.parts.CopySupport;
import jetbrains.mps.workbench.dialogs.project.components.parts.validators.Validator;
import jetbrains.mps.workbench.dialogs.project.components.parts.validators.ModelValidator;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.LanguageChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.ModuleRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.validators.ModuleValidator;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.SolutionChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.DevKitChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.GeneratorChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.GeneratorRenderer;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.SourcePathChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.StringPathRenderer;
import jetbrains.mps.project.structure.modules.Dependency;
import jetbrains.mps.workbench.dialogs.project.components.parts.boundpanels.BoundTablePanel;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.DependencyChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.ColumnDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.DepDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.BooleanDescriptor;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.ClassPathChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.StringPathDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.IncludedVCSDescriptor;
import jetbrains.mps.project.structure.model.ModelRoot;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.ModelRootChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.EditableStringDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.ManagerDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.VoidColumnDescriptor;
import javax.swing.table.TableCellEditor;
import jetbrains.mps.workbench.dialogs.project.components.parts.editors.HandlerTableCellEditor;
import javax.swing.JComponent;
import jetbrains.mps.project.structure.modules.StubSolution;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.StubSolutionChooser;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.StubRootChooser;
import jetbrains.mps.workbench.dialogs.project.utildialogs.addmodelimport.ImportProperties;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.ModelDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.ModuleImportDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.ModuleDescriptor;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingPriorityRule;
import jetbrains.mps.smodel.Generator;
import java.awt.Component;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.MappingRuleCreator;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.PriorityRuleDescriptor;
import jetbrains.mps.workbench.dialogs.project.components.parts.descriptors.RuleTypeDescriptor;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.jdesktop.beansbinding.Property;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.AutoBinding;
import jetbrains.mps.vfs.IFile;
import java.awt.Color;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.Disposer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.ide.ui.filechoosers.treefilechooser.TreeFileChooser;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.actions.RefactoringPanel;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.refactoring.framework.RefactoringUtil;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import jetbrains.mps.project.IModule;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import jetbrains.mps.workbench.dialogs.project.properties.project.ProjectProperties;
import javax.swing.JList;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.ListAddAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.dialogs.project.properties.project.TestConfigurationDialog;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.ListRemoveAction;
import jetbrains.mps.workbench.dialogs.project.components.parts.actions.ListEditAction;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.TestConfigListCellRenderer;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.vfs.MPSExtentions;
import jetbrains.mps.workbench.dialogs.project.components.parts.creators.ModulePathChooser;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.PathRenderer;
import jetbrains.mps.workbench.InternalFlag;
import javax.swing.JCheckBox;
import jetbrains.mps.workbench.dialogs.choosers.CommonChoosers;

public class StandardComponents {
  public StandardComponents() {
  }

  public static JPanel createModelsPanel(final IBindedDialog owner, final String caption, final List<SModelReference> list, final Condition<SModelReference> canRemove) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a0 = new BoundListPanel(owner, caption, list);
        Condition result_wf5hwp_a0a0a0a0 = canRemove;
        result_wf5hwp_a0a0a0.setCanRemoveCondition(result_wf5hwp_a0a0a0a0);
        Computable result_wf5hwp_a1a0a0a0 = new ModelChooser(owner);
        result_wf5hwp_a0a0a0.setMultipleChooser(result_wf5hwp_a1a0a0a0);
        DefaultListCellRenderer result_wf5hwp_a2a0a0a0 = new ModelRenderer(owner.getModuleScope(), owner.getProjectScope());
        result_wf5hwp_a0a0a0.setCellRenderer(result_wf5hwp_a2a0a0a0);
        TransferHandler result_wf5hwp_a3a0a0a0 = new CopySupport.ModelReferenceTransferHandler();
        result_wf5hwp_a0a0a0.setTransferHandler(result_wf5hwp_a3a0a0a0);
        Validator result_wf5hwp_a4a0a0a0 = new ModelValidator(owner.getModuleScope());
        result_wf5hwp_a0a0a0.setObjectValidator(result_wf5hwp_a4a0a0a0);
        result_wf5hwp_a0a0a0.init();
        return result_wf5hwp_a0a0a0;
      }
    }.invoke();
  }

  public static JPanel createLanguagesPanel(final IBindedDialog owner, final String caption, final List<ModuleReference> list) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a1 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a1 = new LanguageChooser(owner);
        result_wf5hwp_a0a0a1.setMultipleChooser(result_wf5hwp_a0a0a0a1);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a1 = new ModuleRenderer(owner.getModuleScope(), owner.getProjectScope());
        result_wf5hwp_a0a0a1.setCellRenderer(result_wf5hwp_a1a0a0a1);
        Validator result_wf5hwp_a2a0a0a1 = new ModuleValidator();
        result_wf5hwp_a0a0a1.setObjectValidator(result_wf5hwp_a2a0a0a1);
        result_wf5hwp_a0a0a1.init();
        return result_wf5hwp_a0a0a1;
      }
    }.invoke();
  }

  public static JPanel createSolutionsPanel(final IBindedDialog owner, final String caption, final List<ModuleReference> list) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a2 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a2 = new SolutionChooser(owner);
        result_wf5hwp_a0a0a2.setMultipleChooser(result_wf5hwp_a0a0a0a2);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a2 = new ModuleRenderer(owner.getModuleScope(), owner.getProjectScope());
        result_wf5hwp_a0a0a2.setCellRenderer(result_wf5hwp_a1a0a0a2);
        Validator result_wf5hwp_a2a0a0a2 = new ModuleValidator();
        result_wf5hwp_a0a0a2.setObjectValidator(result_wf5hwp_a2a0a0a2);
        result_wf5hwp_a0a0a2.init();
        return result_wf5hwp_a0a0a2;
      }
    }.invoke();
  }

  public static JPanel createDevKitsPanel(final IBindedDialog owner, final String caption, final List<ModuleReference> list) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a3 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a3 = new DevKitChooser(owner);
        result_wf5hwp_a0a0a3.setMultipleChooser(result_wf5hwp_a0a0a0a3);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a3 = new ModuleRenderer(owner.getModuleScope(), owner.getProjectScope());
        result_wf5hwp_a0a0a3.setCellRenderer(result_wf5hwp_a1a0a0a3);
        Validator result_wf5hwp_a2a0a0a3 = new ModuleValidator();
        result_wf5hwp_a0a0a3.setObjectValidator(result_wf5hwp_a2a0a0a3);
        result_wf5hwp_a0a0a3.init();
        return result_wf5hwp_a0a0a3;
      }
    }.invoke();
  }

  public static JPanel createGeneratorsPanel(final IBindedDialog owner, final String caption, final List<ModuleReference> list) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a4 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a4 = new GeneratorChooser(owner);
        result_wf5hwp_a0a0a4.setMultipleChooser(result_wf5hwp_a0a0a0a4);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a4 = new GeneratorRenderer(owner.getModuleScope(), owner.getProjectScope());
        result_wf5hwp_a0a0a4.setCellRenderer(result_wf5hwp_a1a0a0a4);
        Validator result_wf5hwp_a2a0a0a4 = new ModuleValidator();
        result_wf5hwp_a0a0a4.setObjectValidator(result_wf5hwp_a2a0a0a4);
        result_wf5hwp_a0a0a4.init();
        return result_wf5hwp_a0a0a4;
      }
    }.invoke();
  }

  public static JPanel createSourcePathsPanel(final IBindedDialog owner, final String caption, final List<String> list) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a5 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a5 = new SourcePathChooser(owner);
        result_wf5hwp_a0a0a5.setChooser(result_wf5hwp_a0a0a0a5);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a5 = new StringPathRenderer();
        result_wf5hwp_a0a0a5.setCellRenderer(result_wf5hwp_a1a0a0a5);
        result_wf5hwp_a0a0a5.init();
        return result_wf5hwp_a0a0a5;
      }
    }.invoke();
  }

  public static JPanel createDepsPanel(final IBindedDialog owner, final String caption, final List<Dependency> list) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a6 = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a6 = new DependencyChooser(owner);
        result_wf5hwp_a0a0a6.setMultipleChooser(result_wf5hwp_a0a0a0a6);

        ColumnDescriptor result_wf5hwp_a2a0a0a6 = new DepDescriptor(owner, Dependency.MODULEREF, "Module", -1);
        result_wf5hwp_a0a0a6.addColumn(result_wf5hwp_a2a0a0a6);
        ColumnDescriptor result_wf5hwp_a3a0a0a6 = new BooleanDescriptor(Dependency.REEXPORT, "Reexport", 100);
        result_wf5hwp_a0a0a6.addColumn(result_wf5hwp_a3a0a0a6);
        result_wf5hwp_a0a0a6.init();
        return result_wf5hwp_a0a0a6;
      }
    }.invoke();
  }

  public static JPanel createClassPathsPanel(final IBindedDialog owner, final String caption, final List<ClassPathEntry> list) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a7 = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a7 = new ClassPathChooser(owner);
        result_wf5hwp_a0a0a7.setMultipleChooser(result_wf5hwp_a0a0a0a7);

        ColumnDescriptor result_wf5hwp_a2a0a0a7 = new StringPathDescriptor(ClassPathEntry.PATH, "Path", -1);
        result_wf5hwp_a0a0a7.addColumn(result_wf5hwp_a2a0a0a7);
        ColumnDescriptor result_wf5hwp_a3a0a0a7 = new IncludedVCSDescriptor(ClassPathEntry.INCLUDED, "Included in VCS", 200);
        result_wf5hwp_a0a0a7.addColumn(result_wf5hwp_a3a0a0a7);
        result_wf5hwp_a0a0a7.init();
        return result_wf5hwp_a0a0a7;
      }
    }.invoke();
  }

  public static JPanel createModelRootsPanel(final IBindedDialog owner, final String caption, final List<ModelRoot> list) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a8 = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a8 = new ModelRootChooser(owner);
        result_wf5hwp_a0a0a8.setChooser(result_wf5hwp_a0a0a0a8);

        ColumnDescriptor result_wf5hwp_a2a0a0a8 = new StringPathDescriptor(ModelRoot.PATH, "Path", -1);
        result_wf5hwp_a0a0a8.addColumn(result_wf5hwp_a2a0a0a8);
        ColumnDescriptor result_wf5hwp_a3a0a0a8 = new EditableStringDescriptor(ModelRoot.PREFIX, "Prefix", 250);
        result_wf5hwp_a0a0a8.addColumn(result_wf5hwp_a3a0a0a8);
        ColumnDescriptor result_wf5hwp_a4a0a0a8 = new ManagerDescriptor(owner, ModelRoot.MANAGER, "Manager", 200);
        result_wf5hwp_a0a0a8.addColumn(result_wf5hwp_a4a0a0a8);
        ColumnDescriptor result_wf5hwp_a5a0a0a8 = new VoidColumnDescriptor(ModelRoot.OLD_MANAGER, "Manager (Int)", 200) {
          public TableCellEditor createEditor() {
            return new HandlerTableCellEditor(owner, caption);
          }
        };
        result_wf5hwp_a0a0a8.addColumn(result_wf5hwp_a5a0a0a8);
        result_wf5hwp_a0a0a8.init();
        return result_wf5hwp_a0a0a8;
      }
    }.invoke();
  }

  public static JComponent createStubSolutionsPanel(final IBindedDialog owner, final String caption, final List<StubSolution> list) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a9 = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a9 = new StubSolutionChooser(owner);
        result_wf5hwp_a0a0a9.setChooser(result_wf5hwp_a0a0a0a9);
        boolean result_wf5hwp_a1a0a0a9 = false;
        result_wf5hwp_a0a0a9.setDiffRow(result_wf5hwp_a1a0a0a9);

        ColumnDescriptor result_wf5hwp_a3a0a0a9 = new EditableStringDescriptor(StubSolution.NAME, "Name", -1);
        result_wf5hwp_a0a0a9.addColumn(result_wf5hwp_a3a0a0a9);
        ColumnDescriptor result_wf5hwp_a4a0a0a9 = new VoidColumnDescriptor(StubSolution.ID, "Module ID", 300);
        result_wf5hwp_a0a0a9.addColumn(result_wf5hwp_a4a0a0a9);
        result_wf5hwp_a0a0a9.init();
        return result_wf5hwp_a0a0a9;
      }
    }.invoke();
  }

  public static JPanel createStubRootsPanel(final IBindedDialog owner, final String caption, final List<StubModelsEntry> list) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a01 = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a01 = new StubRootChooser(owner);
        result_wf5hwp_a0a0a01.setMultipleChooser(result_wf5hwp_a0a0a0a01);

        ColumnDescriptor result_wf5hwp_a2a0a0a01 = new StringPathDescriptor(ClassPathEntry.PATH, "Path", -1);
        result_wf5hwp_a0a0a01.addColumn(result_wf5hwp_a2a0a0a01);
        ColumnDescriptor result_wf5hwp_a3a0a0a01 = new IncludedVCSDescriptor(ClassPathEntry.INCLUDED, "Included in VCS", 200);
        result_wf5hwp_a0a0a01.addColumn(result_wf5hwp_a3a0a0a01);
        ColumnDescriptor result_wf5hwp_a4a0a0a01 = new ManagerDescriptor(owner, StubModelsEntry.MANAGER, "Manager", 200);
        result_wf5hwp_a0a0a01.addColumn(result_wf5hwp_a4a0a0a01);
        result_wf5hwp_a0a0a01.init();
        return result_wf5hwp_a0a0a01;
      }
    }.invoke();
  }

  public static JComponent createModelsImportsPanel(final IBindedDialog owner, final String caption, final ImportProperties props) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a11 = new BoundTablePanel(owner, caption, props.getModelList());
        boolean result_wf5hwp_a0a0a0a11 = true;
        result_wf5hwp_a0a0a11.setDiffRow(result_wf5hwp_a0a0a0a11);

        ColumnDescriptor result_wf5hwp_a2a0a0a11 = new BooleanDescriptor(ImportProperties.ImportDescriptor.IS_IMPORTED, "Import", 100);
        result_wf5hwp_a0a0a11.addColumn(result_wf5hwp_a2a0a0a11);
        ColumnDescriptor result_wf5hwp_a3a0a0a11 = new ModelDescriptor(ImportProperties.ModelImportDescriptor.MODEL, "Model", -1);
        result_wf5hwp_a0a0a11.addColumn(result_wf5hwp_a3a0a0a11);
        ColumnDescriptor result_wf5hwp_a4a0a0a11 = new ModuleImportDescriptor(props, true, ImportProperties.ImportDescriptor.MODULE, "Module", -1);
        result_wf5hwp_a0a0a11.addColumn(result_wf5hwp_a4a0a0a11);
        result_wf5hwp_a0a0a11.init();
        return result_wf5hwp_a0a0a11;
      }
    }.invoke();
  }

  public static JComponent createLanguagesImportsPanel(final IBindedDialog owner, final String caption, final ImportProperties props) {
    return new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a21 = new BoundTablePanel(owner, caption, props.getLanguagesList());
        boolean result_wf5hwp_a0a0a0a21 = true;
        result_wf5hwp_a0a0a21.setDiffRow(result_wf5hwp_a0a0a0a21);

        ColumnDescriptor result_wf5hwp_a2a0a0a21 = new BooleanDescriptor(ImportProperties.ImportDescriptor.IS_IMPORTED, "Import", 100);
        result_wf5hwp_a0a0a21.addColumn(result_wf5hwp_a2a0a0a21);
        ColumnDescriptor result_wf5hwp_a3a0a0a21 = new ModuleDescriptor(ImportProperties.LanguageImportDescriptor.LANGUAGE, "Language", -1);
        result_wf5hwp_a0a0a21.addColumn(result_wf5hwp_a3a0a0a21);
        ColumnDescriptor result_wf5hwp_a4a0a0a21 = new ModuleImportDescriptor(props, false, ImportProperties.ImportDescriptor.MODULE, "Devkit", -1);
        result_wf5hwp_a0a0a21.addColumn(result_wf5hwp_a4a0a0a21);
        result_wf5hwp_a0a0a21.init();
        return result_wf5hwp_a0a0a21;
      }
    }.invoke();
  }

  public static JPanel createMappingConfigsPanel(final IBindedDialog owner, final String caption, final List<MappingPriorityRule> list, final Generator generator, final List<ModuleReference> depGenerators) {
    Component tablePanel = new _FunctionTypes._return_P0_E0<BoundTablePanel>() {
      public BoundTablePanel invoke() {
        BoundTablePanel result_wf5hwp_a0a0a0n = new BoundTablePanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a0n = new MappingRuleCreator();
        result_wf5hwp_a0a0a0n.setChooser(result_wf5hwp_a0a0a0a0n);
        boolean result_wf5hwp_a1a0a0a0n = true;
        result_wf5hwp_a0a0a0n.setDiffRow(result_wf5hwp_a1a0a0a0n);

        ColumnDescriptor result_wf5hwp_a3a0a0a0n = new PriorityRuleDescriptor(generator, depGenerators, true, MappingPriorityRule.LEFT, "Operand", -1);
        result_wf5hwp_a0a0a0n.addColumn(result_wf5hwp_a3a0a0a0n);
        ColumnDescriptor result_wf5hwp_a4a0a0a0n = new RuleTypeDescriptor(MappingPriorityRule.TYPE, "Type", 50);
        result_wf5hwp_a0a0a0n.addColumn(result_wf5hwp_a4a0a0a0n);
        ColumnDescriptor result_wf5hwp_a5a0a0a0n = new PriorityRuleDescriptor(generator, depGenerators, false, MappingPriorityRule.RIGHT, "Operand", -1);
        result_wf5hwp_a0a0a0n.addColumn(result_wf5hwp_a5a0a0a0n);
        result_wf5hwp_a0a0a0n.init();
        return result_wf5hwp_a0a0a0n;
      }
    }.invoke();

    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.add(tablePanel, BorderLayout.CENTER);
    mainPanel.add(StandardComponents.createLegendPanel(), BorderLayout.SOUTH);
    return mainPanel;
  }

  public static JPanel createNamespacePanel(final IBindedDialog owner, String caption, Object props, String fieldName) {
    JPanel panel = new JPanel(new BorderLayout());
    panel.setBorder(new EmptyBorder(3, 2, 5, 2));
    panel.add(new JLabel(caption), BorderLayout.WEST);
    JTextField tfNamespace = new JTextField();
    panel.add(tfNamespace, BorderLayout.CENTER);
    Property pNamespace = BeanProperty.create(fieldName);
    Property pNamespaceVar = BeanProperty.create("text");
    owner.addBinding(Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, props, pNamespace, tfNamespace, pNamespaceVar));
    return panel;
  }

  public static JPanel createFilePanel(String label, IFile file) {
    String initText = ((file == null) ?
      "<no file>" :
      file.getPath()
    );
    boolean isValid;
    try {
      isValid = file.exists();
    } catch (NullPointerException e) {
      isValid = false;
    }
    JPanel result = new JPanel(new BorderLayout());
    result.setBorder(new EmptyBorder(5, 2, 5, 2));
    result.add(new JLabel(label), BorderLayout.WEST);
    JTextField nameField = new JTextField(initText);
    nameField.setEditable(false);
    nameField.setDisabledTextColor((isValid ?
      Color.BLACK :
      Color.RED
    ));
    result.add(nameField, BorderLayout.CENTER);
    return result;
  }

  public static JPanel createSelectPathPanel(final IBindedDialog owner, Disposable parent, String caption, Object props, String fieldName) {
    JPanel panel = new JPanel(new BorderLayout());
    panel.setBorder(new EmptyBorder(2, 2, 2, 2));
    panel.add(new JLabel(caption), BorderLayout.WEST);
    final TextFieldWithBrowseButton tfNamespace = new TextFieldWithBrowseButton();
    Disposer.register(parent, tfNamespace);
    tfNamespace.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        TreeFileChooser chooser = new TreeFileChooser();
        chooser.setMode(TreeFileChooser.MODE_DIRECTORIES);
        IFile result = chooser.showDialog(owner.getMainComponent());
        if (result == null) {
          return;
        }
        tfNamespace.setText(result.getAbsolutePath());
      }
    });
    panel.add(tfNamespace, BorderLayout.CENTER);
    Property pData = BeanProperty.create(fieldName);
    Property pDataVar = BeanProperty.create("text");
    owner.addBinding(Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, props, pData, tfNamespace.getTextField(), pDataVar));
    return panel;
  }

  private static JComponent createRefactoringItemComponent(final SModelDescriptor modelDescriptor, final IOperationContext context) {
    final Wrappers._T<RefactoringPanel> refactoringPanel = new Wrappers._T<RefactoringPanel>(null);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        final SModel model = modelDescriptor.getSModel();
        if (model != null) {
          if (!(model.getRefactoringHistory().getRefactoringContexts().isEmpty())) {
            refactoringPanel.value = new RefactoringPanel(model, RefactoringUtil.getAllRefactoringNodes(), context);
          }
        }
      }
    });
    if (refactoringPanel.value == null) {
      return null;
    }
    return refactoringPanel.value.getComponent();
  }

  public static JComponent createRefactoringHistoryComponent(SModelDescriptor modelDescriptor, final IOperationContext context) {
    JComponent component = StandardComponents.createRefactoringItemComponent(modelDescriptor, context);
    if (component == null) {
      return new JPanel();
    }
    return new JScrollPane(component, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  }

  public static JComponent createRefactoringHistoryComponent(IModule module, IOperationContext context) {
    JPanel mainPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH, new Insets(4, 8, 4, 8), 0, 0);
    gridBagConstraints.weighty = 0;
    gridBagConstraints.gridy = GridBagConstraints.RELATIVE;
    for (SModelDescriptor modelDescriptor : module.getOwnModelDescriptors()) {
      JComponent component = StandardComponents.createRefactoringItemComponent(modelDescriptor, context);
      if (component == null) {
        continue;
      }
      mainPanel.add(component, gridBagConstraints);
    }
    JPanel result = new JPanel(new BorderLayout());
    result.add(mainPanel, BorderLayout.PAGE_START);
    return new JScrollPane(result, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
  }

  private static JPanel createLegendPanel() {
    JPanel result = new JPanel(new GridBagLayout());
    GridBagConstraints c = StandardComponents.createConstraints(0, 0, 1, 4, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    result.add(new JPanel(), c);
    c = StandardComponents.createConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
    result.add(new JLabel("<html><b>Legend</b></html>"), c);
    c.gridy = 1;
    result.add(new JLabel("<html><b>&lt;</b> - strictly before</html>"), c);
    c.gridy = 2;
    result.add(new JLabel("<html><b>=</b> - strictly together</html>"), c);
    c.gridy = 3;
    result.add(new JLabel("<html><b>&lt;=</b> - before or together</html>"), c);
    return result;
  }

  public static JPanel createTestConfigsPanel(final IBindedDialog owner, final String caption, final List<BaseTestConfiguration> list, final ProjectProperties properties) {
    final JList myList = new JList();
    final ListAddAction add = new ListAddAction(myList) {
      protected int doAdd(AnActionEvent e) {
        TestConfigurationDialog dialog = new TestConfigurationDialog(owner.getOperationContext().getMPSProject(), null);
        dialog.showDialog();
        BaseTestConfiguration config = dialog.getResult();
        if (config == null) {
          return -1;
        }
        properties.testConfigsChanged();
        list.add(config);
        return list.indexOf(config);
      }
    };
    final ListRemoveAction remove = new ListRemoveAction(myList) {
      protected void doRemove(AnActionEvent e) {
        for (Object value : myList.getSelectedValues()) {
          properties.testConfigsChanged();
          list.remove((BaseTestConfiguration) value);
        }
      }
    };
    final ListEditAction edit = new ListEditAction(myList) {
      public void doEdit() {
        Object value = myList.getSelectedValue();
        if (value == null) {
          return;
        }
        TestConfigurationDialog dialog = new TestConfigurationDialog(owner.getOperationContext().getMPSProject(), (BaseTestConfiguration) value);
        dialog.showDialog();
        BaseTestConfiguration config = dialog.getResult();
        if (config == null) {
          return;
        }
        properties.getTestConfigurations().remove((BaseTestConfiguration) value);
        properties.getTestConfigurations().add(config);
        properties.testConfigsChanged();
      }
    };

    BoundListPanel result = new BoundListPanel(owner, caption, list);
    result.setCellRenderer(new TestConfigListCellRenderer());
    result.setAddAction(add);
    result.setRemoveAction(remove);
    result.setEditAction(edit);
    result.init();
    return result;
  }

  public static JPanel createProjectSolutionsPanel(final IBindedDialog owner, final String caption, final List<Path> list) {
    return StandardComponents.createProjectModulesPathsList(owner, caption, list, MPSExtentions.DOT_SOLUTION);
  }

  public static JPanel createProjectLanguagesPanel(final IBindedDialog owner, final String caption, final List<Path> list) {
    return StandardComponents.createProjectModulesPathsList(owner, caption, list, MPSExtentions.DOT_LANGUAGE);
  }

  public static JPanel createProjectDevkitsPanel(final IBindedDialog owner, final String caption, final List<Path> list) {
    return StandardComponents.createProjectModulesPathsList(owner, caption, list, MPSExtentions.DOT_DEVKIT);
  }

  public static JPanel createProjectModulesPathsList(final IBindedDialog owner, final String caption, final List<Path> list, final String extension) {
    return new _FunctionTypes._return_P0_E0<BoundListPanel>() {
      public BoundListPanel invoke() {
        BoundListPanel result_wf5hwp_a0a0a52 = new BoundListPanel(owner, caption, list);
        Computable result_wf5hwp_a0a0a0a52 = new ModulePathChooser(extension, owner);
        result_wf5hwp_a0a0a52.setChooser(result_wf5hwp_a0a0a0a52);
        DefaultListCellRenderer result_wf5hwp_a1a0a0a52 = new PathRenderer();
        result_wf5hwp_a0a0a52.setCellRenderer(result_wf5hwp_a1a0a0a52);
        result_wf5hwp_a0a0a52.init();
        return result_wf5hwp_a0a0a52;
      }
    }.invoke();
  }

  public static JPanel createCheckboxPanel(IBindedDialog owner, List<StandardComponents.CheckboxDescriptor> list) {
    JPanel panel = new JPanel(new GridBagLayout());
    int i = 0;
    for (StandardComponents.CheckboxDescriptor d : list) {
      if (d.isInternal() && !(InternalFlag.isInternalMode())) {
        continue;
      }
      GridBagConstraints constraints = StandardComponents.createConstraints(0, i, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
      JCheckBox cb = new JCheckBox(d.getCheckboxCaption());
      panel.add(cb, constraints);
      Property propObj = BeanProperty.create(d.getPropName());
      Property propCb = BeanProperty.create("selected");
      owner.addBinding(Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, d.myObject, propObj, cb, propCb));
      i++;
    }
    GridBagConstraints constraints = StandardComponents.createConstraints(0, i, 1, 1, 1, 0, GridBagConstraints.NORTHWEST, GridBagConstraints.BOTH);
    panel.add(new JPanel(), constraints);
    return panel;
  }

  public static JPanel createStringSelectionPanel(final IBindedDialog owner, final String caption, final List<String> values, Object props, String fieldName) {
    JPanel panel = new JPanel(new BorderLayout());
    panel.setBorder(new EmptyBorder(2, 2, 2, 2));
    panel.add(new JLabel(caption + ":"), BorderLayout.WEST);
    final TextFieldWithBrowseButton.NoPathCompletion tfNamespace = new TextFieldWithBrowseButton.NoPathCompletion();
    tfNamespace.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String s = CommonChoosers.showDialogStringChooser(owner.getMainComponent(), caption, values);
        if (s == null) {
          return;
        }
        tfNamespace.setText(s);
      }
    });
    panel.add(tfNamespace, BorderLayout.CENTER);
    Property pNamespace = BeanProperty.create(fieldName);
    Property pNamespaceVar = BeanProperty.create("text");
    owner.addBinding(Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE, props, pNamespace, tfNamespace, pNamespaceVar));
    return panel;
  }

  private static GridBagConstraints createConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill) {
    return new GridBagConstraints(gridx, gridy, gridwidth, gridheight, weightx, weighty, anchor, fill, new Insets(0, 0, 0, 0), 0, 0);
  }

  public static class CheckboxDescriptor {
    private Object myObject;
    private String myPropName;
    private String myCheckboxCaption;
    private boolean myIsInternal;

    public CheckboxDescriptor(Object object, String propName, String checkboxCaption) {
      this(object, propName, checkboxCaption, false);
    }

    public CheckboxDescriptor(Object object, String propName, String checkboxCaption, boolean isInternal) {
      this.myObject = object;
      this.myPropName = propName;
      this.myCheckboxCaption = checkboxCaption;
      this.myIsInternal = isInternal;
    }

    public Object getObject() {
      return this.myObject;
    }

    public String getPropName() {
      return this.myPropName;
    }

    public String getCheckboxCaption() {
      return this.myCheckboxCaption;
    }

    public boolean isInternal() {
      return this.myIsInternal;
    }
  }
}
