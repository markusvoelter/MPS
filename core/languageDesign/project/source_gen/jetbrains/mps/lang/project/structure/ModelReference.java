package jetbrains.mps.lang.project.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ModelReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.project.structure.ModelReference";
  public static final String UUID = "uuid";
  public static final String QUALIFIED_NAME = "qualifiedName";

  public ModelReference(SNode node) {
    super(node);
  }

  public String getUuid() {
    return this.getProperty(ModelReference.UUID);
  }

  public void setUuid(String value) {
    this.setProperty(ModelReference.UUID, value);
  }

  public String getQualifiedName() {
    return this.getProperty(ModelReference.QUALIFIED_NAME);
  }

  public void setQualifiedName(String value) {
    this.setProperty(ModelReference.QUALIFIED_NAME, value);
  }

  public static ModelReference newInstance(SModel sm, boolean init) {
    return (ModelReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.project.structure.ModelReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ModelReference newInstance(SModel sm) {
    return ModelReference.newInstance(sm, false);
  }
}
