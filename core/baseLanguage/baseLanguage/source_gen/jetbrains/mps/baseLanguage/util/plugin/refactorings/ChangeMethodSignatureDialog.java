package jetbrains.mps.baseLanguage.util.plugin.refactorings;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.JPanel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.embeddableEditor.EmbeddableEditor;
import java.util.List;
import jetbrains.mps.ide.project.ProjectHelper;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import jetbrains.mps.smodel.ModelAccess;
import javax.swing.JComponent;
import java.awt.BorderLayout;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModelOperations;
import javax.swing.border.TitledBorder;
import java.util.ArrayList;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import com.intellij.openapi.ui.Messages;

public class ChangeMethodSignatureDialog extends BaseDialog {
  private JPanel myPanel;
  private SNode myDeclaration;
  private ChangeMethodSignatureParameters myParameters;
  private IOperationContext myOperationContext;
  private EmbeddableEditor myEditor;
  private List<ChangeMethodSignatureRefactoring> myRefactorings = null;

  public ChangeMethodSignatureDialog(SNode node, IOperationContext operationContext) {
    super(ProjectHelper.toMainFrame(operationContext.getProject()), "Change Method Signature");
    assert ProjectHelper.toMainFrame(operationContext.getProject()) != null;
    this.myOperationContext = operationContext;
    this.myPanel = new JPanel(new GridBagLayout());
    this.myDeclaration = node;
    this.checkMethodHasOverriden(node);
    this.initializeData(this.myDeclaration);
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    c.insets = new Insets(3, 3, 3, 3);
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1;
    c.weighty = 1;
    this.myPanel.add(this.createSingnaturePanel(), c);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent p0) {
        ChangeMethodSignatureDialog.this.myEditor.disposeEditor();
      }
    });
  }

  private void initializeData(final SNode declaration) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        ChangeMethodSignatureDialog.this.myParameters = new ChangeMethodSignatureParameters(declaration);
      }
    });
  }

  private JComponent createSingnaturePanel() {
    JPanel panel = new JPanel(new BorderLayout());
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SNode baseMethodDecalration = ChangeMethodSignatureDialog.this.myParameters.getDeclaration();
        SLinkOperations.setTarget(baseMethodDecalration, "body", SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.StatementList", null), true);
        ChangeMethodSignatureDialog.this.myEditor = new EmbeddableEditor(ChangeMethodSignatureDialog.this.myOperationContext, ChangeMethodSignatureDialog.this.myOperationContext.getModule(), baseMethodDecalration);
        IModule module = ChangeMethodSignatureDialog.this.myOperationContext.getModule();
        if (module instanceof Language) {
          ChangeMethodSignatureDialog.this.myEditor.addLanguageStructureModel((Language) module);
        }
        IModule m = ChangeMethodSignatureDialog.this.myOperationContext.getModule();
        for (Language language : SetSequence.fromSet(m.getDependenciesManager().getAllUsedLanguages())) {
          ChangeMethodSignatureDialog.this.myEditor.addLanguage(language);
        }
        SModel model = ChangeMethodSignatureDialog.this.myDeclaration.getModel();
        for (SModelReference imported : ListSequence.fromList(SModelOperations.getImportedModelUIDs(model))) {
          ChangeMethodSignatureDialog.this.myEditor.addModel(imported);
        }
      }
    });
    panel.setBorder(new TitledBorder("Method signature"));
    panel.add(this.myEditor.getComponenet());
    return panel;
  }

  @BaseDialog.Button(position = 0, name = "Refactor", mnemonic = 'R', defaultButton = true)
  public void onOk() {
    final List<SNode> methodsToRefactor = MethodRefactoringUtils.findOverridingMethods(this.myDeclaration, this.myOperationContext);
    ListSequence.fromList(methodsToRefactor).addElement(myDeclaration);
    myRefactorings = ListSequence.fromList(new ArrayList<ChangeMethodSignatureRefactoring>());
    for (SNode method : ListSequence.fromList(methodsToRefactor)) {
      ListSequence.fromList(myRefactorings).addElement(new ChangeMethodSignatureRefactoring(this.myParameters, method));
    }
    this.dispose();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C', defaultButton = false)
  public void onCancel() {
    this.dispose();
  }

  public List<ChangeMethodSignatureRefactoring> getAllRefactorings() {
    return myRefactorings;
  }

  protected JPanel getMainComponent() {
    return this.myPanel;
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(100, 200, 600, 500);
  }

  private void checkMethodHasOverriden(final SNode node) {
    final Wrappers._T<SNode> baseMethod = new Wrappers._T<SNode>();
    final Wrappers._T<String> message = new Wrappers._T<String>("");
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        baseMethod.value = BaseMethodDeclaration_Behavior.call_getBaseMethod_5014346297260519893(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"));
        if (baseMethod.value != null) {
          message.value = "Method " + node.toString() + " overrides method from " + SPropertyOperations.getString(SNodeOperations.cast(SNodeOperations.getParent(baseMethod.value), "jetbrains.mps.baseLanguage.structure.Classifier"), "name") + ".\n";
          message.value += "Do you want to change signature of this method instead?";
        }
      }
    });
    if (baseMethod.value != null) {
      int result = Messages.showYesNoDialog(ProjectHelper.toMainFrame(this.myOperationContext.getProject()), message.value, "Warinig", null);
      if (result == 0) {
        this.myDeclaration = baseMethod.value;
      }
    }
  }
}
