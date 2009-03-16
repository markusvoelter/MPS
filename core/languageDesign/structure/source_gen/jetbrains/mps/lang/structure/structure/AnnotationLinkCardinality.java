package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;
import jetbrains.mps.baseLanguage.collections.internal.query.ListOperations;

public enum AnnotationLinkCardinality {
  _0__1("1", "0..1"),
  _0__n("*", "0..n");

  private String myName;
  private String myValue;

  AnnotationLinkCardinality(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<AnnotationLinkCardinality> getConstants() {
    List<AnnotationLinkCardinality> list = new LinkedList<AnnotationLinkCardinality>();
    ListOperations.addElement(list, AnnotationLinkCardinality._0__1);
    ListOperations.addElement(list, AnnotationLinkCardinality._0__n);
    return list;
  }

  public static AnnotationLinkCardinality getDefault() {
    return AnnotationLinkCardinality._0__1;
  }

  public static AnnotationLinkCardinality parseValue(String value) {
    if (value == null) {
      return AnnotationLinkCardinality.getDefault();
    }
    if (value.equals(AnnotationLinkCardinality._0__1.getValueAsString())) {
      return AnnotationLinkCardinality._0__1;
    }
    if (value.equals(AnnotationLinkCardinality._0__n.getValueAsString())) {
      return AnnotationLinkCardinality._0__n;
    }
    return AnnotationLinkCardinality.getDefault();
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
