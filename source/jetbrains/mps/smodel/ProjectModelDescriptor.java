package jetbrains.mps.smodel;

import jetbrains.mps.util.annotation.ForDebug;

import java.io.File;

/**
 * @author Kostik
 */
public class ProjectModelDescriptor extends AbstractSModelDescriptor {
  private static long ourProjectModelDescriptorCount = 0;
  private static final IModelRootManager ourModelRootManager = IModelRootManager.NULL_MANAGER;

  private @ForDebug Throwable myStackTrace;



  public static SModelDescriptor createDescriptorFor(ModelOwner owner) {
    ProjectModelDescriptor result = new ProjectModelDescriptor();
    SModelRepository.getInstance().registerModelDescriptor(result, owner);
    return result;
  }

  public static boolean isProjectModel(SModelUID uid) {
    return "$internal$".equals(uid.getStereotype());
  }

  private ProjectModelDescriptor() {
    super(ourModelRootManager, new SModelUID("projectModel" + ourProjectModelDescriptorCount++, "$internal$"));
//    myStackTrace = new Throwable();
  }

  public void reloadFromDisk() {
  }

  public void updateNodeStatuses() {
  }

  protected SModel loadModel() {
    SModel result = new SModel(getModelUID());
    result.addLanguage("jetbrains.mps.projectLanguage");
    result.fillInStackTrace(myStackTrace);
    return result;
  }

  protected void saveModel(SModel model) {
  }

  public File getModelFile() {
    return null;
  }

  public long timestamp() {
    return System.currentTimeMillis();
  }
}
