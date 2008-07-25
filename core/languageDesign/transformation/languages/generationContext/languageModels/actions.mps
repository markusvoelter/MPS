<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.transformation.generationContext.actions">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.constraints" version="16" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.structure" version="22" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins">
    <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.transformation.generationContext.structure" version="-1" />
  <import index="3" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactories" id="1216861582540">
    <property name="name" value="node_factories" />
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1216861604197">
      <link role="applicableConcept" targetNodeId="1.1216860049622" resolveInfo="GenerationContextOp_GetOutputByLabel" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1216861604198">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216861604199">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1216861604200">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604201">
              <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1216861604202" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1216861604203">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216861621171">
                  <link role="conceptDeclaration" targetNodeId="1.1216860049627" resolveInfo="GenerationContextOp_GetOutputByLabelAndInput" />
                </node>
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216861604205">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216861604206">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1216861604207">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604208">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1216861604209" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216861635063">
                      <link role="link" targetNodeId="1.1216860049623" />
                    </node>
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604211">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1216861604212">
                      <link role="concept" targetNodeId="1.1216860049627" resolveInfo="GenerationContextOp_GetOutputByLabelAndInput" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1216861604213" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216861637876">
                      <link role="link" targetNodeId="1.1216860049628" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeFactory" id="1216861604215">
      <link role="applicableConcept" targetNodeId="1.1216860049627" resolveInfo="GenerationContextOp_GetOutputByLabelAndInput" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction" id="1216861604216">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216861604217">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1216861604218">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604219">
              <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1216861604220" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1216861604221">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216861604222">
                  <link role="conceptDeclaration" targetNodeId="1.1216860049622" resolveInfo="GenerationContextOp_GetOutputByLabel" />
                </node>
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216861604223">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216861604224">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1216861604225">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604226">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_NewNode" id="1216861604227" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216861653830">
                      <link role="link" targetNodeId="1.1216860049628" />
                    </node>
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861604229">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1216861604230">
                      <link role="concept" targetNodeId="1.1216860049622" resolveInfo="GenerationContextOp_GetOutputByLabel" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSetupFunction_SampleNode" id="1216861604231" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216861656566">
                      <link role="link" targetNodeId="1.1216860049623" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1216861714160">
    <property name="name" value="dotOperation" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1216861714161">
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="3.1197027803184" resolveInfo="IOperation" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstitutePreconditionFunction" id="1216861714162">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216861714163">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216861714164">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861714165">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861714166">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216861714167">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1216861714168">
                    <link role="concept" targetNodeId="3.1197027756228" resolveInfo="DotExpression" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_parentNode" id="1216861714169" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1216861714170">
                    <link role="link" targetNodeId="3.1197027771414" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1216861714171" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1216861714172">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1216861728599">
                  <link role="conceptDeclaration" targetNodeId="1.1216860049633" resolveInfo="GenerationContextType" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1216861714174">
        <link role="concept" targetNodeId="1.1216860049622" resolveInfo="GenerationContextOp_GetOutputByLabel" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1216861714175">
        <link role="concept" targetNodeId="1.1216860049627" resolveInfo="GenerationContextOp_GetOutputByLabelAndInput" />
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptSubstitutePart" id="1216945574938">
        <link role="concept" targetNodeId="1.1216945228272" resolveInfo="GenerationContextOp_GetScope" />
      </node>
    </node>
  </node>
</model>

