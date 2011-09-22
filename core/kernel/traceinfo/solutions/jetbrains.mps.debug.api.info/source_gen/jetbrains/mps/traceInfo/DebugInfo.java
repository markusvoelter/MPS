package jetbrains.mps.traceInfo;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.ArrayList;
import org.jdom.Element;
import java.util.Arrays;
import org.jdom.DataConversionException;

public class DebugInfo {
  private static final String ROOT = "root";
  private static final String DEBUG_INFO = "debugInfo";
  private static final String ROOT_ID_ATTR = "nodeId";
  private static final String UNSPECIFIED_ROOT = "";

  private SModel myModel;
  private Map<String, DebugInfoRoot> myRoots = MapSequence.fromMap(new HashMap<String, DebugInfoRoot>());

  public DebugInfo() {
  }

  public SModel getModel() {
    return myModel;
  }

  public void setModel(SModel model) {
    myModel = model;
  }

  public void addPosition(TraceablePositionInfo position, String rootId) {
    if (rootId == null) {
      rootId = DebugInfo.UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addPosition(position);
  }

  public void addScopePosition(ScopePositionInfo position, String rootId) {
    if (rootId == null) {
      rootId = DebugInfo.UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addScopePosition(position);
  }

  public void addUnitPosition(UnitPositionInfo unitPosition, String rootId) {
    if (rootId == null) {
      rootId = DebugInfo.UNSPECIFIED_ROOT;
    }
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    if (infoRoot == null) {
      infoRoot = new DebugInfoRoot(rootId);
      MapSequence.fromMap(myRoots).put(rootId, infoRoot);
    }
    infoRoot.addUnitPosition(unitPosition);
  }

  public DebugInfoRoot getRootInfo(String rootId) {
    return MapSequence.fromMap(myRoots).get((rootId == null ?
      DebugInfo.UNSPECIFIED_ROOT :
      rootId
    ));
  }

  public void replaceRoot(DebugInfoRoot root) {
    MapSequence.fromMap(myRoots).put(root.getRootId(), root);
  }

  @Nullable
  public SNode getNodeForLine(String file, int line, SModel model) {
    List<TraceablePositionInfo> resultList = getInfoForPosition(file, line, new _FunctionTypes._return_P1_E0<Set<TraceablePositionInfo>, DebugInfoRoot>() {
      public Set<TraceablePositionInfo> invoke(DebugInfoRoot root) {
        return root.getPositions();
      }
    });
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<TraceablePositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<TraceablePositionInfo, Comparable<?>>() {
      public Comparable<?> select(TraceablePositionInfo it) {
        return it;
      }
    }, true);
    final TraceablePositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    String nodeId = firstPositionInfo.getNodeId();
    // here we do some magic to fix the following bug: 
    // each node in base language owns a '\n' symbol in a previous line 
    // in the following code we will never get 'for' node quering line 1: 
    // 1.  for (...) { 
    // 2.    some statement 
    // 3.  } 
    // since 'some statement' takes lines 1-2 instead of just line 2 
    // TODO actually, this mega-hack might not work for other languages 
    // we should seriously consider fixing debug info generation instead 
    if (Sequence.fromIterable(sorted).count() > 1 && firstPositionInfo.getStartLine() == line && firstPositionInfo.getLineDistance() > 0) {
      nodeId = ListSequence.fromList(Sequence.fromIterable(sorted).toListSequence()).getElement(1).getNodeId();
    }
    // here we have another example of how not to write code 
    // this is a hack fixing MPS-8644 
    // the problem is with the BlockStatement which sometimes generates to nothing, but is still present in .debug 
    // so in the code like this: 
    // 1. { 
    // 2. statement 
    // 3. } 
    // block statement occupy the same place as "statement" because this code generates into: 
    // 1. statement 
    // the solution is simple: 
    // among all node with same position we select the deepest 
    if (Sequence.fromIterable(sorted).count() > 1) {
      Iterable<TraceablePositionInfo> sameSpacePositions = Sequence.fromIterable(sorted).where(new IWhereFilter<TraceablePositionInfo>() {
        public boolean accept(TraceablePositionInfo it) {
          return firstPositionInfo.isOccupyTheSameSpace(it);
        }
      });
      if (Sequence.fromIterable(sameSpacePositions).count() > 1) {
        SNode currentNode = model.getNodeById(firstPositionInfo.getNodeId());
        boolean finished = false;
        while (!(finished)) {
          finished = true;
          for (TraceablePositionInfo otherPos : Sequence.fromIterable(sameSpacePositions)) {
            SNode otherNode = model.getNodeById(otherPos.getNodeId());
            if ((otherNode != null) && otherNode.isDescendantOf(currentNode, false)) {
              currentNode = otherNode;
              finished = false;
              break;
            }
          }
        }
        return currentNode;
      }
    }
    // TODO seriously, instead of adding another hack do something with textgen 
    return model.getNodeById(nodeId);
  }

  @Nullable
  public SNode getVarForLine(String file, int line, SModel model, String varName) {
    List<ScopePositionInfo> resultList = getInfoForPosition(file, line, new _FunctionTypes._return_P1_E0<Set<ScopePositionInfo>, DebugInfoRoot>() {
      public Set<ScopePositionInfo> invoke(DebugInfoRoot root) {
        return root.getScopePositions();
      }
    });
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<ScopePositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<ScopePositionInfo, Comparable<?>>() {
      public Comparable<?> select(ScopePositionInfo it) {
        return it;
      }
    }, true);
    for (ScopePositionInfo info : sorted) {
      SNode var = info.getVarNode(varName, model);
      if (var != null) {
        return var;
      }
    }
    // no need in the following code 
    // <node> 
    return null;
  }

