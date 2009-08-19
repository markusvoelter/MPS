package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.BaseHelginsDescriptor;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.SubtypingRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.ComparisonRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InequationReplacementRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.OverloadedOperationsTypesProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.typesystem.runtime.OverloadedOpsProvider_OneTypeSpecified;
import jetbrains.mps.typesystem.inference.util.IDependency_Runtime;
import jetbrains.mps.typesystem.inference.util.AbstractDependency_Runtime;
import java.util.Set;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.Iterator;

public class TypesystemDescriptor extends BaseHelginsDescriptor {
  public TypesystemDescriptor() {
    {
      InferenceRule_Runtime inferenceRule = new typeOf_andExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_BaseAssignmentExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_Switch_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_TernaryOperator_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_BooleanConst_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ArrayCreatorWithInitializer_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ArrayAccess_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_CastExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_equalsExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_notEqualsExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_thisExpr_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ForeachStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_VariableDeclaration_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_VarRef_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_WhileStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_StringLiteral_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ThrowStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_CatchClause_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_GenericNewExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_NullLiteral_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_BaseMethodDeclaration_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ReturnStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_IfStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ClassifierClassExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_AssertStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_NotExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ParenthesizedExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_OrExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_EnumConstantDeclaration_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_EnumConstantReference_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_InstanceOfExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_IntegerLiteral_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_FloatingPointConstant_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_PlusExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_RemExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_MinusExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_DivExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_MulExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ClosureParameterReference_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ConceptFunctionParameter_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_DoWhileStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeOf_ConceptFunction_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ArrayLiteral_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AnnotationInstanceExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AnnotationInstanceValue_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AnonymousClass_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AnonymousClassCreator_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_DotExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_FieldReferenceOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new check_BreakStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new check_ContinueStatement_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_CharConstant_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_PropertyReference_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_Property_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ValueParameter_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_InstanceMethodCallOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ElsifClause_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ArrayLengthOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ArrayCreator_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_IMethodCall_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_ClassCreator_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_IOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_BinaryBitwiseOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_EnumValuesExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_EnumValueOfExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_NPEEqualsExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_NPENotEqualsExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_BaseStringOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_StringBooleanOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_SubstringExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_TrimOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_BitwiseNotExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_TupleExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_TupleMemberAccessOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_VarVariableReference_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_VarVariableDeclaration_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_BinaryCompareOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AbstractUnaryNumberOperation_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_LongLiteral_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_FloatingPointFloatConstant_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_UnaryMinus_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      InferenceRule_Runtime inferenceRule = new typeof_AsExpression_InferenceRule();
      this.myInferenceRules.add(inferenceRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ClassifierType_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_BaseMethodDeclaration_UnreachableStatements_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ConceptFunctionParameter_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ThisExpression_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ConceptFunction_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_InstanceInitializer_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new checkThrowsOfMethodIsCaught_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new checkThrowedByThrowIsCaught_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_VariableArityType_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_parametersCount_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_StringLiteral_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new typeof_ClassConcept_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_StaticInitializer_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_StringTypeClassifierType_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_AntiquotationContents_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_AbstractMethodsInClass_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_LocalStaticMethodCall_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new NonFinalVariablesInAnonymousClass_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ExpressionStatement_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new FieldIsNeverUsed_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new NonFinalParametersInAnonymousClass_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_EnumConstantHasConstructorDeclaration_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ConstructorInvocationStatementHasConstructor_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_StaticMethodScope_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new checkAbstractClassCreators_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_HasSuperConstructorCall_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new voidArraysAreIllegal_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new CheckBianryOpeartionPriority_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_ThisExpression_ClassConceptSpecified_InGenerator_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_CorrectScope_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      NonTypesystemRule_Runtime nonTypesystemRule = new check_NonStaticInnerClassCreation_NonTypesystemRule();
      this.myNonTypesystemRules.add(nonTypesystemRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new subtyping_classifier_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new boolean_extends_Boolean_1_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new Boolean_extends_boolean_2_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new Boolean_extends_primitive_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new byte_extends_short_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new short_extends_int_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new int_extends_long_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new char_extends_int_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new PrimitiveSubtyping_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new long_extends_integral_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new long_extends_float_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new float_extends_double_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new double_extends_floatingPoint_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new subtyping_arrayType_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new char_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new byte_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new double_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new int_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new float_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new long_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new short_boxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new char_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new double_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new byte_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new float_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new int_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new long_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new short_unboxing_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new ObjectArraySupertypes_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new PrimitiveArraySupertypes_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new anonymousClassExtendsItsClassifier_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new supertypes_of_typeVariableReference_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new wildCard_is_Object_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new java_lang_String_extends_string_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new string_extends_java_lang_String_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      SubtypingRule_Runtime subtypingRule = new Class_Void_weak_supertypeof_void_SubtypingRule();
      this.mySubtypingRules.add(subtypingRule);
    }
    {
      ComparisonRule_Runtime comparisonRule = new interfaces_are_comparable_ComparisonRule();
      this.myComparisonRules.add(comparisonRule);
    }
    {
      ComparisonRule_Runtime comparisonRule = new any_type_comparable_to_wildcard_type_ComparisonRule();
      this.myComparisonRules.add(comparisonRule);
    }
    {
      ComparisonRule_Runtime comparisonRule = new any_type_comparable_with_nulltype_ComparisonRule();
      this.myComparisonRules.add(comparisonRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new any_type_subtypeof_wildcard_type_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new any_type_supertypeof_nulltype_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new subtypesOfUpperBoundType_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new subtypesOfClassifierTypeWWildcards_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new replace_Tuples_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      InequationReplacementRule_Runtime eliminationRule = new any_type_supertypeof_bottom_InequationReplacementRule();
      this.myInequationReplacementRules.add(eliminationRule);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_103().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_104().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.PlusExpression";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          if (SNodeOperations.isInstanceOf(leftOperandType, "jetbrains.mps.baseLanguage.structure.NullType") || SNodeOperations.isInstanceOf(rightOperandType, "jetbrains.mps.baseLanguage.structure.NullType")) {
            return null;
          } else {
            return Queries.getBinaryOperationType(leftOperandType, rightOperandType);
          }
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_106().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_107().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.MinusExpression";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          if (SNodeOperations.isInstanceOf(leftOperandType, "jetbrains.mps.baseLanguage.structure.NullType") || SNodeOperations.isInstanceOf(rightOperandType, "jetbrains.mps.baseLanguage.structure.NullType")) {
            return null;
          } else {
            return Queries.getBinaryOperationType(leftOperandType, rightOperandType);
          }
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_108().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_109().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.DivExpression";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          if (SNodeOperations.isInstanceOf(leftOperandType, "jetbrains.mps.baseLanguage.structure.NullType") || SNodeOperations.isInstanceOf(rightOperandType, "jetbrains.mps.baseLanguage.structure.NullType")) {
            return null;
          } else {
            return Queries.getBinaryOperationType(leftOperandType, rightOperandType);
          }
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_110().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_111().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.MulExpression";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          if (SNodeOperations.isInstanceOf(leftOperandType, "jetbrains.mps.baseLanguage.structure.NullType") || SNodeOperations.isInstanceOf(rightOperandType, "jetbrains.mps.baseLanguage.structure.NullType")) {
            return null;
          } else {
            return Queries.getBinaryOperationType(leftOperandType, rightOperandType);
          }
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_112().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_113().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.BinaryCompareOperation";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          return new _Quotations.QuotationClass_114().createNode();
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_115().createNode(), "descriptor", false);
          this.myRightOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_116().createNode(), "descriptor", false);
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.RemExpression";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          if (SNodeOperations.isInstanceOf(leftOperandType, "jetbrains.mps.baseLanguage.structure.NullType") || SNodeOperations.isInstanceOf(rightOperandType, "jetbrains.mps.baseLanguage.structure.NullType")) {
            return null;
          } else {
            return Queries.getBinaryOperationType(leftOperandType, rightOperandType);
          }
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOperationsTypesProvider provider = new OverloadedOperationsTypesProvider() {
        {
          this.myLeftOperandType = SLinkOperations.getTarget(new _Quotations.QuotationClass_120().createNode(), "descriptor", false);
          this.myRightOperandType = new _Quotations.QuotationClass_121().createNode();
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.UnaryMinus";
          this.myLeftTypeIsExact = false;
          this.myRightTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          return leftOperandType;
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      OverloadedOpsProvider_OneTypeSpecified provider = new OverloadedOpsProvider_OneTypeSpecified() {
        {
          this.myOperandType = new _Quotations.QuotationClass_127().createNode();
          this.myOperationConceptFQName = "jetbrains.mps.baseLanguage.structure.PlusExpression";
          this.myTypeIsExact = false;
        }

        public SNode getOperationType(SNode operation, SNode leftOperandType, SNode rightOperandType) {
          return new _Quotations.QuotationClass_128().createNode();
        }
      };
      this.myOverloadedOperationsTypesProviders.add(provider);
    }
    {
      IDependency_Runtime dependency_Runtime = new AbstractDependency_Runtime() {
        public String getSourceConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.VariableDeclaration";
        }

        public SNode getSourceNode(SNode targetNode) {
          if ("initializer".equals(targetNode.getRole_())) {
            return SNodeOperations.getParent(targetNode);
          }
          return null;
        }

        public String getTargetConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.Expression";
        }
      };
      this.myDependencies.add(dependency_Runtime);
    }
    {
      IDependency_Runtime dependency_Runtime = new AbstractDependency_Runtime() {
        public String getSourceConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.GenericNewExpression";
        }

        public SNode getSourceNode(SNode targetNode) {
          if (targetNode.getRole_().equals("creator")) {
            return SNodeOperations.getParent(targetNode);
          }
          return null;
        }

        public String getTargetConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.AbstractCreator";
        }
      };
      this.myDependencies.add(dependency_Runtime);
    }
    {
      IDependency_Runtime dependency_Runtime = new AbstractDependency_Runtime() {
        public String getSourceConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.Expression";
        }

        public Set<SNode> getSourceNodes(SNode targetNode) {
          SNode instanceMethodDeclaration = SLinkOperations.getTarget(targetNode, "baseMethodDeclaration", false);
          List<SNode> declarations = SLinkOperations.getTargets(instanceMethodDeclaration, "typeVariableDeclaration", true);
          Set<SNode> result = SetSequence.fromSet(new HashSet<SNode>());
          if (ListSequence.fromList(declarations).isNotEmpty()) {
            {
              SNode param;
              SNode arg;
              Iterator<SNode> param_iterator = ListSequence.fromList(SLinkOperations.getTargets(instanceMethodDeclaration, "parameter", true)).iterator();
              Iterator<SNode> arg_iterator = ListSequence.fromList(SLinkOperations.getTargets(targetNode, "actualArgument", true)).iterator();
              while (true) {
                if (!(param_iterator.hasNext())) {
                  break;
                }
                if (!(arg_iterator.hasNext())) {
                  break;
                }
                param = param_iterator.next();
                arg = arg_iterator.next();
                for (SNode tvr : SNodeOperations.getDescendants(SLinkOperations.getTarget(param, "type", true), "jetbrains.mps.baseLanguage.structure.TypeVariableReference", true, new String[]{})) {
                  if (ListSequence.fromList(declarations).contains(SLinkOperations.getTarget(tvr, "typeVariableDeclaration", false))) {
                    SetSequence.fromSet(result).addElement(arg);
                  }
                }
              }
            }
          }
          return result;
        }

        public String getTargetConceptFQName() {
          return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
        }
      };
      this.myDependencies.add(dependency_Runtime);
    }
  }
}
