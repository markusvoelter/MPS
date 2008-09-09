<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.plugin">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.pluginLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.pluginLanguage.constraints" version="19" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.pluginLanguage.structure" version="14" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.classifiers">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.classifiers.constraints" version="7" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.patterns">
    <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  </language>
  <language namespace="jetbrains.mps.quotation" />
  <language namespace="jetbrains.mps.baseLanguage.strings">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.strings.constraints" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.baseLanguage.unitTest.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <maxImportIndex value="55" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="3" modelUID="jetbrains.mps.ide.actions" version="-1" />
  <import index="4" modelUID="java.util@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="9" modelUID="java.lang@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="12" modelUID="jetbrains.mps.logging@java_stub" version="-1" />
  <import index="13" modelUID="java.io@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.vfs@java_stub" version="-1" />
  <import index="15" modelUID="jetbrains.mps.reloading@java_stub" version="-1" />
  <import index="16" modelUID="javax.swing@java_stub" version="-1" />
  <import index="17" modelUID="java.awt@java_stub" version="-1" />
  <import index="25" modelUID="jetbrains.mps.dataFlow.framework@java_stub" version="-1" />
  <import index="26" modelUID="jetbrains.mps.dataFlow@java_stub" version="-1" />
  <import index="27" modelUID="jetbrains.mps.dataFlow.framework.analyzers@java_stub" version="-1" />
  <import index="28" modelUID="jetbrains.mps.dataFlow.framework.instructions@java_stub" version="-1" />
  <import index="30" modelUID="jetbrains.mps.ide@java_stub" version="-1" />
  <import index="32" modelUID="jetbrains.mps.baseLanguage.plugin@java_stub" version="-1" />
  <import index="33" modelUID="jetbrains.mps.baseLanguage.refactoring.extractMethod@java_stub" version="-1" />
  <import index="35" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="36" modelUID="jetbrains.mps.helgins.checking@java_stub" version="-1" />
  <import index="38" modelUID="jetbrains.mps.smodel.event@java_stub" version="-1" />
  <import index="39" modelUID="jetbrains.mps.workbench.tools@java_stub" version="-1" />
  <import index="40" modelUID="jetbrains.mps.baseLanguage.refactoring.inlineMethod@java_stub" version="-1" />
  <import index="41" modelUID="com.intellij.execution.ui@java_stub" version="-1" />
  <import index="43" modelUID="com.intellij.openapi.project@java_stub" version="-1" />
  <import index="44" modelUID="com.intellij.execution.impl@java_stub" version="-1" />
  <import index="45" modelUID="com.intellij.openapi.ui@java_stub" version="-1" />
  <import index="46" modelUID="jetbrains.mps.workbench.action@java_stub" version="-1" />
  <import index="48" modelUID="jetbrains.mps.core.behavior" version="-1" />
  <import index="50" modelUID="com.intellij.openapi.util@java_stub" version="-1" />
  <import index="52" modelUID="jetbrains.mps.baseLanguage.refactoring.changeMethodSignature@java_stub" version="-1" />
  <import index="54" modelUID="jetbrains.mps.workbench@java_stub" version="-1" />
  <import index="55" modelUID="jetbrains.mps.ide.dialogs@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205247197267">
    <property name="name" value="BaseLanguageEditorPopup" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1205247338363">
      <link role="modifiedGroup" targetNodeId="3.1204991231476" resolveInfo="EditorPopup" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1207148319290">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205254813928">
        <link role="action" targetNodeId="1205248417575" resolveInfo="CommentStatements" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205605318439">
        <link role="action" targetNodeId="1205604975727" resolveInfo="UncommentStatements" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205837184579">
        <link role="action" targetNodeId="1205836731341" resolveInfo="RunClassConcept" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.Separator" id="1207660282049" />
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1207660285645">
        <link role="action" targetNodeId="1207231065572" resolveInfo="ExtractMethod" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1213010876833">
        <link role="action" targetNodeId="1213008751376" resolveInfo="InlineMethod" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1214478246100">
        <link role="action" targetNodeId="1214477667497" resolveInfo="ChangeMethodSignature" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205247375460">
    <property name="name" value="BaseLanguageEditorPopupInternal" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1205247403415">
      <link role="modifiedGroup" targetNodeId="3.1204991232446" resolveInfo="EditorInternal" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1207148321744">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1207053383184">
        <link role="action" targetNodeId="1207052992292" resolveInfo="ShowInternalExtractMethodStuff" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205247737002">
    <property name="name" value="BaseLanguageModelActionsInternal" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1205247768364">
      <link role="modifiedGroup" targetNodeId="3.1205163054135" resolveInfo="ProjectPaneModelActionsInternal" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1207148324042" />
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205247740394">
    <property name="name" value="BaseLanguageNodeActionsInternal" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1205247793147">
      <link role="modifiedGroup" targetNodeId="3.1204991217354" resolveInfo="ProjectPaneNodeActionsInternal" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1207148244981" />
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1205248417575">
    <property name="name" value="CommentStatements" />
    <property name="shortcut" value="control shift SLASH" />
    <property name="caption" value="Comment Statements" />
    <property name="package" value="Actions" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1205248417578">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205248417579">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1205250633077">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1205250633078">
            <property name="name" value="commentedStatementsBlock" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1205250633079">
              <link role="concept" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205260775975">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205260773627">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208352501029">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208352501030" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208352501031">
                    <link role="member" targetNodeId="1206096366578" resolveInfo="nodes" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1205250710298" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation" id="1205250801575">
                <link role="concept" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205252086549">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205260767465">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205252086552">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1205252086553">
                <link role="variableDeclaration" targetNodeId="1205250633078" resolveInfo="commentedStatementsBlock" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1205252092937">
                <link role="link" targetNodeId="1.1177326540772" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddAllOperation" id="1205252133131">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208352507174">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208352507175" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208352507912">
                  <link role="member" targetNodeId="1206096366578" resolveInfo="nodes" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1206096397027">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206096397028">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208269568557">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269568558">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269568559">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269637535">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269568560">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208269568561" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208269631252">
                    <link role="member" targetNodeId="1206096366578" resolveInfo="nodes" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1208269639708">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1208269642633">
                    <property name="value" value="0" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1208269568563">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208269568564">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208269568565">
                    <link role="conceptDeclaration" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1208269659230" />
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1207320153735">
      <property name="keycode" value="VK_SLASH" />
      <property name="modifiers" value="ctrl+shift" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1206096366578">
      <property name="name" value="nodes" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206096366579" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1206096368924">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1205604975727">
    <property name="name" value="UncommentStatements" />
    <property name="caption" value="Uncomment Statements" />
    <property name="shortcut" value="control shift SLASH" />
    <property name="package" value="Actions" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1205604975730">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205604975731">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208269256170">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208269256171">
            <property name="name" value="commentedStatementsBlock" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208269256172">
              <link role="concept" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269268669">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269268670">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208269268671" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208269268672">
                  <link role="member" targetNodeId="1208269064746" resolveInfo="node" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1208269268673">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208269268674">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208269268675">
                    <link role="conceptDeclaration" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1205605202047">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1205605202048">
            <property name="name" value="statement" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269352594">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208269345717">
              <link role="variableDeclaration" targetNodeId="1208269256171" resolveInfo="commentedStatementsBlock" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1208269354503">
              <link role="link" targetNodeId="1.1177326540772" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205605231512">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205605233280">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205605273073">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation" id="1205605275357">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1205605277203">
                    <link role="variable" targetNodeId="1205605202048" resolveInfo="statement" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208269376409">
                  <link role="variableDeclaration" targetNodeId="1208269256171" resolveInfo="commentedStatementsBlock" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205605282361">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205605283113">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1205605284334" />
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208269381536">
              <link role="variableDeclaration" targetNodeId="1208269256171" resolveInfo="commentedStatementsBlock" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1207320171736">
      <property name="keycode" value="VK_SLASH" />
      <property name="modifiers" value="ctrl+shift" />
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1208269168882">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208269168883">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208269173446">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269226453">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269177808">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208269173447">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208269173448" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208269173449">
                  <link role="member" targetNodeId="1208269064746" resolveInfo="node" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1208269221061">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208269221062">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208269223157">
                    <link role="conceptDeclaration" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1208269228798" />
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1208269064746">
      <property name="name" value="node" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1208269064747" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208269214482">
        <link role="concept" targetNodeId="2v.1133920641626" resolveInfo="BaseConcept" />
      </node>
    </node>
  </node>
  <visible index="3" modelUID="jetbrains.mps.baseLanguage.behavior" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1205836731341">
    <property name="package" value="Actions" />
    <property name="name" value="RunClassConcept" />
    <property name="caption" value="Run" />
    <property name="shortcut" value="control shift F10" />
    <property name="iconPath" value="${language_descriptor}\icons\run.png" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1205836731344">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205836731345">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521377785">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521377786">
            <property name="name" value="runTool" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208789354894">
              <link role="classifier" targetNodeId="39.~BaseTool" resolveInfo="BaseTool" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214493785467">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214493784960">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1214493784961" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1217420649049">
                  <link role="member" targetNodeId="1217420649048" resolveInfo="project" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.GetToolOperation" id="1214493787601">
                <link role="tool" targetNodeId="1208789093348" resolveInfo="Run Class" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208521377807">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521377808">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521377809">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521377810">
                <property name="name" value="component" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1208521377811">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521377812">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521377813">
                      <link role="baseMethodDeclaration" targetNodeId="39.~BaseTool.getComponent():javax.swing.JComponent" resolveInfo="getComponent" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521377814">
                      <link role="variableDeclaration" targetNodeId="1208521377786" resolveInfo="testTool" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521464320">
                    <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521459504">
                  <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521490852">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521490853">
                <property name="name" value="classRunner" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034572585">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034572587">
                    <link role="baseMethodDeclaration" targetNodeId="1208521093196" resolveInfo="ClassRunner" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521503001">
                      <link role="variableDeclaration" targetNodeId="1208521377810" resolveInfo="component" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521490854">
                  <link role="classifier" targetNodeId="1208521059570" resolveInfo="ClassRunner" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521508445">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521509003">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521508446">
                  <link role="variableDeclaration" targetNodeId="1208521490853" resolveInfo="classRunner" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521516060">
                  <link role="baseMethodDeclaration" targetNodeId="1208521105849" resolveInfo="run" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521529019">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208521529020" />
                    <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208521529021">
                      <link role="member" targetNodeId="1206100493748" resolveInfo="nodes" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208789311380">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208789357731">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208789311381">
                  <link role="variableDeclaration" targetNodeId="1208521377786" resolveInfo="runTool" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208789364805">
                  <link role="baseMethodDeclaration" targetNodeId="39.~BaseTool.openToolLater(boolean):void" resolveInfo="openToolLater" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1212511588965">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208521377832">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521377834">
              <link role="variableDeclaration" targetNodeId="1208521377786" resolveInfo="testTool" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208521377833" />
          </node>
        </node>
      </node>
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1206094802235">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206094802236">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1206094805582">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1206094805583">
            <property name="name" value="classConcept" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1206094805584">
              <link role="classConcept" targetNodeId="1208521059570" resolveInfo="ClassRunner" />
              <link role="baseMethodDeclaration" targetNodeId="1208521290484" resolveInfo="getClassConcept" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208352800787">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208352800788" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1208352801415">
                  <link role="member" targetNodeId="1206100493748" resolveInfo="nodes" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1206094805588">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206094805589">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094805590">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206094805591">
              <link role="variableDeclaration" targetNodeId="1206094805583" resolveInfo="classConcept" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1206094819883" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206094805593">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206094830541">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1206094832355">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1206094837279">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206094837280">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206094839876">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094843034">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1206094843035" />
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206094843036">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1206094843037">
                      <link role="conceptMethodDeclaration" targetNodeId="3v.1213877355884" resolveInfo="getMainMethod" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1206094843038">
                      <link role="variableDeclaration" targetNodeId="1206094805583" resolveInfo="classConcept" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1207320202659">
      <property name="keycode" value="VK_F10" />
      <property name="modifiers" value="ctrl+shift" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1206100493748">
      <property name="name" value="nodes" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1206100493749" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1206100500158" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1217420649048">
      <property name="name" value="project" />
      <link role="key" targetNodeId="54.~MPSDataKeys.MPS_PROJECT" resolveInfo="MPS_PROJECT" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1217420649403">
      <property name="name" value="operationContext" />
      <link role="key" targetNodeId="54.~MPSDataKeys.OPERATION_CONTEXT" resolveInfo="OPERATION_CONTEXT" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1205860094685">
    <property name="name" value="BaseLanguageProjectNodePopup" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1205860136250">
      <link role="modifiedGroup" targetNodeId="3.1204991215587" resolveInfo="ProjectPaneNodeActions" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1207148332827">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1205860134622">
        <link role="action" targetNodeId="1205836731341" resolveInfo="RunClassConcept" />
      </node>
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1220025881711">
        <link role="action" targetNodeId="1220025720938" resolveInfo="SubstitutionTest" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1205860902244">
    <property name="name" value="RunComponent" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1213184110921">
      <property name="name" value="myConsoleView" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1213184110922" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213184136579">
        <link role="classifier" targetNodeId="41.~ConsoleView" resolveInfo="ConsoleView" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1205861021916">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205861021919">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205861253011">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205861253012">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205861253013">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.setLayout(java.awt.LayoutManager):void" resolveInfo="setLayout" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034542507">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034542509">
                  <link role="baseMethodDeclaration" targetNodeId="17.~BorderLayout.&lt;init&gt;()" resolveInfo="BorderLayout" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205861253014" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213184185036">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213184188887">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213184189530">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213184221290">
                <link role="baseMethodDeclaration" targetNodeId="44.~ConsoleViewImpl.&lt;init&gt;(com.intellij.openapi.project.Project)" resolveInfo="ConsoleViewImpl" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213184229806">
                  <link role="variableDeclaration" targetNodeId="1213184178486" resolveInfo="project" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213184185037">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1213184185038">
                <link role="fieldDeclaration" targetNodeId="1213184110921" resolveInfo="myConsoleView" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1213184185039" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205861189885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205861189886">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1205861189887">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component,java.lang.Object):void" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213184436326">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213184433023">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1213184433024">
                    <link role="fieldDeclaration" targetNodeId="1213184110921" resolveInfo="myConsoleView" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1213184433025" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213184438232">
                  <link role="baseMethodDeclaration" targetNodeId="45.~ComponentContainer.getComponent():javax.swing.JComponent" resolveInfo="getComponent" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1215111279756">
                <link role="classifier" targetNodeId="17.~BorderLayout" resolveInfo="BorderLayout" />
                <link role="variableDeclaration" targetNodeId="17.~BorderLayout.CENTER" resolveInfo="CENTER" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205861189888" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205861021918" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205861021917" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213184178486">
        <property name="name" value="project" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213184178487">
          <link role="classifier" targetNodeId="43.~Project" resolveInfo="Project" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205861482029">
      <property name="name" value="clear" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205861482032">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1205861488071">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205861489776">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1205861488072">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1213184235089">
                <link role="fieldDeclaration" targetNodeId="1213184110921" resolveInfo="myConsoleView" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1205861488074" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213184237286">
              <link role="baseMethodDeclaration" targetNodeId="41.~ConsoleView.clear():void" resolveInfo="clear" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205861482030" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205861482031" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1205861498911">
      <property name="name" value="append" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1205861503506">
        <property name="name" value="m" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205861503507">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1205861498914">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213184240867">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213184241355">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213184240868">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1213184240869">
                <link role="fieldDeclaration" targetNodeId="1213184110921" resolveInfo="myConsoleView" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1213184240870" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213184243077">
              <link role="baseMethodDeclaration" targetNodeId="41.~ConsoleView.print(java.lang.String,com.intellij.execution.ui.ConsoleViewContentType):void" resolveInfo="print" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213184812589">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213184851341">
                  <property name="value" value="\n" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213184244187">
                  <link role="variableDeclaration" targetNodeId="1205861503506" resolveInfo="m" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213184253033">
                <link role="classifier" targetNodeId="41.~ConsoleViewContentType" resolveInfo="ConsoleViewContentType" />
                <link role="variableDeclaration" targetNodeId="41.~ConsoleViewContentType.NORMAL_OUTPUT" resolveInfo="NORMAL_OUTPUT" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205861498913" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1205861498912" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1214210830127">
      <property name="name" value="dispose" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1214210830128" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1214210830129" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214210830130">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214386080929">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1214386083082">
            <link role="baseMethodDeclaration" targetNodeId="50.~Disposer.dispose(com.intellij.openapi.Disposable):void" resolveInfo="dispose" />
            <link role="classConcept" targetNodeId="50.~Disposer" resolveInfo="Disposer" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214386086318">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1214386086319">
                <link role="fieldDeclaration" targetNodeId="1213184110921" resolveInfo="myConsoleView" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1214386086320" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1205860968104">
      <link role="classifier" targetNodeId="16.~JPanel" resolveInfo="JPanel" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1205860902245" />
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1207052992292">
    <property name="package" value="Actions.ExtractMethod" />
    <property name="name" value="ShowInternalExtractMethodStuff" />
    <property name="caption" value="Show Internal Stuff Of Extract Method" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1207052992293">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207052992294">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207229530625">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207229530626">
            <property name="name" value="processor" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229530627">
              <link role="classifier" targetNodeId="1207229065523" resolveInfo="ExtractMethodRefactoringProcessor" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034570665">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034570667">
                <link role="baseMethodDeclaration" targetNodeId="1207229148695" resolveInfo="ExtractMethodRefactoringProcessor_2" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207229542868">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229542869">
                    <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229542870">
                    <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1207229542871">
                      <link role="member" targetNodeId="1207053014333" resolveInfo="nodes" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1207229542872" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229545765">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229546767">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207229545766">
              <link role="variableDeclaration" targetNodeId="1207229530626" resolveInfo="processor" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229548097">
              <link role="baseMethodDeclaration" targetNodeId="1207229249479" resolveInfo="dump" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1207053014333">
      <property name="name" value="nodes" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207053014334" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207053064501">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1207229065523">
    <property name="package" value="Actions.ExtractMethod" />
    <property name="name" value="ExtractMethodRefactoringProcessor_2" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207229213498">
      <property name="name" value="getContainer" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207229217630">
        <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229215145" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229213501">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207229225475">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229233250">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229229933">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229229227">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229229228">
                  <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229229229" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1207229231295" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1207229235206">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207229235207">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905986">
                  <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207229264706">
      <property name="name" value="getInputVariables" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229268964">
        <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229266822" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229264709">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207229290379">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207229290380">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229290381">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207229301652">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1207229301653">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229301654">
                  <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207229278496">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207229278497">
            <property name="name" value="st" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229308047">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229308048">
              <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229308049" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229278499">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207229316243">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207229316244">
                <property name="name" value="ref" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229334486">
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207229333874">
                  <link role="variable" targetNodeId="1207229278497" resolveInfo="st" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1207229337193">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207229340259">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905953">
                      <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229316246">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207229345499">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207233391022">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233393355">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207233393356">
                        <link role="baseMethodDeclaration" targetNodeId="1207233293320" resolveInfo="isLocal" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233395597">
                          <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207233394751">
                            <link role="variable" targetNodeId="1207229316244" resolveInfo="ref" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233396338">
                            <link role="link" targetNodeId="1.1068581517664" />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207233393357" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207229347801">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229349964">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207229349070">
                          <link role="variableDeclaration" targetNodeId="1207229290380" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207229353484">
                          <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229356100">
                            <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207229354863">
                              <link role="variable" targetNodeId="1207229316244" resolveInfo="ref" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207229358573">
                              <link role="link" targetNodeId="1.1068581517664" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229345501">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229359701">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229360658">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207229359702">
                          <link role="variableDeclaration" targetNodeId="1207229290380" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1207229364772">
                          <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229369203">
                            <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207229368495">
                              <link role="variable" targetNodeId="1207229316244" resolveInfo="ref" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207229370208">
                              <link role="link" targetNodeId="1.1068581517664" />
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
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207229386238">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207229386239">
            <property name="name" value="st" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229392122">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229392123">
              <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229392124" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229386241">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207229393879">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207229393880">
                <property name="name" value="varDecl" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229398250">
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207229397746">
                  <link role="variable" targetNodeId="1207229386239" resolveInfo="st" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1207229400992">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207229404420">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905981">
                      <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229393882">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229423055">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229423857">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207229423056">
                      <link role="variableDeclaration" targetNodeId="1207229290380" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.RemoveElementOperation" id="1207229428127">
                      <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207229429477">
                        <link role="variable" targetNodeId="1207229393880" resolveInfo="varDecl" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207229382588">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207229383371">
            <link role="variableDeclaration" targetNodeId="1207229290380" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207233293320">
      <property name="name" value="isLocal" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1207233352299" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207233293322" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207233293323">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207233360818">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1207233379748">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233382143">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207233381454">
                <link role="variableDeclaration" targetNodeId="1207233354785" resolveInfo="var" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207233383692">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207233386755">
                  <link role="conceptDeclaration" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233362415">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207233361820">
                <link role="variableDeclaration" targetNodeId="1207233354785" resolveInfo="var" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207233371339">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207233377856">
                  <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207233354785">
        <property name="name" value="var" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207233354786">
          <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207229908129">
      <property name="name" value="getOutputVariables" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229966448">
        <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229910615" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229908132">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230836876">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230836877">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207230836878">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207230845429">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1207230845430">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207230845431">
                  <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230276018">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230276019">
            <property name="name" value="instructions" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230276020">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230276021">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034573530">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034573532">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230276023">
                  <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230002462">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230002463">
            <property name="name" value="exitPoints" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230161593">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230166345">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034570381">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034570399">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230227344">
                  <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207230242382">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207230242383">
            <property name="name" value="st" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230245497">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207230245498">
              <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207230245499" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230242385">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207230288168">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230288874">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230288169">
                  <link role="variableDeclaration" targetNodeId="1207230276019" resolveInfo="instructions" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230290018">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230320744">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230320427">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207230320428">
                        <link role="fieldDeclaration" targetNodeId="1207229163948" resolveInfo="myProgram" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207230320429" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230324045">
                      <link role="baseMethodDeclaration" targetNodeId="25.~Program.getInstructionsFor(java.lang.Object):java.util.List" resolveInfo="getInstructionsFor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207230326064">
                        <link role="variable" targetNodeId="1207230242383" resolveInfo="st" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207230358573">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207230358574">
            <property name="name" value="instr" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230365158">
            <link role="variableDeclaration" targetNodeId="1207230276019" resolveInfo="instructions" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230358576">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207230420710">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230421325">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230420711">
                  <link role="variableDeclaration" targetNodeId="1207230002463" resolveInfo="exitPoints" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230423283">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230447589">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207230447115">
                      <link role="variable" targetNodeId="1207230358574" resolveInfo="instr" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230449970">
                      <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.succ():java.util.Set" resolveInfo="succ" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207230451804">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230452435">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230451805">
              <link role="variableDeclaration" targetNodeId="1207230002463" resolveInfo="exitPoints" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230455066">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.removeAll(java.util.Collection):boolean" resolveInfo="removeAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230458884">
                <link role="variableDeclaration" targetNodeId="1207230276019" resolveInfo="instructions" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207230697763">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207230697764">
            <property name="name" value="instr" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230700209">
            <link role="variableDeclaration" targetNodeId="1207230002463" resolveInfo="exitPoints" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230697766">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230708559">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230708560">
                <property name="name" value="reaching" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230708561">
                  <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230712084">
                    <link role="classifier" targetNodeId="28.~WriteInstruction" resolveInfo="WriteInstruction" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230715589">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230715065">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207230715066">
                      <link role="fieldDeclaration" targetNodeId="1207229801514" resolveInfo="myReachingDefinition" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207230715067" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230717564">
                    <link role="baseMethodDeclaration" targetNodeId="25.~AnalysisResult.get(jetbrains.mps.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207230720398">
                      <link role="variable" targetNodeId="1207230697764" resolveInfo="instr" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230723062">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230723063">
                <property name="name" value="live" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230723064">
                  <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207230729998">
                    <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207230758843">
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207230758844">
                    <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230758846">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230758847">
                      <link role="baseMethodDeclaration" targetNodeId="25.~AnalysisResult.get(jetbrains.mps.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207230758848">
                        <link role="variable" targetNodeId="1207230697764" resolveInfo="instr" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230758849">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207230758850">
                        <link role="fieldDeclaration" targetNodeId="1207229860394" resolveInfo="myLiveVariables" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207230758851" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207230773207">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207230773208">
                <property name="name" value="write" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230777425">
                <link role="variableDeclaration" targetNodeId="1207230708560" resolveInfo="reaching" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230787329">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207230790039">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207230790040">
                    <property name="name" value="varDecl" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207230790041">
                      <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1207230822146">
                      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207230822147">
                        <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230822148">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230822149">
                          <link role="baseMethodDeclaration" targetNodeId="28.~WriteInstruction.getVariable():java.lang.Object" resolveInfo="getVariable" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207230822150">
                          <link role="variable" targetNodeId="1207230773208" resolveInfo="write" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207230825226">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230825227">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207230926155">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207230926156">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207230938150">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230939127">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230938151">
                              <link role="variableDeclaration" targetNodeId="1207230836877" resolveInfo="result" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1207230942682">
                              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230943449">
                                <link role="variableDeclaration" targetNodeId="1207230790040" resolveInfo="varDecl" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1207230928305">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230930205">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230929042">
                            <link role="variableDeclaration" targetNodeId="1207230836877" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1207230932119">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230936815">
                              <link role="variableDeclaration" targetNodeId="1207230790040" resolveInfo="varDecl" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207236856460">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236859037">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236858671">
                        <link role="variableDeclaration" targetNodeId="1207230276019" resolveInfo="instructions" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207236860903">
                        <link role="baseMethodDeclaration" targetNodeId="4.~Set.contains(java.lang.Object):boolean" resolveInfo="contains" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207236861998">
                          <link role="variable" targetNodeId="1207230773208" resolveInfo="write" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207230828134">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230827205">
                        <link role="variableDeclaration" targetNodeId="1207230723063" resolveInfo="live" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207230829783">
                        <link role="baseMethodDeclaration" targetNodeId="4.~Set.contains(java.lang.Object):boolean" resolveInfo="contains" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230830799">
                          <link role="variableDeclaration" targetNodeId="1207230790040" resolveInfo="varDecl" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207230848705">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207230849442">
            <link role="variableDeclaration" targetNodeId="1207230836877" resolveInfo="result" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207236557967">
      <property name="name" value="collectInputParameters" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1207236663465" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207236557969" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207236557970">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207236578465">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1207236589147">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207236589697">
              <property name="value" value="1" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236584784">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236582609">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207236582610">
                  <link role="baseMethodDeclaration" targetNodeId="1207229908129" resolveInfo="getOutputVariables" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207236582611" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1207236587614" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207236578467">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207236598795">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207236615048">
                <link role="baseMethodDeclaration" targetNodeId="16.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object):void" resolveInfo="showMessageDialog" />
                <link role="classConcept" targetNodeId="16.~JOptionPane" resolveInfo="JOptionPane" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236617800">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207236617455">
                    <link role="variableDeclaration" targetNodeId="1207236595246" resolveInfo="context" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207236619630">
                    <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getMainFrame():java.awt.Frame" resolveInfo="getMainFrame" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207236620741">
                  <property name="value" value="Method has multiple output values" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207236627681">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1207236665905">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207236642950">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207236644157">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207236649208">
              <link role="baseMethodDeclaration" targetNodeId="16.~JOptionPane.showInputDialog(java.awt.Component,java.lang.Object):java.lang.String" resolveInfo="showInputDialog" />
              <link role="classConcept" targetNodeId="16.~JOptionPane" resolveInfo="JOptionPane" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236652616">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207236652272">
                  <link role="variableDeclaration" targetNodeId="1207236595246" resolveInfo="context" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207236654118">
                  <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getMainFrame():java.awt.Frame" resolveInfo="getMainFrame" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207236655949">
                <property name="value" value="Enter Method Name:" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236642951">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207236642952">
                <link role="fieldDeclaration" targetNodeId="1207236569286" resolveInfo="myMethodName" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207236642953" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207236673100">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207236676747">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207236677891" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236674603">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207236674134" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207236676168">
                <link role="fieldDeclaration" targetNodeId="1207236569286" resolveInfo="myMethodName" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207236595246">
        <property name="name" value="context" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207236595247">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207231357303">
      <property name="name" value="doExtract" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207231357304" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207231357305" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231357306">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231372482">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231372483">
            <property name="name" value="inputVariables" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207231372484">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231379204">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207231379205">
                <link role="baseMethodDeclaration" targetNodeId="1207229264706" resolveInfo="getInputVariables" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207231379206" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231381115">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231381116">
            <property name="name" value="outputVarialbes" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207231381117">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231392400">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207231392401">
                <link role="baseMethodDeclaration" targetNodeId="1207229908129" resolveInfo="getOutputVariables" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207231392402" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207231401061">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231401062">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231458517">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231460425">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1207231458518">
                  <link role="classifier" targetNodeId="9.~System" resolveInfo="System" />
                  <link role="variableDeclaration" targetNodeId="9.~System.out" resolveInfo="out" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207231463209">
                  <link role="baseMethodDeclaration" targetNodeId="13.~PrintStream.println(java.lang.String):void" resolveInfo="println" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207231464336">
                    <property name="value" value="More than output. Terminating" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207231453841" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1207231451446">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207231452277">
              <property name="value" value="1" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231403487">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231402221">
                <link role="variableDeclaration" targetNodeId="1207231381116" resolveInfo="outputVarialbes" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1207231447053" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231525226">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231525227">
            <property name="name" value="output" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231525228">
              <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231532546">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231531200">
                <link role="variableDeclaration" targetNodeId="1207231381116" resolveInfo="outputVarialbes" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1207231536659" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207231690537">
          <property name="value" value="prepare new method" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231483731">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231483732">
            <property name="name" value="newMethod" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231483733">
              <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231510310">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231505196">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231502145">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207231502146">
                    <link role="baseMethodDeclaration" targetNodeId="1207229213498" resolveInfo="getContainer" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207231502147" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1207231509761" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_NewInstance" id="1207231512891" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207231539912">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231539913">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231546616">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231551002">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231547261">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231546617">
                    <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207231550499">
                    <link role="link" targetNodeId="1.1068580123133" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1207231552756">
                  <link role="concept" targetNodeId="1.1068581517677" resolveInfo="VoidType" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207231542968">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207231544176" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231542168">
              <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1207231557075">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231557076">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231560252">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231562607">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231561084">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231560253">
                      <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207231562182">
                      <link role="link" targetNodeId="1.1068580123133" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207231579848">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231783839">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231582779">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231581932">
                          <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207231593038">
                          <link role="link" targetNodeId="1.1068431790188" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1207231784878" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231677429">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231681053">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231678137">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231677430">
                <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207231680642">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1207231681823">
              <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207237244187">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207237244188">
                  <link role="fieldDeclaration" targetNodeId="1207236569286" resolveInfo="myMethodName" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207237244189" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231596918">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231598175">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231596919">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207231596920">
                <link role="baseMethodDeclaration" targetNodeId="1207229213498" resolveInfo="getContainer" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207231596921" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation" id="1207231599649">
              <node role="insertedNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231601842">
                <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207231700198">
          <property name="value" value="prepare parameters" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231711425">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231711426">
            <property name="name" value="params" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207231887620">
              <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231889675">
                <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231897273">
                <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034569829">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034569831">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231958220">
                  <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231958221">
                  <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207231741210">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207231741211">
            <property name="name" value="iv" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231745827">
            <link role="variableDeclaration" targetNodeId="1207231372483" resolveInfo="inputVariables" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231741213">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207231749489">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207231749490">
                <property name="name" value="param" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231749491">
                  <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207231755802">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207231755803">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207231755804">
                      <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231758575">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231761514">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231759191">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231758576">
                    <link role="variableDeclaration" targetNodeId="1207231749490" resolveInfo="param" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207231760962">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1207231762755">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231766297">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207231764714">
                      <link role="variable" targetNodeId="1207231741211" resolveInfo="iv" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1207231767225">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231771387">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231774576">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231772003">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231771388">
                    <link role="variableDeclaration" targetNodeId="1207231749490" resolveInfo="param" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207231773837">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207231776051">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231845425">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231841188">
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207231840494">
                        <link role="variable" targetNodeId="1207231741211" resolveInfo="iv" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207231844669">
                        <link role="link" targetNodeId="1.1068431790188" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1207231846511" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207231851132">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231853730">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207231851905">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231851133">
                    <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1207231853005">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1207231858675">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207231864730">
                    <link role="variableDeclaration" targetNodeId="1207231749490" resolveInfo="param" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207232357280">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207232359687">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207232359477">
                  <link role="variableDeclaration" targetNodeId="1207231711426" resolveInfo="params" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207232360867">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207232415466">
                    <link role="variable" targetNodeId="1207231741211" resolveInfo="iv" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207232418209">
                    <link role="variableDeclaration" targetNodeId="1207231749490" resolveInfo="param" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207233579652">
          <property name="value" value="copy body" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207233587233">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207233587234">
            <property name="name" value="st" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233591332">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207233591333">
              <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207233591334" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207233587236">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207233597570">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233621052">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233613627">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233608671">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233597571">
                      <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233613126">
                      <link role="link" targetNodeId="1.1068580123135" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1207233620582">
                    <link role="link" targetNodeId="1.1068581517665" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1207233623070">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233625588">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207233624525">
                      <link role="variable" targetNodeId="1207233587234" resolveInfo="st" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1207233626544" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207234267602">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207234267603">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234278787">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234278788">
                <property name="name" value="ret" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234278789">
                  <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207234283823">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207234283824">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234283825">
                      <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234300142">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234300143">
                <property name="name" value="returnValue" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234300144">
                  <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236343025">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236342164">
                    <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207236345419">
                    <link role="conceptMethodDeclaration" targetNodeId="3v.1213877517482" resolveInfo="createReference" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234287421">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234290644">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234288235">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234287422">
                    <link role="variableDeclaration" targetNodeId="1207234278788" resolveInfo="ret" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207234290300">
                    <link role="link" targetNodeId="1.1068581517676" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207234291990">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234439347">
                    <link role="variableDeclaration" targetNodeId="1207234300143" resolveInfo="returnValue" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234654305">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234661078">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234658091">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234654978">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234654306">
                      <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207234657433">
                      <link role="link" targetNodeId="1.1068580123135" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1207234659718">
                    <link role="link" targetNodeId="1.1068581517665" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1207234662580">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234664145">
                    <link role="variableDeclaration" targetNodeId="1207234278788" resolveInfo="ret" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1207234270420">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207234271407" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234269606">
              <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207233630532">
          <property name="value" value="replace vars" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207233635393">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207233635394">
            <property name="name" value="var" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233695139">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233691979">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233690868">
                <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233694638">
                <link role="link" targetNodeId="1.1068580123135" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1207233696704">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1207233700708">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207781905954">
                  <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207233635396">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207233706506">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233711839">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233710666">
                  <link role="variableDeclaration" targetNodeId="1207231711426" resolveInfo="params" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207233724811">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Map.containsKey(java.lang.Object):boolean" resolveInfo="containsKey" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233752563">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207233751718">
                      <link role="variable" targetNodeId="1207233635394" resolveInfo="var" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233762066">
                      <link role="link" targetNodeId="1.1068581517664" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207233706508">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207233817781">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207233817782">
                    <property name="name" value="parm" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207233817783">
                      <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233832427">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233831410">
                        <link role="variableDeclaration" targetNodeId="1207231711426" resolveInfo="params" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207233834304">
                        <link role="baseMethodDeclaration" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233929315">
                          <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207233914042">
                            <link role="variable" targetNodeId="1207233635394" resolveInfo="var" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233930989">
                            <link role="link" targetNodeId="1.1068581517664" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207233767661">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207233767662">
                    <property name="name" value="parmRef" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207233767663">
                      <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207233802947">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207233802948">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207233802949">
                          <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207233967559">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233978439">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207233968451">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233967560">
                        <link role="variableDeclaration" targetNodeId="1207233767662" resolveInfo="ref" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207233977969">
                        <link role="link" targetNodeId="1.1070567982819" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207233986362">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207233988381">
                        <link role="variableDeclaration" targetNodeId="1207233817782" resolveInfo="parm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234048912">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234049758">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207234048913">
                      <link role="variable" targetNodeId="1207233635394" resolveInfo="var" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1207234052245">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234054341">
                        <link role="variableDeclaration" targetNodeId="1207233767662" resolveInfo="ref" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1207234820606">
          <property name="value" value="replace statements with method call" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234789328">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234789329">
            <property name="name" value="callExpression" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234789330">
              <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234818162">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234818163">
            <property name="name" value="call" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234818164">
              <link role="concept" targetNodeId="1.1204053956946" resolveInfo="IMethodCall" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207234797474">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207234797475">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234813720">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234813721">
                <property name="name" value="ce" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234813722">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207234841822">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207234841823">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234841824">
                      <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234843373">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234847269">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234843969">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234843374">
                    <link role="variableDeclaration" targetNodeId="1207234813721" resolveInfo="ce" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207234846768">
                    <link role="link" targetNodeId="1.1197027771414" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1207234848584">
                  <link role="concept" targetNodeId="1.1070475354124" resolveInfo="ThisExpression" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234862017">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234862018">
                <property name="name" value="callOperation" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234862019">
                  <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207234871428">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207234871429">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234871430">
                      <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235540239">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207235546120">
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207235554061">
                  <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235552373">
                    <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235541320">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235540240">
                    <link role="variableDeclaration" targetNodeId="1207234862018" resolveInfo="callOperation" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207235545290">
                    <link role="link" targetNodeId="1.1202948736718" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234851836">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234854653">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234852603">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234851837">
                    <link role="variableDeclaration" targetNodeId="1207234813721" resolveInfo="ce" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207234853777">
                    <link role="link" targetNodeId="1.1197027833540" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207234878134">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234880184">
                    <link role="variableDeclaration" targetNodeId="1207234862018" resolveInfo="callOperation" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234883595">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207234885254">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234887086">
                  <link role="variableDeclaration" targetNodeId="1207234862018" resolveInfo="callOperation" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234883596">
                  <link role="variableDeclaration" targetNodeId="1207234818163" resolveInfo="call" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234890980">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207234892717">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234893548">
                  <link role="variableDeclaration" targetNodeId="1207234813721" resolveInfo="ce" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234890981">
                  <link role="variableDeclaration" targetNodeId="1207234789329" resolveInfo="callExpression" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234800324">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234798915">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207234798916">
                <link role="baseMethodDeclaration" targetNodeId="1207229213498" resolveInfo="getContainer" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207234798917" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207234806530">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207234810719">
                <link role="conceptDeclaration" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1207234895410">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207234895411">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207234901054">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207234901055">
                  <property name="name" value="ce" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234901056">
                    <link role="concept" targetNodeId="1.1081236700937" resolveInfo="StaticMethodCall" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207234912420">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207234912421">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207234912422">
                        <link role="concept" targetNodeId="1.1081236700937" resolveInfo="StaticMethodCall" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234915456">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234925355">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234921350">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234915457">
                      <link role="variableDeclaration" targetNodeId="1207234901055" resolveInfo="call" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207234924837">
                      <link role="link" targetNodeId="1.1081236769987" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1207234926764">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1207234929818">
                      <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234928362">
                        <link role="variableDeclaration" targetNodeId="1207231483732" resolveInfo="newMethod" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234941765">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207234943993">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234951076">
                    <link role="variableDeclaration" targetNodeId="1207234901055" resolveInfo="ce" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234941766">
                    <link role="variableDeclaration" targetNodeId="1207234818163" resolveInfo="call" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234953268">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207234955069">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234955931">
                    <link role="variableDeclaration" targetNodeId="1207234901055" resolveInfo="ce" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234953269">
                    <link role="variableDeclaration" targetNodeId="1207234789329" resolveInfo="callExpression" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207234969703">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207234969704">
            <property name="name" value="iv" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207234972960">
            <link role="variableDeclaration" targetNodeId="1207231372483" resolveInfo="inputVariables" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207234969706">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235091486">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235094234">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235091834">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235091487">
                    <link role="variableDeclaration" targetNodeId="1207234818163" resolveInfo="call" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1207235093355">
                    <link role="link" targetNodeId="1.1068499141038" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1207235095895">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236369021">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207236368597">
                      <link role="variable" targetNodeId="1207234969704" resolveInfo="iv" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207236372166">
                      <link role="conceptMethodDeclaration" targetNodeId="3v.1213877517482" resolveInfo="createReference" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1207235129135">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207235129136">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207235177048">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207235177049">
                <property name="name" value="exprStatement" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235177050">
                  <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207235188818">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207235188819">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235188820">
                      <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235190400">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207235192836">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235195233">
                  <link role="variableDeclaration" targetNodeId="1207234789329" resolveInfo="callExpression" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235191093">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235190401">
                    <link role="variableDeclaration" targetNodeId="1207235177049" resolveInfo="exprStatement" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207235192395">
                    <link role="link" targetNodeId="1.1068580123156" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235197707">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235203521">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235198464">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235197708">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207235197709">
                      <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207235197710" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetLastOperation" id="1207235199969" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation" id="1207235204933">
                  <node role="insertedNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235206563">
                    <link role="variableDeclaration" targetNodeId="1207235177049" resolveInfo="exprStatement" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207235173647">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1207235174872" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235172534">
              <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1207235209134">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207235209135">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207235212905">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207235212906">
                  <property name="name" value="assignment" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235212907">
                    <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207235219075">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207235219076">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235219077">
                        <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207235242219">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207235242220">
                  <property name="name" value="ref" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235242221">
                    <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207236383954">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207236383499">
                      <link role="variableDeclaration" targetNodeId="1207231525227" resolveInfo="output" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1207236386457">
                      <link role="conceptMethodDeclaration" targetNodeId="3v.1213877517482" resolveInfo="createReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235335047">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207235339749">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235341489">
                    <link role="variableDeclaration" targetNodeId="1207235242220" resolveInfo="ref" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235335849">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235335048">
                      <link role="variableDeclaration" targetNodeId="1207235212906" resolveInfo="assignment" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207235338948">
                      <link role="link" targetNodeId="1.1068498886295" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235344260">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207235346868">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235353905">
                    <link role="variableDeclaration" targetNodeId="1207234789329" resolveInfo="callExpression" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235344812">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235344261">
                      <link role="variableDeclaration" targetNodeId="1207235212906" resolveInfo="assignment" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207235346348">
                      <link role="link" targetNodeId="1.1068498886297" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207235373892">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207235373893">
                  <property name="name" value="exprSt" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235373894">
                    <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207235379061">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1207235379062">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1207235379063">
                        <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235381112">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207235386166">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235388813">
                    <link role="variableDeclaration" targetNodeId="1207235212906" resolveInfo="assignment" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235381773">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235381113">
                      <link role="variableDeclaration" targetNodeId="1207235373893" resolveInfo="exprSt" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1207235383856">
                      <link role="link" targetNodeId="1.1068580123156" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207235361254">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235391083">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235364581">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207235362134">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207235361255" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207235363811">
                        <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetLastOperation" id="1207235366726" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation" id="1207235392401">
                    <node role="insertedNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207235395062">
                      <link role="variableDeclaration" targetNodeId="1207235373893" resolveInfo="exprSt" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1207234692466">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1207234692467">
            <property name="name" value="st" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234758706">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207234758707">
              <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207234758708" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207234692469">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207234759600">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207234759947">
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1207234759601">
                  <link role="variable" targetNodeId="1207234692467" resolveInfo="st" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1207234761184" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1207229249479">
      <property name="name" value="dump" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207229250061" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207229249481" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229249482">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229505474">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229507755">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1207229505475">
              <link role="classifier" targetNodeId="9.~System" resolveInfo="System" />
              <link role="variableDeclaration" targetNodeId="9.~System.out" resolveInfo="out" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229511883">
              <link role="baseMethodDeclaration" targetNodeId="13.~PrintStream.println(java.lang.String):void" resolveInfo="println" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1207229517135">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229518778">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229518779">
                    <link role="baseMethodDeclaration" targetNodeId="1207229264706" resolveInfo="getInputVariables" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229518780" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207229512649">
                  <property name="value" value="input = " />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229984012">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229988341">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1207229984013">
              <link role="classifier" targetNodeId="9.~System" resolveInfo="System" />
              <link role="variableDeclaration" targetNodeId="9.~System.out" resolveInfo="out" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229991546">
              <link role="baseMethodDeclaration" targetNodeId="13.~PrintStream.println(java.lang.String):void" resolveInfo="println" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1207229995752">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229997787">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229997270" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229999351">
                    <link role="baseMethodDeclaration" targetNodeId="1207229908129" resolveInfo="getOutputVariables" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1207229992391">
                  <property name="value" value="output = " />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1207229148695">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1207229148696" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207229148697" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207229148698">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229156342">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229157080">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229156343">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229156344">
                <link role="fieldDeclaration" targetNodeId="1207229087680" resolveInfo="myStatements" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229156345" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1207229158567">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207229159678">
                <link role="variableDeclaration" targetNodeId="1207229152121" resolveInfo="statements" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229180080">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207229181381">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229199399">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1207229198086">
                <link role="baseMethodDeclaration" targetNodeId="26.~DataFlowManager.getInstance():jetbrains.mps.dataFlow.DataFlowManager" resolveInfo="getInstance" />
                <link role="classConcept" targetNodeId="26.~DataFlowManager" resolveInfo="DataFlowManager" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229201276">
                <link role="baseMethodDeclaration" targetNodeId="26.~DataFlowManager.buildProgramFor(jetbrains.mps.smodel.SNode):jetbrains.mps.dataFlow.framework.Program" resolveInfo="buildProgramFor" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229243101">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229243102">
                    <link role="baseMethodDeclaration" targetNodeId="1207229213498" resolveInfo="getContainer" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229243103" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229180081">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229180082">
                <link role="fieldDeclaration" targetNodeId="1207229163948" resolveInfo="myProgram" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229180083" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229826867">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207229827512">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229828140">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229828141">
                <link role="baseMethodDeclaration" targetNodeId="25.~Program.analyze(jetbrains.mps.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034573233">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034573235">
                    <link role="baseMethodDeclaration" targetNodeId="27.~ReachingDefinitionsAnalyzer.&lt;init&gt;()" resolveInfo="ReachingDefinitionsAnalyzer" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229828143">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229828144" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229828145">
                  <link role="fieldDeclaration" targetNodeId="1207229163948" resolveInfo="myProgram" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229826868">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229826869">
                <link role="fieldDeclaration" targetNodeId="1207229801514" resolveInfo="myReachingDefinition" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229826870" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207229954396">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1207229957635">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229960689">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229959217">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229958576" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229960438">
                  <link role="fieldDeclaration" targetNodeId="1207229163948" resolveInfo="myProgram" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207229961644">
                <link role="baseMethodDeclaration" targetNodeId="25.~Program.analyze(jetbrains.mps.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034571862">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034571864">
                    <link role="baseMethodDeclaration" targetNodeId="27.~LivenessAnalyzer.&lt;init&gt;()" resolveInfo="LivenessAnalyzer" />
                  </node>
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207229955601">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1207229954397" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1207229956993">
                <link role="fieldDeclaration" targetNodeId="1207229860394" resolveInfo="myLiveVariables" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207229152121">
        <property name="name" value="statements" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229152122">
          <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1207229087680">
      <property name="name" value="myStatements" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229142237" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229135002">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1207229146770">
        <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1207229146771">
          <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207229146772">
            <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1207229163948">
      <property name="name" value="myProgram" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229803810" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229173907">
        <link role="classifier" targetNodeId="25.~Program" resolveInfo="Program" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1207229801514">
      <property name="name" value="myReachingDefinition" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229805844" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229808392">
        <link role="classifier" targetNodeId="25.~AnalysisResult" resolveInfo="AnalysisResult" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229810472">
          <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229856422">
            <link role="classifier" targetNodeId="28.~WriteInstruction" resolveInfo="WriteInstruction" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1207229860394">
      <property name="name" value="myLiveVariables" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207229934357" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229941171">
        <link role="classifier" targetNodeId="25.~AnalysisResult" resolveInfo="AnalysisResult" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229943704">
          <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207229945706">
            <link role="classifier" targetNodeId="9.~Object" resolveInfo="Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1207236569286">
      <property name="name" value="myMethodName" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1207236569287" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207236571777">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207229065524" />
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.FileGeneratorPluginDeclaration" id="1207323716836">
    <node role="getFileGeneratorBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.GetFileGeneratorBlock" id="1207323716837">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207323716838">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207323758419">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034572212">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034572214">
              <link role="baseMethodDeclaration" targetNodeId="32.~JavaFileGenerator.&lt;init&gt;()" resolveInfo="JavaFileGenerator" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1207231065572">
    <property name="package" value="Actions.ExtractMethod" />
    <property name="caption" value="Extract Method" />
    <property name="name" value="ExtractMethod" />
    <property name="shortcut" value="control alt M" />
    <property name="outsideCommandExecution" value="true" />
    <node role="methodDeclaration" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodDeclaration" id="1207311905209">
      <property name="name" value="isExpression" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1207311907165" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207311905211">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1207311918794">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1207311944276">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207311951972">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207311948765">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207311948077">
                  <link role="variableDeclaration" targetNodeId="1207311915088" resolveInfo="nodes" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1207311949752" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1207311954036">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1207311955896">
                  <link role="conceptDeclaration" targetNodeId="1.1068431790191" resolveInfo="Expression" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1207311942506">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207311921875">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1207311921249">
                  <link role="variableDeclaration" targetNodeId="1207311915088" resolveInfo="nodes" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1207311940740" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1207311943212">
                <property name="value" value="1" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1207311915088">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207311930675" />
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1207231065600">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1207231065601">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207312028925">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207312028926">
            <property name="name" value="kind" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207330085006">
              <link role="classifier" targetNodeId="33.~ExtractMethodKind" resolveInfo="ExtractMethodKind" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1216219007864">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1216219007865">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216219007866">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1216219281625">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216219281626">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216219281627">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220357362370">
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216219281630">
                        <link role="variableDeclaration" targetNodeId="1207312028926" resolveInfo="kind" />
                      </node>
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1220957317881">
                        <link role="enumConstantDeclaration" targetNodeId="33.~ExtractMethodKind.FROM_STATEMENTS" resolveInfo="FROM_STATEMENTS" />
                        <link role="enumClass" targetNodeId="33.~ExtractMethodKind" resolveInfo="ExtractMethodKind" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1216219281631">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216219281632">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216219281633">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220357455791">
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216219281636">
                          <link role="variableDeclaration" targetNodeId="1207312028926" resolveInfo="kind" />
                        </node>
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1220957319492">
                          <link role="enumConstantDeclaration" targetNodeId="33.~ExtractMethodKind.FROM_EXPRESSION" resolveInfo="FROM_EXPRESSION" />
                          <link role="enumClass" targetNodeId="33.~ExtractMethodKind" resolveInfo="ExtractMethodKind" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1216220193328">
                  <link role="baseMethodDeclaration" targetNodeId="33.~ExtractMethodRefactoringAnalyzer.isStatements(java.util.List):boolean" resolveInfo="isStatements" />
                  <link role="classConcept" targetNodeId="33.~ExtractMethodRefactoringAnalyzer" resolveInfo="ExtractMethodRefactoringAnalyzer" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220547416465">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1220547414729" />
                    <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1220547418140">
                      <link role="member" targetNodeId="1207231065615" resolveInfo="nodes" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1207309763639">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1207309763640">
            <property name="name" value="dialog" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1207330094836">
              <link role="classifier" targetNodeId="33.~ExtractMethodDialog" resolveInfo="ExtractMethodDialog" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034546430">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034546432">
                <link role="baseMethodDeclaration" targetNodeId="33.~ExtractMethodDialog.&lt;init&gt;(jetbrains.mps.baseLanguage.refactoring.extractMethod.ExtractMethodKind,jetbrains.mps.workbench.action.ActionEventData)" resolveInfo="ExtractMethodDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207312204030">
                  <link role="variableDeclaration" targetNodeId="1207312028926" resolveInfo="kind" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220957427341">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220957427342">
                    <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.&lt;init&gt;(com.intellij.openapi.actionSystem.AnActionEvent)" resolveInfo="ActionEventData" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_AnActionEvent" id="1220957430280" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1207309779024">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1207309789685">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1207309779025">
              <link role="variableDeclaration" targetNodeId="1207309763640" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1207309798075">
              <link role="baseMethodDeclaration" targetNodeId="55.~BaseDialog.showDialog():void" resolveInfo="showDialog" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216741908466">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216741917092">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216741908467">
              <link role="variableDeclaration" targetNodeId="1207309763640" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216741923893">
              <link role="baseMethodDeclaration" targetNodeId="17.~Window.pack():void" resolveInfo="pack" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1214485942917">
      <property name="modifiers" value="ctrl+alt" />
      <property name="keycode" value="VK_M" />
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1216638687474">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216638687475">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216638960137">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1216638970802">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638963280">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1216638963281" />
              <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierMethodCallOperation" id="1216638963282">
                <link role="member" targetNodeId="1207311905209" resolveInfo="isExpression" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638963283">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1216638963284" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1216638963285">
                    <link role="member" targetNodeId="1207231065615" resolveInfo="nodes" />
                  </node>
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1216638974868">
              <link role="baseMethodDeclaration" targetNodeId="33.~ExtractMethodRefactoringAnalyzer.isStatements(java.util.List):boolean" resolveInfo="isStatements" />
              <link role="classConcept" targetNodeId="33.~ExtractMethodRefactoringAnalyzer" resolveInfo="ExtractMethodRefactoringAnalyzer" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638974869">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1216638974870" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1216638975356">
                  <link role="member" targetNodeId="1207231065615" resolveInfo="nodes" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1207231065615">
      <property name="name" value="nodes" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1207231065616" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1207231065617" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208521059570">
    <property name="package" value="Actions.Runner" />
    <property name="name" value="ClassRunner" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1208521086816">
      <property name="name" value="runComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1208521086817" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521086818">
        <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1208521093196">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521093206">
        <property name="name" value="runComponent" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521093207">
          <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521093199">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521093200">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208521093201">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521093202">
              <link role="variableDeclaration" targetNodeId="1208521093206" resolveInfo="runComponent" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521093203">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521093205" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208521093204">
                <link role="fieldDeclaration" targetNodeId="1208521086816" resolveInfo="runComponent" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208521093197" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208521093198" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208521105849">
      <property name="name" value="run" />
      <property name="isFinal" value="false" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521105851">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1208521105852" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208521105876" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521105853">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521105854">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521105855">
            <property name="name" value="classConcept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208521105860">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208521300081">
              <link role="baseMethodDeclaration" targetNodeId="1208521290484" resolveInfo="getClassConcept" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521301700">
                <link role="variableDeclaration" targetNodeId="1208521105851" resolveInfo="nodes" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105861">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105862">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105864">
              <link role="baseMethodDeclaration" targetNodeId="1208521105878" resolveInfo="run" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105865">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1208521105867">
                  <link role="conceptMethodDeclaration" targetNodeId="48.1213877404258" resolveInfo="getFqName" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105866">
                  <link role="variableDeclaration" targetNodeId="1208521105855" resolveInfo="classConcept" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105873">
                <link role="variableDeclaration" targetNodeId="1208521105855" resolveInfo="classConcept" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105863" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208521105850" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208521105878">
      <property name="name" value="run" />
      <property name="isFinal" value="false" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521105880">
        <property name="name" value="classFQName" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521105881">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521105882">
        <property name="name" value="classConcept" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1209487694850">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521105884">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105886">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105887">
              <link role="baseMethodDeclaration" targetNodeId="1205861482029" resolveInfo="clear" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105888">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208521105889">
                <link role="fieldDeclaration" targetNodeId="1208521086816" resolveInfo="runComponent" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105890" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1210262504325">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1210262504326">
            <property name="name" value="params" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210262504327">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262506487">
                <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1210262541170">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1210262541171">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262541172">
                  <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262546433">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262546434">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210262546435">
              <link role="baseMethodDeclaration" targetNodeId="1210262430923" resolveInfo="addJavaCommand" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210262548640">
                <link role="variableDeclaration" targetNodeId="1210262504326" resolveInfo="params" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210262546436" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262844617">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262844618">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210262844619">
              <link role="baseMethodDeclaration" targetNodeId="1210262651516" resolveInfo="addClassPath" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210262846529">
                <link role="variableDeclaration" targetNodeId="1210262504326" resolveInfo="params" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262849805">
                <link role="variableDeclaration" targetNodeId="1208521105882" resolveInfo="classConcept" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210262844620" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262985818">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262986644">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210262992372">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210263004737">
                <link role="variableDeclaration" targetNodeId="1208521105880" resolveInfo="classFQName" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210262985819">
              <link role="variableDeclaration" targetNodeId="1210262504326" resolveInfo="params" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521105891">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521105892">
            <property name="name" value="p" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034571565">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034571567">
                <link role="baseMethodDeclaration" targetNodeId="9.~ProcessBuilder.&lt;init&gt;(java.util.List)" resolveInfo="ProcessBuilder" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1210263014576">
                  <link role="variableDeclaration" targetNodeId="1210262504326" resolveInfo="params" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521105903">
              <link role="classifier" targetNodeId="9.~ProcessBuilder" resolveInfo="ProcessBuilder" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105904">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105905">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105906">
              <link role="baseMethodDeclaration" targetNodeId="1205861498911" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208521105907">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105909">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105910">
                    <link role="baseMethodDeclaration" targetNodeId="1208519253229" resolveInfo="getCommandString" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105912">
                      <link role="variableDeclaration" targetNodeId="1208521105892" resolveInfo="p" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105913" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208521105908">
                  <property name="value" value="\n\n" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105914">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208521105915">
                <link role="fieldDeclaration" targetNodeId="1208521086816" resolveInfo="runComponent" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105916" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1208521105917">
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1208521105918">
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521105919">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105920">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105921">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208521105927">
                    <link role="classConcept" targetNodeId="12.~Logger" resolveInfo="Logger" />
                    <link role="baseMethodDeclaration" targetNodeId="12.~Logger.getLogger(java.lang.Class):jetbrains.mps.logging.Logger" resolveInfo="getLogger" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208521105928">
                      <link role="classifier" targetNodeId="1208521059570" resolveInfo="ClassRunner" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105922">
                    <link role="baseMethodDeclaration" targetNodeId="12.~Logger.error(java.lang.String,java.lang.Throwable):void" resolveInfo="error" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208521105923">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208521105924">
                        <property name="value" value="Can't run " />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521105925">
                        <link role="variableDeclaration" targetNodeId="1208521105880" resolveInfo="classFQName" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105926">
                      <link role="variableDeclaration" targetNodeId="1208521105929" resolveInfo="e" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521105929">
              <property name="name" value="e" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521105930">
                <link role="classifier" targetNodeId="13.~IOException" resolveInfo="IOException" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521105931">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521105932">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521105933">
                <property name="name" value="pro" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105934">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105935">
                    <link role="variableDeclaration" targetNodeId="1208521105892" resolveInfo="p" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105936">
                    <link role="baseMethodDeclaration" targetNodeId="9.~ProcessBuilder.start():java.lang.Process" resolveInfo="start" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521105937">
                  <link role="classifier" targetNodeId="9.~Process" resolveInfo="Process" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105938">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105939">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105940">
                  <link role="baseMethodDeclaration" targetNodeId="1208521141585" resolveInfo="startOutputReader" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105941">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105943">
                      <link role="baseMethodDeclaration" targetNodeId="9.~Process.getErrorStream():java.io.InputStream" resolveInfo="getErrorStream" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105942">
                      <link role="variableDeclaration" targetNodeId="1208521105933" resolveInfo="pro" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105944" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521105945">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105946">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521105951" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105947">
                  <link role="baseMethodDeclaration" targetNodeId="1208521141585" resolveInfo="startOutputReader" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521105948">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521105950">
                      <link role="baseMethodDeclaration" targetNodeId="9.~Process.getInputStream():java.io.InputStream" resolveInfo="getInputStream" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521105949">
                      <link role="variableDeclaration" targetNodeId="1208521105933" resolveInfo="pro" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208521105879" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1208521105952" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208521141585">
      <property name="name" value="startOutputReader" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521141597">
        <property name="name" value="in" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521141598">
          <link role="classifier" targetNodeId="13.~InputStream" resolveInfo="InputStream" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521141588">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521141589">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521141590">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034541820">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034541822">
                <link role="baseMethodDeclaration" targetNodeId="1208520836063" resolveInfo="ClassRunOutputReader" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521141592">
                  <link role="variableDeclaration" targetNodeId="1208521141597" resolveInfo="in" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521141593">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208521141595" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208521141594">
                    <link role="fieldDeclaration" targetNodeId="1208521086816" resolveInfo="runComponent" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208521141596">
              <link role="baseMethodDeclaration" targetNodeId="9.~Thread.start():void" resolveInfo="start" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208521141587" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208521141586" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1208521290484">
      <property name="name" value="getClassConcept" />
      <property name="isFinal" value="false" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208521236904">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1208521236905" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521236906">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521236907">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521236908">
            <property name="name" value="classConcept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208521236909">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208521236910" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208521236911">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521236912">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1208521236913">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521236914">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208521236915">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208521236916">
                    <property name="name" value="n" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521236917">
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1208521236922">
                        <link role="variable" targetNodeId="1208521236935" resolveInfo="node" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1208521236918">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208521236919">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208521236920">
                            <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                          </node>
                        </node>
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1208521236921" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208521236923">
                      <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208521236924">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208521236928">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208521236929">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208521236930">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521236931">
                          <link role="variableDeclaration" targetNodeId="1208521236916" resolveInfo="n" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521236932">
                          <link role="variableDeclaration" targetNodeId="1208521236908" resolveInfo="classConcept" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1208521236933" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208521236925">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1208521236927" />
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521236926">
                      <link role="variableDeclaration" targetNodeId="1208521236916" resolveInfo="n" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1208521236935">
                <property name="name" value="node" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521236934">
                <link role="variableDeclaration" targetNodeId="1208521236904" resolveInfo="nodes" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208521236936">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208521236938">
              <link role="variableDeclaration" targetNodeId="1208521236904" resolveInfo="nodes" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208521236937" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208521236939">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208521236940">
            <link role="variableDeclaration" targetNodeId="1208521236908" resolveInfo="classConcept" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208521236903">
        <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208521331653" />
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208521065403">
      <link role="classifier" targetNodeId="1208519128358" resolveInfo="BaseRunner" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208521059571" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208519128358">
    <property name="package" value="Actions.Runner" />
    <property name="name" value="BaseRunner" />
    <property name="abstractClass" value="true" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1208519128698">
      <property name="name" value="fs" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128699">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128700">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208519128701">
            <link role="baseMethodDeclaration" targetNodeId="9.~System.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
            <link role="classConcept" targetNodeId="9.~System" resolveInfo="System" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128702">
              <property name="value" value="file.separator" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208519128703" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128704">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1208519128705">
      <property name="name" value="ps" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128707">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128708">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208519128709">
            <link role="baseMethodDeclaration" targetNodeId="9.~System.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
            <link role="classConcept" targetNodeId="9.~System" resolveInfo="System" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128710">
              <property name="value" value="path.separator" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208519128711" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128706">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208519253229">
      <property name="name" value="getCommandString" />
      <property name="isFinal" value="false" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208519128432">
        <property name="name" value="p" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128433">
          <link role="classifier" targetNodeId="9.~ProcessBuilder" resolveInfo="ProcessBuilder" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128434">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208519128435">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128436">
            <property name="name" value="res" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034571123">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034571125">
                <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128437">
              <link role="classifier" targetNodeId="9.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1208519128439">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128442">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208519128443">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128444">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128445">
                  <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128446">
                    <property name="value" value=" " />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128447">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128450">
                    <link role="variableDeclaration" targetNodeId="1208519128436" resolveInfo="res" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128448">
                    <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128449">
                      <link role="variableDeclaration" targetNodeId="1208519128440" resolveInfo="s" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128451">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128452">
              <link role="baseMethodDeclaration" targetNodeId="9.~ProcessBuilder.command():java.util.List" resolveInfo="command" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519128453">
              <link role="variableDeclaration" targetNodeId="1208519128432" resolveInfo="p" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128440">
            <property name="name" value="s" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128441">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128454">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128455">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128457">
              <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128456">
              <link role="variableDeclaration" targetNodeId="1208519128436" resolveInfo="res" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128459">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208519470633" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208519569501">
      <property name="name" value="getJavaCommand" />
      <property name="isFinal" value="false" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128528">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208519128529">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128530">
            <property name="name" value="javaHome" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128531">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128534">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128535">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208519128537">
                    <link role="baseMethodDeclaration" targetNodeId="1208519128698" resolveInfo="fs" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128536">
                    <property name="value" value="bin" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208519128538">
                  <link role="baseMethodDeclaration" targetNodeId="1208519128698" resolveInfo="fs" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208519128532">
                <link role="baseMethodDeclaration" targetNodeId="9.~System.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
                <link role="classConcept" targetNodeId="9.~System" resolveInfo="System" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128533">
                  <property name="value" value="java.home" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128539">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208519128540">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128541">
            <property name="name" value="osName" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208519128542">
              <link role="baseMethodDeclaration" targetNodeId="9.~System.getProperty(java.lang.String):java.lang.String" resolveInfo="getProperty" />
              <link role="classConcept" targetNodeId="9.~System" resolveInfo="System" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128543">
                <property name="value" value="os.name" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128544">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208519128545">
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208519128556">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128557">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128558">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128559">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128561">
                    <link role="variableDeclaration" targetNodeId="1208519128530" resolveInfo="javaHome" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128560">
                    <property name="value" value="java.exe" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1208519128562">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128563">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128564">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128565">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128566">
                      <link role="variableDeclaration" targetNodeId="1208519128530" resolveInfo="javaHome" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128567">
                      <property name="value" value="java" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128568">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128571">
                <link role="variableDeclaration" targetNodeId="1208519128541" resolveInfo="osName" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128569">
                <link role="baseMethodDeclaration" targetNodeId="9.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128570">
                  <property name="value" value="Windows" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128546">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128547">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1208519128548">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128550">
                  <link role="variableDeclaration" targetNodeId="1208519128530" resolveInfo="javaHome" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128549">
                  <property name="value" value="java" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128552">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128554">
              <link role="baseMethodDeclaration" targetNodeId="9.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208519128555">
                <property name="value" value="Mac OS" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128553">
              <link role="variableDeclaration" targetNodeId="1208519128541" resolveInfo="osName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128573">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1210263027701" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210262430923">
      <property name="name" value="addJavaCommand" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210262448702">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210262448703">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262454838">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210262430926">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262465877">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262466747">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210262472997">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262477583">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210262477584">
                  <link role="baseMethodDeclaration" targetNodeId="1208519569501" resolveInfo="getJavaCommand" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210262477585" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262465878">
              <link role="variableDeclaration" targetNodeId="1210262448702" resolveInfo="params" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1210262434305" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210262430924" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210258842999">
      <property name="name" value="addDebug" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210258920492">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210258920493">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210258924606">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210258929029">
        <property name="name" value="port" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210258930875" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210258932527">
        <property name="name" value="suspend" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1210258934285" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210258843002">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210258944630">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210258947372">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210258944631">
              <link role="variableDeclaration" targetNodeId="1210258920492" resolveInfo="params" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210258954830">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210258958411">
                <property name="value" value="-Xdebug" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210258964865">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210258966678">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210258972719">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210258982475">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210258980371">
                  <property name="value" value="-Xrunjdwp:transport=dt_socket,server=y,suspend=" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210259005760">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210259018096">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210259020697">
                      <link role="variableDeclaration" targetNodeId="1210258929029" resolveInfo="port" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210259013971">
                      <property name="value" value=",address=" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1210258986420">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1210258992668">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1210259000706">
                        <property name="charConstant" value="y" />
                      </node>
                      <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1210259003083">
                        <property name="charConstant" value="n" />
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210258996684">
                        <link role="variableDeclaration" targetNodeId="1210258932527" resolveInfo="suspend" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210258964866">
              <link role="variableDeclaration" targetNodeId="1210258920492" resolveInfo="params" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210258843000" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1210263051397" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210259167733">
      <property name="name" value="addMaxHeapSize" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210259194221">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210259195414">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210259197098">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210259177932">
        <property name="name" value="megaBytes" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1210259177933" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210259167736">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210259202372">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210259203128">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210259208896">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210259222485">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1210259225894">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210259224985">
                    <link role="variableDeclaration" targetNodeId="1210259177932" resolveInfo="megaBytes" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210259228455">
                    <property name="value" value="m" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210259214415">
                  <property name="value" value="-Xmx" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210259202373">
              <link role="variableDeclaration" targetNodeId="1210259194221" resolveInfo="params" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1210263054146" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210259167734" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210262651516">
      <property name="name" value="addClassPath" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210262671038">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210262671039">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262672374">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210262674408">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1210262676869" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210262651519">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262752332">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262752333">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210262752334">
              <link role="baseMethodDeclaration" targetNodeId="1210262729668" resolveInfo="addClassPath" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262760700">
                <link role="variableDeclaration" targetNodeId="1210262671038" resolveInfo="params" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262765247">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210262765249" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1210262765248">
                  <link role="baseMethodDeclaration" targetNodeId="1208523375755" resolveInfo="getClasspath" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262766605">
                    <link role="variableDeclaration" targetNodeId="1210262674408" resolveInfo="node" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1210262752335" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210262651517" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1210262663468" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1210262729668">
      <property name="name" value="addClassPath" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210262729685">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1210262729686">
          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262729687">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1210262729688">
        <property name="name" value="classPath" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1210262736076">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1210262729669" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1210262729671">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262729672">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262729673">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210262729675">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1210262729676">
                <property name="value" value="-cp" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262729674">
              <link role="variableDeclaration" targetNodeId="1210262729685" resolveInfo="params" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1210262729677">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1210262729678">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1210262729680">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262746557">
                <link role="variableDeclaration" targetNodeId="1210262729688" resolveInfo="classPath" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1210262729679">
              <link role="variableDeclaration" targetNodeId="1210262729685" resolveInfo="params" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1210262729670" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208523375755">
      <property name="name" value="getClasspath" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208523393897">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208523393898" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208523375759">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208523431031">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208523431032">
            <property name="name" value="module" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208523431034">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208523431035">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1208523431036">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208523431037">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1208523431038" />
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208523431039">
                      <link role="variableDeclaration" targetNodeId="1208523393897" resolveInfo="node" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208523431040">
                  <link role="baseMethodDeclaration" targetNodeId="5.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208523431041">
                <link role="baseMethodDeclaration" targetNodeId="5.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208523431033">
              <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216048760020">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216048770647">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1216048770648" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216048770649">
              <link role="baseMethodDeclaration" targetNodeId="1208519619838" resolveInfo="getClasspath" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216048770650">
                <link role="variableDeclaration" targetNodeId="1208523431032" resolveInfo="module" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1216048770651">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208523378641" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208523382166">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208519619838">
      <property name="name" value="getClasspath" />
      <property name="isFinal" value="false" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208519128575">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128576">
          <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209487802381">
        <property name="name" value="withDependencies" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1209487804399" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128577">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208519128578">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128579">
            <property name="name" value="res" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128581">
              <link role="classifier" targetNodeId="9.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034573583">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034573585">
                <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1208519128582">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128585">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208519128586">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128587">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128588">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128589">
                    <link role="variableDeclaration" targetNodeId="1208519128579" resolveInfo="res" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128590">
                    <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128591">
                      <link role="variableDeclaration" targetNodeId="1208519128583" resolveInfo="cp" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128592">
                  <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208519128593">
                    <link role="baseMethodDeclaration" targetNodeId="1208519128705" resolveInfo="ps" />
                    <link role="classConcept" targetNodeId="1208519128358" resolveInfo="BaseRunner" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208534596896">
            <link role="baseMethodDeclaration" targetNodeId="1208534568989" resolveInfo="getModuleClasspath" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208534599600">
              <link role="variableDeclaration" targetNodeId="1208519128575" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209487820603">
              <link role="variableDeclaration" targetNodeId="1209487802381" resolveInfo="withDependencies" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128583">
            <property name="name" value="cp" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128584">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128596">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128597">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128598">
              <link role="baseMethodDeclaration" targetNodeId="9.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128599">
              <link role="variableDeclaration" targetNodeId="1208519128579" resolveInfo="res" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128600">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208521257426" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208519128830" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1208534568989">
      <property name="name" value="getModuleClasspath" />
      <property name="isFinal" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128635">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128636">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208519128603">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128604">
          <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1209487565542">
        <property name="name" value="withDependencies" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1209487577343" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519128605">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208519128606">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519128607">
            <property name="name" value="res" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034571667">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034571669">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128611">
                  <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128608">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519128609">
                <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208519128612">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128613">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128614">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128615">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519128616">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519128618">
                    <link role="variableDeclaration" targetNodeId="1208519128603" resolveInfo="module" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128617">
                    <link role="baseMethodDeclaration" targetNodeId="10.~IModule.getClassesGen():jetbrains.mps.vfs.IFile" resolveInfo="getClassesGen" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519128619">
                  <link role="baseMethodDeclaration" targetNodeId="14.~IFile.getAbsolutePath():java.lang.String" resolveInfo="getAbsolutePath" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128620">
              <link role="variableDeclaration" targetNodeId="1208519128607" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208534635469">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208534635470">
            <link role="baseMethodDeclaration" targetNodeId="1208534513091" resolveInfo="createModuleClasspath" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208534641136">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208534641137">
                <link role="baseMethodDeclaration" targetNodeId="10.~IModule.getClassPathItem():jetbrains.mps.reloading.IClassPathItem" resolveInfo="getClassPathItem" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208534641138">
                <link role="variableDeclaration" targetNodeId="1208519128603" resolveInfo="module" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208534641140">
              <link role="variableDeclaration" targetNodeId="1208519128607" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209487587781">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1209487590776">
            <link role="variableDeclaration" targetNodeId="1209487565542" resolveInfo="withDependencies" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209487587783">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208534646091">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208534646092">
                <link role="baseMethodDeclaration" targetNodeId="1208534513091" resolveInfo="createModuleClasspath" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208534650092">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208534650093">
                    <link role="baseMethodDeclaration" targetNodeId="10.~IModule.getModuleWithDependenciesClassPathItem():jetbrains.mps.reloading.IClassPathItem" resolveInfo="getModuleWithDependenciesClassPathItem" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208534650094">
                    <link role="variableDeclaration" targetNodeId="1208519128603" resolveInfo="module" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208534650096">
                  <link role="variableDeclaration" targetNodeId="1208519128607" resolveInfo="res" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208519128633">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208519128634">
            <link role="variableDeclaration" targetNodeId="1208519128607" resolveInfo="res" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1209487557447" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1208534513091">
      <property name="name" value="createModuleClasspath" />
      <property name="isFinal" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208519739582" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208519760946">
        <property name="name" value="cp" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519760947">
          <link role="classifier" targetNodeId="15.~IClassPathItem" resolveInfo="IClassPathItem" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208519775622">
        <property name="name" value="res" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519775623">
          <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519775624">
            <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
          </node>
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519739584">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208519786498">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1208519786546">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786547">
              <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
            </node>
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786548">
              <link role="classifier" targetNodeId="15.~CompositeClassPathItem" resolveInfo="CompositeClassPathItem" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208519786514">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519786515">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208519786516">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786517">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786518">
                    <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786519">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1208519786520">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1208519786521">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786523">
                            <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
                          </node>
                          <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786522">
                            <link role="classifier" targetNodeId="15.~FileClassPathItem" resolveInfo="FileClassPathItem" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786524">
                        <link role="baseMethodDeclaration" targetNodeId="15.~FileClassPathItem.getClassPath():java.lang.String" resolveInfo="getClassPath" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786525">
                    <link role="variableDeclaration" targetNodeId="1208519775622" resolveInfo="res" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208519786526">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1208519786540">
                <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786541">
                  <link role="classifier" targetNodeId="15.~JarFileClassPathItem" resolveInfo="JarFileClassPathItem" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786542">
                  <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519786527">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208519786528">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786529">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786531">
                      <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786532">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786533">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786538">
                            <link role="baseMethodDeclaration" targetNodeId="15.~JarFileClassPathItem.getFile():java.io.File" resolveInfo="getFile" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1208519786534">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1208519786535">
                              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786537">
                                <link role="classifier" targetNodeId="15.~JarFileClassPathItem" resolveInfo="JarFileClassPathItem" />
                              </node>
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786536">
                                <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786539">
                          <link role="baseMethodDeclaration" targetNodeId="13.~File.getAbsolutePath():java.lang.String" resolveInfo="getAbsolutePath" />
                        </node>
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786530">
                      <link role="variableDeclaration" targetNodeId="1208519775622" resolveInfo="res" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1208519786543">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786545">
                <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
              </node>
              <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786544">
                <link role="classifier" targetNodeId="15.~FileClassPathItem" resolveInfo="FileClassPathItem" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519786499">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1208519786500">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208519786507">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208534607803">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall" id="1208534607804">
                    <link role="baseMethodDeclaration" targetNodeId="1208534513091" resolveInfo="createModuleClassapth" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208534612147">
                      <link role="variableDeclaration" targetNodeId="1208519786512" resolveInfo="child" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208534614148">
                      <link role="variableDeclaration" targetNodeId="1208519775622" resolveInfo="res" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208519786512">
                <property name="name" value="child" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786513">
                  <link role="classifier" targetNodeId="15.~IClassPathItem" resolveInfo="IClassPathItem" />
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208519786501">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1208519786503">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1208519786504">
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208519786506">
                      <link role="classifier" targetNodeId="15.~CompositeClassPathItem" resolveInfo="CompositeClassPathItem" />
                    </node>
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208519786505">
                      <link role="variableDeclaration" targetNodeId="1208519760946" resolveInfo="cp" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208519786502">
                  <link role="baseMethodDeclaration" targetNodeId="15.~CompositeClassPathItem.getChildren():java.util.List" resolveInfo="getChildren" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1208519742112" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208520470121">
    <property name="name" value="BaseOutputReader" />
    <property name="package" value="Actions.Output" />
    <property name="abstractClass" value="true" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1208520470122">
      <property name="name" value="is" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1208520470123" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470124">
        <link role="classifier" targetNodeId="13.~InputStream" resolveInfo="InputStream" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1208520470125">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208520470126">
        <property name="name" value="is" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470127">
          <link role="classifier" targetNodeId="13.~InputStream" resolveInfo="InputStream" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520470128">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208520470129">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208520470130">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208520470134">
              <link role="variableDeclaration" targetNodeId="1208520470126" resolveInfo="is" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208520470131">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208520470133" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208520470132">
                <link role="fieldDeclaration" targetNodeId="1208520470122" resolveInfo="is" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208520470136" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208520470135" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208520470137">
      <property name="name" value="run" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520470138">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208520470139">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208520470140">
            <property name="name" value="br" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034572943">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034572945">
                <link role="baseMethodDeclaration" targetNodeId="13.~BufferedReader.&lt;init&gt;(java.io.Reader)" resolveInfo="BufferedReader" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034573283">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034573285">
                    <link role="baseMethodDeclaration" targetNodeId="13.~InputStreamReader.&lt;init&gt;(java.io.InputStream)" resolveInfo="InputStreamReader" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208520470144">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208520470146">
                        <link role="fieldDeclaration" targetNodeId="1208520470122" resolveInfo="is" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208520470145" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470141">
              <link role="classifier" targetNodeId="13.~BufferedReader" resolveInfo="BufferedReader" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208520470147">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208520470148">
            <property name="name" value="message" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470149">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1208520470150">
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1208520470151">
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520470152">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208520470153">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208520470154">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208520470157">
                    <link role="baseMethodDeclaration" targetNodeId="12.~Logger.error(java.lang.Throwable):void" resolveInfo="error" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208520470158">
                      <link role="variableDeclaration" targetNodeId="1208520470159" resolveInfo="e" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1208520470155">
                    <link role="classConcept" targetNodeId="12.~Logger" resolveInfo="Logger" />
                    <link role="baseMethodDeclaration" targetNodeId="12.~Logger.getLogger(java.lang.Class):jetbrains.mps.logging.Logger" resolveInfo="getLogger" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208520470156">
                      <link role="classifier" targetNodeId="1208520470121" resolveInfo="BaseOutputReader" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208520470159">
              <property name="name" value="e" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470160">
                <link role="classifier" targetNodeId="9.~Exception" resolveInfo="Exception" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520470161">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1208520470162">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520470171">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208788296904">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208788296905">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208788296906">
                      <link role="baseMethodDeclaration" targetNodeId="1208520583775" resolveInfo="addMessage" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208788300508">
                        <link role="variableDeclaration" targetNodeId="1208520470148" resolveInfo="l" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208788296907" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208520470163">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1208520470164">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208520470165">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208520470167">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208520470169">
                        <link role="variableDeclaration" targetNodeId="1208520470140" resolveInfo="br" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208520470168">
                        <link role="baseMethodDeclaration" targetNodeId="13.~BufferedReader.readLine():java.lang.String" resolveInfo="readLine" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208520470166">
                      <link role="variableDeclaration" targetNodeId="1208520470148" resolveInfo="l" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208520470170" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208520470178" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208520470177" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208520583775">
      <property name="name" value="addMessage" />
      <property name="isAbstract" value="true" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208520597062">
        <property name="name" value="message" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520597063">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208520583776" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208520586218" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520583778" />
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520470180">
      <link role="classifier" targetNodeId="9.~Thread" resolveInfo="Thread" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208520470179" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208520815074">
    <property name="package" value="Actions.Output" />
    <property name="name" value="ClassRunOutputReader" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208520832747">
      <property name="name" value="addMessage" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208520832750">
        <property name="name" value="message" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520832751">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520832752">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteEDTCommandStatement" id="1208788266823">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1208942215313">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208942215314">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208942215315">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208942215316">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208942215317">
                    <link role="baseMethodDeclaration" targetNodeId="1205861498911" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208942215318">
                      <link role="variableDeclaration" targetNodeId="1208520832750" resolveInfo="message" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208942215319">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208942215320" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208942215321">
                      <link role="fieldDeclaration" targetNodeId="1208520860763" resolveInfo="runComponent" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208520832749" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208520832748" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1208520860763">
      <property name="name" value="runComponent" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520865339">
        <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1208788453411" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1208520836063">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208520842155">
        <property name="name" value="in" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520842156">
          <link role="classifier" targetNodeId="13.~InputStream" resolveInfo="InputStream" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208520844889">
        <property name="name" value="runComponent" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520850173">
          <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208520836066">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1208520855790">
          <link role="constructorDeclaration" targetNodeId="1208520470125" resolveInfo="BaseOutputReader" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208520857798">
            <link role="variableDeclaration" targetNodeId="1208520842155" resolveInfo="in" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208520871442">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1208520872785">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208520871443">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1208520871444">
                <link role="fieldDeclaration" targetNodeId="1208520860763" resolveInfo="runComponent" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208520871445" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208520875581">
              <link role="variableDeclaration" targetNodeId="1208520844889" resolveInfo="runComponent" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208520836064" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208520836065" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208520815075" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208520828709">
      <link role="classifier" targetNodeId="1208520470121" resolveInfo="BaseOutputReader" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208785675986">
    <property name="name" value="ToDoHighlighter" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1208787693048">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208787693049" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208787693050" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787693051" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208785675987" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208786293710">
      <link role="classifier" targetNodeId="36.~EditorCheckerAdapter" resolveInfo="EditorCheckerAdapter" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208786474480">
      <property name="name" value="createMessages" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208786474481" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208786474482">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208786474483">
          <link role="classifier" targetNodeId="35.~EditorMessage" resolveInfo="EditorMessage" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208786474484">
        <property name="name" value="rootNode" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208786474485">
          <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208786474486">
        <property name="name" value="operationContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208786474487">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208786474488">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208787056655">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208787056656">
            <property name="name" value="messages" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208787056657">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208787064228">
                <link role="classifier" targetNodeId="35.~EditorMessage" resolveInfo="EditorMessage" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034572993">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034572995">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208787104241">
                  <link role="classifier" targetNodeId="35.~EditorMessage" resolveInfo="EditorMessage" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208786967327">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208786967328">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208786967329" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208786981691">
              <link role="variableDeclaration" targetNodeId="1208786474484" resolveInfo="rootNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1208786989912">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208786989913">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208787124092">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787124093">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208787153453">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787154598">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787153454">
                      <link role="variableDeclaration" targetNodeId="1208787056656" resolveInfo="messages" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787156540">
                      <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213034570989">
                        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213034570991">
                          <link role="baseMethodDeclaration" targetNodeId="1208785806875" resolveInfo="ToDoMessage" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787224977">
                            <link role="variableDeclaration" targetNodeId="1208786989916" resolveInfo="remark" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787228827">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787227371">
                              <link role="variableDeclaration" targetNodeId="1208786989916" resolveInfo="remark" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1208787234447">
                              <link role="property" targetNodeId="1.1168623065899" resolveInfo="value" />
                            </node>
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787238154">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787238155">
                              <link role="baseMethodDeclaration" targetNodeId="36.~EditorCheckerAdapter.getOwner(jetbrains.mps.smodel.SNode):jetbrains.mps.nodeEditor.EditorMessageOwner" resolveInfo="getOwner" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208787278150">
                                <link role="variableDeclaration" targetNodeId="1208786474484" resolveInfo="rootNode" />
                              </node>
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1208787238156" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787127163">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787125707">
                  <link role="variableDeclaration" targetNodeId="1208786989916" resolveInfo="remark" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1208787147794">
                  <link role="conceptMethodDeclaration" targetNodeId="3v.1213877427548" resolveInfo="isTodo" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787005397">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787017511">
              <link role="variableDeclaration" targetNodeId="1208786967328" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1208787020249">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1208787020250">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208787118823">
                  <link role="conceptDeclaration" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208786989916">
            <property name="name" value="remark" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208786991388">
              <link role="concept" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208787241301">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787242865">
            <link role="variableDeclaration" targetNodeId="1208787056656" resolveInfo="messages" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208879271322">
      <property name="name" value="isPropertyEventDramatical" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208879271323" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1208879271324" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208879271325">
        <property name="name" value="propertyEvent" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208879271326">
          <link role="classifier" targetNodeId="38.~SModelPropertyEvent" resolveInfo="SModelPropertyEvent" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208879271327">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208879383150">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208879383151">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1208879390047" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208879383153">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208879383154">
                <link role="variableDeclaration" targetNodeId="1208879271325" resolveInfo="propertyEvent" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208879383155">
                <link role="baseMethodDeclaration" targetNodeId="38.~SModelPropertyEvent.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208879393783">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208879393784">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208879430997">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208879430998">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208879461172">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1208879464440">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208879447682">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208879443522">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208879442224">
                    <link role="variableDeclaration" targetNodeId="1208879271325" resolveInfo="propertyEvent" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208879446603">
                    <link role="baseMethodDeclaration" targetNodeId="38.~SModelPropertyEvent.getPropertyName():java.lang.String" resolveInfo="getPropertyName" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208879449482">
                  <link role="baseMethodDeclaration" targetNodeId="9.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1208879450827">
                    <property name="value" value="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208879397695">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208879396616">
              <link role="variableDeclaration" targetNodeId="1208879383151" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1208879398276">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1208879407199">
                <link role="conceptDeclaration" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1208879467582">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1208879470694">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1208785739646">
    <property name="name" value="ToDoMessage" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1208785806875">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208785806876" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208785806877" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208785806878">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1208785857625">
          <link role="constructorDeclaration" targetNodeId="35.~DefaultEditorMessage.&lt;init&gt;(jetbrains.mps.smodel.SNode,java.awt.Color,java.lang.String,jetbrains.mps.nodeEditor.EditorMessageOwner)" resolveInfo="DefaultEditorMessage" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208785881471">
            <link role="variableDeclaration" targetNodeId="1208785818692" resolveInfo="node" />
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1208785903616">
            <link role="classifier" targetNodeId="17.~Color" resolveInfo="Color" />
            <link role="variableDeclaration" targetNodeId="17.~Color.BLUE" resolveInfo="BLUE" />
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208785940423">
            <link role="variableDeclaration" targetNodeId="1208785821209" resolveInfo="message" />
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1208785943222">
            <link role="variableDeclaration" targetNodeId="1208785831306" resolveInfo="owner" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208785818692">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785818693">
          <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208785821209">
        <property name="name" value="message" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785825399">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208785831306">
        <property name="name" value="owner" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785834808">
          <link role="classifier" targetNodeId="35.~EditorMessageOwner" resolveInfo="EditorMessageOwner" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208785739647" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785802999">
      <link role="classifier" targetNodeId="35.~DefaultEditorMessage" resolveInfo="DefaultEditorMessage" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1208785973384">
      <property name="name" value="paint" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1208785973385" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1208785973386" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208785973387">
        <property name="name" value="graphics" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785973388">
          <link role="classifier" targetNodeId="17.~Graphics" resolveInfo="Graphics" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1208785973389">
        <property name="name" value="component" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208785973390">
          <link role="classifier" targetNodeId="35.~EditorComponent" resolveInfo="EditorComponent" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208785973391" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginDeclaration" id="1208787586603">
    <property name="name" value="BaseLanguageCustomPlugin" />
    <node role="fieldDeclaration" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration" id="1215438553604">
      <property name="name" value="myToDoHighlighter" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1215438553605" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1215438586843">
        <link role="classifier" targetNodeId="1208785675986" resolveInfo="ToDoHighlighter" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1215438599799">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1215438599800">
          <link role="baseMethodDeclaration" targetNodeId="1208787693048" resolveInfo="ToDoHighlighter" />
        </node>
      </node>
    </node>
    <node role="initBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginInitBlock" id="1208787699614">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787699615">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208787714852">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208787714853">
            <property name="name" value="highlighter" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208787783324">
              <link role="classifier" targetNodeId="35.~Highlighter" resolveInfo="Highlighter" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787714855">
              <node role="operand" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_MPSProject" id="1208787714856" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787714857">
                <link role="baseMethodDeclaration" targetNodeId="10.~MPSProject.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208787714858">
                  <link role="classifier" targetNodeId="35.~Highlighter" resolveInfo="Highlighter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208787714859">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787714860">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208787714861">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787714862">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787714863">
                  <link role="variableDeclaration" targetNodeId="1208787714853" resolveInfo="highlighter" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787714864">
                  <link role="baseMethodDeclaration" targetNodeId="35.~Highlighter.addChecker(jetbrains.mps.helgins.checking.IEditorChecker):void" resolveInfo="addChecker" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787714865">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208787714866" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1215438898538">
                      <link role="member" targetNodeId="1215438553604" resolveInfo="myToDoHighlighter" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208787714868">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208787714869" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787714870">
              <link role="variableDeclaration" targetNodeId="1208787714853" resolveInfo="highlighter" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginDisposeBlock" id="1208787738781">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787738782">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1208787749003">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1208787749004">
            <property name="name" value="highlighter" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1208787773994">
              <link role="classifier" targetNodeId="35.~Highlighter" resolveInfo="Highlighter" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787749006">
              <node role="operand" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_MPSProject" id="1208787749007" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787749008">
                <link role="baseMethodDeclaration" targetNodeId="10.~MPSProject.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1208787749009">
                  <link role="classifier" targetNodeId="35.~Highlighter" resolveInfo="Highlighter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1208787749010">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1208787749011">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1208787749012">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787749013">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787749014">
                  <link role="variableDeclaration" targetNodeId="1208787749004" resolveInfo="highlighter" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1208787749015">
                  <link role="baseMethodDeclaration" targetNodeId="35.~Highlighter.removeChecker(jetbrains.mps.helgins.checking.IEditorChecker):void" resolveInfo="removeChecker" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1208787749016">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1208787749017" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1215438607896">
                      <link role="member" targetNodeId="1215438553604" resolveInfo="myToDoHighlighter" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1208787749019">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1208787749020" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1208787749021">
              <link role="variableDeclaration" targetNodeId="1208787749004" resolveInfo="highlighter" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ToolDeclaration" id="1208789093348">
    <property name="name" value="RunClass" />
    <property name="icon" value="${language_descriptor}\icons\run.png" />
    <node role="fieldDeclaration" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration" id="1214210764049">
      <property name="name" value="myComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1214210764050" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1214210819957">
        <link role="classifier" targetNodeId="1205860902244" resolveInfo="RunComponent" />
      </node>
    </node>
    <node role="initBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginInitBlock" id="1214210862081">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214210862082">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214210864817">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1214210865900">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214210864818">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1214210864819" />
              <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1214210864820">
                <link role="member" targetNodeId="1214210764049" resolveInfo="myComponent" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214210869871">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1214210869872">
                <link role="baseMethodDeclaration" targetNodeId="1205861021916" resolveInfo="RunComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214210869873">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1214210869874" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1214210869875">
                    <link role="baseMethodDeclaration" targetNodeId="39.~BaseTool.getProject():com.intellij.openapi.project.Project" resolveInfo="getProject" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginDisposeBlock" id="1214211490882">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214211490883">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214211520901">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214211529356">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214211521200">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1214211520902" />
              <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1214211523012">
                <link role="member" targetNodeId="1214210764049" resolveInfo="myComponent" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1214211546386">
              <link role="baseMethodDeclaration" targetNodeId="1214210830127" resolveInfo="dispose" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="getComponentBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.GetComponentBlock" id="1214308524963">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214308524964">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214678611775">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215111191033">
            <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1215111189313" />
            <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1215111193474">
              <link role="member" targetNodeId="1214210764049" resolveInfo="myComponent" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ToolDeclaration" id="1209126436954">
    <property name="name" value="TodoViewer" />
    <property name="caption" value="TODO" />
    <property name="icon" value="${language_descriptor}\source\jetbrains\mps\baseLanguage\plugin\todo.png" />
    <property name="number" value="2" />
    <node role="getComponentBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.GetComponentBlock" id="1214308524982">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214308524983">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216657147577">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216657149657">
            <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1216657149658" />
            <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1216657149659">
              <link role="member" targetNodeId="1216657110747" resolveInfo="myComponent" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="initBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ProjectPluginInitBlock" id="1216657102102">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216657102103">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217598419950">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1217598422563">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217598419951">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1217598419952" />
              <node role="operation" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldAccessOperation" id="1217598419953">
                <link role="member" targetNodeId="1216657110747" resolveInfo="myComponent" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217598423144">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1217598423145">
                <link role="baseMethodDeclaration" targetNodeId="32.~TodoViewer.&lt;init&gt;(jetbrains.mps.project.MPSProject)" resolveInfo="TodoViewer" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217598423146">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1217598423147" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217598423148">
                    <link role="baseMethodDeclaration" targetNodeId="39.~BaseTool.getMPSProject():jetbrains.mps.project.MPSProject" resolveInfo="getMPSProject" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="fieldDeclaration" type="jetbrains.mps.baseLanguage.classifiers.structure.DefaultClassifierFieldDeclaration" id="1216657110747">
      <property name="name" value="myComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1216657110748" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216657116782">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1213008751376">
    <property name="name" value="InlineMethod" />
    <property name="caption" value="Inline method" />
    <property name="isAlwaysVisible" value="false" />
    <property name="outsideCommandExecution" value="true" />
    <property name="package" value="Actions" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1213008751377">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213008751378">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213018990315">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213018990316">
            <property name="name" value="dialog" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213018990317">
              <link role="classifier" targetNodeId="40.~InlineMethodDialog" resolveInfo="InlineMethodDialog" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213018994240">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213018994241">
                <link role="baseMethodDeclaration" targetNodeId="40.~InlineMethodDialog.&lt;init&gt;(jetbrains.mps.workbench.action.ActionEventData)" resolveInfo="InlineMethodDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213874948386">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213875024352">
                    <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.&lt;init&gt;(com.intellij.openapi.actionSystem.AnActionEvent)" resolveInfo="ActionEventData" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_AnActionEvent" id="1213875026087" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213183776164">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213183777417">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213183776165">
              <link role="variableDeclaration" targetNodeId="1213018990316" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213184025808">
              <link role="baseMethodDeclaration" targetNodeId="40.~InlineMethodDialog.tryToShow():void" resolveInfo="tryToShow" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216743081199">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216743083342">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216743081200">
              <link role="variableDeclaration" targetNodeId="1213018990316" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216743085220">
              <link role="baseMethodDeclaration" targetNodeId="17.~Window.pack():void" resolveInfo="pack" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1213008791177">
      <property name="keycode" value="N" />
      <property name="modifiers" value="ctrl+alt" />
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1216638766763">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216638766764">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216638767265">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216638767266">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1216638767267" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216638767268">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1216638767269">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1216638767270">
                  <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.&lt;init&gt;(com.intellij.openapi.actionSystem.AnActionEvent)" resolveInfo="ActionEventData" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_AnActionEvent" id="1216638767271" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216638767272">
                <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216638767273">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216638767274">
            <property name="name" value="b" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216638767275">
              <link role="classifier" targetNodeId="9.~Boolean" resolveInfo="Boolean" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1216638767276">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1216638767277">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1216638767278">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216638767279">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216638767280">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1216638767281">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1216638767282">
                    <link role="baseMethodDeclaration" targetNodeId="40.~InlineMethodRefactoringAnalyzer.isMethodNode(jetbrains.mps.smodel.SNode):boolean" resolveInfo="isMethodNode" />
                    <link role="classConcept" targetNodeId="40.~InlineMethodRefactoringAnalyzer" resolveInfo="InlineMethodRefactoringAnalyzer" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216638767283">
                      <link role="variableDeclaration" targetNodeId="1216638767266" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216638767284">
                    <link role="variableDeclaration" targetNodeId="1216638767274" resolveInfo="b" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216638771850">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216638773995">
            <link role="variableDeclaration" targetNodeId="1216638767274" resolveInfo="b" />
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1213874903788">
      <property name="name" value="node" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1213874903789" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213874905089" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1214477667497">
    <property name="name" value="ChangeMethodSignature" />
    <property name="caption" value="Change method signature" />
    <property name="outsideCommandExecution" value="true" />
    <property name="package" value="Actions" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1214477667498">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214477667499">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1215172130226">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1215172130227">
            <property name="name" value="dialog" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1215172130228">
              <link role="classifier" targetNodeId="52.~ChangeMethodSignatureDialog" resolveInfo="ChangeMethodSignatureDialog" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1215172130229">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1215172130230">
                <link role="baseMethodDeclaration" targetNodeId="52.~ChangeMethodSignatureDialog.&lt;init&gt;(jetbrains.mps.workbench.action.ActionEventData)" resolveInfo="ChangeMethodSignatureDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1215172130231">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1215172130232">
                    <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.&lt;init&gt;(com.intellij.openapi.actionSystem.AnActionEvent)" resolveInfo="ActionEventData" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_AnActionEvent" id="1215172130233" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1215172130234">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215172130235">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215172130236">
              <link role="variableDeclaration" targetNodeId="1215172130227" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1215172130237">
              <link role="baseMethodDeclaration" targetNodeId="55.~BaseDialog.showDialog():void" resolveInfo="showDialog" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216743098800">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216743100021">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216743098801">
              <link role="variableDeclaration" targetNodeId="1215172130227" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1216743101399">
              <link role="baseMethodDeclaration" targetNodeId="17.~Window.pack():void" resolveInfo="pack" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" type="jetbrains.mps.bootstrap.pluginLanguage.structure.KeyMapKeystroke" id="1214478339142">
      <property name="modifiers" value="ctrl" />
      <property name="keycode" value="VK_F6" />
    </node>
    <node role="updateBlock" type="jetbrains.mps.bootstrap.pluginLanguage.structure.IsApplicableBlock" id="1214478371100">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214478371101">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214478372040">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214478372041">
            <property name="name" value="node" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214478372042" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214478372043">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214478372044">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1214478372045">
                  <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.&lt;init&gt;(com.intellij.openapi.actionSystem.AnActionEvent)" resolveInfo="ActionEventData" />
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ConceptFunctionParameter_AnActionEvent" id="1214478372046" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1214478372047">
                <link role="baseMethodDeclaration" targetNodeId="46.~ActionEventData.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214478447967">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214478455938">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214478455939">
              <link role="variableDeclaration" targetNodeId="1214478372041" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1214478455940">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1214478455941">
                <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1217597602946">
    <property name="package" value="Actions" />
    <property name="name" value="ShowTodoViewer" />
    <property name="caption" value="Show Todo Tool" />
    <property name="iconPath" value="${language_descriptor}\source\jetbrains\mps\baseLanguage\plugin\todo.png" />
    <property name="isAlwaysVisible" value="true" />
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1217597728057">
      <property name="name" value="project" />
      <link role="key" targetNodeId="54.~MPSDataKeys.MPS_PROJECT" resolveInfo="MPS_PROJECT" />
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1217597602947">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217597602948">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217598015336">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217598026951">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217598016809">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217598015337">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1217598015338" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1217598015339">
                  <link role="member" targetNodeId="1217597728057" resolveInfo="project" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.GetToolOperation" id="1217598024950">
                <link role="tool" targetNodeId="1209126436954" resolveInfo="TodoViewer" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1217598033423">
              <link role="baseMethodDeclaration" targetNodeId="39.~BaseTool.openToolLater(boolean):void" resolveInfo="openToolLater" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1217598354581">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1217598080127">
    <property name="name" value="BaseLanguageToolsAddition" />
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1217598095113">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1217598105552">
        <link role="action" targetNodeId="1217597602946" resolveInfo="ShowTodoViewer" />
      </node>
    </node>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1217598112631">
      <link role="modifiedGroup" targetNodeId="3.1204991238062" resolveInfo="Tools" />
      <link role="point" targetNodeId="3.1217598172089" resolveInfo="customTools" />
    </node>
  </node>
  <visible index="4" modelUID="javax.swing.text@java_stub" />
  <visible index="5" modelUID="javax.swing.border@java_stub" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220353713044">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtractMethodDialog" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220354294277">
      <property name="name" value="myPanel" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220354294278" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220354297618">
        <link role="classifier" targetNodeId="16.~JPanel" resolveInfo="JPanel" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549300978">
      <property name="name" value="myNameField" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549320968">
        <link role="classifier" targetNodeId="16.~JTextField" resolveInfo="JTextField" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220549340809">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220549340810">
          <link role="baseMethodDeclaration" targetNodeId="16.~JTextField.&lt;init&gt;(int)" resolveInfo="JTextField" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220549343295">
            <property name="value" value="20" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549300979" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549346015">
      <property name="name" value="myKind" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549346016" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549354535">
        <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549378511">
      <property name="name" value="myCanRefactor" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549378512" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220549387000" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549395391">
      <property name="name" value="myPreviewArea" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549395392" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220549414929">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220549414930">
          <link role="baseMethodDeclaration" targetNodeId="16.~JTextArea.&lt;init&gt;()" resolveInfo="JTextArea" />
        </node>
      </node>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549401099">
        <link role="classifier" targetNodeId="16.~JTextArea" resolveInfo="JTextArea" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549418852">
      <property name="name" value="myMessagesArea" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220549439233">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220549439234">
          <link role="baseMethodDeclaration" targetNodeId="16.~JTextArea.&lt;init&gt;()" resolveInfo="JTextArea" />
        </node>
      </node>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549423451">
        <link role="classifier" targetNodeId="16.~JTextArea" resolveInfo="JTextArea" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549418853" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220547076451">
      <property name="name" value="myModel" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220547076452" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220547103205">
        <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220549463555">
      <property name="name" value="myContext" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220549463556" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549477215">
        <link role="classifier" targetNodeId="35.~EditorContext" resolveInfo="EditorContext" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220549765810">
      <property name="name" value="update" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549765813">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1220549776223">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1220549776224">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549776225">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549789902">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549802684">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549807920">
                    <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.setText(java.lang.String):void" resolveInfo="setText" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550113407">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550113408">
                        <link role="baseMethodDeclaration" targetNodeId="1220549835443" resolveInfo="getMessagesText" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550113409" />
                    </node>
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549789903">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220549789904">
                      <link role="fieldDeclaration" targetNodeId="1220549418852" resolveInfo="myMessagesArea" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549789905" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550399749">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550405258">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550400908">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550404568">
                      <link role="fieldDeclaration" targetNodeId="1220549395391" resolveInfo="myPreviewArea" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550399750" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550409277">
                    <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.setText(java.lang.String):void" resolveInfo="setText" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550413500">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550412467" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550466870">
                        <link role="baseMethodDeclaration" targetNodeId="1220550448487" resolveInfo="getPreviewText" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549784804">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549784805">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549784806">
              <link role="baseMethodDeclaration" targetNodeId="17.~Component.repaint():void" resolveInfo="repaint" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549784807" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220549765811" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220549765812" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220549835443">
      <property name="name" value="getMessagesText" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549835446">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220549849325">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220549849326">
            <property name="name" value="buff" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220549853970">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220549853971">
                <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.&lt;init&gt;()" resolveInfo="StringBuffer" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549849327">
              <link role="classifier" targetNodeId="9.~StringBuffer" resolveInfo="StringBuffer" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220549857566">
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220549942695">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549942696">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220549951759">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220549951760">
                  <property name="name" value="name" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549960063">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549958903">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220549958904">
                        <link role="fieldDeclaration" targetNodeId="1220549300978" resolveInfo="myNameField" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549958905" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549963128">
                      <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.getText():java.lang.String" resolveInfo="getText" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549951761">
                    <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220550283229">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220550283230">
                  <property name="name" value="good" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220550346501">
                    <link role="classConcept" targetNodeId="9.~Character" resolveInfo="Character" />
                    <link role="baseMethodDeclaration" targetNodeId="9.~Character.isJavaIdentifierStart(char):boolean" resolveInfo="isJavaIdentifierStart" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550346502">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550346504">
                        <link role="baseMethodDeclaration" targetNodeId="9.~String.charAt(int):char" resolveInfo="charAt" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220550346505">
                          <property name="value" value="0" />
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550346503">
                        <link role="variableDeclaration" targetNodeId="1220549951760" resolveInfo="name" />
                      </node>
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220550283231" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1220549985645">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549985646">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550300727">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220550310922">
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550300728">
                        <link role="variableDeclaration" targetNodeId="1220550283230" resolveInfo="good" />
                      </node>
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1220550324445">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220550353100">
                          <link role="classConcept" targetNodeId="9.~Character" resolveInfo="Character" />
                          <link role="baseMethodDeclaration" targetNodeId="9.~Character.isJavaIdentifierPart(char):boolean" resolveInfo="isJavaIdentifierPart" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550353101">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550353103">
                              <link role="baseMethodDeclaration" targetNodeId="9.~String.charAt(int):char" resolveInfo="charAt" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220550353104">
                                <property name="value" value="0" />
                              </node>
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550353102">
                              <link role="variableDeclaration" targetNodeId="1220549951760" resolveInfo="name" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550314707">
                          <link role="variableDeclaration" targetNodeId="1220550283230" resolveInfo="good" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1220550000356">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550002204">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550004379">
                      <link role="baseMethodDeclaration" targetNodeId="9.~String.length():int" resolveInfo="length" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550001500">
                      <link role="variableDeclaration" targetNodeId="1220549951760" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220549995137">
                    <link role="variableDeclaration" targetNodeId="1220549985648" resolveInfo="i" />
                  </node>
                </node>
                <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220549985648">
                  <property name="name" value="i" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1220549988712" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220550272737">
                    <property name="value" value="1" />
                  </node>
                </node>
                <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1220550006740">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550006741">
                    <link role="variableDeclaration" targetNodeId="1220549985648" resolveInfo="i" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220550364860">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550364861">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550364862">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550364863">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550364865">
                        <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220550364866">
                          <property name="value" value="Method name is incorrect." />
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550364864">
                        <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220550379150">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550380888">
                    <link role="variableDeclaration" targetNodeId="1220550283230" resolveInfo="good" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220549879640">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549876355">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549864542">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549864195">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220549864196">
                    <link role="fieldDeclaration" targetNodeId="1220549300978" resolveInfo="myNameField" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549864197" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549869288">
                  <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.getText():java.lang.String" resolveInfo="getText" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549878842">
                <link role="baseMethodDeclaration" targetNodeId="9.~String.length():int" resolveInfo="length" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220549880580">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220549857567">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549886472">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549887286">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549889695">
                  <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220549892306">
                    <property name="value" value="Method name is empty.\n" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220549886473">
                  <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220550498786">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220550498787">
            <property name="name" value="errors" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550509577">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550511627">
                <link role="baseMethodDeclaration" targetNodeId="1220357524984" resolveInfo="getErrors" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550530211">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550529675">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550529676">
                      <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550529677" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550536230">
                    <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550508619">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550508620">
                  <link role="fieldDeclaration" targetNodeId="1220549346015" resolveInfo="myKind" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550508621" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220550498788">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220550540765">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550540766">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550566859">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550568784">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550572178">
                  <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550574086">
                    <link role="variableDeclaration" targetNodeId="1220550498787" resolveInfo="errors" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550566860">
                  <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550578637">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220550580220">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550578638">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550578640" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550578639">
                    <link role="fieldDeclaration" targetNodeId="1220549378511" resolveInfo="myCanRefactor" />
                  </node>
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220550581333">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220550584617">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550584618">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550589619">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220550592207">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220550592649">
                    <property name="value" value="true" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550589620">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550589622" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550589621">
                      <link role="fieldDeclaration" targetNodeId="1220549378511" resolveInfo="myCanRefactor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1220550545495">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220550546998" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550542317">
              <link role="variableDeclaration" targetNodeId="1220550498787" resolveInfo="errors" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220550611589">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220550611590">
            <property name="name" value="overrides" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220550611591">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550744153">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550626252">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550626254" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550626253">
                  <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550767562">
                <link role="baseMethodDeclaration" targetNodeId="1220550636163" resolveInfo="getOverridingMethodClass" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220550776613">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550776614">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220550796437">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550796438">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550863707">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550864741">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550865792">
                      <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220550866669">
                        <property name="value" value="Such method already exists.\n" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550863708">
                      <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220550803789">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550845432">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550843598">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550812968">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550812261">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550812263" />
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550812262">
                          <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550816863">
                        <link role="baseMethodDeclaration" targetNodeId="1220528050595" resolveInfo="getContainerMethod" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550845055">
                      <link role="baseMethodDeclaration" targetNodeId="1220360056762" resolveInfo="getNode" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220550852904">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220550852905">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220550858877">
                        <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550802552">
                  <link role="variableDeclaration" targetNodeId="1220550611590" resolveInfo="overrides" />
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220550890716">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550890717">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550894422">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550895503">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550897085">
                        <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220550926041">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220550932100">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550929781">
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220550930879">
                                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550928436">
                                <link role="variableDeclaration" targetNodeId="1220550611590" resolveInfo="overrides" />
                              </node>
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220550932337">
                              <property name="value" value=".\n" />
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220550902009">
                            <property name="value" value="Method overrides method from class " />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550894423">
                        <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1220550781526">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220550783936" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550778555">
              <link role="variableDeclaration" targetNodeId="1220550611590" resolveInfo="overrides" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220550943700">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550943701">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220550953296">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550954330">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550955365">
                  <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.append(java.lang.CharSequence):java.lang.StringBuffer" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220550957633">
                    <property name="value" value="\n" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550953297">
                  <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220550949603">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550946566">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550948055">
                <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.length():int" resolveInfo="length" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550945439">
                <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220550950075">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220550129962">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550134499">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220550135331">
              <link role="baseMethodDeclaration" targetNodeId="9.~StringBuffer.toString():java.lang.String" resolveInfo="toString" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220550133528">
              <link role="variableDeclaration" targetNodeId="1220549849326" resolveInfo="buff" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220549835445" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220550123364">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220550448487">
      <property name="name" value="getPreviewText" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550448490">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220550969275">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220550969276">
            <property name="name" value="visibily" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551008894">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551001078">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551006003">
                  <link role="baseMethodDeclaration" targetNodeId="1220532299333" resolveInfo="getVisibilityLevel" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220550999935">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220550999936">
                    <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220550999937" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551097840">
                <link role="baseMethodDeclaration" targetNodeId="1220551021600" resolveInfo="getName" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220550969277">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220551114826">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220551114827">
            <property name="name" value="ret" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551126627">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551129444">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551127005">
                  <property name="value" value=" " />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551268644">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551272320">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551281876">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551276716">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551276088">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551276089">
                            <link role="fieldDeclaration" targetNodeId="1220549300978" resolveInfo="myNameField" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551276090" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551278610">
                          <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.getText():java.lang.String" resolveInfo="getText" />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551282051">
                        <property name="value" value="(" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551269022">
                      <property name="value" value=" " />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551136106">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551267206">
                      <link role="baseMethodDeclaration" targetNodeId="1220551155248" resolveInfo="getMethodType" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551135493">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551135494">
                        <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551135495" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551123345">
                <link role="variableDeclaration" targetNodeId="1220550969276" resolveInfo="visibily" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551114828">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220551294932">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220551294933">
            <property name="name" value="end" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551294934">
              <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551297936">
              <property name="value" value="" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220551307078">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220551307079">
            <property name="name" value="first" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220551316300">
              <property name="value" value="true" />
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220551307080" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220551322193">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551322196">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220551351348">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551351350">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220551423231">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551423233">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551445264">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression" id="1220551446751">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551448146">
                          <property name="value" value="," />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551445265">
                          <link role="variableDeclaration" targetNodeId="1220551114827" resolveInfo="ret" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220551435853">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551439497">
                      <link role="variableDeclaration" targetNodeId="1220551307079" resolveInfo="first" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551452478">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression" id="1220551452902">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551452479">
                      <link role="variableDeclaration" targetNodeId="1220551114827" resolveInfo="ret" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551458986">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551455249">
                        <property name="value" value="\n" />
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551487464">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551481836">
                          <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220551461772">
                            <link role="variable" targetNodeId="1220551322194" resolveInfo="var" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551485309">
                            <link role="baseMethodDeclaration" targetNodeId="1220535605000" resolveInfo="getType" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551491782">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551490186">
                            <property name="value" value=" " />
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551495409">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551497147">
                              <link role="baseMethodDeclaration" targetNodeId="1220535732483" resolveInfo="getName" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220551494926">
                              <link role="variable" targetNodeId="1220551322194" resolveInfo="var" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551502807">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551505373">
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551502808">
                      <link role="variableDeclaration" targetNodeId="1220551307079" resolveInfo="first" />
                    </node>
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220551507002">
                      <property name="value" value="false" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551353147">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551418355">
                  <link role="baseMethodDeclaration" targetNodeId="1220551373947" resolveInfo="isSelected" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220551352446">
                  <link role="variable" targetNodeId="1220551322194" resolveInfo="var" />
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220551517519">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551517520">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551520897">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusAssignmentExpression" id="1220551525985">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551527457">
                        <property name="value" value="\n" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551520898">
                        <link role="variableDeclaration" targetNodeId="1220551294933" resolveInfo="end" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551334092">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551333353">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551333355" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551333354">
                <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551339300">
              <link role="baseMethodDeclaration" targetNodeId="1220534672125" resolveInfo="getParameters" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220551322194">
            <property name="name" value="var" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220551545101">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551545102">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551554639">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551560707">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551569385">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551561258">
                    <property name="value" value="\n)" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551573326">
                    <link role="variableDeclaration" targetNodeId="1220551294933" resolveInfo="end" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551557549">
                  <link role="variableDeclaration" targetNodeId="1220551114827" resolveInfo="ret" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220551593311">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551593312">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551595658">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551601304">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1220551608653">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551610376">
                      <link role="variableDeclaration" targetNodeId="1220551294933" resolveInfo="end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220551601511">
                      <property name="value" value=")\n" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551598506">
                    <link role="variableDeclaration" targetNodeId="1220551114827" resolveInfo="ret" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551548887">
            <link role="variableDeclaration" targetNodeId="1220551307079" resolveInfo="first" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220550453854">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220550448489" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220546585786">
      <property name="name" value="initPanel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220546585789">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220546924399">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220546926826">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220546924400">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220546924401">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220546924402" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220546928173">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220546928174">
                <link role="baseMethodDeclaration" targetNodeId="16.~JPanel.&lt;init&gt;(java.awt.LayoutManager)" resolveInfo="JPanel" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220546930411">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220546934024">
                    <link role="baseMethodDeclaration" targetNodeId="17.~GridBagLayout.&lt;init&gt;()" resolveInfo="GridBagLayout" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220551702644">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220551702645">
            <property name="name" value="defaultInsets" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220551702647">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220551702648">
                <link role="baseMethodDeclaration" targetNodeId="17.~Insets.&lt;init&gt;(int,int,int,int)" resolveInfo="Insets" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551702649">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551702650">
                  <property name="value" value="5" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551702651">
                  <property name="value" value="3" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551702652">
                  <property name="value" value="5" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551702646">
              <link role="classifier" targetNodeId="17.~Insets" resolveInfo="Insets" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220551848987">
          <property name="value" value=" Method panel" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220546971543">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220546971544">
            <property name="name" value="c" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220546973409">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220546973410">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220546971545">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551628551">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551633779">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551630117">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551628552">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551631621">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220551636970">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.BOTH" resolveInfo="BOTH" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551644256">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551648920">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551644321">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551645262">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.insets" resolveInfo="insets" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551644257">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551693637">
              <link role="variableDeclaration" targetNodeId="1220551702645" resolveInfo="defaultInsets" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551714359">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551719836">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551719995">
              <property name="value" value="0" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551714408">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551717428">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551714360">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551723014">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551727616">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551723079">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551724333">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551723015">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551727838">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551729467">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551735943">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551729531">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551729468">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551733769">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551736196">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551738122">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551740661">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551738171">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551739956">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weighty" resolveInfo="weighty" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551738123">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.FloatingPointConstant" id="1220551742979">
              <property name="value" value="0.1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551747608">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551753711">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551747673">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551751724">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridwidth" resolveInfo="gridwidth" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551747609">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551753886">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551759139">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551759629">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551761945">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551839636">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551839638" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551839637">
                  <link role="baseMethodDeclaration" targetNodeId="1220551802836" resolveInfo="createMethodPanel" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551759140">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551759142" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551759141">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220551867707">
          <property name="value" value=" Parameters panel" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551878070">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551880057">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551878071">
              <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220551883468">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220551917413">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930135">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930136">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930138">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930139">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930140">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220551930137">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.BOTH" resolveInfo="BOTH" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930141">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930142">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930144">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930145">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930146">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.insets" resolveInfo="insets" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930143">
              <link role="variableDeclaration" targetNodeId="1220551702645" resolveInfo="defaultInsets" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930147">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930148">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930150">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930151">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930152">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551930149">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930153">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930154">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551942501">
              <property name="value" value="1" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930156">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930157">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930158">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930159">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930160">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930162">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930163">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930164">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551930161">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930165">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930166">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.FloatingPointConstant" id="1220551930167">
              <property name="value" value="0.7" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930168">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930169">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930170">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weighty" resolveInfo="weighty" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930171">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551930172">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930174">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930176">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridwidth" resolveInfo="gridwidth" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551930175">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551949332">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551930177">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930178">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930179">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551930181" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551930180">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551930182">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551930183">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551930185" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551930184">
                  <link role="baseMethodDeclaration" targetNodeId="1220551970512" resolveInfo="createParametersPanel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220551991562">
          <property name="value" value=" Visibility panel" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991563">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991564">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991565">
              <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220551991566">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220551991567">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991568">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991569">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991571">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991573">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991572">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220551991570">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.BOTH" resolveInfo="BOTH" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991574">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991575">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991577">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991578">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991579">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.insets" resolveInfo="insets" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991576">
              <link role="variableDeclaration" targetNodeId="1220551702645" resolveInfo="defaultInsets" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991580">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991581">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991583">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991585">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991584">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552172158">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991586">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991587">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991588">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991589">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991590">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551991591">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991592">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991593">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991595">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991597">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991596">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552174833">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991598">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991599">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991601">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991603">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weighty" resolveInfo="weighty" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991602">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552177085">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991604">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551991605">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220551991609">
              <property name="value" value="1" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991606">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991608">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridwidth" resolveInfo="gridwidth" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220551991607">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551991610">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991611">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551991612">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551991613">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551991614" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220551991615">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552091756">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552096853">
                  <link role="baseMethodDeclaration" targetNodeId="1220552617201" resolveInfo="createVisibilityPanel" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551991618" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220552100216">
          <property name="value" value=" Preview panel" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120079">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120080">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552120082">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552120083">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120081">
              <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120084">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120085">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120087">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120088">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120089">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220552120086">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.BOTH" resolveInfo="BOTH" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120090">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120091">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120093">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120095">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.insets" resolveInfo="insets" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120094">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120092">
              <link role="variableDeclaration" targetNodeId="1220551702645" resolveInfo="defaultInsets" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120096">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120097">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552189760">
              <property name="value" value="0" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120099">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120100">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120101">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120102">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120103">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120104">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120105">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120106">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552190809">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120108">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120109">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120111">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120113">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120112">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552134828">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120114">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120115">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.FloatingPointConstant" id="1220552193686">
              <property name="value" value="0.1" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120117">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120118">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120119">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weighty" resolveInfo="weighty" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120120">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552120121">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552196783">
              <property name="value" value="2" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120122">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120124">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridwidth" resolveInfo="gridwidth" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552120123">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552120126">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120127">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552120131">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552353041">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552357701">
                  <link role="baseMethodDeclaration" targetNodeId="1220552342398" resolveInfo="createPreviewPanel" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552120133" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552120128">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552120129">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552120130" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220552243421">
          <property name="value" value=" Messages panel" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243422">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243423">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552243425">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552243426">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243424">
              <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243427">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243428">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243430">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243432">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243431">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220552243429">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.BOTH" resolveInfo="BOTH" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243433">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243434">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243435">
              <link role="variableDeclaration" targetNodeId="1220551702645" resolveInfo="defaultInsets" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243436">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243437">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243438">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.insets" resolveInfo="insets" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243439">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243440">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243441">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243443">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243442">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552243444">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243445">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243446">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243447">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243449">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243448">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552277869">
              <property name="value" value="3" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243451">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243452">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243453">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243454">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243455">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552280558">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243457">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243458">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243460">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243461">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243462">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weighty" resolveInfo="weighty" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.FloatingPointConstant" id="1220552243459">
              <property name="value" value="0.2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243463">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220552243464">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243465">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243467">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridwidth" resolveInfo="gridwidth" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552243466">
                <link role="variableDeclaration" targetNodeId="1220546971544" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220552243468">
              <property name="value" value="2" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552243469">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243470">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552243474">
              <link role="baseMethodDeclaration" targetNodeId="17.~Container.add(java.awt.Component):java.awt.Component" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243475">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552243476" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552243477">
                  <link role="baseMethodDeclaration" targetNodeId="1220552557362" resolveInfo="createMessagesComponent" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552243471">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552243473" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552243472">
                <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220546585787" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220546589822" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220552342398">
      <property name="name" value="createPreviewPanel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220552342400">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552368219">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552369224">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552368220">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552368222" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552368221">
                <link role="fieldDeclaration" targetNodeId="1220549395391" resolveInfo="myPreviewArea" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552375682">
              <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.setEditable(boolean):void" resolveInfo="setEditable" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220552376793">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552382422">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552383052">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552388008">
              <link role="baseMethodDeclaration" targetNodeId="16.~JComponent.setBorder(javax.swing.border.Border):void" resolveInfo="setBorder" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552521146">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552521148" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552521147">
                  <link role="baseMethodDeclaration" targetNodeId="1220552400182" resolveInfo="createBorder" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220552528838">
                    <property name="value" value="Preview" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552382423">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552382425" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552382424">
                <link role="fieldDeclaration" targetNodeId="1220549395391" resolveInfo="myPreviewArea" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220552535404">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552539720">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552539722" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552539721">
              <link role="fieldDeclaration" targetNodeId="1220549395391" resolveInfo="myPreviewArea" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220552342399" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552342404">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220552557362">
      <property name="name" value="createMessagesComponent" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220552557364">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552566834">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552567386">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552571547">
              <link role="baseMethodDeclaration" targetNodeId="4v.~JTextComponent.setEditable(boolean):void" resolveInfo="setEditable" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220552572674">
                <property name="value" value="false" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552566835">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552566836">
                <link role="fieldDeclaration" targetNodeId="1220549418852" resolveInfo="myMessagesArea" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552566837" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552580506">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552581042">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552587749">
              <link role="baseMethodDeclaration" targetNodeId="16.~JComponent.setBorder(javax.swing.border.Border):void" resolveInfo="setBorder" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552590938">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552590939">
                  <link role="baseMethodDeclaration" targetNodeId="1220552400182" resolveInfo="createBorder" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220552592067">
                    <property name="value" value="Messages" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552590940" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552580507">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552580508">
                <link role="fieldDeclaration" targetNodeId="1220549418852" resolveInfo="myMessagesArea" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552580509" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220552600727">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552608481">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220552608482">
              <link role="fieldDeclaration" targetNodeId="1220549418852" resolveInfo="myMessagesArea" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552608483" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220552557363" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552557368">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220552617201">
      <property name="name" value="createVisibilityPanel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220552617203">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220552633032">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220552633033">
            <property name="name" value="visbilityPanel" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552647975">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552647976">
                <link role="baseMethodDeclaration" targetNodeId="16.~JPanel.&lt;init&gt;(java.awt.LayoutManager)" resolveInfo="JPanel" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552651244">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552654669">
                    <link role="baseMethodDeclaration" targetNodeId="17.~GridBagLayout.&lt;init&gt;()" resolveInfo="GridBagLayout" />
                  </node>
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552633034">
              <link role="classifier" targetNodeId="16.~JPanel" resolveInfo="JPanel" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220552658440">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552676243">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552679497">
              <link role="baseMethodDeclaration" targetNodeId="16.~JComponent.setBorder(javax.swing.border.Border):void" resolveInfo="setBorder" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220552681921">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220552681922">
                  <link role="baseMethodDeclaration" targetNodeId="1220552400182" resolveInfo="createBorder" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220552682956">
                    <property name="value" value="Visibility" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220552681923" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220552668953">
              <link role="variableDeclaration" targetNodeId="1220552633033" resolveInfo="visbilityPanel" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220552699178">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220552699179">
            <property name="name" value="group" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552705949">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552705950">
                <link role="baseMethodDeclaration" targetNodeId="16.~ButtonGroup.&lt;init&gt;()" resolveInfo="ButtonGroup" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552699180">
              <link role="classifier" targetNodeId="16.~ButtonGroup" resolveInfo="ButtonGroup" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220553493260">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220553493261">
            <property name="name" value="c" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220553495953">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220553495954">
                <link role="baseMethodDeclaration" targetNodeId="17.~GridBagConstraints.&lt;init&gt;()" resolveInfo="GridBagConstraints" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220553493262">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220553501661">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220553510610">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220553505010">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553504775">
                <link role="variableDeclaration" targetNodeId="1220553493261" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220553506717">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.fill" resolveInfo="fill" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220553517270">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.NONE" resolveInfo="NONE" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220553523603">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220553531610">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220553523917">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553523604">
                <link role="variableDeclaration" targetNodeId="1220553493261" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220553530077">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridx" resolveInfo="gridx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220553531941">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220553582673">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220553585681">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220553582784">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220553584522">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.gridy" resolveInfo="gridy" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553582674">
                <link role="variableDeclaration" targetNodeId="1220553493261" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220553585949">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220553534273">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220553540719">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220553534432">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553534274">
                <link role="variableDeclaration" targetNodeId="1220553493261" resolveInfo="c" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220553539061">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.weightx" resolveInfo="weightx" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220553541957">
              <property name="value" value="1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220553545430">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220553551312">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220553545588">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220553546389">
                <link role="fieldDeclaration" targetNodeId="17.~GridBagConstraints.anchor" resolveInfo="anchor" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553545431">
                <link role="variableDeclaration" targetNodeId="1220553493261" resolveInfo="c" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220553569738">
              <link role="classifier" targetNodeId="17.~GridBagConstraints" resolveInfo="GridBagConstraints" />
              <link role="variableDeclaration" targetNodeId="17.~GridBagConstraints.FIRST_LINE_START" resolveInfo="FIRST_LINE_START" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220553291139">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220553293049">
            <link role="variableDeclaration" targetNodeId="1220552633033" resolveInfo="visbilityPanel" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220552617202" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552617207">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551802836">
      <property name="name" value="createMethodPanel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551802839">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1220551817784">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220551820301">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220551824319">
              <link role="baseMethodDeclaration" targetNodeId="9.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551834225">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551802838" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551970512">
      <property name="name" value="createParametersPanel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551970514">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1220551970515">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220551970516">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220551970517">
              <link role="baseMethodDeclaration" targetNodeId="9.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551970518">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551970513" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220552400182">
      <property name="name" value="createBorder" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220552408675">
        <property name="name" value="title" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552408676">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220552400185">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1220552505752">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220552506644">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220552510833">
              <link role="baseMethodDeclaration" targetNodeId="9.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220552501954">
        <link role="classifier" targetNodeId="5v.~Border" resolveInfo="Border" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220552400184" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551621516">
      <property name="name" value="getMainComponent" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551621518">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551621519">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551621520">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551621522" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551621521">
              <link role="fieldDeclaration" targetNodeId="1220354294277" resolveInfo="myPanel" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551621517" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551621523">
        <link role="classifier" targetNodeId="16.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220353713046">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220353779518">
        <property name="name" value="kind" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220353779519">
          <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220354420750">
        <property name="name" value="operationContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220354424450">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220549491310">
        <property name="name" value="context" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220549496203">
          <link role="classifier" targetNodeId="35.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220547172585">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220547175681" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220353713049">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1220354388968">
          <link role="constructorDeclaration" targetNodeId="55.~BaseDialog.&lt;init&gt;(java.awt.Frame,java.lang.String)" resolveInfo="BaseDialog" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220355317959">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220355323575">
              <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getMainFrame():java.awt.Frame" resolveInfo="getMainFrame" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220354433468">
              <link role="variableDeclaration" targetNodeId="1220354420750" resolveInfo="operationContext" />
            </node>
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220354396584">
            <property name="value" value="Extract method" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549507143">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220549508819">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549507144">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220549507145">
                <link role="fieldDeclaration" targetNodeId="1220549463555" resolveInfo="myContext" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549507146" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220549511806">
              <link role="variableDeclaration" targetNodeId="1220549491310" resolveInfo="context" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1220547123922">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1220547123923">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220547123924">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220547127331">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220547137649">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220547139856">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220547139857">
                      <link role="baseMethodDeclaration" targetNodeId="1220361337593" resolveInfo="_ExtractMethodRefactoringParameters" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220547182307">
                        <link role="variableDeclaration" targetNodeId="1220547172585" resolveInfo="nodes" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220547127332">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220547127333">
                      <link role="fieldDeclaration" targetNodeId="1220547076451" resolveInfo="myModel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220547127334" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220546631535">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220546631536">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220546631538" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220546631537">
                    <link role="baseMethodDeclaration" targetNodeId="1220546585786" resolveInfo="initPanel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549561082">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220549566071">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549561083">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220549561084">
                <link role="fieldDeclaration" targetNodeId="1220549346015" resolveInfo="myKind" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549561085" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220549574005">
              <link role="variableDeclaration" targetNodeId="1220353779518" resolveInfo="kind" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220549601241">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220549819596">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220549821083">
              <link role="baseMethodDeclaration" targetNodeId="1220549765810" resolveInfo="update" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220549818110" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220353713048" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220353713047" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220353713045" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220354107662">
      <link role="classifier" targetNodeId="55.~BaseDialog" resolveInfo="BaseDialog" />
    </node>
  </node>
  <visible index="6" modelUID="jetbrains.mps.helgins.inference@java_stub" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220377841645">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtractMethodFromExpressionRefactoring" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220526335693">
      <property name="name" value="myExpression" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220526340622">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220526335694" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220377841647">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220377999661">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377999662">
          <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377841650">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1220378585178">
          <link role="constructorDeclaration" targetNodeId="1220377860700" resolveInfo="_ExtractMethodRefactoring" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220378587601">
            <link role="variableDeclaration" targetNodeId="1220377999661" resolveInfo="params" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220526353831">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220526356852">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220526497000">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220526497001">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526497002">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526497003">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220526497004">
                      <link role="variableDeclaration" targetNodeId="1220377999661" resolveInfo="params" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220526497005">
                      <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220526497006">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220526497007">
                      <property name="value" value="0" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220526497008">
                  <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526353832">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220526353833">
                <link role="fieldDeclaration" targetNodeId="1220526335693" resolveInfo="myExpression" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220526353834" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220377841648" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377841649" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220378339279">
      <property name="name" value="doRefactor" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220378339282">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220526835863">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220526835864">
            <property name="name" value="typeOf" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526835866">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220526835867">
                <link role="baseMethodDeclaration" targetNodeId="6v.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
                <link role="classConcept" targetNodeId="6v.~TypeChecker" resolveInfo="TypeChecker" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220526835868">
                <link role="baseMethodDeclaration" targetNodeId="6v.~TypeChecker.getTypeOf(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SNode" resolveInfo="getTypeOf" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526835869">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220526835871" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220526835870">
                    <link role="fieldDeclaration" targetNodeId="1220526335693" resolveInfo="myExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220526835865" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1220526835872">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1220526835873">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220526835874" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220526835875">
              <link role="variableDeclaration" targetNodeId="1220526835864" resolveInfo="typeOf" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220533602065">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220533602066">
            <property name="name" value="typeNode" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220533602068">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220533602069">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533602070">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533602071">
                    <link role="variableDeclaration" targetNodeId="1220526835864" resolveInfo="typeOf" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1220533602072" />
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533602073">
                  <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533602067">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220533630892">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220533630893">
            <property name="name" value="body" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220533641380">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220533641381">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533641382">
                  <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533630894">
              <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220538638363">
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220538785296">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220538785297">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220538793146">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220538793147">
                  <property name="name" value="ret" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220538793148">
                    <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220538808915">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220538808916">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220538808917">
                        <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538814685">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220538821160">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538814859">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220538819096">
                      <link role="link" targetNodeId="1.1068581517676" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538814686">
                      <link role="variableDeclaration" targetNodeId="1220538793147" resolveInfo="ret" />
                    </node>
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538831339">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538827226">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220538830245">
                        <link role="fieldDeclaration" targetNodeId="1220526335693" resolveInfo="myExpression" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220538826600" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1220538833483" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538837782">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538841069">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538838519">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220538840334">
                      <link role="link" targetNodeId="1.1068581517665" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538837783">
                      <link role="variableDeclaration" targetNodeId="1220533630893" resolveInfo="body" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1220538845729">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538853778">
                      <link role="variableDeclaration" targetNodeId="1220538793147" resolveInfo="ret" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220538638364">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220538771676">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220538771677">
                <property name="name" value="expressionStatement" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220538771679">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220538771680">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220538771681">
                      <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220538771678">
                  <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538771682">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220538771683">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538771687">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538771688">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220538771689">
                      <link role="fieldDeclaration" targetNodeId="1220526335693" resolveInfo="myExpression" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220538771690" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1220538771691" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538771684">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538771685">
                    <link role="variableDeclaration" targetNodeId="1220538771677" resolveInfo="expressionStatement" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220538771686">
                    <link role="link" targetNodeId="1.1068580123156" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538771692">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538771693">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538771694">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538771695">
                    <link role="variableDeclaration" targetNodeId="1220533630893" resolveInfo="body" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220538771696">
                    <link role="link" targetNodeId="1.1068581517665" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1220538771697">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538771698">
                    <link role="variableDeclaration" targetNodeId="1220538771677" resolveInfo="expressionStatement" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538735591">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220538738391">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220538740392">
                <link role="conceptDeclaration" targetNodeId="1.1068581517677" resolveInfo="VoidType" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538734981">
              <link role="variableDeclaration" targetNodeId="1220526835864" resolveInfo="typeOf" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220536243410">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220536243411">
            <property name="name" value="params" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220536243412">
              <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220536253101">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220536253102">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220536253103">
                  <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220536149205">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220536149206">
            <property name="name" value="inputToParams" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536213013">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220536213014">
                <link role="baseMethodDeclaration" targetNodeId="1220534384552" resolveInfo="createInputParameters" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220536229392">
                  <link role="variableDeclaration" targetNodeId="1220533630893" resolveInfo="body" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220536261949">
                  <link role="variableDeclaration" targetNodeId="1220536243411" resolveInfo="params" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220536213015" />
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220536149207">
              <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536178415">
                <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536185980">
                <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220536889667">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536889668">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220536889669">
              <link role="baseMethodDeclaration" targetNodeId="1220536327343" resolveInfo="replaceInputVariablesWithParameters" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220536903285">
                <link role="variableDeclaration" targetNodeId="1220533630893" resolveInfo="body" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220536906208">
                <link role="variableDeclaration" targetNodeId="1220536149206" resolveInfo="inputToParams" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220536889670" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220533292491">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220533292492">
            <property name="name" value="newMethod" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533292494">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220533292496" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220533292495">
                <link role="baseMethodDeclaration" targetNodeId="1220527322045" resolveInfo="createNewMethod" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533602090">
                  <link role="variableDeclaration" targetNodeId="1220533602066" resolveInfo="typeNode" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533312942">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220533311801" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220533315992">
                    <link role="fieldDeclaration" targetNodeId="1220540849903" resolveInfo="myMethodName" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537099784">
                  <link role="variableDeclaration" targetNodeId="1220536243411" resolveInfo="params" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533647337">
                  <link role="variableDeclaration" targetNodeId="1220533630893" resolveInfo="body" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533292493">
              <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220533378044">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533378045">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220533378048" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220533378046">
              <link role="baseMethodDeclaration" targetNodeId="1220529585262" resolveInfo="addMethod" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533378047">
                <link role="variableDeclaration" targetNodeId="1220533292492" resolveInfo="newMethod" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220537824584">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220537824585">
            <property name="name" value="methodCall" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537844417">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220537844419" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220537844418">
                <link role="baseMethodDeclaration" targetNodeId="1220537670225" resolveInfo="createMethodCall" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538364941">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220538364942">
                    <link role="baseMethodDeclaration" targetNodeId="1220537320985" resolveInfo="createCallParameters" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220538364943" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538373445">
                  <link role="variableDeclaration" targetNodeId="1220533292492" resolveInfo="newMethod" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537824586">
              <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538348322">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538349544">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538348323">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220538348324">
                <link role="fieldDeclaration" targetNodeId="1220526335693" resolveInfo="myExpression" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220538348325" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1220538351500">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538354112">
                <link role="variableDeclaration" targetNodeId="1220537824585" resolveInfo="methodCall" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220378350941">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220529452846">
            <link role="variableDeclaration" targetNodeId="1220533292492" resolveInfo="newMethod" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220378342893" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220378339281" />
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220378061632">
      <link role="classifier" targetNodeId="1220377860698" resolveInfo="_ExtractMethodRefactoring" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377841646" />
  </node>
  <visible index="7" modelUID="jetbrains.mps.patterns.util@java_stub" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220353307820">
    <property name="name" value="_ExtractMethodRefactoringAnalyzer" />
    <property name="package" value="refactoring.extractMethod" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220353307822">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220358418322">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220358418323" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220353307825">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220359641791">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220359643482">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359641792">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220359641794" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220359641793">
                <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220359648470">
              <link role="variableDeclaration" targetNodeId="1220358418322" resolveInfo="nodes" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220359716133">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220359717387">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359728905">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220359731377">
                <link role="baseMethodDeclaration" targetNodeId="26.~DataFlowManager.buildProgramFor(jetbrains.mps.smodel.SNode):jetbrains.mps.dataFlow.framework.Program" resolveInfo="buildProgramFor" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360521975">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359778171">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220359778173" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220359778172">
                      <link role="baseMethodDeclaration" targetNodeId="1220359750751" resolveInfo="getContainerMethod" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220360524806">
                    <link role="baseMethodDeclaration" targetNodeId="1220360056762" resolveInfo="getNode" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220359727873">
                <link role="baseMethodDeclaration" targetNodeId="26.~DataFlowManager.getInstance():jetbrains.mps.dataFlow.DataFlowManager" resolveInfo="getInstance" />
                <link role="classConcept" targetNodeId="26.~DataFlowManager" resolveInfo="DataFlowManager" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359716134">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220359716136" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220359716135">
                <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220360529510">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220360534016">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360530278">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360532922">
                <link role="fieldDeclaration" targetNodeId="1220360485710" resolveInfo="myReachability" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360529511" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360544100">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360543738">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360543739">
                  <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360543740" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220360545307">
                <link role="baseMethodDeclaration" targetNodeId="25.~Program.analyze(jetbrains.mps.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220360547762">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220360576563">
                    <link role="baseMethodDeclaration" targetNodeId="27.~ReachabilityAnalyzer.&lt;init&gt;()" resolveInfo="ReachabilityAnalyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220363114174">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220363964245">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220363966436">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220363966437">
                <link role="baseMethodDeclaration" targetNodeId="1220363140283" resolveInfo="calculateInternalExitPoints" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220363966438" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220363119634">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220363121544">
                <link role="fieldDeclaration" targetNodeId="1220358494603" resolveInfo="myInternalExitPoints" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220363114175" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220370895654">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220370897688">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370895655">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220370895657" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220370895656">
                <link role="fieldDeclaration" targetNodeId="1220370820587" resolveInfo="myLiveVariables" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370908099">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370907518">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220370907519">
                  <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220370907520" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370909445">
                <link role="baseMethodDeclaration" targetNodeId="25.~Program.analyze(jetbrains.mps.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220370911572">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220370916028">
                    <link role="baseMethodDeclaration" targetNodeId="27.~LivenessAnalyzer.&lt;init&gt;()" resolveInfo="LivenessAnalyzer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220374022458">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220374023853">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374022459">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220374022461" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220374022460">
                <link role="fieldDeclaration" targetNodeId="1220373962225" resolveInfo="myReachingDefinitions" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374034109">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220374034550">
                <link role="baseMethodDeclaration" targetNodeId="25.~Program.analyze(jetbrains.mps.dataFlow.framework.DataFlowAnalyzer):jetbrains.mps.dataFlow.framework.AnalysisResult" resolveInfo="analyze" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220374044692">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220374051571">
                    <link role="baseMethodDeclaration" targetNodeId="27.~ReachingDefinitionsAnalyzer.&lt;init&gt;()" resolveInfo="ReachingDefinitionsAnalyzer" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374033684">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220374033686" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220374033685">
                  <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220353307823" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220353307824" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220359622813">
      <property name="name" value="myPartToExtract" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220359625758" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220359622814" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220359695216">
      <property name="name" value="myProgramm" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220359695217" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359700584">
        <link role="classifier" targetNodeId="25.~Program" resolveInfo="Program" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220358494603">
      <property name="name" value="myInternalExitPoints" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220358494604" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220358740338">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220360485710">
      <property name="name" value="myReachability" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220360490643">
        <link role="classifier" targetNodeId="25.~AnalysisResult" resolveInfo="AnalysisResult" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220360498223">
          <link role="classifier" targetNodeId="9.~Boolean" resolveInfo="Boolean" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220360485711" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220370820587">
      <property name="name" value="myLiveVariables" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220370820588" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370833812">
        <link role="classifier" targetNodeId="25.~AnalysisResult" resolveInfo="AnalysisResult" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370846643">
          <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371732818">
            <link role="classifier" targetNodeId="9.~Object" resolveInfo="Object" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220373962225">
      <property name="name" value="myReachingDefinitions" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220373962226" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220373982854">
        <link role="classifier" targetNodeId="25.~AnalysisResult" resolveInfo="AnalysisResult" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220374000750">
          <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220374004987">
            <link role="classifier" targetNodeId="28.~WriteInstruction" resolveInfo="WriteInstruction" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" id="1220353370732">
      <property name="name" value="isStatements" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220353402674">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220353402675">
          <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220353406398" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220353370735">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220353412291">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220353414403">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220353370734" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220353386573" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220359750751">
      <property name="name" value="getContainerMethod" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359750754">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220360005532">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220360008192">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220360024384">
              <link role="baseMethodDeclaration" targetNodeId="1220359974791" resolveInfo="MethodDeclarationAdapter" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360083226">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360083227">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360083228">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360083230" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360083229">
                      <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220360083231">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220360083232">
                      <property name="value" value="0" />
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220360083233">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220360083234">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220360083235">
                      <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220359750753" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220360089552">
        <link role="classifier" targetNodeId="1220359974789" resolveInfo="MethodDeclarationAdapter" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220358468411">
      <property name="name" value="hasExitPoints" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220358468414">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220358491649">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1220358551990">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220358747886">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220358545983">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220358545985" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220358545984">
                  <link role="fieldDeclaration" targetNodeId="1220358494603" resolveInfo="myInternalExitPoints" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1220358750482" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220358552727">
              <property name="value" value="0" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220358468413" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220358473118" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220361370166">
      <property name="name" value="isInside" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220361382697">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220361382698" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361370169">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220361423655">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220361423656">
            <property name="name" value="current" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220361471151">
              <link role="variableDeclaration" targetNodeId="1220361382697" resolveInfo="node" />
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220361423657" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1220361430987">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361430989">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220361447104">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361451438">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361450967">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220361450968">
                    <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220361450969" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1220361454176">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220361456553">
                    <link role="variableDeclaration" targetNodeId="1220361423656" resolveInfo="current" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361447106">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361462772">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220361464759">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220361489971">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220361491504">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361494977">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1220361498261" />
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220361494226">
                    <link role="variableDeclaration" targetNodeId="1220361423656" resolveInfo="current" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220361489972">
                  <link role="variableDeclaration" targetNodeId="1220361423656" resolveInfo="current" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1220361440100">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220361433037">
              <link role="variableDeclaration" targetNodeId="1220361423656" resolveInfo="current" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220361442041" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361482326">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220361483656">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220361370168" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220361478012" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220363140283">
      <property name="name" value="calculateInternalExitPoints" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220363140286">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220363229740">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220363229741">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220363237855">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220363237856">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220363237857">
                  <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220363229742">
              <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220364496340">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220364496343">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220364624914">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220364624915">
                <property name="name" value="returns" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220364656908">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1220364659226">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220364659227">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220364662948">
                        <link role="conceptDeclaration" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1220364674955" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220364656395">
                    <link role="variable" targetNodeId="1220364496341" resolveInfo="node" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220364633373">
                  <link role="elementConcept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220364731165">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220364731168">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220364876561">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220364876562">
                    <property name="name" value="a1" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220364876563" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220364888851">
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220364888853">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220364888854">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220364888855">
                            <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                          </node>
                        </node>
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220364888856">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220364888857">
                            <link role="conceptDeclaration" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220364888852">
                        <link role="variable" targetNodeId="1220364731166" resolveInfo="ret" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220364899980">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220364899981">
                    <property name="name" value="a2" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220364905409">
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220364905411">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220364905412">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220364905413">
                            <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                          </node>
                        </node>
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220364905414">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220364905415">
                            <link role="conceptDeclaration" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220364921283">
                        <link role="variable" targetNodeId="1220364496341" resolveInfo="node" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220364899982" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220364765351">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220364945911">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220364947463">
                      <link role="variableDeclaration" targetNodeId="1220364899981" resolveInfo="a2" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220364923380">
                      <link role="variableDeclaration" targetNodeId="1220364876562" resolveInfo="a1" />
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220364765353">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220364983503">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220364984445">
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1220364986528">
                          <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220364993238">
                            <link role="variable" targetNodeId="1220364731166" resolveInfo="ret" />
                          </node>
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220364983504">
                          <link role="variableDeclaration" targetNodeId="1220363229741" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220364744923">
                <link role="variableDeclaration" targetNodeId="1220364624915" resolveInfo="returns" />
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220364731166">
                <property name="name" value="ret" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220365006802">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220365006803">
                <property name="name" value="statements" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220365006804">
                  <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220365020521">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220365020522">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220365020523">
                      <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220365028430">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365029326">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1220365035099">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365040151">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220365040044">
                      <link role="variable" targetNodeId="1220364496341" resolveInfo="node" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1220365050286">
                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220365050287">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220365059608">
                          <link role="conceptDeclaration" targetNodeId="1.1081855346303" resolveInfo="BreakStatement" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365028431">
                  <link role="variableDeclaration" targetNodeId="1220365006803" resolveInfo="statements" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220365062230">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365068775">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1220365070534">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365073313">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1220365075183">
                      <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220365075184">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220365080616">
                          <link role="conceptDeclaration" targetNodeId="1.1082113931046" resolveInfo="ContinueStatement" />
                        </node>
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220365072699">
                      <link role="variable" targetNodeId="1220364496341" resolveInfo="node" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365062231">
                  <link role="variableDeclaration" targetNodeId="1220365006803" resolveInfo="statements" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220365088774">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220365088777">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220365113919">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220365113920">
                    <property name="name" value="a1" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365113922">
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220365113924">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220365113927">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220365134092">
                            <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                          </node>
                        </node>
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220365120495">
                        <link role="variable" targetNodeId="1220365088775" resolveInfo="st" />
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220365113921" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220365113929">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220365113930">
                    <property name="name" value="a2" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365113932">
                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220365113938">
                        <link role="variable" targetNodeId="1220364496341" resolveInfo="node" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220365113933">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220365113936">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220365140743">
                            <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220365113931" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220365150345">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220365150346">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220365160200">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365160866">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365160201">
                          <link role="variableDeclaration" targetNodeId="1220363229741" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1220365163452">
                          <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220365166304">
                            <link role="variable" targetNodeId="1220365088775" resolveInfo="st" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220365153203">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365152386">
                      <link role="variableDeclaration" targetNodeId="1220365113920" resolveInfo="a1" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365154151">
                      <link role="variableDeclaration" targetNodeId="1220365113930" resolveInfo="a2" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220365088775">
                <property name="name" value="st" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365096663">
                <link role="variableDeclaration" targetNodeId="1220365006803" resolveInfo="statements" />
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220364505628">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220364505629">
              <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220364505630" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220364496341">
            <property name="name" value="node" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220363242344">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220363243909">
            <link role="variableDeclaration" targetNodeId="1220363229741" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220363172664">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220363140285" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220365580536">
      <property name="name" value="getOutputVariables" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220365580539">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220365646515">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220365646516">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220365646517">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220365650018" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220365687276">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220365690824">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220365694528" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220371021242">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371023198">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371030497">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371034374">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371034375">
                  <link role="baseMethodDeclaration" targetNodeId="1220366062971" resolveInfo="getVarableLiveAtExitPoints" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220371034376" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371021243">
              <link role="variableDeclaration" targetNodeId="1220365646516" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220371037942">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371047037">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371049197">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.retainAll(java.util.Collection):boolean" resolveInfo="retainAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371814229">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220371814231" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371814230">
                  <link role="baseMethodDeclaration" targetNodeId="1220371055432" resolveInfo="getModifacationsReachingExitPoints" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371037943">
              <link role="variableDeclaration" targetNodeId="1220365646516" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220365613800">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220365713370">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220365735683">
              <link role="baseMethodDeclaration" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" resolveInfo="ArrayList" />
              <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220365740309" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365745105">
                <link role="variableDeclaration" targetNodeId="1220365646516" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220365580538" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220365608254" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220371055432">
      <property name="name" value="getModifacationsReachingExitPoints" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371067804">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220371069462" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220371055435">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220371109832">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220371109833">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371109834">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220371109835" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220371109836">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220371109837">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220371109838" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220371113964">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371115309">
            <link role="variableDeclaration" targetNodeId="1220371109833" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220371055434" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220366062971">
      <property name="name" value="getVarableLiveAtExitPoints" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220366062974">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220366137408">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220366137409">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220366162870">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220366172232">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220366175375" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220366137410">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220366148852" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220370761342">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220370761345">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220370800547">
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370934374">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370933963">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220370933965" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220370933964">
                    <link role="fieldDeclaration" targetNodeId="1220370820587" resolveInfo="myLiveVariables" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370937082">
                  <link role="baseMethodDeclaration" targetNodeId="25.~AnalysisResult.get(jetbrains.mps.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220370938632">
                    <link role="variable" targetNodeId="1220370761343" resolveInfo="exitPoint" />
                  </node>
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220370800550">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220370972848">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370974256">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370975696">
                      <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220371932057">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220371932058">
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220371936341" />
                          <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220371932059">
                            <link role="variable" targetNodeId="1220370800548" resolveInfo="variable" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370972849">
                      <link role="variableDeclaration" targetNodeId="1220366137409" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220370800548">
                <property name="name" value="variable" />
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370774563">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220370774565" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370774564">
              <link role="baseMethodDeclaration" targetNodeId="1220370264254" resolveInfo="getExitPoints" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220370761343">
            <property name="name" value="exitPoint" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220366188488">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220366190584">
            <link role="variableDeclaration" targetNodeId="1220366137409" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220366074151">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220366096765" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220366062973" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220370264254">
      <property name="name" value="getExitPoints" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220370264257">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220370335208">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220370335209">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370335210">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370362816">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220370366754">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220370373535">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370379051">
                  <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220370407297">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220370407298">
            <property name="name" value="instructions" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370407299">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370414127">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370422486">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220370422488" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370422487">
                <link role="baseMethodDeclaration" targetNodeId="1220359435119" resolveInfo="getInstructions" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220370442526">
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370456089">
            <link role="variableDeclaration" targetNodeId="1220370407298" resolveInfo="instructions" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220370442529">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220370464494">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370465575">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370469437">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370473047">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220370472391">
                      <link role="variable" targetNodeId="1220370442527" resolveInfo="instruction" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370477050">
                      <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.succ():java.util.Set" resolveInfo="succ" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370464495">
                  <link role="variableDeclaration" targetNodeId="1220370335209" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220370442527">
            <property name="name" value="instruction" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220370484460">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220370486011">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370484461">
              <link role="variableDeclaration" targetNodeId="1220370335209" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220370493701">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.removeAll(java.util.Collection):boolean" resolveInfo="removeAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370499108">
                <link role="variableDeclaration" targetNodeId="1220370407298" resolveInfo="instructions" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220370381521">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220370383990">
            <link role="variableDeclaration" targetNodeId="1220370335209" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370349629">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220370356020">
          <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220370264256" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220371189331">
      <property name="name" value="getPreExitPoints" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220371189334">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220371240903">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220371240904">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220371240907">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220371240908">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371240909">
                  <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371240905">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371240906">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220371249207">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220371249208">
            <property name="name" value="exitPoints" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371253041">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371256762">
                <link role="baseMethodDeclaration" targetNodeId="1220370264254" resolveInfo="getExitPoints" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220371249213" />
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371249209">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371249210">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220371260717">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220371260720">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220371272785">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371273288">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371275026">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371278166">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371279436">
                      <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.pred():java.util.Set" resolveInfo="pred" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220371277652">
                      <link role="variable" targetNodeId="1220371260718" resolveInfo="exitPoint" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371272786">
                  <link role="variableDeclaration" targetNodeId="1220371240904" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220371260718">
            <property name="name" value="exitPoint" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371264628">
            <link role="variableDeclaration" targetNodeId="1220371249208" resolveInfo="exitPoints" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220371319415">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371320215">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371323046">
              <link role="baseMethodDeclaration" targetNodeId="4.~Set.retainAll(java.util.Collection):boolean" resolveInfo="retainAll" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220371337909">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220371337911" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220371337910">
                  <link role="baseMethodDeclaration" targetNodeId="1220359435119" resolveInfo="getInstructions" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371319416">
              <link role="variableDeclaration" targetNodeId="1220371240904" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220371347465">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220371355224">
            <link role="variableDeclaration" targetNodeId="1220371240904" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220371189333" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371193251">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220371197190">
          <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220358670544">
      <property name="name" value="isExitPointsDifferent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220358670546" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220358670547">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220358712581">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220358712582">
            <property name="name" value="exits" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220358732210">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220358732212" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220358732211">
                <link role="fieldDeclaration" targetNodeId="1220358494603" resolveInfo="myInternalExitPoints" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220358712583">
              <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1220358782075">
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1220358802968">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220358802969">
              <link role="variableDeclaration" targetNodeId="1220358782078" resolveInfo="i" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220358782076">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220358809664">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220358814558">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220359000264">
                  <link role="baseMethodDeclaration" targetNodeId="7v.~MatchingUtil.matchNodes(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.SNode):boolean" resolveInfo="matchNodes" />
                  <link role="classConcept" targetNodeId="7v.~MatchingUtil" resolveInfo="MatchingUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359014395">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359012956">
                      <link role="variableDeclaration" targetNodeId="1220358712582" resolveInfo="exits" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220359018835">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1220359027987">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359023104">
                          <link role="variableDeclaration" targetNodeId="1220358782078" resolveInfo="i" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220359028318">
                          <property name="value" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359035955">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359034125">
                      <link role="variableDeclaration" targetNodeId="1220358712582" resolveInfo="exits" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220359038381">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359040587">
                        <link role="variableDeclaration" targetNodeId="1220358782078" resolveInfo="i" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220358809666">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220359058277">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220362455827">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220358782078">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1220358784127" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220358788941">
              <property name="value" value="1" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1220358792709">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220358791364">
              <link role="variableDeclaration" targetNodeId="1220358782078" resolveInfo="i" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220358796306">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220358795305">
                <link role="variableDeclaration" targetNodeId="1220358712582" resolveInfo="exits" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1220358799981" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220359063563">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220362462127">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220359074128" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220359313540">
      <property name="name" value="isStatementsAlwaysReturns" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359313543">
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220359389568">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359389571">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220360321776">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220360321778">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220361287185">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361287187">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220361308045">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361308048">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220361326136">
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1220361349259">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220361363396">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361513071">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220361513073" />
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361513072">
                                  <link role="baseMethodDeclaration" targetNodeId="1220361370166" resolveInfo="isInside" />
                                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220361550348">
                                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361557117">
                                      <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220361555543">
                                        <link role="variable" targetNodeId="1220361308046" resolveInfo="next" />
                                      </node>
                                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361560778">
                                        <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.getSource():java.lang.Object" resolveInfo="getSource" />
                                      </node>
                                    </node>
                                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220361552650" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220361355092">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361355093">
                                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220361355094">
                                  <link role="variable" targetNodeId="1220361308046" resolveInfo="next" />
                                </node>
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361355095">
                                  <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.getSource():java.lang.Object" resolveInfo="getSource" />
                                </node>
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220361355096" />
                            </node>
                          </node>
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361326138">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361573734">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220361576131">
                                <property name="value" value="false" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361317472">
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220361316910">
                          <link role="variable" targetNodeId="1220359389569" resolveInfo="instruction" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361320555">
                          <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.succ():java.util.Set" resolveInfo="succ" />
                        </node>
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220361308046">
                        <property name="name" value="next" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361290630">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361290064">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220361290065">
                        <link role="fieldDeclaration" targetNodeId="1220360485710" resolveInfo="myReachability" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220361290066" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361292962">
                      <link role="baseMethodDeclaration" targetNodeId="25.~AnalysisResult.get(jetbrains.mps.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220361297605">
                        <link role="variable" targetNodeId="1220359389569" resolveInfo="instruction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220360330623">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360405046">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220360401902">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220360401903">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360401904">
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220360401905">
                          <link role="variable" targetNodeId="1220359389569" resolveInfo="instruction" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220360401906">
                          <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.getSource():java.lang.Object" resolveInfo="getSource" />
                        </node>
                      </node>
                      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220360401907" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220360410503">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220360415552">
                      <link role="conceptDeclaration" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360315647">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360315649" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220360315648">
              <link role="baseMethodDeclaration" targetNodeId="1220359435119" resolveInfo="getInstructions" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220359389569">
            <property name="name" value="instruction" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361581715">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220361583190">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220359339141" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220359313542" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220359435119">
      <property name="name" value="getInstructions" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359435122">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220359506445">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220359506446">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220359547561">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220359589487">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359597020">
                  <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359506447">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359511512">
                <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220359602475">
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359614199">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220359614201" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220359655205">
              <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359602478">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220359681973">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359682710">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359681974">
                  <link role="variableDeclaration" targetNodeId="1220359506446" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220359684120">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Set.addAll(java.util.Collection):boolean" resolveInfo="addAll" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360149852">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360149362">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360149363">
                        <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360149364" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220360158404">
                      <link role="baseMethodDeclaration" targetNodeId="25.~Program.getInstructionsFor(java.lang.Object):java.util.List" resolveInfo="getInstructionsFor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220360160907">
                        <link role="variable" targetNodeId="1220359602476" resolveInfo="node" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220359602476">
            <property name="name" value="node" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220360234741">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220360236169">
            <link role="variableDeclaration" targetNodeId="1220359506446" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359464893">
        <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220359491632">
          <link role="classifier" targetNodeId="28.~Instruction" resolveInfo="Instruction" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220359435121" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220373703517">
      <property name="name" value="isReturnStatementIntepended" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373703520">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220373806114">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220373806115">
            <property name="name" value="returns" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220373821618">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220373821619">
                <link role="baseMethodDeclaration" targetNodeId="1220363140283" resolveInfo="calculateInternalExitPoints" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220373821620" />
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220373806116" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220373839154">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373839157">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220373886632">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373886635">
                <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220373940140">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373940143">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220374294110">
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374297067">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220374297068">
                          <link role="baseMethodDeclaration" targetNodeId="1220361370166" resolveInfo="isInside" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220374349837">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220374349838">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374349839">
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220374349841">
                                  <link role="baseMethodDeclaration" targetNodeId="28.~Instruction.getSource():java.lang.Object" resolveInfo="getSource" />
                                </node>
                                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220374349840">
                                  <link role="variable" targetNodeId="1220373940141" resolveInfo="writeInstruction" />
                                </node>
                              </node>
                              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220374349842" />
                            </node>
                          </node>
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220374297069" />
                      </node>
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220374294112">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220374357503">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220374363382">
                            <property name="value" value="false" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374332635">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374216103">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220374216105" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220374216104">
                        <link role="fieldDeclaration" targetNodeId="1220373962225" resolveInfo="myReachingDefinitions" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220374335422">
                      <link role="baseMethodDeclaration" targetNodeId="25.~AnalysisResult.get(jetbrains.mps.dataFlow.framework.instructions.Instruction):java.lang.Object" resolveInfo="get" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220374337893">
                        <link role="variable" targetNodeId="1220373886633" resolveInfo="instruction" />
                      </node>
                    </node>
                  </node>
                  <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220373940141">
                    <property name="name" value="writeInstruction" />
                  </node>
                </node>
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220373902909">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220373906242">
                  <link role="baseMethodDeclaration" targetNodeId="25.~Program.getInstructionsFor(java.lang.Object):java.util.List" resolveInfo="getInstructionsFor" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220373909667">
                    <link role="variable" targetNodeId="1220373839155" resolveInfo="ret" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220373901685">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220373901686">
                    <link role="fieldDeclaration" targetNodeId="1220359695216" resolveInfo="myProgramm" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220373901687" />
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220373886633">
                <property name="name" value="instruction" />
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220373842815">
            <link role="variableDeclaration" targetNodeId="1220373806115" resolveInfo="returns" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220373839155">
            <property name="name" value="ret" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220374366839">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1220374368280">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220373703519" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220373723521" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220534962544">
      <property name="name" value="getInputVariables" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534962547">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220535009571">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220535009572">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220535009573">
              <link role="classifier" targetNodeId="4.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535014512">
                <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220535026405">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220535042001">
                <link role="baseMethodDeclaration" targetNodeId="4.~LinkedHashSet.&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535045097">
                  <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220535100280">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220535100283">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220535257384">
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535265562">
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535264953">
                  <link role="variable" targetNodeId="1220535100281" resolveInfo="node" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1220535270302">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220535270303">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220535274011">
                      <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                    </node>
                  </node>
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1220535275550" />
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220535257385">
                <property name="name" value="var" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220535257387">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535345031">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535345534">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535347444">
                      <link role="baseMethodDeclaration" targetNodeId="4.~Set.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535350472">
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220535357291">
                          <link role="link" targetNodeId="1.1068581517664" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535348821">
                          <link role="variable" targetNodeId="1220535257385" resolveInfo="var" />
                        </node>
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535345032">
                      <link role="variableDeclaration" targetNodeId="1220535009572" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535116115">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535116116">
              <link role="fieldDeclaration" targetNodeId="1220359622813" resolveInfo="myPartToExtract" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535116117" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220535100281">
            <property name="name" value="node" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220535051052">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220535052882">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220535057525">
              <link role="baseMethodDeclaration" targetNodeId="4.~ArrayList.&lt;init&gt;(java.util.Collection)" resolveInfo="ArrayList" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535060526">
                <link role="variableDeclaration" targetNodeId="1220535009572" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220534962546" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220535152723">
        <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220353307821" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220357014647">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtractMethodKind" />
    <property name="abstractClass" value="true" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220357524984">
      <property name="name" value="getErrors" />
      <property name="isAbstract" value="true" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220357539819">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220357544040">
          <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220357545948" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357524986" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220357529535">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220357524987" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220361557676">
      <property name="name" value="createRefactoring" />
      <property name="isAbstract" value="true" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220361620793">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220361620794">
          <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361557679">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361612056">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220361613495" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220361557678" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220361583351">
        <link role="classifier" targetNodeId="1220377860698" resolveInfo="_ExtractMethodRefactoring" />
      </node>
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1220357049468">
      <property name="name" value="FROM_STATEMENTS" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220357777024">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1220357845545">
          <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1220357845546">
            <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220357845548">
              <property name="name" value="getErrors" />
              <property name="isAbstract" value="false" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220357845549">
                <property name="name" value="nodes" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220358431527" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220357845554">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220358389410">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220358389411">
                    <property name="name" value="analizer" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220358389412">
                      <link role="classifier" targetNodeId="1220353307820" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220358395601">
                      <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220358395602">
                        <link role="baseMethodDeclaration" targetNodeId="1220353307822" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220358408040">
                          <link role="variableDeclaration" targetNodeId="1220357845549" resolveInfo="nodes" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220358644118">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1220359288999">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220359238965">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220359282686">
                        <link role="baseMethodDeclaration" targetNodeId="1220358670544" resolveInfo="isExitPointsDifferent" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220358665559">
                        <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                      </node>
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220359291018">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361613131">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220359298708">
                          <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220361619775">
                          <link role="baseMethodDeclaration" targetNodeId="1220359313540" resolveInfo="isStatementsAlwaysReturns" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220358644119">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220361650541">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220361651809">
                        <property name="value" value="There is multiple exit points." />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220365522491">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220365522492">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220365849286">
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1220365891610">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365881484">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220365854197">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220365879686">
                              <link role="baseMethodDeclaration" targetNodeId="1220365580536" resolveInfo="getOutputVariables" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220365853993">
                              <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1220365887127" />
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220373302386">
                          <property name="value" value="1" />
                        </node>
                      </node>
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220365849288">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220365898757">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220365898758">
                            <property name="value" value="Too many output variables." />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1220373306873">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373306874">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220373649672">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1220373649673">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220374823225">
                            <property name="value" value="0" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220373649674">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220373649675">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220373649676">
                                <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220373649677">
                                <link role="baseMethodDeclaration" targetNodeId="1220365580536" resolveInfo="getOutputVariables" />
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1220373649678" />
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373649680">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220373649681">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220373649682">
                              <property name="value" value="Too many output variables." />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220373657920">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220374570158">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220374570159">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220374570161">
                              <link role="baseMethodDeclaration" targetNodeId="1220373703517" resolveInfo="isReturnStatementIntepended" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220374570160">
                              <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                            </node>
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220373657928">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220373657929">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220373657930">
                              <property name="value" value="Too many output variables." />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220376368602">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220376368603">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220376368605">
                        <link role="baseMethodDeclaration" targetNodeId="1220358468411" resolveInfo="hasExitPoints" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220376368604">
                        <link role="variableDeclaration" targetNodeId="1220358389411" resolveInfo="analizer" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220357850446">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220357851963" />
                </node>
              </node>
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357845552" />
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220357845553">
                <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220377592649">
              <property name="name" value="createRefactoring" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220377673709">
                <property name="name" value="params" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377673710">
                  <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377592652">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220377680695">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220539520211">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220539574055">
                      <link role="baseMethodDeclaration" targetNodeId="1220539339108" resolveInfo="_ExtracMethodFromStatementsRefactoring" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220539577071">
                        <link role="variableDeclaration" targetNodeId="1220377673709" resolveInfo="params" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377592651" />
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377655395">
                <link role="classifier" targetNodeId="1220377860698" resolveInfo="_ExtractMethodRefactoring" />
              </node>
            </node>
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357845547" />
          </node>
        </node>
      </node>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220357059442">
        <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357285477" />
    </node>
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1220357070664">
      <property name="name" value="FROM_EXPRESSION" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220377695433">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1220377703638">
          <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1220377703639">
            <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220377703641">
              <property name="name" value="getErrors" />
              <property name="isAbstract" value="false" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220377703642">
                <property name="name" value="nodes" />
                <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220377703643">
                  <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220377703644" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377703647">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220377728233">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220377728234">
                    <property name="name" value="analizer" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377728235">
                      <link role="classifier" targetNodeId="1220353307820" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220377728236">
                      <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220377728237">
                        <link role="baseMethodDeclaration" targetNodeId="1220353307822" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220377728238">
                          <link role="variableDeclaration" targetNodeId="1220377703642" resolveInfo="nodes" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220377735432">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1220377735433">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220377735434">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220377735435">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220377735437">
                          <link role="baseMethodDeclaration" targetNodeId="1220365580536" resolveInfo="getOutputVariables" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220377735436">
                          <link role="variableDeclaration" targetNodeId="1220377728234" resolveInfo="analizer" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1220377735438" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220377735439">
                      <property name="value" value="1" />
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377735440">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220377735441">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220377735442">
                        <property name="value" value="Too many output variables." />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220377745899">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220377747294" />
                </node>
              </node>
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377703645" />
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377703646">
                <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220377703648">
              <property name="name" value="createRefactoring" />
              <property name="isAbstract" value="false" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220377703651">
                <property name="name" value="params" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377703652">
                  <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377703653">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220377752061">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220377765392">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220377779129">
                      <link role="baseMethodDeclaration" targetNodeId="1220377841647" resolveInfo="_ExtractMethodFromExpressionRefactoring" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220377970379">
                        <link role="variableDeclaration" targetNodeId="1220377703651" resolveInfo="params" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377703649" />
              <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220377703650">
                <link role="classifier" targetNodeId="1220377860698" resolveInfo="_ExtractMethodRefactoring" />
              </node>
            </node>
            <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377703640" />
          </node>
        </node>
      </node>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220357077059">
        <link role="classifier" targetNodeId="1220357014647" resolveInfo="_ExtractMethodKind" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357288588" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220357014648" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220361337591">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtractMethodRefactoringParameters" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220527954981">
      <property name="name" value="myAnalyzer" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220527954982" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220527962633">
        <link role="classifier" targetNodeId="1220353307820" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220361470799">
      <property name="name" value="myMethodName" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220361473255">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220361470800" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220526377255">
      <property name="name" value="myNodesToRefactor" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220526381416" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220526377256" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220532497944">
      <property name="name" value="myVisibility" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1220532523563">
        <link role="enumConstantDeclaration" targetNodeId="1220532405463" resolveInfo="PRIVATE" />
        <link role="enumClass" targetNodeId="1220532392832" resolveInfo="_VisibilityLevel" />
      </node>
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220532503608">
        <link role="classifier" targetNodeId="1220532392832" resolveInfo="_VisibilityLevel" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220532497945" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220534791103">
      <property name="name" value="myParameters" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534794971">
        <link role="classifier" targetNodeId="4.~List" resolveInfo="List" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534800848">
          <link role="classifier" targetNodeId="1220534739186" resolveInfo="_MethodParameter" />
        </node>
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220537573812">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220537579159">
          <link role="baseMethodDeclaration" targetNodeId="4.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList" />
          <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220537589429">
            <link role="classifier" targetNodeId="1220534739186" resolveInfo="_MethodParameter" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220534791104" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220551220019">
      <property name="name" value="myMethodType" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220551220020" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551225071">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220361394143">
      <property name="name" value="setMethodName" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220361402350">
        <property name="name" value="name" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220361402351">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361394146">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220361461184">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220361462983">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220361484069">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220361484071" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220361484070">
                <link role="fieldDeclaration" targetNodeId="1220361470799" resolveInfo="myMethodName" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220361466814">
              <link role="variableDeclaration" targetNodeId="1220361402350" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220361394145" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220361394144" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220526423797">
      <property name="name" value="getNodesToRefactor" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220526423799" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220526423800">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220526440688">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526474463">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220526474465" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220526474464">
              <link role="fieldDeclaration" targetNodeId="1220526377255" resolveInfo="myNodesToRefactor" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220526439172" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220526892170">
      <property name="name" value="getMethodName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220526907012">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220526892173">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220526956349">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220526960662">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220526960664" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220526960663">
              <link role="fieldDeclaration" targetNodeId="1220361470799" resolveInfo="myMethodName" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220526892172" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220528050595">
      <property name="name" value="getContainerMethod" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220528123889">
        <link role="classifier" targetNodeId="1220359974789" resolveInfo="MethodDeclarationAdapter" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220528050598">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220528082760">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528085737">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528085327">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220528085328">
                <link role="fieldDeclaration" targetNodeId="1220527954981" resolveInfo="myAnalyzer" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220528085329" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528089009">
              <link role="baseMethodDeclaration" targetNodeId="1220359750751" resolveInfo="getContainerMethod" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220528050597" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220532299333">
      <property name="name" value="getVisibilityLevel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220532299336">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220532562548">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532565706">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220532565707">
              <link role="fieldDeclaration" targetNodeId="1220532497944" resolveInfo="myVisibility" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220532565708" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220532570694">
        <link role="classifier" targetNodeId="1220532392832" resolveInfo="_VisibilityLevel" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220532299335" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220534672125">
      <property name="name" value="getParameters" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534672128">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220534784305">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220534814068">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220534814069">
              <link role="fieldDeclaration" targetNodeId="1220534791103" resolveInfo="myParameters" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220534814070" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220534672127" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534704198">
        <link role="classifier" targetNodeId="4.~List" resolveInfo="List" />
        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534777257">
          <link role="classifier" targetNodeId="1220534739186" resolveInfo="_MethodParameter" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220550636163">
      <property name="name" value="getOverridingMethodClass" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220550636166">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1220550694253">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220550695005">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220550733262">
              <link role="baseMethodDeclaration" targetNodeId="9.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220550640231">
        <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220550636165" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551155248">
      <property name="name" value="getMethodType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551155251">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551216690">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551252391">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551252392">
              <link role="fieldDeclaration" targetNodeId="1220551220019" resolveInfo="myMethodType" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551252393" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551155250" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551208643">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220361337593">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220361378234">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220361378235" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220361337596">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220530598786">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220530605464">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220530609858">
              <link role="variableDeclaration" targetNodeId="1220361378234" resolveInfo="nodes" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220530598976">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220530603322">
                <link role="fieldDeclaration" targetNodeId="1220526377255" resolveInfo="myNodesToRefactor" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220530598787" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220527984251">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220527989604">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220527984252">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220527984254" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220527984253">
                <link role="fieldDeclaration" targetNodeId="1220527954981" resolveInfo="myAnalyzer" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220527992704">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220527992705">
                <link role="baseMethodDeclaration" targetNodeId="1220353307822" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220527996913">
                  <link role="variableDeclaration" targetNodeId="1220361378234" resolveInfo="nodes" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220534841307">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534841310">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535400162">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535400666">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535400163">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535400165" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535400164">
                    <link role="fieldDeclaration" targetNodeId="1220534791103" resolveInfo="myParameters" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535402231">
                  <link role="baseMethodDeclaration" targetNodeId="4.~List.add(java.lang.Object):boolean" resolveInfo="add" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220535403186">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220535407297">
                      <link role="baseMethodDeclaration" targetNodeId="1220534739188" resolveInfo="_MethodParameter" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535411407">
                        <link role="variable" targetNodeId="1220534841308" resolveInfo="inputVariable" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220534860691">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220534859906">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220534859908" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220534859907">
                <link role="fieldDeclaration" targetNodeId="1220527954981" resolveInfo="myAnalyzer" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535377951">
              <link role="baseMethodDeclaration" targetNodeId="1220534962544" resolveInfo="getInputVariables" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220534841308">
            <property name="name" value="inputVariable" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220361337594" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220361337595" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220361337592" />
  </node>
  <visible index="8" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220377860698">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtractMethodRefactoring" />
    <property name="abstractClass" value="true" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220527869261">
      <property name="name" value="myParameters" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1220541133777" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220527894307">
        <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220540849903">
      <property name="name" value="myMethodName" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220540849905">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1220540902185" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220541074548">
      <property name="name" value="myAnalyzer" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220541074550">
        <link role="classifier" targetNodeId="1220353307820" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1220541130557" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220377860700">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220378615462">
        <property name="name" value="parameters" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220378615463">
          <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220377860703">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220527902895">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220530820774">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220530870432">
              <link role="variableDeclaration" targetNodeId="1220378615462" resolveInfo="parameters" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220527902896">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220527902898" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220527902897">
                <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220540875800">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220540875801">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220540875802">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220540875804">
                <link role="baseMethodDeclaration" targetNodeId="1220526892170" resolveInfo="getMethodName" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220540880683">
                <link role="variableDeclaration" targetNodeId="1220378615462" resolveInfo="parameters" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220540875805">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220540875806" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220540875807">
                <link role="fieldDeclaration" targetNodeId="1220540849903" resolveInfo="myMethodName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220541099171">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220541099172">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220541099173">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220541099174">
                <link role="baseMethodDeclaration" targetNodeId="1220353307822" resolveInfo="_ExtractMethodRefactoringAnalyzer" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541099175">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220541103681">
                    <link role="variableDeclaration" targetNodeId="1220378615462" resolveInfo="parameters" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541099177">
                    <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                  </node>
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541099178">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220541099180">
                <link role="fieldDeclaration" targetNodeId="1220541074548" resolveInfo="myAnalyzer" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541099179" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220377860701" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377860702" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220378245391">
      <property name="name" value="doRefactor" />
      <property name="isAbstract" value="true" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220378254317" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220378245393" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220378245394" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220527322045">
      <property name="name" value="createNewMethod" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220533397580">
        <property name="name" value="type" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533397581">
          <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220533415395">
        <property name="name" value="name" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220533419022">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220533424492">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220533427681">
          <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220533664166">
        <property name="name" value="body" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533679324">
          <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220527322048">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220528279885">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220528279886">
            <property name="name" value="methodConcept" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528299500">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528299501">
                <link role="baseMethodDeclaration" targetNodeId="1220527346069" resolveInfo="getMethodConcept" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220528299502" />
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220528279887">
              <link role="concept" targetNodeId="8v.1071489090640" resolveInfo="ConceptDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1220528310152">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1220528323304">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220528324808" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220528321818">
              <link role="variableDeclaration" targetNodeId="1220528279886" resolveInfo="methodConcept" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220528345043">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220528345044">
            <property name="name" value="declaration" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528529336">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220528399444">
                <link role="baseMethodDeclaration" targetNodeId="5.~SModelUtil_new.instantiateConceptDeclaration(jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration,jetbrains.mps.smodel.SModel):jetbrains.mps.smodel.INodeAdapter" resolveInfo="instantiateConceptDeclaration" />
                <link role="classConcept" targetNodeId="5.~SModelUtil_new" resolveInfo="SModelUtil_new" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528420961">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1220528422856" />
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220528405746">
                    <link role="variableDeclaration" targetNodeId="1220528279886" resolveInfo="methodConcept" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528519983">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220528519985" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528519984">
                    <link role="baseMethodDeclaration" targetNodeId="1220528477261" resolveInfo="getModel" />
                  </node>
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528537797">
                <link role="baseMethodDeclaration" targetNodeId="5.~INodeAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220528345045" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220532175235">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220532175236">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220532197027">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220532197028">
                <property name="name" value="visibleDeclaration" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220532232421">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220532232422">
                    <link role="concept" targetNodeId="1.1178549954367" resolveInfo="Visible" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220532239721">
                    <link role="variableDeclaration" targetNodeId="1220528345044" resolveInfo="declaration" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220532197029">
                  <link role="concept" targetNodeId="1.1178549954367" resolveInfo="Visible" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220532242473">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220532247901">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532244038">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220532242474">
                    <link role="variableDeclaration" targetNodeId="1220532197028" resolveInfo="visibleDeclaration" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220532246260">
                    <link role="link" targetNodeId="1.1178549979242" />
                  </node>
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532583977">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220532585980">
                    <link role="baseMethodDeclaration" targetNodeId="1220532452404" resolveInfo="getNode" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532253220">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532250982">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220532250984" />
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220532250983">
                        <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220532583335">
                      <link role="baseMethodDeclaration" targetNodeId="1220532299333" resolveInfo="getVisibilityLevel" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220532182381">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220532185493">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220532189604">
                <link role="conceptDeclaration" targetNodeId="1.1178549954367" resolveInfo="Visible" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220532179583">
              <link role="variableDeclaration" targetNodeId="1220528345044" resolveInfo="declaration" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220533703435">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220533703436">
            <property name="name" value="methodDeclaration" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220533703438">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220533703439">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533703440">
                  <link role="variableDeclaration" targetNodeId="1220528345044" resolveInfo="declaration" />
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533703441">
                  <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220533703437">
              <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220533711522">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220533730685">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533712571">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220533728699">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533711523">
                <link role="variableDeclaration" targetNodeId="1220533703436" resolveInfo="methodDeclaration" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220533733907">
              <link role="variableDeclaration" targetNodeId="1220533397580" resolveInfo="type" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220533737799">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220533746274">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533739411">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533737800">
                <link role="variableDeclaration" targetNodeId="1220533703436" resolveInfo="methodDeclaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220533741929">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220533751777">
              <link role="variableDeclaration" targetNodeId="1220533415395" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220533755154">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533766926">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddAllOperation" id="1220533783414">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220533786181">
                <link role="variableDeclaration" targetNodeId="1220533424492" resolveInfo="params" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533757234">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220533762909">
                <link role="link" targetNodeId="1.1068580123134" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533755155">
                <link role="variableDeclaration" targetNodeId="1220533703436" resolveInfo="methodDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220533791980">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220533797939">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220533800895">
              <link role="variableDeclaration" targetNodeId="1220533664166" resolveInfo="body" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220533793435">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220533795595">
                <link role="link" targetNodeId="1.1068580123135" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533791981">
                <link role="variableDeclaration" targetNodeId="1220533703436" resolveInfo="methodDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220528557330">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220533703442">
            <link role="variableDeclaration" targetNodeId="1220533703436" resolveInfo="methodDeclaration" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220527322047" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220528565420">
        <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220527346069">
      <property name="name" value="getMethodConcept" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220527346072">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220527653813">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220529218778">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220527812146">
              <link role="classConcept" targetNodeId="5.~SModelUtil_new" resolveInfo="SModelUtil_new" />
              <link role="baseMethodDeclaration" targetNodeId="5.~SModelUtil_new.findConceptDeclaration(java.lang.Class):jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration" resolveInfo="findConceptDeclaration" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220529053290">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220529060260">
                  <link role="baseMethodDeclaration" targetNodeId="9.~Object.getClass():java.lang.Class" resolveInfo="getClass" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220528855196">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528855198">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220528855199">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528855200">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528855201">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528855202">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220528855203">
                              <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220528855204" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528855205">
                            <link role="baseMethodDeclaration" targetNodeId="1220528050595" resolveInfo="getContainerMethod" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528855206">
                          <link role="baseMethodDeclaration" targetNodeId="1220360056762" resolveInfo="getNode" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1220528855207" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220529223640">
              <link role="baseMethodDeclaration" targetNodeId="5.~BaseAdapter.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220527357268">
        <link role="concept" targetNodeId="8v.1071489090640" resolveInfo="ConceptDeclaration" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220527346071" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220528477261">
      <property name="name" value="getModel" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220528477264">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220528487006">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528511942">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1220528509065">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528494222">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528489919">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220528488791">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220528488792">
                      <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220528488793" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528493533">
                    <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220528497196">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220528498387">
                    <property name="value" value="0" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220528514635">
              <link role="baseMethodDeclaration" targetNodeId="5.~SNode.getModel():jetbrains.mps.smodel.SModel" resolveInfo="getModel" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220528485239">
        <link role="classifier" targetNodeId="5.~SModel" resolveInfo="SModel" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220528477263" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220529585262">
      <property name="name" value="addMethod" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220529597785">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220529597786" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220529585265">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220529647864">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220529647865">
            <property name="name" value="classNode" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220529647866">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220531361639">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1220531364205">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220531364206">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220531370474">
                    <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220531357494">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220531347193">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220531356290">
                    <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220529656933">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220529656934">
                      <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220529656935" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220531359482">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220531360485">
                    <property name="value" value="0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220531389663">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220531399145">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220531390770">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220531396585">
                <link role="link" targetNodeId="1.1107880067339" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220531389664">
                <link role="variableDeclaration" targetNodeId="1220529647865" resolveInfo="classNode" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1220531406663">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220531418152">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220531418153">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220531421796">
                    <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220531418154">
                    <link role="variableDeclaration" targetNodeId="1220529597785" resolveInfo="node" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220529585264" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220529585263" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220534384552">
      <property name="name" value="createInputParameters" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220534449966">
        <property name="name" value="body" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536288453" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220535818676">
        <property name="name" value="parameters" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220535832242">
          <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534384555">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220534534057">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220534534058">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534534059">
              <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534545045">
                <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534554204">
                <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220534562285">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1220534567131">
                <link role="baseMethodDeclaration" targetNodeId="4.~HashMap.&lt;init&gt;()" resolveInfo="HashMap" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534594931">
                  <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534603746">
                  <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220534623017">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534623020">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220535503305">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220535503306">
                <property name="name" value="parameter" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220535515716">
                  <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220535515717">
                    <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535515718">
                      <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                    </node>
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535503307">
                  <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535536439">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220535574211">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535687194">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535685551">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535584323">
                      <link role="variable" targetNodeId="1220534623018" resolveInfo="methodParameter" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535686774">
                      <link role="baseMethodDeclaration" targetNodeId="1220535605000" resolveInfo="getType" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1220535689542" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535537550">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220535572460">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535536440">
                    <link role="variableDeclaration" targetNodeId="1220535503306" resolveInfo="parameter" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535706327">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220535716586">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535721901">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535814393">
                    <link role="baseMethodDeclaration" targetNodeId="1220535732483" resolveInfo="getName" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535720528">
                    <link role="variable" targetNodeId="1220534623018" resolveInfo="methodParameter" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535712033">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220535714912">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535706328">
                    <link role="variableDeclaration" targetNodeId="1220535503306" resolveInfo="parameter" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535858698">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535859717">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1220535862252">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535868071">
                    <link role="variableDeclaration" targetNodeId="1220535503306" resolveInfo="parameter" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220535858699">
                  <link role="variableDeclaration" targetNodeId="1220535818676" resolveInfo="parameters" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535872765">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535873628">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535876992">
                  <link role="baseMethodDeclaration" targetNodeId="4.~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolveInfo="put" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535882311">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220536088949">
                      <link role="baseMethodDeclaration" targetNodeId="1220535914546" resolveInfo="getDeclaration" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220535907840">
                      <link role="variable" targetNodeId="1220534623018" resolveInfo="methodParameter" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535893944">
                    <link role="variableDeclaration" targetNodeId="1220535503306" resolveInfo="parameter" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220535872766">
                  <link role="variableDeclaration" targetNodeId="1220534534058" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220534623018">
            <property name="name" value="methodParameter" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220534652886">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220534651163">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220534651164">
                <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220534651165" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220535467193">
              <link role="baseMethodDeclaration" targetNodeId="1220534672125" resolveInfo="getParameters" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220534611107">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220534612968">
            <link role="variableDeclaration" targetNodeId="1220534534058" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220534470736">
        <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534473159">
          <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
        </node>
        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220534494724">
          <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220534384554" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220536327343">
      <property name="name" value="replaceInputVariablesWithParameters" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220536400340">
        <property name="name" value="body" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536400341">
          <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220536413170">
        <property name="name" value="map" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220536423578">
          <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536423579">
            <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
          </node>
          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536423580">
            <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
          </node>
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220536327346">
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220536466549">
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536488305">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1220536496684">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1220536496685">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220536501563">
                  <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220536487022">
              <link role="variableDeclaration" targetNodeId="1220536400340" resolveInfo="body" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220536466552">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220536505846">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220536505848">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220536544694">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536545380">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1220536551839">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536689255">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220536689256">
                          <link role="baseMethodDeclaration" targetNodeId="1220536581434" resolveInfo="createReferance" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536693869">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220536696106">
                              <link role="baseMethodDeclaration" targetNodeId="4.~Map.get(java.lang.Object):java.lang.Object" resolveInfo="get" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536699495">
                                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220536700032">
                                  <link role="link" targetNodeId="1.1068581517664" />
                                </node>
                                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220536698154">
                                  <link role="variable" targetNodeId="1220536466550" resolveInfo="variableReference" />
                                </node>
                              </node>
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220536692915">
                              <link role="variableDeclaration" targetNodeId="1220536413170" resolveInfo="map" />
                            </node>
                          </node>
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220536689257" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220536544695">
                      <link role="variable" targetNodeId="1220536466550" resolveInfo="variableReference" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536509663">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsKeyOperation" id="1220536515103">
                  <node role="key" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536518513">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220536523769">
                      <link role="link" targetNodeId="1.1068581517664" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220536517435">
                      <link role="variable" targetNodeId="1220536466550" resolveInfo="variableReference" />
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220536508490">
                  <link role="variableDeclaration" targetNodeId="1220536413170" resolveInfo="map" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220536466550">
            <property name="name" value="variableReference" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220536327345" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220536327344" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220536581434">
      <property name="name" value="createReferance" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220536618461">
        <property name="name" value="parameter" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536618462">
          <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220536581437">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220536657905">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220536669425">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220536668314">
              <link role="variableDeclaration" targetNodeId="1220536618461" resolveInfo="parameter" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1220536670084">
              <link role="conceptMethodDeclaration" targetNodeId="3v.1213877517482" resolveInfo="createReference" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220536581436" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220536599819">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220537320985">
      <property name="name" value="createCallParameters" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220537320988">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220537408349">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220537408350">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220537412712">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220537412713">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220537412714">
                  <link role="elementConcept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220537408351">
              <link role="elementConcept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220537495767">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220537495770">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220537510219">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537524295">
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1220537527970">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537547020">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220537547022" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220537547021">
                      <link role="baseMethodDeclaration" targetNodeId="1220536581434" resolveInfo="createReferance" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537551334">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220537564543">
                          <link role="baseMethodDeclaration" targetNodeId="1220535914546" resolveInfo="getDeclaration" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220537550570">
                          <link role="variable" targetNodeId="1220537495768" resolveInfo="parameter" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537510220">
                  <link role="variableDeclaration" targetNodeId="1220537408350" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537503557">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537501928">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220537501930" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220537501929">
                <link role="fieldDeclaration" targetNodeId="1220527869261" resolveInfo="myParameters" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220537507436">
              <link role="baseMethodDeclaration" targetNodeId="1220534672125" resolveInfo="getParameters" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220537495768">
            <property name="name" value="parameter" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220537419153">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537421062">
            <link role="variableDeclaration" targetNodeId="1220537408350" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220537320987" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220537389598">
        <link role="elementConcept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220537670225">
      <property name="name" value="createMethodCall" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220537750937">
        <property name="name" value="parameters" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220537750938">
          <link role="elementConcept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220537772236">
        <property name="name" value="methodDeclaration" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537773972" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220537670227" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220537670228">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220537876813">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220537876814">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220537892661">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220537892662">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537892663">
                  <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537876815">
              <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220537901732">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220537906128">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220537906959">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220537922298">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537922299">
                  <link role="concept" targetNodeId="1.1070475354124" resolveInfo="ThisExpression" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537902531">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537901733">
                <link role="variableDeclaration" targetNodeId="1220537876814" resolveInfo="result" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220537905174">
                <link role="link" targetNodeId="1.1197027771414" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220537950020">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220537950021">
            <property name="name" value="callOperation" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220537967852">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220537967853">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537967854">
                  <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537950022">
              <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220537979424">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220537986149">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537991261">
              <link role="variableDeclaration" targetNodeId="1220537950021" resolveInfo="callOperation" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537980051">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537979425">
                <link role="variableDeclaration" targetNodeId="1220537876814" resolveInfo="result" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220537984148">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220537992982">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220538071443">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220537993781">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537992983">
                <link role="variableDeclaration" targetNodeId="1220537950021" resolveInfo="callOperation" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220538069379">
                <link role="link" targetNodeId="1.1202948736718" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220538082416">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220538082417">
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220538089795">
                  <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
                </node>
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220538082418">
                  <link role="variableDeclaration" targetNodeId="1220537772236" resolveInfo="methodDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220538098281">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538150490">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220538099111">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220538149145">
                <link role="link" targetNodeId="1.1068499141038" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220538098282">
                <link role="variableDeclaration" targetNodeId="1220537950021" resolveInfo="callOperation" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddAllOperation" id="1220538153337">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220538155901">
                <link role="variableDeclaration" targetNodeId="1220537750937" resolveInfo="parameters" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220537896118">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220537898777">
            <link role="variableDeclaration" targetNodeId="1220537876814" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220537742045">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220377860699" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220534739186">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_MethodParameter" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220535955270">
      <property name="name" value="myDeclaration" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535961276">
        <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220535955271" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220535653424">
      <property name="name" value="myType" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535655554">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220535653425" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220535750977">
      <property name="name" value="myName" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220535754998">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220535750978" />
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220551392268">
      <property name="name" value="mySelected" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220551394429" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220551392269" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220534739188">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220535429487">
        <property name="name" value="variable" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535429488">
          <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220534739191">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535949015">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220535978671">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220535981112">
              <link role="variableDeclaration" targetNodeId="1220535429487" resolveInfo="variable" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535976512">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535976513">
                <link role="fieldDeclaration" targetNodeId="1220535955270" resolveInfo="myDeclaration" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535976514" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535662977">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220535665184">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535662978">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535662979">
                <link role="fieldDeclaration" targetNodeId="1220535653424" resolveInfo="myType" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535662980" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535669313">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220535672207">
                <link role="link" targetNodeId="1.1068431790188" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220535668140">
                <link role="variableDeclaration" targetNodeId="1220535429487" resolveInfo="variable" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220535763234">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220535765301">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535763235">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535763237" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535763236">
                <link role="fieldDeclaration" targetNodeId="1220535750977" resolveInfo="myName" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535767805">
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220535772214">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220535767116">
                <link role="variableDeclaration" targetNodeId="1220535429487" resolveInfo="variable" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220534739190" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220534739189" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220535605000">
      <property name="name" value="getType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220535605003">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220535646797">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535675770">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535675772" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535675771">
              <link role="fieldDeclaration" targetNodeId="1220535653424" resolveInfo="myType" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220535605002" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535640545">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220535732483">
      <property name="name" value="getName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220535732486">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220535743866">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535783905">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535783906">
              <link role="fieldDeclaration" targetNodeId="1220535750977" resolveInfo="myName" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535783907" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220535732485" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220535737083">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220535914546">
      <property name="name" value="getDeclaration" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220535914549">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220535985066">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220535987881">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220535987883" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220535987882">
              <link role="fieldDeclaration" targetNodeId="1220535955270" resolveInfo="myDeclaration" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220535914548" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220535992399">
        <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551373947">
      <property name="name" value="isSelected" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551373950">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551385172">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551400665">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551400666">
              <link role="fieldDeclaration" targetNodeId="1220551392268" resolveInfo="mySelected" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551400667" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1220551379859" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551373949" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220534739187" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220539339106">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_ExtracMethodFromStatementsRefactoring" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220540959331">
      <property name="name" value="myStatements" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220540959333">
        <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220540959332" />
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220542677619">
        <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220542677620">
          <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220542677621">
            <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220539339108">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220539593057">
        <property name="name" value="params" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220539593058">
          <link role="classifier" targetNodeId="1220361337591" resolveInfo="_ExtractMethodRefactoringParameters" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220539339111">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1220539646573">
          <link role="constructorDeclaration" targetNodeId="1220377860700" resolveInfo="_ExtractMethodRefactoring" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220539649996">
            <link role="variableDeclaration" targetNodeId="1220539593057" resolveInfo="params" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220540970697">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220540972139">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220540970698">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220540970700" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220540970699">
                <link role="fieldDeclaration" targetNodeId="1220540959331" resolveInfo="myStatements" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1220540976095">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220541003503">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220541003504">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541003505">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220541003506">
                      <link role="variableDeclaration" targetNodeId="1220539593057" resolveInfo="params" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541003507">
                      <link role="baseMethodDeclaration" targetNodeId="1220526423797" resolveInfo="getNodesToRefactor" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220541011541">
                    <link role="elementConcept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220539339109" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220539339110" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220539486798">
      <property name="name" value="doRefactor" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220539486801">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220541422803">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220541422804">
            <property name="name" value="type" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220541432230">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220541432231">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541432232">
                  <link role="concept" targetNodeId="1.1068581517677" resolveInfo="VoidType" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541422805">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220541510500">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220541510501">
            <property name="name" value="body" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220541533807">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220541533808">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541533809">
                  <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541510502">
              <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220541977151">
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541985797">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220541985798">
              <link role="fieldDeclaration" targetNodeId="1220540959331" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541985799" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220541977154">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220541990176">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220542000526">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1220542003263">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220544107207">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220542005062">
                      <link role="variable" targetNodeId="1220541977152" resolveInfo="statement" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1220544111164" />
                  </node>
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541990662">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1220541999540">
                    <link role="link" targetNodeId="1.1068581517665" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541990177">
                    <link role="variableDeclaration" targetNodeId="1220541510501" resolveInfo="body" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220541977152">
            <property name="name" value="statement" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220541682457">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220541682458">
            <property name="name" value="params" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220541682459">
              <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220541682460">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1220541682461">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1220541682462">
                  <link role="elementConcept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220541682463">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220541682464">
            <property name="name" value="inputToParams" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220541682465">
              <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541682466">
                <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541682467">
                <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541682468">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541682469">
                <link role="baseMethodDeclaration" targetNodeId="1220534384552" resolveInfo="createInputParameters" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541682470">
                  <link role="variableDeclaration" targetNodeId="1220541510501" resolveInfo="body" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541682471">
                  <link role="variableDeclaration" targetNodeId="1220541682458" resolveInfo="params" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541682472" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220541382637">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220541382638">
            <property name="name" value="newMethod" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541411955">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541411956">
                <link role="baseMethodDeclaration" targetNodeId="1220527322045" resolveInfo="createNewMethod" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541456799">
                  <link role="variableDeclaration" targetNodeId="1220541422804" resolveInfo="type" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541499432">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541499434" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220541499433">
                    <link role="fieldDeclaration" targetNodeId="1220540849903" resolveInfo="myMethodName" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541749314">
                  <link role="variableDeclaration" targetNodeId="1220541682458" resolveInfo="params" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541530289">
                  <link role="variableDeclaration" targetNodeId="1220541510501" resolveInfo="body" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541411957" />
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220541382639">
              <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220541546093">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541546094">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541546095">
              <link role="baseMethodDeclaration" targetNodeId="1220529585262" resolveInfo="addMethod" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541550394">
                <link role="variableDeclaration" targetNodeId="1220541382638" resolveInfo="newMethod" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541546096" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220541767957">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220541767958">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220541767960" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220541767959">
              <link role="baseMethodDeclaration" targetNodeId="1220536327343" resolveInfo="replaceInputVariablesWithParameters" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541800637">
                <link role="variableDeclaration" targetNodeId="1220541510501" resolveInfo="body" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541808202">
                <link role="variableDeclaration" targetNodeId="1220541682464" resolveInfo="inputToParams" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220542055514">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220542055515">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220542055516">
              <link role="baseMethodDeclaration" targetNodeId="1220542034755" resolveInfo="addCallExpression" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220545988643">
                <link role="variableDeclaration" targetNodeId="1220541382638" resolveInfo="newMethod" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220542055517" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220539663754">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220541821363">
            <link role="variableDeclaration" targetNodeId="1220541382638" resolveInfo="newMethod" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220539506927" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220539486800" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220542034755">
      <property name="name" value="addCallExpression" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220545621772">
        <property name="name" value="newMethod" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220545621773">
          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220542034758">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220545581600">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220545581601">
            <property name="name" value="methodCall" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545596495">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220545596496">
                <link role="baseMethodDeclaration" targetNodeId="1220537670225" resolveInfo="createMethodCall" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545599842">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220545599844" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220545599843">
                    <link role="baseMethodDeclaration" targetNodeId="1220537320985" resolveInfo="createCallParameters" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220545654260">
                  <link role="variableDeclaration" targetNodeId="1220545621772" resolveInfo="newMethod" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220545596497" />
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220545581602">
              <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220545683685">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220545683686">
            <property name="name" value="callStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220545683687">
              <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220545701597">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220545701598">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220545701599">
                  <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220545704351">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220545713498">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220545716110">
              <link role="variableDeclaration" targetNodeId="1220545581601" resolveInfo="methodCall" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545705415">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220545704352">
                <link role="variableDeclaration" targetNodeId="1220545683686" resolveInfo="callStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220545711418">
                <link role="link" targetNodeId="1.1068580123156" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220545726644">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545731558">
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation" id="1220545733953">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220546292716">
                <link role="variableDeclaration" targetNodeId="1220545683686" resolveInfo="callStatement" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545727460">
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1220545728979">
                <node role="argument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220545730404">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545726645">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220545726647" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220545726646">
                  <link role="fieldDeclaration" targetNodeId="1220540959331" resolveInfo="myStatements" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220545670734">
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545670736">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220545670737">
              <link role="fieldDeclaration" targetNodeId="1220540959331" resolveInfo="myStatements" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220545670738" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220545670739">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220545670740">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220545670741">
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1220545670743" />
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220545670742">
                  <link role="variable" targetNodeId="1220545670735" resolveInfo="statement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220545670735">
            <property name="name" value="statement" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220542034756" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220542034757" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220539339107" />
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220539449499">
      <link role="classifier" targetNodeId="1220377860698" resolveInfo="_ExtractMethodRefactoring" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.EnumClass" id="1220532392832">
    <property name="package" value="refactoring.extractMethod" />
    <property name="name" value="_VisibilityLevel" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220532452404">
      <property name="name" value="getNode" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220532468282">
        <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220532452407">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220532475487">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220532477551">
            <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220532477552">
              <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220532477553">
                <link role="concept" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220532452406" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220551021600">
      <property name="name" value="getName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220551021603">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220551034386">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551063398">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551063400" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551063399">
              <link role="fieldDeclaration" targetNodeId="1220551046247" resolveInfo="myName" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220551021602" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551032916">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="enumConstant" type="jetbrains.mps.baseLanguage.structure.EnumConstantDeclaration" id="1220532405463">
      <property name="name" value="PRIVATE" />
      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220532434309">
        <property name="value" value="private" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220551046247">
      <property name="name" value="myName" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220551050202">
        <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220551046248" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220532392834">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220532430948">
        <property name="name" value="name" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220532430949">
          <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220532392837">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220551058312">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220551059941">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220551058313">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220551058315" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220551058314">
                <link role="fieldDeclaration" targetNodeId="1220551046247" resolveInfo="myName" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220551060257">
              <link role="variableDeclaration" targetNodeId="1220532430948" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220532392836" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220532392835" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220532392833" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220359974789">
    <property name="package" value="refactoring" />
    <property name="name" value="MethodDeclarationAdapter" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1220360038702">
      <property name="name" value="myNode" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220360040909" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1220360038703" />
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220359974791">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220360032621">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220360032622" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220359974794">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220360049019">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220360050727">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360049020">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360049022" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360049021">
                <link role="fieldDeclaration" targetNodeId="1220360038702" resolveInfo="myNode" />
              </node>
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220360054026">
              <link role="variableDeclaration" targetNodeId="1220360032621" resolveInfo="node" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220359974793" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220359974792" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220360056762">
      <property name="name" value="getNode" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220360056765">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220360070252">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220360072410">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1220360072412" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1220360072411">
              <link role="fieldDeclaration" targetNodeId="1220360038702" resolveInfo="myNode" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220360056764" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220360067782">
        <link role="concept" targetNodeId="2v.1133920641626" resolveInfo="BaseConcept" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220359974790" />
  </node>
  <visible index="9" modelUID="jetbrains.mps.util@java_stub" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1220025720938">
    <property name="name" value="SubstitutionTest" />
    <property name="caption" value="Substitution Test (Internal)" />
    <property name="isAlwaysVisible" value="true" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1220025720939">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220025720940">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220025790023">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220025790024">
            <property name="name" value="node1" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220025790025" />
            <node role="initializer" type="jetbrains.mps.quotation.structure.Quotation" id="1220025790026">
              <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220025790027">
                <link role="classifier" targetNodeId="4.~Map" resolveInfo="Map" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220025790028">
                  <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                </node>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220025790029">
                  <link role="classifier" targetNodeId="4.~List" resolveInfo="List" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220025790030">
                    <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220025790031">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220025790032">
            <property name="name" value="result" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220025790034">
              <node role="operation" type="jetbrains.mps.patterns.structure.SubstitutionOperation" id="1220025790036">
                <node role="substitutionItem" type="jetbrains.mps.patterns.structure.SubstitutionItem" id="1220025790037">
                  <node role="pattern" type="jetbrains.mps.patterns.structure.PatternExpression" id="1220025790038">
                    <node role="patternNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220025790039">
                      <link role="classifier" targetNodeId="4.~List" resolveInfo="List" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.Type" id="1220025790040">
                        <node role="_attr_$attribute" type="jetbrains.mps.patterns.structure.PatternVariableDeclaration" id="1220025790041">
                          <property name="varName" value="p" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="expression" type="jetbrains.mps.patterns.structure.PatternVariableReference" id="1220025790042">
                    <link role="variableDeclaration" targetNodeId="1220025790041" resolveInfo="#p" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220025790035">
                <link role="variableDeclaration" targetNodeId="1220025790024" resolveInfo="node1" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220025790033">
              <link role="concept" targetNodeId="2v.1133920641626" resolveInfo="BaseConcept" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220025790043">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220025790044">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220025790046">
              <link role="baseMethodDeclaration" targetNodeId="13.~PrintStream.println(java.lang.Object):void" resolveInfo="println" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220025790047">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220025790048">
                  <link role="variableDeclaration" targetNodeId="1220025790032" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1220025790049">
                  <link role="conceptMethodDeclaration" targetNodeId="48.1213877396640" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220025790045">
              <link role="classifier" targetNodeId="9.~System" resolveInfo="System" />
              <link role="variableDeclaration" targetNodeId="9.~System.err" resolveInfo="err" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220256094393">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220256094394">
            <property name="name" value="mostSpecificType" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220256094396">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220256094400">
                <link role="baseMethodDeclaration" targetNodeId="6v.~SubtypingManager.mostSpecificType(java.util.Set):jetbrains.mps.smodel.SNode" resolveInfo="mostSpecificType" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220256214563">
                  <link role="classConcept" targetNodeId="9v.~CollectionUtil" resolveInfo="CollectionUtil" />
                  <link role="baseMethodDeclaration" targetNodeId="9v.~CollectionUtil.asSet(java.lang.Object...):java.util.Set" resolveInfo="asSet" />
                  <node role="actualArgument" type="jetbrains.mps.quotation.structure.Quotation" id="1220256126031">
                    <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220256145411">
                      <link role="classifier" targetNodeId="9.~String" resolveInfo="String" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.quotation.structure.Quotation" id="1220256133471">
                    <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220256155927">
                      <link role="classifier" targetNodeId="9.~Object" resolveInfo="Object" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.quotation.structure.Quotation" id="1220256489789">
                    <node role="quotedNode" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220256496213" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.quotation.structure.Quotation" id="1220256722570">
                    <node role="quotedNode" type="jetbrains.mps.baseLanguage.strings.structure.StringType" id="1220256773385" />
                  </node>
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220256094397">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220256094399">
                  <link role="baseMethodDeclaration" targetNodeId="6v.~TypeChecker.getSubtypingManager():jetbrains.mps.helgins.inference.SubtypingManager" resolveInfo="getSubtypingManager" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1220256094398">
                  <link role="baseMethodDeclaration" targetNodeId="6v.~TypeChecker.getInstance():jetbrains.mps.helgins.inference.TypeChecker" resolveInfo="getInstance" />
                  <link role="classConcept" targetNodeId="6v.~TypeChecker" resolveInfo="TypeChecker" />
                </node>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220256094395">
              <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220256097590">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220256097591">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220256097593">
              <link role="baseMethodDeclaration" targetNodeId="13.~PrintStream.println(java.lang.Object):void" resolveInfo="println" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220256107002">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220256104923">
                  <link role="variableDeclaration" targetNodeId="1220256094394" resolveInfo="mostSpecificType" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220256112514">
                  <link role="baseMethodDeclaration" targetNodeId="5.~SNode.getPresentation():java.lang.String" resolveInfo="getPresentation" />
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1220256097592">
              <link role="classifier" targetNodeId="9.~System" resolveInfo="System" />
              <link role="variableDeclaration" targetNodeId="9.~System.err" resolveInfo="err" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

