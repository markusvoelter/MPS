package jetbrains.mps.baseLanguage.javadoc.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class AuthorBlockDocTag_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.appendNewLine();
    DocCommentTextGen.javadocIndent(this);
    this.append("@author ");
    this.append(SPropertyOperations.getString(node, "text"));
  }
}
