package jetbrains.mps.vcs.diff.merge.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.vcs.diff.merge.MergeContext;
import jetbrains.mps.vcs.diff.ui.ChangeEditorMessage;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNodeId;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import jetbrains.mps.vcs.diff.ui.DiffEditor;
import java.util.List;
import jetbrains.mps.vcs.diff.ui.ChangeGroupBuilder;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.vcs.diff.ui.DiffEditorsGroup;
import jetbrains.mps.vcs.diff.merge.MergeContextState;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.Sequence;
import javax.swing.JSplitPane;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.vcs.diff.ui.ChangeTrapeciumStrip;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MergeRootsDialog extends BaseDialog {
  private MergeContext myMergeContext;
  private ChangeEditorMessage.ConflictChecker myConflictChecker;
  private MergeModelsDialog myModelsDialog;
  private IOperationContext myOperationContext;
  private SNodeId myRootId;
  private JPanel myContainer = new JPanel(new BorderLayout());
  private JPanel myTopPanel = new JPanel(new GridBagLayout());
  private JPanel myBottomPanel = new JPanel(new GridBagLayout());
  private DiffEditor myResultEditor;
  private DiffEditor myMineEditor;
  private DiffEditor myRepositoryEditor;
  private List<ChangeGroupBuilder> myChangeGroupBuilders = ListSequence.fromList(new ArrayList<ChangeGroupBuilder>());
  private DiffEditorsGroup myDiffEditorsGroup = new DiffEditorsGroup();
  private MergeContextState myStateToRestore;

  public MergeRootsDialog(MergeModelsDialog mergeModelsDialog, MergeContext mergeContext, SNodeId rootId, String rootName) {
    super(mergeModelsDialog, "Merging " + rootName);
    myConflictChecker = new ChangeEditorMessage.ConflictChecker() {
      public boolean isChangeConflicted(ModelChange ch) {
        return Sequence.fromIterable(myMergeContext.getConflictedWith(ch)).isNotEmpty();
      }
    };
    myModelsDialog = mergeModelsDialog;
    myOperationContext = mergeModelsDialog.getOperationContext();
    myMergeContext = mergeContext;
    myRootId = rootId;
    myStateToRestore = myMergeContext.getCurrentState();

    myMineEditor = addEditor(0, myMergeContext.getMyModel());
    myResultEditor = addEditor(1, myMergeContext.getResultModel());
    myRepositoryEditor = addEditor(2, myMergeContext.getRepositoryModel());

    linkEditors(true, false);
    linkEditors(false, false);
    linkEditors(true, true);
    linkEditors(false, true);

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopPanel, myBottomPanel);
    splitPane.setResizeWeight(0.7);
    MergeRootsDialog.MyGoToNeighbourRootActions neighbourActions = new MergeRootsDialog.MyGoToNeighbourRootActions();
    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new ApplyNonConflictsForRoot(myMergeContext, this), Separator.getInstance(), neighbourActions.previous(), neighbourActions.next());
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    toolbar.updateActionsImmediately();

    myContainer.add(toolbar.getComponent(), BorderLayout.NORTH);
    myContainer.add(splitPane, BorderLayout.CENTER);
    highlightAllChanges();
  }

  private ChangeGroupBuilder createChangeGroupBuilder(boolean mine, boolean inspector) {
    return new ChangeGroupBuilder(myMergeContext, (mine ?
      myMergeContext.getMyChangeSet() :
      myMergeContext.getRepositoryChangeSet()
    ), (mine ?
      myMineEditor :
      myResultEditor
    ), (mine ?
      myResultEditor :
      myRepositoryEditor
    ), inspector);
  }

  public void rehighlight() {
    myMineEditor.unhighlightAllChanges();
    myResultEditor.unhighlightAllChanges();
    myRepositoryEditor.unhighlightAllChanges();

    if (myResultEditor.getMainEditor().getEditedNode() == null) {
      SNode node = myMergeContext.getResultModel().getNodeById(myRootId);
      if (node != null) {
        myResultEditor.getMainEditor().editNode(node, myOperationContext);
      }
    }

    myResultEditor.getMainEditor().rebuildEditorContent();

    ListSequence.fromList(myChangeGroupBuilders).visitAll(new IVisitor<ChangeGroupBuilder>() {
      public void visit(ChangeGroupBuilder b) {
        b.invalidate();
      }
    });

    highlightAllChanges();
  }

  private void highlightAllChanges() {
    for (ModelChange change : ListSequence.fromList(myMergeContext.getChangesForRoot(myRootId))) {
      if (!(myMergeContext.isChangeResolved(change))) {
        higlightChange(myResultEditor, myMergeContext.getResultModel(), change);
        if (myMergeContext.isMyChange(change)) {
          higlightChange(myMineEditor, myMergeContext.getMyModel(), change);
        } else {
          higlightChange(myRepositoryEditor, myMergeContext.getRepositoryModel(), change);
        }
      }
    }
    myMineEditor.repaintAndRebuildEditorMessages();
    myResultEditor.repaintAndRebuildEditorMessages();
    myRepositoryEditor.repaintAndRebuildEditorMessages();
  }

  private void higlightChange(DiffEditor diffEditor, SModel model, ModelChange change) {
    diffEditor.highlightChange(model, change, myConflictChecker);
  }

  private void linkEditors(boolean mine, boolean inspector) {
    // create change group builder, trapecium strip and merge buttons painter 
    // 'mine' parameter means mine changeset, 'inspector' - highlight inspector editor component 
    ChangeGroupBuilder changeGroupBuilder = createChangeGroupBuilder(mine, inspector);
    ListSequence.fromList(myChangeGroupBuilders).addElement(changeGroupBuilder);
    ChangeTrapeciumStrip strip = new ChangeTrapeciumStrip(changeGroupBuilder);
    JPanel panel = (inspector ?
      myBottomPanel :
      myTopPanel
    );
    GridBagConstraints gbc = new GridBagConstraints((mine ?
      1 :
      3
    ), 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0);
    panel.add(strip, gbc);
    MergeButtonsPainter.addTo(this, (mine ?
      myMineEditor :
      myRepositoryEditor
    ), changeGroupBuilder, inspector);
  }

  private DiffEditor addEditor(int index, SModel model) {
    final DiffEditor result = new DiffEditor(myOperationContext, model.getNodeById(myRootId), myModelsDialog.getContentTitles()[index]);

    GridBagConstraints gbc = new GridBagConstraints(index * 2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, (index == 0 ?
      5 :
      0
    ), 5, (index == 2 ?
      5 :
      0
    )), 0, 0);
    myTopPanel.add(result.getTopComponent(), gbc);
    myBottomPanel.add(result.getInspector().getExternalComponent(), gbc);

    myDiffEditorsGroup.add(result);
    return result;
  }

  public SNodeId getRootId() {
    return myRootId;
  }

  /*package*/ MergeModelsDialog getModelsDialog() {
    return myModelsDialog;
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
    MergeConfirmation.showMergeConfirmationAndTakeAction(this, myMergeContext, myMergeContext.getChangesForRoot(myRootId), new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        myMergeContext.applyAllChangesForNonConflictingRoots();
      }
    }, new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        saveAndClose();
      }
    });
  }

  public void saveAndClose() {
    myStateToRestore = null;
    dispose();
  }

  @BaseDialog.Button(name = "Cancel", mnemonic = 'C', position = 1)
  public void cancel() {
    dispose();
  }

  @Override
  public void dispose() {
    if (myStateToRestore == null) {
      myModelsDialog.rebuildLater();
    } else {
      myMergeContext.restoreState(myStateToRestore);
    }
    myModelsDialog.rootsDialogClosed();
    super.dispose();
  }

  private class MyGoToNeighbourRootActions extends GoToNeighbourRootActions {
    public MyGoToNeighbourRootActions() {
    }

    protected void goTo(@NotNull SNodeId rootId) {
      saveAndClose();
      myModelsDialog.invokeMergeRoots(rootId);
    }

    @Nullable
    protected SNodeId getNeighbourId(boolean next) {
      return myModelsDialog.getNeighbourRoot(myRootId, next);
    }
  }
}
