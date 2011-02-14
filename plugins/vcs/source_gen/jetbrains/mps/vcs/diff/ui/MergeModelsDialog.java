package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.ide.dialogs.BaseDialog;
import javax.swing.Icon;
import com.intellij.openapi.util.IconLoader;
import jetbrains.mps.ide.projectPane.Icons;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.vcs.diff.MergeContext;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import jetbrains.mps.smodel.SModel;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import javax.swing.JScrollPane;
import javax.swing.JComponent;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNodeId;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.ui.MPSTreeNode;
import javax.swing.tree.TreeNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.ide.ui.MPSTree;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import javax.swing.JPopupMenu;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.icons.IconManager;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.awt.Color;
import jetbrains.mps.vcs.diff.changes.AddRootChange;
import com.intellij.openapi.vcs.FileStatus;
import jetbrains.mps.vcs.diff.changes.DeleteRootChange;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;

public class MergeModelsDialog extends BaseDialog {
  public static final Icon APPLY_NON_CONFLICTS = IconLoader.getIcon("/diff/applyNotConflicts.png", Icons.class);

  private Project myProject;
  private IOperationContext myOperationContext;
  private MergeContext myMergeContext;
  private MergeModelsDialog.MergeModelsTree myMergeModelsTree;
  private JPanel myPanel = new JPanel(new BorderLayout());
  private boolean myApplyChanges = false;
  private boolean myRootsDialogInvoked = false;
  private String[] myContentTitles;

