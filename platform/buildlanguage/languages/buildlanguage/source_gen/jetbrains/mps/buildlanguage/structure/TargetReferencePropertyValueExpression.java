package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TargetReferencePropertyValueExpression extends PropertyValueExpression implements ITargetReference {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.TargetReferencePropertyValueExpression";
  public static final String FULL_NAME = "fullName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DECLARATION = "declaration";

  public TargetReferencePropertyValueExpression(SNode node) {
    super(node);
  }

  public String getFullName() {
    return this.getProperty(TargetReferencePropertyValueExpression.FULL_NAME);
  }

  public void setFullName(String value) {
    this.setProperty(TargetReferencePropertyValueExpression.FULL_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TargetReferencePropertyValueExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TargetReferencePropertyValueExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TargetReferencePropertyValueExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TargetReferencePropertyValueExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TargetReferencePropertyValueExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TargetReferencePropertyValueExpression.VIRTUAL_PACKAGE, value);
  }

  public TargetDeclaration getDeclaration() {
    return (TargetDeclaration) this.getReferent(TargetDeclaration.class, TargetReferencePropertyValueExpression.DECLARATION);
  }

  public void setDeclaration(TargetDeclaration node) {
    super.setReferent(TargetReferencePropertyValueExpression.DECLARATION, node);
  }

  public static TargetReferencePropertyValueExpression newInstance(SModel sm, boolean init) {
    return (TargetReferencePropertyValueExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.TargetReferencePropertyValueExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetReferencePropertyValueExpression newInstance(SModel sm) {
    return TargetReferencePropertyValueExpression.newInstance(sm, false);
  }
}
