<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.run.commands.typesystem)">
  <persistence version="7" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <language namespace="f3347d8a-0e79-4f35-8ac9-1574f25c986f(jetbrains.mps.run.commands)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="rzqf" modelUID="r:d78df0bb-be4f-4e0d-8142-c0b2df70a5a3(jetbrains.mps.run.commands.structure)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="-1" />
  <import index="7jsa" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.execution.process(MPS.Classpath/com.intellij.execution.process@java_stub)" version="-1" />
  <import index="fxg7" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="uxyt" modelUID="r:3eecec87-82a4-4ea1-952b-7d3a8d81c769(jetbrains.mps.run.commands.typesystem)" version="-1" implicit="yes" />
  <import index="tp3r" modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tpd4" modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" implicit="yes" />
  <roots>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863700">
      <property name="name" nameId="tpck.1169194664001" value="typeof_CommandBuilderExpression" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863710">
      <property name="name" nameId="tpck.1169194664001" value="typeof_CommandParameterAssignment" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863726">
      <property name="name" nameId="tpck.1169194664001" value="typeof_CommandParameterReference" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863739">
      <property name="name" nameId="tpck.1169194664001" value="typeof_CommandReferenceExpression" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.command" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863770">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.processBuilder" />
      <property name="name" nameId="tpck.1169194664001" value="typeof_ProcessBuilderExpression" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863790">
      <property name="name" nameId="tpck.1169194664001" value="typeof_ProcessBuilderKeyPart" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.processBuilder" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863816">
      <property name="name" nameId="tpck.1169194664001" value="typeof_ProcessBuilderPart" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution.processBuilder" />
    </node>
    <node type="tpd4.SubtypingRule" typeId="tpd4.1175147670730" id="946964771156863830">
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution" />
      <property name="name" nameId="tpck.1169194664001" value="processIsProcessHandler" />
    </node>
    <node type="tpd4.InferenceRule" typeId="tpd4.1174643105530" id="946964771156863836">
      <property name="name" nameId="tpck.1169194664001" value="typeof_RedirectOutputExpression" />
      <property name="virtualPackage" nameId="tpck.1193676396447" value="execution" />
    </node>
  </roots>
  <root id="946964771156863700">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863701">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="946964771156863702">
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863703">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863704">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863705">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863709" resolveInfo="commandBuilderExpression" />
            </node>
          </node>
        </node>
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863706">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863707">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="rzqf.ProcessType" typeId="rzqf.856705193941281810" id="946964771156863708" />
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863709">
      <property name="name" nameId="tpck.1169194664001" value="commandBuilderExpression" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281780" resolveInfo="CommandBuilderExpression" />
    </node>
  </root>
  <root id="946964771156863710">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863711">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863712">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863713" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863714">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863715">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863716">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863717">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863725" resolveInfo="commandParameterAssignment" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863718">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281765" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863719">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpee.5680397130376446158" />
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863720">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863721">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863722">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863723">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863725" resolveInfo="commandParameterAssignment" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863724">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281766" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863725">
      <property name="name" nameId="tpck.1169194664001" value="commandParameterAssignment" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281764" resolveInfo="CommandParameterAssignment" />
    </node>
  </root>
  <root id="946964771156863726">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863727">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="946964771156863728">
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863729">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863730">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863731">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863732">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863738" resolveInfo="commandParameterReference" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863733">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281758" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863734">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpee.5680397130376446158" />
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863735">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863736">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863737">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863738" resolveInfo="commandParameterReference" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863738">
      <property name="name" nameId="tpck.1169194664001" value="commandParameterReference" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281756" resolveInfo="CommandParameterReference" />
    </node>
  </root>
  <root id="946964771156863739">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863740">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="946964771156863741">
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863742">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863743">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="rzqf.CommandType" typeId="rzqf.856705193941281750" id="946964771156863744">
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tp3r.ReferenceAntiquotation" typeId="tp3r.1196350785117" id="946964771156863745">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="command" />
                <node role="expression" roleId="tp3r.1196350785111" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863746">
                  <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863747">
                    <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863756" resolveInfo="commandReferenceExpression" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863748">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281755" />
                  </node>
                </node>
              </node>
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tp3r.ReferenceAntiquotation" typeId="tp3r.1196350785117" id="946964771156863749">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="classifier" />
                <node role="expression" roleId="tp3r.1196350785111" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863750">
                  <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863751">
                    <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863756" resolveInfo="commandReferenceExpression" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863752">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281755" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863753">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863754">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863755">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863756" resolveInfo="commandReferenceExpression" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863756">
      <property name="name" nameId="tpck.1169194664001" value="commandReferenceExpression" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281753" resolveInfo="CommandReferenceExpression" />
    </node>
  </root>
  <root id="946964771156863770">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863771">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateEquationStatement" typeId="tpd4.1174658326157" id="946964771156863772">
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863773">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863774">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="rzqf.ProcessType" typeId="rzqf.856705193941281810" id="946964771156863775" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863776">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863777">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863778">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863789" resolveInfo="processBuilderExpression" />
            </node>
          </node>
        </node>
      </node>
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863779">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863780" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863781">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863782">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="946964771156863783">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863784">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863785">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863786">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863787">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863789" resolveInfo="processBuilderExpression" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863788">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281801" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863789">
      <property name="name" nameId="tpck.1169194664001" value="processBuilderExpression" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281799" resolveInfo="ProcessBuilderExpression" />
    </node>
  </root>
  <root id="946964771156863790">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863791">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863792">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863793" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863794">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863795">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.StringType" typeId="tpee.1225271177708" id="946964771156863796" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863797">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863798">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863799">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863800">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863815" resolveInfo="processBuilderKeyPart" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863801">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281804" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863802">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863803" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863804">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863805">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpd4.JoinType" typeId="tpd4.1179479408386" id="946964771156863806">
              <node role="argument" roleId="tpd4.1179479418730" type="tpee.StringType" typeId="tpee.1225271177708" id="946964771156863807" />
              <node role="argument" roleId="tpd4.1179479418730" type="tp2q.ListType" typeId="tp2q.1151688443754" id="946964771156863808">
                <node role="elementType" roleId="tp2q.1151688676805" type="tpee.StringType" typeId="tpee.1225271177708" id="946964771156863809" />
              </node>
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863810">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863811">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863812">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863813">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863815" resolveInfo="processBuilderKeyPart" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863814">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281805" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863815">
      <property name="name" nameId="tpck.1169194664001" value="processBuilderKeyPart" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281803" resolveInfo="ProcessBuilderKeyPart" />
    </node>
  </root>
  <root id="946964771156863816">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863817">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863818">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863819" />
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863820">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863821">
            <node role="term" roleId="tpd4.1174657509053" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863822">
              <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863829" resolveInfo="processBuilderPart" />
            </node>
          </node>
        </node>
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863823">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863824">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpd4.JoinType" typeId="tpd4.1179479408386" id="946964771156863825">
              <node role="argument" roleId="tpd4.1179479418730" type="tpee.StringType" typeId="tpee.1225271177708" id="946964771156863826" />
              <node role="argument" roleId="tpd4.1179479418730" type="tp2q.ListType" typeId="tp2q.1151688443754" id="946964771156863827">
                <node role="elementType" roleId="tp2q.1151688676805" type="tpee.StringType" typeId="tpee.1225271177708" id="946964771156863828" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863829">
      <property name="name" nameId="tpck.1169194664001" value="processBuilderPart" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281807" resolveInfo="ProcessBuilderPart" />
    </node>
  </root>
  <root id="946964771156863830">
    <node role="body" roleId="tpd4.1175147624276" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863831">
      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="946964771156863832">
        <node role="expression" roleId="tpee.1068581517676" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863833">
          <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="946964771156863834">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7jsa.~ProcessHandler" resolveInfo="ProcessHandler" />
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863835">
      <property name="name" nameId="tpck.1169194664001" value="processType" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281810" resolveInfo="ProcessType" />
    </node>
  </root>
  <root id="946964771156863836">
    <node role="body" roleId="tpd4.1195213635060" type="tpee.StatementList" typeId="tpee.1068580123136" id="946964771156863837">
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863838">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863839" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863840">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863841">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="rzqf.ProcessType" typeId="rzqf.856705193941281810" id="946964771156863842" />
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863843">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863844">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863845">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863846">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863858" resolveInfo="redirectOutputExpression" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863847">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281813" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="statement" roleId="tpee.1068581517665" type="tpd4.CreateStrongLessThanInequationStatement" typeId="tpd4.1179832490862" id="946964771156863848">
        <node role="inequationGroup" roleId="tpd4.1320713984677695199" type="tpd4.DefaultGroupReference" typeId="tpd4.1320713984677695202" id="946964771156863849" />
        <node role="rightExpression" roleId="tpd4.1174660783414" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863850">
          <node role="normalType" roleId="tpd4.1185788644032" type="tp3r.Quotation" typeId="tp3r.1196350785113" id="946964771156863851">
            <node role="quotedNode" roleId="tp3r.1196350785114" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="946964771156863852">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7jsa.~ProcessListener" resolveInfo="ProcessListener" />
            </node>
          </node>
        </node>
        <node role="leftExpression" roleId="tpd4.1174660783413" type="tpd4.NormalTypeClause" typeId="tpd4.1185788614172" id="946964771156863853">
          <node role="normalType" roleId="tpd4.1185788644032" type="tpd4.TypeOfExpression" typeId="tpd4.1174657487114" id="946964771156863854">
            <node role="term" roleId="tpd4.1174657509053" type="tpee.DotExpression" typeId="tpee.1197027756228" id="946964771156863855">
              <node role="operand" roleId="tpee.1197027771414" type="tpd4.ApplicableNodeReference" typeId="tpd4.1174650418652" id="946964771156863856">
                <link role="applicableNode" roleId="tpd4.1174650432090" targetNodeId="946964771156863858" resolveInfo="redirectOutputExpression" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="946964771156863857">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="rzqf.856705193941281814" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="applicableNode" roleId="tpd4.1174648101952" type="tpd4.ConceptReference" typeId="tpd4.1174642788531" id="946964771156863858">
      <property name="name" nameId="tpck.1169194664001" value="redirectOutputExpression" />
      <link role="concept" roleId="tpd4.1174642800329" targetNodeId="rzqf.856705193941281812" resolveInfo="RedirectOutputExpression" />
    </node>
  </root>
</model>

