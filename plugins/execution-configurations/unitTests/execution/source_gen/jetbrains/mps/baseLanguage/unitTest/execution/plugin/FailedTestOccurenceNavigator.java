package jetbrains.mps.baseLanguage.unitTest.execution.plugin;

/*Generated by MPS */

import javax.swing.tree.DefaultMutableTreeNode;
import jetbrains.mps.ide.ui.MPSTreeNode;

public class FailedTestOccurenceNavigator extends BaseTestOccurenceNavigator {
  public FailedTestOccurenceNavigator(TestTree tree) {
    super(tree);
  }

  public boolean hasAvailableOccurence(boolean next) {
    DefaultMutableTreeNode node = this.testTree.getCurrentNode();
    if (node == null) {
      return false;
    }
    while (true) {
      TestMethodTreeNode leaf = (TestMethodTreeNode) (next ?
        node.getNextLeaf() :
        node.getPreviousLeaf()
      );
      if (leaf == null) {
        return false;
      }
      if (TestTree.isFailed(leaf)) {
        return true;
      }
      node = leaf;
    }
  }

  public boolean accept(MPSTreeNode node) {
    return TestTree.isFailed(node);
  }
}
