package jetbrains.mps.baseLanguage.classifiers.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Visibility;

public class DefaultClassifierMethodDeclaration extends BaseMethodDeclaration implements IMember {
  public static final String concept = "jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String VISIBILITY = "visibility";

  public DefaultClassifierMethodDeclaration(SNode node) {
    super(node);
  }

  public static DefaultClassifierMethodDeclaration newInstance(SModel sm, boolean init) {
    return ((DefaultClassifierMethodDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static DefaultClassifierMethodDeclaration newInstance(SModel sm) {
    return DefaultClassifierMethodDeclaration.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(DefaultClassifierMethodDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(DefaultClassifierMethodDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DefaultClassifierMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DefaultClassifierMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DefaultClassifierMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DefaultClassifierMethodDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DefaultClassifierMethodDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DefaultClassifierMethodDeclaration.VIRTUAL_PACKAGE, value);
  }

  public Visibility getVisibility() {
    return ((Visibility) this.getChild(DefaultClassifierMethodDeclaration.VISIBILITY));
  }

  public void setVisibility(Visibility node) {
    super.setChild(DefaultClassifierMethodDeclaration.VISIBILITY, node);
  }

}
