package jetbrains.mps.baseLanguageInternal.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguageInternal.textGen.BaseLangInternal;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.baseLanguage.textGen.BaseLanguageTextGen;

public class InternalStaticMethodCall_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    BaseLangInternal.className(SPropertyOperations.getString(node, "fqClassName"), this);
    this.append(".");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "typeParameter", true)).isNotEmpty()) {
      this.append("<");
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
    this.append(SPropertyOperations.getString(node, "methodName"));
    BaseLanguageTextGen.arguments(node, this);
  }

}