  @Nullable
  public TraceablePositionInfo getPositionForNode(String nodeId) {
    for (TraceablePositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, TraceablePositionInfo>() {
      public Iterable<TraceablePositionInfo> translate(DebugInfoRoot it) {
        return it.getPositions();
      }
    })) {
      if (eq_exfyrk_a0a0a0j(element.getNodeId(), nodeId)) {
        return element;
      }
    }
    return null;
  }

  @Nullable
  public UnitPositionInfo getUnitForNode(String nodeId) {
    for (UnitPositionInfo element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).translate(new ITranslator2<DebugInfoRoot, UnitPositionInfo>() {
      public Iterable<UnitPositionInfo> translate(DebugInfoRoot it) {
        return SetSequence.fromSet(it.getUnitPositions()).sort(new ISelector<UnitPositionInfo, Comparable<?>>() {
          public Comparable<?> select(UnitPositionInfo position) {
            return position.getStartLine();
          }
        }, true);
      }
    })) {
      if (eq_exfyrk_a0a0a0k(element.getNodeId(), nodeId)) {
        return element;
      }
    }
    return null;
  }

  @Nullable
  public String getUnitNameForLine(String file, int line) {
    // TODO duplication! 
    List<UnitPositionInfo> resultList = getInfoForPosition(file, line, new _FunctionTypes._return_P1_E0<Set<UnitPositionInfo>, DebugInfoRoot>() {
      public Set<UnitPositionInfo> invoke(DebugInfoRoot root) {
        return root.getUnitPositions();
      }
    });
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<UnitPositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<UnitPositionInfo, Comparable<?>>() {
      public Comparable<?> select(UnitPositionInfo it) {
        return it;
      }
    }, true);
    UnitPositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    return firstPositionInfo.getUnitName();
  }

  @Nullable
  public SNode getUnitNodeForLine(String file, int line, SModel model) {
    // TODO second duplication! 
    List<UnitPositionInfo> resultList = getInfoForPosition(file, line, new _FunctionTypes._return_P1_E0<Set<UnitPositionInfo>, DebugInfoRoot>() {
      public Set<UnitPositionInfo> invoke(DebugInfoRoot root) {
        return root.getUnitPositions();
      }
    });
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<UnitPositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<UnitPositionInfo, Comparable<?>>() {
      public Comparable<?> select(UnitPositionInfo it) {
        return it;
      }
    }, false);
    UnitPositionInfo firstPositionInfo = Sequence.fromIterable(sorted).first();
    String id = firstPositionInfo.getNodeId();
    if (id == null) {
      return null;
    }
    return model.getNodeById(id);
  }

  private <T extends PositionInfo> List<T> getInfoForPosition(final String file, int line, final _FunctionTypes._return_P1_E0<? extends Set<T>, ? super DebugInfoRoot> getAllPositionsForRoot) {
    List<T> resultList = ListSequence.fromList(new ArrayList<T>());
    for (T element : Sequence.fromIterable(MapSequence.fromMap(myRoots).values()).where(new IWhereFilter<DebugInfoRoot>() {
      public boolean accept(DebugInfoRoot it) {
        return SetSequence.fromSet(it.getFileNames()).contains(file);
      }
    }).translate(new ITranslator2<DebugInfoRoot, T>() {
      public Iterable<T> translate(DebugInfoRoot it) {
        return getAllPositionsForRoot.invoke(it);
      }
    })) {
      if (element.isPositionInside(file, line)) {
        ListSequence.fromList(resultList).addElement(element);
      }
    }
    return resultList;
  }

  public List<String> getRoots() {
    return SetSequence.fromSet(MapSequence.fromMap(myRoots).keySet()).toListSequence();
  }

  public Set<TraceablePositionInfo> getPositions(String rootId) {
    DebugInfoRoot infoRoot = MapSequence.fromMap(myRoots).get(rootId);
    return (infoRoot != null ?
      infoRoot.getPositions() :
      null
    );
  }

  public Element toXml() {
    Element element = new Element(DebugInfo.DEBUG_INFO);
    if (myRoots != null) {
      String[] roots = SetSequence.fromSet(MapSequence.fromMap(myRoots).keySet()).toGenericArray(String.class);
      Arrays.sort(roots);
      for (String id : roots) {
        DebugInfoRoot dir = MapSequence.fromMap(myRoots).get(id);
        if (id.equals(DebugInfo.UNSPECIFIED_ROOT)) {
          dir.toXml(element);
        } else {
          Element e = new Element(DebugInfo.ROOT);
          e.setAttribute(DebugInfo.ROOT_ID_ATTR, id);
          dir.toXml(e);
          element.addContent(e);
        }
      }
    }
    return element;
  }

  public static DebugInfo fromXml(Element root) {
    DebugInfo info = new DebugInfo();
    try {
      DebugInfoRoot unspecified = DebugInfoRoot.fromXml(root, DebugInfo.UNSPECIFIED_ROOT);
      if (unspecified != null) {
        MapSequence.fromMap(info.myRoots).put(DebugInfo.UNSPECIFIED_ROOT, unspecified);
      }

      for (Element re : ((List<Element>) root.getChildren(DebugInfo.ROOT))) {
        String rootId = re.getAttributeValue(DebugInfo.ROOT_ID_ATTR);
        MapSequence.fromMap(info.myRoots).put(rootId, DebugInfoRoot.fromXml(re, rootId));
      }
    } catch (DataConversionException e) {
      throw new RuntimeException(e);
    }
    return info;
  }

  private static boolean eq_exfyrk_a0a1a0a5a8(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_exfyrk_a0a0a0j(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }

  private static boolean eq_exfyrk_a0a0a0k(Object a, Object b) {
    return (a != null ?
      a.equals(b) :
      a == b
    );
  }
}
