<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590307(jetbrains.mps.lang.constraints.constraints)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1(jetbrains.mps.lang.constraints)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="13744753-c81f-424a-9c1b-cf8943bf4e86(jetbrains.mps.lang.sharedConcepts)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590307(jetbrains.mps.lang.constraints.constraints)" version="9" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="8" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ba(jetbrains.mps.lang.sharedConcepts.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="4" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902bc(jetbrains.mps.lang.sharedConcepts.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <maxImportIndex value="24" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c8959030d(jetbrains.mps.lang.constraints.structure)" version="8" />
  <import index="5" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <import index="10" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="11" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <import index="20" modelUID="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" version="-1" />
  <import index="22" modelUID="r:00000000-0000-4000-0000-011c89590306(jetbrains.mps.lang.constraints.behavior)" version="-1" />
  <import index="23" modelUID="r:3270011d-8b2d-4938-8dff-d256a759e017(jetbrains.mps.lang.behavior.structure)" version="-1" />
  <import index="24" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints" id="1213100797365">
    <link role="concept" targetNodeId="1.1213093968558" resolveInfo="ConceptConstraints" />
    <node role="property" type="jetbrains.mps.lang.constraints.structure.NodePropertyConstraint" id="1213100884144">
      <link role="applicableProperty" targetNodeId="11.1169194664001" resolveInfo="name" />
      <node role="propertyGetter" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertyGetter" id="1213100927946">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213100927947">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213100929839">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213100929840">
              <property name="name" value="conceptName" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4853609160932866520" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213100934016">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213100934017">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213100946736">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213100947769">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213100952543">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213100949414">
                      <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_node" id="1213100949163" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1213100952198">
                        <link role="link" targetNodeId="1.1213093996982" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1213100953109">
                      <link role="property" targetNodeId="11.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213100946737">
                    <link role="variableDeclaration" targetNodeId="1213100929840" resolveInfo="conceptName" />
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213100937665">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213100934911">
                <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_node" id="1213100934660" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1213100937352">
                  <link role="link" targetNodeId="1.1213093996982" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1213100939075" />
            </node>
            <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213100942967">
              <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213100942968">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213100955391">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213100956627">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213100957193">
                      <property name="value" value="???" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213100955392">
                      <link role="variableDeclaration" targetNodeId="1213100929840" resolveInfo="conceptName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213100959039">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213100961401">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213100961951">
                <property name="value" value="_Constraints" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213100960994">
                <link role="variableDeclaration" targetNodeId="1213100929840" resolveInfo="conceptName" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="canBeRoot" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeARoot" id="1227089025593">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1227089025594">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1227089025595">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1227089025596">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference" id="1227089028397">
              <link role="enumConstantDeclaration" targetNodeId="24.~LanguageAspect.CONSTRAINTS" resolveInfo="CONSTRAINTS" />
              <link role="enumClass" targetNodeId="24.~LanguageAspect" resolveInfo="LanguageAspect" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1227089025598">
              <link role="baseMethodDeclaration" targetNodeId="24.~LanguageAspect.is(jetbrains.mps.smodel.SModel):boolean" resolveInfo="is" />
              <node role="actualArgument" type="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_model" id="1227089025599" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints" id="1213104781819">
    <link role="concept" targetNodeId="1.1147467115080" resolveInfo="NodePropertyConstraint" />
    <node role="referent" type="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" id="1213104781820">
      <link role="applicableLink" targetNodeId="1.1147467295099" />
      <node role="searchScopeFactory" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1213104781821">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104781822">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.SingleLineComment" id="7376433222636453721">
            <node role="commentPart" type="jetbrains.mps.baseLanguage.structure.TextCommentPart" id="7376433222636453722">
              <property name="text" value="properties declared in specified concept" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213104781823">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213104781824">
              <property name="name" value="applicableConcept" />
              <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1213104781825">
                <link role="concept" targetNodeId="5.1169125787135" resolveInfo="AbstractConceptDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104781826">
                <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode" id="1213104781827" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1213104781828">
                  <link role="baseMethodDeclaration" targetNodeId="22.1213877292345" resolveInfo="getApplicableConcept" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213104781829">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104781830">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1248408370189085166">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1248408370189085167">
                  <property name="name" value="root" />
                  <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1248408370189085168" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1248408370189085169">
                    <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="1248408370189085170" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation" id="1248408370189085171" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="6277721878946469994">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6277721878946469995">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6277721878946470006">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6277721878946470007">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946470008">
                        <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="6277721878946470009">
                          <link role="concept" targetNodeId="1.1213093968558" resolveInfo="ConceptConstraints" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470010">
                            <link role="variableDeclaration" targetNodeId="1248408370189085167" resolveInfo="containingRoot" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6277721878946470011">
                          <link role="link" targetNodeId="1.1213093996982" />
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470012">
                        <link role="variableDeclaration" targetNodeId="1213104781824" resolveInfo="applicableConcept" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946469999">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946469998">
                    <link role="variableDeclaration" targetNodeId="1248408370189085167" resolveInfo="containingRoot" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="6277721878946470003">
                    <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="6277721878946470005">
                      <link role="conceptDeclaration" targetNodeId="1.1213093968558" resolveInfo="ConceptConstraints" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="6277721878946470013">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6277721878946470014">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6277721878946470015">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6277721878946470016">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946470017">
                          <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="6277721878946470018">
                            <link role="concept" targetNodeId="23.1225194240794" resolveInfo="ConceptBehavior" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470019">
                              <link role="variableDeclaration" targetNodeId="1248408370189085167" resolveInfo="root" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6277721878946470022">
                            <link role="link" targetNodeId="23.1225194240799" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470021">
                          <link role="variableDeclaration" targetNodeId="1213104781824" resolveInfo="applicableConcept" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213104781840">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213104781841" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104781842">
                <link role="variableDeclaration" targetNodeId="1213104781824" resolveInfo="applicableConcept" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213104781843">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104781846">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104781847">
                <link role="variableDeclaration" targetNodeId="1213104781824" resolveInfo="applicableConcept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1213104781848">
                <link role="baseMethodDeclaration" targetNodeId="20.1213877394546" resolveInfo="getPropertyDeclarations" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.constraints.structure.ConceptConstraints" id="1213104781931">
    <link role="concept" targetNodeId="1.1148687176410" resolveInfo="NodeReferentConstraint" />
    <node role="referent" type="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" id="1213104781932">
      <link role="applicableLink" targetNodeId="1.1148687202698" />
      <node role="searchScopeFactory" type="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Factory" id="1213104781933">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104781934">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.SingleLineComment" id="7376433222636453535">
            <node role="commentPart" type="jetbrains.mps.baseLanguage.structure.TextCommentPart" id="7376433222636453536">
              <property name="text" value="links declared in specified concept" />
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213104781935">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213104781936">
              <property name="name" value="applicableConcept" />
              <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1213104781937">
                <link role="concept" targetNodeId="5.1169125787135" resolveInfo="AbstractConceptDeclaration" />
              </node>
              <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104781938">
                <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode" id="1213104781939" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1213104781940">
                  <link role="baseMethodDeclaration" targetNodeId="22.1213877399322" resolveInfo="getApplicableConcept" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213104781941">
            <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213104781942">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="6277721878946469964">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="6277721878946469965">
                  <property name="name" value="root" />
                  <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="6277721878946469966" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946469967">
                    <node role="operand" type="jetbrains.mps.lang.constraints.structure.ConceptParameter_ReferentSearchScope_enclosingNode" id="6277721878946469968" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation" id="6277721878946469969" />
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="6277721878946469944">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6277721878946469945">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6277721878946470025">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6277721878946470026">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946470027">
                        <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="6277721878946470028">
                          <link role="concept" targetNodeId="1.1213093968558" resolveInfo="ConceptConstraints" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470029">
                            <link role="variableDeclaration" targetNodeId="6277721878946469965" resolveInfo="root" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6277721878946470030">
                          <link role="link" targetNodeId="1.1213093996982" />
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470031">
                        <link role="variableDeclaration" targetNodeId="1213104781936" resolveInfo="applicableConcept" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946469949">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946469970">
                    <link role="variableDeclaration" targetNodeId="6277721878946469965" resolveInfo="root" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="6277721878946469953">
                    <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="6277721878946470023">
                      <link role="conceptDeclaration" targetNodeId="1.1213093968558" resolveInfo="ConceptConstraints" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="6277721878946469978">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6277721878946469979">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="6277721878946470032">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="6277721878946470033">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6277721878946470034">
                          <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="6277721878946470035">
                            <link role="concept" targetNodeId="23.1225194240794" resolveInfo="ConceptBehavior" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470036">
                              <link role="variableDeclaration" targetNodeId="6277721878946469965" resolveInfo="root" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="6277721878946470037">
                            <link role="link" targetNodeId="23.1225194240799" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="6277721878946470038">
                          <link role="variableDeclaration" targetNodeId="1213104781936" resolveInfo="applicableConcept" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213104781952">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213104781953" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104781954">
                <link role="variableDeclaration" targetNodeId="1213104781936" resolveInfo="applicableConcept" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213104781955">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213104781958">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213104781959">
                <link role="variableDeclaration" targetNodeId="1213104781936" resolveInfo="applicableConcept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="1213104781960">
                <link role="baseMethodDeclaration" targetNodeId="20.1213877394496" resolveInfo="getReferenceLinkDeclarations" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

