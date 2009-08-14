package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum FocusPolicy {
  noAttraction("noAttraction", 0),
  attractsFocus("attractsFocus", 1),
  firstEditableCell("firstEditableCell", 2),
  attractsRecursively("attractsRecursively", 3);

  private String myName;
  private int myValue;

  FocusPolicy(String name, int value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return "" + this.myValue;
  }

  public int getValue() {
    return this.myValue;
  }


  public static List<FocusPolicy> getConstants() {
    List<FocusPolicy> list = ListSequence.fromList(new LinkedList<FocusPolicy>());
    ListSequence.fromList(list).addElement(FocusPolicy.noAttraction);
    ListSequence.fromList(list).addElement(FocusPolicy.attractsFocus);
    ListSequence.fromList(list).addElement(FocusPolicy.firstEditableCell);
    ListSequence.fromList(list).addElement(FocusPolicy.attractsRecursively);
    return list;
  }

  public static FocusPolicy getDefault() {
    return FocusPolicy.noAttraction;
  }

  public static FocusPolicy parseValue(String value) {
    if (value == null) {
      return FocusPolicy.getDefault();
    }
    if (value.equals(FocusPolicy.noAttraction.getValueAsString())) {
      return FocusPolicy.noAttraction;
    }
    if (value.equals(FocusPolicy.attractsFocus.getValueAsString())) {
      return FocusPolicy.attractsFocus;
    }
    if (value.equals(FocusPolicy.firstEditableCell.getValueAsString())) {
      return FocusPolicy.firstEditableCell;
    }
    if (value.equals(FocusPolicy.attractsRecursively.getValueAsString())) {
      return FocusPolicy.attractsRecursively;
    }
    return FocusPolicy.getDefault();
  }

}
