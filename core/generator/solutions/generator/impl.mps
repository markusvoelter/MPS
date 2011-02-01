<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:ab837574-aa54-4b18-9762-b783ef089263(jetbrains.mps.generator.impl)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <import index="tpf8" modelUID="r:00000000-0000-4000-0000-011c895902e8(jetbrains.mps.lang.generator.structure)" version="2" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="tp3t" modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="ctdc" modelUID="f:java_stub#jetbrains.mps.util(jetbrains.mps.util@java_stub)" version="-1" />
  <import index="t1ti" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="cttk" modelUID="r:5ff047e0-2953-4750-806a-bdc16824aa89(jetbrains.mps.smodel)" version="-1" />
  <import index="jbt5" modelUID="f:java_stub#jetbrains.mps.generator.impl(jetbrains.mps.generator.impl@java_stub)" version="-1" />
  <import index="rcrn" modelUID="f:java_stub#jetbrains.mps.generator.template(jetbrains.mps.generator.template@java_stub)" version="-1" />
  <import index="homp" modelUID="f:java_stub#jetbrains.mps.logging(jetbrains.mps.logging@java_stub)" version="-1" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="tp25" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="i30" modelUID="r:ab837574-aa54-4b18-9762-b783ef089263(jetbrains.mps.generator.impl)" version="-1" implicit="yes" />
  <import index="tpfh" modelUID="r:00000000-0000-4000-0000-011c895902e1(jetbrains.mps.lang.generator.behavior)" version="-1" implicit="yes" />
  <import index="mwyq" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" implicit="yes" />
  <import index="tp2q" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="tpcw" modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" implicit="yes" />
  <import index="wt1u" modelUID="f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)" version="-1" implicit="yes" />
  <import index="xuxb" modelUID="f:java_stub#jetbrains.mps.generator.runtime(jetbrains.mps.generator.runtime@java_stub)" version="-1" implicit="yes" />
  <import index="d8ec" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" implicit="yes" />
  <import index="qspx" modelUID="f:java_stub#jetbrains.mps.generator(jetbrains.mps.generator@java_stub)" version="-1" implicit="yes" />
  <roots>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="894226751621690778">
      <property name="name" nameId="tpck.1169194664001" value="GeneratorUtilEx" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="1733398552130474119">
      <property name="name" nameId="tpck.1169194664001" value="RuleUtil" />
    </node>
    <node type="tpee.ClassConcept" typeId="tpee.1068390468198" id="4814657600604696799">
      <property name="name" nameId="tpck.1169194664001" value="DismissTopMappingRuleException" />
    </node>
  </roots>
  <root id="894226751621690778">
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="3381130103055956466">
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="LOG" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956467">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="homp.~Logger" resolveInfo="Logger" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="3381130103055956468" />
      <node role="initializer" roleId="tpee.1068431790190" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3381130103055956469">
        <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="homp.~Logger" resolveInfo="Logger" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="homp.~Logger%dgetLogger(java%dlang%dClass)%cjetbrains%dmps%dlogging%dLogger" resolveInfo="getLogger" />
        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ClassifierClassExpression" typeId="tpee.1116615150612" id="3381130103055956474">
          <link role="classifier" roleId="tpee.1116615189566" targetNodeId="894226751621690778" resolveInfo="GeneratorUtilEx" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055826399">
      <property name="name" nameId="tpck.1169194664001" value="isTemplateLanguageElement" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055826401" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055826402">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055826406">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.OrExpression" typeId="tpee.1080223426719" id="3381130103055898119">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055898123">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055898122">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055826404" resolveInfo="n" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055898127">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055898129">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1168619357332" resolveInfo="RootTemplateAnnotation" />
                </node>
              </node>
            </node>
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.OrExpression" typeId="tpee.1080223426719" id="3381130103055898108">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.OrExpression" typeId="tpee.1080223426719" id="3381130103055898097">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.OrExpression" typeId="tpee.1080223426719" id="3381130103055898086">
                  <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055826408">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055826407">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055826404" resolveInfo="n" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055826412">
                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055898085">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
                      </node>
                    </node>
                  </node>
                  <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055898090">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055898089">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055826404" resolveInfo="n" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055898094">
                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055898096">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1088761943574" resolveInfo="ReferenceMacro" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055898101">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055898100">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055826404" resolveInfo="n" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055898105">
                    <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055898107">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1087833241328" resolveInfo="PropertyMacro" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055898112">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055898111">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055826404" resolveInfo="n" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055898116">
                  <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055898118">
                    <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="3381130103055826403" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055826404">
        <property name="name" nameId="tpck.1169194664001" value="n" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055826405" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055956140">
      <property name="name" nameId="tpck.1169194664001" value="getMappingName" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055956141" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956142">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~String" resolveInfo="String" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956143">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956297" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956145">
        <property name="name" nameId="tpck.1169194664001" value="defaultValue" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956146">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956147">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055956148">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956149">
            <property name="name" nameId="tpck.1169194664001" value="mappingLabel" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956324">
              <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1200911316486" resolveInfo="MappingLabelDeclaration" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055956151" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="3381130103055956323" />
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956152">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956300">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956299">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055956304">
              <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055956306">
                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956156">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956386">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956385">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055956390">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055956392">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956160">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956395">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956394">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055956399">
                  <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055956401">
                    <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956164">
                <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956422">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956421">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055956426">
                    <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055956428">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956168">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956444">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956443">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055956448">
                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055956450">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3381130103055956172">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956173">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956174">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956175">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalStaticFieldReference" typeId="tpee.1172008963197" id="3381130103055956478">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956466" resolveInfo="LOG" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956177">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="homp.~Logger%derrorWithTrace(java%dlang%dString)%cvoid" resolveInfo="errorWithTrace" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.PlusExpression" typeId="tpee.1068581242875" id="3381130103055956178">
                              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055956179">
                                <property name="value" nameId="tpee.1070475926801" value="unexpected input " />
                              </node>
                              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956180">
                                <node role="operand" roleId="tpee.1197027771414" type="tp25.SemanticDowncastExpression" typeId="tp25.1145404486709" id="3381130103055956479">
                                  <node role="leftExpression" roleId="tp25.1145404616321" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956181">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                                  </node>
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956182">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SNode%dgetDebugText()%cjava%dlang%dString" resolveInfo="getDebugText" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956183">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956451">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956453">
                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956452">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                        </node>
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956459">
                          <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055956457">
                            <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
                            <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956456">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055956463">
                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1805153994416516026" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956204">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956429">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956431">
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956430">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                      </node>
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956437">
                        <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055956435">
                          <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
                          <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956434">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055956441">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200912223215" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956225">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956403">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956405">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956404">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956415">
                      <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055956413">
                        <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                        <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956408">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055956419">
                        <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200916687663" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956246">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956376">
                <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956377">
                  <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956378">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                  </node>
                  <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956379">
                    <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055956380">
                      <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
                      <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956381">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                      </node>
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055956383">
                      <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200917515464" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956267">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956326">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956329">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956328">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956339">
                  <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055956337">
                    <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
                    <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956332">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956143" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055956343">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200923511980" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055956357">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956358">
            <property name="name" nameId="tpck.1169194664001" value="mappingName" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956359" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="3381130103055956364">
              <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055956372" />
              <node role="condition" roleId="tpee.1163668914799" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3381130103055956361">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956362">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055956363" />
              </node>
              <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956368">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956369">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956149" resolveInfo="mappingLabel" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="3381130103055956370">
                  <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956288">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="3381130103055956289">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956373">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956358" resolveInfo="mappingName" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055956291" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956292">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055956293">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956294">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956145" resolveInfo="defaultValue" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055956295">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956374">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956358" resolveInfo="mappingName" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="894226751621690784">
      <property name="name" nameId="tpck.1169194664001" value="getPatternVariableName" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="894226751621690788" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="894226751621690786" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="894226751621690787">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="894226751621690877">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="894226751621700320">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="894226751621690879">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="894226751621690789" resolveInfo="ref" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_ConceptMethodCall" typeId="tp25.1179409122411" id="894226751621751848">
              <property name="directCall" nameId="tp25.2853323645193760541" value="true" />
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="tpfh.2902001550281937661" resolveInfo="getVariableName" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="894226751621690789">
        <property name="name" nameId="tpck.1169194664001" value="ref" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="894226751621690790">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.4816349095291127781" resolveInfo="TemplateArgumentPatternRef" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055954271">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateFragments" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055954272" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055954273">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
        <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954309">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055954275">
        <property name="name" nameId="tpck.1169194664001" value="template" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954310" />
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055954277">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055954278">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055954279">
            <property name="name" nameId="tpck.1169194664001" value="templateFragments" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055954280">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
              <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954311">
                <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
              </node>
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055954282">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055954283">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~LinkedList%d&lt;init&gt;()" resolveInfo="LinkedList" />
                <node role="typeParameter" roleId="tpee.1212687122400" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954312">
                  <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="3381130103055954285">
          <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954286">
            <node role="operand" roleId="tpee.1197027771414" type="tp25.SemanticDowncastExpression" typeId="tp25.1145404486709" id="3381130103055955893">
              <node role="leftExpression" roleId="tp25.1145404616321" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954288">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055954275" resolveInfo="template" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055954290">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SNode%dgetDescendantsIterable(jetbrains%dmps%dutil%dCondition,boolean)%cjava%dlang%dIterable" resolveInfo="getDescendantsIterable" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055954291">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055954292">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="wt1u.~IsInstanceCondition%d&lt;init&gt;(java%dlang%dString)" resolveInfo="IsInstanceCondition" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="3381130103055955892">
                    <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                  </node>
                </node>
              </node>
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3381130103055954294" />
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055954295">
            <property name="name" nameId="tpck.1169194664001" value="subnode" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954313" />
          </node>
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055954297">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055954298">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954299">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055954300">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055954279" resolveInfo="templateFragments" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055954301">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.CastExpression" typeId="tpee.1070534934090" id="3381130103055955896">
                    <node role="type" roleId="tpee.1070534934091" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055955899">
                      <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                    </node>
                    <node role="expression" roleId="tpee.1070534934092" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055954304">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055954295" resolveInfo="subnode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055954307">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055954308">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055954279" resolveInfo="templateFragments" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055956001">
      <property name="name" nameId="tpck.1169194664001" value="checkIfOneOrMaryAdjacentFragments" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055956002" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="3381130103055956003" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956004">
        <property name="name" nameId="tpck.1169194664001" value="fragments" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956005">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
          <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956098">
            <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956007">
        <property name="name" nameId="tpck.1169194664001" value="templateContainer" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956099" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956009">
        <property name="name" nameId="tpck.1169194664001" value="inputNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956100" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956011">
        <property name="name" nameId="tpck.1169194664001" value="ruleNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956101" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055956013">
        <property name="name" nameId="tpck.1169194664001" value="generator" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956102">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="rcrn.~ITemplateGenerator" resolveInfo="ITemplateGenerator" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956015">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956016">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956017">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956018">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956004" resolveInfo="fragments" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956019">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%disEmpty()%cboolean" resolveInfo="isEmpty" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956020">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956021">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956022">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956023">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956013" resolveInfo="generator" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956024">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~ITemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956025">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956009" resolveInfo="inputNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956026">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956007" resolveInfo="templateContainer" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956027">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956011" resolveInfo="ruleNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055956028">
                    <property name="value" nameId="tpee.1070475926801" value="couldn't process template: no template fragments found" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055956029">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3381130103055956030" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956031">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.GreaterThanExpression" typeId="tpee.1081506762703" id="3381130103055956032">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956033">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956034">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956004" resolveInfo="fragments" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956035">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%dsize()%cint" resolveInfo="size" />
              </node>
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="3381130103055956036">
              <property name="value" nameId="tpee.1068580320021" value="1" />
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956037">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055956038">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956039">
                <property name="name" nameId="tpck.1169194664001" value="templateNode" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956105" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956041">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956042">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956043">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956004" resolveInfo="fragments" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956044">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%dget(int)%cjava%dlang%dObject" resolveInfo="get" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="3381130103055956045">
                        <property name="value" nameId="tpee.1068580320021" value="0" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetParentOperation" typeId="tp25.1139613262185" id="3381130103055956104" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055956047">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956048">
                <property name="name" nameId="tpck.1169194664001" value="parent" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956106" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956050">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956051">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956039" resolveInfo="templateNode" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetParentOperation" typeId="tp25.1139613262185" id="3381130103055956108" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055956053">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956054">
                <property name="name" nameId="tpck.1169194664001" value="role" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055956055">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~String" resolveInfo="String" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956056">
                  <node role="operand" roleId="tpee.1197027771414" type="tp25.SemanticDowncastExpression" typeId="tp25.1145404486709" id="3381130103055956111">
                    <node role="leftExpression" roleId="tp25.1145404616321" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956057">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956039" resolveInfo="templateNode" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956058">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="3381130103055956059">
              <node role="iterable" roleId="tpee.1144226360166" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956060">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956004" resolveInfo="fragments" />
              </node>
              <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055956061">
                <property name="name" nameId="tpck.1169194664001" value="fragment" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055956113">
                  <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                </node>
              </node>
              <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956063">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956064">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055956065">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956066">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956039" resolveInfo="templateNode" />
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956067">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956068">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956061" resolveInfo="fragment" />
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetParentOperation" typeId="tp25.1139613262185" id="3381130103055956115" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055956070">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.NotExpression" typeId="tpee.1081516740877" id="3381130103055956071">
                    <node role="expression" roleId="tpee.1081516765348" type="tpee.ParenthesizedExpression" typeId="tpee.1079359253375" id="3381130103055956072">
                      <node role="expression" roleId="tpee.1079359253376" type="tpee.AndExpression" typeId="tpee.1080120340718" id="3381130103055956073">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="3381130103055956074">
                          <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956075">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956048" resolveInfo="parent" />
                          </node>
                          <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956076">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956077">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956039" resolveInfo="templateNode" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetParentOperation" typeId="tp25.1139613262185" id="3381130103055956117" />
                          </node>
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956079">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956080">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956054" resolveInfo="role" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956081">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956082">
                              <node role="operand" roleId="tpee.1197027771414" type="tp25.SemanticDowncastExpression" typeId="tp25.1145404486709" id="3381130103055956118">
                                <node role="leftExpression" roleId="tp25.1145404616321" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956083">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956039" resolveInfo="templateNode" />
                                </node>
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956084">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956085">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055956086">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055956087">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956088">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956013" resolveInfo="generator" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055956089">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~ITemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956090">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956009" resolveInfo="inputNode" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956091">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956007" resolveInfo="templateContainer" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055956092">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055956011" resolveInfo="ruleNode" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055956093">
                            <property name="value" nameId="tpee.1070475926801" value="couldn't process template: all template fragments must reside in the same parent node" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055956094">
                      <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3381130103055956095" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055956096">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3381130103055956097">
            <property name="value" nameId="tpee.1068580123138" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055922230">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateNodesFromRuleConsequence" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055922231" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922232">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
        <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922233">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ctdc.~Pair" resolveInfo="Pair" />
          <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055922546" />
          <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956128" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055922236">
        <property name="name" nameId="tpck.1169194664001" value="ruleConsequence" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055922545">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055922238">
        <property name="name" nameId="tpck.1169194664001" value="inputNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055922542" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055922240">
        <property name="name" nameId="tpck.1169194664001" value="ruleNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055922543" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055922242">
        <property name="name" nameId="tpck.1169194664001" value="reductionContext" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922547">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="jbt5.~ReductionContext" resolveInfo="ReductionContext" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="3381130103055922244">
        <property name="name" nameId="tpck.1169194664001" value="generator" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922245">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="jbt5.~TemplateGenerator" resolveInfo="TemplateGenerator" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922246">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922247">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="3381130103055922248">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922249">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922250" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922251">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922252">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922253">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922254">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922255">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~AbstractTemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922256">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922257" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922258">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922240" resolveInfo="ruleNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055922259">
                    <property name="value" nameId="tpee.1070475926801" value="no rule consequence" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922260">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922261" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922262">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922263">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922264">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922265">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922266">
                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~TemplateGenerator%dgetGenerationTracer()%cjetbrains%dmps%dgenerator%dIGenerationTracer" resolveInfo="getGenerationTracer" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922267">
              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="qspx.~IGenerationTracer%dpushRuleConsequence(jetbrains%dmps%dsmodel%dSNodePointer)%cvoid" resolveInfo="pushRuleConsequence" />
              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922268">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922269">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="d8ec.~SNodePointer%d&lt;init&gt;(jetbrains%dmps%dsmodel%dSNode)" resolveInfo="SNodePointer" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922271">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922273">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922550">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922549">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954146">
              <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954148">
                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1168559512253" resolveInfo="DismissTopMappingRule" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922277">
            <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954158">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954157">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954162">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954164">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1202776937179" resolveInfo="AbandonInput_RuleConsequence" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922281">
              <node role="condition" roleId="tpee.1068580123160" type="tpee.OrExpression" typeId="tpee.1080223426719" id="3381130103055922282">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954167">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954166">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954171">
                    <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954173">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1168559333462" resolveInfo="TemplateDeclarationReference" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954176">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954175">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954180">
                    <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954182">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.8900764248744213868" resolveInfo="InlineTemplateWithContext_RuleConsequence" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922289">
                <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954203">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954202">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954207">
                    <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954209">
                      <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1177093525992" resolveInfo="InlineTemplate_RuleConsequence" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922293">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954218">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954217">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954222">
                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954224">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1195158154974" resolveInfo="InlineSwitch_RuleConsequence" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3381130103055922297">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922298">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922299">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922300">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922301">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922302">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~AbstractTemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922303">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922304" />
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922306">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055922308">
                              <property name="value" nameId="tpee.1070475926801" value="unsupported rule consequence" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922309">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922310">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922311">
                        <property name="name" nameId="tpck.1169194664001" value="inlineSwitch" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954225">
                          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1195158154974" resolveInfo="InlineSwitch_RuleConsequence" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055954226">
                          <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1195158154974" resolveInfo="InlineSwitch_RuleConsequence" />
                          <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922314">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="3381130103055922316">
                      <node role="iterable" roleId="tpee.1144226360166" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922317">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922318">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922311" resolveInfo="inlineSwitch" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="3381130103055954229">
                          <link role="link" roleId="tp25.1138056546658" targetNodeId="tpf8.1195158408710" />
                        </node>
                      </node>
                      <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922320">
                        <property name="name" nameId="tpck.1169194664001" value="switchCase" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954230">
                          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1195158388553" resolveInfo="InlineSwitch_Case" />
                        </node>
                      </node>
                      <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922322">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922323">
                          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922324">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922325">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922326">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922242" resolveInfo="reductionContext" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922327">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~ReductionContext%dgetQueryExecutor()%cjetbrains%dmps%dgenerator%dtemplate%dQueryExecutionContext" resolveInfo="getQueryExecutor" />
                              </node>
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922328">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~QueryExecutionContext%dcheckCondition(jetbrains%dmps%dsmodel%dSNode,boolean,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode)%cboolean" resolveInfo="checkCondition" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922329">
                                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922330">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922320" resolveInfo="switchCase" />
                                </node>
                                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055954232">
                                  <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1195158608805" />
                                </node>
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.BooleanConstant" typeId="tpee.1068580123137" id="3381130103055922332">
                                <property name="value" nameId="tpee.1068580123138" value="true" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922333">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922335">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922320" resolveInfo="switchCase" />
                              </node>
                            </node>
                          </node>
                          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922337">
                            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922338">
                              <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3381130103055922339">
                                <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="894226751621690778" resolveInfo="GeneratorUtilEx" />
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055922230" resolveInfo="getTemplateNodesFromRuleConsequence" />
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922340">
                                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922341">
                                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922320" resolveInfo="switchCase" />
                                  </node>
                                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055954244">
                                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1195158637244" />
                                  </node>
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922343">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922345">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922320" resolveInfo="switchCase" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922347">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922242" resolveInfo="reductionContext" />
                                </node>
                                <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922348">
                                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922349">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922350">
                        <property name="name" nameId="tpck.1169194664001" value="defaultConsequence" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954256">
                          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922352">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922353">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922311" resolveInfo="inlineSwitch" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055954261">
                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1195158241124" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922355">
                      <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="3381130103055922356">
                        <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922357">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922350" resolveInfo="defaultConsequence" />
                        </node>
                        <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922358" />
                      </node>
                      <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3381130103055922359">
                        <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922360">
                          <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922361">
                            <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3381130103055922362">
                              <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="894226751621690778" resolveInfo="GeneratorUtilEx" />
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055922230" resolveInfo="getTemplateNodesFromRuleConsequence" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922363">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922350" resolveInfo="defaultConsequence" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922364">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922366">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922350" resolveInfo="defaultConsequence" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922368">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922242" resolveInfo="reductionContext" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922369">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922370">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922371">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922372">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922373">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922374">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~AbstractTemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922375">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922376" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922378">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922311" resolveInfo="inlineSwitch" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055922380">
                                <property name="value" nameId="tpee.1070475926801" value="no default consequence in switch" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922381">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922382">
                    <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922383">
                      <property name="name" nameId="tpck.1169194664001" value="templateNode" />
                      <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954210">
                        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
                      </node>
                      <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922385">
                        <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055954211">
                          <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1177093525992" resolveInfo="InlineTemplate_RuleConsequence" />
                          <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922388">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055954214">
                          <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1177093586806" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922391">
                    <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="3381130103055922392">
                      <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922393">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922383" resolveInfo="templateNode" />
                      </node>
                      <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922394" />
                    </node>
                    <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3381130103055922395">
                      <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922396">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922397">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922398">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922399">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922400">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~AbstractTemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922401">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922402" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922404">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.StringLiteral" typeId="tpee.1070475926800" id="3381130103055922406">
                                <property name="value" nameId="tpee.1070475926801" value="no template node" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922407">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922408">
                        <node role="expression" roleId="tpee.1068581517676" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3381130103055922409">
                          <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="t1ti.~Collections" resolveInfo="Collections" />
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~Collections%dsingletonList(java%dlang%dObject)%cjava%dutil%dList" resolveInfo="singletonList" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922410">
                            <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922411">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ctdc.~Pair%d&lt;init&gt;(java%dlang%dObject,java%dlang%dObject)" resolveInfo="Pair" />
                              <node role="typeParameter" roleId="tpee.1212687122400" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954215" />
                              <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956130" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922415">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922383" resolveInfo="templateNode" />
                              </node>
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922417" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922418">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922423">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922424">
                    <property name="name" nameId="tpck.1169194664001" value="templateContainer" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954184" />
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922426">
                  <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="3381130103055922430">
                    <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922431">
                      <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922432">
                        <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055922433">
                          <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922434">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922424" resolveInfo="templateContainer" />
                          </node>
                          <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055955908">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922444">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922454">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="3381130103055922455">
                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922456">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922424" resolveInfo="templateContainer" />
                        </node>
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055955960">
                          <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055955956">
                            <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1168559333462" resolveInfo="TemplateDeclarationReference" />
                            <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055955954">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                            </node>
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055955965">
                            <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1722980698497626483" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954185">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055954186">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="3381130103055954187">
                      <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="3381130103055954188">
                        <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1168559333462" resolveInfo="TemplateDeclarationReference" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922419">
                  <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922420">
                    <property name="name" nameId="tpck.1169194664001" value="fragments" />
                    <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922421">
                      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
                      <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954183">
                        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                      </node>
                    </node>
                    <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="3381130103055955987">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055954271" resolveInfo="getTemplateFragments" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055955989">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922424" resolveInfo="templateContainer" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="3381130103055922464">
                  <node role="condition" roleId="tpee.1068580123160" type="tpee.StaticMethodCall" typeId="tpee.1081236700937" id="3381130103055922465">
                    <link role="classConcept" roleId="tpee.1144433194310" targetNodeId="894226751621690778" resolveInfo="GeneratorUtilEx" />
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055956001" resolveInfo="checkIfOneOrMaryAdjacentFragments" />
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922466">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922420" resolveInfo="fragments" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922467">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922424" resolveInfo="templateContainer" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922468">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922469">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922240" resolveInfo="ruleNode" />
                    </node>
                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922470">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                    </node>
                  </node>
                  <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922471">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922472">
                      <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922473">
                        <property name="name" nameId="tpck.1169194664001" value="result" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922474">
                          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="t1ti.~List" resolveInfo="List" />
                          <node role="parameter" roleId="tpee.1109201940907" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922475">
                            <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ctdc.~Pair" resolveInfo="Pair" />
                            <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954199" />
                            <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956124" />
                          </node>
                        </node>
                        <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922478">
                          <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922479">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~ArrayList%d&lt;init&gt;(int)" resolveInfo="ArrayList" />
                            <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922480">
                              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="ctdc.~Pair" resolveInfo="Pair" />
                              <node role="parameter" roleId="tpee.1109201940907" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954198" />
                              <node role="parameter" roleId="tpee.1109201940907" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956122" />
                            </node>
                            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922483">
                              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922484">
                                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922420" resolveInfo="fragments" />
                              </node>
                              <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922485">
                                <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%dsize()%cint" resolveInfo="size" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ForeachStatement" typeId="tpee.1144226303539" id="3381130103055922486">
                      <node role="iterable" roleId="tpee.1144226360166" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922487">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922420" resolveInfo="fragments" />
                      </node>
                      <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922488">
                        <property name="name" nameId="tpck.1169194664001" value="fragment" />
                        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954251">
                          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
                        </node>
                      </node>
                      <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922490">
                        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="3381130103055922491">
                          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922492">
                            <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922493">
                              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922473" resolveInfo="result" />
                            </node>
                            <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="3381130103055922494">
                              <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="t1ti.~List%dadd(java%dlang%dObject)%cboolean" resolveInfo="add" />
                              <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922495">
                                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922496">
                                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="ctdc.~Pair%d&lt;init&gt;(java%dlang%dObject,java%dlang%dObject)" resolveInfo="Pair" />
                                  <node role="typeParameter" roleId="tpee.1212687122400" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055954200" />
                                  <node role="typeParameter" roleId="tpee.1212687122400" type="tpee.StringType" typeId="tpee.1225271177708" id="3381130103055956126" />
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055922500">
                                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922501">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922488" resolveInfo="fragment" />
                                    </node>
                                    <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_GetParentOperation" typeId="tp25.1139613262185" id="3381130103055954254" />
                                  </node>
                                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="3381130103055956484">
                                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055956140" resolveInfo="getMappingName" />
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055956486">
                                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922488" resolveInfo="fragment" />
                                    </node>
                                    <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055956489" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922507">
                      <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922508">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922473" resolveInfo="result" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922509">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="3381130103055922510">
                <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922511">
                  <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922512">
                    <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="jbt5.~AbandonRuleInputException%d&lt;init&gt;()" resolveInfo="AbandonRuleInputException" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055922513">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="3381130103055922514">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="3381130103055922515">
                <property name="name" nameId="tpck.1169194664001" value="message" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="3381130103055922544">
                  <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1169670156577" resolveInfo="GeneratorMessage" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="3381130103055954151">
                  <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="3381130103055954149">
                    <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1168559512253" resolveInfo="DismissTopMappingRule" />
                    <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="3381130103055922520">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922236" resolveInfo="ruleConsequence" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="3381130103055954155">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1169669152123" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4814657600604696789">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4814657600604696790">
                <property name="name" nameId="tpck.1169194664001" value="messageType" />
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="4814657600604696793">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="3381130103055956498" resolveInfo="processGeneratorMessage" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696794">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922515" resolveInfo="message" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696795">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922238" resolveInfo="inputNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696796" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696797">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922240" resolveInfo="ruleNode" />
                  </node>
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696798">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="3381130103055922244" resolveInfo="generator" />
                  </node>
                </node>
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604733643">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ThrowStatement" typeId="tpee.1164991038168" id="3381130103055922532">
              <node role="throwable" roleId="tpee.1164991057263" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="3381130103055922533">
                <node role="creator" roleId="tpee.1145553007750" type="tpee.ClassCreator" typeId="tpee.1212685548494" id="3381130103055922534">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4814657600604696805" resolveInfo="DismissTopMappingRuleException" />
                  <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="3381130103055922535">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696790" resolveInfo="messageType" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="3381130103055922536">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="3381130103055922537" />
        </node>
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604741555">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696799" resolveInfo="DismissTopMappingRuleException" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922540">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="jbt5.~AbandonRuleInputException" resolveInfo="AbandonRuleInputException" />
      </node>
      <node role="throwsItem" roleId="tpee.1164879685961" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="3381130103055922541">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="jbt5.~GenerationFailureException" resolveInfo="GenerationFailureException" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="3381130103055956498">
      <property name="name" nameId="tpck.1169194664001" value="processGeneratorMessage" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604665087">
        <property name="name" nameId="tpck.1169194664001" value="message" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4814657600604665100">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1169670156577" resolveInfo="GeneratorMessage" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604665089">
        <property name="name" nameId="tpck.1169194664001" value="inputNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4814657600604665097" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604665091">
        <property name="name" nameId="tpck.1169194664001" value="templateNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4814657600604665098" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604665093">
        <property name="name" nameId="tpck.1169194664001" value="ruleNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4814657600604665099" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604665095">
        <property name="name" nameId="tpck.1169194664001" value="generator" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604665096">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="rcrn.~ITemplateGenerator" resolveInfo="ITemplateGenerator" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696885">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="3381130103055956500" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="3381130103055956501">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4814657600604696708">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4814657600604696709">
            <property name="name" nameId="tpck.1169194664001" value="messageType" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696886">
              <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696711" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4814657600604696712">
          <node role="condition" roleId="tpee.1068580123160" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4814657600604696713">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696714">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665087" resolveInfo="message" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696715" />
          </node>
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696716">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="4814657600604696723">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="4814657600604696724">
                <property name="name" nameId="tpck.1169194664001" value="text" />
                <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696725">
                  <link role="classifier" roleId="tpee.1107535924139" targetNodeId="mwyq.~String" resolveInfo="String" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696726">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696727">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665087" resolveInfo="message" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4814657600604696771">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpf8.1169670173015" resolveInfo="messageText" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4814657600604696729">
              <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.IfStatement" typeId="tpee.1068580123159" id="4814657600604696733">
                <node role="ifFalseStatement" roleId="tpee.1082485599094" type="tpee.BlockStatement" typeId="tpee.1082485599095" id="4814657600604696737">
                  <node role="statements" roleId="tpee.1082485599096" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696738">
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696905">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4814657600604696906">
                        <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696907">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696709" resolveInfo="messageType" />
                        </node>
                        <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696909">
                          <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696871" resolveInfo="info" />
                          <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696739">
                      <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696740">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696741">
                          <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696742">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665095" resolveInfo="generator" />
                          </node>
                          <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4814657600604696743">
                            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~ITemplateGenerator%dgetLogger()%cjetbrains%dmps%dgenerator%dIGeneratorLogger" resolveInfo="getLogger" />
                          </node>
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4814657600604696744">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="qspx.~IGeneratorLogger%dinfo(jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="info" />
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696745">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665089" resolveInfo="inputNode" />
                          </node>
                          <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696746">
                            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696724" resolveInfo="text" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696747">
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696897">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4814657600604696899">
                      <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696898">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696709" resolveInfo="messageType" />
                      </node>
                      <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696903">
                        <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696872" resolveInfo="warning" />
                        <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
                      </node>
                    </node>
                  </node>
                  <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696748">
                    <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696749">
                      <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696750">
                        <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696751">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665095" resolveInfo="generator" />
                        </node>
                        <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4814657600604696752">
                          <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~ITemplateGenerator%dgetLogger()%cjetbrains%dmps%dgenerator%dIGeneratorLogger" resolveInfo="getLogger" />
                        </node>
                      </node>
                      <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4814657600604696753">
                        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="qspx.~IGeneratorLogger%dwarning(jetbrains%dmps%dsmodel%dSNode,java%dlang%dString,jetbrains%dmps%dgenerator%dIGeneratorLogger$ProblemDescription%d%d%d)%cvoid" resolveInfo="warning" />
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696754">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665089" resolveInfo="inputNode" />
                        </node>
                        <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696755">
                          <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696724" resolveInfo="text" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696782">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696783">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696784">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665087" resolveInfo="message" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4814657600604696785">
                      <link role="property" roleId="tp25.1138056395725" targetNodeId="tpf8.1169670356567" resolveInfo="messageType" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.Property_HasValue_Enum" typeId="tp25.1146171026731" id="4814657600604696786">
                    <node role="value" roleId="tp25.1146171026732" type="tp25.EnumMemberReference" typeId="tp25.1138676077309" id="4814657600604696787">
                      <link role="enumMember" roleId="tp25.1138676095763" targetNodeId="tpf8.1169670280596" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696756">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696888">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4814657600604696890">
                    <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696889">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696709" resolveInfo="messageType" />
                    </node>
                    <node role="rValue" roleId="tpee.1068498886297" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696894">
                      <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696873" resolveInfo="error" />
                      <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696757">
                  <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696758">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696759">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665095" resolveInfo="generator" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="4814657600604696760">
                      <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="rcrn.~ITemplateGenerator%dshowErrorMessage(jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cvoid" resolveInfo="showErrorMessage" />
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696761">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665089" resolveInfo="inputNode" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696762">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665091" resolveInfo="templateNode" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696763">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665093" resolveInfo="ruleNode" />
                      </node>
                      <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696764">
                        <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696724" resolveInfo="text" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696776">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4814657600604696772">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696773">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604665087" resolveInfo="message" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4814657600604696774">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpf8.1169670356567" resolveInfo="messageType" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.Property_HasValue_Enum" typeId="tp25.1146171026731" id="4814657600604696780">
                  <node role="value" roleId="tp25.1146171026732" type="tp25.EnumMemberReference" typeId="tp25.1138676077309" id="4814657600604696781">
                    <link role="enumMember" roleId="tp25.1138676095763" targetNodeId="tpf8.1169670287832" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4814657600604696765">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="4814657600604696766">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696709" resolveInfo="messageType" />
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.Statement" typeId="tpee.1068580123157" id="4814657600604696707" />
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="894226751621690779" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="894226751621690780">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="894226751621690781" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="894226751621690782" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="894226751621690783" />
    </node>
  </root>
  <root id="1733398552130474119">
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173141">
      <property name="name" nameId="tpck.1169194664001" value="concept_AbstractMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173142" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173143" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173144">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1227303129915" resolveInfo="AbstractMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208100995">
      <property name="name" nameId="tpck.1169194664001" value="concept_NodeMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208100998" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208101427" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208101429">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173113">
      <property name="name" nameId="tpck.1169194664001" value="concept_IfMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173114" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173115" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173116">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1118773211870" resolveInfo="IfMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173145">
      <property name="name" nameId="tpck.1169194664001" value="concept_SourceSubstituteMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173146" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173147" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173148">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167951328751" resolveInfo="SourceSubstituteMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173105">
      <property name="name" nameId="tpck.1169194664001" value="concept_CopySrcNodeMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173106" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173107" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173108">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1114706874351" resolveInfo="CopySrcNodeMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173109">
      <property name="name" nameId="tpck.1169194664001" value="concept_CopySrcListMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173110" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173111" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173112">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1114729360583" resolveInfo="CopySrcListMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173133">
      <property name="name" nameId="tpck.1169194664001" value="concept_IncludeMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173134" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173135" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173136">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1194565793557" resolveInfo="IncludeMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173101">
      <property name="name" nameId="tpck.1169194664001" value="concept_LoopMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173102" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173103" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173104">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1118786554307" resolveInfo="LoopMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173117">
      <property name="name" nameId="tpck.1169194664001" value="concept_MapSrcNodeMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173118" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173119" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173120">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1131073187192" resolveInfo="MapSrcNodeMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173121">
      <property name="name" nameId="tpck.1169194664001" value="concept_MapSrcListMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173122" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173123" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173124">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1133037731736" resolveInfo="MapSrcListMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173125">
      <property name="name" nameId="tpck.1169194664001" value="concept_SwitchMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173126" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173127" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173128">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1112731569622" resolveInfo="SwitchMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173129">
      <property name="name" nameId="tpck.1169194664001" value="concept_TemplateCallMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173130" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173131" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173132">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1510949579266781519" resolveInfo="TemplateCallMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173149">
      <property name="name" nameId="tpck.1169194664001" value="concept_PropertyMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173150" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173151" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173152">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1087833241328" resolveInfo="PropertyMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208173153">
      <property name="name" nameId="tpck.1169194664001" value="concept_ReferenceMacro" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208173154" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208173155" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208173156">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1088761943574" resolveInfo="ReferenceMacro" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178392">
      <property name="name" nameId="tpck.1169194664001" value="concept_BaseMappingRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178393" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178394" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178395">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178396">
      <property name="name" nameId="tpck.1169194664001" value="concept_Reduction_MappingRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178397" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178398" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178399">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167327847730" resolveInfo="Reduction_MappingRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178400">
      <property name="name" nameId="tpck.1169194664001" value="concept_Root_MappingRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178401" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178402" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178403">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167514355419" resolveInfo="Root_MappingRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178408">
      <property name="name" nameId="tpck.1169194664001" value="concept_Weaving_MappingRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178409" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178410" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178411">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167171569011" resolveInfo="Weaving_MappingRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178416">
      <property name="name" nameId="tpck.1169194664001" value="concept_PatternReduction_MappingRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178417" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178418" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178419">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178404">
      <property name="name" nameId="tpck.1169194664001" value="concept_CreateRootRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178405" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178406" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208178407">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208183661">
      <property name="name" nameId="tpck.1169194664001" value="concept_DropRootRule" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208183662" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208183663" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208183664">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1219952072943" resolveInfo="DropRootRule" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208183665">
      <property name="name" nameId="tpck.1169194664001" value="concept_MappingScriptReference" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208183666" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208183667" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.ConceptFqNameRefExpression" typeId="tp25.8339862546319741524" id="9047349009208183668">
        <link role="conceptDeclaration" roleId="tp25.8339862546319741525" targetNodeId="tpf8.1195502151594" resolveInfo="MappingScriptReference" />
      </node>
    </node>
    <node role="staticField" roleId="tpee.1128555889557" type="tpee.StaticFieldDeclaration" typeId="tpee.1070462154015" id="9047349009208178412">
      <property name="name" nameId="tpck.1169194664001" value="link_MappingConfiguration_preMappingScript" />
      <property name="isFinal" nameId="tpee.1176718929932" value="true" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208178413" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="9047349009208178414" />
      <node role="initializer" roleId="tpee.1068431790190" type="tp25.LinkNameRefExpression" typeId="tp25.5253134957341697434" id="9047349009208183672">
        <link role="conceptDeclaration" roleId="tp25.5253134957341833005" targetNodeId="tpf8.1095416546421" resolveInfo="MappingConfiguration" />
        <link role="linkDeclaration" roleId="tp25.5253134957341833006" targetNodeId="tpf8.1195502100749" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130483587">
      <property name="name" nameId="tpck.1169194664001" value="getMappingLabelName" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130483591" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="1733398552130488447" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130483590">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1733398552130483594">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130483596">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1733398552130483602">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130483604" />
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1733398552130483598">
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130483601" />
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130483597">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483592" resolveInfo="mappingLabelDeclaration" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1733398552130483606">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1733398552130483607">
            <property name="name" nameId="tpck.1169194664001" value="result" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130483608" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130483611">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130483610">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483592" resolveInfo="mappingLabelDeclaration" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1733398552130483615">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130483617">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.TernaryOperatorExpression" typeId="tpee.1163668896201" id="1733398552130483624">
            <node role="ifTrue" roleId="tpee.1163668922816" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130483628" />
            <node role="ifFalse" roleId="tpee.1163668934364" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130483629">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483607" resolveInfo="result" />
            </node>
            <node role="condition" roleId="tpee.1163668914799" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1733398552130495215">
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1733398552130495218">
                <property name="value" nameId="tpee.1068580320021" value="0" />
              </node>
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130483619">
                <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130483618">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483607" resolveInfo="result" />
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tpee.InstanceMethodCallOperation" typeId="tpee.1202948039474" id="1733398552130495214">
                  <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="mwyq.~String%dlength()%cint" resolveInfo="length" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130483592">
        <property name="name" nameId="tpck.1169194664001" value="mappingLabelDeclaration" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483593">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1200911316486" resolveInfo="MappingLabelDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130483559">
      <property name="name" nameId="tpck.1169194664001" value="getCreateRootRuleLabel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130488444" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130483561" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130483562">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130483637">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="1733398552130483638">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1733398552130483587" resolveInfo="getMappingLabelName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130488438">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130488437">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483563" resolveInfo="rule" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130488442">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200923511980" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130483563">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483564">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130483630">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateFragmentLabel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130488446" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130483632" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130483633">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130488448">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="1733398552130488449">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1733398552130483587" resolveInfo="getMappingLabelName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130488451">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130488450">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483634" resolveInfo="templateFragment" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130488455">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200916687663" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130483634">
        <property name="name" nameId="tpck.1169194664001" value="templateFragment" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483635">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130488456">
      <property name="name" nameId="tpck.1169194664001" value="getNodeMacroLabel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130488460" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130488458" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130488459">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130488463">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="1733398552130488464">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1733398552130483587" resolveInfo="getMappingLabelName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130488466">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130488465">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130488461" resolveInfo="nodeMacro" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130488470">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200912223215" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130488461">
        <property name="name" nameId="tpck.1169194664001" value="nodeMacro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130488462">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130488471">
      <property name="name" nameId="tpck.1169194664001" value="getPatternReductionRuleLabel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130488477" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130488473" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130488474">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130488478">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="1733398552130488479">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1733398552130483587" resolveInfo="getMappingLabelName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130488481">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130488480">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130488475" resolveInfo="patternRule" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130488485">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1805153994416516026" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130488475">
        <property name="name" nameId="tpck.1169194664001" value="patternRule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130488476">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130488486">
      <property name="name" nameId="tpck.1169194664001" value="getBaseRuleLabel" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130488490" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130488488" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130488489">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130488493">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalStaticMethodCall" typeId="tpee.1172058436953" id="1733398552130488494">
            <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="1733398552130483587" resolveInfo="getMappingLabelName" />
            <node role="actualArgument" roleId="tpee.1068499141038" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130488496">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130488495">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130488491" resolveInfo="rule" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130488500">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1200917515464" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130488491">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130488492">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185278598">
      <property name="name" nameId="tpck.1169194664001" value="getBaseRuleApplicableConcept" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185278603">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpce.1169125787135" resolveInfo="AbstractConceptDeclaration" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185278600" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185278601">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185278606">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185278608">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185278607">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185278604" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185278612">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167169349424" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185278604">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185278605">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185278613">
      <property name="name" nameId="tpck.1169194664001" value="getBaseRuleApplyToConceptInheritors" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185278618">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185278619">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
        </node>
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185278615" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185278616">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185278620">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185278622">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185278621">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185278618" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4290966046185278626">
              <link role="property" roleId="tp25.1138056395725" targetNodeId="tpf8.1167272244852" resolveInfo="applyToConceptInheritors" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4290966046185278617" />
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185278807">
      <property name="name" nameId="tpck.1169194664001" value="getBaseRuleCondition" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185278811">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167168920554" resolveInfo="BaseMappingRule_Condition" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185278809" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185278810">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185278814">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185278816">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185278815">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185278812" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185278820">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167169362365" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185278812">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185278813">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167169308231" resolveInfo="BaseMappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130474125">
      <property name="name" nameId="tpck.1169194664001" value="getCreateRootRuleCondition" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483558">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167087518662" resolveInfo="CreateRootRule_Condition" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130474127" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130474128">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130474131">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130483553">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130474132">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130474129" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130483557">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167087469900" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130474129">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130474130">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130483573">
      <property name="name" nameId="tpck.1169194664001" value="getCreateRootRuleTemplateNode" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130483577">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483578">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167087469898" resolveInfo="CreateRootRule" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130483586">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130483575" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130483576">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130483579">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130483581">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130483580">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130483577" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130483585">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167087469901" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130495583">
      <property name="name" nameId="tpck.1169194664001" value="getReductionRuleConsequence" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495587">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130495585" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495586">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130495590">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495592">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130495591">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495588" resolveInfo="reductionRule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130495596">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1169672767469" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130495588">
        <property name="name" nameId="tpck.1169194664001" value="reductionRule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495589">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167327847730" resolveInfo="Reduction_MappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279011">
      <property name="name" nameId="tpck.1169194664001" value="getDropRuleCondition" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279015">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1219952151850" resolveInfo="DropRootRule_Condition" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279013" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279014">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279018">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279020">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279019">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279016" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185279024">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1219952317655" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279016">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279017">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1219952072943" resolveInfo="DropRootRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279025">
      <property name="name" nameId="tpck.1169194664001" value="getDropRuleApplicableConcept" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279029">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpce.1169125787135" resolveInfo="AbstractConceptDeclaration" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279027" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279028">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279032">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279034">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279033">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279030" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185279038">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1219952338328" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279030">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279031">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1219952072943" resolveInfo="DropRootRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279249">
      <property name="name" nameId="tpck.1169194664001" value="getRootRuleTemplateNode" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279253">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpck.1169194658468" resolveInfo="INamedConcept" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279251" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279252">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279256">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279258">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279257">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279254" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185279262">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167514355421" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279254">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279255">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167514355419" resolveInfo="Root_MappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279263">
      <property name="name" nameId="tpck.1169194664001" value="getRootRuleKeepSourceRoot" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279267">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279268">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167514355419" resolveInfo="Root_MappingRule" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4290966046185279269" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279265" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279266">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279270">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279277">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279272">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279271">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279267" resolveInfo="rule" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="4290966046185279276">
                <link role="property" roleId="tp25.1138056395725" targetNodeId="tpf8.1177959072138" resolveInfo="keepSourceRoot" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Property_HasValue_Enum" typeId="tp25.1146171026731" id="4290966046185279281">
              <node role="value" roleId="tp25.1146171026732" type="tp25.EnumMemberReference" typeId="tp25.1138676077309" id="4290966046185279282">
                <link role="enumMember" roleId="tp25.1138676095763" targetNodeId="tpcw.1177964653995" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279514">
      <property name="name" nameId="tpck.1169194664001" value="getSwitchModifiedSwitch" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279527">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1112730859144" resolveInfo="TemplateSwitch" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279516" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279517">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279520">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279522">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279521">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279518" resolveInfo="switchNode" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185279526">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1112820671508" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279518">
        <property name="name" nameId="tpck.1169194664001" value="switchNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279519">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1112730859144" resolveInfo="TemplateSwitch" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="4290966046185279528">
      <property name="name" nameId="tpck.1169194664001" value="getSwitchDefaultConsequence" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4290966046185279532">
        <property name="name" nameId="tpck.1169194664001" value="switchNode" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279533">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1112730859144" resolveInfo="TemplateSwitch" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="4290966046185279541">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4290966046185279530" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4290966046185279531">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4290966046185279534">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185279536">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4290966046185279535">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4290966046185279532" resolveInfo="switchNode" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185279540">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1168558750579" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130495898">
      <property name="name" nameId="tpck.1169194664001" value="getPatternReductionRuleConsequence" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495899">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130495900" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495901">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130495902">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495903">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130495904">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495906" resolveInfo="reductionRule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130495905">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1805153994416516024" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130495906">
        <property name="name" nameId="tpck.1169194664001" value="reductionRule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495907">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="6414589636559797560">
      <property name="name" nameId="tpck.1169194664001" value="getMapSrc_PostMapperFunction" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="6414589636559833982">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1225228973247" resolveInfo="MapSrcMacro_PostMapperFunction" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="6414589636559797562" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="6414589636559797563">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="6414589636559797566">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="6414589636559797568">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6414589636559833967">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6414589636559833976">
                <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="6414589636559833974">
                  <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1131073187192" resolveInfo="MapSrcNodeMacro" />
                  <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6414589636559833969">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6414589636559797564" resolveInfo="node" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="6414589636559833980">
                  <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1225229330048" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6414589636559802368">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6414589636559802367">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6414589636559797564" resolveInfo="node" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="6414589636559833964">
              <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="6414589636559833966">
                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1131073187192" resolveInfo="MapSrcNodeMacro" />
              </node>
            </node>
          </node>
          <node role="elsifClauses" roleId="tpee.1206060520071" type="tpee.ElsifClause" typeId="tpee.1206060495898" id="6414589636559833983">
            <node role="condition" roleId="tpee.1206060619838" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6414589636559833987">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6414589636559833986">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6414589636559797564" resolveInfo="node" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="6414589636559833991">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="6414589636559833993">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1133037731736" resolveInfo="MapSrcListMacro" />
                </node>
              </node>
            </node>
            <node role="statementList" roleId="tpee.1206060644605" type="tpee.StatementList" typeId="tpee.1068580123136" id="6414589636559833985">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6414589636559833994">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="6414589636559833995">
                  <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="6414589636559833996">
                    <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1133037731736" resolveInfo="MapSrcListMacro" />
                    <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="6414589636559833997">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="6414589636559797564" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="6414589636559833999">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1225229689103" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="6414589636559834001">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="6414589636559834003" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="6414589636559797564">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="6414589636559797565">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5535664898596391452">
      <property name="name" nameId="tpck.1169194664001" value="getMapSrc_MapperFunction" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5535664898596391453">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1170725621272" resolveInfo="MapSrcMacro_MapperFunction" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5535664898596391454" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5535664898596391455">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="5535664898596391456">
          <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="5535664898596391457">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="5535664898596391458">
              <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5535664898596391459">
                <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="5535664898596391460">
                  <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1131073187192" resolveInfo="MapSrcNodeMacro" />
                  <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5535664898596391461">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5535664898596391480" resolveInfo="node" />
                  </node>
                </node>
                <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5535664898596391482">
                  <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1170725844563" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="tpee.1068580123160" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5535664898596391463">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5535664898596391464">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5535664898596391480" resolveInfo="node" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="5535664898596391465">
              <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="5535664898596391466">
                <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1131073187192" resolveInfo="MapSrcNodeMacro" />
              </node>
            </node>
          </node>
          <node role="elsifClauses" roleId="tpee.1206060520071" type="tpee.ElsifClause" typeId="tpee.1206060495898" id="5535664898596391467">
            <node role="condition" roleId="tpee.1206060619838" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5535664898596391468">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5535664898596391469">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5535664898596391480" resolveInfo="node" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.Node_IsInstanceOfOperation" typeId="tp25.1139621453865" id="5535664898596391470">
                <node role="conceptArgument" roleId="tp25.1177027386292" type="tp25.RefConcept_Reference" typeId="tp25.1177026924588" id="5535664898596391471">
                  <link role="conceptDeclaration" roleId="tp25.1177026940964" targetNodeId="tpf8.1133037731736" resolveInfo="MapSrcListMacro" />
                </node>
              </node>
            </node>
            <node role="statementList" roleId="tpee.1206060644605" type="tpee.StatementList" typeId="tpee.1068580123136" id="5535664898596391472">
              <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="5535664898596391473">
                <node role="expression" roleId="tpee.1068581517676" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5535664898596391474">
                  <node role="operand" roleId="tpee.1197027771414" type="tp25.SNodeTypeCastExpression" typeId="tp25.1140137987495" id="5535664898596391475">
                    <link role="concept" roleId="tp25.1140138128738" targetNodeId="tpf8.1133037731736" resolveInfo="MapSrcListMacro" />
                    <node role="leftExpression" roleId="tp25.1140138123956" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5535664898596391476">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5535664898596391480" resolveInfo="node" />
                    </node>
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5535664898596391483">
                    <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1170871384825" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="5535664898596391478">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="5535664898596391479" />
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5535664898596391480">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5535664898596391481">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1087833466690" resolveInfo="NodeMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130495739">
      <property name="name" nameId="tpck.1169194664001" value="getPatternReductionRulePatternNode" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495740">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130495741" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495742">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130495743">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="4290966046185203230">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495744">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130495745">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495747" resolveInfo="reductionRule" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="1733398552130495908">
                <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1805153994416556314" />
              </node>
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="4290966046185205129">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tp3t.1136720037778" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130495747">
        <property name="name" nameId="tpck.1169194664001" value="reductionRule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495748">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1805153994416516020" resolveInfo="PatternReduction_MappingRule" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="1733398552130495326">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateDeclarationParameterNames" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130495328" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495329">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1733398552130495337">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1733398552130495338">
            <property name="name" nameId="tpck.1169194664001" value="params" />
            <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeListType" typeId="tp25.1145383075378" id="1733398552130495339">
              <link role="elementConcept" roleId="tp25.1145383142433" targetNodeId="tpf8.1805153994415891174" resolveInfo="TemplateParameterDeclaration" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495343">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="1733398552130495342">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495331" resolveInfo="templateDeclaration" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkListAccess" typeId="tp25.1138056282393" id="1733398552130495347">
                <link role="link" roleId="tp25.1138056546658" targetNodeId="tpf8.1805153994415891175" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1733398552130495353">
          <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1733398552130495354">
            <property name="name" nameId="tpck.1169194664001" value="result" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.ArrayType" typeId="tpee.1070534760951" id="1733398552130495356">
              <node role="componentType" roleId="tpee.1070534760952" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130495355" />
            </node>
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.GenericNewExpression" typeId="tpee.1145552977093" id="1733398552130495359">
              <node role="creator" roleId="tpee.1145553007750" type="tpee.ArrayCreator" typeId="tpee.1184950988562" id="1733398552130495361">
                <node role="dimensionExpression" roleId="tpee.1184952969026" type="tpee.DimensionExpression" typeId="tpee.1184952934362" id="1733398552130495362">
                  <node role="expression" roleId="tpee.1184953288404" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495366">
                    <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495365">
                      <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495338" resolveInfo="params" />
                    </node>
                    <node role="operation" roleId="tpee.1197027833540" type="tp2q.GetSizeOperation" typeId="tp2q.1162935959151" id="1733398552130495370" />
                  </node>
                </node>
                <node role="componentType" roleId="tpee.1184951007469" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130495364" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ForStatement" typeId="tpee.1144231330558" id="1733398552130495372">
          <node role="body" roleId="tpee.1154032183016" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495373">
            <node role="statement" roleId="tpee.1068581517665" type="tpee.LocalVariableDeclarationStatement" typeId="tpee.1068581242864" id="1733398552130495399">
              <node role="localVariableDeclaration" roleId="tpee.1068581242865" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1733398552130495400">
                <property name="name" nameId="tpck.1169194664001" value="param" />
                <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495401">
                  <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1805153994415891174" resolveInfo="TemplateParameterDeclaration" />
                </node>
                <node role="initializer" roleId="tpee.1068431790190" type="tp2q.ListElementAccessExpression" typeId="tp2q.1225711141656" id="1733398552130495404">
                  <node role="index" roleId="tp2q.1225711191269" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495407">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495375" resolveInfo="i" />
                  </node>
                  <node role="list" roleId="tp2q.1225711182005" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495403">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495338" resolveInfo="params" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1733398552130495409">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495410">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1733398552130495418">
                  <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130495420" />
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1733398552130495414">
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130495417" />
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495413">
                  <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495400" resolveInfo="param" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130495422">
              <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="1733398552130495428">
                <node role="lValue" roleId="tpee.1068498886295" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="1733398552130495424">
                  <node role="index" roleId="tpee.1173175577737" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495427">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495375" resolveInfo="i" />
                  </node>
                  <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495423">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495354" resolveInfo="result" />
                  </node>
                </node>
                <node role="rValue" roleId="tpee.1068498886297" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495432">
                  <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495431">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495400" resolveInfo="param" />
                  </node>
                  <node role="operation" roleId="tpee.1197027833540" type="tp25.SPropertyAccess" typeId="tp25.1138056022639" id="1733398552130495436">
                    <link role="property" roleId="tp25.1138056395725" targetNodeId="tpck.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="tpee.1068581517665" type="tpee.IfStatement" typeId="tpee.1068580123159" id="1733398552130495438">
              <node role="ifTrue" roleId="tpee.1068580123161" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130495439">
                <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="1733398552130495452">
                  <node role="expression" roleId="tpee.1068581517676" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130495454" />
                </node>
              </node>
              <node role="condition" roleId="tpee.1068580123160" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="1733398552130495447">
                <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.ArrayAccessExpression" typeId="tpee.1173175405605" id="1733398552130495443">
                  <node role="index" roleId="tpee.1173175577737" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495446">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495375" resolveInfo="i" />
                  </node>
                  <node role="array" roleId="tpee.1173175590490" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495442">
                    <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495354" resolveInfo="result" />
                  </node>
                </node>
                <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="1733398552130495451" />
              </node>
            </node>
          </node>
          <node role="variable" roleId="tpee.1144230900587" type="tpee.LocalVariableDeclaration" typeId="tpee.1068581242863" id="1733398552130495375">
            <property name="name" nameId="tpck.1169194664001" value="i" />
            <node role="type" roleId="tpee.5680397130376446158" type="tpee.IntegerType" typeId="tpee.1070534370425" id="1733398552130495376" />
            <node role="initializer" roleId="tpee.1068431790190" type="tpee.IntegerConstant" typeId="tpee.1068580320020" id="1733398552130495388">
              <property name="value" nameId="tpee.1068580320021" value="0" />
            </node>
          </node>
          <node role="condition" roleId="tpee.1144231399730" type="tpee.LessThanExpression" typeId="tpee.1081506773034" id="1733398552130495378">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495377">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495375" resolveInfo="i" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.DotExpression" typeId="tpee.1197027756228" id="1733398552130495382">
              <node role="operand" roleId="tpee.1197027771414" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495381">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495354" resolveInfo="result" />
              </node>
              <node role="operation" roleId="tpee.1197027833540" type="tpee.ArrayLengthOperation" typeId="tpee.1208890769693" id="1733398552130495386" />
            </node>
          </node>
          <node role="iteration" roleId="tpee.1144231408325" type="tpee.PostfixIncrementExpression" typeId="tpee.1214918800624" id="1733398552130495390">
            <node role="expression" roleId="tpee.1239714902950" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495391">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495375" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="1733398552130495350">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.LocalVariableReference" typeId="tpee.1068581242866" id="1733398552130495455">
            <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="1733398552130495354" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.ArrayType" typeId="tpee.1070534760951" id="1733398552130495335">
        <node role="componentType" roleId="tpee.1070534760952" type="tpee.StringType" typeId="tpee.1225271177708" id="1733398552130495334" />
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="1733398552130495331">
        <property name="name" nameId="tpck.1169194664001" value="templateDeclaration" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="1733398552130495332">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1092059087312" resolveInfo="TemplateDeclaration" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5686285592101711011">
      <property name="name" nameId="tpck.1169194664001" value="getIfMacro_ConditionFunction" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101742616">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167945743726" resolveInfo="IfMacro_Condition" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5686285592101711013" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5686285592101711014">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5686285592101711017">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5686285592101711019">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5686285592101711018">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5686285592101711015" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5686285592101742615">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167945861827" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5686285592101711015">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101711016">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1118773211870" resolveInfo="IfMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208177511">
      <property name="name" nameId="tpck.1169194664001" value="getIfMacro_AlternativeConsequence" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177512">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208177513" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208177514">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208177515">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208177516">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208177517">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208177519" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208177521">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1194989344771" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208177519">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177520">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1118773211870" resolveInfo="IfMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5686285592101744254">
      <property name="name" nameId="tpck.1169194664001" value="getReferenceMacro_GetReferent" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101744268">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167770111131" resolveInfo="ReferenceMacro_GetReferent" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5686285592101744256" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5686285592101744257">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5686285592101744260">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5686285592101744262">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5686285592101744261">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5686285592101744258" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5686285592101744266">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167770376702" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5686285592101744258">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101744259">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1088761943574" resolveInfo="ReferenceMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5686285592101744437">
      <property name="name" nameId="tpck.1169194664001" value="getPropertyMacro_ValueFunction" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101744451">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167756080639" resolveInfo="PropertyMacro_GetPropertyValue" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5686285592101744439" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5686285592101744440">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5686285592101744443">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5686285592101744445">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5686285592101744444">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5686285592101744441" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5686285592101744449">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1167756362303" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5686285592101744441">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101744442">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1087833241328" resolveInfo="PropertyMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5686285592101745308">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateFragment_ContextNodeQuery" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5686285592101745310" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5686285592101745311">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5686285592101745314">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5686285592101745316">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5686285592101745315">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5686285592101745312" resolveInfo="tf" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="5686285592101745320">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1184374535435" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5686285592101745312">
        <property name="name" nameId="tpck.1169194664001" value="tf" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101745313">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101745321">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1184373935793" resolveInfo="TemplateFragment_ContextNodeQuery" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208183673">
      <property name="name" nameId="tpck.1169194664001" value="getMappingScriptReference_Script" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208183687">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1195499912406" resolveInfo="MappingScript" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208183675" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208183676">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208183679">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208183681">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208183680">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208183677" resolveInfo="ref" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208183685">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1195502167610" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208183677">
        <property name="name" nameId="tpck.1169194664001" value="ref" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208183678">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1195502151594" resolveInfo="MappingScriptReference" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208177927">
      <property name="name" nameId="tpck.1169194664001" value="getSwitchMacro_TemplateSwitch" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177941">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1112730859144" resolveInfo="TemplateSwitch" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208177929" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208177930">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208177933">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208177935">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208177934">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208177931" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208177939">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1112731629154" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208177931">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177932">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1112731569622" resolveInfo="SwitchMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208177943">
      <property name="name" nameId="tpck.1169194664001" value="getIncludeMacro_Template" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177957">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1092059087312" resolveInfo="TemplateDeclaration" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208177945" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208177946">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208177949">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208177951">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208177950">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208177947" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208177955">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1194566366375" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208177947">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177948">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1194565793557" resolveInfo="IncludeMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208177959">
      <property name="name" nameId="tpck.1169194664001" value="getCallMacro_Template" />
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177960">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1092059087312" resolveInfo="TemplateDeclaration" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208177961" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208177962">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208177963">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208177964">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208177965">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208177967" resolveInfo="macro" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208177969">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1722980698497626483" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208177967">
        <property name="name" nameId="tpck.1169194664001" value="macro" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208177968">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1510949579266781519" resolveInfo="TemplateCallMacro" />
        </node>
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208184134">
      <property name="name" nameId="tpck.1169194664001" value="getWeaving_ContextNodeQuery" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208184136" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208184137">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208184141">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208184143">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208184142">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208184138" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208184147">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1184616230853" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208184138">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208184139">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167171569011" resolveInfo="Weaving_MappingRule" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208184140">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1184616041890" resolveInfo="Weaving_MappingRule_ContextNodeQuery" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="9047349009208184601">
      <property name="name" nameId="tpck.1169194664001" value="getWeaving_Consequence" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="9047349009208184602" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="9047349009208184603">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="9047349009208184604">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="9047349009208184605">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="9047349009208184606">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="9047349009208184608" resolveInfo="rule" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.SLinkAccess" typeId="tp25.1138056143562" id="9047349009208184611">
              <link role="link" roleId="tp25.1138056516764" targetNodeId="tpf8.1169570368028" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="9047349009208184608">
        <property name="name" nameId="tpck.1169194664001" value="rule" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208184609">
          <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1167171569011" resolveInfo="Weaving_MappingRule" />
        </node>
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="9047349009208184610">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1168559098955" resolveInfo="RuleConsequence" />
      </node>
    </node>
    <node role="staticMethod" roleId="tpee.1070462273904" type="tpee.StaticMethodDeclaration" typeId="tpee.1081236700938" id="5686285592101745503">
      <property name="name" nameId="tpck.1169194664001" value="getTemplateFragmentByAnnotatedNode" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="5686285592101745504" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="5686285592101745505">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="5686285592101745514">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.DotExpression" typeId="tpee.1197027756228" id="5686285592101745516">
            <node role="operand" roleId="tpee.1197027771414" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="5686285592101745515">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="5686285592101745510" resolveInfo="node" />
            </node>
            <node role="operation" roleId="tpee.1197027833540" type="tp25.AttributeAccessOperation" typeId="tp25.1204761823073" id="5686285592101745520">
              <node role="attributeQualifier" roleId="tp25.1204762310079" type="tp25.NodeAttributeAccessQualifier" typeId="tp25.1204763358057" id="5686285592101745522">
                <link role="annotationLink" roleId="tp25.1204763443606" targetNodeId="tpf8.1149858605876" resolveInfo="templateFragment" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="5686285592101745510">
        <property name="name" nameId="tpck.1169194664001" value="node" />
        <node role="type" roleId="tpee.5680397130376446158" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101745511" />
      </node>
      <node role="returnType" roleId="tpee.1068580123133" type="tp25.SNodeType" typeId="tp25.1138055754698" id="5686285592101745512">
        <link role="concept" roleId="tp25.1138405853777" targetNodeId="tpf8.1095672379244" resolveInfo="TemplateFragment" />
      </node>
    </node>
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130474120" />
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="1733398552130474121">
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="1733398552130474122" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="1733398552130474123" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="1733398552130474124" />
    </node>
  </root>
  <root id="4814657600604696799">
    <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696800" />
    <node role="superclass" roleId="tpee.1165602531693" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696801">
      <link role="classifier" roleId="tpee.1107535924139" targetNodeId="xuxb.~GenerationException" />
    </node>
    <node role="field" roleId="tpee.1068390468199" type="tpee.FieldDeclaration" typeId="tpee.1068390468200" id="4814657600604696802">
      <property name="name" nameId="tpck.1169194664001" value="myMessageType" />
      <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696874">
        <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PrivateVisibility" typeId="tpee.1146644623116" id="4814657600604696804" />
    </node>
    <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="4814657600604696805">
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696806" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4814657600604696807" />
      <node role="parameter" roleId="tpee.1068580123134" type="tpee.ParameterDeclaration" typeId="tpee.1068498886292" id="4814657600604696808">
        <property name="name" nameId="tpck.1169194664001" value="messageType" />
        <node role="type" roleId="tpee.5680397130376446158" type="tpee.ClassifierType" typeId="tpee.1107535904670" id="4814657600604696875">
          <link role="classifier" roleId="tpee.1107535924139" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
        </node>
      </node>
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696810">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ExpressionStatement" typeId="tpee.1068580123155" id="4814657600604696811">
          <node role="expression" roleId="tpee.1068580123156" type="tpee.AssignmentExpression" typeId="tpee.1068498886294" id="4814657600604696812">
            <node role="lValue" roleId="tpee.1068498886295" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696813">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
            </node>
            <node role="rValue" roleId="tpee.1068498886297" type="tpee.ParameterReference" typeId="tpee.1068581242874" id="4814657600604696814">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696808" resolveInfo="messageType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4814657600604696815">
      <property name="name" nameId="tpck.1169194664001" value="isLoggingNeeded" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696816" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4814657600604696817" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696818">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4814657600604696819">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4814657600604696820">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696821">
              <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696822" />
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4814657600604696823">
      <property name="name" nameId="tpck.1169194664001" value="isInfo" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696824" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4814657600604696825" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696826">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4814657600604696827">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.AndExpression" typeId="tpee.1080120340718" id="4814657600604696828">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4814657600604696829">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696830">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696831" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4814657600604696832">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696833">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696878">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696871" resolveInfo="info" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4814657600604696835">
      <property name="name" nameId="tpck.1169194664001" value="isWarning" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696836" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4814657600604696837" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696838">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4814657600604696839">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.AndExpression" typeId="tpee.1080120340718" id="4814657600604696840">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4814657600604696841">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696842">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696843" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4814657600604696844">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696845">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696881">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696872" resolveInfo="warning" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method" roleId="tpee.1107880067339" type="tpee.InstanceMethodDeclaration" typeId="tpee.1068580123165" id="4814657600604696847">
      <property name="name" nameId="tpck.1169194664001" value="isError" />
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696848" />
      <node role="returnType" roleId="tpee.1068580123133" type="tpee.BooleanType" typeId="tpee.1070534644030" id="4814657600604696849" />
      <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696850">
        <node role="statement" roleId="tpee.1068581517665" type="tpee.ReturnStatement" typeId="tpee.1068581242878" id="4814657600604696851">
          <node role="expression" roleId="tpee.1068581517676" type="tpee.AndExpression" typeId="tpee.1080120340718" id="4814657600604696852">
            <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.NotEqualsExpression" typeId="tpee.1073239437375" id="4814657600604696853">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696854">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.NullLiteral" typeId="tpee.1070534058343" id="4814657600604696855" />
            </node>
            <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EqualsExpression" typeId="tpee.1068580123152" id="4814657600604696856">
              <node role="leftExpression" roleId="tpee.1081773367580" type="tpee.LocalInstanceFieldReference" typeId="tpee.7785501532031639928" id="4814657600604696857">
                <link role="variableDeclaration" roleId="tpee.1068581517664" targetNodeId="4814657600604696802" resolveInfo="myMessageType" />
              </node>
              <node role="rightExpression" roleId="tpee.1081773367579" type="tpee.EnumConstantReference" typeId="tpee.1083260308424" id="4814657600604696884">
                <link role="enumConstantDeclaration" roleId="tpee.1083260308426" targetNodeId="4814657600604696873" resolveInfo="error" />
                <link role="enumClass" roleId="tpee.1144432896254" targetNodeId="4814657600604696862" resolveInfo="DismissTopMappingRuleException.MessageType" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticInnerClassifiers" roleId="tpee.1178616825527" type="tpee.EnumClass" typeId="tpee.1083245097125" id="4814657600604696862">
      <property name="nonStatic" nameId="tpee.521412098689998745" value="true" />
      <property name="name" nameId="tpck.1169194664001" value="MessageType" />
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="4814657600604696871">
        <property name="name" nameId="tpck.1169194664001" value="info" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4814657600604696864" resolveInfo="MessageType" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="4814657600604696872">
        <property name="name" nameId="tpck.1169194664001" value="warning" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4814657600604696864" resolveInfo="MessageType" />
      </node>
      <node role="enumConstant" roleId="tpee.1083245396908" type="tpee.EnumConstantDeclaration" typeId="tpee.1083245299891" id="4814657600604696873">
        <property name="name" nameId="tpck.1169194664001" value="error" />
        <link role="baseMethodDeclaration" roleId="tpee.1068499141037" targetNodeId="4814657600604696864" resolveInfo="MessageType" />
      </node>
      <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696863" />
      <node role="constructor" roleId="tpee.1068390468201" type="tpee.ConstructorDeclaration" typeId="tpee.1068580123140" id="4814657600604696864">
        <node role="returnType" roleId="tpee.1068580123133" type="tpee.VoidType" typeId="tpee.1068581517677" id="4814657600604696865" />
        <node role="visibility" roleId="tpee.1178549979242" type="tpee.PublicVisibility" typeId="tpee.1146644602865" id="4814657600604696866" />
        <node role="body" roleId="tpee.1068580123135" type="tpee.StatementList" typeId="tpee.1068580123136" id="4814657600604696867" />
      </node>
    </node>
  </root>
</model>

