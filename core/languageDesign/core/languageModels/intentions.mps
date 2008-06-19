<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.core.intentions">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.intentionsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.intentionsLanguage.constraints" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts">
    <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  </language>
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <maxImportIndex value="5" />
  <import index="1" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="5" modelUID="java.lang@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1209383918929">
    <property name="name" value="AddMissingLanguageImport" />
    <property name="isErrorIntention" value="true" />
    <link role="forConcept" targetNodeId="1.1133920641626" resolveInfo="BaseConcept" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1209383918930">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209383918931">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209383934311">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209383938673">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209383953317">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1209383956430">
                <property name="value" value=" to current module" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209383946791">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209383946445">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209383940129" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209383950488">
                  <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getLanguageNamespace():java.lang.String" resolveInfo="getLanguageNamespace" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1209383934312">
              <property name="value" value="Add language " />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1209383918932">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209383918933">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209383995632">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384001893">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384000468">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209383995837">
                <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209383995633" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384000263">
                  <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getOperationContext():jetbrains.mps.smodel.IOperationContext" resolveInfo="getOperationContext" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384001674">
                <link role="baseMethodDeclaration" targetNodeId="2.~IOperationContext.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384006437">
              <link role="baseMethodDeclaration" targetNodeId="4.~IModule.addUsedLangauge(java.lang.String):void" resolveInfo="addUsedLangauge" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384011866">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209384010708">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209384007485" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384013697">
                  <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getLanguageNamespace():java.lang.String" resolveInfo="getLanguageNamespace" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1209383961978">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209383961979">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209383977800">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1209383990097">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209383991428" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209383983275">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209383982961">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209383977801" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209383986935">
                <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getLanguage(jetbrains.mps.smodel.IScope):jetbrains.mps.smodel.Language" resolveInfo="getLanguage" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209383987999">
                  <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209383987717" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209383989018">
                    <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration" id="1209384963618">
    <property name="name" value="AddMissingDependency" />
    <property name="isErrorIntention" value="true" />
    <link role="forConcept" targetNodeId="1.1133920641626" resolveInfo="BaseConcept" />
    <node role="descriptionFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.DescriptionBlock" id="1209384963619">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209384963620">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209384987919">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209384987920">
            <property name="name" value="scope" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209384987921">
              <link role="classifier" targetNodeId="2.~IScope" resolveInfo="IScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384989618">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209384989302" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384990782">
                <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1209384972498">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384979085">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209384977878">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209384975789" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384982627">
              <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209384972500">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209384974521">
              <link role="classifier" targetNodeId="2.~SReference" resolveInfo="SReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209384972502">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385154009">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385154010">
                <property name="name" value="uid" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385154011">
                  <link role="classifier" targetNodeId="2.~SModelUID" resolveInfo="SModelUID" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385154012">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385154013">
                    <link role="variableDeclaration" targetNodeId="1209384972500" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385154014">
                    <link role="baseMethodDeclaration" targetNodeId="2.~SReference.getTargetModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getTargetModelUID" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209384983302">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1209385207410">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1209385217042">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385217985" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385212484">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1209385211106">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                      <link role="classConcept" targetNodeId="4.~GlobalScope" resolveInfo="GlobalScope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385214301">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385215054">
                        <link role="variableDeclaration" targetNodeId="1209385154010" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1209385006174">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209384993601">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209384993363">
                      <link role="variableDeclaration" targetNodeId="1209384987920" resolveInfo="scope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209384997231">
                      <link role="baseMethodDeclaration" targetNodeId="2.~IScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385154031">
                        <link role="variableDeclaration" targetNodeId="1209385154010" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385007960" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209384983304">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385165278">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385165279">
                    <property name="name" value="sm" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385165280">
                      <link role="classifier" targetNodeId="2.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385224209">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1209385224210">
                        <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                        <link role="classConcept" targetNodeId="4.~GlobalScope" resolveInfo="GlobalScope" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385224211">
                        <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385224212">
                          <link role="variableDeclaration" targetNodeId="1209385154010" resolveInfo="uid" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209385228564">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1209385242563">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385243993">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385243661">
                        <link role="variableDeclaration" targetNodeId="1209385165279" resolveInfo="sm" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385245685">
                        <link role="baseMethodDeclaration" targetNodeId="2.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1209385231294">
                      <property name="value" value="Add dependency on module " />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1209385248988">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1209385261087">
            <link role="baseMethodDeclaration" targetNodeId="5.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ExecuteBlock" id="1209384963621">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209384963622">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385300976">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385300977">
            <property name="name" value="scope" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385300978">
              <link role="classifier" targetNodeId="2.~IScope" resolveInfo="IScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385300979">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209385300980" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385300981">
                <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1209385300982">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385300983">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209385300984">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209385300985" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385300986">
              <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385300987">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385300988">
              <link role="classifier" targetNodeId="2.~SReference" resolveInfo="SReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209385300989">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385300990">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385300991">
                <property name="name" value="uid" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385300992">
                  <link role="classifier" targetNodeId="2.~SModelUID" resolveInfo="SModelUID" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385300993">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385300994">
                    <link role="variableDeclaration" targetNodeId="1209385300987" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385300995">
                    <link role="baseMethodDeclaration" targetNodeId="2.~SReference.getTargetModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getTargetModelUID" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209385300996">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1209385300997">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1209385300998">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385300999" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385301000">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1209385301001">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                      <link role="classConcept" targetNodeId="4.~GlobalScope" resolveInfo="GlobalScope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385301002">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385301003">
                        <link role="variableDeclaration" targetNodeId="1209385300991" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1209385301004">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385301005">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385301006">
                      <link role="variableDeclaration" targetNodeId="1209385300977" resolveInfo="scope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385301007">
                      <link role="baseMethodDeclaration" targetNodeId="2.~IScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385301008">
                        <link role="variableDeclaration" targetNodeId="1209385300991" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385301009" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209385301010">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385301011">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385301012">
                    <property name="name" value="sm" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385301013">
                      <link role="classifier" targetNodeId="2.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385301014">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1209385301015">
                        <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                        <link role="classConcept" targetNodeId="4.~GlobalScope" resolveInfo="GlobalScope" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385301016">
                        <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385301017">
                          <link role="variableDeclaration" targetNodeId="1209385300991" resolveInfo="uid" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1209385306059">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385315968">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385314635">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385306514">
                        <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209385306060" />
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385314181">
                          <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getOperationContext():jetbrains.mps.smodel.IOperationContext" resolveInfo="getOperationContext" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385315810">
                        <link role="baseMethodDeclaration" targetNodeId="2.~IOperationContext.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385319386">
                      <link role="baseMethodDeclaration" targetNodeId="4.~IModule.addDependency(java.lang.String,boolean):void" resolveInfo="addDependency" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385322361">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385320247">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385319934">
                            <link role="variableDeclaration" targetNodeId="1209385301012" resolveInfo="sm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385322063">
                            <link role="baseMethodDeclaration" targetNodeId="2.~SModelDescriptor.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385325317">
                          <link role="baseMethodDeclaration" targetNodeId="4.~IModule.getModuleUID():java.lang.String" resolveInfo="getModuleUID" />
                        </node>
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1209385326319">
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
    </node>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.IsApplicableBlock" id="1209385272886">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209385272887">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385285846">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385285847">
            <property name="name" value="scope" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385285848">
              <link role="classifier" targetNodeId="2.~IScope" resolveInfo="IScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385285849">
              <node role="operand" type="jetbrains.mps.bootstrap.sharedConcepts.structure.ConceptFunctionParameter_editorContext" id="1209385285850" />
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385285851">
                <link role="baseMethodDeclaration" targetNodeId="3.~EditorContext.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1209385276361">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385276362">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1209385276363">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.intentionsLanguage.structure.ConceptFunctionParameter_node" id="1209385276364" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385276365">
              <link role="baseMethodDeclaration" targetNodeId="2.~SNode.getReferences():java.util.List" resolveInfo="getReferences" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385276366">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385276367">
              <link role="classifier" targetNodeId="2.~SReference" resolveInfo="SReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209385276368">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1209385276369">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1209385276370">
                <property name="name" value="uid" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1209385276371">
                  <link role="classifier" targetNodeId="2.~SModelUID" resolveInfo="SModelUID" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385276372">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385276373">
                    <link role="variableDeclaration" targetNodeId="1209385276366" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385276374">
                    <link role="baseMethodDeclaration" targetNodeId="2.~SReference.getTargetModelUID():jetbrains.mps.smodel.SModelUID" resolveInfo="getTargetModelUID" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1209385276375">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1209385276376">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1209385276377">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385276378" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385276379">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1209385276380">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getInstance():jetbrains.mps.project.GlobalScope" resolveInfo="getInstance" />
                      <link role="classConcept" targetNodeId="4.~GlobalScope" resolveInfo="GlobalScope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385276381">
                      <link role="baseMethodDeclaration" targetNodeId="4.~GlobalScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385276382">
                        <link role="variableDeclaration" targetNodeId="1209385276370" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1209385276383">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1209385276384">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385276385">
                      <link role="variableDeclaration" targetNodeId="1209385285847" resolveInfo="scope" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1209385276386">
                      <link role="baseMethodDeclaration" targetNodeId="2.~IScope.getModelDescriptor(jetbrains.mps.smodel.SModelUID):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1209385276387">
                        <link role="variableDeclaration" targetNodeId="1209385276370" resolveInfo="uid" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1209385276388" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1209385276389">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209385290905">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1209385292055">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1209385293184">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1209385294391">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

