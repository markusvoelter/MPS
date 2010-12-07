package planarizationTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import visualization.GraphIO;
import jetbrains.mps.graphLayout.planarization.ClusterEmbeddingProcessor;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.graph.INode;

public class ClusterEmbeddingProcessor_Test extends TestCase {
  public void test_sample() throws Exception {
    String graphString = "6 8  0 1  1 2  0 2  3 4  4 5  5 3  2 4  1 3";
    String treeString = "9 8  0 1  0 2  1 3  1 4  1 5  2 6  2 7  2 8";
    ClusteredGraph graph = GraphIO.scanClusteredGraph(graphString, treeString);
    ClusterEmbeddingProcessor processor = new ClusterEmbeddingProcessor(graph, graph.getRoot());
    processor.constructEmbedding(ListSequence.fromList(new ArrayList<INode>()));
  }
}
