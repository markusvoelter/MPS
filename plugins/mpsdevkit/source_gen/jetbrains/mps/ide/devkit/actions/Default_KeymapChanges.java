package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseKeymapChanges;
import com.intellij.openapi.actionSystem.Shortcut;
import com.intellij.openapi.actionSystem.KeyboardShortcut;
import javax.swing.KeyStroke;

public class Default_KeymapChanges extends BaseKeymapChanges {
  public Default_KeymapChanges() {
    // simple 
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.DeleteGenerator_Action", getShortcut(" DELETE"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.GeneratorProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.GoToConceptDeclaration_Action", getShortcut("ctrl shift S"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.GoToEditorDeclaration_Action", getShortcut("ctrl shift E"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.GoToRules_Action", getShortcut("ctrl alt R"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.LanguageProperties_Action", getShortcut("alt ENTER"));
    addSimpleShortcut("jetbrains.mps.ide.devkit.actions.RenameLanguage_Action", getShortcut("shift F6"));
    // simple parameterized 
    // complex 
  }

  public String getScheme() {
    return "$default";
  }

  public static Shortcut getShortcut(String stroke) {
    return new KeyboardShortcut(KeyStroke.getKeyStroke(stroke), null);
  }
}
