<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.dataFlow.constraints">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <maxImportIndex value="1" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.dataFlow.structure" version="-1" />
  <visible index="2" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206442139340">
    <link role="concept" targetNodeId="1.1206442055221" resolveInfo="DataFlowBuilder" />
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.NodePropertyConstraint" id="1206442141187">
      <link role="applicableProperty" targetNodeId="2v.1169194664001" resolveInfo="name" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_PropertyGetter" id="1206442144157">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206442144158">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206442173610">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1206442176959">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1206442178024">
                <property name="value" value="_DataFlow" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206443301360">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206443299123">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintsFunctionParameter_node" id="1206442173611" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1206443301031">
                    <link role="link" targetNodeId="1.1206442096288" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206443302253">
                  <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206442139341">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206442139342" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206443421002">
    <property name="package" value="BuilderBlock" />
    <link role="concept" targetNodeId="1.1206442747519" resolveInfo="NodeParameter" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206443421003">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206443421004" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206443602082">
    <property name="package" value="Instructions" />
    <link role="concept" targetNodeId="1.1206443583064" resolveInfo="EmitInstructionStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206443602083">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206443602084" />
    </node>
    <node role="canBeAChild" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunction_CanBeAChild" id="1206443604163">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206443604164">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1206443626848">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1206443634371">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1206443635343" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206443627459">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConstraintFunctionParameter_parentNode" id="1206443626849" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1206443628898">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1206443629915">
                  <link role="concept" targetNodeId="1.1206442659665" resolveInfo="BuilderBlock" />
                </node>
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1206443633323" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="3" modelUID="jetbrains.mps.baseLanguage.constraints" />
  <visible index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1206458551481">
    <property name="package" value="BuilderBlock" />
    <link role="concept" targetNodeId="1.1206442659665" resolveInfo="BuilderBlock" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1206458553500">
      <property name="name" value="usesParameterObjectFor" />
      <link role="overriddenMethod" targetNodeId="3v.1199888241493" resolveInfo="usesParameterObjectFor" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206458553502">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206458557990">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206458558852">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1206458556518">
        <property name="name" value="parameter" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206458556519">
          <link role="concept" targetNodeId="4v.1107135704075" resolveInfo="ConceptFunctionParameter" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1206458556520" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1206458551482">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206458551483" />
    </node>
  </node>
</model>

