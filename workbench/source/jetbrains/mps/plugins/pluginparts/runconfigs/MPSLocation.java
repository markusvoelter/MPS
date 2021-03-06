package jetbrains.mps.plugins.pluginparts.runconfigs;

import com.intellij.execution.Location;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.module.Module;
import java.util.Iterator;
import java.util.ArrayList;

public class MPSLocation extends Location {
  private Project myProject;
  private MPSPsiElement myPSIElement;

  public MPSLocation(Project project, final Object item) {
    myProject = project;
    myPSIElement = ModelAccess.instance().runReadAction(new Computable<MPSPsiElement>() {
      public MPSPsiElement compute() {
        return MPSPsiElement.createFor(item);
      }
    });
  }

  @NotNull
  public MPSPsiElement getPsiElement() {
    return myPSIElement;
  }

  @NotNull
  public Project getProject() {
    return myProject;
  }

  @Override
  public Module getModule() {
    return null;
  }

  @NotNull
  public Iterator getAncestors(Class ancestorClass, boolean strict) {
    return new ArrayList().iterator();
  }
}
