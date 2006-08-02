<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.actions">
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="2" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="3" modelUID="jetbrains.mps.baseLanguage.actions@java_stub" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1115842744505">
    <property name="name" value="BL_node_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1115842748115">
      <property name="actionsFactoryAspectId" value="Expression" />
      <property name="applicableLinkMetaclass" value="aggregation" />
      <link role="applicableConcept" targetNodeId="1.1068431790191" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1119298590500">
      <property name="actionsFactoryAspectId" value="Statement" />
      <property name="applicableLinkMetaclass" value="aggregation" />
      <link role="applicableConcept" targetNodeId="1.1068580123157" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1154033305516">
      <property name="actionsFactoryAspectId" value="Continue_Break_statements" />
      <link role="applicableConcept" targetNodeId="1.1068580123157" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1154539862600">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154539862601">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154539941645">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1154539947981">
              <link role="baseMethodDeclaration" extResolveInfo="3.static method ([Classifier]CanAddBreakOrContinueStatement).([StaticMethodDeclaration]check((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
              <link role="classConcept" extResolveInfo="3.[Classifier]CanAddBreakOrContinueStatement" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionParm_parentNode" id="1154539947982" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1127762018548">
      <property name="actionsFactoryAspectId" value="ParameterDeclaration" />
      <property name="applicableLinkMetaclass" value="aggregation" />
      <link role="applicableConcept" targetNodeId="1.1068498886292" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActions" id="1138168268784">
    <property name="name" value="BL_rt_transform" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138168280988">
      <property name="actionsFactoryAspectId" value="InstanceMemberAccess" />
      <property name="preconditionAspectId" value="Classifier_type" />
      <link role="applicableConcept" targetNodeId="1.1068431790191" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138168906052">
      <property name="actionsFactoryAspectId" value="BinaryOperation" />
      <link role="applicableConcept" targetNodeId="1.1068431790191" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138169534740">
      <property name="actionsFactoryAspectId" value="AssignmentExpression" />
      <link role="applicableConcept" targetNodeId="1.1068431790191" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138169661398">
      <property name="actionsFactoryAspectId" value="InstanceOfExpression" />
      <link role="applicableConcept" targetNodeId="1.1068431790191" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1140462494826">
      <property name="actionsFactoryAspectId" value="AddInitializer" />
      <property name="preconditionAspectId" value="FieldOrLocalVar" />
      <link role="applicableConcept" targetNodeId="1.1068431474542" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1140565409777">
      <property name="actionsFactoryAspectId" value="Type_addArrayBrackets" />
      <link role="applicableConcept" targetNodeId="1.1068431790189" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1140569338029">
      <property name="actionsFactoryAspectId" value="ClassifierType_addParameter" />
      <property name="preconditionAspectId" value="ClassifierType_noTypeParameters" />
      <link role="applicableConcept" targetNodeId="1.1107535904670" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1140573012027">
      <property name="actionsFactoryAspectId" value="GenericDeclaration_addTypeVariable" />
      <property name="preconditionAspectId" value="GenericDeclaration_noTypeVariables" />
      <link role="applicableConcept" targetNodeId="1.1109279851642" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1140831852602">
      <property name="transformTag" value="ext_1_RTransform" />
      <property name="actionsFactoryAspectId" value="NewExpression_addTypeParameter" />
      <property name="preconditionAspectId" value="NewExpression_noTypeParameters" />
      <link role="applicableConcept" targetNodeId="1.1068581242872" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActions" id="1141180990973">
    <property name="name" value="BL_static_member_reference" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141261668233">
      <property name="actionsFactoryAspectId" value="StaticFieldReference_default_and_extra" />
      <link role="applicableLink" targetNodeId="1.1070568178160" />
      <link role="applicableSourceConcept" targetNodeId="1.1070533707846" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141262055243">
      <property name="actionsFactoryAspectId" value="StaticMethodCall_default_and_extra" />
      <link role="applicableSourceConcept" targetNodeId="1.1081236700937" />
      <link role="applicableLink" targetNodeId="1.1081236769987" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1141262170371">
      <property name="actionsFactoryAspectId" value="EnumConstantReference_default_and_extra" />
      <link role="applicableSourceConcept" targetNodeId="1.1083260308424" />
      <link role="applicableLink" targetNodeId="1.1083260308426" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActions" id="1144964668383">
    <property name="name" value="BL_instance_member_reference" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1144964865874">
      <property name="actionsFactoryAspectId" value="FieldReference_default_and_extra" />
      <link role="applicableLink" targetNodeId="1.1070568237987" />
      <link role="applicableSourceConcept" targetNodeId="1.1068580123158" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.ReferentSubstituteActionsBuilder" id="1144964865876">
      <property name="actionsFactoryAspectId" value="InstanceMethodCall_default_and_extra" />
      <link role="applicableSourceConcept" targetNodeId="1.1068580123163" />
      <link role="applicableLink" targetNodeId="1.1070568044740" />
    </node>
  </node>
</model>

