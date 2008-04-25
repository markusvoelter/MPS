package jetbrains.mps.transformation.test.inputLang.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum Option {
  option_default("option_default", "option_default"),
  option_1("option_1", "option_1"),
  drop_it("drop it", "drop_it");

  /* package */String myName;
  /* package */String myValue;

Option(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<Option> getConstants() {
    List<Option> list = new LinkedList<Option>();
    list.add(Option.option_default);
    list.add(Option.option_1);
    list.add(Option.drop_it);
    return list;
  }

  public static Option getDefault() {
    return Option.option_default;
  }

  public static Option parseValue(String value) {
    if (value == null) {
      return Option.getDefault();
    }
    if (value.equals(Option.option_default.getValueAsString())) {
      return Option.option_default;
    }
    if (value.equals(Option.option_1.getValueAsString())) {
      return Option.option_1;
    }
    if (value.equals(Option.drop_it.getValueAsString())) {
      return Option.drop_it;
    }
    return Option.getDefault();
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
