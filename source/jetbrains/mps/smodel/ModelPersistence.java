package jetbrains.mps.smodel;

import jetbrains.mps.logging.Logger;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.externalResolve.ExternalResolver;
import jetbrains.mps.util.JDOMUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.baseLanguage.ClassifierType;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


/**
 * Author: Sergey Dmitriev
 * Created Oct 28, 2003
 */
public class ModelPersistence {
  private static final Logger LOG = Logger.getLogger(ModelPersistence.class);

  private static final String TARGET_NODE_ID = "targetNodeId";
  private static final String LINK = "link";
  private static final String ROLE = "role";
  public static final String NAME = "name";
  public static final String NAMESPACE = "namespace";
  public static final String IS_EXTERNALLY_RESOLVED = "externallyResolved";
  public static final String EXT_RESOLVE_INFO = "extResolveInfo";
  public static final String NODE = "node";
  private static final String TYPE = "type";
  public static final String ID = "id";
  public static final String NO_ID = "noId";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String TARGET_CLASS_RESOLVE_INFO = "targetClassResolveInfo";
  public static final String MODEL = "model";
  private static final String PROPERTY = "property";
  private static final String VALUE = "value";
  private static final String IMPORT_ELEMENT = "import";
  private static final String MODEL_IMPORT_INDEX = "index";
  private static final String MAX_IMPORT_INDEX = "maxImportIndex";
  private static final String LANGUAGE = "language";
  private static final String STEREOTYPE = "stereotype";
  private static final String MODEL_UID = "modelUID";


  private static Document loadModelDocument(File file) {
    Document document = null;
    try {
      document = JDOMUtil.loadDocument(file);
    } catch (JDOMException e) {
      LOG.error(e);
    } catch (IOException e) {
      LOG.error(e);
    }
    return document;
  }

  private static Document loadModelDocument(byte[] bytes) {
    Document document = null;
    try {
      document = JDOMUtil.loadDocument(new ByteArrayInputStream(bytes));
    } catch (JDOMException e) {
      LOG.error(e);
    } catch (IOException e) {
      LOG.error(e);
    }
    return document;
  }

  public static SModel readModel(byte[] bytes) {
    Document document = loadModelDocument(bytes);
    return readModel(document, "", "");
  }

  public static SModel readModel(File file) {
    LOG.debug("ModelPersistence readModel from :" + file.getAbsolutePath());

    // the model FQ name ...
    String fileName = file.getName();
    int index = fileName.indexOf('.');
    String rawModelName = (index >= 0) ? fileName.substring(0, index) : fileName;
    String modelName = rawModelName;
    int index1 = rawModelName.indexOf("@");
    String modelStereotype = "";
    if (index1 >= 0) {
      modelName = rawModelName.substring(0, index1);
      modelStereotype = rawModelName.substring(index1 + 1);
    }


    Document document = loadModelDocument(file);

    if (document == null) {
      LOG.debug("Couldn't load model file:" + file.getAbsolutePath());
      return null;
    }

    return readModel(document, modelName, modelStereotype);
  }

  public static SModel copyModel(SModel model) {
    return readModel(saveModel(model), model.getShortName(), model.getStereotype());
  }

