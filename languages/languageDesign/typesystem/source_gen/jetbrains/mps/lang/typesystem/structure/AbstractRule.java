package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IValidIdentifier;
import jetbrains.mps.lang.structure.structure.IConceptAspect;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractRule extends BaseConcept implements IValidIdentifier, IConceptAspect {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.AbstractRule";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String APPLICABLE_NODE = "applicableNode";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public AbstractRule(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(AbstractRule.NAME);
  }

  public void setName(String value) {
    this.setProperty(AbstractRule.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(AbstractRule.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AbstractRule.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AbstractRule.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AbstractRule.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AbstractRule.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AbstractRule.VIRTUAL_PACKAGE, value);
  }

  public ApplicableNodeCondition getApplicableNode() {
    return (ApplicableNodeCondition) this.getChild(ApplicableNodeCondition.class, AbstractRule.APPLICABLE_NODE);
  }

  public void setApplicableNode(ApplicableNodeCondition node) {
    super.setChild(AbstractRule.APPLICABLE_NODE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(AbstractRule.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, AbstractRule.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, AbstractRule.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(AbstractRule.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AbstractRule.SMODEL_ATTRIBUTE, node);
  }

  public static AbstractRule newInstance(SModel sm, boolean init) {
    return (AbstractRule) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.AbstractRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractRule newInstance(SModel sm) {
    return AbstractRule.newInstance(sm, false);
  }
}
