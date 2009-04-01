package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.ClassifierMember;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.baseLanguage.structure.PropertyImplementation;
import jetbrains.mps.baseLanguage.structure.Visibility;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Property extends BaseConcept implements ClassifierMember, INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.Property";
  public static final String PROPERTY_NAME = "propertyName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
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

  public String getName() {
    return this.getProperty(Property.NAME);
  }

  public void setName(String value) {
    this.setProperty(Property.NAME, value);
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

  public Type getType() {
    return (Type)this.getChild(Type.class, Property.TYPE);
  }

  public void setType(Type node) {
    super.setChild(Property.TYPE, node);
  }

  public PropertyImplementation getPropertyImplementation() {
    return (PropertyImplementation)this.getChild(PropertyImplementation.class, Property.PROPERTY_IMPLEMENTATION);
  }

  public void setPropertyImplementation(PropertyImplementation node) {
    super.setChild(Property.PROPERTY_IMPLEMENTATION, node);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(Visibility.class, Property.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(Property.VISIBILITY, node);
  }


  public static Property newInstance(SModel sm, boolean init) {
    return (Property)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.Property", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Property newInstance(SModel sm) {
    return Property.newInstance(sm, false);
  }

}
