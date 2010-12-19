package jetbrains.mps.graphLayout.planarization;

/*Generated by MPS */

import jetbrains.mps.graphLayout.graph.ClusteredGraph;
import jetbrains.mps.graphLayout.graph.Node;
import java.util.Set;
import java.util.List;
import jetbrains.mps.graphLayout.graph.Edge;
import jetbrains.mps.graphLayout.graph.Graph;
import jetbrains.mps.graphLayout.planarGraph.EmbeddedGraph;
import java.util.Map;
import jetbrains.mps.graphLayout.graph.INode;
import jetbrains.mps.graphLayout.graph.EdgesHistoryManager;
import jetbrains.mps.graphLayout.planarGraph.Face;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.graphLayout.planarGraph.Dart;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.ArrayList;
import jetbrains.mps.graphLayout.planarGraph.CheckEmbeddedGraph;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.HashMap;
import jetbrains.mps.graphLayout.algorithms.ConnectivityComponents;
import jetbrains.mps.graphLayout.graph.GroupedGraphModificationSynchronizer;
import java.util.HashSet;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;

public class ClusterEmbeddingConstructor {
  private static int debugMode = 1;
  private static int showInfo = 1;
  private static boolean useSlowFaceFinder = true;

  private ClusteredGraph myGraph;
  private Node myCluster;
  private Set<Node> myClusterNodes;
  private List<Edge> myOuterEdgesOrder;
  private Graph mySubclustersGraph;
  private EmbeddedGraph mySubEmbeddedGraph;
  private Map<INode, Node> mySubclustersMap;
  private EdgesHistoryManager myHistoryManager;
  private List<Edge> myClusterBorder;
  private EmbeddedGraph myEmbeddedGraph;
  private Map<Node, Node> myNodeMap;
  private Map<Face, Face> myFaceMap;
  private Map<Node, List<Edge>> myClusterBorderMap = null;

  public ClusterEmbeddingConstructor(ClusteredGraph graph, Node cluster, List<Edge> outerEdgesOrder) {
    myGraph = graph;
    myCluster = cluster;
    myClusterNodes = graph.getNodesInCluster(cluster);
    myOuterEdgesOrder = ListSequence.fromList(new LinkedList<Edge>());
    ListSequence.fromList(myOuterEdgesOrder).addSequence(ListSequence.fromList(outerEdgesOrder));
    myHistoryManager = new EdgesHistoryManager(graph);
    if (showInfo > 0) {
      System.out.println("cluster " + myCluster + " outer edges: " + outerEdgesOrder);
    }
  }

  public EmbeddedGraph constructEmbedding() {
    Iterable<Node> subclusters = myGraph.getSubclusters(myCluster);
    if (Sequence.fromIterable(subclusters).count() == 0) {
      return new EmbeddedGraph(myGraph);
    }
    Map<Edge, Edge> invEdgeMap = constructSubclusterGraphEmbedding();
    if (ClusterEmbeddingConstructor.showInfo > 0) {
      System.out.println("for cluster " + myCluster + " border is: " + myClusterBorder);
    }
    myEmbeddedGraph = new EmbeddedGraph(myGraph);
    myFaceMap = MapSequence.fromMap(new LinkedHashMap<Face, Face>(16, (float) 0.75, false));
    for (Face face : ListSequence.fromList(mySubEmbeddedGraph.getFaces())) {
      Face realFace = new Face(myGraph);
      MapSequence.fromMap(myFaceMap).put(face, realFace);
      for (Dart dart : ListSequence.fromList(face.getDarts())) {
        Edge edge = dart.getEdge();
        Edge realEdge = MapSequence.fromMap(invEdgeMap).get(edge);
        if (realEdge == null) {
          throw new RuntimeException("wrong synchronized embedding");
        }
        Node source = dart.getSource();
        Node realSource;
        if (source == edge.getSource()) {
          realSource = realEdge.getSource();
        } else {
          realSource = realEdge.getTarget();
        }
        realFace.addLast(new Dart(realEdge, realSource));
      }
    }
    for (Node subcluster : Sequence.fromIterable(subclusters)) {
      findSubclusterEmbedding(subcluster, invEdgeMap);
    }
    for (Face face : SetSequence.fromSet(MapSequence.fromMap(myFaceMap).keySet())) {
      Face realFace = MapSequence.fromMap(myFaceMap).get(face);
      myEmbeddedGraph.addFace(realFace);
      if (mySubEmbeddedGraph.isOuterFace(face)) {
        myEmbeddedGraph.setOuterFace(realFace);
      }
    }
    if (myClusterBorderMap != null && ListSequence.fromList(myClusterBorder).count() > 0) {
      MapSequence.fromMap(myClusterBorderMap).put(myCluster, myClusterBorder);
    }
    return myEmbeddedGraph;
  }

