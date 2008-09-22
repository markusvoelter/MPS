<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024800(jetbrains.mps.xml.actions)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.actionsLanguage">
    <languageAspect modelUID="r:1222075024036(jetbrains.mps.bootstrap.actionsLanguage.constraints)" version="16" />
    <languageAspect modelUID="r:1222075024040(jetbrains.mps.bootstrap.actionsLanguage.structure)" version="22" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
    <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
    <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.strings">
    <languageAspect modelUID="r:1222075024382(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins">
    <languageAspect modelUID="r:1222075024046(jetbrains.mps.bootstrap.helgins.constraints)" version="17" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.constraints" version="16" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.structure" version="22" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.strings.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024012(jetbrains.mps.bootstrap.structureLanguage.constraints)" version="11" />
  <languageAspect modelUID="r:1222075024058(jetbrains.mps.bootstrap.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024192(jetbrains.mps.patterns.constraints)" version="2" />
  <devkit namespace="jetbrains.mps.devkit.language-design" />
  <maxImportIndex value="3" />
  <import index="1" modelUID="jetbrains.mps.xml.structure" version="-1" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.core.structure" version="-1" />
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1220989580562">
    <property name="name" value="substitute ElementPart" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1220989638938">
      <link role="applicableConcept" targetNodeId="1.1107866767486" resolveInfo="ElementPart" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart" id="1220989709127">
        <link role="concept" targetNodeId="1.1107866821377" resolveInfo="Text" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.SimpleItemSubstitutePart" id="1220989812816">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_Substitute_Handler" id="1220989812817">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220989812818">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220989964204">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220989964205">
                  <property name="name" value="text" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220989964206">
                    <link role="concept" targetNodeId="1.1107866821377" resolveInfo="Text" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220989973333">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220989973334">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220989973335">
                        <link role="concept" targetNodeId="1.1107866821377" resolveInfo="Text" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220989978759">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220989983749">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220989980652">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220989978760">
                      <link role="variableDeclaration" targetNodeId="1220989964205" resolveInfo="element" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220989981233">
                      <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="rValue" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220989991190" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220989994145">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220989996381">
                  <link role="variableDeclaration" targetNodeId="1220989964205" resolveInfo="element" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_SubstituteString" id="1220989835678">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220989835679">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220990243225">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220990243226">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220990261092">
                    <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220990264063" />
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220990794497">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220990794498">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220990794499" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220990794500">
                      <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220990794501">
                        <property name="value" value="&lt;" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220990269861">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220990269863" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActions" id="1220992142083">
    <property name="name" value="substitute Attribute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.NodeSubstituteActionsBuilder" id="1220992153912">
      <link role="applicableConcept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart" id="1220992168867">
        <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.SimpleItemSubstitutePart" id="1220992177572">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_Substitute_Handler" id="1220992177573">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220992177574">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220992363474">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220992363475">
                  <property name="name" value="attr" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220992363476">
                    <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220992373494">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220992373495">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220992373496">
                        <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220992382029">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220992385973">
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220992383437">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220992382030">
                      <link role="variableDeclaration" targetNodeId="1220992363475" resolveInfo="attr" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220992384034">
                      <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220993027869">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220992388851" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.strings.structure.TrimOperation" id="1220993030388" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220992391509">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220992393433">
                  <link role="variableDeclaration" targetNodeId="1220992363475" resolveInfo="attr" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_SubstituteString" id="1220992214856">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220992214857">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220992270238">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220992270239" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformHintSubstituteActions" id="1220992737642">
    <property name="name" value="transform Attribute" />
    <node role="actionsBuilder" type="jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformHintSubstituteActionsBuilder" id="1220992758002">
      <link role="applicableConcept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
      <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.AddMenuPart" id="1220992862863">
        <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
        <node role="part" type="jetbrains.mps.bootstrap.actionsLanguage.structure.SimpleSideTransformMenuPart" id="1220992876614">
          <node role="handler" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_SideTransform_Handler" id="1220992876615">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220992876616">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1220992925981">
                <property name="value" value=" add next attribute" />
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220992946295">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220992946296">
                  <property name="name" value="nextAttr" />
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220992946297">
                    <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
                  </node>
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1220992954643">
                    <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1220992954644">
                      <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220992954645">
                        <link role="concept" targetNodeId="1.1107866742882" resolveInfo="Attribute" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220992989922">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1220992999524">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220993017617">
                    <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220993001481" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.strings.structure.TrimOperation" id="1220993020790" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220992994989">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220992989923">
                      <link role="variableDeclaration" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220992995617">
                      <link role="property" targetNodeId="3.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220992976225">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220992978649">
                  <node role="operand" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_sourceNode" id="1220992976226" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation" id="1220992981965">
                    <node role="insertedNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220992985013">
                      <link role="variableDeclaration" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220993506808">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220993509825">
                  <link role="variableDeclaration" targetNodeId="1220992946296" resolveInfo="nextAttr" />
                </node>
              </node>
            </node>
          </node>
          <node role="matchingText" type="jetbrains.mps.bootstrap.actionsLanguage.structure.QueryFunction_SideTransform_String" id="1220992891930">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220992891931">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220992913744">
                <node role="expression" type="jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptFunctionParameter_pattern" id="1220992913745" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

