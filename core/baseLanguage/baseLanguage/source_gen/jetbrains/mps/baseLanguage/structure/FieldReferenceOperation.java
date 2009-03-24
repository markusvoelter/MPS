package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.FieldDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FieldReferenceOperation extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.baseLanguage.structure.IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FIELD_DECLARATION = "fieldDeclaration";

  public FieldReferenceOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(FieldReferenceOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FieldReferenceOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FieldReferenceOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FieldReferenceOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FieldReferenceOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FieldReferenceOperation.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.baseLanguage.structure.FieldDeclaration getFieldDeclaration() {
    return (jetbrains.mps.baseLanguage.structure.FieldDeclaration)this.getReferent(FieldDeclaration.class, FieldReferenceOperation.FIELD_DECLARATION);
  }

  public void setFieldDeclaration(jetbrains.mps.baseLanguage.structure.FieldDeclaration node) {
    super.setReferent(FieldReferenceOperation.FIELD_DECLARATION, node);
  }


  public static FieldReferenceOperation newInstance(SModel sm, boolean init) {
    return (FieldReferenceOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FieldReferenceOperation newInstance(SModel sm) {
    return FieldReferenceOperation.newInstance(sm, false);
  }

}
