package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.tabbedEditor.tabs.EditorTabFactory;
import jetbrains.mps.ide.tabbedEditor.AbstractLazyTab;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;

public class Data_Flow_Tab_Factory extends EditorTabFactory {
  public Data_Flow_Tab_Factory() {
  }

  public AbstractLazyTab createTab(SNode node) {
    return new Data_Flow_Tab(node);
  }

  public SNode getBaseNode(IOperationContext context, SNode node) {
    return ConceptEditorOpenHelper.getBaseNode(node, context);
  }
}
