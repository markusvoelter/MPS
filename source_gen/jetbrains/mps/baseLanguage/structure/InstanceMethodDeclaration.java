package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceMethodDeclaration extends BaseMethodDeclaration implements ClassifierMember {
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String IS_ABSTRACT = "isAbstract";
  public static String VISIBILITY = "visibility";

  public  InstanceMethodDeclaration(SNode node) {
    super(node);
  }

  public static InstanceMethodDeclaration newInstance(SModel sm, boolean init) {
    return (InstanceMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceMethodDeclaration newInstance(SModel sm) {
    return InstanceMethodDeclaration.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(InstanceMethodDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InstanceMethodDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InstanceMethodDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InstanceMethodDeclaration.ALIAS, value);
  }

  public boolean getIsAbstract() {
    return this.getBooleanProperty(InstanceMethodDeclaration.IS_ABSTRACT);
  }

  public void setIsAbstract(boolean value) {
    this.setBooleanProperty(InstanceMethodDeclaration.IS_ABSTRACT, value);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(InstanceMethodDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(InstanceMethodDeclaration.VISIBILITY, node);
  }

}
