package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EditorOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.lang.test.structure.EditorOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public EditorOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(EditorOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EditorOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EditorOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EditorOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EditorOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EditorOperation.VIRTUAL_PACKAGE, value);
  }

  public static EditorOperation newInstance(SModel sm, boolean init) {
    return (EditorOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.EditorOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EditorOperation newInstance(SModel sm) {
    return EditorOperation.newInstance(sm, false);
  }
}
