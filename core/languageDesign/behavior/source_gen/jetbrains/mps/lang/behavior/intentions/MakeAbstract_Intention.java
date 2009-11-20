package jetbrains.mps.lang.behavior.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MakeAbstract_Intention extends BaseIntention {
  public MakeAbstract_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    if (SPropertyOperations.getBoolean(node, "isAbstract")) {
      return "Make Non-Abstract";
    } else {
      return "Make Abstract";
    }
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if (!(SPropertyOperations.getBoolean(node, "isAbstract"))) {
      SPropertyOperations.set(node, "isVirtual", "" + (true));
    }
    SPropertyOperations.set(node, "isAbstract", "" + (!(SPropertyOperations.getBoolean(node, "isAbstract"))));
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.behavior.intentions";
  }
}
