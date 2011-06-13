package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TryStatement_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.createPositionInfo(this, node);
    }
    this.appendNewLine();
    this.indentBuffer();
    this.append("try {");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
    this.decreaseDepth();
    this.appendNewLine();
    for (SNode clause : SLinkOperations.getTargets(node, "catchClause", true)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), clause, this.getSNode());
      this.appendNewLine();
    }
    this.appendWithIndent("} finally {");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "finallyBody", true), this.getSNode());
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.TraceableConcept")));
    }
  }
}
