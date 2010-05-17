package jetbrains.mps.ui.internal.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.ui.modeling.structure.IPartiallyDefinedStub;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.modeling.structure.HasTemplate;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeStub extends Type implements IPartiallyDefinedStub {
  public static final String concept = "jetbrains.mps.ui.internal.structure.TypeStub";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String HAS_TEMPLATE = "hasTemplate";
  public static final String SELECTOR = "selector";
  public static final String ROLE = "role";
  public static final String TEMPLATE = "template";

  public TypeStub(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(TypeStub.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TypeStub.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TypeStub.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TypeStub.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TypeStub.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TypeStub.VIRTUAL_PACKAGE, value);
  }

  public HasTemplate getHasTemplate() {
    return (HasTemplate) this.getReferent(HasTemplate.class, TypeStub.HAS_TEMPLATE);
  }

  public void setHasTemplate(HasTemplate node) {
    super.setReferent(TypeStub.HAS_TEMPLATE, node);
  }

  public LinkDeclaration getSelector() {
    return (LinkDeclaration) this.getReferent(LinkDeclaration.class, TypeStub.SELECTOR);
  }

  public void setSelector(LinkDeclaration node) {
    super.setReferent(TypeStub.SELECTOR, node);
  }

  public LinkDeclaration getRole() {
    return (LinkDeclaration) this.getReferent(LinkDeclaration.class, TypeStub.ROLE);
  }

  public void setRole(LinkDeclaration node) {
    super.setReferent(TypeStub.ROLE, node);
  }

  public BaseConcept getTemplate() {
    return (BaseConcept) this.getReferent(BaseConcept.class, TypeStub.TEMPLATE);
  }

  public void setTemplate(BaseConcept node) {
    super.setReferent(TypeStub.TEMPLATE, node);
  }

  public static TypeStub newInstance(SModel sm, boolean init) {
    return (TypeStub) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.internal.structure.TypeStub", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeStub newInstance(SModel sm) {
    return TypeStub.newInstance(sm, false);
  }
}
