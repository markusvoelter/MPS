package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Sep 18, 2006 3:38:47 PM */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;

public class CastExpression_KeyMap extends EditorCellKeyMap {

  public  CastExpression_KeyMap() {
    this.setApplicableToEveryModel(false);
    EditorCellKeyMapAction action;
    this.putAction("ctrl+shift", "VK_SPACE", new CastExpression_KeyMap_Action0());
    this.putAction("ctrl+shift", "VK_SPACE", new CastExpression_KeyMap_Action1());
    this.putAction("ctrl+shift", "VK_SPACE", new CastExpression_KeyMap_Action2());
  }
}
