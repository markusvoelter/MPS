package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class PackagingStyles_StyleSheet {

  public static Style getHint(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
      }

    };
  }

  public static Style getKeyword(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.darkGray);
      }

    };
  }

  public static Style getProjectComponent(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getConfiguration(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.WHITE);
        this.set(StyleAttributes.BACKGROUND_COLOR, MPSColors.gray);
        this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.3, Measure.SPACES));
        this.set(StyleAttributes.PADDING_LEFT, new Padding(0.3, Measure.SPACES));
      }

    };
  }

  public static Style getSlash(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.3, Measure.SPACES));
        this.set(StyleAttributes.PADDING_LEFT, new Padding(0.5, Measure.SPACES));
      }

    };
  }

  public static Style getVariable(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

  public static Style getString(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

}
