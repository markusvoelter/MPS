package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class VarVariableDeclaration extends Statement implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.VarVariableDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String INIT = "init";

  public VarVariableDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(VarVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(VarVariableDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(VarVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(VarVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(VarVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(VarVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(VarVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(VarVariableDeclaration.VIRTUAL_PACKAGE, value);
  }

  public Expression getInit() {
    return (Expression)this.getChild(Expression.class, VarVariableDeclaration.INIT);
  }

  public void setInit(Expression node) {
    super.setChild(VarVariableDeclaration.INIT, node);
  }


  public static VarVariableDeclaration newInstance(SModel sm, boolean init) {
    return (VarVariableDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.VarVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static VarVariableDeclaration newInstance(SModel sm) {
    return VarVariableDeclaration.newInstance(sm, false);
  }

}
