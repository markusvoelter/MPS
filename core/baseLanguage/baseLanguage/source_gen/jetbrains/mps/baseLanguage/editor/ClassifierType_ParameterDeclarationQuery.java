package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.ParametersInformation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.editor.runtime.StyledTextPrinter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;

public class ClassifierType_ParameterDeclarationQuery extends ParametersInformation<SNode> {
  public ClassifierType_ParameterDeclarationQuery() {
  }

  public Iterable<SNode> getMethods(SNode node, EditorContext editorContext) {
    if (ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "classifier", false), "typeVariableDeclaration", true)).isNotEmpty()) {
      return ListSequence.fromListAndArray(new ArrayList<SNode>(), SLinkOperations.getTarget(node, "classifier", false));
    } else {
      return ListSequence.fromList(new ArrayList<SNode>());
    }
  }

  public void getStyledMethodPresentation(SNode node, EditorContext editorContext, SNode parameterObject, StyledTextPrinter styledText) {
    if (ListSequence.fromList(SLinkOperations.getTargets(parameterObject, "typeVariableDeclaration", true)).isNotEmpty()) {
      SNode argument = editorContext.getSelectedNode();
      while (argument != null && !(SNodeOperations.isInstanceOf(argument, "jetbrains.mps.baseLanguage.structure.Type") && ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).contains(SNodeOperations.cast(argument, "jetbrains.mps.baseLanguage.structure.Type")))) {
        argument = SNodeOperations.getParent(argument);
      }
      for (SNode param : SLinkOperations.getTargets(parameterObject, "typeVariableDeclaration", true)) {
        if (SNodeOperations.getIndexInParent(param) > 0) {
          styledText.append(", ");
        }
        if (SNodeOperations.getIndexInParent(param) == SNodeOperations.getIndexInParent(argument)) {
          styledText.setBold(true);
        }
        styledText.append(BaseConcept_Behavior.call_getPresentation_1213877396640(param));
        styledText.setBold(false);
      }
    }
  }

  public boolean isMethodCurrent(SNode node, EditorContext editorContext, SNode parameterObject) {
    return false;
  }
}
