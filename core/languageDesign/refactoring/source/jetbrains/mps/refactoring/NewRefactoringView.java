package jetbrains.mps.refactoring;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowAnchor;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.projectPane.Icons;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.workbench.tools.BaseMPSTool;
import org.jetbrains.annotations.NotNull;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 21.01.2008
 * Time: 17:30:43
 * To change this template use File | Settings | File Templates.
 */
public class NewRefactoringView extends BaseMPSTool {
  private static final Logger LOG = Logger.getLogger(NewRefactoringView.class);
  private RefactoringViewItem myRefactoringViewItem;
  private JPanel myPanel;
  public JLabel myLabel;

  protected NewRefactoringView(Project project) {
    super(project, "RefactoringView", -1, Icons.DEFAULT_ICON, ToolWindowAnchor.BOTTOM, true);
  }

  public void initComponent() {
    super.initComponent();
    myPanel = new JPanel(new BorderLayout());
    myLabel = new JLabel("no refactoring");
    myPanel.add(myLabel);
  }

  public void showRefactoringView(@NotNull ActionContext actionContext,
                                  @NotNull RefactoringContext refactoringContext) {
    myRefactoringViewItem = new RefactoringViewItem(actionContext, refactoringContext, this);
    myPanel.remove(myLabel);
    myPanel.add(myRefactoringViewItem.getComponent(), BorderLayout.CENTER);
    myRefactoringViewItem.initUsagesView();
    openTool(true);
  }

  /*package*/ void closeRefactoringView() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        myPanel.remove(myRefactoringViewItem.getComponent());
        myLabel = new JLabel("no refactoring");
        myPanel.add(myLabel);
        myRefactoringViewItem = null;
        close();
      }
    });

  }


  public JComponent getComponent() {
    return myPanel;
  }
}
