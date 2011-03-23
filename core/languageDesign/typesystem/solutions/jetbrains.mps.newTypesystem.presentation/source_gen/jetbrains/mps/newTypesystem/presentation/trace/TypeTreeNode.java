package jetbrains.mps.newTypesystem.presentation.trace;

/*Generated by MPS */

import java.awt.Color;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.ide.projectPane.Icons;

public class TypeTreeNode extends TypeSystemStateTreeNode {
  private static Color color = new Color(30464);

  public TypeTreeNode(IOperationContext operationContext, SNode node, SNode type, SNode expandedType, EditorComponent editorComponent) {
    super(operationContext);
    myNode = node;
    setNodeIdentifier(PresentationUtil.getNodePresentation(editorComponent, node) + " : " + type);
    setIcon(Icons.DEFAULT_ICON);
  }

  @Override
  protected void doUpdatePresentation() {
    setColor(TypeTreeNode.color);
  }
}
