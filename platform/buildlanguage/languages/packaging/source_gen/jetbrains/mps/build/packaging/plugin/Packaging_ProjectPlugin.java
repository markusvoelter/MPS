package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.projectplugins.BaseProjectPlugin;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Packaging_ProjectPlugin extends BaseProjectPlugin {
  public List<GeneratedTool> initTools(Project project) {
    List<GeneratedTool> tools = ListSequence.fromList(new ArrayList<GeneratedTool>());
    ListSequence.fromList(tools).addElement(new BuildTool_Tool(project));
    return tools;
  }
}
