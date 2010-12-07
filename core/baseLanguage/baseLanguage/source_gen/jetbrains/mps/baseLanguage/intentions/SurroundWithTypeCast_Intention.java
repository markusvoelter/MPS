package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.actions.ExpectedType_FactoryUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class SurroundWithTypeCast_Intention extends SurroundWithIntention implements Intention {
  public SurroundWithTypeCast_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "(Type) expr";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return editorContext.getSelectedNodes().size() == 1;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode expectedType = ExpectedType_FactoryUtil.createExpectedType(node);
    SNode castExpression = new SurroundWithTypeCast_Intention.QuotationClass_598b5x_a0a1a7().createNode(SNodeOperations.copyNode(node), expectedType);
    SNodeOperations.replaceWithAnother(node, castExpression);
    if (expectedType != null) {
      editorContext.select(castExpression);
    } else {
      editorContext.selectAndSetCaret(SLinkOperations.getTarget(SNodeOperations.cast(castExpression, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"), "expression", true), 2);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public static class QuotationClass_598b5x_a0a1a7 {
    public QuotationClass_598b5x_a0a1a7() {
    }

    public SNode createNode(Object parameter_9, Object parameter_10) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParenthesizedExpression", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_5 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.CastExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_6 = quotedNode_2;
          {
            quotedNode_3 = (SNode) parameter_9;
            SNode quotedNode1_7;
            if (_parameterValues_129834374.contains(quotedNode_3)) {
              quotedNode1_7 = HUtil.copyIfNecessary(quotedNode_3);
            } else {
              _parameterValues_129834374.add(quotedNode_3);
              quotedNode1_7 = quotedNode_3;
            }
            if (quotedNode1_7 != null) {
              quotedNode_2.addChild("expression", HUtil.copyIfNecessary(quotedNode1_7));
            }
          }
          {
            quotedNode_4 = (SNode) parameter_10;
            SNode quotedNode1_8;
            if (_parameterValues_129834374.contains(quotedNode_4)) {
              quotedNode1_8 = HUtil.copyIfNecessary(quotedNode_4);
            } else {
              _parameterValues_129834374.add(quotedNode_4);
              quotedNode1_8 = quotedNode_4;
            }
            if (quotedNode1_8 != null) {
              quotedNode_2.addChild("type", HUtil.copyIfNecessary(quotedNode1_8));
            }
          }
          quotedNode_1.addChild("expression", quotedNode1_6);
        }
        result = quotedNode1_5;
      }
      return result;
    }
  }
}
