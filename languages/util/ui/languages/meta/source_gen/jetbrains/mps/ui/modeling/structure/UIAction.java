package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UIAction extends BaseConcept implements INamedConcept, HasTemplate {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.UIAction";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public UIAction(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(UIAction.NAME);
  }

  public void setName(String value) {
    this.setProperty(UIAction.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(UIAction.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(UIAction.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(UIAction.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(UIAction.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(UIAction.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(UIAction.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(UIAction.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, UIAction.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, UIAction.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(UIAction.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, UIAction.SMODEL_ATTRIBUTE, node);
  }

  public static UIAction newInstance(SModel sm, boolean init) {
    return (UIAction) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.UIAction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UIAction newInstance(SModel sm) {
    return UIAction.newInstance(sm, false);
  }
}
