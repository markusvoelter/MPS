package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCellKeyMap;
import jetbrains.mps.nodeEditor.EditorCellKeyMapAction;
import java.awt.event.KeyEvent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import javax.swing.JOptionPane;

public class TestCoercion_Keymap extends EditorCellKeyMap {

  public TestCoercion_Keymap() {
    this.setApplicableToEveryModel(true);
    EditorCellKeyMapAction action;
    action = new TestCoercion_Keymap.TestCoercion_Keymap_Action0();
    this.putAction("ctrl+alt+shift", "VK_T", action);
  }
  public static class TestCoercion_Keymap_Action0 extends EditorCellKeyMapAction {

    public TestCoercion_Keymap_Action0() {
      this.setShownInPopupMenu(true);
    }

    public String getDescriptionText() {
      return "try to coerce type";
    }

    public boolean isMenuAlwaysShown() {
      return false;
    }

    public boolean canExecute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      return true;
    }

    public void execute(final KeyEvent keyEvent, final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(keyEvent, editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }

    private void execute_internal(final KeyEvent keyEvent, final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SNode type = TypeChecker.getInstance().getTypeOf(node);
      String text = "type: " + type;
      {
        text = text + "\n\ncoerce to SequenceType";
        SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), true);
        text = text + "\nweak  : " + coercedType;
        coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.SequenceType"), false);
        text = text + "\nstrong: " + coercedType;
      }
      {
        text = text + "\n\ncoerce to ListType";
        SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.ListType"), true);
        text = text + "\nweak  : " + coercedType;
        coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.collections.structure.ListType"), false);
        text = text + "\nstrong: " + coercedType;
      }
      {
        text = text + "\n\ncoerce to ClassifierType";
        SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true);
        text = text + "\nweak  : " + coercedType;
        coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), false);
        text = text + "\nstrong: " + coercedType;
      }
      {
        text = text + "\n\ncoerce to Iterable<..>";
        SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, new Pattern_0(), true);
        text = text + "\nweak  : " + coercedType;
        coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, new Pattern_1(), false);
        text = text + "\nstrong: " + coercedType;
      }
      {
        text = text + "\n\ncoerce to Type";
        SNode coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), true);
        text = text + "\nweak  : " + coercedType;
        coercedType = TypeChecker.getInstance().getRuntimeSupport().coerce(type, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.Type"), false);
        text = text + "\nstrong: " + coercedType;
      }
      JOptionPane.showMessageDialog(null, text, node.getDebugText(), JOptionPane.INFORMATION_MESSAGE);
    }

    public String getKeyStroke() {
      return "ctrl alt shift T";
    }

}

}