  private void findSubclusterEmbedding(Node subcluster, Map<Edge, Edge> invEdgeMap) {
    Node node = MapSequence.fromMap(mySubclustersMap).get(subcluster);
    List<Dart> darts = mySubEmbeddedGraph.getOrderedDarts(node);
    List<Edge> subOuterEdgesOrder = ListSequence.fromList(new ArrayList<Edge>(ListSequence.fromList(darts).count()));
    for (Dart dart : ListSequence.fromList(darts)) {
      Edge edge = dart.getEdge();
      Edge realEdge = MapSequence.fromMap(invEdgeMap).get(edge);
      List<Edge> history = myHistoryManager.getHistory(realEdge);
      if (edge.getSource() == node) {
        realEdge = ListSequence.fromList(history).first();
      } else {
        realEdge = ListSequence.fromList(history).last();
      }
      ListSequence.fromList(subOuterEdgesOrder).addElement(realEdge);
    }
    if (showInfo > 0) {
      for (Dart dart : ListSequence.fromList(darts)) {
        System.out.println("pr dart " + dart + " -> " + MapSequence.fromMap(invEdgeMap).get(dart.getEdge()));
      }
      System.out.println("pr " + subOuterEdgesOrder);
    }
    ClusterEmbeddingConstructor subProcessor = new ClusterEmbeddingConstructor(myGraph, subcluster, subOuterEdgesOrder);
    subProcessor.setClusterBorderMap(myClusterBorderMap);
    EmbeddedGraph subclusterEmbedding = subProcessor.constructEmbedding();
    CheckEmbeddedGraph.checkEmbeddedGraph(subclusterEmbedding, false);
    if (ListSequence.fromList(subclusterEmbedding.getFaces()).count() > 0) {
      for (Face face : ListSequence.fromList(subclusterEmbedding.getFaces())) {
        if (subclusterEmbedding.isOuterFace(face)) {
          continue;
        }
        myEmbeddedGraph.addFace(face);
      }
      if (showInfo > 0) {
        for (Edge edge : ListSequence.fromList(subOuterEdgesOrder)) {
          System.out.println("order " + edge + ": " + myHistoryManager.getHistory(edge));
        }
      }
      for (Dart dart : ListSequence.fromList(darts)) {
        System.out.println("dart " + dart + " -> " + MapSequence.fromMap(invEdgeMap).get(dart.getEdge()));
      }
      List<Edge> subclusterBorder = subProcessor.getClusterBorder();
      for (int i = 0; i < ListSequence.fromList(darts).count(); i++) {
        Edge borderEdge = ListSequence.fromList(subclusterBorder).getElement(i);
        Edge outerEdge = ListSequence.fromList(subOuterEdgesOrder).getElement(i);
        int next = i + 1;
        if (next == ListSequence.fromList(darts).count()) {
          next = 0;
        }
        final Edge nextOuterEdge = ListSequence.fromList(subOuterEdgesOrder).getElement(next);
        Face face = MapSequence.fromMap(myFaceMap).get(mySubEmbeddedGraph.getFace(ListSequence.fromList(darts).getElement(i)));
        List<Dart> faceDarts = face.getDarts();
        List<Dart> nextOuterFaceDarts = ListSequence.fromList(faceDarts).where(new IWhereFilter<Dart>() {
          public boolean accept(Dart dart) {
            return dart.getEdge() == nextOuterEdge;
          }
        }).toListSequence();
        final Node outerNode = getOuterNode(nextOuterEdge, subcluster);
        Dart nextOuterEdgeDart = ListSequence.fromList(nextOuterFaceDarts).findFirst(new IWhereFilter<Dart>() {
          public boolean accept(Dart it) {
            return it.getSource() == outerNode;
          }
        });
        if (nextOuterEdgeDart == null) {
          throw new RuntimeException("error during merging subcluster's embeddings");
        }
        face.makeStartsWith(nextOuterEdgeDart);
        ListSequence.fromList(faceDarts).removeElementAt(0);
        ListSequence.fromList(faceDarts).removeElementAt(0);
        Edge curOuterEdge = getOuterEdgeAfterModifications(subcluster, outerEdge);
        Edge curNextOuterEdge = getOuterEdgeAfterModifications(subcluster, nextOuterEdge);
        ListSequence.fromList(faceDarts).insertElement(0, new Dart(curOuterEdge, borderEdge.getSource()));
        ListSequence.fromList(faceDarts).insertElement(0, new Dart(borderEdge, borderEdge.getTarget()));
        ListSequence.fromList(faceDarts).insertElement(0, new Dart(curNextOuterEdge, curNextOuterEdge.getOpposite(borderEdge.getTarget())));
      }
    }
  }

