package jetbrains.mps.workbench.actions.goTo.framework.modules;

import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.vcs.FileStatus;
import jetbrains.mps.project.IModule;
import jetbrains.mps.util.NameUtil;
import org.jetbrains.annotations.Nullable;

public abstract class BaseNavigationItem implements NavigationItem {
  private IModule myModule;
  private String myShortName;

  public BaseNavigationItem(IModule module) {
    myModule = module;
    myShortName = NameUtil.shortNameFromLongName(myModule.getModuleUID());
  }

  public IModule getModule() {
    return myModule;
  }

  public String getName() {
    return myShortName;
  }

  @Nullable
  public ItemPresentation getPresentation() {
    return new ModulePresentation(myModule);
  }

  public FileStatus getFileStatus() {
    return FileStatus.NOT_CHANGED;
  }

  public boolean canNavigate() {
    return true;
  }

  public boolean canNavigateToSource() {
    return true;
  }
}
