package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

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

  public static List<TrimKind> getConstants() {
    List<TrimKind> list = new LinkedList<TrimKind>();
    list.add(TrimKind.both);
    list.add(TrimKind.leading);
    list.add(TrimKind.trailing);
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


  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return this.myValue;
  }

  public String getValue() {
    return this.myValue;
  }

}
