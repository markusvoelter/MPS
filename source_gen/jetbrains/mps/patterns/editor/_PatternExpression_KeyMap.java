package jetbrains.mps.patterns.editor;

/*Generated by MPS 08.01.2006 16:54:12 */


import jetbrains.mps.nodeEditor.EditorCellKeyMap;

public class _PatternExpression_KeyMap extends EditorCellKeyMap {

  public _PatternExpression_KeyMap() {
    this.putAction("any", "_", Queries.createKeyMapAction_createWildCard(null));
    this.putAction("any", "@", Queries.createKeyMapAction_createAsPattern(null));
    this.putAction("any", "#", Queries.createKeyMapAction_createVariablePattern(null));
    this.putAction("any", "$", Queries.createKeyMapAction_createPropertyVarPattern(null));
  }
}