  private Edge getOuterEdgeAfterModifications(Node subcluster, Edge outerEdge) {
    final Node outerNode = this.getOuterNode(outerEdge, subcluster);
    return ListSequence.fromList(myHistoryManager.getHistory(outerEdge)).findFirst(new IWhereFilter<Edge>() {
      public boolean accept(Edge edge) {
        return ListSequence.fromList(edge.getAdjacentNodes()).contains(outerNode);
      }
    });
  }

  private Node getOuterNode(Edge outerEdge, final Node subcluster) {
    return ListSequence.fromList(outerEdge.getAdjacentNodes()).findFirst(new IWhereFilter<Node>() {
      public boolean accept(Node node) {
        return MapSequence.fromMap(myNodeMap).get(node) != MapSequence.fromMap(mySubclustersMap).get(subcluster);
      }
    });
  }

  private Map<Edge, Edge> constructSubclusterGraphEmbedding() {
    // Creating a subcluster graph, where each subcluster is represented by a single node, 
    // and finding embedding for it. 
    mySubclustersGraph = new Graph();
    Map<Node, Node> nodeMap = MapSequence.fromMap(new HashMap<Node, Node>());
    myNodeMap = nodeMap;
    mySubclustersMap = MapSequence.fromMap(new HashMap<INode, Node>());
    List<Node> subclusters = myGraph.getSubclusters(myCluster);
    for (Node subcluster : ListSequence.fromList(subclusters)) {
      Node clusterNode = mySubclustersGraph.createNode();
      for (Node node : myGraph.getNodesInCluster(subcluster)) {
        MapSequence.fromMap(nodeMap).put(node, clusterNode);
      }
      MapSequence.fromMap(mySubclustersMap).put(subcluster, clusterNode);
    }
    Map<Edge, Edge> invEdgeMap = MapSequence.fromMap(new HashMap<Edge, Edge>());
    for (Node source : SetSequence.fromSet(myClusterNodes)) {
      for (Edge edge : source.getOutEdges()) {
        Node target = edge.getTarget();
        if (SetSequence.fromSet(myClusterNodes).contains(target) && MapSequence.fromMap(nodeMap).get(source) != MapSequence.fromMap(nodeMap).get(target)) {
          Edge newEdge = mySubclustersGraph.connect(MapSequence.fromMap(nodeMap).get(source), MapSequence.fromMap(nodeMap).get(target));
          MapSequence.fromMap(invEdgeMap).put(newEdge, edge);
        }
      }
    }
    if (showInfo > 0) {
      System.out.println("i subgraph " + myCluster + ": " + mySubclustersGraph.getEdges());
    }
    Set<Edge> connectingEdges = ConnectivityComponents.makeConnected(mySubclustersGraph);
    if (showInfo > 0) {
      System.out.println("c subgraph " + myCluster + ": " + mySubclustersGraph.getEdges());
    }
    for (Edge edge : SetSequence.fromSet(connectingEdges)) {
      Node source = this.getRealNode(edge.getSource(), nodeMap);
      Node target = getRealNode(edge.getTarget(), nodeMap);
      Edge realEdge = myGraph.connect(source, target);
      MapSequence.fromMap(invEdgeMap).put(edge, realEdge);
    }
    GroupedGraphModificationSynchronizer synchronizer = new GroupedGraphModificationSynchronizer(mySubclustersGraph, myGraph, invEdgeMap);
    mySubEmbeddedGraph = EmbeddingFinderFactory.getFinder().find(mySubclustersGraph);
    if (showInfo > 0) {
      System.out.println("e subgraph " + myCluster + ": " + mySubclustersGraph.getEdges());
    }
    synchronizer.disconnect();

    if (ListSequence.fromList(myOuterEdgesOrder).count() > 0) {
      // Creating a special structure for processing outer edges. Syncronizer should be turned off 
      // due to this structure has no corresponding in initial graph. 
      int numShifts = 0;
      while (getSubcluster(ListSequence.fromList(myOuterEdgesOrder).first()) == getSubcluster(ListSequence.fromList(myOuterEdgesOrder).last()) && numShifts < ListSequence.fromList(myOuterEdgesOrder).count()) {
        ListSequence.fromList(myOuterEdgesOrder).insertElement(0, ListSequence.fromList(myOuterEdgesOrder).removeLastElement());
        numShifts++;
      }
      List<Edge> subClusterBorder = ListSequence.fromList(new ArrayList<Edge>(ListSequence.fromList(myOuterEdgesOrder).count()));
      myClusterBorder = ListSequence.fromList(new ArrayList<Edge>(ListSequence.fromList(myOuterEdgesOrder).count()));
      List<Edge> subOuterEdges = ListSequence.fromList(new ArrayList<Edge>(ListSequence.fromList(myOuterEdgesOrder).count()));
      List<Node> realBorderNodes = ListSequence.fromList(new ArrayList<Node>(ListSequence.fromList(myOuterEdgesOrder).count()));
      List<Node> subBorderNodes = ListSequence.fromList(new ArrayList<Node>(ListSequence.fromList(myOuterEdgesOrder).count()));
      for (Edge outerEdge : ListSequence.fromList(myOuterEdgesOrder)) {
        final Node realClusterNode = getClusterNode(outerEdge);
        boolean isSource = realClusterNode == outerEdge.getSource();
        List<Edge> realSplit = myGraph.splitEdge(outerEdge);
        ListSequence.fromList(realBorderNodes).addElement(ListSequence.fromList(realSplit).getElement(0).getTarget());
        Node subBorderNode = mySubclustersGraph.createNode();
        ListSequence.fromList(subBorderNodes).addElement(subBorderNode);
        Edge subOuterEdge;
        if (isSource) {
          subOuterEdge = mySubclustersGraph.connect(MapSequence.fromMap(nodeMap).get(realClusterNode), subBorderNode);
        } else {
          subOuterEdge = mySubclustersGraph.connect(subBorderNode, MapSequence.fromMap(nodeMap).get(realClusterNode));
        }
        Edge realOuterEdge = ListSequence.fromList(realSplit).findFirst(new IWhereFilter<Edge>() {
          public boolean accept(Edge it) {
            return ListSequence.fromList(it.getAdjacentNodes()).contains(realClusterNode);
          }
        });
        MapSequence.fromMap(invEdgeMap).put(subOuterEdge, realOuterEdge);
        ListSequence.fromList(subOuterEdges).addElement(subOuterEdge);
      }
      Face outerFace = new Face(mySubclustersGraph);
      for (int i = 0; i < ListSequence.fromList(myOuterEdgesOrder).count(); i++) {
        int next = i + 1;
        if (next == ListSequence.fromList(myOuterEdgesOrder).count()) {
          next = 0;
        }
        Edge realBorderEdge = myGraph.connect(ListSequence.fromList(realBorderNodes).getElement(i), ListSequence.fromList(realBorderNodes).getElement(next));
        ListSequence.fromList(myClusterBorder).addElement(realBorderEdge);
        Edge subBorderEdge = mySubclustersGraph.connect(ListSequence.fromList(subBorderNodes).getElement(i), ListSequence.fromList(subBorderNodes).getElement(next));
        ListSequence.fromList(subClusterBorder).addElement(subBorderEdge);
        MapSequence.fromMap(invEdgeMap).put(subBorderEdge, realBorderEdge);
        outerFace.addFirst(new Dart(subBorderEdge, ListSequence.fromList(subBorderNodes).getElement(next)));
      }
      // make myClusterBorder in correspondence with initial outer edges 
      for (int i = 0; i < numShifts; i++) {
        ListSequence.fromList(myClusterBorder).addElement(ListSequence.fromList(myClusterBorder).removeElementAt(0));
      }

      // Including this construction into subclusters graph embedding as an outer face. 
      Set<Edge> addedEdges = SetSequence.fromSet(new HashSet<Edge>());
      if (useSlowFaceFinder) {
        addedEdges = createOuterFaceWithFaceSelection(subBorderNodes, subOuterEdges, subClusterBorder);
      } else {
        Edge bridge = this.createOuterFace(subBorderNodes, subOuterEdges, subClusterBorder);
        SetSequence.fromSet(addedEdges).addElement(bridge);
      }
      mySubEmbeddedGraph.addFace(outerFace);
      mySubEmbeddedGraph.setOuterFace(outerFace);
      if (debugMode > 0) {
        CheckEmbeddedGraph.checkEmbeddedGraph(mySubEmbeddedGraph, false);
      }
      // Processing outer edges. 
      synchronizer = new GroupedGraphModificationSynchronizer(mySubclustersGraph, myGraph, invEdgeMap);
      for (Edge edge : ListSequence.fromList(subOuterEdges)) {
        if (SetSequence.fromSet(addedEdges).contains(edge)) {
          continue;
        }
        mySubclustersGraph.removeEdge(edge);
        ShortestPathEmbeddingFinder.restoreEdge(mySubEmbeddedGraph, edge, true);
      }
      synchronizer.disconnect();
    }
    return invEdgeMap;
  }

