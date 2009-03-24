package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Visibility;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StaticMethodDeclaration extends jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration implements jetbrains.mps.baseLanguage.structure.ClassifierMember, jetbrains.mps.lang.core.structure.IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String VISIBILITY = "visibility";

  public StaticMethodDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(StaticMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(StaticMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(StaticMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(StaticMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(StaticMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(StaticMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(StaticMethodDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(StaticMethodDeclaration.RESOLVE_INFO, value);
  }

  public jetbrains.mps.baseLanguage.structure.Visibility getVisibility() {
    return (jetbrains.mps.baseLanguage.structure.Visibility)this.getChild(Visibility.class, StaticMethodDeclaration.VISIBILITY);
  }

  public void setVisibility(jetbrains.mps.baseLanguage.structure.Visibility node) {
    super.setChild(StaticMethodDeclaration.VISIBILITY, node);
  }


  public static StaticMethodDeclaration newInstance(SModel sm, boolean init) {
    return (StaticMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StaticMethodDeclaration newInstance(SModel sm) {
    return StaticMethodDeclaration.newInstance(sm, false);
  }

}
