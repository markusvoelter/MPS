package jetbrains.mps.ide.components;

import jetbrains.mps.externalResolve.ExternalResolver;
import jetbrains.mps.ide.messages.NodeWithContext;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.CellInfo;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.*;
import org.jdom.DataConversionException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

import java.awt.Rectangle;

/**
 * @author Kostik
 */
public class ComponentsUtil {
  private static final Logger LOG = Logger.getLogger(ComponentsUtil.class);

  public static final String NODE = "node";
  public static final String MODEL = "model";
  public static final String MODULE = "module"; // old
  public static final String MODULE_UID = "module-uid";
  public static final String ID = "id";
  public static final String ERI = "extResolveInfo";
  public static final String RECTANGLE = "rectangle";
  private static final String X = "x";
  private static final String Y = "y";
  private static final String WIDTH = "width";
  private static final String HEIGHT = "height";
  public static final String NUMBER = "number";
  public static final String IS_IN_LIST = "isInList";
  public static final String CELL_INFO = "cellInfo";

  public static Element nodeToElement(SNode node) {
    Element nodeElement = new Element(NODE);
    SModel model = node.getModel();
    nodeElement.setAttribute(MODEL, model.getUID().toString());
    if (model.isExternallyResolvable()) {
      String extResolveInfo = ExternalResolver.getExternalResolveInfoFromTarget(node);
      if (ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
        nodeElement.setAttribute(ID, node.getId());
      } else {
        nodeElement.setAttribute(ERI, extResolveInfo);
      }
    } else {
      nodeElement.setAttribute(ID, node.getId());
    }
    return nodeElement;
  }

  //do not remove it. we need it for cell info
  public static SNode nodeFromElement(Element nodeElement, IScope scope) {
    String modelUID = nodeElement.getAttributeValue(MODEL);
    String id = nodeElement.getAttributeValue(ID);
    String extResolveInfo = nodeElement.getAttributeValue(ERI);
    SModelDescriptor modelDescriptor = scope.getModelDescriptor(SModelUID.fromString(modelUID));
    if (modelDescriptor == null) return null;
    if (!ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
      return modelDescriptor.getSModel().getNodeByExtResolveInfo(extResolveInfo);
    } else {
      return modelDescriptor.getSModel().getNodeById(id);
    }
  }

  public static Element nodeToElement(SNode node, @NotNull IModule module) {
    Element nodeElement = new Element(NODE);
    SModel model = node.getModel();
    nodeElement.setAttribute(MODEL, model.getUID().toString());
    String module_uid = module.getModuleUID();
    nodeElement.setAttribute(MODULE_UID, module_uid);
    if (model.isExternallyResolvable()) {
      String extResolveInfo = ExternalResolver.getExternalResolveInfoFromTarget(node);
      if (ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
        nodeElement.setAttribute(ID, node.getId());
      } else {
        nodeElement.setAttribute(ERI, extResolveInfo);
      }
    } else {
      nodeElement.setAttribute(ID, node.getId());
    }
    return nodeElement;
  }

  public static NodeWithContext nodeFromElement(Element nodeElement, MPSProject project) {
    String modelUID = nodeElement.getAttributeValue(MODEL);
    String id = nodeElement.getAttributeValue(ID);
    String extResolveInfo = nodeElement.getAttributeValue(ERI);

    String moduleUID = nodeElement.getAttributeValue(MODULE_UID);
    if (moduleUID == null) return null;
    IModule module = MPSModuleRepository.getInstance().getModuleByUID(moduleUID);
    if (module == null) return null;
    SModelDescriptor modelDescriptor = module.getScope().getModelDescriptor(SModelUID.fromString(modelUID));
    if (modelDescriptor == null) return null;

    SNode node;
    if (!ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
      node = modelDescriptor.getSModel().getNodeByExtResolveInfo(extResolveInfo);
    } else {
      node = modelDescriptor.getSModel().getNodeById(id);
    }
    return new NodeWithContext(node, new ModuleContext(module, project));
  }

  public static CellInfo cellInfoFromElement(Element cellElement, IScope scope) {
    return new CellInfo(cellElement, scope);
  }

  public static Element cellInfoToElement(CellInfo cellInfo) {
    return cellInfo.marshallCellInfo();
  }

  public static Element rectangleToElement(Rectangle rect) {
    Element result = new Element(RECTANGLE);
    result.setAttribute(X, "" + rect.x);
    result.setAttribute(Y, "" + rect.y);
    result.setAttribute(WIDTH, "" + rect.width);
    result.setAttribute(HEIGHT, "" + rect.height);
    return result;
  }

  public static Rectangle elementToRectangle(Element e) {
    assert e.getName().equals(RECTANGLE);
    try {
      int x = e.getAttribute(X).getIntValue();
      int y = e.getAttribute(Y).getIntValue();
      int w = e.getAttribute(WIDTH).getIntValue();
      int h = e.getAttribute(HEIGHT).getIntValue();
      return new Rectangle(x, y, w, h);
    } catch (DataConversionException e1) {
      LOG.error(e1);
      return null;
    }
  }


}
