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
      SNode quotedNode_1640_0 = null;
      SNode quotedNode_1640_1 = null;
      SNode quotedNode_1640_2 = null;
      {
        quotedNode_1640_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1640_0 = quotedNode_1640_0;
        {
          quotedNode_1640_1 = (SNode) parameter_1640_0;
          SNode quotedNode1_126;
          if (_parameterValues_129834374.contains(quotedNode_1640_1)) {
            quotedNode1_126 = CopyUtil.copy(quotedNode_1640_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1640_1);
            quotedNode1_126 = quotedNode_1640_1;
          }
          if (quotedNode1_126 != null) {
            quotedNode_1640_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_126, typeCheckingContext));
          }
        }
        {
          quotedNode_1640_2 = (SNode) parameter_1640_1;
          SNode quotedNode1_127;
          if (_parameterValues_129834374.contains(quotedNode_1640_2)) {
            quotedNode1_127 = CopyUtil.copy(quotedNode_1640_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1640_2);
            quotedNode1_127 = quotedNode_1640_2;
          }
          if (quotedNode1_127 != null) {
            quotedNode_1640_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_127, typeCheckingContext));
          }
        }
        result = quotedNode1_1640_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_1640_0, Object parameter_1640_1) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1640_0 = null;
      SNode quotedNode_1640_1 = null;
      SNode quotedNode_1640_2 = null;
      {
        quotedNode_1640_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedMapType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1640_0 = quotedNode_1640_0;
        {
          quotedNode_1640_1 = (SNode) parameter_1640_0;
          SNode quotedNode1_126;
          if (_parameterValues_129834374.contains(quotedNode_1640_1)) {
            quotedNode1_126 = CopyUtil.copy(quotedNode_1640_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1640_1);
            quotedNode1_126 = quotedNode_1640_1;
          }
          if (quotedNode1_126 != null) {
            quotedNode_1640_0.addChild("valueType", HUtil.copyIfNecessary(quotedNode1_126));
          }
        }
        {
          quotedNode_1640_2 = (SNode) parameter_1640_1;
          SNode quotedNode1_127;
          if (_parameterValues_129834374.contains(quotedNode_1640_2)) {
            quotedNode1_127 = CopyUtil.copy(quotedNode_1640_2);
          } else {
            _parameterValues_129834374.add(quotedNode_1640_2);
            quotedNode1_127 = quotedNode_1640_2;
          }
          if (quotedNode1_127 != null) {
            quotedNode_1640_0.addChild("keyType", HUtil.copyIfNecessary(quotedNode1_127));
          }
        }
        result = quotedNode1_1640_0;
      }
      return result;
    }
  }
}
