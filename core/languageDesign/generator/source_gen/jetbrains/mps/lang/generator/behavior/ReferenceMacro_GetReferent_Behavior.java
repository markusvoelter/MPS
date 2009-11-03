package jetbrains.mps.lang.generator.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.smodel.search.ConceptAndSuperConceptsScope;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class ReferenceMacro_GetReferent_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getExpectedReturnType_1213877374441(SNode thisNode) {
    SNode referenceMacro = SNodeOperations.getAncestor(thisNode, "jetbrains.mps.lang.generator.structure.ReferenceMacro", false, false);
    SNode attributedNode = SNodeOperations.getParent(referenceMacro);
    String linkRole = AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(referenceMacro.getRole_());
    ConceptAndSuperConceptsScope linkSearchScope = new ConceptAndSuperConceptsScope(((AbstractConceptDeclaration)SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(attributedNode))));
    LinkDeclaration link_ = linkSearchScope.getMostSpecificLinkDeclarationByRole(linkRole);
    SNode link = SNodeOperations.cast(BaseAdapter.fromAdapter(link_), "jetbrains.mps.lang.structure.structure.LinkDeclaration");
    SNode targetConcept = SLinkOperations.getTarget(link, "target", false);
    SNode expectedNodeType = new _Quotations.QuotationClass_0().createNode(targetConcept);
    // reference may be resolved dynamically? 
    if (SConceptOperations.isSubConceptOf(targetConcept, "jetbrains.mps.lang.core.structure.IResolveInfo")) {
      return new _Quotations.QuotationClass_1().createNode(targetConcept);
    }
    return expectedNodeType;
  }
}
