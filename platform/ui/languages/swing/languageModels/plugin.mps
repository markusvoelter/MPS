<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:6473b625-3a7a-4043-9760-94a8b507467f(jetbrains.mps.ui.swing.plugin)">
  <persistence version="7" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="ceab5195-25ea-4f22-9b92-103b95ca8c0c(jetbrains.mps.lang.core)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="3a13115c-633c-4c5c-bbcc-75c4219e9555(jetbrains.mps.lang.quotation)" />
  <import index="oio" modelUID="r:9515a1bb-7c0a-41f9-bbe5-1afbeffea2f9(jetbrains.mps.ui.modeling.plugin)" version="-1" />
  <import index="glhg" modelUID="f:java_stub#jetbrains.mps.project.structure.modules(jetbrains.mps.project.structure.modules@java_stub)" version="-1" />
  <import index="yvju" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="sk9e" modelUID="r:490ca91d-cc9b-4e08-b398-1a8bb08d54bb(jetbrains.mps.ui.plugin)" version="-1" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvjr" modelUID="r:00000000-0000-4000-0000-011c89590373(jetbrains.mps.baseLanguage.classifiers.structure)" version="0" implicit="yes" />
  <import index="yvjf" modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="g6l4" modelUID="r:6473b625-3a7a-4043-9760-94a8b507467f(jetbrains.mps.ui.swing.plugin)" version="-1" implicit="yes" />
  <roots>
    <node type="yvju.ApplicationPluginDeclaration" typeId="yvju.1215279937187:23" id="6661832029303965065">
      <property name="name" nameId="yvnu.1169194664001:0" value="EditorExtension" />
    </node>
    <node type="yvju.ApplicationPluginDeclaration" typeId="yvju.1215279937187:23" id="2441084687258581572">
      <property name="name" nameId="yvnu.1169194664001:0" value="Variant" />
    </node>
  </roots>
  <root id="6661832029303965065">
    <node role="fieldDeclaration" roleId="yvju.1215279937191:23" type="yvjr.DefaultClassifierFieldDeclaration" typeId="yvjr.1213999088275:0" id="6661832029303965066">
      <property name="name" nameId="yvnu.1169194664001:0" value="helper" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="6661832029303965067" />
      <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="6661832029303965068">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="oio.6661832029303857606" resolveInfo="EditorExtensionHelper" />
      </node>
    </node>
    <node role="initBlock" roleId="yvju.1215279937189:23" type="yvju.ApplicationPluginInitBlock" typeId="yvju.1215278261851:23" id="6661832029303965069">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6661832029303965070">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6661832029303965071">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6661832029303965072">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6661832029303965073">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6661832029303965074">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="oio.6661832029303857608" resolveInfo="EditorExtensionHelper" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="6661832029303965075">
                  <property name="value" nameId="yvor.1070475926801:3" value="jetbrains.mps.ui.swing" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965076">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="6661832029303965077" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="6661832029303965078">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="6661832029303965066" resolveInfo="helper" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6661832029303965079">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965080">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965081">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="6661832029303965082" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="6661832029303965083">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="6661832029303965066" resolveInfo="helper" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6661832029303965084">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="oio.6661832029303857612" resolveInfo="init" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="disposeBlock" roleId="yvju.1215279937190:23" type="yvju.ApplicationPluginDisposeBlock" typeId="yvju.1215278396618:23" id="6661832029303965085">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6661832029303965086">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6661832029303965087">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965088">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965089">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="6661832029303965090" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="6661832029303965091">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="6661832029303965066" resolveInfo="helper" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="6661832029303965092">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="oio.6661832029303857616" resolveInfo="dispose" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6661832029303965093">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="6661832029303965094">
            <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="6661832029303965095" />
            <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6661832029303965096">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvjr.ThisClassifierExpression" typeId="yvjr.1205752633985:0" id="6661832029303965097" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvjr.DefaultClassifierFieldAccessOperation" typeId="yvjr.1213999117680:0" id="6661832029303965098">
                <link role="member" roleId="yvjr.1205756909548:0" targetNodeId="6661832029303965066" resolveInfo="helper" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="2441084687258581572">
    <node role="initBlock" roleId="yvju.1215279937189:23" type="yvju.ApplicationPluginInitBlock" typeId="yvju.1215278261851:23" id="2441084687258581573">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2441084687258581574">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2441084687258581575">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="2441084687258581577">
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="sk9e.8117382572454923216" resolveInfo="register" />
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="sk9e.8117382572454923102" resolveInfo="Variants" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="2441084687258581578">
              <node role="parameter" roleId="yviq.1199569906740:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="2441084687258581580">
                <property name="name" nameId="yvnu.1169194664001:0" value="vars" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2441084687258581582">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="sk9e.8117382572454923102" resolveInfo="Variants" />
                </node>
              </node>
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="2441084687258581579">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2441084687258581583">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2441084687258581585">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="2441084687258581584">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2441084687258581580" resolveInfo="vars" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2441084687258581589">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="sk9e.8117382572454923114" resolveInfo="addVariant" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="2441084687258581590">
                        <property name="value" nameId="yvor.1070475926801:3" value="Swing" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="2441084687258585131">
                        <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="2441084687258585132">
                          <node role="expression" roleId="yvor.1070534934092:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2441084687258585133">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2441084687258585134">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="2441084687258585135">
                                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2441084687258585136">
                                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="2441084687258585137">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvjf.Quotation" typeId="yvjf.1196350785113:0" id="2441084687258585138">
                                      <node role="quotedNode" roleId="yvjf.1196350785114:0" type="yvju.ApplicationPluginType" typeId="yvju.1215279025855:23" id="2441084687258585139">
                                        <link role="plugin" roleId="yvju.1215279025857:23" targetNodeId="2441084687258581572" resolveInfo="Variant" />
                                      </node>
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="2441084687258585140">
                                      <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvju.1215279025857:23" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="2441084687258585141" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2441084687258585142">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="2441084687258585143">
                              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
                            </node>
                          </node>
                          <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="2441084687258585144">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~Language" resolveInfo="Language" />
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
  </root>
</model>

