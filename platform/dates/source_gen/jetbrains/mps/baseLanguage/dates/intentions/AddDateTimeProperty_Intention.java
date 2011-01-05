package jetbrains.mps.baseLanguage.dates.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AddDateTimeProperty_Intention extends BaseIntention implements Intention {
  public AddDateTimeProperty_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.BinaryOperation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Datetime Property";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.BinaryCompareOperation") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.EqualsExpression") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")) && ((TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "leftExpression", true)), new AddDateTimeProperty_Intention.QuotationClass_xprv33_a1a0a0a0a0a6_2().createNode(), false) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "rightExpression", true)), new AddDateTimeProperty_Intention.QuotationClass_xprv33_a1a0a0a0a0a6_1().createNode(), false)) || (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "rightExpression", true)), new AddDateTimeProperty_Intention.QuotationClass_xprv33_a1a0a0a0a0a6_0().createNode(), false) && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(node, "rightExpression", true)), new AddDateTimeProperty_Intention.QuotationClass_xprv33_a1a0a0a0a0a6().createNode(), false)));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode expression = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression", null);
    SLinkOperations.setTarget(expression, "operation", SNodeOperations.copyNode(node), true);
    SNodeOperations.replaceWithAnother(node, expression);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.dates.intentions";
  }

  public static class QuotationClass_xprv33_a1a0a0a0a0a6 {
    public QuotationClass_xprv33_a1a0a0a0a0a6() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_xprv33_a1a0a0a0a0a6_0 {
    public QuotationClass_xprv33_a1a0a0a0a0a6_0() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeWithTZType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_xprv33_a1a0a0a0a0a6_1 {
    public QuotationClass_xprv33_a1a0a0a0a0a6_1() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_xprv33_a1a0a0a0a0a6_2 {
    public QuotationClass_xprv33_a1a0a0a0a0a6_2() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
