package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SimpleString extends BaseConcept implements IStringExpression {
  public static final String concept = "jetbrains.mps.build.packaging.structure.SimpleString";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public SimpleString(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SimpleString.NAME);
  }

  public void setName(String value) {
    this.setProperty(SimpleString.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SimpleString.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SimpleString.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SimpleString.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SimpleString.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SimpleString.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SimpleString.VIRTUAL_PACKAGE, value);
  }

  public static SimpleString newInstance(SModel sm, boolean init) {
    return (SimpleString) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.SimpleString", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SimpleString newInstance(SModel sm) {
    return SimpleString.newInstance(sm, false);
  }
}
