package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum DefaultBaseLineEnum {
  first_cell_baseline("first cell baseline", "FIRST"),
  collection_center("collection center", "CENTER"),
  last_cell_baseline("last cell baseline", "LAST");

  private String myName;
  private String myValue;

  DefaultBaseLineEnum(String name, String value) {
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

  public static List<DefaultBaseLineEnum> getConstants() {
    List<DefaultBaseLineEnum> list = ListSequence.fromList(new LinkedList<DefaultBaseLineEnum>());
    ListSequence.fromList(list).addElement(DefaultBaseLineEnum.first_cell_baseline);
    ListSequence.fromList(list).addElement(DefaultBaseLineEnum.collection_center);
    ListSequence.fromList(list).addElement(DefaultBaseLineEnum.last_cell_baseline);
    return list;
  }

  public static DefaultBaseLineEnum getDefault() {
    return DefaultBaseLineEnum.first_cell_baseline;
  }

  public static DefaultBaseLineEnum parseValue(String value) {
    if (value == null) {
      return DefaultBaseLineEnum.getDefault();
    }
    if (value.equals(DefaultBaseLineEnum.first_cell_baseline.getValueAsString())) {
      return DefaultBaseLineEnum.first_cell_baseline;
    }
    if (value.equals(DefaultBaseLineEnum.collection_center.getValueAsString())) {
      return DefaultBaseLineEnum.collection_center;
    }
    if (value.equals(DefaultBaseLineEnum.last_cell_baseline.getValueAsString())) {
      return DefaultBaseLineEnum.last_cell_baseline;
    }
    return DefaultBaseLineEnum.getDefault();
  }
}
