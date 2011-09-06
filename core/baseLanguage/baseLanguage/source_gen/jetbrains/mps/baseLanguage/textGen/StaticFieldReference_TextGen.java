package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class StaticFieldReference_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    BaseLanguageTextGen.importRefPart(SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "classifier")), this);
    this.append(this.getReferentPresentation(SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", "classifier")), true));
    this.append(".");
    this.append(this.getReferentPresentation(SNodeOperations.getReference(SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.VariableReference"), SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.VariableReference", "variableDeclaration")), false));
  }
}
