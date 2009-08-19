package featuresDemo;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.TreePath;
import org.w3c.dom.Node;
import jetbrains.mps.ypath.runtime.IFilter;
import org.w3c.dom.Element;
import java.util.AbstractList;
import java.util.AbstractCollection;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import org.w3c.dom.NamedNodeMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;

public class DOM_NG extends TreePath<Node> {
  public DOM_NG() {
    this.registerFeature(new DOM_NG.Desc_Feature_nodes());
    this.registerFeature(new DOM_NG.Desc_Feature_attributes());
    this.registerFeature(new DOM_NG.Desc_Feature_parent());
  }

  public static class ELEMENT_NodeKindTrigger implements IFilter<Node> {
    private static DOM_NG.ELEMENT_NodeKindTrigger instance;

    private ELEMENT_NodeKindTrigger() {
    }

    public boolean accept(Node e) {
      return e instanceof Element;
    }

    public static IFilter<Node> getInstance() {
      if (instance == null) {
        instance = new DOM_NG.ELEMENT_NodeKindTrigger();
      }
      return instance;
    }
  }

  public static class ELEMENT_tag_Property {
    public static IFilter<Node> getMatcher(final String matchValue) {
      IFilter filter;
      if (matchValue != null) {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM_NG.ELEMENT_tag_Property.Getter.getValue(node);
            return matchValue.equals(actualValue);
          }
        };
      } else {
        filter = new IFilter() {
          public boolean accept(Object n) {
            Node node = (Node)n;
            String actualValue = DOM_NG.ELEMENT_tag_Property.Getter.getValue(node);
            return actualValue == null;
          }
        };
      }
      return (IFilter<Node>)filter;
    }

    private static class Getter {
      public static String getValue(Node e) {
        return ((Element)e).getTagName();
      }
    }
  }

  private static class Feature_nodes extends AbstractList<Node> {
    private Node thisNode;

    public Feature_nodes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Node get(int idx) {
      if (idx < 0 || idx >= this.size()) {
        throw new IndexOutOfBoundsException();
      }
      return this.thisNode.getChildNodes().item(idx);
    }

    public int size() {
      return this.thisNode.getChildNodes().getLength();
    }
  }

  private static class Feature_attributes extends AbstractCollection<Node> {
    private Node thisNode;

    public Feature_attributes(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<Node> sequence() {
      final Node _node = this.thisNode;
      return Sequence.fromClosure(new ISequenceClosure<Node>() {
        public Iterable<Node> iterable() {
          return new Iterable<Node>() {
            public Iterator<Node> iterator() {
              return new YieldingIterator<Node>() {
                private int __CP__ = 0;
                private NamedNodeMap _3_attributes;
                private int _7_count;
                private int _8_idx;

                protected boolean moveToNext() {
__loop__:
                  do {
__switch__:
                    switch (this.__CP__) {
                      case -1:
                        assert false : "Internal error";
                        return false;
                      case 8:
                        this._8_idx = 0;
                      case 9:
                        if (!(_8_idx < _7_count)) {
                          this.__CP__ = 1;
                          break;
                        }
                        this.__CP__ = 10;
                        break;
                      case 11:
                        _8_idx++ ;
                        this.__CP__ = 9;
                        break;
                      case 4:
                        if (_3_attributes != null) {
                          this.__CP__ = 5;
                          break;
                        }
                        this.__CP__ = 1;
                        break;
                      case 12:
                        this.__CP__ = 11;
                        this.yield(_node.getAttributes().item(_8_idx));
                        return true;
                      case 0:
                        this._3_attributes = _node.getAttributes();
                        this.__CP__ = 4;
                        break;
                      case 5:
                        this._7_count = _3_attributes.getLength();
                        this.__CP__ = 8;
                        break;
                      case 10:
                        this.__CP__ = 12;
                        break;
                      default:
                        break __loop__;
                    }
                  } while(true);
                  return false;
                }
              };
            }
          };
        }
      });
    }

    public Iterator<Node> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return this.thisNode.getAttributes().getLength();
    }
  }

  private static class Feature_parent extends AbstractCollection<Node> {
    private Node thisNode;

    public Feature_parent(Node thisNode) {
      this.thisNode = thisNode;
    }

    public Iterable<Node> sequence() {
      Node parentNode = this.thisNode.getParentNode();
      return (parentNode != null ?
        ListSequence.fromListAndArray(new ArrayList<Node>(), parentNode) :
        ListSequence.fromList(new ArrayList<Node>())
      );
    }

    public Iterator<Node> iterator() {
      return this.sequence().iterator();
    }

    public int size() {
      return 1;
    }
  }

  public static class Desc_Feature_nodes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {
    public Desc_Feature_nodes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOM_NG.Feature_nodes(node);
    }

    public String getOpposite() {
      return "parent";
    }

    public String getName() {
      return "nodes";
    }

    public boolean isDefault() {
      return true;
    }

    public boolean isAscending() {
      return false;
    }
  }

  public static class Desc_Feature_attributes extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {
    public Desc_Feature_attributes() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOM_NG.Feature_attributes(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "attributes";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }
  }

  public static class Desc_Feature_parent extends IFeatureDescriptor.Stub<Node> implements IFeatureDescriptor<Node> {
    public Desc_Feature_parent() {
    }

    public Iterable<Node> getContents(Node node) {
      return new DOM_NG.Feature_parent(node);
    }

    public String getOpposite() {
      return null;
    }

    public String getName() {
      return "parent";
    }

    public boolean isDefault() {
      return false;
    }

    public boolean isAscending() {
      return false;
    }
  }
}
