package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.behavior.IMethodLike_Behavior;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.typesystem.inference.IErrorTarget;
import jetbrains.mps.typesystem.inference.NodeErrorTarget;
import jetbrains.mps.nodeEditor.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_BaseMethodDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeOf_BaseMethodDeclaration_InferenceRule() {
  }

  public void applyRule(final SNode bmd, final TypeCheckingContext typeCheckingContext) {
    for (SNode throwsItem : SLinkOperations.getTargets(bmd, "throwsItem", true)) {
      {
        SNode _nodeToCheck_1029348928467 = bmd;
        BaseIntentionProvider intentionProvider = null;
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1215105338790", 0, intentionProvider);
        _info_12389875345.setInequationGroup("default");
        typeCheckingContext.createLessThanInequation((SNode)throwsItem, (SNode)new _Quotations.QuotationClass_76().createNode(typeCheckingContext), false, _info_12389875345);
      }
    }
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    if (SLinkOperations.getTarget(bmd, "body", true) == null) {
      return;
    }
    if (SConceptPropertyOperations.getBoolean(bmd, "abstract")) {
      return;
    }
    if (SNodeOperations.isInstanceOf(bmd, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration") && SPropertyOperations.getBoolean(SNodeOperations.cast(bmd, "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration"), "isAbstract")) {
      return;
    }
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    SNode expectedRetType = IMethodLike_Behavior.call_getExpectedRetType_1239354342632(bmd);
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    Iterable<SNode> returnStatements = RulesFunctions_BaseLanguage.collectReturnStatements(SLinkOperations.getTarget(bmd, "body", true));
    if (expectedRetType == null) {
      /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>       */
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) != null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "no return value expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765152925", intentionProvider, errorTarget);
          }
        }
      }
    } else {
      /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>       */
      for (SNode returnStatement : Sequence.fromIterable(returnStatements)) {
        if ((SLinkOperations.getTarget(returnStatement, "expression", true) == null)) {
          {
            BaseIntentionProvider intentionProvider = null;
            IErrorTarget errorTarget = new NodeErrorTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(returnStatement, "should return value", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765314800", intentionProvider, errorTarget);
          }
        } else {
          SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(returnStatement, "expression", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765405776", true);
          {
            SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(returnStatement, "expression", true);
            BaseIntentionProvider intentionProvider = null;
            EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, "" + expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1185363921400", 0, intentionProvider);
            _info_12389875345.setInequationGroup("default");
            typeCheckingContext.createLessThanInequation((SNode)returnType, (SNode)expectedRetType, false, _info_12389875345);
          }
        }
      }
    }
    /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>     */
    if (expectedRetType != null) {
      /*<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.TextCommentPart'!>       */
      SNode lastStatement = IMethodLike_Behavior.call_getLastStatement_1239354409446(bmd);
      if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
        SNode returnType = typeCheckingContext.typeOf(SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true), "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1178765601477", true);
        {
          SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true);
          BaseIntentionProvider intentionProvider = null;
          EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, expectedRetType + " is expected", "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1185363855090", 0, intentionProvider);
          _info_12389875345.setInequationGroup("default");
          typeCheckingContext.createLessThanInequation((SNode)returnType, (SNode)expectedRetType, false, _info_12389875345);
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
