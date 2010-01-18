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

public class supertypesOf_ClassifierType_Queue_QueueType_SubtypingRule extends SubtypingRule_Runtime implements ISubtypingRule_Runtime {
  /*package*/ GeneratedMatchingPattern myMatchingPattern;

  public supertypesOf_ClassifierType_Queue_QueueType_SubtypingRule() {
  }

  public SNode getSubOrSuperType(SNode classQueueType, TypeCheckingContext typeCheckingContext) {
    return new supertypesOf_ClassifierType_Queue_QueueType_SubtypingRule.QuotationClass_3287_0().createNode(((SNode) this.myMatchingPattern.getFieldValue("PatternVar20")), typeCheckingContext);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ClassifierType";
  }

  public boolean isApplicable(SNode argument) {
    this.myMatchingPattern = new _Patterns.Pattern_16();
    return this.myMatchingPattern.match(argument);
  }

  public boolean isWeak() {
    return true;
  }

  public static class QuotationClass_3287_0 {
    public QuotationClass_3287_0() {
    }

    public SNode createNode(Object parameter_3287_0, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_331 = null;
      SNode quotedNode_332 = null;
      {
        quotedNode_331 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.QueueType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_331 = quotedNode_331;
        {
          quotedNode_332 = (SNode) parameter_3287_0;
          SNode quotedNode1_332;
          if (_parameterValues_129834374.contains(quotedNode_332)) {
            quotedNode1_332 = CopyUtil.copy(quotedNode_332);
          } else {
            _parameterValues_129834374.add(quotedNode_332);
            quotedNode1_332 = quotedNode_332;
          }
          if (quotedNode1_332 != null) {
            quotedNode_331.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_332, typeCheckingContext));
          }
        }
        result = quotedNode1_331;
      }
      return result;
    }

    public SNode createNode(Object parameter_3287_0) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_331 = null;
      SNode quotedNode_332 = null;
      {
        quotedNode_331 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.QueueType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_331 = quotedNode_331;
        {
          quotedNode_332 = (SNode) parameter_3287_0;
          SNode quotedNode1_332;
          if (_parameterValues_129834374.contains(quotedNode_332)) {
            quotedNode1_332 = CopyUtil.copy(quotedNode_332);
          } else {
            _parameterValues_129834374.add(quotedNode_332);
            quotedNode1_332 = quotedNode_332;
          }
          if (quotedNode1_332 != null) {
            quotedNode_331.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_332));
          }
        }
        result = quotedNode1_331;
      }
      return result;
    }
  }
}
