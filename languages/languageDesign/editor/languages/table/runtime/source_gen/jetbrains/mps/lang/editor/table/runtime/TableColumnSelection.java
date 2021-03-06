package jetbrains.mps.lang.editor.table.runtime;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.selection.AbstractMultipleSelection;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.util.Map;
import jetbrains.mps.nodeEditor.cells.CellInfo;
import jetbrains.mps.nodeEditor.selection.SelectionStoreException;
import jetbrains.mps.nodeEditor.selection.SelectionRestoreException;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.selection.SelectionInfo;
import jetbrains.mps.nodeEditor.selection.Selection;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.nodeEditor.CellActionType;
import com.intellij.ide.CopyPasteManagerEx;
import jetbrains.mps.ide.datatransfer.SNodeTransferable;
import java.util.Collections;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.nodeEditor.selection.SelectionManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;

public class TableColumnSelection extends AbstractMultipleSelection {
  private static final String COLUMN_NUMBER_PROPERTY = "columnNumber";

  private int myColumnNumber;
  private EditorCell_Table myTableCell;

  public TableColumnSelection(@NotNull EditorComponent editorComponent, Map<String, String> properties, CellInfo cellInfo) throws SelectionStoreException, SelectionRestoreException {
    super(editorComponent);
    if (cellInfo == null) {
      throw new SelectionStoreException("Requred CellInfo parameter is null");
    }
    EditorCell editorCell = cellInfo.findCell(editorComponent);
    if (editorCell instanceof EditorCell_Table) {
      myTableCell = (EditorCell_Table) editorCell;
    } else {
      throw new SelectionRestoreException();
    }
    myColumnNumber = SelectionInfo.Util.getIntProperty(properties, COLUMN_NUMBER_PROPERTY);
    if (myColumnNumber < 0) {
      throw new SelectionStoreException("Only positive column numbers are supported: " + myColumnNumber);
    }
    if (myColumnNumber >= myTableCell.getColumnCount()) {
      throw new SelectionRestoreException();
    }
    initSelectedCells();
  }

  public TableColumnSelection(@NotNull EditorComponent editorComponent, @NotNull EditorCell_Table tableCell, int columnNumber) {
    super(editorComponent);
    myTableCell = tableCell;
    myColumnNumber = columnNumber;
    assert myColumnNumber >= 0;
    assert myColumnNumber < myTableCell.getColumnCount();
    initSelectedCells();
  }

  private void initSelectedCells() {
    setSelectedCells(myTableCell.getColumnCells(myColumnNumber));
  }

  public boolean isSame(Selection another) {
    if (this == another) {
      return true;
    }
    if (another == null || getClass() != another.getClass()) {
      return false;
    }
    TableColumnSelection that = (TableColumnSelection) another;
    if (myTableCell.equals(that.myTableCell)) {
      return false;
    }
    return myColumnNumber == that.myColumnNumber;
  }

  public SelectionInfo getSelectionInfo() throws SelectionStoreException {
    SelectionInfo selectionInto = new SelectionInfo(this.getClass().getName(), ModuleReference.fromString("258bd2f6-0d02-411d-86b2-5a5ea083e6d2(jetbrains.mps.lang.editor.table.runtime)").getModuleFqName());
    selectionInto.setCellInfo(myTableCell.getCellInfo());
    selectionInto.getPropertiesMap().put(COLUMN_NUMBER_PROPERTY, Integer.toString(myColumnNumber));
    return selectionInto;
  }

  @Override
  public void executeAction(CellActionType type) {
    switch (type) {
      case SELECT_UP:
        selectUp();
        return;
      case CUT:
        return;
      case COPY:
        copyNodes();
        return;
      case PASTE:
        return;
      default:
    }
    super.executeAction(type);
  }

  private void copyNodes() {
    CopyPasteManagerEx.getInstanceEx().setContents(new SNodeTransferable(Collections.<SNode>emptyList(), renderText().getText()));
  }

  private TextBuilder renderText() {
    TextBuilder result = TextBuilder.getEmptyTextBuilder();
    for (EditorCell cell : getSelectedCells()) {
      result = result.appendToTheBottom(cell.renderText());
    }
    return result;
  }

  private void selectUp() {
    EditorCell cell = getCellToSelectUp();
    if (cell == null) {
      return;
    }
    SelectionManager selectionManager = getEditorComponent().getSelectionManager();
    selectionManager.pushSelection(selectionManager.createSelection(cell));
  }

  private EditorCell getCellToSelectUp() {
    for (EditorCell_Collection cell = myTableCell; cell != null; cell = cell.getParent()) {
      if (cell.isSelectable()) {
        while (cell.getParent() != null && cell.getParent().isTransparentCollection() && cell.getParent().isSelectable()) {
          cell = cell.getParent();
        }
        return cell;
      }
    }
    return null;
  }
}
