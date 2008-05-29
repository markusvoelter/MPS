package jetbrains.mps.ide.tabbedEditor;

import jetbrains.mps.nodeEditor.AbstractEditorComponent;

import javax.swing.JComponent;
import java.util.List;

public interface ILazyTab {
  String getTitle();

  String getNullText();

  JComponent getComponent();

  void createNewItem();

  List<AbstractEditorComponent> getEditorComponents();    
}
