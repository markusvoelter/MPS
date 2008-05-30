package jetbrains.mps.logging.refactoring.structure;

/*Generated by MPS */

import java.util.LinkedList;
import java.util.List;

public enum RefactoringTargetKind_Enum {
  node("node", null),
  model("model", "model"),
  language("language", "language"),
  solution("solution", "solution"),
  devkit("devkit", "devkit");

  private String myName;
  private String myValue;

  RefactoringTargetKind_Enum(String name, String value) {
    this.myName = name;
    this.myValue = value;
  }

  public static List<RefactoringTargetKind_Enum> getConstants() {
    List<RefactoringTargetKind_Enum> list = new LinkedList<RefactoringTargetKind_Enum>();
    list.add(RefactoringTargetKind_Enum.node);
    list.add(RefactoringTargetKind_Enum.model);
    list.add(RefactoringTargetKind_Enum.language);
    list.add(RefactoringTargetKind_Enum.solution);
    list.add(RefactoringTargetKind_Enum.devkit);
    return list;
  }

  public static RefactoringTargetKind_Enum getDefault() {
    return RefactoringTargetKind_Enum.node;
  }

  public static RefactoringTargetKind_Enum parseValue(String value) {
    if (value == null) {
      return RefactoringTargetKind_Enum.getDefault();
    }
    if (value.equals(RefactoringTargetKind_Enum.node.getValueAsString())) {
      return RefactoringTargetKind_Enum.node;
    }
    if (value.equals(RefactoringTargetKind_Enum.model.getValueAsString())) {
      return RefactoringTargetKind_Enum.model;
    }
    if (value.equals(RefactoringTargetKind_Enum.language.getValueAsString())) {
      return RefactoringTargetKind_Enum.language;
    }
    if (value.equals(RefactoringTargetKind_Enum.solution.getValueAsString())) {
      return RefactoringTargetKind_Enum.solution;
    }
    if (value.equals(RefactoringTargetKind_Enum.devkit.getValueAsString())) {
      return RefactoringTargetKind_Enum.devkit;
    }
    return RefactoringTargetKind_Enum.getDefault();
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
