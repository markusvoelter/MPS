package jetbrains.mps.lang.quotation.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class CreateReferenceAntiquotation_Intention extends BaseIntention {
  public CreateReferenceAntiquotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.quotation.structure.Quotation";
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
    return "Create Reference Antiquotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    EditorCell selectedCell = editorContext.getSelectedCell();
    SNode contextNode = SNodeOperations.cast(selectedCell.getSNode(), "jetbrains.mps.lang.core.structure.BaseConcept");
    SNode linkNode = BaseAdapter.fromAdapter(selectedCell.getLinkDeclaration());
    if (!(SNodeOperations.isInstanceOf(linkNode, "jetbrains.mps.lang.structure.structure.LinkDeclaration"))) {
      return false;
    }
    if (contextNode == null) {
      return false;
    }
    SNode link = SNodeOperations.cast(linkNode, "jetbrains.mps.lang.structure.structure.LinkDeclaration");
    if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    EditorCell selectedCell = editorContext.getSelectedCell();
    SNode contextNode = SNodeOperations.cast(selectedCell.getSNode(), "jetbrains.mps.lang.core.structure.BaseConcept");
    SNode linkNode = BaseAdapter.fromAdapter(selectedCell.getLinkDeclaration());
    if (!(SNodeOperations.isInstanceOf(linkNode, "jetbrains.mps.lang.structure.structure.LinkDeclaration"))) {
      return;
    }
    if (contextNode == null) {
      return;
    }
    SNode link = SNodeOperations.cast(linkNode, "jetbrains.mps.lang.structure.structure.LinkDeclaration");
    if (SPropertyOperations.hasValue(link, "metaClass", "aggregation", "reference")) {
      return;
    }
    String role = SPropertyOperations.getString(link, "role");
    if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation")) {
      SNode attributedNode = SNodeOperations.cast(SNodeOperations.getParent(contextNode), "jetbrains.mps.lang.core.structure.BaseConcept");
      assert attributedNode != null;
      SLinkOperations.setTarget(attributedNode, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceAntiquotation", role), null, true);
      attributedNode.setAttribute(null);
      return;
    }
    if (SLinkOperations.getTarget(contextNode, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceAntiquotation", role), true) != null) {
      SLinkOperations.setTarget(contextNode, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceAntiquotation", role), null, true);
    } else {
      SNode referenceAntiquotation = SLinkOperations.setNewChild(contextNode, AttributesRolesUtil.childRoleFromLinkAttributeRole("referenceAntiquotation", role), "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation");
      if (selectedCell.isSingleNodeCell()) {
        SPropertyOperations.set(referenceAntiquotation, "label", SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(contextNode), "name"));
      }
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.quotation.intentions";
  }
}
