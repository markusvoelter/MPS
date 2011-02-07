package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.vcs.diff.MergeContext;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNodeId;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import javax.swing.JLabel;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;

public class MergeRootsDialog extends BaseDialog implements EditorMessageOwner {
  private MergeContext myMergeContext;
  private MergeModelsDialog myModelsDialog;
  private IOperationContext myOperationContext;
  private SNodeId myRootId;
  private JPanel myContainer = new JPanel(new BorderLayout());
  private JPanel myTopComponent = new JPanel(new GridBagLayout());
  private JPanel myBottomComponent = new JPanel(new GridLayout(1, 3));
  private DiffEditorComponent myResultEditor;
  private DiffEditorComponent myMineEditor;
  private DiffEditorComponent myRepositoryEditor;
  private ChangeGroupBuilder myMineBuilder;
  private ChangeGroupBuilder myRepositoryBuilder;
  private ChangeTrapeciumStrip myMineStrip;
  private ChangeTrapeciumStrip myRepositoryStrip;
  private MergeButtonsPainter myMinePainter;
  private MergeButtonsPainter myRepositoryPainter;
  private DiffEditorComponentsGroup myDiffEditorsGroup = new DiffEditorComponentsGroup();

  public MergeRootsDialog(MergeModelsDialog mergeModelsDialog, MergeContext mergeContext, SNodeId rootId, String rootName) {
    super(mergeModelsDialog, "Merging " + rootName);
    myModelsDialog = mergeModelsDialog;
    myOperationContext = mergeModelsDialog.getOperationContext();
    myMergeContext = mergeContext;
    myRootId = rootId;

    myMineEditor = addEditor(0, myMergeContext.getMyModel(), "My Changes");
    myResultEditor = addEditor(1, myMergeContext.getResultModel(), "Merge Result");
    myRepositoryEditor = addEditor(2, myMergeContext.getRepositoryModel(), "Repository Changes");

    myMineBuilder = new ChangeGroupBuilder(myMergeContext, myMergeContext.getMyChangeSet(), myMineEditor, myResultEditor);
    myRepositoryBuilder = new ChangeGroupBuilder(myMergeContext, myMergeContext.getRepositoryChangeSet(), myResultEditor, myRepositoryEditor);

    myMineStrip = addTrapeciumStrip(0, myMineBuilder);
    myRepositoryStrip = addTrapeciumStrip(1, myRepositoryBuilder);
    myMinePainter = MergeButtonsPainter.addTo(this, myMineEditor, myMineBuilder);
    myRepositoryPainter = MergeButtonsPainter.addTo(this, myRepositoryEditor, myRepositoryBuilder);

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopComponent, myBottomComponent);
    splitPane.setResizeWeight(1);
    myContainer = new JPanel(new BorderLayout());
    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new ApplyNonConflictsForRoot(myMergeContext, this));
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    toolbar.updateActionsImmediately();

    myContainer.add(toolbar.getComponent(), BorderLayout.NORTH);
    myContainer.add(splitPane, BorderLayout.CENTER);
    highlightAllChanges();
  }

  public void rehighlight() {
    myMineEditor.unhighlightAllChanges();
    myResultEditor.unhighlightAllChanges();
    myRepositoryEditor.unhighlightAllChanges();

    myResultEditor.rebuildEditorContent();

    myMineBuilder.invalidate();
    myRepositoryBuilder.invalidate();

    highlightAllChanges();

    myMineStrip.repaint();
    myRepositoryStrip.repaint();
    myMinePainter.relayout();
    myRepositoryPainter.relayout();
  }

  private void highlightAllChanges() {
    for (ModelChange change : ListSequence.fromList(myMergeContext.getChangesForRoot(myRootId))) {
      if (!(myMergeContext.isChangeResolved(change))) {
        higlightChange(myResultEditor, change);
        if (myMergeContext.isMyChange(change)) {
          higlightChange(myMineEditor, change);
        } else {
          higlightChange(myRepositoryEditor, change);
        }
      }
    }
    myMineEditor.getHighlightManager().repaintAndRebuildEditorMessages();
    myResultEditor.getHighlightManager().repaintAndRebuildEditorMessages();
    myRepositoryEditor.getHighlightManager().repaintAndRebuildEditorMessages();
  }

  private void higlightChange(DiffEditorComponent diffEditor, ModelChange change) {
    diffEditor.highlightChange(new ChangeEditorMessage(diffEditor, change, diffEditor) {
      @Override
      public boolean isConflicted() {
        return Sequence.fromIterable(myMergeContext.getConflictedWith(getChange())).isNotEmpty();
      }
    });
  }

  private ChangeTrapeciumStrip addTrapeciumStrip(int index, ChangeGroupBuilder changeGroupBuilder) {
    ChangeTrapeciumStrip strip = new ChangeTrapeciumStrip(changeGroupBuilder);
    ((GridBagLayout) myTopComponent.getLayout()).setConstraints(strip, new GridBagConstraints(index * 2 + 1, 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0));
    myTopComponent.add(strip);
    return strip;
  }

  private DiffEditorComponent addEditor(int index, SModel model, String revisionName) {
    SNode node = model.getNodeById(myRootId);
    final DiffEditorComponent result = new DiffEditorComponent(myOperationContext, node);
    result.editNode(node, myOperationContext);
    result.setReadOnly(true);
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(new JLabel(revisionName), BorderLayout.NORTH);
    panel.add(result.getExternalComponent(), BorderLayout.CENTER);

    ((GridBagLayout) myTopComponent.getLayout()).setConstraints(panel, new GridBagConstraints(index * 2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, (index == 0 ?
      5 :
      0
    ), 5, (index == 2 ?
      5 :
      0
    )), 0, 0));
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

  @Override
  public void dispose() {
    myModelsDialog.rebuildLater();
    super.dispose();
  }
}
