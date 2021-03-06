package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateArgumentPatternRef extends Expression {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef";

  public TemplateArgumentPatternRef(SNode node) {
    super(node);
  }

  public static TemplateArgumentPatternRef newInstance(SModel sm, boolean init) {
    return (TemplateArgumentPatternRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateArgumentPatternRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateArgumentPatternRef newInstance(SModel sm) {
    return TemplateArgumentPatternRef.newInstance(sm, false);
  }
}
