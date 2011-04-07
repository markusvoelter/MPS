/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.ide.editorTabs.tabs;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.util.Pair;
import jetbrains.mps.ide.editorTabs.EditorTabDescriptor;
import jetbrains.mps.ide.editorTabs.tabs.baseListening.ModelListener;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelCommandListener;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.smodel.event.SModelListener;
import jetbrains.mps.util.Condition;
import jetbrains.mps.workbench.action.ActionUtils;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.*;

public abstract class TabsComponent extends JPanel {
  private SNodePointer myBaseNode;
  private SNodePointer myLastNode = null;
  private Set<EditorTabDescriptor> myPossibleTabs;
  private List<EditorTab> myRealTabs = new ArrayList<EditorTab>();
  private JComponent myToolbar = null;
  private JComponent myShortcutComponent;

  private SModelCommandListener myTabAdditionListener = new MyTabAdditionListener();
  private ModelListener myTabRemovalListener = new MyTabRemovalListener();
  private AddConceptTab myAddButton;

  public TabsComponent(SNodePointer baseNode, Set<EditorTabDescriptor> possibleTabs, JComponent shortcutComponent) {
    myBaseNode = baseNode;
    myPossibleTabs = possibleTabs;
    myShortcutComponent = shortcutComponent;

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            prevTab();
          }
        });
      }
    }, KeyStroke.getKeyStroke("ctrl alt shift LEFT"), JComponent.WHEN_IN_FOCUSED_WINDOW);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            nextTab();
          }
        });
      }
    }, KeyStroke.getKeyStroke("ctrl alt shift RIGHT"), JComponent.WHEN_IN_FOCUSED_WINDOW);

    setLayout(new BorderLayout());

    myAddButton = new AddConceptTab(myBaseNode, myPossibleTabs) {
      protected SNode getCurrentAspect() {
        return myLastNode.getNode();
      }

      protected void aspectCreated(SNode aspect) {
        onNodeChange(aspect);
      }
    };

    addListeners();
    updateTabs();
  }

  public Component getComponentForTabIndex(int index) {
    return myToolbar.getComponent(index + 1);
  }

  public void dispose() {
    removeListeners();
  }

  public List<SNodePointer> getAllEditedNodes() {
    List<SNodePointer> result = new ArrayList<SNodePointer>();
    SNode baseNode = myBaseNode.getNode();
    if (baseNode == null) return result;
    for (EditorTab tab : myRealTabs) {
      for (SNode node : tab.getDescriptor().getNodes(baseNode)) {
        assert node != null;
        result.add(new SNodePointer(node.getContainingRoot()));
      }
    }
    return result;
  }

  private void updateTabs() {
    myRealTabs.clear();
    myTabRemovalListener.clearAspects();

    ArrayList<EditorTabDescriptor> tabs = new ArrayList<EditorTabDescriptor>(myPossibleTabs);
    Collections.sort(tabs, new EditorTabComparator());

    for (EditorTabDescriptor d : tabs) {
      List<SNode> nodes = d.getNodes(myBaseNode.getNode());
      if (nodes.isEmpty()) continue;

      for (SNode node : nodes) {
        myTabRemovalListener.aspectAdded(node.getContainingRoot());
      }

      final EditorTab tab = new EditorTab(this, myRealTabs.size(), d, myBaseNode);
      myRealTabs.add(tab);
    }

    DefaultActionGroup group = new DefaultActionGroup();
    group.add(myAddButton.getAction(this));
    for (EditorTab tab : myRealTabs) {
      group.add(tab.getAction(myShortcutComponent));
    }
    if (myToolbar != null) {
      remove(myToolbar);
    }
    ActionToolbar actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.UNKNOWN, group, true);
    actionToolbar.setLayoutPolicy(ActionToolbar.WRAP_LAYOUT_POLICY);
    myToolbar = actionToolbar.getComponent();
    add(myToolbar, BorderLayout.CENTER);
  }

  //todo
  public void setLastNode(SNodePointer node) {
    myLastNode = node;
  }

  public void onNodeChange(SNode node) {
    myLastNode = new SNodePointer(node);
    changeNode(node);
  }

  protected abstract void changeNode(SNode newNode);

  private void nextTab() {
    for (EditorTab tab : myRealTabs) {
      if (!isCurrent(tab)) continue;
      int index = myRealTabs.indexOf(tab);
      if (index == myRealTabs.size() - 1) {
        performTabAction(0);
        return;
      }

      performTabAction(index + 1);

      return;
    }
  }

  public boolean isCurrent(EditorTab tab) {
    boolean current = false;
    for (SNode aspect : tab.getDescriptor().getNodes(myBaseNode.getNode())) {
      if (myLastNode == null) continue;
      if (aspect.getContainingRoot().equals(myLastNode.getNode())) {
        current = true;
        break;
      }
    }
    return current;
  }

  private void prevTab() {
    for (EditorTab tab : myRealTabs) {
      if (!isCurrent(tab)) continue;

      int index = myRealTabs.indexOf(tab);
      if (index == 0) {
        performTabAction(myRealTabs.size() - 1);
        return;
      }

      performTabAction(index - 1);
      return;
    }
  }

  private void performTabAction(final int index) {
    final DataContext context = DataManager.getInstance().getDataContext(this);
    AnActionEvent event = ActionUtils.createEvent(ActionPlaces.UNKNOWN, context);

    myRealTabs.get(index).getAction(myShortcutComponent).actionPerformed(event);
  }

  ///-------------events----------------

  private void addListeners() {
    myTabRemovalListener.startListening();
    GlobalSModelEventsManager.getInstance().addGlobalCommandListener(myTabAdditionListener);
  }

  private void removeListeners() {
    GlobalSModelEventsManager.getInstance().removeGlobalCommandListener(myTabAdditionListener);
    myTabRemovalListener.stopListening();
  }

  ///-------------tab insert events----------------

  private static class EditorTabComparator implements Comparator<EditorTabDescriptor> {
    public int compare(EditorTabDescriptor d1, EditorTabDescriptor d2) {
      int r1 = d1.compareTo(d2);
      int r2 = d2.compareTo(d1);

      if ((r1 == 0) ^ (r2 == 0)) return r1 - r2;

      assert r1 * r2 <= 0 : "can't determine order";

      return r1;
    }
  }

  private class AdditionDescriptor extends Pair<Condition<SModelDescriptor>, SModelListener> {
    public AdditionDescriptor(Condition<SModelDescriptor> first, SModelListener second) {
      super(first, second);
    }
  }

  private class MyTabAdditionListener implements SModelCommandListener {
    public void eventsHappenedInCommand(List<SModelEvent> events) {
      outer:
      for (EditorTabDescriptor d : myPossibleTabs) {
        for (EditorTab tab : myRealTabs) {
          if (tab.getDescriptor() == d) continue outer;
        }

        if (d.getNodes(myBaseNode.getNode()).isEmpty()) continue;
        updateTabs();
      }
    }
  }

  private class MyTabRemovalListener extends ModelListener {
    protected void onImportantRootRemoved(SNodePointer node) {
      if (myBaseNode.equals(node)) return; //will be closed by idea

      if (myLastNode.equals(node)) {
        onNodeChange(myBaseNode.getNode());
      }

      updateTabs();
    }
  }
}
