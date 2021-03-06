package jetbrains.mps.lang.sharedConcepts.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;

public class SharedStyles_StyleSheet {
  public static Style getReferenceDecorated(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    return style;
  }

  public static Style getReferenceOnConcept(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    return style;
  }

  public static Style getReferenceOnConceptualFeature(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    return style;
  }
}
