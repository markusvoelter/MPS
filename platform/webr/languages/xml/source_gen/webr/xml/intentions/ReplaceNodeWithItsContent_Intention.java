package webr.xml.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import webr.xml.constraints.Content_Behavior;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;

public class ReplaceNodeWithItsContent_Intention extends BaseIntention implements Intention {

  public String getConcept() {
    return "webr.xml.structure.Content";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(SNode node, IOperationContext operationContext) {
    return "Replace node with its content";
  }

  public boolean isApplicable(SNode node, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "webr.xml.structure.ContentList") && !(SequenceOperations.isEmpty(Content_Behavior.call_getSubcontents_1187013392398(node)));
  }

  public void execute(SNode node, EditorContext editorContext) {
    SNode s = node;
    {
      ICursor<SNode> _zCursor = CursorFactory.createCursor(Content_Behavior.call_getSubcontents_1187013392398(node));
      try {
        while (_zCursor.moveToNext()) {
          SNode subContent = _zCursor.getCurrent();
          SNodeOperations.insertNextSiblingChild(s, subContent);
          s = subContent;
        }
      } finally {
        _zCursor.release();
      }
    }
    SNodeOperations.deleteNode(node);
  }

}
