package jetbrains.mps.debug;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.Map;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.LinkedHashMap;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.TreeSet;
import org.jdom.Element;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jdom.DataConversionException;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.smodel.SModelDescriptor;
import java.io.File;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class DebugInfo {
  private static final String DEBUG_INFO = "debugInfo";
  private static final String NODE_INFO = "nodeInfo";
  private static final String ROOT = "root";
  private static final String ROOT_ID_ATTR = "nodeId";
  private static final String UNSPECIFIED_ROOT = "";
  private static Logger LOG = Logger.getLogger(DebugInfo.class);

  private Map<String, Set<PositionInfo>> myRootToPositions = MapSequence.fromMap(new LinkedHashMap<String, Set<PositionInfo>>(16, (float) 0.75, false));
  private SModel myModel;

  public DebugInfo() {
  }

  public void addPosition(PositionInfo position) {
    this.addPosition(position, UNSPECIFIED_ROOT);
  }

  public void addPosition(PositionInfo position, String rootNodeId) {
    if (rootNodeId == null) {
      rootNodeId = UNSPECIFIED_ROOT;
    }
    Set<PositionInfo> info = MapSequence.fromMap(this.myRootToPositions).get(rootNodeId);
    if (info == null) {
      info = SetSequence.fromSet(new TreeSet<PositionInfo>());
      MapSequence.fromMap(this.myRootToPositions).put(rootNodeId, info);
    }
    SetSequence.fromSet(info).addElement(position);
  }

  public Element toXml() {
    Element root = new Element(DEBUG_INFO);

    Set<PositionInfo> noroot = MapSequence.fromMap(this.myRootToPositions).get(UNSPECIFIED_ROOT);
    if (noroot != null) {
      for (PositionInfo position : noroot) {
        Element e = new Element(NODE_INFO);
        position.saveTo(e);
        root.addContent(e);
      }
    }
    for (String rootId : SetSequence.fromSet(MapSequence.fromMap(this.myRootToPositions).keySet()).where(new IWhereFilter<String>() {
      public boolean accept(String it) {
        return !(ObjectUtils.equals(it, UNSPECIFIED_ROOT));
      }
    }).sort(new ISelector<String, Comparable<?>>() {
      public Comparable<?> select(String it) {
        return it;
      }
    }, true)) {
      Element re = new Element(ROOT);
      re.setAttribute(ROOT_ID_ATTR, rootId);
      root.addContent(re);
      for (PositionInfo position : MapSequence.fromMap(this.myRootToPositions).get(rootId)) {
        Element e = new Element(NODE_INFO);
        position.saveTo(e);
        re.addContent(e);
      }
    }
    return root;
  }

  public List<SNode> getNodesForLine(String str, SModel model) {
    List<SNode> result = new ArrayList<SNode>();
    for (Set<PositionInfo> val : MapSequence.fromMap(this.myRootToPositions).values()) {
      for (PositionInfo element : val) {
        if (ObjectUtils.equals(element.getFileAndLine(), str)) {
          String nodeId = element.getNodeId();
          SNode node = model.getNodeById(nodeId);
          ListSequence.fromList(result).addElement(node);
        }
      }
    }
    return result;
  }

  public SNode getNodeForLine(String file, int line, SModel model) {
    List<PositionInfo> resultList = ListSequence.fromList(new ArrayList<PositionInfo>());
    for (Set<PositionInfo> val : MapSequence.fromMap(this.myRootToPositions).values()) {
      for (PositionInfo element : val) {
        if (ObjectUtils.equals(element.getFileName(), file) && element.getStartLine() <= line && line <= element.getEndLine()) {
          ListSequence.fromList(resultList).addElement(element);
        }
      }
    }
    if (ListSequence.fromList(resultList).isEmpty()) {
      return null;
    }
    Iterable<PositionInfo> sorted = ListSequence.fromList(resultList).sort(new ISelector<PositionInfo, Comparable<?>>() {
      public Comparable<?> select(PositionInfo it) {
        return it;
      }
    }, true);
    String nodeId = Sequence.fromIterable(sorted).first().getNodeId();
    return model.getNodeById(nodeId);
  }

  public PositionInfo getPositionForNode(String nodeId) {
    for (Set<PositionInfo> val : MapSequence.fromMap(this.myRootToPositions).values()) {
      for (PositionInfo positionInfo : val) {
        if (ObjectUtils.equals(positionInfo.getNodeId(), nodeId)) {
          return positionInfo;
        }
      }
    }
    return null;
  }

  public List<String> getRoots() {
    return SetSequence.fromSet(MapSequence.fromMap(this.myRootToPositions).keySet()).toListSequence();
  }

  public Set<PositionInfo> getPositions(String rootId) {
    return MapSequence.fromMap(this.myRootToPositions).get(rootId);
  }

  public void updateFrom(DebugInfo debugInfo) {
    for (String rootId : debugInfo.getRoots()) {
      Set<PositionInfo> pinfo = MapSequence.fromMap(this.myRootToPositions).get(rootId);
      if (pinfo == null) {
        pinfo = SetSequence.fromSet(new TreeSet<PositionInfo>());
        MapSequence.fromMap(this.myRootToPositions).put(rootId, pinfo);
      }
      SetSequence.fromSet(pinfo).addSequence(SetSequence.fromSet(debugInfo.getPositions(rootId)));
    }
  }

  public SModel getModel() {
    return this.myModel;
  }

  public void setModel(SModel model) {
    this.myModel = model;
  }

  public static DebugInfo fromXml(Element element) {
    Element root = element;
    DebugInfo result = new DebugInfo();
    try {
      for (Element e : ((List<Element>) root.getChildren(NODE_INFO))) {
        result.addPosition(new PositionInfo(e));
      }
      for (Element re : ((List<Element>) root.getChildren(ROOT))) {
        String rootId = re.getAttributeValue(ROOT_ID_ATTR);
        for (Element e : ((List<Element>) re.getChildren(NODE_INFO))) {
          result.addPosition(new PositionInfo(e), rootId);
        }
      }
    } catch (DataConversionException e) {
      throw new RuntimeException(e);
    }
    return result;
  }

  public static IFile getDebugFileOfModel(String outputDir, SModelDescriptor model) {
    String modelName = model.getLongName().replace(".", File.separator);
    String debugPath = modelName.substring(0, modelName.length()) + File.separator + ".debug";
    return FileSystem.getFile(outputDir + File.separator + debugPath);
  }

  public static boolean isNodeSutable(SNode node) {
    return SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
  }
}
