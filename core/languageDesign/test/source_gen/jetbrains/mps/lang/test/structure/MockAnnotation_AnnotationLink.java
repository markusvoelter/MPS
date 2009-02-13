package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class MockAnnotation_AnnotationLink {
  public static final String MOCK_ANNOTATION = "mockAnnotation";

  public static void setMockAnnotation(BaseConcept source, MockAnnotation target) {
    source.setAttribute(MockAnnotation_AnnotationLink.MOCK_ANNOTATION, target);
  }

  public static MockAnnotation getMockAnnotation(BaseConcept source) {
    return (MockAnnotation)source.getAttribute(MockAnnotation_AnnotationLink.MOCK_ANNOTATION);
  }

}