  private static SModel readModel(Document document, String modelName, String stereotype) {
    Element rootElement = document.getRootElement();

    String modelLongName = rootElement.getAttributeValue(NAME);

    if (modelLongName == null) {//back compatibility
      String modelNamespace = rootElement.getAttributeValue(NAMESPACE, "");
      modelLongName = NameUtil.longNameFromNamespaceAndShortName(modelNamespace, modelName);
    } else {
      String shortName = NameUtil.shortNameFromLongName(modelLongName);
      LOG.assertLog(shortName.equals(modelName));
    }

    SModel model = new SModel(new SModelUID(modelLongName, stereotype));

    model.setLoading(true);
    try {
      Element maxImportIndex = rootElement.getChild(MAX_IMPORT_INDEX);
      if (maxImportIndex == null) maxImportIndex = rootElement.getChild("maxReferenceID"); // old manner
      model.setMaxImportIndex(readIntAttributeValue(maxImportIndex, VALUE));
    } catch (Throwable e) {
      LOG.error(e);
    }

    // languages
    List languages = rootElement.getChildren(LANGUAGE);
    for (Iterator iterator = languages.iterator(); iterator.hasNext();) {
      Element element = (Element) iterator.next();
      String languageNamespace = element.getAttributeValue(NAMESPACE);
      model.addLanguage(languageNamespace);
    }

    // imports
    Map<Integer, SModelUID> importedUIDtoIndex = new HashMap<Integer, SModelUID>();
    List imports = rootElement.getChildren(IMPORT_ELEMENT);
    for (Iterator iterator = imports.iterator(); iterator.hasNext();) {
      Element element = (Element) iterator.next();
      String indexValue = element.getAttributeValue(MODEL_IMPORT_INDEX, element.getAttributeValue("referenceID"));
      int importIndex = Integer.parseInt(indexValue);
      String importedModelUIDString = element.getAttributeValue(MODEL_UID);
      if (importedModelUIDString == null) {
        // read in old manner...
        String importedModelFQName = NameUtil.longNameFromNamespaceAndShortName(element.getAttributeValue(NAMESPACE),
                element.getAttributeValue(NAME));
        String importedModelStereotype = element.getAttributeValue(STEREOTYPE, "");
        importedModelUIDString = new SModelUID(importedModelFQName, importedModelStereotype).toString();
      }
      if (importedModelUIDString == null) {
        LOG.error("Error loading import element for index " + importIndex + " in " + model.getUID());
        continue;
      }
      if (importIndex > model.getMaxImportIndex()) {
        LOG.warning("Import element " + importIndex + ":" + importedModelUIDString + " greater then max import index (" + model.getMaxImportIndex() + ") in " + model.getUID());
        model.setMaxImportIndex(importIndex);
      }

      SModelUID importedModelUID = SModelUID.fromString(importedModelUIDString);
      model.addImportElement(importedModelUID, importIndex);
      importedUIDtoIndex.put(importIndex, importedModelUID);
    }

    ArrayList<ReferenceDescriptor> referenceDescriptors = new ArrayList<ReferenceDescriptor>();
    List children = rootElement.getChildren(NODE);
    for (Iterator iterator = children.iterator(); iterator.hasNext();) {
      Element element = (Element) iterator.next();
      SNode semanticNode = readNode(element, model, referenceDescriptors);
      model.addRoot(semanticNode);
    }

    for (ReferenceDescriptor referenceDescriptor : referenceDescriptors) {
      SModelUID importedModelUID = model.getUID();
      if (referenceDescriptor.importIndex > -1) {
        importedModelUID = importedUIDtoIndex.get(referenceDescriptor.importIndex);
        if (importedModelUID == null) {
          LOG.error("Couldn't create reference from " + referenceDescriptor.sourceNode.getDebugText() + " : import for index [" + referenceDescriptor.importIndex + "] not found");
          continue;
        }
      }
      SReference reference = SReference.newInstance(referenceDescriptor.role,
              referenceDescriptor.sourceNode,
              referenceDescriptor.targetId,
              referenceDescriptor.extResolveInfo,
              importedModelUID,
              referenceDescriptor.resolveInfo,
              referenceDescriptor.targetClassResolveInfo
      );
      if (reference != null) referenceDescriptor.sourceNode.addSemanticReference(reference);
    }

    model.setLoading(false);
    return model;
  }

  private static SNode readNode(Element nodeElement,
                                SModel semanticModel, List<ReferenceDescriptor> referenceDescriptors) {
    return readNode(nodeElement, semanticModel, referenceDescriptors, true);
  }

