<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590287(jetbrains.mps.lang.core.scripts)">
  <persistence version="7" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="3ecd7c84-cde3-45de-886c-135ecc69b742(jetbrains.mps.lang.refactoring)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="18bc6592-03a6-4e29-a83a-7ff23bde13ba(jetbrains.mps.lang.editor)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="28f9e497-3b42-4291-aeba-0a1039153ab1(jetbrains.mps.lang.plugin)" />
  <language namespace="0eddeefa-c2d6-4437-bc2c-de50fd4ce470(jetbrains.mps.lang.script)" />
  <import index="yvnu" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="vhgx" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="8n6q" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="yvnr" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="bjpd" modelUID="f:java_stub#jetbrains.mps.refactoring.framework(jetbrains.mps.refactoring.framework@java_stub)" version="-1" />
  <import index="yeix" modelUID="f:java_stub#jetbrains.mps.smodel.search(jetbrains.mps.smodel.search@java_stub)" version="-1" />
  <import index="txlh" modelUID="f:java_stub#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <import index="1alo" modelUID="f:java_stub#jetbrains.mps.ide.findusages.model(jetbrains.mps.ide.findusages.model@java_stub)" version="-1" />
  <import index="yvnt" modelUID="r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)" version="-1" />
  <import index="hx9v" modelUID="f:java_stub#jetbrains.mps.lang.structure.structure(jetbrains.mps.lang.structure.structure@java_stub)" version="-1" />
  <import index="rggf" modelUID="r:2c4d9270-b6d6-44af-aecd-e01a223680db(jetbrains.mps.kernel.model)" version="-1" />
  <import index="1yx2" modelUID="f:java_stub#jetbrains.mps.smodel.constraints(jetbrains.mps.smodel.constraints@java_stub)" version="-1" />
  <import index="t147" modelUID="f:java_stub#javax.swing(javax.swing@java_stub)" version="-1" />
  <import index="2uit" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="ko86" modelUID="f:java_stub#javax.swing.text(javax.swing.text@java_stub)" version="-1" />
  <import index="yvig" modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="8" />
  <import index="yvor" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" implicit="yes" />
  <import index="yvim" modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" implicit="yes" />
  <import index="yvix" modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" implicit="yes" />
  <import index="yvnl" modelUID="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" version="32" implicit="yes" />
  <import index="yvju" modelUID="r:00000000-0000-4000-0000-011c89590368(jetbrains.mps.lang.plugin.structure)" version="23" implicit="yes" />
  <import index="yviq" modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" implicit="yes" />
  <import index="yvia" modelUID="r:00000000-0000-4000-0000-011c89590319(jetbrains.mps.lang.refactoring.structure)" version="1" implicit="yes" />
  <import index="yvj3" modelUID="r:00000000-0000-4000-0000-011c89590323(jetbrains.mps.lang.script.structure)" version="0" implicit="yes" />
  <import index="yvnx" modelUID="r:00000000-0000-4000-0000-011c89590287(jetbrains.mps.lang.core.scripts)" version="-1" implicit="yes" />
  <roots>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1198076144993">
      <property name="name" nameId="yvnu.1169194664001:0" value="MoveNodes" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Move Nodes" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1199457919461">
      <property name="name" nameId="yvnu.1169194664001:0" value="Rename" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Rename" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
    </node>
    <node type="yvia.OldRefactoring" typeId="yvia.1189693812263:1" id="1200665013408">
      <property name="name" nameId="yvnu.1169194664001:0" value="SafeDelete" />
      <property name="userFriendlyName" nameId="yvia.1191237830649:1" value="Safe Delete Node" />
      <property name="refactorImmediatelyIfNoUsages" nameId="yvia.1210941394948:1" value="true" />
      <property name="oneTargetOnly" nameId="yvia.700745782152514628:1" value="true" />
      <link role="applicableConcept" roleId="yvia.1199455371376:1" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
    </node>
    <node type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="4706738529699924056">
      <property name="name" nameId="yvnu.1169194664001:0" value="RenameUtil" />
    </node>
    <node type="yvj3.MigrationScript" typeId="yvj3.1177457067821:0" id="6243486444683604044">
      <property name="name" nameId="yvnu.1169194664001:0" value="ShowGetNameUsages" />
      <property name="title" nameId="yvj3.1177457669450:0" value="Show getters for name property" />
    </node>
    <node type="yvj3.MigrationScript" typeId="yvj3.1177457067821:0" id="3180819252996380865">
      <property name="name" nameId="yvnu.1169194664001:0" value="package2virtualPackage" />
      <property name="title" nameId="yvj3.1177457669450:0" value="Restore Virtual Packages" />
    </node>
  </roots>
  <root id="1198076144993">
    <node role="internalArguments" roleId="yvia.1189696093619:1" type="yvia.RequiredAdditionalArgument" typeId="yvia.1189693830529:1" id="1198079405212">
      <property name="name" nameId="yvnu.1169194664001:0" value="role" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191251405" />
    </node>
    <node role="internalArguments" roleId="yvia.1189696093619:1" type="yvia.RequiredAdditionalArgument" typeId="yvia.1189693830529:1" id="1213099173577">
      <property name="name" nameId="yvnu.1169194664001:0" value="nodeToOpen" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1239575191097" />
    </node>
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1198076162946">
      <property name="name" nameId="yvnu.1169194664001:0" value="target" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="choose target" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198076213171">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="vhgx.~Object" resolveInfo="Object" />
      </node>
      <node role="chooseComponentClause" roleId="yvia.1197983571375:1" type="yvia.ChooseComponentClause" typeId="yvia.1197983858784:1" id="1198076218734">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198076218735">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609776640">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6528618226609776641">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="6528618226609776642">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="bjpd.~ChooseNodeOrModelComponent%d&lt;init&gt;(jetbrains%dmps%dsmodel%dIOperationContext,java%dlang%dString,boolean,boolean)" resolveInfo="ChooseNodeOrModelComponent" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.OperationContextExpression" typeId="yvia.1215084612287:1" id="6528618226609776643" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="6528618226609776644" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="6528618226609776645">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="6528618226609776646">
                  <property name="value" nameId="yvor.1068580123138:3" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" roleId="yvia.1189695159409:1" type="yvia.IsApplicableClause" typeId="yvia.1189694022607:1" id="1198077595126">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198077595127">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198077782188">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198077782189">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198078072588">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198078072589">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetNode" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198078072590" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1198077958401">
                  <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1198077958402">
                    <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198077958403" />
                    <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198077963030">
                      <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198077941205">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198077941206">
                <property name="name" nameId="yvnu.1169194664001:0" value="concept" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SConceptType" typeId="yvim.1172420572800:16" id="1198077941207" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227902621">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198078072591">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198078072589" resolveInfo="targetNode" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="1198078064571" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199553244200">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199553244201">
                <property name="name" nameId="yvnu.1169194664001:0" value="superConceptsScope" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1199553244202">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope" resolveInfo="ConceptAndSuperConceptsScope" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213019923205">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213019923207">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope%d&lt;init&gt;(jetbrains%dmps%dlang%dstructure%dstructure%dAbstractConceptDeclaration)" resolveInfo="ConceptAndSuperConceptsScope" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204672721275">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199553244205">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198077941206" resolveInfo="concept" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAdapterOperation" typeId="yvim.1170384605257:16" id="1199553244206" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199553331594">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199553331595">
                <property name="name" nameId="yvnu.1169194664001:0" value="linkDeclarations" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="1237047119324">
                  <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1237047119325">
                    <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="hx9v.~LinkDeclaration" resolveInfo="LinkDeclaration" />
                  </node>
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886061">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199553331599">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199553244201" resolveInfo="superConceptsScope" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886062">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="yeix.~ConceptAndSuperConceptsScope%dgetLinkDeclarationsExcludingOverridden()%cjava%dutil%dList" resolveInfo="getLinkDeclarationsExcludingOverridden" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198080415516">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198080415517">
                <property name="name" nameId="yvnu.1169194664001:0" value="childLinkDeclarations" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1198080415518">
                  <node role="elementType" roleId="yvix.1151689745422:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198080415519">
                    <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                  </node>
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782887393">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782887416">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199553358175">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199553331595" resolveInfo="linkDeclarations" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvix.WhereOperation" typeId="yvix.1202120902084:7" id="1227876803951">
                      <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1227876803952">
                        <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1227876803953">
                          <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                          <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1227876803954" />
                        </node>
                        <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1227876803955">
                          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227876803956">
                            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227876803957">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227876803958">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1239490687657">
                                  <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                                  <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227876803962">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1227876817690">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227876803953" resolveInfo="it" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1227876803964">
                                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~BaseAdapter%dgetNode()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getNode" />
                                    </node>
                                  </node>
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1227876803965">
                                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599937831:0" resolveInfo="metaClass" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_HasValue_Enum" typeId="yvim.1146171026731:16" id="1227876803966">
                                <node role="value" roleId="yvim.1146171026732:16" type="yvim.EnumMemberReference" typeId="yvim.1138676077309:16" id="1227876803967">
                                  <link role="enumMember" roleId="yvim.1138676095763:16" targetNodeId="yvnr.1084199179705:0" resolveInfo="aggregation" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="1227876795122">
                    <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1227876795123">
                      <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1227876795124">
                        <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1227876795125" />
                      </node>
                      <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1227876795126">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227876795127">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="1239490689950">
                            <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                            <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1227876795129">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1227876815423">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227876795124" resolveInfo="it" />
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1227876795131">
                                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~BaseAdapter%dgetNode()%cjetbrains%dmps%dsmodel%dSNode" resolveInfo="getNode" />
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
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198078651966">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198078651967">
                <property name="name" nameId="yvnu.1169194664001:0" value="childLinksRoles" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.SequenceType" typeId="yvix.1151689724996:7" id="1198078651968">
                  <node role="elementType" roleId="yvix.1151689745422:7" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191250525" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782887396">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198080415520">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080415517" resolveInfo="childLinkDeclarations" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvix.SelectOperation" typeId="yvix.1202128969694:7" id="1227876794779">
                    <node role="closure" roleId="yvix.1204796294226:7" type="yviq.ClosureLiteral" typeId="yviq.1199569711397:3" id="1227876794780">
                      <node role="parameter" roleId="yviq.1199569906740:3" type="yvix.SmartClosureParameterDeclaration" typeId="yvix.1203518072036:7" id="1227876794781">
                        <property name="name" nameId="yvnu.1169194664001:0" value="it" />
                        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.WildCardType" typeId="yvor.1171903607971:3" id="1227876794782" />
                      </node>
                      <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1227876794783">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1227876794784">
                          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="1227876794785">
                            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="rggf.1237995590703" resolveInfo="SModelUtil" />
                            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="rggf.1238250357846" resolveInfo="getGenuineLinkRole" />
                            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="1227876817611">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1227876794781" resolveInfo="it" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198078082609">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198078082610">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198080494863">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198080494864">
                    <property name="name" nameId="yvnu.1169194664001:0" value="childRole" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191251578" />
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886165">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1198079775377">
                        <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198079769638">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198078082613" resolveInfo="node" />
                        </node>
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886166">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198079760598">
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1198079762867">
                    <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782887389">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198079763963">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198078651967" resolveInfo="childLinksRoles" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="1198079768199">
                        <node role="argument" roleId="yvix.1172256416782:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198080494866">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080494864" resolveInfo="childRole" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198079760600">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198079783523">
                      <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198079785634">
                        <property name="value" nameId="yvor.1068580123138:3" value="false" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198080385428">
                  <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198080385429">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198080385430">
                      <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198080385431">
                        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1203555341688">
                          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1203555341689">
                            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1203555341690">
                              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1203555341691">
                                <property name="value" nameId="yvor.1068580123138:3" value="false" />
                              </node>
                            </node>
                          </node>
                          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1203555341692">
                            <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203555365326">
                              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227915657">
                                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1203555341695">
                                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080385435" resolveInfo="linkDeclaration" />
                                </node>
                                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="1203555341696">
                                  <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvnr.1071599976176:0" />
                                </node>
                              </node>
                              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Concept_IsSuperConceptOfOperation" typeId="yvim.1180028149140:16" id="1203555372874">
                                <node role="conceptArgument" roleId="yvim.1180028346304:16" type="yvim.PoundExpression" typeId="yvim.1204834851141:16" id="1207782895934">
                                  <node role="expression" roleId="yvim.1204834868751:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1203555383109">
                                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1203555380155">
                                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198078082613" resolveInfo="node" />
                                    </node>
                                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="1203555387580" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782882982">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227831523">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198080424037">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080385435" resolveInfo="linkDeclaration" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1198080471199">
                            <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
                          </node>
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782882983">
                          <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="vhgx.~String%dequals(java%dlang%dObject)%cboolean" resolveInfo="equals" />
                          <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198080500695">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080494864" resolveInfo="childRole" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198080464867">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198080415517" resolveInfo="childLinkDeclarations" />
                  </node>
                  <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198080385435">
                    <property name="name" nameId="yvnu.1169194664001:0" value="linkDeclaration" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198080390421">
                      <link role="concept" roleId="yvim.1138405853777:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1215086389707" />
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198078082613">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198078086943" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198081270945">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198081273588">
                <property name="value" nameId="yvor.1068580123138:3" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="1198078009142">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198078059755">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198078007813">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198077799776">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198077799777">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="1198077826662">
              <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198077826663">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198077841409">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198077841410">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198077841411">
                      <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198082481655">
                        <property name="value" nameId="yvor.1068580123138:3" value="false" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotExpression" typeId="yvor.1081516740877:3" id="1198081463443">
                    <node role="expression" roleId="yvor.1081516765348:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227831659">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227920540">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1198081463447">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198077826667" resolveInfo="node" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetConceptOperation" typeId="yvim.1172323065820:16" id="1198081463448" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="1239344013293">
                        <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1096454100552:0" resolveInfo="rootable" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" roleId="yvor.1144226360166:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1215086399992" />
              <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198077826667">
                <property name="name" nameId="yvnu.1169194664001:0" value="node" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1198078215778" />
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198082486141">
              <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198082487393">
                <property name="value" nameId="yvor.1068580123138:3" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="1198077803140">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1202822847908">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198077802014">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1198077845946">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.BooleanConstant" typeId="yvor.1068580123137:3" id="1198077848823">
            <property name="value" nameId="yvor.1068580123138:3" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1198082838885">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198082838886">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1198082944516">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1198082944517">
            <property name="name" nameId="yvnu.1169194664001:0" value="nodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1198082944518" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1215001262250" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199555206075">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199555206076">
            <property name="name" nameId="yvnu.1169194664001:0" value="targetModel" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1199555218034" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SModelType" typeId="yvim.1143226024141:16" id="1239568349814" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199625160585">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199625160586">
            <property name="name" nameId="yvnu.1169194664001:0" value="movedNodes" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeListType" typeId="yvim.1145383075378:16" id="1199625160587" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1199625167840" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198082954071">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198082954072">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1202822983443">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1202822986304">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1202822983444">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555206076" resolveInfo="targetModel" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886206">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParenthesizedExpression" typeId="yvor.1079359253375:3" id="1202822987262">
                    <node role="expression" roleId="yvor.1079359253376:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1202822987263">
                      <node role="type" roleId="yvor.1070534934091:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1202822987264">
                        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                      </node>
                      <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1202822987265">
                        <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
                      </node>
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886207">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetSModel()%cjetbrains%dmps%dsmodel%dSModel" resolveInfo="getSModel" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199627188714">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1199627190357">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199627188715">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199625160586" resolveInfo="movedNodes" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvia.MoveNodesToModelExpression" typeId="yvia.1199620728600:1" id="1199627194735">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199627194736">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198082944517" resolveInfo="nodes" />
                  </node>
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1202822993439">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555206076" resolveInfo="targetModel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="1198083001642">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1202822858676">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198082991405">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1198083016323">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198083016324">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1213027913402">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1213027913403">
                <property name="name" nameId="yvnu.1169194664001:0" value="targetNode" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213027913404" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.CastExpression" typeId="yvor.1070534934090:3" id="1213027913405">
                  <node role="expression" roleId="yvor.1070534934092:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1213027913406">
                    <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
                  </node>
                  <node role="type" roleId="yvor.1070534934091:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="1213027913407" />
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199627204241">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1199627205587">
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199627204242">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199625160586" resolveInfo="movedNodes" />
                </node>
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvia.MoveNodesToNodeExpression" typeId="yvia.1199620920737:1" id="1199627210637">
                  <node role="whatToMove" roleId="yvia.1199619459778:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199627210638">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198082944517" resolveInfo="nodes" />
                  </node>
                  <node role="destination" roleId="yvia.1199619459779:1" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213027913408">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213027913403" resolveInfo="node" />
                  </node>
                  <node role="roleInTarget" roleId="yvia.1199620959025:1" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886185">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="1199627210643">
                      <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782887413">
                        <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199627210645">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1198082944517" resolveInfo="nodes" />
                        </node>
                        <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1239499388517" />
                      </node>
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886186">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetRole_()%cjava%dlang%dString" resolveInfo="getRole_" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199555238171">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1199555248173">
                <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886159">
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetModelOperation" typeId="yvim.1143234257716:16" id="1239499377313" />
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213027940876">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1213027913403" resolveInfo="targetNode" />
                  </node>
                </node>
                <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199555238172">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555206076" resolveInfo="targetModel" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.InstanceOfExpression" typeId="yvor.1081256982272:3" id="1198083023187">
            <node role="classType" roleId="yvor.1081256993305:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1198083029909">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~SNode" resolveInfo="SNode" />
            </node>
            <node role="leftExpression" roleId="yvor.1081256993304:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1198083021530">
              <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1198076162946" resolveInfo="target" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1199555270939">
          <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1199555270940">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199556389521">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199556389522">
                <property name="name" nameId="yvnu.1169194664001:0" value="module" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1199556389523">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="txlh.~IModule" resolveInfo="IModule" />
                </node>
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886210">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1207782886080">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199556397197">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555206076" resolveInfo="targetModel" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886081">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModel%dgetModelDescriptor()%cjetbrains%dmps%dsmodel%dSModelDescriptor" resolveInfo="getModelDescriptor" />
                    </node>
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1207782886211">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SModelDescriptor%dgetModule()%cjetbrains%dmps%dproject%dIModule" resolveInfo="getModule" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1213704091027">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213704091028">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1199555293199">
                  <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1199555293200">
                    <property name="name" nameId="yvnu.1169194664001:0" value="operationContext" />
                    <property name="isFinal" nameId="yvor.1176718929932:3" value="true" />
                    <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1199555293201">
                      <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="8n6q.~IOperationContext" resolveInfo="IOperationContext" />
                    </node>
                    <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1213028012308">
                      <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1213028012310">
                        <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="txlh.~ModuleContext%d&lt;init&gt;(jetbrains%dmps%dproject%dIModule,jetbrains%dmps%dproject%dMPSProject)" resolveInfo="ModuleContext" />
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199556427404">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199556389522" resolveInfo="module" />
                        </node>
                        <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="700745782152479251" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="1199555326181">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1199555326182">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1213099312700">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="1213099314313">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1213099320180">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1213099319005">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199625160586" resolveInfo="movedNodes" />
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="1213099320685" />
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="1213099312701">
                          <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1213099173577" resolveInfo="nodeToOpen" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1199555328358">
                    <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1199555331611" />
                    <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199555327341">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555293200" resolveInfo="operationContext" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1213704092735">
                <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1213704093520" />
                <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvia.ProjectExpression" typeId="yvia.1215084496797:1" id="700745782152479250" />
              </node>
            </node>
          </node>
          <node role="condition" roleId="yvor.1068580123160:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="1199555275491">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="1199555279822" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1199555274428">
              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1199555206076" resolveInfo="targetModel" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="updateModelClause" roleId="yvia.1189695176456:1" type="yvia.UpdateModelClause" typeId="yvia.1189694434958:1" id="1198082847528">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1198082847529">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvia.UpdateModelByDefaultOperation" typeId="yvia.1197382578687:1" id="1198082938234" />
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201528947033">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201528947034">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="1239347290441">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="1239347290442">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResults" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="1239347290443">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResults" resolveInfo="SearchResults" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="1239347290444">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="1239347290445">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%d&lt;init&gt;()" resolveInfo="SearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvix.ForEachStatement" typeId="yvix.1153943597977:7" id="1239347290446">
          <node role="variable" roleId="yvix.1153944400369:7" type="yvix.ForEachVariable" typeId="yvix.1153944193378:7" id="1239347290447">
            <property name="name" nameId="yvnu.1169194664001:0" value="selNode" />
          </node>
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1239347290448">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1239347327999">
              <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1239347329720">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239347328000">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1239347290442" resolveInfo="searchResults" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="1239347331755">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%daddAll(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResults)%cvoid" resolveInfo="addAll" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="1239347332397">
                    <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="1239347332398">
                      <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
                    </node>
                    <node role="searchNode" roleId="yvia.1212242678419:1" type="yvix.ForEachVariableReference" typeId="yvix.1153944233411:7" id="1239347357073">
                      <link role="variable" roleId="yvix.1153944258490:7" targetNodeId="1239347290447" resolveInfo="node" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" roleId="yvix.1153944424730:7" type="yvia.NodesExpression" typeId="yvia.1214999715318:1" id="1239347290449" />
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="1239347290471">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="1239347290472">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="1239347290442" resolveInfo="searchResults" />
          </node>
        </node>
      </node>
    </node>
    <node role="nodesToOpenClause" roleId="yvia.1213091780734:1" type="yvia.NodesToOpenClause" typeId="yvia.1213091609863:1" id="1213099166609">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1213099166610">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609612947">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="6528618226609612948">
            <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="6528618226609612950">
              <node role="elementType" roleId="yvix.1237721435807:7" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="6528618226609612952" />
              <node role="initValue" roleId="yvix.1237721435808:7" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="6528618226609612960">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1213099173577" resolveInfo="nodeToOpen" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1199457919461">
    <node role="arguments" roleId="yvia.1189693888592:1" type="yvia.RequiredUserEnteredArgument" typeId="yvia.1192792808079:1" id="1199457954885">
      <property name="name" nameId="yvnu.1169194664001:0" value="newName" />
      <property name="presentation" nameId="yvia.6895093993902236769:1" value="new name:" />
      <node role="argumentType" roleId="yvia.1190637130098:1" type="yvor.StringType" typeId="yvor.1225271177708:3" id="1225191250902" />
      <node role="initialValue" roleId="yvia.1198599595536:1" type="yvia.InitialValueClause" typeId="yvia.1198599668934:1" id="1199457987467">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1199457987468">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199457990515">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6528618226609779072">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="1215086306746" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="6528618226609779076">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="isApplicableClause" roleId="yvia.1189695159409:1" type="yvia.IsApplicableClause" typeId="yvia.1189694022607:1" id="1199458011650">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1199458011651">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="2752536614369082729">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="2752536614369082730">
            <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="4706738529699924056" resolveInfo="RenameUtil" />
            <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="4706738529699924062" resolveInfo="canBeRenamed" />
            <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="2752536614369082731" />
          </node>
        </node>
      </node>
    </node>
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1199458026193">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1199458026194">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1199458047098">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6528618226609779082">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6528618226609779077">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609594085" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="6528618226609779081">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Property_SetOperation" typeId="yvim.1138661924179:16" id="6528618226609779086">
              <node role="value" roleId="yvim.1138662048170:16" type="yvia.RequiredAdditionalArgumentReference" typeId="yvia.1189694084608:1" id="6528618226609779088">
                <link role="argument" roleId="yvia.1189694099406:1" targetNodeId="1199457954885" resolveInfo="newName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1201529733849">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1201529733850">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6528618226609591703">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="6528618226609591704">
            <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="6528618226609591705">
              <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="1200665013408">
    <node role="doRefactorClause" roleId="yvia.1189695170518:1" type="yvia.DoRefactorClause" typeId="yvia.1189694053795:1" id="1200667302899">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1200667302900">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="1200667315254">
          <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="1204227892485">
            <node role="operand" roleId="yvor.1197027771414:3" type="yvia.NodeExpression" typeId="yvia.1215000036307:1" id="6528618226609612964" />
            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_DeleteOperation" typeId="yvim.1140133623887:16" id="1200667317150" />
          </node>
        </node>
      </node>
    </node>
    <node role="keystroke" roleId="yvia.1199455308722:1" type="yvnl.CellKeyMapKeystroke" typeId="yvnl.1136916976737:32" id="1200919343189">
      <property name="modifiers" nameId="yvnl.1136923970223:32" value="alt" />
      <property name="keycode" nameId="yvnl.1136923970224:32" value="VK_DELETE" />
    </node>
    <node role="affectedNodesClause" roleId="yvia.1200932683928:1" type="yvia.AffectedNodesClause" typeId="yvia.1200932465350:1" id="1200933346055">
      <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="1200933346056">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8527005260551193786">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8527005260551193787">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResults" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527005260551193788">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResults" />
              <node role="parameter" roleId="yvor.1109201940907:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219647" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvia.ExecuteFindersExpression" typeId="yvia.1212242396240:1" id="8527005260551193789">
              <node role="finders" roleId="yvia.1212242658590:1" type="yvia.FinderReference" typeId="yvia.1212242507771:1" id="8527005260551193790">
                <link role="finderDeclaration" roleId="yvia.1212242603178:1" targetNodeId="yvnt.1198430852441" resolveInfo="NodeAndDescendantsUsages" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="8527005260551219723" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8527005260551219666">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8527005260551219667">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResultsList" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8527005260551219668">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527005260551219669">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                <node role="parameter" roleId="yvor.1109201940907:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219746" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219671">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219735">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551193787" resolveInfo="searchResults" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527005260551219673">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%dgetSearchResults()%cjava%dutil%dList" resolveInfo="getSearchResults" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8527005260551219674">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8527005260551219675">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResultsCopy" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvix.ListType" typeId="yvix.1151688443754:7" id="8527005260551219676">
              <node role="elementType" roleId="yvix.1151688676805:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527005260551219677">
                <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                <node role="parameter" roleId="yvor.1109201940907:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219757" />
              </node>
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8527005260551219679">
              <node role="creator" roleId="yvor.1145553007750:3" type="yvix.ListCreatorWithInit" typeId="yvix.1160600644654:7" id="8527005260551219680">
                <node role="elementType" roleId="yvix.1237721435807:7" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527005260551219681">
                  <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
                  <node role="parameter" roleId="yvor.1109201940907:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219766" />
                </node>
                <node role="copyFrom" roleId="yvix.1237731803878:7" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219683">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551219667" resolveInfo="searchResultsList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="8527005260551219684" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ForeachStatement" typeId="yvor.1144226303539:3" id="8527005260551219685">
          <node role="body" roleId="yvor.1154032183016:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8527005260551219686">
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8527005260551219687">
              <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8527005260551219688">
                <property name="name" nameId="yvnu.1169194664001:0" value="resultNode" />
                <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219782" />
                <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219691">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219692">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551219707" resolveInfo="searchResult" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527005260551219693">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResult%dgetObject()%cjava%dlang%dObject" resolveInfo="getObject" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="8527005260551219785">
              <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8527005260551219786">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8527005260551219806">
                  <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219807">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219808">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551193787" resolveInfo="searchResults" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8527005260551219809">
                      <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1alo.~SearchResults%dremove(jetbrains%dmps%dide%dfindusages%dmodel%dSearchResult)%cvoid" resolveInfo="remove" />
                      <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219810">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551219707" resolveInfo="searchResult" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219826">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219816">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219813">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551219688" resolveInfo="resultNode" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_GetAncestorsOperation" typeId="yvim.1173122760281:16" id="8527005260551219822">
                    <node role="parameter" roleId="yvim.1144104376918:16" type="yvim.OperationParm_Inclusion" typeId="yvim.1144100932627:16" id="8527005260551219825" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.ContainsOperation" typeId="yvix.1172254888721:7" id="8527005260551219830">
                  <node role="argument" roleId="yvix.1172256416782:7" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8527005260551219834">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvia.RefactoringContext_ConceptFunctionParameter" typeId="yvia.7953996722066256458:1" id="8527005260551219833" />
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvia.NodeOperation" typeId="yvia.7953996722066252915:1" id="8527005260551219839" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" roleId="yvor.1144226360166:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219706">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551219675" resolveInfo="searchResultsCopy" />
          </node>
          <node role="variable" roleId="yvor.1144230900587:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8527005260551219707">
            <property name="name" nameId="yvnu.1169194664001:0" value="searchResult" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8527005260551219708">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1alo.~SearchResult" resolveInfo="SearchResult" />
              <node role="parameter" roleId="yvor.1109201940907:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8527005260551219775" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.Statement" typeId="yvor.1068580123157:3" id="8527005260551219710" />
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="8527005260551219711">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8527005260551219712">
            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8527005260551193787" resolveInfo="searchResults" />
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="4706738529699924056">
    <node role="staticMethod" roleId="yvor.1070462273904:3" type="yvor.StaticMethodDeclaration" typeId="yvor.1081236700938:3" id="4706738529699924062">
      <property name="name" nameId="yvnu.1169194664001:0" value="canBeRenamed" />
      <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.BooleanType" typeId="yvor.1070534644030:3" id="4706738529699924066" />
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="4706738529699924064" />
      <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="4706738529699924065">
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453019">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453020">
            <property name="text" nameId="yvor.6329021646629104958:3" value="we won't rename nodes, for which there are registered name constrints" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.SingleLineComment" typeId="yvor.6329021646629104954:3" id="7376433222636453643">
          <node role="commentPart" roleId="yvor.6329021646629175155:3" type="yvor.TextCommentPart" typeId="yvor.6329021646629104957:3" id="7376433222636453644">
            <property name="text" nameId="yvor.6329021646629104958:3" value="if there are constrints, but they are not compiled, we can rename it" />
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4706738529699924214">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4706738529699924215">
            <property name="name" nameId="yvnu.1169194664001:0" value="manager" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="4706738529699924216">
              <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="1yx2.~ModelConstraintsManager" resolveInfo="ModelConstraintsManager" />
            </node>
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.StaticMethodCall" typeId="yvor.1081236700937:3" id="4706738529699924217">
              <link role="classConcept" roleId="yvor.1144433194310:3" targetNodeId="1yx2.~ModelConstraintsManager" resolveInfo="ModelConstraintsManager" />
              <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1yx2.~ModelConstraintsManager%dgetInstance()%cjetbrains%dmps%dsmodel%dconstraints%dModelConstraintsManager" resolveInfo="getInstance" />
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="4706738529699924218">
          <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="4706738529699924219">
            <property name="name" nameId="yvnu.1169194664001:0" value="nameProperty" />
            <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="4706738529699924220" />
            <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4706738529699924221">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4706738529699924222">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4706738529699924223">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvim.ConceptRefExpression" typeId="yvim.1172424058054:16" id="4706738529699924224">
                    <link role="conceptDeclaration" roleId="yvim.1172424100906:16" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
                  </node>
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkListAccess" typeId="yvim.1138056282393:16" id="4706738529699924225">
                    <link role="link" roleId="yvim.1138056546658:16" targetNodeId="yvnr.1071489727084:0" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvix.GetFirstOperation" typeId="yvix.1165525191778:7" id="4706738529699924226" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="4706738529699924227">
                <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ReturnStatement" typeId="yvor.1068581242878:3" id="4706738529699924228">
          <node role="expression" roleId="yvor.1068581517676:3" type="yvor.EqualsExpression" typeId="yvor.1068580123152:3" id="4706738529699924229">
            <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="4706738529699924230" />
            <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="4706738529699924231">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4706738529699924232">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4706738529699924215" resolveInfo="manager" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="4706738529699924233">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="1yx2.~ModelConstraintsManager%dgetNodePropertyGetter(jetbrains%dmps%dsmodel%dSNode,java%dlang%dString)%cjetbrains%dmps%dsmodel%dconstraints%dINodePropertyGetter" resolveInfo="getNodePropertyGetter" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="4706738529699924238">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4706738529699924067" resolveInfo="node" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="4706738529699924235">
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="4706738529699924219" resolveInfo="nameProperty" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="4706738529699924067">
        <property name="name" nameId="yvnu.1169194664001:0" value="node" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="4706738529699924068" />
      </node>
    </node>
    <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="4706738529699924057" />
    <node role="staticInnerClassifiers" roleId="yvor.1178616825527:3" type="yvor.ClassConcept" typeId="yvor.1068390468198:3" id="8311321388555090792">
      <property name="name" nameId="yvnu.1169194664001:0" value="NameComponent" />
      <node role="method" roleId="yvor.1107880067339:3" type="yvor.InstanceMethodDeclaration" typeId="yvor.1068580123165:3" id="8311321388555090847">
        <property name="name" nameId="yvnu.1169194664001:0" value="getName" />
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="8311321388555090851" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8311321388555090849" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8311321388555090850">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8311321388555090852">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090856">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090853">
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8311321388555090854">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8311321388555090833" resolveInfo="textField" />
                </node>
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8311321388555090855" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8311321388555094344">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="ko86.~JTextComponent%dgetText()%cjava%dlang%dString" resolveInfo="getText" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8311321388555090793" />
      <node role="constructor" roleId="yvor.1068390468201:3" type="yvor.ConstructorDeclaration" typeId="yvor.1068580123140:3" id="8311321388555090794">
        <node role="parameter" roleId="yvor.1068580123134:3" type="yvor.ParameterDeclaration" typeId="yvor.1068498886292:3" id="8311321388555090815">
          <property name="name" nameId="yvnu.1169194664001:0" value="node" />
          <node role="type" roleId="yvor.5680397130376446158:3" type="yvim.SNodeType" typeId="yvim.1138055754698:16" id="8311321388555090816" />
        </node>
        <node role="returnType" roleId="yvor.1068580123133:3" type="yvor.VoidType" typeId="yvor.1068581517677:3" id="8311321388555090795" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PublicVisibility" typeId="yvor.1146644602865:3" id="8311321388555090796" />
        <node role="body" roleId="yvor.1068580123135:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8311321388555090797">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="304997259309468654">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="304997259309468655">
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="304997259309468656">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dsetLayout(java%dawt%dLayoutManager)%cvoid" resolveInfo="setLayout" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="304997259309468658">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="304997259309488158">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~BorderLayout%d&lt;init&gt;()" resolveInfo="BorderLayout" />
                  </node>
                </node>
              </node>
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="304997259309468657" />
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8311321388555090819">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8311321388555090820">
              <property name="name" nameId="yvnu.1169194664001:0" value="result" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="8311321388555090821" />
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvju.ExecuteLightweightCommandStatement" typeId="yvju.1225441341971:23" id="8311321388555090822">
            <node role="commandClosureLiteral" roleId="yvju.1225441160167:23" type="yvju.CommandClosureLiteral" typeId="yvju.1225441216717:23" id="8311321388555090823">
              <node role="body" roleId="yviq.1199569916463:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="8311321388555090824">
                <node role="statement" roleId="yvor.1068581517665:3" type="yvor.IfStatement" typeId="yvor.1068580123159:3" id="3302086321381027636">
                  <node role="ifTrue" roleId="yvor.1068580123161:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3302086321381027637">
                    <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3302086321381027652">
                      <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3302086321381027655">
                        <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3302086321381027660">
                          <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="3302086321381027665">
                            <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                            <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="3302086321381027659">
                              <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090815" resolveInfo="node" />
                            </node>
                          </node>
                          <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="3302086321381027669">
                            <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnr.1071599776563:0" resolveInfo="role" />
                          </node>
                        </node>
                        <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="3302086321381027653">
                          <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090820" resolveInfo="result" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" roleId="yvor.1068580123160:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3302086321381027642">
                    <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="3302086321381027641">
                      <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090815" resolveInfo="node" />
                    </node>
                    <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="3302086321381027647">
                      <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="3302086321381027650">
                        <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnr.1071489288298:0" resolveInfo="LinkDeclaration" />
                      </node>
                    </node>
                  </node>
                  <node role="elsifClauses" roleId="yvor.1206060520071:3" type="yvor.ElsifClause" typeId="yvor.1206060495898:3" id="7874812549549777405">
                    <node role="condition" roleId="yvor.1206060619838:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7874812549549777406">
                      <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7874812549549777407">
                        <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090815" resolveInfo="node" />
                      </node>
                      <node role="operation" roleId="yvor.1197027833540:3" type="yvim.Node_IsInstanceOfOperation" typeId="yvim.1139621453865:16" id="7874812549549777408">
                        <node role="conceptArgument" roleId="yvim.1177027386292:16" type="yvim.RefConcept_Reference" typeId="yvim.1177026924588:16" id="7874812549549777409">
                          <link role="conceptDeclaration" roleId="yvim.1177026940964:16" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
                        </node>
                      </node>
                    </node>
                    <node role="statementList" roleId="yvor.1206060644605:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="7874812549549777410">
                      <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="7874812549549777411">
                        <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="7874812549549777412">
                          <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="7874812549549777413">
                            <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SNodeTypeCastExpression" typeId="yvim.1140137987495:16" id="7874812549549777414">
                              <link role="concept" roleId="yvim.1140138128738:16" targetNodeId="yvnu.1169194658468:0" resolveInfo="INamedConcept" />
                              <node role="leftExpression" roleId="yvim.1140138123956:16" type="yvor.ParameterReference" typeId="yvor.1068581242874:3" id="7874812549549777415">
                                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090815" resolveInfo="node" />
                              </node>
                            </node>
                            <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="7874812549549777416">
                              <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                            </node>
                          </node>
                          <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="7874812549549777417">
                            <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090820" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8311321388555090799">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090800">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8311321388555090813" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8311321388555090802">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent)%cjava%dawt%dComponent" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8311321388555090803">
                  <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8311321388555090804">
                    <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JLabel%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JLabel" />
                    <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="3302086321381027633">
                      <property name="value" nameId="yvor.1070475926801:3" value="new name:" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8311321388555090836">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="8311321388555090837">
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090838">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8311321388555090839" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8311321388555090840">
                  <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8311321388555090833" resolveInfo="textField" />
                </node>
              </node>
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.GenericNewExpression" typeId="yvor.1145552977093:3" id="8311321388555090841">
                <node role="creator" roleId="yvor.1145553007750:3" type="yvor.ClassCreator" typeId="yvor.1212685548494:3" id="8311321388555090842">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="t147.~JTextField%d&lt;init&gt;(java%dlang%dString)" resolveInfo="JTextField" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8311321388555090843">
                    <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8311321388555090820" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8311321388555090806">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090807">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8311321388555090814" />
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8311321388555090809">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="2uit.~Container%dadd(java%dawt%dComponent,java%dlang%dObject)%cvoid" resolveInfo="add" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8311321388555090844">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvor.ThisExpression" typeId="yvor.1070475354124:3" id="8311321388555090845" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvor.FieldReferenceOperation" typeId="yvor.1197029447546:3" id="8311321388555090846">
                    <link role="fieldDeclaration" roleId="yvor.1197029500499:3" targetNodeId="8311321388555090833" resolveInfo="textField" />
                  </node>
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StaticFieldReference" typeId="yvor.1070533707846:3" id="304997259309488161">
                  <link role="classifier" roleId="yvor.1144433057691:3" targetNodeId="2uit.~BorderLayout" resolveInfo="BorderLayout" />
                  <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="2uit.~BorderLayout%dCENTER" resolveInfo="CENTER" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="superclass" roleId="yvor.1165602531693:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8311321388555090798">
        <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JPanel" resolveInfo="JPanel" />
      </node>
      <node role="field" roleId="yvor.1068390468199:3" type="yvor.FieldDeclaration" typeId="yvor.1068390468200:3" id="8311321388555090833">
        <property name="name" nameId="yvnu.1169194664001:0" value="myTextField" />
        <node role="visibility" roleId="yvor.1178549979242:3" type="yvor.PrivateVisibility" typeId="yvor.1146644623116:3" id="8311321388555090834" />
        <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.ClassifierType" typeId="yvor.1107535904670:3" id="8311321388555090835">
          <link role="classifier" roleId="yvor.1107535924139:3" targetNodeId="t147.~JTextField" resolveInfo="JTextField" />
        </node>
      </node>
    </node>
  </root>
  <root id="6243486444683604044">
    <node role="part" roleId="yvj3.1177458178889:0" type="yvj3.MigrationScriptPart_Instance" typeId="yvj3.1177457850499:0" id="6243486444683604045">
      <property name="description" nameId="yvj3.1177457972041:0" value="Show getters for name property" />
      <link role="affectedInstanceConcept" roleId="yvj3.1177457957477:0" targetNodeId="yvig.1147467115080:8" resolveInfo="NodePropertyConstraint" />
      <node role="affectedInstanceUpdater" roleId="yvj3.1177458005323:0" type="yvj3.MigrationScriptPart_Instance_Updater" typeId="yvj3.1177458491964:0" id="6243486444683604046">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6243486444683604047" />
      </node>
      <node role="affectedInstancePredicate" roleId="yvj3.1177457957478:0" type="yvj3.MigrationScriptPart_Instance_Predicate" typeId="yvj3.1177458061340:0" id="6243486444683690985">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="6243486444683690986">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="6243486444683698873">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NPEEqualsExpression" typeId="yvor.1225271283259:3" id="6243486444683713666">
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="6243486444683713669">
                <property name="value" nameId="yvor.1070475926801:3" value="name" />
              </node>
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6243486444683713661">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="6243486444683698875">
                  <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="6243486444683698874" />
                  <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SLinkAccess" typeId="yvim.1138056143562:16" id="6243486444683713660">
                    <link role="link" roleId="yvim.1138056516764:16" targetNodeId="yvig.1147467295099:8" />
                  </node>
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="6243486444683713665">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1169194664001:0" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
  <root id="3180819252996380865">
    <node role="part" roleId="yvj3.1177458178889:0" type="yvj3.MigrationScriptPart_Instance" typeId="yvj3.1177457850499:0" id="3180819252996380866">
      <property name="description" nameId="yvj3.1177457972041:0" value="Restore Virtual Packages" />
      <property name="showAsIntention" nameId="yvj3.1225457189692:0" value="true" />
      <link role="affectedInstanceConcept" roleId="yvj3.1177457957477:0" targetNodeId="yvnu.1133920641626:0" resolveInfo="BaseConcept" />
      <node role="affectedInstanceUpdater" roleId="yvj3.1177458005323:0" type="yvj3.MigrationScriptPart_Instance_Updater" typeId="yvj3.1177458491964:0" id="3180819252996380867">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3180819252996380868">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.LocalVariableDeclarationStatement" typeId="yvor.1068581242864:3" id="8395149331650549294">
            <node role="localVariableDeclaration" roleId="yvor.1068581242865:3" type="yvor.LocalVariableDeclaration" typeId="yvor.1068581242863:3" id="8395149331650549295">
              <property name="name" nameId="yvnu.1169194664001:0" value="pack" />
              <node role="type" roleId="yvor.5680397130376446158:3" type="yvor.StringType" typeId="yvor.1225271177708:3" id="8395149331650549296" />
              <node role="initializer" roleId="yvor.1068431790190:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8395149331650549298">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="8395149331650549299">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="8395149331650549300" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8395149331650549301">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetProperty(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getProperty" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8395149331650549302">
                    <property name="value" nameId="yvor.1070475926801:3" value="package" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="8395149331650548854">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="8395149331650548858">
              <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="8395149331650548856">
                <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="8395149331650548855" />
              </node>
              <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="8395149331650548862">
                <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dsetProperty(java%dlang%dString,java%dlang%dString)%cvoid" resolveInfo="setProperty" />
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="8395149331650548863">
                  <property name="value" nameId="yvor.1070475926801:3" value="package" />
                </node>
                <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="8395149331650548865" />
              </node>
            </node>
          </node>
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3180819252996398029">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.AssignmentExpression" typeId="yvor.1068498886294:3" id="3180819252996398036">
              <node role="rValue" roleId="yvor.1068498886297:3" type="yvor.LocalVariableReference" typeId="yvor.1068581242866:3" id="8395149331650549304">
                <link role="variableDeclaration" roleId="yvor.1068581517664:3" targetNodeId="8395149331650549295" resolveInfo="name" />
              </node>
              <node role="lValue" roleId="yvor.1068498886295:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3180819252996398031">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="3180819252996398030" />
                <node role="operation" roleId="yvor.1197027833540:3" type="yvim.SPropertyAccess" typeId="yvim.1138056022639:16" id="3180819252996398035">
                  <link role="property" roleId="yvim.1138056395725:16" targetNodeId="yvnu.1193676396447:0" resolveInfo="virtualPackage" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="affectedInstancePredicate" roleId="yvj3.1177457957478:0" type="yvj3.MigrationScriptPart_Instance_Predicate" typeId="yvj3.1177458061340:0" id="3180819252996394575">
        <node role="body" roleId="yvor.1137022507850:3" type="yvor.StatementList" typeId="yvor.1068580123136:3" id="3180819252996394576">
          <node role="statement" roleId="yvor.1068581517665:3" type="yvor.ExpressionStatement" typeId="yvor.1068580123155:3" id="3180819252996397572">
            <node role="expression" roleId="yvor.1068580123156:3" type="yvor.NotEqualsExpression" typeId="yvor.1073239437375:3" id="3180819252996398022">
              <node role="leftExpression" roleId="yvor.1081773367580:3" type="yvor.DotExpression" typeId="yvor.1197027756228:3" id="3180819252996398023">
                <node role="operand" roleId="yvor.1197027771414:3" type="yvim.SemanticDowncastExpression" typeId="yvim.1145404486709:16" id="3180819252996398024">
                  <node role="leftExpression" roleId="yvim.1145404616321:16" type="yvj3.MigrationScriptPart_node" typeId="yvj3.1177458237937:0" id="3180819252996398025" />
                </node>
                <node role="operation" roleId="yvor.1197027833540:3" type="yvor.InstanceMethodCallOperation" typeId="yvor.1202948039474:3" id="3180819252996398026">
                  <link role="baseMethodDeclaration" roleId="yvor.1068499141037:3" targetNodeId="8n6q.~SNode%dgetProperty(java%dlang%dString)%cjava%dlang%dString" resolveInfo="getProperty" />
                  <node role="actualArgument" roleId="yvor.1068499141038:3" type="yvor.StringLiteral" typeId="yvor.1070475926800:3" id="3180819252996398027">
                    <property name="value" nameId="yvor.1070475926801:3" value="package" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" roleId="yvor.1081773367579:3" type="yvor.NullLiteral" typeId="yvor.1070534058343:3" id="3180819252996398028" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </root>
</model>

