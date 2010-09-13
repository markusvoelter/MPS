package orthogonalLayoutTest;

/*Generated by MPS */

import jetbrains.mps.graphLayout.flowOrthogonalLayout.OrthogonalFlowLayouter;
import jetbrains.mps.graphLayout.graph.Graph;
import sampleGraphs.RandomGraphGenerator;
import java.io.PrintWriter;
import visualization.GraphIO;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Node;
import java.awt.Dimension;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.graphLayout.graphLayout.GraphLayout;

public class OrthogonalFlowLayouterStressTest {
  public OrthogonalFlowLayouterStressTest() {
  }

  public static void main(String[] args) throws Exception {
    String fileName = "C:\\work\\stressRectFlow.txt";
    OrthogonalFlowLayouter layouter = new OrthogonalFlowLayouter();
    int numNodes = Integer.parseInt(args[0]);
    int numEdges = Integer.parseInt(args[1]);
    int numIter = Integer.parseInt(args[2]);
    for (int iter = 0; iter < numIter; iter++) {
      System.out.println("ITERATION: " + iter);
      Graph graph = RandomGraphGenerator.generateSimpleConnectedGraph(numNodes, numEdges);
      PrintWriter out = new PrintWriter(fileName);
      GraphIO.writeGraph(graph, out);
      out.close();
      Map<Node, Dimension> nodeSizes = MapSequence.fromMap(new HashMap<Node, Dimension>());
      for (Node node : ListSequence.fromList(graph.getNodes())) {
        MapSequence.fromMap(nodeSizes).put(node, new Dimension(70, 70));
      }
      GraphLayout layout = layouter.doLayout(graph, nodeSizes);
      OrthogonalLayoutChecker.chechLayout(layout);
    }
    System.out.println("END!");
  }
}
