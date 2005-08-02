package jetbrains.mps.nodeEditor;

import jetbrains.mps.datatransfer.PasteUtil;
import jetbrains.mps.datatransfer.CopyPasteNodeUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.OperationContext;
import jetbrains.mps.logging.Logger;

import java.util.List;


/**
 * Author: Sergey Dmitriev.
 * Time: Nov 26, 2003 2:06:41 PM
 */
public class CellAction_PasteNode extends EditorCellAction {
  private static final Logger LOG = Logger.getLogger(CellAction_PasteNode.class);
  
  public boolean canExecute(EditorContext context) {
    EditorCell selectedCell = context.getNodeEditorComponent().getSelectedCell();
    if (selectedCell == null) {
      return false;
    }
    SNode selectedNode = selectedCell.getSNode();
    List<SNode> pasteNodes = CopyPasteNodeUtil.getNodesFromClipboard(selectedNode.getModel());
    if (pasteNodes == null || pasteNodes.size() == 0) {
      return false;
    }

    OperationContext operationContext = context.getOperationContext();
    if (!PasteUtil.canPaste(selectedNode, pasteNodes.get(0), operationContext)) {
      LOG.debug("Couldn't paste node here");
      return false;
    }
    return true;
  }

  public void execute(EditorContext context) {
    EditorCell selectedCell = context.getNodeEditorComponent().getSelectedCell();
    SNode selectedNode = selectedCell.getSNode();
    List<SNode> pasteNodes = CopyPasteNodeUtil.getNodesFromClipboard(selectedNode.getModel());
    SNode anchor = pasteNodes.get(0);
    OperationContext operationContext = context.getOperationContext();
    PasteUtil.paste(selectedNode, anchor, operationContext);
    for (int i = 1; i < pasteNodes.size(); i++) {
      SNode node = pasteNodes.get(i);
      PasteUtil.pasteRelative(anchor, node, false, operationContext);
      anchor = node;
    }
    //EditorsPane editorsPane = context.getProject().getComponent(EditorsPane.class);

   /* OutputView outputView = context.getProject().getComponent(OutputView.class);
    outputView.clear();
    outputView.append("first pasted node id = " + anchor.getId());
    outputView.activate();*/
    AbstractEditorComponent editor = context.getNodeEditorComponent();//editorsPane.getCurrentEditor();
    editor.rebuildEditorContent();
  }
}
