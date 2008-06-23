package jetbrains.mps.nodeEditor;

import java.awt.*;


/**
 * Author: Sergey Dmitriev.
 * Time: Nov 6, 2003 11:34:47 AM
 */
public class NodeEditorActions {

  private static EditorCell_Collection findHorizontalCollection(EditorCell cell) {
    EditorCell_Collection parentCell = (EditorUtil.isCollection(cell)) ? (EditorCell_Collection) cell : cell.getParent();

    if (parentCell == null) return null;

    while (!(parentCell.getCellLayout() instanceof CellLayout_Horizontal || parentCell.getCellLayout() instanceof CellLayout_Flow)) {
      EditorCell firstCell = parentCell.firstCell();
      if (EditorUtil.isCollection(firstCell)) parentCell = (EditorCell_Collection) firstCell;
      //else return firstCell;
    }

    EditorCell_Collection prev_parentCell = parentCell;

    while (parentCell != null && (parentCell.getCellLayout() instanceof CellLayout_Horizontal || parentCell.getCellLayout() instanceof CellLayout_Flow)) {
      prev_parentCell = parentCell;
      parentCell = parentCell.getParent();
    }
    return prev_parentCell;
  }


  public static class LEFT extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      AbstractEditorComponent nodeEditorComponent = context.getNodeEditorComponent();
      EditorCell selection = nodeEditorComponent.getDeepestSelectedCell();
      nodeEditorComponent.clearSelectionStack();
      EditorCell target = findTarget(selection);
      nodeEditorComponent.changeSelection(target);
      if (selection.isPunctuationLayout() && target instanceof EditorCell_Label) {
        EditorCell_Label targetLabel = (EditorCell_Label) target;
        TextLine textLine = targetLabel.getRenderedTextLine();
        int textLength = textLine.getText().length();
        if (textLength > 0) {
          if (textLine == targetLabel.getNullTextLine()) {
            textLine.setCaretPosition(0);
          } else {
            textLine.setCaretPosition(textLength -1);
          }
        } else {
          if (this.canExecute(context)) this.execute(context);
        }
      } else
      if (target instanceof EditorCell_Label) {
        ((EditorCell_Label) target).end();
      }
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection parent = cell.getParent();
      if (parent == null) /*{
        return (EditorUtil.isCollection(cell))?findTarget((EditorCell_Collection) cell):null;
      }*/  return null;
      EditorCell nextToLeft = parent.findNextToLeft(cell);
      if (nextToLeft != null) return nextToLeft;

      //to the prev line:
      EditorCell_Collection parentCollection = parent.getParent();
      if (parentCollection == null) return null;
      EditorCell target = parentCollection.getPrevCell(parent);
      while (target != null && !(EditorUtil.isCollection(target) || target.isSelectable())) {
          target = parentCollection.getPrevCell(target);
      }

      while (target == null || !(EditorUtil.isCollection(target) || target.isSelectable())) {
        parent = parentCollection;
        parentCollection = parentCollection.getParent();
        if (parentCollection == null) return null;
        target = parentCollection.getPrevCell(parent);
        while (target != null && !(EditorUtil.isCollection(target) || target.isSelectable())) {
          target = parentCollection.getPrevCell(target);
        }
      }

      if (!(EditorUtil.isCollection(target))) return target;

