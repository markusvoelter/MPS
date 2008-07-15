package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum SideTransformTag {
  default_("default_", "default_RTransform"),
  ext_1("ext_1", "ext_1_RTransform"),
  ext_2("ext_2", "ext_2_RTransform"),
  ext_3("ext_3", "ext_3_RTransform"),
  ext_4("ext_4", "ext_4_RTransform"),
  ext_5("ext_5", "ext_5_RTransform");

  private String myName;
  private String myValue;

SideTransformTag(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<SideTransformTag> getConstants() {
    List<SideTransformTag> list = new LinkedList<SideTransformTag>();
    list.add(SideTransformTag.default_);
    list.add(SideTransformTag.ext_1);
    list.add(SideTransformTag.ext_2);
    list.add(SideTransformTag.ext_3);
    list.add(SideTransformTag.ext_4);
    list.add(SideTransformTag.ext_5);
    return list;
  }

  public static SideTransformTag getDefault() {
    return SideTransformTag.default_;
  }

  public static SideTransformTag parseValue(String value) {
    if (value == null) {
      return SideTransformTag.getDefault();
    }
    if (value.equals(SideTransformTag.default_.getValueAsString())) {
      return SideTransformTag.default_;
    }
    if (value.equals(SideTransformTag.ext_1.getValueAsString())) {
      return SideTransformTag.ext_1;
    }
    if (value.equals(SideTransformTag.ext_2.getValueAsString())) {
      return SideTransformTag.ext_2;
    }
    if (value.equals(SideTransformTag.ext_3.getValueAsString())) {
      return SideTransformTag.ext_3;
    }
    if (value.equals(SideTransformTag.ext_4.getValueAsString())) {
      return SideTransformTag.ext_4;
    }
    if (value.equals(SideTransformTag.ext_5.getValueAsString())) {
      return SideTransformTag.ext_5;
    }
    return SideTransformTag.getDefault();
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
