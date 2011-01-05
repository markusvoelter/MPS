package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseKeymapChanges;
import com.intellij.openapi.actionSystem.Shortcut;
import com.intellij.openapi.actionSystem.KeyboardShortcut;
import javax.swing.KeyStroke;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Mac_KeymapChanges extends BaseKeymapChanges {
  public Mac_KeymapChanges() {
    // simple 
    addSimpleShortcut("jetbrains.mps.ide.actions.End_Action", getShortcut(" END"), getShortcut("meta RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.GenerationIntentions_Action", getShortcut("ctrl N"));
    addSimpleShortcut("jetbrains.mps.ide.actions.Home_Action", getShortcut(" HOME"), getShortcut("meta LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.LocalEnd_Action", getShortcut("alt RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.LocalHome_Action", getShortcut("alt LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.QuickCreate_Action", getShortcut("ctrl N"), getShortcut("ctrl ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SelectDown_Action", getShortcut("ctrl DOWN"), getShortcut("ctrl shift W"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SelectLocalEnd_Action", getShortcut("alt shift RIGHT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SelectLocalHome_Action", getShortcut("alt shift LEFT"));
    addSimpleShortcut("jetbrains.mps.ide.actions.SelectUp_Action", getShortcut("ctrl UP"), getShortcut("ctrl W"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowClassInHierarchy_Action", getShortcut("ctrl H"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowConceptInHierarchy_Action", getShortcut("ctrl H"));
    addSimpleShortcut("jetbrains.mps.ide.actions.ShowNodeInfo_Action", getShortcut("ctrl Q"));
    // simple parameterized 
    addComplexShortcut("jetbrains.mps.ide.actions.GoToBookmark_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl 0")));
    addComplexShortcut("jetbrains.mps.ide.actions.GoToDevkit_Action", new BaseKeymapChanges.ComplexShortcut.ParameterizedSimpleShortcut(getShortcut("ctrl alt shift E")));
    // complex 
    addComplexShortcut("jetbrains.mps.ide.actions.GoToBookmark_Action", new Mac_KeymapChanges.GoToBookmark_ShortcutChange_tqv_p());
  }

  public String getScheme() {
    return "Mac OS X";
  }

  public static Shortcut getShortcut(String stroke) {
    return new KeyboardShortcut(KeyStroke.getKeyStroke(stroke), null);
  }

  public class GoToBookmark_ShortcutChange_tqv_p extends BaseKeymapChanges.ComplexShortcut {
    public GoToBookmark_ShortcutChange_tqv_p() {
    }

    public List<Shortcut> getShortcutsFor(Object... objects) {
      return ListSequence.fromListAndArray(new ArrayList<Shortcut>(), new KeyboardShortcut(KeyStroke.getKeyStroke("ctrl " + objects[0]), null));
    }
  }
}
