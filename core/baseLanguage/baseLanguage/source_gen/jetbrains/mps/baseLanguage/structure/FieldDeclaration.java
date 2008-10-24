package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.lang.core.structure.IDeprecatable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FieldDeclaration extends VariableDeclaration implements ClassifierMember, IResolveInfo, IDeprecatable {
public    static final String concept = "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
public    static final String SHORT_DESCRIPTION = "shortDescription";
public    static final String ALIAS = "alias";
public    static final String VIRTUAL_PACKAGE = "virtualPackage";
public    static final String RESOLVE_INFO = "resolveInfo";
public    static final String IS_DEPRECATED = "isDeprecated";
public    static final String VISIBILITY = "visibility";

  public FieldDeclaration(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(FieldDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FieldDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FieldDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FieldDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FieldDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FieldDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(FieldDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(FieldDeclaration.RESOLVE_INFO, value);
  }

  public boolean getIsDeprecated() {
    return this.getBooleanProperty(FieldDeclaration.IS_DEPRECATED);
  }

  public void setIsDeprecated(boolean value) {
    this.setBooleanProperty(FieldDeclaration.IS_DEPRECATED, value);
  }

  public Visibility getVisibility() {
    return (Visibility)this.getChild(FieldDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(FieldDeclaration.VISIBILITY, node);
  }


  public static FieldDeclaration newInstance(SModel sm, boolean init) {
    return (FieldDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.FieldDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FieldDeclaration newInstance(SModel sm) {
    return FieldDeclaration.newInstance(sm, false);
  }

}