  private static SNode readNode(Element nodeElement,
                                SModel model, List<ReferenceDescriptor> referenceDescriptors,
                                boolean setID) {
    String type = nodeElement.getAttributeValue(TYPE);
    SNode node = createNodeInstance(type, model);
    if (node == null) {
      String error = "Error reading model " + model.getUID() + ": couldn't create instance of node id=" + nodeElement.getAttributeValue(ID);
      LOG.errorWithTrace(error);
      firePersisteneceError();
      return null;
    }

    String myOldId = nodeElement.getAttributeValue(ID);
    if (setID) {
      node.setId(myOldId);
    }

    String cachedExtResolveInfo = nodeElement.getAttributeValue(EXT_RESOLVE_INFO);
    if (!ExternalResolver.isEmptyExtResolveInfo(cachedExtResolveInfo)) {
      model.loadCachedNodeExtResolveInfo(node, cachedExtResolveInfo);
    }

    List properties = nodeElement.getChildren(PROPERTY);
    for (Iterator iterator = properties.iterator(); iterator.hasNext();) {
      Element propertyElement = (Element) iterator.next();
      String propertyName = propertyElement.getAttributeValue(NAME);
      String propertyValue = propertyElement.getAttributeValue(VALUE);
      if (propertyValue != null) {
        node.setProperty(propertyName, propertyValue);
      }
    }

    List links = nodeElement.getChildren(LINK);
    for (Iterator iterator = links.iterator(); iterator.hasNext();) {
      Element linkElement = (Element) iterator.next();
      String role = linkElement.getAttributeValue(ROLE);
      String resolveInfo = linkElement.getAttributeValue(RESOLVE_INFO);
      String targetClassResolveInfo = linkElement.getAttributeValue(TARGET_CLASS_RESOLVE_INFO);

      String attExtResolveInfo = linkElement.getAttributeValue(EXT_RESOLVE_INFO);
      String attTargetNodeId = linkElement.getAttributeValue(TARGET_NODE_ID);
      referenceDescriptors.add(new ReferenceDescriptor(node, role, attTargetNodeId, attExtResolveInfo, resolveInfo, targetClassResolveInfo));
    }

    List childNodes = nodeElement.getChildren(NODE);
    for (Iterator iterator = childNodes.iterator(); iterator.hasNext();) {
      Element childNodeElement = (Element) iterator.next();
      String role = childNodeElement.getAttributeValue(ROLE);
      SNode childNode = readNode(childNodeElement, model, referenceDescriptors, setID);
      if (childNode != null) {
        node.addChild(role, childNode);
      } else {
        LOG.errorWithTrace("Error reading child node in node " + node.getDebugText());
        firePersisteneceError();
      }
    }

    return node;
  }


  public static SNode createNodeInstance(String type, SModel model) {
    try {
      Class nodeClass = Class.forName(type, true, ClassLoaderManager.getInstance().getClassLoader());
      Method method = nodeClass.getMethod("newInstance", new Class[]{SModel.class});
      return (SNode) method.invoke(nodeClass, new Object[]{model});
    } catch (ClassNotFoundException e) {
      LOG.warning("Couldn't find class for node type " + type + " in model " + model.getUID());
      if (type.endsWith(".ClassType") || type.endsWith(".InterfaceType")) { // these classes have been removed
        SModelRepository.getInstance().markChanged(model, true);
        return new ClassifierType(model);
      }
      return new SNode(model) {
      }; //this hack is required to make diff work correctly event if no such class
    } catch (NoSuchMethodException e) {
      LOG.error(e);
    } catch (SecurityException e) {
      LOG.error(e);
    } catch (IllegalAccessException e) {
      LOG.error(e);
    } catch (IllegalArgumentException e) {
      LOG.error(e);
    } catch (InvocationTargetException e) {
      LOG.error(e);
    }
    return null;
  }

  public static SModel refreshModel(SModel model) {
    String name = model.getShortName();
    return readModel(saveModel(model), name, model.getStereotype());
  }

  public static void saveModel(SModel sourceModel, File file) {
    LOG.debug("Save model " + sourceModel.getUID() + " to file " + file.getAbsolutePath());
    Document document = saveModel(sourceModel);


    try {
      JDOMUtil.writeDocument(document, file);
    } catch (IOException e) {
      LOG.error(e);
    }
  }

  public static void saveModel(SModel sourceModel, OutputStream output) {
    Document document = saveModel(sourceModel);
    try {
      JDOMUtil.writeDocument(document, output);
      output.close();
    } catch (IOException e) {
      LOG.error(e);
    }
  }