  private Set<Edge> createOuterFaceWithFaceSelection(List<Node> subBorderNodes, List<Edge> subOuterEdges, List<Edge> subClusterBorder) {
    // there is only one subcluster of myCluster 
    if (mySubEmbeddedGraph.isEmpty()) {
      Node node = ListSequence.fromList(mySubclustersGraph.getNodes()).first();
      Edge prev = ListSequence.fromList(subOuterEdges).last();
      Edge borderEdge = ListSequence.fromList(subClusterBorder).last();
      Iterator<Edge> borderEdgeItr = ListSequence.fromList(subClusterBorder).iterator();
      for (Edge edge : ListSequence.fromList(subOuterEdges)) {
        Face face = new Face(mySubclustersGraph);
        face.addLast(new Dart(borderEdge, borderEdge.getSource()));
        face.addLast(new Dart(edge, edge.getOpposite(node)));
        face.addLast(new Dart(prev, node));
        mySubEmbeddedGraph.addFace(face);
        prev = edge;
        borderEdge = borderEdgeItr.next();
      }
      Set<Edge> addedEdges = SetSequence.fromSet(new HashSet<Edge>());
      SetSequence.fromSet(addedEdges).addSequence(ListSequence.fromList(subOuterEdges));
      return addedEdges;
    }
    Tuples._2<Face, List<Tuples._2<Integer, Integer>>> bestFaceInfo = findBestFace();
    Face bestFace = bestFaceInfo._0();
    mySubEmbeddedGraph.removeFace(bestFace);
    List<Tuples._2<Integer, Integer>> positions = bestFaceInfo._1();
    List<Dart> darts = ListSequence.fromList(bestFace.getDarts()).reversedList();
    positions = shiftLists(positions, darts, subBorderNodes, subOuterEdges, subClusterBorder);
    checkPos(positions);
    ClusterEmbeddingConstructor.ListParser<Dart> dartParser = new ClusterEmbeddingConstructor.ListParser(darts);
    ClusterEmbeddingConstructor.ListParser<Edge> edgeParser = new ClusterEmbeddingConstructor.ListParser(subClusterBorder);
    Tuples._2<Integer, Integer> prev = MultiTuple.<Integer,Integer>from(-1, -1);
    Set<Edge> addedEdges = SetSequence.fromSet(new HashSet<Edge>());
    for (Tuples._2<Integer, Integer> pos : ListSequence.fromList(positions)) {
      if (prev._0() == -1) {
        prev = pos;
        continue;
      }
      List<Dart> curDarts = dartParser.getNext(pos._1());
      List<Edge> curEdges = edgeParser.getNext(pos._0());
      this.addFace(subOuterEdges, prev, subBorderNodes, curEdges, pos, curDarts, addedEdges);
      prev = pos;
    }
    // add last face 
    List<Dart> curDarts = dartParser.getEnd();
    List<Edge> curEdges = edgeParser.getEnd();
    Tuples._2<Integer, Integer> pos = ListSequence.fromList(positions).first();
    addFace(subOuterEdges, prev, subBorderNodes, curEdges, pos, curDarts, addedEdges);
    return addedEdges;
  }

