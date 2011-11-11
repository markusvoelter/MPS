<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:e26c23c0-c117-4389-8d76-62e09a48aaa5(jetbrains.mps.build.ant.generation.workers)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="f2801650-65d5-424e-bb1b-463a8781b786(jetbrains.mps.baseLanguage.javadoc)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="696c1165-4a59-463b-bc5d-902caab85dd0(jetbrains.mps.make.facet)" />
  <language namespace="a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)" />
  <import index="k7g3" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(java.util@java_stub)" version="-1" />
  <import index="yo81" modelUID="r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)" version="-1" />
  <import index="ud0o" modelUID="r:71895ceb-c89d-4545-aa38-89d1cd891f17(jetbrains.mps.make.facet)" version="-1" />
  <import index="i9so" modelUID="r:9e5578e0-37f0-4c9b-a301-771bcb453678(jetbrains.mps.make.script)" version="-1" />
  <import index="fn29" modelUID="r:6ba2667b-185e-45cd-ac65-e4b9d66da28e(jetbrains.mps.smodel.resources)" version="-1" />
  <import index="fxg7" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)" version="-1" />
  <import index="rk9m" modelUID="r:f8580193-afc4-4673-a635-d4757ca591cf(jetbrains.mps.internal.make.runtime.util)" version="-1" />
  <import index="hfuk" modelUID="r:b25dd364-bc3f-4a66-97d1-262009610c5e(jetbrains.mps.make)" version="-1" />
  <import index="53gy" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util.concurrent(JDK/java.util.concurrent@java_stub)" version="-1" />
  <import index="kp22" modelUID="f:java_stub#fba399db-f591-45dc-a279-e2a2a986e262#org.apache.tools.ant(jetbrains.mps.build.generictasks/org.apache.tools.ant@java_stub)" version="-1" />
  <import index="xqpa" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang.reflect(JDK/java.lang.reflect@java_stub)" version="-1" />
  <import index="tpcq" modelUID="r:00000000-0000-4000-0000-011c89590286(jetbrains.mps.lang.core.plugin)" version="-1" />
  <import index="tpec" modelUID="r:00000000-0000-4000-0000-011c895902c8(jetbrains.mps.baseLanguage.plugin)" version="-1" />
  <import index="bgxn" modelUID="r:01d327ba-040c-402c-a2b6-8832116588df(jetbrains.mps.lang.plugin.plugin)" version="-1" />
  <import index="4rvk" modelUID="r:7cb72aee-d3e2-47e9-9964-3abda6a73a9a(jetbrains.mps.make.service)" version="-1" />
  <import index="c67m" modelUID="r:72b5a3b6-ca0e-4104-ae9d-5cccdd8a010c(jetbrains.mps.build.gentest.plugin)" version="-1" />
  <import index="yif3" modelUID="r:13ec431d-483d-451c-a648-ffefde4fef51(jetbrains.mps.internal.make.runtime.backports)" version="-1" />
  <import index="644x" modelUID="r:7b2ffdb7-2bfc-4488-8c0c-ee8fe93fe3c1(jetbrains.mps.build.ant)" version="-1" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)" version="-1" />
  <import index="9ymv" modelUID="r:b8feab60-1700-41b4-b4af-29cbd0faef88(jetbrains.mps.build.ant.generation.unittest)" version="-1" />
  <import index="kio7" modelUID="r:f80180a9-2bac-487b-83fc-3ef65f97aea3(jetbrains.mps.build.ant.generation)" version="-1" />
  <import index="59et" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.vfs(MPS.Core/jetbrains.mps.vfs@java_stub)" version="-1" />
  <import index="vsqj" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project(MPS.Core/jetbrains.mps.project@java_stub)" version="-1" />
  <import index="cu2c" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.smodel(MPS.Core/jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="xjo8" modelUID="f:java_stub#86441d7a-e194-42da-81a5-2161ec62a379#jetbrains.mps.ide.generator(MPS.Workbench/jetbrains.mps.ide.generator@java_stub)" version="-1" />
  <import index="bq0a" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.messages(MPS.Core/jetbrains.mps.messages@java_stub)" version="-1" />
  <import index="ff4b" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.progress(MPS.Core/jetbrains.mps.progress@java_stub)" version="-1" />
  <import index="mysr" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project.structure.project(MPS.Core/jetbrains.mps.project.structure.project@java_stub)" version="-1" />
  <import index="y5px" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.generator(MPS.Core/jetbrains.mps.generator@java_stub)" version="-1" />
  <import index="to5d" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.logging(MPS.Core/jetbrains.mps.logging@java_stub)" version="-1" />
  <import index="zss2" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#jetbrains.mps.project.structure.project.testconfigurations(MPS.Core/jetbrains.mps.project.structure.project.testconfigurations@java_stub)" version="-1" />
  <import index="68ai" modelUID="f:java_stub#6ed54515-acc8-4d1e-a16c-9fd6cfe951ea#org.jetbrains.annotations(MPS.Core/org.jetbrains.annotations@java_stub)" version="-1" />
  <import index="d4yz" modelUID="r:9aacb4c5-da89-46f5-8c41-93d864945583(jetbrains.mps.build.ant.util)" version="-1" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="cx9y" modelUID="r:309aeee7-bee8-445c-b31d-35928d1da75f(jetbrains.mps.baseLanguage.tuples.structure)" version="2" implicit="yes" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="m373" modelUID="r:4095af4f-a097-4799-aaa9-03df087ddfa6(jetbrains.mps.baseLanguage.javadoc.structure)" version="5" implicit="yes" />
  <import index="vvvw" modelUID="r:b16ff46d-fa06-479d-9f5c-5b6e17e7f1b2(jetbrains.mps.make.facet.structure)" version="1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <roots>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019498548">
      <property name="name" nameId="tpck.1169194664001" value="GeneratorWorker" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019499553">
      <property name="name" nameId="tpck.1169194664001" value="TestGenerationWorker" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7874190907999476498">
      <property name="name" nameId="tpck.1169194664001" value="BuildMakeService" />
    </node>
  </roots>
  <root id="7795897115019498548">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498549" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498550">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886909" resolveInfo="MpsWorker" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019498611">
      <property name="name" nameId="tpck.1169194664001" value="MyMessageHandler" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498612">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019498613">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationErrors" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498614">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391345" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498616" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499249">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499250">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391258" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019498617">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationWarnings" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498618">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391373" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498620" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499252">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499253">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391139" />
          </node>
        </node>
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019498621">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498622" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499255" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498623">
        <property name="name" nameId="tpck.1169194664001" value="handle" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498624" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498625" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498626">
          <property name="name" nameId="tpck.1169194664001" value="msg" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3657107665441526075">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessage" resolveInfo="IMessage" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499256">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7795897115019499257">
            <node role="expression" roleId="tpee.1163670766145" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499258">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499259">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499260">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetKind()%cjetbrains%dmps%dmessages%dMessageKind" resolveInfo="getKind" />
              </node>
            </node>
            <node role="defaultBlock" roleId="tpee.1163670592366" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499261" />
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7795897115019499262">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7795897115019499263">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dERROR" resolveInfo="ERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499264">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499265">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499266">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499267">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" resolveInfo="GeneratorWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499268">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888363" resolveInfo="error" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499269">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499270">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499271">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019499272">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019499273">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499274">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499275">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499276">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019499277" />
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019499278">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499279">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499280">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499281">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499282">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498613" resolveInfo="myGenerationErrors" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499283">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499284">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499285">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499286">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499287">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499288">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499289">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499290">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498613" resolveInfo="myGenerationErrors" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499291">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499292">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499293">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="644x.4003657351907886909" resolveInfo="MpsWorker" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888416" resolveInfo="extractStackTrace" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499294">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499295">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499296">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499297">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7795897115019499298" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7795897115019499299">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7795897115019499300">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dWARNING" resolveInfo="WARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499301">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499302">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499303">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499304">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" resolveInfo="GeneratorWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499305">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888338" resolveInfo="warning" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499306">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499307">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499308">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499309">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499310">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499311">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498617" resolveInfo="myGenerationWarnings" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499312">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499313">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499314">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499315">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7795897115019499316" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7795897115019499317">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7795897115019499318">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dINFORMATION" resolveInfo="INFORMATION" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499319">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499320">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499321">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499322">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" resolveInfo="GeneratorWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499323">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888328" resolveInfo="verbose" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499324">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499325">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499326">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7795897115019499327" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498628">
        <property name="name" nameId="tpck.1169194664001" value="getGenerationErrors" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498629" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498630">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391230" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499328">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019499329">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499330">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498613" resolveInfo="myGenerationErrors" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498632">
        <property name="name" nameId="tpck.1169194664001" value="getGenerationWarnings" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498633" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498634">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391348" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499331">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019499332">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499333">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498617" resolveInfo="myGenerationWarnings" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498636">
        <property name="name" nameId="tpck.1169194664001" value="clean" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498637" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498638" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499334">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499335">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499336">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499337">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498613" resolveInfo="myGenerationErrors" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499338">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" resolveInfo="clear" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499339">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499340">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499341">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498617" resolveInfo="myGenerationWarnings" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499342">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" resolveInfo="clear" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498639">
        <property name="name" nameId="tpck.1169194664001" value="clear" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498640" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498641" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499343" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999519102" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7655616008808080917">
      <property name="name" nameId="tpck.1169194664001" value="Graph" />
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808080918">
        <property name="name" nameId="tpck.1169194664001" value="addEdges" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808080919" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7655616008808080920" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808080921">
          <property name="name" nameId="tpck.1169194664001" value="from" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080922">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808080923">
          <property name="name" nameId="tpck.1169194664001" value="to" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.VariableArityType" typeId="tpee.1219920932475" id="7655616008808080924">
            <node role="componentType" roleId="tpee.1219921048460" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080925">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808080926">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7655616008808080927">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7655616008808080928">
              <property name="name" nameId="tpck.1169194664001" value="fw" />
              <node role="type" roleId="tpee.5680397130376446158" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808080929">
                <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080930">
                  <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                </node>
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808080931">
                <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808080932">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080921" resolveInfo="from" />
                </node>
                <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080933">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081088" resolveInfo="fwEdges" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7655616008808080934">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7655616008808080935">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080936">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080928" resolveInfo="fw" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7655616008808080937" />
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808080938">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080939">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808080940">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808080941">
                    <node role="creator" roleId="tpee.1145553007750" type="tp2q.ListCreatorWithInit" typeId="tp2q.1160600644654" id="7655616008808080942">
                      <node role="elementType" roleId="tp2q.1237721435807" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080943">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080944">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080928" resolveInfo="fw" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080945">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808080946">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080947">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080928" resolveInfo="fw" />
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808080948">
                    <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808080949">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080921" resolveInfo="from" />
                    </node>
                    <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080950">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081088" resolveInfo="fwEdges" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080951">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808080952">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080953">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081081" resolveInfo="vertices" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddSetElementOperation" typeId="tp2q.1226566855640" id="7655616008808080954">
                <node role="argument" roleId="tp2q.1226567214363" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808080955">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080921" resolveInfo="from" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7655616008808080956">
            <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808080957">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080923" resolveInfo="to" />
            </node>
            <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7655616008808080958">
              <property name="name" nameId="tpck.1169194664001" value="next" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080959">
                <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
              </node>
            </node>
            <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808080960">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080961">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808080962">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080963">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080928" resolveInfo="fw" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddElementOperation" typeId="tp2q.1160612413312" id="7655616008808080964">
                    <node role="argument" roleId="tp2q.1160612519549" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080965">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080958" resolveInfo="next" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7655616008808080966">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7655616008808080967">
                  <property name="name" nameId="tpck.1169194664001" value="bk" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808080968">
                    <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080969">
                      <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                    </node>
                  </node>
                  <node role="initializer" roleId="tpee.1068431790190" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808080970">
                    <node role="key" roleId="tp2q.1197932525128" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080971">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080958" resolveInfo="next" />
                    </node>
                    <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080972">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081099" resolveInfo="bkEdges" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7655616008808080973">
                <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7655616008808080974">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080975">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080967" resolveInfo="bk" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7655616008808080976" />
                </node>
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808080977">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080978">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808080979">
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808080980">
                        <node role="creator" roleId="tpee.1145553007750" type="tp2q.ListCreatorWithInit" typeId="tp2q.1160600644654" id="7655616008808080981">
                          <node role="elementType" roleId="tp2q.1237721435807" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808080982">
                            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                          </node>
                        </node>
                      </node>
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080983">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080967" resolveInfo="bk" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080984">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808080985">
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080986">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080967" resolveInfo="bk" />
                      </node>
                      <node role="lValue" roleId="tpee.1068498886295" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808080987">
                        <node role="key" roleId="tp2q.1197932525128" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080988">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080958" resolveInfo="next" />
                        </node>
                        <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080989">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081099" resolveInfo="bkEdges" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080990">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808080991">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080992">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080967" resolveInfo="bk" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddElementOperation" typeId="tp2q.1160612413312" id="7655616008808080993">
                    <node role="argument" roleId="tp2q.1160612519549" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808080994">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080921" resolveInfo="from" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808080995">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808080996">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808080997">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081081" resolveInfo="vertices" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddSetElementOperation" typeId="tp2q.1226566855640" id="7655616008808080998">
                    <node role="argument" roleId="tp2q.1226567214363" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7655616008808080999">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808080958" resolveInfo="next" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081000">
        <property name="name" nameId="tpck.1169194664001" value="sort" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7655616008808081001" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081002" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081003">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808081004">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808081005">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808081006">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7655616008808081007" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7655616008808081008">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7655616008808081116" resolveInfo="sorter" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808081009">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081016" resolveInfo="sorter" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808081010">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7655616008808081011">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808081012">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7655616008808081013" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7655616008808081014">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7655616008808081122" resolveInfo="asc" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808081015">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081021" resolveInfo="asc" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808081016">
          <property name="name" nameId="tpck.1169194664001" value="sorter" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7655616008808081017">
            <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081018">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7655616008808081019">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Comparable" resolveInfo="Comparable" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.WildCardType" typeId="tpee.1171903607971" id="7655616008808081020" />
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808081021">
          <property name="name" nameId="tpck.1169194664001" value="asc" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7655616008808081022" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081023">
        <property name="name" nameId="tpck.1169194664001" value="getVertices" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081024" />
        <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7655616008808081025">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081026">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081027">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7655616008808081028">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="7655616008808081029">
              <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808081030">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081031">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081081" resolveInfo="vertices" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp2q.SortOperation" typeId="tp2q.1205679737078" id="7655616008808081032">
                  <node role="ascending" roleId="tp2q.1205679832066" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081033">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081122" resolveInfo="asc" />
                  </node>
                  <node role="closure" roleId="tp2q.1204796294226" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081034">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081116" resolveInfo="sorter" />
                  </node>
                </node>
              </node>
              <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081035">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081081" resolveInfo="vertices" />
              </node>
              <node role="condition" roleId="tpee.1163668914799" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7655616008808081036">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7655616008808081037" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081038">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081116" resolveInfo="sorter" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081039">
        <property name="name" nameId="tpck.1169194664001" value="getCycleDetector" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081040" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7655616008808081041">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="rk9m.1936544640085949692" resolveInfo="GraphAnalyzer" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081042">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081043">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7655616008808081044">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808081045">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7655616008808081046">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7655616008808081047">
                  <property name="name" nameId="tpck.1169194664001" value="" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="rk9m.1936544640085949692" resolveInfo="GraphAnalyzer" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.1936544640085949760" resolveInfo="GraphAnalyzer" />
                  <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081048">
                    <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081049">
                    <property name="name" nameId="tpck.1169194664001" value="forwardEdges" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081050" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7655616008808081051">
                      <node role="elementType" roleId="tp2q.1151689745422" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081052">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808081053">
                      <property name="name" nameId="tpck.1169194664001" value="v" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081054">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081055">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808081056">
                        <node role="expression" roleId="tpee.1068580123156" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808081057">
                          <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808081058">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081053" resolveInfo="v" />
                          </node>
                          <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081059">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081088" resolveInfo="fwEdges" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7655616008808081060">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081061">
                    <property name="name" nameId="tpck.1169194664001" value="vertices" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081062" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7655616008808081063">
                      <node role="elementType" roleId="tp2q.1151689745422" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081064">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081065">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7655616008808081066">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7655616008808081067">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7655616008808081023" resolveInfo="getVertices" />
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7655616008808081068">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7655616008808081069">
                    <property name="name" nameId="tpck.1169194664001" value="backwardEdges" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081070" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7655616008808081071">
                      <node role="elementType" roleId="tp2q.1151689745422" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081072">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7655616008808081073">
                      <property name="name" nameId="tpck.1169194664001" value="v" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081074">
                        <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081075">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808081076">
                        <node role="expression" roleId="tpee.1068580123156" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7655616008808081077">
                          <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7655616008808081078">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081099" resolveInfo="bkEdges" />
                          </node>
                          <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808081079">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808081073" resolveInfo="v" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7655616008808081080">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7655616008808081081">
        <property name="name" nameId="tpck.1169194664001" value="vertices" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SetType" typeId="tp2q.1226511727824" id="7655616008808081082">
          <node role="elementType" roleId="tp2q.1226511765987" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081083">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7655616008808081084" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808081085">
          <node role="creator" roleId="tpee.1145553007750" type="tp2q.HashSetCreator" typeId="tp2q.1226516258405" id="7655616008808081086">
            <node role="elementType" roleId="tp2q.1237721435807" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081087">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7655616008808081088">
        <property name="name" nameId="tpck.1169194664001" value="fwEdges" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.MapType" typeId="tp2q.1197683403723" id="7655616008808081089">
          <node role="keyType" roleId="tp2q.1197683466920" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081090">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
          <node role="valueType" roleId="tp2q.1197683475734" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808081091">
            <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081092">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7655616008808081093" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808081094">
          <node role="creator" roleId="tpee.1145553007750" type="tp2q.HashMapCreator" typeId="tp2q.1197686869805" id="7655616008808081095">
            <node role="keyType" roleId="tp2q.1197687026896" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081096">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
            <node role="valueType" roleId="tp2q.1197687035757" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808081097">
              <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081098">
                <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7655616008808081099">
        <property name="name" nameId="tpck.1169194664001" value="bkEdges" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7655616008808081100" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.MapType" typeId="tp2q.1197683403723" id="7655616008808081101">
          <node role="keyType" roleId="tp2q.1197683466920" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081102">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
          <node role="valueType" roleId="tp2q.1197683475734" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808081103">
            <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081104">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
          </node>
        </node>
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7655616008808081105">
          <node role="creator" roleId="tpee.1145553007750" type="tp2q.HashMapCreator" typeId="tp2q.1197686869805" id="7655616008808081106">
            <node role="keyType" roleId="tp2q.1197687026896" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081107">
              <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
            </node>
            <node role="valueType" roleId="tp2q.1197687035757" type="tp2q.ListType" typeId="tp2q.1151688443754" id="7655616008808081108">
              <node role="elementType" roleId="tp2q.1151688676805" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081109">
                <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081110" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7655616008808081111">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7655616008808081112" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7655616008808081113" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808081114" />
      </node>
      <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="7655616008808081115">
        <property name="name" nameId="tpck.1169194664001" value="V" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7655616008808081116">
        <property name="name" nameId="tpck.1169194664001" value="sorter" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7655616008808081117" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7655616008808081118">
          <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7655616008808081119">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
          <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7655616008808081120">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Comparable" resolveInfo="Comparable" />
            <node role="parameter" roleId="tpee.1109201940907" type="tpee.WildCardType" typeId="tpee.1171903607971" id="7655616008808081121" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7655616008808081122">
        <property name="name" nameId="tpck.1169194664001" value="asc" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7655616008808081123" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7655616008808081124" />
      </node>
      <node role="smodelAttribute" roleId="tpck.5169995583184591170" type="m373.ClassifierDocComment" typeId="m373.2068944020170241612" id="3638114788554003077">
        <node role="body" roleId="m373.8465538089690331502" type="m373.CommentLine" typeId="m373.8465538089690331500" id="3638114788554003078">
          <node role="part" roleId="m373.8970989240999019149" type="m373.TextCommentLinePart" typeId="m373.8970989240999019143" id="3638114788554003082">
            <property name="text" nameId="m373.8970989240999019144" value="We already have graphs in MPS, why we need this class here?" />
          </node>
        </node>
        <node role="param" roleId="m373.2068944020170241614" type="m373.ParameterBlockDocTag" typeId="m373.8465538089690881930" id="3638114788554003080">
          <property name="text" nameId="m373.8465538089690881934" value="vertex type" />
          <node role="parameter" roleId="m373.6832197706140518123" type="m373.DocTypeParameterReference" typeId="m373.6832197706140518107" id="3638114788554003081">
            <link role="param" roleId="m373.6832197706140518108" targetNodeId="7655616008808081115" resolveInfo="V" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019498680">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myMessageHandler" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498681">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7795897115019498611" resolveInfo="GeneratorWorker.MyMessageHandler" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511744" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498683">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498684">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019498621" resolveInfo="GeneratorWorker.MyMessageHandler" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7795897115019498685">
      <property name="name" nameId="tpck.1169194664001" value="main" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498686" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498687" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498688">
        <property name="name" nameId="tpck.1169194664001" value="args" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019498689">
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033181870" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498691">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498692">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498693">
            <property name="name" nameId="tpck.1169194664001" value="mpsWorker" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498694">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886909" resolveInfo="MpsWorker" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498695">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498696">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019498728" resolveInfo="GeneratorWorker" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498697">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893036" resolveInfo="fromDumpInFile" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498698">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498699">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" resolveInfo="File" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="7795897115019498700">
                        <node role="array" roleId="tpee.1173175590490" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498701">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498688" resolveInfo="args" />
                        </node>
                        <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019498702">
                          <property name="value" nameId="tpee.1068580320021" value="0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498703">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498704">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907886972" resolveInfo="MpsWorker.SystemOutLogger" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498705">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498706">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498707">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498693" resolveInfo="mpsWorker" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498708">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887124" resolveInfo="workFromMain" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019498709">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498710" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498711" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498712">
        <property name="name" nameId="tpck.1169194664001" value="whatToDo" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498713">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498714">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498715">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887085" resolveInfo="MpsWorker" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498716">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498712" resolveInfo="whatToDo" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019498717">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498718" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498719" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498720">
        <property name="name" nameId="tpck.1169194664001" value="whatToDo" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498721">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498722">
        <property name="name" nameId="tpck.1169194664001" value="component" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498723">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="kp22.~ProjectComponent" resolveInfo="ProjectComponent" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498724">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498725">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887095" resolveInfo="MpsWorker" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498726">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498720" resolveInfo="whatToDo" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498727">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498722" resolveInfo="component" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019498728">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019498729" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498730" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498731">
        <property name="name" nameId="tpck.1169194664001" value="whatToDo" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498732">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498733">
        <property name="name" nameId="tpck.1169194664001" value="logger" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498734">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886942" resolveInfo="MpsWorker.AntLogger" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498735">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498736">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887108" resolveInfo="MpsWorker" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498737">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498731" resolveInfo="whatToDo" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498738">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498733" resolveInfo="logger" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498739">
      <property name="name" nameId="tpck.1169194664001" value="executeTask" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019498740" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498741" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498742">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602648">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498744">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498745">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498746">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498747">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019498748">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019498758" resolveInfo="setGenerationProperties" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019498749">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498750">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498751">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498744" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498752">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887036" resolveInfo="hasAnythingToGenerate" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498753">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498754">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019498755">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019498845" resolveInfo="generate" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498756">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498742" resolveInfo="project" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498757">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498744" resolveInfo="go" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3304387091958602653">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498758">
      <property name="name" nameId="tpck.1169194664001" value="setGenerationProperties" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498759" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498760" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498761">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1011890140273756186">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1011890140273756187">
            <property name="name" nameId="tpck.1169194664001" value="strictMode" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="1011890140273756188" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1011890140273756191">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273756193">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1011890140273756192">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273756197">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="1011890140273756198">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907886493" resolveInfo="GenerateTask" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.6180231420008238377" resolveInfo="STRICT_MODE" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273757216">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273757219">
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273757223">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetStrictMode(boolean)%cvoid" resolveInfo="setStrictMode" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273757224">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273756187" resolveInfo="strictMode" />
              </node>
            </node>
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919707">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919706">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919711">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019498762">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273757227">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273756187" resolveInfo="strictMode" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498769">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498770">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498771">
                <property name="name" nameId="tpck.1169194664001" value="parallelMode" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019498772" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498773">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498774">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498775">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498776">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019498777">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907886493" resolveInfo="GenerateTask" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.6180231420008238386" resolveInfo="PARALLEL_MODE" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498778">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498779">
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498781">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetParallelGenerator(boolean)%cvoid" resolveInfo="setParallelGenerator" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498782">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="parallelMode" />
                  </node>
                </node>
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919712">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919713">
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919714">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1011890140273757230">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1011890140273757231">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273757235">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273757236">
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273757238">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetNumberOfParallelThreads(int)%cvoid" resolveInfo="setNumberOfParallelThreads" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1011890140273757240">
                        <property name="value" nameId="tpee.1068580320021" value="8" />
                      </node>
                    </node>
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919715">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919716">
                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919717">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273757234">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="parallelMode" />
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498788">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019498789">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019498790">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="1011890140273757241">
                    <node role="expression" roleId="tpee.1079359253376" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1011890140273757243">
                      <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1011890140273757247">
                        <property name="value" nameId="tpee.1070475926801" value="on" />
                      </node>
                      <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1011890140273757248">
                        <property name="value" nameId="tpee.1070475926801" value="off" />
                      </node>
                      <node role="condition" roleId="tpee.1163668914799" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273757242">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="parallelMode" />
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498791">
                    <property name="value" nameId="tpee.1070475926801" value="Generating in strict mode, parallel generation = " />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498793">
      <property name="name" nameId="tpck.1169194664001" value="showStatistic" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019498794" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498795" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498796">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7517326809298102361">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7517326809298102362">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.7728111738248852154" resolveInfo="failBuild" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2031947709138528104">
              <property name="value" nameId="tpee.1070475926801" value="generation" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498845">
      <property name="name" nameId="tpck.1169194664001" value="generate" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498846" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498847" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498848">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1504158228282730285">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498850">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498851">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498852">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498853">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498854">
            <property name="name" nameId="tpck.1169194664001" value="s" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498855">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" resolveInfo="StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498856">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498857">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;(java%dlang%dString)" resolveInfo="StringBuffer" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498858">
                  <property name="value" nameId="tpee.1070475926801" value="Generating:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019498859">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498860">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498861">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498850" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498862">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887024" resolveInfo="getProjects" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498863">
            <property name="name" nameId="tpck.1169194664001" value="p" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386274807">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498865">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498866">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498867">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498868">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498869">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498870">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498871">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498872">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498873">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498874">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498875">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498863" resolveInfo="p" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019498876">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498877">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498878">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498850" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498879">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887028" resolveInfo="getModules" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498880">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498881">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498882">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498883">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498884">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498885">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498886">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498887">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498888">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498889">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498890">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498891">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498892">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498880" resolveInfo="m" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019498893">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498894">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019498895">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498850" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498896">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887032" resolveInfo="getModels" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498897">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498898">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498899">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498900">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498901">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498902">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498903">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498904">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498905">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498906">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498907">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498908">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498909">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498897" resolveInfo="m" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498910">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019498911">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498912">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498913">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498914">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999487107">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999487108">
            <property name="name" nameId="tpck.1169194664001" value="ctx" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999487109">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~ProjectOperationContext" resolveInfo="ProjectOperationContext" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1504158228282730272">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1504158228282730274">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~ProjectOperationContext%d&lt;init&gt;(jetbrains%dmps%dproject%dProject)" resolveInfo="ProjectOperationContext" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1504158228282730284">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498848" resolveInfo="project" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7655616008808103215" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4077655991498783032">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4077655991498783033">
            <property name="name" nameId="tpck.1169194664001" value="resources" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="550374019954920841">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="550374019954920842">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fn29.7544464876071207476" resolveInfo="IMResource" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808086384">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4077655991498783036">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511000" resolveInfo="collectResources" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4077655991498783037">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999487108" resolveInfo="ctx" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4077655991498783038">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498850" resolveInfo="go" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp2q.ToListOperation" typeId="tp2q.1151702311717" id="7655616008808086388" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5166253949014688188">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5166253949014688191">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5166253949014688190">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="cu2c.~ModelAccess" resolveInfo="ModelAccess" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5166253949014688668">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelCommandExecutor%dflushEventQueue()%cvoid" resolveInfo="flushEventQueue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="550374019954920843">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="550374019954920844">
            <property name="name" nameId="tpck.1169194664001" value="res" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="550374019954920845">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="550374019954920846">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7054305886486074605">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="8638838189258387898">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d4yz.8638838189258314114" resolveInfo="runInUIThreadAndWait" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="d4yz.8638838189258314103" resolveInfo="ThreadUtils" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="8638838189258387899">
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258387900">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8638838189258387901">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8638838189258387902">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258387903">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8638838189258387904">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8638838189258387905">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476500" resolveInfo="BuildMakeService" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258387906">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999487108" resolveInfo="ctx" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8638838189258387907">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498680" resolveInfo="myMessageHandler" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258387908">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476524" resolveInfo="make" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258387909">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4077655991498783033" resolveInfo="resources" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258387910">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="550374019954920844" resolveInfo="res" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="550374019954923544">
          <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="550374019954923545">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="550374019954920875">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="550374019954920883">
                <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954920884">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954920885">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="550374019954920886">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="550374019954920844" resolveInfo="res" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954920887">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~Future%dget()%cjava%dlang%dObject" resolveInfo="get" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954920888">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1291978361072214431" resolveInfo="isSucessful" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="550374019954920881">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="550374019954920882">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954920890">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="550374019954920889">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887044" resolveInfo="myErrors" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954920894">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="550374019954920926">
                        <property name="value" nameId="tpee.1070475926801" value="Make was not successful" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="550374019954923547">
            <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="550374019954923548">
              <property name="name" nameId="tpck.1169194664001" value="e" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="550374019954923551">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~InterruptedException" resolveInfo="InterruptedException" />
              </node>
            </node>
            <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="550374019954923550">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="550374019954924120">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954924122">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="550374019954924121">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887044" resolveInfo="myErrors" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954924126">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954924129">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="550374019954924127">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="550374019954923548" resolveInfo="e" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954924133">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Throwable%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="550374019954924115">
            <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="550374019954924116">
              <property name="name" nameId="tpck.1169194664001" value="e" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="550374019954924119">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~ExecutionException" resolveInfo="ExecutionException" />
              </node>
            </node>
            <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="550374019954924118">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="550374019954924134">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954924136">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="550374019954924135">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887044" resolveInfo="myErrors" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954924140">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="550374019954924142">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="550374019954924141">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="550374019954924116" resolveInfo="e" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="550374019954924146">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Throwable%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5166253949014688670">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5166253949014688671">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5166253949014688672">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="cu2c.~ModelAccess" resolveInfo="ModelAccess" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5166253949014688673">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelCommandExecutor%dflushEventQueue()%cvoid" resolveInfo="flushEventQueue" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3767231643656613015">
      <property name="name" nameId="tpck.1169194664001" value="withGenerators" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3767231643656621712">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621714">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3767231643656613017">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3767231643656621721">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621722">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621751">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621715" resolveInfo="modules" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="3767231643656621724">
              <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621725">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621726">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621752">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621715" resolveInfo="modules" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="3767231643656621728">
                    <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3767231643656621729">
                      <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3767231643656621730">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3767231643656621731">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="3767231643656621732">
                            <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621733">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~Language" resolveInfo="Language" />
                            </node>
                            <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621734">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621735" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3767231643656621735">
                        <property name="name" nameId="tpck.1169194664001" value="it" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3767231643656621736" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp2q.TranslateOperation" typeId="tp2q.1201792049884" id="3767231643656621737">
                  <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3767231643656621738">
                    <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3767231643656621739">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3767231643656621740">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3767231643656621741">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dunmodifiableList(java%dutil%dList)%cjava%dutil%dList" resolveInfo="unmodifiableList" />
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" resolveInfo="Collections" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621742">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="3767231643656621743">
                              <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="3767231643656621744">
                                <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621745">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~Language" resolveInfo="Language" />
                                </node>
                                <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621746">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621749" resolveInfo="it" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3767231643656621747">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~Language%dgetGenerators()%cjava%dutil%dList" resolveInfo="getGenerators" />
                            </node>
                          </node>
                          <node role="typeArgument" roleId="tpee.4972241301747169160" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621748">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3767231643656621749">
                      <property name="name" nameId="tpck.1169194664001" value="it" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3767231643656621750" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3767231643656621715">
        <property name="name" nameId="tpck.1169194664001" value="modules" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3767231643656621716">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621718">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3767231643656621767" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3767231643656621756">
      <property name="name" nameId="tpck.1169194664001" value="getModelsToGenerate" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3767231643656621760">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621763">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3767231643656621766" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3767231643656621759">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3767231643656621769">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621770">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="3767231643656621771">
              <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="3767231643656621772">
                <node role="type" roleId="tpee.1070534934091" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3767231643656621773">
                  <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621774">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                  </node>
                </node>
                <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621775">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621787">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621764" resolveInfo="mod" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3767231643656621777">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~IModule%dgetOwnModelDescriptors()%cjava%dutil%dList" resolveInfo="getOwnModelDescriptors" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="3767231643656621778">
              <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3767231643656621779">
                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3767231643656621780">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3767231643656621781">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621782">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621783">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3767231643656621785" resolveInfo="it" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3767231643656621784">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~SModelDescriptor%disGeneratable()%cboolean" resolveInfo="isGeneratable" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3767231643656621785">
                  <property name="name" nameId="tpck.1169194664001" value="it" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3767231643656621786" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3767231643656621764">
        <property name="name" nameId="tpck.1169194664001" value="mod" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3767231643656621765">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511000">
      <property name="name" nameId="tpck.1169194664001" value="collectResources" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511001">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511002">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8486843261567504142">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8486843261567504143">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999511005">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7655616008808086518">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fn29.7544464876071207476" resolveInfo="IMResource" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511007" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511008">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511009">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511010">
            <property name="name" nameId="tpck.1169194664001" value="models" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999511011">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511012">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511013" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tp4k.ExecuteLightweightCommandStatement" typeId="tp4k.1225441341971" id="7874190907999511014">
          <node role="commandClosureLiteral" roleId="tp4k.1225441160167" type="tp4k.CommandClosureLiteral" typeId="tp4k.1225441216717" id="7874190907999511015">
            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511016">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="8486843261567504159">
                <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="8486843261567504160">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511017">
                    <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511018">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511019">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999511020">
                          <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511021">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511022">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="7874190907999511023">
                              <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="3767231643656621789">
                                <node role="expression" roleId="tpee.1079359253376" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3767231643656621788">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3767231643656621756" resolveInfo="getModelsToGenerate" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3767231643656621790">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511028" resolveInfo="mod" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511027">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="2504598135591458815" />
                    </node>
                    <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511028">
                      <property name="name" nameId="tpck.1169194664001" value="mod" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511029">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                      </node>
                    </node>
                    <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3767231643656621754">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3767231643656613015" resolveInfo="withGenerators" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621796">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3767231643656621795">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504161" resolveInfo="p" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3767231643656621800">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetModules()%cjava%dutil%dList" resolveInfo="getModules" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8486843261567504161">
                  <property name="name" nameId="tpck.1169194664001" value="p" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386274808">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                  </node>
                </node>
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504163">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8486843261567504164">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504165">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887024" resolveInfo="getProjects" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="8486843261567504175">
                <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="8486843261567504176">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8486843261567504182">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8486843261567504183">
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504184">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504185">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="8486843261567504186">
                          <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3767231643656621807">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3767231643656621756" resolveInfo="getModelsToGenerate" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3767231643656621808">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504177" resolveInfo="mod" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504190">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8486843261567504177">
                  <property name="name" nameId="tpck.1169194664001" value="mod" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8486843261567504178">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                  </node>
                </node>
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3767231643656621802">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3767231643656613015" resolveInfo="withGenerators" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3767231643656621803">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3767231643656621804">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3767231643656621805">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887028" resolveInfo="getModules" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="8486843261567504198">
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="8486843261567504199">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8486843261567504212">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8486843261567504214">
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504218">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504217">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="8486843261567504222">
                          <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504224">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8486843261567504225">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504226">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887032" resolveInfo="getModels" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504213">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="8486843261567504208">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="8486843261567504211" />
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504203">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8486843261567504202">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504207">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887032" resolveInfo="getModels" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511033">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7655616008808086520">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511034">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511035">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511036">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fn29.7219626660275504881" resolveInfo="ModelsToResources" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511037">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511001" resolveInfo="context" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511038">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511039">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="7874190907999511040">
                      <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7874190907999511041">
                        <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511042">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511043">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="9157965971963623771">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationFacade%dcanGenerate(jetbrains%dmps%dsmodel%dSModelDescriptor)%cboolean" resolveInfo="canGenerate" />
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationFacade" resolveInfo="GenerationFacade" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9157965971963623772">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511047" resolveInfo="smd" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="7874190907999511047">
                          <property name="name" nameId="tpck.1169194664001" value="smd" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="7874190907999511048" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511049">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fn29.7219626660275509691" resolveInfo="resources" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7874190907999511050">
                  <property name="value" nameId="tpee.1068580123138" value="false" />
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.SelectOperation" typeId="tp2q.1202128969694" id="7655616008808086524">
              <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7655616008808086525">
                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7655616008808086526">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7655616008808086529">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7655616008808086530">
                      <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7655616008808086533">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fn29.7544464876071207476" resolveInfo="IMResource" />
                      </node>
                      <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7655616008808086534">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7655616008808086527" resolveInfo="r" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="7655616008808086527">
                  <property name="name" nameId="tpck.1169194664001" value="r" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="7655616008808086528" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="7795897115019499553">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499554" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602660">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886909" resolveInfo="MpsWorker" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7874190907999511758">
      <property name="name" nameId="tpck.1169194664001" value="MyMessageHandler" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="8852346936509752989" />
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511759">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7874190907999511774">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8852346936509752990" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511775" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511776" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511777">
        <property name="name" nameId="tpck.1169194664001" value="handle" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511778" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511779" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511780">
          <property name="name" nameId="tpck.1169194664001" value="msg" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511781">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessage" resolveInfo="IMessage" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511782">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7874190907999511783">
            <node role="expression" roleId="tpee.1163670766145" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511784">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511785">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511786">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetKind()%cjetbrains%dmps%dmessages%dMessageKind" resolveInfo="getKind" />
              </node>
            </node>
            <node role="defaultBlock" roleId="tpee.1163670592366" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511787" />
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999511788">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999511789">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dERROR" resolveInfo="ERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511790">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511791">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511792">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511793">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511794">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888363" resolveInfo="error" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511795">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511796">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511797">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120870">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120872">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120871">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120876">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120754" resolveInfo="errorLine" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6359254648150120892">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6359254648150120895">
                          <property name="value" nameId="tpee.1070475926801" value="[ERROR] " />
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120878">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120877">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120882">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999511824" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999511825">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999511826">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dWARNING" resolveInfo="WARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511827">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511828">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511829">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511830">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511831">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888338" resolveInfo="warning" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511832">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511833">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511834">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120884">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120885">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120886">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120887">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120748" resolveInfo="outputLine" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6359254648150120896">
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120888">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120889">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120890">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                          </node>
                        </node>
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6359254648150120901">
                          <property name="value" nameId="tpee.1070475926801" value="[WARNING]" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999511842" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999511843">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999511844">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dINFORMATION" resolveInfo="INFORMATION" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511845">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511846">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511847">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511848">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511849">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888328" resolveInfo="verbose" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511850">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511851">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511852">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120903">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120904">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120905">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120906">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120748" resolveInfo="outputLine" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6359254648150120907">
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120908">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120909">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120910">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                          </node>
                        </node>
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6359254648150120911">
                          <property name="value" nameId="tpee.1070475926801" value="[INFO]" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999511853" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511880">
        <property name="name" nameId="tpck.1169194664001" value="clear" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511881" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511882" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511883" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019499629">
      <property name="name" nameId="tpck.1169194664001" value="MyUnitTestAdapter" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648149968037">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="9ymv.8688590116724765985" resolveInfo="UnitTestAdapter" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499630" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019499632">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499633" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499634" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501445" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499635">
        <property name="name" nameId="tpck.1169194664001" value="testStarted" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499636" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499637" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499638">
          <property name="name" nameId="tpck.1169194664001" value="testName" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186026" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501446">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120761">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120763">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120762">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120767">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120678" resolveInfo="testStarted" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120768">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499638" resolveInfo="testName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501458">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499640">
        <property name="name" nameId="tpck.1169194664001" value="testFailed" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499641" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499642" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499643">
          <property name="name" nameId="tpck.1169194664001" value="test" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186027" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499645">
          <property name="name" nameId="tpck.1169194664001" value="message" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186028" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499647">
          <property name="name" nameId="tpck.1169194664001" value="details" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186029" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501459">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120771">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120773">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120772">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120777">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120735" resolveInfo="testFailed" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120778">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499643" resolveInfo="test" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120780">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499645" resolveInfo="message" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120782">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499647" resolveInfo="details" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="363050166995117813">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="363050166995117815">
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="363050166995117818">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="363050166995117814">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499664" resolveInfo="myTestFailed" />
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501479">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499649">
        <property name="name" nameId="tpck.1169194664001" value="testFinished" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499650" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499651" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499652">
          <property name="name" nameId="tpck.1169194664001" value="testName" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186030" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501480">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120784">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120786">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120785">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120790">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120728" resolveInfo="testFinished" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120791">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499652" resolveInfo="testName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501492">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499654">
        <property name="name" nameId="tpck.1169194664001" value="logMessage" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499655" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499656" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499657">
          <property name="name" nameId="tpck.1169194664001" value="message" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186031" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501493">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501494">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019501495">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019501496">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501497">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499657" resolveInfo="message" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501498" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019501499">
                <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501500">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501501">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499657" resolveInfo="message" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501502">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" resolveInfo="isEmpty" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501503">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501504">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501505">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501506">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499657" resolveInfo="message" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120793">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120795">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120794">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120799">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120748" resolveInfo="outputLine" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120800">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499657" resolveInfo="message" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501507">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499659">
        <property name="name" nameId="tpck.1169194664001" value="logError" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499660" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499661" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499662">
          <property name="name" nameId="tpck.1169194664001" value="errorMessage" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033186032" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501508">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501509">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019501510">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019501511">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501512">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499662" resolveInfo="errorMessage" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501513" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019501514">
                <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501515">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501516">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499662" resolveInfo="errorMessage" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501517">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" resolveInfo="isEmpty" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501518">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501519">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501520">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888363" resolveInfo="error" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501521">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499662" resolveInfo="errorMessage" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120802">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120804">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120803">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120808">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120754" resolveInfo="errorLine" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120809">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499662" resolveInfo="errorMessage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501522">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="6359254648150120585">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="MyReporter" />
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2342584008145151795">
        <property name="name" nameId="tpck.1169194664001" value="init" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2342584008145151796" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2342584008145151797" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145151798">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2342584008145152414">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152415">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="2342584008145152423" />
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2342584008145152419">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2342584008145152422" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152418">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2342584008145152254">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152255">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="2342584008145151799">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2342584008145151800">
                  <property name="name" nameId="tpck.1169194664001" value="wd" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2342584008145151801">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                  </node>
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145151802">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145151803">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145151804">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145151805">
                        <property name="value" nameId="tpee.1070475926801" value="mps.gentest.reportsDir" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1645725498661025394">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1645725498661025396">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1645725498661025404">
                    <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1645725498661025410">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145151800" resolveInfo="wd" />
                    </node>
                    <node role="condition" roleId="tpee.1163668914799" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1645725498661025400">
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1645725498661025403" />
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1645725498661025399">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145151800" resolveInfo="wd" />
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1645725498661025408">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~System%dgetProperty(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getProperty" />
                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~System" resolveInfo="System" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1645725498661025409">
                        <property name="value" nameId="tpee.1070475926801" value="user.dir" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1645725498661025395">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145151800" resolveInfo="wd" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152310">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2342584008145152311">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2342584008145152296">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2342584008145152297">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString,java%dlang%dString)" resolveInfo="File" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1645725498661025412">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145151800" resolveInfo="wd" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145152299">
                        <property name="value" nameId="tpee.1070475926801" value=".gentest" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152406">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2342584008145152300">
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152301">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1645725498661026923">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="1645725498661026929">
                      <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1645725498661026930">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1645725498661026931">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1645725498661026932">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dmkdirs()%cboolean" resolveInfo="mkdirs" />
                        </node>
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1645725498661026927">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="2342584008145152265">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2342584008145152266">
                          <property name="name" nameId="tpck.1169194664001" value="tmpDir" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2342584008145152267">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="2342584008145152268">
                        <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152269">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152270">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2342584008145152271">
                              <node role="rValue" roleId="tpee.1068498886297" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="2342584008145152272">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dcreateTempFile(java%dlang%dString,java%dlang%dString)%cjava%dio%dFile" resolveInfo="createTempFile" />
                                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="fxg7.~File" resolveInfo="File" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145152273">
                                  <property name="value" nameId="tpee.1070475926801" value="gentest" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145152274">
                                  <property name="value" nameId="tpee.1070475926801" value="reports" />
                                </node>
                              </node>
                              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152275">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152266" resolveInfo="tmpDir" />
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152276">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152277">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152278">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152266" resolveInfo="tmpDir" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152279">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%ddelete()%cboolean" resolveInfo="delete" />
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152280">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152281">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152282">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152266" resolveInfo="tmpDir" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152283">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dmkdir()%cboolean" resolveInfo="mkdir" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="2342584008145152284">
                          <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2342584008145152285">
                            <property name="name" nameId="tpck.1169194664001" value="ex" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2342584008145152286">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~IOException" resolveInfo="IOException" />
                            </node>
                          </node>
                          <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152287">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="2342584008145152288">
                              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2342584008145152289">
                                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2342584008145152290">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~RuntimeException%d&lt;init&gt;(java%dlang%dThrowable)" resolveInfo="RuntimeException" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152291">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152285" resolveInfo="ex" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152373">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2342584008145152375">
                          <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152378">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152266" resolveInfo="tmpDir" />
                          </node>
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152412">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="2342584008145152306">
                  <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152307">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152407">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152309">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dexists()%cboolean" resolveInfo="exists" />
                    </node>
                  </node>
                </node>
                <node role="elsifClauses" roleId="tpee.1206060520071" type="tpee.ElsifClause" typeId="tpee.1206060495898" id="2342584008145152341">
                  <node role="statementList" roleId="tpee.1206060644605" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152342">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="2342584008145152343">
                      <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="2342584008145152344">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145152345">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152346">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2342584008145152347">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152349" resolveInfo="f" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152348">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%ddelete()%cboolean" resolveInfo="delete" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2342584008145152349">
                        <property name="name" nameId="tpck.1169194664001" value="f" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2342584008145152350">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                        </node>
                      </node>
                      <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152351">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152410">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152353">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dlistFiles()%cjava%dio%dFile[]" resolveInfo="listFiles" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="tpee.1206060619838" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145152355">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152409">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145152359">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%disDirectory()%cboolean" resolveInfo="isDirectory" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1645725498661025414">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500082" resolveInfo="isRunningOnTeamCity" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120832">
        <property name="name" nameId="tpck.1169194664001" value="getCurrentTestName" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120836" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120834" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120835">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120837">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120838">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120591">
        <property name="name" nameId="tpck.1169194664001" value="startRun" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120603">
          <property name="name" nameId="tpck.1169194664001" value="name" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120605" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120592" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120610" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120594">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120627">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6359254648150120628">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120629">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6359254648150120630" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6359254648150120631">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="4991696182217167078">
                <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4991696182217175575">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4991696182217175577">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217168601" resolveInfo="ConsoleTestReporter" />
                  </node>
                </node>
                <node role="condition" roleId="tpee.1163668914799" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4991696182217167077">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500082" resolveInfo="isRunningOnTeamCity" />
                </node>
                <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6359254648150120632">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6359254648150120633">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.6359254648150106405" resolveInfo="XmlTestReporter" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120634">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120603" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120606">
        <property name="name" nameId="tpck.1169194664001" value="finishRun" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120607" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120608" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120609">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6359254648150121130">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121131">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6359254648150121139" />
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="6359254648150121135">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121138" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121134">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6359254648150121099">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121100">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121101">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121102">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121103">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121104">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157625" resolveInfo="testFinished" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121105">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6359254648150121106">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121107" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121108">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="297656254802944055">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802944057">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="297656254802944056">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802944061">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157615" resolveInfo="runFinished" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4991696182217167084">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4991696182217167085">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6359254648150121185">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6359254648150121186">
                  <property name="name" nameId="tpck.1169194664001" value="os" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150121187">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~BufferedOutputStream" resolveInfo="BufferedOutputStream" />
                  </node>
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121200" />
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.TryStatement" typeId="tpee.1153952380246" id="6359254648150121197">
                <node role="body" roleId="tpee.1153952416686" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121163">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6359254648150121154">
                    <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6359254648150121155">
                      <property name="name" nameId="tpck.1169194664001" value="reportFile" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150121156">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                      </node>
                      <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="2342584008145152458">
                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="fxg7.~File" resolveInfo="File" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dcreateTempFile(java%dlang%dString,java%dlang%dString,java%dio%dFile)%cjava%dio%dFile" resolveInfo="createTempFile" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145152459">
                          <property name="value" nameId="tpee.1070475926801" value="gentest_report-" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145152460">
                          <property name="value" nameId="tpee.1070475926801" value=".xml" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145152461">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2342584008145152394" resolveInfo="gentestdir" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121194">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6359254648150121195">
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6359254648150121188">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6359254648150121189">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~BufferedOutputStream%d&lt;init&gt;(java%dio%dOutputStream)" resolveInfo="BufferedOutputStream" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6359254648150121190">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6359254648150121191">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~FileOutputStream%d&lt;init&gt;(java%dio%dFile)" resolveInfo="FileOutputStream" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121192">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121155" resolveInfo="reportFile" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121196">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121186" resolveInfo="os" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121171">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121173">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="4991696182217168594">
                        <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="4991696182217168595">
                          <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4991696182217168598">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="9ymv.6359254648150106403" resolveInfo="XmlTestReporter" />
                          </node>
                          <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4991696182217168597">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121177">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.6359254648150119017" resolveInfo="dump" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121193">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121186" resolveInfo="os" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121224">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121226">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="6359254648150121225">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" resolveInfo="System" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" resolveInfo="out" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121230">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" resolveInfo="println" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6359254648150121232">
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6359254648150121235">
                            <property name="value" nameId="tpee.1070475926801" value="']" />
                          </node>
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="6359254648150121236">
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121242">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121241">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121155" resolveInfo="reportFile" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121246">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" resolveInfo="getAbsolutePath" />
                              </node>
                            </node>
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6359254648150121231">
                              <property name="value" nameId="tpee.1070475926801" value="##teamcity[importData type='junit' path='" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="catchClause" roleId="tpee.1164903700860" type="tpee.CatchClause" typeId="tpee.1164903280175" id="6359254648150121165">
                  <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6359254648150121166">
                    <property name="name" nameId="tpck.1169194664001" value="ex" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150121169">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~IOException" resolveInfo="IOException" />
                    </node>
                  </node>
                  <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121168" />
                </node>
                <node role="finallyBody" roleId="tpee.1153952429843" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121198">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6359254648150121201">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6359254648150121205">
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121208" />
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121204">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121186" resolveInfo="os" />
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121203">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="6359254648150121209">
                        <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121210">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121215">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121217">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121216">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150121186" resolveInfo="os" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121221">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~FilterOutputStream%dclose()%cvoid" resolveInfo="close" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="6359254648150121211">
                          <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6359254648150121212">
                            <property name="name" nameId="tpck.1169194664001" value="ignore" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150121222">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~IOException" resolveInfo="IOException" />
                            </node>
                          </node>
                          <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121214" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4991696182217167088">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500082" resolveInfo="isRunningOnTeamCity" />
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121110">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6359254648150121117">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121112">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6359254648150121111" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6359254648150121116">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121120" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120678">
        <property name="name" nameId="tpck.1169194664001" value="testStarted" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120682">
          <property name="name" nameId="tpck.1169194664001" value="testname" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120684" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120679" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120680" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120681">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6359254648150121082">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150121083">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121091">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121093">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121092">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121097">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157625" resolveInfo="testFinished" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121098">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6359254648150121087">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121090" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121086">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120822">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6359254648150120823">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120824">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6359254648150120825" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6359254648150120826">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120827">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120682" resolveInfo="testname" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121043">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121045">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121044">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121049">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157619" resolveInfo="testStarted" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150121050">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120682" resolveInfo="testname" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120728">
        <property name="name" nameId="tpck.1169194664001" value="testFinished" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120732">
          <property name="name" nameId="tpck.1169194664001" value="testname" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120734" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120729" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120730" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120731">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121051">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121052">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121053">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121054">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157625" resolveInfo="testFinished" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150121055">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120732" resolveInfo="testname" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121057">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6359254648150121064">
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6359254648150121067" />
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121059">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6359254648150121058" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6359254648150121063">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120735">
        <property name="name" nameId="tpck.1169194664001" value="testFailed" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120739">
          <property name="name" nameId="tpck.1169194664001" value="testname" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120741" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120742">
          <property name="name" nameId="tpck.1169194664001" value="msg" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120744" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120745">
          <property name="name" nameId="tpck.1169194664001" value="longmsg" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120747" />
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120736" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120737" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120738">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121068">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121070">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121069">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121074">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157631" resolveInfo="testFailed" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150121075">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120739" resolveInfo="testname" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150121077">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120742" resolveInfo="msg" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150121080">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120745" resolveInfo="longmsg" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120748">
        <property name="name" nameId="tpck.1169194664001" value="outputLine" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120749" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120750" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120751">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3008404940110065343">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3008404940110065344">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3008404940110065352">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3008404940110065357">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065353">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3008404940110065361">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157641" resolveInfo="testOutputLine" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065364">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3008404940110065362">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120752" resolveInfo="out" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3008404940110065348">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3008404940110065351" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065347">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
              </node>
            </node>
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3008404940110065365">
              <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3008404940110065366">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120912">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120914">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120913">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120918">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157657" resolveInfo="outputLine" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120919">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120752" resolveInfo="out" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120752">
          <property name="name" nameId="tpck.1169194664001" value="out" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120753" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120754">
        <property name="name" nameId="tpck.1169194664001" value="errorLine" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120755" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120756" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120757">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3008404940110065368">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3008404940110065369">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3008404940110065379">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3008404940110065381">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065380">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3008404940110065385">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157649" resolveInfo="testErrorLine" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065389">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3008404940110065387">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120758" resolveInfo="err" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3008404940110065375">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3008404940110065378" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3008404940110065374">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120819" resolveInfo="currentTestName" />
              </node>
            </node>
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3008404940110065390">
              <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3008404940110065391">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120958">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120960">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120959">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120624" resolveInfo="testReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120964">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="9ymv.4991696182217157663" resolveInfo="errorLine" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120965">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120758" resolveInfo="err" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120758">
          <property name="name" nameId="tpck.1169194664001" value="err" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120759" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120602" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="6359254648150120587">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120588" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120611" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120590" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6359254648150120624">
        <property name="name" nameId="tpck.1169194664001" value="testReporter" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120625" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4991696182217167082">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="9ymv.4991696182217157613" resolveInfo="ITestReporter" />
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6359254648150120819">
        <property name="name" nameId="tpck.1169194664001" value="currentTestName" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120820" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6359254648150120821" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2342584008145152394">
        <property name="name" nameId="tpck.1169194664001" value="gentestdir" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2342584008145152395" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2342584008145152396">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999511748">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myMessageHandler" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999519095">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511758" resolveInfo="TestGenerationWorker.MyMessageHandler" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511750" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511751">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511752">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511774" resolveInfo="TestGenerationWorker.MyMessageHandler" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499664">
      <property name="name" nameId="tpck.1169194664001" value="myTestFailed" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019499665" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499666" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019499667" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499668">
      <property name="name" nameId="tpck.1169194664001" value="myBuildServerMessageFormat" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499669">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907889184" resolveInfo="IBuildServerMessageFormat" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499670" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="3416062119153932762">
      <property name="name" nameId="tpck.1169194664001" value="path2tmp" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3416062119153932763" />
      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.MapType" typeId="tp2q.1197683403723" id="3416062119153932765">
        <node role="valueType" roleId="tp2q.1197683475734" type="tpee.StringType" typeId="tpee.1225271177708" id="3416062119153932769" />
        <node role="keyType" roleId="tp2q.1197683466920" type="tpee.StringType" typeId="tpee.1225271177708" id="3416062119153932768" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7984465977408064206">
        <node role="creator" roleId="tpee.1145553007750" type="tp2q.HashMapCreator" typeId="tp2q.1197686869805" id="7984465977408064207">
          <node role="keyType" roleId="tp2q.1197687026896" type="tpee.StringType" typeId="tpee.1225271177708" id="7984465977408064208" />
          <node role="valueType" roleId="tp2q.1197687035757" type="tpee.StringType" typeId="tpee.1225271177708" id="7984465977408064209" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6078875650364604224">
      <property name="name" nameId="tpck.1169194664001" value="tmpPath" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6078875650364604225" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6078875650364604227" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="6359254648150120595">
      <property name="name" nameId="tpck.1169194664001" value="myReporter" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6359254648150120596" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150120598">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="6359254648150120585" resolveInfo="TestGenerationWorker.MyReporter" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6359254648150120600">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6359254648150120601">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120587" resolveInfo="TestGenerationWorker.MyReporter" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7795897115019499696">
      <property name="name" nameId="tpck.1169194664001" value="main" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499697" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499698" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499699">
        <property name="name" nameId="tpck.1169194664001" value="args" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019499700">
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.StringType" typeId="tpee.1225271177708" id="4494255822033228360" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499702">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499703">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499704">
            <property name="name" nameId="tpck.1169194664001" value="generator" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499705">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499706">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499707">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499731" resolveInfo="TestGenerationWorker" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499708">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893036" resolveInfo="fromDumpInFile" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499709">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499710">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" resolveInfo="File" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="7795897115019499711">
                        <node role="array" roleId="tpee.1173175590490" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499712">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499699" resolveInfo="args" />
                        </node>
                        <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019499713">
                          <property name="value" nameId="tpee.1068580320021" value="0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4494255822033228362">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4494255822033228363">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907886972" resolveInfo="MpsWorker.SystemOutLogger" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499716">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499717">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499718">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499704" resolveInfo="generator" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499719">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887124" resolveInfo="workFromMain" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019499731">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499732" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499733" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499734">
        <property name="name" nameId="tpck.1169194664001" value="whatToDo" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499735">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907888945" resolveInfo="WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499736">
        <property name="name" nameId="tpck.1169194664001" value="logger" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499737">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886942" resolveInfo="MpsWorker.AntLogger" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499738">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019499739">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887108" resolveInfo="MpsWorker" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499740">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499734" resolveInfo="whatToDo" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499741">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499736" resolveInfo="logger" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499742">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019499743">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499744">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499745">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500067" resolveInfo="getBuildServerMessageFormat" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6078875650364604150">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6078875650364604151">
            <property name="name" nameId="tpck.1169194664001" value="tmpDir" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6078875650364604152">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="6078875650364605976">
          <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="6078875650364605977">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6078875650364605983">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6078875650364605984">
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6078875650364604153">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dcreateTempFile(java%dlang%dString,java%dlang%dString)%cjava%dio%dFile" resolveInfo="createTempFile" />
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="fxg7.~File" resolveInfo="File" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6078875650364604154">
                    <property name="value" nameId="tpee.1070475926801" value="gentest_" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6078875650364604155">
                    <property name="value" nameId="tpee.1070475926801" value="tmp" />
                  </node>
                </node>
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6078875650364605985">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604151" resolveInfo="tmpDir" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6078875650364604157">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6078875650364604160">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6078875650364604159">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604151" resolveInfo="tmpDir" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6078875650364604164">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%ddelete()%cboolean" resolveInfo="delete" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6078875650364604166">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6078875650364604168">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6078875650364604167">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604151" resolveInfo="tmpDir" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6078875650364604172">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dmkdir()%cboolean" resolveInfo="mkdir" />
                </node>
              </node>
            </node>
          </node>
          <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="6078875650364605979">
            <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6078875650364605980">
              <property name="name" nameId="tpck.1169194664001" value="ex" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6078875650364605986">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~IOException" resolveInfo="IOException" />
              </node>
            </node>
            <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="6078875650364605982">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="6078875650364605987">
                <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6078875650364605989">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6078875650364605991">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~RuntimeException%d&lt;init&gt;(java%dlang%dThrowable)" resolveInfo="RuntimeException" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6078875650364605992">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605980" resolveInfo="ex" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6078875650364604229">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6078875650364604236">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6078875650364604231">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6078875650364604230" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="5393911253307954871">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
              </node>
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6078875650364604239">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6078875650364604240">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604151" resolveInfo="tmpDir" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6078875650364604241">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" resolveInfo="getAbsolutePath" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511079">
      <property name="name" nameId="tpck.1169194664001" value="executeTask" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7874190907999511080" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511081" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511082">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602662">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511084">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511085">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511086">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511087">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511088">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511556" resolveInfo="setGenerationProperties" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999511089">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511090">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511091">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511084" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511092">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887036" resolveInfo="hasAnythingToGenerate" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511093">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511094">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511095">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511602" resolveInfo="generate" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511096">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511082" resolveInfo="project" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511097">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511084" resolveInfo="go" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3304387091958602661">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511556">
      <property name="name" nameId="tpck.1169194664001" value="setGenerationProperties" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511557" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511558" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511559">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1011890140273761500">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1011890140273761501">
            <property name="name" nameId="tpck.1169194664001" value="strictMode" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="1011890140273761502" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1011890140273761503">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273761504">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1011890140273761505">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273761506">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="1011890140273761507">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907886493" resolveInfo="GenerateTask" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.6180231420008238377" resolveInfo="STRICT_MODE" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273761508">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273761509">
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273761511">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetStrictMode(boolean)%cvoid" resolveInfo="setStrictMode" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273761512">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273761501" resolveInfo="strictMode" />
              </node>
            </node>
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919718">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919719">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919720">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1011890140273761513">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273761514">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273761501" resolveInfo="strictMode" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1011890140273761515">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1011890140273761516">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1011890140273761517">
                <property name="name" nameId="tpck.1169194664001" value="parallelMode" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="1011890140273761518" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1011890140273761519">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273761520">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1011890140273761521">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273761522">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="1011890140273761523">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907886493" resolveInfo="GenerateTask" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.6180231420008238386" resolveInfo="PARALLEL_MODE" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273761524">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273761525">
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273761527">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetParallelGenerator(boolean)%cvoid" resolveInfo="setParallelGenerator" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273761528">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273761517" resolveInfo="parallelMode" />
                  </node>
                </node>
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919721">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919722">
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919723">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1011890140273761529">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1011890140273761530">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273761531">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1011890140273761532">
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1011890140273761534">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xjo8.~GenerationSettings%dsetNumberOfParallelThreads(int)%cvoid" resolveInfo="setNumberOfParallelThreads" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1011890140273761535">
                        <property name="value" nameId="tpee.1068580320021" value="8" />
                      </node>
                    </node>
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6476740459312919724">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6476740459312919725">
                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="y5px.~GenerationSettingsProvider" resolveInfo="GenerationSettingsProvider" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetInstance()%cjetbrains%dmps%dgenerator%dGenerationSettingsProvider" resolveInfo="getInstance" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6476740459312919726">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenerationSettingsProvider%dgetGenerationSettings()%cjetbrains%dmps%dgenerator%dIModifiableGenerationSettings" resolveInfo="getGenerationSettings" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273761536">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273761517" resolveInfo="parallelMode" />
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1011890140273761537">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1011890140273761538">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1011890140273761539">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1011890140273761540">
                    <property name="value" nameId="tpee.1070475926801" value="Generating in strict mode, parallel generation = " />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="1011890140273761541">
                    <node role="expression" roleId="tpee.1079359253376" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1011890140273761542">
                      <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1011890140273761543">
                        <property name="value" nameId="tpee.1070475926801" value="on" />
                      </node>
                      <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1011890140273761544">
                        <property name="value" nameId="tpee.1070475926801" value="off" />
                      </node>
                      <node role="condition" roleId="tpee.1163668914799" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1011890140273761545">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1011890140273761517" resolveInfo="parallelMode" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511602">
      <property name="name" nameId="tpck.1169194664001" value="generate" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511603" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511604" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511605">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602663">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511607">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511608">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511609">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511610">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511611">
            <property name="name" nameId="tpck.1169194664001" value="s" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511612">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" resolveInfo="StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511613">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511614">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;(java%dlang%dString)" resolveInfo="StringBuffer" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999511615">
                  <property name="value" nameId="tpee.1070475926801" value="Generating:" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511616">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511617">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511618">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511619">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887024" resolveInfo="getProjects" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511620">
            <property name="name" nameId="tpck.1169194664001" value="p" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386285042">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511622">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511623">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511624">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511625">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511626">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999511627">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511628">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511629">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511630">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511631">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511632">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511620" resolveInfo="p" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511633">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511634">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511635">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511636">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887028" resolveInfo="getModules" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511637">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511638">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511639">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511640">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511641">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511642">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511643">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999511644">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511645">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511646">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511647">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511648">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511649">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511637" resolveInfo="m" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511650">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511651">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511652">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511653">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887032" resolveInfo="getModels" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511654">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511655">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511656">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511657">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511658">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511659">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511660">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999511661">
                    <property name="value" nameId="tpee.1070475926801" value="\n    " />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511662">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511663">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511664">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511665">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" resolveInfo="append" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511666">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511654" resolveInfo="m" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511667">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511668">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511669">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511670">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511611" resolveInfo="s" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511671">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="3705898146943182553" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3705898146943256285">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3705898146943256286">
            <property name="name" nameId="tpck.1169194664001" value="startTestFormat" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="3705898146943256287">
              <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256288" />
              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943256289" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3705898146943256290">
              <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256291">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256292" />
              </node>
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256293">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120980">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120982">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120981">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120986">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120678" resolveInfo="testStarted" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802837780">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120987">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256291" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.TrimOperation" typeId="tpee.1225271546410" id="297656254802837786" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3705898146943256318">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3705898146943256319">
            <property name="name" nameId="tpck.1169194664001" value="finishTestFormat" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="3705898146943256320">
              <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256321" />
              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="8399196463428257316" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3705898146943256323">
              <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256324">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256325" />
              </node>
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256326">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120989">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120991">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120990">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120995">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120728" resolveInfo="testFinished" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802837787">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120996">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256324" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.TrimOperation" typeId="tpee.1225271546410" id="297656254802837792" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8194233576162607949">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8194233576162607950">
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <property name="name" nameId="tpck.1169194664001" value="count" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="8194233576162607953">
              <node role="componentType" roleId="tpee.1070534760952" type="tpee.IntegerType" typeId="tpee.1070534370425" id="8194233576162607952" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8194233576162607959">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ArrayCreatorWithInitializer" typeId="tpee.1154542696413" id="8194233576162607967">
                <node role="componentType" roleId="tpee.1154542793668" type="tpee.IntegerType" typeId="tpee.1070534370425" id="8194233576162607964" />
                <node role="initValue" roleId="tpee.1154542803372" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8194233576162607969">
                  <property name="value" nameId="tpee.1068580320021" value="1" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="8194233576162607501" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="9143630131837001678">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="9143630131837001679">
            <property name="name" nameId="tpck.1169194664001" value="ctl" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9143630131837001720">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="9143630131837001681">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="9143630131837001682">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="9143630131837001683">
                  <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.5646063728432391389" resolveInfo="IScriptController.Stub" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.5646063728432391391" resolveInfo="IScriptController.Stub" />
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6359254648150120556">
                    <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                    <property name="name" nameId="tpck.1169194664001" value="setup" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6359254648150120557" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6359254648150120558" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120559">
                      <property name="name" nameId="tpck.1169194664001" value="ppool" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150120560">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6872280991287216857" resolveInfo="IPropertiesPool" />
                      </node>
                    </node>
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120561">
                      <property name="name" nameId="tpck.1169194664001" value="toExecute" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6359254648150120562">
                        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150120563">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ud0o.6168415856807657134" resolveInfo="ITarget" />
                        </node>
                      </node>
                    </node>
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6359254648150120564">
                      <property name="name" nameId="tpck.1169194664001" value="input" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="6359254648150120565">
                        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="6359254648150120566">
                          <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648150120567">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6359254648150120568">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120570">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="6359254648150120571">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8075512910924608506" resolveInfo="setup" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120572">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120559" resolveInfo="ppool" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120573">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120561" resolveInfo="toExecute" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6359254648150120574">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120564" resolveInfo="input" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5294074698114021970">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5294074698114021971">
                          <property name="name" nameId="tpck.1169194664001" value="makeparams" />
                          <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="5294074698114021972">
                            <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="5294074698114021973">
                              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5294074698114021974">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
                              </node>
                              <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="5294074698114021975" />
                            </node>
                          </node>
                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="5294074698114021977">
                            <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="5294074698114021978">
                              <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="5294074698114021979">
                                <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5294074698114021980">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
                                </node>
                                <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="5294074698114021981" />
                              </node>
                            </node>
                            <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5294074698114021983">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5294074698114021984">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120559" resolveInfo="ppool" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5294074698114021985">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="properties" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="5294074698114021986">
                                  <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="tpcq.8096124782826059849" resolveInfo="make" />
                                  <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="5294074698114021987">
                                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="5294074698114022008">
                                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.8096124782826059775" resolveInfo="Make" />
                                    </node>
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="5294074698114021989">
                                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5294074698114021990">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5294074698114022010">
                          <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="5294074698114021999">
                            <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="5294074698114022000">
                              <property name="value" nameId="tpee.1068580320021" value="0" />
                            </node>
                            <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5294074698114022001">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5294074698114021971" resolveInfo="makeparams" />
                            </node>
                          </node>
                          <node role="rValue" roleId="tpee.1068498886297" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5294074698114022013">
                            <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5294074698114022014">
                              <property name="name" nameId="tpck.1169194664001" value="path" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="5294074698114022015" />
                            </node>
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5294074698114022016">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5294074698114022017">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="5294074698114022018">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6078875650364604217" resolveInfo="tmpFile" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5294074698114022019">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5294074698114022014" resolveInfo="path" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7621205992838583725" />
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7216969004037112956">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7216969004037112957">
                          <property name="name" nameId="tpck.1169194664001" value="tparams" />
                          <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="7216969004037112958">
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7621205992838583721">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
                            </node>
                          </node>
                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7216969004037112962">
                            <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="7216969004037112963">
                              <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7621205992838583723">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
                              </node>
                            </node>
                            <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7216969004037112967">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7216969004037112968">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120559" resolveInfo="ppool" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7216969004037112969">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="properties" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="8703512757937254335">
                                  <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="tpcq.6648795410103966566" resolveInfo="textGen" />
                                  <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="8703512757937254333">
                                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="8703512757937254334">
                                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.6648795410103966565" resolveInfo="TextGen" />
                                    </node>
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7216969004037112973">
                                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5393911253307932575">
                        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5393911253307932576">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7621205992838583726">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7621205992838583732">
                              <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7621205992838583735">
                                <property name="value" nameId="tpee.1068580123138" value="false" />
                              </node>
                              <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="7621205992838583728">
                                <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7621205992838583731">
                                  <property name="value" nameId="tpee.1068580320021" value="0" />
                                </node>
                                <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7621205992838583727">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7216969004037112957" resolveInfo="tparams" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="5393911253307932580">
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="5393911253307932583" />
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5393911253307932579">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7216969004037112957" resolveInfo="tparams" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="5294074698114022009" />
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3705898146943254891">
                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3705898146943254892">
                          <property name="name" nameId="tpck.1169194664001" value="dparams" />
                          <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="3705898146943254893">
                            <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="5294074698113831996">
                              <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1272816699443813628">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
                              </node>
                              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.StringType" typeId="tpee.1225271177708" id="1272816699443813629" />
                            </node>
                            <node role="componentType" roleId="cx9y.1238852204892" type="tp2q.SetType" typeId="tp2q.1226511727824" id="6502665912900579278">
                              <node role="elementType" roleId="tp2q.1226511765987" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6502665912900579280">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                              </node>
                            </node>
                          </node>
                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="3705898146943254898">
                            <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="3705898146943254899">
                              <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="1272816699443816032">
                                <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1272816699443816033">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
                                </node>
                                <node role="resultType" roleId="tp2c.1199542457201" type="tpee.StringType" typeId="tpee.1225271177708" id="1272816699443816034" />
                              </node>
                              <node role="componentType" roleId="cx9y.1238852204892" type="tp2q.SetType" typeId="tp2q.1226511727824" id="6502665912900579282">
                                <node role="elementType" roleId="tp2q.1226511765987" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6502665912900579284">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                                </node>
                              </node>
                            </node>
                            <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943254904">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943254905">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120559" resolveInfo="ppool" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3705898146943254906">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="properties" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="3705898146943254907">
                                  <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="c67m.3705898146943254774" resolveInfo="diff" />
                                  <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="3705898146943254908">
                                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="3705898146943254926">
                                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="c67m.3705898146943254769" resolveInfo="Diff" />
                                    </node>
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="3705898146943254910">
                                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4411339419981530025">
                        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4411339419981530026">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943254911">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1272816699443816035">
                              <node role="rValue" roleId="tpee.1068498886297" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="1272816699443816038">
                                <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1272816699443816040">
                                  <property name="name" nameId="tpck.1169194664001" value="f" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1272816699443816042">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
                                  </node>
                                </node>
                                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443816039">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1272816699443829629">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1272816699443829630">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1272816699443816043" resolveInfo="pathOfTmpFile" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443829631">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816040" resolveInfo="f" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="3705898146943254920">
                                <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="3705898146943254921">
                                  <property name="value" nameId="tpee.1068580320021" value="0" />
                                </node>
                                <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3705898146943254922">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943254892" resolveInfo="dparams" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6502665912900579286">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6502665912900579292">
                              <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6502665912900579296">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6502665912900579295">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6502665912900579300">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.3449270742160235882" resolveInfo="getExcludedFromDiffFiles" />
                                </node>
                              </node>
                              <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="6502665912900579288">
                                <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="6502665912900579291">
                                  <property name="value" nameId="tpee.1068580320021" value="1" />
                                </node>
                                <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6502665912900579287">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943254892" resolveInfo="dparams" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="4411339419981533440">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4411339419981530030">
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4411339419981530029">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943254892" resolveInfo="dparams" />
                            </node>
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4411339419981530033" />
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4411339419981533443">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4411339419981530014" resolveInfo="isShowDiff" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="8852346936509743933" />
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="8852346936509747249">
                        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="8852346936509747250">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8852346936509747219">
                            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8852346936509747220">
                              <property name="name" nameId="tpck.1169194664001" value="testParams" />
                              <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="8852346936509747221">
                                <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648149968038">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="9ymv.8688590116724766468" resolveInfo="UnitTestListener" />
                                </node>
                              </node>
                              <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="8852346936509747238">
                                <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="8852346936509747239">
                                  <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6359254648149968039">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="9ymv.8688590116724766468" resolveInfo="UnitTestListener" />
                                  </node>
                                </node>
                                <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8852346936509747241">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8852346936509747242">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120559" resolveInfo="ppool" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8852346936509747243">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="properties" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="8852346936509747244">
                                      <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="c67m.8852346936509659263" resolveInfo="runTests" />
                                      <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="8852346936509747245">
                                        <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="8852346936509747246">
                                          <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="c67m.8852346936509564326" resolveInfo="Test" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="8852346936509747247">
                                      <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8852346936509747261">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8852346936509747271">
                              <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8852346936509747274">
                                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8852346936509747276">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499632" resolveInfo="TestGenerationWorker.MyUnitTestAdapter" />
                                </node>
                              </node>
                              <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="8852346936509747267">
                                <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8852346936509747270">
                                  <property name="value" nameId="tpee.1068580320021" value="0" />
                                </node>
                                <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8852346936509747262">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8852346936509747220" resolveInfo="testParams" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="8852346936509747253">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500878" resolveInfo="isInvokeTestsSet" />
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121122">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121124">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121123">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121128">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120606" resolveInfo="finishRun" />
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150120638">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120640">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120639">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150120644">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120591" resolveInfo="startRun" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="2342584008145151785">
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145151788">
                                <property name="value" nameId="tpee.1070475926801" value="Module cluster " />
                              </node>
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="8194233576162611168">
                                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~String" resolveInfo="String" />
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dvalueOf(int)%cjava%dlang%dString" resolveInfo="valueOf" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PostfixIncrementExpression" typeId="tpee.1214918800624" id="8194233576162607975">
                                  <node role="expression" roleId="tpee.1239714902950" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="8194233576162607976">
                                    <node role="index" roleId="tpee.1173175577737" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="8194233576162607977">
                                      <property name="value" nameId="tpee.1068580320021" value="0" />
                                    </node>
                                    <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8194233576162607978">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8194233576162607950" resolveInfo="count" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="6359254648150120569">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9143630131837001684" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3705898146943200961">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3705898146943221337">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.5646063728432307526" resolveInfo="IConfigMonitor.Stub" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3705898146943221342">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="3705898146943221346">
                      <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="3705898146943221347">
                        <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                        <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.5646063728432307501" resolveInfo="IJobMonitor.Stub" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.5646063728432307503" resolveInfo="IJobMonitor.Stub" />
                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943221348" />
                        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3705898146943221351">
                          <property name="name" nameId="tpck.1169194664001" value="reportFeedback" />
                          <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943221352">
                            <property name="name" nameId="tpck.1169194664001" value="fdbk" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3705898146943221353">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.7797884084018455875" resolveInfo="IFeedback" />
                            </node>
                          </node>
                          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943221354" />
                          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943221355" />
                          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943221356">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3705898146943252115">
                              <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="3705898146943252124">
                                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="3705898146943252130">
                                  <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527775" resolveInfo="ERROR" />
                                  <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="IFeedback.Severity" />
                                </node>
                                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943252119">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943252118">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943221352" resolveInfo="fdbk" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3705898146943252123">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7797884084018527781" resolveInfo="getSeverity" />
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943252117">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="2821774308986880428">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2821774308986880429">
                                    <property name="name" nameId="tpck.1169194664001" value="test" />
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150120999">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150120998">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121003">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120832" resolveInfo="getCurrentTestName" />
                                      </node>
                                    </node>
                                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="2821774308986880430" />
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986880436">
                                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986880437">
                                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986880445">
                                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986880447">
                                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2821774308986880450">
                                          <property name="value" nameId="tpee.1070475926801" value="unknown" />
                                        </node>
                                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986880446">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986880429" resolveInfo="test" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="2821774308986880441">
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986880444" />
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986880440">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986880429" resolveInfo="test" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="297656254802859334">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="297656254802859335">
                                    <property name="name" nameId="tpck.1169194664001" value="thr" />
                                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="297656254802859336">
                                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Throwable" resolveInfo="Throwable" />
                                    </node>
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802859337">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="297656254802859338">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943221352" resolveInfo="fdbk" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802859339">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4374815845151980314" resolveInfo="getException" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="297656254802944071">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="297656254802944072">
                                    <property name="name" nameId="tpck.1169194664001" value="msg" />
                                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="297656254802944073" />
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802944074">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="297656254802944075">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943221352" resolveInfo="fdbk" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802944076">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7797884084018455910" resolveInfo="getMessage" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="297656254802944107">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="297656254802944108">
                                    <property name="name" nameId="tpck.1169194664001" value="details" />
                                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="297656254802944109" />
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="297656254802859347">
                                      <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="297656254802979053">
                                        <property name="value" nameId="tpee.1070475926801" value="(no details)" />
                                      </node>
                                      <node role="condition" roleId="tpee.1163668914799" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="297656254802979049">
                                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802979050">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802859335" resolveInfo="thr" />
                                        </node>
                                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="297656254802979051" />
                                      </node>
                                      <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="297656254802859368">
                                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~String" resolveInfo="String" />
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dvalueOf(java%dlang%dObject)%cjava%dlang%dString" resolveInfo="valueOf" />
                                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="297656254802859361">
                                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="644x.4003657351907886909" resolveInfo="MpsWorker" />
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888416" resolveInfo="extractStackTrace" />
                                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802859366">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802859335" resolveInfo="thr" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="297656254802944087">
                                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="297656254802944088">
                                    <property name="name" nameId="tpck.1169194664001" value="eol" />
                                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="297656254802944089" />
                                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802944090">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944091">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944072" resolveInfo="msg" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802944092">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dindexOf(java%dlang%dString)%cint" resolveInfo="indexOf" />
                                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="297656254802944093">
                                          <property name="value" nameId="tpee.1070475926801" value="\n" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="297656254802944096">
                                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="297656254802944097">
                                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="297656254802944121">
                                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="297656254802944123">
                                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="297656254802944145">
                                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944148">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944108" resolveInfo="details" />
                                          </node>
                                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="297656254802944141">
                                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802944127">
                                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944126">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944072" resolveInfo="msg" />
                                              </node>
                                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802944131">
                                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsubstring(int)%cjava%dlang%dString" resolveInfo="substring" />
                                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="297656254802944137">
                                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="297656254802944140">
                                                    <property name="value" nameId="tpee.1068580320021" value="1" />
                                                  </node>
                                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944132">
                                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944088" resolveInfo="eol" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="297656254802944144">
                                              <property name="value" nameId="tpee.1070475926801" value="\n" />
                                            </node>
                                          </node>
                                        </node>
                                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944122">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944108" resolveInfo="details" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="297656254802944150">
                                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="297656254802944152">
                                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="297656254802944156">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944155">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944072" resolveInfo="msg" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="297656254802944160">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsubstring(int,int)%cjava%dlang%dString" resolveInfo="substring" />
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="297656254802944161">
                                              <property name="value" nameId="tpee.1068580320021" value="0" />
                                            </node>
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944163">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944088" resolveInfo="eol" />
                                            </node>
                                          </node>
                                        </node>
                                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944151">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944072" resolveInfo="msg" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanOrEqualsExpression" typeId="tpee.1153417849900" id="297656254802944117">
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="297656254802944120">
                                      <property name="value" nameId="tpee.1068580320021" value="0" />
                                    </node>
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944113">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944088" resolveInfo="eol" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121024">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121026">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121025">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121030">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120735" resolveInfo="testFailed" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6359254648150121031">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986880429" resolveInfo="test" />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944077">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944072" resolveInfo="msg" />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="297656254802944112">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="297656254802944108" resolveInfo="details" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3705898146943221357">
                            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                          </node>
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3705898146943221365">
                          <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="3705898146943221368">
                            <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="3705898146943221369">
                              <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                              <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.9000373783400679478" resolveInfo="IProgress.Stub" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.9000373783400679480" resolveInfo="IProgress.Stub" />
                              <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943221370" />
                              <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3705898146943221372">
                                <property name="name" nameId="tpck.1169194664001" value="beginWork" />
                                <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                                <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943221373" />
                                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943221374" />
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943221375">
                                  <property name="name" nameId="tpck.1169194664001" value="name" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943221376" />
                                </node>
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943221377">
                                  <property name="name" nameId="tpck.1169194664001" value="estimate" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="3705898146943221378" />
                                </node>
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943221379">
                                  <property name="name" nameId="tpck.1169194664001" value="ofTotal" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="3705898146943221380" />
                                </node>
                                <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943221381">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943256076">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3705898146943256077">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3705898146943256057" resolveInfo="reportIfStartsWith" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3705898146943256078">
                                        <property name="value" nameId="tpee.1070475926801" value="Generating " />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256080">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943221375" resolveInfo="name" />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3705898146943256317">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256286" resolveInfo="startTestFormat" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3705898146943221382">
                                  <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                                </node>
                              </node>
                              <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3705898146943221389">
                                <property name="name" nameId="tpck.1169194664001" value="finishWork" />
                                <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                                <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943221390" />
                                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943221391" />
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943221392">
                                  <property name="name" nameId="tpck.1169194664001" value="name" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943221393" />
                                </node>
                                <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943221394">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943256087">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3705898146943256088">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3705898146943256057" resolveInfo="reportIfStartsWith" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3705898146943256089">
                                        <property name="value" nameId="tpee.1070475926801" value="Generating " />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256090">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943221392" resolveInfo="name" />
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3705898146943256348">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256319" resolveInfo="finishTestFormat" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3705898146943221395">
                                  <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                                </node>
                              </node>
                              <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3705898146943256008">
                                <property name="name" nameId="tpck.1169194664001" value="advanceWork" />
                                <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256009">
                                  <property name="name" nameId="tpck.1169194664001" value="name" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256010" />
                                </node>
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256011">
                                  <property name="name" nameId="tpck.1169194664001" value="done" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="3705898146943256012" />
                                </node>
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256013">
                                  <property name="name" nameId="tpck.1169194664001" value="comment" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256014" />
                                </node>
                                <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943256015" />
                                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3705898146943256016" />
                                <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256017">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3705898146943256130">
                                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256131">
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5627678583256187104">
                                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5627678583256187105">
                                          <property name="name" nameId="tpck.1169194664001" value="format" />
                                          <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="5627678583256187106">
                                            <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="5627678583256187107" />
                                            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="5627678583256187108" />
                                          </node>
                                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5627678583256196808">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256286" resolveInfo="startTestFormat" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5627678583256197257">
                                        <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5627678583256197258">
                                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5627678583256197271">
                                            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5627678583256197273">
                                              <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5627678583256316152">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256319" resolveInfo="finishTestFormat" />
                                              </node>
                                              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5627678583256197272">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5627678583256187105" resolveInfo="format" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="5627678583256197263">
                                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="5627678583256197266">
                                            <property name="value" nameId="tpee.1068580320021" value="1" />
                                          </node>
                                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5627678583256197262">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256011" resolveInfo="done" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943256118">
                                        <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="3705898146943256119">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3705898146943256057" resolveInfo="reportIfStartsWith" />
                                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3705898146943256121">
                                            <property name="value" nameId="tpee.1070475926801" value="Diffing " />
                                          </node>
                                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="3705898146943256140">
                                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256143">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256013" resolveInfo="comment" />
                                            </node>
                                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="3705898146943256126">
                                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256125">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256009" resolveInfo="name" />
                                              </node>
                                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3705898146943256139">
                                                <property name="value" nameId="tpee.1070475926801" value=" " />
                                              </node>
                                            </node>
                                          </node>
                                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5627678583256187115">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5627678583256187105" resolveInfo="format" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3705898146943256135">
                                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3705898146943256138" />
                                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256134">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256013" resolveInfo="comment" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3705898146943256018">
                                  <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4039389668635047546">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4039389668635047552">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4039389668635047547">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4039389668635047556">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120591" resolveInfo="startRun" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4039389668635047557">
                <property name="value" nameId="tpee.1070475926801" value="Initializing" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5031229775986962290">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5031229775986962291">
            <property name="name" nameId="tpck.1169194664001" value="result" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5031229775986962292">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2120492242099858645">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2120492242099858646">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="2120492242099858647">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="cu2c.~ModelAccess" resolveInfo="ModelAccess" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2120492242099858648">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelCommandExecutor%dflushEventQueue()%cvoid" resolveInfo="flushEventQueue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2120492242099858649">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="8638838189258389290">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d4yz.8638838189258314114" resolveInfo="runInUIThreadAndWait" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="d4yz.8638838189258314103" resolveInfo="ThreadUtils" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="8638838189258389291">
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389292">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8638838189258389293">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8638838189258389294">
                    <property name="name" nameId="tpck.1169194664001" value="context" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389295">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
                    </node>
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8638838189258389296">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8638838189258389297">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~ProjectOperationContext%d&lt;init&gt;(jetbrains%dmps%dproject%dProject)" resolveInfo="ProjectOperationContext" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389298">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511605" resolveInfo="project" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="8638838189258389299">
                  <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389300">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8638838189258389301">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8638838189258389302">
                        <property name="name" nameId="tpck.1169194664001" value="bms" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389303">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999476498" resolveInfo="BuildMakeService" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8638838189258389304">
                          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8638838189258389305">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7260781342054461655" resolveInfo="BuildMakeService" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="8638838189258389306">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8638838189258389307">
                        <property name="name" nameId="tpck.1169194664001" value="ms" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389308">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8638838189258389309">
                          <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="8638838189258389310">
                            <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="8638838189258389311">
                              <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                              <link role="classifier" roleId="tpee.1170346070688" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.2181314052156502107" resolveInfo="MakeSession" />
                              <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8638838189258389312" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389313">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389294" resolveInfo="context" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8638838189258389314">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="8638838189258389315">
                                <property name="value" nameId="tpee.1068580123138" value="true" />
                              </node>
                              <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8638838189258389316">
                                <property name="name" nameId="tpck.1169194664001" value="toScript" />
                                <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                                <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389317">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
                                </node>
                                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8638838189258389318" />
                                <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8638838189258389319">
                                  <property name="name" nameId="tpck.1169194664001" value="scriptBuilder" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389320">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1479818508463261244" resolveInfo="ScriptBuilder" />
                                  </node>
                                </node>
                                <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389321">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="8638838189258389322">
                                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389323">
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8638838189258389324">
                                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389325">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389326">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389319" resolveInfo="scriptBuilder" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389327">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261276" resolveInfo="withFacetName" />
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="8638838189258389328">
                                              <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="8638838189258389329">
                                                <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="c67m.8852346936509564326" resolveInfo="Test" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="8638838189258389330">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500878" resolveInfo="isInvokeTestsSet" />
                                    </node>
                                  </node>
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="8638838189258389331">
                                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389332">
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8638838189258389333">
                                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389334">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389335">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389319" resolveInfo="scriptBuilder" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389336">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261276" resolveInfo="withFacetName" />
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="8638838189258389337">
                                              <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="8638838189258389338">
                                                <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="c67m.3705898146943254769" resolveInfo="Diff" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="8638838189258389339">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4411339419981530014" resolveInfo="isShowDiff" />
                                    </node>
                                  </node>
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8638838189258389340">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389341">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389342">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389319" resolveInfo="scriptBuilder" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389343">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261441" resolveInfo="toScript" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="8638838189258389344">
                                  <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8638838189258389345">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="8638838189258389346">
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389347">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389348">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389349">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389302" resolveInfo="bms" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389350">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="8695426379435237791" resolveInfo="make" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389351">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389307" resolveInfo="ms" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="8638838189258389352">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3037398679707959929" resolveInfo="collectResources" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389353">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8638838189258389294" resolveInfo="context" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389354">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389355">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389356">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887024" resolveInfo="getProjects" />
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389357">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389358">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389359">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887028" resolveInfo="getModules" />
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8638838189258389360">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8638838189258389361">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389362">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887032" resolveInfo="getModels" />
                                  </node>
                                </node>
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="8638838189258389363" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389364">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9143630131837001679" resolveInfo="ctl" />
                              </node>
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8638838189258389365">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="53gy.~Future%dget()%cjava%dlang%dObject" resolveInfo="get" />
                          </node>
                        </node>
                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8638838189258389366">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5031229775986962291" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="8638838189258389367">
                    <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8638838189258389368">
                      <property name="name" nameId="tpck.1169194664001" value="ignore" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389369">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~InterruptedException" resolveInfo="InterruptedException" />
                      </node>
                    </node>
                    <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389370" />
                  </node>
                  <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="8638838189258389371">
                    <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8638838189258389372">
                      <property name="name" nameId="tpck.1169194664001" value="ignore" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8638838189258389373">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~ExecutionException" resolveInfo="ExecutionException" />
                      </node>
                    </node>
                    <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="8638838189258389374" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2120492242099858661">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2120492242099858662">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="2120492242099858663">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="cu2c.~ModelAccess" resolveInfo="ModelAccess" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2120492242099858664">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~ModelCommandExecutor%dflushEventQueue()%cvoid" resolveInfo="flushEventQueue" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3705898146943256057">
      <property name="name" nameId="tpck.1169194664001" value="reportIfStartsWith" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256062">
        <property name="name" nameId="tpck.1169194664001" value="prefix" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256064" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256065">
        <property name="name" nameId="tpck.1169194664001" value="work" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256067" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943256068">
        <property name="name" nameId="tpck.1169194664001" value="format" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="3705898146943256070">
          <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.StringType" typeId="tpee.1225271177708" id="3705898146943256074" />
          <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943256072" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3705898146943256058" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3705898146943256061" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256060">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3705898146943256397">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="3705898146943256405">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943256409">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256408">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256065" resolveInfo="work" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3705898146943256413">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dstartsWith(java%dlang%dString)%cboolean" resolveInfo="startsWith" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256414">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256062" resolveInfo="prefix" />
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3705898146943256401">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256400">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256065" resolveInfo="work" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3705898146943256404" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943256399">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943256415">
              <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="3705898146943256417">
                <node role="parameter" roleId="tp2c.1235747002942" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="2342584008145151776">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145151780">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2342584008145151779">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256062" resolveInfo="prefix" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.TrimOperation" typeId="tpee.1225271546410" id="2342584008145151784" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="2342584008145143013">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8194233576162607495">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8194233576162607496">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256065" resolveInfo="work" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8194233576162607497">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsubstring(int)%cjava%dlang%dString" resolveInfo="substring" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8194233576162607498">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8194233576162607499">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256062" resolveInfo="prefix" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8194233576162607500">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dlength()%cint" resolveInfo="length" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2342584008145151775">
                      <property name="value" nameId="tpee.1070475926801" value=".Test." />
                    </node>
                  </node>
                </node>
                <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943256418">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943256068" resolveInfo="format" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499746">
      <property name="name" nameId="tpck.1169194664001" value="work" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499747" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499748" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499749">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499750">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499751">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887290" resolveInfo="setupEnvironment" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2342584008145159111">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2342584008145159113">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2342584008145159112">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2342584008145159117">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2342584008145151795" resolveInfo="init" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SingleLineComment" typeId="tpee.6329021646629104954" id="3705898146943200905">
          <node role="commentPart" roleId="tpee.6329021646629175155" type="tpee.TextCommentPart" typeId="tpee.6329021646629104957" id="3705898146943200906">
            <property name="text" nameId="tpee.6329021646629104958" value=" for each project" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499752">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499753">
            <property name="name" nameId="tpck.1169194664001" value="mpsProjects" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499754">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" resolveInfo="Map" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499755">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
              </node>
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499756">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
                <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499757">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499758">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499759">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499760">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907892373" resolveInfo="getMPSProjectFiles" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019499761">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499762">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499763">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499753" resolveInfo="mpsProjects" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499764">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dkeySet()%cjava%dutil%dSet" resolveInfo="keySet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499765">
            <property name="name" nameId="tpck.1169194664001" value="file" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499766">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499767">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019499768">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019499769">
                <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499770">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499771">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499772">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499765" resolveInfo="file" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499773">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetName()%cjava%dlang%dString" resolveInfo="getName" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499774">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dendsWith(java%dlang%dString)%cboolean" resolveInfo="endsWith" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019499775">
                      <link role="classifier" roleId="tpee.1144433057691" targetNodeId="vsqj.~MPSExtentions" resolveInfo="MPSExtentions" />
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="vsqj.~MPSExtentions%dDOT_MPS_PROJECT" resolveInfo="DOT_MPS_PROJECT" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499776">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ContinueStatement" typeId="tpee.1082113931046" id="7795897115019499777" />
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499778">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499779">
                <property name="name" nameId="tpck.1169194664001" value="p" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602657">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4039389668635047114">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4039389668635047116">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.8638838189258374790" resolveInfo="FileMPSProject" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4039389668635047117">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499765" resolveInfo="file" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499815">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499816">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888318" resolveInfo="info" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019499817">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019499818">
                    <property name="value" nameId="tpee.1070475926801" value="Loaded project " />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499819">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499820">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499821">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511079" resolveInfo="executeTask" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499822">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499823">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499824">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887012" resolveInfo="MpsWorker.ObjectsToProcess" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499825">
                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" resolveInfo="Collections" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dsingleton(java%dlang%dObject)%cjava%dutil%dSet" resolveInfo="singleton" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499826">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499827">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499828">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~HashSet%d&lt;init&gt;()" resolveInfo="HashSet" />
                        <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499829">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499830">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499831">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~HashSet%d&lt;init&gt;()" resolveInfo="HashSet" />
                        <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499832">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499833">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499834">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887276" resolveInfo="disposeProject" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499835">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499836">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499837">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887239" resolveInfo="dispose" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="3705898146943200902" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SingleLineComment" typeId="tpee.6329021646629104954" id="3705898146943200908">
          <node role="commentPart" roleId="tpee.6329021646629175155" type="tpee.TextCommentPart" typeId="tpee.6329021646629104957" id="3705898146943200909">
            <property name="text" nameId="tpee.6329021646629104958" value="the rest -- using dummy project" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499838">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499839">
            <property name="name" nameId="tpck.1169194664001" value="modules" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499840">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~LinkedHashSet" resolveInfo="LinkedHashSet" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499841">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499842">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499843">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~LinkedHashSet%d&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499844">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499845">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499846">
            <property name="name" nameId="tpck.1169194664001" value="models" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499847">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~LinkedHashSet" resolveInfo="LinkedHashSet" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499848">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499849">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499850">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~LinkedHashSet%d&lt;init&gt;()" resolveInfo="LinkedHashSet" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499851">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499852">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499853">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888005" resolveInfo="collectFromModuleFiles" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499854">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499839" resolveInfo="modules" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499855">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499856">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888146" resolveInfo="collectFromModelFiles" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499857">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499846" resolveInfo="models" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499858">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499859">
            <property name="name" nameId="tpck.1169194664001" value="go" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499860">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907886995" resolveInfo="MpsWorker.ObjectsToProcess" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499861">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499862">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887012" resolveInfo="MpsWorker.ObjectsToProcess" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019499863">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="k7g3.~Collections" resolveInfo="Collections" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="k7g3.~Collections%dEMPTY_SET" resolveInfo="EMPTY_SET" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499864">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499839" resolveInfo="modules" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499865">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499846" resolveInfo="models" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019499866">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499867">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499868">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499859" resolveInfo="go" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499869">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887036" resolveInfo="hasAnythingToGenerate" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499870">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499871">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499872">
                <property name="name" nameId="tpck.1169194664001" value="project" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958602665">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499874">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887206" resolveInfo="createDummyProject" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499875">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499876">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511079" resolveInfo="executeTask" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499877">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499872" resolveInfo="project" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499878">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499859" resolveInfo="go" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="4501880644515749778">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="4501880644515749779">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4501880644515758691">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4501880644515758692">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888363" resolveInfo="error" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="4501880644515758693">
                    <property name="value" nameId="tpee.1070475926801" value="Could not find anything to generate." />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4003657351907881546">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4003657351907881548">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="4003657351907881551">
                    <property name="value" nameId="tpee.1068580123138" value="true" />
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4003657351907881547">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499664" resolveInfo="myTestFailed" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="3705898146943200903" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6359254648150121141">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6359254648150121143">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6359254648150121142">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6359254648150120595" resolveInfo="myReporter" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6359254648150121147">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6359254648150120606" resolveInfo="finishRun" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1272816699443831536">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="1272816699443831537">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4128185861943385942" resolveInfo="cleanUp" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499881">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499882">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907887239" resolveInfo="dispose" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499883">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499884">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019501197" resolveInfo="showStatistic" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4128185861943385942">
      <property name="name" nameId="tpck.1169194664001" value="cleanUp" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4128185861943385943" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="4128185861943385944" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4128185861943385945">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForStatement" typeId="tpee.1144231330558" id="4128185861943385956">
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="4128185861943385957">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4128185861943385985">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4128185861943385986">
                <property name="name" nameId="tpck.1169194664001" value="dir" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4128185861943385987">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943385988">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943385989">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943385960" resolveInfo="dirs" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.RemoveFirstElementOperation" typeId="tp2q.1227026082377" id="4128185861943385990" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4128185861943386030">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943386032">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386031">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943385986" resolveInfo="dir" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4128185861943386036">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%ddeleteOnExit()%cvoid" resolveInfo="deleteOnExit" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="4128185861943386001">
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="4128185861943386002">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4128185861943386010">
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4128185861943386011">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4128185861943386020">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943386022">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386021">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943385960" resolveInfo="dirs" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.AddLastElementOperation" typeId="tp2q.1227022179634" id="4128185861943386026">
                          <node role="argument" roleId="tp2q.1227022698412" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386028">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943386004" resolveInfo="f" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943386015">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386014">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943386004" resolveInfo="f" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4128185861943386019">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%disDirectory()%cboolean" resolveInfo="isDirectory" />
                    </node>
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="4128185861943386045">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="4128185861943386046">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4128185861943386047">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943386049">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386048">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943386004" resolveInfo="f" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4128185861943386053">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%ddeleteOnExit()%cvoid" resolveInfo="deleteOnExit" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4128185861943386004">
                <property name="name" nameId="tpck.1169194664001" value="f" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4128185861943386006">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                </node>
              </node>
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943386007">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943386008">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943385986" resolveInfo="dir" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4128185861943386009">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dlistFiles()%cjava%dio%dFile[]" resolveInfo="listFiles" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4128185861943385960">
            <property name="name" nameId="tpck.1169194664001" value="dirs" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.QueueType" typeId="tp2q.5686963296372475025" id="4128185861943385961">
              <node role="elementType" roleId="tp2q.5686963296372573084" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4128185861943385962">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4128185861943385963">
              <node role="creator" roleId="tpee.1145553007750" type="tp2q.LinkedListCreator" typeId="tp2q.1227008614712" id="4128185861943385964">
                <node role="elementType" roleId="tp2q.1237721435807" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4128185861943385965">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
                </node>
                <node role="initValue" roleId="tp2q.1237721435808" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="4128185861943385967">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="4128185861943385969">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" resolveInfo="File" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4128185861943385970">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1144231399730" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4128185861943385972">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4128185861943385971">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4128185861943385960" resolveInfo="dirs" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.IsNotEmptyOperation" typeId="tp2q.1176501494711" id="4128185861943385976" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3416062119153932803">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3416062119153932810">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3416062119153932813" />
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3416062119153932805">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="3416062119153932804" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="1272816699443831538">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3416062119153932795">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3416062119153932797">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3416062119153932796">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932762" resolveInfo="path2tmp" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.MapClearOperation" typeId="tp2q.1208542034276" id="3416062119153932801" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3037398679707959929">
      <property name="name" nameId="tpck.1169194664001" value="collectResources" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3037398679707992897">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3037398679707992900">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943200910">
        <property name="name" nameId="tpck.1169194664001" value="projects" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3705898146943200912">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386274809">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943199232">
        <property name="name" nameId="tpck.1169194664001" value="modules" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3705898146943199234">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3705898146943199236">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3705898146943199237">
        <property name="name" nameId="tpck.1169194664001" value="models" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3705898146943199239">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3705898146943199241">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3037398679707959934">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2786477942048304560">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3037398679707959933" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3037398679707959932">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3037398679707966202">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3037398679707966203">
            <property name="name" nameId="tpck.1169194664001" value="result" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="3037398679707966204">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3037398679707966648">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~SModelDescriptor" resolveInfo="SModelDescriptor" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3037398679707966650" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tp4k.ExecuteLightweightCommandStatement" typeId="tp4k.1225441341971" id="3037398679707966652">
          <node role="commandClosureLiteral" roleId="tp4k.1225441160167" type="tp4k.CommandClosureLiteral" typeId="tp4k.1225441216717" id="3037398679707966653">
            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3037398679707966654">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7260781342054461784">
                <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054461785">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7260781342054499887">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054500293">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7260781342054500269" resolveInfo="isWholeProject" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500291">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054499898">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054499980">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7260781342054499982">
                          <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499986">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054499985">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943199232" resolveInfo="modules" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="7260781342054499990">
                              <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499993">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054499992">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499997">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetModules()%cjava%dutil%dList" resolveInfo="getModules" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054499981">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943199232" resolveInfo="modules" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7260781342054499956">
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054499966">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7260781342054500024">
                          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054500025">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7260781342054500033">
                              <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054500034">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054500063">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7260781342054500065">
                                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500069">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500361">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="7260781342054500073">
                                        <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3648686480793156125">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3648686480793156126">
                                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3648686480793156127">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054500026" resolveInfo="tconf" />
                                            </node>
                                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3648686480793156128">
                                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="zss2.~BaseTestConfiguration%dgetGenParams(jetbrains%dmps%dproject%dProject,boolean)%cjetbrains%dmps%dgenerator%dGenParameters" resolveInfo="getGenParams" />
                                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3648686480793156130">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                                              </node>
                                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3648686480793156132">
                                                <property name="value" nameId="tpee.1068580123138" value="true" />
                                              </node>
                                            </node>
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3648686480793156133">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="y5px.~GenParameters%dgetModelDescriptors()%cjava%dutil%dList" resolveInfo="getModelDescriptors" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500360">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7260781342054500035">
                                <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7260781342054500036">
                                  <property name="name" nameId="tpck.1169194664001" value="e" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054500084">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="zss2.~IllegalGeneratorConfigurationException" resolveInfo="IllegalGeneratorConfigurationException" />
                                  </node>
                                </node>
                                <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054500038">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054500085">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054500086">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888394" resolveInfo="log" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7260781342054500087">
                                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7260781342054500088">
                                          <property name="value" nameId="tpee.1070475926801" value="Error while reading configuration of project " />
                                        </node>
                                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500089">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500245">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054500093">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetName()%cjava%dlang%dString" resolveInfo="getName" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500094">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054500036" resolveInfo="e" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7260781342054500026">
                            <property name="name" nameId="tpck.1169194664001" value="tconf" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6210331406481156039">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="zss2.~BaseTestConfiguration" resolveInfo="BaseTestConfiguration" />
                            </node>
                          </node>
                          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500028">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500029">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054500030">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054500031">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetProjectDescriptor()%cjetbrains%dmps%dproject%dstructure%dproject%dProjectDescriptor" resolveInfo="getProjectDescriptor" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054500032">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mysr.~ProjectDescriptor%dgetTestConfigurations()%cjava%dutil%dList" resolveInfo="getTestConfigurations" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7260781342054499968">
                        <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054499969">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054499970">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054499971">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907888338" resolveInfo="warning" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7260781342054499972">
                                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7260781342054499973">
                                  <property name="value" nameId="tpee.1070475926801" value="No test configurations for project " />
                                </node>
                                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499974">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499975">
                                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499977">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetProjectDescriptor()%cjetbrains%dmps%dproject%dstructure%dproject%dProjectDescriptor" resolveInfo="getProjectDescriptor" />
                                    </node>
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054499979">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499978">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mysr.~ProjectDescriptor%dgetName()%cjava%dlang%dString" resolveInfo="getName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7260781342054500353">
                        <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499888">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499889">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054499890">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7260781342054499891">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461786" resolveInfo="prj" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499892">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetProjectDescriptor()%cjetbrains%dmps%dproject%dstructure%dproject%dProjectDescriptor" resolveInfo="getProjectDescriptor" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499893">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mysr.~ProjectDescriptor%dgetTestConfigurations()%cjava%dutil%dList" resolveInfo="getTestConfigurations" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054499894">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" resolveInfo="isEmpty" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7260781342054461786">
                  <property name="name" nameId="tpck.1169194664001" value="prj" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386274810">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                  </node>
                </node>
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461788">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943200910" resolveInfo="projects" />
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943200083">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3705898146943200085">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943200089">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3705898146943200088">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="3705898146943200093">
                      <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943200096">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943200095">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943199232" resolveInfo="modules" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.TranslateOperation" typeId="tp2q.1201792049884" id="3705898146943200100">
                          <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3705898146943200101">
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3705898146943200102">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3705898146943200105">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3705898146943200107">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3705898146943200106">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943200103" resolveInfo="m" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3705898146943200111">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~IModule%dgetOwnModelDescriptors()%cjava%dutil%dList" resolveInfo="getOwnModelDescriptors" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3705898146943200103">
                              <property name="name" nameId="tpck.1169194664001" value="m" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3705898146943200104" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3705898146943200084">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307930961">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5393911253307930963">
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5393911253307930962">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                  </node>
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307930967">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5393911253307930966">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="5393911253307930971">
                      <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307931298">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307931299">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307931300">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307931301">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943199232" resolveInfo="modules" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="5393911253307931302">
                              <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5393911253307931303">
                                <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5393911253307931304">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307931305">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="5393911253307931306">
                                      <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5393911253307931307">
                                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~Language" resolveInfo="Language" />
                                      </node>
                                      <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307931308">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5393911253307931309" resolveInfo="it" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="5393911253307931309">
                                  <property name="name" nameId="tpck.1169194664001" value="it" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="5393911253307931310" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp2q.TranslateOperation" typeId="tp2q.1201792049884" id="5393911253307931311">
                            <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5393911253307931312">
                              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5393911253307931313">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307931314">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5393911253307931315">
                                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" resolveInfo="Collections" />
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dunmodifiableList(java%dutil%dList)%cjava%dutil%dList" resolveInfo="unmodifiableList" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307931316">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="5393911253307931317">
                                        <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="5393911253307931318">
                                          <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5393911253307931319">
                                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~Language" resolveInfo="Language" />
                                          </node>
                                          <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307931320">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5393911253307931323" resolveInfo="it" />
                                          </node>
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5393911253307931321">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~Language%dgetGenerators()%cjava%dutil%dList" resolveInfo="getGenerators" />
                                      </node>
                                    </node>
                                    <node role="typeArgument" roleId="tpee.4972241301747169160" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5393911253307931322">
                                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~IModule" resolveInfo="IModule" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="5393911253307931323">
                                <property name="name" nameId="tpck.1169194664001" value="it" />
                                <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="5393911253307931324" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp2q.TranslateOperation" typeId="tp2q.1201792049884" id="5393911253307931325">
                          <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5393911253307931326">
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5393911253307931327">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307931328">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307931329">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307931330">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5393911253307931332" resolveInfo="gen" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5393911253307931331">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~IModule%dgetOwnModelDescriptors()%cjava%dutil%dList" resolveInfo="getOwnModelDescriptors" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="5393911253307931332">
                              <property name="name" nameId="tpck.1169194664001" value="gen" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="5393911253307931333" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307930985">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5393911253307930987">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307930991">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5393911253307930990">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.ConcatOperation" typeId="tp2q.1180964022718" id="5393911253307930995">
                      <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307930996">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3705898146943199237" resolveInfo="models" />
                      </node>
                    </node>
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5393911253307930986">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3037398679707966845">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3037398679707966877">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3037398679707966846">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3037398679707966848">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fn29.7219626660275504881" resolveInfo="ModelsToResources" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3037398679707992910">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707992897" resolveInfo="context" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3037398679707992878">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3037398679707992879">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707966203" resolveInfo="result" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp2q.WhereOperation" typeId="tp2q.1202120902084" id="3037398679707992880">
                    <node role="closure" roleId="tp2q.1204796294226" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="3037398679707992881">
                      <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="3037398679707992882">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5393911253307930953">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5393911253307930955">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5393911253307930954">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3037398679707992887" resolveInfo="smd" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5393911253307930959">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~SModelDescriptor%disGeneratable()%cboolean" resolveInfo="isGeneratable" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter" roleId="tp2c.1199569906740" type="tp2q.SmartClosureParameterDeclaration" typeId="tp2q.1203518072036" id="3037398679707992887">
                        <property name="name" nameId="tpck.1169194664001" value="smd" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.UndefinedType" typeId="tpee.4836112446988635817" id="3037398679707992888" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3037398679707966881">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fn29.7219626660275509691" resolveInfo="resources" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3037398679707966882">
                <property name="value" nameId="tpee.1068580123138" value="false" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7260781342054500269">
      <property name="name" nameId="tpck.1169194664001" value="isWholeProject" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7260781342054500270" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7260781342054500271" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7260781342054500268">
        <property name="name" nameId="tpck.1169194664001" value="prj" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1642581460386274811">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054500273">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7260781342054500274">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500275">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="7260781342054500276">
              <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7260781342054500277">
                <node role="type" roleId="tpee.1070534934091" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7260781342054500278">
                  <node role="elementType" roleId="tp2q.1151689745422" type="tpee.StringType" typeId="tpee.1225271177708" id="7260781342054500279" />
                </node>
                <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500280">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054500281">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7260781342054500282">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054500283">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907892373" resolveInfo="getMPSProjectFiles" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7260781342054500284">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" resolveInfo="get" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6502665912900549031">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054500285">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054500268" resolveInfo="prj" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6502665912900549035">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="vsqj.~Project%dgetProjectFile()%cjava%dio%dFile" resolveInfo="getProjectFile" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ContainsOperation" typeId="tp2q.1172254888721" id="7260781342054500286">
              <node role="argument" roleId="tp2q.1172256416782" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7260781342054500287">
                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907891908" resolveInfo="TestGenerationOnTeamcity" />
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907891923" resolveInfo="WHOLE_PROJECT" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6078875650364604217">
      <property name="name" nameId="tpck.1169194664001" value="tmpFile" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6078875650364604221">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6078875650364604219" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6078875650364604220">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7216969004037110160">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7216969004037110161">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7216969004037110172">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7216969004037110179">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7216969004037110180">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="59et.~FileSystem" resolveInfo="FileSystem" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetInstance()%cjetbrains%dmps%dvfs%dFileSystem" resolveInfo="getInstance" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7216969004037110181">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetFileByPath(java%dlang%dString)%cjetbrains%dmps%dvfs%dIFile" resolveInfo="getFileByPath" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="7216969004037110184">
                    <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7216969004037110187">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                    </node>
                    <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7216969004037110183">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932762" resolveInfo="path2tmp" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7216969004037110165">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7216969004037110164">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932762" resolveInfo="path2tmp" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.ContainsKeyOperation" typeId="tp2q.1201306600024" id="7216969004037110169">
              <node role="key" roleId="tp2q.1201654602639" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7216969004037110171">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6078875650364605934">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6078875650364605935">
            <property name="name" nameId="tpck.1169194664001" value="idx" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="6078875650364605936" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6078875650364605937">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6078875650364605938">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6078875650364605939">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dindexOf(java%dlang%dString)%cint" resolveInfo="indexOf" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7216969004037110189">
                  <property name="value" nameId="tpee.1070475926801" value="/" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1272816699443828266">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443828267">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="1272816699443828282">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1272816699443828284">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1272816699443828286">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalArgumentException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828292">
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828295">
                      <property name="value" nameId="tpee.1070475926801" value="'" />
                    </node>
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828288">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828287">
                        <property name="value" nameId="tpee.1070475926801" value="not an absolute path '" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443828291">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="1272816699443828278">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1272816699443828281">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828270">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3703252800112061830">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3703252800112061832">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="3703252800112061840">
              <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3703252800112061851">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
              </node>
              <node role="condition" roleId="tpee.1163668914799" type="tpee.LessThanExpression" typeId="tpee.1081506773034" id="3703252800112061836">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="3703252800112061839">
                  <property name="value" nameId="tpee.1068580320021" value="0" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3703252800112061835">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3703252800112061845">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3703252800112061844">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3703252800112061849">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dindexOf(java%dlang%dString)%cint" resolveInfo="indexOf" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="3703252800112061850">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" resolveInfo="File" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparator" resolveInfo="separator" />
                  </node>
                </node>
              </node>
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3703252800112061831">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1272816699443828297">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443828298">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="1272816699443828340">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1272816699443828341">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1272816699443828342">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalArgumentException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828343">
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828344">
                      <property name="value" nameId="tpee.1070475926801" value="'" />
                    </node>
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828345">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828346">
                        <property name="value" nameId="tpee.1070475926801" value="not an absolute path '" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443828347">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="1272816699443828325">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LessThanExpression" typeId="tpee.1081506773034" id="1272816699443828335">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1272816699443828338">
                <property name="value" nameId="tpee.1068580320021" value="0" />
              </node>
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828329">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443828328">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828333">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dindexOf(java%dlang%dString)%cint" resolveInfo="indexOf" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828334">
                    <property name="value" nameId="tpee.1070475926801" value=":" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="1272816699443828302">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828301">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828306">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828305">
                  <property name="value" nameId="tpee.1070475926801" value="C:\\" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828310">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dlength()%cint" resolveInfo="length" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3416062119153932770">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3416062119153932771">
            <property name="name" nameId="tpck.1169194664001" value="tmp" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3416062119153932772" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="3416062119153932773">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="3416062119153932774">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="8852346936509751833">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7216969004037110191">
                  <property name="value" nameId="tpee.1070475926801" value="/" />
                </node>
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="3703252800112156953">
                <node role="expression" roleId="tpee.1079359253376" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="3703252800112156954">
                  <node role="condition" roleId="tpee.1163668914799" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="1272816699443828360">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828361">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364605935" resolveInfo="idx" />
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1272816699443828362">
                      <property name="value" nameId="tpee.1068580320021" value="0" />
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3703252800112156958">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3703252800112156959">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3703252800112156960">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dreplace(java%dlang%dCharSequence,java%dlang%dCharSequence)%cjava%dlang%dString" resolveInfo="replace" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828349">
                        <property name="value" nameId="tpee.1070475926801" value=":" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828351">
                        <property name="value" nameId="tpee.1070475926801" value="_w_" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3703252800112156963">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3703252800112156964">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3703252800112156965">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsubstring(int)%cjava%dlang%dString" resolveInfo="substring" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1272816699443828363">
                        <property name="value" nameId="tpee.1068580320021" value="1" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3416062119153932780">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3416062119153932786">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3416062119153932789">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932771" resolveInfo="tmp" />
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tp2q.MapElement" typeId="tp2q.1197932370469" id="3416062119153932782">
              <node role="key" roleId="tp2q.1197932525128" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3416062119153932785">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604222" resolveInfo="path" />
              </node>
              <node role="map" roleId="tp2q.1197932505799" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3416062119153932781">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932762" resolveInfo="path2tmp" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5886520856560013573">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828261">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1272816699443828262">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="59et.~FileSystem" resolveInfo="FileSystem" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetInstance()%cjetbrains%dmps%dvfs%dFileSystem" resolveInfo="getInstance" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828263">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetFileByPath(java%dlang%dString)%cjetbrains%dmps%dvfs%dIFile" resolveInfo="getFileByPath" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828264">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3416062119153932771" resolveInfo="tmp" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6078875650364604222">
        <property name="name" nameId="tpck.1169194664001" value="path" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="6078875650364604223" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="1272816699443816043">
      <property name="name" nameId="tpck.1169194664001" value="pathOfTmpFile" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1272816699443816049">
        <property name="name" nameId="tpck.1169194664001" value="file" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1272816699443816051">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="59et.~IFile" resolveInfo="IFile" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1272816699443816048" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1272816699443816047" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443816046">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1272816699443816059">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1272816699443816060">
            <property name="name" nameId="tpck.1169194664001" value="p" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1272816699443816061">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443816062">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443816063">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816049" resolveInfo="file" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443816064">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~IFile%dgetPath()%cjava%dlang%dString" resolveInfo="getPath" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1272816699443816066">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443816067">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="1272816699443828219">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1272816699443828221">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1272816699443828223">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~IllegalArgumentException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalArgumentException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828234">
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828237">
                      <property name="value" nameId="tpee.1070475926801" value="'" />
                    </node>
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828225">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828224">
                        <property name="value" nameId="tpee.1070475926801" value="unknown tmp path '" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828229">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1272816699443828228">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816049" resolveInfo="file" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828233">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~IFile%dgetParent()%cjetbrains%dmps%dvfs%dIFile" resolveInfo="getParent" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="1272816699443828214">
            <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828215">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828216">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828217">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dstartsWith(java%dlang%dString)%cboolean" resolveInfo="startsWith" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1272816699443828238">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1272816699443828239">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1272816699443828241">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828245">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828244">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828249">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsubstring(int)%cjava%dlang%dString" resolveInfo="substring" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828256">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1272816699443828259">
                    <property name="value" nameId="tpee.1068580320021" value="1" />
                  </node>
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828251">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="1272816699443828250">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6078875650364604224" resolveInfo="tmpPath" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828255">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dlength()%cint" resolveInfo="length" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828240">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1272816699443828364">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1272816699443828365">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1272816699443828375">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828396">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828379">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1272816699443828380">
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="59et.~FileSystem" resolveInfo="FileSystem" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetInstance()%cjetbrains%dmps%dvfs%dFileSystem" resolveInfo="getInstance" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828381">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetFileByPath(java%dlang%dString)%cjetbrains%dmps%dvfs%dIFile" resolveInfo="getFileByPath" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828384">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828383">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828388">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dreplace(java%dlang%dCharSequence,java%dlang%dCharSequence)%cjava%dlang%dString" resolveInfo="replace" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828389">
                          <property name="value" nameId="tpee.1070475926801" value="_w_" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828391">
                          <property name="value" nameId="tpee.1070475926801" value=":" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828400">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~IFile%dgetPath()%cjava%dlang%dString" resolveInfo="getPath" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828369">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828368">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828373">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dcontains(java%dlang%dCharSequence)%cboolean" resolveInfo="contains" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828374">
                <property name="value" nameId="tpee.1070475926801" value="_w_" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1272816699443828431">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1272816699443828432">
            <property name="name" nameId="tpck.1169194664001" value="prefix" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="1272816699443828433" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1272816699443828434">
              <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828435">
                <property name="value" nameId="tpee.1070475926801" value="/" />
              </node>
              <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="1272816699443828436">
                <property name="value" nameId="tpee.1070475926801" value="\\\\" />
              </node>
              <node role="condition" roleId="tpee.1163668914799" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1272816699443828437">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.CharConstant" typeId="tpee.1200397529627" id="1272816699443828438">
                  <property name="charConstant" nameId="tpee.1200397540847" value="/" />
                </node>
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="1272816699443828439">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" resolveInfo="File" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparatorChar" resolveInfo="separatorChar" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1272816699443828402">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828444">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1272816699443828405">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="1272816699443828406">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetInstance()%cjetbrains%dmps%dvfs%dFileSystem" resolveInfo="getInstance" />
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="59et.~FileSystem" resolveInfo="FileSystem" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828407">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~FileSystem%dgetFileByPath(java%dlang%dString)%cjetbrains%dmps%dvfs%dIFile" resolveInfo="getFileByPath" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="1272816699443828440">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828443">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443828432" resolveInfo="prefix" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1272816699443828409">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1272816699443816060" resolveInfo="p" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1272816699443828448">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="59et.~IFile%dgetPath()%cjava%dlang%dString" resolveInfo="getPath" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500067">
      <property name="name" nameId="tpck.1169194664001" value="getBuildServerMessageFormat" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500068" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500069">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="644x.4003657351907889184" resolveInfo="IBuildServerMessageFormat" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500070">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500071">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500072">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500082" resolveInfo="isRunningOnTeamCity" />
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019500073">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500074">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500075">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500076">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500077">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="kio7.4003657351907889943" resolveInfo="ConsoleMessageFormat" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500078">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500079">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500080">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500081">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893942" resolveInfo="TeamCityMessageFormat" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500082">
      <property name="name" nameId="tpck.1169194664001" value="isRunningOnTeamCity" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500083" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500084" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500085">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500086">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019500087">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500088">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500089">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500090">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500091">
                  <property name="value" nameId="tpee.1070475926801" value="teamcity.version" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019500092" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500129">
      <property name="name" nameId="tpck.1169194664001" value="getPerfomanceReportDestinations" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500130" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019500131">
        <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500132">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500133">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500134">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500135">
            <property name="name" nameId="tpck.1169194664001" value="reportType" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500136">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500137">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500138">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500139">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500140">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907891908" resolveInfo="TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907891927" resolveInfo="GENERATE_PERFORMANCE_REPORT" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500141">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="7795897115019500142">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7795897115019500143">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500144">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500135" resolveInfo="reportType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019500145" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500146">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500147">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500135" resolveInfo="reportType" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500148">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" resolveInfo="isEmpty" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500149">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500150">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500151">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ArrayCreatorWithInitializer" typeId="tpee.1154542696413" id="7795897115019500152">
                  <node role="componentType" roleId="tpee.1154542793668" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500153">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500154">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500155">
            <property name="name" nameId="tpck.1169194664001" value="reports" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019500156">
              <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500157">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500158">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500159">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500135" resolveInfo="reportType" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500160">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsplit(java%dlang%dString)%cjava%dlang%dString[]" resolveInfo="split" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500161">
                  <property name="value" nameId="tpee.1070475926801" value=",+" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500162">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500163">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500155" resolveInfo="reports" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500400">
      <property name="name" nameId="tpck.1169194664001" value="isSaveGeneratedFilesOnDisk" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500401" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500402" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500403">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500404">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500405">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500406">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500407">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500408">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500409">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907891908" resolveInfo="TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907891915" resolveInfo="SAVE_ON_DISK" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500878">
      <property name="name" nameId="tpck.1169194664001" value="isInvokeTestsSet" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500879" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500880" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500881">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500882">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500883">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500884">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500885">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500886">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500887">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500888">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907891908" resolveInfo="TestGenerationOnTeamcity" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907891911" resolveInfo="INVOKE_TESTS" />
                  </node>
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500889">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500890" resolveInfo="isCompileSet" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500890">
      <property name="name" nameId="tpck.1169194664001" value="isCompileSet" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500891" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500892" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500893">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500894">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500895">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500896">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500897">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500898">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500899">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907886493" resolveInfo="GenerateTask" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907886496" resolveInfo="COMPILE" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4411339419981530014">
      <property name="name" nameId="tpck.1169194664001" value="isShowDiff" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="4411339419981530015" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4411339419981530016" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4411339419981530017">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4411339419981530018">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4411339419981530019">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4411339419981530020">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4411339419981530021">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4411339419981530022">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907893371" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="4411339419981530023">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="kio7.4003657351907891908" resolveInfo="TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="kio7.4003657351907891919" resolveInfo="SHOW_DIFF" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501197">
      <property name="name" nameId="tpck.1169194664001" value="showStatistic" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019501198" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019501199" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501200">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501201">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019501202">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501203">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499664" resolveInfo="myTestFailed" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501204">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501205">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="644x.4003657351907887058" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501206">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="644x.4003657351907892397" resolveInfo="getFailOnError" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501207">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7795897115019501208">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501209">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501210">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="kp22.~BuildException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="BuildException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501211">
                    <property name="value" nameId="tpee.1070475926801" value="Tests Failed" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501212">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
      </node>
    </node>
  </root>
  <root id="7874190907999476498">
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="4427136928946606713">
      <property name="name" nameId="tpck.1169194664001" value="LOG" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="4427136928946606714" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4427136928946606716">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="to5d.~Logger" resolveInfo="Logger" />
      </node>
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4427136928946606719">
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="to5d.~Logger%dgetLogger(java%dlang%dClass)%cjetbrains%dmps%dlogging%dLogger" resolveInfo="getLogger" />
        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="to5d.~Logger" resolveInfo="Logger" />
        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="4427136928946606721">
          <link role="classifier" roleId="tpee.1116615189566" targetNodeId="7874190907999476498" resolveInfo="BuildMakeService" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7874190907999486670">
      <property name="name" nameId="tpck.1169194664001" value="defaultMakeScript" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999486671" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999486672">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6085445418775341921">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6085445418775341922">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6085445418775341923">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6085445418775341924">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6085445418775341925">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6085445418775341926">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261979" resolveInfo="ScriptBuilder" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6085445418775341927">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261319" resolveInfo="withFacetNames" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="6085445418775341928">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="6085445418775341929">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="bgxn.6648795410103988025" resolveInfo="Binaries" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="6085445418775341930">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="6085445418775341931">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.6648795410103939538" resolveInfo="Generate" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="6085445418775341932">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="6085445418775341933">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.6648795410103966565" resolveInfo="TextGen" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="6085445418775341934">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="6085445418775341935">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpec.6648795410103967073" resolveInfo="JavaCompile" />
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="6085445418775341938">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="6085445418775341939">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.8096124782826059775" resolveInfo="Make" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6085445418775341940">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261392" resolveInfo="withFinalTarget" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="8703512757937219586">
                  <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="tpcq.8096124782826059849" resolveInfo="make" />
                  <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="8703512757937219584">
                    <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="8703512757937219585">
                      <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.8096124782826059775" resolveInfo="Make" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6085445418775341944">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261441" resolveInfo="toScript" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999486700">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="5520723819347757702">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="TaskRunner" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7260781342054461617" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="5520723819347757827">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="5520723819347757828" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5520723819347757829" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5520723819347757830">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5520723819347757831">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="5520723819347757832">
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757833">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757843" resolveInfo="taskName" />
              </node>
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5520723819347757834">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="5520723819347757835" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="5520723819347757836">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="5520723819347757819" resolveInfo="taskName" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054461635">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7260781342054461636">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7260781342054461637">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7260781342054461638" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7260781342054461639">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7260781342054461632" resolveInfo="makeSession" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461640">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461619" resolveInfo="makeSession" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757843">
          <property name="name" nameId="tpck.1169194664001" value="taskName" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="5520723819347757844" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7260781342054461619">
          <property name="name" nameId="tpck.1169194664001" value="makeSession" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054461622">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="5520723819347757819">
        <property name="name" nameId="tpck.1169194664001" value="taskName" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="5520723819347757820" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="5520723819347757821" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7260781342054461632">
        <property name="name" nameId="tpck.1169194664001" value="makeSession" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7260781342054461633" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054461634">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="5520723819347757719">
        <property name="name" nameId="tpck.1169194664001" value="runTask" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757720">
          <property name="name" nameId="tpck.1169194664001" value="inputRes" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="5520723819347757721">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="5520723819347757722">
              <node role="bound" roleId="tpee.1171903916107" type="vvvw.ResourceClassifierType" typeId="vvvw.119022571402207412" id="5520723819347757723">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757724">
          <property name="name" nameId="tpck.1169194664001" value="defaultScript" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757725">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757726">
          <property name="name" nameId="tpck.1169194664001" value="controller" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757727">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
          </node>
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757728">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757729">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5520723819347757730" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5520723819347757731">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5520723819347757732">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="5520723819347757733">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4rvk.2298333944697085115" resolveInfo="processRawInput" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757734">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757720" resolveInfo="inputRes" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757735">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757724" resolveInfo="defaultScript" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757736">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757726" resolveInfo="controller" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="5520723819347757739">
        <property name="name" nameId="tpck.1169194664001" value="processClusteredInput" />
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757740">
          <property name="name" nameId="tpck.1169194664001" value="clustRes" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="5520723819347757741">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="5520723819347757742">
              <node role="bound" roleId="tpee.1171903916107" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="5520723819347757743">
                <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757744">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757745">
          <property name="name" nameId="tpck.1169194664001" value="scripts" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="5520723819347757746">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757747">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5520723819347757748">
          <property name="name" nameId="tpck.1169194664001" value="controller" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757749">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="5520723819347757750" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757751">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757752">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5520723819347757753">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5520723819347757808">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5520723819347757809">
              <property name="name" nameId="tpck.1169194664001" value="ctl" />
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5520723819347757810">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="5520723819347757811">
                  <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7874190907999476498" resolveInfo="BuildMakeService" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5520723819347757812">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476696" resolveInfo="completeController" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7260781342054461642">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461632" resolveInfo="makeSession" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757813">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757748" resolveInfo="controller" />
                  </node>
                </node>
              </node>
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757814">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="5520723819347757802" />
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="5256025380477436694">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="5256025380477436695">
              <property name="name" nameId="tpck.1169194664001" value="task" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5256025380477436696">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4rvk.7184932954667864779" resolveInfo="CoreMakeTask" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="5256025380477436698">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="5256025380477436700">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4rvk.7184932954667864781" resolveInfo="CoreMakeTask" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5256025380477436701">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757819" resolveInfo="taskName" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5256025380477436703">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757745" resolveInfo="scripts" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5256025380477436705">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757819" resolveInfo="taskName" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5256025380477436707">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757740" resolveInfo="clustRes" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5256025380477436709">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5520723819347757809" resolveInfo="ctl" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5256025380477436712">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="5256025380477436713">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461632" resolveInfo="makeSession" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5256025380477436714">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.8695426379435232480" resolveInfo="getMessageHandler" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5256025380477436716">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5256025380477436718">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5256025380477436717">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5256025380477436695" resolveInfo="task" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5256025380477436722">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4rvk.7184932954667865582" resolveInfo="run" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="5256025380477436723">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="5256025380477436725">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ff4b.~EmptyProgressMonitor%d&lt;init&gt;()" resolveInfo="EmptyProgressMonitor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="5520723819347757803">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="5256025380477447185">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="5256025380477447187">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5256025380477447189">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5256025380477447188">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5256025380477436695" resolveInfo="task" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5256025380477447193">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4rvk.7184932954667943903" resolveInfo="getResult" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="5520723819347757758">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3648686480793110704">
        <property name="name" nameId="tpck.1169194664001" value="toScript" />
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3648686480793110705">
          <property name="name" nameId="tpck.1169194664001" value="scriptBuilder" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3648686480793110706">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1479818508463261244" resolveInfo="ScriptBuilder" />
          </node>
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3648686480793110707">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="3648686480793110708" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3648686480793110709">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3648686480793110715">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3648686480793110717">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="3648686480793110716">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461632" resolveInfo="makeSession" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3648686480793110721">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.7260781342054369284" resolveInfo="toScript" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3648686480793110722">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3648686480793110705" resolveInfo="scriptBuilder" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="3648686480793110710">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757713">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4rvk.2298333944697025522" resolveInfo="AbstractMakeService.AbstractInputProcessor" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7874190907999477589">
      <property name="name" nameId="tpck.1169194664001" value="MessageFeedbackStrategy" />
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999477590">
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="reportFeedback" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999477591" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999477592" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477593">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999477594">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999477595">
              <property name="name" nameId="tpck.1169194664001" value="messageKind" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477596">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7874190907999477597">
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999477598">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477599">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="IFeedback.Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527775" resolveInfo="ERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477600">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477601">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477602">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477603">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dERROR" resolveInfo="ERROR" />
                    </node>
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477604">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477595" resolveInfo="messageKind" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999477605" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999477606">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477607">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="IFeedback.Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527779" resolveInfo="WARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477608">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477609">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477610">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477611">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dWARNING" resolveInfo="WARNING" />
                    </node>
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477612">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477595" resolveInfo="messageKind" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999477613" />
              </node>
            </node>
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999477614">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477615">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="IFeedback.Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527773" resolveInfo="INFO" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477616">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477617">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477618">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477619">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dINFORMATION" resolveInfo="INFORMATION" />
                    </node>
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477620">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477595" resolveInfo="messageKind" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999477621" />
              </node>
            </node>
            <node role="expression" roleId="tpee.1163670766145" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477622">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999477623">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477659" resolveInfo="fdk" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477624">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7797884084018527781" resolveInfo="getSeverity" />
              </node>
            </node>
            <node role="defaultBlock" roleId="tpee.1163670592366" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477625">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477626">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477627">
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477628">
                    <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                    <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dERROR" resolveInfo="ERROR" />
                  </node>
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477629">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477595" resolveInfo="messageKind" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7874190907999477630" />
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999477631">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999477632">
              <property name="name" nameId="tpck.1169194664001" value="message" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477633">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~Message" resolveInfo="Message" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999477634">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999477635">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477636">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477595" resolveInfo="messageKind" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477637">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999477638">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477659" resolveInfo="fdk" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477639">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7797884084018455910" resolveInfo="getMessage" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477640">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477641">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477642">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477632" resolveInfo="message" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477643">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~Message%dsetException(java%dlang%dThrowable)%cvoid" resolveInfo="setException" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477644">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999477645">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477659" resolveInfo="fdk" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477646">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4374815845151980314" resolveInfo="getException" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477647">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477648">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477649">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477632" resolveInfo="message" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477650">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~Message%dsetHintObject(java%dlang%dObject)%cvoid" resolveInfo="setHintObject" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477651">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999477652">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477659" resolveInfo="fdk" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477653">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4374815845151980309" resolveInfo="getSource" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477654">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477655">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999477656">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477674" resolveInfo="handler" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999477657">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999477658">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477632" resolveInfo="message" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999477659">
          <property name="name" nameId="tpck.1169194664001" value="fdk" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477660">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.7797884084018455875" resolveInfo="IFeedback" />
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999477661" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7874190907999477662">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999477663" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999477664" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477665">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477666">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477667">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999477668">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999477669" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7874190907999477670">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999477674" resolveInfo="handler" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999477671">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999477672" resolveInfo="handler" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999477672">
          <property name="name" nameId="tpck.1169194664001" value="handler" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477673">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999477674">
        <property name="name" nameId="tpck.1169194664001" value="handler" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999477675" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477676">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="2821774308986816129">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="DelegatingScriptController" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986817225" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="2821774308986816131">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986816132" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986816133" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986816134">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986817115">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986817116">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986817117">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986817118" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986817119">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986817120">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817108" resolveInfo="delegate" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878420">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878421">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878422">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986878423" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986878424">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986878417" resolveInfo="mfs" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878425">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878408" resolveInfo="mfs" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817108">
          <property name="name" nameId="tpck.1169194664001" value="delegate" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817109">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878408">
          <property name="name" nameId="tpck.1169194664001" value="mfs" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878413">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999477589" resolveInfo="BuildMakeService.MessageFeedbackStrategy" />
          </node>
        </node>
      </node>
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817105">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.5646063728432391389" resolveInfo="IScriptController.Stub" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986817112">
        <property name="name" nameId="tpck.1169194664001" value="delegate" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986817113" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817114">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986817136">
        <property name="name" nameId="tpck.1169194664001" value="runConfigWithMonitor" />
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986817137" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986817138" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817139">
          <property name="name" nameId="tpck.1169194664001" value="code" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="2821774308986817140">
            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986817141" />
            <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817142">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817143">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986817154">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986817158">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986817161" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986817157">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817156">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986817162">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986817164">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986817163">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986817168">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4648565975300663473" resolveInfo="runConfigWithMonitor" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="2821774308986817169">
                      <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817171">
                        <property name="name" nameId="tpck.1169194664001" value="cm" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817175">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
                        </node>
                      </node>
                      <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817170">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986817199">
                          <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="2821774308986817201">
                            <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986817202">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817139" resolveInfo="code" />
                            </node>
                            <node role="parameter" roleId="tp2c.1235747002942" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986817358">
                              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986846393">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986817205" resolveInfo="BuildMakeService.DelegatingScriptController.DelegatingConfigMonitor" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986846394">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817171" resolveInfo="cm" />
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
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="2821774308986846395">
              <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986846396">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986846397">
                  <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="2821774308986846400">
                    <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986846401">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817139" resolveInfo="code" />
                    </node>
                    <node role="parameter" roleId="tp2c.1235747002942" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986846404">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986846405">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986817205" resolveInfo="BuildMakeService.DelegatingScriptController.DelegatingConfigMonitor" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986846407" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986817144">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986817121">
        <property name="name" nameId="tpck.1169194664001" value="runJobWithMonitor" />
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817122">
          <property name="name" nameId="tpck.1169194664001" value="code" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="2821774308986817123">
            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986817124" />
            <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817125">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
            </node>
          </node>
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986817126" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986817127" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817128">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.TryStatement" typeId="tpee.1153952380246" id="2821774308986878459">
            <node role="catchClause" roleId="tpee.1164903700860" type="tpee.CatchClause" typeId="tpee.1164903280175" id="2821774308986878460">
              <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2821774308986878461">
                <property name="name" nameId="tpck.1169194664001" value="e" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878462">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Throwable" resolveInfo="Throwable" />
                </node>
              </node>
              <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878463">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878464">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878465">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="2821774308986878466">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4427136928946606713" resolveInfo="LOG" />
                      <link role="classifier" roleId="tpee.1144433057691" targetNodeId="7874190907999476498" resolveInfo="BuildMakeService" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878467">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="to5d.~Logger%derror(java%dlang%dString,java%dlang%dThrowable)%cvoid" resolveInfo="error" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2821774308986878468">
                        <property name="value" nameId="tpee.1070475926801" value="error running job" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878469">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878461" resolveInfo="e" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="body" roleId="tpee.1153952416686" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878470">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878299">
                <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878303">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878306" />
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878302">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                  </node>
                </node>
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878301">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878307">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878309">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878308">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878313">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4648565975300663456" resolveInfo="runJobWithMonitor" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="2821774308986878314">
                          <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878315">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895361">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="2821774308986895362">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986895290" resolveInfo="runJobWithMonitor" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895366">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817122" resolveInfo="code" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986895368">
                                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986895369">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986846412" resolveInfo="BuildMakeService.DelegatingScriptController.DelegatingJobMonitor" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895370">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878316" resolveInfo="jm" />
                                    </node>
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986895371">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878417" resolveInfo="mfs" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878316">
                            <property name="name" nameId="tpck.1169194664001" value="jm" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878321">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="2821774308986878336">
                  <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878337">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895373">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="2821774308986895374">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986895290" resolveInfo="runJobWithMonitor" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895375">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817122" resolveInfo="code" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986895377">
                          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986895378">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986846412" resolveInfo="BuildMakeService.DelegatingScriptController.DelegatingJobMonitor" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986895379" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986895380">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878417" resolveInfo="mfs" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="finallyBody" roleId="tpee.1153952429843" type="tpee.StatementList" typeId="tpee.1068580123136" id="6476740459312934814" />
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986817129">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986878695">
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="setup" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878696">
          <property name="name" nameId="tpck.1169194664001" value="ppool" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878697">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6872280991287216857" resolveInfo="IPropertiesPool" />
          </node>
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986878698" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878699" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878700">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986892720">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="2821774308986892721">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4691049906353696062" resolveInfo="setup" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986892722">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878696" resolveInfo="ppool" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878715">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878717">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878723">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878725">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878724">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878729">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4691049906353696048" resolveInfo="setup" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878730">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878696" resolveInfo="ppool" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878719">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878722" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878718">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986878707">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986878682">
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="setup" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986878683" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878684" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878685">
          <property name="name" nameId="tpck.1169194664001" value="pp" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878686">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6872280991287216857" resolveInfo="IPropertiesPool" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878687">
          <property name="name" nameId="tpck.1169194664001" value="toExecute" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="2821774308986878688">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878689">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ud0o.6168415856807657134" resolveInfo="ITarget" />
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878690">
          <property name="name" nameId="tpck.1169194664001" value="input" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="2821774308986878691">
            <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="2821774308986878692">
              <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878693">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
              </node>
            </node>
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878694">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986892711">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="2821774308986892712">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8075512910924608506" resolveInfo="setup" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986892713">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878685" resolveInfo="pp" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986892715">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878687" resolveInfo="toExecute" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986892718">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878690" resolveInfo="input" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878731">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878735">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878738" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878734">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878733">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878739">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878741">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878740">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878745">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8075512910924608489" resolveInfo="setup" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878746">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878685" resolveInfo="pp" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878748">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878687" resolveInfo="toExecute" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878751">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878690" resolveInfo="input" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986878701">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7480932071789567882">
        <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="useMonitor" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7480932071789567883" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7480932071789567884" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7480932071789567885">
          <property name="name" nameId="tpck.1169194664001" value="monitor" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7480932071789567886">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7480932071789567887">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7480932071789567895">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="7480932071789567896">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7480932071789567864" resolveInfo="useMonitor" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7480932071789567899">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7480932071789567885" resolveInfo="monitor" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7480932071789567901">
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7480932071789567902">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7480932071789567910">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7480932071789567912">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7480932071789567911">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7480932071789567916">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7480932071789559121" resolveInfo="useMonitor" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7480932071789567917">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7480932071789567885" resolveInfo="monitor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7480932071789567906">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7480932071789567909" />
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7480932071789567905">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817112" resolveInfo="delegate" />
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7480932071789567888">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986895385">
        <property name="name" nameId="tpck.1169194664001" value="getProgressMonitor" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1007939372524188328">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="2821774308986895390" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986895388">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895396">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986895397">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986895351" resolveInfo="currentMonitor" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986895322">
        <property name="name" nameId="tpck.1169194664001" value="setProgressMonitor" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986895323" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986895324" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986895325">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895354">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986895355">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986895356">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986895357" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986895358">
                  <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986895351" resolveInfo="currentMonitor" />
                </node>
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895359">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986895334" resolveInfo="monitor" />
              </node>
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986895334">
          <property name="name" nameId="tpck.1169194664001" value="monitor" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1007939372524188324">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986895290">
        <property name="name" nameId="tpck.1169194664001" value="runJobWithMonitor" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986895309">
          <property name="name" nameId="tpck.1169194664001" value="code" />
          <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="2821774308986895310">
            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986895311" />
            <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986895312">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
            </node>
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986895306">
          <property name="name" nameId="tpck.1169194664001" value="jm" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986895314">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
          </node>
        </node>
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986895291" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986895292" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986895293">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895342">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="2821774308986895343">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986895322" resolveInfo="setProgressMonitor" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986895344">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986895346">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="yif3.1007939372524169705" resolveInfo="JobProgressMonitorAdapter" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895347">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986895306" resolveInfo="jm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.TryStatement" typeId="tpee.1153952380246" id="2821774308986895337">
            <node role="body" roleId="tpee.1153952416686" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986895338">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895316">
                <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="2821774308986895318">
                  <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895319">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986895309" resolveInfo="code" />
                  </node>
                  <node role="parameter" roleId="tp2c.1235747002942" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986895320">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986895306" resolveInfo="jm" />
                  </node>
                </node>
              </node>
            </node>
            <node role="finallyBody" roleId="tpee.1153952429843" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986895340">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895348">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="2821774308986895349">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986895322" resolveInfo="setProgressMonitor" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986895350" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="2821774308986817203">
        <property name="nonStatic" nameId="tpee.521412098689998745" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="DelegatingConfigMonitor" />
        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986817258">
          <property name="name" nameId="tpck.1169194664001" value="relayQuery" />
          <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817259">
            <property name="name" nameId="tpck.1169194664001" value="query" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817260">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8486446835277348318" resolveInfo="IQuery" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="2821774308986817261">
                <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="2821774308986817257" resolveInfo="T" />
              </node>
            </node>
          </node>
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986817262" />
          <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="2821774308986817257">
            <property name="name" nameId="tpck.1169194664001" value="T" />
            <node role="bound" roleId="tpee.1214996921760" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817263">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.2551169102353043399" resolveInfo="IOption" />
            </node>
          </node>
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="2821774308986817264">
            <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="2821774308986817257" resolveInfo="T" />
          </node>
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817265">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="6828477339626436848">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="6828477339626436849">
                <property name="name" nameId="tpck.1169194664001" value="opt" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="6828477339626436850">
                  <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="2821774308986817257" resolveInfo="T" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6828477339626436851" />
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6828477339626436852">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6828477339626436853">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6828477339626436854">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6828477339626436855">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6828477339626436856">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6828477339626436889">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817247" resolveInfo="delegateConfMon" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6828477339626436858">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8339029394035014642" resolveInfo="relayQuery" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6828477339626436859">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817259" resolveInfo="query" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6828477339626436860">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6828477339626436849" resolveInfo="opt" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6828477339626436861">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6828477339626436862" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="6828477339626436888">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817247" resolveInfo="delegateConfMon" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6828477339626436864">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="2821774308986817291">
                <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986817295">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6828477339626436849" resolveInfo="opt" />
                </node>
                <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986817301">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986817296">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817259" resolveInfo="query" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986817309">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1048225073237482444" resolveInfo="defaultOption" />
                  </node>
                </node>
                <node role="condition" roleId="tpee.1163668914799" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="6828477339626436867">
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6828477339626436868" />
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6828477339626436869">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6828477339626436849" resolveInfo="opt" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986817266">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986817226" />
        <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="2821774308986817205">
          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986817330">
            <property name="name" nameId="tpck.1169194664001" value="cm" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817335">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
            </node>
          </node>
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986817206" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986817207" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986817208">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986817340">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986817347">
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986817350">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986817330" resolveInfo="cm" />
                </node>
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986817342">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986817341" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986817346">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986817247" resolveInfo="delegateConfMon" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817211">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.5646063728432307524" resolveInfo="IConfigMonitor.Stub" />
        </node>
        <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986817247">
          <property name="name" nameId="tpck.1169194664001" value="delegateConfMon" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986817248" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986817249">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
          </node>
        </node>
      </node>
      <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="2821774308986846410">
        <property name="nonStatic" nameId="tpee.521412098689998745" value="false" />
        <property name="name" nameId="tpck.1169194664001" value="DelegatingJobMonitor" />
        <property name="abstractClass" nameId="tpee.1075300953594" value="false" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986846411" />
        <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="2821774308986846412">
          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878164">
            <property name="name" nameId="tpck.1169194664001" value="delegate" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878169">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
            </node>
          </node>
          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878388">
            <property name="name" nameId="tpck.1169194664001" value="mfs" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878393">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999477589" resolveInfo="BuildMakeService.MessageFeedbackStrategy" />
            </node>
          </node>
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986846413" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986846414" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986846415">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878177">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878178">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878179">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986878180" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986878181">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986878174" resolveInfo="delegateJobMon" />
                  </node>
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878182">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878164" resolveInfo="delegate" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878400">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878401">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878402">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="2821774308986878403" />
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="2821774308986878404">
                    <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="2821774308986878397" resolveInfo="mfs" />
                  </node>
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878405">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878388" resolveInfo="mfs" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986846419">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.5646063728432307501" resolveInfo="IJobMonitor.Stub" />
        </node>
        <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986878174">
          <property name="name" nameId="tpck.1169194664001" value="delegateJobMon" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986878175" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878176">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
          </node>
        </node>
        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986878184">
          <property name="name" nameId="tpck.1169194664001" value="currentProgress" />
          <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878185">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.7797884084018559880" resolveInfo="IProgress" />
          </node>
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878186" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878187">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878226">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878234">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878237" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878229">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878174" resolveInfo="delegateJobMon" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878228">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="2821774308986878238">
                  <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878241">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878240">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878174" resolveInfo="delegateJobMon" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878245">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.7797884084018629453" resolveInfo="currentProgress" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="2821774308986878248">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="2821774308986878250">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.5646063728432307508" resolveInfo="currentProgress" />
              </node>
            </node>
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986878188">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
          </node>
        </node>
        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986878256">
          <property name="name" nameId="tpck.1169194664001" value="reportFeedback" />
          <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878257">
            <property name="name" nameId="tpck.1169194664001" value="fdbk" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878258">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.7797884084018455875" resolveInfo="IFeedback" />
            </node>
          </node>
          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986878259" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878260" />
          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878261">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878272">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878273">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878274" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878275">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878174" resolveInfo="delegateJobMon" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878276">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878282">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878278">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878279">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878174" resolveInfo="delegateJobMon" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878280">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.3668957831723303232" resolveInfo="reportFeedback" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878286">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878257" resolveInfo="fdbk" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878288">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878289">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="2821774308986878407">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878397" resolveInfo="mfs" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878295">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999477590" resolveInfo="reportFeedback" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878296">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878257" resolveInfo="fdbk" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="2821774308986878262">
            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
          </node>
        </node>
        <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986878397">
          <property name="name" nameId="tpck.1169194664001" value="mfs" />
          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986878398" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878399">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999477589" resolveInfo="BuildMakeService.MessageFeedbackStrategy" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986878417">
        <property name="name" nameId="tpck.1169194664001" value="mfs" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986878418" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878419">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999477589" resolveInfo="BuildMakeService.MessageFeedbackStrategy" />
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="2821774308986895351">
        <property name="name" nameId="tpck.1169194664001" value="currentMonitor" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="2821774308986895352" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1007939372524188323">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476499" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7874190907999476500">
      <property name="isDeprecated" nameId="tpee.1224848525476" value="true" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476501" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476503">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476504">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476505">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476506">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476507" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7874190907999476508">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999476520" resolveInfo="context" />
              </node>
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476509">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476516" resolveInfo="context" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476510">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476511">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476512">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476513" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7874190907999476514">
                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999476915" resolveInfo="messageHandler" />
              </node>
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476515">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476518" resolveInfo="messageHandler" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476516">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476517">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476518">
        <property name="name" nameId="tpck.1169194664001" value="messageHandler" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476519">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7260781342054461655">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7260781342054461656" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054461658" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999476520">
      <property name="name" nameId="tpck.1169194664001" value="context" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476521" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476522">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3243693673213837943">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.2082624981609760242" resolveInfo="IMakeService" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435237791">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237792">
        <property name="name" nameId="tpck.1169194664001" value="session" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237793">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237794">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="8695426379435237795">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="8695426379435237796">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237797">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435237798" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237799">
        <property name="name" nameId="tpck.1169194664001" value="script" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237800">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237801">
        <property name="name" nameId="tpck.1169194664001" value="controller" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237802">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237803">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237804">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435237805">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7260781342054461728">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7260781342054461729">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7260781342054461730">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461731">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461732">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237792" resolveInfo="session" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461733">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237794" resolveInfo="resources" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461734">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237799" resolveInfo="script" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461735">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237801" resolveInfo="controller" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435237808">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237809">
        <property name="name" nameId="tpck.1169194664001" value="session" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237810">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237811">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="8695426379435237812">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="8695426379435237813">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237814">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435237815" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237816">
        <property name="name" nameId="tpck.1169194664001" value="script" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237817">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237818">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237819">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435237820">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7260781342054461720">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7260781342054461721">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7260781342054461722">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461723">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461724">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237809" resolveInfo="session" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461725">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237811" resolveInfo="resources" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461740">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237816" resolveInfo="script" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7260781342054461738" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435237823">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237824">
        <property name="name" nameId="tpck.1169194664001" value="session" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237825">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237826">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="8695426379435237827">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="8695426379435237828">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237829">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237830">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237831">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435237832" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435237833">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7260781342054461710">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7260781342054461711">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7260781342054461712">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461713">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461719">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237824" resolveInfo="session" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461715">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8695426379435237826" resolveInfo="resources" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="7260781342054461741">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999486670" resolveInfo="defaultMakeScript" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7260781342054461742" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435237836">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="isSessionActive" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="8695426379435237837" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435237838" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435237839">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8695426379435237840">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="8695426379435237841" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435237842">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="openNewSession" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="8695426379435237843" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435237844" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8695426379435237845">
        <property name="name" nameId="tpck.1169194664001" value="session" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8695426379435237846">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435237847">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="8695426379435237848">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="8695426379435237849" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="3180200298862818641">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="closeSession" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3180200298862818642">
        <property name="name" nameId="tpck.1169194664001" value="session" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3180200298862818643">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="3180200298862818650" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3180200298862818645" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3180200298862818646" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8464977774480115915">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="addListener" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8464977774480115916">
        <property name="name" nameId="tpck.1169194664001" value="listener" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8464977774480115917">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8464977774480012290" resolveInfo="IMakeNotificationListener" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8464977774480115918" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8464977774480115919" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8464977774480115920">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="8464977774480118342">
          <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8464977774480118344">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8464977774480118346">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~UnsupportedOperationException%d&lt;init&gt;()" resolveInfo="UnsupportedOperationException" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8464977774480115909">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="removeListener" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8464977774480115910" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8464977774480115911" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8464977774480115912">
        <property name="name" nameId="tpck.1169194664001" value="listener" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8464977774480115913">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8464977774480012290" resolveInfo="IMakeNotificationListener" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8464977774480115914">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="8464977774480118347">
          <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="8464977774480118348">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="8464977774480118349">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~UnsupportedOperationException%d&lt;init&gt;()" resolveInfo="UnsupportedOperationException" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476524">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476525">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999476526">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="7874190907999476527">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476528">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814847135">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814847137">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476530" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476531">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="9121742173815460335">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349413422">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461693">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7260781342054461663" resolveInfo="internalMakeSession" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349413423">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476525" resolveInfo="resources" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="6699733160349413424">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999486670" resolveInfo="defaultMakeScript" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349413425" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476537">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476538">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999476539">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="7874190907999476540">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476541">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476543" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476544">
        <property name="name" nameId="tpck.1169194664001" value="script" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476545">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476546">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="9121742173815460346">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6699733160349413418">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461691">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7260781342054461663" resolveInfo="internalMakeSession" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349413419">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476538" resolveInfo="resources" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6699733160349413420">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476544" resolveInfo="script" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349413421" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814847138">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814847139">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476552">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="make" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476553">
        <property name="name" nameId="tpck.1169194664001" value="resources" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999476554">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="7874190907999476555">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476556">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476558" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476559">
        <property name="name" nameId="tpck.1169194664001" value="script" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476560">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476561">
        <property name="name" nameId="tpck.1169194664001" value="controller" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476562">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476563">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="9121742173815460356">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="9121742173815460358">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="9121742173815460360">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="9121742173815460361">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7260781342054461689">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7260781342054461663" resolveInfo="internalMakeSession" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9121742173815460362">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476553" resolveInfo="resources" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9121742173815460363">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476559" resolveInfo="script" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9121742173815460364">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476561" resolveInfo="controller" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814852196">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="9121742173814852197">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7260781342054461663">
      <property name="name" nameId="tpck.1169194664001" value="internalMakeSession" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054461669">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7260781342054461668" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054461666">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7260781342054461695">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7260781342054461696">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7260781342054461704">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7260781342054461706">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7260781342054461708">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~IllegalStateException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IllegalStateException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7260781342054461709">
                    <property name="value" nameId="tpee.1070475926801" value="attempt to use deprecated API from modern context" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7260781342054461700">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7260781342054461703" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7260781342054461699">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476520" resolveInfo="context" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7260781342054461679">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7260781342054461680">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7260781342054461682">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.2181314052156502107" resolveInfo="MakeSession" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7260781342054461683">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476520" resolveInfo="context" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7260781342054461685">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476915" resolveInfo="messageHandler" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7260781342054461687">
                <property name="value" nameId="tpee.1068580123138" value="true" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476569">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="doMake" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7260781342054461649">
        <property name="name" nameId="tpck.1169194664001" value="makeSession" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054461652">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476570">
        <property name="name" nameId="tpck.1169194664001" value="inputRes" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999476571">
          <node role="elementType" roleId="tp2q.1151689745422" type="tpee.UpperBoundType" typeId="tpee.1171903916106" id="7874190907999476572">
            <node role="bound" roleId="tpee.1171903916107" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476573">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476575" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476576">
        <property name="name" nameId="tpck.1169194664001" value="defaultScript" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476577">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476578">
        <property name="name" nameId="tpck.1169194664001" value="controller" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476579">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476580">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476581">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476582">
            <property name="name" nameId="tpck.1169194664001" value="scrName" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476583" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476584">
              <property name="value" nameId="tpee.1070475926801" value="Build" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476585" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999476586">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476587">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476588">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476589">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476590" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476591">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476592">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476582" resolveInfo="scrName" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476593">
                    <property name="value" nameId="tpee.1070475926801" value=" aborted: nothing to do" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1642807645106503594">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1642807645106503595">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1642807645106503604">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1642807645106503603">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461649" resolveInfo="makeSession" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1642807645106503608">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.8695426379435232480" resolveInfo="getMessageHandler" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1642807645106503597">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1642807645106503598">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="1642807645106503599">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bq0a.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="1642807645106503600">
                        <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="bq0a.~MessageKind" resolveInfo="MessageKind" />
                        <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="bq0a.~MessageKind%dERROR" resolveInfo="ERROR" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1642807645106503601">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476589" resolveInfo="msg" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999476599">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349413400">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349413402">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rk9m.9121742173815457653" resolveInfo="FutureValue" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6699733160349413403">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6699733160349413404">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4629164904928188012" resolveInfo="IResult.FAILURE" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6699733160349413405" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476603">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476604">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476570" resolveInfo="inputRes" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp2q.IsEmptyOperation" typeId="tp2q.1165530316231" id="7874190907999476605" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="6699733160349413327" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5520723819347757858">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5520723819347757866">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="5520723819347757859">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="5520723819347757861">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5520723819347757827" resolveInfo="BuildMakeService.TaskRunner" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="5520723819347757863">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476582" resolveInfo="scrName" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7260781342054461654">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461649" resolveInfo="makeSession" />
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5520723819347757870">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="5520723819347757719" resolveInfo="runTask" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757872">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476570" resolveInfo="inputRes" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757874">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476576" resolveInfo="defaultScript" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5520723819347757876">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476578" resolveInfo="controller" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349413395">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="53gy.~Future" resolveInfo="Future" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6699733160349413396">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476696">
      <property name="name" nameId="tpck.1169194664001" value="completeController" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7260781342054461594">
        <property name="name" nameId="tpck.1169194664001" value="msess" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7260781342054461597">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="hfuk.8695426379435232461" resolveInfo="MakeSession" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476697" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476698">
        <property name="name" nameId="tpck.1169194664001" value="ctl" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476699">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476700">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878431">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986878432">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="2821774308986878487">
              <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="2821774308986878488">
                <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                <link role="classifier" roleId="tpee.1170346070688" targetNodeId="2821774308986816129" resolveInfo="BuildMakeService.DelegatingScriptController" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986816131" resolveInfo="BuildMakeService.DelegatingScriptController" />
                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878489" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878435">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476698" resolveInfo="ctl" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="2821774308986878437">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="2821774308986878439">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999477662" resolveInfo="BuildMakeService.MessageFeedbackStrategy" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878447">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878446">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461594" resolveInfo="msess" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878451">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.8695426379435232480" resolveInfo="getMessageHandler" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="2821774308986878592">
                  <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                  <property name="name" nameId="tpck.1169194664001" value="setup" />
                  <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="2821774308986878593">
                    <property name="name" nameId="tpck.1169194664001" value="pool" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878594">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6872280991287216857" resolveInfo="IPropertiesPool" />
                    </node>
                  </node>
                  <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="2821774308986878595" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="2821774308986878596" />
                  <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878597">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878752">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="2821774308986878753">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986878695" resolveInfo="setup" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878754">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878593" resolveInfo="pool" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="2821774308986878598">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="2821774308986878599">
                        <property name="name" nameId="tpck.1169194664001" value="vars" />
                        <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="2821774308986878600">
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958639516">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                          </node>
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878602">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
                          </node>
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.BooleanType" typeId="tpee.1070534644030" id="2821774308986878603" />
                          <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="2821774308986878604">
                            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1007939372524188326">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
                            </node>
                          </node>
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="2821774308986878606">
                          <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="2821774308986878607">
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3304387091958639520">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="vsqj.~Project" resolveInfo="Project" />
                            </node>
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="2821774308986878609">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cu2c.~IOperationContext" resolveInfo="IOperationContext" />
                            </node>
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.BooleanType" typeId="tpee.1070534644030" id="2821774308986878610" />
                            <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="2821774308986878611">
                              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="1007939372524188327">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ff4b.~ProgressMonitor" resolveInfo="ProgressMonitor" />
                              </node>
                            </node>
                          </node>
                          <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878613">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878614">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878593" resolveInfo="pool" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878615">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="properties" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="vvvw.TargetReferenceExpression" typeId="vvvw.8703512757937156087" id="2821774308986878616">
                                <link role="target" roleId="vvvw.8703512757937161148" targetNodeId="tpcq.6648795410103939540" resolveInfo="checkParameters" />
                                <node role="facetRef" roleId="vvvw.8703512757937161134" type="vvvw.FacetReferenceExpression" typeId="vvvw.7178445679340358576" id="2821774308986878617">
                                  <node role="reference" roleId="vvvw.7178445679340358578" type="vvvw.NamedFacetReference" typeId="vvvw.1919086248986845077" id="2821774308986878618">
                                    <link role="facet" roleId="vvvw.6447445394688422643" targetNodeId="tpcq.6648795410103939538" resolveInfo="Generate" />
                                  </node>
                                </node>
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="2821774308986878619">
                                <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="2821774308986878620">
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878621">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878622">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3304387091958639517">
                            <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="2821774308986878629">
                              <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="2821774308986878630">
                                <property name="value" nameId="tpee.1068580320021" value="0" />
                              </node>
                              <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878631">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878599" resolveInfo="vars" />
                              </node>
                            </node>
                            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878624">
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878625">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cu2c.~IOperationContext%dgetProject()%cjetbrains%dmps%dproject%dProject" resolveInfo="getProject" />
                              </node>
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878626">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878627">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461594" resolveInfo="msess" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878628">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.8695426379435232473" resolveInfo="getContext" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878632">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878633">
                            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="2821774308986878634">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="2821774308986878635">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7260781342054461594" resolveInfo="msess" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="2821774308986878636">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="hfuk.8695426379435232473" resolveInfo="getContext" />
                              </node>
                            </node>
                            <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="2821774308986878637">
                              <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="2821774308986878638">
                                <property name="value" nameId="tpee.1068580320021" value="1" />
                              </node>
                              <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878639">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878599" resolveInfo="vars" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878640">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878641">
                            <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="2821774308986878642">
                              <property name="value" nameId="tpee.1068580123138" value="true" />
                            </node>
                            <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="2821774308986878643">
                              <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="2821774308986878644">
                                <property name="value" nameId="tpee.1068580320021" value="2" />
                              </node>
                              <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878645">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878599" resolveInfo="vars" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878646">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="2821774308986878647">
                            <node role="rValue" roleId="tpee.1068498886297" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="2821774308986878648">
                              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="2821774308986878649">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986895405">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="2821774308986895406">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="2821774308986895385" resolveInfo="getProgressMonitor" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="2821774308986878652">
                              <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="2821774308986878653">
                                <property name="value" nameId="tpee.1068580320021" value="3" />
                              </node>
                              <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878654">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878599" resolveInfo="vars" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="2821774308986878655">
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="2821774308986878656" />
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="2821774308986878657">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="2821774308986878599" resolveInfo="vars" />
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476914">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999476915">
      <property name="name" nameId="tpck.1169194664001" value="messageHandler" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476916" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476917">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="bq0a.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435219080">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="disposeComponent" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435219081" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8695426379435219082" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435219083" />
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435219084">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="getComponentName" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="2862682737715391154" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435219085" />
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="8695426379435219087">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="68ai.~NonNls" resolveInfo="NonNls" />
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="8695426379435219088">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="68ai.~NotNull" resolveInfo="NotNull" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435219089">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="2821774308986878680">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="2821774308986878681">
            <property name="value" nameId="tpee.1070475926801" value="Build Make Service" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="8695426379435219090">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="initComponent" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <property name="isDeprecated" nameId="tpee.1224848525476" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="8695426379435219091" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="8695426379435219092" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="8695426379435219093" />
    </node>
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="5520723819347757710">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4rvk.2298333944697014852" resolveInfo="AbstractMakeService" />
    </node>
  </root>
</model>

