package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorContext;

public class AddAnnotation_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Annotable";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, IOperationContext operationContext) {
    return "Add annotation";
  }

  public boolean isApplicable(SNode node, IOperationContext operationContext) {
    return SequenceOperations.isEmpty(SLinkOperations.getTargets(node, "annotation", true));
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode annotationInstance = SLinkOperations.addNewChild(node, "annotation", "jetbrains.mps.baseLanguage.structure.AnnotationInstance");
    editorContext.selectLater(annotationInstance);
  }

}