  private static Document saveModel(SModel sourceModel) {
    Element rootElement = new Element(MODEL);

    rootElement.setAttribute(NAME, sourceModel.getLongName());

    Document document = new Document();
    document.setRootElement(rootElement);

    // languages
    for (String languageNamespace : sourceModel.getLanguageNamespaces()) {
      Element languageElem = new Element(LANGUAGE);
      languageElem.setAttribute(NAMESPACE, languageNamespace);
      rootElement.addContent(languageElem);
    }

    // imports
    validateModelImports(sourceModel);
    Element maxRefID = new Element(MAX_IMPORT_INDEX);
    maxRefID.setAttribute(VALUE, "" + sourceModel.getMaxImportIndex());
    rootElement.addContent(maxRefID);

    Iterator<SModel.ImportElement> imports = sourceModel.importElements();
    while (imports.hasNext()) {
      SModel.ImportElement importElement = imports.next();
      Element importElem = new Element(IMPORT_ELEMENT);
      importElem.setAttribute(MODEL_IMPORT_INDEX, "" + importElement.getReferenceID());
      SModelUID modelUID = importElement.getModelUID();
      importElem.setAttribute(MODEL_UID, modelUID.toString());
      rootElement.addContent(importElem);
    }

    Iterator<SNode> iterator = sourceModel.roots();
    while (iterator.hasNext()) {
      SNode semanticNode = iterator.next();
      saveNode(rootElement, semanticNode);
    }

    return document;
  }

  private static void validateModelImports(SModel sourceModel) {
    Set<SModelUID> importedModels = new HashSet<SModelUID>(sourceModel.getImportedModelUIDs());
    Collection<? extends SNode> nodes = sourceModel.getAllNodesWithIds();
    for (SNode node : nodes) {
      List<SReference> references = node.getReferences();
      for (SReference reference : references) {
        if (reference.isExternal()) {
          ExternalReference externalReference = (ExternalReference) reference;
          SModelUID targetModelUID = externalReference.getTargetModelUID();
          if (!importedModels.contains(targetModelUID)) {
            sourceModel.addImportedModel(targetModelUID);
            importedModels.add(targetModelUID);
          }
        }
      }
    }
    importedModels.clear();
  }

  public static void saveNode(Element parentElement, SNode node) {
    Element element = new Element(NODE);
    setNotNullAttribute(element, ROLE, node.getRole_());
    element.setAttribute(TYPE, node.getClass().getName());
    element.setAttribute(ID, node.getId());

    if (node.getModel().isExternallyResolvable()) {
      try {
        String extResolveInfo = ExternalResolver.getExternalResolveInfoFromTarget(node);
        if (!ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
          element.setAttribute(EXT_RESOLVE_INFO, extResolveInfo);
        }
      } catch (Exception e) {
        LOG.error("Failed to save extResolveInfo for node " + node.getDebugText(), e);
      }
    }

    // properties ...
    Map<String, String> properties = node.getProperties();
    Set<String> keys = properties.keySet();
    for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
      String propertyName = iterator.next();
      Element propertyElement = new Element(PROPERTY);
      element.addContent(propertyElement);
      propertyElement.setAttribute(NAME, propertyName);
      setNotNullAttribute(propertyElement, VALUE, node.getProperty(propertyName));
    }

    // references ...
    List<SReference> references = node.getReferences();
    for (Iterator<SReference> iterator = references.iterator(); iterator.hasNext();) {
      SReference reference = iterator.next();
      saveReference(element, node, reference);
    }

    // children ...
    List<SNode> children = node.getChildren();
    for (SNode childNode : children) {
      saveNode(element, childNode);
    }

