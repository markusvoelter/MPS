package jetbrains.mps.ide.properties;

/*Generated by MPS */

import jetbrains.mps.project.structure.modules.SolutionKind;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;

public class SolutionProperties extends ModuleProperties {
  public static final String OUTPUT_PATH = "outputPath";
  public static final String KIND = "kind";

  private boolean myExternallyVisible;
  private String myOutputPath;
  private SolutionKind myKind;

  public SolutionProperties() {
  }

  public boolean isExternallyVisible() {
    return myExternallyVisible;
  }

  public void setExternallyVisible(boolean externallyVisible) {
    myExternallyVisible = externallyVisible;
  }

  public String getOutputPath() {
    return myOutputPath;
  }

  public void setOutputPath(String outputPath) {
    myOutputPath = outputPath;
  }

  public String getKind() {
    return myKind.name();
  }

  public void setKind(String kind) {
    myKind = SolutionKind.valueOf(kind);
  }

  @Override
  public void loadFrom(ModuleDescriptor descriptor) {
    assert descriptor instanceof SolutionDescriptor;
    super.loadFrom(descriptor);
    SolutionDescriptor d = (SolutionDescriptor) descriptor;
    myOutputPath = d.getOutputPath();
    myKind = d.getKind();
  }

  @Override
  public void saveTo(ModuleDescriptor descriptor) {
    assert descriptor instanceof SolutionDescriptor;
    super.saveTo(descriptor);
    SolutionDescriptor d = (SolutionDescriptor) descriptor;
    d.setOutputPath(myOutputPath);
    d.setKind(myKind);
  }
}
