package treepathFeatures;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.AbstractCollection;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Iterator;

public class SNODE extends TreePath<SNode> {
  public SNODE() {
  }

  public SNode parent(SNode node) {
    return SNODE.Parent.parent(node);
  }

  public static IFeatureDescriptor<SNode> child(String param) {
    return new SNODE.Desc_Feature_child(param);
  }

  public static IFeatureDescriptor<SNode> link(String param) {
    return new SNODE.Desc_Feature_link(param);
  }

  private static class Parent {
    public static SNode parent(SNode node) {
      return SNodeOperations.getParent(node);
    }
  }

  private static class Children {
  }

  private static class Feature_child extends AbstractCollection<SNode> {
    private SNode thisNode;
    private String param;

    public Feature_child(SNode thisNode, String param) {
      this.thisNode = thisNode;
      this.param = param;
    }

    public Iterable<SNode> sequence() {
      return SLinkOperations.getTargets(this.thisNode, this.param, true);
    }

    public Iterator<SNode> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return SLinkOperations.getTargets(this.thisNode, this.param, true).size();
    }
  }

  private static class Feature_link extends AbstractCollection<SNode> {
    private SNode thisNode;
    private String param;

    public Feature_link(SNode thisNode, String param) {
      this.thisNode = thisNode;
      this.param = param;
    }

    public Iterable<SNode> sequence() {
      return SLinkOperations.getTargets(this.thisNode, this.param, false);
    }

    public Iterator<SNode> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return SLinkOperations.getTargets(this.thisNode, this.param, false).size();
    }
  }

  public static class Desc_Feature_child extends IFeatureDescriptor.Stub<SNode> implements IFeatureDescriptor<SNode> {
    private String param;

    public Desc_Feature_child(String param) {
      this.param = param;
    }

    public Iterable<SNode> getContents(SNode node) {
      return new SNODE.Feature_child(node, this.param);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "child";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }
  }

  public static class Desc_Feature_link extends IFeatureDescriptor.Stub<SNode> implements IFeatureDescriptor<SNode> {
    private String param;

    public Desc_Feature_link(String param) {
      this.param = param;
    }

    public Iterable<SNode> getContents(SNode node) {
      return new SNODE.Feature_link(node, this.param);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "link";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }
  }
}
