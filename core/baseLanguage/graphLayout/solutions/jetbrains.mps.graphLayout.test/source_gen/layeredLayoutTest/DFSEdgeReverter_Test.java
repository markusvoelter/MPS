package layeredLayoutTest;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.graphLayout.graph.Graph;
import sampleGraphs.SimpleDirectedGraphs;
import jetbrains.mps.graphLayout.layeredLayout.DFSEdgeReverter;

public class DFSEdgeReverter_Test extends TestCase {
  public void test_cycle() throws Exception {
    Graph cycle = SimpleDirectedGraphs.cycle(10);
    new EdgeReverterProxy(new DFSEdgeReverter()).revertEdges(cycle);
  }
}
