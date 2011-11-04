package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tool.GeneratedTool;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jetbrains.mps.ide.findusages.INavigateableTool;
import com.intellij.openapi.wm.ToolWindow;
import jetbrains.mps.ide.findusages.INavigator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.UsagesViewTracker;
import javax.swing.JComponent;

public class AnalyzeDependencies_Tool extends GeneratedTool {
  private static final Icon ICON = new ImageIcon(AnalyzeDependencies_Tool.class.getResource("inspector.png"));

  private DependenciesComponent myDependenciesComponent;
  private INavigateableTool myNavigateableTool = new INavigateableTool() {
    public int getPriority() {
      return 3;
    }

    public ToolWindow getToolWindow() {
      AnalyzeDependencies_Tool.this.register();
      return AnalyzeDependencies_Tool.this.getToolWindow();
    }

    public INavigator getCurrentNavigateableView() {
      return AnalyzeDependencies_Tool.this.myDependenciesComponent.getReferencesViewComponent();
    }
  };

  public AnalyzeDependencies_Tool(Project project) {
    super(project, "Dependendies Viewer", -1, ICON, ToolWindowAnchor.BOTTOM, false);
  }

  public void init(Project project) {
    super.init(project);
    AnalyzeDependencies_Tool.this.myDependenciesComponent = new DependenciesComponent(AnalyzeDependencies_Tool.this);
    AnalyzeDependencies_Tool.this.myDependenciesComponent.setProject(project);
  }

  public void dispose() {
    super.dispose();
  }

  public void setContent(Scope scope, MPSProject project) {
    AnalyzeDependencies_Tool.this.myDependenciesComponent.setContent(scope, project);
    AnalyzeDependencies_Tool.this.myDependenciesComponent.revalidate();
  }

  protected void doRegister() {
    UsagesViewTracker.register(AnalyzeDependencies_Tool.this.myNavigateableTool);
  }

  protected void doUnregister() {
    UsagesViewTracker.unregister(AnalyzeDependencies_Tool.this.myNavigateableTool);
  }

  public JComponent getComponent() {
    return AnalyzeDependencies_Tool.this.myDependenciesComponent;
  }
}
