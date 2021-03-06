package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.PropertyDeclaration;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyRefQualifier extends BaseConcept implements IPropertyAccessQualifier {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.PropertyRefQualifier";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PROPERTY = "property";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public PropertyRefQualifier(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyRefQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyRefQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyRefQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyRefQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyRefQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyRefQualifier.VIRTUAL_PACKAGE, value);
  }

  public PropertyDeclaration getProperty() {
    return (PropertyDeclaration) this.getReferent(PropertyDeclaration.class, PropertyRefQualifier.PROPERTY);
  }

  public void setProperty(PropertyDeclaration node) {
    super.setReferent(PropertyRefQualifier.PROPERTY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(PropertyRefQualifier.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, PropertyRefQualifier.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, PropertyRefQualifier.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(PropertyRefQualifier.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, PropertyRefQualifier.SMODEL_ATTRIBUTE, node);
  }

  public static PropertyRefQualifier newInstance(SModel sm, boolean init) {
    return (PropertyRefQualifier) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.PropertyRefQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyRefQualifier newInstance(SModel sm) {
    return PropertyRefQualifier.newInstance(sm, false);
  }
}
