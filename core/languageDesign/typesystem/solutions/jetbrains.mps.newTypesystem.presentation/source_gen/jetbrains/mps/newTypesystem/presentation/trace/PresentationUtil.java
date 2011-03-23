package jetbrains.mps.newTypesystem.presentation.trace;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.smodel.SNode;
import java.util.Collection;
import jetbrains.mps.newTypesystem.state.State;
import jetbrains.mps.newTypesystem.state.NodeMaps;
import jetbrains.mps.nodeEditor.text.TextBuilder;
import jetbrains.mps.nodeEditor.cells.EditorCell;

public class PresentationUtil {
  public PresentationUtil() {
  }

  public static String getNodePresentation(EditorComponent editorComponent, SNode node) {
    return check_6aa0xa_a0a0(check_6aa0xa_a0a0a(check_6aa0xa_a0a0a0(editorComponent, node)));
  }

  public static String getVariablesTooltipPresentation(EditorComponent editorComponent, Collection<SNode> variables, State state) {
    StringBuilder sb = new StringBuilder();
    NodeMaps maps = state.getNodeMaps();
    for (SNode var : variables) {
      sb.append(var);
      sb.append(" is a type of ");
      SNode node = check_6aa0xa_a0c0c0b(maps, var);
      sb.append(getNodePresentation(editorComponent, node));
      sb.append("\n");
    }
    return sb.toString();
  }

  private static String check_6aa0xa_a0a0(TextBuilder checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getText();
    }
    return null;
  }

  private static TextBuilder check_6aa0xa_a0a0a(EditorCell checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.renderText();
    }
    return null;
  }

  private static EditorCell check_6aa0xa_a0a0a0(EditorComponent checkedDotOperand, SNode node) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.findNodeCell(node);
    }
    return null;
  }

  private static SNode check_6aa0xa_a0c0c0b(NodeMaps checkedDotOperand, SNode var) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getNode(var);
    }
    return null;
  }
}
