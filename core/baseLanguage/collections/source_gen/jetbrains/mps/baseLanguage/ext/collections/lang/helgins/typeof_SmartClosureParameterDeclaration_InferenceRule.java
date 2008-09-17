package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.lang.constraints.SmartClosureParameterTypeUtil;
import jetbrains.mps.closures.constraints.ClassifierTypeUtil;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.helgins.RulesFunctions_BaseLanguage;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SmartClosureParameterDeclaration_InferenceRule implements InferenceRule_Runtime {

  public typeof_SmartClosureParameterDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode scpd) {
    final SNode sampleTypeVar_typevar_1204072172194 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    SmartClosureParameterTypeUtil.equateInputType(scpd, TypeChecker.getInstance().getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194));
    {
      final SNode foo = TypeChecker.getInstance().getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(foo, new Runnable() {

        public void run() {
          if (SmartClosureParameterTypeUtil.hasResolveType(scpd)) {
            final SNode resolveTypeVar_typevar_1204072273983 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
            SmartClosureParameterTypeUtil.equateResolveType(scpd, TypeChecker.getInstance().getEquationManager().getRepresentator(resolveTypeVar_typevar_1204072273983));
            {
              final SNode bar = TypeChecker.getInstance().getEquationManager().getRepresentator(resolveTypeVar_typevar_1204072273983);
              TypeChecker.getInstance().getRuntimeSupport().whenConcrete(bar, new Runnable() {

                public void run() {
                  SNode resType = ClassifierTypeUtil.resolveTypeUsingSupertypes(TypeChecker.getInstance().getEquationManager().getRepresentator(foo), TypeChecker.getInstance().getEquationManager().getRepresentator(bar));
                  {
                    IMatchingPattern pattern_0 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
                    SNode coercedNode_0 = TypeChecker.getInstance().getRuntimeSupport().coerce(resType, pattern_0);
                    if (coercedNode_0 != null) {
                      List<SNode> params = SLinkOperations.getTargets(coercedNode_0, "parameter", true);
                      if (params.size() > 0) {
                        {
                          SNode _nodeToCheck_1029348928467 = scpd;
                          BaseIntentionProvider intentionProvider = null;
                          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(scpd, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072627891", true), params.get(0), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072627885", intentionProvider);
                        }
                      }
                      return;
                    }
                  }
                }

              }, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072289638");
            }
          } else if ((SNodeOperations.getAncestorWhereConceptInList(scpd, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, false, false) != null)) {
            SNode bmc = SNodeOperations.getAncestorWhereConceptInList(scpd, new String[]{"jetbrains.mps.baseLanguage.structure.BaseMethodCall"}, false, false);
            // attempt to resolve type using static method call with type parameters
            // code copied from typeOf_BaseMethodCall
            Map<SNode, List<SNode>> mmap = new HashMap<SNode, List<SNode>>();
            RulesFunctions_BaseLanguage.inference_equateParametersAndReturnType(bmc, SLinkOperations.getTarget(SLinkOperations.getTarget(bmc, "baseMethodDeclaration", false), "returnType", true), mmap);
            RulesFunctions_BaseLanguage.inference_equateMatchingTypeVariables(mmap);
            List<SNode> vars = new ArrayList<SNode>();
            vars.addAll(mmap.keySet());
            List<SNode> actualTypes = new ArrayList<SNode>();
            for(List<SNode> atypes : mmap.values()) {
              actualTypes.add(SNodeOperations.copyNode(atypes.get(0)));
            }
            SNode resType = ClassifierTypeUtil.resolveType(SNodeOperations.copyNode(TypeChecker.getInstance().getEquationManager().getRepresentator(foo)), actualTypes, vars);
            {
              IMatchingPattern pattern_3 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
              SNode coercedNode_3 = TypeChecker.getInstance().getRuntimeSupport().coerce(resType, pattern_3);
              if (coercedNode_3 != null) {
                List<SNode> params = SLinkOperations.getTargets(coercedNode_3, "parameter", true);
                if (params.size() > 0) {
                  {
                    SNode _nodeToCheck_1029348928467 = scpd;
                    BaseIntentionProvider intentionProvider = null;
                    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(scpd, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1210677438644", true), params.get(0), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1210677438638", intentionProvider);
                  }
                }
                return;
              }
            }
          } else
          {
            {
              IMatchingPattern pattern_1 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType");
              SNode coercedNode_1 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194), pattern_1);
              if (coercedNode_1 != null) {
                List<SNode> params = SLinkOperations.getTargets(coercedNode_1, "parameter", true);
                if (params.size() > 0) {
                  {
                    SNode _nodeToCheck_1029348928467 = scpd;
                    BaseIntentionProvider intentionProvider = null;
                    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(scpd, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072411309", true), params.get(0), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072415594", intentionProvider);
                  }
                }
                return;
              }
            }
            {
              IMatchingPattern pattern_2 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceType");
              SNode coercedNode_2 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(sampleTypeVar_typevar_1204072172194), pattern_2);
              if (coercedNode_2 != null) {
                {
                  SNode _nodeToCheck_1029348928467 = scpd;
                  BaseIntentionProvider intentionProvider = null;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(scpd, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072500672", true), SLinkOperations.getTarget(coercedNode_2, "elementType", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072507050", intentionProvider);
                }
                return;
              }
            }
          }
        }

      }, "jetbrains.mps.baseLanguage.ext.collections.lang.helgins", "1204072188615");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SmartClosureParameterDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
