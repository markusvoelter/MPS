package jetbrains.mps.lang.typesystem.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;

public class CreateTypesystemIntention_Intention extends BaseIntention implements Intention {
  public CreateTypesystemIntention_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.typesystem.structure.MessageStatement";
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
    return "Create New QuickFix";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (editorContext.getSelectedCell().getLinkDeclaration() != ((LinkDeclaration) SNodeOperations.getAdapter(SLinkOperations.findLinkDeclaration("jetbrains.mps.lang.typesystem.structure.MessageStatement", "helginsIntention")))) {
      return false;
    }
    return SLinkOperations.getTarget(node, "helginsIntention", true) == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode quickFixNode = new CreateTypesystemIntention_Intention.QuotationClass_nynfqi_a0a0a7().createNode();

    SNode quickFixCall = new CreateTypesystemIntention_Intention.QuotationClass_nynfqi_a0a2a7().createNode(quickFixNode);

    SModelOperations.addRootNode(SNodeOperations.getModel(node), quickFixNode);
    SLinkOperations.setTarget(node, "helginsIntention", quickFixCall, true);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.typesystem.intentions";
  }

  public static class QuotationClass_nynfqi_a0a0a7 {
    public QuotationClass_nynfqi_a0a0a7() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypesystemQuickFix", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        quotedNode1_4.setProperty("name", "fix_");
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.QuickFixExecuteBlock", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6 = quotedNode_3;
            quotedNode_2.addChild("body", quotedNode1_6);
          }
          quotedNode_1.addChild("executeBlock", quotedNode1_5);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_nynfqi_a0a2a7 {
    public QuotationClass_nynfqi_a0a2a7() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypesystemIntention", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("quickFix", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
