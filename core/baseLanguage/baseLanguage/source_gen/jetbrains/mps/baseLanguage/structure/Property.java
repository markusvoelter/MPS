package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.BaseScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Property extends BaseConcept implements BaseScope, BaseScope {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Property";
  public static final String PROPERTY_NAME = "propertyName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String TYPE = "type";
  public static final String PROPERTY_IMPLEMENTATION = "propertyImplementation";
  public static final String VISIBILITY = "visibility";

  public Property(SNode node) {
    super(node);
  }

  public String getPropertyName() {
    return this.getProperty(Property.PROPERTY_NAME);
  }

  public void setPropertyName(String value) {
    this.setProperty(Property.PROPERTY_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Property.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Property.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Property.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Property.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Property.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Property.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(Property.NAME);
  }

  public void setName(String value) {
    this.setProperty(Property.NAME, value);
  }

  public INodeAdapter getType() {
    return (INodeAdapter)this.getChild(, Property.TYPE);
  }

  public void setType(INodeAdapter node) {
    super.setChild(Property.TYPE, node);
  }

  public INodeAdapter getPropertyImplementation() {
    return (INodeAdapter)this.getChild(, Property.PROPERTY_IMPLEMENTATION);
  }

  public void setPropertyImplementation(INodeAdapter node) {
    super.setChild(Property.PROPERTY_IMPLEMENTATION, node);
  }

  public INodeAdapter getVisibility() {
    return (INodeAdapter)this.getChild(, Property.VISIBILITY);
  }

  public void setVisibility(INodeAdapter node) {
    super.setChild(Property.VISIBILITY, node);
  }


  public static Property newInstance(SModel sm, boolean init) {
    return (Property)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Property", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Property newInstance(SModel sm) {
    return Property.newInstance(sm, false);
  }

}
