package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import org.xml.sax.helpers.DefaultHandler;
import java.util.Stack;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.util.InternUtil;

public class BLDependenciesHandler extends DefaultHandler {
  private static BLDependenciesHandler.dependenciesRootElementHandler dependenciesRoothandler = new BLDependenciesHandler.dependenciesRootElementHandler();
  private static BLDependenciesHandler.dependencyElementHandler dependencyhandler = new BLDependenciesHandler.dependencyElementHandler();
  private static BLDependenciesHandler.classNodeElementHandler classNodehandler = new BLDependenciesHandler.classNodeElementHandler();

  private Stack<BLDependenciesHandler.ElementHandler> handlers = new Stack<BLDependenciesHandler.ElementHandler>();
  private Stack<Object> values = new Stack<Object>();
  private ModelDependencies result;

  public BLDependenciesHandler() {
  }

  public ModelDependencies getResult() {
    return result;
  }

  @Override
  public void characters(char[] array, int start, int len) throws SAXException {
    BLDependenciesHandler.ElementHandler current = (handlers.empty() ?
      (BLDependenciesHandler.ElementHandler) null :
      handlers.peek()
    );
    if (current != null) {
      current.handleText(values.peek(), new String(array, start, len));
    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    BLDependenciesHandler.ElementHandler current = handlers.pop();
    Object childValue = values.pop();
    if (current != null) {
      current.validate(childValue);
      BLDependenciesHandler.ElementHandler parent = (handlers.empty() ?
        (BLDependenciesHandler.ElementHandler) null :
        handlers.peek()
      );
      if (parent != null) {
        parent.handleChild(values.peek(), qName, childValue);
      } else {
        result = (ModelDependencies) childValue;
      }
    }
  }

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
    BLDependenciesHandler.ElementHandler current = (handlers.empty() ?
      (BLDependenciesHandler.ElementHandler) null :
      handlers.peek()
    );
    if (current == null) {
      // root 
      current = dependenciesRoothandler;
    } else {
      current = current.createChild(qName);
    }
    Object result = current.createObject();

    // check required 
    for (String attr : current.requiredAttributes()) {
      if (attributes.getValue(attr) == null) {
        throw new SAXParseException("attribute " + attr + " is absent", null);
      }
    }

    // handle attributes 
    for (int i = 0; i < attributes.getLength(); i++) {
      String name = attributes.getQName(i);
      String value = attributes.getValue(i);
      current.handleAttribute(result, name, value);
    }
    handlers.push(current);
    values.push(result);
  }

  private static class ElementHandler {
    private static String[] EMPTY_ARRAY = new String[0];

    private ElementHandler() {
    }

    protected Object createObject() {
      return null;
    }

    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
    }

    protected BLDependenciesHandler.ElementHandler createChild(String tagName) throws SAXParseException {
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
      return EMPTY_ARRAY;
    }

    protected void validate(Object resultObject) throws SAXParseException {
    }
  }

  public static class dependenciesRootElementHandler extends BLDependenciesHandler.ElementHandler {
    public dependenciesRootElementHandler() {
    }

    @Override
    protected ModelDependencies createObject() {
      return new ModelDependencies();
    }

    @Override
    protected BLDependenciesHandler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("dependency".equals(tagName)) {
        return BLDependenciesHandler.dependencyhandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      ModelDependencies result = (ModelDependencies) resultObject;
      if ("dependency".equals(tagName)) {
        RootDependencies child = (RootDependencies) value;
        result.addDependencies(child);
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }
  }

  public static class dependencyElementHandler extends BLDependenciesHandler.ElementHandler {
    private static String[] requiredAttributes = new String[]{"className", "file"};

    public dependencyElementHandler() {
    }

    @Override
    protected RootDependencies createObject() {
      return new RootDependencies();
    }

    @Override
    protected String[] requiredAttributes() {
      return requiredAttributes;
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      RootDependencies result = (RootDependencies) resultObject;
      if ("className".equals(name)) {
        result.setClassName(value);
        return;
      }
      if ("file".equals(name)) {
        result.setFileName(value);
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }

    @Override
    protected BLDependenciesHandler.ElementHandler createChild(String tagName) throws SAXParseException {
      if ("classNode".equals(tagName)) {
        return BLDependenciesHandler.classNodehandler;
      }
      return super.createChild(tagName);
    }

    @Override
    protected void handleChild(Object resultObject, String tagName, Object value) throws SAXParseException {
      RootDependencies result = (RootDependencies) resultObject;
      if ("classNode".equals(tagName)) {
        Object[] child = (Object[]) value;
        String s = (String) child[0];
        if (StringUtils.isEmpty(s)) {
          return;
        }
        if ((Boolean) child[1]) {
          result.addExtendsNode(s);
        } else {
          result.addDependNode(s);
        }
        return;
      }
      super.handleChild(resultObject, tagName, value);
    }
  }

  public static class classNodeElementHandler extends BLDependenciesHandler.ElementHandler {
    public classNodeElementHandler() {
    }

    @Override
    protected Object[] createObject() {
      return new Object[2];
    }

    @Override
    protected void handleAttribute(Object resultObject, String name, String value) throws SAXParseException {
      Object[] result = (Object[]) resultObject;
      if ("dependClassName".equals(name)) {
        result[0] = InternUtil.intern(value);
        result[1] = Boolean.FALSE;
        return;
      }
      if ("extendsClassName".equals(name)) {
        result[0] = InternUtil.intern(value);
        result[1] = Boolean.TRUE;
        return;
      }
      super.handleAttribute(resultObject, name, value);
    }
  }
}
