package jetbrains.mps.logging.refactoring.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import java.util.ArrayList;

public class Refactoring_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = new ArrayList<BaseCustomApplicationPlugin>();
    {
      BaseCustomApplicationPlugin plugin = new Refactoring_CustomApplicationPlugin();
      res.add(plugin);
      plugin.init();
    }
    return res;
  }

}
