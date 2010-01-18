package jetbrains.mps.baseLanguage.collections.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ISubtypingRule_Runtime;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class SortedMap_comparableTo_sorted_map_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public SortedMap_comparableTo_sorted_map_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode sortedMap, TypeCheckingContext typeCheckingContext) {
    return new SortedMap_comparableTo_sorted_map_SubtypingRule.QuotationClass_1640_0().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar10")), ((SNode) this.myMatchingPattern.getFieldValue("PatternVar9")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_8();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_1640_0 {
    public QuotationClass_1640_0() {
    }

    public SNode createNode(Object parameter_1640_0, Object parameter_1640_1, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_276 = null;
      SNode quotedNode_277 = null;
      SNode quotedNode_278 = null;
      {
        quotedNode_276 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_276 = quotedNode_276;
        {
          quotedNode_277 = (SNode) parameter_1640_0;
          SNode quotedNode1_277;
          if (_parameterValues_129834374.contains(quotedNode_277)) {
            quotedNode1_277 = CopyUtil.copy(quotedNode_277);
          } else {
            _parameterValues_129834374.add(quotedNode_277);
            quotedNode1_277 = quotedNode_277;
          }
          if (quotedNode1_277 != null) {
            quotedNode_276.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_277, typeCheckingContext));
          }
        }
        {
          quotedNode_278 = (SNode) parameter_1640_1;
          SNode quotedNode1_278;
          if (_parameterValues_129834374.contains(quotedNode_278)) {
            quotedNode1_278 = CopyUtil.copy(quotedNode_278);
          } else {
            _parameterValues_129834374.add(quotedNode_278);
            quotedNode1_278 = quotedNode_278;
          }
          if (quotedNode1_278 != null) {
            quotedNode_276.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_278, typeCheckingContext));
          }
        }
        result = quotedNode1_276;
      }
      return result;
    }

    public SNode createNode(Object parameter_1640_0, Object parameter_1640_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_276 = null;
      SNode quotedNode_277 = null;
      SNode quotedNode_278 = null;
      {
        quotedNode_276 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_276 = quotedNode_276;
        {
          quotedNode_277 = (SNode) parameter_1640_0;
          SNode quotedNode1_277;
          if (_parameterValues_129834374.contains(quotedNode_277)) {
            quotedNode1_277 = CopyUtil.copy(quotedNode_277);
          } else {
            _parameterValues_129834374.add(quotedNode_277);
            quotedNode1_277 = quotedNode_277;
          }
          if (quotedNode1_277 != null) {
            quotedNode_276.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_277));
          }
        }
        {
          quotedNode_278 = (SNode) parameter_1640_1;
          SNode quotedNode1_278;
          if (_parameterValues_129834374.contains(quotedNode_278)) {
            quotedNode1_278 = CopyUtil.copy(quotedNode_278);
          } else {
            _parameterValues_129834374.add(quotedNode_278);
            quotedNode1_278 = quotedNode_278;
          }
          if (quotedNode1_278 != null) {
            quotedNode_276.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_278));
          }
        }
        result = quotedNode1_276;
      }
      return result;
    }
  }
}
