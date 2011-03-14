package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PluginHelpset extends BaseConcept {
  public static final String concept = "jetbrains.mps.platform.conf.structure.PluginHelpset";
  public static final String FILE = "file";
  public static final String PATH = "path";

  public PluginHelpset(SNode node) {
    super(node);
  }

  public String getFile() {
    return this.getProperty(PluginHelpset.FILE);
  }

  public void setFile(String value) {
    this.setProperty(PluginHelpset.FILE, value);
  }

  public String getPath() {
    return this.getProperty(PluginHelpset.PATH);
  }

  public void setPath(String value) {
    this.setProperty(PluginHelpset.PATH, value);
  }

  public static PluginHelpset newInstance(SModel sm, boolean init) {
    return (PluginHelpset) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.platform.conf.structure.PluginHelpset", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PluginHelpset newInstance(SModel sm) {
    return PluginHelpset.newInstance(sm, false);
  }
}
