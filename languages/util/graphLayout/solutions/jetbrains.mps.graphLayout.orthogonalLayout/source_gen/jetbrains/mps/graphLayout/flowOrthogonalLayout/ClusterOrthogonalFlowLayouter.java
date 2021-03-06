package jetbrains.mps.graphLayout.flowOrthogonalLayout;

/*Generated by MPS */

import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.List;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.EdgesHistoryManager;
import jetbrains.mps.graphLayout.graphLayout.GraphLayout;
import jetbrains.mps.graphLayout.graphLayout.ILayoutInfo;
import jetbrains.mps.graphLayout.graph.IGraph;
import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import jetbrains.mps.graphLayout.graphLayout.LayoutInfo;
import jetbrains.mps.graphLayout.graph.Graph;
import java.util.Set;
import jetbrains.mps.graphLayout.graphLayout.ClusteredGraphLayout;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.graphLayout.intGeom2D.Point;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import jetbrains.mps.graphLayout.planarization.ClusteredGraphEmbeddingFinder;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class ClusterOrthogonalFlowLayouter extends OrthogonalFlowLayouter {
  private Map<Node, List<Edge>> myClusterBorderMap;
  private EdgesHistoryManager myHistoryManager;

  public ClusterOrthogonalFlowLayouter() {
  }

  @Override
  public GraphLayout doLayout(ILayoutInfo layoutInfo) {
    IGraph graph = layoutInfo.getGraph();
    if (!(graph instanceof ClusteredGraph)) {
      throw new RuntimeException("can layout clustered graph only!!!");
    }
    setUseRepresentationOptimizations(false);
    return super.doLayout(layoutInfo);
  }

  @Override
  protected GraphLayout doLayoutCopy(LayoutInfo patchInfo) {
    return doLayoutConnectedGraph(patchInfo);
  }

  @Override
  protected GraphLayout refineLayout(Graph graph, Set<Node> initialNodes, GraphLayout layout, Set<Edge> initialEdges, Map<Edge, List<Edge>> history, Map<Edge, Edge> labeledEdges) {
    ClusteredGraphLayout refinedLayout = ((ClusteredGraphLayout) super.refineLayout(graph, initialNodes, layout, initialEdges, history, labeledEdges));
    for (Node cluster : SetSequence.fromSet(MapSequence.fromMap(myClusterBorderMap).keySet())) {
      List<Edge> border = MapSequence.fromMap(myClusterBorderMap).get(cluster);
      List<Point> borderLayout = ListSequence.fromList(new LinkedList<Point>());
      for (Edge borderEdge : ListSequence.fromList(border)) {
        List<Edge> borderEdgeHistory = MapSequence.fromMap(history).get(borderEdge);
        for (Edge historyEdge : ListSequence.fromList(borderEdgeHistory)) {
          List<Point> copyEdgeLayout = layout.getEdgeLayout(historyEdge);
          ListSequence.fromList(borderLayout).addSequence(ListSequence.fromList(copyEdgeLayout));
        }
      }
      refinedLayout.setClusterLayout(cluster, borderLayout);
    }
    return refinedLayout;
  }

  @Override
  public Edge getLabeledEdge(List<Edge> edges) {
    return super.getLabeledEdge(edges);
  }

  @Override
  protected EmbeddedGraph getEmbedding(Graph graph) {
    EdgesHistoryManager historyManager = new EdgesHistoryManager(graph);
    ClusteredGraphEmbeddingFinder embeddingFinder = new ClusteredGraphEmbeddingFinder();
    EmbeddedGraph embeddedGraph = embeddingFinder.find(graph);
    myClusterBorderMap = embeddingFinder.getClusterBorderMap();
    this.checkClusterBorder(historyManager);
    myHistoryManager = historyManager;
    /*
      myStraightEdges = SetSequence.fromSet(new HashSet<Edge>());
      for (List<Edge> border : Sequence.fromIterable(MapSequence.fromMap(myClusterBorderMap).values())) {
        SetSequence.fromSet(myStraightEdges).addSequence(ListSequence.fromList(border));
      }
    */
    return embeddedGraph;
  }

  private void checkClusterBorder(EdgesHistoryManager historyManager) {
    for (List<Edge> border : Sequence.fromIterable(MapSequence.fromMap(myClusterBorderMap).values())) {
      for (Edge edge : ListSequence.fromList(border)) {
        if (ListSequence.fromList(historyManager.getHistory(edge)).count() > 1) {
          throw new RuntimeException("wrong border!!!");
        }
      }
    }
  }
}
