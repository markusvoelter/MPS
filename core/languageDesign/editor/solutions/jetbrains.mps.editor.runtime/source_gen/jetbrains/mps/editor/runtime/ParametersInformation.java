package jetbrains.mps.editor.runtime;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import jetbrains.mps.ide.tooltips.ToolTip;
import javax.swing.border.EmptyBorder;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import javax.swing.JTextPane;
import jetbrains.mps.nodeEditor.EditorSettings;
import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.Graphics;

public class ParametersInformation {
  public ParametersInformation() {
  }

  public List<SNode> getMethods(SNode node, EditorContext editorContext) {
    return null;
  }

  public String getMethodPresentation(SNode node, EditorContext editorContext, SNode method) {
    return null;
  }

  public void getStyledMethodPresentation(SNode node, EditorContext editorContext, SNode method, StyledTextPrinter printer) {
    String text = this.getMethodPresentation(node, editorContext, method);
    printer.append(text);
  }

  public boolean isMethodCurrent(SNode node, EditorContext editorContext, SNode method) {
    return false;
  }

  public Component getComponent(SNode node, EditorContext editorContext) {
    List<SNode> methods = this.getMethods(node, editorContext);
    int lineNumber = 0;
    JPanel panel = new JPanel(new GridBagLayout());
    panel.setBackground(ToolTip.BACKGROUND_COLOR);
    panel.setBorder(new EmptyBorder(0, 4, 0, 4));
    for (SNode method : ListSequence.fromList(methods)) {
      StyledTextPrinter printer = new StyledTextPrinter();
      this.getStyledMethodPresentation(node, editorContext, method, printer);
      JTextPane textPane = new JTextPane(printer.getDocument());
      textPane.setBorder(null);
      textPane.setFont(EditorSettings.getInstance().getDefaultEditorFont());
      textPane.setOpaque(true);
      if (ListSequence.fromList(methods).count() > 1 && this.isMethodCurrent(node, editorContext, method)) {
        textPane.setBackground(new Color(0xe7, 0xfe, 0xea));
      } else {
        textPane.setBackground(ToolTip.BACKGROUND_COLOR);
      }
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.fill = GridBagConstraints.BOTH;
      constraints.gridy = lineNumber++ ;
      panel.add(textPane, constraints);
      if (ListSequence.fromList(methods).last() != method) {
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = lineNumber++ ;
        panel.add(new ParametersInformation.Line(), constraints);
      }
    }
    return panel;
  }

  public static class Line extends JComponent {
    public Line() {
      this.setPreferredSize(new Dimension(1, 1));
    }

    @Override
    protected void paintComponent(Graphics g) {
      g.setColor(Color.LIGHT_GRAY);
      g.drawLine(0, 0, this.getWidth(), 0);
    }
  }
}
