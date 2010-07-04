package jetbrains.mps.debug.customViewers.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class IsInstanceOfOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CLASS_NAME = "className";

  public IsInstanceOfOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(IsInstanceOfOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(IsInstanceOfOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(IsInstanceOfOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(IsInstanceOfOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(IsInstanceOfOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(IsInstanceOfOperation.VIRTUAL_PACKAGE, value);
  }

  public Expression getClassName() {
    return (Expression) this.getChild(Expression.class, IsInstanceOfOperation.CLASS_NAME);
  }

  public void setClassName(Expression node) {
    super.setChild(IsInstanceOfOperation.CLASS_NAME, node);
  }

  public static IsInstanceOfOperation newInstance(SModel sm, boolean init) {
    return (IsInstanceOfOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.debug.customViewers.structure.IsInstanceOfOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static IsInstanceOfOperation newInstance(SModel sm) {
    return IsInstanceOfOperation.newInstance(sm, false);
  }
}
