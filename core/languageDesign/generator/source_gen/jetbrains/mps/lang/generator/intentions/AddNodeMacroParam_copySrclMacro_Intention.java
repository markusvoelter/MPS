package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.generator.editor.QueriesUtil;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.List;
import java.util.ArrayList;

public class AddNodeMacroParam_copySrclMacro_Intention extends BaseIntention implements Intention {
  private SNode myParameter;

  public AddNodeMacroParam_copySrclMacro_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isParameterized() {
    return true;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Node Macro CopySrcl: node." + BaseConcept_Behavior.call_getPresentation_1213877396640(this.myParameter);
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    SModelDescriptor sm = SNodeOperations.getModel(node).getModelDescriptor();
    if (sm == null || !(sm.getModule() instanceof Generator)) {
      return false;
    }
    return QueriesUtil.isNodeMacroApplicable(node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode nodeMacro = QueriesUtil.addNodeMacro(node);
    SNode copySrcListMacro = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.generator.structure.CopySrcListMacro", null);
    SNodeOperations.replaceWithAnother(nodeMacro, copySrcListMacro);
    SNode referentValue = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery", null);
    SNode dotExpression = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.DotExpression", null);
    SNode linkAccess = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.smodel.structure.SLinkListAccess", null);
    SLinkOperations.setTarget(linkAccess, "link", this.myParameter, false);
    SLinkOperations.setTarget(dotExpression, "operation", linkAccess, true);
    SLinkOperations.setTarget(dotExpression, "operand", SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode", null), true);
    SNode expressionStatement = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ExpressionStatement", null);
    SLinkOperations.setTarget(expressionStatement, "expression", dotExpression, true);
    ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(referentValue, "body", true), "statement", true)).addElement(expressionStatement);
    SLinkOperations.setTarget(copySrcListMacro, "sourceNodesQuery", referentValue, true);
    // set caret 
    editorContext.selectAndSetCaret(copySrcListMacro, 1);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

  private static List<SNode> parameter(final SNode node, final EditorContext editorContext) {
    SNode sourceNode = MacroIntentionsUtil.getContextNodeConcept(node);
    return MacroIntentionsUtil.getLinks(sourceNode, true);
  }

  public static List<Intention> instances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    List<SNode> paramList = parameter(node, editorContext);
    if (paramList != null) {
      for (SNode param : paramList) {
        AddNodeMacroParam_copySrclMacro_Intention intention = new AddNodeMacroParam_copySrclMacro_Intention();
        intention.myParameter = param;
        ListSequence.fromList(list).addElement(intention);
      }
    }
    return list;
  }
}
