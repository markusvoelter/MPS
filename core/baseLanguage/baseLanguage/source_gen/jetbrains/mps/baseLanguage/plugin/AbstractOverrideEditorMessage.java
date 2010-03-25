package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultEditorMessage;
import jetbrains.mps.nodeEditor.EditorMessageIconRenderer;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import java.awt.Graphics;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import java.awt.Cursor;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.CellFinders;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorMessage;

public abstract class AbstractOverrideEditorMessage extends DefaultEditorMessage implements EditorMessageIconRenderer {
  private String myTooltip;

  public AbstractOverrideEditorMessage(SNode node, EditorMessageOwner ovner, String tooltip) {
    super(node, null, "", ovner);
    this.myTooltip = tooltip;
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
    if (bigCell instanceof EditorCell_Collection) {
      return bigCell.findChild(CellFinders.byClass(EditorCell_Label.class, true));
    }
    return bigCell;
  }

  @Override
  public boolean sameAs(EditorMessage message) {
    if (message instanceof AbstractOverrideEditorMessage) {
      AbstractOverrideEditorMessage other = (AbstractOverrideEditorMessage) message;
      return super.sameAs(other) && other.getType() == this.getType() && other.getTooltipText().equals(this.getTooltipText());
    }
    return false;
  }

  @Override
  public boolean isValid(EditorComponent component) {
    // Returning <node> to hide these messages from <node> 
    return false;
  }
}
