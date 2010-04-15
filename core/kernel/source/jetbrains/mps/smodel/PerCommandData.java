package jetbrains.mps.smodel;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import jetbrains.mps.logging.Logger;

public class PerCommandData {
  private static final Logger LOG = Logger.getLogger(PerCommandData.class);

  private static PerCommandData ourInstance = null;

  private Project myProject = null;

  public static PerCommandData getInstance() {
    if (ourInstance == null) {
      ourInstance = new PerCommandData();
    }

    return ourInstance;
  }

  private PerCommandData() {
    ModelAccess.instance().addCommandListener(new ModelAccessAdapter() {
      public void commandStarted() {
        DataContext dataContext = DataManager.getInstance().getDataContext();
        myProject = PlatformDataKeys.PROJECT.getData(dataContext);
      }

      public void commandFinished() {
        //not to store closed projects for too long
        myProject = null;
      }
    });
  }

  public Project getProjectAtCurrentCommandStart() {
    LOG.assertInCommand();
    return myProject;
  }
}
