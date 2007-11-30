package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import java.util.List;
import java.util.LinkedList;

public enum FragmentTypeEnum {
  replace_single("replace single", "REPLACE_SINGLE"),
  replace_selection("replace selection", "REPLACE_SELECTION"),
  replace_all("replace all", "REPLACE_ALL"),
  remove_single("remove single", "REMOVE_SINGLE"),
  remove_selection("remove selection", "REMOVE_SELECTION"),
  remove_all("remove all", "REMOVE_ALL"),
  insert_at_start("insert at start", "INSERT_AT_START"),
  insert_at_end("insert at end", "INSERT_AT_END"),
  insert_before("insert before", "INSERT_BEFORE"),
  insert_after("insert after", "INSERT_AFTER");

  /* package */String myName;
  /* package */String myValue;

 FragmentTypeEnum(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<FragmentTypeEnum> getConstants() {
    List<FragmentTypeEnum> list = new LinkedList<FragmentTypeEnum>();
    list.add(FragmentTypeEnum.replace_single);
    list.add(FragmentTypeEnum.replace_selection);
    list.add(FragmentTypeEnum.replace_all);
    list.add(FragmentTypeEnum.remove_single);
    list.add(FragmentTypeEnum.remove_selection);
    list.add(FragmentTypeEnum.remove_all);
    list.add(FragmentTypeEnum.insert_at_start);
    list.add(FragmentTypeEnum.insert_at_end);
    list.add(FragmentTypeEnum.insert_before);
    list.add(FragmentTypeEnum.insert_after);
    return list;
  }

  public static FragmentTypeEnum getDefault() {
    return FragmentTypeEnum.replace_single;
  }

  public static FragmentTypeEnum parseValue(String value) {
    if(value == null) {
      return FragmentTypeEnum.getDefault();
    }
    if(value.equals(FragmentTypeEnum.replace_single.getValueAsString())) {
      return FragmentTypeEnum.replace_single;
    }
    if(value.equals(FragmentTypeEnum.replace_selection.getValueAsString())) {
      return FragmentTypeEnum.replace_selection;
    }
    if(value.equals(FragmentTypeEnum.replace_all.getValueAsString())) {
      return FragmentTypeEnum.replace_all;
    }
    if(value.equals(FragmentTypeEnum.remove_single.getValueAsString())) {
      return FragmentTypeEnum.remove_single;
    }
    if(value.equals(FragmentTypeEnum.remove_selection.getValueAsString())) {
      return FragmentTypeEnum.remove_selection;
    }
    if(value.equals(FragmentTypeEnum.remove_all.getValueAsString())) {
      return FragmentTypeEnum.remove_all;
    }
    if(value.equals(FragmentTypeEnum.insert_at_start.getValueAsString())) {
      return FragmentTypeEnum.insert_at_start;
    }
    if(value.equals(FragmentTypeEnum.insert_at_end.getValueAsString())) {
      return FragmentTypeEnum.insert_at_end;
    }
    if(value.equals(FragmentTypeEnum.insert_before.getValueAsString())) {
      return FragmentTypeEnum.insert_before;
    }
    if(value.equals(FragmentTypeEnum.insert_after.getValueAsString())) {
      return FragmentTypeEnum.insert_after;
    }
    return FragmentTypeEnum.getDefault();
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
