<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895902ff(jetbrains.mps.lang.smodel.intentions)">
  <persistence version="7" />
  <language namespace="d7a92d38-f7db-40d0-8431-763b0c3c9f20(jetbrains.mps.lang.intentions)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="6eoo" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <import index="yvou" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" version="-1" />
  <import index="yvjb" modelUID="r:00000000-0000-4000-0000-011c89590353(jetbrains.mps.lang.intentions.structure)" version="8" implicit="yes" />
  <import index="yvo4" modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" implicit="yes" />
  <import index="yvox" modelUID="r:00000000-0000-4000-0000-011c895902ff(jetbrains.mps.lang.smodel.intentions)" version="-1" implicit="yes" />
  <roots>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1193745200272">
      <property name="name" nameId="yvnu.1169194664001:0" value="AddSNodeCastStatement" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvor.1068580123159:3" resolveInfo="IfStatement" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1203704393457">
      <property name="name" nameId="yvnu.1169194664001:0" value="ReplaceConceptIsWithConceptEquals" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.parameter" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.1144101972840:16" resolveInfo="OperationParm_Concept" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1205354609722">
      <property name="name" nameId="yvnu.1169194664001:0" value="Replace_ListType_withNodeListType" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvix.1151688443754:7" resolveInfo="ListType" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1206998294783">
      <property name="name" nameId="yvnu.1169194664001:0" value="AddOperationParameter" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.1138411891628:16" resolveInfo="SNodeOperation" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1224687584077">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertPropertySetToAssignment" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.1138661924179:16" resolveInfo="Property_SetOperation" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1224751635787">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertLinkSetToAssignment" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.1140725362528:16" resolveInfo="Link_SetTargetOperation" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="1238684430905">
      <property name="name" nameId="yvnu.1169194664001:0" value="ChangeAsCast" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.1140137987495:16" resolveInfo="SNodeTypeCastExpression" />
    </node>
    <node type="yvjb.IntentionDeclaration" typeId="yvjb.1192794744107:8" id="4726561250374329612">
      <property name="name" nameId="yvnu.1169194664001:0" value="ConvertConceptPropertySetToAssignment" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="operation.concept" />
      <link role="forConcept" roleId="yvjb.2522969319638198290:8" targetNodeId="yvim.2648652578096473304:16" resolveInfo="ConceptProperty_SetOperation" />
    </node>
  </roots>
  <root id="1193745200272">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1193745200273">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745200274">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745250982">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1193745250983">
            <property name="value" nameId="yvor.1070475926801:3" value="Insert Cast Variable Declaration" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" roleId="yvjb.2522969319638093995:8" type="yvjb.IsApplicableBlock" typeId="yvjb.1192795771125:8" id="1193745200275">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745200276">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745412080">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745412081">
            <property name="name" nameId="yvnu.1169194664001:0" value="isApplicable" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="1193745412082" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1193745686548">
              <property name="value" nameId="yvor.1068580123138:3" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1193745551495">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745551496">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745594019">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745594020">
                <property name="name" nameId="yvnu.1169194664001:0" value="dotExpression" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745594021">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745577187">
                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218459737">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1193745569040" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745570907">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068580123160:3" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1193745597044">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745597045">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745630449">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745630450">
                    <property name="name" nameId="yvnu.1169194664001:0" value="iioo" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745630451">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvim.1139621453865:16" resolveInfo="Node_IsInstanceOfOperation" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745621795">
                      <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvim.1139621453865:16" resolveInfo="Node_IsInstanceOfOperation" />
                      <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218494913">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745616593">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745594020" resolveInfo="oe" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1204218498315">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027833540:3" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1193745634477">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745634478">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745672183">
                      <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745672184">
                        <property name="name" nameId="yvnu.1169194664001:0" value="rc" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745672185">
                          <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
                        </node>
                        <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745662900">
                          <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
                          <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218510779">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745659461">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745630450" resolveInfo="iioo" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745661182">
                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177027386292:16" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745694398">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1193745694904">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218545578">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218515839">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745697177">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745672184" resolveInfo="rc" />
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745700963">
                              <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177026940964:16" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1204218547280" />
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745694399">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745412081" resolveInfo="isApplicable" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218505465">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218503893">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745635872">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745630450" resolveInfo="iioo" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745644501">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177027386292:16" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1193745651951">
                      <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1193745655225">
                        <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218475089">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218468110">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745598514">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745594020" resolveInfo="oe" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1204218473345">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027833540:3" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1193745607136">
                  <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1193745612979">
                    <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvim.1139621453865:16" resolveInfo="Node_IsInstanceOfOperation" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218434914">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218440177">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1193745563198" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745563197">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068580123160:3" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1193745563194">
              <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1204218424327">
                <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745436056">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745436057">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745412081" resolveInfo="isApplicable" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1193745200277">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745200278">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745326615">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745326616">
            <property name="name" nameId="yvnu.1169194664001:0" value="castVariable" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745326617">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068581242864:3" resolveInfo="LocalVariableDeclarationStatement" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1193745326618">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1193745326619">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745326620">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068581242864:3" resolveInfo="LocalVariableDeclarationStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745326631">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745326632">
            <property name="name" nameId="yvnu.1169194664001:0" value="de" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745326633">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745326634">
              <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
              <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218534817">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1193745326638" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745326636">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068580123160:3" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745830776">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745830777">
            <property name="name" nameId="yvnu.1169194664001:0" value="conceptDeclaration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745830778">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1169125787135:0" resolveInfo="AbstractConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218597505">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745815706">
                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218592257">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1193745798528">
                    <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvim.1139621453865:16" resolveInfo="Node_IsInstanceOfOperation" />
                    <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218584695">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745792568">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326632" resolveInfo="oe" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1204218589330">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027833540:3" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745814526">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177027386292:16" />
                  </node>
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745824628">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177026940964:16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193745326639">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193745326640">
            <property name="name" nameId="yvnu.1169194664001:0" value="declaration" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193745326641">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068581242863:3" resolveInfo="LocalVariableDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218604966">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1210717128220">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326616" resolveInfo="castVariable" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745326643">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068581242865:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745326645">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218612480">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218611365">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218610028">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218608830">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745326655">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326640" resolveInfo="declaration" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745326654">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.5680397130376446158:3" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetNewChildOperation" typeId="yvim.1138757581985:16" id="1193745747855">
                  <link role="concept" roleId="yvim.1139880128956:16" targetNodeId="yvim.1138055754698:16" resolveInfo="SNodeType" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745760022">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1138405853777:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1193745776424">
              <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745830779">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745830777" resolveInfo="conceptDeclaration" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745326666">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648562">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648552">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745326674">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326640" resolveInfo="declaration" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1193745867383">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_SetOperation" typeId="yvim.1138661924179:16" id="1193745326668">
              <node role="value" roleId="yvim.1138662048170:16" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1193747099974">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="6eoo.~NameUtil%ddecapitalize(java%dlang%dString)%cjava%dlang%dString" resolveInfo="decapitalize" />
                <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="6eoo.~NameUtil" resolveInfo="NameUtil" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648587">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193747107305">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745830777" resolveInfo="conceptDeclaration" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1193747109507">
                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193746216327">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193746216328">
            <property name="name" nameId="yvnu.1169194664001:0" value="expression" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193746216329">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648525">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193745949448">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326632" resolveInfo="oe" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1204218656088">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027771414:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1193745945986">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745945987">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193746239555">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193746239556">
                <property name="name" nameId="yvnu.1169194664001:0" value="nodeTypeCastExpression" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193746239557">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvim.1140137987495:16" resolveInfo="SNodeTypeCastExpression" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648632">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648567">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746255110">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326640" resolveInfo="declaration" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746258328">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068431790190:3" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetNewChildOperation" typeId="yvim.1138757581985:16" id="1193746263908">
                    <link role="concept" roleId="yvim.1139880128956:16" targetNodeId="yvim.1140137987495:16" resolveInfo="SNodeTypeCastExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193746302440">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648537">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648642">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746302441">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746239556" resolveInfo="nodeTypeCastExpression" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746305252">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1140138128738:16" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1193746307648">
                  <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746313683">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745830777" resolveInfo="conceptDeclaration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193746316965">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648648">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648542">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746316966">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746239556" resolveInfo="nodeTypeCastExpression" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746323210">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1140138123956:16" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1193746342910">
                  <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648557">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746345529">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746216328" resolveInfo="expression" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1193746412152" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648597">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648637">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746216330">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746216328" resolveInfo="expression" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvo4.Node_TypeOperation" typeId="yvo4.1176544042499:3" id="1193745975662" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1193745978972">
              <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1193745982227">
                <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvim.1138055754698:16" resolveInfo="SNodeType" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1193745986004">
            <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1193745986005">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1193746356201">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1193746356202">
                  <property name="name" nameId="yvnu.1169194664001:0" value="castExpression" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1193746356203">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1070534934090:3" resolveInfo="CastExpression" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648531">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648613">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746356208">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326640" resolveInfo="declaration" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746356207">
                        <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068431790190:3" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetNewChildOperation" typeId="yvim.1138757581985:16" id="1193746356205">
                      <link role="concept" roleId="yvim.1139880128956:16" targetNodeId="yvor.1070534934090:3" resolveInfo="CastExpression" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193746356210">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648582">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648577">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746356220">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746356202" resolveInfo="castExpression" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746356219">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1070534934091:3" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1193746356212">
                    <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648608">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648592">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746376079">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326640" resolveInfo="declaration" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746377898">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.5680397130376446158:3" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1193746379382" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193746356221">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648603">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648618">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746356231">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746356202" resolveInfo="castExpression" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193746356230">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1070534934092:3" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Link_SetTargetOperation" typeId="yvim.1140725362528:16" id="1193746356223">
                    <node role="linkTarget" roleId="yvim.1140725362529:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648623">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1193746416154">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193746216328" resolveInfo="expression" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_CopyOperation" typeId="yvim.1144146199828:16" id="1193746417485" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1193745326706">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648547">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648572">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204218648627">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1193745326714" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1193745326713">
                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068580123161:3" />
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1193745326711">
                <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1068581517665:3" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddFirstElementOperation" typeId="yvix.1227022159410:7" id="1810715974610193546">
              <node role="argument" roleId="yvix.1227022622978:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1210717283438">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1193745326616" resolveInfo="castVariable" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1203704393457">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1203704393458">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1203704393459">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1203705008814">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1203705008815">
            <property name="value" nameId="yvor.1070475926801:3" value="Replace 'concept=' with Concept List" />
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" roleId="yvjb.2522969319638093995:8" type="yvjb.IsApplicableBlock" typeId="yvjb.1192795771125:8" id="1203704393460">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1203704393461">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1203705028488">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126447800">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126439515">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1213126437935" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213126444596">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1207343664468:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1213126451459">
              <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1213126456398">
                <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1203704393462">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1203704393463">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1203705048412">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1203705048413">
            <property name="name" nameId="yvnu.1169194664001:0" value="conceptList" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1203705048414">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvim.1154546920561:16" resolveInfo="OperationParm_ConceptList" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1203705130207">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1203705130208">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1203705130209">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvim.1154546920561:16" resolveInfo="OperationParm_ConceptList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213126636995">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1213126652345">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126657535">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1213126657536">
                <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvim.1177026924588:16" resolveInfo="RefConcept_Reference" />
                <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126657537">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1213126657538" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213126657539">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1207343664468:16" />
                  </node>
                </node>
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213126657540">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1177026940964:16" />
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126647098">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126641735">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213126638497">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213126636996">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1203705048413" resolveInfo="conceptList" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1213126640547">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvim.1154546920563:16" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1213126642738" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1213126650462">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1154546997487:16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1203705289613">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203705290553">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1203705289614" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1203705293071">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1203705299951">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1203705048413" resolveInfo="listNode" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1205354609722">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1205354609723">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1205354609724">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1205354609725">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1205354609726">
            <property name="value" nameId="yvor.1070475926801:3" value="Replace with 'nlist &lt; &gt;'" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1205354609727">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1205354609728">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1205354609729">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1205354609730">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1205354609731" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithNewOperation" typeId="yvim.1139867745658:16" id="1205354609732">
              <link role="concept" roleId="yvim.1139867957129:16" targetNodeId="yvim.1145383075378:16" resolveInfo="SNodeListType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" roleId="yvjb.2522969319638093995:8" type="yvjb.IsApplicableBlock" typeId="yvjb.1192795771125:8" id="1205354609733">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1205354609734">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1205354609735">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1205354609736">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1205354609737">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1205354609738" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1205354655977">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvix.1151688676805:7" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="1205354609740">
              <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="1205354609741">
                <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvim.1138055754698:16" resolveInfo="SNodeType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1206998294783">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1206998294784">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998294785">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1206998439635">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1206998439636">
            <property name="value" nameId="yvor.1070475926801:3" value="Add Parameter(s)" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1206998294786">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998294787">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1206998604708">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1206998604709">
            <property name="name" nameId="yvnu.1169194664001:0" value="applicableParms" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1206998604710">
              <link role="elementConcept" roleId="yvim.1145383142433:16" targetNodeId="yvnr.1071489090640:0" resolveInfo="ConceptDeclaration" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998604711">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptLinkAccess" typeId="yvim.1175618182947:16" id="1206998604712">
                <link role="conceptLinkDeclaration" roleId="yvim.1175618223511:16" targetNodeId="yvim.1144102537873:16" resolveInfo="applicableParameter" />
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1206998604713" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1206998615215">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998615216">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1206998638855">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998643204">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998640623">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1206998638856" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1206998642016">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvim.1144104376918:16" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1810715974610193497">
                  <node role="argument" roleId="yvix.1160612519549:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998657885">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1206998694250">
                      <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1206998694251">
                        <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998694252">
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1206998694253" />
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1206998694254">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1206998604709" resolveInfo="applicableParms" />
                          </node>
                        </node>
                        <node role="type" roleId="yvor.1070534934091:3" type="yvim.SConceptType" typeId="yvim.1172420572800:16" id="1206998698101">
                          <link role="conceptDeclaraton" roleId="yvim.1180481110358:16" targetNodeId="yvim.1144100743722:16" resolveInfo="AbstractOperationParameter" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_NewInstance" typeId="yvim.1181949435690:16" id="1206998659622" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="1206998632021">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1206998634369">
              <property name="value" nameId="yvor.1068580320021:3" value="1" />
            </node>
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998622908">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1206998620907">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1206998604709" resolveInfo="applicableParms" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1206998625129" />
            </node>
          </node>
          <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1206998710513">
            <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998710514">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1206998578166">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998721299">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998579418">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1206998578167" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1206998581108">
                      <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvim.1144104376918:16" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.LinkList_AddNewChildOperation" typeId="yvim.1139184414036:16" id="1206998727553" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableFunction" roleId="yvjb.2522969319638093995:8" type="yvjb.IsApplicableBlock" typeId="yvjb.1192795771125:8" id="1206998454887">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998454888">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1206998467643">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998487369">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998476897">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1206998472381" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1206998485415">
                <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvim.1144104376918:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsEmptyOperation" typeId="yvix.1165530316231:7" id="1206998489058" />
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1206998467645">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1206998491278">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998503737">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1206998495656">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1206998494593" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SConceptLinkAccess" typeId="yvim.1175618182947:16" id="1206998500924">
                    <link role="conceptLinkDeclaration" roleId="yvim.1175618223511:16" targetNodeId="yvim.1144102537873:16" resolveInfo="applicableParameter" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsNotEmptyOperation" typeId="yvix.1176501494711:7" id="1206998505021" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1206998510398">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1206998512509">
            <property name="value" nameId="yvor.1068580123138:3" value="false" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1224687584077">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1224687584078">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224687584079">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687598099">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1224687600244">
            <property name="value" nameId="yvor.1070475926801:3" value="Convert to Assignment" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1224687584080">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224687584081">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224687624710">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224687624711">
            <property name="name" nameId="yvnu.1169194664001:0" value="lValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224687624712">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687629998">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224687629935" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1224687632079">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877410070" resolveInfo="getOperand" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224687794886">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224687794887">
            <property name="name" nameId="yvnu.1169194664001:0" value="rValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224687794888">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687799001">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224687798953" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224687800082">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1138662048170:16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687802037">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687803293">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687802086">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224687802038" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224687802839">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1138662048170:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="1228343711111" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224687770055">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224687770056">
            <property name="name" nameId="yvnu.1169194664001:0" value="dotExpr" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224687770057">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687770058">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224687770059" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1224687770060">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1224687669172" resolveInfo="getDotExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687775801">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687779480">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687776116">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687775802">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687770056" resolveInfo="dotExpr" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224687779198">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027771414:3" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="1228343710951" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224687610605">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224687610606">
            <property name="name" nameId="yvnu.1169194664001:0" value="assignment" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224687610607">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1224687616140">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1224687616141">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224687616142">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687621285">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1224687785817">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687786648">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687624711" resolveInfo="lValue" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687781859">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687621286">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687610606" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224687784410">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886295:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687806719">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1224687810022">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687808159">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687806720">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687610606" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224687809209">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886297:3" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687811479">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687794887" resolveInfo="rValue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224687817591">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224687817828">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687817592">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687770056" resolveInfo="dotExpr" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1224687818878">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224687821208">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224687610606" resolveInfo="assignment" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1224751635787">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1224751635788">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224751635789">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751681314">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1224751681315">
            <property name="value" nameId="yvor.1070475926801:3" value="Convert to Assignment" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1224751635790">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1224751635791">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224751695536">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224751695537">
            <property name="name" nameId="yvnu.1169194664001:0" value="lValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224751695538">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751705963">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224751705696" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1224751733925">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877410070" resolveInfo="getOperand" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224751741302">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224751741303">
            <property name="name" nameId="yvnu.1169194664001:0" value="rValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224751741304">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751745135">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224751745072" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224751747139">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1140725362529:16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751762976">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751764607">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751763056">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224751762977" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224751764074">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.1140725362529:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="1228343710710" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224751802832">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224751802833">
            <property name="name" nameId="yvnu.1169194664001:0" value="dotExpression" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224751802834">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751802835">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1224751802836" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="1224751802837">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1224687669172" resolveInfo="getDotExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751773205">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751786764">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751775430">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751802854">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751802833" resolveInfo="dotExpression" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224751785997">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027771414:3" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="1228343710918" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1224751808496">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1224751808497">
            <property name="name" nameId="yvnu.1169194664001:0" value="assignment" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224751808498">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1224751812078">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="1224751812079">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1224751812080">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751815410">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1224751818307">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751819232">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751695537" resolveInfo="lValue" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751816006">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751815411">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751808497" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224751817353">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886295:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751821672">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1224751905817">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751822064">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751821673">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751808497" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1224751823911">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886297:3" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751828480">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751741303" resolveInfo="rValue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1224751832607">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1224751833234">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751832608">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751802833" resolveInfo="dotExpression" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="1224751834972">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1224751836505">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1224751808497" resolveInfo="assignment" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1238684430905">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="1238684430906">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238684430907">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1238684438567">
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1238684439336">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238684439242" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1238684440559">
              <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvim.1238684351431:16" resolveInfo="asCast" />
            </node>
          </node>
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238684438569">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1238684441873">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1238684442312">
                <property name="value" nameId="yvor.1070475926801:3" value="Convert to Regular Cast" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1238684449204">
            <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238684449205">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1238684450300">
                <node role="expression" roleId="yvor.1068581517676:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1238684450677">
                  <property name="value" nameId="yvor.1070475926801:3" value="Convert to 'as' Cast" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="1238684430908">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1238684430909">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1238684464944">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1238684467045">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1238684469423">
              <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1238684470191">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238684470128" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1238684470727">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvim.1238684351431:16" resolveInfo="asCast" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1238684465008">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="1238684464945" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1238684466590">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvim.1238684351431:16" resolveInfo="asCast" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="4726561250374329612">
    <node role="descriptionFunction" roleId="yvjb.2522969319638093993:8" type="yvjb.DescriptionBlock" typeId="yvjb.1192794782375:8" id="4726561250374329613">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4726561250374329614">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329634">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4726561250374329635">
            <property name="value" nameId="yvor.1070475926801:3" value="Convert to assignment" />
          </node>
        </node>
      </node>
    </node>
    <node role="executeFunction" roleId="yvjb.2522969319638198291:8" type="yvjb.ExecuteBlock" typeId="yvjb.1192795911897:8" id="4726561250374329615">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4726561250374329616">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4726561250374329636">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4726561250374329637">
            <property name="name" nameId="yvnu.1169194664001:0" value="lValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4726561250374329638">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329639">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="4726561250374329640" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="4726561250374329641">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1213877410070" resolveInfo="getOperand" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4726561250374329642">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4726561250374329643">
            <property name="name" nameId="yvnu.1169194664001:0" value="rValue" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4726561250374329644">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068431790191:3" resolveInfo="Expression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329645">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="4726561250374329646" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4726561250374329691">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.2648652578096473305:16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329648">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329649">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329650">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="4726561250374329651" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4726561250374329692">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvim.2648652578096473305:16" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="4726561250374329653" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4726561250374329654">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4726561250374329655">
            <property name="name" nameId="yvnu.1169194664001:0" value="dotExpr" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4726561250374329656">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1197027756228:3" resolveInfo="DotExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329657">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjb.ConceptFunctionParameter_node" typeId="yvjb.1192796902958:8" id="4726561250374329658" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="4726561250374329659">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvou.1224687669172" resolveInfo="getDotExpression" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329660">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329661">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329662">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329663">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329655" resolveInfo="dotExpr" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4726561250374329664">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1197027771414:3" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DetachOperation" typeId="yvim.1228341669568:16" id="4726561250374329665" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4726561250374329666">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4726561250374329667">
            <property name="name" nameId="yvnu.1169194664001:0" value="assignment" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4726561250374329668">
              <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="4726561250374329669">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvim.SNodeCreator" typeId="yvim.1180636770613:16" id="4726561250374329670">
                <node role="createdType" roleId="yvim.1180636770616:16" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4726561250374329671">
                  <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvor.1068498886294:3" resolveInfo="AssignmentExpression" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329672">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="4726561250374329673">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329674">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329637" resolveInfo="lValue" />
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329675">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329676">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329667" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4726561250374329677">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886295:3" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329678">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="4726561250374329679">
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329680">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329681">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329667" resolveInfo="assignment" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4726561250374329682">
                <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvor.1068498886297:3" />
              </node>
            </node>
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329683">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329643" resolveInfo="rValue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4726561250374329684">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4726561250374329685">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329686">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329655" resolveInfo="dotExpr" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ReplaceWithAnotherOperation" typeId="yvim.1140131837776:16" id="4726561250374329687">
              <node role="replacementNode" roleId="yvim.1140131861877:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4726561250374329688">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4726561250374329667" resolveInfo="assignment" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

