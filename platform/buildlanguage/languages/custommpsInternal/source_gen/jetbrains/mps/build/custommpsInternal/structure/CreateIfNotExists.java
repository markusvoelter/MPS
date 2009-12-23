package jetbrains.mps.build.custommpsInternal.structure;

/*Generated by MPS */

import jetbrains.mps.build.packaging.structure.AbstractProjectComponent;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CreateIfNotExists extends AbstractProjectComponent {
  public static final String concept = "jetbrains.mps.build.custommpsInternal.structure.CreateIfNotExists";
  public static final String ARTIFACT_NAME = "artifactName";
  public static final String CREATE = "create";

  public CreateIfNotExists(SNode node) {
    super(node);
  }

  public String getArtifactName() {
    return this.getProperty(CreateIfNotExists.ARTIFACT_NAME);
  }

  public void setArtifactName(String value) {
    this.setProperty(CreateIfNotExists.ARTIFACT_NAME, value);
  }

  public AbstractProjectComponent getCreate() {
    return (AbstractProjectComponent) this.getChild(AbstractProjectComponent.class, CreateIfNotExists.CREATE);
  }

  public void setCreate(AbstractProjectComponent node) {
    super.setChild(CreateIfNotExists.CREATE, node);
  }

  public static CreateIfNotExists newInstance(SModel sm, boolean init) {
    return (CreateIfNotExists) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.custommpsInternal.structure.CreateIfNotExists", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CreateIfNotExists newInstance(SModel sm) {
    return CreateIfNotExists.newInstance(sm, false);
  }
}
