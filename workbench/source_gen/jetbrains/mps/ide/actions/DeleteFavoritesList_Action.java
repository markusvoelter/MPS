package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.ide.projectPane.favorites.FavoritesUtil;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.projectView.ProjectView;
import jetbrains.mps.ide.projectPane.favorites.FavoritesProjectPane;
import jetbrains.mps.ide.projectPane.favorites.MPSFavoritesManager;

public class DeleteFavoritesList_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(DeleteFavoritesList_Action.class);

  public DeleteFavoritesList_Action() {
    super("Delete Favorites List", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return FavoritesUtil.isActiveFavorites(((Project) MapSequence.fromMap(_params).get("project")));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "DeleteFavoritesList", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      ProjectView projectView = ProjectView.getInstance(((Project) MapSequence.fromMap(_params).get("project")));
      FavoritesProjectPane pane = (FavoritesProjectPane) projectView.getCurrentProjectViewPane();
      MPSFavoritesManager favoritesManager = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(MPSFavoritesManager.class);
      if (favoritesManager == null) {
        return;
      }
      favoritesManager.removeFavoritesList(pane.getSubId());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "DeleteFavoritesList", t);
      }
    }
  }
}
