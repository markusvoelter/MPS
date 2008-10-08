package jetbrains.mps.bootstrap.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitLabelStatement extends EmitStatement implements INamedConcept {
  public static final String concept = "jetbrains.mps.bootstrap.dataFlow.structure.EmitLabelStatement";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public EmitLabelStatement(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(EmitLabelStatement.NAME);
  }

  public void setName(String value) {
    this.setProperty(EmitLabelStatement.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(EmitLabelStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(EmitLabelStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(EmitLabelStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(EmitLabelStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(EmitLabelStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(EmitLabelStatement.VIRTUAL_PACKAGE, value);
  }


  public static EmitLabelStatement newInstance(SModel sm, boolean init) {
    return (EmitLabelStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.dataFlow.structure.EmitLabelStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitLabelStatement newInstance(SModel sm) {
    return EmitLabelStatement.newInstance(sm, false);
  }

}
