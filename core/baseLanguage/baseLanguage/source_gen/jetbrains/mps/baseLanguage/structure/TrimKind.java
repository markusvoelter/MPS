package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum TrimKind {
  both("both", "both"),
  leading("leading", "leading"),
  trailing("trailing", "trailing");

  private String myName;
  private String myValue;

  TrimKind(String name, String value) {
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


  public static List<TrimKind> getConstants() {
    List<TrimKind> list = ListSequence.fromList(new LinkedList<TrimKind>());
    ListSequence.fromList(list).addElement(TrimKind.both);
    ListSequence.fromList(list).addElement(TrimKind.leading);
    ListSequence.fromList(list).addElement(TrimKind.trailing);
    return list;
  }

  public static TrimKind getDefault() {
    return TrimKind.both;
  }

  public static TrimKind parseValue(String value) {
    if (value == null) {
      return TrimKind.getDefault();
    }
    if (value.equals(TrimKind.both.getValueAsString())) {
      return TrimKind.both;
    }
    if (value.equals(TrimKind.leading.getValueAsString())) {
      return TrimKind.leading;
    }
    if (value.equals(TrimKind.trailing.getValueAsString())) {
      return TrimKind.trailing;
    }
    return TrimKind.getDefault();
  }

}
