package jetbrains.mps.workbench.dialogs.project.components.parts.editors;

/*Generated by MPS */

import com.intellij.util.ui.AbstractTableCellEditor;
import jetbrains.mps.project.structure.modules.mappingpriorities.MappingConfig_AbstractRef;
import jetbrains.mps.smodel.Generator;
import java.util.List;
import jetbrains.mps.project.structure.modules.ModuleReference;
import java.util.EventObject;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import jetbrains.mps.workbench.dialogs.project.properties.generator.EditOperandDialog;
import javax.swing.event.ChangeEvent;
import javax.swing.JComponent;
import jetbrains.mps.workbench.dialogs.project.components.parts.renderers.RuleOperandRenderer;

public class RuleOperandEditor extends AbstractTableCellEditor {
  private MappingConfig_AbstractRef myOperand;
  private Generator myGenerator;
  private List<ModuleReference> myDepGens;
  private boolean myLeft;

  public RuleOperandEditor(Generator generator, List<ModuleReference> depGens, boolean isLeft) {
    this.myGenerator = generator;
    this.myDepGens = depGens;
    this.myLeft = isLeft;
  }

  public Object getCellEditorValue() {
    return this.myOperand;
  }

  @Override
  public boolean isCellEditable(EventObject e) {
    if (e == null) {
      return false;
    }
    if (e instanceof MouseEvent) {
      return ((MouseEvent) e).getClickCount() >= 2;
    }
    return true;
  }

  @Override
  public boolean shouldSelectCell(EventObject e) {
    return false;
  }

  public Component getTableCellEditorComponent(final JTable table, Object value, boolean isSelected, final int row, final int column) {
    this.myOperand = (MappingConfig_AbstractRef) value;
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        EditOperandDialog dialog = new EditOperandDialog(RuleOperandEditor.this.myGenerator, RuleOperandEditor.this.myDepGens, RuleOperandEditor.this.myOperand, RuleOperandEditor.this.myLeft);
        dialog.showDialog();
        if (dialog.getResult() != null) {
          RuleOperandEditor.this.myOperand = dialog.getResult();
          table.editingStopped(new ChangeEvent(this));
          table.revalidate();
          table.repaint();
        } else {
          table.editingStopped(new ChangeEvent(this));
        }
      }
    });
    return this.createRenderer(table, this.myOperand, row, column);
  }

  private JComponent createRenderer(JTable table, Object value, int row, int column) {
    return (JComponent) new RuleOperandRenderer().getTableCellRendererComponent(table, value, true, true, row, column);
  }
}
