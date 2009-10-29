package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.textGen.TextGenManager;

public class ForeachStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (SLinkOperations.getTarget(node, "loopLabel", true) != null) {
      this.appendNewLine();
      this.append(SPropertyOperations.getString(SLinkOperations.getTarget(node, "loopLabel", true), "name"));
      this.append(":");
    } else if (SPropertyOperations.getString(node, "label") != null) {
      this.appendNewLine();
      this.append(SPropertyOperations.getString(node, "label"));
      this.append(":");
    }
    this.appendNewLine();
    this.indentBuffer();
    this.append("for (");
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "variable", true), this.getSNode());
    this.append(" : ");
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "iterable", true), this.getSNode());
    this.append(") {");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
  }
}
