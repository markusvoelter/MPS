package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.ypath.constraints.IFeature_Behavior;

public class IFeature_opposite_DELETE {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new IFeature_opposite_DELETE.IFeature_opposite_DELETE_DELETE(node));
  }

  public static class IFeature_opposite_DELETE_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public IFeature_opposite_DELETE_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      IFeature_Behavior.call_removeOpposite_1197913935418(node);
    }

}

}
