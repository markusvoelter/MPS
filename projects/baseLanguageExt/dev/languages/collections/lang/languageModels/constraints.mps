<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.ext.collections.lang.constraints">
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" />
  <import index="2" modelUID="jetbrains.mps.smodel.search@java_stub" />
  <import index="3" modelUID="jetbrains.mps.core.structure" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="5" modelUID="java.lang@java_stub" />
  <import index="6" modelUID="jetbrains.mps.helgins.uiActions@java_stub" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1174067603069">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1174067612898">
      <property name="name" value="typePresentation" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1174067633559">
        <link role="classifier" extResolveInfo="5.[Classifier]String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174067612900">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1174067684271">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174067691415">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1174067687149">
              <link role="variableDeclaration" targetNodeId="1174067649314" resolveInfo="type" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsNullOperation" id="1174067694713" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1174067684273">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174067696917">
              <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174067699232">
                <property name="value" value="?" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174067709781">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1174067730190">
            <link role="baseMethodDeclaration" extResolveInfo="6.static method ([Classifier]PresentationManager).([StaticMethodDeclaration]toString_1((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
            <link role="classConcept" extResolveInfo="6.[Classifier]PresentationManager" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1174067733207">
              <link role="variableDeclaration" targetNodeId="1174067649314" resolveInfo="type" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1174067649314">
        <property name="name" value="type" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1174067649315">
          <link role="concept" targetNodeId="4.1068431790189" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178546096965" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178550080910" />
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178181704967">
    <link role="concept" targetNodeId="1.1151688443754" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178181704968">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178181704969" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1174067810224">
      <link role="applicableProperty" targetNodeId="3.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1174067824300">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174067824301">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174067824302">
            <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174067824303">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174067824304">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174067824305">
                  <property name="value" value="&gt;" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1174067824306">
                  <link role="classConcept" targetNodeId="1174067603069" resolveInfo="QueriesUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="1174067612898" resolveInfo="typePresentation" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174067824307">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1174067824308" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1175885578832">
                      <link role="link" targetNodeId="1.1151688676805" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174067824310">
                <property name="value" value="list&lt;" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178181705025">
    <link role="concept" targetNodeId="1.1151689724996" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178181705026">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178181705027" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1174067468685">
      <link role="applicableProperty" targetNodeId="3.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1174067513155">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1174067513156">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174067766021">
            <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174067775384">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1174067794798">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174067797488">
                  <property name="value" value="&gt;" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1174067783950">
                  <link role="baseMethodDeclaration" targetNodeId="1174067612898" resolveInfo="typePresentation" />
                  <link role="classConcept" targetNodeId="1174067603069" resolveInfo="QueriesUtil" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174067788296">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1174067786779" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1174067790172">
                      <link role="link" targetNodeId="1.1151689745422" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1174067768023">
                <property name="value" value="sequence&lt;" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178192141110">
    <link role="concept" targetNodeId="1.1153944233411" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178192141111">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178192141112" />
    </node>
    <node role="references" type="jetbrains.mps.bootstrap.constraintsLanguage.NodeReferentConstraint" id="1153950318560">
      <property name="searchScopeDescription" value="cycle-variable of enclosing 'foreach' cycle" />
      <link role="applicableLink" targetNodeId="1.1153944258490" />
      <node role="searchScopeFactory" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_ReferentSearchScope_Factory" id="1153950318561">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1153950318562">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1182460178599">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1182460178600">
              <property name="name" value="forEachStatements" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1182460178601">
                <link role="elementConcept" targetNodeId="1.1153943597977" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1182460145999">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorsOperation" id="1182460148191">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1182460151219">
                    <link role="concept" targetNodeId="1.1153943597977" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode" id="1182460143949" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1182460136717">
            <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1182460136718">
              <link role="baseMethodDeclaration" extResolveInfo="2.constructor [Classifier]SubnodesSearchScope[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode]))" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1182460226583">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1182460194439">
                  <link role="variableDeclaration" targetNodeId="1182460178600" resolveInfo="foreEachStatements" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetLastOperation" id="1182460228555" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="searchScopeCanCreate" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_ReferentSearchScope_CanCreate" id="1159216826532">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1159216826533">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1159216829924">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1159216839751">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1159216839752" />
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1159216839753">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptParameter_ReferentSearchScope_enclosingNode" id="1159216839754" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAncestorOperation" id="1177556243468">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Inclusion" id="1159216839756" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.OperationParm_Concept" id="1159216839757">
                    <link role="concept" targetNodeId="1.1153943597977" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

