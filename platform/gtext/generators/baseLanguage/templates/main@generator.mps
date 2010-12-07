<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)">
  <persistence version="7" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
  <language namespace="df345b11-b8c7-4213-ac66-48d2a9b75d88(jetbrains.mps.baseLanguageInternal)" />
  <language namespace="a83c3bd0-2f7e-4ba1-8373-12d49e99f57e(jetbrains.mps.gtext)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <import index="yvqs" modelUID="r:00000000-0000-4000-0000-011c89590575(jetbrains.mps.gtext.structure)" version="0" />
  <import index="yvqt" modelUID="r:00000000-0000-4000-0000-011c89590577(jetbrains.mps.gtext.generator.baseLanguage.template.util)" version="-1" />
  <import index="kdfs" modelUID="f:java_stub#jetbrains.mps.gtext.runtime(jetbrains.mps.gtext.runtime@java_stub)" version="-1" />
  <import index="yvqu" modelUID="r:00000000-0000-4000-0000-011c89590570(jetbrains.mps.gtext.behavior)" version="-1" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="yvp6" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yvko" modelUID="r:00000000-0000-4000-0000-011c895903ac(jetbrains.mps.baseLanguageInternal.structure)" version="1" implicit="yes" />
  <import index="yvo0" modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" implicit="yes" />
  <import index="yvqv" modelUID="r:00000000-0000-4000-0000-011c89590576(jetbrains.mps.gtext.generator.baseLanguage.template.main@generator)" version="-1" implicit="yes" />
  <roots>
    <node type="yvp6.MappingConfiguration" typeId="yvp6.1095416546421:2" id="1164413908130">
      <property name="name" nameId="yvnu.1169194664001:0" value="mc_convertToBL" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="toBL" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1164488726779">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_GItemStatement" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="toBL" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1164488352732:0" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1165584777191">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_GStatementItem" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="toBL" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1165582968644:0" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1166926684100">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_GLine" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="rewrite" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1166926309597:0" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1179110448984">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_GConditionalLine" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="rewrite" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1179109169620:0" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1195217368293">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_BuilderContextRef" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="toBL" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1181754781153:0" resolveInfo="BuilderContextRef" />
    </node>
    <node type="yvp6.MappingScript" typeId="yvp6.1195499912406:2" id="1196149742906">
      <property name="name" nameId="yvnu.1169194664001:0" value="script_Optimization" />
      <property name="scriptKind" nameId="yvp6.1195595592106:2" value="post_processing" />
      <property name="modifiesModel" nameId="yvp6.1195595611951:2" value="true" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="rewrite" />
    </node>
    <node type="yvp6.TemplateDeclaration" typeId="yvp6.1092059087312:2" id="1211915472272">
      <property name="name" nameId="yvnu.1169194664001:0" value="reduce_GSeparatorItemList" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="rewrite" />
      <link role="applicableConcept" roleId="yvp6.1168285871518:2" targetNodeId="yvqs.1188509198390:0" resolveInfo="GSeparatorItemList" />
    </node>
    <node type="yvp6.MappingConfiguration" typeId="yvp6.1095416546421:2" id="4246810654489660286">
      <property name="name" nameId="yvnu.1169194664001:0" value="mc_rewrite" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="rewrite" />
    </node>
    <node type="yvp6.TemplateSwitch" typeId="yvp6.1112730859144:2" id="4246810654489778220">
      <property name="name" nameId="yvnu.1169194664001:0" value="convertToBL" />
      <property name="virtualPackage" nameId="yvnu.1193676396447:0" value="toBL" />
    </node>
  </roots>
  <root id="1164413908130">
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="1173357916125">
      <property name="applyToConceptInheritors" nameId="yvp6.1167272244852:2" value="true" />
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1181754781153:0" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.TemplateDeclarationReference" typeId="yvp6.1168559333462:2" id="1195217445340">
        <link role="template" roleId="yvp6.1722980698497626483:2" targetNodeId="1195217368293" resolveInfo="reduce_BuilderContextRef_old" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="1167335643264">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164488352732:0" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.TemplateDeclarationReference" typeId="yvp6.1168559333462:2" id="1170775690629">
        <link role="template" roleId="yvp6.1722980698497626483:2" targetNodeId="1164488726779" resolveInfo="reduce_GItemStatement" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489778380">
      <property name="applyToConceptInheritors" nameId="yvp6.1167272244852:2" value="true" />
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164412935041:0" resolveInfo="GItem" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489780479">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvqs.GText" typeId="yvqs.1164412789837:0" id="4246810654489780482">
          <property name="text" nameId="yvqs.1164413036326:0" value="abc" />
          <node role="nodeMacro$attribute" type="yvp6.SwitchMacro" typeId="yvp6.1112731569622:2" id="4246810654489780484">
            <link role="templateSwitch" roleId="yvp6.1112731629154:2" targetNodeId="4246810654489778220" resolveInfo="convertToBL" />
          </node>
        </node>
      </node>
      <node role="conditionFunction" roleId="yvp6.1167169362365:2" type="yvp6.BaseMappingRule_Condition" typeId="yvp6.1167168920554:2" id="4246810654489780485">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489780486">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780487">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780489">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489780488" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_ConceptMethodCall" typeId="yvim.1179409122411:16" id="4246810654489780493">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvqu.1213877310935" resolveInfo="shouldBeReduced" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1164488726779">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="4246810654489789694">
      <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789695">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789697">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4246810654489789698" />
          <node role="nodeMacro$attribute" type="yvp6.LoopMacro" typeId="yvp6.1118786554307:2" id="4246810654489789700">
            <node role="sourceNodesQuery" roleId="yvp6.1167952069335:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="4246810654489789701">
              <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789702">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789703">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789705">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789704" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4246810654489789709">
                      <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1164488382452:0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="nodeMacro$attribute" type="yvp6.SwitchMacro" typeId="yvp6.1112731569622:2" id="4246810654489789712">
            <link role="templateSwitch" roleId="yvp6.1112731629154:2" targetNodeId="4246810654489778220" resolveInfo="convertToBL" />
          </node>
        </node>
      </node>
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="4246810654489789696" />
    </node>
  </root>
  <root id="1165584777191">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1165584814116">
      <property name="value" nameId="yvor.1070475926801:3" value="statementList" />
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="1165584816617" />
      <node role="nodeMacro$attribute" type="yvp6.CopySrcListMacro" typeId="yvp6.1114729360583:2" id="1174866012479">
        <node role="sourceNodesQuery" roleId="yvp6.1168278589236:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="1174866012480">
          <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1174866012481">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1174866019770">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227907714">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227894120">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1174866019771" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1217631029778">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvqs.1174865533071:0" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1217631028438">
                  <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1068581517665:3" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1166926684100">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvqs.GItemList" typeId="yvqs.1164412982980:0" id="1166926755246">
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="1166926756794" />
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GIndent" typeId="yvqs.1164413214326:0" id="1166934155694" />
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GText" typeId="yvqs.1164412789837:0" id="1166926761717">
        <property name="text" nameId="yvqs.1164413036326:0" value="items" />
        <node role="nodeMacro$attribute" type="yvp6.CopySrcListMacro" typeId="yvp6.1114729360583:2" id="1166928903020">
          <node role="sourceNodesQuery" roleId="yvp6.1168278589236:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="1168408260665">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1168408260666">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1173361161123">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227895166">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1168408264232" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1217631028405">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1166928665191:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GNewLine" typeId="yvqs.1164413172275:0" id="1166926814299" />
    </node>
  </root>
  <root id="1179110448984">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvqs.GItemList" typeId="yvqs.1164412982980:0" id="1179110460581">
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GIndent" typeId="yvqs.1164413214326:0" id="1179110476865">
        <node role="nodeMacro$attribute" type="yvp6.IfMacro" typeId="yvp6.1118773211870:2" id="1179110492072">
          <node role="conditionFunction" roleId="yvp6.1167945861827:2" type="yvp6.IfMacro_Condition" typeId="yvp6.1167945743726:2" id="1179110492073">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1179110492074">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1179110502281">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227901514">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1179110502282" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1179110511165">
                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvqs.1179109261107:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GText" typeId="yvqs.1164412789837:0" id="1179110532402">
        <property name="text" nameId="yvqs.1164413036326:0" value="items" />
        <node role="nodeMacro$attribute" type="yvp6.CopySrcListMacro" typeId="yvp6.1114729360583:2" id="1179110537686">
          <node role="sourceNodesQuery" roleId="yvp6.1168278589236:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="1179110537687">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1179110537688">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1179110542010">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227893789">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1179110542011" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1217631029002">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1179109231418:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GNewLine" typeId="yvqs.1164413172275:0" id="1179110515285">
        <node role="nodeMacro$attribute" type="yvp6.IfMacro" typeId="yvp6.1118773211870:2" id="1179110518295">
          <node role="conditionFunction" roleId="yvp6.1167945861827:2" type="yvp6.IfMacro_Condition" typeId="yvp6.1167945743726:2" id="1179110518296">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1179110518297">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1179110521570">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227936009">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1179110521571" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1179110524712">
                    <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvqs.1179109261107:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="1179110461801" />
    </node>
  </root>
  <root id="1195217368293">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvko.InternalVariableReference" typeId="yvko.1176743162354:1" id="1195217974647">
      <property name="name" nameId="yvko.1176743296073:1" value="builderContext" />
      <node role="type" roleId="yvko.1176743202636:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207733994541">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="kdfs.~TBaseBuilderContext" resolveInfo="TBaseBuilderContext" />
      </node>
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="1195217985710" />
    </node>
  </root>
  <root id="1196149742906">
    <node role="codeBlock" roleId="yvp6.1195501105008:2" type="yvp6.MappingScript_CodeBlock" typeId="yvp6.1195500722856:2" id="1196149742907">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1196149742908">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1196164419159">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1196164420367">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvqt.1196158527655" resolveInfo="optimize" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yvqt.1196157277388" resolveInfo="GTextUtil" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvo0.ConceptFunctionParameter_model" typeId="yvo0.1161622665029:0" id="1196164423210" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1211915472272">
    <node role="contentNode" roleId="yvp6.1092060348987:2" type="yvqs.GItemList" typeId="yvqs.1164412982980:0" id="1211917853731">
      <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GItemList" typeId="yvqs.1164412982980:0" id="1211917863257">
        <node role="nodeMacro$attribute" type="yvp6.LoopMacro" typeId="yvp6.1118786554307:2" id="1211917873283">
          <node role="sourceNodesQuery" roleId="yvp6.1167952069335:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="1211917873284">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1211917873285">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1211917885310">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1211917886149">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1211917885311" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="1211919350509">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1211919312449:0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GText" typeId="yvqs.1164412789837:0" id="1211917892792">
          <property name="text" nameId="yvqs.1164413036326:0" value="separator" />
          <node role="nodeMacro$attribute" type="yvp6.IfMacro" typeId="yvp6.1118773211870:2" id="1211917979368">
            <node role="conditionFunction" roleId="yvp6.1167945861827:2" type="yvp6.IfMacro_Condition" typeId="yvp6.1167945743726:2" id="1211917979369">
              <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1211917979370">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1211917982639">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1211917988811">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1211917985077">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1211917982640" />
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetPrevSiblingOperation" typeId="yvim.1143511969223:16" id="1211917986493" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsNotNullOperation" typeId="yvim.1172008320231:16" id="1211917990876" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="nodeMacro$attribute" type="yvp6.CopySrcNodeMacro" typeId="yvp6.1114706874351:2" id="1211917963708">
            <node role="sourceNodeQuery" roleId="yvp6.1168024447342:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="1211917963709">
              <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1211917963710">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1211917971781">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1211917971782">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1211917971783">
                      <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvqs.1188509198390:0" resolveInfo="GSeparatorItemList" />
                      <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1211917971784">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1211917971785" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetParentOperation" typeId="yvim.1139613262185:16" id="1211917971786" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1211917971787">
                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvqs.1211914934108:0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="item" roleId="yvqs.1164413016466:0" type="yvqs.GText" typeId="yvqs.1164412789837:0" id="1211917906181">
          <property name="text" nameId="yvqs.1164413036326:0" value="item" />
          <node role="nodeMacro$attribute" type="yvp6.CopySrcNodeMacro" typeId="yvp6.1114706874351:2" id="1211917909486">
            <node role="sourceNodeQuery" roleId="yvp6.1168024447342:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="1211917909487">
              <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1211917909488">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1211917913093">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="1211917913094" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="templateFragment$attribute" type="yvp6.TemplateFragment" typeId="yvp6.1095672379244:2" id="1211917869864" />
    </node>
  </root>
  <root id="4246810654489660286">
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489760986">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1179109169620:0" resolveInfo="GConditionalLine" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.TemplateDeclarationReference" typeId="yvp6.1168559333462:2" id="4246810654489760987">
        <link role="template" roleId="yvp6.1722980698497626483:2" targetNodeId="1179110448984" resolveInfo="reduce_GConditionalLine" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489760998">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1166926309597:0" resolveInfo="GLine" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.TemplateDeclarationReference" typeId="yvp6.1168559333462:2" id="4246810654489760999">
        <link role="template" roleId="yvp6.1722980698497626483:2" targetNodeId="1166926684100" resolveInfo="reduce_GLine" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167328349397:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489761009">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1188509198390:0" resolveInfo="GSeparatorItemList" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.TemplateDeclarationReference" typeId="yvp6.1168559333462:2" id="4246810654489761010">
        <link role="template" roleId="yvp6.1722980698497626483:2" targetNodeId="1211915472272" resolveInfo="reduce_GSeparatorItemList" />
      </node>
    </node>
    <node role="postMappingScript" roleId="yvp6.1195502346405:2" type="yvp6.MappingScriptReference" typeId="yvp6.1195502151594:2" id="4246810654489760985">
      <link role="mappingScript" roleId="yvp6.1195502167610:2" targetNodeId="1196149742906" resolveInfo="script_Optimization" />
    </node>
  </root>
  <root id="4246810654489778220">
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489778221">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164497519485:0" resolveInfo="GExpressionItem" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489780494">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780496">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780497">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489780498" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489780499">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4246810654489780500">
                <property name="value" nameId="yvor.1070475926801:3" value="expression" />
                <node role="nodeMacro$attribute" type="yvp6.CopySrcNodeMacro" typeId="yvp6.1114706874351:2" id="4246810654489780501">
                  <node role="sourceNodeQuery" roleId="yvp6.1168024447342:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="4246810654489780502">
                    <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489780503">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780504">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780505">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489780506" />
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4246810654489780507">
                            <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvqs.1164497557065:0" />
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
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489780509">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164413214326:0" resolveInfo="GIndent" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489780511">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780513">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780515">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489780516" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489780517">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dappendIndent()%cvoid" resolveInfo="appendIndent" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789604">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164413172275:0" resolveInfo="GNewLine" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789606">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789608">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789610">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489789611" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489789612">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dappendNewLine()%cvoid" resolveInfo="appendNewLine" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789613">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164412789837:0" resolveInfo="GText" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789615">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789617">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789618">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489789619" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489789620">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dappend(java%dlang%dString)%cvoid" resolveInfo="append" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4246810654489789621">
                <property name="value" nameId="yvor.1070475926801:3" value="text" />
                <node role="propertyMacro$property_attribute$value" type="yvp6.PropertyMacro" typeId="yvp6.1087833241328:2" id="4246810654489789622">
                  <node role="propertyValueFunction" roleId="yvp6.1167756362303:2" type="yvp6.PropertyMacro_GetPropertyValue" typeId="yvp6.1167756080639:2" id="4246810654489789623">
                    <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789624">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789625">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789626">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789627" />
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="4246810654489789628">
                            <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvqs.1164413036326:0" resolveInfo="text" />
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
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789583">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164412982980:0" resolveInfo="GItemList" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789585">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="4246810654489789587">
          <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789588">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789589">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4246810654489789590" />
              <node role="nodeMacro$attribute" type="yvp6.LoopMacro" typeId="yvp6.1118786554307:2" id="4246810654489789592">
                <node role="sourceNodesQuery" roleId="yvp6.1167952069335:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="4246810654489789593">
                  <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789594">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789595">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789597">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789596" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4246810654489789601">
                          <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1164413016466:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="nodeMacro$attribute" type="yvp6.SwitchMacro" typeId="yvp6.1112731569622:2" id="4246810654490083677">
                <link role="templateSwitch" roleId="yvp6.1112731629154:2" targetNodeId="4246810654489778220" resolveInfo="convertToBL" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789630">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1211920428461:0" resolveInfo="GContentPlaceholder" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789632">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789634">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789635">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489789636" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489789637">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%daddContentPlaceholder(java%dlang%dString)%cvoid" resolveInfo="addContentPlaceholder" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4246810654489789638">
                <property name="value" nameId="yvor.1070475926801:3" value="name" />
                <node role="propertyMacro$property_attribute$value" type="yvp6.PropertyMacro" typeId="yvp6.1087833241328:2" id="4246810654489789639">
                  <node role="propertyValueFunction" roleId="yvp6.1167756362303:2" type="yvp6.PropertyMacro_GetPropertyValue" typeId="yvp6.1167756080639:2" id="4246810654489789640">
                    <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789641">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789642">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789643">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789644" />
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="4246810654489789645">
                            <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
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
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489780518">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1164416446950:0" resolveInfo="GIndentBlock" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489780520">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="4246810654489780522">
          <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489780523">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780524">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780525">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489780526" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489780527">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dincreaseIndent()%cvoid" resolveInfo="increaseIndent" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780528">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4246810654489780529">
                <property name="value" nameId="yvor.1070475926801:3" value="itemList" />
              </node>
              <node role="nodeMacro$attribute" type="yvp6.SwitchMacro" typeId="yvp6.1112731569622:2" id="4246810654489780542">
                <link role="templateSwitch" roleId="yvp6.1112731629154:2" targetNodeId="4246810654489778220" resolveInfo="convertToBL" />
                <node role="sourceNodeQuery" roleId="yvp6.1168380395224:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="4246810654489780543">
                  <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489780544">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780545">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780547">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489780546" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4246810654489780551">
                          <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvqs.1166926910409:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489780537">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489780538">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489780539" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489780540">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%ddecreaseIndent()%cvoid" resolveInfo="decreaseIndent" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789647">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1211920502338:0" resolveInfo="GContentBlock" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789649">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="4246810654489789651">
          <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789652">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789653">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789654">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489789655" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489789656">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dstartContentBlock(java%dlang%dString)%cvoid" resolveInfo="startContentBlock" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="4246810654489789657">
                    <property name="value" nameId="yvor.1070475926801:3" value="name" />
                    <node role="propertyMacro$property_attribute$value" type="yvp6.PropertyMacro" typeId="yvp6.1087833241328:2" id="4246810654489789658">
                      <node role="propertyValueFunction" roleId="yvp6.1167756362303:2" type="yvp6.PropertyMacro_GetPropertyValue" typeId="yvp6.1167756080639:2" id="4246810654489789659">
                        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789660">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789661">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789662">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789663" />
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="4246810654489789664">
                                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
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
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789679">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4246810654489789680" />
              <node role="nodeMacro$attribute" type="yvp6.LoopMacro" typeId="yvp6.1118786554307:2" id="4246810654489789682">
                <node role="sourceNodesQuery" roleId="yvp6.1167952069335:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="4246810654489789683">
                  <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789684">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789685">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789687">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789686" />
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4246810654489789691">
                          <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvqs.1211920572264:0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="nodeMacro$attribute" type="yvp6.SwitchMacro" typeId="yvp6.1112731569622:2" id="4246810654489789693">
                <link role="templateSwitch" roleId="yvp6.1112731629154:2" targetNodeId="4246810654489778220" resolveInfo="convertToBL" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789674">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789675">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvqs.BuilderContextRef" typeId="yvqs.1181754781153:0" id="4246810654489789676" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4246810654489789677">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="kdfs.~TBaseBuilderContext%dendContentBlock()%cvoid" resolveInfo="endContentBlock" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="reductionMappingRule" roleId="yvp6.1167340453568:2" type="yvp6.Reduction_MappingRule" typeId="yvp6.1167327847730:2" id="4246810654489789713">
      <link role="applicableConcept" roleId="yvp6.1167169349424:2" targetNodeId="yvqs.1165582968644:0" resolveInfo="GStatementItem" />
      <node role="ruleConsequence" roleId="yvp6.1169672767469:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="4246810654489789715">
        <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="4246810654489789717">
          <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789718">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789719">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4246810654489789720" />
              <node role="nodeMacro$attribute" type="yvp6.LoopMacro" typeId="yvp6.1118786554307:2" id="4246810654489789722">
                <node role="sourceNodesQuery" roleId="yvp6.1167952069335:2" type="yvp6.SourceSubstituteMacro_SourceNodesQuery" typeId="yvp6.1167951910403:2" id="4246810654489789723">
                  <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789724">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489789729">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789736">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4246810654489789731">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489789730" />
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="4246810654489789735">
                            <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvqs.1174865533071:0" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4246810654489789740">
                          <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvor.1068581517665:3" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="nodeMacro$attribute" type="yvp6.CopySrcNodeMacro" typeId="yvp6.1114706874351:2" id="4246810654489789726">
                <node role="sourceNodeQuery" roleId="yvp6.1168024447342:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="4246810654489789727">
                  <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4246810654489789728">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="4246810654489793047">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="4246810654489793048" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="defaultConsequence" roleId="yvp6.1168558750579:2" type="yvp6.InlineTemplate_RuleConsequence" typeId="yvp6.1177093525992:2" id="44154448046322295">
      <node role="templateNode" roleId="yvp6.1177093586806:2" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="44154448046322297">
        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="44154448046322299">
          <property name="value" nameId="yvor.1068580320021:3" value="23" />
        </node>
        <node role="nodeMacro$attribute" type="yvp6.CopySrcNodeMacro" typeId="yvp6.1114706874351:2" id="44154448046322301">
          <node role="sourceNodeQuery" roleId="yvp6.1168024447342:2" type="yvp6.SourceSubstituteMacro_SourceNodeQuery" typeId="yvp6.1168024337012:2" id="44154448046322302">
            <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="44154448046322303">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="44154448046322304">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvp6.TemplateFunctionParameter_sourceNode" typeId="yvp6.1167169188348:2" id="44154448046322305" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