  public MergeModelsDialog(Project project, IOperationContext operationContext, SModel baseModel, SModel mineModel, SModel repositoryModel, String[] contentTitles) {
    super(WindowManager.getInstance().getFrame(project), "Merging " + SModelOperations.getModelName(baseModel));
    assert contentTitles.length == 3;
    myContentTitles = contentTitles;
    myProject = project;
    myOperationContext = operationContext;
    myMergeContext = new MergeContext(baseModel, mineModel, repositoryModel);
    myMergeModelsTree = new MergeModelsDialog.MergeModelsTree();

    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new MergeNonConflictingRoots(myMergeContext, this), Separator.getInstance(), AcceptYoursTheirs.yoursInstance(this), AcceptYoursTheirs.theirsInstance(this));
    ActionToolbar toolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, actionGroup, true);
    toolbar.updateActionsImmediately();
    myPanel.add(toolbar.getComponent(), BorderLayout.NORTH);
    myPanel.add(new JScrollPane(myMergeModelsTree), BorderLayout.CENTER);
  }

  public MergeModelsDialog(Project project, IOperationContext operationContext, SModel baseModel, SModel mineModel, SModel repositoryModel) {
    this(project, operationContext, baseModel, mineModel, repositoryModel, new String[]{"Local Version", "Merge Result", "Remote Version"});
  }

  protected JComponent getMainComponent() {
    return myPanel;
  }

  @Override
  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(10, 10, 500, 700);
  }

  @BaseDialog.Button(position = 0, name = "OK", mnemonic = 'O', defaultButton = true)
  public void ok() {
    myApplyChanges = true;
    dispose();
  }

  @BaseDialog.Button(position = 1, name = "Cancel", mnemonic = 'C')
  public void cancel() {
    dispose();
  }

  public SModel getResultModel() {
    return (myApplyChanges ?
      myMergeContext.getResultModel() :
      null
    );
  }

  /*package*/ void rebuildLater() {
    myMergeModelsTree.rebuildLater();
  }

  /*package*/ IOperationContext getOperationContext() {
    return myOperationContext;
  }

  @Nullable
  public SNodeId getPreviousRoot(@NotNull SNodeId rootId) {
    return getNeighbourRoot(rootId, false);
  }

  @Nullable
  public SNodeId getNextRoot(@NotNull SNodeId rootId) {
    return getNeighbourRoot(rootId, true);
  }

  @Nullable
  private SNodeId getNeighbourRoot(@NotNull SNodeId rootId, boolean next) {
    MPSTreeNode modelTreeNode = myMergeModelsTree.getRootNode();
    MergeModelsDialog.RootTreeNode rootTreeNode = findRootTreeNode(rootId);
    if (rootTreeNode == null) {
      return null;
    } else {
      TreeNode neighbour = (next ?
        modelTreeNode.getChildAfter(rootTreeNode) :
        modelTreeNode.getChildBefore(rootTreeNode)
      );
      if (neighbour == null) {
        return null;
      } else {
        return ((MergeModelsDialog.RootTreeNode) neighbour).myRootId;
      }
    }
  }

  private MergeModelsDialog.RootTreeNode findRootTreeNode(SNodeId rootId) {
    MPSTreeNode modelTreeNode = myMergeModelsTree.getRootNode();
    for (MPSTreeNode rootTreeNode : Sequence.fromIterable(modelTreeNode)) {
      if (rootId.equals(((MergeModelsDialog.RootTreeNode) rootTreeNode).myRootId)) {
        return ((MergeModelsDialog.RootTreeNode) rootTreeNode);
      }
    }
    return null;
  }

  public void invokeMergeRoots(final SNodeId rootId) {
    final MergeModelsDialog.RootTreeNode rootTreeNode = findRootTreeNode(rootId);
    assert rootTreeNode != null;
    if (myRootsDialogInvoked) {
      return;
    }
    myRootsDialogInvoked = true;
    final Wrappers._T<MergeRootsDialog> mergeRootsDialog = new Wrappers._T<MergeRootsDialog>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        mergeRootsDialog.value = new MergeRootsDialog(MergeModelsDialog.this, myMergeContext, rootId, rootTreeNode.myPresentations);
      }
    });
    mergeRootsDialog.value.showDialog();
    mergeRootsDialog.value.toFront();
  }

  public void acceptVersionForSelectedRoots(boolean mine) {
    final List<ModelChange> changesToApply = ListSequence.fromList(new ArrayList<ModelChange>());
    final List<ModelChange> changesToExclude = ListSequence.fromList(new ArrayList<ModelChange>());
    for (MergeModelsDialog.RootTreeNode rtn : Sequence.fromIterable(Sequence.fromArray(myMergeModelsTree.getSelectedNodes(MergeModelsDialog.RootTreeNode.class, null)))) {
      for (ModelChange change : ListSequence.fromList(myMergeContext.getChangesForRoot(rtn.myRootId))) {
        if (!(myMergeContext.isChangeResolved(change))) {
          if (mine == myMergeContext.isMyChange(change)) {
            ListSequence.fromList(changesToApply).addElement(change);
          } else {
            ListSequence.fromList(changesToExclude).addElement(change);
          }
        }
      }
    }
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        ListSequence.fromList(changesToApply).visitAll(new IVisitor<ModelChange>() {
          public void visit(ModelChange ch) {
            myMergeContext.applyChange(ch);
          }
        });
        ListSequence.fromList(changesToExclude).visitAll(new IVisitor<ModelChange>() {
          public void visit(ModelChange ch) {
            myMergeContext.excludeChange(ch);
          }
        });
        myMergeModelsTree.rebuildNow();
      }
    });
  }

  /*package*/ void rootsDialogClosed() {
    myRootsDialogInvoked = false;
  }

  /*package*/ String[] getContentTitles() {
    return myContentTitles;
  }

  public static boolean isNewMergeEnabled() {
    return "true".equals(System.getProperty("mps.newmerge"));
  }

  private class MergeModelsTree extends MPSTree {
    public MergeModelsTree() {
      rebuildNow();
      expandAll();
    }

    protected MPSTreeNode rebuild() {
      final MergeModelsDialog.ModelTreeNode modelNode = new MergeModelsDialog.ModelTreeNode();
      SetSequence.fromSet(myMergeContext.getAffectedRoots()).<MergeModelsDialog.RootTreeNode>select(new ISelector<SNodeId, MergeModelsDialog.RootTreeNode>() {
        public MergeModelsDialog.RootTreeNode select(SNodeId r) {
          return new MergeModelsDialog.RootTreeNode(r);
        }
      }).sort(new ISelector<MergeModelsDialog.RootTreeNode, Comparable<?>>() {
        public Comparable<?> select(MergeModelsDialog.RootTreeNode rtn) {
          return rtn.myPresentations;
        }
      }, true).visitAll(new IVisitor<MergeModelsDialog.RootTreeNode>() {
        public void visit(MergeModelsDialog.RootTreeNode rtn) {
          modelNode.add(rtn);
        }
      });
      return modelNode;
    }

    @Override
    public void rebuildNow() {
      super.rebuildNow();
      expandAll();
    }

    @Override
    protected JPopupMenu createPopupMenu(MPSTreeNode node) {
      if (node instanceof MergeModelsDialog.RootTreeNode) {
        DefaultActionGroup actionGroup = ActionUtils.groupFromActions(new MergeModelsDialog.MergeRootsAction(((MergeModelsDialog.RootTreeNode) node).myRootId), AcceptYoursTheirs.yoursInstance(MergeModelsDialog.this), AcceptYoursTheirs.theirsInstance(MergeModelsDialog.this));
        return ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, actionGroup).getComponent();
      } else {
        return null;
      }
    }
  }

  private class ModelTreeNode extends MPSTreeNode {
    public ModelTreeNode() {
      super(myOperationContext);
      setNodeIdentifier("model");
    }

    @Override
    protected void doUpdatePresentation() {
      setText(myMergeContext.getResultModel().getLongName());
      setIcon(Icons.MODEL_ICON);
    }
  }

  private class RootTreeNode extends MPSTreeNode {
    private SNodeId myRootId;
    private String myPresentations;

    public RootTreeNode(SNodeId rootId) {
      super(myOperationContext);
      myRootId = rootId;
      setNodeIdentifier("" + myRootId);

      List<String> presentations = ListSequence.fromList(new ArrayList<String>());
      Icon icon = null;
      for (SModel model : Sequence.fromIterable(Sequence.fromArray(new SModel[]{myMergeContext.getBaseModel(), myMergeContext.getMyModel(), myMergeContext.getRepositoryModel()}))) {
        SNode root = model.getNodeById(myRootId);
        if (root != null) {
          String presentation = root.getPresentation();
          if (!(ListSequence.fromList(presentations).contains(presentation))) {
            ListSequence.fromList(presentations).addElement(presentation);
          }
          if (icon == null) {
            icon = IconManager.getIconFor(root);
          }
        }
      }
      myPresentations = StringUtils.join(presentations, " / ");
      setIcon(icon);
    }

    @Override
    protected void doUpdatePresentation() {
      List<ModelChange> changes = ListSequence.fromList(myMergeContext.getChangesForRoot(myRootId)).where(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange ch) {
          return !(myMergeContext.isChangeResolved(ch));
        }
      }).toListSequence();
      Iterable<ModelChange> conflictedChanges = ListSequence.fromList(changes).where(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange ch) {
          return Sequence.fromIterable(myMergeContext.getConflictedWith(ch)).isNotEmpty();
        }
      });

      boolean deleted = false;
      if (Sequence.fromIterable(conflictedChanges).isNotEmpty()) {
        setColor(Color.RED);
      } else if (ListSequence.fromList(changes).isEmpty()) {
        deleted = myMergeContext.getResultModel().getNodeById(myRootId) == null;
      } else if (ListSequence.fromList(changes).all(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange ch) {
          return ch instanceof AddRootChange;
        }
      })) {
        setColor(FileStatus.ADDED.getColor());
      } else if (ListSequence.fromList(changes).all(new IWhereFilter<ModelChange>() {
        public boolean accept(ModelChange ch) {
          return ch instanceof DeleteRootChange;
        }
      })) {
        setColor(FileStatus.DELETED.getColor());
      } else if (ListSequence.fromList(changes).isNotEmpty()) {
        setColor(FileStatus.MODIFIED.getColor());
      }

      int conflictedCount = Sequence.fromIterable(conflictedChanges).count();
      int nonConflctedCount = ListSequence.fromList(changes).count() - conflictedCount;
      if (Sequence.fromIterable(conflictedChanges).isNotEmpty()) {
        setAdditionalText(nonConflctedCount + "+" + conflictedCount);
        setTooltipText(NameUtil.formatNumericalString(nonConflctedCount, "non-conficting change") + ", " + NameUtil.formatNumericalString(conflictedCount, "conficting change"));
      } else if (ListSequence.fromList(changes).isNotEmpty()) {
        setAdditionalText("" + nonConflctedCount);
        setTooltipText(NameUtil.formatNumericalString(nonConflctedCount, "non-conficting change"));
      }

      List<String> presentations = ListSequence.fromList(new ArrayList<String>());
      Icon icon = null;
      for (SModel model : Sequence.fromIterable(Sequence.fromArray(new SModel[]{myMergeContext.getBaseModel(), myMergeContext.getMyModel(), myMergeContext.getRepositoryModel()}))) {
        SNode root = model.getNodeById(myRootId);
        if (root != null) {
          String presentation = root.getPresentation();
          if (!(ListSequence.fromList(presentations).contains(presentation))) {
            ListSequence.fromList(presentations).addElement(presentation);
          }
          if (icon == null) {
            icon = IconManager.getIconFor(root);
          }
        }
      }
      setText((deleted ?
        String.format("<html><s>%s</s></html>", myPresentations) :
        myPresentations
      ));
    }

    @Override
    public void doubleClick() {
      invokeMergeRoots(myRootId);
    }
  }

  /*package*/ class MergeRootsAction extends BaseAction {
    private SNodeId myRootId;

    public MergeRootsAction(SNodeId rootId) {
      super("Merge Root");
      myRootId = rootId;
      setDisableOnNoProject(false);
    }

    protected void doExecute(AnActionEvent event, Map<String, Object> map) {
      invokeMergeRoots(myRootId);
    }
  }
}
