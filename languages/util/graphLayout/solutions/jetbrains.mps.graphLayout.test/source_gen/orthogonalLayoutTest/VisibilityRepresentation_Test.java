package orthogonalLayoutTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import visualization.GraphIO;
import java.util.Scanner;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.graphLayout.algorithms.GraphOrientation;
import jetbrains.mps.graphLayout.planarGraph.STPlanarGraph;
import java.util.Map;
import jetbrains.mps.graphLayout.intGeom2D.Rectangle;
import jetbrains.mps.graphLayout.stOrthogonalLayout.VisibilityRepresentation;
import jetbrains.mps.graphLayout.planarization.ShortestPathEmbeddingFinder;
import jetbrains.mps.graphLayout.planarization.BiconnectedInitialEmbeddingFinder;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.planarization.TreeEmbeddingFinder;

public class VisibilityRepresentation_Test extends TestCase {
  public void test_test1() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8  " + "8   \n4  0 3 2 1  \n 3  0 7 3 \n  5  0 1 2 4 5   \n4  2 3 6 4 \n  4  4 6 8 5 \n  3  3 8 6 \n  3  3 7 8 \n  4  0 5 8 7\n";
    EmbeddedGraph embeddedGraph = GraphIO.scanSimpleEmbeddedGraph(new Scanner(graphString));
    Graph graph = embeddedGraph.getGraph();
    GraphOrientation.orientST(graph, graph.getNode(0), graph.getNode(8));
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, graph.getNode(0), graph.getNode(8));
    Map<Object, Rectangle> visibility = VisibilityRepresentation.getVisibilityRepresentation(stPlanarGraph);
  }

  public void test_BookGraph() throws Exception {
    String graphString = "9 15  \n0 1  \n0 5  \n0 3  \n0 7  \n1 2  \n2 4  \n2 3  \n3 6  \n3 7  \n3 8  \n4 5  \n4 6  \n5 8  \n6 8 \n 7 8";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    EmbeddedGraph embeddedGraph = new ShortestPathEmbeddingFinder(new BiconnectedInitialEmbeddingFinder()).find(graph);
    Node s = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getSource();
    Node t = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getTarget();
    GraphOrientation.orientST(graph, s, t);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, s, t);
    Map<Object, Rectangle> visibility = VisibilityRepresentation.getVisibilityRepresentation(stPlanarGraph);
  }

  public void test_K5() throws Exception {
    String graphString = "5 10  0 1  0 2  0 3  0 4  1 2  1 3  1 4  2 3  2 4  3 4";
    Graph graph = GraphIO.scanGraph(new Scanner(graphString));
    EmbeddedGraph embeddedGraph = new TreeEmbeddingFinder().find(graph);
    Node s = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getSource();
    Node t = ListSequence.fromList(embeddedGraph.getOuterFace().getDarts()).getElement(0).getTarget();
    GraphOrientation.orientST(graph, s, t);
    STPlanarGraph stPlanarGraph = new STPlanarGraph(embeddedGraph, s, t);
    Map<Object, Rectangle> visibility = VisibilityRepresentation.getVisibilityRepresentation(stPlanarGraph);
  }
}
