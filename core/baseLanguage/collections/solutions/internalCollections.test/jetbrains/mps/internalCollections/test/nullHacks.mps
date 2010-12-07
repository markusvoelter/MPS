<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c895903f0(jetbrains.mps.internalCollections.test.nullHacks)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="f61473f9-130f-42f6-b98d-6c438812c2f6(jetbrains.mps.baseLanguage.unitTest)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <import index="yvll" modelUID="r:00000000-0000-4000-0000-011c895903ee(jetbrains.mps.internalCollections.test.closures)" version="-1" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="yjwb" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="zevl" modelUID="r:fc76aa36-3cff-41c7-b94b-eee0e8341932(jetbrains.mps.internal.collections.runtime)" version="-1" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="yvol" modelUID="r:00000000-0000-4000-0000-011c895902d7(jetbrains.mps.baseLanguage.unitTest.structure)" version="-1" implicit="yes" />
  <import index="yvli" modelUID="r:00000000-0000-4000-0000-011c895903f0(jetbrains.mps.internalCollections.test.nullHacks)" version="-1" implicit="yes" />
  <roots>
    <node type="yvol.BTestCase" typeId="yvol.1171931851043" id="1207738853400">
      <property name="testCaseName" nameId="yvol.1171931851045" value="NullSequence" />
    </node>
    <node type="yvol.BTestCase" typeId="yvol.1171931851043" id="1207742095107">
      <property name="testCaseName" nameId="yvol.1171931851045" value="NullValues" />
    </node>
    <node type="yvol.BTestCase" typeId="yvol.1171931851043" id="1207745701534">
      <property name="testCaseName" nameId="yvol.1171931851045" value="NullEmpty" />
    </node>
  </roots>
  <root id="1207738853400">
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1207738853401" />
    <node role="testMethodList" roleId="yvol.1171931851044" type="yvol.TestMethodList" typeId="yvol.1171931858461" id="1207738853402">
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207738915593">
        <property name="methodName" nameId="yvol.1171931690128" value="nullSequence" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207738915594" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207738915595">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207739130321">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207739130322">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207738992858">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207738992859">
                  <property name="name" nameId="yvnu.1169194664001:0" value="nullSeq" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207738992860">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207739017954">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739024079" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207739036448">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739039177">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207739048219">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739051523">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739050832">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1207739052325" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207739055753">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739061771">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739061202">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetLastOperation" typeId="yvix.1165595910856:7" id="1207739063455" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207739089465">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207739090870">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739094478">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739094128">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1207739095494" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207739100599">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207739101721">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739104579">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739103992">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1224754206756" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207743263053">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207743263054">
                  <property name="name" nameId="yvnu.1169194664001:0" value="list5" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1207743263055">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207743265099">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207743287057">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207743287058">
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743288646">
                        <property name="value" nameId="yvor.1068580320021:3" value="1" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743289401">
                        <property name="value" nameId="yvor.1068580320021:3" value="2" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743290025">
                        <property name="value" nameId="yvor.1068580320021:3" value="3" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743290769">
                        <property name="value" nameId="yvor.1068580320021:3" value="4" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743291489">
                        <property name="value" nameId="yvor.1068580320021:3" value="5" />
                      </node>
                      <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207743287059">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743370252">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743371085">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743371086">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743263054" resolveInfo="list5" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1207743371087">
                    <node role="argument" roleId="yvix.1160666822012:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743371088">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743300994">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743300995">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743300996">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743303703">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743303704">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743303705" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743307073">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743263054" resolveInfo="list5" />
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743300997" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743380519">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743385189">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743385190">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743263054" resolveInfo="list5" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveAllElementsOperation" typeId="yvix.1173946412755:7" id="1207743385191">
                    <node role="argument" roleId="yvix.1173946412756:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743385192">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207738992859" resolveInfo="nullSeq" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743324487">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743324488">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743324489">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743324490">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743324491">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743324492" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743324494">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743263054" resolveInfo="list5" />
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743324497" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207739150185">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207739208836">
        <property name="methodName" nameId="yvol.1171931690128" value="nullCompareOperations" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207739208837" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207739208838">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207739262786">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207739262787">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207739227112">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207739227113">
                  <property name="name" nameId="yvnu.1169194664001:0" value="input" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207739227114">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207739229078">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739234887">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739234888">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739234889" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207739242394">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739242395">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739242396">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739245384">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739245385">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739245386" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739249890">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739249011">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207739227113" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ConcatOperation" typeId="yvix.1180964022718:7" id="1207739253993">
                        <node role="rightExpression" roleId="yvix.1176906787974:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739255680" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739242397" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207739285793">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739285794">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739285795">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739285796">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739285797">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739285798" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739285799">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739285800">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207739227113" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.UnionOperation" typeId="yvix.1176903168877:7" id="1207739304438">
                        <node role="rightExpression" roleId="yvix.1176906787974:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739306586" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739285803" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207739296705">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739296706">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739296707">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739296708">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739296709">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739296710" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739296711">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739296712">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207739227113" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IntersectOperation" typeId="yvix.1176921879268:7" id="1207739355029">
                        <node role="rightExpression" roleId="yvix.1176906787974:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739356723" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739296715" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207739361150">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739361151">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739361152">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739361153">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739361154">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739361155" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739361156">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739361157">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207739227113" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.DisjunctOperation" typeId="yvix.1205598340672:7" id="1221825186607">
                        <node role="rightExpression" roleId="yvix.1176906787974:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739369034" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739361160" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207739778070">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739778071">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739778072">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739778073">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207739778074">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739778075" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207739778076">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207739778077">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207739227113" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ExcludeOperation" typeId="yvix.1176923520476:7" id="1207739782410">
                        <node role="rightExpression" roleId="yvix.1176906787974:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207739784208" />
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207739778080" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207739264586">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207741248631">
        <property name="methodName" nameId="yvol.1171931690128" value="nullTranslate" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207741248632" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207741248633">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207741362783">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207741362784">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207741259617">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207741259618">
                  <property name="name" nameId="yvnu.1169194664001:0" value="input" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207741259619">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207741261601">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207741268245">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207741268246">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207741268247" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207741307109">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207741307110">
                  <property name="name" nameId="yvnu.1169194664001:0" value="nullSeq" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207741307111">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225196721048" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207741448363">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207741307114">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207741259618" resolveInfo="input" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="1221825186365">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1207741449244">
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1221825185942">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1221825185943" />
                        </node>
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207741449245">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207741451639">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1207741710868">
                              <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1207741710869">
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207741710870" />
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207741713841">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="zevl.6543581031674024311" resolveInfo="ISequence" />
                                  <node role="parameter" roleId="yvor.1109201940907:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225196719734" />
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
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207742012557">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207742015027">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207742018166">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207742017037">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207741307110" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1207742019278" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207742025010">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207742025011">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207742025012">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207742025013">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207741307110" resolveInfo="nullSeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1224754206795" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207741364186">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207742900748">
        <property name="methodName" nameId="yvol.1171931690128" value="nullList" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207742900749" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207742900750">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207743172788">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207743172789">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207742923615">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207742923616">
                  <property name="name" nameId="yvnu.1169194664001:0" value="nullList" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1207742923617">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207742942331">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207742976435" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207742981281">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207742982678">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207743027572">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743030644">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743030217">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1207743032842" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207743036785">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743039940">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743039306">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetLastOperation" typeId="yvix.1165595910856:7" id="1207743041990" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207743046763">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743050055">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743049395">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1239499933802" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207743059286">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743061711">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743061278">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetElementOperation" typeId="yvix.1162934736510:7" id="1207743063898">
                    <node role="argument" roleId="yvix.1162934736511:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743064642">
                      <property name="value" nameId="yvor.1068580320021:3" value="-1" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207743073667">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743074426">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743081168">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743080460">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1207743097243" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1207743102180">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207743102181">
                  <property name="value" nameId="yvor.1068580320021:3" value="0" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743102182">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743102183">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207742923616" resolveInfo="input" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1224754206818" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207743174305">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1225731147875">
        <property name="methodName" nameId="yvol.1171931690128" value="forEach" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1225731147876" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225731147877">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1225731159906">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225731159908">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1225731168633">
                <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1225731168634">
                  <property name="name" nameId="yvnu.1169194664001:0" value="foo" />
                </node>
                <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1225731172461" />
                <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1225731168636">
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453655">
                    <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453656">
                      <property name="text" nameId="yvor.6329021646629104958:3" value=" must not throw exception" />
                    </node>
                  </node>
                  <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ThrowStatement" typeId="yvor.1164991038168:3" id="1225731194464">
                    <node role="throwable" roleId="yvor.1164991057263:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1225731195471">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1225731218356">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~RuntimeException%d&lt;init&gt;(java%dlang%dString)" resolveInfo="RuntimeException" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1225731219003">
                          <property name="value" nameId="yvor.1070475926801:3" value="me fail english? unpossible!" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1225731160298">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023531" resolveInfo="USE_NULL_SEQUENCE" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1228857666951">
        <property name="methodName" nameId="yvol.1171931690128" value="nullArray" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1228857666952" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1228857666953">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1228857666954">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1228857666955">
              <property name="name" nameId="yvnu.1169194664001:0" value="arr" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1228857666956">
                <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="1228857666957" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1228857666958" />
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.CommentedStatementsBlock" typeId="yvor.1177326519037:3" id="1228857666959">
            <node role="statement" roleId="yvor.1177326540772:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1228857666960">
              <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1228857666961">
                <property name="name" nameId="yvnu.1169194664001:0" value="i" />
              </node>
              <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1228857666962">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1228857666955" resolveInfo="arr" />
              </node>
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1228857666963">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertTrue" typeId="yvol.1171981022339" id="1228857666964">
                  <node role="condition" roleId="yvol.1171981057159" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1228857666965">
                    <property name="value" nameId="yvor.1068580123138:3" value="false" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207738889315">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yvll.1204129267857" resolveInfo="Util_Test" />
    </node>
  </root>
  <root id="1207742095107">
    <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="1207747260314">
      <property name="name" nameId="yvnu.1169194664001:0" value="assertEmptyList" />
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="1207747276469">
        <property name="name" nameId="yvnu.1169194664001:0" value="emptyList" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1207747278124">
          <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207747280387">
            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
          </node>
        </node>
      </node>
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207747260315" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="1207747381753" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207747260317">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747292958">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292959">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292960">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292961">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292962">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292963" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747300553">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
              </node>
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292965" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747292966">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292967">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747304045">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveElementOperation" typeId="yvix.1167380149909:7" id="1207747292969">
              <node role="argument" roleId="yvix.1167380149910:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747292970" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747292971">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292972">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292973">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292974">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292975">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292976" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747306876">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
              </node>
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292978" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747362422">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747362953">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747362423">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1207747365048">
              <node role="argument" roleId="yvix.1160612519549:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747366029" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747369945">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747369946">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747369947">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747369948">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747369949">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747369950" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747369951">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
              </node>
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747369952" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747292979">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292980">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747309175">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1207747292982">
              <node role="argument" roleId="yvix.1160666822012:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292983">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292984">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292985" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747292986">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292987">
            <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292988">
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747292989">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747292990">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292991" />
              </node>
              <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1207747311854">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747276469" resolveInfo="emptyList" />
              </node>
            </node>
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747292993" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1207742095108" />
    <node role="testMethodList" roleId="yvol.1171931851044" type="yvol.TestMethodList" typeId="yvol.1171931858461" id="1207742095109">
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207742102352">
        <property name="methodName" nameId="yvol.1171931690128" value="nullValues" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207742102353" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207742102354">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207743634282">
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207743635689">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
            </node>
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207743634284">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207743649434">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207743649435">
                  <property name="name" nameId="yvnu.1169194664001:0" value="input" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207743649436">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207743652389">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743657065">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743657066">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743657067" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743911036">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743911037">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743911038">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743914134">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743914135">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743914136" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743926764">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743926765">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743649435" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="1221825186279">
                        <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1207743926767">
                          <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1221825185528">
                            <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1221825185529" />
                          </node>
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207743926768">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207750514513">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1207750514514">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207750520732">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207750522813" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743911039" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207743946891">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743946892">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743946893">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743951189">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207743951190">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1207739322344" resolveInfo="expectEmpty" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743951191" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207743955285">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207743954657">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207743649435" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="1221825186415">
                        <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1207743956451">
                          <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1221825185869">
                            <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1221825185870" />
                          </node>
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207743956452">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="1207743962524">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1207750527628">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207750611459">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207750533745" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207743946894" />
                </node>
              </node>
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="7556115255731757382">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731757383">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7556115255731757385">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7556115255731757386">
                    <property name="name" nameId="yvnu.1169194664001:0" value="input" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7556115255731757387">
                      <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757388">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757389">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731757390">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731757391" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7556115255731757464">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7556115255731757465">
                    <property name="name" nameId="yvnu.1169194664001:0" value="seqOfNulls" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7556115255731757466">
                      <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757467">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757468">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757469">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757386" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="7556115255731757470">
                        <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7556115255731757471">
                          <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7556115255731757472">
                            <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7556115255731757473" />
                          </node>
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731757474">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731757475">
                              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7556115255731757476">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757477">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731757478" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731757487">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757492">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757491">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757386" resolveInfo="input" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731757496" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757499">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757498">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757465" resolveInfo="seqOfNulls" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731757503" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertTrue" typeId="yvol.1171981022339" id="7556115255731757506">
                  <node role="condition" roleId="yvol.1171981057159" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757509">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757508">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757465" resolveInfo="seqOfNulls" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AllOperation" typeId="yvix.1235566831861:7" id="7556115255731757513">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7556115255731757514">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731757515">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731757522">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="7556115255731757540">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731757555" />
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7556115255731757523">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757516" resolveInfo="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7556115255731757516">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7556115255731757517" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7556115255731757620">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7556115255731757621">
                    <property name="name" nameId="yvnu.1169194664001:0" value="seqOfNulls2" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="7556115255731757622">
                      <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757623">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757624">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757625">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757386" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TranslateOperation" typeId="yvix.1201792049884:7" id="7556115255731757626">
                        <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7556115255731757627">
                          <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7556115255731757628">
                            <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7556115255731757629" />
                          </node>
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731757630">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="7556115255731757631">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7556115255731757632">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757633">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731757634" />
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="7556115255731757635">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7556115255731757636">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731757637">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731757638" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731757650">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.MulExpression" typeId="yvor.1092119917967:3" id="7556115255731757661">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731757664">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757654">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757653">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757386" resolveInfo="input" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731757660" />
                    </node>
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757668">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757667">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757621" resolveInfo="seqOfNulls" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731757672" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertFalse" typeId="yvol.1171983834376" id="7556115255731757678">
                  <node role="condition" roleId="yvol.1171983854940" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731757681">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731757680">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757621" resolveInfo="seqOfNulls2" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AnyOperation" typeId="yvix.1235566554328:7" id="7556115255731757685">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7556115255731757686">
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731757687">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731757694">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="7556115255731757722">
                              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731757731" />
                              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7556115255731757695">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731757688" resolveInfo="it" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="7556115255731757688">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="7556115255731757689" />
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
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207744018414">
        <property name="methodName" nameId="yvol.1171931690128" value="nullElements" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207744018415" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207744018416">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207744081628">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207744081629">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207744030026">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207744030027">
                  <property name="name" nameId="yvnu.1169194664001:0" value="list5" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1207744030028">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207744032264">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207744036649">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207744036650">
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207744037895">
                        <property name="value" nameId="yvor.1068580320021:3" value="1" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207744038518">
                        <property name="value" nameId="yvor.1068580320021:3" value="2" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207744039076">
                        <property name="value" nameId="yvor.1068580320021:3" value="3" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207744039587">
                        <property name="value" nameId="yvor.1068580320021:3" value="4" />
                      </node>
                      <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207744040090">
                        <property name="value" nameId="yvor.1068580320021:3" value="5" />
                      </node>
                      <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207744036651">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207744070436">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207744071168">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207744070437">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="1207744073695">
                    <node role="argument" roleId="yvix.1160612519549:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207744076155" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207744098108">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207744098109">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207744098110">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207744099754">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207744099755">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207744099756" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207744102790">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207744098111" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747184418">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747184419">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207747184420">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveElementOperation" typeId="yvix.1167380149909:7" id="1207747188333">
                    <node role="argument" roleId="yvix.1167380149910:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747189855" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747194090">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747194091">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747194092">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747194093">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747194094">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747194095" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207747194096">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747194097" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747461269">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747462080">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207747461270">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveAllElementsOperation" typeId="yvix.1173946412755:7" id="1207747469974">
                    <node role="argument" roleId="yvix.1173946412756:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747471800">
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747471801">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                      </node>
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747471802" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747478605">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747478606">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747478607">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1207747260314" resolveInfo="assertEmptyList" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207747479867">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207744030027" resolveInfo="list5" />
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747478608" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747400516">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747400517">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747400518">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1207747260314" resolveInfo="assertEmptyList" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207747401115">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207747401116">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747401117" />
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207747401118">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747400519" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747407181">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747407182">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747407183">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1207747260314" resolveInfo="assertEmptyList" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207747407184">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207747407185">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747407186" />
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747412148" />
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207747407187">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747407188" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207747417619">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207747417620">
                  <property name="name" nameId="yvnu.1169194664001:0" value="nullvalue" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207747417621">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1207747422750" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1207747428262">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207747428263">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207747428264">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1207747260314" resolveInfo="assertEmptyList" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207747428265">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207747428266">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207747431696">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207747417620" resolveInfo="nullvalue" />
                        </node>
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207747428268">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1207747428269" />
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207744083258">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="7556115255731760070">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731760071">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7556115255731760074">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7556115255731760075">
                    <property name="name" nameId="yvnu.1169194664001:0" value="list5" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="7556115255731760076">
                      <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760077">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7556115255731760078">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7556115255731760079">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760080">
                          <property name="value" nameId="yvor.1068580320021:3" value="1" />
                        </node>
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760081">
                          <property name="value" nameId="yvor.1068580320021:3" value="2" />
                        </node>
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760082">
                          <property name="value" nameId="yvor.1068580320021:3" value="3" />
                        </node>
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760083">
                          <property name="value" nameId="yvor.1068580320021:3" value="4" />
                        </node>
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760084">
                          <property name="value" nameId="yvor.1068580320021:3" value="5" />
                        </node>
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760085">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731760086">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760087">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760088">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddElementOperation" typeId="yvix.1160612413312:7" id="7556115255731760089">
                      <node role="argument" roleId="yvix.1160612519549:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760090" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731760091">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760092">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731760093">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760094">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731760095">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731760096" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760178">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760097">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.TakeOperation" typeId="yvix.1172664342967:7" id="7556115255731760182">
                          <node role="elementsToTake" roleId="yvix.1172664372046:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760188">
                            <property name="value" nameId="yvor.1068580320021:3" value="5" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731760098" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731760194">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760197">
                    <property name="value" nameId="yvor.1068580320021:3" value="6" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760199">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760198">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731760203" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="7556115255731760206">
                  <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760209">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760208">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetLastOperation" typeId="yvix.1165595910856:7" id="7556115255731760213" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731760099">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760100">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760101">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveElementOperation" typeId="yvix.1167380149909:7" id="7556115255731760102">
                      <node role="argument" roleId="yvix.1167380149910:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760103" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731760104">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760105">
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731760106">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760107">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731760108">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731760109" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760110">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                      </node>
                    </node>
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731760111" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7556115255731760112">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760113">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760114">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.RemoveAllElementsOperation" typeId="yvix.1173946412755:7" id="7556115255731760115">
                      <node role="argument" roleId="yvix.1173946412756:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760116">
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="7556115255731760117">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204793778541" resolveInfo="input5" />
                        </node>
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="7556115255731760118" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731762804">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731762807">
                    <property name="value" nameId="yvor.1068580320021:3" value="0" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731762809">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731762808">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731762813" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertTrue" typeId="yvol.1171981022339" id="7556115255731762816">
                  <node role="condition" roleId="yvol.1171981057159" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731762819">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731762818">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760075" resolveInfo="list5" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.IsEmptyOperation" typeId="yvix.1165530316231:7" id="7556115255731762823" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731760216">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760219">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760224">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7556115255731760220">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7556115255731760221">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="7556115255731770919">
                          <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731770923">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                          </node>
                          <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760222" />
                        </node>
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760223">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731760228" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731760231">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760232">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760233">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7556115255731760234">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7556115255731760235">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760236" />
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760242" />
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760237">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731760238" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="1571838961923400492">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923400493">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923430133">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923400502">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1571838961923400495">
                        <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1571838961923400496">
                          <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1571838961923400497" />
                          <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1571838961923400498" />
                          <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1571838961923400499">
                            <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="1571838961923400506">
                        <node role="argument" roleId="yvix.1160666822012:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923400540">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1571838961923400510">
                            <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ArrayCreatorWithInitializer" typeId="yvor.1154542696413:3" id="1571838961923400523">
                              <node role="initValue" roleId="yvor.1154542803372:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1571838961923400536" />
                              <node role="componentType" roleId="yvor.1154542793668:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1571838961923400528">
                                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                              </node>
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AsSequenceOperation" typeId="yvix.1240325842691:7" id="1571838961923400547" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1571838961923430142" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="7556115255731760141">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="7556115255731760142">
                    <property name="name" nameId="yvnu.1169194664001:0" value="nullvalue" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760143">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760144" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731760245">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760246">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731760247">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7556115255731760248">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="7556115255731760249">
                        <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760254">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760142" resolveInfo="nullvalue" />
                        </node>
                        <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760251">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731760252" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="7556115255731760257">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="7556115255731760260">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7556115255731765323">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="7556115255731760261">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvix.SequenceCreator" typeId="yvix.1224414427926:7" id="7556115255731760263">
                        <node role="elementType" roleId="yvix.1224414456414:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="7556115255731760272">
                          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                        </node>
                        <node role="initializer" roleId="yvix.1224414466839:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="7556115255731760291">
                          <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7556115255731760292">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="7556115255731760293">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="8769465775559992050">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8769465775559992056">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="7556115255731760297" />
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="4650868106319805241">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="4650868106319805242">
                                <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4650868106319805243">
                                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                                </node>
                                <node role="expression" roleId="yvor.1070534934092:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4650868106319805244" />
                              </node>
                            </node>
                            <node role="statement" roleId="yvor.1068581517665:3" type="yviq.YieldStatement" typeId="yviq.1200830824066:3" id="7556115255731760313">
                              <node role="expression" roleId="yviq.1200830928149:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7556115255731760325">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="7556115255731760142" resolveInfo="nullvalue" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="7556115255731765329" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1241099378710">
        <property name="methodName" nameId="yvol.1171931690128" value="nullsViaBackdoor" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1241099378711" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1241099378712">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1241099383058">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1241099383059">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1241099383060">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1241099383061">
                  <property name="name" nameId="yvnu.1169194664001:0" value="listWithNulls" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1241099383062">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1241099383063" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1241099383064">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Arrays%dasList(java%dlang%dObject%d%d%d)%cjava%dutil%dList" resolveInfo="asList" />
                    <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yjwb.~Arrays" resolveInfo="Arrays" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241099383065">
                      <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1241099383066" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241099383067">
                      <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1241099383068">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1241099383069">
                  <property name="name" nameId="yvnu.1169194664001:0" value="arr" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1241099383070">
                    <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1241099383071" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241099383072">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241099383073">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383061" resolveInfo="listWithNulls" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToArrayOperation" typeId="yvix.1184963466173:7" id="1241099383074" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="1241099383075">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1241099383076">
                  <property name="value" nameId="yvor.1068580320021:3" value="3" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241099383077">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241099383078">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383069" resolveInfo="arr" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.ArrayLengthOperation" typeId="yvor.1208890769693:3" id="1241099383079" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1241099383080">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241099383081">
                  <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1241099383082">
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1241099383083">
                    <property name="value" nameId="yvor.1068580320021:3" value="0" />
                  </node>
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241099383084">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383069" resolveInfo="arr" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1241347367770">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1241347372930">
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1241347373007">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241347371174">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383069" resolveInfo="arr" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1241099383085">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241099383086">
                  <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1241099383087">
                  <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1241099383088">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                  <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241099383089">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383069" resolveInfo="arr" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1241347573933">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1241347573934">
                  <property name="name" nameId="yvnu.1169194664001:0" value="dlist" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1241347573935">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1241347573936" />
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241347573937">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241347573938">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241347573939">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241099383061" resolveInfo="listWithNulls" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.DistinctOperation" typeId="yvix.1178894719932:7" id="1241347573940" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToListOperation" typeId="yvix.1151702311717:7" id="1241347573941" />
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="1241347590972">
                <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1241347592961">
                  <property name="value" nameId="yvor.1068580320021:3" value="2" />
                </node>
                <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241347595903">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241347595455">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241347573934" resolveInfo="dlist" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1241347596700" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1241347632748">
                <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1241347632935">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1241347632749" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1241347636632">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1241347643353">
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yjwb.~Arrays" resolveInfo="Arrays" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Arrays%dasList(java%dlang%dObject%d%d%d)%cjava%dutil%dList" resolveInfo="asList" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241347643354">
                        <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1241347643356">
                        <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                      </node>
                    </node>
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1241347649066">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1241347573934" resolveInfo="dlist" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1241099383090">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023535" resolveInfo="IGNORE_NULL_VALUES" />
            </node>
            <node role="ifFalseStatement" roleId="yvor.1082485599094:3" type="yvor.BlockStatement" typeId="yvor.1082485599095:3" id="1571838961923397783">
              <node role="statements" roleId="yvor.1082485599096:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1571838961923397784">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1571838961923397788">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1571838961923397789">
                    <property name="name" nameId="yvnu.1169194664001:0" value="listWithNulls" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1571838961923397790">
                      <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1571838961923397791" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1571838961923397792">
                      <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yjwb.~Arrays" resolveInfo="Arrays" />
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Arrays%dasList(java%dlang%dObject%d%d%d)%cjava%dutil%dList" resolveInfo="asList" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397793">
                        <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1571838961923397794" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397795">
                        <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1571838961923397796">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1571838961923397797">
                    <property name="name" nameId="yvnu.1169194664001:0" value="arr" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ArrayType" typeId="yvor.1070534760951:3" id="1571838961923397798">
                      <node role="componentType" roleId="yvor.1070534760952:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1571838961923397799" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397800">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397801">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397789" resolveInfo="listWithNulls" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToArrayOperation" typeId="yvix.1184963466173:7" id="1571838961923397802" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="1571838961923397803">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923397804">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397805">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397806">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397797" resolveInfo="arr" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.ArrayLengthOperation" typeId="yvor.1208890769693:3" id="1571838961923397807" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1571838961923397808">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397809">
                    <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1571838961923397810">
                    <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923397811">
                      <property name="value" nameId="yvor.1068580320021:3" value="0" />
                    </node>
                    <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397812">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397797" resolveInfo="arr" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1571838961923397813">
                  <node role="expression" roleId="yvol.1172028236559" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1571838961923397814">
                    <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923397815">
                      <property name="value" nameId="yvor.1068580320021:3" value="1" />
                    </node>
                    <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397816">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397797" resolveInfo="arr" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertEquals" typeId="yvol.1171978097730" id="1571838961923397817">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397818">
                    <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.ArrayAccessExpression" typeId="yvor.1173175405605:3" id="1571838961923397819">
                    <node role="index" roleId="yvor.1173175577737:3" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923397820">
                      <property name="value" nameId="yvor.1068580320021:3" value="2" />
                    </node>
                    <node role="array" roleId="yvor.1173175590490:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397821">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397797" resolveInfo="arr" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1571838961923397822">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1571838961923397823">
                    <property name="name" nameId="yvnu.1169194664001:0" value="dlist" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1571838961923397824">
                      <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1571838961923397825" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397826">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397827">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397828">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397789" resolveInfo="listWithNulls" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.DistinctOperation" typeId="yvix.1178894719932:7" id="1571838961923397829" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ToListOperation" typeId="yvix.1151702311717:7" id="1571838961923397830" />
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertSame" typeId="yvol.1171985735491" id="1571838961923397831">
                  <node role="expected" roleId="yvol.8427750732757990724" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1571838961923397832">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="actual" roleId="yvol.8427750732757990725" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397833">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397834">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397823" resolveInfo="dlist" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetSizeOperation" typeId="yvix.1162935959151:7" id="1571838961923397835" />
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1571838961923397836">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1571838961923397837">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="1571838961923397838" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1571838961923397839">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1571838961923397840">
                        <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="yjwb.~Arrays" resolveInfo="Arrays" />
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yjwb.~Arrays%dasList(java%dlang%dObject%d%d%d)%cjava%dutil%dList" resolveInfo="asList" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397841">
                          <property name="value" nameId="yvor.1070475926801:3" value="foo" />
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1571838961923397859" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="1571838961923397842">
                          <property name="value" nameId="yvor.1070475926801:3" value="bar" />
                        </node>
                      </node>
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1571838961923397843">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1571838961923397823" resolveInfo="dlist" />
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
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207742100040">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yvll.1204129267857" resolveInfo="Util_Test" />
    </node>
  </root>
  <root id="1207745701534">
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="1207745701535" />
    <node role="testMethodList" roleId="yvol.1171931851044" type="yvol.TestMethodList" typeId="yvol.1171931858461" id="1207745701536">
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="1207745709956">
        <property name="methodName" nameId="yvol.1171931690128" value="nullFirstLast" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="1207745709957" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207745709958">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1207745737811">
            <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1207745737812">
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207745717595">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207745717596">
                  <property name="name" nameId="yvnu.1169194664001:0" value="emptySeq" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1207745717597">
                    <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207745719840">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207745733208">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvix.SequenceCreator" typeId="yvix.1224414427926:7" id="1224754206328">
                      <node role="elementType" roleId="yvix.1224414456414:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1224754206329">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745752280">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745754418">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745753918">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745717596" resolveInfo="emptySeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1207745755270" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745758981">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745762033">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745760862">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745717596" resolveInfo="emptySeq" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetLastOperation" typeId="yvix.1165595910856:7" id="1207745762700" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1207745768908">
                <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1207745768909">
                  <property name="name" nameId="yvnu.1169194664001:0" value="emptyList" />
                  <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1207745768910">
                    <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207745770785">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                    </node>
                  </node>
                  <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1207745777754">
                    <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="1207745777755">
                      <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207745777756">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Integer" resolveInfo="Integer" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745841583">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745847470">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745846305">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745768909" resolveInfo="emptyList" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1207745849566" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745855250">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745859991">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745858671">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745768909" resolveInfo="emptyList" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetLastOperation" typeId="yvix.1165595910856:7" id="1207745861604" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745864647">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745867896">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745867195">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745768909" resolveInfo="emptyList" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1239499931433" />
                </node>
              </node>
              <node role="statement" roleId="yvor.1068581517665:3" type="yvol.AssertIsNull" typeId="yvol.1172028177041" id="1207745875427">
                <node role="expression" roleId="yvol.1172028236559" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207745878929">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1207745877770">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1207745768909" resolveInfo="emptyList" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetElementOperation" typeId="yvix.1162934736510:7" id="1207745880598">
                    <node role="argument" roleId="yvix.1162934736511:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="1207745881195">
                      <property name="value" nameId="yvor.1068580320021:3" value="-1" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" roleId="yvor.1068580123160:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="1207745738998">
              <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="zevl.6543581031674023524" resolveInfo="Sequence" />
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="zevl.6543581031674023539" resolveInfo="NULL_WHEN_EMPTY" />
            </node>
          </node>
        </node>
      </node>
      <node role="testMethod" roleId="yvol.1171931858462" type="yvol.TestMethod" typeId="yvol.1171931690126" id="3001698940945661440">
        <property name="methodName" nameId="yvol.1171931690128" value="nullAddAll" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="3001698940945661441" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3001698940945661442">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3001698940945661443">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3001698940945661444">
              <property name="name" nameId="yvnu.1169194664001:0" value="test" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="3001698940945661445">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="3001698940945661447" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3001698940945661449">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="3001698940945661450">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="3001698940945661451" />
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945661453">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945661455">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945661457">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945661459">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945661461">
                    <property name="value" nameId="yvor.1068580320021:3" value="5" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8635043343165704636">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8635043343165704637">
              <property name="name" nameId="yvnu.1169194664001:0" value="nullList" />
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8635043343165704639" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8635043343165704645">
                <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8635043343165704649" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3001698940945661463">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945661465">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3001698940945661464">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3001698940945661444" resolveInfo="test" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="3001698940945661469">
                <node role="argument" roleId="yvix.1160666822012:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8635043343165704640">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8635043343165704637" resolveInfo="nullList" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3001698940945661478">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945661480">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="3001698940945661479" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3001698940945661484">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1204129289579" resolveInfo="assertIterableEquals" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945661486">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="3001698940945661485" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3001698940945661490">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                  </node>
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3001698940945661492">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3001698940945661444" resolveInfo="test" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="3001698940945661494">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="3001698940945661495">
              <property name="name" nameId="yvnu.1169194664001:0" value="test2" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SetType" typeId="yvix.1226511727824:7" id="3001698940945661496">
                <node role="elementType" roleId="yvix.1226511765987:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="3001698940945661498" />
              </node>
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="3001698940945661500">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvix.HashSetCreator" typeId="yvix.1226516258405:7" id="3001698940945665812">
                  <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="3001698940945665814" />
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945665816">
                    <property name="value" nameId="yvor.1068580320021:3" value="1" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945665818">
                    <property name="value" nameId="yvor.1068580320021:3" value="2" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945665820">
                    <property name="value" nameId="yvor.1068580320021:3" value="3" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945665822">
                    <property name="value" nameId="yvor.1068580320021:3" value="4" />
                  </node>
                  <node role="initValue" roleId="yvix.1237721435808:7" type="yvor.IntegerConstant" typeId="yvor.1068580320020:3" id="3001698940945665824">
                    <property name="value" nameId="yvor.1068580320021:3" value="5" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8635043343165704652">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8635043343165704653">
              <property name="name" nameId="yvnu.1169194664001:0" value="nullSet" />
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8635043343165704655" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SetType" typeId="yvix.1226511727824:7" id="8635043343165704661">
                <node role="elementType" roleId="yvix.1226511765987:7" type="yvor.IntegerType" typeId="yvor.1070534370425:3" id="8635043343165704667" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3001698940945665825">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945665827">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3001698940945665826">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3001698940945661444" resolveInfo="test" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvix.AddAllElementsOperation" typeId="yvix.1160666733551:7" id="3001698940945665831">
                <node role="argument" roleId="yvix.1160666822012:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8635043343165704656">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8635043343165704653" resolveInfo="nullSet" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3001698940945665840">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945665842">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="3001698940945665841" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3001698940945665846">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205510239182" resolveInfo="assertIterableEqualsAsSet" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3001698940945665849">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="3001698940945665848" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3001698940945665853">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yvll.1205949300713" resolveInfo="expect5" />
                  </node>
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3001698940945665855">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="3001698940945661495" resolveInfo="test2" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1207745708154">
      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yvll.1204129267857" resolveInfo="Util_Test" />
    </node>
  </root>
</model>

