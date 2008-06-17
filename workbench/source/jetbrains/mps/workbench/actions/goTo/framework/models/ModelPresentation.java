package jetbrains.mps.workbench.actions.goTo.framework.models;

import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.workbench.actions.goTo.framework.base.BasePresentation;

import javax.swing.Icon;

public class ModelPresentation extends BasePresentation {
  private SModelDescriptor myModelDescriptor;

  public ModelPresentation(SModelDescriptor modelDescriptor) {
    myModelDescriptor = modelDescriptor;
  }

  public String doGetPresentableText() {
    String modelName = myModelDescriptor.getModelUID().getLongName();
    boolean javaStub = myModelDescriptor.getStereotype().equals(SModelStereotype.JAVA_STUB);
    return modelName + (javaStub ? "@java_stub" : "");
  }

  public String getParentLocation() {
    return myModelDescriptor.getModule().getModuleUID();
  }

  public String doGetLocationString() {
    return "(" + myModelDescriptor.getModule().getModuleUID() + ")";
  }

  public Icon doGetIcon() {
    return IconManager.getIconFor(myModelDescriptor);
  }
}