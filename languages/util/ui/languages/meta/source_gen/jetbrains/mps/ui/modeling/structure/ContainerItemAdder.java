package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ContainerItemAdder extends ConceptFunction implements IAspectParameterHolder {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.ContainerItemAdder";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ASPECT_PARAMETER = "aspectParameter";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ContainerItemAdder(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ContainerItemAdder.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ContainerItemAdder.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ContainerItemAdder.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ContainerItemAdder.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ContainerItemAdder.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ContainerItemAdder.VIRTUAL_PACKAGE, value);
  }

  public int getAspectParametersCount() {
    return this.getChildCount(ContainerItemAdder.ASPECT_PARAMETER);
  }

  public Iterator<AspectParameterDecl> aspectParameters() {
    return this.children(AspectParameterDecl.class, ContainerItemAdder.ASPECT_PARAMETER);
  }

  public List<AspectParameterDecl> getAspectParameters() {
    return this.getChildren(AspectParameterDecl.class, ContainerItemAdder.ASPECT_PARAMETER);
  }

  public void addAspectParameter(AspectParameterDecl node) {
    this.addChild(ContainerItemAdder.ASPECT_PARAMETER, node);
  }

  public void insertAspectParameter(AspectParameterDecl prev, AspectParameterDecl node) {
    this.insertChild(prev, ContainerItemAdder.ASPECT_PARAMETER, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ContainerItemAdder.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ContainerItemAdder.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ContainerItemAdder.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ContainerItemAdder.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ContainerItemAdder.SMODEL_ATTRIBUTE, node);
  }

  public static ContainerItemAdder newInstance(SModel sm, boolean init) {
    return (ContainerItemAdder) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.ContainerItemAdder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ContainerItemAdder newInstance(SModel sm) {
    return ContainerItemAdder.newInstance(sm, false);
  }
}
