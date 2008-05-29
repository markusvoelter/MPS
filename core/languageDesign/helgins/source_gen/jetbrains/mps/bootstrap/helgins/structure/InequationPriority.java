package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum InequationPriority {
  _0("0", 0),
  _1("1", 1),
  _2("2", 2),
  _3("3", 3),
  inf("inf", 65535);

  /* package */String myName;
  /* package */int myValue;

InequationPriority(String name, int value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<InequationPriority> getConstants() {
    List<InequationPriority> list = new LinkedList<InequationPriority>();
    list.add(InequationPriority._0);
    list.add(InequationPriority._1);
    list.add(InequationPriority._2);
    list.add(InequationPriority._3);
    list.add(InequationPriority.inf);
    return list;
  }

  public static InequationPriority getDefault() {
    return InequationPriority._0;
  }

  public static InequationPriority parseValue(String value) {
    if (value == null) {
      return InequationPriority.getDefault();
    }
    if (value.equals(InequationPriority._0.getValueAsString())) {
      return InequationPriority._0;
    }
    if (value.equals(InequationPriority._1.getValueAsString())) {
      return InequationPriority._1;
    }
    if (value.equals(InequationPriority._2.getValueAsString())) {
      return InequationPriority._2;
    }
    if (value.equals(InequationPriority._3.getValueAsString())) {
      return InequationPriority._3;
    }
    if (value.equals(InequationPriority.inf.getValueAsString())) {
      return InequationPriority.inf;
    }
    return InequationPriority.getDefault();
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

}
