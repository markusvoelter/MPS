package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultEditorMessage;
import jetbrains.mps.nodeEditor.EditorMessageIconRenderer;
import jetbrains.mps.nodeEditor.cells.CellFinder;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.cells.CellFinders;
import jetbrains.mps.util.Condition;
import java.awt.Graphics;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Cursor;
import jetbrains.mps.nodeEditor.EditorMessage;

public abstract class AbstractOverrideEditorMessage extends DefaultEditorMessage implements EditorMessageIconRenderer {
  private String myTooltip;
  private CellFinder<EditorCell> myReturnTypeCellFinder;

  public AbstractOverrideEditorMessage(SNode node, EditorMessageOwner ovner, String tooltip) {
    super(node, null, "", ovner);
    this.myTooltip = tooltip;
    final SNode returnTypeNode = SLinkOperations.getTarget(node, "returnType", true);
    this.myReturnTypeCellFinder = CellFinders.byCondition(new Condition<EditorCell>() {
      public boolean met(EditorCell cell) {
        return cell.getSNode() == returnTypeNode;
      }
    }, true);
  }

  @Override
  public void paint(Graphics graphics, EditorComponent component, EditorCell cell) {
  }

  public String getTooltipText() {
    return this.myTooltip;
  }

  public Cursor getMouseOwerCursor() {
    return Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
  }

  public EditorCell getAnchorCell(EditorCell bigCell) {
    EditorCell returnTypeCell = bigCell.findChild(this.myReturnTypeCellFinder);
    return (returnTypeCell != null ?
      returnTypeCell :
      bigCell
    );
  }

  @Override
  public boolean sameAs(EditorMessage message) {
    if (message instanceof AbstractOverrideEditorMessage) {
      AbstractOverrideEditorMessage other = (AbstractOverrideEditorMessage) message;
      return super.sameAs(other) && other.getType() == getType() && other.getTooltipText().equals(getTooltipText());
    }
    return false;
  }

  @Override
  public boolean isValid(EditorComponent component) {
    // Returning <node> to hide these messages from <node> 
    return false;
  }

  private SNode getInstanceMethodDeclaration() {
    return (SNode) getNode();
  }
}
