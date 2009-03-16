package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public enum Cardinality {
  _0__1("0..1", "0..1"),
  _1("1", "1"),
  _0__n("0..n", "0..n"),
  _1__n("1..n", "1..n");

  private String myName;
  private String myValue;

  Cardinality(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<Cardinality> getConstants() {
    List<Cardinality> list = new LinkedList<Cardinality>();
    ListOperations.addElement(list, Cardinality._0__1);
    ListOperations.addElement(list, Cardinality._1);
    ListOperations.addElement(list, Cardinality._0__n);
    ListOperations.addElement(list, Cardinality._1__n);
    return list;
  }

  public static Cardinality getDefault() {
    return Cardinality._0__1;
  }

  public static Cardinality parseValue(String value) {
    if (value == null) {
      return Cardinality.getDefault();
    }
    if (value.equals(Cardinality._0__1.getValueAsString())) {
      return Cardinality._0__1;
    }
    if (value.equals(Cardinality._1.getValueAsString())) {
      return Cardinality._1;
    }
    if (value.equals(Cardinality._0__n.getValueAsString())) {
      return Cardinality._0__n;
    }
    if (value.equals(Cardinality._1__n.getValueAsString())) {
      return Cardinality._1__n;
    }
    return Cardinality.getDefault();
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
