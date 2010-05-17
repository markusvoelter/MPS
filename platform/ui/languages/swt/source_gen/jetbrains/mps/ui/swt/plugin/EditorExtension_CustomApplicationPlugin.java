package jetbrains.mps.ui.swt.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ui.modeling.plugin.EditorExtensionHelper;

public class EditorExtension_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private static Logger LOG = Logger.getLogger(EditorExtension_CustomApplicationPlugin.class);

  private EditorExtensionHelper helper;

  public EditorExtension_CustomApplicationPlugin() {
  }

  public void doInit() {
    EditorExtension_CustomApplicationPlugin.this.helper = new EditorExtensionHelper("jetbrains.mps.ui.swt");
    EditorExtension_CustomApplicationPlugin.this.helper.init();
  }

  public void doDispose() {
    EditorExtension_CustomApplicationPlugin.this.helper.dispose();
    EditorExtension_CustomApplicationPlugin.this.helper = null;
  }
}
