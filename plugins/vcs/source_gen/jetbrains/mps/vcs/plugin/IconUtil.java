package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.Presentation;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;

public class IconUtil {
  public IconUtil() {
  }

  public static void useIcon(Object anchor, Presentation p, String path) {
    // todo this MUST be removed after it will be possible to load icons not via modules 
    String file = anchor.getClass().getClassLoader().getResource(path).getFile();
    final String PREFIX = "file:";
    if (file.startsWith(PREFIX)) {
      file = file.substring(PREFIX.length());
    }
    Icon icon = IconManager.loadIcon(file, true);
    p.setIcon(icon);
  }
}
