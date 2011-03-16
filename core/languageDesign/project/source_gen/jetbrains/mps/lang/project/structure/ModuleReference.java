package jetbrains.mps.lang.project.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModuleReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.project.structure.ModuleReference";
  public static final String UUID = "uuid";
  public static final String QUALIFIED_NAME = "qualifiedName";

  public ModuleReference(SNode node) {
    super(node);
  }

  public String getUuid() {
    return this.getProperty(ModuleReference.UUID);
  }

  public void setUuid(String value) {
    this.setProperty(ModuleReference.UUID, value);
  }

  public String getQualifiedName() {
    return this.getProperty(ModuleReference.QUALIFIED_NAME);
  }

  public void setQualifiedName(String value) {
    this.setProperty(ModuleReference.QUALIFIED_NAME, value);
  }

  public static ModuleReference newInstance(SModel sm, boolean init) {
    return (ModuleReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.project.structure.ModuleReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModuleReference newInstance(SModel sm) {
    return ModuleReference.newInstance(sm, false);
  }
}
