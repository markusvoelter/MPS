package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnnotationMethodDeclaration extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnnotationMethodDeclaration";

  public AnnotationMethodDeclaration(SNode node) {
    super(node);
  }

  public static AnnotationMethodDeclaration newInstance(SModel sm, boolean init) {
    return (AnnotationMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnnotationMethodDeclaration newInstance(SModel sm) {
    return AnnotationMethodDeclaration.newInstance(sm, false);
  }

}
