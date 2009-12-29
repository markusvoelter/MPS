package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;

public class MethodDocComment_AnnotationLink {
  public static final String METHOD_DOC_COMMENT = "methodDocComment";

  public static void setMethodDocComment(BaseMethodDeclaration source, MethodDocComment target) {
    source.setAttribute(MethodDocComment_AnnotationLink.METHOD_DOC_COMMENT, target);
  }

  public static MethodDocComment getMethodDocComment(BaseMethodDeclaration source) {
    return (MethodDocComment) source.getAttribute(MethodDocComment_AnnotationLink.METHOD_DOC_COMMENT);
  }
}
