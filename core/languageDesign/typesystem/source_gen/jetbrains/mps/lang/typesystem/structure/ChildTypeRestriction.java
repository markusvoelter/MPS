package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.structure.RestrictionKind;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ChildTypeRestriction extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.core.structure.INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ChildTypeRestriction";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESTRICTION_KIND = "restrictionKind";
  public static final String CHILD_LINK_DECLARATION = "childLinkDeclaration";
  public static final String TYPE = "type";

  public ChildTypeRestriction(SNode node) {
    super(node);
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

  public jetbrains.mps.lang.structure.structure.LinkDeclaration getChildLinkDeclaration() {
    return (jetbrains.mps.lang.structure.structure.LinkDeclaration)this.getReferent(LinkDeclaration.class, ChildTypeRestriction.CHILD_LINK_DECLARATION);
  }

  public void setChildLinkDeclaration(jetbrains.mps.lang.structure.structure.LinkDeclaration node) {
    super.setReferent(ChildTypeRestriction.CHILD_LINK_DECLARATION, node);
  }

  public jetbrains.mps.baseLanguage.structure.Expression getType() {
    return (jetbrains.mps.baseLanguage.structure.Expression)this.getChild(Expression.class, ChildTypeRestriction.TYPE);
  }

  public void setType(jetbrains.mps.baseLanguage.structure.Expression node) {
    super.setChild(ChildTypeRestriction.TYPE, node);
  }


  public static ChildTypeRestriction newInstance(SModel sm, boolean init) {
    return (ChildTypeRestriction)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ChildTypeRestriction", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ChildTypeRestriction newInstance(SModel sm) {
    return ChildTypeRestriction.newInstance(sm, false);
  }

}
