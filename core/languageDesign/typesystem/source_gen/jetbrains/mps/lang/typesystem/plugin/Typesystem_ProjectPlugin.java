package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomProjectPlugin;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.typesystem.plugin.HelginsPlugin_CustomProjectPlugin;

public class Typesystem_ProjectPlugin extends BaseProjectPlugin {

  public List<BaseCustomProjectPlugin> initCustomParts(MPSProject project) {
    List<BaseCustomProjectPlugin> res = ListSequence.<BaseCustomProjectPlugin>fromArray();
    {
      BaseCustomProjectPlugin plugin = new HelginsPlugin_CustomProjectPlugin();
      ListSequence.fromList(res).addElement(plugin);
      plugin.init(project);
    }
    return res;
  }

}
