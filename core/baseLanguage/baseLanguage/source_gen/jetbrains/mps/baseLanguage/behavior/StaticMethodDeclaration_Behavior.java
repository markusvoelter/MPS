package jetbrains.mps.baseLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.baseLanguage.behavior._Quotations;

public class StaticMethodDeclaration_Behavior {

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_canBeAnnotated_1233076312117(SNode thisNode) {
    return true;
  }

  public static boolean call_isMainMethod_1213877536670(SNode thisNode) {
    return "main".equals(SPropertyOperations.getString(thisNode, "name")) && ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).count() == 1 && TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "parameter", true)).first()), new _Quotations.QuotationClass_18().createNode(), false);
  }

}
