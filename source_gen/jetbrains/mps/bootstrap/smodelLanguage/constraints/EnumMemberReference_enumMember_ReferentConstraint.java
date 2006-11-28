package jetbrains.mps.bootstrap.smodelLanguage.constraints;

/*Generated by MPS Nov 27, 2006 9:16:59 PM */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.SModelLanguageUtil;
import jetbrains.mps.bootstrap.smodelLanguage.SNodeOperation;
import jetbrains.mps.typesystem.TypeCheckerAccess;
import jetbrains.mps.smodel.DataTypeUtil;
import jetbrains.mps.bootstrap.structureLanguage.DataTypeDeclaration;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class EnumMemberReference_enumMember_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  EnumMemberReference_enumMember_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference", "enumMember", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.bootstrap.smodelLanguage.structure.EnumMemberReference", "enumMember");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    if(SNodeOperations.isInstanceOf(enclosingNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation") || SNodeOperations.isInstanceOf(enclosingNode, "jetbrains.mps.bootstrap.smodelLanguage.structure.Property_HasValue_Enum")) {
      SNode datatype = SModelLanguageUtil.getDatatypeFromLeftExpression_Property((SNodeOperation)enclosingNode, TypeCheckerAccess.getTypeChecker());
      if(DataTypeUtil.isEnum((DataTypeDeclaration)datatype)) {
        return true;
      }
    }
    return false;
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    SNode datatype = SModelLanguageUtil.getDatatypeFromLeftExpression_Property((SNodeOperation)enclosingNode, TypeCheckerAccess.getTypeChecker());
    return new SimpleSearchScope(SLinkOperations.getTargets(datatype, "member", true));
  }
  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }
}
