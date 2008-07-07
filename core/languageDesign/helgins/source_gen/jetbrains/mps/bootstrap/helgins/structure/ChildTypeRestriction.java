package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;

public class ChildTypeRestriction extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.ChildTypeRestriction";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String RESTRICTION_KIND = "restrictionKind";
  public static String CHILD_LINK_DECLARATION = "childLinkDeclaration";
  public static String TYPE = "type";

  public ChildTypeRestriction(SNode node) {
    super(node);
  }

  public static ChildTypeRestriction newInstance(SModel sm, boolean init) {
    return (ChildTypeRestriction)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.ChildTypeRestriction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildTypeRestriction newInstance(SModel sm) {
    return ChildTypeRestriction.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(ChildTypeRestriction.NAME);
  }

  public void setName(String value) {
    this.setProperty(ChildTypeRestriction.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ChildTypeRestriction.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ChildTypeRestriction.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ChildTypeRestriction.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ChildTypeRestriction.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ChildTypeRestriction.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ChildTypeRestriction.VIRTUAL_PACKAGE, value);
  }

  public RestrictionKind getRestrictionKind() {
    String value = super.getProperty(ChildTypeRestriction.RESTRICTION_KIND);
    return RestrictionKind.parseValue(value);
  }

  public void setRestrictionKind(RestrictionKind value) {
    super.setProperty(ChildTypeRestriction.RESTRICTION_KIND, value.getValueAsString());
  }

  public LinkDeclaration getChildLinkDeclaration() {
    return (LinkDeclaration)this.getReferent(ChildTypeRestriction.CHILD_LINK_DECLARATION);
  }

  public void setChildLinkDeclaration(LinkDeclaration node) {
    super.setReferent(ChildTypeRestriction.CHILD_LINK_DECLARATION, node);
  }

  public Expression getType() {
    return (Expression)this.getChild(ChildTypeRestriction.TYPE);
  }

  public void setType(Expression node) {
    super.setChild(ChildTypeRestriction.TYPE, node);
  }

}
