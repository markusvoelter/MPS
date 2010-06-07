package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum SelectPosition {
  before("before", "before"),
  after("after", "after");

  private String myName;
  private String myValue;

  SelectPosition(String name, String value) {
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

  public static List<SelectPosition> getConstants() {
    List<SelectPosition> list = ListSequence.fromList(new LinkedList<SelectPosition>());
    ListSequence.fromList(list).addElement(SelectPosition.before);
    ListSequence.fromList(list).addElement(SelectPosition.after);
    return list;
  }

  public static SelectPosition getDefault() {
    return SelectPosition.before;
  }

  public static SelectPosition parseValue(String value) {
    if (value == null) {
      return SelectPosition.getDefault();
    }
    if (value.equals(SelectPosition.before.getValueAsString())) {
      return SelectPosition.before;
    }
    if (value.equals(SelectPosition.after.getValueAsString())) {
      return SelectPosition.after;
    }
    return SelectPosition.getDefault();
  }
}
