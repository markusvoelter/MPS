package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AttributeDeclaration extends AttributeExpression implements INamedConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.AttributeDeclaration";
  public static final String ATTRIBUTE_NAME = "attributeName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String USE_ATTRIBUTE = "useAttribute";
  public static final String TYPE = "type";

  public AttributeDeclaration(SNode node) {
    super(node);
  }

  public String getAttributeName() {
    return this.getProperty(AttributeDeclaration.ATTRIBUTE_NAME);
  }

  public void setAttributeName(String value) {
    this.setProperty(AttributeDeclaration.ATTRIBUTE_NAME, value);
  }

  public String getName() {
    return this.getProperty(AttributeDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(AttributeDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AttributeDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AttributeDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AttributeDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AttributeDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AttributeDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AttributeDeclaration.VIRTUAL_PACKAGE, value);
  }

  public UseAttribute getUseAttribute() {
    return (UseAttribute) this.getChild(UseAttribute.class, AttributeDeclaration.USE_ATTRIBUTE);
  }

  public void setUseAttribute(UseAttribute node) {
    super.setChild(AttributeDeclaration.USE_ATTRIBUTE, node);
  }

  public SchemaType getType() {
    return (SchemaType) this.getChild(SchemaType.class, AttributeDeclaration.TYPE);
  }

  public void setType(SchemaType node) {
    super.setChild(AttributeDeclaration.TYPE, node);
  }

  public static AttributeDeclaration newInstance(SModel sm, boolean init) {
    return (AttributeDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.AttributeDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AttributeDeclaration newInstance(SModel sm) {
    return AttributeDeclaration.newInstance(sm, false);
  }
}
