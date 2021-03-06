package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Reduction_MappingRule extends BaseMappingRule implements ReductionRule {
  public static final String concept = "jetbrains.mps.lang.generator.structure.Reduction_MappingRule";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RULE_CONSEQUENCE = "ruleConsequence";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public Reduction_MappingRule(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(Reduction_MappingRule.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Reduction_MappingRule.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Reduction_MappingRule.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Reduction_MappingRule.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Reduction_MappingRule.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Reduction_MappingRule.VIRTUAL_PACKAGE, value);
  }

  public RuleConsequence getRuleConsequence() {
    return (RuleConsequence) this.getChild(RuleConsequence.class, Reduction_MappingRule.RULE_CONSEQUENCE);
  }

  public void setRuleConsequence(RuleConsequence node) {
    super.setChild(Reduction_MappingRule.RULE_CONSEQUENCE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(Reduction_MappingRule.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, Reduction_MappingRule.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, Reduction_MappingRule.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(Reduction_MappingRule.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, Reduction_MappingRule.SMODEL_ATTRIBUTE, node);
  }

  public static Reduction_MappingRule newInstance(SModel sm, boolean init) {
    return (Reduction_MappingRule) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.Reduction_MappingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Reduction_MappingRule newInstance(SModel sm) {
    return Reduction_MappingRule.newInstance(sm, false);
  }
}
