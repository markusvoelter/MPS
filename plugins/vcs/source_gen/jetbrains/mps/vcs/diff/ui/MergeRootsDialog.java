package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.vcs.diff.MergeContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNodeId;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import javax.swing.JLabel;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;

public class MergeRootsDialog extends BaseDialog implements EditorMessageOwner {
  private MergeContext myMergeContext;
  private IOperationContext myOperationContext;
  private SNodeId myRootId;
  private JPanel myContainer = new JPanel(new BorderLayout());
  private JPanel myTopComponent = new JPanel(new GridLayout(1, 3));
  private JPanel myBottomComponent = new JPanel(new GridLayout(1, 3));
  private DiffEditorComponent myResultEditor;
  private DiffEditorComponent myMineEditor;
  private DiffEditorComponent myRepositoryEditor;
  private DiffEditorComponentsGroup myDiffEditorsGroup = new DiffEditorComponentsGroup();

  public MergeRootsDialog(MergeModelsDialog mergeModelsDialog, MergeContext mergeContext, SNodeId rootId, String rootName) {
    super(mergeModelsDialog, "Merging " + rootName);
    myOperationContext = mergeModelsDialog.getOperationContext();
    myMergeContext = mergeContext;
    myRootId = rootId;
    myMineEditor = addEditor(myMergeContext.getMyModel(), "My Changes");
    myResultEditor = addEditor(myMergeContext.getResultModel(), "Merge Result");
    myRepositoryEditor = addEditor(myMergeContext.getRepositoryModel(), "Repository Changes");
    JSplitPane modelsPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopComponent, myBottomComponent);
    modelsPane.setResizeWeight(1);
    myContainer = new JPanel(new BorderLayout());
    myContainer.add(modelsPane);
    highlightAllChanges();
  }

  private void higlightChange(DiffEditorComponent diffEditor, ModelChange change) {
    ChangeEditorMessage message = new ChangeEditorMessage(diffEditor, change, this) {
      @Override
      public boolean isConflicted() {
        return Sequence.fromIterable(myMergeContext.getConflictedWith(getChange())).isNotEmpty();
      }
    };
    if (message.getNode() == null) {
      return;
    }
    diffEditor.getHighlightManager().mark(message);
  }

  private void highlightAllChanges() {
    for (ModelChange change : ListSequence.fromList(myMergeContext.getChangesForRoot(myRootId))) {
      higlightChange(myResultEditor, change);
      if (myMergeContext.isMyChange(change)) {
        higlightChange(myMineEditor, change);
      } else {
        higlightChange(myRepositoryEditor, change);
      }
    }
    myMineEditor.getHighlightManager().repaintAndRebuildEditorMessages();
    myResultEditor.getHighlightManager().repaintAndRebuildEditorMessages();
    myRepositoryEditor.getHighlightManager().repaintAndRebuildEditorMessages();
  }

  private DiffEditorComponent addEditor(SModel model, String revisionName) {
    SNode node = model.getNodeById(myRootId);
    final DiffEditorComponent result = new DiffEditorComponent(myOperationContext, node);
    result.editNode(node, myOperationContext);
    result.setReadOnly(true);
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(new JLabel(revisionName), BorderLayout.NORTH);
    panel.add(result.getExternalComponent(), BorderLayout.CENTER);
    myTopComponent.add(panel);
    myBottomComponent.add(result.getInspector().getExternalComponent());
    myDiffEditorsGroup.add(result);
    return result;
  }

  protected JComponent getMainComponent() {
    return myContainer;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(10, 10, 1000, 900);
  }

  @BaseDialog.Button(name = "OK", mnemonic = 'O', position = 0, defaultButton = true)
  public void ok() {
    dispose();
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1)
  public void cancel() {
    // TODO revert all changes applying 
    dispose();
  }
}