      return EditorUtil.findLastSelectableCell((EditorCell_Collection) target);
      //---
    }
  }

  public static class CTRL_HOME extends EditorCellAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(findTarget(selection));
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection rootCell = EditorUtil.isCollection(cell)?(EditorCell_Collection) cell : cell.getParent();
      while (rootCell != null && rootCell.getParent() != null) {
        rootCell = rootCell.getParent();
      }
      return EditorUtil.findFirstSelectableCell(rootCell);
    }

  }


  public static class CTRL_END extends EditorCellAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(findTarget(selection));
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection rootCell = EditorUtil.isCollection(cell)?(EditorCell_Collection) cell : cell.getParent();
      while (rootCell != null && rootCell.getParent() != null) {
        rootCell = rootCell.getParent();
      }
      return EditorUtil.findLastSelectableCell(rootCell);
    }

  }


  public static class HOME extends EditorCellAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      EditorCell target = findTarget(selection);
      if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        label.moveCaret(0 - label.getCaretPosition(), false);
        context.getNodeEditorComponent().resetLastCaretX();
      }
      context.getNodeEditorComponent().changeSelection(target);
    }

    private EditorCell findTarget(EditorCell cell) {
      return EditorUtil.findRightmostOrLeftmostSelectableCell(cell, true);
    }

  }

  public static class END extends EditorCellAction {

    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      EditorCell target = findTarget(selection);
      if (target instanceof EditorCell_Label) {
        EditorCell_Label label = (EditorCell_Label) target;
        label.moveCaret(label.getText().length() - label.getCaretPosition(), false);
        context.getNodeEditorComponent().resetLastCaretX();
      }
      context.getNodeEditorComponent().changeSelection(target);
    }

    private EditorCell findTarget(EditorCell cell) {
      return EditorUtil.findRightmostOrLeftmostSelectableCell(cell, false);
    }

  }


  public static class RIGHT extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
      return selection != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell target = findTarget(selection);
      context.getNodeEditorComponent().changeSelection(target);
      if (target.isPunctuationLayout()) {
        ((EditorCell_Label)target).setCaretPosition(1);
      } else
      if (target instanceof EditorCell_Label) {
        ((EditorCell_Label)target).setCaretPosition(0);
      }
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection parent = cell.getParent();
      if (parent == null) {
        return (EditorUtil.isCollection(cell))?EditorUtil.findFirstSelectableCell((EditorCell_Collection) cell) :null;
      }

      EditorCell nextToRight = parent.findNextToRight(cell);
      if (nextToRight != null) return nextToRight;

      //to the next line:
      EditorCell_Collection parentCollection = parent.getParent();
      if (parentCollection == null) return null;
      EditorCell target = parentCollection.getNextCell(parent);
      while (target != null && !(EditorUtil.isCollection(target) || target.isSelectable())) {
          target = parentCollection.getNextCell(target);
      }

      while (target == null || !(EditorUtil.isCollection(target) || target.isSelectable())) {
        parent = parentCollection;
        parentCollection = parentCollection.getParent();
        if (parentCollection == null) return null;
        target = parentCollection.getNextCell(parent);
        while (target != null && !(EditorUtil.isCollection(target) || target.isSelectable())) {
          target = parentCollection.getNextCell(target);
        }
      }

      if (!(EditorUtil.isCollection(target))) return target;

      return EditorUtil.findFirstSelectableCell((EditorCell_Collection) target);
      //---
    }
  }

    public static class UP extends EditorCellAction {
      public boolean canExecute(EditorContext context) {
        EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
        return selection != null && selection.getParent() != null && findTarget(selection, selection.getCaretX()) != null;
      }

      public void execute(EditorContext context) {
        EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
        context.getNodeEditorComponent().clearSelectionStack();
        int caretX = selection.getCaretX();
        if (context.getNodeEditorComponent().hasLastCaretX()) caretX = context.getNodeEditorComponent().getLastCaretX();
        context.getNodeEditorComponent().saveLastCaretX(caretX);
        EditorCell target = findTarget(selection, caretX);
        target.setCaretX(caretX);
        context.getNodeEditorComponent().changeSelection(target, false);
      }

      private EditorCell findTarget(EditorCell cell, int caretX) {
        return cell.getParent().findNextToUp(caretX, cell.getY() - 1);
      }
    }

  public static class DOWN extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
      return selection != null /*&& selection.getParent() != null*/ && findTarget(selection, selection.getCaretX()) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getDeepestSelectedCell();
      context.getNodeEditorComponent().clearSelectionStack();
      int caretX = selection.getCaretX();
      if (context.getNodeEditorComponent().hasLastCaretX()) caretX = context.getNodeEditorComponent().getLastCaretX();
      context.getNodeEditorComponent().saveLastCaretX(caretX);
      EditorCell target = findTarget(selection, caretX);
      target.setCaretX(caretX);
      context.getNodeEditorComponent().changeSelection(target, false);
    }

    private EditorCell findTarget(EditorCell cell, int caretX) {
       if (cell.getParent() == null) {
        return (EditorUtil.isCollection(cell))?findTarget((EditorCell_Collection) cell, caretX):null;
      }
      return cell.getParent().findNextToDown(caretX, cell.getY() + cell.getHeight());
    }


    private EditorCell findTarget(EditorCell_Collection collection, int caretX) {
      EditorCell target = collection.firstCell();
      while (target != null) {
        if (EditorUtil.isCollection(target)) {
          EditorCell childTarget = findTarget((EditorCell_Collection) target, caretX);
          if (childTarget != null) {
            return childTarget;
          }
        } else if (target.isSelectable()) {
          return target;
        }
        target = collection.findNextToDown(caretX, target.getY());
      }
      return null;
    }
  }

  public static class NEXT extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && context.getNodeEditorComponent().findNextSelectableOrEditableCell(selection, true) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(context.getNodeEditorComponent().findNextSelectableOrEditableCell(selection, true));
    }
  }

  public static class PREV extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && context.getNodeEditorComponent().findPrevSelectableOrEditableCell(selection, true) != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().clearSelectionStack();
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      context.getNodeEditorComponent().changeSelection(context.getNodeEditorComponent().findPrevSelectableOrEditableCell(selection, true));
    }
  }


  private static void navigatePage(EditorContext context, boolean isDown) {
    AbstractEditorComponent editor = context.getNodeEditorComponent();
    EditorCell selection = editor.getSelectedCell();
    Rectangle rect = editor.getVisibleRect();
    int height = (int) rect.getHeight();
    height = isDown ? height : -height;
    int caretX = selection.getCaretX();
    int y = selection.getY() + (selection.getHeight()/2);
    int newY = y + height;
  /*  EditorCell rowCell = editor.getRootCell().findNearestRow(newY);
    EditorCell target = rowCell.findNearestCell(caretX, newY, true);*/
    EditorCell target = editor.findNearestCell(caretX, newY);
    if (target == null) {
      target = isDown ? editor.findLastSelectableCell() : editor.findFirstSelectableCell();
      editor.changeSelection(target);
    } else {
      target.setCaretX(caretX);
      editor.changeSelection(target);
    }
  }

  public static class PAGE_DOWN extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return true;
    }

    public void execute(EditorContext context) {
      navigatePage(context, true);
    }
  }

  public static class PAGE_UP extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return true;
    }

    public void execute(EditorContext context) {
      navigatePage(context, false);
    }
  }

  public static class UP_SPECIAL extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      return selection != null && selection.getParent() != null && findTarget(selection) != null;
    }

    public void execute(EditorContext context) {
      EditorCell selection = context.getNodeEditorComponent().getSelectedCell();
      int caretX = selection.getCaretX();
      context.getNodeEditorComponent().pushSelection(selection);
      EditorCell target = findTarget(selection);
      target.setCaretX(caretX);
      context.getNodeEditorComponent().setSelectionDontClearStack(target, true);
    }

    private EditorCell findTarget(EditorCell cell) {
      EditorCell_Collection parent = cell.getParent();
      while(parent != null) {
        if(parent.isSelectable()) {
          return parent;
        }
        parent = parent.getParent();
      }
      return null;
    }
  }

  public static class DOWN_SPECIAL extends EditorCellAction {
    public boolean canExecute(EditorContext context) {
      return context.getNodeEditorComponent().peekSelection() != null;
    }

    public void execute(EditorContext context) {
      context.getNodeEditorComponent().setSelectionDontClearStack(context.getNodeEditorComponent().popSelection(), true);
    }
  }

}
