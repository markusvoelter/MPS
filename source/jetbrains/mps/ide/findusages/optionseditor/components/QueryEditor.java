package jetbrains.mps.ide.findusages.optionseditor.components;

import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.findusages.optionseditor.options.QueryOptions;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.AbstractModule.ModuleScope;
import jetbrains.mps.project.MPSProject.ProjectScope;
import jetbrains.mps.smodel.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class QueryEditor {
  public static final int GLOBAL_SCOPE = 0;
  public static final int PROJECT_SCOPE = 1;
  public static final int MODULE_SCOPE = 2;

  private ActionContext myContext;
  private SNode myNode;

  private List<ListItem> myItems = new ArrayList<ListItem>();

  private JPanel myPanel;

  private JComboBox myComboBox = new JComboBox();

  public QueryEditor(SNode node, ActionContext context, int defaultScope) {
    myContext = context;
    myNode = node;

    initItems();

    myPanel = new JPanel();
    myPanel.setLayout(new BorderLayout());

    myPanel.add(new JLabel("Scope:"), BorderLayout.WEST);

    myComboBox.setModel(new DefaultComboBoxModel() {
      public int getSize() {
        return myItems.size();
      }

      public Object getElementAt(int index) {
        return myItems.get(index);
      }
    });

    myComboBox.setRenderer(new BasicComboBoxRenderer() {
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        return super.getListCellRendererComponent(list, ((ListItem) value).myCaption, index, isSelected, cellHasFocus);    //To change body of overridden methods use File | Settings | File Templates.
      }
    });

    myPanel.add(myComboBox, BorderLayout.CENTER);

    myComboBox.setSelectedIndex(defaultScope);
  }

  public void setDefaults(QueryOptions defaultOptions) {
    IScope scope = defaultOptions.myScope;
    if (scope instanceof GlobalScope) {
      myComboBox.setSelectedIndex(0);
    } else if (scope instanceof ProjectScope) {
      myComboBox.setSelectedIndex(1);
    } else if (scope instanceof ModuleScope) {
      myComboBox.setSelectedIndex(2);
    } else if (scope instanceof ModelScope) {
      myComboBox.setSelectedIndex(3);
    }
  }

  public QueryOptions getQueryOptions() {
    return new QueryOptions(myItems.get(myComboBox.getSelectedIndex()).myScope, new SNodePointer(myNode));
  }

  public JComponent getComponent() {
    return myPanel;
  }

  private IOperationContext getOperationContext() {
    return myContext.getOperationContext();
  }

  private void initItems() {
    myItems.add(new ListItem("Global scope", GlobalScope.getInstance()));
    myItems.add(new ListItem("Project scope", getOperationContext().getProject().getScope()));
    myItems.add(new ListItem("Module scope", getOperationContext().getModule().getScope()));
    myItems.add(new ListItem("Model scope", new ModelScope(getOperationContext().getModule().getScope(), myContext.getModel())));
  }

  private class ListItem {
    public String myCaption;
    public IScope myScope;

    private ListItem(String caption, IScope scope) {
      myCaption = caption;
      myScope = scope;
    }
  }
}