  private void addFace(List<Edge> subOuterEdges, Tuples._2<Integer, Integer> prev, List<Node> subBorderNodes, List<Edge> curEdges, Tuples._2<Integer, Integer> pos, List<Dart> curDarts, Set<Edge> addedEdges) {
    Face face = new Face(mySubclustersGraph);
    Edge prevEdge = ListSequence.fromList(subOuterEdges).getElement(prev._0());
    face.addLast(new Dart(prevEdge, prevEdge.getOpposite(ListSequence.fromList(subBorderNodes).getElement(prev._0()))));
    for (Edge edge : ListSequence.fromList(curEdges)) {
      face.addLast(new Dart(edge, edge.getSource()));
    }
    face.addLast(new Dart(ListSequence.fromList(subOuterEdges).getElement(pos._0()), ListSequence.fromList(subBorderNodes).getElement(pos._0())));
    for (Dart dart : ListSequence.fromList(curDarts).reversedList()) {
      face.addLast(dart);
    }
    mySubEmbeddedGraph.addFace(face);
    SetSequence.fromSet(addedEdges).addElement(ListSequence.fromList(subOuterEdges).getElement(pos._0()));
  }

  public void checkPos(List<Tuples._2<Integer, Integer>> pos) {
    int last0 = Integer.MIN_VALUE;
    int last1 = Integer.MIN_VALUE;
    for (Tuples._2<Integer, Integer> p : ListSequence.fromList(pos)) {
      if (p._0() <= last0) {
        throw new RuntimeException("fail");
      }
      if (p._1() < last1) {
        throw new RuntimeException("fail");
      }
      last0 = p._0();
      last1 = p._1();
    }
  }

