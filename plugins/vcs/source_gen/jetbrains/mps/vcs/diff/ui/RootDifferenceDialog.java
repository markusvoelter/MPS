package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.smodel.SNodeId;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import com.intellij.openapi.diff.ex.DiffStatusBar;
import com.intellij.openapi.diff.impl.util.TextDiffType;
import java.awt.Frame;
import javax.swing.JSplitPane;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.smodel.SModel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.vcs.diff.changes.NodeCopier;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.vcs.diff.changes.NodeGroupChange;
import javax.swing.JComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RootDifferenceDialog extends BaseDialog {
  private ModelDifferenceDialog myModelDialog;
  private SNodeId myRootId;
  private DiffEditor myOldEditor;
  private DiffEditor myNewEditor;
  private List<ChangeGroupBuilder> myChangeGroupBuilders = ListSequence.fromList(new ArrayList<ChangeGroupBuilder>());
  private List<ChangeTrapeciumStrip> myTrapeciumStrips = ListSequence.fromList(new ArrayList<ChangeTrapeciumStrip>());
  private DiffEditorsGroup myDiffEditorsGroup = new DiffEditorsGroup();
  private JPanel myTopPanel = new JPanel(new GridBagLayout());
  private JPanel myBottomPanel = new JPanel(new GridBagLayout());
  private JPanel myContainer = new JPanel(new BorderLayout());
  private DiffStatusBar myStatusBar = new DiffStatusBar(TextDiffType.DIFF_TYPES);
  private boolean myClosed;

  public RootDifferenceDialog(ModelDifferenceDialog modelDialog, SNodeId rootId, String rootName) {
    super(modelDialog, "Difference for " + rootName);
    init(modelDialog, rootId);
  }

  public RootDifferenceDialog(ModelDifferenceDialog modelDialog, SNodeId rootId, String rootName, Frame frame) {
    super(frame, "Difference for " + rootName);
    init(modelDialog, rootId);
  }

  private void init(ModelDifferenceDialog modelDialog, SNodeId rootId) {
    // Two constructors and init method is needed because different superconstructors should be invoked 
    myModelDialog = modelDialog;
    myRootId = rootId;

    myOldEditor = addEditor(0, myModelDialog.getChangeSet().getOldModel());
    myNewEditor = addEditor(1, myModelDialog.getChangeSet().getNewModel());

    linkEditors(true);
    linkEditors(false);

    JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopPanel, myBottomPanel);
    splitPane.setResizeWeight(0.7);

    RootDifferenceDialog.MyGoToNeighbourRootActions neighbourActions = new RootDifferenceDialog.MyGoToNeighbourRootActions();
    NextPreviousTraverser neighbourTraverser = new NextPreviousTraverser(myChangeGroupBuilders, myNewEditor.getMainEditor());
    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(neighbourActions.previous(), neighbourActions.next(), Separator.getInstance(), neighbourTraverser.previousAction(), neighbourTraverser.nextAction());
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    neighbourTraverser.setActionToolbar(toolbar);

    myContainer.add(toolbar.getComponent(), BorderLayout.NORTH);
    myContainer.add(splitPane, BorderLayout.CENTER);
    myContainer.add(myStatusBar, BorderLayout.SOUTH);

    highlightAllChanges();
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return DialogDimensionsSettings.generateDialogDimensions(-100, -100);
  }

  private DiffEditor addEditor(int index, SModel model) {
    final DiffEditor result = new DiffEditor(DiffTemporaryModule.getOperationContext(myModelDialog.getProject(), model), model.getNodeById(myRootId), myModelDialog.getContentTitles()[index], index == 0);

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

  private void highlightAllChanges() {
    ListSequence.fromList(myChangeGroupBuilders).visitAll(new IVisitor<ChangeGroupBuilder>() {
      public void visit(ChangeGroupBuilder b) {
        b.invalidate();
      }
    });

    for (ModelChange change : ListSequence.fromList(myModelDialog.getChangesForRoot(myRootId))) {
      higlightChange(myOldEditor, myModelDialog.getChangeSet().getOldModel(), change);
      higlightChange(myNewEditor, myModelDialog.getChangeSet().getNewModel(), change);
    }
    myOldEditor.repaintAndRebuildEditorMessages();
    myNewEditor.repaintAndRebuildEditorMessages();

    int count = ListSequence.fromList(myModelDialog.getChangesForRoot(myRootId)).count();
    myStatusBar.setText((count == 0 ?
      "no differences" :
      NameUtil.formatNumericalString(count, "difference")
    ));
  }

  private void linkEditors(boolean inspector) {
    // create change group builder, trapecium strip and merge buttons painter 
    // 'mine' parameter means mine changeset, 'inspector' - highlight inspector editor component 
    ChangeGroupBuilder changeGroupBuilder = new ChangeGroupBuilder(null, myModelDialog.getChangeSet(), myOldEditor, myNewEditor, inspector);
    ListSequence.fromList(myChangeGroupBuilders).addElement(changeGroupBuilder);
    ChangeTrapeciumStrip strip = new ChangeTrapeciumStrip(changeGroupBuilder);
    GridBagConstraints gbc = new GridBagConstraints(1, 0, 1, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 0, 5, 0), 0, 0);
    ((inspector ?
      myBottomPanel :
      myTopPanel
    )).add(strip, gbc);
    ListSequence.fromList(myTrapeciumStrips).addElement(strip);
    if (!(myModelDialog.getChangeSet().getNewModel().isNotEditable())) {
      DiffButtonsPainter.addTo(this, myOldEditor, changeGroupBuilder, inspector);
      DiffButtonsPainter.addTo(this, myNewEditor, changeGroupBuilder, inspector);
    }
  }

  private void higlightChange(DiffEditor diffEditor, SModel model, ModelChange change) {
    diffEditor.highlightChange(model, change, null);
  }

  public void rehighlight() {
    myModelDialog.rebuildChangeSet();
    myNewEditor.unhighlightAllChanges();
    myOldEditor.unhighlightAllChanges();

    myNewEditor.getMainEditor().rebuildEditorContent();
    myOldEditor.getMainEditor().rebuildEditorContent();

    highlightAllChanges();
  }

  /*package*/ void rollbackChanges(final Iterable<ModelChange> changes) {
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        assert Sequence.fromIterable(changes).isNotEmpty();
        final SModel model = Sequence.fromIterable(changes).first().getChangeSet().getNewModel();
        final NodeCopier nc = new NodeCopier(model);
        Iterable<ModelChange> oppositeChanges = Sequence.fromIterable(changes).select(new ISelector<ModelChange, ModelChange>() {
          public ModelChange select(ModelChange ch) {
            return ch.getOppositeChange();
          }
        });
        for (ModelChange ch : Sequence.fromIterable(oppositeChanges)) {
          if (ch instanceof NodeGroupChange) {
            ((NodeGroupChange) ch).prepare();
          }
        }
        Sequence.fromIterable(oppositeChanges).visitAll(new IVisitor<ModelChange>() {
          public void visit(ModelChange ch) {
            ch.apply(model, nc);
          }
        });
        nc.restoreIds(true);
        rehighlight();
      }
    });
  }

  protected JComponent getMainComponent() {
    return myContainer;
  }

  @Override
  protected int getDisposeOnEscapeCondition() {
    return JComponent.WHEN_IN_FOCUSED_WINDOW;
  }

  @Override
  public void dispose() {
    if (!(myClosed)) {
      myClosed = true;
      myModelDialog.rootDialogClosed();
      myOldEditor.dispose();
      myOldEditor = null;
      myNewEditor.dispose();
      myNewEditor = null;
      ListSequence.fromList(myTrapeciumStrips).visitAll(new IVisitor<ChangeTrapeciumStrip>() {
        public void visit(ChangeTrapeciumStrip s) {
          s.dispose();
        }
      });
      ListSequence.fromList(myTrapeciumStrips).clear();
    }
    myClosed = true;
    super.dispose();
  }

  public class MyGoToNeighbourRootActions extends GoToNeighbourRootActions {
    public MyGoToNeighbourRootActions() {
    }

    protected void goTo(@NotNull SNodeId rootId) {
      myModelDialog.startGoingToNeighbour();
      dispose();
      myModelDialog.invokeRootDifference(rootId);
    }

    @Nullable
    protected SNodeId getNeighbourId(boolean next) {
      return myModelDialog.getNeighbourRoot(myRootId, next);
    }
  }
}
