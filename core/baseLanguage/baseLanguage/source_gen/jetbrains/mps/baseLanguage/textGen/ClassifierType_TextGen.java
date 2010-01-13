package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.textGen.TextGenManager;

public class ClassifierType_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    BaseLanguageTextGen.importPart(SLinkOperations.getTarget(node, "classifier", false), this);
    this.append(this.getReferentPresentation(SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", "classifier")), true));
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      this.append("<");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(">");
    }
  }
}