  private List<Tuples._2<Integer, Integer>> shiftLists(List<Tuples._2<Integer, Integer>> pos, List<Dart> darts, List<Node> borderNodes, List<Edge> outerEdges, List<Edge> borderEdges) {
    Tuples._2<Integer, Integer> first = ListSequence.fromList(pos).first();
    int firstBorderPos = first._0();
    for (int i = 0; i < firstBorderPos; i++) {
      ListSequence.fromList(borderNodes).addElement(ListSequence.fromList(borderNodes).removeElementAt(0));
      ListSequence.fromList(outerEdges).addElement(ListSequence.fromList(outerEdges).removeElementAt(0));
      ListSequence.fromList(borderEdges).addElement(ListSequence.fromList(borderEdges).removeElementAt(0));
    }
    int firstDartPos = first._1();
    for (int i = 0; i < firstDartPos; i++) {
      ListSequence.fromList(darts).addElement(ListSequence.fromList(darts).removeElementAt(0));
    }
    List<Tuples._2<Integer, Integer>> newPos = ListSequence.fromList(new ArrayList<Tuples._2<Integer, Integer>>(ListSequence.fromList(pos).count()));
    for (Tuples._2<Integer, Integer> p : ListSequence.fromList(pos)) {
      int p0 = p._0() - firstBorderPos;
      int p1 = p._1() - firstDartPos;
      if (p1 < 0) {
        p1 += ListSequence.fromList(darts).count();
      }
      ListSequence.fromList(newPos).addElement(MultiTuple.<Integer,Integer>from(p0, p1));
    }
    return newPos;
  }

