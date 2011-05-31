package jetbrains.mps.lang.actions.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.actions.structure.AddMenuPart", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_EditorCell", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_OperationContext", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_childConcept", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_childSetter", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_concept", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_currentTargetNode", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_link", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToCopyPreProcess", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToCopyPreProcessOriginal", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToPastePostProcess", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToPasteWrap", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToWrap", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parameterObject", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parentNode", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_result", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_strictly", "jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_wrapped", "jetbrains.mps.lang.actions.structure.ConceptPart", "jetbrains.mps.lang.actions.structure.ConceptRightTransformPart", "jetbrains.mps.lang.actions.structure.ConceptSubstitutePart", "jetbrains.mps.lang.actions.structure.ConceptsSubstituteMenuPart", "jetbrains.mps.lang.actions.structure.CopyPasteHandlers", "jetbrains.mps.lang.actions.structure.CopyPreProcessFunction", "jetbrains.mps.lang.actions.structure.CopyPreProcessor", "jetbrains.mps.lang.actions.structure.ExecuteSmartActionFunction", "jetbrains.mps.lang.actions.structure.GenerateCodeAction", "jetbrains.mps.lang.actions.structure.GenericSubstituteMenuPart", "jetbrains.mps.lang.actions.structure.GetActionUIFunction", "jetbrains.mps.lang.actions.structure.ISideTransform_String", "jetbrains.mps.lang.actions.structure.ISubstitute_String", "jetbrains.mps.lang.actions.structure.IncludeRightTransformForNodePart", "jetbrains.mps.lang.actions.structure.IsSmartActionApplicableFunction", "jetbrains.mps.lang.actions.structure.MenuBuilderPart", "jetbrains.mps.lang.actions.structure.MenuPart", "jetbrains.mps.lang.actions.structure.NF_Concept_NewInstance", "jetbrains.mps.lang.actions.structure.NF_LinkList_AddNewChildOperation", "jetbrains.mps.lang.actions.structure.NF_Link_SetNewChildOperation", "jetbrains.mps.lang.actions.structure.NF_Model_CreateNewNodeOperation", "jetbrains.mps.lang.actions.structure.NF_Model_CreateNewRootNodeOperation", "jetbrains.mps.lang.actions.structure.NF_Node_InsertNewNextSiblingOperation", "jetbrains.mps.lang.actions.structure.NF_Node_InsertNewPrevSiblingOperation", "jetbrains.mps.lang.actions.structure.NF_Node_ReplaceWithNewOperation", "jetbrains.mps.lang.actions.structure.NodeFactories", "jetbrains.mps.lang.actions.structure.NodeFactory", "jetbrains.mps.lang.actions.structure.NodeSetupFunction", "jetbrains.mps.lang.actions.structure.NodeSetupFunction_EnclosingNode", "jetbrains.mps.lang.actions.structure.NodeSetupFunction_NewNode", "jetbrains.mps.lang.actions.structure.NodeSetupFunction_SampleNode", "jetbrains.mps.lang.actions.structure.NodeSubstituteActions", "jetbrains.mps.lang.actions.structure.NodeSubstituteActionsBuilder", "jetbrains.mps.lang.actions.structure.NodeSubstitutePreconditionFunction", "jetbrains.mps.lang.actions.structure.ParameterizedSideTransformMenuPart", "jetbrains.mps.lang.actions.structure.ParameterizedSubstituteMenuPart", "jetbrains.mps.lang.actions.structure.PastePostProcessFunction", "jetbrains.mps.lang.actions.structure.PastePostProcessor", "jetbrains.mps.lang.actions.structure.PasteWrapper", "jetbrains.mps.lang.actions.structure.PasteWrappers", "jetbrains.mps.lang.actions.structure.QueryFunction_ActionType", "jetbrains.mps.lang.actions.structure.QueryFunction_CanSubstitute", "jetbrains.mps.lang.actions.structure.QueryFunction_GenericSubstituteMenuPart", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSideTransform_Handler", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSideTransform_Query", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Handler", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Icon", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Query", "jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_String", "jetbrains.mps.lang.actions.structure.QueryFunction_PasteWrapper", "jetbrains.mps.lang.actions.structure.QueryFunction_RemoveBy_Condition", "jetbrains.mps.lang.actions.structure.QueryFunction_ReturnSmallPart", "jetbrains.mps.lang.actions.structure.QueryFunction_STVariableInitializer", "jetbrains.mps.lang.actions.structure.QueryFunction_ST_CommonInitializer", "jetbrains.mps.lang.actions.structure.QueryFunction_ST_RemoveBy_Condition", "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_ConceptHandler", "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Handler", "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Icon", "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_NodeQuery", "jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_String", "jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteIcon", "jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteString", "jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteVariableInitializer", "jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteWrapper", "jetbrains.mps.lang.actions.structure.QueryFunction_Substitute_CommonInitializer", "jetbrains.mps.lang.actions.structure.QueryFunction_Substitute_Handler", "jetbrains.mps.lang.actions.structure.RemoveByConditionPart", "jetbrains.mps.lang.actions.structure.RemoveDefaultsPart", "jetbrains.mps.lang.actions.structure.RemovePart", "jetbrains.mps.lang.actions.structure.RemoveSTByConditionPart", "jetbrains.mps.lang.actions.structure.SNodeCreatorAndInitializer", "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions", "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder", "jetbrains.mps.lang.actions.structure.SideTransformHintSubstitutePreconditionFunction", "jetbrains.mps.lang.actions.structure.SideTransformMenuPart", "jetbrains.mps.lang.actions.structure.SideTransformVariableDeclaration", "jetbrains.mps.lang.actions.structure.SideTransformVariableReference", "jetbrains.mps.lang.actions.structure.SideTransform_SimpleString", "jetbrains.mps.lang.actions.structure.SimpleItemSubstitutePart", "jetbrains.mps.lang.actions.structure.SimpleSideTransformMenuPart", "jetbrains.mps.lang.actions.structure.SmartActionParameter", "jetbrains.mps.lang.actions.structure.SmartActionParameterReference", "jetbrains.mps.lang.actions.structure.SmartEditorActions", "jetbrains.mps.lang.actions.structure.SubstituteMenuPart", "jetbrains.mps.lang.actions.structure.SubstituteNodeBuilderVariableDeclaration", "jetbrains.mps.lang.actions.structure.SubstituteNodeBuilderVariableReference", "jetbrains.mps.lang.actions.structure.Substitute_SimpleString", "jetbrains.mps.lang.actions.structure.SurroundWithAction", "jetbrains.mps.lang.actions.structure.WrapperSubstituteMenuPart"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 51:
        return new DataHolderConstraintsDescriptor(new NodeSubstituteActions_Constraints());
      case 52:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSubstituteActionsBuilder"));
      case 92:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder"));
      case 91:
        return new DataHolderConstraintsDescriptor(new SideTransformHintSubstituteActions_Constraints());
      case 53:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSubstitutePreconditionFunction"));
      case 14:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parentNode"));
      case 93:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SideTransformHintSubstitutePreconditionFunction"));
      case 45:
        return new DataHolderConstraintsDescriptor(new NodeFactories_Constraints());
      case 46:
        return new DataHolderConstraintsDescriptor(new NodeFactory_Constraints());
      case 47:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSetupFunction"));
      case 49:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSetupFunction_NewNode"));
      case 50:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSetupFunction_SampleNode"));
      case 48:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NodeSetupFunction_EnclosingNode"));
      case 35:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.MenuBuilderPart"));
      case 103:
        return new DataHolderConstraintsDescriptor(new SubstituteMenuPart_Constraints());
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.AddMenuPart"));
      case 61:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_CanSubstitute"));
      case 15:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_pattern"));
      case 85:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_Substitute_Handler"));
      case 98:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SimpleItemSubstitutePart"));
      case 20:
        return new DataHolderConstraintsDescriptor(new ConceptPart_Constraints());
      case 81:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteString"));
      case 55:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ParameterizedSubstituteMenuPart"));
      case 13:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_parameterObject"));
      case 67:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Query"));
      case 68:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_String"));
      case 65:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Handler"));
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptsSubstituteMenuPart"));
      case 108:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.WrapperSubstituteMenuPart"));
      case 83:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteWrapper"));
      case 12:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToWrap"));
      case 88:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.RemovePart"));
      case 86:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.RemoveByConditionPart"));
      case 70:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_RemoveBy_Condition"));
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_concept"));
      case 36:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.MenuPart"));
      case 94:
        return new DataHolderConstraintsDescriptor(new SideTransformMenuPart_Constraints());
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_sourceNode"));
      case 99:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SimpleSideTransformMenuPart"));
      case 79:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_String"));
      case 76:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Handler"));
      case 54:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ParameterizedSideTransformMenuPart"));
      case 64:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSideTransform_Query"));
      case 63:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSideTransform_Handler"));
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_result"));
      case 75:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_ConceptHandler"));
      case 6:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_currentTargetNode"));
      case 87:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.RemoveDefaultsPart"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_childConcept"));
      case 78:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_NodeQuery"));
      case 104:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SubstituteNodeBuilderVariableDeclaration"));
      case 105:
        return new DataHolderConstraintsDescriptor(new SubstituteNodeBuilderVariableReference_Constraints());
      case 84:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_Substitute_CommonInitializer"));
      case 82:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteVariableInitializer"));
      case 33:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.IncludeRightTransformForNodePart"));
      case 22:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptSubstitutePart"));
      case 21:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptRightTransformPart"));
      case 31:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ISideTransform_String"));
      case 97:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SideTransform_SimpleString"));
      case 106:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.Substitute_SimpleString"));
      case 32:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ISubstitute_String"));
      case 74:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ST_RemoveBy_Condition"));
      case 89:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.RemoveSTByConditionPart"));
      case 29:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.GenericSubstituteMenuPart"));
      case 62:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_GenericSubstituteMenuPart"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_childSetter"));
      case 66:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ParameterizedSubstitute_Icon"));
      case 80:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SubstituteIcon"));
      case 77:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_SideTransform_Icon"));
      case 95:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SideTransformVariableDeclaration"));
      case 72:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_STVariableInitializer"));
      case 96:
        return new DataHolderConstraintsDescriptor(new SideTransformVariableReference_Constraints());
      case 73:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ST_CommonInitializer"));
      case 71:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ReturnSmallPart"));
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_strictly"));
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_wrapped"));
      case 59:
        return new DataHolderConstraintsDescriptor(new PasteWrappers_Constraints());
      case 58:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.PasteWrapper"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToPasteWrap"));
      case 69:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_PasteWrapper"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_link"));
      case 60:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.QueryFunction_ActionType"));
      case 102:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SmartEditorActions"));
      case 107:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SurroundWithAction"));
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.GenerateCodeAction"));
      case 100:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SmartActionParameter"));
      case 101:
        return new DataHolderConstraintsDescriptor(new SmartActionParameterReference_Constraints());
      case 34:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.IsSmartActionApplicableFunction"));
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_EditorCell"));
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_OperationContext"));
      case 30:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.GetActionUIFunction"));
      case 27:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ExecuteSmartActionFunction"));
      case 57:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.PastePostProcessor"));
      case 56:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.PastePostProcessFunction"));
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToPastePostProcess"));
      case 26:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.CopyPreProcessor"));
      case 25:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.CopyPreProcessFunction"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToCopyPreProcess"));
      case 9:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.ConceptFunctionParameter_nodeToCopyPreProcessOriginal"));
      case 24:
        return new DataHolderConstraintsDescriptor(new CopyPasteHandlers_Constraints());
      case 90:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.SNodeCreatorAndInitializer"));
      case 37:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Concept_NewInstance"));
      case 40:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Model_CreateNewNodeOperation"));
      case 41:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Model_CreateNewRootNodeOperation"));
      case 42:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Node_InsertNewNextSiblingOperation"));
      case 43:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Node_InsertNewPrevSiblingOperation"));
      case 44:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Node_ReplaceWithNewOperation"));
      case 39:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_Link_SetNewChildOperation"));
      case 38:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.actions.structure.NF_LinkList_AddNewChildOperation"));
      default:
        return null;
    }
  }
}
