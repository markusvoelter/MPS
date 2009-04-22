package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class AnonymousClass_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    ;
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).isNotEmpty()) {
      this.append(" <");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "typeParameter", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(">");
    }
    this.append("(");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      for(SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(")");
    if ((SLinkOperations.getTarget(node, "superclass", true) != null)) {
      this.append(" extends ");
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "superclass", true), this.getSNode());
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).isNotEmpty()) {
      this.append(" implements ");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "implementedInterface", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "implementedInterface", true)).last()) {
            this.append(", ");
          }
        }
      }
    }
    this.append(" {");
    this.increaseDepth();
    if ((SLinkOperations.getTarget(node, "instanceInitializer", true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "instanceInitializer", true), this.getSNode());
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "staticField", true)).isNotEmpty()) {
      for(SNode item : SLinkOperations.getTargets(node, "staticField", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isNotEmpty()) {
      this.appendNewLine();
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "field", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        }
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "constructor", true)).isNotEmpty()) {
      this.appendNewLine();
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "constructor", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "constructor", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        }
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "staticMethod", true)).isNotEmpty()) {
      this.appendNewLine();
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "staticMethod", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "staticMethod", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        }
      }
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).isNotEmpty()) {
      this.appendNewLine();
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "method", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "method", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        }
      }
    }
    this.decreaseDepth();
    this.appendWithIndent("}");
  }

}
