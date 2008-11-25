package jetbrains.mps.ide.tabbedEditor;

import com.intellij.openapi.actionSystem.DataProvider;
import com.intellij.openapi.fileEditor.FileEditorStateLevel;
import jetbrains.mps.ide.ConceptDeclarationEditor;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.ide.MPSEditorState;
import jetbrains.mps.ide.tabbedEditor.tabs.BaseMultitabbedTab;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.CellSelectionListener;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jdom.Element;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TabbedEditor implements IEditor {
  public static final Logger LOG = Logger.getLogger(ConceptDeclarationEditor.class);

  private LazyTabbedPane myTabbedPane = new MyLazyTabbedPane(this);
  protected IOperationContext myOperationContext;
  private SNodePointer myNodePointer;
  List<CellSelectionListener> mySelectionListeners = new ArrayList<CellSelectionListener>();
  private List<ChangeListener> myChangeListeners = new ArrayList<ChangeListener>();

  public TabbedEditor(IOperationContext context, SNode node) {
    myOperationContext = context;
    myNodePointer = new SNodePointer(node);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        int currentTab = myTabbedPane.getCurrentTabIndex();
        if (currentTab != 0) {
          selectTab(currentTab - 1);
        } else {
          selectTab(myTabbedPane.getTabs().size() - 1);
        }
      }
    }, KeyStroke.getKeyStroke("ctrl alt shift LEFT"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        int currentTab = myTabbedPane.getCurrentTabIndex();
        if (currentTab != myTabbedPane.getTabs().size() - 1) {
          selectTab(currentTab + 1);
        } else {
          selectTab(0);
        }
      }
    }, KeyStroke.getKeyStroke("ctrl alt shift RIGHT"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        ILazyTab currentTab = myTabbedPane.getCurrentTab();
        currentTab.create();
        myTabbedPane.initTab(currentTab);
      }
    }, KeyStroke.getKeyStroke("INSERT"), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
  }

  public void registerKeyboardAction(ActionListener anAction, KeyStroke aKeyStroke, int aCondition) {
    myTabbedPane.registerKeyboardAction(anAction, aKeyStroke, aCondition);
  }

  protected void addTab(ILazyTab tab) {
    myTabbedPane.add(tab);
  }

  protected void selectTab(int n) {
    myTabbedPane.selectTab(n);
    JComponent component = myTabbedPane.getCurrentTab().getComponent();
    if (component != null) {
      component.requestFocus();
    }
  }

  public void fireStateChanged() {
    for (ChangeListener changeListener : myChangeListeners) {
      changeListener.stateChanged(new ChangeEvent(this));
    }
  }

  @NotNull
  public Set<SNode> getAvailableNodes() {
    Set<SNode> result = new HashSet<SNode>();
    for (ILazyTab tab : myTabbedPane.getTabs()) {
      for (EditorComponent c : tab.getEditorComponents()) {
        result.add(c.getEditedNode());
      }
    }

    return result;
  }

  public void addChangeListener(@NotNull ChangeListener changeListener) {
    myChangeListeners.add(changeListener);
  }

  public void removeChangeListener(@NotNull ChangeListener changeListener) {
    myChangeListeners.remove(changeListener);
  }

  public JComponent getComponent() {
    return myTabbedPane;
  }

  public void rebuildEditorContent() {
    for (EditorComponent c : getEditors()) {
      c.rebuildEditorContent();
    }
  }

  public void relayout() {
    for (EditorComponent c : getEditors()) {
      c.relayout();
    }
  }

  public void addCellSelectionListener(@NotNull CellSelectionListener listener) {
    for (EditorComponent c : getEditors()) {
      c.addCellSelectionListener(listener);
    }
    mySelectionListeners.add(listener);
  }

  public void removeCellSelectionListener(@NotNull CellSelectionListener listener) {
    mySelectionListeners.remove(listener);
    for (EditorComponent c : getEditors()) {
      c.removeCellSelectionListener(listener);
    }
  }

  private List<EditorComponent> getEditors() {
    List<EditorComponent> result = new ArrayList<EditorComponent>();
    for (ILazyTab tab : myTabbedPane.getTabs()) {
      result.addAll(tab.getEditorComponents());
    }
    return result;
  }

  @NotNull
  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public EditorContext getEditorContext() {
    EditorComponent editor = getCurrentEditorComponent();
    if (editor == null) return null;
    return editor.getEditorContext();
  }

  public EditorCell getSelectedCell() {
    EditorComponent editor = getCurrentEditorComponent();
    if (editor == null) return null;
    return editor.getSelectedCell();
  }

  public EditorCell getRootCell() {
    EditorComponent editor = getCurrentEditorComponent();
    if (editor == null) return null;
    return editor.getRootCell();
  }

  public SNode getEditedNode() {
    return myNodePointer.getNode();
  }

  public List<SNode> getEditedNodes() {
    List<SNode> result = new ArrayList<SNode>();
    for (ILazyTab tab : myTabbedPane.getTabs()) {
      tab.getComponent();
      for (EditorComponent aec : tab.getEditorComponents()) {
        if (aec.getEditedNode() != null) {
          result.add(aec.getEditedNode());
        }
      }
    }
    return result;
  }

  public SNodePointer getEditedNodePointer() {
    return myNodePointer;
  }

  public void selectNode(SNode node) {
    SNode containingRoot = node.getContainingRoot();
    EditorComponent editorComponent = selectLinkedEditor(containingRoot);

    assert editorComponent != null : "the root node is not in this editor";
    editorComponent.selectNode(node);
  }

  public void requestFocus() {
    EditorComponent editor = getCurrentEditorComponent();
    if (editor == null) return;
    editor.requestFocus();
  }

  public void dispose() {
    for (EditorComponent c : getEditors()) {
      c.dispose();
    }
  }

  public void repaint() {
    EditorComponent current = getCurrentEditorComponent();
    if (current != null) {
      current.repaint();
    }
  }

  @Nullable
  public EditorComponent getCurrentEditorComponent() {
    return myTabbedPane.getCurrentTab().getCurrentEditorComponent();
  }

  public boolean removeFromRecentEditorsOnClose() {
    return false;
  }

  public MPSEditorState saveState(@NotNull FileEditorStateLevel level) {
    MyFileEditorState result = new MyFileEditorState();
    if (getEditorContext() != null) {
      result.myMemento = getEditorContext().createMemento(level == FileEditorStateLevel.UNDO || level == FileEditorStateLevel.FULL);
    }
    result.myTab = myTabbedPane.getCurrentTabIndex();
    return result;
  }

  public void loadState(@NotNull MPSEditorState state) {
    if (getEditorContext() == null) {
      return;
    }

    if (!(state instanceof MyFileEditorState)) {
      return;
    }

    MyFileEditorState s = (MyFileEditorState) state;
    myTabbedPane.selectTab(s.myTab);
    if (s.myMemento != null) {
      getEditorContext().setMemento(s.myMemento);
    }
  }

  public void selectMainEditor() {
    selectTab(0);
  }

  public EditorComponent selectLinkedEditor(SNode node) {
    int index = 0;
    for (ILazyTab tab : myTabbedPane.getTabs()) {
      tab.getComponent();
      if (tab instanceof BaseMultitabbedTab) {
        BaseMultitabbedTab multitabbedTab = (BaseMultitabbedTab) tab;
        int innerIndex = 0;
        for (EditorComponent editorComponent : multitabbedTab.getEditorComponents()) {
          if (editorComponent.getEditedNode() == node) {
            myTabbedPane.selectTab(index);
            multitabbedTab.selectTab(innerIndex);
            return multitabbedTab.getCurrentEditorComponent();
          }
          innerIndex++;
        }
      } else {
        for (EditorComponent c : tab.getEditorComponents()) {
          if (c.getEditedNode() == node) {
            myTabbedPane.selectTab(index);
            return myTabbedPane.getCurrentTab().getCurrentEditorComponent();
          }
        }
      }
      index++;
    }
    return null;
  }

  public LazyTabbedPane getTabbedPane() {
    return myTabbedPane;
  }

  public static class MyFileEditorState implements MPSEditorState {
    private static final String TAB = "tab";

    private Object myMemento;
    private int myTab;

    public void save(Element e) {
      e.setAttribute(TAB, "" + myTab);
    }

    public void load(Element e) {
      try {
        myTab = Integer.parseInt(e.getAttributeValue(TAB));
      } catch (NumberFormatException ex) {
        myTab = 0;
      }
    }

    public int hashCode() {
      return myMemento.hashCode();
    }

    public boolean equals(Object obj) {
      if (!(obj instanceof MyFileEditorState)) {
        return false;
      }

      MyFileEditorState state = (MyFileEditorState) obj;
      return EqualUtil.equals(state.myMemento, myMemento);
    }
  }

  private class MyLazyTabbedPane extends LazyTabbedPane implements DataProvider {
    private MyLazyTabbedPane(TabbedEditor tabbedEditor) {
      super(tabbedEditor);
    }

    @Nullable
    public Object getData(@NonNls String dataId) {
      if (dataId.equals(MPSDataKeys.MPS_EDITOR.getName())) {
        return TabbedEditor.this;
      }

      return null;
    }
  }

}
