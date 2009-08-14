package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum _LeftRight_Enum {
  left("left", true),
  right("right", false);

  private String myName;
  private boolean myValue;

  _LeftRight_Enum(String name, boolean value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return "" + this.myValue;
  }

  public boolean getValue() {
    return this.myValue;
  }


  public static List<_LeftRight_Enum> getConstants() {
    List<_LeftRight_Enum> list = ListSequence.fromList(new LinkedList<_LeftRight_Enum>());
    ListSequence.fromList(list).addElement(_LeftRight_Enum.left);
    ListSequence.fromList(list).addElement(_LeftRight_Enum.right);
    return list;
  }

  public static _LeftRight_Enum getDefault() {
    return _LeftRight_Enum.left;
  }

  public static _LeftRight_Enum parseValue(String value) {
    if (value == null) {
      return _LeftRight_Enum.getDefault();
    }
    if (value.equals(_LeftRight_Enum.left.getValueAsString())) {
      return _LeftRight_Enum.left;
    }
    if (value.equals(_LeftRight_Enum.right.getValueAsString())) {
      return _LeftRight_Enum.right;
    }
    return _LeftRight_Enum.getDefault();
  }

}
