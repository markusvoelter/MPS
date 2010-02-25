package jetbrains.mps.lang.smodel.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.behavior.Node_GetChildrenOperation_Behavior;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class typeof_Node_GetChildrenOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Node_GetChildrenOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation, final TypeCheckingContext typeCheckingContext) {
    SNode linkQualifier = Node_GetChildrenOperation_Behavior.call_getLinkQualifier_3476105411552591984(operation);
    if ((linkQualifier != null)) {
      final SNode qualifierType_typevar_5815925154348901252 = typeCheckingContext.createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = linkQualifier;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "3476105411552568251", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.getEquationManager().getRepresentator(qualifierType_typevar_5815925154348901252), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "3476105411552568255", true), _info_12389875345);
      }
      {
        SNode _nodeToCheck_1029348928467 = operation;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "3476105411552568257", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "3476105411552568259", true), (SNode) new typeof_Node_GetChildrenOperation_InferenceRule.QuotationClass_8551_l523emnf6xbd().createNode(typeCheckingContext.getEquationManager().getRepresentator(qualifierType_typevar_5815925154348901252), typeCheckingContext), _info_12389875345);
      }
    } else {
      {
        SNode _nodeToCheck_1029348928467 = operation;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5815925154348901198", 0, intentionProvider);
        typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.lang.smodel.typesystem)", "5815925154348901195", true), (SNode) new typeof_Node_GetChildrenOperation_InferenceRule.QuotationClass_8551_l523emnf6x8w().createNode(typeCheckingContext), _info_12389875345);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

  public static class QuotationClass_8551_l523emnf6x8w {
    public QuotationClass_8551_l523emnf6x8w() {
    }

    public SNode createNode(final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8551_l523emnf6qfb = null;
      SNode quotedNode_8551_l523emnf6qfc = null;
      {
        quotedNode_8551_l523emnf6qfb = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8551_l523emnf6qfb = quotedNode_8551_l523emnf6qfb;
        {
          quotedNode_8551_l523emnf6qfc = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8551_l523emnf6qfc = quotedNode_8551_l523emnf6qfc;
          quotedNode_8551_l523emnf6qfb.addChild("elementType", quotedNode1_8551_l523emnf6qfc);
        }
        result = quotedNode1_8551_l523emnf6qfb;
      }
      return result;
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8551_l523emnf6qfb = null;
      SNode quotedNode_8551_l523emnf6qfc = null;
      {
        quotedNode_8551_l523emnf6qfb = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8551_l523emnf6qfb = quotedNode_8551_l523emnf6qfb;
        {
          quotedNode_8551_l523emnf6qfc = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SNodeType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_8551_l523emnf6qfc = quotedNode_8551_l523emnf6qfc;
          quotedNode_8551_l523emnf6qfb.addChild("elementType", quotedNode1_8551_l523emnf6qfc);
        }
        result = quotedNode1_8551_l523emnf6qfb;
      }
      return result;
    }
  }

  public static class QuotationClass_8551_l523emnf6xbd {
    public QuotationClass_8551_l523emnf6xbd() {
    }

    public SNode createNode(Object parameter_8551_l523emnf6qgh, final TypeCheckingContext typeCheckingContext) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8551_l523emnf6qfk = null;
      SNode quotedNode_8551_l523emnf6qfl = null;
      {
        quotedNode_8551_l523emnf6qfk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8551_l523emnf6qfk = quotedNode_8551_l523emnf6qfk;
        {
          quotedNode_8551_l523emnf6qfl = (SNode) parameter_8551_l523emnf6qgh;
          SNode quotedNode1_8551_l523emnf6qfl;
          if (_parameterValues_129834374.contains(quotedNode_8551_l523emnf6qfl)) {
            quotedNode1_8551_l523emnf6qfl = CopyUtil.copy(quotedNode_8551_l523emnf6qfl);
          } else {
            _parameterValues_129834374.add(quotedNode_8551_l523emnf6qfl);
            quotedNode1_8551_l523emnf6qfl = quotedNode_8551_l523emnf6qfl;
          }
          if (quotedNode1_8551_l523emnf6qfl != null) {
            quotedNode_8551_l523emnf6qfk.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_8551_l523emnf6qfl, typeCheckingContext));
          }
        }
        result = quotedNode1_8551_l523emnf6qfk;
      }
      return result;
    }

    public SNode createNode(Object parameter_8551_l523emnf6qgh) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_8551_l523emnf6qfk = null;
      SNode quotedNode_8551_l523emnf6qfl = null;
      {
        quotedNode_8551_l523emnf6qfk = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.ListType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_8551_l523emnf6qfk = quotedNode_8551_l523emnf6qfk;
        {
          quotedNode_8551_l523emnf6qfl = (SNode) parameter_8551_l523emnf6qgh;
          SNode quotedNode1_8551_l523emnf6qfl;
          if (_parameterValues_129834374.contains(quotedNode_8551_l523emnf6qfl)) {
            quotedNode1_8551_l523emnf6qfl = CopyUtil.copy(quotedNode_8551_l523emnf6qfl);
          } else {
            _parameterValues_129834374.add(quotedNode_8551_l523emnf6qfl);
            quotedNode1_8551_l523emnf6qfl = quotedNode_8551_l523emnf6qfl;
          }
          if (quotedNode1_8551_l523emnf6qfl != null) {
            quotedNode_8551_l523emnf6qfk.addChild("elementType", HUtil.copyIfNecessary(quotedNode1_8551_l523emnf6qfl));
          }
        }
        result = quotedNode1_8551_l523emnf6qfk;
      }
      return result;
    }
  }
}
