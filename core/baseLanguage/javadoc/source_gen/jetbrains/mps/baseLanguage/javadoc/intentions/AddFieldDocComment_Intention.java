package jetbrains.mps.baseLanguage.javadoc.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class AddFieldDocComment_Intention extends BaseIntention implements Intention {
  public AddFieldDocComment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.FieldDeclaration";
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
    return ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("fieldDocComment"), true) == null) ?
      "Add Documentation Comment" :
      "Remove Documentation Comment"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("fieldDocComment"), true) == null)) {
      SNodeFactoryOperations.setNewChild(node, AttributesRolesUtil.childRoleFromAttributeRole("fieldDocComment"), "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment");
    } else {
      SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("fieldDocComment"), null, true);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.javadoc.intentions";
  }
}
