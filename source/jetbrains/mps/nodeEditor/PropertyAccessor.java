package jetbrains.mps.nodeEditor;

import jetbrains.mps.bootstrap.structureLanguage.PropertyDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.PropertySupport;

/**
 * User: Dmitriev.
 * Date: Jan 16, 2004
 */
public class PropertyAccessor implements ModelAccessor {
  private SNode myNode;
  private String myPropertyName;
  private boolean myReadOnly;
  private boolean myAllowEmptyText;
  private PropertyDeclaration myPropertyDeclaration;

  public PropertyAccessor(SNode node, String propertyName, boolean readOnly, boolean allowEmptyText, EditorContext editorContext) {
    myNode = node;
    myPropertyName = propertyName;
    myReadOnly = readOnly || node.getModel().isNotEditable();
    myAllowEmptyText = allowEmptyText;
    myPropertyDeclaration = SModelUtil.getPropertyDeclaration(node, propertyName, editorContext.getOperationContext().getScope());
  }

  public String getPropertyName() {
    return myPropertyName;
  }

  public String getText() {
    String value = myNode.getProperty(myPropertyName);
    return fromInternal(value);
  }

  public void setText(String text) {
    if (!myReadOnly) {
      if (text != null && text.length() == 0) {
        text = null;
      }
      if (isValidText(text)) {
        String propertyValue = toInternal(text);
        myNode.setProperty(myPropertyName, propertyValue);
      }
    }
  }

  public boolean isValidText(String text) {
    if (myReadOnly) {
      String propertyValue = myNode.getProperty(myPropertyName);
      return (text == null && propertyValue == null) || (text != null && text.equals(propertyValue));
    }

    if (text != null && text.length() == 0) {
      text = null;
    }

    if (myPropertyDeclaration != null) {
      PropertySupport propertySupport = PropertySupport.getPropertySupport(myPropertyDeclaration);
      return propertySupport.canSetValue(text);
    }
    return true;
  }

  private String fromInternal(String value) {
    if (myPropertyDeclaration != null) {
      PropertySupport propertySupport = PropertySupport.getPropertySupport(myPropertyDeclaration);
      return propertySupport.fromInternalValue(value);
    }
    return value;
  }

  private String toInternal(String value) {
    if (myPropertyDeclaration != null) {
      PropertySupport propertySupport = PropertySupport.getPropertySupport(myPropertyDeclaration);
      return propertySupport.toInternalValue(value);
    }
    return value;
  }
}
