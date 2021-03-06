package jetbrains.mps.graphLayout.graphLayout;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graph.IGraph;
import jetbrains.mps.graphLayout.intGeom2D.Rectangle;
import jetbrains.mps.graphLayout.graph.INode;
import jetbrains.mps.graphLayout.graph.IEdge;
import jetbrains.mps.graphLayout.intGeom2D.Point;
import java.util.Set;

public interface IGraphLayout {
  public IGraph getGraph();
  public Rectangle getNodeLayout(INode node);
  public Rectangle getLabelLayout(IEdge edge);
  public Iterable<Point> getEdgeLayout(IEdge edge);
  public Set<? extends INode> getLayoutedNodes();
  public Set<? extends IEdge> getLayoutedEdges();
  public Set<? extends IEdge> getLayoutedLabels();
  public Rectangle getContainingRectangle();
}
