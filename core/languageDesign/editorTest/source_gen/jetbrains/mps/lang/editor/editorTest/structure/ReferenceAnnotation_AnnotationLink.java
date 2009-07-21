package jetbrains.mps.lang.editor.editorTest.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class ReferenceAnnotation_AnnotationLink {
  public static final String REFERENCE_ANNOTATION = "referenceAnnotation";

  public static void setReferenceAnnotation(BaseConcept source, String propertyName, ReferenceAnnotataion target) {
    source.setLinkAttribute(ReferenceAnnotation_AnnotationLink.REFERENCE_ANNOTATION, propertyName, target);
  }

  public static ReferenceAnnotataion getReferenceAnnotation(BaseConcept source, String linkRole) {
    return (ReferenceAnnotataion)source.getLinkAttribute(ReferenceAnnotation_AnnotationLink.REFERENCE_ANNOTATION, linkRole);
  }

}
