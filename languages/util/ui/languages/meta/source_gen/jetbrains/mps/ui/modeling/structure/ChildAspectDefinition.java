package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChildAspectDefinition extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.ChildAspectDefinition";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String OPTIONAL = "optional";
  public static final String ASPECT_TYPE = "aspectType";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ChildAspectDefinition(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(ChildAspectDefinition.NAME);
  }

  public void setName(String value) {
    this.setProperty(ChildAspectDefinition.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ChildAspectDefinition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ChildAspectDefinition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ChildAspectDefinition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ChildAspectDefinition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ChildAspectDefinition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ChildAspectDefinition.VIRTUAL_PACKAGE, value);
  }

  public boolean getOptional() {
    return this.getBooleanProperty(ChildAspectDefinition.OPTIONAL);
  }

  public void setOptional(boolean value) {
    this.setBooleanProperty(ChildAspectDefinition.OPTIONAL, value);
  }

  public Type getAspectType() {
    return (Type) this.getChild(Type.class, ChildAspectDefinition.ASPECT_TYPE);
  }

  public void setAspectType(Type node) {
    super.setChild(ChildAspectDefinition.ASPECT_TYPE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ChildAspectDefinition.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ChildAspectDefinition.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ChildAspectDefinition.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ChildAspectDefinition.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ChildAspectDefinition.SMODEL_ATTRIBUTE, node);
  }

  public static ChildAspectDefinition newInstance(SModel sm, boolean init) {
    return (ChildAspectDefinition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.ChildAspectDefinition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildAspectDefinition newInstance(SModel sm) {
    return ChildAspectDefinition.newInstance(sm, false);
  }
}
