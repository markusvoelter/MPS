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
package jetbrains.mps.newTypesystem.presentation.difference;

import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ShowTypeSystemTrace extends JDialog {
  Checkbox myBlockDependencies;
  Checkbox myTraceForNode;
  TypeSystemTraceTree myTree;

  public ShowTypeSystemTrace(TypeCheckingContextNew t, final IOperationContext operationContext, Frame frame, SNode node) {
    super(frame);
    t.checkRoot(true);
    this.setLayout(new BorderLayout());
    this.getContentPane().setBackground(this.getBackground());
    myTree = new TypeSystemTraceTree(operationContext, t, frame, node);
    JScrollPane scrollPane = new JScrollPane(myTree);
    scrollPane.setBackground(this.getBackground());

    this.add(scrollPane, BorderLayout.CENTER);
    JPanel checkBoxes = new JPanel();
    checkBoxes.setLayout(new FlowLayout());
    this.add(checkBoxes, BorderLayout.SOUTH);

    myBlockDependencies = new Checkbox("Block dependencies");
    myBlockDependencies.setState(myTree.isShowDependencyOperations());
    myTraceForNode = new Checkbox("Trace for node");
    checkBoxes.add(myBlockDependencies);
    checkBoxes.add(myTraceForNode);
    CheckBoxListener listener = new CheckBoxListener();
    myBlockDependencies.addItemListener(listener);
    myTraceForNode.addItemListener(listener);

    myTree.setBackground(getBackground());
    myTree.setForeground(new Color(0x07025D));
    this.setSize(500, 600);
    this.setPreferredSize(new Dimension(500, 900));
    String title = "TypeSystem trace";
    if (node != null) {
      title = title.concat(" for node (" + node + ")");
    }
    setTitle(title);
    this.pack();
    this.setModal(true);
    this.setVisible(true);
  }

  public Color getBackground() {
    return Color.WHITE;
  }

  public class CheckBoxListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
      Object source = e.getItemSelectable();
      boolean selected = ItemEvent.SELECTED == e.getStateChange();
      if (source == myTraceForNode) {
        myTree.setTraceForNode(selected);
      } else {
        myTree.setShowDependencyOperations(selected);
      }
      myTree.rebuildNow();
      myTree.expandAll();
    }
  }
}
