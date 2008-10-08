package jetbrains.mps.samples.matrixLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableDeclaration;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatrixElementVariableDeclaration extends VariableDeclaration implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public MatrixElementVariableDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(MatrixElementVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(MatrixElementVariableDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(MatrixElementVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(MatrixElementVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(MatrixElementVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(MatrixElementVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(MatrixElementVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(MatrixElementVariableDeclaration.VIRTUAL_PACKAGE, value);
  }


  public static MatrixElementVariableDeclaration newInstance(SModel sm, boolean init) {
    return (MatrixElementVariableDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.matrixLanguage.structure.MatrixElementVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatrixElementVariableDeclaration newInstance(SModel sm) {
    return MatrixElementVariableDeclaration.newInstance(sm, false);
  }

}
