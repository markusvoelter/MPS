<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.quickQueryLanguage.plugin">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.pluginLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.pluginLanguage.constraints" version="19" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.pluginLanguage.structure" version="14" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
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
  <language namespace="jetbrains.mps.internal.collections">
    <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  </language>
  <language namespace="jetbrains.mps.closures">
    <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
    <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.findUsagesLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.constraints" version="4" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.intentionsLanguage.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <maxImportIndex value="34" />
  <import index="1" modelUID="jetbrains.mps.quickQueryLanguage.structure" version="-1" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="3" modelUID="java.io@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.workbench@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.generator@java_stub" version="-1" />
  <import index="8" modelUID="java.util@java_stub" version="-1" />
  <import index="9" modelUID="jetbrains.mps.generator.generationTypes@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="11" modelUID="jetbrains.mps.reloading@java_stub" version="-1" />
  <import index="12" modelUID="jetbrains.mps.quickQueryLanguage.runtime@java_stub" version="-1" />
  <import index="13" modelUID="jetbrains.mps.ide.findusages@java_stub" version="-1" />
  <import index="14" modelUID="jetbrains.mps.findUsages@java_stub" version="-1" />
  <import index="15" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" version="-1" />
  <import index="16" modelUID="jetbrains.mps.ide.findusages.model@java_stub" version="-1" />
  <import index="17" modelUID="jetbrains.mps.ide.findusages.model.holders@java_stub" version="-1" />
  <import index="18" modelUID="jetbrains.mps.ide.findusages.view@java_stub" version="-1" />
  <import index="19" modelUID="jetbrains.mps.ide.findusages.findalgorithm.finders@java_stub" version="-1" />
  <import index="20" modelUID="com.intellij.openapi.progress@java_stub" version="-1" />
  <import index="21" modelUID="jetbrains.mps.ide@java_stub" version="-1" />
  <import index="22" modelUID="jetbrains.mps.bootstrap.structureLanguage.findUsages@java_stub" version="-1" />
  <import index="23" modelUID="jetbrains.mps.baseLanguage.ext.collections.internal.query@java_stub" version="-1" />
  <import index="24" modelUID="com.intellij.openapi.components@java_stub" version="-1" />
  <import index="25" modelUID="org.jetbrains.annotations@java_stub" version="-1" />
  <import index="26" modelUID="com.intellij.openapi@java_stub" version="-1" />
  <import index="27" modelUID="com.intellij.openapi.project@java_stub" version="-1" />
  <import index="28" modelUID="jetbrains.mps.ide.dialogs@java_stub" version="-1" />
  <import index="29" modelUID="javax.swing@java_stub" version="-1" />
  <import index="30" modelUID="java.awt@java_stub" version="-1" />
  <import index="31" modelUID="jetbrains.mps.nodeEditor.inspector@java_stub" version="-1" />
  <import index="32" modelUID="jetbrains.mps.ide.findusages.view.optionseditor.components@java_stub" version="-1" />
  <import index="33" modelUID="jetbrains.mps.ide.findusages.view.optionseditor.options@java_stub" version="-1" />
  <import index="34" modelUID="jetbrains.mps.workbench.action@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1218801500366">
    <property name="name" value="ExecuteQueryAction" />
    <property name="caption" value="Execute Query" />
    <property name="outsideCommandExecution" value="true" />
    <property name="isAlwaysVisible" value="true" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1218801500367">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218801500368">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219060138540">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219060138541">
            <property name="name" value="task" />
            <property name="isFinal" value="true" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219060138542">
              <link role="classifier" targetNodeId="1219056224639" resolveInfo="QueryTask" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219222652010">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219222652011">
                <link role="baseMethodDeclaration" targetNodeId="1219062308214" resolveInfo="QueryTask" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222652012">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219222652013" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219222652014">
                    <link role="member" targetNodeId="1218802440378" resolveInfo="operationContext" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222652015">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219222652016" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterReferenceOperation" id="1219222652017">
                    <link role="member" targetNodeId="1218801533192" resolveInfo="queryNode" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219222652018">
                  <link role="baseMethodDeclaration" targetNodeId="10.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                  <link role="classConcept" targetNodeId="10.~GlobalScope" resolveInfo="GlobalScope" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219222487995">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222491985">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219222490527">
              <link role="baseMethodDeclaration" targetNodeId="20.~ProgressManager.getInstance():com.intellij.openapi.progress.ProgressManager" resolveInfo="getInstance" />
              <link role="classConcept" targetNodeId="20.~ProgressManager" resolveInfo="ProgressManager" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219222517535">
              <link role="baseMethodDeclaration" targetNodeId="20.~ProgressManager.run(com.intellij.openapi.progress.Task):void" resolveInfo="run" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219222520371">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1219222550060">
                  <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1219222550061">
                    <link role="classifier" targetNodeId="20.~Task$Modal" resolveInfo="Task.Modal" />
                    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219222550062" />
                    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219222561207">
                      <property name="name" value="run" />
                      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219222561208" />
                      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219222561209" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219222561210">
                        <property name="name" value="indicator" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219222561211">
                          <link role="classifier" targetNodeId="20.~ProgressIndicator" resolveInfo="ProgressIndicator" />
                        </node>
                        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219222561212">
                          <link role="annotation" targetNodeId="25.~NotNull" resolveInfo="NotNull" />
                        </node>
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219222561213">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219222564015">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222609587">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219222609314">
                              <link role="variableDeclaration" targetNodeId="1219060138541" resolveInfo="task" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219222610039">
                              <link role="baseMethodDeclaration" targetNodeId="1219056322465" resolveInfo="run" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219222611112">
                                <link role="variableDeclaration" targetNodeId="1219222561210" resolveInfo="p0" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219223893433">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219223891680">
                        <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219223891681">
                          <link role="classifier" targetNodeId="1218801500366" resolveInfo="ExecuteQueryAction" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219223891682">
                          <link role="member" targetNodeId="1218802440378" resolveInfo="operationContext" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219223896468">
                        <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getProject():com.intellij.openapi.project.Project" resolveInfo="getProject" />
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219222779244">
                      <property name="value" value="Executing query" />
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219222733961">
                      <property name="value" value="false" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionParameterDeclaration" id="1218801533192">
      <property name="name" value="queryNode" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1218801533193" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1218801536865">
        <link role="concept" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1218802440378">
      <property name="name" value="operationContext" />
      <link role="key" targetNodeId="6.~MPSDataKeys.OPERATION_CONTEXT" resolveInfo="OPERATION_CONTEXT" />
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.ide.actions" />
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1218801567023">
    <property name="name" value="QueryGroup" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1218801587417">
      <link role="modifiedGroup" targetNodeId="2v.1204991215587" resolveInfo="ProjectPaneNodeActions" />
    </node>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1218801708098">
      <link role="modifiedGroup" targetNodeId="2v.1204991231476" resolveInfo="EditorPopup" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1218801676214">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1218801685844">
        <link role="action" targetNodeId="1218801500366" resolveInfo="ExecuteQueryAction" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1218802824661">
    <property name="name" value="MyGenerationType" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218802824662" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1218802824663">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1218802824664" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218802824665" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218802824666" />
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1218802862477">
      <link role="classifier" targetNodeId="9.~GenerateClassesGenerationType" resolveInfo="GenerateClassesGenerationType" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1218802887764">
      <property name="name" value="isPutClassesOnTheDisk" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1218802887765" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1218802887766" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1218802887767">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1218802889487">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1218802891770">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1219056224639">
    <property name="name" value="QueryExecutor" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219074419030">
      <property name="name" value="myClassType" />
      <property name="isFinal" value="true" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219074419031" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219074425553">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219074432681">
        <property name="value" value=".Query" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219074470412">
      <property name="name" value="myLanguageFqName" />
      <property name="isFinal" value="true" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219074470413" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219074473311">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219074487329">
        <property name="value" value="jetbrains.mps.quickQueryLanguage" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219056437302">
      <property name="name" value="myClassName" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219056437303" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056440477">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219056445587">
      <property name="name" value="myLoader" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219056445588" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056451872">
        <link role="classifier" targetNodeId="2.~ClassLoader" resolveInfo="ClassLoader" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219072866518">
      <property name="name" value="myScope" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219072866519" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219072869479">
        <link role="classifier" targetNodeId="5.~IScope" resolveInfo="IScope" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219056601115">
      <property name="name" value="myModelQuery" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219056601116" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219059358767">
        <link role="concept" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219222854285">
      <property name="name" value="myProject" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219222854286" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219222860362">
        <link role="classifier" targetNodeId="27.~Project" resolveInfo="Project" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219056322465">
      <property name="name" value="run" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219056322466" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219056322467" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219056322468">
        <property name="name" value="indicator" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056322469">
          <link role="classifier" targetNodeId="20.~ProgressIndicator" resolveInfo="ProgressIndicator" />
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219056322470">
          <link role="annotation" targetNodeId="25.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219056322471">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1219056322472">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219056322473">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219056322474">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1219056322475">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219056322476">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219056322488">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219056322489">
                      <property name="name" value="searchQuery" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056322490">
                        <link role="classifier" targetNodeId="16.~SearchQuery" resolveInfo="SearchQuery" />
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219056322491">
                        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219056322492">
                          <link role="baseMethodDeclaration" targetNodeId="16.~SearchQuery.&lt;init&gt;(jetbrains.mps.ide.findusages.model.holders.IHolder,jetbrains.mps.smodel.IScope)" resolveInfo="SearchQuery" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219056322493">
                            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219056722651">
                              <link role="baseMethodDeclaration" targetNodeId="17.~NodeHolder.&lt;init&gt;(jetbrains.mps.smodel.SNode)" resolveInfo="NodeHolder" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219059326387">
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056736449">
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219056736450">
                                    <link role="fieldDeclaration" targetNodeId="1219056601115" resolveInfo="myConcept" />
                                  </node>
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219056736451" />
                                </node>
                                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219059367627">
                                  <link role="link" targetNodeId="1.1218793583446" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219073160506">
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219073160507">
                              <link role="fieldDeclaration" targetNodeId="1219072866518" resolveInfo="myScope" />
                            </node>
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219073160508" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219058117865">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219058117866">
                      <property name="name" value="finders" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1219058117867">
                        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219058117868">
                          <link role="classifier" targetNodeId="19.~BaseFinder" resolveInfo="BaseFinder" />
                        </node>
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219058117869">
                        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ArrayCreator" id="1219058117870">
                          <node role="dimensionExpression" type="jetbrains.mps.baseLanguage.structure.DimensionExpression" id="1219058117871">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219058117872">
                              <property name="value" value="1" />
                            </node>
                          </node>
                          <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219058117873">
                            <link role="classifier" targetNodeId="19.~BaseFinder" resolveInfo="BaseFinder" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219058117874">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219058117875">
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1219058117877">
                        <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219058117878">
                          <property name="value" value="0" />
                        </node>
                        <node role="array" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219058117879">
                          <link role="variableDeclaration" targetNodeId="1219058117866" resolveInfo="finders" />
                        </node>
                      </node>
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219058173745">
                        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219058227117">
                          <link role="baseMethodDeclaration" targetNodeId="22.~ConceptInstances_Finder.&lt;init&gt;()" resolveInfo="ConceptInstances_Finder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219058244793">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219058244794">
                      <property name="name" value="instances" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219058244795">
                        <link role="classifier" targetNodeId="16.~SearchResults" resolveInfo="SearchResults" />
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219058323224">
                        <link role="baseMethodDeclaration" targetNodeId="18.~FindUtils.getSearchResults(com.intellij.openapi.progress.ProgressIndicator,jetbrains.mps.ide.findusages.model.SearchQuery,jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder[]):jetbrains.mps.ide.findusages.model.SearchResults" resolveInfo="getSearchResults" />
                        <link role="classConcept" targetNodeId="18.~FindUtils" resolveInfo="FindUtils" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219058328351">
                          <link role="variableDeclaration" targetNodeId="1219056322468" resolveInfo="indicator" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219058348902">
                          <link role="variableDeclaration" targetNodeId="1219056322489" resolveInfo="searchQuery" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219058356343">
                          <link role="variableDeclaration" targetNodeId="1219058117866" resolveInfo="finders" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219056322477">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219056322478">
                      <property name="name" value="queryInstance" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056322479">
                        <link role="classifier" targetNodeId="12.~Query" resolveInfo="Query" />
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1219056322480">
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056322481">
                          <link role="classifier" targetNodeId="12.~Query" resolveInfo="Query" />
                        </node>
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056322482">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219056322483">
                            <link role="baseMethodDeclaration" targetNodeId="2.~Class.forName(java.lang.String,boolean,java.lang.ClassLoader):java.lang.Class" resolveInfo="forName" />
                            <link role="classConcept" targetNodeId="2.~Class" resolveInfo="Class" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056543691">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219056543692">
                                <link role="fieldDeclaration" targetNodeId="1219056437302" resolveInfo="myClassName" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219056543693" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219056322485">
                              <property name="value" value="true" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056547945">
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219056547946">
                                <link role="fieldDeclaration" targetNodeId="1219056445587" resolveInfo="myLoader" />
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219056547947" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219056322487">
                            <link role="baseMethodDeclaration" targetNodeId="2.~Class.newInstance():java.lang.Object" resolveInfo="newInstance" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219068617076">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219068617077">
                      <property name="name" value="instancesList" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219068617078">
                        <link role="classifier" targetNodeId="8.~List" resolveInfo="List" />
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219068734437">
                          <link role="classifier" targetNodeId="16.~SearchResult" resolveInfo="SearchResult" />
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219068737556">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                        </node>
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219068622975">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219068622145">
                          <link role="variableDeclaration" targetNodeId="1219058244794" resolveInfo="instances" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219068626510">
                          <link role="baseMethodDeclaration" targetNodeId="16.~SearchResults.getSearchResults():java.util.List" resolveInfo="getSearchResults" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219069372057">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219069372058">
                      <property name="name" value="it" />
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219069372059">
                        <link role="classifier" targetNodeId="8.~Iterator" resolveInfo="Iterator" />
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219069380187">
                          <link role="classifier" targetNodeId="16.~SearchResult" resolveInfo="SearchResult" />
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219069382970">
                            <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                          </node>
                        </node>
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219069392391">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219069391300">
                          <link role="variableDeclaration" targetNodeId="1219068617077" resolveInfo="instancesList" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219069602048">
                          <link role="baseMethodDeclaration" targetNodeId="8.~List.iterator():java.util.Iterator" resolveInfo="iterator" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1219069612528">
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219069615525">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219069614610">
                        <link role="variableDeclaration" targetNodeId="1219069372058" resolveInfo="iter" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219069618091">
                        <link role="baseMethodDeclaration" targetNodeId="8.~Iterator.hasNext():boolean" resolveInfo="hasNext" />
                      </node>
                    </node>
                    <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219069612530">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219070317750">
                        <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219070317751">
                          <property name="name" value="current" />
                          <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219070317752">
                            <link role="classifier" targetNodeId="16.~SearchResult" resolveInfo="SearchResult" />
                            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219070322223">
                              <link role="classifier" targetNodeId="5.~SNode" resolveInfo="SNode" />
                            </node>
                          </node>
                          <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219070350765">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219070349865">
                              <link role="variableDeclaration" targetNodeId="1219069372058" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219070351721">
                              <link role="baseMethodDeclaration" targetNodeId="8.~Iterator.next():java.lang.Object" resolveInfo="next" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1219069693233">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1219069710064">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219069716911">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219069715957">
                              <link role="variableDeclaration" targetNodeId="1219056322478" resolveInfo="queryInstance" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219069718664">
                              <link role="baseMethodDeclaration" targetNodeId="12.~Query.isSatisfies(jetbrains.mps.smodel.SNode):boolean" resolveInfo="isSatisfies" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219069730922">
                                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219069734190">
                                  <link role="baseMethodDeclaration" targetNodeId="16.~SearchResult.getObject():java.lang.Object" resolveInfo="getObject" />
                                </node>
                                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219070640734">
                                  <link role="variableDeclaration" targetNodeId="1219070317751" resolveInfo="current" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219069693235">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219070032192">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219070032421">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219070032193">
                                <link role="variableDeclaration" targetNodeId="1219069372058" resolveInfo="iter" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219070036455">
                                <link role="baseMethodDeclaration" targetNodeId="8.~Iterator.remove():void" resolveInfo="remove" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219056322517">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056322518">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056322519">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219056322525">
                          <link role="baseMethodDeclaration" targetNodeId="24.~ComponentManager.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1219056322526">
                            <link role="classifier" targetNodeId="18.~UsagesViewTool" resolveInfo="UsagesViewTool" />
                          </node>
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056935488">
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219222889488">
                            <link role="fieldDeclaration" targetNodeId="1219222854285" resolveInfo="myProject" />
                          </node>
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219056935490" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219056322527">
                        <link role="baseMethodDeclaration" targetNodeId="18.~UsagesViewTool.showResults(jetbrains.mps.ide.findusages.model.SearchQuery,jetbrains.mps.ide.findusages.model.SearchResults):void" resolveInfo="showResults" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219056322528">
                          <link role="variableDeclaration" targetNodeId="1219056322489" resolveInfo="searchQuery" />
                        </node>
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219068935162">
                          <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219068935163">
                            <link role="baseMethodDeclaration" targetNodeId="16.~SearchResults.&lt;init&gt;(java.util.Set,java.util.List)" resolveInfo="SearchResults" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219069015571">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219069014630">
                                <link role="variableDeclaration" targetNodeId="1219058244794" resolveInfo="instances" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219069019780">
                                <link role="baseMethodDeclaration" targetNodeId="16.~SearchResults.getSearchedNodes():java.util.Set" resolveInfo="getSearchedNodes" />
                              </node>
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219069027992">
                              <link role="variableDeclaration" targetNodeId="1219068617077" resolveInfo="instancesList" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1219056322530">
                  <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219056322531">
                    <property name="name" value="t" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219056322532">
                      <link role="classifier" targetNodeId="2.~Throwable" resolveInfo="Throwable" />
                    </node>
                  </node>
                  <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219056322533">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219056322534">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219056322535">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219056322536">
                          <link role="variableDeclaration" targetNodeId="1219056322531" resolveInfo="t" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219056322537">
                          <link role="baseMethodDeclaration" targetNodeId="2.~Throwable.printStackTrace():void" resolveInfo="printStackTrace" />
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
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219056224640" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1219062308214">
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219062340434">
        <property name="name" value="context" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062356245">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219062364679">
        <property name="name" value="modelQuery" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219062387380">
          <link role="concept" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219072860905">
        <property name="name" value="scope" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219072863345">
          <link role="classifier" targetNodeId="5.~IScope" resolveInfo="IScope" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219062308215" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219062308216" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219062308217">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062412744">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219062417479">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219062420280">
              <link role="variableDeclaration" targetNodeId="1219062364679" resolveInfo="modelQuery" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062412745">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219062412746">
                <link role="fieldDeclaration" targetNodeId="1219056601115" resolveInfo="myModelQuery" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219062412747" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219073501341">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219073504486">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219073508099">
              <link role="variableDeclaration" targetNodeId="1219072860905" resolveInfo="scope" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219073501342">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219073501343">
                <link role="fieldDeclaration" targetNodeId="1219072866518" resolveInfo="myScope" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219073501344" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219222874819">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219222877925">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222881113">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219222880356">
                <link role="variableDeclaration" targetNodeId="1219062340434" resolveInfo="context" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219222882850">
                <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getProject():com.intellij.openapi.project.Project" resolveInfo="getProject" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219222874820">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219222874821">
                <link role="fieldDeclaration" targetNodeId="1219222854285" resolveInfo="myProject" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219222874822" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219062309520">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219062309521">
            <property name="name" value="model" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062309522">
              <link role="classifier" targetNodeId="5.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219310463305">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219310463306">
            <property name="name" value="owner" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219310463307">
              <link role="classifier" targetNodeId="5.~ModelOwner" resolveInfo="ModelOwner" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219310467858">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1219310515451">
                <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1219310515452">
                  <link role="classifier" targetNodeId="5.~ModelOwner" resolveInfo="ModelOwner" />
                  <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219310515453" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteCommandStatement" id="1219062309530">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219062309531">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219062309532">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062309533">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219062309534">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219062309535">
                    <link role="classConcept" targetNodeId="5.~ProjectModels" resolveInfo="ProjectModels" />
                    <link role="baseMethodDeclaration" targetNodeId="5.~ProjectModels.createDescriptorFor(jetbrains.mps.smodel.ModelOwner):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="createDescriptorFor" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219310523630">
                      <link role="variableDeclaration" targetNodeId="1219310463306" resolveInfo="owner" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309537">
                    <link role="variableDeclaration" targetNodeId="1219062309521" resolveInfo="model" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062309538">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309539">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309540">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309541">
                      <link role="variableDeclaration" targetNodeId="1219062309521" resolveInfo="model" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309542">
                      <link role="baseMethodDeclaration" targetNodeId="5.~SModelDescriptor.getSModel():jetbrains.mps.smodel.SModel" resolveInfo="getSModel" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309543">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" resolveInfo="addRoot" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309544">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062430402">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219062430403">
                          <link role="fieldDeclaration" targetNodeId="1219056601115" resolveInfo="myModelQuery" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219062430404" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1219062309548" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062501879">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219062502992">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1219074457187">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219074460878">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219074460879">
                  <link role="fieldDeclaration" targetNodeId="1219074419030" resolveInfo="myClassType" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219074460880" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062505902">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062504651">
                  <link role="variableDeclaration" targetNodeId="1219062309521" resolveInfo="model" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062511309">
                  <link role="baseMethodDeclaration" targetNodeId="5.~SModelDescriptor.getLongName():java.lang.String" resolveInfo="getLongName" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062501880">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219062501881">
                <link role="fieldDeclaration" targetNodeId="1219056437302" resolveInfo="myClassName" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219062501882" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219062309557">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219062309558">
            <property name="name" value="manager" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062309559">
              <link role="classifier" targetNodeId="7.~GeneratorManager" resolveInfo="GeneratorManager" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309560">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309564">
                <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1219062309565">
                  <link role="classifier" targetNodeId="7.~GeneratorManager" resolveInfo="GeneratorManager" />
                </node>
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219062460210">
                <link role="variableDeclaration" targetNodeId="1219062340434" resolveInfo="context" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219062309566">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219062309567">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062309568">
              <link role="classifier" targetNodeId="1218802824661" resolveInfo="MyGenerationType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219062309569">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219062309570">
                <link role="baseMethodDeclaration" targetNodeId="1218802824663" resolveInfo="MyGenerationType" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062309571">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309572">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309573">
              <link role="variableDeclaration" targetNodeId="1219062309558" resolveInfo="manager" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309574">
              <link role="baseMethodDeclaration" targetNodeId="7.~GeneratorManager.generateModelsWithProgressWindow(java.util.List,jetbrains.mps.smodel.IOperationContext,jetbrains.mps.generator.IGenerationType,boolean):boolean" resolveInfo="generateModelsWithProgressWindow" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219062309575">
                <link role="baseMethodDeclaration" targetNodeId="8.~Arrays.asList(java.lang.Object[]):java.util.List" resolveInfo="asList" />
                <link role="classConcept" targetNodeId="8.~Arrays" resolveInfo="Arrays" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309576">
                  <link role="variableDeclaration" targetNodeId="1219062309521" resolveInfo="model" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219062473115">
                <link role="variableDeclaration" targetNodeId="1219062340434" resolveInfo="context" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309580">
                <link role="variableDeclaration" targetNodeId="1219062309567" resolveInfo="type" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219062309581">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062309582">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309583">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219062309584">
              <link role="baseMethodDeclaration" targetNodeId="5.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
              <link role="classConcept" targetNodeId="5.~SModelRepository" resolveInfo="SModelRepository" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309585">
              <link role="baseMethodDeclaration" targetNodeId="5.~SModelRepository.unRegisterModelDescriptors(jetbrains.mps.smodel.ModelOwner):void" resolveInfo="unRegisterModelDescriptors" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219310527945">
                <link role="variableDeclaration" targetNodeId="1219310463306" resolveInfo="owner" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1219062309590">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219062309591">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219062309592">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219062309597">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219062309598">
                  <property name="name" value="lang" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062309599">
                    <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309600">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309602">
                      <link role="baseMethodDeclaration" targetNodeId="5.~IScope.getLanguage(java.lang.String):jetbrains.mps.smodel.Language" resolveInfo="getLanguage" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219324362093">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219324362094">
                          <link role="fieldDeclaration" targetNodeId="1219074470412" resolveInfo="myLanguageFqName" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219324362095" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219324411176">
                      <link role="baseMethodDeclaration" targetNodeId="10.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                      <link role="classConcept" targetNodeId="10.~GlobalScope" resolveInfo="GlobalScope" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219062309604">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219062309605">
                  <property name="name" value="parentClassLoader" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219062309606">
                    <link role="classifier" targetNodeId="2.~ClassLoader" resolveInfo="ClassLoader" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062309607">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219062309608">
                      <link role="classConcept" targetNodeId="11.~ClassLoaderManager" resolveInfo="ClassLoaderManager" />
                      <link role="baseMethodDeclaration" targetNodeId="11.~ClassLoaderManager.getInstance():jetbrains.mps.reloading.ClassLoaderManager" resolveInfo="getInstance" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062309609">
                      <link role="baseMethodDeclaration" targetNodeId="11.~ClassLoaderManager.getClassLoaderFor(jetbrains.mps.project.IModule):java.lang.ClassLoader" resolveInfo="getClassLoaderFor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062309610">
                        <link role="variableDeclaration" targetNodeId="1219062309598" resolveInfo="lang" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219062535769">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219062536789">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062535770">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219062535771">
                      <link role="fieldDeclaration" targetNodeId="1219056445587" resolveInfo="myLoader" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219062535772" />
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219062537122">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062537123">
                      <link role="variableDeclaration" targetNodeId="1219062309567" resolveInfo="type" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219062537124">
                      <link role="baseMethodDeclaration" targetNodeId="9.~GenerateClassesGenerationType.getClassLoader(java.lang.ClassLoader):java.lang.ClassLoader" resolveInfo="getClassLoader" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219062537125">
                        <link role="variableDeclaration" targetNodeId="1219062309605" resolveInfo="parentClassLoader" />
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
  <visible index="3" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1219223245047">
    <property name="name" value="FindInstancesByConditionDialog" />
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219231640063">
      <property name="name" value="myLanguage" />
      <property name="isFinal" value="true" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219231640064" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219231646482">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219231658497">
        <property name="value" value="jetbrains.mps.quickQueryLanguage" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219227669753">
      <property name="name" value="myEditorComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219227669754" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219227677906">
        <link role="classifier" targetNodeId="4.~UIEditorComponent" resolveInfo="UIEditorComponent" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219230933923">
      <property name="name" value="myOperationContext" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219230933924" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219230940160">
        <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219244707959">
      <property name="name" value="myQueryNode" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219244707960" />
      <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219244713120">
        <link role="concept" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219231114881">
      <property name="name" value="myProjectModel" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219231114882" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219231117831">
        <link role="classifier" targetNodeId="5.~SModel" resolveInfo="SModel" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219248209153">
      <property name="name" value="myOwner" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219248209154" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219248217297">
        <link role="classifier" targetNodeId="5.~ModelOwner" resolveInfo="ModelOwner" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219311152967">
      <property name="name" value="myScopeEditor" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219311152984" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219311216944">
        <link role="classifier" targetNodeId="32.~ScopeEditor" resolveInfo="ScopeEditor" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219322485059">
      <property name="name" value="myInspector" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219322485060" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219322489581">
        <link role="classifier" targetNodeId="31.~InspectorEditorComponent" resolveInfo="InspectorEditorComponent" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219314746258">
      <property name="name" value="myPanel" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219314746259" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219314749670">
        <link role="classifier" targetNodeId="29.~JPanel" resolveInfo="JPanel" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219314757063">
        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219314757064">
          <link role="baseMethodDeclaration" targetNodeId="29.~JPanel.&lt;init&gt;(java.awt.LayoutManager)" resolveInfo="JPanel" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219323342128">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219323379724">
              <link role="baseMethodDeclaration" targetNodeId="30.~BorderLayout.&lt;init&gt;()" resolveInfo="BorderLayout" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219223521083">
      <property name="name" value="getMainComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" id="1219223527778" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219223521086">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219223622507">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314795282">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219314795299">
              <link role="fieldDeclaration" targetNodeId="1219314746258" resolveInfo="myPanel" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219314795300" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219223578270">
        <link role="classifier" targetNodeId="29.~JComponent" resolveInfo="JComponent" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219319948277">
      <property name="name" value="setConceptDeclaration" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219319948278" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219319948279" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219319948280">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteCommandStatement" id="1219321969570">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219321969571">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219321969572">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219320008388">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219322302723">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219320009423">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219320008389">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219320008390">
                        <link role="fieldDeclaration" targetNodeId="1219244707959" resolveInfo="myQueryNode" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219320008391" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219320014942">
                      <link role="link" targetNodeId="1.1218793583446" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1219322304367">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1219322427872">
                      <link role="concept" targetNodeId="3v.1169125787135" resolveInfo="AbstractConceptDeclaration" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219322306697">
                        <link role="variableDeclaration" targetNodeId="1219319974769" resolveInfo="declaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219319974769">
        <property name="name" value="declaration" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219319974770" />
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219231438481">
      <property name="name" value="init" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219231438482" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219231443593" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219231438484">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteCommandStatement" id="1219234970696">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219234970697">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219234970698">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219244757109">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219244759474">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219244760884">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1219244760885">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219244760886">
                        <link role="concept" targetNodeId="1.1218793502081" resolveInfo="ModelQuery" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244757110">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244757111">
                      <link role="fieldDeclaration" targetNodeId="1219244707959" resolveInfo="myQueryNode" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244757112" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219233169690">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219233186133">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219233169691">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219233169692">
                      <link role="fieldDeclaration" targetNodeId="1219231114881" resolveInfo="myProjectModel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219233169693" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219233188106">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModel.addRoot(jetbrains.mps.smodel.SNode):void" resolveInfo="addRoot" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244768904">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244768905">
                        <link role="fieldDeclaration" targetNodeId="1219244707959" resolveInfo="myQueryNode" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244768906" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219233198972">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219233199664">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219233198973">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219233198974">
                      <link role="fieldDeclaration" targetNodeId="1219227669753" resolveInfo="myEditorComponent" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219233198975" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219233208182">
                    <link role="baseMethodDeclaration" targetNodeId="4.~EditorComponent.editNode(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.IOperationContext):void" resolveInfo="editNode" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244772938">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244772939">
                        <link role="fieldDeclaration" targetNodeId="1219244707959" resolveInfo="myQueryNode" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244772940" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219233213314">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219233213315">
                        <link role="fieldDeclaration" targetNodeId="1219230933923" resolveInfo="myOperationContext" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219233213316" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219227335690">
      <property name="name" value="buttonFind" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219227335691" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219227335692" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219227335693">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219317580931">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219317580932">
            <property name="name" value="scope" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219317580933">
              <link role="classifier" targetNodeId="5.~IScope" resolveInfo="IScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595935">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595936">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595937">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219317595938">
                    <link role="fieldDeclaration" targetNodeId="1219311152967" resolveInfo="myScopeEditor" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219317595939" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219317595940">
                  <link role="baseMethodDeclaration" targetNodeId="32.~ScopeEditor.getOptions():jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions" resolveInfo="getOptions" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219317595941">
                <link role="baseMethodDeclaration" targetNodeId="33.~ScopeOptions.getScope(jetbrains.mps.smodel.IOperationContext,jetbrains.mps.smodel.SModelDescriptor):jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595942">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219317595943">
                    <link role="fieldDeclaration" targetNodeId="1219230933923" resolveInfo="myOperationContext" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219317595944" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595945">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219317595946">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219317595947">
                      <link role="fieldDeclaration" targetNodeId="1219231114881" resolveInfo="myProjectModel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219317595948" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219317595949">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219244596782">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219244596783">
            <property name="name" value="task" />
            <property name="isFinal" value="true" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219244596784">
              <link role="classifier" targetNodeId="1219056224639" resolveInfo="QueryTask" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219244596785">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219244596786">
                <link role="baseMethodDeclaration" targetNodeId="1219062308214" resolveInfo="QueryExecutor" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244609025">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244609026">
                    <link role="fieldDeclaration" targetNodeId="1219230933923" resolveInfo="myOperationContext" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244609027" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244792087">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244792088">
                    <link role="fieldDeclaration" targetNodeId="1219244707959" resolveInfo="myQueryNode" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244792089" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219317607170">
                  <link role="variableDeclaration" targetNodeId="1219317580932" resolveInfo="scope" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219244596794">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244596795">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219244596796">
              <link role="classConcept" targetNodeId="20.~ProgressManager" resolveInfo="ProgressManager" />
              <link role="baseMethodDeclaration" targetNodeId="20.~ProgressManager.getInstance():com.intellij.openapi.progress.ProgressManager" resolveInfo="getInstance" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219244596797">
              <link role="baseMethodDeclaration" targetNodeId="20.~ProgressManager.run(com.intellij.openapi.progress.Task):void" resolveInfo="run" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219244596798">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1219244596799">
                  <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1219244596800">
                    <link role="classifier" targetNodeId="20.~Task$Modal" resolveInfo="Task.Modal" />
                    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219244596801" />
                    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219244596802">
                      <property name="name" value="run" />
                      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219244596803" />
                      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219244596804" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219244596805">
                        <property name="name" value="indicator" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219244596806">
                          <link role="classifier" targetNodeId="20.~ProgressIndicator" resolveInfo="ProgressIndicator" />
                        </node>
                        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219244596807">
                          <link role="annotation" targetNodeId="25.~NotNull" resolveInfo="NotNull" />
                        </node>
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219244596808">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219244596809">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244596810">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219244596811">
                              <link role="variableDeclaration" targetNodeId="1219244596783" resolveInfo="task" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219244596812">
                              <link role="baseMethodDeclaration" targetNodeId="1219056322465" resolveInfo="run" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219244596813">
                                <link role="variableDeclaration" targetNodeId="1219244596805" resolveInfo="indicator" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244596814">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219244596818">
                        <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getProject():com.intellij.openapi.project.Project" resolveInfo="getProject" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244692111">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244690766">
                          <link role="classConcept" targetNodeId="1219223245047" resolveInfo="SearchDialog" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219244696911">
                          <link role="fieldDeclaration" targetNodeId="1219230933923" resolveInfo="myOperationContext" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219244596819">
                      <property name="value" value="Executing query" />
                    </node>
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219244596820">
                      <property name="value" value="false" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219227345871">
        <link role="annotation" targetNodeId="28.~BaseDialog$Button" resolveInfo="BaseDialog.Button" />
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227345872">
          <link role="key" targetNodeId="28.~BaseDialog$Button.position():int" resolveInfo="position" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219227345873">
            <property name="value" value="0" />
          </node>
        </node>
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227345874">
          <link role="key" targetNodeId="28.~BaseDialog$Button.name():java.lang.String" resolveInfo="name" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219227345875">
            <property name="value" value="Find" />
          </node>
        </node>
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227345876">
          <link role="key" targetNodeId="28.~BaseDialog$Button.defaultButton():boolean" resolveInfo="defaultButton" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219227345877">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219227367159">
      <property name="name" value="buttonCancel" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219227367160" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219227367161" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219227367162">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219244403275">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219244403276">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219244403277">
              <link role="baseMethodDeclaration" targetNodeId="1219248314194" resolveInfo="disposeDialog" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219244403278" />
          </node>
        </node>
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219227386668">
        <link role="annotation" targetNodeId="28.~BaseDialog$Button" resolveInfo="BaseDialog.Button" />
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227386669">
          <link role="key" targetNodeId="28.~BaseDialog$Button.position():int" resolveInfo="position" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219227386670">
            <property name="value" value="1" />
          </node>
        </node>
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227386671">
          <link role="key" targetNodeId="28.~BaseDialog$Button.name():java.lang.String" resolveInfo="name" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219227386672">
            <property name="value" value="Cancel" />
          </node>
        </node>
        <node role="value" type="jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue" id="1219227386673">
          <link role="key" targetNodeId="28.~BaseDialog$Button.defaultButton():boolean" resolveInfo="defaultButton" />
          <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219227403066">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219248314194">
      <property name="name" value="disposeDialog" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219248314195" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219248314196" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219248314197">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219248321248">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219248321249">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219248321250">
              <link role="classConcept" targetNodeId="5.~SModelRepository" resolveInfo="SModelRepository" />
              <link role="baseMethodDeclaration" targetNodeId="5.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219248321251">
              <link role="baseMethodDeclaration" targetNodeId="5.~SModelRepository.unRegisterModelDescriptors(jetbrains.mps.smodel.ModelOwner):void" resolveInfo="unRegisterModelDescriptors" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219248327550">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219248327551">
                  <link role="fieldDeclaration" targetNodeId="1219248209153" resolveInfo="myOwner" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219248327552" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219248330444">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219248331368">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219248330445" />
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219248334887">
              <link role="baseMethodDeclaration" targetNodeId="30.~Window.dispose():void" resolveInfo="dispose" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219223245048" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1219223245049">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219223245050" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219223245051" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219223245052">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" id="1219314456410">
          <link role="constructorDeclaration" targetNodeId="28.~BaseDialog.&lt;init&gt;(java.awt.Frame,java.lang.String)" resolveInfo="BaseDialog" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314456411">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219314456412">
              <link role="variableDeclaration" targetNodeId="1219226833812" resolveInfo="context" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219314456413">
              <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getMainFrame():java.awt.Frame" resolveInfo="getMainFrame" />
            </node>
          </node>
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1219314456414">
            <property name="value" value="Find instances by condition" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1219311689494">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219311689495">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219311689496">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219311334039">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219311335496">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219311336171">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219311336172">
                      <link role="baseMethodDeclaration" targetNodeId="32.~ScopeEditor.&lt;init&gt;(jetbrains.mps.ide.findusages.view.optionseditor.options.ScopeOptions)" resolveInfo="ScopeEditor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219311450780">
                        <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219311491835">
                          <link role="baseMethodDeclaration" targetNodeId="33.~ScopeOptions.&lt;init&gt;()" resolveInfo="ScopeOptions" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219311334040">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219311334041">
                      <link role="fieldDeclaration" targetNodeId="1219311152967" resolveInfo="myScopeEditor" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219311334042" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219314721128">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314723180">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314721129">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219314721130">
                      <link role="fieldDeclaration" targetNodeId="1219314746258" resolveInfo="myPanel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219314721131" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219314726572">
                    <link role="baseMethodDeclaration" targetNodeId="30.~Container.add(java.awt.Component,java.lang.Object):void" resolveInfo="add" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314731422">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219314730418">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219314730419">
                          <link role="fieldDeclaration" targetNodeId="1219311152967" resolveInfo="myScopeEditor" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219314730420" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219314733176">
                        <link role="baseMethodDeclaration" targetNodeId="32.~BaseEditor.getComponent():javax.swing.JComponent" resolveInfo="getComponent" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1219323453211">
                      <link role="classifier" targetNodeId="30.~BorderLayout" resolveInfo="BorderLayout" />
                      <link role="variableDeclaration" targetNodeId="30.~BorderLayout.SOUTH" resolveInfo="SOUTH" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219230952436">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219230953643">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219230960224">
              <link role="variableDeclaration" targetNodeId="1219226833812" resolveInfo="context" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219230952437">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219230952438">
                <link role="fieldDeclaration" targetNodeId="1219230933923" resolveInfo="myOperationContext" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219230952439" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219248245616">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219248248323">
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219248245617">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219248245618">
                <link role="fieldDeclaration" targetNodeId="1219248209153" resolveInfo="myOwner" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219248245619" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219248250827">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" id="1219248281359">
                <node role="cls" type="jetbrains.mps.baseLanguage.structure.AnonymousClass" id="1219248281360">
                  <link role="classifier" targetNodeId="5.~ModelOwner" resolveInfo="ModelOwner" />
                  <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219248281361" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219231060880">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219231060881">
            <property name="name" value="modelDescriptor" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219231060882">
              <link role="classifier" targetNodeId="5.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219231086230">
              <link role="baseMethodDeclaration" targetNodeId="5.~ProjectModels.createDescriptorFor(jetbrains.mps.smodel.ModelOwner):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="createDescriptorFor" />
              <link role="classConcept" targetNodeId="5.~ProjectModels" resolveInfo="ProjectModels" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219248291909">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219248291910">
                  <link role="fieldDeclaration" targetNodeId="1219248209153" resolveInfo="myOwner" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219248291911" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219231128288">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219231129317">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219231142052">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219231141138">
                <link role="variableDeclaration" targetNodeId="1219231060881" resolveInfo="modelDescriptor" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219231167727">
                <link role="baseMethodDeclaration" targetNodeId="5.~SModelDescriptor.getSModel():jetbrains.mps.smodel.SModel" resolveInfo="getSModel" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219231128289">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219231128290">
                <link role="fieldDeclaration" targetNodeId="1219231114881" resolveInfo="myProjectModel" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219231128291" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219322533622">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219322542314">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219322556552">
              <link role="baseMethodDeclaration" targetNodeId="31.~InspectorEditorComponentFactory.getInspectorEditorComponent():jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent" resolveInfo="getInspectorEditorComponent" />
              <link role="classConcept" targetNodeId="31.~InspectorEditorComponentFactory" resolveInfo="InspectorEditorComponentFactory" />
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219322533623">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219322533624">
                <link role="fieldDeclaration" targetNodeId="1219322485059" resolveInfo="myInspector" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219322533625" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219227705899">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219227709372">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219227710781">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219227710782">
                <link role="baseMethodDeclaration" targetNodeId="4.~UIEditorComponent.&lt;init&gt;(jetbrains.mps.smodel.IOperationContext,jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent)" resolveInfo="UIEditorComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219227808200">
                  <link role="variableDeclaration" targetNodeId="1219226833812" resolveInfo="context" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219322562539">
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219322562540">
                    <link role="fieldDeclaration" targetNodeId="1219322485059" resolveInfo="myInspector" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219322562541" />
                </node>
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219227705900">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219227705901">
                <link role="fieldDeclaration" targetNodeId="1219227669753" resolveInfo="myEditorComponent" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219227705902" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219323044525">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219323044526">
            <property name="name" value="split" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219323044527">
              <link role="classifier" targetNodeId="29.~JSplitPane" resolveInfo="JSplitPane" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219323057045">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219323057046">
                <link role="baseMethodDeclaration" targetNodeId="29.~JSplitPane.&lt;init&gt;(int,java.awt.Component,java.awt.Component)" resolveInfo="JSplitPane" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1219323065891">
                  <link role="classifier" targetNodeId="29.~JSplitPane" resolveInfo="JSplitPane" />
                  <link role="variableDeclaration" targetNodeId="29.~JSplitPane.VERTICAL_SPLIT" resolveInfo="VERTICAL_SPLIT" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219323082423">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219323125104">
                    <link role="baseMethodDeclaration" targetNodeId="29.~JScrollPane.&lt;init&gt;(java.awt.Component)" resolveInfo="JScrollPane" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219323131683">
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219323131684">
                        <link role="fieldDeclaration" targetNodeId="1219227669753" resolveInfo="myEditorComponent" />
                      </node>
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219323131685" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219323134078">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219323143486">
                    <link role="baseMethodDeclaration" targetNodeId="29.~JScrollPane.&lt;init&gt;(java.awt.Component)" resolveInfo="JScrollPane" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1219323420570">
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219323420571">
                        <link role="classifier" targetNodeId="30.~Component" resolveInfo="Component" />
                      </node>
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219323420572">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219323420573">
                          <link role="fieldDeclaration" targetNodeId="1219322485059" resolveInfo="myInspector" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219323420574" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219323824709">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219323825789">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219323824710">
              <link role="variableDeclaration" targetNodeId="1219323044526" resolveInfo="split" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219323862086">
              <link role="baseMethodDeclaration" targetNodeId="29.~JSplitPane.setDividerLocation(int):void" resolveInfo="setDividerLocation" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219323863383">
                <property name="value" value="200" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219323169211">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219323170152">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219323169212">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219323169213">
                <link role="fieldDeclaration" targetNodeId="1219314746258" resolveInfo="myPanel" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219323169214" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219323172811">
              <link role="baseMethodDeclaration" targetNodeId="30.~Container.add(java.awt.Component,java.lang.Object):void" resolveInfo="add" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219323175343">
                <link role="variableDeclaration" targetNodeId="1219323044526" resolveInfo="split" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1219323180908">
                <link role="classifier" targetNodeId="30.~BorderLayout" resolveInfo="BorderLayout" />
                <link role="variableDeclaration" targetNodeId="30.~BorderLayout.CENTER" resolveInfo="CENTER" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219231457610">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219231457611">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219231457612">
              <link role="baseMethodDeclaration" targetNodeId="1219231438481" resolveInfo="init" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219231457613" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219225302355">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219225302356">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219225302357">
              <link role="baseMethodDeclaration" targetNodeId="30.~Window.setSize(java.awt.Dimension):void" resolveInfo="setSize" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219225302358">
                <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219225302359">
                  <link role="baseMethodDeclaration" targetNodeId="30.~Dimension.&lt;init&gt;(int,int)" resolveInfo="Dimension" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219225302360">
                    <property name="value" value="500" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1219225302361">
                    <property name="value" value="500" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219225302362" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219225167285">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219225167286">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219225167287">
              <link role="baseMethodDeclaration" targetNodeId="30.~Dialog.setModal(boolean):void" resolveInfo="setModal" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1219225169258">
                <property name="value" value="true" />
              </node>
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219225167288" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219226833812">
        <property name="name" value="context" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219226833813">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1219236260758">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219236260759" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219236260760" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219236260761">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThisConstructorInvocation" id="1219236306387">
          <link role="constructorDeclaration" targetNodeId="1219223245049" resolveInfo="SearchDialog" />
          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219236310732">
            <link role="variableDeclaration" targetNodeId="1219236269013" resolveInfo="context" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteCommandStatement" id="1219243877341">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219243877342">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219243877343">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219243872068">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219243872069">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219243872070">
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219243872071">
                      <link role="fieldDeclaration" targetNodeId="1219231114881" resolveInfo="myProjectModel" />
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219243872072" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219243872073">
                    <link role="baseMethodDeclaration" targetNodeId="5.~SModel.addImportedModel(jetbrains.mps.smodel.SModelUID):void" resolveInfo="addImportedModel" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219243872074">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219243872075">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219243872079">
                          <link role="baseMethodDeclaration" targetNodeId="5.~Language.getStructureModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getStructureModelDescriptor" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219244198387">
                          <link role="variableDeclaration" targetNodeId="1219236270937" resolveInfo="language" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219243872080">
                        <link role="baseMethodDeclaration" targetNodeId="5.~SModelDescriptor.getModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getModelUID" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219236269013">
        <property name="name" value="context" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219236269014">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219236270937">
        <property name="name" value="language" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219236279627">
          <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219223335992">
      <link role="classifier" targetNodeId="28.~BaseDialog" resolveInfo="BaseDialog" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1219235610174">
    <property name="name" value="FindInstancesByCondition" />
    <property name="outsideCommandExecution" value="true" />
    <property name="caption" value="Find Instances by condition" />
    <property name="isAlwaysVisible" value="true" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1219235610175">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219235610176">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219326492962">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219326492963">
            <property name="name" value="newContext" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219326492964">
              <link role="classifier" targetNodeId="1219325618540" resolveInfo="FindInstancesContext" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219326498747">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219326498748">
                <link role="baseMethodDeclaration" targetNodeId="1219325618542" resolveInfo="FindInstancesContext" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326505188">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219326505189" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219326505190">
                    <link role="member" targetNodeId="1219235761061" resolveInfo="context" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219236958873">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219236958874">
            <property name="name" value="dialog" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219236958875">
              <link role="classifier" targetNodeId="1219223245047" resolveInfo="SearchDialog" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1219236928817">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219236928818">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219236970876">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219236979215">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219236980640">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219236980641">
                    <link role="baseMethodDeclaration" targetNodeId="1219236260758" resolveInfo="SearchDialog" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219326522006">
                      <link role="variableDeclaration" targetNodeId="1219326492963" resolveInfo="newContext" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1219236994474">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219237002447">
                        <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219237002448" />
                        <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219237002449">
                          <link role="member" targetNodeId="1219236026639" resolveInfo="lang_module" />
                        </node>
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219236999571">
                        <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219236970877">
                  <link role="variableDeclaration" targetNodeId="1219236958874" resolveInfo="dialog" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1219236949838">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219236949840">
              <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219236945756">
              <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219236945757" />
              <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219236946743">
                <link role="member" targetNodeId="1219236026639" resolveInfo="lang_module" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1219237007684">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219237007685">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219237018796">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219237019891">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219237020957">
                    <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219237020958">
                      <link role="baseMethodDeclaration" targetNodeId="1219223245049" resolveInfo="SearchDialog" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219326532086">
                        <link role="variableDeclaration" targetNodeId="1219326492963" resolveInfo="newContext" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219237018797">
                    <link role="variableDeclaration" targetNodeId="1219236958874" resolveInfo="dialog" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219237026885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219237027590">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219237026886">
              <link role="variableDeclaration" targetNodeId="1219236958874" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219237040648">
              <link role="baseMethodDeclaration" targetNodeId="28.~BaseDialog.showDialog():void" resolveInfo="showDialog" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1219235761061">
      <property name="name" value="context" />
      <link role="key" targetNodeId="6.~MPSDataKeys.OPERATION_CONTEXT" resolveInfo="OPERATION_CONTEXT" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1219236026639">
      <property name="name" value="langModule" />
      <link role="key" targetNodeId="6.~MPSDataKeys.MODULE" resolveInfo="MODULE" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1219235830420">
    <property name="name" value="FindInstancesByConditionGroup" />
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1219235849843">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1219235854657">
        <link role="action" targetNodeId="1219235610174" resolveInfo="SearchDialogAction" />
      </node>
    </node>
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1219235857205">
      <link role="modifiedGroup" targetNodeId="2v.1204991224874" resolveInfo="LanguageActions" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDeclaration" id="1219321230528">
    <property name="name" value="FindInstancesByConditionAndNode" />
    <property name="caption" value="Find Instances by condition" />
    <property name="outsideCommandExecution" value="true" />
    <property name="isAlwaysVisible" value="true" />
    <node role="executeFunction" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ExecuteBlock" id="1219321230529">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219321230530">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219321631133">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219321631134">
            <property name="name" value="dialog" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219321631135">
              <link role="classifier" targetNodeId="1219223245047" resolveInfo="FindInstancesByConditionDialog" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1219321658561">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1219321658562">
                <link role="baseMethodDeclaration" targetNodeId="1219236260758" resolveInfo="FindInstancesByConditionDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219321668250">
                  <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219321673863" />
                  <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219321668252">
                    <link role="member" targetNodeId="1219321522061" resolveInfo="context" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1219321678443">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219321687947">
                    <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219321687948" />
                    <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219321687949">
                      <link role="member" targetNodeId="1219321586599" resolveInfo="contextModule" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219321681915">
                    <link role="classifier" targetNodeId="5.~Language" resolveInfo="Language" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219321720729">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219321721638">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219321720730">
              <link role="variableDeclaration" targetNodeId="1219321631134" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219321748999">
              <link role="baseMethodDeclaration" targetNodeId="1219319948277" resolveInfo="setConceptDeclaration" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219322061847">
                <node role="operand" type="jetbrains.mps.baseLanguage.classifiers.structure.ThisClassifierExpresson" id="1219322061848" />
                <node role="operation" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterReferenceOperation" id="1219322061849">
                  <link role="member" targetNodeId="1219321537189" resolveInfo="snode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219321694075">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219321700890">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219321694076">
              <link role="variableDeclaration" targetNodeId="1219321631134" resolveInfo="dialog" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219321713165">
              <link role="baseMethodDeclaration" targetNodeId="28.~BaseDialog.showDialog():void" resolveInfo="showDialog" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1219321522061">
      <property name="name" value="context" />
      <link role="key" targetNodeId="6.~MPSDataKeys.OPERATION_CONTEXT" resolveInfo="OPERATION_CONTEXT" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1219321537189">
      <property name="name" value="snode" />
      <link role="key" targetNodeId="6.~MPSDataKeys.SNODE" resolveInfo="SNODE" />
    </node>
    <node role="parameter" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionDataParameterDeclaration" id="1219321586599">
      <property name="name" value="contextModule" />
      <link role="key" targetNodeId="6.~MPSDataKeys.CONTEXT_MODULE" resolveInfo="CONTEXT_MODULE" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionGroupDeclaration" id="1219322457890">
    <property name="name" value="FindInstancesByConditionAndNodeGroup" />
    <node role="modifier" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ModificationStatement" id="1219322583970">
      <link role="modifiedGroup" targetNodeId="2v.1204991215587" resolveInfo="ProjectPaneNodeActions" />
    </node>
    <node role="contents" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ElementListContents" id="1219322512193">
      <node role="reference" type="jetbrains.mps.bootstrap.pluginLanguage.structure.ActionReference" id="1219322565280">
        <link role="action" targetNodeId="1219321230528" resolveInfo="FindInstancesByConditionAndNode" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1219325618540">
    <property name="name" value="FindInstancesContext" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219325618541" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1219325618542">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1219325618543" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219325618544" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219325618545">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219326372236">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219326375959">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326446494">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219326445399">
                <link role="variableDeclaration" targetNodeId="1219326437615" resolveInfo="oldContext" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219326450153">
                <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getMPSProject():jetbrains.mps.project.MPSProject" resolveInfo="getMPSProject" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326372237">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219326372238">
                <link role="fieldDeclaration" targetNodeId="1219326319430" resolveInfo="myProject" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219326372239" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219326382652">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1219326384062">
            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326454671">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219326453607">
                <link role="variableDeclaration" targetNodeId="1219326437615" resolveInfo="oldContext" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219326459611">
                <link role="baseMethodDeclaration" targetNodeId="5.~IOperationContext.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
              </node>
            </node>
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326382653">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219326382654">
                <link role="fieldDeclaration" targetNodeId="1219326329498" resolveInfo="myModule" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219326382655" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219326437615">
        <property name="name" value="oldContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219326437616">
          <link role="classifier" targetNodeId="5.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
    </node>
    <node role="superclass" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219325678146">
      <link role="classifier" targetNodeId="10.~StandaloneMPSContext" resolveInfo="StandaloneMPSContext" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219325687600">
      <property name="name" value="getMPSProject" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219325687601" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219325687602">
        <link role="classifier" targetNodeId="10.~MPSProject" resolveInfo="MPSProject" />
      </node>
      <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219325687603">
        <link role="annotation" targetNodeId="2.~Deprecated" resolveInfo="Deprecated" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219325687604">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219326345602">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326345603">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219326345604">
              <link role="fieldDeclaration" targetNodeId="1219326319430" resolveInfo="myProject" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219326345605" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219326316394">
      <property name="name" value="getModule" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219326316395" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219326316396">
        <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219326316397">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219326339097">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219326339098">
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219326339099">
              <link role="fieldDeclaration" targetNodeId="1219326329498" resolveInfo="myModule" />
            </node>
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219326339100" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219325687605">
      <property name="name" value="getScope" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219325687606" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219325687607">
        <link role="classifier" targetNodeId="5.~IScope" resolveInfo="IScope" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219325687608">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219325695894">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219325703522">
            <link role="baseMethodDeclaration" targetNodeId="10.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
            <link role="classConcept" targetNodeId="10.~GlobalScope" resolveInfo="GlobalScope" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1219327105422">
      <property name="name" value="getComponent" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219327105424" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219327105425">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219327238622">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219327238623">
            <property name="name" value="component" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1219327238624">
              <link role="typeVariableDeclaration" targetNodeId="1219327175866" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219327273910">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219327272501">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" id="1219327272502">
                  <link role="fieldDeclaration" targetNodeId="1219326319430" resolveInfo="myMPSProject" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1219327272503" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1219327280668">
                <link role="baseMethodDeclaration" targetNodeId="10.~MPSProject.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219327290419">
                  <link role="variableDeclaration" targetNodeId="1219327163254" resolveInfo="c" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1219327300641">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219327300642">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219327308993">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219327311495">
                <link role="variableDeclaration" targetNodeId="1219327238623" resolveInfo="component" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1219327305427">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1219327306977" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219327303176">
              <link role="variableDeclaration" targetNodeId="1219327163254" resolveInfo="c" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219327315794">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall" id="1219327324235">
            <link role="baseMethodDeclaration" targetNodeId="10.~StandaloneMPSContext.getComponent(java.lang.Class):java.lang.Object" resolveInfo="getComponent" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219327333789">
              <link role="variableDeclaration" targetNodeId="1219327163254" resolveInfo="c" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219327163254">
        <property name="name" value="c" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219327163255">
          <link role="classifier" targetNodeId="2.~Class" resolveInfo="Class" />
          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1219327187134">
            <link role="typeVariableDeclaration" targetNodeId="1219327175866" resolveInfo="T" />
          </node>
        </node>
        <node role="annotation" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance" id="1219327208103">
          <link role="annotation" targetNodeId="25.~NotNull" resolveInfo="NotNull" />
        </node>
      </node>
      <node role="typeVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration" id="1219327175866">
        <property name="name" value="T" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.TypeVariableReference" id="1219327183570">
        <link role="typeVariableDeclaration" targetNodeId="1219327175866" resolveInfo="T" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219326319430">
      <property name="name" value="myMPSProject" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219326319447" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219326326263">
        <link role="classifier" targetNodeId="10.~MPSProject" resolveInfo="MPSProject" />
      </node>
    </node>
    <node role="field" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration" id="1219326329498">
      <property name="name" value="myModule" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219326329499" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219326333159">
        <link role="classifier" targetNodeId="10.~IModule" resolveInfo="IModule" />
      </node>
    </node>
  </node>
</model>

