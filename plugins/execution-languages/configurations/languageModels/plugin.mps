<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1efa4888-7e18-4b29-8d80-9f1f32f48e6e(jetbrains.mps.execution.configurations.plugin)">
  <persistence version="7" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="22e72e4c-0f69-46ce-8403-6750153aa615(jetbrains.mps.execution.configurations)" />
  <language namespace="774bf8a0-62e5-41e1-af63-f4812e60e48b(jetbrains.mps.baseLanguage.checkedDots)" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="uhxm" modelUID="r:f3383ae6-205a-4e7c-8dd9-c29966e29e49(jetbrains.mps.execution.configurations.structure)" version="0" />
  <import index="l6su" modelUID="f:java_stub#86441d7a-e194-42da-81a5-2161ec62a379#jetbrains.mps.baseLanguage.util.plugin.run(MPS.Workbench/jetbrains.mps.baseLanguage.util.plugin.run@java_stub)" version="-1" />
  <import index="cu2c" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <roots>
    <node type="tp4k.EditorTab" typeId="tp4k.3743831881070611759" id="2401501559171392649">
      <property name="name" nameId="tpck.1169194664001" value="Run Configuration" />
      <link role="baseNodeConcept" roleId="tp4k.3743831881070611760" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="tp4k.EditorTab" typeId="tp4k.3743831881070611759" id="2401501559171392650">
      <property name="name" nameId="tpck.1169194664001" value="Executor" />
      <property name="commandOnCreate" nameId="tp4k.8204570419206313935" value="true" />
      <link role="baseNodeConcept" roleId="tp4k.3743831881070611760" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
    </node>
    <node type="uhxm.BeforeTask" typeId="uhxm.7037083547576022975" id="247026320694134524">
      <property name="name" nameId="tpck.1169194664001" value="Make" />
    </node>
    <node type="uhxm.BeforeTask" typeId="uhxm.7037083547576022975" id="259833884788814900">
      <property name="name" nameId="tpck.1169194664001" value="MakeNodePointers" />
      <property name="alias" nameId="tpck.1156235010670" value="Make" />
    </node>
  </roots>
  <root id="2401501559171392649">
    <node role="baseNodeBlock" roleId="tp4k.3743831881070611762" type="tp4k.BaseNodeBlock" typeId="tp4k.3743831881070657672" id="1718532280867908561">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1718532280867908562">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1718532280867908577">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1718532280867908579">
            <node role="ifTrue" roleId="tpee.1163668922816" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1718532280867908583" />
            <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1718532280867908584" />
            <node role="condition" roleId="tpee.1163668914799" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1718532280867898785">
              <node role="operand" roleId="tpee.1197027771414" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1718532280867898784" />
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="1718532280867898789">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="1718532280867898791">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="2401501559171392650">
    <node role="nodesBlock" roleId="tp4k.3743831881070612960" type="tp4k.GetNodeBlock" typeId="tp4k.1203851983563" id="2401501559171392652">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="2401501559171392653">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1048802521465131485">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1048802521465131486">
            <property name="name" nameId="tpck.1169194664001" value="nodeFinal" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1048802521465131487">
              <link role="concept" roleId="tp25.1138405853777" targetNodeId="uhxm.2401501559171345993" resolveInfo="RunConfiguration" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1048802521465131488" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2401501559171395410">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465114249">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465114244">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2401501559171395412">
                <node role="operand" roleId="tpee.1197027771414" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="2401501559171395411" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetModelOperation" typeId="tp25.1143234257716" id="1048802521465114243" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_RootsOperation" typeId="tp25.1171315804604" id="1048802521465114248">
                <link role="concept" roleId="tp25.1171315804605" targetNodeId="uhxm.2401501559171392633" resolveInfo="AbstractRunConfigurationExecutor" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.FindFirstOperation" typeId="tp2q.1225727723840" id="1048802521465114253">
              <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="1048802521465114254">
                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="1048802521465114255">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1048802521465114258">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1048802521465114265">
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1048802521465131483">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1048802521465131486" resolveInfo="nodeFinal" />
                      </node>
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465114260">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1048802521465114259">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1048802521465114256" resolveInfo="it" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1048802521465114264">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.1048802521465114237" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="1048802521465114256">
                  <property name="name" nameId="tpck.1169194664001" value="it" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="1048802521465114257" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="baseNodeBlock" roleId="tp4k.3743831881070611762" type="tp4k.BaseNodeBlock" typeId="tp4k.3743831881070657672" id="1048802521465134535">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1048802521465134536">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1048802521465134543">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465134547">
            <node role="operand" roleId="tpee.1197027771414" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1048802521465134546" />
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="1048802521465134551">
              <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="1048802521465134553">
                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="uhxm.2401501559171392633" resolveInfo="AbstractRunConfigurationExecutor" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1048802521465134545">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1048802521465134554">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465134559">
                <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="1048802521465134557">
                  <link role="concept" roleId="tp25.1140138128738" targetNodeId="uhxm.2401501559171392633" resolveInfo="AbstractRunConfigurationExecutor" />
                  <node role="leftExpression" roleId="tp25.1140138123956" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1048802521465134556" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1048802521465134563">
                  <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.1048802521465114237" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1718532280867898793">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1718532280867908575" />
        </node>
      </node>
    </node>
    <node role="createTabBlock" roleId="tp4k.1640281869714699888" type="tp4k.CreateTabBlock" typeId="tp4k.1640281869714699879" id="1640281869715076465">
      <property name="commandOnCreate" nameId="tp4k.1640281869714699886" value="true" />
      <node role="conceptsBlock" roleId="tp4k.1640281869714699882" type="tp4k.GetConceptsBlock" typeId="tp4k.7692832593197705758" id="2228878981387189750">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="2228878981387189751">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2228878981387189752">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2228878981387189753">
              <node role="creator" roleId="tpee.1145553007750" type="tp2q.ListCreatorWithInit" typeId="tp2q.1160600644654" id="2228878981387189755">
                <node role="elementType" roleId="tp2q.1237721435807" type="tp25.SConceptType" typeId="tp25.1172420572800" id="2228878981387189757" />
                <node role="initValue" roleId="tp2q.1237721435808" type="tp25.ReadConceptReferenceExpression" typeId="tp25.448792706993295611" id="2228878981387189760">
                  <link role="conceptDeclaration" roleId="tp25.448792706993295615" targetNodeId="uhxm.7806358006983614956" resolveInfo="RunConfigurationExecutor" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="createBlock" roleId="tp4k.1640281869714699884" type="tp4k.NewCreateBlock" typeId="tp4k.7692832593197710972" id="1048802521465095298">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1048802521465095299">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1048802521465100172">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1048802521465100173">
              <property name="name" nameId="tpck.1169194664001" value="executor" />
              <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1048802521465100174">
                <link role="concept" roleId="tp25.1138405853777" targetNodeId="uhxm.2401501559171392633" resolveInfo="AbstractRunConfigurationExecutor" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1048802521465100175">
                <node role="creator" roleId="tpee.1145553007750" type="tp25.SNodeCreator" typeId="tp25.1180636770613" id="1048802521465100176">
                  <node role="createdType" roleId="tp25.1180636770616" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1048802521465100177">
                    <link role="concept" roleId="tp25.1138405853777" targetNodeId="uhxm.7806358006983614956" resolveInfo="RunConfigurationExecutor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1048802521465100178">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1048802521465100179">
              <node role="rValue" roleId="tpee.1068498886297" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1048802521465100180" />
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465100181">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1048802521465100182">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1048802521465100173" resolveInfo="executor" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1048802521465114269">
                  <link role="link" roleId="tp25.1138056516764" targetNodeId="uhxm.1048802521465114237" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1048802521465100184">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465100185">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1048802521465100186">
                <node role="operand" roleId="tpee.1197027771414" type="tp4k.ConceptFunctionParameter_node" typeId="tp4k.1203853034639" id="1048802521465100187" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetModelOperation" typeId="tp25.1143234257716" id="1048802521465100188" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Model_AddRootOperation" typeId="tp25.1206482823744" id="1048802521465100189">
                <node role="nodeArgument" roleId="tp25.1206482823746" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1048802521465100190">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1048802521465100173" resolveInfo="executor" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1048802521465100206">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1048802521465100207">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1048802521465100173" resolveInfo="executor" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="247026320694134524">
    <node role="execute" roleId="uhxm.2454261876037700497" type="uhxm.ExecuteBeforeTask_ConceptFunction" typeId="uhxm.2454261876037468744" id="247026320694134525">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="247026320694134526">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3591131172574898560">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3591131172574898562">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="l6su.~RunUtil" resolveInfo="RunUtil" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="l6su.~RunUtil%dmakeBeforeRun(com%dintellij%dopenapi%dproject%dProject,java%dutil%dList)%cboolean" resolveInfo="makeBeforeRun" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="uhxm.Project_Parameter" typeId="uhxm.7684700299064179245" id="3591131172574898563" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3191465790742144479">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3191465790742144462">
                <node role="operand" roleId="tpee.1197027771414" type="uhxm.BeforeTaskParameterReference" typeId="uhxm.6550182048787583936" id="3591131172574898565">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="247026320694134531" resolveInfo="myNodes" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="3191465790742144484">
                  <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3191465790742144485">
                    <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3191465790742144486">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3191465790742144487">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3191465790742144488">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3191465790742144489">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3191465790742144491" resolveInfo="it" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="3191465790742144490" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3191465790742144491">
                      <property name="name" nameId="tpck.1169194664001" value="it" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3191465790742144492" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.ToListOperation" typeId="tp2q.1151702311717" id="3191465790742144483" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" roleId="uhxm.6550182048787568298" type="uhxm.BeforeTaskParameter" typeId="uhxm.6550182048787562516" id="247026320694134531">
      <property name="name" nameId="tpck.1169194664001" value="myNodes" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeListType" typeId="tp25.1145383075378" id="247026320694134532" />
    </node>
    <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="tpce.DeprecatedNodeAnnotation" typeId="tpce.1224240836180" id="5039342337170237639">
      <property name="comment" nameId="tpce.1225118933224" value="Use MakeNodePointers before task instead" />
    </node>
  </root>
  <root id="259833884788814900">
    <node role="execute" roleId="uhxm.2454261876037700497" type="uhxm.ExecuteBeforeTask_ConceptFunction" typeId="uhxm.2454261876037468744" id="259833884788814901">
      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="259833884788814902">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="259833884788814903">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="8581421505100255919">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="l6su.~RunUtil%dmakePointersBeforeRun(com%dintellij%dopenapi%dproject%dProject,java%dutil%dList)%cboolean" resolveInfo="makePointersBeforeRun" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="l6su.~RunUtil" resolveInfo="RunUtil" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="uhxm.Project_Parameter" typeId="uhxm.7684700299064179245" id="8581421505100255920" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="uhxm.BeforeTaskParameterReference" typeId="uhxm.6550182048787583936" id="8581421505100255921">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="259833884788814919" resolveInfo="myNodePointers" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="parameter" roleId="uhxm.6550182048787568298" type="uhxm.BeforeTaskParameter" typeId="uhxm.6550182048787562516" id="259833884788814919">
      <property name="name" nameId="tpck.1169194664001" value="myNodePointers" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.ListType" typeId="tp2q.1151688443754" id="259833884788814921">
        <node role="elementType" roleId="tp2q.1151688676805" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="259833884788814924">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SNodePointer" resolveInfo="SNodePointer" />
        </node>
      </node>
    </node>
  </root>
</model>

