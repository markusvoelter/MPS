package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTabbedTool;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.findusages.view.icons.IconManager;
import jetbrains.mps.plugins.pluginparts.tool.IComponentDisposer;
import javax.swing.JComponent;

public class RunReplacement_Tool extends GeneratedTabbedTool {
  private static final Icon ICON = new ImageIcon(RunReplacement_Tool.class.getResource("find.png"));

  private Project myProject;

  public RunReplacement_Tool(Project project) {
    super(project, "Replacement", -1, ICON, ToolWindowAnchor.BOTTOM, true);
  }

  public void init(Project project) {
    super.init(project);
    RunReplacement_Tool.this.myProject = project;
  }

  public void closeTab(ReplacementView view) {
    RunReplacement_Tool.this.closeTab(view.getComponent());
  }

  public void addTab(final SearchQuery searchQuery, final Query query) {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        final ReplacementView view = new ReplacementView(RunReplacement_Tool.this, RunReplacement_Tool.this.myProject, FindUtils.makeProvider(new QueryFinder(query)), searchQuery, query);
        RunReplacement_Tool.this.addTab(view.getComponent(), "for " + query.getConcept(), IconManager.getIconForIHolder(searchQuery.getObjectHolder()), new IComponentDisposer<JComponent>() {
          public void disposeComponent(JComponent component) {
            view.dispose();
          }
        });
      }
    });
  }
}