  private Tuples._2<Face, List<Tuples._2<Integer, Integer>>> findBestFace() {
    Face bestFace = null;
    List<Tuples._2<Integer, Integer>> pos = ListSequence.fromList(new ArrayList<Tuples._2<Integer, Integer>>());
    List<Object> outerOrder = ListSequence.fromList(new LinkedList<Object>());
    for (Edge outerEdge : ListSequence.fromList(myOuterEdgesOrder)) {
      ListSequence.fromList(outerOrder).addElement(getSubcluster(outerEdge));
    }
    for (Face face : ListSequence.fromList(mySubEmbeddedGraph.getFaces())) {
      List<Object> faceOrder = ListSequence.fromList(new LinkedList<Object>());
      List<Dart> darts = face.getDarts();
      // outer edge has counterclockwise darts order 
      for (Dart dart : ListSequence.fromList(darts).reversedList()) {
        ListSequence.fromList(faceOrder).addElement(dart.getTarget());
      }
      List<Tuples._2<Integer, Integer>> facePos = SubsequenceFinder.getCyclicSubsequence(outerOrder, faceOrder);
      if (ListSequence.fromList(facePos).count() > ListSequence.fromList(pos).count()) {
        pos = facePos;
        bestFace = face;
      }
    }
    return MultiTuple.<Face,List<Tuples._2<Integer, Integer>>>from(bestFace, pos);
  }

  private Edge createOuterFace(List<Node> subBorderNodes, List<Edge> subOuterEdges, List<Edge> subClusterBorder) {
    Node borderFirstNode = ListSequence.fromList(subBorderNodes).first();
    Edge bridge = ListSequence.fromList(subOuterEdges).first();
    Node clusterFirstNode = bridge.getOpposite(borderFirstNode);
    Face clusterOuterFace = mySubEmbeddedGraph.findContainingFace(ListSequence.fromListAndArray(new ArrayList<Node>(), clusterFirstNode));
    clusterOuterFace.makeEndsWith(clusterFirstNode);
    Face ringFace = new Face(mySubclustersGraph);
    ringFace.addLast(new Dart(bridge, clusterFirstNode));
    for (Edge edge : ListSequence.fromList(subClusterBorder)) {
      ringFace.addLast(new Dart(edge, edge.getSource()));
    }
    ringFace.addLast(new Dart(bridge, borderFirstNode));
    for (Dart dart : ListSequence.fromList(clusterOuterFace.getDarts())) {
      ringFace.addLast(dart);
    }
    mySubEmbeddedGraph.removeFace(clusterOuterFace);
    mySubEmbeddedGraph.addFace(ringFace);
    return bridge;
  }

  private Node getRealNode(final Node subNode, final Map<Node, Node> nodeMap) {
    return SetSequence.fromSet(myClusterNodes).findFirst(new IWhereFilter<Node>() {
      public boolean accept(Node it) {
        return MapSequence.fromMap(nodeMap).get(it) == subNode;
      }
    });
  }

  private Node getClusterNode(Edge edge) {
    boolean isSource = SetSequence.fromSet(myClusterNodes).contains(edge.getSource());
    boolean isTarget = SetSequence.fromSet(myClusterNodes).contains(edge.getTarget());
    if (isSource == isTarget) {
      throw new RuntimeException("" + edge + " is not outer for cluster " + myCluster);
    }
    if (isSource) {
      return edge.getSource();
    } else {
      return edge.getTarget();
    }
  }

  private Node getSubcluster(Edge outerEdge) {
    for (Node node : ListSequence.fromList(outerEdge.getAdjacentNodes())) {
      Node subcluster = MapSequence.fromMap(myNodeMap).get(node);
      if (subcluster != null) {
        return subcluster;
      }
    }
    return null;
  }

  public List<Edge> getClusterBorder() {
    return myClusterBorder;
  }

  public void setClusterBorderMap(Map<Node, List<Edge>> clusterBorderMap) {
    myClusterBorderMap = clusterBorderMap;
  }

  public class ListParser<T> {
    private Iterator<T> myItr;
    private int myPos;

    public ListParser(List<T> list) {
      myItr = ListSequence.fromList(list).iterator();
      myPos = 0;
    }

    public List<T> getNext(int nextPos) {
      List<T> part = ListSequence.fromList(new LinkedList<T>());
      while (myPos != nextPos) {
        ListSequence.fromList(part).addElement(myItr.next());
        myPos++;
      }
      return part;
    }

    public List<T> getEnd() {
      List<T> part = ListSequence.fromList(new LinkedList<T>());
      while (myItr.hasNext()) {
        ListSequence.fromList(part).addElement(myItr.next());
        myPos++;
      }
      return part;
    }
  }
}
