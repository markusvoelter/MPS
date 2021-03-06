package jetbrains.mps.lang.generator.generationContext.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GenerationContextOp_PropertyPatternRef extends GenerationContextOp_PatternRef {
  public static final String concept = "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_PropertyPatternRef";
  public static final String PROPERTY_PATTERN_VAR = "propertyPatternVar";

  public GenerationContextOp_PropertyPatternRef(SNode node) {
    super(node);
  }

  public PropertyPatternVariableDeclaration getPropertyPatternVar() {
    return (PropertyPatternVariableDeclaration) this.getReferent(PropertyPatternVariableDeclaration.class, GenerationContextOp_PropertyPatternRef.PROPERTY_PATTERN_VAR);
  }

  public void setPropertyPatternVar(PropertyPatternVariableDeclaration node) {
    super.setReferent(GenerationContextOp_PropertyPatternRef.PROPERTY_PATTERN_VAR, node);
  }

  public static GenerationContextOp_PropertyPatternRef newInstance(SModel sm, boolean init) {
    return (GenerationContextOp_PropertyPatternRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_PropertyPatternRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GenerationContextOp_PropertyPatternRef newInstance(SModel sm) {
    return GenerationContextOp_PropertyPatternRef.newInstance(sm, false);
  }
}
