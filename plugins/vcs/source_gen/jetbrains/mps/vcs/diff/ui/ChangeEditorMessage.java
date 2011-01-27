package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.messageTargets.EditorMessageWithTarget;
import java.awt.Color;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.errors.MessageStatus;
import java.awt.Graphics;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.errors.messageTargets.MessageTargetEnum;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.errors.messageTargets.ChildrenMessageTarget;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import java.awt.Rectangle;
import jetbrains.mps.ide.util.ColorAndGraphicsUtil;
import jetbrains.mps.vcs.diff.changes.ChangeType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.vcs.diff.changes.AddRootChange;
import jetbrains.mps.vcs.diff.changes.DeleteRootChange;
import jetbrains.mps.vcs.diff.changes.NodeChange;
import jetbrains.mps.vcs.diff.changes.NodeGroupChange;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.vcs.diff.changes.SetPropertyChange;
import jetbrains.mps.errors.messageTargets.PropertyMessageTarget;
import jetbrains.mps.vcs.diff.changes.SetReferenceChange;
import jetbrains.mps.errors.messageTargets.ReferenceMessageTarget;
import java.util.List;
import jetbrains.mps.vcs.diff.changes.InsertNodeGroupChange;
import jetbrains.mps.vcs.diff.changes.DeleteNodeGroupChange;
import jetbrains.mps.vcs.diff.changes.ReplaceNodeGroupChange;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class ChangeEditorMessage extends EditorMessageWithTarget {
  private static final Color CONFLICT_BACKGROUND_COLOR = new Color(245, 164, 164);

  private ModelChange myChange;
  private SModel myThisModel;

  public ChangeEditorMessage(EditorComponent editor, ModelChange change, EditorMessageOwner owner) {
    super(computeNode(editor, change), MessageStatus.OK, computeMessageTarget(editor, change), null, "", owner);
    myChange = change;
    myThisModel = editor.getEditedNode().getModel();
  }

  public boolean isConflicted() {
    return false;
  }

  @Override
  public Color getColor() {
    return (isConflicted() ?
      CONFLICT_BACKGROUND_COLOR :
      myChange.getType().getColor()
    );
  }

  public ModelChange getChange() {
    return myChange;
  }

  @Override
  public boolean isBackground() {
    return true;
  }

  @Override
  public void paint(Graphics graphics, EditorComponent component, EditorCell cell) {
    boolean targetIsNode = myMessageTarget.getTarget() == MessageTargetEnum.NODE;
    if (ObjectUtils.equals(getNode(), cell.getSNode()) && targetIsNode || !(targetIsNode) && !(cell instanceof EditorCell_Collection)) {
      cell.paintSelection(graphics, getColor(), false);
    } else {
      if (myMessageTarget.getTarget() == MessageTargetEnum.CHILDREN) {
        int beginIndex = ((ChildrenMessageTarget) myMessageTarget).getBeginIndex();
        int endIndex = ((ChildrenMessageTarget) myMessageTarget).getEndIndex();
        if (beginIndex != endIndex) {
          assert cell instanceof EditorCell_Collection;
          EditorCell_Collection collectionCell = ((EditorCell_Collection) cell);
          for (int i = beginIndex; i < endIndex; i++) {
            collectionCell.getChildAt(i).paintSelection(graphics, getColor(), false);
          }
          return;
        } else {
          // This is delete node change 
          if (beginIndex != -1) {
            EditorCell_Collection collectionCell = ((EditorCell_Collection) cell);

            if (!(hasChildrenWithDifferentNode(cell))) {
              cell.paintSelection(graphics, getColor(), false);
              return;
            }

            boolean vertical = collectionCell.getCellLayout() instanceof CellLayout_Vertical || cell.getStyle().get(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE);
            Rectangle bounds = cell.getBounds();
            if (vertical) {
              int y;
              if (collectionCell.getChildCount() > beginIndex) {
                y = collectionCell.getChildAt(beginIndex).getY();
              } else {
                y = ((int) collectionCell.getChildAt(collectionCell.getChildCount() - 1).getBounds().getMaxY());
              }
              graphics.setColor(getColor());
              graphics.drawLine(bounds.x, y, bounds.x + bounds.width, y);
            } else {
              // horizontal collection: draw vertical line 
              int x;
              if (collectionCell.getChildCount() > beginIndex) {
                x = collectionCell.getChildAt(beginIndex).getX();
              } else {
                x = ((int) collectionCell.getChildAt(collectionCell.getChildCount() - 1).getBounds().getMaxX());
              }
              int y1 = bounds.y;
              int y2 = bounds.y + bounds.height;

              graphics.setColor(getColor());
              graphics.drawLine(x, y1, x, y2);
              graphics.fillPolygon(new int[]{x, x - 3, x + 3}, new int[]{y1 - 2, y1 - 5, y1 - 5}, 3);
              graphics.fillPolygon(new int[]{x, x - 3, x + 3}, new int[]{y2 + 2, y2 + 5, y2 + 5}, 3);

              graphics.setColor(ColorAndGraphicsUtil.brightenColor(getColor(), 0.8f));
              graphics.drawPolygon(new int[]{x, x - 3, x + 3}, new int[]{y1 - 2, y1 - 5, y1 - 5}, 3);
              graphics.drawPolygon(new int[]{x, x - 3, x + 3}, new int[]{y2 + 2, y2 + 5, y2 + 5}, 3);
            }
            return;
          }

        }
      }
      graphics.setColor(ChangeType.CHANGE.getColor());
      Rectangle bounds = cell.getBounds();
      graphics.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
  }

  private static SNode computeNode(EditorComponent editor, ModelChange change) {
    SNodeId id;
    if (change instanceof AddRootChange || change instanceof DeleteRootChange) {
      id = change.getRootId();
    } else if (change instanceof NodeChange) {
      id = ((NodeChange) change).getAffectedNodeId();
    } else if (change instanceof NodeGroupChange) {
      id = ((NodeGroupChange) change).getParentNodeId();
    } else {
      return null;
    }
    SNode node = editor.getEditedNode().getModel().getNodeById(id);
    return node;
  }

  private static MessageTarget computeMessageTarget(EditorComponent editor, ModelChange change) {
    if (change instanceof AddRootChange || change instanceof DeleteRootChange) {
      return new NodeMessageTarget();
    } else if (change instanceof SetPropertyChange) {
      return new PropertyMessageTarget(((SetPropertyChange) change).getPropertyName());
    } else if (change instanceof SetReferenceChange) {
      return new ReferenceMessageTarget(((SetReferenceChange) change).getRole());
    } else if (change instanceof NodeGroupChange) {
      SModel changeModel = change.getChangeSet().getNewModel();
      NodeGroupChange nodeGroupChange = ((NodeGroupChange) change);
      SModel currentModel = editor.getEditedNode().getModel();
      boolean reversed = changeModel != currentModel;
      if (reversed) {
        changeModel = change.getChangeSet().getOldModel();
      }
      SNodeId parentId = nodeGroupChange.getParentNodeId();
      String role = nodeGroupChange.getRole();
      List<SNode> changeChildren = changeModel.getNodeById(parentId).getChildren(role);
      int changeBegin = -1;
      int changeEnd = -1;

      if (reversed) {
        changeBegin = nodeGroupChange.getBegin();
        changeEnd = nodeGroupChange.getEnd();
      } else {
        if (change instanceof InsertNodeGroupChange) {
          InsertNodeGroupChange insertChange = (InsertNodeGroupChange) change;
          changeBegin = insertChange.getResultBegin();
          changeEnd = insertChange.getResultEnd();
        } else if (change instanceof DeleteNodeGroupChange) {
          changeBegin = ((DeleteNodeGroupChange) change).getResultPosition();
          changeEnd = changeBegin;
        } else if (change instanceof ReplaceNodeGroupChange) {
          ReplaceNodeGroupChange replaceChange = (ReplaceNodeGroupChange) change;
          changeBegin = replaceChange.getResultBegin();
          changeEnd = replaceChange.getResultEnd();
        } else {
          assert false;
        }
      }

      SNodeId beginId = (changeBegin < changeChildren.size() ?
        changeChildren.get(changeBegin).getSNodeId() :
        null
      );
      SNodeId endId = (changeEnd < changeChildren.size() ?
        changeChildren.get(changeEnd).getSNodeId() :
        null
      );
      int currentChildrenSize = currentModel.getNodeById(parentId).getChildren(role).size();

      int beginIndex = (beginId == null ?
        currentChildrenSize :
        SNodeOperations.getIndexInParent(((SNode) currentModel.getNodeById(beginId)))
      );
      int endIndex = (endId == null ?
        currentChildrenSize :
        SNodeOperations.getIndexInParent(((SNode) currentModel.getNodeById(endId)))
      );

      assert 0 <= beginIndex && beginIndex <= endIndex && endIndex < currentChildrenSize;
      return new ChildrenMessageTarget(role, beginIndex, endIndex);
    }
    return null;
  }

  private static boolean hasChildrenWithDifferentNode(EditorCell cell) {
    if (cell instanceof EditorCell_Collection) {
      final EditorCell_Collection collectionCell = (EditorCell_Collection) cell;
      return Sequence.fromIterable(((Iterable<EditorCell>) collectionCell)).any(new IWhereFilter<EditorCell>() {
        public boolean accept(EditorCell child) {
          return child.getSNode() != collectionCell.getSNode();
        }
      });
    } else {
      return false;
    }
  }
}
