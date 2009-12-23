package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SwitchStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if ((SLinkOperations.getTarget(node, "switchLabel", true) != null)) {
      this.appendNewLine();
      this.append(SPropertyOperations.getString(SLinkOperations.getTarget(node, "switchLabel", true), "name"));
      this.append(":");
    } else if (SPropertyOperations.getString(node, "label") != null) {
      this.appendNewLine();
      this.append(SPropertyOperations.getString(node, "label"));
      this.append(":");
    }
    this.appendNewLine();
    this.appendWithIndent("switch (");
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "expression", true), this.getSNode());
    this.append(") {");
    this.increaseDepth();
    for (SNode sc : SLinkOperations.getTargets(node, "case", true)) {
      this.appendNewLine();
      this.appendWithIndent("case ");
      if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(sc, "expression", true), "jetbrains.mps.baseLanguage.structure.EnumConstantReference")) {
        SNode enumConstant = (SNode) SLinkOperations.getTarget(sc, "expression", true);
        this.append(SPropertyOperations.getString(SLinkOperations.getTarget(enumConstant, "enumConstantDeclaration", false), "name"));
      } else {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(sc, "expression", true), this.getSNode());
      }
      this.append(":");
      this.increaseDepth();
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(sc, "body", true), this.getSNode());
      this.decreaseDepth();
    }
    this.appendNewLine();
    this.appendWithIndent("default:");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "defaultBlock", true), this.getSNode());
    this.decreaseDepth();
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
  }
}
