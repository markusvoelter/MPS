package jetbrains.mps.build.custommps.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.build.packaging.structure.IStringExpression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UndeclaredVariableReference extends BaseConcept implements IStringExpression {
  public static final String concept = "jetbrains.mps.build.custommps.structure.UndeclaredVariableReference";
  public static final String ANT_NAME = "antName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public UndeclaredVariableReference(SNode node) {
    super(node);
  }

  public String getAntName() {
    return this.getProperty(UndeclaredVariableReference.ANT_NAME);
  }

  public void setAntName(String value) {
    this.setProperty(UndeclaredVariableReference.ANT_NAME, value);
  }

  public String getName() {
    return this.getProperty(UndeclaredVariableReference.NAME);
  }

  public void setName(String value) {
    this.setProperty(UndeclaredVariableReference.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(UndeclaredVariableReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(UndeclaredVariableReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(UndeclaredVariableReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(UndeclaredVariableReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(UndeclaredVariableReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(UndeclaredVariableReference.VIRTUAL_PACKAGE, value);
  }

  public static UndeclaredVariableReference newInstance(SModel sm, boolean init) {
    return (UndeclaredVariableReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.custommps.structure.UndeclaredVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UndeclaredVariableReference newInstance(SModel sm) {
    return UndeclaredVariableReference.newInstance(sm, false);
  }
}
