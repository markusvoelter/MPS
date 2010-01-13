package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AnonymousClass_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    BaseLanguageTextGen.importPart(SLinkOperations.getTarget(node, "classifier", false), this);
    this.append(this.getReferentPresentation(SNodeOperations.getReference(node, SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClass", "classifier")), true));
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).isNotEmpty()) {
      this.append("<");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "typeParameter", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(">");
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      this.append("(");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(")");
    } else {
      this.append("(");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isNotEmpty()) {
        for (SNode item : SLinkOperations.getTargets(node, "actualArgument", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(")");
    }
    if ((SLinkOperations.getTarget(node, "instanceInitializer", true) == null) && ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isEmpty() && ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).isEmpty()) {
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept") && !(SPropertyOperations.getBoolean(SNodeOperations.cast(SLinkOperations.getTarget(node, "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept"), "abstractClass"))) {
        return;
      } else {
        this.append(" {}");
        return;
      }
    }
    this.append(" {");
    this.increaseDepth();
    BaseClassConceptTextGen.body(node, this);
    this.decreaseDepth();
    this.appendWithIndent("}");
  }
}
