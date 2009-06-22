package jetbrains.mps.vcs.diff.ui;

import jetbrains.mps.smodel.*;
import jetbrains.mps.ide.dialogs.BaseDialog;
import jetbrains.mps.ide.dialogs.DialogDimensionsSettings;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.nodeEditor.CellSelectionListener;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.vcs.diff.Merger;
import jetbrains.mps.vcs.diff.Conflict;
import jetbrains.mps.vcs.diff.changes.Change;
import jetbrains.mps.vcs.diff.changes.DeleteNodeChange;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.util.misc.hash.HashSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import com.intellij.ui.ListUtil;
import org.apache.commons.collections.ListUtils;

public class RootMergeDialog extends BaseDialog implements EditorMessageOwner {
  private JPanel myTopComponent;
  private JPanel myBottomComponent;
  private DiffEditorComponent myResultEditorComponent;
  private DiffEditorComponent myChange1EditorComponent;
  private DiffEditorComponent myChange2EditorComponent;
  private SModel myChange1Model;
  private SModel myChange2Model;
  private SModel myResultModel;
  private IOperationContext myContext;
  private JPanel myContainer;
  private Merger myMerger;
  private SNode myRoot;
  private CellSelectionListener myCellSelectionListener = new CellSelectionListener() {
    public void selectionChanged(EditorComponent editor, EditorCell oldSelection, final EditorCell newSelection) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          if (newSelection != null && newSelection.getSNode() != null) {
            SNode sNode;
            sNode = myChange1Model.getNodeById(newSelection.getSNode().getSNodeId());
            myChange1EditorComponent.inspect(sNode);
            sNode = myResultModel.getNodeById(newSelection.getSNode().getSNodeId());
            myResultEditorComponent.inspect(sNode);
            sNode = myChange2Model.getNodeById(newSelection.getSNode().getSNodeId());
            myChange2EditorComponent.inspect(sNode);
          }
        }
      });

    }
  };


  public RootMergeDialog(IOperationContext context, SModel change1, SModel change2) {
    super(context.getMainFrame(), "Merge");
    myContext = context;
    myChange1Model = change1;
    myChange2Model = change2;
  }

  protected JComponent getMainComponent() {
    return myContainer;
  }

  private DiffEditorComponent addEditor(IOperationContext context, SNode node, String revisionName) {
    DiffEditorComponent result = new DiffEditorComponent(context, node) {
      @Override
      public void configureBlock(ChangesBlock block) {
        JComponent panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.setSize(20, 10);
        panel.add(new ApplyMenu(block.getChanges()));
        panel.add(new ExcludeMenu(block.getChanges()));
        block.addMenu(panel);
      }
    };
    result.editNode(node, context);
    result.setEditable(false);
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(new JLabel(revisionName), BorderLayout.NORTH);
    panel.add(result.getExternalComponent(), BorderLayout.CENTER);
    myTopComponent.add(panel);
    myBottomComponent.add(result.getInspector().getExternalComponent());
    result.addCellSelectionListener(myCellSelectionListener);
    return result;
  }

  public void init(final SNode node, Merger merger) {
    myRoot = node;
    myMerger = merger;
    final SNode[] change1Node = new SNode[1];
    final SNode[] resultNode = new SNode[1];
    final SNode[] change2Node = new SNode[1];

    merger.setPreviewMode(true);
    merger.rebuldResultModel();

    final SModel resultModel = merger.getResultModel();

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        change1Node[0] = myChange1Model.getRootByName(node.getName());
        resultNode[0] = resultModel.getRootByName(node.getName());
        change2Node[0] = myChange2Model.getRootByName(node.getName());
      }
    });

    myTopComponent = new JPanel(new GridLayout(1, 3));
    myBottomComponent = new JPanel(new GridLayout(1, 3));

    for (Change conflict : merger.getConflictedChanges()) {
      conflict.setError(true);
    }

    myChange1EditorComponent = addEditor(myContext, change1Node[0], "");
    myResultEditorComponent = addEditor(myContext, resultNode[0], "");
    myChange2EditorComponent = addEditor(myContext, change2Node[0], "");

    rebuildChangeBlocks();

    JSplitPane modelsPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, myTopComponent, myBottomComponent);
    modelsPane.setResizeWeight(1);
    myContainer = new JPanel(new BorderLayout());
    myContainer.add(modelsPane);
    myContainer.add(createControlsPanel(), BorderLayout.PAGE_START);
  }

  private Component createControlsPanel() {
    JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    controlPanel.add(new JButton(new AbstractAction("Revert all") {

      public void actionPerformed(ActionEvent e) {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            Set<SNodeId> ids = collectRootIds();
            for (Change change: new ArrayList<Change>(myMerger.getExcludedChanges())) {
              if (ids.contains(change.getAffectedNodeId())) {
                myMerger.includeChange(change);
              }
            }

            for (Change change: new ArrayList<Change>(myMerger.getApplyedChanges())) {
              if (ids.contains(change.getAffectedNodeId())) {
                myMerger.getApplyedChanges().remove(change);
              }
            }
            rebuildChangeBlocks();
          }
        });
      }
    }));

    controlPanel.add(new JButton(new AbstractAction("Apply all") {

      public void actionPerformed(ActionEvent e) {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {

          public void run() {
            Set<SNodeId> ids = collectRootIds();

            ArrayList<Change> changes = new ArrayList<Change>();
            changes.addAll(myMerger.getBaseMyneChange());
            changes.addAll(myMerger.getBaseRepoChange());

            changes.removeAll(myMerger.getExcludedChanges());
            for (Conflict conflict: myMerger.getUnresolvedConflicts()) {
              changes.remove(conflict.getC1());
              changes.remove(conflict.getC2());
            }

            for (Change change: changes) {
              if (ids.contains(change.getAffectedNodeId())) {
                myMerger.getApplyedChanges().add(change);
              }
            }
            rebuildChangeBlocks();
          }
        });
      }
    }));

    return controlPanel;
  }

  private Set<SNodeId> collectRootIds() {
    Set<SNodeId> ids = new HashSet<SNodeId>();
    addNodeIds(ids, myChange1Model);
    addNodeIds(ids, myResultModel);
    addNodeIds(ids, myChange2Model);
    return ids;
  }

  private void addNodeIds(Set<SNodeId> ids, SModel model) {
    SNode change1Node = model.getRootByName(myRoot.getName());
    if (change1Node != null) {
      ids.add(change1Node.getSNodeId());
      for (SNode node: change1Node.getDescendants()) {
        ids.add(node.getSNodeId());
      }
    }
  }

  public DialogDimensionsSettings.DialogDimensions getDefaultDimensionSettings() {
    return new DialogDimensionsSettings.DialogDimensions(10, 10, 1000, 900);
  }

  @Button(name = "Close", position = 0, defaultButton = true)
  public void onClose() {
    dispose();
  }

  class ApplyMenu extends JLabel {
    private List<ChangeEditorMessage> myChanges;

    public ApplyMenu(List<ChangeEditorMessage> changes) {
      super(Icons.APPLY);
      myChanges = changes;

      setToolTipText("Apply Changes");

      setPreferredSize(new Dimension(getWidth(), getHeight()));
      setSize(getWidth(), getHeight());

      addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          revert();
        }
      });
    }

    public int getWidth() {
      return getIcon().getIconWidth();
    }

    public int getHeight() {
      return getIcon().getIconHeight();
    }

    protected void revert() {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {

        public void run() {
          for (ChangeEditorMessage m : myChanges) {
            if (myMerger.getConflictedChanges().contains(m.getChange())) {
              for (Change ch : myMerger.getConflictsOf(m.getChange())) {
                myMerger.excludeChange(ch);
              }
            }
            myMerger.getApplyedChanges().add(m.getChange());
          }
        }
      });

      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          rebuildChangeBlocks();
        }
      });

    }

  }

  class ExcludeMenu extends JLabel {
    private List<ChangeEditorMessage> myChanges;

    public ExcludeMenu(List<ChangeEditorMessage> changes) {
      super(Icons.EXCLUDE);
      myChanges = changes;

      setToolTipText("Exclude Changes");

      setPreferredSize(new Dimension(getWidth(), getHeight()));
      setSize(getWidth(), getHeight());

      addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
          exclude();
        }
      });
    }

    public int getWidth() {
      return getIcon().getIconWidth();
    }

    public int getHeight() {
      return getIcon().getIconHeight();
    }

    private void exclude() {
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {

        public void run() {
          for (ChangeEditorMessage m : myChanges) {
            if (myMerger.getConflictedChanges().contains(m.getChange())) {
              for (Change ch : myMerger.getConflictsOf(m.getChange())) {
                myMerger.getApplyedChanges().add(ch);
              }
            }
            myMerger.excludeChange(m.getChange());
          }
        }
      });

      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          rebuildChangeBlocks();
        }
      });

    }

  }

  private void rebuildChangeBlocks() {
    myResultEditorComponent.removeAllChanges();
    myChange1EditorComponent.removeAllChanges();
    myChange2EditorComponent.removeAllChanges();

    myMerger.doRebuild(new Runnable() {
      public void run() {
      }
    });

    myResultModel = myMerger.getResultModel();

    final SNode[] resultNode = new SNode[1];

    ModelAccess.instance().runWriteActionInCommand(new Runnable() {

      public void run() {
        resultNode[0] = myResultModel.getRootByName(myRoot.getName());
      }
    });

    myResultEditorComponent.editNode(resultNode[0], myContext);

    List<Change> myneChange = new ArrayList<Change>(myMerger.getBaseMyneChange());
    myneChange.removeAll(myMerger.getApplyedChanges());
    myneChange.removeAll(myMerger.getExcludedChanges());
    myChange1EditorComponent.hightlight(myneChange, false, false);
    myChange1EditorComponent.makeChangeBlocks();

    ArrayList<Change> removedNodes = new ArrayList<Change>();
    removedNodes.addAll(CollectionUtil.filter(DeleteNodeChange.class, myMerger.getBaseMyneChange()));
    removedNodes.addAll(CollectionUtil.filter(DeleteNodeChange.class, myMerger.getBaseRepoChange()));
    removedNodes.removeAll(myMerger.getExcludedChanges());
    myResultEditorComponent.hightlight(removedNodes, true, false);
    myResultEditorComponent.makeChangeBlocks();

    List<Change> repoChange = new ArrayList<Change>(myMerger.getBaseRepoChange());
    repoChange.removeAll(myMerger.getApplyedChanges());
    repoChange.removeAll(myMerger.getExcludedChanges());
    myChange2EditorComponent.hightlight(repoChange, false, false);
    myChange2EditorComponent.makeChangeBlocks();
  }
}
