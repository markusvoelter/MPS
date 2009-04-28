package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class FieldDeclaration_Behavior {

  public static void init(SNode thisNode) {
    SLinkOperations.setNewChild(thisNode, "visibility", "jetbrains.mps.baseLanguage.structure.PrivateVisibility");
  }

  public static String call_getGetterName_1213877243782(SNode thisNode) {
    String prefix = "get";
    if (TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(thisNode, "type", true), new _Quotations.QuotationClass_3().createNode())) {
      prefix = "is";
    }
    return prefix + NameUtil.capitalize(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_hasGetter_1213877243808(SNode thisNode, SNode classConcept) {
    final SNode fieldDeclaration = thisNode;
    return ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return FieldDeclaration_Behavior.call_isGetter_1213877243833(fieldDeclaration, it);
      }
    }).isNotEmpty();
  }

  public static boolean call_isGetter_1213877243833(SNode thisNode, SNode method) {
    return ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).isEmpty() && FieldDeclaration_Behavior.call_getGetterName_1213877243782(thisNode).equals(SPropertyOperations.getString(method, "name")) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(thisNode, "type", true), SLinkOperations.getTarget(method, "returnType", true));
  }

  public static String call_getSetterName_1213877243861(SNode thisNode) {
    return "set" + NameUtil.capitalize(SPropertyOperations.getString(thisNode, "name"));
  }

  public static boolean call_hasSetter_1213877243871(SNode thisNode, SNode classConcept) {
    final SNode fieldDeclaration = thisNode;
    return ListSequence.fromList(SLinkOperations.getTargets(classConcept, "method", true)).where(new IWhereFilter <SNode>() {

      public boolean accept(SNode it) {
        return FieldDeclaration_Behavior.call_isSetter_1213877243896(fieldDeclaration, it);
      }
    }).isNotEmpty();
  }

  public static boolean call_isSetter_1213877243896(SNode thisNode, SNode method) {
    return ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == 1 && FieldDeclaration_Behavior.call_getSetterName_1213877243861(thisNode).equals(SPropertyOperations.getString(method, "name")) && TypeChecker.getInstance().getSubtypingManager().isSubtype(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).first(), "type", true), SLinkOperations.getTarget(thisNode, "type", true));
  }

  public static boolean virtual_isInitializable_1213877517488(SNode thisNode) {
    return true;
  }

}
