<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.actions">
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <maxImportIndex value="10" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="3" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="5" modelUID="jetbrains.mps.typesystem@java_stub" />
  <import index="6" modelUID="jetbrains.mps.bootstrap.smodelLanguage.types@java_stub" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="8" modelUID="java.util@java_stub" />
  <import index="9" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1138078942005">
    <property name="name" value="SModelLang_node_substitute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1138413233760">
      <property name="actionsFactoryAspectId" value="PrimaryOperations_for_LeftExpression_type" />
      <property name="description" value="choose operation. applicable if expression before '.' has appropriate type" />
      <property name="applicableLinkMetaclass" value="aggregation" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1161715685433">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1161715685434">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1161715694404">
            <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1161715782581">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionParm_parentNode" id="1161715701954" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1161716360313">
                <link role="concept" targetNodeId="1.1138055978872" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1161715694406">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1161716400072">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1161716400073">
                  <property name="name" value="leftExpression" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1161716400091">
                    <link role="concept" targetNodeId="3.1068431790191" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1161716383944">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1161716378365">
                      <link role="concept" targetNodeId="1.1138055978872" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionParm_parentNode" id="1161716376723" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1161716391789">
                      <link role="link" targetNodeId="1.1138056667223" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1161716066024">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1161716431000">
                  <link role="baseMethodDeclaration" targetNodeId="1154643460420" resolveInfo="isExpressionOfOurType" />
                  <link role="classConcept" targetNodeId="1154643386654" resolveInfo="ActionsUtil_mpsLoadable" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1161716435189">
                    <link role="variableDeclaration" targetNodeId="1161716400073" resolveInfo="leftExpression" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1161716071184">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1161716439362" />
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1145998608648">
      <property name="actionsFactoryAspectId" value="Property_and_LinkAccess_for_LeftExpression_type" />
      <property name="description" value="choose operation. applicable if expression before '.' has 'snode' or 'slink' type" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1161716815601">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1161716815602">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1161716836703">
            <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1161716836704">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionParm_parentNode" id="1161716836705" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1161716836706">
                <link role="concept" targetNodeId="1.1138055978872" />
              </node>
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1161716836707">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1161716836708">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1161716836709">
                  <property name="name" value="leftExpression" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1161716836710">
                    <link role="concept" targetNodeId="3.1068431790191" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1161716836711">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1161716836712">
                      <link role="concept" targetNodeId="1.1138055978872" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionParm_parentNode" id="1161716836713" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1161716836714">
                      <link role="link" targetNodeId="1.1138056667223" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1161716836715">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1161716836716">
                  <link role="classConcept" targetNodeId="1154643386654" resolveInfo="ActionsUtil_mpsLoadable" />
                  <link role="baseMethodDeclaration" targetNodeId="1161716641689" resolveInfo="isExpressionOf_snode_or_slink_Type" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1161716836717">
                    <link role="variableDeclaration" targetNodeId="1161716836709" resolveInfo="leftExpression" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1161716836718">
            <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1161716836719" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActions" id="1138079717967">
    <property name="name" value="SModelLang_rtransform" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138079721624">
      <property name="actionsFactoryAspectId" value="Expression_to_SmodelLangOperation" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1154624855279">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154624855280">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154652530028">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1154652627218">
              <link role="baseMethodDeclaration" targetNodeId="1154643460420" />
              <link role="classConcept" targetNodeId="1154643386654" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionParm_sourceNode" id="1154652642750" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1145405559673">
      <property name="actionsFactoryAspectId" value="Expression_NodeTypeCast" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1154634535241">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154634535242">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154634832403">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154634832404">
              <property name="name" value="type" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154634832406">
                <link role="classifier" extResolveInfo="5.[Classifier]ITypeObject" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1154634795495">
                <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]ITypeChecker).([InstanceMethodDeclaration]getNodeType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1154634766638">
                  <link role="baseMethodDeclaration" extResolveInfo="5.static method ([Classifier]TypeCheckerAccess).([StaticMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                  <link role="classConcept" extResolveInfo="5.[Classifier]TypeCheckerAccess" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionParm_sourceNode" id="1154634812121" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154634869330">
            <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1154635003557">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154635059851">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154635033911">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154635031598">
                    <link role="variableDeclaration" targetNodeId="1154634832404" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154635050366">
                    <link role="classifier" extResolveInfo="6.[Classifier]Slink_TypeObject" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154634928227">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154634916209">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154634913771">
                    <link role="variableDeclaration" targetNodeId="1154634832404" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154634921476">
                    <link role="classifier" extResolveInfo="6.[Classifier]Snode_TypeObject" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1145406048784">
      <property name="actionsFactoryAspectId" value="Expression_SemanticDowncast" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1154636612745">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154636612746">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154652872590">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1154652872591">
              <link role="classConcept" targetNodeId="1154643386654" />
              <link role="baseMethodDeclaration" targetNodeId="1154643460420" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionParm_sourceNode" id="1154652872592" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138669164825">
      <property name="actionsFactoryAspectId" value="DelegateToParentExpression" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1144103719164">
      <property name="actionsFactoryAspectId" value="AddOperationParm" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1154637518825">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154637518826">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154637603430">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154637603431">
              <property name="name" value="alreadyHasParms" />
              <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1154637603433" />
              <node role="initializer" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1154637583145">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1154637587586">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1154637549549">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1154637530641">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionParm_sourceNode" id="1154637528765" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1154637541627">
                      <link role="link" targetNodeId="1.1144104376918" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1154637553691" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1154637616889">
            <node role="condition" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154637619204">
              <link role="variableDeclaration" targetNodeId="1154637603431" />
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1154637616891">
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154637621611">
                <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1154637626754" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154653200178">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154653200179">
              <property name="name" value="applicableParms" />
              <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154653200181">
                <link role="classifier" extResolveInfo="8.[Classifier]List" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154653200182">
                  <link role="classifier" extResolveInfo="7.[Classifier]SNode" />
                </node>
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1171396566137">
                <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]getConceptLinkTargets((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1171396571696">
                  <property name="value" value="applicableParameter" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1171396571697">
                  <property name="value" value="true" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_scope" id="1171396571698" />
                <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1171396558412">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionParm_sourceNode" id="1171396540463" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154653222559">
            <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1154653242079">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1154653245348">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1154653234922">
                <link role="baseMethodDeclaration" extResolveInfo="8.method ([Classifier]List).([InstanceMethodDeclaration]size() : (jetbrains.mps.baseLanguage.types.int/jetbrains.mps.baseLanguage.types.int))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154653227873">
                  <link role="variableDeclaration" targetNodeId="1154653200179" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1154643386654">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1154643460420">
      <property name="name" value="isExpressionOf_any_our_Type" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1154643499252" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1154643460422">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154643669370">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154643669371">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154643669373">
              <link role="classifier" extResolveInfo="5.[Classifier]ITypeObject" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1154643656415">
              <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]ITypeChecker).([InstanceMethodDeclaration]getNodeType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1154643637475">
                <link role="baseMethodDeclaration" extResolveInfo="5.static method ([Classifier]TypeCheckerAccess).([StaticMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                <link role="classConcept" extResolveInfo="5.[Classifier]TypeCheckerAccess" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1154643660119">
                <link role="variableDeclaration" targetNodeId="1154643604799" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154652093233">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154652093234">
            <property name="name" value="test1" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1154652093236" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.OrExpression" id="1154652038275">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652084278">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154652075479">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652070447">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154652080527">
                    <link role="classifier" extResolveInfo="6.[Classifier]Snode_TypeObject" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652031414">
                <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1154651602058">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1154651612108">
                    <link role="classifier" extResolveInfo="6.[Classifier]BasicType" />
                    <link role="variableDeclaration" extResolveInfo="6.static field ([Classifier]BasicType).([StaticFieldDeclaration]smodel_ : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [BasicType]))" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154651599901">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154652102378">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154652102379">
            <property name="name" value="test2" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1154652102380" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.OrExpression" id="1154652127763">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652114977">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154652114978">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652114979">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154652122496">
                    <link role="classifier" extResolveInfo="6.[Classifier]Sproperty_TypeObject" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652141825">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154652141826">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652141827">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154652147438">
                    <link role="classifier" extResolveInfo="6.[Classifier]Slink_TypeObject" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1154652366361">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1154652366362">
            <property name="name" value="test3" />
            <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1154652366363" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.OrExpression" id="1154652366364">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652366365">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154652366366">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652366367">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154652382045">
                    <link role="classifier" extResolveInfo="6.[Classifier]Slinklist_TypeObject" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1154652366369">
                <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1154652366370">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652366371">
                    <link role="variableDeclaration" targetNodeId="1154643669371" />
                  </node>
                  <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1154652390640">
                    <link role="classifier" extResolveInfo="6.[Classifier]Sconcept_property_TypeObject" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1154652188162">
          <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1154723908373">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652400609">
              <link role="variableDeclaration" targetNodeId="1154652093234" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.OrExpression" id="1154723912593">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652418176">
                <link role="variableDeclaration" targetNodeId="1154652102379" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1154652428227">
                <link role="variableDeclaration" targetNodeId="1154652366362" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1154643604799">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1154643604800">
          <link role="concept" targetNodeId="3.1068431790191" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1161716641689">
      <property name="name" value="isExpressionOf_snode_or_slink_Type" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1161716641690" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1161716641691">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1161716641692">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1161716641693">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1161716641694">
              <link role="classifier" extResolveInfo="5.[Classifier]ITypeObject" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1161716641695">
              <link role="baseMethodDeclaration" extResolveInfo="5.method ([Classifier]ITypeChecker).([InstanceMethodDeclaration]getNodeType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]))" />
              <node role="instance" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1161716641696">
                <link role="baseMethodDeclaration" extResolveInfo="5.static method ([Classifier]TypeCheckerAccess).([StaticMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                <link role="classConcept" extResolveInfo="5.[Classifier]TypeCheckerAccess" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ParameterReference" id="1161716641697">
                <link role="variableDeclaration" targetNodeId="1161716641740" resolveInfo="expression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1161716721309">
          <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1161716772730">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1161716765788">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1161716765789">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1161716765790">
                  <link role="variableDeclaration" targetNodeId="1161716641693" resolveInfo="type" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1161716765791">
                  <link role="classifier" extResolveInfo="6.[Classifier]Snode_TypeObject" />
                </node>
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.ParenthesizedExpression" id="1161716779671">
              <node role="expression" type="jetbrains.mps.baseLanguage.InstanceOfExpression" id="1161716779672">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1161716779673">
                  <link role="variableDeclaration" targetNodeId="1161716641693" resolveInfo="type" />
                </node>
                <node role="classType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1161716786255">
                  <link role="classifier" extResolveInfo="6.[Classifier]Slink_TypeObject" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1161716641740">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1161716641741">
          <link role="concept" targetNodeId="3.1068431790191" />
        </node>
      </node>
    </node>
  </node>
</model>

