package jetbrains.mps.vcs.diff.changes;

/*Generated by MPS */

import java.awt.Color;
import com.intellij.openapi.vcs.FileStatus;

public enum ChangeType {
  ADD(new Color(214, 245, 214), FileStatus.COLOR_ADDED),
  DELETE(new Color(203, 203, 203), FileStatus.COLOR_MISSING),
  CHANGE(new Color(188, 207, 249), FileStatus.COLOR_MODIFIED),
  DESTROY(null, null);

  public static final Color CONFLICT_COLOR = new Color(245, 164, 164);

  private Color myColor;
  private Color myTreeColor;

  ChangeType(Color color, Color treeColor) {
    myColor = color;
    myTreeColor = treeColor;
  }

  public Color getColor() {
    return myColor;
  }

  public Color getTreeColor() {
    return myTreeColor;
  }
}
