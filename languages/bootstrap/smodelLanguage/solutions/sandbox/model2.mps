<?xml version="1.0" encoding="UTF-8"?>
<model name="model2">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="3" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1170455697846">
    <property name="name" value="AAA" />
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1170455701847">
      <property name="name" value="aaa" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1170455838774" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170455701849">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170455840650">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170455850695">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170455850696">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170455850697">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170455850698">
                  <link role="variableDeclaration" targetNodeId="1170455810678" resolveInfo="node" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170455850699">
                  <link role="link" targetNodeId="1.1138676095763" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170455850700">
                <link role="property" targetNodeId="2.1083923523171" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170455850701" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170455810678">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170455810679">
          <link role="concept" targetNodeId="1.1138676077309" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1170455942976">
      <property name="name" value="bbb" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1170455942977" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1170455942978">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170455942979">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170455942980">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170455942982">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170455942983">
                <link role="variableDeclaration" targetNodeId="1170455942987" resolveInfo="node" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170455956427">
                <link role="property" targetNodeId="3.1156235010670" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170455942986" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1170455942987">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170455942988">
          <link role="concept" targetNodeId="1.1138676077309" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.InstanceMethodDeclaration" id="1179351056139">
      <property name="name" value="ccc" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.VoidType" id="1179351056140" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1179351056141" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179351056142">
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179351091412">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179351096635">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179351092674">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1179351091413">
                <link role="variableDeclaration" targetNodeId="1179351074639" resolveInfo="node" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetConceptOperation" id="1179351094997" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Concept_GetDirectSuperConcepts" id="1179351102726" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1179351074639">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179351074640">
          <link role="concept" targetNodeId="1.1138676077309" />
        </node>
      </node>
    </node>
  </node>
</model>

