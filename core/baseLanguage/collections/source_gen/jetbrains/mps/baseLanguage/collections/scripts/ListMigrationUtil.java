package jetbrains.mps.baseLanguage.collections.scripts;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.apache.commons.lang.ObjectUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;

public class ListMigrationUtil {

  public ListMigrationUtil() {
  }

  public static boolean isApplicableForLists(SNode node, String name, List<ParameterType> params) {
    SNode type = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getParent(node), "operand", true));
    if (!(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.collections.structure.ListType"))) {
      return false;
    }
    return ListMigrationUtil.isApplicableMethod(node, name, params);
  }

  public static boolean isApplicableForSet(SNode node, String name, List<ParameterType> params) {
    SNode type = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getParent(node), "operand", true));
    if (!(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.collections.structure.SetType"))) {
      return false;
    }
    return ListMigrationUtil.isApplicableMethod(node, name, params);
  }

  public static boolean isApplicableForAll(SNode node, String name, List<ParameterType> params) {
    SNode type = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getParent(node), "operand", true));
    if (!(SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.collections.structure.ListType") || SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.collections.structure.SetType"))) {
      return false;
    }
    return ListMigrationUtil.isApplicableMethod(node, name, params);
  }

  private static boolean isApplicableMethod(SNode node, String name, List<ParameterType> params) {
    SNode declaration = SLinkOperations.getTarget(node, "baseMethodDeclaration", false);
    if (!(ObjectUtils.equals(SPropertyOperations.getString(declaration, "name"), name))) {
      return false;
    }
    if (!(ListSequence.fromList(ListSequence.<String>fromArray("List", "ArrayList", "LinkedList", "Set", "HashSet")).contains(SPropertyOperations.getString(SNodeOperations.getParent(declaration), "name")))) {
      return false;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).count() != ListSequence.fromList(params).count()) {
      return false;
    }
    {
      SNode argument;
      ParameterType param;
      Iterator<SNode> argument_iterator = SLinkOperations.getTargets(node, "actualArgument", true).iterator();
      Iterator<ParameterType> param_iterator = params.iterator();
      while (true) {
        if (!(argument_iterator.hasNext())) {
          break;
        }
        if (!(param_iterator.hasNext())) {
          break;
        }
        argument = argument_iterator.next();
        param = param_iterator.next();
        if (param == ParameterType.INT) {
          if (!(SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(argument), "jetbrains.mps.baseLanguage.structure.IntegerType"))) {
            return false;
          }
        }
        if (param == ParameterType.NOT_INT) {
          if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(argument), "jetbrains.mps.baseLanguage.structure.IntegerType")) {
            return false;
          }
        }
      }
    }
    return true;
  }

  public static boolean isApplicableForType(SNode node, int params, List<SNode> classifiers) {
    if (!(ListSequence.fromList(classifiers).contains(SLinkOperations.getTarget(node, "classifier", false)))) {
      return false;
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).count() != params) {
      return false;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.CastExpression")) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.Type")) {
      return true;
    }
    return false;
  }

}
