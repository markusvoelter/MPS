package jetbrains.mps.transformation.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_Base extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_Base";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public GenerationContextOp_Base(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GenerationContextOp_Base.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GenerationContextOp_Base.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GenerationContextOp_Base.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GenerationContextOp_Base.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GenerationContextOp_Base.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GenerationContextOp_Base.VIRTUAL_PACKAGE, value);
  }


  public static GenerationContextOp_Base newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_Base)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_Base", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_Base newInstance(SModel sm) {
    return GenerationContextOp_Base.newInstance(sm, false);
  }

}
