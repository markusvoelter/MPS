package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.GenerateIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.intentions.IntentionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.awt.Frame;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import java.util.ArrayList;

public class GenerateConstructor_Intention extends GenerateIntention implements Intention {
  public GenerateConstructor_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ClassConcept";
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
    return "Constructor";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext, IntentionContext intentionContext) {
    SNode classConcept = SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.ClassConcept");
    SNode constructorDeclaration = null;
    Project project = editorContext.getOperationContext().getProject();
    for (SNode selectedSuperConstructor : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedConstructors"))) {
      SNode constructor = SLinkOperations.addNewChild(classConcept, "constructor", "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration");
      constructorDeclaration = constructor;
      SLinkOperations.setNewChild(constructor, "body", "jetbrains.mps.baseLanguage.structure.StatementList");
      if (ListSequence.fromList(SLinkOperations.getTargets(selectedSuperConstructor, "parameter", true)).isNotEmpty()) {
        SNode invocation = SLinkOperations.addNewChild(SLinkOperations.getTarget(constructor, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation");
        SLinkOperations.setTarget(invocation, "baseMethodDeclaration", selectedSuperConstructor, false);
        for (SNode superParam : SLinkOperations.getTargets(selectedSuperConstructor, "parameter", true)) {
          SNode parameter = SLinkOperations.addNewChild(constructor, "parameter", "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
          SPropertyOperations.set(parameter, "name", SPropertyOperations.getString(superParam, "name"));
          SLinkOperations.setTarget(parameter, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(superParam, "type", true)), true);
          SNode paramReference = SLinkOperations.addNewChild(invocation, "actualArgument", "jetbrains.mps.baseLanguage.structure.ParameterReference");
          SLinkOperations.setTarget(paramReference, "variableDeclaration", parameter, false);
        }
      }
      for (SNode field : ((List<SNode>) intentionContext.getContextParametersMap().get("selectedFields"))) {
        SNode parameterDeclaration = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ParameterDeclaration", null);
        SLinkOperations.setTarget(parameterDeclaration, "type", SNodeOperations.copyNode(SLinkOperations.getTarget(field, "type", true)), true);
        SPropertyOperations.set(parameterDeclaration, "name", GenerateGettersAndSettersUtil.getParameterNameForField(field, project));
        ListSequence.fromList(SLinkOperations.getTargets(constructor, "parameter", true)).addElement(parameterDeclaration);
        SNode expressionStatement = SLinkOperations.addNewChild(SLinkOperations.getTarget(constructor, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.ExpressionStatement");
        SNode assignmentExpression = SLinkOperations.setNewChild(expressionStatement, "expression", "jetbrains.mps.baseLanguage.structure.AssignmentExpression");
        SNode dotExpression = SLinkOperations.setNewChild(assignmentExpression, "lValue", "jetbrains.mps.baseLanguage.structure.DotExpression");
        SLinkOperations.setNewChild(dotExpression, "operand", "jetbrains.mps.baseLanguage.structure.ThisExpression");
        SNode fieldRef = SLinkOperations.setNewChild(dotExpression, "operation", "jetbrains.mps.baseLanguage.structure.FieldReferenceOperation");
        SLinkOperations.setTarget(fieldRef, "fieldDeclaration", field, false);
        SNode parameterReference = SLinkOperations.setNewChild(assignmentExpression, "rValue", "jetbrains.mps.baseLanguage.structure.ParameterReference");
        SLinkOperations.setTarget(parameterReference, "variableDeclaration", parameterDeclaration, false);
      }
    }
    if (constructorDeclaration != null) {
      editorContext.select(constructorDeclaration);
    }
  }

  public boolean executeUI(final SNode node, final EditorContext editorContext, final IntentionContext intentionContext) {
    Frame frame = editorContext.getOperationContext().getMainFrame();
    final Wrappers._T<SNode> superclass = new Wrappers._T<SNode>(null);
    final Wrappers._boolean needsShowConstructorsDialog = new Wrappers._boolean(false);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        superclass.value = SNodeOperations.as(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "superclass", true), "classifier", false), "jetbrains.mps.baseLanguage.structure.ClassConcept");
        if (superclass.value == null) {
          superclass.value = SNodeOperations.getNode("f:java_stub#java.lang(java.lang@java_stub)", "~Object");
        }
        if (ListSequence.fromList(SLinkOperations.getTargets(superclass.value, "constructor", true)).count() > 1) {
          needsShowConstructorsDialog.value = true;
        } else {
          intentionContext.getContextParametersMap().put("selectedConstructors", new ArrayList<SNode>());
          ListSequence.fromList(((List<SNode>) intentionContext.getContextParametersMap().get("selectedConstructors"))).addElement(ListSequence.fromList(SLinkOperations.getTargets(superclass.value, "constructor", true)).first());
        }
      }
    });
    if (needsShowConstructorsDialog.value) {
      SelectConstructorsDialog selectConstructorsDialog = new SelectConstructorsDialog(editorContext, frame, superclass.value);
      selectConstructorsDialog.showDialog();
      if (!(selectConstructorsDialog.getAnswer())) {
        return false;
      }
      intentionContext.getContextParametersMap().put("selectedConstructors", selectConstructorsDialog.getSelectedMembers());
    }
    final Wrappers._boolean needsShowFieldsDialog = new Wrappers._boolean(false);
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (ListSequence.fromList(SLinkOperations.getTargets(node, "field", true)).isNotEmpty()) {
          needsShowFieldsDialog.value = true;
        } else {
          intentionContext.getContextParametersMap().put("selectedFields", new ArrayList<SNode>());
        }
      }
    });
    if (needsShowFieldsDialog.value) {
      SelectFieldsDialog selectFieldsDialog = new SelectFieldsDialog(editorContext, frame, node);
      selectFieldsDialog.showDialog();
      intentionContext.getContextParametersMap().put("selectedFields", selectFieldsDialog.getSelectedFields());
      return selectFieldsDialog.getAnswer();
    } else {
      return true;
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
