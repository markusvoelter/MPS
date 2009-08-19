package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.ui.MPSTreeNode;
import javax.swing.Icon;

public class CheckBoxNode<N extends NodeData> extends MPSTreeNode {
  protected final N myData;
  private boolean myIsChecked = false;

  public CheckBoxNode(N rootNode, boolean createChildren) {
    super(null);
    this.setUserObject(rootNode);
    this.myData = rootNode;
    if (createChildren) {
      this.createChildren();
    }
  }

  public String getNodeText() {
    return this.myData.getText();
  }

  public Icon getIconNonFinal(boolean expanded) {
    return this.myData.getIcon(expanded);
  }

  public N getData() {
    return this.myData;
  }

  public boolean isChecked() {
    return this.myIsChecked;
  }

  public void setChecked(boolean checked) {
    this.myIsChecked = checked;
  }

  private void createChildren() {
    for (NodeData childNode : this.myData.getChildren()) {
      this.add(new CheckBoxNode<N>((N)childNode, true));
    }
  }

  public boolean isLeaf() {
    return !(this.myData.canHaveChildren());
  }
}
