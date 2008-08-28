package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.view.UsagesView;
import javax.swing.JPanel;
import javax.swing.JButton;
import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import javax.swing.JComponent;

public class ReplacementView {

  private UsagesView myUsagesView;
  private ReplacementViewTool myTool;
  private JPanel myMainPanel;
  private JButton myButton;
  private BaseFinder myFinder;

  public ReplacementView(QueryFinder finder, ReplacementViewTool tool, MPSProject project, IResultProvider provider, SearchQuery searchQuery, ProgressIndicator indicator) {
    this.myTool = tool;
    this.myFinder = finder;
    this.myUsagesView = new UsagesView(project, new ViewOptions()) {

      public void close() {
        ReplacementView.this.myTool.closeTab(ReplacementView.this);
      }

    };
    this.myUsagesView.setRunOptions(provider, searchQuery, new UsagesView.ButtonConfiguration(true, true, true), finder.find(searchQuery, indicator));
  }

  public JComponent getComponent() {
    return this.myMainPanel;
  }

}
