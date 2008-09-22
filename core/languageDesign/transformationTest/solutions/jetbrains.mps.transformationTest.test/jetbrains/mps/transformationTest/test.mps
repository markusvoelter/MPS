<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:1222075024910(jetbrains.mps.transformationTest.test)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.transformationTest">
    <languageAspect modelUID="r:1222075024258(jetbrains.mps.transformationTest.constraints)" version="0" />
    <languageAspect modelUID="r:1222075024264(jetbrains.mps.transformationTest.structure)" version="3" />
  </language>
  <language namespace="jetbrains.mps.core">
    <languageAspect modelUID="r:1222075024003(jetbrains.mps.core.constraints)" version="2" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="r:1222075024065(jetbrains.mps.baseLanguage.constraints)" version="83" />
    <languageAspect modelUID="r:1222075024074(jetbrains.mps.baseLanguage.structure)" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="r:1222075024123(jetbrains.mps.bootstrap.smodelLanguage.constraints)" version="21" />
    <languageAspect modelUID="r:1222075024129(jetbrains.mps.bootstrap.smodelLanguage.structure)" version="1" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="r:1222075024168(jetbrains.mps.baseLanguage.ext.collections.lang.constraints)" version="6" />
    <languageAspect modelUID="r:1222075024174(jetbrains.mps.baseLanguage.ext.collections.lang.structure)" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.transformationTest.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.transformationTest.structure" version="3" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.unitTest.constraints" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.internal.collections.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.baseLanguage.classifiers.constraints" version="7" />
  <languageAspect modelUID="r:1222075024184(jetbrains.mps.closures.structure)" version="0" />
  <languageAspect modelUID="r:1222075024180(jetbrains.mps.closures.constraints)" version="2" />
  <languageAspect modelUID="r:1222075024082(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:1222075024238(jetbrains.mps.baseLanguage.classifiers.constraints)" version="7" />
  <maxImportIndex value="4" />
  <import index="1" modelUID="java.util.regex@java_stub" version="-1" />
  <import index="2" modelUID="java.nio@java_stub" version="-1" />
  <import index="3" modelUID="java.lang@java_stub" version="-1" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1216561660079">
    <property name="name" value="ForEach" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220020391997">
      <property name="name" value="method" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220020391999" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220020392000">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220020412785">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220020412786">
            <property name="name" value="b" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220020412787">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220020416430">
                <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220020422010" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1220020426715">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1220020426716">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220020426717">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220020426718">
                <link role="classifier" targetNodeId="3.~Integer" resolveInfo="Integer" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1220020426719" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement" id="1220020443334">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable" id="1220020443335">
            <property name="name" value="var" />
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220020443337">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220020529338">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220020532577">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220020529339">
                  <link role="variableDeclaration" targetNodeId="1220020426716" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ToArrayOperation" id="1220020539394" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1220020469424">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220020472802">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220020469425">
                  <link role="variableDeclaration" targetNodeId="1220020426716" resolveInfo="result" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1220020479899">
                  <node role="argument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1220020482606">
                    <node role="operand" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference" id="1220020481997">
                      <link role="variable" targetNodeId="1220020443335" resolveInfo="var" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1220020490001">
                      <link role="baseMethodDeclaration" targetNodeId="3.~String.hashCode():int" resolveInfo="hashCode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220020453964">
            <link role="variableDeclaration" targetNodeId="1220020412786" resolveInfo="b" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220020438065">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1220020439739">
            <link role="variableDeclaration" targetNodeId="1220020426716" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1220020395548">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220020399065">
          <link role="classifier" targetNodeId="3.~Integer" resolveInfo="Integer" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216561660080" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1216561660081">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1216561660082" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1216561660083" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1216561660084" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1220008862931">
    <property name="name" value="Class" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1220008881087">
      <property name="name" value="method" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220008881089" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220008881090">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1220014387409">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220015395073">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220015395967">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220014387410">
              <link role="variableDeclaration" targetNodeId="1220008888250" resolveInfo="a" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220014387411">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220014387412">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220014387413">
                <property name="value" value="a" />
              </node>
            </node>
          </node>
          <node role="elsifClauses" type="jetbrains.mps.baseLanguage.structure.ElsifClause" id="1220014387414">
            <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1220015377387">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1220015377388">
                <link role="variableDeclaration" targetNodeId="1220008888250" resolveInfo="a" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1220015377389">
                <property name="value" value="1" />
              </node>
            </node>
            <node role="statementList" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220014387418">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220014387422">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220014387423">
                  <property name="value" value="a + 1" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1220014387434">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1220014387435">
            <property name="value" value="" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1220008888250">
        <property name="name" value="a" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1220008888251" />
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1220013223122">
        <link role="classifier" targetNodeId="3.~String" resolveInfo="String" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220008862932" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1220008862933">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1220008862934" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1220008862935" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1220008862936" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1221588332973">
    <property name="name" value="ReadActionProblem" />
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1221642887651">
      <property name="name" value="method" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1221642887652" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1221642887653" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1221642887654">
        <node role="statement" type="jetbrains.mps.bootstrap.smodelLanguage.structure.ExecuteLightweightCommandStatement" id="1221642904686">
          <node role="commandClosureLiteral" type="jetbrains.mps.bootstrap.smodelLanguage.structure.CommandClosureLiteral" id="1221642904687">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1221642904688">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1221642920033">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1221642921313">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1221642920034" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1221642923381">
                    <link role="baseMethodDeclaration" targetNodeId="3.~Object.wait():void" resolveInfo="wait" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="throwsItem" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1221642930255">
        <link role="classifier" targetNodeId="3.~InterruptedException" resolveInfo="InterruptedException" />
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1221588332974" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1221827598678">
    <property name="name" value="NodeProblem" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1221827598679" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1221827598680">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1221827598681" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1221827598682" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1221827598683">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1221827615806">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1221827615807">
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1221827615808">
              <link role="concept" targetNodeId="4.1068431474542" resolveInfo="VariableDeclaration" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