    parentElement.addContent(element);
  }

  private static void saveReference(Element element, SNode node, SReference reference) {
    Element linkElement = new Element(LINK);
    element.addContent(linkElement);
    linkElement.setAttribute(ROLE, reference.getRole());

    if (reference.isExternal()) {//external reference
      ExternalReference externalReference = (ExternalReference) reference;
      SModelUID targetModelUID = externalReference.getTargetModelUID();
      SModel.ImportElement importElement = node.getModel().getImportElement(targetModelUID);
      int importIndex = -1;
      if (importElement != null) {
        importIndex = importElement.getReferenceID();
      } else {
        LOG.error("Couldn't save reference \"" + externalReference.getRole() + "\" in " + node.getDebugText() +
                "\n -- importz element for model \"" + targetModelUID + "\" not found");
      }

      String extResolveInfo = externalReference.getExtResolveInfo();
      if (ExternalResolver.isEmptyExtResolveInfo(extResolveInfo)) {
        // no external info - save target node id
        linkElement.setAttribute(TARGET_NODE_ID, importIndex + "." + reference.getTargetNodeId());
      } else {
        linkElement.setAttribute(EXT_RESOLVE_INFO, importIndex + "." + extResolveInfo);
      }

    } else {//internal reference
      if (reference.isResolved()) linkElement.setAttribute(TARGET_NODE_ID, reference.getTargetNodeId());
      String resolveInfo = reference.getResolveInfo();
      if (!reference.isResolved() && resolveInfo != null) linkElement.setAttribute(RESOLVE_INFO, resolveInfo);
      String targetClassResolveInfo = reference.getTargetClassResolveInfo();
      if (!reference.isResolved() && targetClassResolveInfo != null) linkElement.setAttribute(TARGET_CLASS_RESOLVE_INFO, targetClassResolveInfo);
    }
  }


  private static void setNotNullAttribute(Element element, String attrName, String attrValue) {
    if (attrValue != null) {
      element.setAttribute(attrName, attrValue);
    }
  }

  private static int readIntAttributeValue(Element element, String attrName) throws NumberFormatException {
    return Integer.parseInt(element.getAttributeValue(attrName));
  }

  private static List<PersistenceErrorListener> ourListeners = new ArrayList<PersistenceErrorListener>();

  public static void addPersistenceListener(PersistenceErrorListener listener) {
    ourListeners.add(listener);
  }

  private static void firePersisteneceError() {
    for (PersistenceErrorListener listener : ourListeners) {
      listener.onError();
    }
  }

  public static interface PersistenceErrorListener {
    void onError();
  }

  private static class ReferenceDescriptor {
    public SNode sourceNode;
    public String role;
    public String targetId;
    public String resolveInfo;
    public String targetClassResolveInfo;
    public String extResolveInfo;
    public int importIndex = -1;

    ReferenceDescriptor(SNode sourceNode, String role, String attTargetNodeId, String attExtResolveInfo, String resolveInfo, String targetClassResolveInfo) {
      this.sourceNode = sourceNode;
      this.role = role;
      if (attTargetNodeId != null) {
        ReferenceTargetDescriptor targetDescriptor = parseAttTargetNodeId(attTargetNodeId);
        this.targetId = targetDescriptor.targetInfo;
        this.importIndex = targetDescriptor.importIndex;
      }

      if (attExtResolveInfo != null) {
        ReferenceTargetDescriptor targetDescriptor = parseAttExtResolveInfo(attExtResolveInfo);
        this.extResolveInfo = targetDescriptor.targetInfo;
        this.importIndex = targetDescriptor.importIndex;
      }
      this.resolveInfo = resolveInfo;
      this.targetClassResolveInfo = targetClassResolveInfo;
    }

    static ReferenceTargetDescriptor parseAttExtResolveInfo(String attExtResolveInfo) {
      return parseAttTargetNodeId(attExtResolveInfo); // same format of string
    }

    static ReferenceTargetDescriptor parseAttTargetNodeId(String attTargetNodeId) {
      ReferenceTargetDescriptor referenceTargetDescriptor = new ReferenceTargetDescriptor();
      int i = attTargetNodeId.indexOf('.');
      if (i > 0) {
        referenceTargetDescriptor.importIndex = Integer.parseInt(attTargetNodeId.substring(0, i));
        referenceTargetDescriptor.targetInfo = attTargetNodeId.substring(i + 1);
      } else {
        referenceTargetDescriptor.importIndex = -1;
        referenceTargetDescriptor.targetInfo = attTargetNodeId;
      }
      return referenceTargetDescriptor;
    }

    private static class ReferenceTargetDescriptor {
      String targetInfo;
      int importIndex;
    }
  } // public static class ReferenceDescriptor
}
