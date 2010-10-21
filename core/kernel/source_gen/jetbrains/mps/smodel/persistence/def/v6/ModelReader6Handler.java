package jetbrains.mps.smodel.persistence.def.v6;

/*Generated by MPS */

import jetbrains.mps.smodel.persistence.def.DefaultMPSHandler;
import org.xml.sax.helpers.DefaultHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Stack;
import jetbrains.mps.smodel.SModel;
import java.util.Map;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.persistence.def.v5.ModelUtil;
import jetbrains.mps.smodel.persistence.def.v4.VersionUtil;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.DynamicReference;
import jetbrains.mps.smodel.StaticReference;

public class ModelReader6Handler extends DefaultMPSHandler {
  private static String[] EMPTY_ARRAY = new String[0];
  protected static Log log = LogFactory.getLog(ModelReader6Handler.class);

  private ModelReader6Handler.modelElementHandler modelhandler = new ModelReader6Handler.modelElementHandler();
  private ModelReader6Handler.persistenceElementHandler persistencehandler = new ModelReader6Handler.persistenceElementHandler();
  private ModelReader6Handler.maxImportIndexElementHandler maxImportIndexhandler = new ModelReader6Handler.maxImportIndexElementHandler();
  private ModelReader6Handler.tag_with_namespaceElementHandler tag_with_namespacehandler = new ModelReader6Handler.tag_with_namespaceElementHandler();
  private ModelReader6Handler.importElementHandler importhandler = new ModelReader6Handler.importElementHandler();
  private ModelReader6Handler.nodeElementHandler nodehandler = new ModelReader6Handler.nodeElementHandler();
  private ModelReader6Handler.propertyElementHandler propertyhandler = new ModelReader6Handler.propertyElementHandler();
  private ModelReader6Handler.linkElementHandler linkhandler = new ModelReader6Handler.linkElementHandler();
  private Stack<ModelReader6Handler.ElementHandler> handlers = new Stack<ModelReader6Handler.ElementHandler>();
  private Stack<Object> values = new Stack<Object>();
  private SModel result;
  private SModel fieldmodel;
  private Map<Integer, SModel.ImportElement> fieldimports;

  public ModelReader6Handler() {
  }

  public SModel getResult() {
    return result;
  }

