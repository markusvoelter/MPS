package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.lang.smodel.structure.AbstractOperationParameter", "jetbrains.mps.lang.smodel.structure.AllAttributeQualifier", "jetbrains.mps.lang.smodel.structure.AllAttributesQualifier", "jetbrains.mps.lang.smodel.structure.AttributeAccess", "jetbrains.mps.lang.smodel.structure.AttributeAccessOperation", "jetbrains.mps.lang.smodel.structure.AttributeQualifier", "jetbrains.mps.lang.smodel.structure.CheckedModuleReference", "jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression", "jetbrains.mps.lang.smodel.structure.ConceptPropertyNameRefExpression", "jetbrains.mps.lang.smodel.structure.ConceptProperty_SetOperation", "jetbrains.mps.lang.smodel.structure.ConceptRefExpression", "jetbrains.mps.lang.smodel.structure.ConceptReference", "jetbrains.mps.lang.smodel.structure.Concept_FindInstances", "jetbrains.mps.lang.smodel.structure.Concept_GetAllSubConcepts", "jetbrains.mps.lang.smodel.structure.Concept_GetAllSuperConcepts", "jetbrains.mps.lang.smodel.structure.Concept_GetDirectSuperConcepts", "jetbrains.mps.lang.smodel.structure.Concept_GetHierarchy", "jetbrains.mps.lang.smodel.structure.Concept_IsExactlyOperation", "jetbrains.mps.lang.smodel.structure.Concept_IsSubConceptOfOperation", "jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation", "jetbrains.mps.lang.smodel.structure.Concept_NewInstance", "jetbrains.mps.lang.smodel.structure.EnumMemberReference", "jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation", "jetbrains.mps.lang.smodel.structure.EnumMember_ValueOperation", "jetbrains.mps.lang.smodel.structure.EqualsStructurallyExpression", "jetbrains.mps.lang.smodel.structure.IAttributeAccessQualifier", "jetbrains.mps.lang.smodel.structure.ILinkAccess", "jetbrains.mps.lang.smodel.structure.ILinkAccessQualifier", "jetbrains.mps.lang.smodel.structure.ILinkAccessQualifierContainer", "jetbrains.mps.lang.smodel.structure.ILinkQualifier", "jetbrains.mps.lang.smodel.structure.IPropertyAccessQualifier", "jetbrains.mps.lang.smodel.structure.IPropertyQualifier", "jetbrains.mps.lang.smodel.structure.IRefConceptArg", "jetbrains.mps.lang.smodel.structure.IReferenceOperation", "jetbrains.mps.lang.smodel.structure.IfInstanceOfStatement", "jetbrains.mps.lang.smodel.structure.IfInstanceOfVarReference", "jetbrains.mps.lang.smodel.structure.IfInstanceOfVariable", "jetbrains.mps.lang.smodel.structure.LanguageReferenceExpression", "jetbrains.mps.lang.smodel.structure.LinkAttributeAccessQualifier", "jetbrains.mps.lang.smodel.structure.LinkAttributeQualifier", "jetbrains.mps.lang.smodel.structure.LinkList_AddAllOperation", "jetbrains.mps.lang.smodel.structure.LinkList_AddChildOperation", "jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation", "jetbrains.mps.lang.smodel.structure.LinkList_GetCountOperation", "jetbrains.mps.lang.smodel.structure.LinkList_InsertChildFirstOperation", "jetbrains.mps.lang.smodel.structure.LinkList_RemoveAllChildrenOperation", "jetbrains.mps.lang.smodel.structure.LinkNameRefExpression", "jetbrains.mps.lang.smodel.structure.LinkQualifier", "jetbrains.mps.lang.smodel.structure.LinkRefExpression", "jetbrains.mps.lang.smodel.structure.LinkRefQualifier", "jetbrains.mps.lang.smodel.structure.Link_DeleteChildOperation", "jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation", "jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation", "jetbrains.mps.lang.smodel.structure.Model_AddRootOperation", "jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation", "jetbrains.mps.lang.smodel.structure.Model_CreateNewRootNodeOperation", "jetbrains.mps.lang.smodel.structure.Model_GetLongNameOperation", "jetbrains.mps.lang.smodel.structure.Model_GetModule", "jetbrains.mps.lang.smodel.structure.Model_NodesIncludingImportedOperation", "jetbrains.mps.lang.smodel.structure.Model_NodesOperation", "jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation", "jetbrains.mps.lang.smodel.structure.Model_RootsOperation", "jetbrains.mps.lang.smodel.structure.ModuleReferenceExpression", "jetbrains.mps.lang.smodel.structure.NodeAttributeAccessQualifier", "jetbrains.mps.lang.smodel.structure.NodeAttributeQualifier", "jetbrains.mps.lang.smodel.structure.NodeRefExpression", "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall", "jetbrains.mps.lang.smodel.structure.Node_CopyOperation", "jetbrains.mps.lang.smodel.structure.Node_DeleteOperation", "jetbrains.mps.lang.smodel.structure.Node_DetachOperation", "jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation", "jetbrains.mps.lang.smodel.structure.Node_GetAllSiblingsOperation", "jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation", "jetbrains.mps.lang.smodel.structure.Node_GetAncestorsOperation", "jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation", "jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation", "jetbrains.mps.lang.smodel.structure.Node_GetContainingLinkOperation", "jetbrains.mps.lang.smodel.structure.Node_GetContainingRoleOperation", "jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation", "jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation", "jetbrains.mps.lang.smodel.structure.Node_GetIndexInParentOperation", "jetbrains.mps.lang.smodel.structure.Node_GetModelOperation", "jetbrains.mps.lang.smodel.structure.Node_GetNextSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_GetNextSiblingsOperation", "jetbrains.mps.lang.smodel.structure.Node_GetParentOperation", "jetbrains.mps.lang.smodel.structure.Node_GetPrevSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_GetPrevSiblingsOperation", "jetbrains.mps.lang.smodel.structure.Node_GetReferenceOperation", "jetbrains.mps.lang.smodel.structure.Node_GetReferencesOperation", "jetbrains.mps.lang.smodel.structure.Node_GetReferentSearchScopeOperation", "jetbrains.mps.lang.smodel.structure.Node_InsertNewNextSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_InsertNextSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_InsertPrevSiblingOperation", "jetbrains.mps.lang.smodel.structure.Node_IsAttributeOperation", "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation", "jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation", "jetbrains.mps.lang.smodel.structure.Node_IsNullOperation", "jetbrains.mps.lang.smodel.structure.Node_IsRoleOperation", "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithAnotherOperation", "jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation", "jetbrains.mps.lang.smodel.structure.OperationParm_Concept", "jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList", "jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion", "jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier", "jetbrains.mps.lang.smodel.structure.OperationParm_Root", "jetbrains.mps.lang.smodel.structure.OperationParm_SameMetaLevel", "jetbrains.mps.lang.smodel.structure.OperationParm_StopConceptList", "jetbrains.mps.lang.smodel.structure.PoundExpression", "jetbrains.mps.lang.smodel.structure.PropertyAttributeAccessQualifier", "jetbrains.mps.lang.smodel.structure.PropertyAttributeQualifier", "jetbrains.mps.lang.smodel.structure.PropertyNameRefExpression", "jetbrains.mps.lang.smodel.structure.PropertyQualifier", "jetbrains.mps.lang.smodel.structure.PropertyRefQualifier", "jetbrains.mps.lang.smodel.structure.Property_HasValue_Enum", "jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple", "jetbrains.mps.lang.smodel.structure.Property_RemoveOperation", "jetbrains.mps.lang.smodel.structure.Property_SetOperation", "jetbrains.mps.lang.smodel.structure.RefConcept_Reference", "jetbrains.mps.lang.smodel.structure.Reference_GetLinkDeclarationOperation", "jetbrains.mps.lang.smodel.structure.Reference_GetResolveInfo", "jetbrains.mps.lang.smodel.structure.Reference_GetRoleOperation", "jetbrains.mps.lang.smodel.structure.Reference_GetTargetOperation", "jetbrains.mps.lang.smodel.structure.SConceptLinkAccess", "jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess", "jetbrains.mps.lang.smodel.structure.SConceptType", "jetbrains.mps.lang.smodel.structure.SEnumMemberOperation", "jetbrains.mps.lang.smodel.structure.SEnumMemberType", "jetbrains.mps.lang.smodel.structure.SEnumOperation", "jetbrains.mps.lang.smodel.structure.SEnumOperationInvocation", "jetbrains.mps.lang.smodel.structure.SEnum_MemberForNameOperation", "jetbrains.mps.lang.smodel.structure.SEnum_MemberForValueOperation", "jetbrains.mps.lang.smodel.structure.SEnum_MemberOperation", "jetbrains.mps.lang.smodel.structure.SEnum_MembersOperation", "jetbrains.mps.lang.smodel.structure.SLinkAccess", "jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect", "jetbrains.mps.lang.smodel.structure.SLinkListAccess", "jetbrains.mps.lang.smodel.structure.SModelType", "jetbrains.mps.lang.smodel.structure.SNodeCreator", "jetbrains.mps.lang.smodel.structure.SNodeListCreator", "jetbrains.mps.lang.smodel.structure.SNodeListType", "jetbrains.mps.lang.smodel.structure.SNodeOperation", "jetbrains.mps.lang.smodel.structure.SNodeType", "jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression", "jetbrains.mps.lang.smodel.structure.SPropertyAccess", "jetbrains.mps.lang.smodel.structure.SReferenceType", "jetbrains.mps.lang.smodel.structure.SearchScopeType", "jetbrains.mps.lang.smodel.structure.SearchScope_ContainsOperation", "jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression", "jetbrains.mps.lang.smodel.structure.StaticConceptMethodCall", "jetbrains.mps.lang.smodel.structure._LinkAccessT"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 142:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeType"));
      case 144:
        return new DataHolderConstraintsDescriptor(new SPropertyAccess_Constraints());
      case 134:
        return new DataHolderConstraintsDescriptor(new SLinkAccess_Constraints());
      case 136:
        return new DataHolderConstraintsDescriptor(new SLinkListAccess_Constraints());
      case 141:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeOperation"));
      case 117:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Property_SetOperation"));
      case 21:
        return new DataHolderConstraintsDescriptor(new EnumMemberReference_Constraints());
      case 51:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation"));
      case 42:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_AddNewChildOperation"));
      case 84:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetParentOperation"));
      case 95:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation"));
      case 90:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_InsertNewNextSiblingOperation"));
      case 100:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_ReplaceWithNewOperation"));
      case 41:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_AddChildOperation"));
      case 44:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_InsertChildFirstOperation"));
      case 50:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Link_DeleteChildOperation"));
      case 99:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_ReplaceWithAnotherOperation"));
      case 68:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_DeleteOperation"));
      case 143:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression"));
      case 52:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation"));
      case 91:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation"));
      case 92:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_InsertNextSiblingOperation"));
      case 93:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_InsertPrevSiblingOperation"));
      case 137:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SModelType"));
      case 81:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetModelOperation"));
      case 54:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation"));
      case 85:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetPrevSiblingOperation"));
      case 82:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetNextSiblingOperation"));
      case 0:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AbstractOperationParameter"));
      case 103:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion"));
      case 105:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_Root"));
      case 101:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_Concept"));
      case 67:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_CopyOperation"));
      case 98:
        return new DataHolderConstraintsDescriptor(new Node_IsRoleOperation_Constraints());
      case 140:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeListType"));
      case 148:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression"));
      case 43:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_GetCountOperation"));
      case 139:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeListCreator"));
      case 83:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetNextSiblingsOperation"));
      case 86:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetPrevSiblingsOperation"));
      case 71:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetAllSiblingsOperation"));
      case 124:
        return new DataHolderConstraintsDescriptor(new SConceptPropertyAccess_Constraints());
      case 114:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Property_HasValue_Enum"));
      case 115:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple"));
      case 102:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ConceptReference"));
      case 55:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_CreateNewRootNodeOperation"));
      case 70:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetAdapterOperation"));
      case 79:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation"));
      case 78:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation"));
      case 61:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_RootsOperation"));
      case 59:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_NodesOperation"));
      case 72:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation"));
      case 74:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetChildrenOperation"));
      case 97:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_IsNullOperation"));
      case 96:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation"));
      case 40:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_AddAllOperation"));
      case 75:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation"));
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_IsExactlyOperation"));
      case 125:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SConceptType"));
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ConceptRefExpression"));
      case 73:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetAncestorsOperation"));
      case 123:
        return new DataHolderConstraintsDescriptor(new SConceptLinkAccess_Constraints());
      case 60:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_RootsIncludingImportedOperation"));
      case 118:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.RefConcept_Reference"));
      case 80:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetIndexInParentOperation"));
      case 15:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_GetDirectSuperConcepts"));
      case 66:
        return new DataHolderConstraintsDescriptor(new Node_ConceptMethodCall_Constraints());
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_IsSuperConceptOfOperation"));
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_IsSubConceptOfOperation"));
      case 14:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_GetAllSuperConcepts"));
      case 16:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_GetHierarchy"));
      case 138:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SNodeCreator"));
      case 20:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_NewInstance"));
      case 13:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_GetAllSubConcepts"));
      case 12:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Concept_FindInstances"));
      case 58:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_NodesIncludingImportedOperation"));
      case 25:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IAttributeAccessQualifier"));
      case 63:
        return new DataHolderConstraintsDescriptor(new NodeAttributeAccessQualifier_Constraints());
      case 109:
        return new DataHolderConstraintsDescriptor(new PropertyAttributeAccessQualifier_Constraints());
      case 30:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IPropertyAccessQualifier"));
      case 108:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.PoundExpression"));
      case 113:
        return new DataHolderConstraintsDescriptor(new PropertyRefQualifier_Constraints());
      case 27:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ILinkAccessQualifier"));
      case 38:
        return new DataHolderConstraintsDescriptor(new LinkAttributeAccessQualifier_Constraints());
      case 49:
        return new DataHolderConstraintsDescriptor(new LinkRefQualifier_Constraints());
      case 150:
        return new DataHolderConstraintsDescriptor(new _LinkAccessT_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AllAttributesQualifier"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AttributeAccessOperation"));
      case 94:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_IsAttributeOperation"));
      case 149:
        return new DataHolderConstraintsDescriptor(new StaticConceptMethodCall_Constraints());
      case 53:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_AddRootOperation"));
      case 32:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IRefConceptArg"));
      case 56:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_GetLongNameOperation"));
      case 45:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LinkList_RemoveAllChildrenOperation"));
      case 116:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Property_RemoveOperation"));
      case 65:
        return new DataHolderConstraintsDescriptor(new NodeRefExpression_Constraints());
      case 146:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SearchScopeType"));
      case 89:
        return new DataHolderConstraintsDescriptor(new Node_GetReferentSearchScopeOperation_Constraints());
      case 147:
        return new DataHolderConstraintsDescriptor(new SearchScope_ContainsOperation_Constraints());
      case 48:
        return new DataHolderConstraintsDescriptor(new LinkRefExpression_Constraints());
      case 24:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.EqualsStructurallyExpression"));
      case 69:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_DetachOperation"));
      case 127:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SEnumMemberType"));
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.EnumMember_ValueOperation"));
      case 22:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.EnumMember_NameOperation"));
      case 129:
        return new DataHolderConstraintsDescriptor(new SEnumOperationInvocation_Constraints());
      case 128:
        return new DataHolderConstraintsDescriptor(new SEnumOperation_Constraints());
      case 130:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SEnum_MemberForNameOperation"));
      case 131:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SEnum_MemberForValueOperation"));
      case 132:
        return new DataHolderConstraintsDescriptor(new SEnum_MemberOperation_Constraints());
      case 133:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SEnum_MembersOperation"));
      case 126:
        return new DataHolderConstraintsDescriptor(new SEnumMemberOperation_Constraints());
      case 107:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_StopConceptList"));
      case 9:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ConceptProperty_SetOperation"));
      case 26:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ILinkAccess"));
      case 135:
        return new DataHolderConstraintsDescriptor(new SLinkImplicitSelect_Constraints());
      case 88:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetReferencesOperation"));
      case 145:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.SReferenceType"));
      case 122:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Reference_GetTargetOperation"));
      case 119:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Reference_GetLinkDeclarationOperation"));
      case 33:
        return new DataHolderConstraintsDescriptor(new IReferenceOperation_Constraints());
      case 121:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Reference_GetRoleOperation"));
      case 76:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetContainingLinkOperation"));
      case 77:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetContainingRoleOperation"));
      case 87:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Node_GetReferenceOperation"));
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ILinkAccessQualifierContainer"));
      case 104:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_LinkQualifier"));
      case 120:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Reference_GetResolveInfo"));
      case 6:
        return new DataHolderConstraintsDescriptor(new CheckedModuleReference_Constraints());
      case 106:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.OperationParm_SameMetaLevel"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ConceptFqNameRefExpression"));
      case 34:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IfInstanceOfStatement"));
      case 36:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IfInstanceOfVariable"));
      case 35:
        return new DataHolderConstraintsDescriptor(new IfInstanceOfVarReference_Constraints());
      case 46:
        return new DataHolderConstraintsDescriptor(new LinkNameRefExpression_Constraints());
      case 111:
        return new DataHolderConstraintsDescriptor(new PropertyNameRefExpression_Constraints());
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AttributeAccess"));
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AttributeQualifier"));
      case 64:
        return new DataHolderConstraintsDescriptor(new NodeAttributeQualifier_Constraints());
      case 39:
        return new DataHolderConstraintsDescriptor(new LinkAttributeQualifier_Constraints());
      case 1:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.AllAttributeQualifier"));
      case 110:
        return new DataHolderConstraintsDescriptor(new PropertyAttributeQualifier_Constraints());
      case 29:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.ILinkQualifier"));
      case 31:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.IPropertyQualifier"));
      case 47:
        return new DataHolderConstraintsDescriptor(new LinkQualifier_Constraints());
      case 112:
        return new DataHolderConstraintsDescriptor(new PropertyQualifier_Constraints());
      case 8:
        return new DataHolderConstraintsDescriptor(new ConceptPropertyNameRefExpression_Constraints());
      case 57:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.Model_GetModule"));
      case 62:
        return new DataHolderConstraintsDescriptor(new ModuleReferenceExpression_Constraints());
      case 37:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.lang.smodel.structure.LanguageReferenceExpression"));
      default:
        return null;
    }
  }
}
