package jetbrains.mps.bootstrap.sharedConcepts.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.IStyle;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.MPSColors;

public class SharedStyles_StyleSheet {
  public static final IStyle REFERENCE_DECORATED = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if (cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = SharedStyles_StyleSheet.calculateColor(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.ITALIC);
      if (recurive) {
        if (cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            if (child.getSNode().isAttribute()) {
              this.skipAttributePart(child);
            } else
            {
              this.apply(child, true);
            }
          }
        }
      }
    }

    private void skipAttributePart(EditorCell current) {
      if (current instanceof EditorCell_Collection) {
        EditorCell_Collection collection = (EditorCell_Collection)current;
        for(EditorCell child : collection) {
          if (child.getSNode() == current.getSNode().getParent()) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle REFERENCE_ON_CONCEPT = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if (cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = SharedStyles_StyleSheet.calculateColor1(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      if (recurive) {
        if (cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            if (child.getSNode().isAttribute()) {
              this.skipAttributePart(child);
            } else
            {
              this.apply(child, true);
            }
          }
        }
      }
    }

    private void skipAttributePart(EditorCell current) {
      if (current instanceof EditorCell_Collection) {
        EditorCell_Collection collection = (EditorCell_Collection)current;
        for(EditorCell child : collection) {
          if (child.getSNode() == current.getSNode().getParent()) {
            this.apply(child, true);
          }
        }
      }
    }

  };

  private static Color calculateColor(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

}
