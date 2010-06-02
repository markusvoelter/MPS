package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum AlignEnum {
  left("left", "LEFT"),
  right("right", "RIGHT"),
  center("center", "CENTER");

  private String myName;
  private String myValue;

  AlignEnum(String name, String value) {
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

  public static List<AlignEnum> getConstants() {
    List<AlignEnum> list = ListSequence.fromList(new LinkedList<AlignEnum>());
    ListSequence.fromList(list).addElement(AlignEnum.left);
    ListSequence.fromList(list).addElement(AlignEnum.right);
    ListSequence.fromList(list).addElement(AlignEnum.center);
    return list;
  }

  public static AlignEnum getDefault() {
    return AlignEnum.left;
  }

  public static AlignEnum parseValue(String value) {
    if (value == null) {
      return AlignEnum.getDefault();
    }
    if (value.equals(AlignEnum.left.getValueAsString())) {
      return AlignEnum.left;
    }
    if (value.equals(AlignEnum.right.getValueAsString())) {
      return AlignEnum.right;
    }
    if (value.equals(AlignEnum.center.getValueAsString())) {
      return AlignEnum.center;
    }
    return AlignEnum.getDefault();
  }
}
