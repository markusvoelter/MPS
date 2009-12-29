package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommentLinePart extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.CommentLinePart";

  public CommentLinePart(SNode node) {
    super(node);
  }

  public static CommentLinePart newInstance(SModel sm, boolean init) {
    return (CommentLinePart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.CommentLinePart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommentLinePart newInstance(SModel sm) {
    return CommentLinePart.newInstance(sm, false);
  }
}
