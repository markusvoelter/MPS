package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Pair;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.behavior.Classifier_Behavior;
import java.util.Map;
import com.intellij.util.containers.HashMap;
import jetbrains.mps.typesystem.inference.TypeContextManager;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.typesystem.inference.TypeChecker;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.typesystem.inference.util.StructuralNodeMap;
import java.util.Set;
import jetbrains.mps.typesystem.inference.SubtypingManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.AuxilaryRuntimeModel;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.Iterator;

public class MethodResolveUtil {
  public MethodResolveUtil() {
  }

  public static List<SNode> selectByParmCount(List<SNode> methods, List<SNode> actualArgs) {
    return selectByParmCountReportNoGoodMethodNode(methods, actualArgs).o1;
  }

  public static Pair<List<SNode>, Boolean> selectByParmCountReportNoGoodMethodNode(List<SNode> methods, List<SNode> actualArgs) {
    int minParmCountDiff = Integer.MAX_VALUE;
    int[] parmCountDiffs = new int[ListSequence.fromList(methods).count()];
    boolean[] varargs = new boolean[ListSequence.fromList(methods).count()];
    int index = 0;
    for (SNode method : methods) {
      int parmCountDiff;
      int count = ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count();
      int actualArgsCount = ListSequence.fromList(actualArgs).count();
      boolean vararg = false;
      if (count > 0 && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).last(), "type", true), "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
        vararg = true;
        parmCountDiff = Math.max(0, (count - 1) - actualArgsCount);
      } else {
        parmCountDiff = Math.abs(count - actualArgsCount);
      }
      varargs[index] = vararg;
      parmCountDiffs[index++] = parmCountDiff;
      minParmCountDiff = Math.min(minParmCountDiff, parmCountDiff);
    }
    boolean good = true;
    List<SNode> result = new ArrayList<SNode>();
    for (int i = 0; i < parmCountDiffs.length; i++) {
      if (minParmCountDiff == parmCountDiffs[i]) {
        SNode method = ListSequence.fromList(methods).getElement(i);
        if (varargs[i]) {
          ListSequence.fromList(result).addElement(method);
        } else {
          ListSequence.fromList(result).insertElement(0, method);
        }
        if (minParmCountDiff > 0) {
          good = false;
          break;
        }
      }
    }
    return new Pair<List<SNode>, Boolean>(result, good);
  }

  public static Pair<List<SNode>, Boolean> selectByVisibilityReportNoGoodMethodNode(List<SNode> methods, SNode methodCall) {
    List<SNode> goodMethods = new ArrayList<SNode>();
    List<SNode> badMethods = new ArrayList<SNode>();
    for (SNode method : methods) {
      if (SNodeOperations.isInstanceOf(method, "jetbrains.mps.baseLanguage.structure.IVisible")) {
        SNode visibility = SLinkOperations.getTarget(SNodeOperations.cast(method, "jetbrains.mps.baseLanguage.structure.IVisible"), "visibility", true);
        if (SNodeOperations.isInstanceOf(visibility, "jetbrains.mps.baseLanguage.structure.PublicVisibility")) {
          goodMethods.add(method);
        } else if (SNodeOperations.isInstanceOf(visibility, "jetbrains.mps.baseLanguage.structure.PrivateVisibility")) {
          if (SNodeOperations.getContainingRoot(methodCall) == SNodeOperations.getContainingRoot(method)) {
            goodMethods.add(method);
          } else {
            badMethods.add(method);
          }
        } else if (SNodeOperations.isInstanceOf(visibility, "jetbrains.mps.baseLanguage.structure.ProtectedVisibility")) {
          if (SNodeOperations.getModel(methodCall) == SNodeOperations.getModel(method)) {
            goodMethods.add(method);
          } else {
            SNode desc = SNodeOperations.getAncestor(methodCall, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
            SNode anc = SNodeOperations.getAncestor(method, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
            if (Classifier_Behavior.call_isDescendant_7165541881557222913(desc, anc)) {
              goodMethods.add(method);
            } else {
              badMethods.add(method);
            }
          }
        } else {
          if (SNodeOperations.getModel(methodCall) == SNodeOperations.getModel(method)) {
            goodMethods.add(method);
          } else {
            badMethods.add(method);
          }
        }
      } else {
        goodMethods.add(method);
      }
    }
    if (goodMethods.isEmpty()) {
      return new Pair<List<SNode>, Boolean>(badMethods, false);
    } else {
      return new Pair<List<SNode>, Boolean>(goodMethods, true);
    }
  }

  public static SNode chooseByParameterType(List<SNode> candidates, List<SNode> actualArgs, Map<SNode, SNode> typeByTypeVar) {
    return MethodResolveUtil.chooseByParameterTypeReportNoGoodMethodNode(candidates, actualArgs, typeByTypeVar).o1;
  }

  public static Pair<SNode, Boolean> chooseByParameterTypeReportNoGoodMethodNode(List<SNode> candidates, List<SNode> actualArgs, Map<SNode, SNode> typeByTypeVar) {
    Map<SNode, SNode> nodesAndTypes = new HashMap<SNode, SNode>();
    int i = 1;
    Boolean good = true;
    for (boolean mostSpecific = false; i <= 2; mostSpecific = !(mostSpecific), i++) {
      int indexOfArg = 0;
      for (SNode actualArg : actualArgs) {
        final SNode term = actualArg;
        SNode typeOfArg;
        if (nodesAndTypes.containsKey(term)) {
          typeOfArg = nodesAndTypes.get(term);
        } else {
          typeOfArg = TypeContextManager.getInstance().runResolveAction(new Computable<SNode>() {
            public SNode compute() {
              return TypeChecker.getInstance().getTypeOf(term);
            }
          });
          nodesAndTypes.put(term, typeOfArg);
        }
        List<SNode> candidates1 = MethodResolveUtil.selectByParameterTypeNode(typeOfArg, indexOfArg, candidates, typeByTypeVar, mostSpecific);
        if (candidates1.isEmpty()) {
          good = false;
          break;
        }
        if (candidates1.size() == 1) {
          return new Pair<SNode, Boolean>(candidates1.get(0), good);
        }
        candidates = candidates1;
        indexOfArg++;
      }
    }
    return new Pair<SNode, Boolean>(ListSequence.fromList(candidates).first(), good);
  }

  private static List<SNode> selectByParameterTypeNode(@Nullable SNode typeOfArg, int indexOfArg, List<SNode> candidates, final Map<SNode, SNode> typeByTypeVar, boolean mostSpecific) {
    List<SNode> result = new ArrayList<SNode>();
    StructuralNodeMap<Set<SNode>> typesOfParamToMethods = new StructuralNodeMap<Set<SNode>>();
    SubtypingManager subtypingManager = TypeChecker.getInstance().getSubtypingManager();
    for (SNode candidate : candidates) {
      boolean varArg = false;
      List<SNode> params = SLinkOperations.getTargets(candidate, "parameter", true);
      SNode type = SLinkOperations.getTarget(ListSequence.fromList(params).last(), "type", true);
      if (SNodeOperations.isInstanceOf(type, "jetbrains.mps.baseLanguage.structure.VariableArityType")) {
        if (ListSequence.fromList(params).count() - 1 <= indexOfArg) {
          varArg = true;
        }
      } else {
        if (ListSequence.fromList(params).count() <= indexOfArg) {
          continue;
        }
      }
      List<SNode> methodTypeVariableDecls = SLinkOperations.getTargets(candidate, "typeVariableDeclaration", true);
      for (SNode tvd : ListSequence.fromList(methodTypeVariableDecls)) {
        typeByTypeVar.put(tvd, SModelOperations.createNewNode(((SModel) AuxilaryRuntimeModel.getDescriptor().getSModel()), "jetbrains.mps.baseLanguage.structure.WildCardType", null));
      }
      SNode typeOfParam = (varArg ?
        SLinkOperations.getTarget(SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.VariableArityType"), "componentType", true) :
        SLinkOperations.getTarget(ListSequence.fromList(params).getElement(indexOfArg), "type", true)
      );
      if ((typeOfParam == null)) {
        continue;
      }
      typeOfParam = GenericTypesUtil.getTypeWithResolvedTypeVars(typeOfParam, typeByTypeVar);
      ListSequence.fromList(methodTypeVariableDecls).visitAll(new IVisitor<SNode>() {
        public void visit(SNode tvd) {
          typeByTypeVar.remove(tvd);
        }
      });
      if (subtypingManager.isSubtype(typeOfArg, typeOfParam)) {
        Set<SNode> methods = typesOfParamToMethods.get(typeOfParam);
        if (methods == null) {
          methods = new HashSet<SNode>();
          typesOfParamToMethods.put(typeOfParam, methods);
        }
        methods.add(candidate);
        result.add(candidate);
      }
    }
    if (mostSpecific) {
      Set<SNode> goodParamTypes = typesOfParamToMethods.keySet();
      Set<SNode> mostSpecificTypes = subtypingManager.mostSpecificTypes(goodParamTypes);
      if (!(mostSpecificTypes.isEmpty())) {
        SNode mostSpecificType = mostSpecificTypes.iterator().next();
        result = new ArrayList<SNode>();
        result.addAll(typesOfParamToMethods.get(mostSpecificType));
      }
    }
    return result;
  }

  public static Map<SNode, SNode> getTypesByTypeVars(SNode classifier, List<SNode> typeParameters) {
    Map<SNode, SNode> typeByTypeVar = MapSequence.fromMap(new java.util.HashMap<SNode, SNode>());
    for (IMapping<TypeVariableDeclaration, Type> elem : MapSequence.fromMap(ClassifierAndSuperClassifiersCache.getInstance(classifier).getTypeByTypeVariableMap())) {
      typeByTypeVar.put(elem.key().getNode(), elem.value().getNode());
    }
    Iterator<SNode> typeParms = ListSequence.fromList(typeParameters).iterator();
    for (SNode typeVar : ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true))) {
      if (!(typeParms.hasNext())) {
        break;
      }
      SNode typeParm = SNodeOperations.as(typeParms.next(), "jetbrains.mps.baseLanguage.structure.Type");
      if ((typeParm == null) || SLinkOperations.getTarget(SNodeOperations.as(typeParm, "jetbrains.mps.baseLanguage.structure.TypeVariableReference"), "typeVariableDeclaration", false) == typeVar) {
        continue;
      }
      MapSequence.fromMap(typeByTypeVar).put(typeVar, SNodeOperations.cast(typeParm, "jetbrains.mps.baseLanguage.structure.Type"));
    }
    return typeByTypeVar;
  }
}
