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

public class SortedSet_comparableTo_sorted_set_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public SortedSet_comparableTo_sorted_set_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode sortedSet, TypeCheckingContext typeCheckingContext) {
    return new SortedSet_comparableTo_sorted_set_SubtypingRule.QuotationClass_1012_0().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar11")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_9();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_1012_0 {
    public QuotationClass_1012_0() {
    }

    public SNode createNode(Object parameter_1012_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1012_0 = null;
      SNode quotedNode_1012_1 = null;
      {
        quotedNode_1012_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedSetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1012_0 = quotedNode_1012_0;
        {
          quotedNode_1012_1 = (SNode) parameter_1012_0;
          SNode quotedNode1_130;
          if (_parameterValues_129834374.contains(quotedNode_1012_1)) {
            quotedNode1_130 = CopyUtil.copy(quotedNode_1012_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1012_1);
            quotedNode1_130 = quotedNode_1012_1;
          }
          if (quotedNode1_130 != null) {
            quotedNode_1012_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_130, typeCheckingContext));
          }
        }
        result = quotedNode1_1012_0;
      }
      return result;
    }

    public SNode createNode(Object parameter_1012_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1012_0 = null;
      SNode quotedNode_1012_1 = null;
      {
        quotedNode_1012_0 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.SortedSetType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_1012_0 = quotedNode_1012_0;
        {
          quotedNode_1012_1 = (SNode) parameter_1012_0;
          SNode quotedNode1_130;
          if (_parameterValues_129834374.contains(quotedNode_1012_1)) {
            quotedNode1_130 = CopyUtil.copy(quotedNode_1012_1);
          } else {
            _parameterValues_129834374.add(quotedNode_1012_1);
            quotedNode1_130 = quotedNode_1012_1;
          }
          if (quotedNode1_130 != null) {
            quotedNode_1012_0.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_130));
          }
        }
        result = quotedNode1_1012_0;
      }
      return result;
    }
  }
}
