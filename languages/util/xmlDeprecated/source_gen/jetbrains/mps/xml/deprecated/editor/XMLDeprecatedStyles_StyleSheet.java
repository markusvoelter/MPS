package jetbrains.mps.xml.deprecated.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class XMLDeprecatedStyles_StyleSheet {
  public static Style getElement(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    return style;
  }

  public static Style getAttributeName(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    return style;
  }

  public static Style getAttributeValue(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getText(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    return style;
  }
}
