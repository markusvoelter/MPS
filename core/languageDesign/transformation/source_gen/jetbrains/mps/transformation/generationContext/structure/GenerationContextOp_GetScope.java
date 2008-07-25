package jetbrains.mps.transformation.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.transformation.TLBase.structure.MappingLabelDeclaration;

public class GenerationContextOp_GetScope extends GenerationContextOp_Base implements IOperation {
  public static final String concept = "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetScope";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String LABEL = "label";

  public GenerationContextOp_GetScope(SNode node) {
    super(node);
  }

  public static GenerationContextOp_GetScope newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_GetScope)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_GetScope", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_GetScope newInstance(SModel sm) {
    return GenerationContextOp_GetScope.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(GenerationContextOp_GetScope.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GenerationContextOp_GetScope.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GenerationContextOp_GetScope.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GenerationContextOp_GetScope.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GenerationContextOp_GetScope.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GenerationContextOp_GetScope.VIRTUAL_PACKAGE, value);
  }

  public MappingLabelDeclaration getLabel() {
    return (MappingLabelDeclaration)this.getReferent(GenerationContextOp_GetScope.LABEL);
  }

  public void setLabel(MappingLabelDeclaration node) {
    super.setReferent(GenerationContextOp_GetScope.LABEL, node);
  }

}
