package jetbrains.mps.debug.api.info;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import org.jdom.Element;
import org.jdom.DataConversionException;
import jetbrains.mps.smodel.SModel;

public class ScopePositionInfo extends PositionInfo {
  private static String VAR_INFO = "varInfo";
  protected static Log log = LogFactory.getLog(ScopePositionInfo.class);

  private Map<String, VarInfo> myVars = MapSequence.fromMap(new HashMap<String, VarInfo>());
  private Map<SNode, VarInfo> myTempNodeToVarMap = MapSequence.fromMap(new HashMap<SNode, VarInfo>());

  public ScopePositionInfo() {
  }

  public ScopePositionInfo(Element element) throws DataConversionException {
    super(element);
    for (Object varInfoElement_ : element.getChildren(VAR_INFO)) {
      Element varInfoElement = (Element) varInfoElement_;
      VarInfo varInfo = new VarInfo(varInfoElement);
      MapSequence.fromMap(this.myVars).put(varInfo.getVarName(), varInfo);
    }
  }

  @Override
  public void saveTo(Element element) {
    super.saveTo(element);
    for (VarInfo varInfo : MapSequence.fromMap(this.myVars).values()) {
      Element child = new Element(VAR_INFO);
      varInfo.saveTo(child);
      element.addContent(child);
    }
  }

  public SNode getVarNode(String varName, SModel model) {
    VarInfo varInfo = MapSequence.fromMap(this.myVars).get(varName);
    if (varInfo == null) {
      return null;
    }
    return model.getNodeById(varInfo.getNodeId());
  }

  public void addVarInfo(SNode node) {
    String varName = node.getName();
    if (varName != null) {
      VarInfo varInfo = new VarInfo();
      varInfo.setVarName(node.getName());
      MapSequence.fromMap(this.myTempNodeToVarMap).put(node, varInfo);
      MapSequence.fromMap(this.myVars).put(varInfo.getVarName(), varInfo);
    } else {
      if (log.isWarnEnabled()) {
        log.warn("variable name is null for node " + node.getId());
      }
    }
  }

  public Map<SNode, VarInfo> getTempVarInfoMap() {
    Map<SNode, VarInfo> result = MapSequence.fromMap(new HashMap<SNode, VarInfo>());
    MapSequence.fromMap(result).putAll(this.myTempNodeToVarMap);
    return result;
  }

  public void clearTempVarInfoMap() {
    MapSequence.fromMap(this.myTempNodeToVarMap).clear();
  }

  public void removeVarInfo(VarInfo varInfo) {
    MapSequence.fromMap(this.myVars).removeKey(varInfo.getVarName());
  }
}
