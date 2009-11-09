package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.view.UsagesView;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.ide.findusages.view.treeholder.treeview.ViewOptions;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import jetbrains.mps.smodel.ModelAccess;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressIndicator;
import javax.swing.JComponent;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class ReplacementView {
  private UsagesView myUsagesView;
  private RunReplacement_Tool myTool;
  private JPanel myMainPanel = new JPanel(new BorderLayout());
  private JButton myButton = new JButton("Do replace");

  public ReplacementView(RunReplacement_Tool tool, final MPSProject project, IResultProvider provider, SearchQuery searchQuery, final Query query) {
    this.myTool = tool;
    this.myUsagesView = new UsagesView(project, new ViewOptions()) {
      public void close() {
        ReplacementView.this.myTool.closeTab(ReplacementView.this);
      }
    };
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    this.myButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        ModelAccess.instance().runWriteActionInCommand(new Runnable() {
          public void run() {
            try {
              List<SNode> replaceNodes = ReplacementView.this.getExecuteResult(ReplacementView.this.myUsagesView.getIncludedResultNodes());
              for (SNode node : replaceNodes) {
                query.doReplace(node);
              }
              JOptionPane.showMessageDialog(null, "Modify completed successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
            } catch (Throwable t) {
              JOptionPane.showMessageDialog(null, "Modify failed", "Warning", JOptionPane.ERROR_MESSAGE);
            }
          }
        });
      }
    });
    this.myUsagesView.setRunOptions(provider, searchQuery, new UsagesView.ButtonConfiguration(true, true, true));
    buttonPanel.add(this.myButton);
    this.myMainPanel.add(buttonPanel, BorderLayout.SOUTH);
    this.myMainPanel.add(this.myUsagesView.getComponent(), BorderLayout.CENTER);
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        ProgressManager.getInstance().run(new Task.Modal(project.getComponent(Project.class), "Searching", true) {
          public void run(@NotNull ProgressIndicator indicator) {
            indicator.setIndeterminate(true);
            ReplacementView.this.myUsagesView.run(indicator);
          }
        });
      }
    });
  }

  public JComponent getComponent() {
    return this.myMainPanel;
  }

  public void dispose() {
    this.myUsagesView.dispose();
  }

  public List<SNode> getExecuteResult(List<SNodePointer> nodes) {
    List<SNode> results = ListSequence.fromList(new ArrayList<SNode>());
    for (SNodePointer nodePointer : nodes) {
      ListSequence.fromList(results).addElement(nodePointer.getNode());
    }
    return results;
  }
}
