package jetbrains.mps.lang.pattern.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.lang.pattern.editor.PatternAddingUtil;
import jetbrains.mps.nodeEditor.cells.PropertyAccessor;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class CreatePropertyPatternVariable_Intention extends BaseIntention implements Intention {
  public CreatePropertyPatternVariable_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.pattern.structure.PatternExpression";
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
    return "Create Property Pattern Variable";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (editorContext.getSelectedCell() instanceof EditorCell_Property) && PatternAddingUtil.isPatternApplicable(editorContext);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    EditorCell_Property cell = (EditorCell_Property) editorContext.getSelectedCell();
    String propertyName = ((PropertyAccessor) cell.getModelAccessor()).getPropertyName();
    cell.getSNode().setPropertyAttribute(propertyName, SNodeFactoryOperations.createNewNode(SNodeOperations.getModel(node), "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", null));
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.pattern.intentions";
  }
}
