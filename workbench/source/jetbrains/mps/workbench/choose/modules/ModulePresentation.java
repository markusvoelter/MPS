package jetbrains.mps.workbench.choose.modules;

import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.project.IModule;
import jetbrains.mps.workbench.choose.base.BasePresentation;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;

public class ModulePresentation extends BasePresentation {
  private IModule myModule;

  public ModulePresentation(IModule module) {
    myModule = module;
  }

  @NotNull
  public String doGetPresentableText() {
    return myModule.getModuleUID();
  }

  public String doGetLocationString() {
    return "";
  }

  public Icon doGetIcon() {
    return IconManager.getIconFor(myModule);
  }
}