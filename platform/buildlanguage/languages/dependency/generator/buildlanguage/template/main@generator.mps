<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895904d0(jetbrains.mps.build.dependency.generator.buildlanguage.template.main@generator)">
  <persistence version="7" />
  <language namespace="b401a680-8325-4110-8fd3-84331ff25bef(jetbrains.mps.lang.generator)" />
  <language namespace="0b608d44-1308-418d-8715-22d040c3b3cc(jetbrains.mps.buildlanguage)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="fba399db-f591-45dc-a279-e2a2a986e262(jetbrains.mps.build.generictasks)" />
  <language namespace="d7706f63-9be2-479c-a3da-ae92af1e64d5(jetbrains.mps.lang.generator.generationContext)" />
  <import index="tpsj" modelUID="r:00000000-0000-4000-0000-011c895904cf(jetbrains.mps.build.dependency.structure)" version="0" />
  <import index="tpsk" modelUID="r:00000000-0000-4000-0000-011c895904c8(jetbrains.mps.buildlanguage.structure)" version="21" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="ddum" modelUID="r:1e7ada09-c25e-41ea-a9b5-398e142ef533(jetbrains.mps.build.generictasks.structure)" version="22" />
  <import index="mwyq" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tpf3" modelUID="r:00000000-0000-4000-0000-011c895902f3(jetbrains.mps.lang.generator.generationContext.structure)" version="0" implicit="yes" />
  <import index="adh8" modelUID="r:7a6a35c6-e369-4565-b91b-c7c8dfa2c8d7(jetbrains.mps.build.generictasks.generated)" version="-1" implicit="yes" />
  <import index="tpsc" modelUID="r:00000000-0000-4000-0000-011c895904d0(jetbrains.mps.build.dependency.generator.buildlanguage.template.main@generator)" version="-1" implicit="yes" />
  <roots>
    <node type="tpf8.MappingConfiguration" typeId="tpf8.1095416546421" id="1216906848218">
      <property name="name" nameId="tpck.1169194664001" value="main" />
    </node>
    <node type="tpsk.Project" typeId="tpsk.1196851066733" id="1216906941020">
      <property name="name" nameId="tpck.1169194664001" value="project" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="1219772393477">
      <property name="name" nameId="tpck.1169194664001" value="reduce_PathHolder" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="tpsj.1216907456863" resolveInfo="PathHolder" />
    </node>
    <node type="tpf8.TemplateDeclaration" typeId="tpf8.1092059087312" id="1224775844691">
      <property name="name" nameId="tpck.1169194664001" value="reduce_ProjectDescriptionReference" />
      <link role="applicableConcept" roleId="tpf8.1168285871518" targetNodeId="tpsj.1224775496043" resolveInfo="ProjectDescriptionReference" />
    </node>
  </roots>
  <root id="1216906848218">
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="1219772386887">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="tpsj.1216907456863" resolveInfo="PathHolder" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="1219772393480">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="1219772393477" resolveInfo="reduce_PathHolder" />
      </node>
    </node>
    <node role="reductionMappingRule" roleId="tpf8.1167328349397" type="tpf8.Reduction_MappingRule" typeId="tpf8.1167327847730" id="1224775831879">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="tpsj.1224775496043" resolveInfo="ProjectDescriptionReference" />
      <node role="ruleConsequence" roleId="tpf8.1169672767469" type="tpf8.TemplateDeclarationReference" typeId="tpf8.1168559333462" id="1224775844695">
        <link role="template" roleId="tpf8.1722980698497626483" targetNodeId="1224775844691" resolveInfo="reduce_ProjectDescriptionReference" />
      </node>
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1216910717604">
      <property name="name" nameId="tpck.1169194664001" value="ModuleToClassesProperty" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1216745525843" resolveInfo="ModuleDescription" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpsk.1196851107341" resolveInfo="PropertyDeclaration" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1216908497258">
      <property name="name" nameId="tpck.1169194664001" value="CyclesToSourcePaths" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1216904128547" resolveInfo="Cycle" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="ddum.353793545802643477" resolveInfo="GenericCall" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1216908579851">
      <property name="name" nameId="tpck.1169194664001" value="CyclesToClasspaths" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1216904128547" resolveInfo="Cycle" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="ddum.353793545802643477" resolveInfo="GenericCall" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1216913306006">
      <property name="name" nameId="tpck.1169194664001" value="CyclesToTargets" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1216904128547" resolveInfo="Cycle" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpsk.1196851099544" resolveInfo="TargetDeclaration" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1219772315512">
      <property name="name" nameId="tpck.1169194664001" value="MacroToExternalProperty" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1219418780635" resolveInfo="Macros" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpsk.1219147669362" resolveInfo="ExternalPropertyDeclaration" />
    </node>
    <node role="mappingLabel" roleId="tpf8.1200911492601" type="tpf8.MappingLabelDeclaration" typeId="tpf8.1200911316486" id="1224775923722">
      <property name="name" nameId="tpck.1169194664001" value="DescriptionToProject" />
      <link role="sourceConcept" roleId="tpf8.1200911342686" targetNodeId="tpsj.1216745453338" resolveInfo="ProjectDescription" />
      <link role="targetConcept" roleId="tpf8.1200913004646" targetNodeId="tpsk.1196851066733" resolveInfo="Project" />
    </node>
    <node role="rootMappingRule" roleId="tpf8.1167514678247" type="tpf8.Root_MappingRule" typeId="tpf8.1167514355419" id="1216909134654">
      <link role="applicableConcept" roleId="tpf8.1167169349424" targetNodeId="tpsj.1216745453338" resolveInfo="Description" />
      <link role="template" roleId="tpf8.1167514355421" targetNodeId="1216906941020" resolveInfo="project" />
      <link role="labelDeclaration" roleId="tpf8.1200917515464" targetNodeId="1224775923722" resolveInfo="DescriptionToProject" />
    </node>
  </root>
  <root id="1216906941020">
    <node role="property" roleId="tpsk.1200425668297" type="tpsk.ExternalPropertyDeclaration" typeId="tpsk.1219147669362" id="1219773202894">
      <property name="name" nameId="tpck.1169194664001" value="macro" />
      <property name="checkOnStart" nameId="tpsk.1219774190534" value="false" />
      <node role="type" roleId="tpsk.1196870993204" type="tpsk.FileType" typeId="tpsk.1199032398223" id="1219773202896" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1219773202897">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1219772315512" resolveInfo="MacroToExternalProperty" />
        <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1219773202898">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219773202899">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1224859297798">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1224859305494">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1224859303856" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1224859307189">
                  <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1219418803994" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1219773202904">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1219773202905">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219773202906">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219773202907">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219773202908">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219773202909" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1219773202910">
                  <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="property" roleId="tpsk.1200425668297" type="tpsk.PropertyDeclaration" typeId="tpsk.1196851107341" id="1216910610642">
      <property name="name" nameId="tpck.1169194664001" value="module.classes" />
      <node role="type" roleId="tpsk.1196870993204" type="tpsk.FileType" typeId="tpsk.1199032398223" id="1216910631993" />
      <node role="propertyValue" roleId="tpsk.1196851904859" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1216910634579">
        <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1216910634580">
          <property name="value" nameId="tpsk.1196861024475" value="" />
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="3791907277386824348">
          <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="3791907277386824349">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="3791907277386824350">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3791907277386824351">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3791907277386824352">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="3791907277386824353" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3791907277386824354">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpsj.1216907884130" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216910640245">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1216910717604" resolveInfo="ModuleToClassesProperty" />
        <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216910640246">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216910640247">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216910644454">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7857794759872176559">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216910644519">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216910644455" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetDescendantsOperation" typeId="tp25.1171305280644" id="1216910647260">
                    <node role="parameter" roleId="tp25.1144104376918" type="tp25.OperationParm_Concept" typeId="tp25.1144101972840" id="1216910647261">
                      <node role="conceptArgument" roleId="tp25.1207343664468" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="1216910649394">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpsj.1216745525843" resolveInfo="ModuleDescription" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp2q.SortOperation" typeId="tp2q.1205679737078" id="7857794759872176565">
                  <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7857794759872176566">
                    <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7857794759872176567">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7857794759872178941">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7857794759872178945">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7857794759872178942">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7857794759872176568" resolveInfo="it" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7857794759872200317">
                            <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="7857794759872176568">
                      <property name="name" nameId="tpck.1169194664001" value="it" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="2108863436754489801" />
                    </node>
                  </node>
                  <node role="ascending" roleId="tp2q.1205679832066" type="tp2q.SortDirection" typeId="tp2q.1178286324487" id="7857794759872176570">
                    <property name="value" nameId="tpee.1068580123138" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1216910654588">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1216910654589">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216910654590">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216910660309">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1216910669904">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1216910670764">
                  <property name="value" nameId="tpee.1070475926801" value=".classes" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216910660568">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216910660310" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1216910662350">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="paths" roleId="tpsk.1198941222782" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218716149639">
      <property name="id" nameId="ddum.353793545802643481" value="common.classpath" />
      <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
      <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218716216470">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1218716221358">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814624" resolveInfo="path" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1218716225632">
            <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1218716225633">
              <property name="value" nameId="tpsk.1196861024475" value="common.class.path" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1219772645176">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1219772645177">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772645178">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772649009">
                    <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772649010" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1218716231752">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1218716231753">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1218716231754">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1218717514191">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1218717514224">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1218717514192" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1218717517191">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1218717471247" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="paths" roleId="tpsk.1198941222782" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216907108409">
      <property name="id" nameId="ddum.353793545802643481" value="id.sources" />
      <property name="shortDescription" nameId="tpck.1156234966388" value="sources" />
      <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1216907163429">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="id" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1216907163430">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216907163431">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216907196565">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1216907205442">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1216907206301">
                  <property name="value" nameId="tpee.1070475926801" value=".src" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216907197654">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216907196566" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1216907200987">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216907170432">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1216908497258" resolveInfo="CyclesToSourcePaths" />
        <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216907170433">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216907170434">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216907180942">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216907181804">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216907180943" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216907188316">
                  <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904202472" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216908092027">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1216908097214">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814624" resolveInfo="path" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1216908103578">
            <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1216908103579">
              <property name="value" nameId="tpsk.1196861024475" value="source.path" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1219772677481">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1219772677482">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772677483">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772681420">
                    <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772681421" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908116515">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908116516">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908116517">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908165438">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908166778">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908165439" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216908169096">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908217083">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908217084">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908217085">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908221066">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908222057">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908221067" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216908224079">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216907278096" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="paths" roleId="tpsk.1198941222782" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216908261229">
      <property name="id" nameId="ddum.353793545802643481" value="id.classpaths" />
      <property name="shortDescription" nameId="tpck.1156234966388" value="classpaths" />
      <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1216908261230">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="id" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1216908261231">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908261232">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908261233">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1216908261234">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1216908261235">
                  <property name="value" nameId="tpee.1070475926801" value=".classpaths" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908261236">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908261237" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1216908261238">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908261239">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1216908579851" resolveInfo="CyclesToClasspaths" />
        <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908261240">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908261241">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908261242">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908261243">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908261244" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216908261245">
                  <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904202472" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216908261246">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1216908261247">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814624" resolveInfo="path" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1216908337067">
            <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1216908337068">
              <property name="value" nameId="tpsk.1196861024475" value="module.class.path" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1219772732041">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1219772732042">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772732043">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772735646">
                    <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772735647" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908261257">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908261258">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908261259">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908261260">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908261261">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908261262" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216908261263">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908261264">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908261265">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908261266">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908261267">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908261268">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908261269" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216910034047">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216907553591" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218648822691">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1218648843637">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814624" resolveInfo="path" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1218648847941">
            <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1218648847942">
              <property name="value" nameId="tpsk.1196861024475" value="cycle.class.path" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1219772811029">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1219772811030">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772811031">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772852251">
                    <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772852252" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1218648827659">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1218648827660">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1218648827661">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1218648832594">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1218648833663">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1218648832595" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1218648835886">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1218645689530" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218716200995">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1218716203957">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814626" resolveInfo="refid" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.CallReference" typeId="tpsk.1200511852076" id="1218716205477">
            <link role="call" roleId="tpsk.1200511904172" targetNodeId="1218716149639" resolveInfo="mps.classpath" />
          </node>
        </node>
      </node>
    </node>
    <node role="target" roleId="tpsk.1196851079482" type="tpsk.TargetDeclaration" typeId="tpsk.1196851099544" id="1217528543877">
      <property name="name" nameId="tpck.1169194664001" value="compile.all" />
      <node role="depends" roleId="tpsk.1196853776690" type="tpsk.TargetReference" typeId="tpsk.1196852921336" id="1217528698470">
        <link role="targetDeclaration" roleId="tpsk.1196852953065" targetNodeId="1216906941021" resolveInfo="compile.cycle" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1217528708607">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1217528708608">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1217528708609">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1217528796325">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1217528796363">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1217528796326" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1217528797691">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904202472" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1217528713105">
          <property name="linkRole" nameId="tpck.1757699476691236116" value="targetDeclaration" />
          <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1217528713106">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1217528713107">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1217528806242">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1217528806995">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1217528806243" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1217528809152">
                    <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216913306006" resolveInfo="CyclesToTargets" />
                    <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1217528819638" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="target" roleId="tpsk.1196851079482" type="tpsk.TargetDeclaration" typeId="tpsk.1196851099544" id="1216906941021">
      <property name="name" nameId="tpck.1169194664001" value="compile.cycle" />
      <node role="propertyList" roleId="tpsk.1200425580778" type="tpsk.PropertyDeclaration" typeId="tpsk.1196851107341" id="763186553349438279">
        <property name="name" nameId="tpck.1169194664001" value="classes.dump" />
        <node role="type" roleId="tpsk.1196870993204" type="tpsk.FileType" typeId="tpsk.1199032398223" id="763186553349438283" />
        <node role="propertyValue" roleId="tpsk.1196851904859" type="tpsk.FileName" typeId="tpsk.1199031681512" id="763186553349438284">
          <node role="value" roleId="tpsk.1199031757132" type="tpsk.PlusOperation" typeId="tpsk.1197108973325" id="763186553349438286">
            <node role="right" roleId="tpsk.1197107881958" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="763186553349438287">
              <property name="value" nameId="tpsk.1196861024475" value=".tmp" />
            </node>
            <node role="left" roleId="tpsk.1197107855106" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438288">
              <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="1216910610642" resolveInfo="module.classes" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="763186553349438289">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="propertyDeclaration" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="763186553349438290">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438291">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438292">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438293">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="763186553349438294" />
                        <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="763186553349438295">
                          <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216910717604" resolveInfo="ModuleToClassesProperty" />
                          <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438296">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438297">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349438298" />
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="763186553349438299">
                                <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetFirstOperation" typeId="tp2q.1165525191778" id="763186553349438300" />
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
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218639189640">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814434" resolveInfo="mkdir" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1218639197026">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814435" resolveInfo="dir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1218639259171">
            <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1218639259172">
              <property name="value" nameId="tpsk.1196861024475" value="source.directory" />
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="1219772868988">
              <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="1219772868989">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772868990">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772873020">
                    <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772873021" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1218639224323">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1218639224324">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1218639224325">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1218639236672">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1218639237617">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1218639236673" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1218639240312">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1218639231741">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1218639231742">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1218639231743">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1218639245497">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1218639247682">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1218639245498" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1218639250038">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216907278096" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1218638782117">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814434" resolveInfo="mkdir" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1218638784673">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814435" resolveInfo="dir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438303">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="763186553349438279" resolveInfo="commonClasses" />
          </node>
        </node>
      </node>
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="763186553349590536">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814434" resolveInfo="mkdir" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349590553">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814435" resolveInfo="dir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349590555">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="1216910610642" resolveInfo="module.classes" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="763186553349590556">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="propertyDeclaration" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="763186553349590557">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349590558">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349590559">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349590560">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="763186553349590561" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="763186553349590562">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216910717604" resolveInfo="ModuleToClassesProperty" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349590563" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="763186553349590538">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="763186553349590539">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349590540">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349590541">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349590545">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349590542" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="763186553349590552">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216908446819">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802813657" resolveInfo="javac" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1216908461817">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802813664" resolveInfo="classpathref" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.CallReference" typeId="tpsk.1200511852076" id="1216908486598">
            <link role="call" roleId="tpsk.1200511904172" targetNodeId="1216908261229" resolveInfo="id.classpaths" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1216908641561">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="call" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1216908641562">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908641563">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908683684">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908684490">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1216908683685" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1216908686390">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216908579851" resolveInfo="CyclesToClasspaths" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908702562" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1216910693162">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802813677" resolveInfo="destdir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438304">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="763186553349438279" resolveInfo="classes.dump" />
          </node>
        </node>
        <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1216908720841">
          <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802813728" resolveInfo="src" />
          <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1216908723859">
            <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814626" resolveInfo="refid" />
            <node role="value" roleId="ddum.353793545802643468" type="tpsk.CallReference" typeId="tpsk.1200511852076" id="1216908727971">
              <link role="call" roleId="tpsk.1200511904172" targetNodeId="1216907108409" resolveInfo="id.sources" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1216908738116">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="call" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1216908738117">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908738118">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908784002">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908784956">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1216908784003" />
                        <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1216908787964">
                          <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216908497258" resolveInfo="CyclesToSourcePaths" />
                          <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908797013" />
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
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="763186553349438306">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802813657" resolveInfo="javac" />
        <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="763186553349438413">
          <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802813728" resolveInfo="src" />
          <node role="nested" roleId="tpsk.1196858559206" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="763186553349438414">
            <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802814623" resolveInfo="path" />
            <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349438415">
              <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802814624" resolveInfo="path" />
              <node role="value" roleId="ddum.353793545802643468" type="tpsk.FileName" typeId="tpsk.1199031681512" id="763186553349438416">
                <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="763186553349438417">
                  <property name="value" nameId="tpsk.1196861024475" value="source.path" />
                </node>
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.CopySrcNodeMacro" typeId="tpf8.1114706874351" id="763186553349438418">
                  <node role="sourceNodeQuery" roleId="tpf8.1168024447342" type="tpf8.SourceSubstituteMacro_SourceNodeQuery" typeId="tpf8.1168024337012" id="763186553349438419">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438420">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438421">
                        <node role="expression" roleId="tpee.1068580123156" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349438422" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="763186553349438423">
              <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="763186553349438424">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438425">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438426">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438427">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349438428" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="763186553349438429">
                        <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216907278096" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349438307">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802813664" resolveInfo="classpathref" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.CallReference" typeId="tpsk.1200511852076" id="763186553349438308">
            <link role="call" roleId="tpsk.1200511904172" targetNodeId="1216908261229" resolveInfo="id.classpaths" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="763186553349438309">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="call" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="763186553349438310">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438311">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438312">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438313">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="763186553349438314" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="763186553349438315">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216908579851" resolveInfo="CyclesToClasspaths" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438353">
                          <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349438316" />
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetAncestorOperation" typeId="tp25.1171407110247" id="763186553349438365">
                            <node role="parameter" roleId="tp25.1144104376918" type="tp25.OperationParm_Concept" typeId="tp25.1144101972840" id="763186553349438366">
                              <node role="conceptArgument" roleId="tp25.1207343664468" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="763186553349438370">
                                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpsj.1216904128547" resolveInfo="Cycle" />
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
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349438380">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802813662" resolveInfo="classpath" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438382">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="763186553349438279" resolveInfo="classes.dump" />
          </node>
        </node>
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349438378">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802813677" resolveInfo="destdir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438388">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="1216910610642" resolveInfo="module.classes" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="763186553349438389">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="propertyDeclaration" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="763186553349438390">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438391">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438392">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438393">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="763186553349438394" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="763186553349438395">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216910717604" resolveInfo="ModuleToClassesProperty" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349521883" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="763186553349438319">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="763186553349438320">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="763186553349438321">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="763186553349438322">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="763186553349438326">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="763186553349438323" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="763186553349438333">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="763186553349438409">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802812660" resolveInfo="delete" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="763186553349438410">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802812669" resolveInfo="dir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="763186553349438411">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="763186553349438279" resolveInfo="classes.dump" />
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216908353398">
        <link role="mappingLabel" roleId="tpf8.1200912223215" targetNodeId="1216913306006" resolveInfo="CyclesToTargets" />
        <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216908353399">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908353400">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908357389">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908358070">
                <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908357390" />
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216908360240">
                  <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904202472" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1216908364133">
        <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
        <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1216908364134">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216908364135">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216908366893">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1216908372807">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216908375419">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216908374173" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1216908377312">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1216908366894">
                  <property name="value" nameId="tpee.1070475926801" value="compile." />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="depends" roleId="tpsk.1196853776690" type="tpsk.TargetReference" typeId="tpsk.1196852921336" id="1216913188277">
        <link role="targetDeclaration" roleId="tpsk.1196852953065" targetNodeId="1216906941021" resolveInfo="compile.modules" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1216913286053">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1216913286054">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216913286055">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216913293488">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216913294434">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216913293489" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1216913297788">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216913255468" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1216913346655">
          <property name="linkRole" nameId="tpck.1757699476691236116" value="targetDeclaration" />
          <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1216913346656">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216913346657">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216913355954">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216913357207">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1216913355955" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1216913358742">
                    <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216913306006" resolveInfo="CyclesToTargets" />
                    <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216913376646">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216913373425" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1216913380064">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpsj.1216913241580" />
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
    <node role="target" roleId="tpsk.1196851079482" type="tpsk.TargetDeclaration" typeId="tpsk.1196851099544" id="1218718426661">
      <property name="name" nameId="tpck.1169194664001" value="clean.classes" />
      <node role="taskCall" roleId="tpsk.1196851542249" type="ddum.TaskCall" typeId="ddum.353793545802643477" id="1235489462079">
        <link role="declaration" roleId="ddum.353793545802643478" targetNodeId="adh8.353793545802812660" resolveInfo="delete" />
        <node role="atributes" roleId="ddum.353793545802643479" type="ddum.Attribute" typeId="ddum.353793545802643466" id="1235489617346">
          <link role="attributeDeclaration" roleId="ddum.353793545802643467" targetNodeId="adh8.353793545802812669" resolveInfo="dir" />
          <node role="value" roleId="ddum.353793545802643468" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="1235489622941">
            <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="1216910610642" resolveInfo="module.classes" />
            <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1235489624446">
              <property name="linkRole" nameId="tpck.1757699476691236116" value="propertyDeclaration" />
              <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1235489624447">
                <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1235489624448">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1235489627272">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1235489627273">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1235489627274" />
                      <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1235489627275">
                        <link role="label" roleId="tpf3.1216860049628" targetNodeId="1216910717604" resolveInfo="ModuleToClassesProperty" />
                        <node role="inputNode" roleId="tpf3.1216860049632" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1235489627276" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1235489482145">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1235489482146">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1235489482147">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1235489491824">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1235489491825">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1235489491826" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1235489491827">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904202472" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.LoopMacro" typeId="tpf8.1118786554307" id="1235489497641">
          <node role="sourceNodesQuery" roleId="tpf8.1167952069335" type="tpf8.SourceSubstituteMacro_SourceNodesQuery" typeId="tpf8.1167951910403" id="1235489497642">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1235489497643">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1235489510620">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1235489510621">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1235489510622" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1235489510623">
                    <link role="link" roleId="tp25.1138056546658" targetNodeId="tpsj.1216904141894" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.RootTemplateAnnotation" typeId="tpf8.1168619357332" id="1216906941023">
      <link role="applicableConcept" roleId="tpf8.1168619429071" targetNodeId="tpsj.1216745453338" resolveInfo="Description" />
    </node>
    <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1216906986544">
      <property name="propertyName" nameId="tpck.1757699476691236117" value="name" />
      <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1216906986545">
        <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1216906986546">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1216906993863">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1216906993901">
              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1216906993864" />
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1216906996003">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="default" roleId="tpsk.1196859969927" type="tpsk.TargetReference" typeId="tpsk.1196852921336" id="1217528681892">
      <link role="targetDeclaration" roleId="tpsk.1196852953065" targetNodeId="1217528543877" resolveInfo="compile.all" />
    </node>
    <node role="basedir" roleId="tpsk.1199036079290" type="tpsk.FileName" typeId="tpsk.1199031681512" id="7857794759871997466">
      <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="7857794759871997467">
        <property name="value" nameId="tpsk.1196861024475" value="" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="7857794759872021242">
          <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
          <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="7857794759872021243">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7857794759872021244">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7857794759872021245">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7857794759872021247">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7857794759872021246" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7857794759872021251">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpsj.7857794759871997326" resolveInfo="basedir" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="7857794759871997502">
        <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="7857794759871997503">
          <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="7857794759871997504">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7857794759871999870">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7857794759872021236">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7857794759871999872">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="7857794759871999871" />
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="7857794759872021235">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpsj.7857794759871997326" resolveInfo="basedir" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.IsNotEmptyOperation" typeId="tpee.1225271408483" id="7857794759872021240" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1219772393477">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpsk.Project" typeId="tpsk.1196851066733" id="1219772400792">
      <property name="name" nameId="tpck.1169194664001" value="project" />
      <node role="property" roleId="tpsk.1200425668297" type="tpsk.ExternalPropertyDeclaration" typeId="tpsk.1219147669362" id="1219772456841">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpsk.1196870993204" type="tpsk.FileType" typeId="tpsk.1199032398223" id="1219772460274" />
      </node>
      <node role="property" roleId="tpsk.1200425668297" type="tpsk.PropertyDeclaration" typeId="tpsk.1196851107341" id="1219772422381">
        <property name="name" nameId="tpck.1169194664001" value="property" />
        <node role="type" roleId="tpsk.1196870993204" type="tpsk.FileType" typeId="tpsk.1199032398223" id="1219772428783" />
        <node role="propertyValue" roleId="tpsk.1196851904859" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1219772437661">
          <node role="value" roleId="tpsk.1199031757132" type="tpsk.PlusOperation" typeId="tpsk.1197108973325" id="1219772465105">
            <node role="right" roleId="tpsk.1197107881958" type="tpsk.PlusOperation" typeId="tpsk.1197108973325" id="1219772480352">
              <node role="right" roleId="tpsk.1197107881958" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1219772481521">
                <property name="value" nameId="tpsk.1196861024475" value="path.relative.to.macro" />
                <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1219772533882">
                  <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                  <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1219772533883">
                    <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772533884">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772538741">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7266929446532741747">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772539817">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772538742" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1219772547592">
                              <link role="property" roleId="tp25.1138056395725" targetNodeId="tpsj.1216907465733" resolveInfo="path" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7266929446532741751">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~String%dreplace(java%dlang%dCharSequence,java%dlang%dCharSequence)%cjava%dlang%dString" resolveInfo="replace" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7266929446532741752">
                              <property name="value" nameId="tpee.1070475926801" value="\\" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7266929446532741754">
                              <property name="value" nameId="tpee.1070475926801" value="/" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="left" roleId="tpsk.1197107855106" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1219772477562">
                <property name="value" nameId="tpsk.1196861024475" value="/" />
              </node>
            </node>
            <node role="left" roleId="tpsk.1197107855106" type="tpsk.PropertyReference" typeId="tpsk.1196853662806" id="1219772464054">
              <link role="propertyDeclaration" roleId="tpsk.1196853671400" targetNodeId="1219772456841" resolveInfo="macro" />
              <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1219772509207">
                <property name="linkRole" nameId="tpck.1757699476691236116" value="propertyDeclaration" />
                <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1219772509208">
                  <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772509209">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772513081">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772513889">
                        <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1219772513082" />
                        <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1219772515571">
                          <link role="label" roleId="tpf3.1216860049628" targetNodeId="1219772315512" resolveInfo="MacroToExternalProperty" />
                          <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772527579">
                            <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772526752" />
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1219772529437">
                              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpsj.1219418823334" />
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
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="1219772488751" />
          <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.IfMacro" typeId="tpf8.1118773211870" id="1219772493888">
            <node role="conditionFunction" roleId="tpf8.1167945861827" type="tpf8.IfMacro_Condition" typeId="tpf8.1167945743726" id="1219772493889">
              <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772493890">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772498715">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772502530">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772500054">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772498716" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1219772501815">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpsj.1219418823334" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsNotNullOperation" typeId="tp25.1172008320231" id="1219772504859" />
                  </node>
                </node>
              </node>
            </node>
            <node role="alternativeConsequence" roleId="tpf8.1194989344771" type="tpf8.InlineTemplate_RuleConsequence" typeId="tpf8.1177093525992" id="1219772562559">
              <node role="templateNode" roleId="tpf8.1177093586806" type="tpsk.FileName" typeId="tpsk.1199031681512" id="1219772571806">
                <node role="value" roleId="tpsk.1199031757132" type="tpsk.StringLiteral" typeId="tpsk.1196861005114" id="1219772582495">
                  <property name="value" nameId="tpsk.1196861024475" value="full.path" />
                  <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.PropertyMacro" typeId="tpf8.1087833241328" id="1219772582496">
                    <property name="propertyName" nameId="tpck.1757699476691236117" value="value" />
                    <node role="propertyValueFunction" roleId="tpf8.1167756362303" type="tpf8.PropertyMacro_GetPropertyValue" typeId="tpf8.1167756080639" id="1219772582497">
                      <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1219772582498">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1219772582499">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7266929446532739204">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1219772582500">
                              <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1219772582501" />
                              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1219772582502">
                                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpsj.1216907465733" resolveInfo="path" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7266929446532739565">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~String%dreplace(java%dlang%dCharSequence,java%dlang%dCharSequence)%cjava%dlang%dString" resolveInfo="replace" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7266929446532741744">
                                <property name="value" nameId="tpee.1070475926801" value="\\" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7266929446532741746">
                                <property name="value" nameId="tpee.1070475926801" value="/" />
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
      </node>
      <node role="target" roleId="tpsk.1196851079482" type="tpsk.TargetDeclaration" typeId="tpsk.1196851099544" id="1219772400793">
        <property name="name" nameId="tpck.1169194664001" value="target" />
      </node>
      <node role="default" roleId="tpsk.1196859969927" type="tpsk.TargetReference" typeId="tpsk.1196852921336" id="1219772419133">
        <link role="targetDeclaration" roleId="tpsk.1196852953065" targetNodeId="1219772400793" resolveInfo="target" />
      </node>
    </node>
  </root>
  <root id="1224775844691">
    <node role="contentNode" roleId="tpf8.1092060348987" type="tpsk.Project" typeId="tpsk.1196851066733" id="1224775852955">
      <property name="name" nameId="tpck.1169194664001" value="project" />
      <node role="importProject" roleId="tpsk.1201702862229" type="tpsk.ImportProject" typeId="tpsk.1201702638416" id="1224775872219">
        <link role="project" roleId="tpsk.1201702650857" targetNodeId="1216906941020" resolveInfo="project" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.TemplateFragment" typeId="tpf8.1095672379244" id="1224775895094" />
        <node role="_$attribute" roleId="tpck.5169995583184591170" type="tpf8.ReferenceMacro" typeId="tpf8.1088761943574" id="1224775901837">
          <property name="linkRole" nameId="tpck.1757699476691236116" value="project" />
          <node role="referentFunction" roleId="tpf8.1167770376702" type="tpf8.ReferenceMacro_GetReferent" typeId="tpf8.1167770111131" id="1224775901838">
            <node role="body" roleId="tpee.1137022507850" type="tpee.StatementList" typeId="tpee.1068580123136" id="1224775901839">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1224776195719">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1224776197281">
                  <node role="operand" roleId="tpee.1197027771414" type="tpf3.TemplateFunctionParameter_generationContext" typeId="tpf3.1216860049635" id="1224776195720" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpf3.GenerationContextOp_GetOutputByLabelAndInput" typeId="tpf3.1216860049627" id="1224776203180">
                    <link role="label" roleId="tpf3.1216860049628" targetNodeId="1224775923722" resolveInfo="DescriptionToProject" />
                    <node role="inputNode" roleId="tpf3.1216860049632" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1224776219230">
                      <node role="operand" roleId="tpee.1197027771414" type="tpf8.TemplateFunctionParameter_sourceNode" typeId="tpf8.1167169188348" id="1224776217701" />
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1224776226881">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpsj.1224775730869" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="target" roleId="tpsk.1196851079482" type="tpsk.TargetDeclaration" typeId="tpsk.1196851099544" id="1224775852956">
        <property name="name" nameId="tpck.1169194664001" value="t" />
      </node>
      <node role="default" roleId="tpsk.1196859969927" type="tpsk.TargetReference" typeId="tpsk.1196852921336" id="1224775865923">
        <link role="targetDeclaration" roleId="tpsk.1196852953065" targetNodeId="1224775852956" resolveInfo="t" />
      </node>
    </node>
  </root>
</model>

