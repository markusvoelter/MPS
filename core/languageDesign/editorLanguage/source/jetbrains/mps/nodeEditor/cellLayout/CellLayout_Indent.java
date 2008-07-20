package jetbrains.mps.nodeEditor.cellLayout;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellLayout.AbstractCellLayout;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell;

/**
 * Author: Sergey Dmitriev
 * Date: Jan 19, 2005
 */
public class CellLayout_Indent extends AbstractCellLayout {

  private static final int INDENT = 20;
  private static Logger LOG = Logger.getLogger(CellLayout_Indent.class);

  public static final boolean DO_INDENT_EVERYWHERE = false;

  public void doLayout(EditorCell_Collection editorCells) {
    _doLayout(editorCells);

  }

  public TextBuilder doLayoutText(Iterable<EditorCell> editorCells) {
    return null;
  }

  public EditorCell findNearestCell(EditorCell_Collection editorCells, int x, int y, boolean isPrevious) {
    return null;
  }

  public EditorCell findNearestRow(EditorCell_Collection editorCells, int y) {
    return null;
  }

  public EditorCell findCell(EditorCell_Collection editorCells, int x, int y) {
    return null;
  }

  public String toString() {
    return "Indent";
  }


  public static void _doLayout(EditorCell_Collection editorCells) {
    EditorCell[] cells = editorCells.getCells();
    final int x = editorCells.getX();
    final int y = editorCells.getY();
    int currentLineWidth = 0;
    int totalWidth = 0;
    int totalHeight = 0;
    int currentLineHeight = 0;
    String nextLineForChildren = editorCells.getStyle().get(StyleAttributes.NEXT_LINE_CHILDREN);

    for (EditorCell editorCell : cells) {
      String nextLine = editorCell.getStyle().get(StyleAttributes.LAYOUT_NEXT_LINE);
      if(nextLine != null) {
        System.out.println("nextLine = "+nextLine);
      }
      if ("indented".equals(nextLine) || (nextLine == null && "indented".equals(nextLineForChildren))) {
        currentLineWidth = INDENT;
        totalHeight += currentLineHeight;
        currentLineHeight=0;
      }
      else if("not indented".equals(nextLine) || (nextLine == null && "not indented".equals(nextLineForChildren))) {
        currentLineWidth = 0;
        totalHeight += currentLineHeight;
        currentLineHeight=0;
      }
      editorCell.setX(x + currentLineWidth);
      editorCell.setY(y + totalHeight);
      editorCell.relayout();
//      System.out.println("EditorCell [" + editorCell.getX()+","+editorCell.getY()+","+editorCell.getWidth()+","+editorCell.getHeight()+"] node:"+editorCell.getSNode().getConceptShortName()+" cell:"+ editorCell.toString());
      currentLineHeight = Math.max(currentLineHeight, editorCell.getHeight());
      currentLineWidth += editorCell.getWidth();
      totalWidth = Math.max(totalWidth, currentLineWidth);
    }
    editorCells.setWidth(totalWidth);
    editorCells.setHeight(totalHeight+currentLineHeight);
  }
}