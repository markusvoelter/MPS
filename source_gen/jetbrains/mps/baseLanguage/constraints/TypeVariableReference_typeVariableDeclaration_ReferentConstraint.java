package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS Nov 27, 2006 9:10:41 PM */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.search.ISearchScope;
import jetbrains.mps.smodel.search.SimpleSearchScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class TypeVariableReference_typeVariableDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  TypeVariableReference_typeVariableDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration", this);
  }
  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.baseLanguage.structure.TypeVariableReference", "typeVariableDeclaration");
  }
  public boolean canCreateNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    SNode genericDeclaration = SNodeOperations.getParent(enclosingNode, "jetbrains.mps.baseLanguage.structure.GenericDeclaration", true, false);
    return genericDeclaration != null;
  }
  public ISearchScope createNodeReferentSearchScope(SModel model, SNode enclosingNode, SNode referenceNode, IScope scope) {
    SNode genericDeclaration = SNodeOperations.getParent(enclosingNode, "jetbrains.mps.baseLanguage.structure.GenericDeclaration", true, false);
    return new SimpleSearchScope(SLinkOperations.getTargets(genericDeclaration, "typeVariableDeclaration", true));
  }
  public String getNodeReferentSearchScopeDescription() {
    return "type-variables declared in enclosing classifier";
  }
}
