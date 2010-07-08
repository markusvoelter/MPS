package jetbrains.mps.graphLayout.planarGraph;

/*Generated by MPS */

import java.util.List;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.graphLayout.graph.Node;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class EmbeddedGraph {
  private List<Face> myFaces;
  private Map<Edge, List<Face>> myAdjacentFacesMap;
  private Graph myGraph;
  private Face myOuterFace;

  public EmbeddedGraph(Graph graph) {
    myFaces = ListSequence.fromList(new ArrayList<Face>());
    myAdjacentFacesMap = MapSequence.fromMap(new HashMap<Edge, List<Face>>());
    myGraph = graph;
  }

  public Face findContainingFace(List<Node> nodes) {
    for (Face face : ListSequence.fromList(getFaces())) {
      List<Node> faceNodes = ListSequence.fromList(face.getDarts()).select(new ISelector<Dart, Node>() {
        public Node select(Dart it) {
          return it.getSource();
        }
      }).toListSequence();
      boolean contains = true;
      for (Node node : ListSequence.fromList(nodes)) {
        if (!(ListSequence.fromList(faceNodes).contains(node))) {
          contains = false;
        }
      }
      if (contains) {
        return face;
      }
    }
    return null;
  }

  public Node splitEdge(Edge edge) {
    Graph originalGraph = this.getGraph();
    Node newNode = originalGraph.addDummyNode();
    edge.removeFromGraph();
    List<Edge> newEdges = ListSequence.fromList(new ArrayList<Edge>());
    ListSequence.fromList(newEdges).addElement(edge.getSource().addEdgeTo(newNode));
    ListSequence.fromList(newEdges).addElement(newNode.addEdgeTo(edge.getTarget()));
    List<Face> facesToProcess = ListSequence.fromList(new ArrayList<Face>());
    ListSequence.fromList(facesToProcess).addSequence(ListSequence.fromList(MapSequence.fromMap(this.getAdjacentFacesMap()).get(edge)));
    for (Face face : ListSequence.fromList(facesToProcess)) {
      List<Dart> darts = face.getDarts();
      int pos = 0;
      while (ListSequence.fromList(darts).getElement(pos).getEdge() != edge) {
        pos++;
      }
      Dart dartToReplace = ListSequence.fromList(darts).getElement(pos);
      for (Edge newEdge : ListSequence.fromList(newEdges)) {
        if (ListSequence.fromList(newEdge.getAdjacentNodes()).contains(dartToReplace.getSource())) {
          this.setDart(face, pos, new Dart(newEdge, dartToReplace.getSource()));
        }
      }
      for (Edge newEdge : ListSequence.fromList(newEdges)) {
        if (ListSequence.fromList(newEdge.getAdjacentNodes()).contains(dartToReplace.getTarget())) {
          this.insertDart(face, pos + 1, new Dart(newEdge, newNode));
        }
      }
    }
    return newNode;
  }

  public void splitFace(Face face, List<Edge> path, Node start, Node end) {
    Graph originalGraph = this.getGraph();
    Face faceSToE = new Face(originalGraph);
    Face faceEToS = new Face(originalGraph);
    List<Dart> darts = face.getDarts();
    int posStart = -1;
    int posEnd = -1;
    for (int i = 0; i < ListSequence.fromList(darts).count(); i++) {
      Dart cur = ListSequence.fromList(darts).getElement(i);
      if (cur.getSource() == start) {
        posStart = i;
      }
      if (cur.getSource() == end) {
        posEnd = i;
      }
    }
    Face succ;
    Face split;
    int begSucc;
    int endSucc;
    if (posEnd > posStart) {
      succ = faceEToS;
      split = faceSToE;
      begSucc = posStart;
      endSucc = posEnd;
    } else {
      succ = faceSToE;
      split = faceEToS;
      begSucc = posEnd;
      endSucc = posStart;
    }
    for (int i = begSucc; i < endSucc; i++) {
      succ.addNext(ListSequence.fromList(darts).getElement(i));
    }
    for (int i = endSucc; i < ListSequence.fromList(darts).count(); i++) {
      split.addNext(ListSequence.fromList(darts).getElement(i));
    }
    for (int i = 0; i < begSucc; i++) {
      split.addNext(ListSequence.fromList(darts).getElement(i));
    }
    Node cur = start;
    for (Edge edge : ListSequence.fromList(path)) {
      faceSToE.addNext(new Dart(edge, cur));
      cur = edge.getOpposite(cur);
    }
    cur = end;
    for (Edge edge : ListSequence.fromList(path).reversedList()) {
      faceEToS.addNext(new Dart(edge, cur));
      cur = edge.getOpposite(cur);
    }
    this.removeFace(face);
    addFace(faceEToS);
    addFace(faceSToE);
    if (this.isOuterFace(face)) {
      this.setOuterFace(split);
    }
  }

  public void addFace(Face face) {
    ListSequence.fromList(myFaces).addElement(face);
    for (Dart dart : ListSequence.fromList(face.getDarts())) {
      Edge edge = dart.getEdge();
      this.adjustEdge(edge, face);
    }
  }

  private void adjustEdge(Edge edge, Face face) {
    if (MapSequence.fromMap(myAdjacentFacesMap).get(edge) == null) {
      MapSequence.fromMap(myAdjacentFacesMap).put(edge, ListSequence.fromList(new ArrayList<Face>()));
    }
    ListSequence.fromList(MapSequence.fromMap(myAdjacentFacesMap).get(edge)).addElement(face);
  }

  public void removeFace(Face face) {
    ListSequence.fromList(myFaces).removeElement(face);
    for (Dart dart : ListSequence.fromList(face.getDarts())) {
      this.unadjustEdge(dart.getEdge(), face);
    }
  }

  private void unadjustEdge(Edge edge, Face face) {
    ListSequence.fromList(MapSequence.fromMap(myAdjacentFacesMap).get(edge)).removeElement(face);
    if (ListSequence.fromList(MapSequence.fromMap(myAdjacentFacesMap).get(edge)).count() == 0) {
      MapSequence.fromMap(myAdjacentFacesMap).removeKey(edge);
    }
  }

  public void setDart(Face face, int pos, Dart dart) {
    Dart oldDart = ListSequence.fromList(face.getDarts()).getElement(pos);
    unadjustEdge(oldDart.getEdge(), face);
    ListSequence.fromList(face.getDarts()).setElement(pos, dart);
    adjustEdge(dart.getEdge(), face);
  }

  public void insertDart(Face face, int pos, Dart dart) {
    ListSequence.fromList(face.getDarts()).insertElement(pos, dart);
    adjustEdge(dart.getEdge(), face);
  }

  public List<Face> getFaces() {
    return this.myFaces;
  }

  public Map<Edge, List<Face>> getAdjacentFacesMap() {
    return this.myAdjacentFacesMap;
  }

  public Graph getGraph() {
    return this.myGraph;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    for (Face face : ListSequence.fromList(myFaces)) {
      builder.append(face + "\n");
    }
    builder.append("outer face has num: " + ListSequence.fromList(myFaces).indexOf(myOuterFace));
    return builder.toString();
  }

  public Face getOuterFace() {
    return this.myOuterFace;
  }

  public void setOuterFace(Face outerFace) {
    this.myOuterFace = outerFace;
  }

  public boolean isOuterFace(Face face) {
    return face == myOuterFace;
  }
}
