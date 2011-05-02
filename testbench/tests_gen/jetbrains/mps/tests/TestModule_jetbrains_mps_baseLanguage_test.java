package jetbrains.mps.tests;

/*Generated by MPS */

import jetbrains.mps.testbench.junit.runners.SymbolicSuite;
import org.junit.runner.RunWith;
import jetbrains.mps.testbench.junit.runners.WatchingSuite;

@SymbolicSuite.SuiteClassSymbols(value = {"jetbrains.mps.asTest.AsTest_Test", "jetbrains.mps.editorTest.AnonymousClassTest_Test", "jetbrains.mps.editorTest.AssignmentTest_Test", "jetbrains.mps.editorTest.BadCodeInTheLeftTest_Test", "jetbrains.mps.editorTest.BadCodeTest_Test", "jetbrains.mps.editorTest.EqualsTest_Test", "jetbrains.mps.editorTest.ForEachTest_Test", "jetbrains.mps.editorTest.ForTest_Test", "jetbrains.mps.editorTest.RemoveNodeTest_Test", "jetbrains.mps.editorTest.ReturnNullTest_Test", "jetbrains.mps.editorTest.IfAndElseTest_Test", "jetbrains.mps.editorTest.TwoPlusTwo_Test", "jetbrains.mps.editorTest.SelectTwoCells_Test", "jetbrains.mps.editorTest.IntentionTest_Test", "jetbrains.mps.editorTest.TwoMullTwo_Test", "jetbrains.mps.editorTest.RightTransformInAnnotation_Test", "jetbrains.mps.editorTest.RightTransform_Test", "jetbrains.mps.editorTest.AssignmentExpression_Test", "jetbrains.mps.editorTest.STHintTest_Test", "jetbrains.mps.editorTest.RightTransformWithSmallPatternCompletion_Test", "jetbrains.mps.editorTest.AssigningToField_Test", "jetbrains.mps.editorTest.DeleteStatement_Test", "jetbrains.mps.editorTest.DeleteVariableInitializer_Test", "jetbrains.mps.editorTest.DeleteFieldReference_Test", "jetbrains.mps.editorTest.IntSpaceA_Test", "jetbrains.mps.editorTest.MathE_Test", "jetbrains.mps.editorTest.DeleteFirstChild_Test", "jetbrains.mps.editorTest.DeleteOverridenMethodInBehavior_Test", "jetbrains.mps.editorTest.smartStatementsInsert_Test", "jetbrains.mps.editorTest.SidedeleteAtTheEnd_Test", "jetbrains.mps.editorTest.SidedeleteAtStart_Test", "jetbrains.mps.editorTest.SidedeleteAtStartOfIf_Test", "jetbrains.mps.editorTest.SidedeleteAtEndWithOneStatement_Test", "jetbrains.mps.editorTest.InsertBeforeInIf_Test", "jetbrains.mps.editorTest.PressingEndWithSelectedNode_Test", "jetbrains.mps.editorTest.BracesTest_Test", "jetbrains.mps.editorTest.TypeToTypeof_Test", "jetbrains.mps.editorTest.AnnotationSelection_Test", "jetbrains.mps.editorTest.ActionAtFirstPostionProblem_Test", "jetbrains.mps.editorTest.CompexTransformTest_Test", "jetbrains.mps.editorTest.SideDeleteAtEndWithBackSpace_Test", "jetbrains.mps.editorTest.AssignLeftTransform_Test", "jetbrains.mps.editorTest.DotExpression_Test", "jetbrains.mps.editorTest.LeftTransformOfDotOperation_Test", "jetbrains.mps.editorTest.SurrondByParensesis_Test", "jetbrains.mps.editorTest.ReplacingSelection_Test", "jetbrains.mps.editorTest.Post_ThisSavingClassConceptUnset_Test", "jetbrains.mps.editorTest.Post_ThisSavingClassConceptSet_Test", "jetbrains.mps.editorTest.LT_AssignmentRValue_with_PlusAssignment_Test", "jetbrains.mps.editorTest.Post_ThisSettingClassConcept_Test", "jetbrains.mps.editorTest.AssociativityProblem_Test", "jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Assignment_Test", "jetbrains.mps.editorTest.ReplacePlusWithMinus_Test", "jetbrains.mps.editorTest.PressingBackspaseInFirstPosition_Test", "jetbrains.mps.editorTest.PressingDelInLastPosition_Test", "jetbrains.mps.editorTest.SimpleRedoTest_Test", "jetbrains.mps.editorTest.FieldDeletion_Test", "jetbrains.mps.editorTest.LT_PostfixIncrement_with_Plus_Test", "jetbrains.mps.editorTest.LT_PlusExpression_with_Plus_Test", "jetbrains.mps.editorTest.MovingNode_Test", "jetbrains.mps.editorTest.RT_ClassTypeVarialeDeclaration_with_AngleBracker_Test", "jetbrains.mps.editorTest.RT_ClassTypeVariableDeclaration_with_ampersand_Test", "jetbrains.mps.editorTest.NO_RT_ClassTypeVarialeDeclaration_on_typing_ampersand_inbetween_Test", "jetbrains.mps.editorTest.SubstituteSmallPatternInLeft_Test", "jetbrains.mps.editorTest.TypingIncorrectTextInFields_Test", "jetbrains.mps.editorTest.AddingTypeParameterToConstructor_Test", "jetbrains.mps.editorTest.RestoreRangeSeletion_Test", "jetbrains.mps.editorTest.UndoVariableNameChangeAtOnce_Test", "jetbrains.mps.editorTest.UndoVariableNameCreationAtOnce_Test", "jetbrains.mps.editorTest.UndoSustitutionOfExpressionWithIntContant_Test", "jetbrains.mps.editorTest.SurroundExpressionWithParenthesis_Test", "jetbrains.mps.editorTest.WrappingCellShouldntBeSelectable_Test", "jetbrains.mps.editorTest.SmartReferenseUpdateOnChange_Test", "jetbrains.mps.editorTest.Post_ThisRemovingClassConcept_Test", "jetbrains.mps.editorTest.DeleteIfPossibleMethod_Test", "jetbrains.mps.editorTest.TryingToLeftTransformNewExpression_Test", "jetbrains.mps.editorTest.IntelligentInputWithSubstitutionChooser_Test", "jetbrains.mps.editorTest.NodeAfterSubstitutionHasNoErrorCell_Test", "jetbrains.mps.editorTest.SurrondWithParenthesisTest_Test", "jetbrains.mps.editorTest.PriorityCheckTest_Test", "jetbrains.mps.editorTest.AddingParameterThroughtWrapper_Test", "jetbrains.mps.editorTest.AddingParameterWithEnter_Test", "jetbrains.mps.editorTest.LT_PlusExpression_with_Cast_Test", "jetbrains.mps.editorTest.LT_MapElement_with_Assignment_Test", "jetbrains.mps.editorTest.LT_Assignment_with_PlusAssignment_Test", "jetbrains.mps.editorTest.LT_SNodeTypeCast_with_PlusExpression_Test", "jetbrains.mps.editorTest.RT_toStaticFieldReference_Test", "jetbrains.mps.editorTest.SettingTextToNodeAfterApplingAction_Test", "jetbrains.mps.editorTest.SubstitudeAmbigousActions_Test", "jetbrains.mps.editorTest.CaretInStaticMethodCall_Test", "jetbrains.mps.editorTest.LT_PostfixIncrementExpression_with_PrefixIncrement_Test", "jetbrains.mps.editorTest.LT_PostfixDecrementExpression_with_PrefixDecrement_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_Cast_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_UnaryMinus_Test", "jetbrains.mps.editorTest.InsertBeforeUnaryMinus_Test", "jetbrains.mps.editorTest.RT_Assert_with_colon_Test", "jetbrains.mps.editorTest.EditingNotEditableProperty_Test", "jetbrains.mps.editorTest.RT_AssertBinaryOperation_with_colon_Test", "jetbrains.mps.editorTest.RT_AssertInstanceMethodCallOperation_with_colon_Test", "jetbrains.mps.editorTest.SelectionByShiftArrows_Test", "jetbrains.mps.editorTest.ConflictingRigthTransform_Test", "jetbrains.mps.editorTest.InterWithNonLabelSelected_Test", "jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Plus_Test", "jetbrains.mps.editorTest.TestForNonEmptyProperty_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_MinusAssignment_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_PlusOperation_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_Not_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_Parenthesis_Test", "jetbrains.mps.editorTest.LT_DotExpression_with_PrefixDecrement_Test", "jetbrains.mps.editorTest.DeleteOnSelectedNode_Test", "jetbrains.mps.editorTest.DefaultCellInfoTest_Test", "jetbrains.mps.editorTest.LT_ListElementAccess_with_PlusOperation_Test", "jetbrains.mps.editorTest.RestoringSThintCell_Test", "jetbrains.mps.editorTest.Pre_LocalStaicFieldToStaticFieldReference_Test", "jetbrains.mps.editorTest.PriorityProblem_Test", "jetbrains.mps.editorTest.SimpleUndoTest_Test", "jetbrains.mps.editorTest.StaticBehaviorMethodWithParameters_completion_Test", "jetbrains.mps.editorTest.SubstitutionOfMethodWithNameSimularToStaticMethod_Test", "jetbrains.mps.editorTest.MoveNodeRange_Test", "jetbrains.mps.editorTest.RestoreCellSelection_Test", "jetbrains.mps.editorTest.EnterAfterElseIf_Test", "jetbrains.mps.editorTest.SelectionOfWrappedCell_Test", "jetbrains.mps.editorTest.TestAutoresolve_Test", "jetbrains.mps.editorTest.RT_addTypeVariable_Test", "jetbrains.mps.editorTest.RT_toArray_Test", "jetbrains.mps.editorTest.Post_StaticFieldToLocalStaticFieldReference_Test", "jetbrains.mps.editorTest.ReturnFollowerByVarName_Test", "jetbrains.mps.editorTest.ReturnFollowedBySpaceVarName_Test", "jetbrains.mps.editorTest.DeleteOpenCurlyBrace_Test", "jetbrains.mps.editorTest.DeleteClosingCurlyBrace_Test", "jetbrains.mps.editorTest.EditorCellSomeProblem_Test", "jetbrains.mps.editorTest.LT_PlusExpressionRArgument_with_Mul_Test", "jetbrains.mps.editorTest.LT_MulExpressionRArgument_with_Plus_Test", "jetbrains.mps.editorTest.PerformLeftTransformWithNoLeftTransformActions_Test", "jetbrains.mps.refactoringTest.ChangeMethodParametersForStatement_Test", "jetbrains.mps.refactoringTest.ConceptFunctioParameterTest_Test", "jetbrains.mps.refactoringTest.ConceptMethod_Test", "jetbrains.mps.refactoringTest.ExtractFromAnonymous_Test", "jetbrains.mps.refactoringTest.ExtractFromStatements_Test", "jetbrains.mps.refactoringTest.ExtractMethodFromConstructor_Test", "jetbrains.mps.refactoringTest.FindInputVariables_Test", "jetbrains.mps.refactoringTest.BreakStatement_Test", "jetbrains.mps.refactoringTest.ExtractBreak_Test", "jetbrains.mps.refactoringTest.ExtractContinue_Test", "jetbrains.mps.refactoringTest.ExtractDefaultClassifierMethodDeclaration_Test", "jetbrains.mps.refactoringTest.ExtractFromExpression_Test", "jetbrains.mps.refactoringTest.ExtractFromExpressionWithoutReturn_Test", "jetbrains.mps.refactoringTest.ExtractDifferentReturns_Test", "jetbrains.mps.refactoringTest.ExtractFromStatementWithReturnValue_Test", "jetbrains.mps.refactoringTest.ExtractFromStatementsEndsWithReturn_Test", "jetbrains.mps.refactoringTest.MethodsWithoutReturnStatement_Test", "jetbrains.mps.refactoringTest.OneReturnStatement_Test", "jetbrains.mps.refactoringTest.OneReturnTransformation_Test", "jetbrains.mps.refactoringTest.ReturnStatement_Test", "jetbrains.mps.refactoringTest.ExtractFromIntention_Test", "jetbrains.mps.refactoringTest.staticContainerBehaviorTest_Test", "jetbrains.mps.refactoringTest.staticContainerClassTest_Test", "jetbrains.mps.refactoringTest.AddThrowDeclaration_Test", "jetbrains.mps.refactoringTest.ChangeMethodName_Test", "jetbrains.mps.refactoringTest.ChangeReturningType_Test", "jetbrains.mps.refactoringTest.ChangeSignatureOfStaticMethod_Test", "jetbrains.mps.refactoringTest.AddParameter_Test", "jetbrains.mps.refactoringTest.ChangeParameterName_Test", "jetbrains.mps.refactoringTest.ChangeParameterType_Test", "jetbrains.mps.refactoringTest.ChangeParametersOrder_Test", "jetbrains.mps.refactoringTest.RemoveParameter_Test", "jetbrains.mps.refactoringTest.TwoParametersWithSameType_Test", "jetbrains.mps.refactoringTest.DeclarationVariablesInMethod_Test", "jetbrains.mps.refactoringTest.InlineFromAnotherClass_Test", "jetbrains.mps.refactoringTest.InlineFromExpression_Test", "jetbrains.mps.refactoringTest.InlineRecursiveMethod_Test", "jetbrains.mps.refactoringTest.InlineWithNoSourcesAttached_Test", "jetbrains.mps.refactoringTest.SimpleInlineWithOneReturn_Test", "jetbrains.mps.refactoringTest.InlineFromBehavior_Test", "jetbrains.mps.refactoringTest.InlineFromBehaviorWithMethods_Test", "jetbrains.mps.refactoringTest.InlineInBehaviorWithThis_Test", "jetbrains.mps.refactoringTest.InlineMethodThatChangesParameters_Test", "jetbrains.mps.refactoringTest.InlineModelWithConstants_Test", "jetbrains.mps.refactoringTest.OneReturnWithNotVariableParameters_Test", "jetbrains.mps.refactoringTest.OneReturnWithParameteres_Test", "jetbrains.mps.refactoringTest.CheckStaticVisibility_Test", "jetbrains.mps.refactoringTest.CheckVisibility_Test", "jetbrains.mps.refactoringTest.CheckInlineCanBePerformed_Test", "jetbrains.mps.refactoringTest.CheckInlineWithThrow_Test", "jetbrains.mps.refactoringTest.InlineManyReturns_Test", "jetbrains.mps.refactoringTest.InlineMethodWithReturnAtTheEnd_Test", "jetbrains.mps.refactoringTest.InlineMethodWithVoidType_Test", "jetbrains.mps.refactoringTest.InlineWithVoidTypeAndBug_Test", "jetbrains.mps.refactoringTest.InlineWithoutReturnStatement_Test", "jetbrains.mps.refactoringTest.InlineStaticFromAnotherClass_Test", "jetbrains.mps.refactoringTest.StaticMethod_Test", "jetbrains.mps.refactoringTest.InlineFromConceptFunction_Test", "jetbrains.mps.refactoringTest.InlineLocalVariableReferenceWithoutDeclarationDeleting_Test", "jetbrains.mps.refactoringTest.InlineLocalVariableReferense_Test", "jetbrains.mps.refactoringTest.InlineReferenceWithAssignment_Test", "jetbrains.mps.refactoringTest.InlineWithoutDeclarationDeletion_Test", "jetbrains.mps.refactoringTest.SimpleInlineVariable_Test", "jetbrains.mps.refactoringTest.MoveMethodWithFields_Test", "jetbrains.mps.refactoringTest.MoveMethodWithMethods_Test", "jetbrains.mps.refactoringTest.MoveMethodWithUssages_Test", "jetbrains.mps.refactoringTest.SimpleMoveMethod_Test", "jetbrains.mps.refactoringTest.InlineMethodInTest_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousWithParameterReference_Test", "jetbrains.mps.refactoringTest.FindForMethodWithIVariableLikeNodes_Test", "jetbrains.mps.refactoringTest.SimpleFindForExtractWithReturn_Test", "jetbrains.mps.refactoringTest.IntroduceConstantFromAnonimousClass_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousWithTypeVariablesTest_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousToStaticTest_Test", "jetbrains.mps.refactoringTest.SimpleMoveStaticMethod_Test", "jetbrains.mps.refactoringTest.IntroduceVariableFromAnonimousClass_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousWithLocalVariables_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousWithLocalVariablesTest_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousAbstractClassWithConstructorTest_Test", "jetbrains.mps.refactoringTest.ChangeSigantureOfInterface_Test", "jetbrains.mps.refactoringTest.IntroduceFinalLocalVariable_Test", "jetbrains.mps.refactoringTest.IntroduceFinalField_Test", "jetbrains.mps.refactoringTest.InlineMethodWithUnusedParameters_Test", "jetbrains.mps.refactoringTest.InlineMethodWithConceptFunctionParameters_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousWithTypeVariablesComplexTest_Test", "jetbrains.mps.refactoringTest.MoveMethodWithParameters_Test", "jetbrains.mps.refactoringTest.ExtractMethodFromClosure_Test", "jetbrains.mps.refactoringTest.ExtractAddingNewDeclaration_Test", "jetbrains.mps.refactoringTest.FindForMethodWithOutputVariable_Test", "jetbrains.mps.refactoringTest.InlineAssingmentInClosure_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousInterfaceTest_Test", "jetbrains.mps.refactoringTest.ConvertAnonymousAbstractClassTest_Test", "jetbrains.mps.refactoringTest.IntroduceVariableFromWildcards_Test", "jetbrains.mps.refactoringTest.InlineInsideClosure_Test", "jetbrains.mps.refactoringTest.InlineInClosureWithOutsideAssingment_Test", "jetbrains.mps.refactoringTest.SimpleFindAndMoveForIntroduceLocalVar_Test", "jetbrains.mps.refactoringTest.SimpleFindForIntroduceConstant_Test", "jetbrains.mps.refactoringTest.SimpleFindForIntroduceLocalVariable_Test", "jetbrains.mps.refactoringTest.FindAndMoveFromIfForIntroduceLocalVar_Test", "jetbrains.mps.refactoringTest.SimpleFindForExtractFromManyStatements_Test", "jetbrains.mps.refactoringTest.ExtractMethodWithOutputVaryableFromStatement_Test", "jetbrains.mps.refactoringTest.ReplaceOutputVaryable_Test", "jetbrains.mps.refactoringTest.ExtractMethodWithOutputVaryableFromExpression_Test", "jetbrains.mps.refactoringTest.MoveStaticFieldSimpleTest_Test", "jetbrains.mps.refactoringTest.MoveStaticFieldWithUsageTest_Test", "jetbrains.mps.refactoringTest.SimpleFindForExtractFromExpression_Test", "jetbrains.mps.refactoringTest.SimpleFindForExtractFromStatement_Test", "jetbrains.mps.refactoringTest.ExtractMethodWithThrows_Test", "jetbrains.mps.refactoringTest.InlineAssingmentWithClosures_Test"})
@RunWith(WatchingSuite.class)
public class TestModule_jetbrains_mps_baseLanguage_test {
  public TestModule_jetbrains_mps_baseLanguage_test() {
  }
}
