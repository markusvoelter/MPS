package jetbrains.mps.baseLanguage.builders.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ChangeRoot_Intention extends BaseIntention implements Intention {
  public ChangeRoot_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderDeclaration";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return (SPropertyOperations.getBoolean(node, "root") ?
      "Make Non Root" :
      "Make Root"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SPropertyOperations.set(node, "root", "" + !(SPropertyOperations.getBoolean(node, "root")));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.builders.intentions";
  }
}
