<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:e26c23c0-c117-4389-8d76-62e09a48aaa5(jetbrains.mps.build.ant.generation.workers)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="a247e09e-2435-45ba-b8d2-07e93feba96a(jetbrains.mps.baseLanguage.tuples)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <import index="c123" modelUID="f:java_stub#77c9a130-703f-4530-bf21-6580757768d0#jetbrains.mps.build.ant(jetbrains.mps.build.ant@java_stub)" version="-1" />
  <import index="xirj" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.make(jetbrains.mps.make@java_stub)" version="-1" />
  <import index="lkfb" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="k7g3" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.util(java.util@java_stub)" version="-1" />
  <import index="afxk" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="pqw3" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#junit.framework(MPS.Classpath/junit.framework@java_stub)" version="-1" />
  <import index="cfml" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.messages(MPS.Classpath/jetbrains.mps.messages@java_stub)" version="-1" />
  <import index="27v0" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.project(MPS.Classpath/com.intellij.openapi.project@java_stub)" version="-1" />
  <import index="yo81" modelUID="r:4ea5a78b-cb8a-4831-b227-f7860a22491d(jetbrains.mps.make.resources)" version="-1" />
  <import index="ud0o" modelUID="r:71895ceb-c89d-4545-aa38-89d1cd891f17(jetbrains.mps.make.facet)" version="-1" />
  <import index="i82i" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.progress(MPS.Classpath/com.intellij.openapi.progress@java_stub)" version="-1" />
  <import index="7vsr" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.ide(MPS.Classpath/com.intellij.ide@java_stub)" version="-1" />
  <import index="i9so" modelUID="r:9e5578e0-37f0-4c9b-a301-771bcb453678(jetbrains.mps.make.script)" version="-1" />
  <import index="yq3i" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel.resources(MPS.Classpath/jetbrains.mps.smodel.resources@java_stub)" version="-1" />
  <import index="h5ia" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.generator(jetbrains.mps.generator@java_stub)" version="-1" />
  <import index="fn29" modelUID="r:6ba2667b-185e-45cd-ac65-e4b9d66da28e(jetbrains.mps.smodel.resources)" version="-1" />
  <import index="pi7p" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.generator.generationTypes(jetbrains.mps.generator.generationTypes@java_stub)" version="-1" />
  <import index="r88o" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.make.dependencies(jetbrains.mps.make.dependencies@java_stub)" version="-1" />
  <import index="uxqw" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.make.dependencies.graph(MPS.Classpath/jetbrains.mps.make.dependencies.graph@java_stub)" version="-1" />
  <import index="qwup" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project.dependency(MPS.Classpath/jetbrains.mps.project.dependency@java_stub)" version="-1" />
  <import index="fxg7" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)" version="-1" />
  <import index="ista" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.ide.generator(MPS.Classpath/jetbrains.mps.ide.generator@java_stub)" version="-1" />
  <import index="22yz" modelUID="f:java_stub#77c9a130-703f-4530-bf21-6580757768d0#jetbrains.mps.build.ant.generation(jetbrains.mps.build.antsupport/jetbrains.mps.build.ant.generation@java_stub)" version="-1" />
  <import index="bw1v" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.components(MPS.Classpath/com.intellij.openapi.components@java_stub)" version="-1" />
  <import index="8a0f" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.util(com.intellij.openapi.util@java_stub)" version="-1" />
  <import index="j0x2" modelUID="r:a06b40a1-18fe-4d7f-a68d-34a763e68c1f(jetbrains.mps.workbench.make)" version="-1" />
  <import index="yif3" modelUID="r:13ec431d-483d-451c-a648-ffefde4fef51(jetbrains.mps.internal.make.runtime.backports)" version="-1" />
  <import index="lnp5" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.ide(MPS.Classpath/jetbrains.mps.ide@java_stub)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="4qa4" modelUID="r:e26c23c0-c117-4389-8d76-62e09a48aaa5(jetbrains.mps.build.ant.generation.workers)" version="-1" implicit="yes" />
  <import index="60vs" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.reloading(jetbrains.mps.reloading@java_stub)" version="-1" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="30pf" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" implicit="yes" />
  <import index="iqnk" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.compiler(jetbrains.mps.compiler@java_stub)" version="-1" implicit="yes" />
  <import index="22fg" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.net(java.net@java_stub)" version="-1" implicit="yes" />
  <import index="e2lb" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="c1qm" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.eclipse.jdt.core.compiler(MPS.Classpath/org.eclipse.jdt.core.compiler@java_stub)" version="-1" implicit="yes" />
  <import index="lkw3" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#com.intellij.openapi.application(MPS.Classpath/com.intellij.openapi.application@java_stub)" version="-1" implicit="yes" />
  <import index="rkg2" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.ide.progress(MPS.Classpath/jetbrains.mps.ide.progress@java_stub)" version="-1" implicit="yes" />
  <import index="7tx" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project.structure.project.testconfigurations(MPS.Classpath/jetbrains.mps.project.structure.project.testconfigurations@java_stub)" version="-1" implicit="yes" />
  <import index="7tyn" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.eclipse.jdt.internal.compiler.env(MPS.Classpath/org.eclipse.jdt.internal.compiler.env@java_stub)" version="-1" implicit="yes" />
  <import index="3aty" modelUID="f:java_stub#fba399db-f591-45dc-a279-e2a2a986e262#org.apache.tools.ant.util(jetbrains.mps.build.generictasks/org.apache.tools.ant.util@java_stub)" version="-1" implicit="yes" />
  <import index="kp22" modelUID="f:java_stub#fba399db-f591-45dc-a279-e2a2a986e262#org.apache.tools.ant(jetbrains.mps.build.generictasks/org.apache.tools.ant@java_stub)" version="-1" implicit="yes" />
  <import index="eh1m" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.library(MPS.Classpath/jetbrains.mps.library@java_stub)" version="-1" implicit="yes" />
  <import index="jwig" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project.structure.project(MPS.Classpath/jetbrains.mps.project.structure.project@java_stub)" version="-1" implicit="yes" />
  <import index="apgw" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.eclipse.jdt.internal.compiler(MPS.Classpath/org.eclipse.jdt.internal.compiler@java_stub)" version="-1" implicit="yes" />
  <import index="xqpa" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang.reflect(JDK/java.lang.reflect@java_stub)" version="-1" implicit="yes" />
  <import index="aoly" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel.descriptor(MPS.Classpath/jetbrains.mps.smodel.descriptor@java_stub)" version="-1" implicit="yes" />
  <import index="s1zt" modelUID="f:java_stub#77c9a130-703f-4530-bf21-6580757768d0#jetbrains.mps.build.ant.generation.unittest(jetbrains.mps.build.antsupport/jetbrains.mps.build.ant.generation.unittest@java_stub)" version="-1" implicit="yes" />
  <import index="r27b" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#org.jetbrains.annotations(MPS.Classpath/org.jetbrains.annotations@java_stub)" version="-1" implicit="yes" />
  <import index="gnpi" modelUID="f:java_stub#f3061a53-9226-4cc5-a443-f952ceaf5816#jetbrains.mps.baseLanguage.util.plugin.run(jetbrains.mps.baseLanguage/jetbrains.mps.baseLanguage.util.plugin.run@java_stub)" version="-1" implicit="yes" />
  <import index="nupp" modelUID="f:java_stub#f3061a53-9226-4cc5-a443-f952ceaf5816#jetbrains.mps.baseLanguage.structure(jetbrains.mps.baseLanguage/jetbrains.mps.baseLanguage.structure@java_stub)" version="-1" implicit="yes" />
  <import index="tp2c" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="cx9y" modelUID="r:309aeee7-bee8-445c-b31d-35928d1da75f(jetbrains.mps.baseLanguage.tuples.structure)" version="2" implicit="yes" />
  <import index="tp4k" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
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
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019498611">
      <property name="name" nameId="tpck.1169194664001" value="MyMessageHandler" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498612">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019498613">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationErrors" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498614">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498615">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498616" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499249">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499250">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499251">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019498617">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationWarnings" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498618">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498619">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498620" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499252">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499253">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499254">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
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
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessage" resolveInfo="IMessage" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499256">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7795897115019499257">
            <node role="expression" roleId="tpee.1163670766145" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499258">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499259">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499260">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetKind()%cjetbrains%dmps%dmessages%dMessageKind" resolveInfo="getKind" />
              </node>
            </node>
            <node role="defaultBlock" roleId="tpee.1163670592366" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499261" />
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7795897115019499262">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7795897115019499263">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499264">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499265">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499266">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499267">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499268">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%derror(java%dlang%dString)%cvoid" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499269">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499270">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499271">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
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
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499284">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499285">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499286">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499292">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499293">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="c123.~MpsWorker" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dextractStackTrace(java%dlang%dThrowable)%cjava%dlang%dStringBuffer" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499294">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499295">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499296">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499297">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" />
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dWARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499301">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499302">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499303">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499304">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499305">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dwarning(java%dlang%dString)%cvoid" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499306">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499307">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499308">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499313">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499314">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499315">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dINFORMATION" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499319">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499320">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499321">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7795897115019499322">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019498548" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499323">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dverbose(java%dlang%dString)%cvoid" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499324">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499325">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498626" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499326">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498631">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498635">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
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
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499339">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499340">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499341">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498617" resolveInfo="myGenerationWarnings" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499342">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" />
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
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498690">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498691">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498692">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498693">
            <property name="name" nameId="tpck.1169194664001" value="mpsWorker" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498694">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498695">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498696">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019498728" resolveInfo="GeneratorWorker" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498697">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="c123.~WhatToDo" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dfromDumpInFile(java%dio%dFile)%cjetbrains%dmps%dbuild%dant%dWhatToDo" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498698">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498699">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
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
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$LogLogger%d&lt;init&gt;()" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dworkFromMain()%cvoid" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~WhatToDo" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498714">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498715">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dWhatToDo)" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498722">
        <property name="name" nameId="tpck.1169194664001" value="component" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498723">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="kp22.~ProjectComponent" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498724">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498725">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dWhatToDo,org%dapache%dtools%dant%dProjectComponent)" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498733">
        <property name="name" nameId="tpck.1169194664001" value="logger" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498734">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$AntLogger" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498735">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019498736">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dWhatToDo,jetbrains%dmps%dbuild%dant%dMpsWorker$AntLogger)" />
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
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498743">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498744">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498745">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dhasAnythingToGenerate()%cboolean" />
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
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019498758">
      <property name="name" nameId="tpck.1169194664001" value="setGenerationProperties" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019498759" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019498760" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498761">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019498762">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019498763">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498764">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498765">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498766">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019498767">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~GenerateTask" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~GenerateTask%dPER_ROOT_GENERATION" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019498768" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498769">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498770">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498771">
                <property name="name" nameId="tpck.1169194664001" value="perRootGeneration" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019498772" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498773">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498774">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498775">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498776">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019498777">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~GenerateTask" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~GenerateTask%dPER_ROOT_GENERATION" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498778">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498779">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498780">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ista.~GenerationSettings" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dgetInstance()%cjetbrains%dmps%dide%dgenerator%dGenerationSettings" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498781">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dsetParallelGenerator(boolean)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498782">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="perRootGeneration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498783">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498784">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019498785">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ista.~GenerationSettings" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dgetInstance()%cjetbrains%dmps%dide%dgenerator%dGenerationSettings" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498786">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dsetStrictMode(boolean)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498787">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="perRootGeneration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498788">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019498789">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019498790">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498791">
                    <property name="value" nameId="tpee.1070475926801" value="Per-root generation set to " />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498792">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498771" resolveInfo="perRootGeneration" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019498797">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019498798">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019498799">
              <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498800">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498801">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyErrors" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498802">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498803">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498804">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498805">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetFailOnError()%cboolean" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498806">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498807">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498808">
                <property name="name" nameId="tpck.1169194664001" value="sb" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498809">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498810">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498811">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498812">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498813">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498814">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498808" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498815">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(int)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498816">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498817">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyErrors" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498818">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dsize()%cint" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498819">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498820">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498821">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498808" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498822">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498823">
                    <property name="value" nameId="tpee.1070475926801" value=" errors during generation:\n" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019498824">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019498825">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyErrors" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498826">
                <property name="name" nameId="tpck.1169194664001" value="error" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498827">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498828">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498829">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498830">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498831">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498808" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498832">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498833">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498826" resolveInfo="error" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498834">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498835">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498836">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498808" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498837">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019498838">
                        <property name="value" nameId="tpee.1070475926801" value="\n" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7795897115019498839">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498840">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498841">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="kp22.~BuildException%d&lt;init&gt;(java%dlang%dString)" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498842">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498843">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498808" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498844">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" />
                    </node>
                  </node>
                </node>
              </node>
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
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498849">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019498850">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498851">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498852">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019498853">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498854">
            <property name="name" nameId="tpck.1169194664001" value="s" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498855">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019498856">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019498857">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;(java%dlang%dString)" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetProjects()%cjava%dutil%dSet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498863">
            <property name="name" nameId="tpck.1169194664001" value="p" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498864">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498865">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498866">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498867">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498868">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498869">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
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
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModules()%cjava%dutil%dSet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498880">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498881">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498882">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498883">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498884">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498885">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498886">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
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
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModels()%cjava%dutil%dSet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019498897">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019498898">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019498899">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019498900">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498901">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498902">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498903">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
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
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dObject)%cjava%dlang%dStringBuffer" />
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
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019498912">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019498913">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498854" resolveInfo="s" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019498914">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999487107">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999487108">
            <property name="name" nameId="tpck.1169194664001" value="ctx" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999487109">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~ProjectOperationContext" resolveInfo="ProjectOperationContext" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999487110">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="afxk.~ProjectOperationContext" resolveInfo="ProjectOperationContext" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~ProjectOperationContext%dget(com%dintellij%dopenapi%dproject%dProject)%cjetbrains%dmps%dproject%dProjectOperationContext" resolveInfo="get" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999487111">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999487112">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498848" resolveInfo="project" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999487113">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" resolveInfo="getProject" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4077655991498783032">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4077655991498783033">
            <property name="name" nameId="tpck.1169194664001" value="resources" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="4077655991498783034">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4077655991498783035">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="4077655991498783036">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511000" resolveInfo="collectResources" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4077655991498783037">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999487108" resolveInfo="ctx" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4077655991498783038">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498850" resolveInfo="go" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4077655991498783615">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4077655991498783616">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="4077655991498783617">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="7vsr.~IdeEventQueue" resolveInfo="IdeEventQueue" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dgetInstance()%ccom%dintellij%dide%dIdeEventQueue" resolveInfo="getInstance" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4077655991498783618">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dflushQueue()%cvoid" resolveInfo="flushQueue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5912447815775570817">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5912447815775570818">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lnp5.~ThreadUtils%drunInUIThreadAndWait(java%dlang%dRunnable)%cvoid" resolveInfo="runInUIThreadAndWait" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lnp5.~ThreadUtils" resolveInfo="ThreadUtils" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5912447815775570819">
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5912447815775570820" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7054305886486074605">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7054305886486074607">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lnp5.~ThreadUtils%drunInUIThreadAndWait(java%dlang%dRunnable)%cvoid" resolveInfo="runInUIThreadAndWait" />
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lnp5.~ThreadUtils" resolveInfo="ThreadUtils" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7054305886486074608">
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7054305886486074609">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7054305886486074611">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7054305886486074612">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7054305886486074613">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7054305886486074614">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476500" resolveInfo="BuildMakeService" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7054305886486074615">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999487108" resolveInfo="ctx" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7054305886486074616">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019498680" resolveInfo="myMessageHandler" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7054305886486074617">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476524" resolveInfo="make" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7054305886486074618">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4077655991498783033" resolveInfo="resources" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5912447815775570830">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5912447815775570831">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5912447815775570832">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dgetInstance()%ccom%dintellij%dide%dIdeEventQueue" resolveInfo="getInstance" />
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="7vsr.~IdeEventQueue" resolveInfo="IdeEventQueue" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="5912447815775570833">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dflushQueue()%cvoid" resolveInfo="flushQueue" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5912447815775570834">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="5912447815775570835">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lnp5.~ThreadUtils" resolveInfo="ThreadUtils" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lnp5.~ThreadUtils%drunInUIThreadAndWait(java%dlang%dRunnable)%cvoid" resolveInfo="runInUIThreadAndWait" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="5912447815775570836">
              <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="5912447815775570837" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511000">
      <property name="name" nameId="tpck.1169194664001" value="collectResources" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511001">
        <property name="name" nameId="tpck.1169194664001" value="context" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511002">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="8486843261567504142">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8486843261567504143">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" resolveInfo="ObjectsToProcess" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999511005">
        <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511006">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="yo81.6168415856807657256" resolveInfo="IResource" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511007" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511008">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511009">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511010">
            <property name="name" nameId="tpck.1169194664001" value="models" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp2q.SequenceType" typeId="tp2q.1151689724996" id="7874190907999511011">
              <node role="elementType" roleId="tp2q.1151689745422" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511012">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
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
                              <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511024">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511025">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511028" resolveInfo="mod" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511026">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~IModule%dgetEditableUserModels()%cjava%dutil%dList" resolveInfo="getEditableUserModels" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511027">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511010" resolveInfo="models" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511028">
                      <property name="name" nameId="tpck.1169194664001" value="mod" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511029">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                      </node>
                    </node>
                    <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511030">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504166">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504161" resolveInfo="p" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511032">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetModules()%cjava%dutil%dList" resolveInfo="getModules" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="8486843261567504161">
                  <property name="name" nameId="tpck.1169194664001" value="p" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="8486843261567504162">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
                  </node>
                </node>
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504163">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8486843261567504164">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504165">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetProjects()%cjava%dutil%dSet" resolveInfo="getProjects" />
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
                          <node role="rightExpression" roleId="tp2q.1176906787974" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504187">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="8486843261567504188">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504177" resolveInfo="mod" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504189">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~IModule%dgetEditableUserModels()%cjava%dutil%dList" resolveInfo="getEditableUserModels" />
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
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                  </node>
                </node>
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="8486843261567504179">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="8486843261567504180">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="8486843261567504142" resolveInfo="go" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="8486843261567504181">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModules()%cjava%dutil%dSet" resolveInfo="getModules" />
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
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModels()%cjava%dutil%dSet" resolveInfo="getModels" />
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
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModels()%cjava%dutil%dSet" resolveInfo="getModels" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511033">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511034">
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
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7874190907999511044">
                            <node role="expression" roleId="tpee.1081516765348" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511045">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="h5ia.~GeneratorManager" resolveInfo="GeneratorManager" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GeneratorManager%disDoNotGenerate(jetbrains%dmps%dsmodel%dSModelDescriptor)%cboolean" resolveInfo="isDoNotGenerate" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511046">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511047" resolveInfo="smd" />
                              </node>
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
        </node>
      </node>
    </node>
  </root>
  <root id="7795897115019499553">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499554" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511742">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker" resolveInfo="MpsWorker" />
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.Interface" typeId="tpee.1107796713796" id="7874190907999511537">
      <property name="name" nameId="tpck.1169194664001" value="Cycle" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7874190907999511538" />
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511539">
        <property name="isAbstract" nameId="tpee.1178608670077" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="generate" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511540" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511541" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511542">
          <property name="name" nameId="tpck.1169194664001" value="gm" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511543">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GeneratorManager" resolveInfo="GeneratorManager" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511544">
          <property name="name" nameId="tpck.1169194664001" value="generationHandler" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511545">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pi7p.~IGenerationHandler" resolveInfo="IGenerationHandler" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511546">
          <property name="name" nameId="tpck.1169194664001" value="messageHandler" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511547">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511548" />
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511549">
        <property name="isAbstract" nameId="tpee.1178608670077" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="getClassPath" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511550" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511551">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511552">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" resolveInfo="File" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511553" />
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7874190907999511758">
      <property name="name" nameId="tpck.1169194664001" value="MyMessageHandler" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511759">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999511760">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationErrors" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511761">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511762">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511763" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511764">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511765">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511766">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999511767">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myGenerationWarnings" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511768">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511769">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
          </node>
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511770" />
        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511771">
          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511772">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511773">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7874190907999511774">
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
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessage" resolveInfo="IMessage" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511782">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7874190907999511783">
            <node role="expression" roleId="tpee.1163670766145" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511784">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511785">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511786">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetKind()%cjetbrains%dmps%dmessages%dMessageKind" resolveInfo="getKind" />
              </node>
            </node>
            <node role="defaultBlock" roleId="tpee.1163670592366" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511787" />
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999511788">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999511789">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511790">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511791">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511792">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511793">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511794">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%derror(java%dlang%dString)%cvoid" resolveInfo="error" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511795">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511796">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511797">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999511798">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7874190907999511799">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511800">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511801">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511802">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511803" />
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7874190907999511804">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511805">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511806">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511807">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511808">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511760" resolveInfo="myGenerationErrors" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511809">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511810">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511811">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511812">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511813">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511814">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511815">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511816">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511760" resolveInfo="myGenerationErrors" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511817">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511818">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511819">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dextractStackTrace(java%dlang%dThrowable)%cjava%dlang%dStringBuffer" resolveInfo="extractStackTrace" />
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="c123.~MpsWorker" resolveInfo="MpsWorker" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511820">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511821">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511822">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetException()%cjava%dlang%dThrowable" resolveInfo="getException" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511823">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                            </node>
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dWARNING" resolveInfo="WARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511827">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511828">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511829">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511830">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511831">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dwarning(java%dlang%dString)%cvoid" resolveInfo="warning" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511832">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511833">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511834">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511835">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511836">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511837">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511767" resolveInfo="myGenerationWarnings" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511838">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511839">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511840">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511841">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dINFORMATION" resolveInfo="INFORMATION" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511845">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511846">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511847">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999511848">
                      <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7795897115019499553" resolveInfo="TestGenerationWorker" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511849">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dverbose(java%dlang%dString)%cvoid" resolveInfo="verbose" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511850">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511851">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511780" resolveInfo="msg" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511852">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessage%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
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
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511854">
        <property name="name" nameId="tpck.1169194664001" value="getGenerationErrors" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511855" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511856">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511857">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511858">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999511859">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511860">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511760" resolveInfo="myGenerationErrors" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511861">
        <property name="name" nameId="tpck.1169194664001" value="getGenerationWarnings" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511862" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511863">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511864">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511865">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999511866">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511867">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511767" resolveInfo="myGenerationWarnings" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511868">
        <property name="name" nameId="tpck.1169194664001" value="clean" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511869" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511870" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511871">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511872">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511873">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511874">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511760" resolveInfo="myGenerationErrors" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511875">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" resolveInfo="clear" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511876">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511877">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511878">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511767" resolveInfo="myGenerationWarnings" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511879">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dclear()%cvoid" resolveInfo="clear" />
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
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019499556">
      <property name="name" nameId="tpck.1169194664001" value="ModelCycle" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499557" />
      <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511554">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="TestGenerationWorker.Cycle" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499559">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myModule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499560">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499561" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499562">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="myProject" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499563">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499564" />
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499565">
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <property name="name" nameId="tpck.1169194664001" value="mySModel" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499566">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
        </node>
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499567" />
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019499568">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499569" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499570" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499571">
          <property name="name" nameId="tpck.1169194664001" value="sModel" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499572">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499573">
          <property name="name" nameId="tpck.1169194664001" value="module" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499574">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499575">
          <property name="name" nameId="tpck.1169194664001" value="project" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499576">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501213">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501214">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019501215">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501216">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499565" resolveInfo="mySModel" />
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501217">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499571" resolveInfo="sModel" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501218">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019501219">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501220">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499562" resolveInfo="myProject" />
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501221">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499575" resolveInfo="project" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501222">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019501223">
              <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501224">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
              </node>
              <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501225">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499573" resolveInfo="module" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499577">
        <property name="name" nameId="tpck.1169194664001" value="generate" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499578" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499579" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499580">
          <property name="name" nameId="tpck.1169194664001" value="gm" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499581">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GeneratorManager" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499582">
          <property name="name" nameId="tpck.1169194664001" value="generationHandler" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499583">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pi7p.~IGenerationHandler" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499584">
          <property name="name" nameId="tpck.1169194664001" value="messageHandler" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499585">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501226">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501227">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501228">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501229">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499580" resolveInfo="gm" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501230">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GeneratorManager%dgenerateModels(java%dutil%dList,jetbrains%dmps%dsmodel%dIOperationContext,jetbrains%dmps%dgenerator%dgenerationTypes%dIGenerationHandler,com%dintellij%dopenapi%dprogress%dProgressIndicator,jetbrains%dmps%dmessages%dIMessageHandler,jetbrains%dmps%dgenerator%dGenerationOptions)%cboolean" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501231">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dsingletonList(java%dlang%dObject)%cjava%dutil%dList" />
                  <node role="typeArgument" roleId="tpee.4972241301747169160" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501232">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501233">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499565" resolveInfo="mySModel" />
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501234">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="afxk.~ProjectOperationContext" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~ProjectOperationContext%dget(com%dintellij%dopenapi%dproject%dProject)%cjetbrains%dmps%dproject%dProjectOperationContext" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501235">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501236">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499562" resolveInfo="myProject" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501237">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" />
                    </node>
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501238">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499582" resolveInfo="generationHandler" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501239">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501240">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~EmptyProgressIndicator%d&lt;init&gt;()" />
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501241">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499584" resolveInfo="messageHandler" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501242">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501243">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501244">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501245">
                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="h5ia.~GenerationOptions" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationOptions%dgetDefaults()%cjetbrains%dmps%dgenerator%dGenerationOptions$OptionsBuilder" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501246">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationOptions$OptionsBuilder%dsaveTransientModels(boolean)%cjetbrains%dmps%dgenerator%dGenerationOptions$OptionsBuilder" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501247">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500878" resolveInfo="isInvokeTestsSet" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501248">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationOptions$OptionsBuilder%drebuildAll(boolean)%cjetbrains%dmps%dgenerator%dGenerationOptions$OptionsBuilder" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501249">
                        <property name="value" nameId="tpee.1068580123138" value="true" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501250">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationOptions$OptionsBuilder%dcreate()%cjetbrains%dmps%dgenerator%dGenerationOptions" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499586">
        <property name="name" nameId="tpck.1169194664001" value="classPathItemToFiles" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499587" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499588">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499589">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499590">
          <property name="name" nameId="tpck.1169194664001" value="cp" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499591">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~IClassPathItem" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501251">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501252">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501253">
              <property name="name" nameId="tpck.1169194664001" value="classPathFiles" />
              <property name="isFinal" nameId="tpee.1176718929932" value="true" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501254">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501255">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
                </node>
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501256">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501257">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                  <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501258">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501259">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501260">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501261">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499590" resolveInfo="cp" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501262">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="60vs.~IClassPathItem%daccept(jetbrains%dmps%dreloading%dIClassPathItemVisitor)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501263">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019501264">
                    <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019501265">
                      <property name="name" nameId="tpck.1169194664001" value="" />
                      <link role="classifier" roleId="tpee.1170346070688" targetNodeId="60vs.~EachClassPathItemVisitor" resolveInfo="EachClassPathItemVisitor" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="60vs.~EachClassPathItemVisitor%d&lt;init&gt;()" />
                      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501266">
                        <property name="name" nameId="tpck.1169194664001" value="visit" />
                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019501267" />
                        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019501268" />
                        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019501269">
                          <property name="name" nameId="tpck.1169194664001" value="cpItem" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501270">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~FileClassPathItem" />
                          </node>
                        </node>
                        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501345">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501346">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501347">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501348">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501253" resolveInfo="classPathFiles" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501349">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501350">
                                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501351">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501352">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501353">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501269" resolveInfo="cpItem" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501354">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="60vs.~FileClassPathItem%dgetClassPath()%cjava%dlang%dString" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501355">
                          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
                        </node>
                      </node>
                      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501271">
                        <property name="name" nameId="tpck.1169194664001" value="visit" />
                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019501272" />
                        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019501273" />
                        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019501274">
                          <property name="name" nameId="tpck.1169194664001" value="cpItem" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501275">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~JarFileClassPathItem" />
                          </node>
                        </node>
                        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501356">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501357">
                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501358">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501359">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501253" resolveInfo="classPathFiles" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501360">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501361">
                                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501362">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501363">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501364">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501365">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501274" resolveInfo="cpItem" />
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501366">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="60vs.~JarFileClassPathItem%dgetFile()%cjava%dio%dFile" />
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501367">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501368">
                          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501276">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501277">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501253" resolveInfo="classPathFiles" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499592">
        <property name="name" nameId="tpck.1169194664001" value="getClassPath" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499593" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499594">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499595">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501278">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501279">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501280">
              <property name="name" nameId="tpck.1169194664001" value="cp" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501281">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~IClassPathItem" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501282">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501283">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501284">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(com%dintellij%dopenapi%dutil%dComputable)%cjava%dlang%dObject" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501285">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019501286">
                      <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019501287">
                        <property name="name" nameId="tpck.1169194664001" value="" />
                        <link role="classifier" roleId="tpee.1170346070688" targetNodeId="8a0f.~Computable" resolveInfo="Computable" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                        <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501288">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~IClassPathItem" resolveInfo="IClassPathItem" />
                        </node>
                        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501289">
                          <property name="name" nameId="tpck.1169194664001" value="compute" />
                          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019501290" />
                          <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501291">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="60vs.~IClassPathItem" />
                          </node>
                          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501369">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501370">
                              <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501371">
                                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="afxk.~AbstractModule" />
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~AbstractModule%dgetDependenciesClasspath(java%dutil%dSet,boolean)%cjetbrains%dmps%dreloading%dIClassPathItem" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501372">
                                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" />
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dsingleton(java%dlang%dObject)%cjava%dutil%dSet" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501373">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501374">
                                  <property name="value" nameId="tpee.1068580123138" value="true" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501375">
                            <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501292">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501293">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499586" resolveInfo="classPathItemToFiles" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501294">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501280" resolveInfo="cp" />
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501295">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499596">
        <property name="name" nameId="tpck.1169194664001" value="toString" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499597" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499598">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501296">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501297">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501298">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501299">
                <property name="value" nameId="tpee.1070475926801" value="generating " />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501300">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501301">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499565" resolveInfo="mySModel" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501302">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModelDescriptor%dgetLongName()%cjava%dlang%dString" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501303">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499599">
        <property name="name" nameId="tpck.1169194664001" value="getModel" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499600" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499601">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501304">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501305">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501306">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499565" resolveInfo="mySModel" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499602">
        <property name="name" nameId="tpck.1169194664001" value="isUserModel" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499603" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019499604" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501307">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501308">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="7795897115019501309">
              <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501310">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
              </node>
              <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501311">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~Language" />
              </node>
            </node>
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501312">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="7795897115019501313">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="7795897115019501314">
                  <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501315">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
                  </node>
                  <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501316">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~Generator" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.InstanceOfExpression" typeId="tpee.1081256982272" id="7795897115019501317">
                  <node role="leftExpression" roleId="tpee.1081256993304" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501318">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
                  </node>
                  <node role="classType" roleId="tpee.1081256993305" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501319">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~DevKit" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501320">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501321">
                  <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501322" />
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501323">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501324">
                <node role="iterable" roleId="tpee.1144226360166" type="tpee.EnumValuesExpression" typeId="tpee.1224573963862" id="7795897115019501735">
                  <link role="enumClass" roleId="tpee.1224573974191" targetNodeId="lkfb.~LanguageAspect" resolveInfo="LanguageAspect" />
                </node>
                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501326">
                  <property name="name" nameId="tpck.1169194664001" value="la" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501327">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~LanguageAspect" />
                  </node>
                </node>
                <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501328">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501329">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7795897115019501330">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501331">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501332">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501326" resolveInfo="la" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501333">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~LanguageAspect%dget(jetbrains%dmps%dsmodel%dLanguage)%cjetbrains%dmps%dsmodel%ddescriptor%dEditableSModelDescriptor" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7795897115019501334">
                            <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501335">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499559" resolveInfo="myModule" />
                            </node>
                            <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501336">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~Language" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501337">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499565" resolveInfo="mySModel" />
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501338">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501339">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501340" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501341">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501342">
                  <property name="value" nameId="tpee.1068580123138" value="true" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501343">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501344">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019499605">
      <property name="name" nameId="tpck.1169194664001" value="MyClassLoader" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499606" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499607">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="30pf.~AbstractClassLoader" />
      </node>
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019499608">
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499609" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499610" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499611">
          <property name="name" nameId="tpck.1169194664001" value="parent" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499612">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501376">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019501377">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~AbstractClassLoader%d&lt;init&gt;(java%dlang%dClassLoader)" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501378">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499611" resolveInfo="parent" />
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499613">
        <property name="name" nameId="tpck.1169194664001" value="findClassBytes" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019499614" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019499615">
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.ByteType" typeId="tpee.1070534604311" id="7795897115019499616" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499617">
          <property name="name" nameId="tpck.1169194664001" value="name" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499618">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501379">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501380">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501381">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501382">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501383">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501384">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501385">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~InMemoryJavaGenerationHandler%dgetCompiler()%cjetbrains%dmps%dcompiler%dJavaCompiler" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501386">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="iqnk.~JavaCompiler%dgetClasses()%cjava%dutil%dMap" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501387">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501388">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499617" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499619">
        <property name="name" nameId="tpck.1169194664001" value="isExcluded" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019499620" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019499621" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499622">
          <property name="name" nameId="tpck.1169194664001" value="name" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499623">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501389">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501390">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501391" />
          </node>
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499624">
        <property name="name" nameId="tpck.1169194664001" value="getResource" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499625" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499626">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~URL" />
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499627">
          <property name="name" nameId="tpck.1169194664001" value="name" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499628">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501392">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501393">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501394">
              <property name="name" nameId="tpck.1169194664001" value="resource" />
              <property name="isFinal" nameId="tpee.1176718929932" value="true" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501395">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~URL" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="7795897115019501396">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~ClassLoader%dgetResource(java%dlang%dString)%cjava%dnet%dURL" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501397">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499627" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501398">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501399">
              <property name="name" nameId="tpck.1169194664001" value="outputDir" />
              <property name="isFinal" nameId="tpee.1176718929932" value="true" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501400">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501401">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501402">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501403">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%dgetLastOutputDir()%cjava%dio%dFile" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501404">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="7795897115019501405">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019501406">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501407">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501394" resolveInfo="resource" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501408" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7795897115019501409">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501410">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501399" resolveInfo="outputDir" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501411" />
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501412">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501413">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501414">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501394" resolveInfo="resource" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501415">
            <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501416">
              <property name="name" nameId="tpck.1169194664001" value="resourceFile" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501417">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501418">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501419">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501420">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501421">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501422">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501423">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501399" resolveInfo="outputDir" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501424">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501425">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparator" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501426">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499627" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501427">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501428">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501429">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501416" resolveInfo="resourceFile" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501430">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dexists()%cboolean" />
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501431">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019501432">
                <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019501433">
                  <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501434" />
                  <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501435">
                    <property name="name" nameId="tpck.1169194664001" value="e" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501436">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~MalformedURLException" />
                    </node>
                  </node>
                </node>
                <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501437">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501438">
                    <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501439">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501440">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501416" resolveInfo="resourceFile" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501441">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dtoURL()%cjava%dnet%dURL" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501442">
            <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501443" />
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501444">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.ClassConcept" typeId="tpee.1068390468198" id="7795897115019499629">
      <property name="name" nameId="tpck.1169194664001" value="MyUnitTestAdapter" />
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499630" />
      <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499631">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s1zt.~UnitTestAdapter" />
      </node>
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
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499639">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501446">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501447">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501448">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501449">
                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501450">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501451">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501452">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501453">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestStart(java%dlang%dString)%cjava%dlang%dString" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501454">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501455">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501456">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501457">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499638" resolveInfo="testName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501458">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499640">
        <property name="name" nameId="tpck.1169194664001" value="testFailed" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499641" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499642" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499643">
          <property name="name" nameId="tpck.1169194664001" value="test" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499644">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499645">
          <property name="name" nameId="tpck.1169194664001" value="message" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499646">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499647">
          <property name="name" nameId="tpck.1169194664001" value="details" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499648">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501459">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501460">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501461">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501462">
                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501463">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dObject)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501464">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501465">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501466">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFailure(java%dlang%dString,java%dlang%dString,java%dlang%dCharSequence)%cjava%dlang%dCharSequence" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501467">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501468">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501469">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501470">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499643" resolveInfo="test" />
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501471">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501472">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501473">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501474">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499645" resolveInfo="message" />
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501475">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501476">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501477">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501478">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499647" resolveInfo="details" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501479">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499649">
        <property name="name" nameId="tpck.1169194664001" value="testFinished" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499650" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499651" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499652">
          <property name="name" nameId="tpck.1169194664001" value="testName" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499653">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501480">
          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501481">
            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501482">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501483">
                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501484">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501485">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501486">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501487">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFinish(java%dlang%dString)%cjava%dlang%dString" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501488">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501489">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501490">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501491">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499652" resolveInfo="testName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501492">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499654">
        <property name="name" nameId="tpck.1169194664001" value="logMessage" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499655" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499656" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499657">
          <property name="name" nameId="tpck.1169194664001" value="message" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499658">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
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
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501503">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501504">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501505">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501506">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499657" resolveInfo="message" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501507">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
        </node>
      </node>
      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499659">
        <property name="name" nameId="tpck.1169194664001" value="logError" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499660" />
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499661" />
        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499662">
          <property name="name" nameId="tpck.1169194664001" value="errorMessage" />
          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499663">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
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
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" />
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501518">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501519">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501520">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%derror(java%dlang%dString)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501521">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499662" resolveInfo="errorMessage" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501522">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
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
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511774" resolveInfo="MyMessageHandler" />
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
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~IBuildServerMessageFormat" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499670" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499671">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myPerfomanceMap" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499672">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499673">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
        </node>
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499674">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Long" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499675" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499676">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499677">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~HashMap%d&lt;init&gt;()" />
          <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499678">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
          </node>
          <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499679">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Long" />
          </node>
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7795897115019499680">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="myGenerationHandler" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499681">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pi7p.~DiffGenerationHandler" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499682" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499683">
        <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019499684">
          <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019499685">
            <property name="name" nameId="tpck.1169194664001" value="" />
            <link role="classifier" roleId="tpee.1170346070688" targetNodeId="pi7p.~DiffGenerationHandler" resolveInfo="DiffGenerationHandler" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%d&lt;init&gt;(boolean,boolean)" />
            <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499686">
              <property name="name" nameId="tpck.1169194664001" value="createJavaCompiler" />
              <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019499687" />
              <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499688">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="iqnk.~JavaCompiler" />
              </node>
              <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501523">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501524">
                  <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501525">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019501526">
                      <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019501527">
                        <property name="name" nameId="tpck.1169194664001" value="" />
                        <link role="classifier" roleId="tpee.1170346070688" targetNodeId="iqnk.~JavaCompiler" resolveInfo="JavaCompiler" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="iqnk.~JavaCompiler%d&lt;init&gt;()" />
                        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501528">
                          <property name="name" nameId="tpck.1169194664001" value="getClassLoader" />
                          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019501529" />
                          <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501530">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
                          </node>
                          <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019501531">
                            <property name="name" nameId="tpck.1169194664001" value="parent" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501532">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
                            </node>
                          </node>
                          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501534">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501535">
                              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501536">
                                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501537">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499608" resolveInfo="TestGenerationWorker.MyClassLoader" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501538">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501531" resolveInfo="parent" />
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
            <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499689">
              <property name="name" nameId="tpck.1169194664001" value="finishGeneration" />
              <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499690" />
              <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499691" />
              <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499692">
                <property name="name" nameId="tpck.1169194664001" value="progressHelper" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499693">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="rkg2.~ITaskProgressHelper" />
                </node>
              </node>
              <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501533" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019499694" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019499695">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
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
          <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499701">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
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
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="c123.~WhatToDo" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dfromDumpInFile(java%dio%dFile)%cjetbrains%dmps%dbuild%dant%dWhatToDo" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499709">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499710">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
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
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499714">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499715">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$LogLogger%d&lt;init&gt;()" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dworkFromMain()%cvoid" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7795897115019499720">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499721" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499722" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499723">
        <property name="name" nameId="tpck.1169194664001" value="whatToDo" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499724">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499725">
        <property name="name" nameId="tpck.1169194664001" value="component" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499726">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="kp22.~ProjectComponent" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499727">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019499728">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dWhatToDo,org%dapache%dtools%dant%dProjectComponent)" resolveInfo="MpsWorker" />
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499729">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499723" resolveInfo="whatToDo" />
          </node>
          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019499730">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499725" resolveInfo="component" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~WhatToDo" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499736">
        <property name="name" nameId="tpck.1169194664001" value="logger" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499737">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$AntLogger" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499738">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.SuperConstructorInvocation" typeId="tpee.1070475587102" id="7795897115019499739">
          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dWhatToDo,jetbrains%dmps%dbuild%dant%dMpsWorker$AntLogger)" resolveInfo="MpsWorker" />
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
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511079">
      <property name="name" nameId="tpck.1169194664001" value="executeTask" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7874190907999511080" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511081" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511082">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511083">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511084">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511085">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" resolveInfo="ObjectsToProcess" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dhasAnythingToGenerate()%cboolean" resolveInfo="hasAnythingToGenerate" />
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
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511556">
      <property name="name" nameId="tpck.1169194664001" value="setGenerationProperties" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511557" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511558" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511559">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999511560">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7874190907999511561">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511562">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511563">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" resolveInfo="myWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511564">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getProperty" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7874190907999511565">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~GenerateTask" resolveInfo="GenerateTask" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~GenerateTask%dPER_ROOT_GENERATION" resolveInfo="PER_ROOT_GENERATION" />
                </node>
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511566" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511567">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511568">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511569">
                <property name="name" nameId="tpck.1169194664001" value="perRootGeneration" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7874190907999511570" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511571">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" resolveInfo="Boolean" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" resolveInfo="parseBoolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511572">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511573">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" resolveInfo="myWhatToDo" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511574">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getProperty" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7874190907999511575">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~GenerateTask" resolveInfo="GenerateTask" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~GenerateTask%dPER_ROOT_GENERATION" resolveInfo="PER_ROOT_GENERATION" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511576">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511577">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511578">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ista.~GenerationSettings" resolveInfo="GenerationSettings" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dgetInstance()%cjetbrains%dmps%dide%dgenerator%dGenerationSettings" resolveInfo="getInstance" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511579">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dsetParallelGenerator(boolean)%cvoid" resolveInfo="setParallelGenerator" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511580">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511569" resolveInfo="perRootGeneration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511581">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511582">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511583">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dgetInstance()%cjetbrains%dmps%dide%dgenerator%dGenerationSettings" resolveInfo="getInstance" />
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="ista.~GenerationSettings" resolveInfo="GenerationSettings" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511584">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ista.~GenerationSettings%dsetStrictMode(boolean)%cvoid" resolveInfo="setStrictMode" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511585">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511569" resolveInfo="perRootGeneration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511586">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511587">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" resolveInfo="info" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999511588">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999511589">
                    <property name="value" nameId="tpee.1070475926801" value="Per-root generation set to " />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511590">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511569" resolveInfo="perRootGeneration" />
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
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511606">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511607">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511608">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" resolveInfo="ObjectsToProcess" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetProjects()%cjava%dutil%dSet" resolveInfo="getProjects" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511620">
            <property name="name" nameId="tpck.1169194664001" value="p" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511621">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModules()%cjava%dutil%dSet" resolveInfo="getModules" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511637">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511638">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModels()%cjava%dutil%dSet" resolveInfo="getModels" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511654">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511655">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
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
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" resolveInfo="info" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511692">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511693">
            <property name="name" nameId="tpck.1169194664001" value="gm" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511694">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GeneratorManager" resolveInfo="GeneratorManager" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511695">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511696">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511697">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511605" resolveInfo="project" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511698">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" resolveInfo="getProject" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511699">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="bw1v.~ComponentManager%dgetComponent(java%dlang%dClass)%cjava%dlang%dObject" resolveInfo="getComponent" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7874190907999511700">
                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="h5ia.~GeneratorManager" resolveInfo="GeneratorManager" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511701">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511702">
            <property name="name" nameId="tpck.1169194664001" value="generationListener" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511703">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GenerationListener" resolveInfo="GenerationListener" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511704">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500093" resolveInfo="getGenerationListener" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511705">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511706">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511707">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511693" resolveInfo="gm" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511708">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GeneratorManager%daddGenerationListener(jetbrains%dmps%dgenerator%dGenerationListener)%cvoid" resolveInfo="addGenerationListener" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511709">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511702" resolveInfo="generationListener" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511710">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511711">
            <property name="name" nameId="tpck.1169194664001" value="order" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511712">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511713">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="Cycle" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511714">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500900" resolveInfo="computeGenerationOrder" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511715">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511605" resolveInfo="project" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511716">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511607" resolveInfo="go" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511717">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511718">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511711" resolveInfo="order" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511719">
            <property name="name" nameId="tpck.1169194664001" value="cycle" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511720">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="Cycle" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511721">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511722">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511723">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500174" resolveInfo="generateModulesCycle" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511724">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511693" resolveInfo="gm" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511725">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511719" resolveInfo="cycle" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511726">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511727">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511728">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511693" resolveInfo="gm" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511729">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GeneratorManager%dremoveGenerationListener(jetbrains%dmps%dgenerator%dGenerationListener)%cvoid" resolveInfo="removeGenerationListener" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511730">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511702" resolveInfo="generationListener" />
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
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dsetupEnvironment()%cvoid" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499752">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499753">
            <property name="name" nameId="tpck.1169194664001" value="mpsProjects" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499754">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499755">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
              </node>
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499756">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499757">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499758">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499759">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499760">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetMPSProjectFiles()%cjava%dutil%dMap" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dkeySet()%cjava%dutil%dSet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499765">
            <property name="name" nameId="tpck.1169194664001" value="file" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499766">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
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
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetName()%cjava%dlang%dString" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499774">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dendsWith(java%dlang%dString)%cboolean" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019499775">
                      <link role="classifier" roleId="tpee.1144433057691" targetNodeId="afxk.~MPSExtentions" />
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="afxk.~MPSExtentions%dDOT_MPS_PROJECT" />
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
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499780">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019499781">
              <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019499782">
                <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499783">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7795897115019499784">
                    <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499785">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499786">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~RuntimeException%d&lt;init&gt;(java%dlang%dThrowable)" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499787">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499788" resolveInfo="ex" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499788">
                  <property name="name" nameId="tpck.1169194664001" value="ex" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499789">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Exception" />
                  </node>
                </node>
              </node>
              <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499790">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499791">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499792">
                    <property name="name" nameId="tpck.1169194664001" value="cls" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499793">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Class" />
                      <node role="parameter" roleId="tpee.1109201940907" type="tpee.WildCardType" typeId="tpee.1171903607971" id="7795897115019499794" />
                    </node>
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499795">
                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Class" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dforName(java%dlang%dString)%cjava%dlang%dClass" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019499796">
                        <property name="value" nameId="tpee.1070475926801" value="jetbrains.mps.TestMain" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499797">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499798">
                    <property name="name" nameId="tpck.1169194664001" value="meth" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499799">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="xqpa.~Method" />
                    </node>
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499800">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499801">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499792" resolveInfo="cls" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499802">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetMethod(java%dlang%dString,java%dlang%dClass%d%d%d)%cjava%dlang%dreflect%dMethod" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019499803">
                          <property name="value" nameId="tpee.1070475926801" value="loadProject" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7795897115019499804">
                          <link role="classifier" roleId="tpee.1116615189566" targetNodeId="fxg7.~File" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499805">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019499806">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499807">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7795897115019499808">
                      <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499809">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499810">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499798" resolveInfo="meth" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499811">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Method%dinvoke(java%dlang%dObject,java%dlang%dObject%d%d%d)%cjava%dlang%dObject" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019499812" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499813">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499765" resolveInfo="file" />
                          </node>
                        </node>
                      </node>
                      <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499814">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499815">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499816">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
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
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dMpsWorker,java%dutil%dSet,java%dutil%dSet,java%dutil%dSet)" resolveInfo="ObjectsToProcess" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499825">
                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dsingleton(java%dlang%dObject)%cjava%dutil%dSet" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499826">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499827">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499828">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~HashSet%d&lt;init&gt;()" />
                        <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499829">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
                        </node>
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499830">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499831">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~HashSet%d&lt;init&gt;()" />
                        <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499832">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499833">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499834">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%ddisposeProject(jetbrains%dmps%dproject%dMPSProject)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499835">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499779" resolveInfo="p" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499836">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499837">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%ddispose()%cvoid" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499838">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499839">
            <property name="name" nameId="tpck.1169194664001" value="modules" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499840">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~LinkedHashSet" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499841">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499842">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499843">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~LinkedHashSet%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499844">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499845">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499846">
            <property name="name" nameId="tpck.1169194664001" value="models" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499847">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~LinkedHashSet" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499848">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499849">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499850">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~LinkedHashSet%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499851">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499852">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499853">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dcollectFromModuleFiles(java%dutil%dSet)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499854">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499839" resolveInfo="modules" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499855">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499856">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dcollectFromModelFiles(java%dutil%dSet)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499857">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499846" resolveInfo="models" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499858">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499859">
            <property name="name" nameId="tpck.1169194664001" value="go" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499860">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499861">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499862">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%d&lt;init&gt;(jetbrains%dmps%dbuild%dant%dMpsWorker,java%dutil%dSet,java%dutil%dSet,java%dutil%dSet)" resolveInfo="ObjectsToProcess" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019499863">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="k7g3.~Collections" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="k7g3.~Collections%dEMPTY_SET" />
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
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dhasAnythingToGenerate()%cboolean" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499870">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499871">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499872">
                <property name="name" nameId="tpck.1169194664001" value="project" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499873">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499874">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dcreateDummyProject()%cjetbrains%dmps%dproject%dMPSProject" />
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
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499879">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499880">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499885" resolveInfo="generatePerformanceReport" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499881">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499882">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%ddispose()%cvoid" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499883">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499884">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019501197" resolveInfo="showStatistic" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499885">
      <property name="name" nameId="tpck.1169194664001" value="generatePerformanceReport" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019499886" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499887" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499888">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499889">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499890">
            <property name="name" nameId="tpck.1169194664001" value="destinations" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019499891">
              <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499892">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499893">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500129" resolveInfo="getPerfomanceReportDestinations" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019499894">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019499895">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499896">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499897">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499890" resolveInfo="destinations" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.ArrayLengthOperation" typeId="tpee.1208890769693" id="7795897115019499898" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019499899">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499900">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499901">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499902">
                <property name="name" nameId="tpck.1169194664001" value="w" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499903">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~StringWriter" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499904">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499905">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~StringWriter%d&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499906">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499907">
                <property name="name" nameId="tpck.1169194664001" value="f" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499908">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Formatter" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499909">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499910">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Formatter%d&lt;init&gt;(java%dlang%dAppendable)" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499911">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499902" resolveInfo="w" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499912">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499913">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499914">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499907" resolveInfo="f" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499915">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Formatter%dformat(java%dlang%dString,java%dlang%dObject%d%d%d)%cjava%dutil%dFormatter" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019499916">
                    <property name="value" nameId="tpee.1070475926801" value="Generation Time Report:\n" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499917">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499918">
                <property name="name" nameId="tpck.1169194664001" value="models" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499919">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~ArrayList" />
                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499920">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                  </node>
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499921">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499922">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                    <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499923">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499924">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499925">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499926">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499918" resolveInfo="models" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499927">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%daddAll(java%dutil%dCollection)%cboolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499928">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499929">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499930">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dkeySet()%cjava%dutil%dSet" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499931">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499932">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="k7g3.~Collections" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Collections%dsort(java%dutil%dList,java%dutil%dComparator)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499933">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499918" resolveInfo="models" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499934">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019499935">
                    <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019499936">
                      <property name="name" nameId="tpck.1169194664001" value="" />
                      <link role="classifier" roleId="tpee.1170346070688" targetNodeId="k7g3.~Comparator" resolveInfo="Comparator" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                      <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499937">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                      </node>
                      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499938">
                        <property name="name" nameId="tpck.1169194664001" value="compare" />
                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019499939" />
                        <node role="returnType" roleId="tpee.1068580123133" type="tpee.IntegerType" typeId="tpee.1070534370425" id="7795897115019499940" />
                        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499941">
                          <property name="name" nameId="tpck.1169194664001" value="o1" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499942">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                          </node>
                        </node>
                        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499943">
                          <property name="name" nameId="tpck.1169194664001" value="o2" />
                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499944">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                          </node>
                        </node>
                        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501539">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501540">
                            <node role="expression" roleId="tpee.1068581517676" type="tpee.UnaryMinus" typeId="tpee.8064396509828172209" id="7795897115019501541">
                              <node role="expression" roleId="tpee.1239714902950" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501542">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501543">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501544">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501545">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501546">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499941" resolveInfo="o1" />
                                    </node>
                                  </node>
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501547">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Long%dcompareTo(java%dlang%dLong)%cint" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501548">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501549">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501550">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501551">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499943" resolveInfo="o2" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501552">
                          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019499945">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499946">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499918" resolveInfo="models" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499947">
                <property name="name" nameId="tpck.1169194664001" value="modelDescriptor" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499948">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499949">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499950">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499951">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499952">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499907" resolveInfo="f" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499953">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Formatter%dformat(java%dlang%dString,java%dlang%dObject%d%d%d)%cjava%dutil%dFormatter" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019499954">
                        <property name="value" nameId="tpee.1070475926801" value="%s %dms\n" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499955">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499956">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499947" resolveInfo="modelDescriptor" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499957">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModelDescriptor%dgetLongName()%cjava%dlang%dString" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499958">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499959">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499960">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499961">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499947" resolveInfo="modelDescriptor" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019499962">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499963">
                <property name="name" nameId="tpck.1169194664001" value="report" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499964">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499965">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499966">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499902" resolveInfo="w" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499967">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~StringWriter%dtoString()%cjava%dlang%dString" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019499968">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499969">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499890" resolveInfo="destinations" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019499970">
                <property name="name" nameId="tpck.1169194664001" value="dest" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499971">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499972">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019499973">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499974">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499975">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499970" resolveInfo="dest" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499976">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dequals(java%dlang%dObject)%cboolean" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019499977">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~PerfomanceReport" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~PerfomanceReport%dSTDOUT" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019499978">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499979">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499980">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019499981">
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="30pf.~FileUtil" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~FileUtil%dwrite(java%dio%dFile,java%dlang%dString)%cvoid" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019499982">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019499983">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499984">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499970" resolveInfo="dest" />
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499985">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499963" resolveInfo="report" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019499986">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019499987">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019499988">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019499989">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019499990">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019499991">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019499992">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499963" resolveInfo="report" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019499993">
      <property name="name" nameId="tpck.1169194664001" value="startMake" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019499994" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019499995" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499996">
        <property name="name" nameId="tpck.1169194664001" value="compiledLibraries" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499997">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019499998">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="eh1m.~Library" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019499999">
        <property name="name" nameId="tpck.1169194664001" value="toCompile" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500000">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500001">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500002">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500003">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500004">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500005">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500006">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500007">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500008">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500009">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestStart(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500010">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500011">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500012">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500013">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500014">
                          <property name="value" nameId="tpee.1070475926801" value="make " />
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500015">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499996" resolveInfo="compiledLibraries" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500016">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="7795897115019500017">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dstartMake(java%dutil%dSet,java%dutil%dSet)%cvoid" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500018">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499996" resolveInfo="compiledLibraries" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500019">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499999" resolveInfo="toCompile" />
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019500020">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500021">
      <property name="name" nameId="tpck.1169194664001" value="finishMake" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019500022" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500023" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500024">
        <property name="name" nameId="tpck.1169194664001" value="compiledLibraries" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500025">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500026">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="eh1m.~Library" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500027">
        <property name="name" nameId="tpck.1169194664001" value="result" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501737">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="xirj.~MPSCompilationResult" resolveInfo="MPSCompilationResult" />
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019500029">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500030">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500031">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500032">
            <property name="name" nameId="tpck.1169194664001" value="testName" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500033">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500034">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500035">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500036">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500037">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500038">
                    <property name="value" nameId="tpee.1070475926801" value="make " />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500039">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500024" resolveInfo="compiledLibraries" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500040">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019500041">
            <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500042">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500043">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500027" resolveInfo="result" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500044">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xirj.~MPSCompilationResult%disOk()%cboolean" resolveInfo="isOk" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500045">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500046">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500047">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500048">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500049">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dObject)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500050">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500051">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500052">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFailure(java%dlang%dString,java%dlang%dString,java%dlang%dCharSequence)%cjava%dlang%dCharSequence" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500053">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500032" resolveInfo="testName" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500054">
                        <property name="value" nameId="tpee.1070475926801" value="Compilation Errors" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500055">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500056">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500027" resolveInfo="result" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500057">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xirj.~MPSCompilationResult%dtoString()%cjava%dlang%dString" resolveInfo="toString" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500058">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500059">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500060">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500061">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500062">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500063">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500064">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFinish(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500065">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500032" resolveInfo="testName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019500066">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500067">
      <property name="name" nameId="tpck.1169194664001" value="getBuildServerMessageFormat" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500068" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500069">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~IBuildServerMessageFormat" />
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
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="22yz.~ConsoleMessageFormat%d&lt;init&gt;()" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500078">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500079">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500080">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500081">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~TeamCityMessageFormat%d&lt;init&gt;()" />
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
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500090">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500093">
      <property name="name" nameId="tpck.1169194664001" value="getGenerationListener" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999512024" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500095">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GenerationListener" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500096">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500097">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500098">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500164" resolveInfo="isGeneratePerfomanceReport" />
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019500099">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500100">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999511105">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511106">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511107">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationAdapter%d&lt;init&gt;()" resolveInfo="GenerationAdapter" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500103">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500104">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500105">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500106">
                  <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500107">
                    <property name="name" nameId="tpck.1169194664001" value="" />
                    <link role="classifier" roleId="tpee.1170346070688" targetNodeId="h5ia.~GenerationAdapter" resolveInfo="GenerationAdapter" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenerationAdapter%d&lt;init&gt;()" />
                    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500108">
                      <property name="name" nameId="tpck.1169194664001" value="beforeGeneration" />
                      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500109" />
                      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500110" />
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500111">
                        <property name="name" nameId="tpck.1169194664001" value="inputModels" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500112">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500113">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                          </node>
                        </node>
                      </node>
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500114">
                        <property name="name" nameId="tpck.1169194664001" value="options" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500115">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GenerationOptions" />
                        </node>
                      </node>
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500116">
                        <property name="name" nameId="tpck.1169194664001" value="operationContext" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500117">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" />
                        </node>
                      </node>
                      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501553">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501554">
                          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501555">
                            <property name="name" nameId="tpck.1169194664001" value="startTime" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501556">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Long" />
                            </node>
                            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501557">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~System" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~System%dcurrentTimeMillis()%clong" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501558">
                          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501559">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500111" resolveInfo="inputModels" />
                          </node>
                          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501560">
                            <property name="name" nameId="tpck.1169194664001" value="model" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501561">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                            </node>
                          </node>
                          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501562">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501563">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501564">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501565">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501566">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dput(java%dlang%dObject,java%dlang%dObject)%cjava%dlang%dObject" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501567">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501560" resolveInfo="model" />
                                  </node>
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501568">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501555" resolveInfo="startTime" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501569">
                        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
                      </node>
                    </node>
                    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500118">
                      <property name="name" nameId="tpck.1169194664001" value="afterGeneration" />
                      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500119" />
                      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500120" />
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500121">
                        <property name="name" nameId="tpck.1169194664001" value="inputModels" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500122">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500123">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                          </node>
                        </node>
                      </node>
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500124">
                        <property name="name" nameId="tpck.1169194664001" value="options" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500125">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GenerationOptions" />
                        </node>
                      </node>
                      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500126">
                        <property name="name" nameId="tpck.1169194664001" value="operationContext" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500127">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" />
                        </node>
                      </node>
                      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501570">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501571">
                          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501572">
                            <property name="name" nameId="tpck.1169194664001" value="finishTime" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501573">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Long" />
                            </node>
                            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501574">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~System" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~System%dcurrentTimeMillis()%clong" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501575">
                          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501576">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500121" resolveInfo="inputModels" />
                          </node>
                          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501577">
                            <property name="name" nameId="tpck.1169194664001" value="model" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501578">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
                            </node>
                          </node>
                          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501579">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501580">
                              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501581">
                                <property name="name" nameId="tpck.1169194664001" value="startTime" />
                                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501582">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Long" />
                                </node>
                                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501583">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501584">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501585">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501586">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501577" resolveInfo="model" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501587">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501588">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501589">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499671" resolveInfo="myPerfomanceMap" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501590">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dput(java%dlang%dObject,java%dlang%dObject)%cjava%dlang%dObject" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501591">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501577" resolveInfo="model" />
                                  </node>
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.MinusExpression" typeId="tpee.1068581242869" id="7795897115019501592">
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501593">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501572" resolveInfo="finishTime" />
                                    </node>
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501594">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501581" resolveInfo="startTime" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501595">
                        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500129">
      <property name="name" nameId="tpck.1169194664001" value="getPerfomanceReportDestinations" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500130" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ArrayType" typeId="tpee.1070534760951" id="7795897115019500131">
        <node role="componentType" roleId="tpee.1070534760952" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500132">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500133">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500134">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500135">
            <property name="name" nameId="tpck.1169194664001" value="reportType" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500136">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500137">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500138">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500139">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500140">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dGENERATE_PERFORMANCE_REPORT" />
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
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%disEmpty()%cboolean" />
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
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500158">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500159">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500135" resolveInfo="reportType" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500160">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dsplit(java%dlang%dString)%cjava%dlang%dString[]" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500164">
      <property name="name" nameId="tpck.1169194664001" value="isGeneratePerfomanceReport" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500165" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500166" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500167">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500168">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019500169">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500170">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500171">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500129" resolveInfo="getPerfomanceReportDestinations" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.ArrayLengthOperation" typeId="tpee.1208890769693" id="7795897115019500172" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019500173">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500174">
      <property name="name" nameId="tpck.1169194664001" value="generateModulesCycle" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999512021" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500176" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500177">
        <property name="name" nameId="tpck.1169194664001" value="gm" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500178">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GeneratorManager" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500179">
        <property name="name" nameId="tpck.1169194664001" value="cycle" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999519187">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="TestGenerationWorker.Cycle" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500181">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500182">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500183">
            <property name="name" nameId="tpck.1169194664001" value="currentTestName" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500184">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500185">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500186">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500187">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500188">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dStringBuffer)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500189">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500190">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;(java%dlang%dString)" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500191">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500192">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500179" resolveInfo="cycle" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500193">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dtoString()%cjava%dlang%dString" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500194">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500195">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500196">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500197">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500198">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500199">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500200">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500201">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestStart(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500202">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500183" resolveInfo="currentTestName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500203">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500204">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500205">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500179" resolveInfo="cycle" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500206">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511539" resolveInfo="generate" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500207">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500177" resolveInfo="gm" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500208">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999512022">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500210">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500211">
            <property name="name" nameId="tpck.1169194664001" value="diffReports" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500212">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500213">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500214">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500215">
            <property name="name" nameId="tpck.1169194664001" value="generationOk" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500216" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500217">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500218">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999512023">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500220">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511854" resolveInfo="getGenerationErrors" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500221">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500222">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500223">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500224">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500215" resolveInfo="generationOk" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500225">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500226">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500227">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500228">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500229">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dSHOW_DIFF" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019500230">
            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500231">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500232">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019500233">
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500234">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500211" resolveInfo="diffReports" />
                  </node>
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500235">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500236">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                      <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500237">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500238">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500239">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019500240">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500241">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500211" resolveInfo="diffReports" />
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500242">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500243">
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500244">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(com%dintellij%dopenapi%dutil%dComputable)%cjava%dlang%dObject" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500245">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500246">
                        <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500247">
                          <property name="name" nameId="tpck.1169194664001" value="" />
                          <link role="classifier" roleId="tpee.1170346070688" targetNodeId="8a0f.~Computable" resolveInfo="Computable" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                          <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500248">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
                            <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500249">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                            </node>
                          </node>
                          <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500250">
                            <property name="name" nameId="tpck.1169194664001" value="compute" />
                            <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500251" />
                            <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500252">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500253">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                              </node>
                            </node>
                            <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501596">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501597">
                                <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501598">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501599">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501600">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%dcreateDiffReports()%cjava%dutil%dList" />
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
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500254">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500255">
            <property name="name" nameId="tpck.1169194664001" value="outputModels" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500256">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500257">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModel" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500258">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500259">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500260">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500261">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500262">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500263">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500255" resolveInfo="outputModels" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500264">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%daddAll(java%dutil%dCollection)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500265">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500266">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500267">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%dgetOutputModels()%cjava%dutil%dCollection" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500268">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500269">
            <property name="name" nameId="tpck.1169194664001" value="compilationResult" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500270">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500271">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500272">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500273">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500274">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500275">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500276">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500277">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500215" resolveInfo="generationOk" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500278">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500890" resolveInfo="isCompileSet" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500279">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500280">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500281">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500282">
                  <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500283">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(java%dlang%dRunnable)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500284">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500285">
                      <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500286">
                        <property name="name" nameId="tpck.1169194664001" value="" />
                        <link role="classifier" roleId="tpee.1170346070688" targetNodeId="e2lb.~Runnable" resolveInfo="Runnable" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                        <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500287">
                          <property name="name" nameId="tpck.1169194664001" value="run" />
                          <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500288" />
                          <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500289" />
                          <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501601">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501602">
                              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501603">
                                <property name="name" nameId="tpck.1169194664001" value="listener" />
                                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501604">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="iqnk.~CompilationResultAdapter" />
                                </node>
                                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501605">
                                  <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019501606">
                                    <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019501607">
                                      <property name="name" nameId="tpck.1169194664001" value="" />
                                      <link role="classifier" roleId="tpee.1170346070688" targetNodeId="iqnk.~CompilationResultAdapter" resolveInfo="CompilationResultAdapter" />
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="iqnk.~CompilationResultAdapter%d&lt;init&gt;()" />
                                      <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019501608">
                                        <property name="name" nameId="tpck.1169194664001" value="onCompilationResult" />
                                        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019501609" />
                                        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019501610" />
                                        <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019501611">
                                          <property name="name" nameId="tpck.1169194664001" value="r" />
                                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501612">
                                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
                                          </node>
                                        </node>
                                        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501619">
                                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501620">
                                            <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501621">
                                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501622">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500269" resolveInfo="compilationResult" />
                                              </node>
                                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501623">
                                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501624">
                                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501611" resolveInfo="r" />
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
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501613">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501614">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501615">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501616">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~InMemoryJavaGenerationHandler%dcompile(jetbrains%dmps%dide%dprogress%dITaskProgressHelper,jetbrains%dmps%dcompiler%dCompilationResultListener)%cboolean" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501617">
                                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="rkg2.~ITaskProgressHelper" />
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="rkg2.~ITaskProgressHelper%dEMPTY" />
                                  </node>
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501618">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501603" resolveInfo="listener" />
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
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500290">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500291">
            <property name="name" nameId="tpck.1169194664001" value="compilatonOk" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500292" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500293">
              <property name="value" nameId="tpee.1068580123138" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500294">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500295">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500269" resolveInfo="compilationResult" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500296">
            <property name="name" nameId="tpck.1169194664001" value="r" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500297">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500298">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500299">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500300">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500301">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500296" resolveInfo="r" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500302">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="apgw.~CompilationResult%dhasErrors()%cboolean" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500303">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500304">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019500305">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500306">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500291" resolveInfo="compilatonOk" />
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500307" />
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7795897115019500308" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500309">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500310">
            <property name="name" nameId="tpck.1169194664001" value="sb" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500311">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500312">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500993" resolveInfo="createDetailedReport" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500313">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500269" resolveInfo="compilationResult" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500314">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500211" resolveInfo="diffReports" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500315">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500316">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999512020">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500318">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511868" resolveInfo="clean" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500319">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019500320">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500321">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500322">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500310" resolveInfo="sb" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500323">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dlength()%cint" />
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019500324">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500325">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500326">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019500327">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500328">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499664" resolveInfo="myTestFailed" />
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500329">
                  <property name="value" nameId="tpee.1068580123138" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500330">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500331">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500332">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500333">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dappend(java%dlang%dCharSequence)%cjava%dio%dPrintStream" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500334">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500335">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500336">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFailure(java%dlang%dString,java%dlang%dString,java%dlang%dCharSequence)%cjava%dlang%dCharSequence" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500337">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500183" resolveInfo="currentTestName" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500338">
                        <property name="value" nameId="tpee.1070475926801" value="Errors During Generation Testing" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500339">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500310" resolveInfo="sb" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500340">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500341">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500342">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500343">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500344">
                    <property name="value" nameId="tpee.1070475926801" value="" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500345">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500346">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500347">
              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="e2lb.~System" />
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="e2lb.~System%dout" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500348">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~PrintStream%dprintln(java%dlang%dString)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500349">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500350">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500351">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%dformatTestFinish(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500352">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500183" resolveInfo="currentTestName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500353">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500354">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500355">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500356">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500357">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500400" resolveInfo="isSaveGeneratedFilesOnDisk" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500358">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500215" resolveInfo="generationOk" />
                </node>
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500359">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500291" resolveInfo="compilatonOk" />
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019500360">
              <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500361">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500362">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500211" resolveInfo="diffReports" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500363">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500364">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500365">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500366">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dinfo(java%dlang%dString)%cvoid" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500367">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500368">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500369">
                      <property name="value" nameId="tpee.1070475926801" value="Saving files generated from " />
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500370">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500371">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500179" resolveInfo="cycle" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500372">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dtoString()%cjava%dlang%dString" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500373">
                    <property name="value" nameId="tpee.1070475926801" value=" on disk." />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500374">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500375">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500376">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500377">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%dsaveGeneratedFilesOnDisk()%cvoid" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500378">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500379">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500380">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500878" resolveInfo="isInvokeTestsSet" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500381">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="7795897115019500382">
                <node role="expression" roleId="tpee.1079359253376" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7795897115019500383">
                  <node role="expression" roleId="tpee.1070534934092" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500384">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500179" resolveInfo="cycle" />
                  </node>
                  <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500385">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7795897115019499556" resolveInfo="TestGenerationWorker.ModelCycle" />
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500386">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499602" resolveInfo="isUserModel" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500387">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500388">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500389">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500410" resolveInfo="runTests" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500390">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500391">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500179" resolveInfo="cycle" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500392">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511549" resolveInfo="getClassPath" />
                  </node>
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500393">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500394">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500255" resolveInfo="outputModels" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500395">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500396">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500397">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499680" resolveInfo="myGenerationHandler" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500398">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~DiffGenerationHandler%dclean()%cvoid" />
            </node>
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
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500406">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500407">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500408">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500409">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dSAVE_ON_DISK" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500410">
      <property name="name" nameId="tpck.1169194664001" value="runTests" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500411" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500412" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500413">
        <property name="name" nameId="tpck.1169194664001" value="moduleClassPath" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500414">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500415">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500416">
        <property name="name" nameId="tpck.1169194664001" value="handler" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500417">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pi7p.~DiffGenerationHandler" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500418">
        <property name="name" nameId="tpck.1169194664001" value="outputModels" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500419">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500420">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModel" />
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500421">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500422">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500423">
            <property name="name" nameId="tpck.1169194664001" value="testClassesNames" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500424">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500425">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500426">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500664" resolveInfo="getTestClassesNames" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500427">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500416" resolveInfo="handler" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500428">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500418" resolveInfo="outputModels" />
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500429">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500604" resolveInfo="createClassLoader" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500430">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500413" resolveInfo="moduleClassPath" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500431">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500432">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500433">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500423" resolveInfo="testClassesNames" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500434">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500435">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500436" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500437">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500438">
            <property name="name" nameId="tpck.1169194664001" value="commandLine" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500439">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500440">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500441">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500442">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500443">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500444">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500445">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500446">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500447">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500448">
                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="3aty.~JavaEnvUtils" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3aty.~JavaEnvUtils%dgetJreExecutable(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500449">
                  <property name="value" nameId="tpee.1070475926801" value="java" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500450">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500451">
            <property name="name" nameId="tpck.1169194664001" value="classPaths" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500452">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500453">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500454">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500455">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;(java%dutil%dCollection)" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500456">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500457">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500413" resolveInfo="moduleClassPath" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500458">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500459">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500460">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500451" resolveInfo="classPaths" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500461">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500462">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500463">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500464">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500465">
                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkw3.~PathManager" />
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkw3.~PathManager%dgetResourceRoot(java%dlang%dClass,java%dlang%dString)%cjava%dlang%dString" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500466">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dgetClass()%cjava%dlang%dClass" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500467">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500468">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500469">
                            <property name="value" nameId="tpee.1070475926801" value="/" />
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500470">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500471">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500472">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dgetClass()%cjava%dlang%dClass" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500473">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetName()%cjava%dlang%dString" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500474">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dreplace(char,char)%cjava%dlang%dString" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CharConstant" typeId="tpee.1200397529627" id="7795897115019500475">
                                <property name="charConstant" nameId="tpee.1200397540847" value="." />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CharConstant" typeId="tpee.1200397529627" id="7795897115019500476">
                                <property name="charConstant" nameId="tpee.1200397540847" value="/" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500477">
                          <property name="value" nameId="tpee.1070475926801" value=".class" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500478">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsoluteFile()%cjava%dio%dFile" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500479">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500480">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500481">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500451" resolveInfo="classPaths" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500482">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500483">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500484">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%d&lt;init&gt;(java%dlang%dString)" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500485">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500486">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500487">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500488">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500489">
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500490">
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500491">
                                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="30pf.~PathManager" />
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~PathManager%dgetHomePath()%cjava%dlang%dString" />
                              </node>
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500492">
                                <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" />
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparator" />
                              </node>
                            </node>
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500493">
                              <property name="value" nameId="tpee.1070475926801" value="lib" />
                            </node>
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500494">
                            <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" />
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparator" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500495">
                          <property name="value" nameId="tpee.1070475926801" value="junit4" />
                        </node>
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500496">
                        <link role="classifier" roleId="tpee.1144433057691" targetNodeId="fxg7.~File" />
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="fxg7.~File%dseparator" />
                      </node>
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500497">
                      <property name="value" nameId="tpee.1070475926801" value="junit-4.8.2.jar" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500498">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500499">
            <property name="name" nameId="tpck.1169194664001" value="sb" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500500">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500501">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500502">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500503">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500504">
            <property name="name" nameId="tpck.1169194664001" value="pathSeparator" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500505">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500506">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~System" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~System%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500507">
                <property name="value" nameId="tpee.1070475926801" value="path.separator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500508">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500509">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500451" resolveInfo="classPaths" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500510">
            <property name="name" nameId="tpck.1169194664001" value="cp" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500511">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500512">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500513">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500514">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500515">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500499" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500516">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500517">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500504" resolveInfo="pathSeparator" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500518">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500519">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500520">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500499" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500521">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500522">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500523">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500510" resolveInfo="cp" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500524">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500525">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500526">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500527">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500528">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500529">
                <property name="value" nameId="tpee.1070475926801" value="-classpath" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500530">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500531">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500532">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500533">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500534">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500535">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500499" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500536">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dtoString()%cjava%dlang%dString" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500537">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500538">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500539">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500540">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500541">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7795897115019500542">
                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="s1zt.~UnitTestRunner" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500543">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetCanonicalName()%cjava%dlang%dString" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500544">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500545">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500423" resolveInfo="testClassesNames" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500546">
            <property name="name" nameId="tpck.1169194664001" value="testClassName" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500547">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500548">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500549">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500550">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500551">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500552">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500553">
                    <property name="value" nameId="tpee.1070475926801" value="-c" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500554">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500555">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500556">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500557">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500558">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500546" resolveInfo="testClassName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500559">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500560">
            <property name="name" nameId="tpck.1169194664001" value="builder" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500561">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ProcessBuilder" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500562">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500563">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~ProcessBuilder%d&lt;init&gt;(java%dutil%dList)" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500564">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500438" resolveInfo="commandLine" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019500565">
          <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019500566">
            <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500567">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500568">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500569">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dlog(java%dlang%dThrowable)%cvoid" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500570">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500571" resolveInfo="e" />
                  </node>
                </node>
              </node>
            </node>
            <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500571">
              <property name="name" nameId="tpck.1169194664001" value="e" />
              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500572">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~IOException" />
              </node>
            </node>
          </node>
          <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500573">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500574">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500575">
                <property name="name" nameId="tpck.1169194664001" value="process" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500576">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Process" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500577">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500578">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500560" resolveInfo="builder" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500579">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~ProcessBuilder%dstart()%cjava%dlang%dProcess" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500580">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500581">
                <property name="name" nameId="tpck.1169194664001" value="reader" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500582">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="s1zt.~UnitTestOutputReader" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500583">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500584">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="s1zt.~UnitTestOutputReader%d&lt;init&gt;(java%dlang%dProcess,jetbrains%dmps%dbuild%dant%dgeneration%dunittest%dUnitTestListener)" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500585">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500575" resolveInfo="process" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500586">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500587">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499632" resolveInfo="TestGenerationWorker.MyUnitTestAdapter" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500588">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500589">
                <property name="name" nameId="tpck.1169194664001" value="result" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="7795897115019500590" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500591">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500592">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500581" resolveInfo="reader" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500593">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="s1zt.~UnitTestOutputReader%dstart()%cint" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500594">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019500595">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500596">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500589" resolveInfo="result" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019500597">
                  <property name="value" nameId="tpee.1068580320021" value="0" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500598">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500599">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500600">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%derror(java%dlang%dString)%cvoid" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500601">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500602">
                        <property name="value" nameId="tpee.1070475926801" value="Process Exited With Code " />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500603">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500589" resolveInfo="result" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500604">
      <property name="name" nameId="tpck.1169194664001" value="createClassLoader" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500605" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500606">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500607">
        <property name="name" nameId="tpck.1169194664001" value="files" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500608">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500609">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500610">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500611">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500612">
            <property name="name" nameId="tpck.1169194664001" value="classPath" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500613">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500614">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~URL" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500615">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500616">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500617">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~URL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500618">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500619">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500607" resolveInfo="files" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500620">
            <property name="name" nameId="tpck.1169194664001" value="f" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500621">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="fxg7.~File" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500622">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019500623">
              <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019500624">
                <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500625">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500626">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500627">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dlog(java%dlang%dThrowable)%cvoid" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500628">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500629" resolveInfo="e" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500629">
                  <property name="name" nameId="tpck.1169194664001" value="e" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500630">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~MalformedURLException" />
                  </node>
                </node>
              </node>
              <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500631">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500632">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500633">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500634">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500612" resolveInfo="classPath" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500635">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500636">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500637">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="22fg.~URL%d&lt;init&gt;(java%dlang%dString)" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500638">
                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019500639">
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500640">
                                <property name="value" nameId="tpee.1070475926801" value="file:///" />
                              </node>
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500641">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500642">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500620" resolveInfo="f" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500643">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%dgetAbsolutePath()%cjava%dlang%dString" />
                                </node>
                              </node>
                            </node>
                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="7795897115019500644">
                              <node role="expression" roleId="tpee.1079359253376" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="7795897115019500645">
                                <node role="condition" roleId="tpee.1163668914799" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500646">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500647">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500620" resolveInfo="f" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500648">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="fxg7.~File%disDirectory()%cboolean" />
                                  </node>
                                </node>
                                <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500649">
                                  <property name="value" nameId="tpee.1070475926801" value="/" />
                                </node>
                                <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500650">
                                  <property name="value" nameId="tpee.1070475926801" value="" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500651">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500652">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500653">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="22fg.~URLClassLoader%d&lt;init&gt;(java%dnet%dURL[])" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500654">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500655">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500612" resolveInfo="classPath" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500656">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dtoArray(java%dlang%dObject[])%cjava%dlang%dObject[]" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500657">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ArrayCreator" typeId="tpee.1184950988562" id="7795897115019500658">
                      <node role="dimensionExpression" roleId="tpee.1184952969026" type="tpee.DimensionExpression" typeId="tpee.1184952934362" id="7795897115019500659">
                        <node role="expression" roleId="tpee.1184953288404" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500660">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500661">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500612" resolveInfo="classPath" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500662">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dsize()%cint" />
                          </node>
                        </node>
                      </node>
                      <node role="componentType" roleId="tpee.1184951007469" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500663">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="22fg.~URL" resolveInfo="URL" />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500664">
      <property name="name" nameId="tpck.1169194664001" value="getTestClassesNames" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500665" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500666">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500667">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500668">
        <property name="name" nameId="tpck.1169194664001" value="generationHandler" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500669">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pi7p.~DiffGenerationHandler" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500670">
        <property name="name" nameId="tpck.1169194664001" value="outputModels" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500671">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500672">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModel" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500673">
        <property name="name" nameId="tpck.1169194664001" value="baseClassLoader" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500674">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500675">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500676">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500677">
            <property name="name" nameId="tpck.1169194664001" value="testClasses" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500678">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500679">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500680">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500681">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500682">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500683">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500684">
            <property name="name" nameId="tpck.1169194664001" value="nodeCond" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500685">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="30pf.~Condition" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500686">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500687">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500688">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500689">
                  <property name="name" nameId="tpck.1169194664001" value="" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="30pf.~Condition" resolveInfo="Condition" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                  <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500690">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" resolveInfo="SNode" />
                  </node>
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500691">
                    <property name="name" nameId="tpck.1169194664001" value="met" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500692" />
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500693" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500694">
                      <property name="name" nameId="tpck.1169194664001" value="node" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500695">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" />
                      </node>
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501625">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501626">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501627">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501628">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500694" resolveInfo="node" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501629">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SNode%disInstanceOfConcept(java%dlang%dString)%cboolean" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501630">
                              <link role="classifier" roleId="tpee.1144433057691" targetNodeId="nupp.~ClassConcept" />
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="nupp.~ClassConcept%dconcept" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500696">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500697">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500670" resolveInfo="outputModels" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500698">
            <property name="name" nameId="tpck.1169194664001" value="model" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500699">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModel" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500700">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500701">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500702">
                <property name="name" nameId="tpck.1169194664001" value="iterable" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500703">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Iterable" />
                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500704">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" />
                  </node>
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500705">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500706">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="30pf.~ConditionalIterable%d&lt;init&gt;(java%dlang%dIterable,jetbrains%dmps%dutil%dCondition)" />
                    <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500707">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500708">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500709">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500698" resolveInfo="model" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500710">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModel%droots()%cjava%dlang%dIterable" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500711">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500684" resolveInfo="nodeCond" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500712">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500713">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500702" resolveInfo="iterable" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500714">
                <property name="name" nameId="tpck.1169194664001" value="outputRoot" />
                <property name="isFinal" nameId="tpee.1176718929932" value="true" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500715">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SNode" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500716">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500717">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7795897115019500718">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500719">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500673" resolveInfo="baseClassLoader" />
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019500720" />
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500721">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500722">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500723">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500724">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500725">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500698" resolveInfo="model" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500726">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dgetClass()%cjava%dlang%dClass" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500727">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetClassLoader()%cjava%dlang%dClassLoader" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500728">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500729">
                    <property name="name" nameId="tpck.1169194664001" value="classLoader" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500730">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ClassLoader" />
                    </node>
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500731">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500732">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500733">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500668" resolveInfo="generationHandler" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500734">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="pi7p.~InMemoryJavaGenerationHandler%dgetCompiler()%cjetbrains%dmps%dcompiler%dJavaCompiler" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500735">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="iqnk.~JavaCompiler%dgetClassLoader(java%dlang%dClassLoader)%cjava%dlang%dClassLoader" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500736">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500673" resolveInfo="baseClassLoader" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019500737">
                  <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019500738">
                    <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500739" />
                    <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500740">
                      <property name="name" nameId="tpck.1169194664001" value="ignored" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500741">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~ExceptionInInitializerError" />
                      </node>
                    </node>
                  </node>
                  <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019500742">
                    <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500743">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500744">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500745">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dlog(java%dlang%dThrowable)%cvoid" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500746">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500747" resolveInfo="throwable" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500747">
                      <property name="name" nameId="tpck.1169194664001" value="throwable" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500748">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Throwable" />
                      </node>
                    </node>
                  </node>
                  <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500749">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500750">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500751">
                        <property name="name" nameId="tpck.1169194664001" value="className" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500752">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500753">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500754">
                            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" />
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500755">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(com%dintellij%dopenapi%dutil%dComputable)%cjava%dlang%dObject" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500756">
                              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500757">
                                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500758">
                                  <property name="name" nameId="tpck.1169194664001" value="" />
                                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="8a0f.~Computable" resolveInfo="Computable" />
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                                  <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500759">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" resolveInfo="String" />
                                  </node>
                                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500760">
                                    <property name="name" nameId="tpck.1169194664001" value="compute" />
                                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500761" />
                                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500762">
                                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                                    </node>
                                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501631">
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501632">
                                        <node role="expression" roleId="tpee.1068581517676" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501633">
                                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501634">
                                            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501635">
                                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501636">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500698" resolveInfo="model" />
                                              </node>
                                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501637">
                                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModel%dgetLongName()%cjava%dlang%dString" />
                                              </node>
                                            </node>
                                            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501638">
                                              <property name="value" nameId="tpee.1070475926801" value="." />
                                            </node>
                                          </node>
                                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501639">
                                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501640">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500714" resolveInfo="outputRoot" />
                                            </node>
                                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501641">
                                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SNode%dgetName()%cjava%dlang%dString" />
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
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500763">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500764">
                        <property name="name" nameId="tpck.1169194664001" value="testClass" />
                        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500765">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Class" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500766">
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Class" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dforName(java%dlang%dString,boolean,java%dlang%dClassLoader)%cjava%dlang%dClass" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500767">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500751" resolveInfo="className" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500768">
                            <property name="value" nameId="tpee.1068580123138" value="true" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500769">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500729" resolveInfo="classLoader" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500770">
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="7795897115019500771">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500772">
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="xqpa.~Modifier" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Modifier%disAbstract(int)%cboolean" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500773">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500774">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500775">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetModifiers()%cint" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500776">
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="xqpa.~Modifier" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Modifier%disInterface(int)%cboolean" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500777">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500778">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500779">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetModifiers()%cint" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500780">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ContinueStatement" typeId="tpee.1082113931046" id="7795897115019500781" />
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500782">
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500783">
                        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="xqpa.~Modifier" />
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Modifier%disPrivate(int)%cboolean" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500784">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500785">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500786">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetModifiers()%cint" />
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500787">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ContinueStatement" typeId="tpee.1082113931046" id="7795897115019500788" />
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500789">
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019500790">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500791">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500792">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500793">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetAnnotation(java%dlang%dClass)%cjava%dlang%dannotation%dAnnotation" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500794">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500795">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500729" resolveInfo="classLoader" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500796">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~ClassLoader%dloadClass(java%dlang%dString)%cjava%dlang%dClass" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500797">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7795897115019500798">
                                    <link role="classifier" roleId="tpee.1116615189566" targetNodeId="gnpi.~MPSLaunch" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500799">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetName()%cjava%dlang%dString" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019500800" />
                      </node>
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500801">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ContinueStatement" typeId="tpee.1082113931046" id="7795897115019500802" />
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500803">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500804">
                        <property name="name" nameId="tpck.1169194664001" value="testCaseClass" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500805">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Class" />
                          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6858832557317064160">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pqw3.~TestCase" resolveInfo="TestCase" />
                          </node>
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7795897115019500807">
                          <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500808">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500809">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500729" resolveInfo="classLoader" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500810">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~ClassLoader%dloadClass(java%dlang%dString)%cjava%dlang%dClass" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6858832557317064164">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="6858832557317064163">
                                  <link role="classifier" roleId="tpee.1116615189566" targetNodeId="pqw3.~TestCase" resolveInfo="TestCase" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6858832557317064168">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetName()%cjava%dlang%dString" resolveInfo="getName" />
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500814">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~Class" />
                            <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6858832557317064158">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="pqw3.~TestCase" resolveInfo="TestCase" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500816">
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500817">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500818">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500804" resolveInfo="testCaseClass" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500819">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%disAssignableFrom(java%dlang%dClass)%cboolean" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500820">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500821">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500822">
                          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500823">
                            <property name="name" nameId="tpck.1169194664001" value="hasTestMethods" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019500824" />
                            <node role="initializer" roleId="tpee.1068431790190" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500825" />
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500826">
                          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500827">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500828">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500764" resolveInfo="testClass" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500829">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Class%dgetDeclaredMethods()%cjava%dlang%dreflect%dMethod[]" />
                            </node>
                          </node>
                          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500830">
                            <property name="name" nameId="tpck.1169194664001" value="m" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500831">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="xqpa.~Method" />
                            </node>
                          </node>
                          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500832">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500833">
                              <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500834">
                                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500835">
                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019500836">
                                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500837">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500838">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500839">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500830" resolveInfo="m" />
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500840">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Method%dgetName()%cjava%dlang%dString" />
                                        </node>
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500841">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%dstartsWith(java%dlang%dString)%cboolean" />
                                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019500842">
                                          <property name="value" nameId="tpee.1070475926801" value="test" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500843">
                                      <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="xqpa.~Modifier" />
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Modifier%disPublic(int)%cboolean" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500844">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500845">
                                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500830" resolveInfo="m" />
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500846">
                                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Method%dgetModifiers()%cint" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="7795897115019500847">
                                    <node role="expression" roleId="tpee.1079359253376" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7795897115019500848">
                                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500849">
                                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500850">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500851">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500830" resolveInfo="m" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500852">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Method%dgetParameterTypes()%cjava%dlang%dClass[]" />
                                          </node>
                                        </node>
                                        <node role="operation" roleId="tpee.1197027833540" type="tpee.ArrayLengthOperation" typeId="tpee.1208890769693" id="7795897115019500853" />
                                      </node>
                                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019500854">
                                        <property name="value" nameId="tpee.1068580320021" value="0" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500855">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500856">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500857">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500830" resolveInfo="m" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500858">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="xqpa.~Method%dgetReturnType()%cjava%dlang%dClass" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500859">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%dequals(java%dlang%dObject)%cboolean" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PrimitiveClassExpression" typeId="tpee.4564374268190696673" id="7795897115019500860">
                                      <node role="primitiveType" roleId="tpee.4564374268190696674" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500861" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500862">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500863">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019500864">
                                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500865">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500823" resolveInfo="hasTestMethods" />
                                    </node>
                                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019500866">
                                      <property name="value" nameId="tpee.1068580123138" value="true" />
                                    </node>
                                  </node>
                                </node>
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.BreakStatement" typeId="tpee.1081855346303" id="7795897115019500867" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019500868">
                          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500869">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500823" resolveInfo="hasTestMethods" />
                          </node>
                          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500870">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500871">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500872">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500873">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500677" resolveInfo="testClasses" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500874">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500875">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500751" resolveInfo="className" />
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
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500876">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500877">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500677" resolveInfo="testClasses" />
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
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500885">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500886">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500887">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500888">
                    <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dINVOKE_TESTS" />
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
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500896">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019500897">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500898">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019500899">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~GenerateTask" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~GenerateTask%dCOMPILE" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500900">
      <property name="name" nameId="tpck.1169194664001" value="computeGenerationOrder" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999511886" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500902">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999519179">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="TestGenerationWorker.Cycle" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500904">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500905">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500906">
        <property name="name" nameId="tpck.1169194664001" value="go" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500907">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c123.~MpsWorker$ObjectsToProcess" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500908">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500909">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500910">
            <property name="name" nameId="tpck.1169194664001" value="cycles" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500911">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999519181">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="TestGenerationWorker.Cycle" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500913">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500914">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999519184">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7874190907999511537" resolveInfo="TestGenerationWorker.Cycle" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500916">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500917">
            <property name="name" nameId="tpck.1169194664001" value="moduleToModels" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500918">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" />
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500919">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
              </node>
              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500920">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500921">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
                </node>
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500922">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500923">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~LinkedHashMap%d&lt;init&gt;()" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500924">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
                </node>
                <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500925">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500926">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500927">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019500928">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511897" resolveInfo="extractModels" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500929">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500930">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500906" resolveInfo="go" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500931">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetProjects()%cjava%dutil%dSet" />
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500932">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500933">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500906" resolveInfo="go" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500934">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModules()%cjava%dutil%dSet" />
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500935">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500936">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500906" resolveInfo="go" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500937">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker$ObjectsToProcess%dgetModels()%cjava%dutil%dSet" />
              </node>
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7795897115019500938">
              <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500939">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500917" resolveInfo="moduleToModels" />
              </node>
              <node role="type" roleId="tpee.1070534934091" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500940">
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500941">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500942">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500943">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500917" resolveInfo="moduleToModels" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500944">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dkeySet()%cjava%dutil%dSet" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500945">
            <property name="name" nameId="tpck.1169194664001" value="module" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500946">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500947">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019500948">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500949">
                <property name="name" nameId="tpck.1169194664001" value="modelsForModule" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500950">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500951">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
                  </node>
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500952">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500953">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500917" resolveInfo="moduleToModels" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500954">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500955">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500945" resolveInfo="module" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019500956">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500957">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500949" resolveInfo="modelsForModule" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019500958">
                <property name="name" nameId="tpck.1169194664001" value="smodel" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500959">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="aoly.~EditableSModelDescriptor" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500960">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500961">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500962">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500963">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500910" resolveInfo="cycles" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500964">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500965">
                        <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019500966">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019499568" resolveInfo="TestGenerationWorker.ModelCycle" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500967">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500958" resolveInfo="smodel" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500968">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500945" resolveInfo="module" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019500969">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500904" resolveInfo="project" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019500970">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019500971">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500910" resolveInfo="cycles" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511897">
      <property name="name" nameId="tpck.1169194664001" value="extractModels" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999512019" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999511899" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511900">
        <property name="name" nameId="tpck.1169194664001" value="projects" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511901">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" resolveInfo="Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511902">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511903">
        <property name="name" nameId="tpck.1169194664001" value="modules" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511904">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" resolveInfo="Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511905">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511906">
        <property name="name" nameId="tpck.1169194664001" value="models" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511907">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" resolveInfo="Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511908">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999511909">
        <property name="name" nameId="tpck.1169194664001" value="moduleToModels" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511910">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Map" resolveInfo="Map" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511911">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
          </node>
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511912">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
            <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511913">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
          </node>
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511914">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511915">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511916">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511900" resolveInfo="projects" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511917">
            <property name="name" nameId="tpck.1169194664001" value="mpsProject" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511918">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511919">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511920">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511921">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7795897115019500973" resolveInfo="extractModels" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511922">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511906" resolveInfo="models" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511923">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511917" resolveInfo="mpsProject" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511924">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511925">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511903" resolveInfo="modules" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511926">
            <property name="name" nameId="tpck.1169194664001" value="m" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511927">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511928">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511929">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511930">
                <property name="name" nameId="tpck.1169194664001" value="modelsList" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511931">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511932">
                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                  </node>
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511933">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511934">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
                    <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511935">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511936">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511937">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511938">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511909" resolveInfo="moduleToModels" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511939">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dput(java%dlang%dObject,java%dlang%dObject)%cjava%dlang%dObject" resolveInfo="put" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511940">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511926" resolveInfo="m" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511941">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511930" resolveInfo="modelsList" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511942">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999511943">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dextractModels(java%dutil%dCollection,jetbrains%dmps%dproject%dIModule)%cvoid" resolveInfo="extractModels" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511944">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511930" resolveInfo="modelsList" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511945">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511926" resolveInfo="m" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7874190907999511946">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511947">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511906" resolveInfo="models" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511948">
            <property name="name" nameId="tpck.1169194664001" value="model" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511949">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511950">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.AssertStatement" typeId="tpee.1160998861373" id="7874190907999511951">
              <node role="condition" roleId="tpee.1160998896846" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7874190907999511952">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511953">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511948" resolveInfo="model" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511954" />
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511955">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511956">
                <property name="name" nameId="tpck.1169194664001" value="owningModule" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511957">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511958">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999511959">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" resolveInfo="ModelAccess" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511960">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(com%dintellij%dopenapi%dutil%dComputable)%cjava%dlang%dObject" resolveInfo="runReadAction" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511961">
                      <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7874190907999511962">
                        <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7874190907999511963">
                          <property name="name" nameId="tpck.1169194664001" value="" />
                          <link role="classifier" roleId="tpee.1170346070688" targetNodeId="8a0f.~Computable" resolveInfo="Computable" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                          <node role="typeParameter" roleId="tpee.1201186121363" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511964">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                          </node>
                          <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999511965">
                            <property name="name" nameId="tpck.1169194664001" value="compute" />
                            <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999511966" />
                            <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511967">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~IModule" resolveInfo="IModule" />
                            </node>
                            <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511968">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999511969">
                                <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511970">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511971">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511948" resolveInfo="model" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511972">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModelDescriptor%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
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
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999511973">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7874190907999511974">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511975">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511956" resolveInfo="owningModule" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511976" />
              </node>
              <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7874190907999511977">
                <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511978">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999511979">
                    <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999511980">
                      <property name="name" nameId="tpck.1169194664001" value="modelsList" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511981">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" resolveInfo="List" />
                        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511982">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                        </node>
                      </node>
                      <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511983">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999511984">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511909" resolveInfo="moduleToModels" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999511985">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" resolveInfo="get" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511986">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511956" resolveInfo="owningModule" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999511987">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7874190907999511988">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511989">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511980" resolveInfo="modelsList" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999511990" />
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999511991">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511992">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999511993">
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999511994">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511980" resolveInfo="modelsList" />
                          </node>
                          <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999511995">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999511996">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~ArrayList%d&lt;init&gt;()" resolveInfo="ArrayList" />
                              <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999511997">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999511998">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999511999">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999512000">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511909" resolveInfo="moduleToModels" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999512001">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dput(java%dlang%dObject,java%dlang%dObject)%cjava%dlang%dObject" resolveInfo="put" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999512002">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511956" resolveInfo="owningModule" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999512003">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511980" resolveInfo="modelsList" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999512004">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999512005">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999512006">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511980" resolveInfo="modelsList" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999512007">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999512008">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511948" resolveInfo="model" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999512009">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999512010">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999512011">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dwarning(java%dlang%dString)%cvoid" resolveInfo="warning" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999512012">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999512013">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999512014">
                          <property name="value" nameId="tpee.1070475926801" value="Model " />
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999512015">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999512016">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511948" resolveInfo="model" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999512017">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~SModelDescriptor%dgetLongName()%cjava%dlang%dString" resolveInfo="getLongName" />
                          </node>
                        </node>
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999512018">
                        <property name="value" nameId="tpee.1070475926801" value=" won't be generated because module for it can not be found." />
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
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500973">
      <property name="name" nameId="tpck.1169194664001" value="extractModels" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.ProtectedVisibility" typeId="tpee.1146644641414" id="7795897115019500974" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500975" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500976">
        <property name="name" nameId="tpck.1169194664001" value="modelDescriptors" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500977">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500978">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500979">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500980">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019500981">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019500982">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019500983">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019500984">
              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019500985">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunReadAction(java%dlang%dRunnable)%cvoid" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019500986">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7795897115019500987">
                  <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7795897115019500988">
                    <property name="name" nameId="tpck.1169194664001" value="" />
                    <link role="classifier" roleId="tpee.1170346070688" targetNodeId="e2lb.~Runnable" resolveInfo="Runnable" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" />
                    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500989">
                      <property name="name" nameId="tpck.1169194664001" value="run" />
                      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7795897115019500990" />
                      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7795897115019500991" />
                      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501642">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501643">
                          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501644">
                            <property name="name" nameId="tpck.1169194664001" value="testConfigurationList" />
                            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501645">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                              <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501646">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7tx.~BaseTestConfiguration" />
                              </node>
                            </node>
                            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501647">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501648">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501649">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501650">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProjectDescriptor()%cjetbrains%dmps%dproject%dstructure%dproject%dProjectDescriptor" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501651">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jwig.~ProjectDescriptor%dgetTestConfigurations()%cjava%dutil%dList" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501652">
                          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501653">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501654">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501644" resolveInfo="testConfigurationList" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501655">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%disEmpty()%cboolean" />
                            </node>
                          </node>
                          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019501656">
                            <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501657">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501658">
                                <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501659">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501644" resolveInfo="testConfigurationList" />
                                </node>
                                <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501660">
                                  <property name="name" nameId="tpck.1169194664001" value="config" />
                                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501661">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7tx.~BaseTestConfiguration" />
                                  </node>
                                </node>
                                <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501662">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.TryCatchStatement" typeId="tpee.1164879751025" id="7795897115019501663">
                                    <node role="catchClause" roleId="tpee.1164903496223" type="tpee.CatchClause" typeId="tpee.1164903280175" id="7795897115019501664">
                                      <node role="catchBody" roleId="tpee.1164903359218" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501665">
                                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501666">
                                          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501667">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dlog(java%dlang%dString,java%dlang%dThrowable)%cvoid" />
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501668">
                                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501669">
                                                <property name="value" nameId="tpee.1070475926801" value="Error while reading configuration of project " />
                                              </node>
                                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501670">
                                                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501671">
                                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501672">
                                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
                                                  </node>
                                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501673">
                                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" />
                                                  </node>
                                                </node>
                                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501674">
                                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="27v0.~Project%dgetName()%cjava%dlang%dString" />
                                                </node>
                                              </node>
                                            </node>
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501675">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501676" resolveInfo="e" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="throwable" roleId="tpee.1164903359217" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501676">
                                        <property name="name" nameId="tpck.1169194664001" value="e" />
                                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501677">
                                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="7tx.~IllegalGeneratorConfigurationException" />
                                        </node>
                                      </node>
                                    </node>
                                    <node role="body" roleId="tpee.1164879758292" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501678">
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501679">
                                        <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501680">
                                          <property name="name" nameId="tpck.1169194664001" value="genParams" />
                                          <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501681">
                                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="h5ia.~GenParameters" />
                                          </node>
                                          <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501682">
                                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501683">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501660" resolveInfo="config" />
                                            </node>
                                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501684">
                                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7tx.~BaseTestConfiguration%dgetGenParams(com%dintellij%dopenapi%dproject%dProject,boolean)%cjetbrains%dmps%dgenerator%dGenParameters" />
                                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501685">
                                                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501686">
                                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
                                                </node>
                                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501687">
                                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" />
                                                </node>
                                              </node>
                                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501688">
                                                <property name="value" nameId="tpee.1068580123138" value="true" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501689">
                                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501690">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501691">
                                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500976" resolveInfo="modelDescriptors" />
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501692">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Set%daddAll(java%dutil%dCollection)%cboolean" />
                                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501693">
                                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501694">
                                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501680" resolveInfo="genParams" />
                                              </node>
                                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501695">
                                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="h5ia.~GenParameters%dgetModelDescriptors()%cjava%dutil%dList" />
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
                          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501696">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501697">
                              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501698">
                                <property name="name" nameId="tpck.1169194664001" value="properties" />
                                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501699">
                                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
                                  <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501700">
                                    <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                                  </node>
                                </node>
                                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501701">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501702">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501703">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501704">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetMPSProjectFiles()%cjava%dutil%dMap" />
                                    </node>
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501705">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~Map%dget(java%dlang%dObject)%cjava%dlang%dObject" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501706">
                                      <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501707">
                                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
                                      </node>
                                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501708">
                                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProjectFile()%cjava%dio%dFile" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501709">
                              <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019501710">
                                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019501711">
                                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501712">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501698" resolveInfo="properties" />
                                  </node>
                                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501713" />
                                </node>
                                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501714">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501715">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501698" resolveInfo="properties" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501716">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dcontains(java%dlang%dObject)%cboolean" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501717">
                                      <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dWHOLE_PROJECT" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="7795897115019501718">
                                <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501719">
                                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501720">
                                    <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7795897115019501721">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dwarning(java%dlang%dString)%cvoid" />
                                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7795897115019501722">
                                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501723">
                                          <property name="value" nameId="tpee.1070475926801" value="No test configurations for project " />
                                        </node>
                                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501724">
                                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501725">
                                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501726">
                                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
                                            </node>
                                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501727">
                                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="afxk.~MPSProject%dgetProjectDescriptor()%cjetbrains%dmps%dproject%dstructure%dproject%dProjectDescriptor" />
                                            </node>
                                          </node>
                                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501728">
                                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jwig.~ProjectDescriptor%dgetName()%cjava%dlang%dString" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501729">
                                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6858832557317063263">
                                  <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="6858832557317063264">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="6858832557317063247" resolveInfo="superExtractModels" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6858832557317063265">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500976" resolveInfo="modelDescriptors" />
                                    </node>
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6858832557317063267">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500979" resolveInfo="project" />
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
          </node>
        </node>
      </node>
      <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019500992">
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="6858832557317063247">
      <property name="name" nameId="tpck.1169194664001" value="superExtractModels" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6858832557317063252">
        <property name="name" nameId="tpck.1169194664001" value="modelDescriptors" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6858832557317063253">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~Set" resolveInfo="Set" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6858832557317063254">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~SModelDescriptor" resolveInfo="SModelDescriptor" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6858832557317063255">
        <property name="name" nameId="tpck.1169194664001" value="project" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6858832557317063256">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="afxk.~MPSProject" resolveInfo="MPSProject" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="6858832557317063248" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="6858832557317063251" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6858832557317063250">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6858832557317063257">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.SuperMethodCall" typeId="tpee.1073063089578" id="6858832557317063258">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~MpsWorker%dextractModels(java%dutil%dSet,jetbrains%dmps%dproject%dMPSProject)%cvoid" resolveInfo="extractModels" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6858832557317063259">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6858832557317063252" resolveInfo="modelDescriptors" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6858832557317063261">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6858832557317063255" resolveInfo="project" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7795897115019500993">
      <property name="name" nameId="tpck.1169194664001" value="createDetailedReport" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7795897115019500994" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500995">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019500996">
        <property name="name" nameId="tpck.1169194664001" value="compilationResult" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500997">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019500998">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019500999">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7795897115019501000">
        <property name="name" nameId="tpck.1169194664001" value="diffReports" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501001">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="k7g3.~List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501002">
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
          </node>
        </node>
        <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7795897115019501003">
          <link role="annotation" roleId="tpee.1188208074048" targetNodeId="r27b.~NotNull" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501004">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501005">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501006">
            <property name="name" nameId="tpck.1169194664001" value="sb" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501007">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~StringBuffer" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501008">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501009">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%d&lt;init&gt;()" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501010">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019501011">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501012">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501013">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511884">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501015">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511854" resolveInfo="getGenerationErrors" />
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501016">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dsize()%cint" />
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019501017">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501018">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501019">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501020">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501021">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501022">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501023">
                    <property name="value" nameId="tpee.1070475926801" value="Generation Errors:\n" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501024">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501025">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999511885">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999511748" resolveInfo="myMessageHandler" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501027">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999511854" resolveInfo="getGenerationErrors" />
                </node>
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501028">
                <property name="name" nameId="tpck.1169194664001" value="e" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501029">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501030">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501031">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501032">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501033">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501034">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501035">
                        <property name="value" nameId="tpee.1070475926801" value="  " />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501036">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501037">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501038">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501039">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501040">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501028" resolveInfo="e" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501041">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501042">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501043">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501044">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501045">
                        <property name="value" nameId="tpee.1070475926801" value="\n" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501046">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501047">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501048">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501049">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501050">
                    <property name="value" nameId="tpee.1070475926801" value="\n" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7795897115019501051">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501052">
            <property name="name" nameId="tpck.1169194664001" value="headerPrinted" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7795897115019501053" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501054" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501055">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501056">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019500996" resolveInfo="compilationResult" />
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501057">
            <property name="name" nameId="tpck.1169194664001" value="r" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501058">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="apgw.~CompilationResult" />
            </node>
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501059">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501060">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.AndExpression" typeId="tpee.1080120340718" id="7795897115019501061">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7795897115019501062">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501063">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501064">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501057" resolveInfo="r" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501065">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="apgw.~CompilationResult%dgetErrors()%corg%declipse%djdt%dcore%dcompiler%dCategorizedProblem[]" />
                    </node>
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7795897115019501066" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019501067">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501068">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501069">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501070">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501057" resolveInfo="r" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501071">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="apgw.~CompilationResult%dgetErrors()%corg%declipse%djdt%dcore%dcompiler%dCategorizedProblem[]" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.ArrayLengthOperation" typeId="tpee.1208890769693" id="7795897115019501072" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019501073">
                    <property name="value" nameId="tpee.1068580320021" value="0" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501074">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501075">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7795897115019501076">
                    <node role="expression" roleId="tpee.1081516765348" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501077">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501052" resolveInfo="headerPrinted" />
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501078">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501079">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501080">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501081">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501082">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501083">
                            <property name="value" nameId="tpee.1070475926801" value="Compilation Problems:\n" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501084">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7795897115019501085">
                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501086">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501052" resolveInfo="headerPrinted" />
                        </node>
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7795897115019501087">
                          <property name="value" nameId="tpee.1068580123138" value="true" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501088">
                  <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501089">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501090">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501057" resolveInfo="r" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501091">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="apgw.~CompilationResult%dgetErrors()%corg%declipse%djdt%dcore%dcompiler%dCategorizedProblem[]" />
                    </node>
                  </node>
                  <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501092">
                    <property name="name" nameId="tpck.1169194664001" value="p" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501093">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="c1qm.~CategorizedProblem" />
                    </node>
                  </node>
                  <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501094">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501095">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501096">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501097">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501098">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501099">
                            <property name="value" nameId="tpee.1070475926801" value="  " />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501100">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501101">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501102">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501103">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501104">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501105">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~String%d&lt;init&gt;(char[])" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501106">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501107">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501108">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501057" resolveInfo="r" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501109">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="apgw.~CompilationResult%dgetCompilationUnit()%corg%declipse%djdt%dinternal%dcompiler%denv%dICompilationUnit" />
                                  </node>
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501110">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7tyn.~IDependent%dgetFileName()%cchar[]" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501111">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501112">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501113">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501114">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501115">
                            <property name="value" nameId="tpee.1070475926801" value=" (" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501116">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501117">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501118">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501119">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(int)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501120">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501121">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501092" resolveInfo="p" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501122">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c1qm.~IProblem%dgetSourceLineNumber()%cint" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501123">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501124">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501125">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501126">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501127">
                            <property name="value" nameId="tpee.1070475926801" value="): " />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501128">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501129">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501130">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501131">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501132">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501133">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501092" resolveInfo="p" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501134">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c1qm.~IProblem%dgetMessage()%cjava%dlang%dString" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501135">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501136">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501137">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501138">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501139">
                            <property name="value" nameId="tpee.1070475926801" value="\n" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501140">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501141">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501052" resolveInfo="headerPrinted" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501142">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501143">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501144">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501145">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501146">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501147">
                    <property name="value" nameId="tpee.1070475926801" value="\n" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501148">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7795897115019501149">
            <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="e2lb.~Boolean" />
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Boolean%dparseBoolean(java%dlang%dString)%cboolean" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501150">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501151">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501152">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetProperty(java%dlang%dString)%cjava%dlang%dString" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StaticFieldReference" typeId="tpee.1070533707846" id="7795897115019501153">
                  <link role="classifier" roleId="tpee.1144433057691" targetNodeId="22yz.~TestGenerationOnTeamcity" />
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="22yz.~TestGenerationOnTeamcity%dSHOW_DIFF" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501154">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7795897115019501155">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="7795897115019501156">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501157">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501158">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501000" resolveInfo="diffReports" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501159">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="k7g3.~List%dsize()%cint" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7795897115019501160">
                  <property name="value" nameId="tpee.1068580320021" value="0" />
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501161">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501162">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501163">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501164">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501165">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501166">
                        <property name="value" nameId="tpee.1070475926801" value="Difference:\n" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="7795897115019501167">
                  <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7795897115019501168">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501000" resolveInfo="diffReports" />
                  </node>
                  <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7795897115019501169">
                    <property name="name" nameId="tpck.1169194664001" value="diffReport" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7795897115019501170">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="e2lb.~String" />
                    </node>
                  </node>
                  <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501171">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501172">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501173">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501174">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501175">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501176">
                            <property name="value" nameId="tpee.1070475926801" value="  " />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501177">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501178">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501179">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501180">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501181">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501169" resolveInfo="diffReport" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501182">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501183">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501184">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501185">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501186">
                            <property name="value" nameId="tpee.1070475926801" value="\n" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7795897115019501187">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501188">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501189">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501190">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~StringBuffer%dappend(java%dlang%dString)%cjava%dlang%dStringBuffer" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7795897115019501191">
                        <property name="value" nameId="tpee.1070475926801" value="\n" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7795897115019501192">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7795897115019501193">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7795897115019501194">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019499668" resolveInfo="myBuildServerMessageFormat" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501195">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~IBuildServerMessageFormat%descapeBuildMessage(java%dlang%dStringBuffer)%cjava%dlang%dStringBuffer" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7795897115019501196">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7795897115019501006" resolveInfo="sb" />
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
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="c123.~MpsWorker%dmyWhatToDo" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7795897115019501206">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="c123.~WhatToDo%dgetFailOnError()%cboolean" />
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7795897115019501207">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="7795897115019501208">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7795897115019501209">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7795897115019501210">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="kp22.~BuildException%d&lt;init&gt;(java%dlang%dString)" />
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
        <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" />
      </node>
    </node>
  </root>
  <root id="7874190907999476498">
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="7874190907999486670">
      <property name="name" nameId="tpck.1169194664001" value="defaultMakeScript" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999486671" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999486672">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999486673">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999486674">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999486675">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999486676">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486677">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486678">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261979" resolveInfo="ScriptBuilder" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999486679">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261319" resolveInfo="withFacets" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486680">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486681">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657099" resolveInfo="IFacet.Name" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486682">
                        <property name="value" nameId="tpee.1070475926801" value="Binaries" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486683">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486684">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657099" resolveInfo="IFacet.Name" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486685">
                        <property name="value" nameId="tpee.1070475926801" value="Generate" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486686">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486687">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657099" resolveInfo="IFacet.Name" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486688">
                        <property name="value" nameId="tpee.1070475926801" value="TextGen" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486689">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486690">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657099" resolveInfo="IFacet.Name" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486691">
                        <property name="value" nameId="tpee.1070475926801" value="JavaCompile" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486692">
                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486693">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657099" resolveInfo="IFacet.Name" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486694">
                        <property name="value" nameId="tpee.1070475926801" value="Make" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999486695">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261392" resolveInfo="withFinalTarget" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999486696">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999486697">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657137" resolveInfo="ITarget.Name" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999486698">
                      <property name="value" nameId="tpee.1070475926801" value="make" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999486699">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1479818508463261441" resolveInfo="toScript" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999486700">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
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
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="tpee.1068581517665" type="tpee.SwitchStatement" typeId="tpee.1163670490218" id="7874190907999477597">
            <node role="case" roleId="tpee.1163670772911" type="tpee.SwitchCase" typeId="tpee.1163670641947" id="7874190907999477598">
              <node role="expression" roleId="tpee.1163670677455" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477599">
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527775" resolveInfo="ERROR" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477600">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477601">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477602">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477603">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527779" resolveInfo="WARNING" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477608">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477609">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477610">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477611">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dWARNING" resolveInfo="WARNING" />
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
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="i9so.7797884084018527756" resolveInfo="Severity" />
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="i9so.7797884084018527773" resolveInfo="INFO" />
              </node>
              <node role="body" roleId="tpee.1163670683720" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999477616">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999477617">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999477618">
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999477619">
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dINFORMATION" resolveInfo="INFORMATION" />
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
                    <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                    <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
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
                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~Message" resolveInfo="Message" />
              </node>
              <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999477634">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999477635">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
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
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%dsetException(java%dlang%dThrowable)%cvoid" resolveInfo="setException" />
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
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%dsetHintObject(java%dlang%dObject)%cvoid" resolveInfo="setHintObject" />
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
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
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
            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
          </node>
        </node>
      </node>
      <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999477674">
        <property name="name" nameId="tpck.1169194664001" value="handler" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999477675" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999477676">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
        </node>
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476499" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="7874190907999476500">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476501" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476502" />
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
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" resolveInfo="IOperationContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476518">
        <property name="name" nameId="tpck.1169194664001" value="messageHandler" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476519">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
        </node>
      </node>
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="7874190907999476520">
      <property name="name" nameId="tpck.1169194664001" value="context" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476521" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476522">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" resolveInfo="IOperationContext" />
      </node>
    </node>
    <node role="implementedInterface" roleId="tpee.1095933932569" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476523">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="xirj.~IMakeService" resolveInfo="IMakeService" />
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476529">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476530" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476531">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476532">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476533">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476534">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476525" resolveInfo="resources" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="8486843261567504736">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999486670" resolveInfo="defaultMakeScript" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999476536" />
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476542">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476543" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476544">
        <property name="name" nameId="tpck.1169194664001" value="script" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476545">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657227" resolveInfo="IScript" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476546">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476547">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476548">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476549">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476538" resolveInfo="resources" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476550">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476544" resolveInfo="script" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="8486843261567504738" />
          </node>
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476557">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476564">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476565">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476569" resolveInfo="doMake" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476566">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476553" resolveInfo="resources" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476567">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476559" resolveInfo="script" />
            </node>
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476568">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476561" resolveInfo="controller" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476569">
      <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
      <property name="name" nameId="tpck.1169194664001" value="doMake" />
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
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476574">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476575" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476576">
        <property name="name" nameId="tpck.1169194664001" value="script" />
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
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476594">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476595">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476596" />
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476597">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476682" resolveInfo="showError" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476598">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476589" resolveInfo="msg" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999476599">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476600">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476601">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4629164904928188012" resolveInfo="IResult.FAILURE" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999476602" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476606" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476607" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999476608">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476609">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476610">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476611">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476612" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476613">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476614">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476582" resolveInfo="scrName" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476615">
                    <property name="value" nameId="tpee.1070475926801" value=" failed" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476616">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476617">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476682" resolveInfo="showError" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476618">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476619">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476611" resolveInfo="msg" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476620">
                    <property name="value" nameId="tpee.1070475926801" value=". Invalid script." />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999476621">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476622">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476623">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4629164904928188012" resolveInfo="IResult.FAILURE" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999476624" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7874190907999476625">
            <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476626">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476627">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476576" resolveInfo="script" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476628">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6168415856807657228" resolveInfo="isValid" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476629" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476630">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476631">
            <property name="name" nameId="tpck.1169194664001" value="ctl" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476632">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476633" />
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476634">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476696" resolveInfo="completeController" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476635">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476578" resolveInfo="controller" />
                </node>
              </node>
            </node>
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476636">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476637">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476638">
            <property name="name" nameId="tpck.1169194664001" value="res" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476639">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.1291978361072214397" resolveInfo="IResult" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476640">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476641">
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476642">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476643">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476576" resolveInfo="script" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476644">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.8545022408569007101" resolveInfo="execute" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476645">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476631" resolveInfo="ctl" />
                </node>
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476646">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476570" resolveInfo="inputRes" />
                </node>
              </node>
            </node>
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476647">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476638" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476648" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999476649">
          <node role="elsifClauses" roleId="tpee.1206060520071" type="tpee.ElsifClause" typeId="tpee.1206060495898" id="7874190907999476650">
            <node role="condition" roleId="tpee.1206060619838" type="tpee.NotExpression" typeId="tpee.1081516740877" id="7874190907999476651">
              <node role="expression" roleId="tpee.1081516765348" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476652">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476653">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476638" resolveInfo="res" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476654">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1291978361072214431" resolveInfo="isSucessful" />
                </node>
              </node>
            </node>
            <node role="statementList" roleId="tpee.1206060644605" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476655">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476656">
                <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476657">
                  <property name="name" nameId="tpck.1169194664001" value="msg" />
                  <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476658" />
                  <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476659">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476660">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476582" resolveInfo="scrName" />
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476661">
                      <property name="value" nameId="tpee.1070475926801" value=" failed" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476662">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476663">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476682" resolveInfo="showError" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476664">
                    <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476665">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476657" resolveInfo="msg" />
                    </node>
                    <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476666">
                      <property name="value" nameId="tpee.1070475926801" value=". See previous messages for details." />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476667">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476668">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476669">
                <property name="name" nameId="tpck.1169194664001" value="msg" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476670" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="7874190907999476671">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476672">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476582" resolveInfo="scrName" />
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476673">
                    <property name="value" nameId="tpee.1070475926801" value=" aborted" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476674">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalInstanceMethodCall" typeId="tpee.3066917033203108594" id="7874190907999476675">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999476682" resolveInfo="showError" />
                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476676">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476669" resolveInfo="msg" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="7874190907999476677">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999476678" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476679">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476638" resolveInfo="res" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="7874190907999476680">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476681">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476638" resolveInfo="res" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476682">
      <property name="name" nameId="tpck.1169194664001" value="showError" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476683" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476684" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476685">
        <property name="name" nameId="tpck.1169194664001" value="msg" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="7874190907999476686" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476687">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476688">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476689">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999476690">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476915" resolveInfo="messageHandler" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476691">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~IMessageHandler%dhandle(jetbrains%dmps%dmessages%dIMessage)%cvoid" resolveInfo="handle" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476692">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476693">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="cfml.~Message%d&lt;init&gt;(jetbrains%dmps%dmessages%dMessageKind,java%dlang%dString)" resolveInfo="Message" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="7874190907999476694">
                    <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="cfml.~MessageKind" resolveInfo="MessageKind" />
                    <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="cfml.~MessageKind%dERROR" resolveInfo="ERROR" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476695">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476685" resolveInfo="msg" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476696">
      <property name="name" nameId="tpck.1169194664001" value="completeController" />
      <property name="isFinal" nameId="tpee.1181808852946" value="false" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="7874190907999476697" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476698">
        <property name="name" nameId="tpck.1169194664001" value="ctl" />
        <property name="isFinal" nameId="tpee.1176718929932" value="true" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476699">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476700">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476705">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476706">
            <property name="name" nameId="tpck.1169194664001" value="cmon" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476707">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476708">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7874190907999476709">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7874190907999476710">
                  <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.5646063728432307526" resolveInfo="IConfigMonitor.Stub" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.5646063728432307524" resolveInfo="IConfigMonitor.Stub" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476711" />
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476712">
                    <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                    <property name="name" nameId="tpck.1169194664001" value="relayQuery" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476713">
                      <property name="name" nameId="tpck.1169194664001" value="query" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476714">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8486446835277348318" resolveInfo="IQuery" />
                        <node role="parameter" roleId="tpee.1109201940907" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7874190907999476715">
                          <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7874190907999476717" resolveInfo="T" />
                        </node>
                      </node>
                    </node>
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476716" />
                    <node role="typeVariableDeclaration" roleId="tpee.1109279881614" type="tpee.TypeVariableDeclaration" typeId="tpee.1109279763828" id="7874190907999476717">
                      <property name="name" nameId="tpck.1169194664001" value="T" />
                      <node role="bound" roleId="tpee.1214996921760" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476718">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.2551169102353043399" resolveInfo="IOption" />
                      </node>
                    </node>
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.TypeVariableReference" typeId="tpee.1109283449304" id="7874190907999476719">
                      <link role="typeVariableDeclaration" roleId="tpee.1109283546497" targetNodeId="7874190907999476717" resolveInfo="T" />
                    </node>
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476720">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999530841">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999530843">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999530842">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476713" resolveInfo="query" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999530851">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.1048225073237482444" resolveInfo="defaultOption" />
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
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476746">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476747">
            <property name="name" nameId="tpck.1169194664001" value="jmon" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476748">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476749">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7874190907999476750">
                <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7874190907999476751">
                  <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                  <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.5646063728432307501" resolveInfo="IJobMonitor.Stub" />
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4691049906353704810" resolveInfo="IJobMonitor.Stub" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476752" />
                  <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476753">
                    <property name="name" nameId="tpck.1169194664001" value="reportFeedback" />
                    <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                    <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476754">
                      <property name="name" nameId="tpck.1169194664001" value="fdbk" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476755">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.7797884084018455875" resolveInfo="IFeedback" />
                      </node>
                    </node>
                    <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476756" />
                    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476757" />
                    <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476758">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476759">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476760">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476761">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476762">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999477662" resolveInfo="MessageFeedbackStrategy" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="7874190907999476763">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476915" resolveInfo="messageHandler" />
                              </node>
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476764">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7874190907999477590" resolveInfo="reportFeedback" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476765">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476754" resolveInfo="fdbk" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="annotation" roleId="tpee.1188208488637" type="tpee.AnnotationInstance" typeId="tpee.1188207840427" id="7874190907999476766">
                      <link role="annotation" roleId="tpee.1188208074048" targetNodeId="e2lb.~Override" resolveInfo="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476767" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476768">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476769">
            <property name="name" nameId="tpck.1169194664001" value="pind" />
            <property name="isFinal" nameId="tpee.1176718929932" value="true" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476770">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476771">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476772">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~EmptyProgressIndicator%d&lt;init&gt;()" resolveInfo="EmptyProgressIndicator" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476773">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476774">
            <node role="creator" roleId="tpee.1145553007750" type="tpee.AnonymousClassCreator" typeId="tpee.1182160077978" id="7874190907999476775">
              <node role="cls" roleId="tpee.1182160096073" type="tpee.AnonymousClass" typeId="tpee.1170345865475" id="7874190907999476776">
                <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="e2lb.~Object%d&lt;init&gt;()" resolveInfo="Object" />
                <link role="classifier" roleId="tpee.1170346070688" targetNodeId="i9so.4648565975300663454" resolveInfo="IScriptController" />
                <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476777" />
                <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476778">
                  <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                  <property name="name" nameId="tpck.1169194664001" value="runConfigWithMonitor" />
                  <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476779" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476780" />
                  <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476781">
                    <property name="name" nameId="tpck.1169194664001" value="code" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7874190907999476782">
                      <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476783" />
                      <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476784">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.8339029394034910088" resolveInfo="IConfigMonitor" />
                      </node>
                    </node>
                  </node>
                  <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476785">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476800">
                      <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="7874190907999476801">
                        <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476802">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476781" resolveInfo="code" />
                        </node>
                        <node role="parameter" roleId="tp2c.1235747002942" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476803">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476706" resolveInfo="cmon" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476820">
                  <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                  <property name="name" nameId="tpck.1169194664001" value="runJobWithMonitor" />
                  <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476821">
                    <property name="name" nameId="tpck.1169194664001" value="code" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7874190907999476822">
                      <node role="resultType" roleId="tp2c.1199542457201" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476823" />
                      <node role="parameterType" roleId="tp2c.1199542501692" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476824">
                        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6168415856807657250" resolveInfo="IJobMonitor" />
                      </node>
                    </node>
                  </node>
                  <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476825" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476826" />
                  <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476827">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476828">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476829">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="7874190907999476830">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dgetInstance()%ccom%dintellij%dide%dIdeEventQueue" resolveInfo="getInstance" />
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="7vsr.~IdeEventQueue" resolveInfo="IdeEventQueue" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476831">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="7vsr.~IdeEventQueue%dflushQueue()%cvoid" resolveInfo="flushQueue" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6168063615521845327">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6168063615521845328">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="6168063615521845329">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelAccess%dinstance()%cjetbrains%dmps%dsmodel%dModelAccess" resolveInfo="instance" />
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="lkfb.~ModelAccess" resolveInfo="ModelAccess" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6168063615521845330">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~ModelCommandExecutor%drunWriteActionWithProgressSynchronously(com%dintellij%dopenapi%dprogress%dProgressive,java%dlang%dString,boolean,com%dintellij%dopenapi%dproject%dProject)%cvoid" resolveInfo="runWriteActionWithProgressSynchronously" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="6168063615521845331">
                            <node role="parameter" roleId="tp2c.1199569906740" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6168063615521845332">
                              <property name="name" nameId="tpck.1169194664001" value="realInd" />
                              <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="6168063615521845333">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
                              </node>
                            </node>
                            <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="6168063615521845334">
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6168063615521845340">
                                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="6168063615521845341">
                                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6168063615521845342">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476769" resolveInfo="pind" />
                                  </node>
                                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="6168063615521853684">
                                    <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="6168063615521853686">
                                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i82i.~EmptyProgressIndicator%d&lt;init&gt;()" resolveInfo="EmptyProgressIndicator" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="6168063615521845346">
                                <node role="expression" roleId="tpee.1068580123156" type="tp2c.CompactInvokeFunctionExpression" typeId="tp2c.1235746970280" id="6168063615521845347">
                                  <node role="parameter" roleId="tp2c.1235747002942" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="6168063615521845348">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476747" resolveInfo="jmon" />
                                  </node>
                                  <node role="function" roleId="tp2c.1235746996653" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6168063615521845349">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476821" resolveInfo="code" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="6168063615521853687">
                            <property name="value" nameId="tpee.1070475926801" value="Build" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="6168063615521845351">
                            <property name="value" nameId="tpee.1068580123138" value="true" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6168063615521845352">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6168063615521845353">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="6168063615521845354">
                                <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7874190907999476498" resolveInfo="BuildMakeService" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="6168063615521845355">
                                <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999476520" resolveInfo="context" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="6168063615521845356">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~IOperationContext%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" resolveInfo="getProject" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="6168063615521844736" />
                  </node>
                </node>
                <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="7874190907999476842">
                  <property name="isAbstract" nameId="tpee.1178608670077" value="false" />
                  <property name="name" nameId="tpck.1169194664001" value="setup" />
                  <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="7874190907999476843">
                    <property name="name" nameId="tpck.1169194664001" value="pool" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476844">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i9so.6872280991287216857" resolveInfo="IParametersPool" />
                    </node>
                  </node>
                  <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="7874190907999476845" />
                  <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="7874190907999476846" />
                  <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476847">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="7874190907999476848">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="7874190907999476849">
                        <property name="name" nameId="tpck.1169194664001" value="vars" />
                        <node role="type" roleId="tpee.5680397130376446158" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="7874190907999476850">
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476851">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
                          </node>
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476852">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" resolveInfo="IOperationContext" />
                          </node>
                          <node role="componentType" roleId="cx9y.1238852204892" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7874190907999476853" />
                          <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7874190907999476854">
                            <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476855">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
                            </node>
                          </node>
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.CastExpression" typeId="tpee.1070534934090" id="7874190907999476856">
                          <node role="type" roleId="tpee.1070534934091" type="cx9y.IndexedTupleType" typeId="cx9y.1238852151516" id="7874190907999476857">
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476858">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="27v0.~Project" resolveInfo="Project" />
                            </node>
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476859">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="lkfb.~IOperationContext" resolveInfo="IOperationContext" />
                            </node>
                            <node role="componentType" roleId="cx9y.1238852204892" type="tpee.BooleanType" typeId="tpee.1070534644030" id="7874190907999476860" />
                            <node role="componentType" roleId="cx9y.1238852204892" type="tp2c.FunctionType" typeId="tp2c.1199542442495" id="7874190907999476861">
                              <node role="resultType" roleId="tp2c.1199542457201" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="7874190907999476862">
                                <link role="classifier" roleId="tpee.1107535924139" targetNodeId="i82i.~ProgressIndicator" resolveInfo="ProgressIndicator" />
                              </node>
                            </node>
                          </node>
                          <node role="expression" roleId="tpee.1070534934092" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476863">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476864">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476843" resolveInfo="pool" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476865">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.6872280991287216866" resolveInfo="parameters" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="7874190907999476866">
                                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="7874190907999476867">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ud0o.6168415856807657137" resolveInfo="ITarget.Name" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="7874190907999476868">
                                    <property name="value" nameId="tpee.1070475926801" value="checkParameters" />
                                  </node>
                                </node>
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="7874190907999476869">
                                <link role="classifier" roleId="tpee.1116615189566" targetNodeId="e2lb.~Object" resolveInfo="Object" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476870">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476871">
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476872">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476873">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476874">
                              <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7874190907999476498" resolveInfo="TestMakeService" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7874190907999476875">
                              <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999476520" resolveInfo="context" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476876">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="lkfb.~IOperationContext%dgetProject()%ccom%dintellij%dopenapi%dproject%dProject" resolveInfo="getProject" />
                          </node>
                        </node>
                        <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="7874190907999476877">
                          <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7874190907999476878">
                            <property name="value" nameId="tpee.1068580320021" value="0" />
                          </node>
                          <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476879">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476849" resolveInfo="vars" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476880">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476881">
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476882">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ThisExpression" typeId="tpee.1070475354124" id="7874190907999476883">
                            <link role="classConcept" roleId="tpee.1182955020723" targetNodeId="7874190907999476498" resolveInfo="TestMakeService" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.FieldReferenceOperation" typeId="tpee.1197029447546" id="7874190907999476884">
                            <link role="fieldDeclaration" roleId="tpee.1197029500499" targetNodeId="7874190907999476520" resolveInfo="context" />
                          </node>
                        </node>
                        <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="7874190907999476885">
                          <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7874190907999476886">
                            <property name="value" nameId="tpee.1068580320021" value="1" />
                          </node>
                          <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476887">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476849" resolveInfo="vars" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476888">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476889">
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="7874190907999476890">
                          <property name="value" nameId="tpee.1068580123138" value="true" />
                        </node>
                        <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="7874190907999476891">
                          <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7874190907999476892">
                            <property name="value" nameId="tpee.1068580320021" value="2" />
                          </node>
                          <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476893">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476849" resolveInfo="vars" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476894">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="7874190907999476895">
                        <node role="rValue" roleId="tpee.1068498886297" type="tp2c.ClosureLiteral" typeId="tp2c.1199569711397" id="7874190907999476896">
                          <node role="body" roleId="tp2c.1199569916463" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476897">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476898">
                              <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476899">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476769" resolveInfo="pind" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="lValue" roleId="tpee.1068498886295" type="cx9y.IndexedTupleMemberAccessExpression" typeId="cx9y.1238857743184" id="7874190907999476900">
                          <node role="index" roleId="cx9y.1238857834412" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="7874190907999476901">
                            <property name="value" nameId="tpee.1068580320021" value="3" />
                          </node>
                          <node role="tuple" roleId="cx9y.1238857764950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="7874190907999476902">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476849" resolveInfo="vars" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="7874190907999476903" />
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="7874190907999476904">
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="7874190907999476905">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="7874190907999476906">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="7874190907999476907">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476908">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476698" resolveInfo="ctl" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="7874190907999476909">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="i9so.4691049906353696048" resolveInfo="setup" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476910">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476843" resolveInfo="pool" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="7874190907999476911">
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="7874190907999476912" />
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="7874190907999476913">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="7874190907999476698" resolveInfo="ctl" />
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
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="cfml.~IMessageHandler" resolveInfo="IMessageHandler" />
      </node>
    </node>
  </root>
</model>

