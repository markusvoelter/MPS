package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.textGen.behavior.ScopeConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CatchClause_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.createScopeInfo(this, node);
    }
    this.appendWithIndent("} catch (");
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "throwable", true), this.getSNode());
    this.append(") {");
    this.increaseDepth();
    TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "catchBody", true), this.getSNode());
    this.decreaseDepth();
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.fillScopeInfo(this, node, ScopeConcept_Behavior.call_getScopeVariables_3822000666564591100(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.ScopeConcept")));
    }
  }
}
