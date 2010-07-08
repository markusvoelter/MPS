package jetbrains.mps.graphLayout.algorithms;

/*Generated by MPS */

import java.util.Set;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.graphLayout.util.NodeMap;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class BiconnectAugmentation {
  public static Set<Edge> makeBiconnected(Graph graph) {
    return new BiconnectAugmentation.MyDfs().doDfs(graph, ListSequence.fromList(graph.getNodes()).getElement(0));
  }

  public static class MyDfs extends Dfs {
    private Map<Node, Node> myLow;
    private Map<Node, Integer> myNum;
    private int myCurNum;
    private Node myNewNode;
    private Node mySource;
    private Set<Node> myConnectToNew;

    public MyDfs() {
    }

    public Set<Edge> doDfs(Graph graph, Node source) {
      myLow = new NodeMap<Node>(graph);
      myNum = new NodeMap<Integer>(graph);
      myCurNum = 0;
      mySource = source;
      myConnectToNew = SetSequence.fromSet(new HashSet<Node>());
      init(graph, Edge.Direction.BOTH);
      dfs(source, null);
      Set<Edge> result = SetSequence.fromSet(new HashSet<Edge>());
      for (Node node : SetSequence.fromSet(myConnectToNew)) {
        SetSequence.fromSet(result).addElement(myNewNode.addEdgeTo(node));
      }
      return result;
    }

    @Override
    protected void preprocess(Node node, Edge from) {
      MapSequence.fromMap(myNum).put(node, myCurNum++);
      MapSequence.fromMap(myLow).put(node, node);
    }

    @Override
    protected void processEdge(Edge edge, Node source) {
      Node next = edge.getOpposite(source);
      if (MapSequence.fromMap(getDfsState()).get(next) == STNumbering.FirstDfs.DURING) {
        changeLow(source, next);
      }
    }

    @Override
    protected void postprocess(Node node, Edge from) {
      if (from != null) {
        Node prev = from.getOpposite(node);
        if (MapSequence.fromMap(myNum).get(prev) <= MapSequence.fromMap(myNum).get(MapSequence.fromMap(myLow).get(node))) {
          if (myNewNode == null) {
            createNewNode();
          }
          SetSequence.fromSet(myConnectToNew).addElement(node);
          MapSequence.fromMap(myLow).put(node, myNewNode);
        }
        changeLow(prev, MapSequence.fromMap(myLow).get(node));
      }
    }

    private void changeLow(Node node, Node newLow) {
      Node oldLow = MapSequence.fromMap(myLow).get(node);
      if (MapSequence.fromMap(myNum).get(oldLow) > MapSequence.fromMap(myNum).get(newLow)) {
        MapSequence.fromMap(myLow).put(node, newLow);
      }
    }

    public void createNewNode() {
      myNewNode = getGraph().addNode();
      MapSequence.fromMap(myNum).put(myNewNode, -1);
      SetSequence.fromSet(myConnectToNew).addElement(mySource);
    }
  }
}