  @Override
  public void characters(char[] array, int start, int len) throws SAXException {
    ModelReader6Handler.ElementHandler current = (handlers.empty() ?
      (ModelReader6Handler.ElementHandler) null :
      handlers.peek()
    );
    if (current != null) {
      current.handleText(values.peek(), new String(array, start, len));
    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    ModelReader6Handler.ElementHandler current = handlers.pop();
    Object childValue = values.pop();
    if (current != null) {
      current.validate(childValue);
      ModelReader6Handler.ElementHandler parent = (handlers.empty() ?
        (ModelReader6Handler.ElementHandler) null :
        handlers.peek()
      );
      if (parent != null) {
        parent.handleChild(values.peek(), qName, childValue);
      } else {
        result = (SModel) childValue;
      }
    }
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    ModelReader6Handler.ElementHandler current = (handlers.empty() ?
      (ModelReader6Handler.ElementHandler) null :
      handlers.peek()
    );
    if (current == null) {
      // root 
      current = modelhandler;
    } else {
      current = current.createChild(qName);
    }

    // check required 
    for (String attr : current.requiredAttributes()) {
      if (attributes.getValue(attr) == null) {
        throw new SAXParseException("attribute " + attr + " is absent", null);
      }
    }

    Object result = current.createObject(attributes);

    // handle attributes 
    for (int i = 0; i < attributes.getLength(); i++) {
      String name = attributes.getQName(i);
      String value = attributes.getValue(i);
      current.handleAttribute(result, name, value);
    }
    handlers.push(current);
    values.push(result);
  }

  private class ElementHandler {
    private ElementHandler() {
    }

    protected Object createObject(Attributes attrs) {
      return null;
    }

    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
    }

    protected ModelReader6Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      throw new SAXParseException("unknown tag: " + tagName, null);
    }

    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      throw new SAXParseException("unknown child: " + tagName, null);
    }

    protected void handleText(Object resultObject, String value) throws SAXParseException {
      if (value.trim().length() == 0) {
        return;
      }
      throw new SAXParseException("text is not accepted", null);
    }

    protected String[] requiredAttributes() {
      return ModelReader6Handler.EMPTY_ARRAY;
    }

    protected void validate(Object resultObject) throws SAXParseException {
    }
  }

  public class modelElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"modelUID"};

    public modelElementHandler() {
    }

    @Override
    protected SModel createObject(Attributes attrs) {
      fieldmodel = new SModel(SModelReference.fromString(attrs.getValue("modelUID")));
      fieldmodel.setPersistenceVersion(6);
      fieldmodel.setLoading(true);
      fieldimports = MapSequence.fromMap(new HashMap<Integer, SModel.ImportElement>());
      return fieldmodel;
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      SModel result = (SModel) resultObject;
      if ("modelUID".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader6Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("persistence".equals(tagName)) {
        return persistencehandler;
      }
      if ("language".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("language-engaged-on-generation".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("devkit".equals(tagName)) {
        return tag_with_namespacehandler;
      }
      if ("import".equals(tagName)) {
        return importhandler;
      }
      if ("node".equals(tagName)) {
        return nodehandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      SModel result = (SModel) resultObject;
      if ("persistence".equals(tagName)) {
        return;
      }
      if ("language".equals(tagName)) {
        String child = (String) value;
        result.addLanguage(ModuleReference.fromString(child));
        return;
      }
      if ("language-engaged-on-generation".equals(tagName)) {
        String child = (String) value;
        result.addEngagedOnGenerationLanguage(ModuleReference.fromString(child));
        return;
      }
      if ("devkit".equals(tagName)) {
        String child = (String) value;
        result.addDevKit(ModuleReference.fromString(child));
        return;
      }
      if ("import".equals(tagName)) {
        SModel.ImportElement[] child = (SModel.ImportElement[]) value;
        int ix = child[0].getReferenceID();
        boolean implicit = child[1] != null;
        MapSequence.fromMap(fieldimports).put(ix, child[0]);
        if (ix > result.getMaxImportIndex()) {
          result.setMaxImportIndex(ix);
        }
        if (implicit) {
          result.addAdditionalModelVersion(child[0]);
        } else {
          result.addModelImport(child[0]);
        }
        return;
      }
      if ("node".equals(tagName)) {
        SNode child = (SNode) value;
        if (child != null) {
          result.addRoot(child);
        }
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }

    @Override
    protected void validate(Object resultObject) throws SAXParseException {
      if (!(validateInternal((SModel) resultObject))) {
        throw new SAXParseException("missing tags", null);
      }
    }

    private boolean validateInternal(SModel result) throws SAXParseException {
      result.setLoading(false);
      return true;
    }
  }

  public class persistenceElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"version"};

    public persistenceElementHandler() {
    }

    @Override
    protected Integer createObject(Attributes attrs) {
      return Integer.parseInt(attrs.getValue("version"));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Integer result = (Integer) resultObject;
      if ("version".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class maxImportIndexElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"value"};

    public maxImportIndexElementHandler() {
    }

    @Override
    protected Integer createObject(Attributes attrs) {
      return Integer.parseInt(attrs.getValue("value"));
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Integer result = (Integer) resultObject;
      if ("value".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class tag_with_namespaceElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"namespace"};

    public tag_with_namespaceElementHandler() {
    }

    @Override
    protected String createObject(Attributes attrs) {
      return attrs.getValue("namespace");
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String result = (String) resultObject;
      if ("namespace".equals(name)) {
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class importElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"index", "version", "modelUID"};

    public importElementHandler() {
    }

    @Override
    protected SModel.ImportElement[] createObject(Attributes attrs) {
      int indexValue = Integer.parseInt(attrs.getValue("index"));
      int versionValue = Integer.parseInt(attrs.getValue("version"));
      /*
        new SModel.ImportElement(ModelUtil.upgradeModelUID(SModelReference.fromString(attrs.getValue("modelUID"))), indexValue, versionValue);
      */
      return new SModel.ImportElement[]{new SModel.ImportElement(ModelUtil.upgradeModelUID(SModelReference.fromString(attrs.getValue("modelUID"))), indexValue, versionValue), null};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      SModel.ImportElement[] result = (SModel.ImportElement[]) resultObject;
      if ("index".equals(name)) {
        return;
      }
      if ("version".equals(name)) {
        return;
      }
      if ("modelUID".equals(name)) {
        return;
      }
      if ("implicit".equals(name)) {
        result[1] = new SModel.ImportElement(null, 0);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class nodeElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"type"};

    public nodeElementHandler() {
    }

    @Override
    protected SNode createObject(Attributes attrs) {
      String rawFqName = attrs.getValue("type");
      String conceptFQName = VersionUtil.getConceptFQName(rawFqName);
      return new SNode(fieldmodel, conceptFQName);
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      SNode result = (SNode) resultObject;
      if ("type".equals(name)) {
        return;
      }
      if ("role".equals(name)) {
        result.setRoleInParent(VersionUtil.getRole(value));
        return;
      }
      if ("id".equals(name)) {
        SNodeId id = SNodeId.fromString(value);
        if (id == null) {
          throw new SAXParseException("bad node ID", null);
        }
        result.setId(id);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected ModelReader6Handler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("property".equals(tagName)) {
        return propertyhandler;
      }
      if ("link".equals(tagName)) {
        return linkhandler;
      }
      if ("node".equals(tagName)) {
        return nodehandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      SNode result = (SNode) resultObject;
      if ("property".equals(tagName)) {
        String[] child = (String[]) value;
        if (child[1] != null) {
          result.setProperty(VersionUtil.getBeforeSeparator(child[0]), child[1]);
        }
        return;
      }
      if ("link".equals(tagName)) {
        String[] child = (String[]) value;
        if (child[2] == null) {
          if (log.isErrorEnabled()) {
            log.error("couldn't create reference '" + child[0] + "' : traget node id is null");
          }
          return;
        }
        int i = child[2].indexOf('.');
        String importedModelInfo = (i > 0 ?
          child[2].substring(0, i) :
          "-1"
        );
        String targetId = child[2].substring(i + 1);
        SModelReference importedModelReference = fieldmodel.getSModelReference();
        int ix = -1;
        try {
          ix = Integer.parseInt(importedModelInfo);
        } catch (NumberFormatException e) {
        }
        if (ix > -1) {
          importedModelReference = MapSequence.fromMap(fieldimports).get(ix).getModelReference();
          if (importedModelReference == null) {
            if (log.isErrorEnabled()) {
              log.error("couldn't create reference '" + child[0] + "' : import for index [" + ix + "] not found");
            }
            return;
          }
        }
        SReference ref = (targetId.equals("^") ?
          new DynamicReference(child[0], result, importedModelReference, child[1]) :
          new StaticReference(child[0], result, importedModelReference, SNodeId.fromString(targetId), child[1])
        );
        if (ref != null) {
          result.addReference(ref);
        }
        return;
      }
      if ("node".equals(tagName)) {
        SNode child = (SNode) value;
        result.addChild(child.getRole_(), child);
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }
  }

  public class propertyElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{"name"};

    public propertyElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) {
      return new String[]{attrs.getValue("name"), null};
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String[] result = (String[]) resultObject;
      if ("name".equals(name)) {
        return;
      }
      if ("value".equals(name)) {
        result[1] = value;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }

  public class linkElementHandler extends ModelReader6Handler.ElementHandler {
    private String[] requiredAttributes = new String[]{};

    public linkElementHandler() {
    }

    @Override
    protected String[] createObject(Attributes attrs) {
      return new String[]{null, null, null};
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      String[] result = (String[]) resultObject;
      if ("role".equals(name)) {
        result[0] = VersionUtil.getBeforeSeparator(value);
        return;
      }
      if ("resolveInfo".equals(name)) {
        result[1] = value;
        return;
      }
      if ("targetNodeId".equals(name)) {
        result[2] = VersionUtil.getBeforeSeparator(value);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }
}
