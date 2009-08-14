package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum _NextLine_Enum {
  right("right", null),
  next_line("next-line", "next-line"),
  indented("indented", "indented");

  private String myName;
  private String myValue;

  _NextLine_Enum(String name, String value) {
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


  public static List<_NextLine_Enum> getConstants() {
    List<_NextLine_Enum> list = ListSequence.fromList(new LinkedList<_NextLine_Enum>());
    ListSequence.fromList(list).addElement(_NextLine_Enum.right);
    ListSequence.fromList(list).addElement(_NextLine_Enum.next_line);
    ListSequence.fromList(list).addElement(_NextLine_Enum.indented);
    return list;
  }

  public static _NextLine_Enum getDefault() {
    return _NextLine_Enum.right;
  }

  public static _NextLine_Enum parseValue(String value) {
    if (value == null) {
      return _NextLine_Enum.getDefault();
    }
    if (value.equals(_NextLine_Enum.right.getValueAsString())) {
      return _NextLine_Enum.right;
    }
    if (value.equals(_NextLine_Enum.next_line.getValueAsString())) {
      return _NextLine_Enum.next_line;
    }
    if (value.equals(_NextLine_Enum.indented.getValueAsString())) {
      return _NextLine_Enum.indented;
    }
    return _NextLine_Enum.getDefault();
  }

}
