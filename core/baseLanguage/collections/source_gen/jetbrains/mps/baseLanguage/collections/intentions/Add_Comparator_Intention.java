package jetbrains.mps.baseLanguage.collections.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class Add_Comparator_Intention extends BaseIntention implements Intention {
  public Add_Comparator_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.collections.structure.TreeSetCreator";
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
    return "Specify Comparator";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "copyFrom", true) == null) && (SLinkOperations.getTarget(node, "initSize", true) == null) && (SLinkOperations.getTarget(node, "comparator", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.setTarget(node, "comparator", new Add_Comparator_Intention.QuotationClass_z9bmn4_a2a0a7().createNode(SNodeOperations.copyNode(SLinkOperations.getTarget(node, "elementType", true)), SNodeOperations.copyNode(SLinkOperations.getTarget(node, "elementType", true))), true);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.collections.intentions";
  }

  public static class QuotationClass_z9bmn4_a2a0a7 {
    public QuotationClass_z9bmn4_a2a0a7() {
    }

    public SNode createNode(Object parameter_13, Object parameter_14) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      SNode quotedNode_4 = null;
      SNode quotedNode_5 = null;
      SNode quotedNode_6 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_7 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_8 = quotedNode_2;
          quotedNode1_8.setProperty("name", "a");
          {
            quotedNode_5 = (SNode) parameter_13;
            SNode quotedNode1_9;
            if (_parameterValues_129834374.contains(quotedNode_5)) {
              quotedNode1_9 = HUtil.copyIfNecessary(quotedNode_5);
            } else {
              _parameterValues_129834374.add(quotedNode_5);
              quotedNode1_9 = quotedNode_5;
            }
            if (quotedNode1_9 != null) {
              quotedNode_2.addChild("type", HUtil.copyIfNecessary(quotedNode1_9));
            }
          }
          quotedNode_1.addChild("parameter", quotedNode1_8);
        }
        {
          quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_10 = quotedNode_3;
          quotedNode1_10.setProperty("name", "b");
          {
            quotedNode_6 = (SNode) parameter_14;
            SNode quotedNode1_11;
            if (_parameterValues_129834374.contains(quotedNode_6)) {
              quotedNode1_11 = HUtil.copyIfNecessary(quotedNode_6);
            } else {
              _parameterValues_129834374.add(quotedNode_6);
              quotedNode1_11 = quotedNode_6;
            }
            if (quotedNode1_11 != null) {
              quotedNode_3.addChild("type", HUtil.copyIfNecessary(quotedNode1_11));
            }
          }
          quotedNode_1.addChild("parameter", quotedNode1_10);
        }
        {
          quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_12 = quotedNode_4;
          quotedNode_1.addChild("body", quotedNode1_12);
        }
        result = quotedNode1_7;
      }
      return result;
    }
  }
}
