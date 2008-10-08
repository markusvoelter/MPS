package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyDeclaration extends BaseConcept implements IProjectComponent, ICommented {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.PropertyDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String TYPE = "type";
  public static String PROPERTY_VALUE = "propertyValue";

  public PropertyDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PropertyDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(PropertyDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PropertyDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PropertyDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PropertyDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PropertyDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PropertyDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PropertyDeclaration.VIRTUAL_PACKAGE, value);
  }

  public PropertyType getType() {
    return (PropertyType)this.getChild(PropertyDeclaration.TYPE);
  }

  public void setType(PropertyType node) {
    super.setChild(PropertyDeclaration.TYPE, node);
  }

  public PropertyValueExpression getPropertyValue() {
    return (PropertyValueExpression)this.getChild(PropertyDeclaration.PROPERTY_VALUE);
  }

  public void setPropertyValue(PropertyValueExpression node) {
    super.setChild(PropertyDeclaration.PROPERTY_VALUE, node);
  }


  public static PropertyDeclaration newInstance(SModel sm, boolean init) {
    return (PropertyDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.PropertyDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyDeclaration newInstance(SModel sm) {
    return PropertyDeclaration.newInstance(sm, false);
  }

}
