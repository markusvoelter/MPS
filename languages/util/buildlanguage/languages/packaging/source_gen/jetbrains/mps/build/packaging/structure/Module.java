package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Module extends AbstractProjectComponent {
  public static final String concept = "jetbrains.mps.build.packaging.structure.Module";
  public static final String ID = "id";
  public static final String INCLUDE_RESOURCES = "includeResources";
  public static final String EXCLUDE_RESOURCES = "excludeResources";
  public static final String DO_NOT_JAR = "doNotJar";
  public static final String CYCLE = "cycle";

  public Module(SNode node) {
    super(node);
  }

  public String getId() {
    return this.getProperty(Module.ID);
  }

  public void setId(String value) {
    this.setProperty(Module.ID, value);
  }

  public String getIncludeResources() {
    return this.getProperty(Module.INCLUDE_RESOURCES);
  }

  public void setIncludeResources(String value) {
    this.setProperty(Module.INCLUDE_RESOURCES, value);
  }

  public String getExcludeResources() {
    return this.getProperty(Module.EXCLUDE_RESOURCES);
  }

  public void setExcludeResources(String value) {
    this.setProperty(Module.EXCLUDE_RESOURCES, value);
  }

  public boolean getDoNotJar() {
    return this.getBooleanProperty(Module.DO_NOT_JAR);
  }

  public void setDoNotJar(boolean value) {
    this.setBooleanProperty(Module.DO_NOT_JAR, value);
  }

  public ModuleCycle getCycle() {
    return (ModuleCycle) this.getReferent(ModuleCycle.class, Module.CYCLE);
  }

  public void setCycle(ModuleCycle node) {
    super.setReferent(Module.CYCLE, node);
  }

  public static Module newInstance(SModel sm, boolean init) {
    return (Module) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.Module", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Module newInstance(SModel sm) {
    return Module.newInstance(sm, false);
  }
}
