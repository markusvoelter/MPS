package jetbrains.mps.bootstrap.editorLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.editorLanguage.behavior.CellMenuUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CellMenuPart_ReplaceChild_currentChild_InferenceRule implements InferenceRule_Runtime {

  public typeof_CellMenuPart_ReplaceChild_currentChild_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode hostMenuPart = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract", false, false);
    SNode editedFeature = CellMenuUtil.getEditedFeature(hostMenuPart);
    if (SNodeOperations.isInstanceOf(editedFeature, "jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration")) {
      SNode conceptOfChild = SLinkOperations.getTarget(editedFeature, "target", false);
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_3().createNode(conceptOfChild), node, "jetbrains.mps.bootstrap.editorLanguage.helgins", "1179782398208");
      return;
    }
    {
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().reportTypeError(node, "couldn't define concept of child node", "jetbrains.mps.bootstrap.editorLanguage.helgins@3_0", "1220348860880", intentionProvider);
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_4().createNode(), node, "jetbrains.mps.bootstrap.editorLanguage.helgins", "1179766709137");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceChild_currentChild";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
