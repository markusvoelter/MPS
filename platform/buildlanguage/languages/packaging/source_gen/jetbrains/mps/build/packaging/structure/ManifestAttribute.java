package jetbrains.mps.build.packaging.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ManifestAttribute extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.build.packaging.structure.ManifestAttribute";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String VALUE = "value";

  public ManifestAttribute(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ManifestAttribute.NAME);
  }

  public void setName(String value) {
    this.setProperty(ManifestAttribute.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ManifestAttribute.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ManifestAttribute.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ManifestAttribute.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ManifestAttribute.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ManifestAttribute.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ManifestAttribute.VIRTUAL_PACKAGE, value);
  }

  public int getValuesCount() {
    return this.getChildCount(ManifestAttribute.VALUE);
  }

  public Iterator<IStringExpression> values() {
    return this.children(IStringExpression.class, ManifestAttribute.VALUE);
  }

  public List<IStringExpression> getValues() {
    return this.getChildren(IStringExpression.class, ManifestAttribute.VALUE);
  }

  public void addValue(IStringExpression node) {
    this.addChild(ManifestAttribute.VALUE, node);
  }

  public void insertValue(IStringExpression prev, IStringExpression node) {
    this.insertChild(prev, ManifestAttribute.VALUE, node);
  }

  public static ManifestAttribute newInstance(SModel sm, boolean init) {
    return (ManifestAttribute) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.packaging.structure.ManifestAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ManifestAttribute newInstance(SModel sm) {
    return ManifestAttribute.newInstance(sm, false);
  }
}
