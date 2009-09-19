package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum _FontStyle_Enum {
  bold("bold", "BOLD"),
  italic("italic", "ITALIC"),
  boldItalic("boldItalic", "BOLD_ITALIC"),
  plain("plain", "PLAIN"),
  query("query", "QUERY");

  private String myName;
  private String myValue;

  _FontStyle_Enum(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }

  public static List<_FontStyle_Enum> getConstants() {
    List<_FontStyle_Enum> list = ListSequence.fromList(new LinkedList<_FontStyle_Enum>());
    ListSequence.fromList(list).addElement(_FontStyle_Enum.bold);
    ListSequence.fromList(list).addElement(_FontStyle_Enum.italic);
    ListSequence.fromList(list).addElement(_FontStyle_Enum.boldItalic);
    ListSequence.fromList(list).addElement(_FontStyle_Enum.plain);
    ListSequence.fromList(list).addElement(_FontStyle_Enum.query);
    return list;
  }

  public static _FontStyle_Enum getDefault() {
    return _FontStyle_Enum.plain;
  }

  public static _FontStyle_Enum parseValue(String value) {
    if (value == null) {
      return _FontStyle_Enum.getDefault();
    }
    if (value.equals(_FontStyle_Enum.bold.getValueAsString())) {
      return _FontStyle_Enum.bold;
    }
    if (value.equals(_FontStyle_Enum.italic.getValueAsString())) {
      return _FontStyle_Enum.italic;
    }
    if (value.equals(_FontStyle_Enum.boldItalic.getValueAsString())) {
      return _FontStyle_Enum.boldItalic;
    }
    if (value.equals(_FontStyle_Enum.plain.getValueAsString())) {
      return _FontStyle_Enum.plain;
    }
    if (value.equals(_FontStyle_Enum.query.getValueAsString())) {
      return _FontStyle_Enum.query;
    }
    return _FontStyle_Enum.getDefault();
  }
}
