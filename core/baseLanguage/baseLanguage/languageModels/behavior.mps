<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.behavior">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.constraints" version="9" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.quotation" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.helgins">
    <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  </language>
  <language namespace="jetbrains.mps.internal.collections">
    <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  </language>
  <language namespace="jetbrains.mps.closures">
    <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
    <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.dataFlow.constraints" version="4" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.constraints" version="16" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.actionsLanguage.structure" version="22" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.intentionsLanguage.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <maxImportIndex value="16" />
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="2" modelUID="java.lang@java_stub" version="-1" />
  <import index="3" modelUID="jetbrains.mps.project@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="6" modelUID="jetbrains.mps.smodel.search@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.baseLanguage.search@java_stub" version="-1" />
  <import index="8" modelUID="java.util@java_stub" version="-1" />
  <import index="9" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="10" modelUID="jetbrains.mps.dataFlow@java_stub" version="-1" />
  <import index="11" modelUID="jetbrains.mps.reloading@java_stub" version="-1" />
  <import index="12" modelUID="java.lang.reflect@java_stub" version="-1" />
  <import index="13" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="14" modelUID="javax.swing@java_stub" version="-1" />
  <import index="15" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="16" modelUID="jetbrains.mps.baseLanguage.structure@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877208326">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1068581242867" resolveInfo="LongType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877208327">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877208328">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877208329">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877208330">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877208331">
              <link role="classifier" targetNodeId="2.~Long" resolveInfo="Long" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877208332">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723923" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877208333">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877208334">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877208335">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877208336">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877208337">
              <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
              <link role="variableDeclaration" targetNodeId="2.~Integer.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877208338">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724547" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877208339">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877208340" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877220084">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1170345865475" resolveInfo="AnonymousClass" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877220085">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877220086" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877221089">
    <link role="concept" targetNodeId="1.1212170275853" resolveInfo="IValidIdentifier" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877221090">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877221091" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877223481">
    <link role="concept" targetNodeId="1.1070475354124" resolveInfo="ThisExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877223482">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877223483" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1215682129821">
      <property name="name" value="getPossibleClassifiers" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1215682179498">
        <link role="elementConcept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215682129823">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1215682175145">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1215682175146">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1215682175147">
              <link role="elementConcept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1215682175148">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1215682175149">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1215682175150">
                  <link role="elementConcept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1215682175151">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1215682175152">
            <property name="name" value="current" />
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215682175153">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1215682191484" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1215682175155">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1215682175156">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215682175157">
                  <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                </node>
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215682175158">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1215682175159">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215682175160">
                <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1215682175161">
                  <link role="variable" targetNodeId="1215682175152" resolveInfo="current" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1215682175162">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215682175163">
                    <link role="conceptDeclaration" targetNodeId="1.1170345865475" resolveInfo="AnonymousClass" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215682175164">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1215682175165">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215682175166">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215682175167">
                      <link role="variableDeclaration" targetNodeId="1215682175146" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1215682175168">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215682175169">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1215682175170">
                          <link role="concept" targetNodeId="1.1170345865475" resolveInfo="AnonymousClass" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1215682175171">
                            <link role="variable" targetNodeId="1215682175152" resolveInfo="current" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1215682175172">
                          <link role="link" targetNodeId="1.1170346070688" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1215682175173">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215682175174">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1215682175175">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215682175176">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215682175177">
                        <link role="variableDeclaration" targetNodeId="1215682175146" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1215682175178">
                        <node role="argument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1215682175179">
                          <link role="variable" targetNodeId="1215682175152" resolveInfo="current" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1215682175180">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215682175181">
            <link role="variableDeclaration" targetNodeId="1215682175146" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723956" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877231045">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1107796713796" resolveInfo="Interface" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877231046">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877231047" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877233871">
    <link role="concept" targetNodeId="1.1152728232947" resolveInfo="Closure" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877233872">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877233873" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877236051">
    <link role="concept" targetNodeId="1.1070534058343" resolveInfo="NullLiteral" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877236052">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877236053">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877236054">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877236055" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877236056">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877236057">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877236058">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723805" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877236059">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877236060" />
    </node>
  </node>
  <visible index="2" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877243781">
    <link role="concept" targetNodeId="1.1068390468200" resolveInfo="FieldDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243782">
      <property name="name" value="getGetterName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877243783">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243784">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877243785">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877243786">
            <property name="name" value="prefix" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877243787">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877243788">
              <property name="value" value="get" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877243789">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243790">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243791">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877243792">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877243793">
                  <property name="value" value="is" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877243794">
                  <link role="variableDeclaration" targetNodeId="1213877243786" resolveInfo="prefix" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1213877243795">
            <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243796">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243797" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243798">
                <link role="link" targetNodeId="1.1068431790188" />
              </node>
            </node>
            <node role="supertypeExpression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877243799">
              <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243800" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243801">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877243802">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877243803">
              <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
              <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243804">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243805" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877243806">
                  <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877243807">
              <link role="variableDeclaration" targetNodeId="1213877243786" resolveInfo="prefix" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724242" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243808">
      <property name="name" value="hasGetter" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243809" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243810">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877243811">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877243812">
            <property name="name" value="fieldDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243813">
              <link role="concept" targetNodeId="1.1068390468200" resolveInfo="FieldDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243814" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243815">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243816">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243817">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243818">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243819">
                  <link role="variableDeclaration" targetNodeId="1213877243831" resolveInfo="classConcept" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877243820">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1213877243821">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1213877243822">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877243823">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243824">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243825">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243826">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877243827">
                          <link role="variableDeclaration" targetNodeId="1213877243812" resolveInfo="fieldDeclaration" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877243828">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877243833" resolveInfo="isGetter" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877243829">
                            <link role="closureParameter" targetNodeId="1213877243823" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1213877243830" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877243831">
        <property name="name" value="classConcept" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243832">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724024" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243833">
      <property name="name" value="isGetter" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243834" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243835">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243836">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877243837">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877243838">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1213877243839">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243840">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243841" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243842">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243843">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243844">
                    <link role="variableDeclaration" targetNodeId="1213877243859" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243845">
                    <link role="link" targetNodeId="1.1068580123133" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243846">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243847">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243848" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877243849">
                    <link role="conceptMethodDeclaration" targetNodeId="1213877243782" resolveInfo="getGetterName" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877243850">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243851">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243852">
                      <link role="variableDeclaration" targetNodeId="1213877243859" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877243853">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243854">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243855">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243856">
                  <link role="variableDeclaration" targetNodeId="1213877243859" resolveInfo="method" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877243857">
                  <link role="link" targetNodeId="1.1068580123134" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsEmptyOperation" id="1213877243858" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877243859">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243860">
          <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155724910" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243861">
      <property name="name" value="getSetterName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877243862">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243863">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243864">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877243865">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877243866">
              <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
              <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243867">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243868" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877243869">
                  <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877243870">
              <property name="value" value="set" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724004" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243871">
      <property name="name" value="hasSetter" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243872" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243873">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877243874">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877243875">
            <property name="name" value="fieldDeclaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243876">
              <link role="concept" targetNodeId="1.1068390468200" resolveInfo="FieldDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243877" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243878">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243879">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243880">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243881">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243882">
                  <link role="variableDeclaration" targetNodeId="1213877243894" resolveInfo="classConcept" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877243883">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1213877243884">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1213877243885">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877243886">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243887">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243888">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243889">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877243890">
                          <link role="variableDeclaration" targetNodeId="1213877243875" resolveInfo="fieldDeclaration" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877243891">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877243896" resolveInfo="isSetter" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877243892">
                            <link role="closureParameter" targetNodeId="1213877243886" resolveInfo="it" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1213877243893" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877243894">
        <property name="name" value="classConcept" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243895">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723981" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243896">
      <property name="name" value="isSetter" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243897" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243898">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243899">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877243900">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877243901">
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression" id="1213877243902">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243903">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243904">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243905">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243906">
                        <link role="variableDeclaration" targetNodeId="1213877243928" resolveInfo="method" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877243907">
                        <link role="link" targetNodeId="1.1068580123134" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877243908" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243909">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243910">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243911" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243912">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243913">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243914">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243915" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877243916">
                    <link role="conceptMethodDeclaration" targetNodeId="1213877243861" resolveInfo="getSetterName" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877243917">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243918">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243919">
                      <link role="variableDeclaration" targetNodeId="1213877243928" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877243920">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877243921">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877243922">
                <property name="value" value="1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243923">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243924">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877243925">
                    <link role="variableDeclaration" targetNodeId="1213877243928" resolveInfo="method" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877243926">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1213877243927" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877243928">
        <property name="name" value="method" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877243929">
          <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155725016" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877243930">
      <property name="name" value="isInitializable" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517488" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243931">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243932">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877243933">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877243934" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724699" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877243935">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877243936">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877243937">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243938">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877243939">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877243940" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877243941">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1213877243942">
              <link role="concept" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877267257">
    <link role="concept" targetNodeId="1.1083245097125" resolveInfo="EnumClass" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877267258">
      <property name="name" value="findConstantByName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877267259">
        <link role="concept" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877267260">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877267261">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267262">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877267263" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877267264">
              <link role="link" targetNodeId="1.1083245396908" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877267265">
            <property name="name" value="constant" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877267266">
              <link role="concept" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877267267">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877267268">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267269">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877267270">
                  <link role="variableDeclaration" targetNodeId="1213877267280" resolveInfo="name" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877267271">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equalsIgnoreCase(java.lang.String):boolean" resolveInfo="equalsIgnoreCase" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267272">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877267273">
                      <link role="variableDeclaration" targetNodeId="1213877267265" resolveInfo="constant" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877267274">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877267275">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877267276">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877267277">
                    <link role="variableDeclaration" targetNodeId="1213877267265" resolveInfo="constant" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877267278">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877267279" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877267280">
        <property name="name" value="name" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877267281">
          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723999" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877267282">
      <property name="name" value="getMembers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877531970" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877267283">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877267284">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877267285">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877267286" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267287">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1213877267288" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877267289">
                <link role="conceptMethodDeclaration" targetNodeId="1213877531970" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877267290">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267291">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877267292">
              <link role="variableDeclaration" targetNodeId="1213877267285" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877267293">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877267294">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877267295" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877267296">
                  <link role="link" targetNodeId="1.1083245396908" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877267297">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877267298">
            <link role="variableDeclaration" targetNodeId="1213877267285" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877267299" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724364" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1214840544944">
      <property name="name" value="hasStaticMemebers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1214840444586" resolveInfo="hasStaticMemebers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214840544946">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214840549442">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1214840553047">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1214840565287">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1214840565701">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840561290">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840557622">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1214840557304" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214840559254">
                    <link role="link" targetNodeId="1.1083245396908" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.CountOperation" id="1214840563687" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840551160">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1214840550921" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1214840551980">
                <link role="conceptMethodDeclaration" targetNodeId="1214840444586" resolveInfo="hasStaticMemebers" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1214840546359" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724330" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877267300">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877267301" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877269056">
    <link role="concept" targetNodeId="1.1068581242875" resolveInfo="PlusExpression" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877269057">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877269058">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877269059">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877269060">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269061">
              <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877269062">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877269063">
            <property name="name" value="leftExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269064">
              <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877269065">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877269066">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877269067" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877269068">
                  <link role="link" targetNodeId="1.1081773367580" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877269069">
                <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877269070">
                  <link role="variableDeclaration" targetNodeId="1213877269100" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877269071">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877269072">
            <property name="name" value="rightExpression" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269073">
              <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877269074">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877269075">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877269076" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877269077">
                  <link role="link" targetNodeId="1.1081773367579" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877269078">
                <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877269079">
                  <link role="variableDeclaration" targetNodeId="1213877269100" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877269080">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877269081">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877269082">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877269083">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877269084">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877269085">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877269086">
                      <link role="variableDeclaration" targetNodeId="1213877269072" resolveInfo="rightExpression" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877269087">
                      <link role="variableDeclaration" targetNodeId="1213877269063" resolveInfo="leftExpression" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877269088">
                    <property name="value" value="" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877269089">
                  <link role="variableDeclaration" targetNodeId="1213877269060" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" id="1213877269090">
            <node role="classType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269091">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877269092">
              <link role="variableDeclaration" targetNodeId="1213877269063" resolveInfo="leftExpression" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877269093">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877269094">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1213877269095">
                <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877269096">
                  <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877269097">
                    <link role="baseMethodDeclaration" targetNodeId="2.~UnsupportedOperationException.&lt;init&gt;()" resolveInfo="UnsupportedOperationException" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877269098">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877269099">
            <link role="variableDeclaration" targetNodeId="1213877269060" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877269100">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269101">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877269102">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724108" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877269103">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877269104" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877270650">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534370425" resolveInfo="IntegerType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877270651">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877270652">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877270653">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877270654">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877270655">
              <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877270656">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723962" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877270657">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877270658">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877270659">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877270660">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877270661">
              <link role="classifier" targetNodeId="2.~Integer" resolveInfo="Integer" />
              <link role="variableDeclaration" targetNodeId="2.~Integer.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877270662">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724869" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877270663">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877270664" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877271259">
    <property name="package" value="property.implementation.default" />
    <link role="concept" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877271260">
      <property name="name" value="hasSetter" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877430658" resolveInfo="hasSetter" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877271261">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877271262">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877271263">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877271264" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723979" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877271265">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877271266" />
    </node>
  </node>
  <visible index="3" modelUID="jetbrains.mps.core.behavior" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877272873">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1109283449304" resolveInfo="TypeVariableReference" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877272874">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877272875">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877272876">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877272877">
            <property name="name" value="decl" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877272878">
              <link role="concept" targetNodeId="1.1109279763828" resolveInfo="TypeVariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877272879">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877272880" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877272881">
                <link role="link" targetNodeId="1.1109283546497" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877272882">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877272883">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877272884" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877272885">
              <link role="variableDeclaration" targetNodeId="1213877272877" resolveInfo="decl" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877272886">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877272887">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877272888">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877272889">
                  <link role="variableDeclaration" targetNodeId="1213877272877" resolveInfo="decl" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877272890">
                  <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877272891">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877272892">
            <property name="value" value="?typevar_ref?" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877272893">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724816" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877272894">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877272895" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877278336">
    <property name="package" value="property.implementation.default" />
    <link role="concept" targetNodeId="1.1202077725299" resolveInfo="DefaultSetAccessor" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877278337">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877278338">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877278339">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877278340">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877278341">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877278342" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877278343">
                <link role="link" targetNodeId="1.1202077744034" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1213877278344">
              <link role="concept" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877287006">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903607971" resolveInfo="WildCardType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877287007">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877287008">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877287009">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877287010">
            <property name="value" value="?" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877287011">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723848" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877287012">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877287013" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877302554">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068581242872" resolveInfo="NewExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877302555">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877302556" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877303489">
    <link role="concept" targetNodeId="1.1172008963197" resolveInfo="LocalStaticFieldReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877303490">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877303491" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877305150">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1178285077437" resolveInfo="ClassifierMember" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877305151">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877305152" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877306256">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877306257">
      <property name="name" value="getVisibleMembers" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877306258">
        <link role="elementConcept" targetNodeId="1.1178285077437" resolveInfo="ClassifierMember" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306259">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877306260">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877306261">
            <property name="name" value="ct" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877306262">
              <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877306263">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1213877306264">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877306265">
                  <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306266">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877306267">
            <node role="rValue" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306268" />
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306269">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306270">
                <link role="variableDeclaration" targetNodeId="1213877306261" resolveInfo="ct" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877306271">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877306272">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877306273">
            <property name="name" value="ss" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877306274">
              <link role="classifier" targetNodeId="6.~ISearchScope" resolveInfo="ISearchScope" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877306275">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877306276">
                <link role="baseMethodDeclaration" targetNodeId="7.~ClassifierVisibleMembersScope.&lt;init&gt;(jetbrains.mps.baseLanguage.structure.ClassifierType,jetbrains.mps.smodel.SNode,int)" resolveInfo="ClassifierVisibleMembersScope" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306277">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306278">
                    <link role="variableDeclaration" targetNodeId="1213877306261" resolveInfo="ct" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1213877306279" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877306280">
                  <link role="variableDeclaration" targetNodeId="1213877306288" resolveInfo="contextNode" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877306281">
                  <link role="variableDeclaration" targetNodeId="1213877306290" resolveInfo="constraint" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877306282">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1213877306283">
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877306284">
              <link role="elementConcept" targetNodeId="1.1178285077437" resolveInfo="ClassifierMember" />
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306285">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306286">
                <link role="variableDeclaration" targetNodeId="1213877306273" resolveInfo="ss" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877306287">
                <link role="baseMethodDeclaration" targetNodeId="6.~ISearchScope.getNodes():java.util.List" resolveInfo="getNodes" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877306288">
        <property name="name" value="contextNode" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877306289" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877306290">
        <property name="name" value="constraint" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1213877306291" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723905" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877306292">
      <property name="name" value="getFqName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306293">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877306294">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877306295">
            <property name="name" value="parentClassifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877306296">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306297">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306298" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213877306299">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877306300">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877306301">
                    <link role="conceptDeclaration" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877306302">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306303">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877306304">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877306305">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877306306">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306307">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306308" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877306309">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877306310">
                    <property name="value" value="." />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306311">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306312">
                    <link role="variableDeclaration" targetNodeId="1213877306295" resolveInfo="parentClassifier" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877306313">
                    <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877306314">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306315">
              <link role="variableDeclaration" targetNodeId="1213877306295" resolveInfo="parentClassifier" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877306316" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877306317">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306318">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1213877306319" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877306320">
              <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877306321">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725034" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877306322">
      <property name="name" value="getMembers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877531970" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306323">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877306324">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877306325">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877306326" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877306327">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1213877306328">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877306329" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306330">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306331">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306332">
              <link role="variableDeclaration" targetNodeId="1213877306325" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877306333">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306334">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306335" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877306336">
                  <link role="link" targetNodeId="1.1128555889557" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306337">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306338">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306339">
              <link role="variableDeclaration" targetNodeId="1213877306325" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877306340">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306341">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306342" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877306343">
                  <link role="link" targetNodeId="1.1107880067339" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306344">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877306345">
            <link role="variableDeclaration" targetNodeId="1213877306325" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877306346" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724592" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877306347">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306348">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306349">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306350">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306351" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877306352">
              <link role="property" targetNodeId="1.1211504562189" resolveInfo="nestedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877306353">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724541" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1214840444586">
      <property name="name" value="hasStaticMemebers" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1214840469366" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214840444588">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214840477167">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1214840486563">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1214840486993">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840481597">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840479819">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1214840479580" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214840480763">
                  <link role="link" targetNodeId="1.1128555889557" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.CountOperation" id="1214840484947" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725020" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877306354">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877306355">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877306356">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306357">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877306358">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877306359" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877306360">
                <link role="link" targetNodeId="1.1178549650460" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1213877306361">
              <link role="concept" targetNodeId="1.1146644602865" resolveInfo="PublicVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877308091">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903916106" resolveInfo="UpperBoundType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877308092">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308093">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877308094">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877308095">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877308096" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877308097">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877308098" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877308099">
                <link role="link" targetNodeId="1.1171903916107" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308100">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877308101">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877308102">
                <property name="value" value="? extends ???" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877308103">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308104">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877308105">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877308106">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877308107">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877308108">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877308109" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877308110">
                        <link role="link" targetNodeId="1.1171903916107" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877308111">
                      <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877308112">
                    <property name="value" value="? extends " />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877308113">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723770" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877308114">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308115" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877308679">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070533982221" resolveInfo="ShortType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877308680">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308681">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877308682">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877308683">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877308684">
              <link role="classifier" targetNodeId="2.~Short" resolveInfo="Short" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877308685">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724461" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877308686">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308687">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877308688">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877308689">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877308690">
              <link role="classifier" targetNodeId="2.~Short" resolveInfo="Short" />
              <link role="variableDeclaration" targetNodeId="2.~Short.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877308691">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724518" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877308692">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877308693" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877315813">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877315814">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315815">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315816">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315817">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315818">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315819">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315820" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315821">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315822">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315823">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877315824">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315825">
                <property name="value" value="?no classifier?" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877315826">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877315827" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315828">
              <link role="variableDeclaration" targetNodeId="1213877315817" resolveInfo="classifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315829">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315830">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315831">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315832">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315833">
                <link role="variableDeclaration" targetNodeId="1213877315817" resolveInfo="classifier" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877315834">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315835">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315836">
            <property name="name" value="parms" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877315837">
              <link role="elementConcept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315838">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315839" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877315840">
                <link role="link" targetNodeId="1.1109201940907" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315841">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315842">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315843">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315844">
                <property name="name" value="parmsText" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315845">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315846" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1213877315847">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1213877315848">
                <property name="name" value="parm" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315849">
                <link role="variableDeclaration" targetNodeId="1213877315836" resolveInfo="parms" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315850">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315851">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1213877315852">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877315853">
                      <property name="value" value="0" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315854">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315855">
                        <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877315856">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315857">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315858">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877315859">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877315860">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315861">
                            <property name="value" value="," />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315862">
                            <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315863">
                          <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315864">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877315865">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877315866">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315867">
                        <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1213877315868">
                          <link role="variable" targetNodeId="1213877315848" resolveInfo="parm" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877315869">
                          <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315870">
                        <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315871">
                      <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315872">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877315873">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877315874">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877315875">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877315876">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315877">
                        <property name="value" value="&gt;" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315878">
                        <link role="variableDeclaration" targetNodeId="1213877315844" resolveInfo="parmsText" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315879">
                      <property name="value" value="&lt;" />
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315880">
                    <link role="variableDeclaration" targetNodeId="1213877315830" resolveInfo="result" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315881">
                  <link role="variableDeclaration" targetNodeId="1213877315830" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315882">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315883">
              <link role="variableDeclaration" targetNodeId="1213877315836" resolveInfo="parms" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1213877315884" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877315885">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315886">
            <link role="variableDeclaration" targetNodeId="1213877315830" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315887">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724160" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877315888">
      <property name="name" value="getErasureSignature" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337313" resolveInfo="getErasureSignature" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315889">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315890">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315891">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315892">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315893">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315894" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315895">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315896">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315897">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877315898">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877315899">
                <property name="value" value="?no classifier?" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877315900">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877315901" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315902">
              <link role="variableDeclaration" targetNodeId="1213877315891" resolveInfo="classifier" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877315903">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315904">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315905">
              <link role="variableDeclaration" targetNodeId="1213877315891" resolveInfo="classifier" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877315906">
              <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315907">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724237" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877315908">
      <property name="name" value="getVariableSuffixes" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315909">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315910">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315911">
            <property name="name" value="classifierName" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315912">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315913">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315914" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315915">
                  <link role="link" targetNodeId="1.1107535924139" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877315916">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315917">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315918">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315919">
            <property name="name" value="shortName" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877315920">
              <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.shortNameFromLongName(java.lang.String):java.lang.String" resolveInfo="shortNameFromLongName" />
              <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315921">
                <link role="variableDeclaration" targetNodeId="1213877315911" resolveInfo="classifierName" />
              </node>
            </node>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315922">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315923">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877315924">
            <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
            <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877315925">
              <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
              <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315926">
                <link role="variableDeclaration" targetNodeId="1213877315919" resolveInfo="shortName" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877315927">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877315928">
          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724988" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877315929">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315930">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315931">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877315932">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" id="1213877315933">
              <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
              <node role="referenceAntiquotation$link_attribute$classifier" type="jetbrains.mps.quotation.structure.ReferenceAntiquotation" id="1213877315934">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315935">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315936" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315937">
                    <link role="link" targetNodeId="1.1107535924139" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315938">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724128" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877315939">
      <property name="name" value="getAbstractCreator" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337340" resolveInfo="getAbstractCreator" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315940">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315941">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315942">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315943">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315944">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315945" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315946">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315947">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315948">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315949">
              <link role="variableDeclaration" targetNodeId="1213877315942" resolveInfo="classifier" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877315950">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877315951">
                <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315952">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877315953">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877315954">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315955">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315956">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877315957">
                      <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315958">
                        <link role="variableDeclaration" targetNodeId="1213877315942" resolveInfo="classifier" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877315959">
                      <link role="link" targetNodeId="1.1068390468201" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation" id="1213877315960" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877315961">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315962">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877315963">
                      <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315964">
                        <link role="variableDeclaration" targetNodeId="1213877315942" resolveInfo="classifier" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877315965">
                      <link role="property" targetNodeId="1.1075300953594" resolveInfo="abstractClass" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315966">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877315967">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877315968">
                    <property name="name" value="creator" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315969">
                      <link role="concept" targetNodeId="1.1212685548494" resolveInfo="ClassCreator" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877315970">
                      <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1213877315971">
                        <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877315972">
                          <link role="concept" targetNodeId="1.1212685548494" resolveInfo="ClassCreator" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315973">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877315974">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315975">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315976">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877315977">
                          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315978">
                            <link role="variableDeclaration" targetNodeId="1213877315942" resolveInfo="classifier" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877315979">
                          <link role="link" targetNodeId="1.1068390468201" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877315980" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315981">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315982">
                        <link role="variableDeclaration" targetNodeId="1213877315968" resolveInfo="creator" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877315983">
                        <link role="link" targetNodeId="1.1212686240295" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1213877315984">
                  <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1213877315985">
                    <property name="name" value="typeParm" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877315986">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877315987">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315988">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315989">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877315990">
                            <link role="variableDeclaration" targetNodeId="1213877315968" resolveInfo="creator" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877315991">
                            <link role="link" targetNodeId="1.1212687122400" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1213877315992">
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315993">
                            <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1213877315994">
                              <link role="variable" targetNodeId="1213877315985" resolveInfo="typeParm" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877315995" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877315996">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877315997" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877315998">
                      <link role="link" targetNodeId="1.1109201940907" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877315999">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877316000">
                    <link role="variableDeclaration" targetNodeId="1213877315968" resolveInfo="creator" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877316001">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877316002" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877316003">
        <link role="concept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724607" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877316004">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877316005" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877322506">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534555686" resolveInfo="CharType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877322507">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877322508">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877322509">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877322510">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877322511">
              <link role="classifier" targetNodeId="2.~Character" resolveInfo="Character" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877322512">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724948" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877322513">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877322514">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877322515">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877322516">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877322517">
              <link role="classifier" targetNodeId="2.~Character" resolveInfo="Character" />
              <link role="variableDeclaration" targetNodeId="2.~Character.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877322518">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723863" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877322519">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877322520" />
    </node>
  </node>
  <visible index="4" modelUID="jetbrains.mps.baseLanguage.constraints" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877327381">
    <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327382">
      <property name="name" value="checkDataFlow" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877327383" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327384">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877327385">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327386">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327387" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327388">
              <link role="conceptMethodDeclaration" targetNodeId="1213877327433" resolveInfo="checkUnreachable" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877327389">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327390">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327391" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327392">
              <link role="conceptMethodDeclaration" targetNodeId="1213877327450" resolveInfo="checkUninitializedReads" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877327393">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327394">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327395" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327396">
              <link role="conceptMethodDeclaration" targetNodeId="1213877327497" resolveInfo="checkUnusedAssignments" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1216893361172">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216893362009">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1216893361173" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1216893367878">
              <link role="conceptMethodDeclaration" targetNodeId="1216892728097" resolveInfo="checkUnusedVariables" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724677" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327397">
      <property name="name" value="checkReturns" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877327398" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327399">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327400">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327401">
            <property name="name" value="expectedReturns" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327402">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327403">
                <link role="classifier" targetNodeId="9.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877327404">
              <link role="classConcept" targetNodeId="10.~DataFlow" resolveInfo="DataFlow" />
              <link role="baseMethodDeclaration" targetNodeId="10.~DataFlow.getExpectedReturns(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getExpectedReturns" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327405" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877327406">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327407">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1215433074760">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215433074761">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1215433086355">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1215433086356">
                    <property name="name" value="nodeToSelect" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1215433086357">
                      <link role="concept" targetNodeId="2v.1133920641626" resolveInfo="BaseConcept" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1215433086358">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1215433086359">
                    <property name="name" value="sl" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1215433086360">
                      <link role="concept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086361">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086362">
                        <link role="variableDeclaration" targetNodeId="1213877327431" resolveInfo="n" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1215433086363">
                        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1215433086364">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215433086365">
                            <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1215433086366">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215433086367">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1215433086368">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086369">
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1215433086370">
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1215433086371">
                            <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215433086372">
                              <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                            </node>
                          </node>
                          <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Inclusion" id="1215433086373" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1215433086374">
                          <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086375">
                            <link role="variableDeclaration" targetNodeId="1213877327431" resolveInfo="n" />
                          </node>
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086376">
                            <link role="variableDeclaration" targetNodeId="1215433086356" resolveInfo="nodeToSelect" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1215433086377">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086378">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086379">
                        <link role="variableDeclaration" targetNodeId="1215433086359" resolveInfo="sl" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1215433086380" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1215433086381">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086382">
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1215433086383">
                          <link role="baseMethodDeclaration" targetNodeId="16.~StatementList.getStatementsCount():int" resolveInfo="getStatementsCount" />
                        </node>
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086384">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086385">
                            <link role="variableDeclaration" targetNodeId="1215433086359" resolveInfo="sl" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1215433086386" />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1215433086387">
                        <property name="value" value="0" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1215433086388">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215433086389">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1215433086390">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1215433086391">
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086392">
                            <link role="variableDeclaration" targetNodeId="1215433086356" resolveInfo="nodeToSelect" />
                          </node>
                          <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1215433086393">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086394">
                              <link role="variableDeclaration" targetNodeId="1213877327431" resolveInfo="n" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1215433086395">
                              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1215433086396">
                                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215433086397">
                                  <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1215433086398">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215433086399">
                    <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1215433086400">
                      <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1215433086401">
                        <property name="value" value="Return expected" />
                      </node>
                      <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086402">
                        <link role="variableDeclaration" targetNodeId="1215433086356" resolveInfo="nodeToSelect" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1215433086403">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1215433086404" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086405">
                      <link role="variableDeclaration" targetNodeId="1215433086356" resolveInfo="nodeToSelect" />
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1215433086406">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215433086407">
                      <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1215433086408">
                        <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1215433086409">
                          <property name="value" value="Return expected" />
                        </node>
                        <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433086410">
                          <link role="variableDeclaration" targetNodeId="1213877327431" resolveInfo="n" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1215433079451">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1215433081133" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1215433077974">
                  <link role="variableDeclaration" targetNodeId="1213877327431" resolveInfo="n" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327430">
            <link role="variableDeclaration" targetNodeId="1213877327401" resolveInfo="expectedReturns" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327431">
            <property name="name" value="n" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327432" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724613" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327433">
      <property name="name" value="checkUnreachable" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877327434" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327435">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327436">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327437">
            <property name="name" value="unreachable" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327438">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327439">
                <link role="classifier" targetNodeId="9.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877327440">
              <link role="baseMethodDeclaration" targetNodeId="10.~DataFlow.getUnreachableNodes(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUnreachableNodes" />
              <link role="classConcept" targetNodeId="10.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327441" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877327442">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327443">
            <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1213877327444">
              <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877327445">
                <property name="value" value="Unreachable node" />
              </node>
              <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327446">
                <link role="variableDeclaration" targetNodeId="1213877327448" resolveInfo="n" />
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327447">
            <link role="variableDeclaration" targetNodeId="1213877327437" resolveInfo="unreachable" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327448">
            <property name="name" value="n" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327449" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155724313" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327450">
      <property name="name" value="checkUninitializedReads" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877327451" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327452">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327453">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327454">
            <property name="name" value="uninitializedReads" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327455">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327456">
                <link role="classifier" targetNodeId="9.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877327457">
              <link role="baseMethodDeclaration" targetNodeId="10.~DataFlow.getUninitializedReads(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUninitializedReads" />
              <link role="classConcept" targetNodeId="10.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327458" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327459">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327460">
            <property name="name" value="referencedInClosures" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877327461">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327462">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327463" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327464">
                <link role="conceptMethodDeclaration" targetNodeId="1213877327584" resolveInfo="getVariablesReferencedInClosures" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877327465">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327466">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327467">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327468">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327469">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327470">
                    <property name="name" value="ref" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327471">
                      <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877327472">
                      <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327473">
                        <link role="variableDeclaration" targetNodeId="1213877327495" resolveInfo="read" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327474">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327475">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1213877327476" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877327477">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327478">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327479">
                        <link role="variableDeclaration" targetNodeId="1213877327470" resolveInfo="ref" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327480">
                        <link role="conceptMethodDeclaration" targetNodeId="1213877348225" resolveInfo="isClosureReference" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327481">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327482">
                        <link role="variableDeclaration" targetNodeId="1213877327460" resolveInfo="referencedInClosures" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877327483">
                        <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327484">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327485">
                            <link role="variableDeclaration" targetNodeId="1213877327470" resolveInfo="ref" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327486">
                            <link role="link" targetNodeId="1.1070568296581" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement" id="1213877327487">
                  <node role="errorString" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877327488">
                    <property name="value" value="Variable used before it is initialized" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327489">
                    <link role="variableDeclaration" targetNodeId="1213877327495" resolveInfo="read" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327490">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327491">
                  <link role="variableDeclaration" targetNodeId="1213877327495" resolveInfo="read" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877327492">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327493">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327494">
            <link role="variableDeclaration" targetNodeId="1213877327454" resolveInfo="uninitializedReads" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327495">
            <property name="name" value="read" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327496" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155724013" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327497">
      <property name="isPrivate" value="false" />
      <property name="name" value="checkUnusedAssignments" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877327498" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327499">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327500">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327501">
            <property name="name" value="unusedAssignments" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327502">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877327503">
                <link role="classifier" targetNodeId="9.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877327504">
              <link role="baseMethodDeclaration" targetNodeId="10.~DataFlow.getUnusedAssignments(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUnusedAssignments" />
              <link role="classConcept" targetNodeId="10.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327505" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327506">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327507">
            <property name="name" value="referencedInClosure" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877327508">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327509">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327510" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327511">
                <link role="conceptMethodDeclaration" targetNodeId="1213877327584" resolveInfo="getVariablesReferencedInClosures" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877327512">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327513">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327514">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327515">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327516">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327517">
                    <property name="name" value="assignment" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327518">
                      <link role="concept" targetNodeId="1.1215693861676" resolveInfo="BaseAssignmentExpression" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877327519">
                      <link role="concept" targetNodeId="1.1215693861676" resolveInfo="BaseAssignmentExpression" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327520">
                        <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327521">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327522">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327523">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327524">
                        <property name="name" value="ref" />
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327525">
                          <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877327526">
                          <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327527">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327528">
                              <link role="variableDeclaration" targetNodeId="1213877327517" resolveInfo="assignment" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327529">
                              <link role="link" targetNodeId="1.1068498886295" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327530">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327531">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1213877327532" />
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877327533">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327534">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327535">
                            <link role="variableDeclaration" targetNodeId="1213877327524" resolveInfo="ref" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877327536">
                            <link role="conceptMethodDeclaration" targetNodeId="1213877348225" resolveInfo="isClosureReference" />
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327537">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327538">
                            <link role="variableDeclaration" targetNodeId="1213877327507" resolveInfo="referencedInClosure" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877327539">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327540">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327541">
                                <link role="variableDeclaration" targetNodeId="1213877327524" resolveInfo="ref" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327542">
                                <link role="link" targetNodeId="1.1068581517664" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1213877327543">
                      <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877327544">
                        <property name="value" value="Unused assignment" />
                      </node>
                      <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327545">
                        <link role="variableDeclaration" targetNodeId="1213877327517" resolveInfo="assignment" />
                      </node>
                      <node role="helginsIntention" type="jetbrains.mps.bootstrap.helgins.structure.HelginsIntention" id="1213877327546">
                        <link role="intentionDeclaration" targetNodeId="4v.1212611479483" resolveInfo="RemoveUnusedAssignment" />
                        <link role="quickFix" targetNodeId="4v.1216648306971" resolveInfo="RemoveUnusedAssignment" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877327547">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327548">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327549">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327550">
                          <link role="variableDeclaration" targetNodeId="1213877327517" resolveInfo="assignment" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327551">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877327552">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327553">
                          <link role="conceptDeclaration" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327554">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327555">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327556">
                          <link role="variableDeclaration" targetNodeId="1213877327517" resolveInfo="assignment" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327557">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877327558">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327559">
                          <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327560">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327561">
                  <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877327562">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1215700254198">
                    <link role="conceptDeclaration" targetNodeId="1.1215693861676" resolveInfo="BaseAssignmentExpression" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327564">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327565">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327566">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327567">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ContinueStatement" id="1213877327568" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327569">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327570">
                      <link role="variableDeclaration" targetNodeId="1213877327507" resolveInfo="referencedInClosure" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877327571">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327572">
                        <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1213877327573">
                  <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877327574">
                    <property name="value" value="Unused assignment" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327575">
                    <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                  </node>
                  <node role="helginsIntention" type="jetbrains.mps.bootstrap.helgins.structure.HelginsIntention" id="1213877327576">
                    <link role="intentionDeclaration" targetNodeId="4v.1212611479483" resolveInfo="RemoveUnusedAssignment" />
                    <link role="quickFix" targetNodeId="4v.1216648306971" resolveInfo="RemoveUnusedAssignment" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327577">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327578">
                  <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877327579">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327580">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220008964263">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220008964264">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220265750218">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220265750219">
                    <property name="name" value="method" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220265750220">
                      <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220265795622">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220265795623">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220265795624">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220265795625">
                            <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1220265795626" />
                        </node>
                        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220265795627">
                          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220265721215">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220265721216">
                    <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1220266223599">
                      <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220266223600">
                        <property name="value" value="Unused parameter" />
                      </node>
                      <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220266223601">
                        <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1220265954801">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220265802636">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220265801659">
                        <link role="variableDeclaration" targetNodeId="1220265750219" resolveInfo="method" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1220265952339">
                        <link role="property" targetNodeId="1.1181808852946" resolveInfo="isFinal" />
                      </node>
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1220266085472">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220266204158">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220266172242">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1220266172243">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1220266172244">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220266172245">
                                <link role="variableDeclaration" targetNodeId="1220265750219" resolveInfo="method" />
                              </node>
                              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1220266172246">
                                <link role="concept" targetNodeId="1.1178549954367" resolveInfo="Visible" />
                              </node>
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1220266172247">
                            <link role="link" targetNodeId="1.1178549979242" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220266206262">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220266218365">
                            <link role="conceptDeclaration" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220266072067">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220266070558">
                          <link role="variableDeclaration" targetNodeId="1220265750219" resolveInfo="method" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220266074922">
                          <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220266082369">
                            <link role="conceptDeclaration" targetNodeId="1.1178549954367" resolveInfo="Visible" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220008968626">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220008967102">
                  <link role="variableDeclaration" targetNodeId="1213877327582" resolveInfo="write" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220008971448">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220008986316">
                    <link role="conceptDeclaration" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327581">
            <link role="variableDeclaration" targetNodeId="1213877327501" resolveInfo="unusedAssignments" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327582">
            <property name="name" value="write" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327583" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155724899" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1216892728097">
      <property name="name" value="checkUnusedVariables" />
      <property name="isPrivate" value="false" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216892728099">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1216892818403">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216892818404">
            <property name="name" value="unusedVariables" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216892818405">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216892824280">
                <link role="classifier" targetNodeId="9.~SNode" resolveInfo="SNode" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1216893095165">
              <link role="baseMethodDeclaration" targetNodeId="10.~DataFlow.getUnusedVariables(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="getUnusedVariables" />
              <link role="classConcept" targetNodeId="10.~DataFlow" resolveInfo="DataFlow" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1216893096610" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1216893111720">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216893111721">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220012720870">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220012720871">
                <node role="statement" type="jetbrains.mps.bootstrap.helgins.structure.WarningStatement" id="1220012814436">
                  <node role="warningText" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220012814437">
                    <property name="value" value="Unused variable" />
                  </node>
                  <node role="nodeToReport" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220012814438">
                    <link role="variableDeclaration" targetNodeId="1216893111724" resolveInfo="var" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1220012734742">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220012803028">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220012800728">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220012798377">
                      <link role="variableDeclaration" targetNodeId="1216893111724" resolveInfo="var" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1220012802051" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1220012804756">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1220012808999">
                      <link role="conceptDeclaration" targetNodeId="1.1164903280175" resolveInfo="CatchClause" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1216893118932">
            <link role="variableDeclaration" targetNodeId="1216892818404" resolveInfo="unusedVariables" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1216893111724">
            <property name="name" value="var" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1216893113391" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216892757154" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724189" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877327584">
      <property name="name" value="getVariablesReferencedInClosures" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877327585">
        <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327586">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327587">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327588">
            <property name="name" value="referencedInClosures" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877327589">
              <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877327590">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1213877327591">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877327592">
                  <link role="elementConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877327593">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327594">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877327595">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327596">
                <property name="name" value="closure" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327597">
                  <link role="concept" targetNodeId="1.1152728232947" resolveInfo="Closure" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327598">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327599">
                    <link role="variableDeclaration" targetNodeId="1213877327626" resolveInfo="varRef" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213877327600">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877327601">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327602">
                        <link role="conceptDeclaration" targetNodeId="1.1152728232947" resolveInfo="Closure" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877327603">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327604">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877327605">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327606">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327607">
                      <link role="variableDeclaration" targetNodeId="1213877327588" resolveInfo="referencedInClosures" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1213877327608">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327609">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327610">
                          <link role="variableDeclaration" targetNodeId="1213877327626" resolveInfo="varRef" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877327611">
                          <link role="link" targetNodeId="1.1068581517664" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877327612">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877327613">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327614">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327615" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877327616" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327617">
                    <link role="variableDeclaration" targetNodeId="1213877327596" resolveInfo="closure" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327618">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327619">
                    <link role="variableDeclaration" targetNodeId="1213877327596" resolveInfo="closure" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877327620" />
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877327621">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877327622" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1213877327623">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877327624">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877327625">
                  <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877327626">
            <property name="name" value="varRef" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877327627">
              <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877327628">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877327629">
            <link role="variableDeclaration" targetNodeId="1213877327588" resolveInfo="referencedInClosures" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155724512" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1214501165480">
      <property name="name" value="getExternalVariablesDeclarations" />
      <property name="isPrivate" value="false" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214501165482">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214501228158">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214501228159">
            <property name="name" value="declarations" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1214501228160">
              <link role="classifier" targetNodeId="8.~HashSet" resolveInfo="HashSet" />
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214501228161">
                <link role="concept" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1214501228162">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1214501228163">
                <link role="baseMethodDeclaration" targetNodeId="8.~HashSet.&lt;init&gt;()" resolveInfo="HashSet" />
                <node role="typeParameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214501228164">
                  <link role="concept" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1214501228165">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214501228166">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1214501246369" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1214501228168">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1214501228169">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1214501228170">
                  <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214501228171">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214501228172">
              <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214501228173">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1214501228174">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214501228175">
                <property name="name" value="statementsContainsVar" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1214501228176" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214501228177">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1214501228178">
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214501228179">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214501228180">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228181">
                    <link role="variableDeclaration" targetNodeId="1214501228171" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1214501228182">
                    <link role="link" targetNodeId="1.1070568296581" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1214501228183" />
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1214501228184">
                <property name="name" value="parent" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214501228185" />
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214501228186">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1214501228187">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1214823840157">
                    <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1214823841774" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228190">
                      <link role="variableDeclaration" targetNodeId="1214501228184" resolveInfo="parent" />
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214501228193">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214501228194">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1214501228195">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1214501228196">
                          <property name="value" value="true" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228197">
                          <link role="variableDeclaration" targetNodeId="1214501228175" resolveInfo="statementsContainsVar" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1214501228198">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214501228199">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1214501228200">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214501228201">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228202">
                      <link role="variableDeclaration" targetNodeId="1214501228159" resolveInfo="declarations" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1214501228203">
                      <link role="baseMethodDeclaration" targetNodeId="8.~HashSet.add(java.lang.Object):boolean" resolveInfo="add" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214501228204">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228205">
                          <link role="variableDeclaration" targetNodeId="1214501228171" resolveInfo="ref" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1214501228206">
                          <link role="link" targetNodeId="1.1070568296581" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1214501228207">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501228208">
                  <link role="variableDeclaration" targetNodeId="1214501228175" resolveInfo="statementsContainsVar" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214501236007">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1214501238743">
            <link role="variableDeclaration" targetNodeId="1214501228159" resolveInfo="declarations" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1214501215141">
        <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
        <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1214501215142">
          <link role="concept" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725030" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877327630">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877327631" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877329503">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534644030" resolveInfo="BooleanType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877329504">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877329505">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877329506">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877329507">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877329508">
              <link role="classifier" targetNodeId="2.~Boolean" resolveInfo="Boolean" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877329509">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724338" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877329510">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877329511">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877329512">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877329513">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877329514">
              <link role="classifier" targetNodeId="2.~Boolean" resolveInfo="Boolean" />
              <link role="variableDeclaration" targetNodeId="2.~Boolean.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877329515">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723860" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877329516">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877329517" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877337303">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337304">
      <property name="isVirtual" value="true" />
      <property name="name" value="getVariableSuffixes" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877337305">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877337306">
          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337307">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877337308">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877337309">
            <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
            <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877337310">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877337311" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877337312">
                <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723836" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337313">
      <property name="name" value="getErasureSignature" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877337314">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337315">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877337316">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877337317">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877337318" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877337319">
              <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724317" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337320">
      <property name="isVirtual" value="true" />
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877337321">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337322">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877337323">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877337324">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877337325" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877337326" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724376" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337327">
      <property name="name" value="getClass" />
      <property name="isVirtual" value="false" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877337328">
        <link role="classifier" targetNodeId="2.~Class" resolveInfo="Class" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337329">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877337330">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877337331">
            <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.forName(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode):java.lang.Class" resolveInfo="forName" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877337332">
              <link role="variableDeclaration" targetNodeId="1213877337338" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877337333">
              <node role="operand" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1213877337334">
                <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1213877337335">
                  <property name="name" value="classifierType" />
                  <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
                </node>
                <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877337336" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877337337">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877337338">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877337339">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724567" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337340">
      <property name="name" value="getAbstractCreator" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877337341">
        <link role="concept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337342">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877337343">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877337344" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724519" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337345">
      <property name="isVirtual" value="true" />
      <property name="name" value="getJavaType" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877337346">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337347">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877337348">
          <node role="expression" type="jetbrains.mps.bootstrap.helgins.structure.CoerceExpression" id="1213877337349">
            <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1213877337350">
              <property name="name" value="classifierType" />
              <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
            </node>
            <node role="nodeToCoerce" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877337351" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724056" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337352">
      <property name="name" value="selectOnVariableCreation" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877337353" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337354">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877337355">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877337356">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724734" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877337357">
      <property name="isVirtual" value="true" />
      <property name="name" value="getClassExpression" />
      <property name="isAbstract" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877337358">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724425" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877337359">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877337360" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877339152">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068499141036" resolveInfo="BaseMethodCall" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877339153">
      <property name="name" value="getActualArguments" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1213877339154">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877339155">
          <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339156">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339157">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339158">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339159">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339160">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877339161" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877339162">
                  <link role="link" targetNodeId="1.1068499141038" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1213877339163">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1213877339164">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877339165">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339166">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339167">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339168">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877339169">
                          <link role="closureParameter" targetNodeId="1213877339165" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877339170">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877339171">
                            <link role="variableDeclaration" targetNodeId="1213877339173" resolveInfo="module" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1213877339172" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877339173">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877339174">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724171" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877339175">
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519781" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339176">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877339177">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877339178">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877339179">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877339180" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877339181">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339182">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339183">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877339184" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877339185">
                <link role="link" targetNodeId="1.1068499141037" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877339186" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339187">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877339188">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877339189">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877339190">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339191">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339192">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877339193" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877339194">
                      <link role="link" targetNodeId="1.1068499141037" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877339195">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877339196">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339197">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339198">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877339199">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339200">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339201">
                        <link role="variableDeclaration" targetNodeId="1213877339189" resolveInfo="name" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877339202">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.substring(int):java.lang.String" resolveInfo="substring" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877339203">
                          <property name="value" value="3" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339204">
                      <link role="variableDeclaration" targetNodeId="1213877339178" resolveInfo="variableExpectedName" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339205">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339206">
                  <link role="variableDeclaration" targetNodeId="1213877339189" resolveInfo="name" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877339207">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877339208">
                    <property name="value" value="get" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877339209">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339210">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339211">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877339212">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339213">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339214">
                          <link role="variableDeclaration" targetNodeId="1213877339189" resolveInfo="name" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877339215">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.substring(int):java.lang.String" resolveInfo="substring" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877339216">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339217">
                        <link role="variableDeclaration" targetNodeId="1213877339178" resolveInfo="variableExpectedName" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877339218">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339219">
                    <link role="variableDeclaration" targetNodeId="1213877339189" resolveInfo="name" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877339220">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877339221">
                      <property name="value" value="is" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877339222">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339223">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339224">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877339225">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339226">
                          <link role="variableDeclaration" targetNodeId="1213877339189" resolveInfo="name" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339227">
                          <link role="variableDeclaration" targetNodeId="1213877339178" resolveInfo="variableExpectedName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877339228">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877339229">
            <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
            <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877339230">
              <link role="variableDeclaration" targetNodeId="1213877339178" resolveInfo="variableExpectedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877339231">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723968" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877339232">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877339233" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877343271">
    <property name="package" value="property.implementation.custom" />
    <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877343272">
      <property name="name" value="hasSetter" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877430658" resolveInfo="hasSetter" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877343273">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877343274">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877343275">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877343276">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877343277" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877343278">
                <link role="link" targetNodeId="1.1201476937466" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877343279" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877343280" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724722" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877343281">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877343282" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877346343">
    <link role="concept" targetNodeId="1.1082113931046" resolveInfo="ContinueStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877346344">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346345" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877346346">
      <property name="name" value="getLoop" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877346347">
        <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346348">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877346349">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346350">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877346351" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1213877346352">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877346353">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877346354">
                  <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877346355">
            <property name="name" value="loop" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877346356">
              <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346357">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877346358">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877346359">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877346360" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346361">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877346362" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877346363">
                    <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346364">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877346365">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877346366">
                    <link role="variableDeclaration" targetNodeId="1213877346355" resolveInfo="loop" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877346367">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346368">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877346369">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877346370">
                    <link role="variableDeclaration" targetNodeId="1213877346355" resolveInfo="loop" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346371">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346372">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877346373" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877346374">
                    <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877346375">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346376">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877346377">
                      <link role="variableDeclaration" targetNodeId="1213877346355" resolveInfo="loop" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877346378">
                      <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877346379">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346380">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877346381" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877346382">
              <link role="conceptMethodDeclaration" targetNodeId="1213877346346" resolveInfo="getLoop" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724683" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877346946">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877346947">
      <property name="name" value="createReference" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517482" resolveInfo="createReference" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346948">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877346949">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877346950">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877346951">
              <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877346952">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1213877346953">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877346954">
                  <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877346955">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877346956">
            <node role="rValue" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877346957" />
            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877346958">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877346959">
                <link role="variableDeclaration" targetNodeId="1213877346950" resolveInfo="ref" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877346960">
                <link role="link" targetNodeId="1.1070567982819" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877346961">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877346962">
            <link role="variableDeclaration" targetNodeId="1213877346950" resolveInfo="ref" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877346963">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724952" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877346964">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877346965" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877348222">
    <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877348223">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877348224" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877348225">
      <property name="name" value="isClosureReference" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877348226" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877348227">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877348228">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877348229">
            <property name="name" value="closureoid" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877348230">
              <link role="concept" targetNodeId="1.1207665819089" resolveInfo="Closureoid" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877348231">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877348232" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213877348233">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877348234">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877348235">
                    <link role="conceptDeclaration" targetNodeId="1.1207665819089" resolveInfo="Closureoid" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877348236">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877348237">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877348238">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877348239">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877348240">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877348241">
              <link role="variableDeclaration" targetNodeId="1213877348229" resolveInfo="closureoid" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNullOperation" id="1213877348242" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877348243">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877348244">
            <property name="name" value="declaration" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877348245">
              <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877348246">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877348247" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877348248">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877348249">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877348250">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877348251">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877348252">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877348253">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877348254">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877348255">
                <link role="variableDeclaration" targetNodeId="1213877348244" resolveInfo="declaration" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1213877348256" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877348257">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877348258">
                <link role="variableDeclaration" targetNodeId="1213877348229" resolveInfo="closureoid" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877348259">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877348260">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725059" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877350233">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877350234">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350235">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350236">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350237">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350238">
              <link role="classifier" targetNodeId="2.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877350239">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877350240">
                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350241">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350242">
            <property name="name" value="name" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350243">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350244">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350245" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350246">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350247">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350248">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350249">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350250">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350251">
                  <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350252">
                  <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.String):java.lang.StringBuilder" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350253">
                    <link role="variableDeclaration" targetNodeId="1213877350242" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877350254">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877350255" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350256">
              <link role="variableDeclaration" targetNodeId="1213877350242" resolveInfo="name" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877350257">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350258">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350259">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350260">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350261">
                    <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350262">
                    <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.String):java.lang.StringBuilder" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350263">
                      <property name="value" value="&lt;no name&gt;" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350264">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350265">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350266">
              <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350267">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.String):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350268">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350269" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350270">
                  <link role="conceptMethodDeclaration" targetNodeId="1213877350304" resolveInfo="getParametersPresentation" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350271">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350272">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350273">
              <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350274">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350275">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350276">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350277">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350278">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350279">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350280">
                  <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350281">
                  <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350282">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350283">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350284" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350285">
                        <link role="link" targetNodeId="1.1068580123133" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350286">
                      <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877350287">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877350288" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350289">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350290" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350291">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877350292">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350293">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350294">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350295">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350296">
                    <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350297">
                    <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350298">
                      <property name="value" value="???" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350299">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350300">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350301">
              <link role="variableDeclaration" targetNodeId="1213877350237" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350302">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350303">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724073" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877350304">
      <property name="name" value="getParametersPresentation" />
      <property name="isPrivate" value="false" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350305">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350306">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350307">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350308">
              <link role="classifier" targetNodeId="2.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877350309">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877350310">
                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350311">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350312">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350313">
              <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350314">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350315">
                <property name="value" value="(" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350316">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350317">
            <property name="name" value="first" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877350318" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877350319">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877350320">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350321">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350322" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350323">
              <link role="link" targetNodeId="1.1068580123134" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350324">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877350325">
              <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350326">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350327">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877350328">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350329">
                  <link role="variableDeclaration" targetNodeId="1213877350317" resolveInfo="first" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350330">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350331">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350332">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350333">
                      <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350334">
                      <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350335">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350336">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877350337">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877350338">
                  <property name="value" value="false" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350339">
                  <link role="variableDeclaration" targetNodeId="1213877350317" resolveInfo="first" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350340">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350341">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350342">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350343">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350344">
                      <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350345">
                      <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350346">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350347">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350348">
                            <link role="variableDeclaration" targetNodeId="1213877350324" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350349">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350350">
                          <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877350351">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877350352" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350353">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350354">
                    <link role="variableDeclaration" targetNodeId="1213877350324" resolveInfo="parm" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350355">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877350356">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350357">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350358">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350359">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350360">
                        <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350361">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350362">
                          <property name="value" value="???" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.CommentedStatementsBlock" id="1213877350363">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350364">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350365">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350366">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350367">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350368">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350369">
                          <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350370">
                          <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350371">
                            <property name="value" value=" " />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350372">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350373">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350374">
                            <link role="variableDeclaration" targetNodeId="1213877350324" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350375">
                            <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877350376">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877350377" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350378">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350379">
                      <link role="variableDeclaration" targetNodeId="1213877350324" resolveInfo="parm" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350380">
                      <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350381">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350382">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350383">
              <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350384">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877350385">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877350386">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350387">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350388">
              <link role="variableDeclaration" targetNodeId="1213877350307" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350389">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350390">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724272" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877350391">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350392" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877350393">
      <property name="name" value="getMethod" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350394">
        <link role="classifier" targetNodeId="12.~Method" resolveInfo="Method" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350395">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350396">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877350397">
            <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.getMethod(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String,java.lang.Class[]):java.lang.reflect.Method" resolveInfo="getMethod" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350398">
              <link role="variableDeclaration" targetNodeId="1213877350409" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350399">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350400" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877350401" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350402">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350403" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350404">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350405">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350406" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350407">
                <link role="conceptMethodDeclaration" targetNodeId="1213877350411" resolveInfo="getParameterTypes" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350408">
                  <link role="variableDeclaration" targetNodeId="1213877350409" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877350409">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350410">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723954" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877350411">
      <property name="isPrivate" value="false" />
      <property name="name" value="getParameterTypes" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1213877350412">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350413">
          <link role="classifier" targetNodeId="2.~Class" resolveInfo="Class" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350414">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350415">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350416">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350417">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350418">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350419" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350420">
                  <link role="link" targetNodeId="1.1068580123134" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1213877350421">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1213877350422">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877350423">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350424">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350425">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350426">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350427">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877350428">
                            <link role="closureParameter" targetNodeId="1213877350423" resolveInfo="it" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350429">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350430">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877337327" resolveInfo="getClass" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350431">
                            <link role="variableDeclaration" targetNodeId="1213877350433" resolveInfo="module" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1213877350432" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877350433">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350434">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155723965" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877350435">
      <property name="name" value="hasSameSignature" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877350436" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350437">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350438">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877350439">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877350440">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350441">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350442">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350443">
                    <link role="variableDeclaration" targetNodeId="1213877350522" resolveInfo="checked" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350444">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1213877350445" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350446">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350447">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350448" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350449">
                    <link role="link" targetNodeId="1.1068580123134" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1213877350450" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350451">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350452">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350453" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350454">
                  <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350455">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350456">
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877350457">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350458">
                    <link role="variableDeclaration" targetNodeId="1213877350522" resolveInfo="checked" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350459">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350460">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350461">
                <property name="name" value="same" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877350462" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877350463">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1213877350464">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350465">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350466">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350467">
                    <property name="name" value="searchedParamType" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350468">
                      <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350469">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350470">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350471">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350472">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877350473">
                              <link role="variableDeclaration" targetNodeId="1213877350522" resolveInfo="checked" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350474">
                              <link role="link" targetNodeId="1.1068580123134" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1213877350475">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350476">
                              <link role="variableDeclaration" targetNodeId="1213877350503" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350477">
                          <link role="link" targetNodeId="1.1068431790188" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350478">
                        <link role="conceptMethodDeclaration" targetNodeId="1213877337313" resolveInfo="getErasureSignature" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877350479">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350480">
                    <property name="name" value="foundParamType" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877350481">
                      <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350482">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350483">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350484">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350485">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350486" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350487">
                              <link role="link" targetNodeId="1.1068580123134" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1213877350488">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350489">
                              <link role="variableDeclaration" targetNodeId="1213877350503" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877350490">
                          <link role="link" targetNodeId="1.1068431790188" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877350491">
                        <link role="conceptMethodDeclaration" targetNodeId="1213877337313" resolveInfo="getErasureSignature" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877350492">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877350493">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877350494">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877350495">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877350496">
                          <property name="value" value="false" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350497">
                          <link role="variableDeclaration" targetNodeId="1213877350461" resolveInfo="same" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877350498">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350499">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350500">
                        <link role="variableDeclaration" targetNodeId="1213877350480" resolveInfo="foundParamType" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877350501">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350502">
                          <link role="variableDeclaration" targetNodeId="1213877350467" resolveInfo="searchedParamType" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877350503">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1213877350504" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877350505">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1213877350506">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350507">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877350508">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877350509" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877350510">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1213877350511" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350512">
                  <link role="variableDeclaration" targetNodeId="1213877350503" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877350513">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877350514">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877350515">
                    <property name="value" value="1" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350516">
                    <link role="variableDeclaration" targetNodeId="1213877350503" resolveInfo="i" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350517">
                  <link role="variableDeclaration" targetNodeId="1213877350503" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877350518">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877350519">
                <link role="variableDeclaration" targetNodeId="1213877350461" resolveInfo="same" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877350520">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877350521">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877350522">
        <property name="name" value="checked" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877350523">
          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724906" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877351133">
    <link role="concept" targetNodeId="1.1070462154015" resolveInfo="StaticFieldDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877351134">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877351135" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877351136">
      <property name="name" value="isInitializable" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517488" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877351137">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877351138">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877351139">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877351140" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724357" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877352267">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877352268">
      <property name="isPrivate" value="false" />
      <property name="name" value="getPresentation" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352269">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877352270">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877352271">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877352272" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352273">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877352274" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352275">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352276">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877352277">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877352278">
                <property name="value" value="???[]" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877352279">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877352280">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877352281">
              <property name="value" value="[]" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352282">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352283">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877352284" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352285">
                  <link role="link" targetNodeId="1.1070534760952" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877352286">
                <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877352287">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724904" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877352288">
      <property name="name" value="getVariableSuffixes" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352289">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877352290">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877352291">
            <property name="name" value="variableSuffixes" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877352292">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877352293">
                <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877352294">
              <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1213877352295">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877352296">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
                <node role="initValue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877352297">
                  <property name="value" value="array" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877352298">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352299">
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1213877352300">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1213877352301">
                <property name="name" value="suffix" />
              </node>
              <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352302">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352303">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877352304" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352305">
                    <link role="link" targetNodeId="1.1070534760952" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877352306">
                  <link role="conceptMethodDeclaration" targetNodeId="1213877337304" resolveInfo="getVariableSuffixes" />
                </node>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352307">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352308">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352309">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352310">
                      <link role="variableDeclaration" targetNodeId="1213877352291" resolveInfo="variableSuffixes" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1213877352311">
                      <node role="argument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877352312">
                        <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.pluralize(java.lang.String):java.lang.String" resolveInfo="pluralize" />
                        <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1213877352313">
                          <link role="variable" targetNodeId="1213877352301" resolveInfo="suffix" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352314">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352315">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877352316" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352317">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877352318" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352319">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352320">
            <link role="variableDeclaration" targetNodeId="1213877352291" resolveInfo="variableSuffixes" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877352321">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877352322">
          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724270" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877352323">
      <property name="name" value="getAbstractCreator" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337340" resolveInfo="getAbstractCreator" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352324">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877352325">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877352326">
            <property name="name" value="arrayCreator" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877352327">
              <link role="concept" targetNodeId="1.1184950988562" resolveInfo="ArrayCreator" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877352328">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1213877352329">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877352330">
                  <link role="concept" targetNodeId="1.1184950988562" resolveInfo="ArrayCreator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877352331">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877352332">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877352333">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352334">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877352335" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352336">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1213877352337">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352338">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352339">
              <link role="variableDeclaration" targetNodeId="1213877352332" resolveInfo="type" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877352340">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877352341">
                <link role="conceptDeclaration" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352342">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352343">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877352344">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352345">
                  <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877352346">
                    <link role="concept" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352347">
                      <link role="variableDeclaration" targetNodeId="1213877352332" resolveInfo="type" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352348">
                    <link role="link" targetNodeId="1.1070534760952" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352349">
                  <link role="variableDeclaration" targetNodeId="1213877352332" resolveInfo="type" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352350">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352351">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352352">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352353">
                    <link role="variableDeclaration" targetNodeId="1213877352326" resolveInfo="arrayCreator" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877352354">
                    <link role="link" targetNodeId="1.1184952969026" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation" id="1213877352355" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352356">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352357">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352358">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352359">
                <link role="variableDeclaration" targetNodeId="1213877352326" resolveInfo="arrayCreator" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877352360">
                <link role="link" targetNodeId="1.1184951007469" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1213877352361">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877352362">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352363">
                  <link role="variableDeclaration" targetNodeId="1213877352332" resolveInfo="type" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877352364" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877352365">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877352366">
            <link role="variableDeclaration" targetNodeId="1213877352326" resolveInfo="arrayCreator" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877352367">
        <link role="concept" targetNodeId="1.1145552809883" resolveInfo="AbstractCreator" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724166" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877352368">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877352369" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877355772">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877355773">
      <property name="name" value="getMembers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877531970" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355774">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877355775">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877355776">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877355777" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355778">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1213877355779" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355780">
                <link role="conceptMethodDeclaration" targetNodeId="1213877531970" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355781">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355782">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355783">
              <link role="variableDeclaration" targetNodeId="1213877355776" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877355784">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355785">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355786" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877355787">
                  <link role="link" targetNodeId="1.1068390468199" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355788">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355789">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355790">
              <link role="variableDeclaration" targetNodeId="1213877355776" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877355791">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355792">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355793" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877355794">
                  <link role="link" targetNodeId="1.1070462273904" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355795">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355796">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355797">
              <link role="variableDeclaration" targetNodeId="1213877355776" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877355798">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355799">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355800" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877355801">
                  <link role="link" targetNodeId="1.1068390468201" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355802">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355803">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355804">
              <link role="variableDeclaration" targetNodeId="1213877355776" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877355805">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355806">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355807" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877355808">
                  <link role="link" targetNodeId="1.1178616825527" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355809">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355810">
            <link role="variableDeclaration" targetNodeId="1213877355776" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877355811" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724363" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877355812">
      <property name="name" value="isDescendant" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877355813" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355814">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877355815">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877355816">
            <property name="name" value="namesAreSame" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877355817" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877355818">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355819">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877355820">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355821">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355822">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877355823">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877355824">
                      <property name="value" value="false" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355825">
                      <link role="variableDeclaration" targetNodeId="1213877355816" resolveInfo="namesAreSame" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877355826">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877355827" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355828">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877355829">
                    <link role="variableDeclaration" targetNodeId="1213877355882" resolveInfo="classToCompare" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355830">
                    <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877355831">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355832">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355833">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877355834">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877355835">
                        <property name="value" value="true" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355836">
                        <link role="variableDeclaration" targetNodeId="1213877355816" resolveInfo="namesAreSame" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877355837">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877355838" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355839">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355840" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355841">
                <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877355842">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355843">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355844">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877355845">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355846">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355847">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355848" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355849">
                        <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877355850">
                      <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355851">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877355852">
                          <link role="variableDeclaration" targetNodeId="1213877355882" resolveInfo="classToCompare" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355853">
                          <link role="conceptMethodDeclaration" targetNodeId="3v.1213877404258" resolveInfo="getFqName" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355854">
                    <link role="variableDeclaration" targetNodeId="1213877355816" resolveInfo="namesAreSame" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877355855">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355856">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877355857">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877355858">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877355859">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355860">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877355861">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877355862">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877355863" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355864">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355865" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877355866">
                      <link role="link" targetNodeId="1.1165602531693" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355867">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877355868">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877355869">
                      <property name="value" value="false" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877355870">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355871">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877355872">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355873">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355874">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355875">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355876" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877355877">
                              <link role="link" targetNodeId="1.1165602531693" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877355878">
                            <link role="link" targetNodeId="1.1107535924139" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355879">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877355812" resolveInfo="isDescendant" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877355880">
                            <link role="variableDeclaration" targetNodeId="1213877355882" resolveInfo="classToCompare" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877355881">
            <link role="variableDeclaration" targetNodeId="1213877355816" resolveInfo="namesAreSame" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877355882">
        <property name="name" value="classToCompare" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877355883">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724059" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877355884">
      <property name="name" value="getMainMethod" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877355885">
        <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355886">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877355887">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355888">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355889">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355890">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877355891" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877355892">
                  <link role="link" targetNodeId="1.1070462273904" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1213877355893">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1213877355894">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877355895">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355896">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877355897">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877355898">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877355899">
                          <link role="closureParameter" targetNodeId="1213877355895" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877355900">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877536670" resolveInfo="isMainMethod" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877355901" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723950" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1214840497917">
      <property name="name" value="hasStaticMemebers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1214840444586" resolveInfo="hasStaticMemebers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1214840497919">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1214840503996">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1214840507395">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1214840519558">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1214840520027">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840513623">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840509079">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1214840508816" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1214840512954">
                    <link role="link" targetNodeId="1.1070462273904" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.CountOperation" id="1214840517950" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1214840505320">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1214840504854" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1214840506273">
                <link role="conceptMethodDeclaration" targetNodeId="1214840444586" resolveInfo="hasStaticMemebers" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1214840502561" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724474" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877355902">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877355903" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877360520">
    <property name="package" value="if" />
    <link role="concept" targetNodeId="1.1206060495898" resolveInfo="ElsifClause" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877360521">
      <property name="name" value="getIfStatement" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877360522">
        <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877360523">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877360524">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877360525">
            <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877360526">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877360527" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877360528" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723918" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1217846674032">
      <property name="name" value="convertToElseClause" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1217846698730" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217846674034">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217846708294">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217846708295">
            <property name="name" value="ifStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217846708296">
              <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846714392">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217846714393" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1217846714394">
                <link role="conceptMethodDeclaration" targetNodeId="1213877360521" resolveInfo="getIfStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217846721005">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217846721006">
            <property name="name" value="elseStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217846721007">
              <link role="concept" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217846728447">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1217846728448">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217846728449">
                  <link role="concept" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217846737248">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846747613">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846737734">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217846737249">
                <link role="variableDeclaration" targetNodeId="1217846721006" resolveInfo="elseStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217846747347">
                <link role="link" targetNodeId="1.1082485599096" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1217846757054">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846763143">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846759762">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217846759510" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217846762751">
                    <link role="link" targetNodeId="1.1206060644605" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1217846763757" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217846773170">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846773408">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217846773171" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1217846774365" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217846777072">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846780112">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217846777450">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217846777073">
                <link role="variableDeclaration" targetNodeId="1217846708295" resolveInfo="ifStatement" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217846786460">
                <link role="link" targetNodeId="1.1082485599094" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1217846788103">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217846790482">
                <link role="variableDeclaration" targetNodeId="1217846721006" resolveInfo="elseStatement" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724130" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877360529">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877360530" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877366364">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1178893518978" resolveInfo="ThisConstructorInvocation" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877366365">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877366366" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877367054">
    <link role="concept" targetNodeId="1.1188206331916" resolveInfo="Annotation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877367055">
      <property name="name" value="getMembers" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877531970" resolveInfo="getMembers" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877367056">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877367057">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877367058">
            <property name="name" value="members" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877367059" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877367060">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1213877367061" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877367062">
                <link role="conceptMethodDeclaration" targetNodeId="1213877531970" resolveInfo="getMembers" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877367063">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877367064">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877367065">
              <link role="variableDeclaration" targetNodeId="1213877367058" resolveInfo="members" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877367066">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877367067">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877367068" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877367069">
                  <link role="link" targetNodeId="1.1188206594042" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877367070">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877367071">
            <link role="variableDeclaration" targetNodeId="1213877367058" resolveInfo="members" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877367072" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724851" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877367073">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877367074">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877367075">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877367076">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877367077">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877367078" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877367079">
                <link role="link" targetNodeId="1.1178549650460" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1213877367080">
              <link role="concept" targetNodeId="1.1146644602865" resolveInfo="PublicVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877374431">
    <property name="package" value="conceptFunction" />
    <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877374432">
      <property name="name" value="usesParameterObjectFor" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877374433" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877374434">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877374435">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374436">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877374437" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877374438">
              <link role="conceptProperty" targetNodeId="1.1199874763892" resolveInfo="usesParameterObject" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877374439">
        <property name="name" value="parameter" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877374440">
          <link role="concept" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724698" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877374441">
      <property name="isVirtual" value="true" />
      <property name="name" value="getExpectedReturnType" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877374442">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877374443">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877374444">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374445">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374446">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877374447" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1213877374448">
                <link role="conceptLinkDeclaration" targetNodeId="1.1137545148427" resolveInfo="conceptFunctionReturnType" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877374449" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724027" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877374450">
      <property name="name" value="getParameters" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877374451">
        <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1213877374452">
          <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877374453">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877374454">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877374455">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877374456" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877374457" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877374458">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877374459">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877374460">
                <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1213877374461">
                  <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1213877374462">
                    <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877374463">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877374464">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877374465">
              <link role="elementConcept" targetNodeId="13.1071489090640" resolveInfo="ConceptDeclaration" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877374466">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1213877374467">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877374468">
                  <link role="elementConcept" targetNodeId="13.1071489090640" resolveInfo="ConceptDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877374469">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374470">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877374471">
              <link role="variableDeclaration" targetNodeId="1213877374464" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877374472">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374473">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877374474" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1213877374475">
                  <link role="conceptLinkDeclaration" targetNodeId="1.1137546998352" resolveInfo="conceptFunctionParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877374476">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374477">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877374478">
              <link role="variableDeclaration" targetNodeId="1213877374464" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddAllElementsOperation" id="1213877374479">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877374480">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877374481" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1213877374482">
                  <link role="conceptLinkDeclaration" targetNodeId="1.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877374483">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1213877374484">
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877374485">
              <node role="elementType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1213877374486">
                <link role="conceptDeclaraton" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
              </node>
            </node>
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877374487">
              <link role="variableDeclaration" targetNodeId="1213877374464" resolveInfo="result" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724980" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1216468837268">
      <property name="name" value="getName" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1216468886350">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216468837270">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1216468897066">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1216468903885">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1216468902782" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1216468908680">
              <link role="conceptProperty" targetNodeId="2v.1137473891462" resolveInfo="alias" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724276" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877374488">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877374489" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877377000">
    <link role="concept" targetNodeId="1.1081855346303" resolveInfo="BreakStatement" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877377001">
      <property name="name" value="getLoop" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377002">
        <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377003">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877377004">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877377005">
            <property name="name" value="loopOrSwitch" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377006" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377007">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377008" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877377009">
                <link role="conceptMethodDeclaration" targetNodeId="1213877377041" resolveInfo="getLoopOrSwitch" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377010">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377011">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377012">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877377013">
                <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377014">
                  <link role="variableDeclaration" targetNodeId="1213877377005" resolveInfo="loopOrSwitch" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377015">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377016">
              <link role="variableDeclaration" targetNodeId="1213877377005" resolveInfo="loopOrSwitch" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877377017">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877377018">
                <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377019">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377020" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723909" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877377021">
      <property name="name" value="getSwitch" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377022">
        <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377023">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877377024">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877377025">
            <property name="name" value="loopOrSwitch" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377026" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377027">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377028" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877377029">
                <link role="conceptMethodDeclaration" targetNodeId="1213877377041" resolveInfo="getLoopOrSwitch" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377030">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377031">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377032">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877377033">
                <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377034">
                  <link role="variableDeclaration" targetNodeId="1213877377025" resolveInfo="loopOrSwitch" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377035">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377036">
              <link role="variableDeclaration" targetNodeId="1213877377025" resolveInfo="loopOrSwitch" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877377037">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877377038">
                <link role="conceptDeclaration" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377039">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377040" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724210" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877377041">
      <property name="isPrivate" value="false" />
      <property name="name" value="getLoopOrSwitch" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377042" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377043">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877377044">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377045">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377046" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1213877377047">
              <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1213877377048">
                <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213877377049">
                  <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                </node>
                <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213877377050">
                  <link role="concept" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877377051">
            <property name="name" value="item" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377052" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377053">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377054">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877377055">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877377056">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377057" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377058">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377059" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877377060">
                      <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377061">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377062">
                    <link role="variableDeclaration" targetNodeId="1213877377051" resolveInfo="item" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877377063">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877377064">
                      <link role="conceptDeclaration" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377065">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377066">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377067">
                    <link role="variableDeclaration" targetNodeId="1213877377051" resolveInfo="item" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377068">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377069">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877377070">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877377071">
                    <property name="name" value="loop" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877377072">
                      <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877377073">
                      <link role="concept" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377074">
                        <link role="variableDeclaration" targetNodeId="1213877377051" resolveInfo="item" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377075">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377076">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377077">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377078">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377079">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377080">
                            <link role="variableDeclaration" targetNodeId="1213877377071" resolveInfo="loop" />
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877377081">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377082" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377083">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377084">
                            <link role="variableDeclaration" targetNodeId="1213877377071" resolveInfo="loop" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877377085">
                            <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877377086">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377087" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377088">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377089" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877377090">
                        <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877377091">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377092">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877377093">
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377094">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377095">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377096">
                              <link role="variableDeclaration" targetNodeId="1213877377071" resolveInfo="loop" />
                            </node>
                          </node>
                        </node>
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377097">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377098">
                            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877377099" />
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877377100">
                              <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877377101">
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377102">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377103">
                                <link role="variableDeclaration" targetNodeId="1213877377071" resolveInfo="loop" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877377104">
                                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877377105">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877377106">
                  <link role="variableDeclaration" targetNodeId="1213877377051" resolveInfo="item" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877377107">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877377108">
                    <link role="conceptDeclaration" targetNodeId="1.1154032098014" resolveInfo="AbstractLoopStatement" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877377109">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877377110" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility" id="1219155723772" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877377111">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877377112" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877379420">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1208890769693" resolveInfo="ArrayLengthOperation" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877379421">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877379422" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877383133">
    <property name="package" value="property" />
    <link role="concept" targetNodeId="1.1201370618622" resolveInfo="Property" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383134">
      <property name="name" value="isDefaultImplementation" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877383135" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383136">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383137">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383138">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383139">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383140" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383141">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877383142">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877383143">
                <link role="conceptDeclaration" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724590" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383144">
      <property name="name" value="isCustomImplementation" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877383145" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383146">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383147">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383148">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383149">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383150" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383151">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877383152">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877383153">
                <link role="conceptDeclaration" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724309" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383154">
      <property name="name" value="getCustomPropertyImplementation" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877383155">
        <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383156">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383157">
          <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877383158">
            <link role="concept" targetNodeId="1.1201398722958" resolveInfo="CustomPropertyImplementation" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383159">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383160" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383161">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724542" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383162">
      <property name="name" value="getPropertyNameWithId" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877383163">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383164">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383165">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877383166">
            <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.capitalize(java.lang.String):java.lang.String" resolveInfo="capitalize" />
            <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383167">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383168" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877383169">
                <link role="property" targetNodeId="1.1201371481316" resolveInfo="propertyName" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724780" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383170">
      <property name="name" value="getGetterMethodName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877383171">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383172">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383173">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877383174">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383175">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383176" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877383177">
                <link role="conceptMethodDeclaration" targetNodeId="1213877383162" resolveInfo="getPropertyNameWithId" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877383178">
              <property name="value" value="get" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723840" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383179">
      <property name="name" value="getSetterMethodName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877383180">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383181">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383182">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877383183">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383184">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383185" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877383186">
                <link role="conceptMethodDeclaration" targetNodeId="1213877383162" resolveInfo="getPropertyNameWithId" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877383187">
              <property name="value" value="set" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724085" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383188">
      <property name="name" value="getSetterVisibility" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877383189">
        <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383190">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877383191">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877383192">
            <property name="name" value="visibility" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877383193">
              <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383194">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383195" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383196">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877383197">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383198">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877383199">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877383200">
                <property name="name" value="setterVisibility" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877383201">
                  <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383202">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383203">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877383204">
                      <link role="concept" targetNodeId="1.1201372606839" resolveInfo="DefaultPropertyImplementation" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383205">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383206" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383207">
                          <link role="link" targetNodeId="1.1201372378714" />
                        </node>
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383208">
                      <link role="link" targetNodeId="1.1202078082794" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383209">
                    <link role="link" targetNodeId="1.1202077744034" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877383210">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383211">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383212">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877383213">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877383214">
                      <link role="variableDeclaration" targetNodeId="1213877383200" resolveInfo="setterVisibility" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877383215">
                      <link role="variableDeclaration" targetNodeId="1213877383192" resolveInfo="visibility" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383216">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877383217">
                  <link role="variableDeclaration" targetNodeId="1213877383200" resolveInfo="setterVisibility" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877383218" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383219">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383220" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877383221">
              <link role="conceptMethodDeclaration" targetNodeId="1213877383134" resolveInfo="isDefaultImplementation" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383222">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877383223">
            <link role="variableDeclaration" targetNodeId="1213877383192" resolveInfo="visibility" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724935" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877383224">
      <property name="name" value="hasSetter" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877383225" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383226">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383227">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383228">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383229">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383230" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383231">
                <link role="link" targetNodeId="1.1201372378714" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877383232">
              <link role="conceptMethodDeclaration" targetNodeId="1213877430658" resolveInfo="hasSetter" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724728" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877383233">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877383234">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877383235">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383236">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877383237">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877383238" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877383239">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation" id="1213877383240">
              <link role="concept" targetNodeId="1.1146644602865" resolveInfo="PublicVisibility" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877400601">
    <link role="concept" targetNodeId="1.1083260308424" resolveInfo="EnumConstantReference" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877400602">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877400603">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877400604">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877400605">
            <property name="name" value="enumClass" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877400606">
              <link role="concept" targetNodeId="1.1083245097125" resolveInfo="EnumClass" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877400607">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877400608" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877400609">
                <link role="link" targetNodeId="1.1144432896254" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877400610">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877400611">
            <property name="name" value="name" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877400612">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877400613">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877400614">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877400615" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877400616">
                  <link role="link" targetNodeId="1.1083260308426" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877400617">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877400618">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877400619">
            <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.getEnum(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String):java.lang.Enum" resolveInfo="getEnum" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877400620">
              <link role="variableDeclaration" targetNodeId="1213877400623" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877400621">
              <link role="variableDeclaration" targetNodeId="1213877400605" resolveInfo="enumClass" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877400622">
              <link role="variableDeclaration" targetNodeId="1213877400611" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877400623">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877400624">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877400625">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724867" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877400626">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877400627" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877410069">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197027803184" resolveInfo="IOperation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410070">
      <property name="name" value="getOperand" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877410071">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410072">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410073">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410074">
            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877410075">
              <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410076">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877410077" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877410078" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877410079">
              <link role="link" targetNodeId="1.1197027771414" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724137" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410080">
      <property name="name" value="isLValue" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877410081" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410082">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410083">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410084">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877410085" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877410086">
              <link role="conceptProperty" targetNodeId="1.1197029536315" resolveInfo="lvalue" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724908" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410087">
      <property name="isVirtual" value="true" />
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877410088">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410089">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410090">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877410091" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724560" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877410092">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410093" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877410687">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410688">
      <property name="name" value="isLValue" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519786" resolveInfo="isLValue" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410689">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410690">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410691">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410692">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877410693" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877410694">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877410695">
              <link role="conceptMethodDeclaration" targetNodeId="1213877410080" resolveInfo="isLValue" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877410696" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723913" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410697">
      <property name="name" value="getClassifier" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877410698">
        <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410699">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410700">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410701">
            <node role="operand" type="jetbrains.mps.bootstrap.helgins.structure.CoerceStrongExpression" id="1213877410702">
              <node role="nodeToCoerce" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410703">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410704">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877410705" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877410706">
                    <link role="link" targetNodeId="1.1197027771414" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1213877410707" />
              </node>
              <node role="pattern" type="jetbrains.mps.bootstrap.helgins.structure.ConceptReference" id="1213877410708">
                <property name="name" value="classifierType" />
                <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877410709">
              <link role="link" targetNodeId="1.1107535924139" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725036" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877410710">
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519781" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410711">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877410712">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410713">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877410714">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877410715" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877410716">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877410717">
              <link role="conceptMethodDeclaration" targetNodeId="1213877410087" resolveInfo="getVariableExpectedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877410718">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724358" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1219275067231">
      <property name="name" value="eval" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219275067233">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1219275109143">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219275109145">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219275221972">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219275221973">
                <property name="name" value="instance" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275221974">
                  <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275221975">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275221976">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1219275221977" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219275237503">
                      <link role="link" targetNodeId="1.1197027771414" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1219275221979">
                    <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219275221980">
                      <link role="variableDeclaration" targetNodeId="1219275073969" resolveInfo="module" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219275308573">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219275308574">
                <property name="name" value="methodCall" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1219275308575">
                  <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1219275308576">
                  <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275308577">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1219275308578" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219275308579">
                      <link role="link" targetNodeId="1.1197027833540" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219275221981">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219275221982">
                <property name="name" value="method" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275221983">
                  <link role="classifier" targetNodeId="12.~Method" resolveInfo="Method" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275221984">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275221985">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219275308580">
                      <link role="variableDeclaration" targetNodeId="1219275308574" resolveInfo="methodCallOperation" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219275275854">
                      <link role="link" targetNodeId="1.1202948736718" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1219275221988">
                    <link role="conceptMethodDeclaration" targetNodeId="1213877350393" resolveInfo="getMethod" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219275221989">
                      <link role="variableDeclaration" targetNodeId="1219275073969" resolveInfo="module" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1219275221990">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1219275221991">
                <property name="name" value="actualArguments" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1219275221992">
                  <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275221993">
                    <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275221994">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219275325628">
                    <link role="variableDeclaration" targetNodeId="1219275308574" resolveInfo="methodCall" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1219275221996">
                    <link role="conceptMethodDeclaration" targetNodeId="1219275428261" resolveInfo="getActualArguments" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219275221997">
                      <link role="variableDeclaration" targetNodeId="1219275073969" resolveInfo="module" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219275480910">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1219275480911">
                <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
                <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.invoke(java.lang.reflect.Method,java.lang.Object,java.lang.Object[]):java.lang.Object" resolveInfo="invoke" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219275480912">
                  <link role="variableDeclaration" targetNodeId="1219275221982" resolveInfo="method" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219275480913">
                  <link role="variableDeclaration" targetNodeId="1219275221973" resolveInfo="instance" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1219275480914">
                  <link role="variableDeclaration" targetNodeId="1219275221991" resolveInfo="actualArguments" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275174558">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275170241">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1219275167646" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1219275173354">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1219275176608">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1219275181780">
                <link role="conceptDeclaration" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1219275486524">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275496058">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.SuperNodeExpression" id="1219275488245" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1219275497764">
              <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219275499453">
                <link role="variableDeclaration" targetNodeId="1219275073969" resolveInfo="module" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219275073969">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275073970">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275073971">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877410719">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877410720" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877415066">
    <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877415067">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877415068" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877417754">
    <link role="concept" targetNodeId="1.1153179560115" resolveInfo="ClosureParameterReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877417755">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877417756" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877419060">
    <link role="concept" targetNodeId="1.1188207840427" resolveInfo="AnnotationInstance" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877419061">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877419062" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877420728">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534604311" resolveInfo="ByteType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877420729">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877420730">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877420731">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877420732">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877420733">
              <link role="classifier" targetNodeId="2.~Byte" resolveInfo="Byte" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877420734">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724611" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877420735">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877420736">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877420737">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877420738">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877420739">
              <link role="classifier" targetNodeId="2.~Byte" resolveInfo="Byte" />
              <link role="variableDeclaration" targetNodeId="2.~Byte.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877420740">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724984" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877420741">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877420742" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877421700">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1171903862077" resolveInfo="LowerBoundType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877421701">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877421702">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877421703">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877421704">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877421705">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877421706">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877421707">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877421708">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877421709" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877421710">
                      <link role="link" targetNodeId="1.1171903869531" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877421711">
                    <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877421712">
                  <property name="value" value="? super " />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877421713">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877421714" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877421715">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877421716" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877421717">
                <link role="link" targetNodeId="1.1171903869531" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877421718">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877421719">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877421720">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877421721">
                  <property name="value" value="? super ???" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877421722">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723915" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877421723">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877421724" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877426176">
    <link role="concept" targetNodeId="1.1188214545140" resolveInfo="AnnotationInstanceValue" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877426177">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877426178" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877427547">
    <link role="concept" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877427548">
      <property name="name" value="isTodo" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877427549" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877427550">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877427551">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877427552">
            <property name="name" value="v" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877427553">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877427554">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877427555" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877427556">
                <link role="property" targetNodeId="1.1168623065899" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877427557">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877427558">
            <property name="name" value="isToDo" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877427559" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877427560">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877427561">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877427562">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877427563" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427564">
              <link role="variableDeclaration" targetNodeId="1213877427552" resolveInfo="v" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877427565">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877427566">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877427567">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427568">
                  <link role="variableDeclaration" targetNodeId="1213877427558" resolveInfo="isToDo" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877427569">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877427570">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877427571">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427572">
                        <link role="variableDeclaration" targetNodeId="1213877427552" resolveInfo="v" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877427573">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877427574">
                          <property name="value" value="todo:" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877427575">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427576">
                        <link role="variableDeclaration" targetNodeId="1213877427552" resolveInfo="v" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877427577">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877427578">
                          <property name="value" value="FIX:" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877427579">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427580">
                      <link role="variableDeclaration" targetNodeId="1213877427552" resolveInfo="v" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877427581">
                      <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877427582">
                        <property name="value" value="TODO:" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877427583">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877427584">
            <link role="variableDeclaration" targetNodeId="1213877427558" resolveInfo="isToDo" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724861" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877427585">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877427586" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877430657">
    <property name="package" value="property.implementation" />
    <link role="concept" targetNodeId="1.1201372346056" resolveInfo="PropertyImplementation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877430658">
      <property name="name" value="hasSetter" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877430659" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877430660" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724732" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877430661">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877430662" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877433049">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1204053956946" resolveInfo="IMethodCall" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1219275428261">
      <property name="name" value="getActualArguments" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1219275428262">
        <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275428263">
          <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219275428264">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219275428265">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275428266">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275428267">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275428268">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1219275428269" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1219275428270">
                  <link role="link" targetNodeId="1.1068499141038" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectOperation" id="1219275428271">
                <node role="selector" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SelectorBlock" id="1219275428272">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1219275428273">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219275428274">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1219275428275">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1219275428276">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1219275428277">
                          <link role="closureParameter" targetNodeId="1219275428273" resolveInfo="it" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1219275428278">
                          <link role="conceptMethodDeclaration" targetNodeId="1213877519769" resolveInfo="eval" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1219275428279">
                            <link role="variableDeclaration" targetNodeId="1219275428281" resolveInfo="module" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1219275428280" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1219275428281">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1219275428282">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219275428283" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877433050">
      <property name="name" value="deriveType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877435747" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877433051">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1213877433052">
          <property name="value" value="is 'experssion' an actual argument in this method call?" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877433053">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877433054">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877433055">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877433056">
                <property name="name" value="method" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877433057">
                  <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433058">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877433059" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877433060">
                    <link role="link" targetNodeId="1.1068499141037" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877433061">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877433062">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1213877433063" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433064">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877433065">
                    <link role="variableDeclaration" targetNodeId="1213877433102" resolveInfo="expression" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetIndexInParentOperation" id="1213877433066" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877433067">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877433068">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877433069">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877433070">
                    <property name="name" value="parameterDeclaration" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877433071">
                      <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433072">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433073">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877433074">
                          <link role="variableDeclaration" targetNodeId="1213877433056" resolveInfo="method" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877433075">
                          <link role="link" targetNodeId="1.1068580123134" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation" id="1213877433076">
                        <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877433077">
                          <link role="variableDeclaration" targetNodeId="1213877433062" resolveInfo="i" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877433078">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433079">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433080">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877433081">
                        <link role="variableDeclaration" targetNodeId="1213877433070" resolveInfo="parameterDeclaration" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877433082">
                        <link role="link" targetNodeId="1.1068431790188" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877433083" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1213877433084">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433085">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433086">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877433087">
                      <link role="variableDeclaration" targetNodeId="1213877433056" resolveInfo="method" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877433088">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1213877433089" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877433090">
                  <link role="variableDeclaration" targetNodeId="1213877433062" resolveInfo="i" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877433091">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433092">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877433093">
                <link role="variableDeclaration" targetNodeId="1213877433102" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1213877433094">
                <link role="linkInParent" targetNodeId="1.1068499141038" />
                <link role="conceptOfParent" targetNodeId="1.1204053956946" resolveInfo="IMethodCall" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877433095">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877433096">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877433097">
                  <link role="variableDeclaration" targetNodeId="1213877433102" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877433098" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877433099" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877433100">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877433101" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877433102">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877433103">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877433104">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724109" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877433105">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877433106" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877435147">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877435148">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877435149" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877435744">
    <link role="concept" targetNodeId="1.1201183863028" resolveInfo="TypeDerivable" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877435745">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877435746" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877435747">
      <property name="name" value="deriveType" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877435748">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877435749">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877435750">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877435751" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877435752">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877435753">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724553" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877436332">
    <link role="concept" targetNodeId="1.1068580123140" resolveInfo="ConstructorDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877436333">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436334">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877436335">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877436336">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877436337">
              <link role="classifier" targetNodeId="2.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877436338">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877436339">
                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436340">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436341">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436342">
              <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436343">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436344">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877436345" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877436346">
                  <link role="property" targetNodeId="1.1211505677611" resolveInfo="nestedName" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436347">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436348">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436349">
              <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436350">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877436351">
                <property name="value" value="(" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877436352">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877436353">
            <property name="name" value="first" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877436354" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877436355">
              <property name="value" value="true" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877436356">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436357">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877436358" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877436359">
              <link role="link" targetNodeId="1.1068580123134" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877436360">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877436361">
              <link role="concept" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436362">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877436363">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877436364">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436365">
                  <link role="variableDeclaration" targetNodeId="1213877436353" resolveInfo="first" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436366">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436367">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436368">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436369">
                      <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436370">
                      <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877436371">
                        <property name="value" value="," />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1219237347770">
              <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1219237347771">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1219237347772" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436372">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877436373">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877436374">
                  <property name="value" value="false" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436375">
                  <link role="variableDeclaration" targetNodeId="1213877436353" resolveInfo="first" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877436376">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436377">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436378">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436379">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436380">
                      <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436381">
                      <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436382">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436383">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436384">
                            <link role="variableDeclaration" targetNodeId="1213877436360" resolveInfo="parm" />
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877436385">
                            <link role="link" targetNodeId="1.1068431790188" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877436386">
                          <link role="conceptMethodDeclaration" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877436387">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877436388" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436389">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436390">
                    <link role="variableDeclaration" targetNodeId="1213877436360" resolveInfo="parm" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877436391">
                    <link role="link" targetNodeId="1.1068431790188" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877436392">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436393">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436394">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436395">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436396">
                        <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436397">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877436398">
                          <property name="value" value="???" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877436399">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436400">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436401">
              <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436402">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877436403">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877436404">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877436405">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877436406">
              <link role="variableDeclaration" targetNodeId="1213877436336" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877436407">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877436408">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724853" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877436409">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877436410" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877440703">
    <property name="package" value="property" />
    <link role="concept" targetNodeId="1.1201385106094" resolveInfo="PropertyReference" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877440704">
      <property name="name" value="isLValue" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877410080" resolveInfo="isLValue" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877440705">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877440706">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877440707">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877440708">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877440709" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877440710">
                <link role="link" targetNodeId="1.1201385237847" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877440711">
              <link role="conceptMethodDeclaration" targetNodeId="1213877383224" resolveInfo="hasSetter" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877440712" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724543" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877440713">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877440714" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877443337">
    <property name="package" value="type" />
    <link role="concept" targetNodeId="1.1206036041805" resolveInfo="IInternalType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877443338">
      <property name="name" value="getPublicType" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877443339">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877443340" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724933" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877443341">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877443342" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877471250">
    <link role="concept" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877471251">
      <property name="name" value="inline" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517476" resolveInfo="inline" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471252">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471253">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471254">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877471255" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877471256">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877471257" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471258">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471259" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877471260">
                <link role="link" targetNodeId="1.1068431790190" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471261">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471262">
            <property name="name" value="modelDescriptor" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877471263">
              <link role="classifier" targetNodeId="9.~SModelDescriptor" resolveInfo="SModelDescriptor" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471264">
              <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1213877471265">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471266">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471267" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1213877471268" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471269">
                <link role="baseMethodDeclaration" targetNodeId="9.~SModel.getModelDescriptor():jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1213877471270">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877471271">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877471272" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471273">
              <link role="variableDeclaration" targetNodeId="1213877471262" resolveInfo="modelDescriptor" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471274">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471275">
            <property name="name" value="usages" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877471276">
              <link role="classifier" targetNodeId="8.~Set" resolveInfo="Set" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877471277">
                <link role="classifier" targetNodeId="9.~SReference" resolveInfo="SReference" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471278">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471279">
                <link role="variableDeclaration" targetNodeId="1213877471262" resolveInfo="modelDescriptor" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471280">
                <link role="baseMethodDeclaration" targetNodeId="9.~SModelDescriptor.findUsages(jetbrains.mps.smodel.SNode):java.util.Set" resolveInfo="findUsages" />
                <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471281" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471282">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471283">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471284">
              <link role="variableDeclaration" targetNodeId="1213877471275" resolveInfo="usages" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471285">
              <link role="baseMethodDeclaration" targetNodeId="8.~Set.isEmpty():boolean" resolveInfo="isEmpty" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471286">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471287">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877471288">
                <link role="classConcept" targetNodeId="14.~JOptionPane" resolveInfo="JOptionPane" />
                <link role="baseMethodDeclaration" targetNodeId="14.~JOptionPane.showMessageDialog(java.awt.Component,java.lang.Object,java.lang.String,int):void" resolveInfo="showMessageDialog" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471289">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877471290">
                    <link role="variableDeclaration" targetNodeId="1213877471382" resolveInfo="editorContext" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471291">
                    <link role="baseMethodDeclaration" targetNodeId="15.~EditorContext.getNodeEditorComponent():jetbrains.mps.nodeEditor.EditorComponent" resolveInfo="getNodeEditorComponent" />
                  </node>
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877471292">
                  <property name="value" value="Variable is never used" />
                </node>
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877471293" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877471294">
                  <link role="variableDeclaration" targetNodeId="14.~JOptionPane.INFORMATION_MESSAGE" resolveInfo="INFORMATION_MESSAGE" />
                  <link role="classifier" targetNodeId="14.~JOptionPane" resolveInfo="JOptionPane" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877471295" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877471296">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471297">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471298">
                <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471299">
                  <property name="name" value="code" />
                  <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1213877471300" />
                  <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877471301">
                    <link role="baseMethodDeclaration" targetNodeId="14.~JOptionPane.showConfirmDialog(java.awt.Component,java.lang.Object,java.lang.String,int):int" resolveInfo="showConfirmDialog" />
                    <link role="classConcept" targetNodeId="14.~JOptionPane" resolveInfo="JOptionPane" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471302">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877471303">
                        <link role="variableDeclaration" targetNodeId="1213877471382" resolveInfo="editorContext" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471304">
                        <link role="baseMethodDeclaration" targetNodeId="15.~EditorContext.getNodeEditorComponent():jetbrains.mps.nodeEditor.EditorComponent" resolveInfo="getNodeEditorComponent" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877471305">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1213877471306">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877471307">
                          <property name="value" value=" occurrences)" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471308">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471309">
                            <link role="variableDeclaration" targetNodeId="1213877471275" resolveInfo="usages" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471310">
                            <link role="baseMethodDeclaration" targetNodeId="8.~Set.size():int" resolveInfo="size" />
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877471311">
                        <property name="value" value="Inline variable? (" />
                      </node>
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877471312" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877471313">
                      <link role="variableDeclaration" targetNodeId="14.~JOptionPane.YES_NO_OPTION" resolveInfo="YES_NO_OPTION" />
                      <link role="classifier" targetNodeId="14.~JOptionPane" resolveInfo="JOptionPane" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471314">
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877471315">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877471316">
                    <link role="variableDeclaration" targetNodeId="14.~JOptionPane.YES_OPTION" resolveInfo="YES_OPTION" />
                    <link role="classifier" targetNodeId="14.~JOptionPane" resolveInfo="JOptionPane" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471317">
                    <link role="variableDeclaration" targetNodeId="1213877471299" resolveInfo="code" />
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471318">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877471319" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471320">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471321">
            <property name="name" value="newSelection" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471322" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877471323" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1213877471324">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471325">
            <link role="variableDeclaration" targetNodeId="1213877471275" resolveInfo="usages" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471326">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877471327">
              <link role="classifier" targetNodeId="9.~SReference" resolveInfo="SReference" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471328">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471329">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471330">
                <property name="name" value="sourceNode" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471331" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471332">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471333">
                    <link role="variableDeclaration" targetNodeId="1213877471326" resolveInfo="ref" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471334">
                    <link role="baseMethodDeclaration" targetNodeId="9.~SReference.getSourceNode():jetbrains.mps.smodel.SNode" resolveInfo="getSourceNode" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471335">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471336">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471337">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471338">
                    <property name="name" value="copy" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471339">
                      <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471340">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471341">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471342" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877471343">
                          <link role="link" targetNodeId="1.1068431790190" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877471344" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471345">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471346">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471347">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877471348">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471349">
                          <link role="variableDeclaration" targetNodeId="1213877471338" resolveInfo="copy" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471350">
                          <link role="variableDeclaration" targetNodeId="1213877471321" resolveInfo="newSelection" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877471351">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877471352" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471353">
                      <link role="variableDeclaration" targetNodeId="1213877471321" resolveInfo="newSelection" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471354">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471355">
                    <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877471356">
                      <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471357">
                        <link role="variableDeclaration" targetNodeId="1213877471330" resolveInfo="sourceNode" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1213877471358">
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471359">
                        <link role="variableDeclaration" targetNodeId="1213877471338" resolveInfo="copy" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471360">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471361">
                  <link role="variableDeclaration" targetNodeId="1213877471330" resolveInfo="sourceNode" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877471362">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877471363">
                    <link role="conceptDeclaration" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471364">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471365">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471366">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471367" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213877471368">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877471369">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877471370">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation" id="1213877471371" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877471372">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471373">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471374">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471375">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877471376">
                  <link role="variableDeclaration" targetNodeId="1213877471382" resolveInfo="editorContext" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877471377">
                  <link role="baseMethodDeclaration" targetNodeId="15.~EditorContext.select(jetbrains.mps.smodel.SNode):void" resolveInfo="select" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471378">
                    <link role="variableDeclaration" targetNodeId="1213877471321" resolveInfo="newSelection" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877471379">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877471380" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471381">
              <link role="variableDeclaration" targetNodeId="1213877471321" resolveInfo="newSelection" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877471382">
        <property name="name" value="editorContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877471383">
          <link role="classifier" targetNodeId="15.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877471384" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723837" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877471385">
      <property name="name" value="isInitializable" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517488" resolveInfo="isInitializable" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471386">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471387">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471388">
            <property name="name" value="parent" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471389" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471390">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471391" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877471392" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471393">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877471394">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471395">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471396">
                <link role="variableDeclaration" targetNodeId="1213877471388" resolveInfo="parent" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877471397">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877471398">
                  <link role="conceptDeclaration" targetNodeId="1.1144231330558" resolveInfo="ForStatement" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471399">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471400">
                <link role="variableDeclaration" targetNodeId="1213877471388" resolveInfo="parent" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877471401">
                <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877471402">
                  <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877471403" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724636" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877471404">
      <property name="name" value="createReference" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877517482" resolveInfo="createReference" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471405">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877471406">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877471407">
            <property name="name" value="ref" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471408">
              <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877471409">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1213877471410">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471411">
                  <link role="concept" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877471412">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471413">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877471414">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471415">
                <link role="variableDeclaration" targetNodeId="1213877471407" resolveInfo="ref" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877471416">
                <link role="link" targetNodeId="1.1070568296581" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1213877471417">
              <node role="parameter" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877471418" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877471419">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877471420">
            <link role="variableDeclaration" targetNodeId="1213877471407" resolveInfo="ref" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877471421">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724932" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877471422">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877471423" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877475647">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1116615150612" resolveInfo="ClassifierClassExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877475648">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877475649" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877476691">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1070475587102" resolveInfo="SuperConstructorInvocation" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877476692">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877476693" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877482533">
    <property name="package" value="classifier" />
    <link role="concept" targetNodeId="1.1212685548494" resolveInfo="ClassCreator" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877482534">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877482535" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877484358">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877484359">
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877410087" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484360">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877484361">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877484362">
            <property name="name" value="variableExpectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877484363">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877484364" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877484365">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484366">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484367">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877484368" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877484369">
                <link role="link" targetNodeId="1.1202948736718" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877484370" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484371">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877484372">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877484373">
                <property name="name" value="name" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877484374">
                  <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484375">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484376">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877484377" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877484378">
                      <link role="link" targetNodeId="1.1202948736718" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877484379">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877484380">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484381">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877484382">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877484383">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484384">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484385">
                        <link role="variableDeclaration" targetNodeId="1213877484373" resolveInfo="name" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877484386">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.substring(int):java.lang.String" resolveInfo="substring" />
                        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877484387">
                          <property name="value" value="3" />
                        </node>
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484388">
                      <link role="variableDeclaration" targetNodeId="1213877484362" resolveInfo="variableExpectedName" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484389">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484390">
                  <link role="variableDeclaration" targetNodeId="1213877484373" resolveInfo="name" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877484391">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877484392">
                    <property name="value" value="get" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877484393">
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484394">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877484395">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877484396">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484397">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484398">
                          <link role="variableDeclaration" targetNodeId="1213877484373" resolveInfo="name" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877484399">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.substring(int):java.lang.String" resolveInfo="substring" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877484400">
                            <property name="value" value="2" />
                          </node>
                        </node>
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484401">
                        <link role="variableDeclaration" targetNodeId="1213877484362" resolveInfo="variableExpectedName" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877484402">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484403">
                    <link role="variableDeclaration" targetNodeId="1213877484373" resolveInfo="name" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877484404">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.startsWith(java.lang.String):boolean" resolveInfo="startsWith" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877484405">
                      <property name="value" value="is" />
                    </node>
                  </node>
                </node>
                <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877484406">
                  <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484407">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877484408">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877484409">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484410">
                          <link role="variableDeclaration" targetNodeId="1213877484373" resolveInfo="name" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484411">
                          <link role="variableDeclaration" targetNodeId="1213877484362" resolveInfo="variableExpectedName" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877484412">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877484413">
            <link role="baseMethodDeclaration" targetNodeId="5.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
            <link role="classConcept" targetNodeId="5.~NameUtil" resolveInfo="NameUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877484414">
              <link role="variableDeclaration" targetNodeId="1213877484362" resolveInfo="variableExpectedName" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877484415">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724451" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877484416">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877484417" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877492560">
    <link role="concept" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877492561">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877492562" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877494733">
    <property name="package" value="method" />
    <link role="concept" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877494734">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877494735" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877498977">
    <property name="package" value="assignments" />
    <link role="concept" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877498978">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877498979" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877498980">
      <property name="name" value="deriveType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877435747" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877498981">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877498982">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877498983">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877498984">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877498985" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877498986">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877498987">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877498988">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877498989">
                <node role="rValue" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877498990">
                  <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877498991">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877498992">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877498993">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877498994" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877498995">
                          <link role="link" targetNodeId="1.1068498886295" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1213877498996" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877498997" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877498998">
                  <link role="variableDeclaration" targetNodeId="1213877498983" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877498999">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877499000">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877499001">
                <link role="variableDeclaration" targetNodeId="1213877499010" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1213877499002">
                <link role="conceptOfParent" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
                <link role="linkInParent" targetNodeId="1.1068498886297" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877499003">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877499004">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877499005">
                  <link role="variableDeclaration" targetNodeId="1213877499010" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877499006" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877499007" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877499008">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877499009">
            <link role="variableDeclaration" targetNodeId="1213877498983" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877499010">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877499011">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877499012">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724784" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1215696289272">
      <property name="name" value="isChangeAssignment" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1215696236033" resolveInfo="isChangeAssignment" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215696289274">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1215696292495">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1215696293169">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1215696291369" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724494" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877501569">
    <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877501570">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501571" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877501572">
      <property name="name" value="getFinallyBlocks" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877501573">
        <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501574">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877501575">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877501576">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877501577">
              <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877501578">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator" id="1213877501579">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877501580">
                  <link role="elementConcept" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877501581">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877501582">
            <property name="name" value="current" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501583" />
            <node role="initializer" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877501584" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1213877501585">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877501586">
            <property name="value" value="true" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501587">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877501588">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501589">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877501590">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877501591">
                    <property name="name" value="tryStatement" />
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501592">
                      <link role="concept" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877501593">
                      <link role="concept" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501594">
                        <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877501595">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501596">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877501597">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501598">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501599">
                          <link role="variableDeclaration" targetNodeId="1213877501576" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1213877501600">
                          <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501601">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501602">
                              <link role="variableDeclaration" targetNodeId="1213877501591" resolveInfo="tryStatement" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877501603">
                              <link role="link" targetNodeId="1.1153952429843" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877501604">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1213877501605">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501606">
                        <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877501607" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877501608" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501609">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501610">
                          <link role="variableDeclaration" targetNodeId="1213877501591" resolveInfo="tryStatement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877501611">
                          <link role="link" targetNodeId="1.1153952429843" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501612">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501613">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501614">
                          <link role="variableDeclaration" targetNodeId="1213877501591" resolveInfo="tryStatement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877501615">
                          <link role="link" targetNodeId="1.1153952429843" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877501616" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501617">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501618">
                  <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877501619">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877501620">
                    <link role="conceptDeclaration" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877501621">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877501622">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501623">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501624">
                    <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877501625" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501626">
                  <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877501627">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501628">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1213877501629" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877501630">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877501631">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501632">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501633">
                      <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877501634">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877501635">
                        <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877501636">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501637">
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877501638">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877501639">
                        <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                      </node>
                    </node>
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501640">
                      <link role="variableDeclaration" targetNodeId="1213877501582" resolveInfo="current" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877501641">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501642">
            <link role="variableDeclaration" targetNodeId="1213877501576" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723856" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877501643">
      <property name="name" value="deriveType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877435747" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501644">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877501645">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877501646">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501647">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877501648" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877501649">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501650">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877501651">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877501652">
                <property name="name" value="ancestor" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501653" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501654">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877501655" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1213877501656">
                    <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_ConceptList" id="1213877501657">
                      <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213877501658">
                        <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                      </node>
                      <node role="concept" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ConceptReference" id="1213877501659">
                        <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877501660">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501661">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877501662">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877501663">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501664">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501665">
                        <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877501666">
                          <link role="concept" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501667">
                            <link role="variableDeclaration" targetNodeId="1213877501652" resolveInfo="ancestor" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877501668">
                          <link role="link" targetNodeId="1.1068580123133" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877501669" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501670">
                      <link role="variableDeclaration" targetNodeId="1213877501646" resolveInfo="type" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501671">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501672">
                  <link role="variableDeclaration" targetNodeId="1213877501652" resolveInfo="ancestor" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1213877501673">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877501674">
                    <link role="conceptDeclaration" targetNodeId="1.1068580123132" resolveInfo="BaseMethodDeclaration" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1213877501675">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877501676">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877501677">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877501678">
                      <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501679">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501680">
                          <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1213877501681">
                            <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501682">
                              <link role="variableDeclaration" targetNodeId="1213877501652" resolveInfo="ancestor" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877501683">
                            <link role="conceptMethodDeclaration" targetNodeId="1213877374441" resolveInfo="getExpectedReturnType" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877501684" />
                      </node>
                      <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501685">
                        <link role="variableDeclaration" targetNodeId="1213877501646" resolveInfo="type" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877501686">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501687">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877501688">
                <link role="variableDeclaration" targetNodeId="1213877501697" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1213877501689">
                <link role="conceptOfParent" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                <link role="linkInParent" targetNodeId="1.1068581517676" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877501690">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877501691">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877501692">
                  <link role="variableDeclaration" targetNodeId="1213877501697" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877501693" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877501694" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877501695">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877501696">
            <link role="variableDeclaration" targetNodeId="1213877501646" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877501697">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501698">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877501699">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724022" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877509933">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1172058436953" resolveInfo="LocalStaticMethodCall" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877509934">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877509935" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877516459">
    <property name="package" value="dotExpression_old" />
    <link role="concept" targetNodeId="1.1068580123158" resolveInfo="FieldReference" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877516460">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877516461" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877516462">
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519781" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877516463">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877516464">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877516465">
            <property name="name" value="expectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877516466">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877516467" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877516468">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877516469">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877516470">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877516471">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877516472">
                  <link role="variableDeclaration" targetNodeId="1213877516465" resolveInfo="expectedName" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877516473">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877516474">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877516475" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877516476">
                      <link role="link" targetNodeId="1.1070568237987" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877516477">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877516478">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877516479">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877516480" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877516481">
                <link role="link" targetNodeId="1.1070568237987" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877516482" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877516483">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877516484">
            <link role="variableDeclaration" targetNodeId="1213877516465" resolveInfo="expectedName" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877516485">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724186" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877517475">
    <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877517476">
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="false" />
      <property name="name" value="inline" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1213877517477" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877517478">
        <property name="name" value="editorContext" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877517479">
          <link role="classifier" targetNodeId="15.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517480">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1213877517481">
          <property name="value" value="Do nothing by default" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724894" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877517482">
      <property name="name" value="createReference" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877517483">
        <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517484">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1213877517485">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877517486">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877517487">
              <link role="baseMethodDeclaration" targetNodeId="2.~RuntimeException.&lt;init&gt;()" resolveInfo="RuntimeException" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724675" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877517488">
      <property name="name" value="isInitializable" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877517489" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517490">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877517491">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877517492">
            <property name="value" value="false" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723882" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877517493">
      <property name="name" value="deriveType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877435747" resolveInfo="deriveType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517494">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877517495">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877517496">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877517497">
              <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877517498" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877517499">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517500">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877517501">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877517502">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877517503">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877517504">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877517505" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877517506">
                      <link role="link" targetNodeId="1.1068431790188" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1213877517507" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877517508">
                  <link role="variableDeclaration" targetNodeId="1213877517496" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877517509">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877517510">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877517511">
                <link role="variableDeclaration" targetNodeId="1213877517520" resolveInfo="expression" />
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation" id="1213877517512">
                <link role="conceptOfParent" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                <link role="linkInParent" targetNodeId="1.1068431790190" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877517513">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877517514">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877517515">
                  <link role="variableDeclaration" targetNodeId="1213877517520" resolveInfo="expression" />
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1213877517516" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877517517" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877517518">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877517519">
            <link role="variableDeclaration" targetNodeId="1213877517496" resolveInfo="type" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877517520">
        <property name="name" value="expression" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877517521">
          <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877517522">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724124" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877517523">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877517524" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877518813">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534513062" resolveInfo="DoubleType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877518814">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877518815">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877518816">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877518817">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877518818">
              <link role="classifier" targetNodeId="2.~Double" resolveInfo="Double" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877518819">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724426" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877518820">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877518821">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877518822">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877518823">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877518824">
              <link role="classifier" targetNodeId="2.~Double" resolveInfo="Double" />
              <link role="variableDeclaration" targetNodeId="2.~Double.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877518825">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724167" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877518826">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877518827" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877519768">
    <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877519769">
      <property name="name" value="eval" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877519770">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877519771">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ThrowStatement" id="1213877519772">
          <node role="throwable" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877519773">
            <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1213877519774">
              <link role="baseMethodDeclaration" targetNodeId="2.~UnsupportedOperationException.&lt;init&gt;(java.lang.String)" resolveInfo="UnsupportedOperationException" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877519775">
                <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression" id="1213877519776">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877519777" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877519778">
                  <link role="baseMethodDeclaration" targetNodeId="9.~SNode.getDebugText():java.lang.String" resolveInfo="getDebugText" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877519779">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877519780">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724763" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877519781">
      <property name="name" value="getVariableExpectedName" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877519782">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877519783">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877519784">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877519785" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723899" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877519786">
      <property name="name" value="isLValue" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877519787" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877519788">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877519789">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877519790">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877519791" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877519792">
              <link role="conceptProperty" targetNodeId="1.1146528679895" resolveInfo="lvalue" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724138" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877519793">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877519794" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877520962">
    <property name="package" value="dotExpression" />
    <link role="concept" targetNodeId="1.1197029447546" resolveInfo="FieldReferenceOperation" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877520963">
      <property name="name" value="getVariableExpectedName" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877410087" resolveInfo="getVariableExpectedName" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877520964">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877520965">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877520966">
            <property name="name" value="expectedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877520967">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877520968" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877520969">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877520970">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877520971">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1213877520972">
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877520973">
                  <link role="variableDeclaration" targetNodeId="1213877520966" resolveInfo="expectedName" />
                </node>
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877520974">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877520975">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877520976" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877520977">
                      <link role="link" targetNodeId="1.1197029500499" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877520978">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877520979">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877520980">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877520981" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877520982">
                <link role="link" targetNodeId="1.1197029500499" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1213877520983" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877520984">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877520985">
            <link role="variableDeclaration" targetNodeId="1213877520966" resolveInfo="expectedName" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877520986">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724517" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877520987">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877520988" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877522907">
    <property name="package" value="conceptFunction" />
    <link role="concept" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877522908">
      <property name="name" value="getFromParameterObject" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877522909" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522910">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1213877522911">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522912">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877522913">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1213877522914">
                <property name="value" value="false" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877522915">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522916">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522917" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877522918">
                <link role="conceptMethodDeclaration" targetNodeId="1213877522926" resolveInfo="isParameterObjectUsed" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877522919">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522920">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522921">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522922" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877522923">
                <link role="conceptMethodDeclaration" targetNodeId="1213877522934" resolveInfo="findConceptFunction" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877522924">
              <link role="conceptMethodDeclaration" targetNodeId="1213877374432" resolveInfo="usesParameterObjectFor" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522925" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724424" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877522926">
      <property name="name" value="isParameterObjectUsed" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877522927" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522928">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877522929">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1213877522930">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522931">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522932" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877522933">
                <link role="conceptProperty" targetNodeId="1.1199886518837" resolveInfo="dontUseParameterObject" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723829" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877522934">
      <property name="name" value="findConceptFunction" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877522935">
        <link role="concept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522936">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877522937">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877522938">
            <property name="name" value="functions" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877522939">
              <link role="elementConcept" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522940">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522941" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorsOperation" id="1213877522942">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1213877522943">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1213877522944">
                    <link role="conceptDeclaration" targetNodeId="1.1137021947720" resolveInfo="ConceptFunction" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877522945">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877522946">
            <property name="name" value="ourConcept" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType" id="1213877522947" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522948">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877522949" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation" id="1213877522950" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877522951">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522952">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522953">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877522954">
                <link role="variableDeclaration" targetNodeId="1213877522938" resolveInfo="functions" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereOperation" id="1213877522955">
                <node role="whereClosure" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.WhereBlock" id="1213877522956">
                  <node role="defaultInputElement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.DefaultInputElement" id="1213877522957">
                    <property name="name" value="it" />
                  </node>
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522958">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877522959">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1213877522960">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522961">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522962">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877522963">
                              <link role="closureParameter" targetNodeId="1213877522957" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1213877522964">
                              <link role="conceptLinkDeclaration" targetNodeId="1.1161119487665" resolveInfo="applicableConceptFunctionParameter" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877522965">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877522966">
                              <link role="variableDeclaration" targetNodeId="1213877522946" resolveInfo="ourConcept" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522967">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877522968">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ClosureParameterReference" id="1213877522969">
                              <link role="closureParameter" targetNodeId="1213877522957" resolveInfo="it" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptLinkAccess" id="1213877522970">
                              <link role="conceptLinkDeclaration" targetNodeId="1.1137546998352" resolveInfo="conceptFunctionParameter" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ContainsOperation" id="1213877522971">
                            <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877522972">
                              <link role="variableDeclaration" targetNodeId="1213877522946" resolveInfo="ourConcept" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877522973" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724557" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877522974">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877522975" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877523901">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1164118113764" resolveInfo="PrimitiveType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877523902">
      <property name="name" value="getPresentation" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="3v.1213877396640" resolveInfo="getPresentation" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877523903">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877523904">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877523905">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877523906" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877523907">
              <link role="conceptProperty" targetNodeId="2v.1137473891462" resolveInfo="alias" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877523908">
        <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155725017" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877523909">
      <property name="name" value="getVariableSuffixes" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337304" resolveInfo="getVariableSuffixes" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877523910">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877523911">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1213877523912">
            <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1213877523913">
              <node role="initValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877523914">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877523915">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877523916" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess" id="1213877523917">
                    <link role="conceptProperty" targetNodeId="2v.1137473891462" resolveInfo="alias" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877523918">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.substring(int,int):java.lang.String" resolveInfo="substring" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877523919">
                    <property name="value" value="0" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877523920">
                    <property name="value" value="1" />
                  </node>
                </node>
              </node>
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877523921">
                <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1213877523922">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877523923">
          <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724225" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877523924">
      <property name="name" value="getJavaType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337345" resolveInfo="getJavaType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877523925">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877523926">
          <node role="expression" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877523927" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877523928">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724731" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877523929">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877523930" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877524603">
    <link role="concept" targetNodeId="1.1070533707846" resolveInfo="StaticFieldReference" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877524604">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877524605">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877524606">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877524607">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877524608">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877524609">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877524610" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877524611">
                <link role="link" targetNodeId="1.1144433057691" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877524612">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877524613">
            <property name="name" value="name" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877524614">
              <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877524615">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877524616">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877524617" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877524618">
                  <link role="link" targetNodeId="1.1070568178160" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877524619">
                <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877524620">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877524621">
            <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.getConstant(jetbrains.mps.project.IModule,jetbrains.mps.smodel.SNode,java.lang.String):java.lang.Object" resolveInfo="getConstant" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877524622">
              <link role="variableDeclaration" targetNodeId="1213877524625" resolveInfo="module" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877524623">
              <link role="variableDeclaration" targetNodeId="1213877524607" resolveInfo="classifier" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877524624">
              <link role="variableDeclaration" targetNodeId="1213877524613" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877524625">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877524626">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877524627">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723803" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877524628">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877524629" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877525333">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1081236700937" resolveInfo="StaticMethodCall" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877525334">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877525335">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877525336">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877525337">
            <property name="name" value="method" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877525338">
              <link role="classifier" targetNodeId="12.~Method" resolveInfo="Method" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877525339">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877525340">
                <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877525341" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1213877525342">
                  <link role="link" targetNodeId="1.1081236769987" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877525343">
                <link role="conceptMethodDeclaration" targetNodeId="1213877350393" resolveInfo="getMethod" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877525344">
                  <link role="variableDeclaration" targetNodeId="1213877525357" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1213877525345">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1213877525346">
            <property name="name" value="actualArguments" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1213877525347">
              <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877525348">
                <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877525349">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877525350" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1213877525351">
                <link role="conceptMethodDeclaration" targetNodeId="1213877339153" resolveInfo="getActualArguments" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1213877525352">
                  <link role="variableDeclaration" targetNodeId="1213877525357" resolveInfo="module" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877525353">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1213877525354">
            <link role="baseMethodDeclaration" targetNodeId="11.~ReflectionUtil.staticInvoke(java.lang.reflect.Method,java.lang.Object[]):java.lang.Object" resolveInfo="staticInvoke" />
            <link role="classConcept" targetNodeId="11.~ReflectionUtil" resolveInfo="ReflectionUtil" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877525355">
              <link role="variableDeclaration" targetNodeId="1213877525337" resolveInfo="method" />
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1213877525356">
              <link role="variableDeclaration" targetNodeId="1213877525346" resolveInfo="actualArguments" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877525357">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877525358">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877525359">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724814" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877525360">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877525361" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877529126">
    <property name="package" value="type.primitive" />
    <link role="concept" targetNodeId="1.1070534436861" resolveInfo="FloatType" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877529127">
      <property name="name" value="getUnboxedType" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337320" resolveInfo="getUnboxedType" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877529128">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877529129">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877529130">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877529131">
              <link role="classifier" targetNodeId="2.~Float" resolveInfo="Float" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877529132">
        <link role="concept" targetNodeId="1.1068431790189" resolveInfo="Type" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724405" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877529133">
      <property name="name" value="getClassExpression" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877337357" resolveInfo="getClassExpression" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877529134">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877529135">
          <node role="expression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877529136">
            <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1213877529137">
              <link role="classifier" targetNodeId="2.~Float" resolveInfo="Float" />
              <link role="variableDeclaration" targetNodeId="2.~Float.TYPE" resolveInfo="TYPE" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1213877529138">
        <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724164" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877529139">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877529140" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877530968">
    <link role="concept" targetNodeId="1.1070475926800" resolveInfo="StringLiteral" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877530969">
      <property name="name" value="eval" />
      <property name="isPrivate" value="false" />
      <link role="overriddenMethod" targetNodeId="1213877519769" resolveInfo="eval" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877530970">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877530971">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877530972">
            <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877530973" />
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877530974">
              <link role="property" targetNodeId="1.1070475926801" resolveInfo="value" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1213877530975">
        <property name="name" value="module" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877530976">
          <link role="classifier" targetNodeId="3.~IModule" resolveInfo="IModule" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877530977">
        <link role="classifier" targetNodeId="2.~Object" resolveInfo="Object" />
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724723" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877530978">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877530979" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877531969">
    <link role="concept" targetNodeId="1.1194952169813" resolveInfo="IMemberContainer" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877531970">
      <property name="name" value="getMembers" />
      <property name="isVirtual" value="true" />
      <property name="isAbstract" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1213877531971" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877531972">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1213877531973">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1213877531974" />
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724288" />
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877531975">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877531976" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877536667">
    <property name="package" value="method.static" />
    <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877536668">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877536669" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1213877536670">
      <property name="name" value="isMainMethod" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1213877536671" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877536672">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1213877536673">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877536674">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1213877536675">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1213877536676">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536677">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536678">
                    <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877536679" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877536680">
                      <link role="link" targetNodeId="1.1068580123134" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation" id="1213877536681" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1213877536682">
                  <property name="value" value="1" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.bootstrap.helgins.structure.IsStrongSubtypeExpression" id="1213877536683">
                <node role="subtypeExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536684">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536685">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536686">
                      <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877536687" />
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1213877536688">
                        <link role="link" targetNodeId="1.1068580123134" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation" id="1213877536689" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation" id="1213877536690" />
                </node>
                <node role="supertypeExpression" type="jetbrains.mps.quotation.structure.Quotation" id="1213877536691">
                  <node role="quotedNode" type="jetbrains.mps.baseLanguage.structure.ArrayType" id="1213877536692">
                    <node role="componentType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1213877536693">
                      <link role="classifier" targetNodeId="2.~String" resolveInfo="String" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536694">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1213877536695">
                <property name="value" value="main" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1213877536696">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1213877536697">
                  <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1213877536698" />
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1213877536699">
                    <link role="property" targetNodeId="2v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155723833" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1213877539511">
    <property name="package" value="method.instance" />
    <link role="concept" targetNodeId="1.1073063089578" resolveInfo="SuperMethodCall" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1213877539512">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1213877539513" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1215696234405">
    <property name="package" value="assignments" />
    <link role="concept" targetNodeId="1.1215693861676" resolveInfo="BaseAssignmentExpression" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1215696234406">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215696234407" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1215696236033">
      <property name="name" value="isReadAsignment" />
      <property name="isVirtual" value="true" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1215696264534" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1215696236035">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1215696269613">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1215696269802">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724259" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptBehavior" id="1217845912587">
    <property name="package" value="if" />
    <link role="concept" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptConstructorDeclaration" id="1217845912588">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217845912589" />
    </node>
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ConceptMethodDeclaration" id="1217845914183">
      <property name="name" value="convertElseToElseIf" />
      <property name="isPrivate" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1217845917913" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217845914185">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217845923289">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217845923290">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217845923291">
              <link role="concept" targetNodeId="1.1206060495898" resolveInfo="ElsifClause" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1217845923292">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeCreator" id="1217845923293">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217845923294">
                  <link role="concept" targetNodeId="1.1206060495898" resolveInfo="ElsifClause" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1217847546626">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1217847546627">
            <property name="name" value="ifFalseStatement" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1217847546628">
              <link role="concept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217847546629">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217847546630" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217847546631">
                <link role="link" targetNodeId="1.1082485599094" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1217845923295">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217845923296">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217845923297">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923298">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923299">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217845923300">
                    <link role="variableDeclaration" targetNodeId="1217845923290" resolveInfo="result" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217845923301">
                    <link role="link" targetNodeId="1.1206060644605" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation" id="1217845923302">
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923303">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923304">
                      <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1217845923305">
                        <link role="concept" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923306">
                          <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217845929459" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217845923308">
                            <link role="link" targetNodeId="1.1082485599094" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217845923309">
                        <link role="link" targetNodeId="1.1082485599096" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1217845923310" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923311">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217847546632">
              <link role="variableDeclaration" targetNodeId="1217847546627" resolveInfo="ifFalseStatement" />
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1217845923315">
              <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1217845923316">
                <link role="conceptDeclaration" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1217845923317">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1217845923318">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217845923319">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923320">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923321">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923322">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217845923323">
                        <link role="variableDeclaration" targetNodeId="1217845923290" resolveInfo="result" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217845923324">
                        <link role="link" targetNodeId="1.1206060644605" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1217845923325">
                      <link role="link" targetNodeId="1.1068581517665" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1217845923326">
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923327">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217847579370">
                        <link role="variableDeclaration" targetNodeId="1217847546627" resolveInfo="ifFalseStatement" />
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation" id="1217845923331" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217845923332">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923333">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923334">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217845936744" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1217845923336">
                <link role="link" targetNodeId="1.1082485599094" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Link_DeleteChildOperation" id="1217845923337" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1217845923338">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923339">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1217845923340">
              <node role="operand" type="jetbrains.mps.bootstrap.constraintsLanguage.structure.ThisNodeExpression" id="1217845938340" />
              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1217845923342">
                <link role="link" targetNodeId="1.1206060520071" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation" id="1217845923343">
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1217845923344">
                <link role="variableDeclaration" targetNodeId="1217845923290" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1219155724806" />
    </node>
  </node>
</model>

