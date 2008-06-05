package jetbrains.mps.workbench.tools;

import com.intellij.ide.actions.ActivateToolWindowAction;
import com.intellij.openapi.actionSystem.KeyboardShortcut;
import com.intellij.openapi.keymap.KeymapManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactoryImpl;
import com.intellij.ui.content.ContentManager;
import jetbrains.mps.MPSProjectHolder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public abstract class BaseTool {
  private static Logger LOG = Logger.getLogger(BaseTool.class);

  private Project myProject;
  private String myId;
  private int myNumber;
  private Icon myIcon;
  private ToolWindowAnchor myAnchor;
  private boolean myCanCloseContent;

  public BaseTool(Project project, String id, int number, Icon icon, ToolWindowAnchor anchor, boolean canCloseContent) {
    myAnchor = anchor;
    myNumber = number;
    myId = id;
    myIcon = icon;
    myCanCloseContent = canCloseContent;
    myProject = project;
  }

  public String getId() {
    return myId;
  }

  public int getNumber() {
    return myNumber;
  }

  public Icon getIcon() {
    return myIcon;
  }

  public boolean isRegistered() {
    return getToolWindow() != null;
  }


  public boolean toolIsOpened() {
    LOG.checkEDT();

    ToolWindow window = checkRegistered();
    return window.isVisible();
  }

  /**
   * Opens the tool's window, shows tool if invisible at the moment
   */
  public void openToolLater(final boolean setActive) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        openTool(setActive);
      }
    });
  }

  public void openTool(boolean setActive) {
    ToolWindow window = checkRegistered();
    if (!toolIsShown()) showToolLater();
    if (!toolIsOpened()) window.show(null);
    if (setActive) window.activate(null);
  }

  /**
   * Minimizes the window, doesn't remove tool from panel
   */
  public void closeToolLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        closeTool();
      }
    });
  }

  public void closeTool() {
    ToolWindow window = checkRegistered();
    if (toolIsShown() && toolIsOpened()) window.hide(null);
  }

  /**
   * @return whether the tool is visible by user (in the panel)
   */
  public boolean toolIsShown() {
    LOG.checkEDT();

    ToolWindow window = checkRegistered();
    return window.isAvailable();
  }

  /**
   * If the tool is visible, does nothing, else show the tool in panel in minimized state
   */
  public void showToolLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        showTool();
      }
    });
  }

  public void showTool() {
    ToolWindow window = checkRegistered();
    if (!toolIsShown()) window.setAvailable(true, null);
  }

  /**
   * Removes the tool from the panel
   */
  public void hideToolLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        hideTool();
      }
    });
  }

  public void hideTool() {
    ToolWindow window = checkRegistered();
    if (toolIsShown()) window.setAvailable(false, null);
  }

  @Nullable
  public ToolWindow getToolWindow() {
    LOG.checkEDT();
    
    if (myProject.isDisposed()) return null;
    return ToolWindowManager.getInstance(myProject).getToolWindow(myId);
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return getClass().getName();
  }

  public void registerLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        register();
      }
    });
  }

  public void register() {
    if (myNumber != -1) {
      KeymapManager.getInstance().getActiveKeymap().addShortcut(
        ActivateToolWindowAction.getActionIdForToolWindow(myId),
        new KeyboardShortcut(KeyStroke.getKeyStroke("alt " + myNumber), null)
      );
    }

    ToolWindow toolWindow = ToolWindowManager.getInstance(myProject).registerToolWindow(myId, myCanCloseContent, myAnchor);
    toolWindow.setIcon(myIcon);
    Content content = new ContentFactoryImpl().createContent(getComponent(), null, false);
    toolWindow.getContentManager().addContent(content);
  }

  public void unregisterLater() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        unregister();
      }
    });
  }

  public void unregister() {
    if (myNumber != -1) {
      KeymapManager.getInstance().getActiveKeymap().removeAllActionShortcuts(ActivateToolWindowAction.getActionIdForToolWindow(myId));
    }

    ToolWindow toolWindow = getToolWindow();
    if (toolWindow != null) {
      ContentManager contentManager = toolWindow.getContentManager();
      if (contentManager != null && !contentManager.isDisposed()) {
        contentManager.removeAllContents(true);
      }

      ToolWindowManager.getInstance(myProject).unregisterToolWindow(myId);
    }
  }

  public abstract JComponent getComponent();

  protected Project getProject() {
    return myProject;
  }

  @Deprecated
  protected MPSProject getMPSProject() {
    return myProject.getComponent(MPSProjectHolder.class).getMPSProject();
  }

  private
  @NotNull
  ToolWindow checkRegistered() {
    if (!isRegistered()) throw new InvalidUsageException("The tool is used before it was registered");
    ToolWindow window = getToolWindow();
    assert window != null;
    return window;
  }
}
