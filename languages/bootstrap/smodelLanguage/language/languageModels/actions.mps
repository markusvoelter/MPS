<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.actions">
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.sharedConcepts" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <language namespace="jetbrains.mps.bootstrap.helgins" />
  <maxImportIndex value="18" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="3" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="8" modelUID="java.util@java_stub" />
  <import index="13" modelUID="jetbrains.mps.smodel.search@java_stub" />
  <import index="14" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="15" modelUID="jetbrains.mps.core.structure" />
  <import index="16" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" />
  <import index="17" modelUID="java.lang@java_stub" />
  <import index="18" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure@java_stub" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1138078942005">
    <property name="package" value="substitute" />
    <property name="name" value="snodeOperation" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1138413233760">
      <property name="description" value="all operations appropriate for expression before'.'" />
      <property name="useNewActions" value="true" />
      <property name="applicableLinkMetaclass" value="aggregation" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1180466611084">
        <property name="name" value="leftExpressionType" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1180466611085">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180466611086">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1180466699024">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180467206908">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1180467208378" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180466719764">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1180466722553">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1180466706610">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1180466699025" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1180466617153" />
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1180467250876">
        <property name="name" value="leftIsModel" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1180467250877">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180467250878">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1180467294103">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180467316751">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180467319342" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180467294104">
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180467308320">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1143226024141" />
                  </node>
                  <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1180467300322">
                    <link role="variableDeclaration" targetNodeId="1180466611084" resolveInfo="leftExpressionType" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180471909791">
          <link role="classifier" extResolveInfo="17.[Classifier]Boolean" />
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1180467322639">
        <property name="name" value="leftIsNode" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1180467322640">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180467322641">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1180467322642">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180467322643">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180467322644" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180467322645">
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180467322646">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1138055754698" />
                  </node>
                  <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1180467322647">
                    <link role="variableDeclaration" targetNodeId="1180466611084" resolveInfo="leftExpressionType" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180471914101">
          <link role="classifier" extResolveInfo="17.[Classifier]Boolean" />
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1180467339900">
        <property name="name" value="leftIsConcept" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1180467339901">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180467339902">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1180467339903">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180467339904">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180467339905" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180467339906">
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180467339907">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1172420572800" />
                  </node>
                  <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1180467339908">
                    <link role="variableDeclaration" targetNodeId="1180466611084" resolveInfo="leftExpressionType" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1180471918299">
          <link role="classifier" extResolveInfo="17.[Classifier]Boolean" />
        </node>
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1161715685433">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1161715685434">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173919433958">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173919433959">
              <property name="name" value="leftExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173919433960">
                <link role="concept" targetNodeId="3.1068431790191" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173919433961">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1173919433962">
                  <link role="concept" targetNodeId="1.1138055978872" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1173919433963" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173919433964">
                  <link role="link" targetNodeId="1.1138056667223" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173919433965">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1173919433966">
              <link role="classConcept" targetNodeId="1154643386654" resolveInfo="QueriesUtil" />
              <link role="baseMethodDeclaration" targetNodeId="1173912496513" resolveInfo="isTypeOf_Expression_is_snode_or_snodelist" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173919433967">
                <link role="variableDeclaration" targetNodeId="1173919433959" resolveInfo="leftExpression" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.RemoveByConditionPart" id="1180467401112">
        <node role="condition" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RemoveBy_Condition" id="1180467401113">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180467401114">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180467938464">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180467938465">
                <property name="name" value="leftExpression" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1180467938466">
                  <link role="concept" targetNodeId="3.1068431790191" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180467904890">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1180467933380">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1180467920518">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1180467902446" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468007410">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468007411">
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180468074613">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180468074614">
                    <property name="name" value="dataType" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1180468074615">
                      <link role="concept" targetNodeId="14.1082978164218" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468068349">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1180468072606">
                        <link role="link" targetNodeId="14.1082985295845" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468057588">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1180468066843">
                          <link role="link" targetNodeId="1.1138056395725" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1180468053112">
                          <link role="concept" targetNodeId="1.1138056022639" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468050109">
                            <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468083755">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468083756">
                    <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468293472">
                      <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469051659">
                        <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469051660">
                          <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                          <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469051661">
                            <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469051662" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469051663">
                            <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                            <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_enum_property : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                          </node>
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469051664">
                            <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                            <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469051665" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468087603">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1180468090534">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1180468093277">
                        <link role="conceptDeclaration" targetNodeId="14.1082978164219" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468086078">
                      <link role="variableDeclaration" targetNodeId="1180468074614" resolveInfo="dataType" />
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.BlockStatement" id="1180468581974">
                    <node role="statements" type="jetbrains.mps.baseLanguage.StatementList" id="1180468581975">
                      <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468609152">
                        <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469060376">
                          <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469060377">
                            <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                            <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469060378">
                              <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469060379" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469060380">
                              <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                              <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_simple_property : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                            </node>
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469060381">
                              <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                              <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469060382" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468012391">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1180468014396">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1180468036619">
                    <link role="conceptDeclaration" targetNodeId="1.1138056022639" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468010932">
                  <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468702898">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468702899">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468745159">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469067342">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469067343">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469067344">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469067345" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469067346">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_concept_property : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469067347">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469067348" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468720277">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1180468723693">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1180468727373">
                    <link role="conceptDeclaration" targetNodeId="1.1145994841052" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468718393">
                  <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468776393">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468776394">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468776395">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469075215">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469075216">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469075217">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469075218" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469075219">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_link : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469075220">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469075221" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468776402">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1180468776403">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1180468788948">
                    <link role="conceptDeclaration" targetNodeId="1.1138056143562" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468776405">
                  <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468801941">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468801942">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468801943">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469079478">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469079479">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469079480">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469079481" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469079482">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_linkList : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469079483">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469079484" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180468801950">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1180468801951">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1180468808589">
                    <link role="conceptDeclaration" targetNodeId="1.1138056282393" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180468801953">
                  <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1180468858469">
              <property name="value" value="==========" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180474733602">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180474733603">
                <property name="name" value="leftType" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1180474733604" />
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180474721604">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1180474723120" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180474719919">
                    <link role="variableDeclaration" targetNodeId="1180467938465" resolveInfo="leftExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1180478401630">
              <property name="value" value="is concept ?" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468991478">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468991479">
                <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1180469022136">
                  <property name="value" value="any op applicable to node is also applicable to concept" />
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180469003138">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180469003139">
                    <property name="name" value="b1" />
                    <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1180469003140" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469103004">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469103005">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469103006" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469103007">
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_node : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469103008">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469103009" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1180469135145">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1180469135146">
                    <property name="name" value="b2" />
                    <node role="type" type="jetbrains.mps.baseLanguage.BooleanType" id="1180469135147" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469135149">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469135150">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469135151" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469135152">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_concept : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469135153">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469135154" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180469160613">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469175875">
                    <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1180469182188">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180469184666">
                        <link role="variableDeclaration" targetNodeId="1180469135146" resolveInfo="b2" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180469179305">
                        <link role="variableDeclaration" targetNodeId="1180469003139" resolveInfo="b1" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180474860255">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180474860256" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180474860257">
                  <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180474860258">
                    <link role="variableDeclaration" targetNodeId="1180474733603" resolveInfo="leftType" />
                  </node>
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180474860259">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1172420572800" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1180474803961">
              <property name="value" value="is node ?" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468952664">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468952665">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468969991">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469093739">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469093740">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469093741">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469093742" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469093743">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_node : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469093744">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469093745" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180474830837">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180474830838" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180474830839">
                  <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180474830840">
                    <link role="variableDeclaration" targetNodeId="1180474733603" resolveInfo="leftType" />
                  </node>
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180474830841">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1138055754698" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1180474748506">
              <property name="value" value="is smodel ?" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1180468874562">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1180468874563">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180468883830">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1180469089992">
                    <node role="expression" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469089993">
                      <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]SNode).([InstanceMethodDeclaration]hasConceptProperty((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.SemanticDowncastExpression" id="1180469089994">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_concept" id="1180469089995" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1180469089996">
                        <link role="classifier" extResolveInfo="18.[Classifier]SNodeOperation" />
                        <link role="variableDeclaration" extResolveInfo="18.static field ([Classifier]SNodeOperation).([StaticFieldDeclaration]CPR_Applicable_to_model : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]))" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1180469089997">
                        <link role="baseMethodDeclaration" extResolveInfo="7.method ([Classifier]IOperationContext).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_operationContext" id="1180469089998" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1180474792078">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1180474793343" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1180474774053">
                  <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1180474779536">
                    <link role="variableDeclaration" targetNodeId="1180474733603" resolveInfo="leftType" />
                  </node>
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1180474782425">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1143226024141" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180469199071">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1180469201758">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActions" id="1138079717967">
    <property name="package" value="rightTransform" />
    <property name="name" value="snodeOperation" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1138669164825">
      <property name="description" value="delegate to parent (SNodeOperationExpression)" />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.IncludeRightTransformForNodePart" id="1180112896209">
        <node role="nodeBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_NodeQuery" id="1180112896210">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1180112896211">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1180112905791">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1180115509900">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetParentOperation" id="1180115515854" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1180112905792" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1144103719164">
      <property name="description" value="add operation param: expr.op -&gt; expr.op&lt; .. &gt;" />
      <property name="useNewActions" value="true" />
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
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1173981185216" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1173981489633">
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
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179536421294">
            <node role="expression" type="jetbrains.mps.baseLanguage.GreaterThanExpression" id="1179536476198">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1179536479690">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1179536427291">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179536421295">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptLinkAccess" id="1179536421296">
                    <link role="conceptLinkDeclaration" targetNodeId="1.1144102537873" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179536421297" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.GetSizeOperation" id="1179536430015" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179536505969">
        <link role="concept" targetNodeId="1.1138411891628" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.SimpleRightTransformMenuPart" id="1179536544487">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_Handler" id="1179536544488">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179536544489">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179536604385">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179536626727">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddNewChildOperation" id="1179536644420" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179536610360">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1179536617907">
                      <link role="link" targetNodeId="1.1144104376918" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179536604386" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1180465685342">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1180465688714" />
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179536550573">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179536550574">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179536572829">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179536572830">
                  <property name="value" value="&lt; .. &gt;" />
                </node>
              </node>
            </node>
          </node>
          <node role="descriptionText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179536582885">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179536582886">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179536584831">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179536584832">
                  <property name="value" value="add operation parameters" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1154643386654">
    <property name="name" value="ActionUtil_smodel" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1173912496513">
      <property name="name" value="isExpression_appropriateFor_ourOperations" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1173912508885" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173912496515">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173919376385">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173919376386">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173919376387">
              <link role="variableDeclaration" targetNodeId="1173912653195" resolveInfo="expression" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsNullOperation" id="1173919376388" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173919376389">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173919376390">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1173919376391" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173920403894">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173920410226">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173920407944">
              <link role="variableDeclaration" targetNodeId="1173912653195" resolveInfo="expression" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1173920412602">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556242889">
                <link role="conceptDeclaration" targetNodeId="1.1138055978872" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173920403896">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1173920495359">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1173920495360">
                <property name="name" value="leftOperation" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173920495361">
                  <link role="concept" targetNodeId="1.1138411891628" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173920442170">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1173920436138">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173920432229">
                      <link role="variableDeclaration" targetNodeId="1173912653195" resolveInfo="expression" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1173920454577">
                    <link role="link" targetNodeId="1.1138411864174" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173920502988">
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173920511883">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173920510507">
                  <link role="variableDeclaration" targetNodeId="1173920495360" resolveInfo="leftOperation" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1173920515540">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556243100">
                    <link role="conceptDeclaration" targetNodeId="1.1145994841052" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173920502990">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173920530588">
                  <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1173920538043">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173920542498">
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173920546627">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1173920544517">
                  <link role="variableDeclaration" targetNodeId="1173920495360" resolveInfo="leftOperation" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1173920548800">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556242967">
                    <link role="conceptDeclaration" targetNodeId="1.1138056022639" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173920542500">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173920670223">
                  <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1173920672241">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1174259125876">
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174259135756">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174259128332">
                  <link role="variableDeclaration" targetNodeId="1173920495360" resolveInfo="leftOperation" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1174259139023">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556243072">
                    <link role="conceptDeclaration" targetNodeId="1.1138056143562" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1174259125878">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174259153727">
                  <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1174259156119">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1174259160509">
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1174259160510">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1174259160511">
                  <link role="variableDeclaration" targetNodeId="1173920495360" resolveInfo="leftOperation" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1174259160512">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556243056">
                    <link role="conceptDeclaration" targetNodeId="1.1138056282393" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1174259160513">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1174259160514">
                  <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1174259160515">
                    <property name="value" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179445193616">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179445193617">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179445193618" />
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179445177264">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1179445171783">
                <link role="variableDeclaration" targetNodeId="1173912653195" resolveInfo="expression" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179445179245" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179445262275">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179445262276">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179445291519">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445293439">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179445281333">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179445283348" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179445270334">
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179445270335">
                <property name="name" value="v" />
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179445270336">
                <link role="variableDeclaration" targetNodeId="1179445193617" resolveInfo="leftType" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179445301972">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179445301973">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179445301974">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445301975">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179445301976">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179445301977" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179445301978">
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179445301979">
                <property name="name" value="v" />
                <link role="concept" targetNodeId="1.1143226024141" />
              </node>
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179445301980">
                <link role="variableDeclaration" targetNodeId="1179445193617" resolveInfo="leftType" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173912782461">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445359219">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1173912653195">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173912653196">
          <link role="concept" targetNodeId="3.1068431790191" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178546097106" />
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1173978587590">
      <property name="name" value="isExpression_appropriateFor_SemanticDowncast" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1173978587591" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1173978587592">
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1173978587593">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1173978587594">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1173978587595">
              <link role="variableDeclaration" targetNodeId="1173978587668" resolveInfo="expression" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsNullOperation" id="1173978587596" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1173978587597">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1173978587598">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1173978587599" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179445477669">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179445477670">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179445477671" />
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179445477672">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1179445477673">
                <link role="variableDeclaration" targetNodeId="1173978587668" resolveInfo="expression" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179445477674" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179445477675">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179445477676">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179445477677">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445477678">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179445477679">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179445477680" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179445477681">
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179445477682">
                <property name="name" value="v" />
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179445477683">
                <link role="variableDeclaration" targetNodeId="1179445477670" resolveInfo="type" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179445477684">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179445477685">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179445477686">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445477687">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179445477688">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179445477689" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179445477690">
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179445477691">
                <property name="name" value="v" />
                <link role="concept" targetNodeId="1.1143226024141" />
              </node>
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179445477692">
                <link role="variableDeclaration" targetNodeId="1179445477670" resolveInfo="type" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179445477693">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1179445477694">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1173978587668">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1173978587669">
          <link role="concept" targetNodeId="3.1068431790191" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178546097084" />
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.PublicVisibility" id="1178550081539" />
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeFactories" id="1171415341604">
    <property name="name" value="SModelLang_factories" />
    <node role="nodeFactory" type="jetbrains.mps.bootstrap.actionsLanguage.NodeFactory" id="1171415364777">
      <property name="description" value="inherits all parameters from 'sampleNode'" />
      <link role="applicableConcept" targetNodeId="1.1171407110247" />
      <node role="setupFunction" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction" id="1171415364778">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1171415364779">
          <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1171415488202">
            <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171415491409">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1171415492490">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.RefConcept_Reference" id="1177556242860">
                  <link role="conceptDeclaration" targetNodeId="1.1138411891628" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_SampleNode" id="1173981303903" />
            </node>
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1171415488204">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1171415520969">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1171415520970">
                  <property name="name" value="parms" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1171415520972">
                    <link role="elementConcept" targetNodeId="1.1144100743722" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171415511575">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1173981368431">
                      <link role="link" targetNodeId="1.1144104376918" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1171415507151">
                      <link role="concept" targetNodeId="1.1138411891628" />
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_SampleNode" id="1171415505259" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachStatement" id="1171415558927">
                <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariable" id="1171415558928">
                  <property name="name" value="parm" />
                </node>
                <node role="inputSequence" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1171415578869">
                  <link role="variableDeclaration" targetNodeId="1171415520970" resolveInfo="parms" />
                </node>
                <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1171415558930">
                  <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1171415589043">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171415595814">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddChildOperation" id="1171415598427">
                        <node role="parameter" type="jetbrains.mps.baseLanguage.ext.collections.lang.ForEachVariableReference" id="1171415601444">
                          <link role="variable" targetNodeId="1171415558928" resolveInfo="parm" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171415590842">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1171415594470">
                          <link role="link" targetNodeId="1.1144104376918" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_NewNode" id="1171415589044" />
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
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1179529749850">
    <property name="package" value="substitute" />
    <property name="name" value="propertyAccess" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1179529852420">
      <property name="description" value="substitute with property-access or concept-property-access operations" />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179529852421">
        <link role="concept" targetNodeId="1.1138056022639" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179529852422">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852423">
            <link role="concept" targetNodeId="14.1071489288299" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179529852424">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852425">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852426">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852427">
                  <property name="name" value="adapters" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179529852428">
                    <link role="classifier" extResolveInfo="8.[Classifier]List" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179529852429">
                      <link role="classifier" extResolveInfo="16.[Classifier]PropertyDeclaration" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1179529852430">
                    <link role="baseMethodDeclaration" extResolveInfo="13.method ([Classifier]ConceptHierarchyScope).([InstanceMethodDeclaration]getPropertyDeclarationsExcludingOverridden() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [PropertyDeclaration]&gt;]))" />
                    <node role="instance" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179529852431">
                      <link role="variableDeclaration" targetNodeId="1179529852520" resolveInfo="hierarhyScope" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852432">
                <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1179529852433">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179529852434">
                    <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                    <link role="classConcept" extResolveInfo="7.[Classifier]BaseAdapter" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852435">
                      <link role="variableDeclaration" targetNodeId="1179529852427" resolveInfo="adapters" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179529852436">
                    <link role="elementConcept" targetNodeId="14.1071489288299" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179529852437">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852438">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852439">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852440">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852441">
                    <link role="concept" targetNodeId="1.1138056022639" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852442">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179529852443">
                      <link role="concept" targetNodeId="1.1138056022639" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179529852444" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179529852445">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852446">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179529852447">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179529852448" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852449">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852450">
                      <link role="link" targetNodeId="1.1138056395725" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852451">
                      <link role="variableDeclaration" targetNodeId="1179529852440" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852452">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852453">
                  <link role="variableDeclaration" targetNodeId="1179529852440" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179529852454">
        <link role="concept" targetNodeId="1.1145994841052" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179529852455">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852456">
            <link role="concept" targetNodeId="14.1105725006687" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179529852457">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852458">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852459">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852460">
                  <property name="name" value="adapters" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179529852461">
                    <link role="classifier" extResolveInfo="8.[Classifier]List" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179529852462">
                      <link role="classifier" extResolveInfo="16.[Classifier]ConceptPropertyDeclaration" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1179529852463">
                    <link role="baseMethodDeclaration" extResolveInfo="13.method ([Classifier]ISearchScope).([InstanceMethodDeclaration]getAdapters((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class, &lt;jetbrains.mps.baseLanguage.types.classifier [Object]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [Object]&gt;]))" />
                    <node role="instance" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179529852464">
                      <link role="variableDeclaration" targetNodeId="1179529852520" resolveInfo="hierarhyScope" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1179529852465">
                      <link role="classifier" extResolveInfo="16.[Classifier]ConceptPropertyDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852466">
                <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1179529852467">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179529852468">
                    <link role="classConcept" extResolveInfo="7.[Classifier]BaseAdapter" />
                    <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852469">
                      <link role="variableDeclaration" targetNodeId="1179529852460" resolveInfo="adapters" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179529852470">
                    <link role="elementConcept" targetNodeId="14.1105725006687" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179529852471">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852472">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852473">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852474">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852475">
                    <link role="concept" targetNodeId="1.1145994841052" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852476">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179529852477">
                      <link role="concept" targetNodeId="1.1145994841052" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179529852478" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179529852479">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852480">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179529852481">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179529852482" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852483">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852484">
                      <link role="link" targetNodeId="1.1145994841055" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852485">
                      <link role="variableDeclaration" targetNodeId="1179529852474" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852486">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852487">
                  <link role="variableDeclaration" targetNodeId="1179529852474" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179529852488">
        <property name="name" value="leftNodeConcept" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179529852489">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852490">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852491">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852492">
                <property name="name" value="leftExpression" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852493">
                  <link role="concept" targetNodeId="3.1068431790191" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852494">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852495">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1179529852496">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1179529852497" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852498">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852499">
                <property name="name" value="leftNodeType" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852500">
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179529852501">
                  <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852502">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179529852503" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852504">
                      <link role="variableDeclaration" targetNodeId="1179529852492" resolveInfo="leftExpression" />
                    </node>
                  </node>
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179529852505">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1138055754698" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179529852506">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852507">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852508">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.ConceptRefExpression" id="1179529852509">
                    <link role="conceptDeclaration" targetNodeId="15.1133920641626" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179529852510">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179529852511" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852512">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852513">
                    <link role="link" targetNodeId="1.1138405853777" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852514">
                    <link role="variableDeclaration" targetNodeId="1179529852499" resolveInfo="leftNodeType" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852515">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852516">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852517">
                  <link role="link" targetNodeId="1.1138405853777" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852518">
                  <link role="variableDeclaration" targetNodeId="1179529852499" resolveInfo="leftNodeType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptType" id="1179529852519" />
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179529852520">
        <property name="name" value="hierarhyScope" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179529852521">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852522">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179529852523">
              <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1179529852524">
                <link role="baseMethodDeclaration" extResolveInfo="13.constructor [Classifier]ConceptHierarchyScope[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractConceptDeclaration]))" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852525">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1179529852526" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179529852527">
                    <link role="variableDeclaration" targetNodeId="1179529852488" resolveInfo="leftNodeConcept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179529852528">
          <link role="classifier" extResolveInfo="13.[Classifier]ConceptHierarchyScope" />
        </node>
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1179529852529">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179529852530">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852531">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852532">
              <property name="name" value="leftExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852533">
                <link role="concept" targetNodeId="3.1068431790191" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852534">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1179529852535">
                  <link role="concept" targetNodeId="1.1138055978872" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1179529852536" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179529852537">
                  <link role="link" targetNodeId="1.1138056667223" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179529852538">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179529852539">
              <property name="name" value="nodeType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179529852540">
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179529852541">
                <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179529852542">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852543">
                    <link role="variableDeclaration" targetNodeId="1179529852532" resolveInfo="leftExpression" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179529852544" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179529852545">
                  <property name="name" value="v1" />
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179529852546">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179529852547">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179529852548" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179529852549">
                <link role="variableDeclaration" targetNodeId="1179529852539" resolveInfo="nodeType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActions" id="1179530017718">
    <property name="package" value="substitute" />
    <property name="name" value="linkAccess" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstituteActionsBuilder" id="1179530205323">
      <property name="description" value="substitute with link-access, linkList-access or concept-link-access operations" />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="1.1138411891628" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179530292729">
        <link role="concept" targetNodeId="1.1138056143562" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179530340303">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179530353123">
            <link role="concept" targetNodeId="14.1071489288298" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179530340305">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530340306">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179530670899">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531445524">
                  <link role="variableDeclaration" targetNodeId="1179531382392" resolveInfo="singularLinks" />
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179530340307">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530340308">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531146815">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531146816">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531146817">
                    <link role="concept" targetNodeId="1.1138056143562" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531110133">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179531115472">
                      <link role="concept" targetNodeId="1.1138056143562" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179531105492" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531152219">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531205161">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179531209568">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531213643" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531156800">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179531187300">
                      <link role="link" targetNodeId="1.1138056516764" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531152220">
                      <link role="variableDeclaration" targetNodeId="1179531146816" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531219917">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531228409">
                  <link role="variableDeclaration" targetNodeId="1179531146816" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179531564171">
        <link role="concept" targetNodeId="1.1171478925269" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179531564172">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531564173">
            <link role="concept" targetNodeId="14.1071489288298" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179531564174">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531564175">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531564176">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531564177">
                  <link role="variableDeclaration" targetNodeId="1179531382392" resolveInfo="singularLinks" />
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179531564178">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531564179">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531564180">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531564181">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531564182">
                    <link role="concept" targetNodeId="1.1171478925269" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531564183">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179531564184">
                      <link role="concept" targetNodeId="1.1171478925269" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179531564185" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531564186">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531564187">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179531564188">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531564189" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531564190">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179531564191">
                      <link role="link" targetNodeId="1.1138056516764" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531564192">
                      <link role="variableDeclaration" targetNodeId="1179531564181" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531564193">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531564194">
                  <link role="variableDeclaration" targetNodeId="1179531564181" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_String" id="1179531666710">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531666711">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531666712">
                <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1179531666713">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179531666714">
                    <property name="value" value="/node" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531666715">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1179531670849">
                      <link role="property" targetNodeId="14.1071599776563" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531666717" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179531167116">
        <link role="concept" targetNodeId="1.1138056282393" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179531220974">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531220975">
            <link role="concept" targetNodeId="14.1071489288298" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179531220976">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531220977">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531220978">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531240311">
                  <link role="variableDeclaration" targetNodeId="1179531467643" resolveInfo="pluralLinks" />
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179531220980">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531220981">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531220982">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531220983">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531220984">
                    <link role="concept" targetNodeId="1.1138056282393" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531220985">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179531220986">
                      <link role="concept" targetNodeId="1.1138056282393" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179531220987" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531220988">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531220989">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179531220990">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531220991" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531220992">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179531276053">
                      <link role="link" targetNodeId="1.1138056546658" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531220994">
                      <link role="variableDeclaration" targetNodeId="1179531220983" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531220995">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531220996">
                  <link role="variableDeclaration" targetNodeId="1179531220983" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179531312789">
        <link role="concept" targetNodeId="1.1168901043992" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179531312790">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531312791">
            <link role="concept" targetNodeId="14.1071489288298" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179531312792">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531312793">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531312794">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531332136">
                  <link role="variableDeclaration" targetNodeId="1179531467643" resolveInfo="pluralLinks" />
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179531312796">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531312797">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531312798">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531312799">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531312800">
                    <link role="concept" targetNodeId="1.1168901043992" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531312801">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179531312802">
                      <link role="concept" targetNodeId="1.1168901043992" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179531312803" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531312804">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531312805">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179531312806">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531312807" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531312808">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179531383959">
                      <link role="link" targetNodeId="1.1138056546658" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531312810">
                      <link role="variableDeclaration" targetNodeId="1179531312799" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531312811">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531312812">
                  <link role="variableDeclaration" targetNodeId="1179531312799" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_String" id="1179531312813">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531312814">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531312815">
                <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1179531312816">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179531312817">
                    <property name="value" value="/list" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531312818">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1179531312819">
                      <link role="property" targetNodeId="14.1071599776563" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531312820" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179531546423">
        <link role="concept" targetNodeId="1.1175618182947" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.ParameterizedSubstituteMenuPart" id="1179531590459">
          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531590460">
            <link role="concept" targetNodeId="14.1105736576531" />
          </node>
          <node role="query" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Query" id="1179531590461">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531590462">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531590463">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531590464">
                  <property name="name" value="adapters" />
                  <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179531590465">
                    <link role="classifier" extResolveInfo="8.[Classifier]List" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179531629464">
                      <link role="classifier" extResolveInfo="16.[Classifier]ConceptLinkDeclaration" />
                    </node>
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1179531590467">
                    <link role="baseMethodDeclaration" extResolveInfo="13.method ([Classifier]ISearchScope).([InstanceMethodDeclaration]getAdapters((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class, &lt;jetbrains.mps.baseLanguage.types.classifier [Object]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [Object]&gt;]))" />
                    <node role="instance" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531590468">
                      <link role="variableDeclaration" targetNodeId="1179530242828" resolveInfo="hierarhyScope" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1179531590469">
                      <link role="classifier" extResolveInfo="16.[Classifier]ConceptLinkDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531590470">
                <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1179531590471">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179531590472">
                    <link role="classConcept" extResolveInfo="7.[Classifier]BaseAdapter" />
                    <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531590473">
                      <link role="variableDeclaration" targetNodeId="1179531590464" resolveInfo="adapters" />
                    </node>
                  </node>
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179531590474">
                    <link role="elementConcept" targetNodeId="14.1105736576531" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_ParameterizedSubstitute_Handler" id="1179531590475">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531590476">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531590477">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531590478">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179531590479">
                    <link role="concept" targetNodeId="1.1175618182947" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531590480">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179531590481">
                      <link role="concept" targetNodeId="1.1175618182947" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179531590482" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531590483">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531590484">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179531590485">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parameterObject" id="1179531590486" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531590487">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179531735266">
                      <link role="link" targetNodeId="1.1175618223511" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531590489">
                      <link role="variableDeclaration" targetNodeId="1179531590478" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531590490">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531590491">
                  <link role="variableDeclaration" targetNodeId="1179531590478" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179530242796">
        <property name="name" value="leftNodeConcept" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179530242797">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530242798">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179530242799">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179530242800">
                <property name="name" value="leftExpression" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179530242801">
                  <link role="concept" targetNodeId="3.1068431790191" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530242802">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179530242803">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1179530242804">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1179530242805" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179530242806">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179530242807">
                <property name="name" value="leftNodeType" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179530242808">
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179530242809">
                  <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530242810">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179530242811" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530242812">
                      <link role="variableDeclaration" targetNodeId="1179530242800" resolveInfo="leftExpression" />
                    </node>
                  </node>
                  <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179530242813">
                    <property name="name" value="v" />
                    <link role="concept" targetNodeId="1.1138055754698" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1179530242814">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1179530242815">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179530242816">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.ConceptRefExpression" id="1179530242817">
                    <link role="conceptDeclaration" targetNodeId="15.1133920641626" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179530242818">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179530242819" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530242820">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179530242821">
                    <link role="link" targetNodeId="1.1138405853777" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530242822">
                    <link role="variableDeclaration" targetNodeId="1179530242807" resolveInfo="leftNodeType" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179530242823">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530242824">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179530242825">
                  <link role="link" targetNodeId="1.1138405853777" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530242826">
                  <link role="variableDeclaration" targetNodeId="1179530242807" resolveInfo="leftNodeType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptType" id="1179530242827" />
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179530242828">
        <property name="name" value="hierarhyScope" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179530242829">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530242830">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179530242831">
              <node role="expression" type="jetbrains.mps.baseLanguage.NewExpression" id="1179530242832">
                <link role="baseMethodDeclaration" extResolveInfo="13.constructor [Classifier]ConceptHierarchyScope[ConstructorDeclaration] ((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [AbstractConceptDeclaration]))" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530242833">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1179530242834" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179530242835">
                    <link role="variableDeclaration" targetNodeId="1179530242796" resolveInfo="leftNodeConcept" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179530242836">
          <link role="classifier" extResolveInfo="13.[Classifier]ConceptHierarchyScope" />
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179530480710">
        <property name="name" value="links" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179530480711">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530480712">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179530537084">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179530537085">
                <property name="name" value="adapters" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179530537086">
                  <link role="classifier" extResolveInfo="8.[Classifier]List" />
                  <node role="parameter" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179530603538">
                    <link role="classifier" extResolveInfo="16.[Classifier]LinkDeclaration" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1179530537088">
                  <link role="baseMethodDeclaration" extResolveInfo="13.method ([Classifier]ConceptHierarchyScope).([InstanceMethodDeclaration]getLinkDeclarationsExcludingOverridden() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration]&gt;]))" />
                  <node role="instance" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179530537089">
                    <link role="variableDeclaration" targetNodeId="1179530242828" resolveInfo="hierarhyScope" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179530537090">
              <node role="expression" type="jetbrains.mps.baseLanguage.CastExpression" id="1179530537091">
                <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179530537092">
                  <link role="classConcept" extResolveInfo="7.[Classifier]BaseAdapter" />
                  <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]BaseAdapter).([StaticMethodDeclaration]toNodes((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;? extends jetbrains.mps.baseLanguage.types.classifier [INodeAdapter]&gt;])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [List, &lt;jetbrains.mps.baseLanguage.types.classifier [SNode]&gt;]))" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530537093">
                    <link role="variableDeclaration" targetNodeId="1179530537085" resolveInfo="adapters" />
                  </node>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179530537094">
                  <link role="elementConcept" targetNodeId="14.1071489288298" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179530490873">
          <link role="elementConcept" targetNodeId="14.1071489288298" />
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179531382392">
        <property name="name" value="singularLinks" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179531382393">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531382394">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531430811">
              <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1179531430812">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1179531430813">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531430814">
                    <link role="variableDeclaration" targetNodeId="1179530480710" resolveInfo="links" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1179531430815">
                    <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1179531430816">
                      <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1179531430817">
                        <property name="name" value="it" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531430818">
                        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531430819">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531430820">
                            <property name="name" value="cardinality" />
                            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179531430821">
                              <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179531430822">
                              <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]SModelUtil_new).([StaticMethodDeclaration]getGenuineLinkSourceCardinality((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                              <link role="classConcept" extResolveInfo="7.[Classifier]SModelUtil_new" />
                              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531430823">
                                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1179531430824" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1179531430825">
                                  <link role="closureParameter" targetNodeId="1179531430817" resolveInfo="it" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531430826">
                          <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1179531430827">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179531430828">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531430829">
                                <link role="variableDeclaration" targetNodeId="1179531430820" resolveInfo="cardinality" />
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1179531430830">
                                <link role="variableDeclaration" extResolveInfo="16.static field ([Classifier]Cardinality).([StaticFieldDeclaration]_1 : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                                <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                              </node>
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179531430831">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531430832">
                                <link role="variableDeclaration" targetNodeId="1179531430820" resolveInfo="cardinality" />
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1179531430833">
                                <link role="variableDeclaration" extResolveInfo="16.static field ([Classifier]Cardinality).([StaticFieldDeclaration]_0_1 : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                                <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1179531430834" />
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179531387293">
          <link role="elementConcept" targetNodeId="14.1071489288298" />
        </node>
      </node>
      <node role="variable" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableDeclaration" id="1179531467643">
        <property name="name" value="pluralLinks" />
        <node role="initializerBlock" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_SubstituteVariableInitializer" id="1179531467644">
          <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531467645">
            <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179531467646">
              <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1179531467647">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.SequenceOperationExpression" id="1179531467648">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference" id="1179531467649">
                    <link role="variableDeclaration" targetNodeId="1179530480710" resolveInfo="links" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereOperation" id="1179531467650">
                    <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.WhereBlock" id="1179531467651">
                      <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.DefaultInputElement" id="1179531467652">
                        <property name="name" value="it" />
                      </node>
                      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179531467653">
                        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179531467654">
                          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179531467655">
                            <property name="name" value="cardinality" />
                            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1179531467656">
                              <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                            </node>
                            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179531467657">
                              <link role="classConcept" extResolveInfo="7.[Classifier]SModelUtil_new" />
                              <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]SModelUtil_new).([StaticMethodDeclaration]getGenuineLinkSourceCardinality((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179531467658">
                                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1179531467659" />
                                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ClosureParameterReference" id="1179531467660">
                                  <link role="closureParameter" targetNodeId="1179531467652" resolveInfo="it" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179531467661">
                          <node role="expression" type="jetbrains.mps.baseLanguage.OrExpression" id="1179531467662">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179531467663">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531467664">
                                <link role="variableDeclaration" targetNodeId="1179531467655" resolveInfo="cardinality" />
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1179531467665">
                                <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                                <link role="variableDeclaration" extResolveInfo="16.static field ([Classifier]Cardinality).([StaticFieldDeclaration]_0_n : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                              </node>
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1179531467666">
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179531467667">
                                <link role="variableDeclaration" targetNodeId="1179531467655" resolveInfo="cardinality" />
                              </node>
                              <node role="rightExpression" type="jetbrains.mps.baseLanguage.StaticFieldReference" id="1179531467668">
                                <link role="classifier" extResolveInfo="16.[Classifier]Cardinality" />
                                <link role="variableDeclaration" extResolveInfo="16.static field ([Classifier]Cardinality).([StaticFieldDeclaration]_1_n : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Cardinality]))" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.ToListOperation" id="1179531467669" />
              </node>
            </node>
          </node>
        </node>
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeListType" id="1179531467670">
          <link role="elementConcept" targetNodeId="14.1071489288298" />
        </node>
      </node>
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.NodeSubstitutePreconditionFunction" id="1179530205324">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179530205325">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179530205326">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179530205327">
              <property name="name" value="leftExpression" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179530205328">
                <link role="concept" targetNodeId="3.1068431790191" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530205329">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1179530205330">
                  <link role="concept" targetNodeId="1.1138055978872" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_parentNode" id="1179530205331" />
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179530205332">
                  <link role="link" targetNodeId="1.1138056667223" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179530205333">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179530205334">
              <property name="name" value="nodeType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179530205335">
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179530205336">
                <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179530205337">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530205338">
                    <link role="variableDeclaration" targetNodeId="1179530205327" resolveInfo="leftExpression" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179530205339" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179530205340">
                  <property name="name" value="v1" />
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179530205341">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179530205342">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179530205343" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179530205344">
                <link role="variableDeclaration" targetNodeId="1179530205334" resolveInfo="nodeType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActions" id="1179535152689">
    <property name="package" value="rightTransform" />
    <property name="name" value="expression" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1179535189082">
      <property name="description" value="&lt;expr&gt; --&gt; &lt;expr&gt;.&lt;op&gt; " />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1179535189083">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189084">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535189085">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179535189086">
              <link role="classConcept" targetNodeId="1154643386654" resolveInfo="ActionUtil_smodel" />
              <link role="baseMethodDeclaration" targetNodeId="1173912496513" resolveInfo="isExpression_appropriateFor_ourOperations" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535189087" />
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179535189088">
        <link role="concept" targetNodeId="1.1138055978872" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.SimpleRightTransformMenuPart" id="1179535189089">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_Handler" id="1179535189090">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189091">
              <node role="statement" type="jetbrains.mps.baseLanguage.RemarkStatement" id="1179535189092">
                <property name="value" value="replace expression with snode-operation-expression" />
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179535189093">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179535189094">
                  <property name="name" value="expression" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179535189095">
                    <link role="concept" targetNodeId="3.1068431790191" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535189096" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179535189097">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179535189098">
                  <property name="name" value="opExpression" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179535189099">
                    <link role="concept" targetNodeId="1.1138055978872" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189100">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.sharedConcepts.ConceptFunctionParameter_model" id="1179535189101" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Model_CreateNewNodeOperation" id="1179535189102">
                      <link role="concept" targetNodeId="1.1138055978872" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189103">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189104">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189105">
                    <link role="variableDeclaration" targetNodeId="1179535189094" resolveInfo="expression" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1179535189106">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189107">
                      <link role="variableDeclaration" targetNodeId="1179535189098" resolveInfo="opExpression" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189108">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189109">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189110">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189111">
                      <link role="variableDeclaration" targetNodeId="1179535189098" resolveInfo="opExpression" />
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179535189112">
                      <link role="link" targetNodeId="1.1138056667223" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179535189113">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189114">
                      <link role="variableDeclaration" targetNodeId="1179535189094" resolveInfo="expression" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535189115">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189116">
                  <link role="variableDeclaration" targetNodeId="1179535189098" resolveInfo="opExpression" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535189117">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189118">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189119">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535189120">
                  <property name="value" value="." />
                </node>
              </node>
            </node>
          </node>
          <node role="descriptionText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535189121">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189122">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189123">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535189124">
                  <property name="value" value="smodel language operation" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1179535189125">
      <property name="description" value="node type cast: &lt;expr&gt; --&gt; &lt;expr&gt;:&lt;concept&gt;" />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1179535189126">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189127">
          <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179535189128">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179535189129">
              <property name="name" value="nodeType" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179535189130">
                <link role="concept" targetNodeId="1.1138055754698" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.helgins.CoerceStrongExpression" id="1179535189131">
                <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189132">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535189133" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.helgins.Node_TypeOperation" id="1179535189134" />
                </node>
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.ConceptReference" id="1179535189135">
                  <property name="name" value="v1" />
                  <link role="concept" targetNodeId="1.1138055754698" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535189136">
            <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1179535189137">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1179535189138" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189139">
                <link role="variableDeclaration" targetNodeId="1179535189129" resolveInfo="nodeType" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179535189140">
        <link role="concept" targetNodeId="1.1140137987495" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.SimpleRightTransformMenuPart" id="1179535189141">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_Handler" id="1179535189142">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189143">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179535189144">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179535189145">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179535189146">
                    <link role="concept" targetNodeId="1.1140137987495" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189147">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1179535189148">
                      <link role="concept" targetNodeId="1.1140137987495" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535189149" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189150">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189151">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179535189152">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535189153" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535189154">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179535189155">
                      <link role="link" targetNodeId="1.1140138123956" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189156">
                      <link role="variableDeclaration" targetNodeId="1179535189145" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535189157">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535189158">
                  <link role="variableDeclaration" targetNodeId="1179535189145" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535189159">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189160">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189161">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535189162">
                  <property name="value" value=":" />
                </node>
              </node>
            </node>
          </node>
          <node role="descriptionText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535189163">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535189164">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535189165">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535189166">
                  <property name="value" value="node type cast" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstituteActionsBuilder" id="1179535648214">
      <property name="description" value="semantic downcast: &lt;expr&gt; --&gt; &lt;expr&gt;/" />
      <property name="useNewActions" value="true" />
      <link role="applicableConcept" targetNodeId="3.1068431790191" />
      <node role="precondition" type="jetbrains.mps.bootstrap.actionsLanguage.RTransformHintSubstitutePreconditionFunction" id="1179535648215">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535648216">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535648217">
            <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179535648218">
              <link role="classConcept" targetNodeId="1154643386654" resolveInfo="ActionUtil_smodel" />
              <link role="baseMethodDeclaration" targetNodeId="1173978587590" resolveInfo="isExpression_appropriateFor_SemanticDowncast" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535648219" />
            </node>
          </node>
        </node>
      </node>
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.AddMenuPart" id="1179535648220">
        <link role="concept" targetNodeId="1.1145404486709" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.SimpleRightTransformMenuPart" id="1179535648221">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_Handler" id="1179535648222">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535648223">
              <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1179535648224">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1179535648225">
                  <property name="name" value="newNode" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1179535648226">
                    <link role="concept" targetNodeId="1.1145404486709" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535648227">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithNewOperation" id="1179535648228">
                      <link role="concept" targetNodeId="1.1145404486709" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535648229" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535648230">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535648231">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Link_SetTargetOperation" id="1179535648232">
                    <node role="parameter" type="jetbrains.mps.bootstrap.actionsLanguage.ConceptFunctionParameter_sourceNode" id="1179535648233" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179535648234">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1179535648235">
                      <link role="link" targetNodeId="1.1145404616321" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535648236">
                      <link role="variableDeclaration" targetNodeId="1179535648225" resolveInfo="newNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179535648237">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1179535648238">
                  <link role="variableDeclaration" targetNodeId="1179535648225" resolveInfo="newNode" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535648239">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535648240">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535648241">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535648242">
                  <property name="value" value="/" />
                </node>
              </node>
            </node>
          </node>
          <node role="descriptionText" type="jetbrains.mps.bootstrap.actionsLanguage.QueryFunction_RightTransform_String" id="1179535648243">
            <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1179535648244">
              <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1179535648245">
                <node role="expression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1179535648246">
                  <property name="value" value="downcast to lower semantic level" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

