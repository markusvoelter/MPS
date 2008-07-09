package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransform_SimpleString extends BaseConcept implements ISideTransform_String {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransform_SimpleString";
  public static String TEXT = "text";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public SideTransform_SimpleString(SNode node) {
    super(node);
  }

  public static SideTransform_SimpleString newInstance(SModel sm, boolean init) {
    return (SideTransform_SimpleString)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransform_SimpleString", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransform_SimpleString newInstance(SModel sm) {
    return SideTransform_SimpleString.newInstance(sm, false);
  }


  public String getText() {
    return this.getProperty(SideTransform_SimpleString.TEXT);
  }

  public void setText(String value) {
    this.setProperty(SideTransform_SimpleString.TEXT, value);
  }

  public String getShortDescription() {
    return this.getProperty(SideTransform_SimpleString.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SideTransform_SimpleString.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SideTransform_SimpleString.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SideTransform_SimpleString.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SideTransform_SimpleString.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SideTransform_SimpleString.VIRTUAL_PACKAGE, value);
  }

}
