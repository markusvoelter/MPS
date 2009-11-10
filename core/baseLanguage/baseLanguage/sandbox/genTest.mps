<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:00000000-0000-4000-0000-011c89590393(jetbrains.mps.baseLanguage.sandbox.genTest)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895905dc(jetbrains.mps.nanoj.constraints)" version="45" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903fe(jetbrains.mps.baseLanguage.strings.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:da6483b0-ff12-4b51-a8d8-a0f7e08483f2(webr.templateLanguage.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902d2(jetbrains.mps.baseLanguage.unitTest.constraints)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903e4(jetbrains.mps.internal.collections.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903ac(jetbrains.mps.baseLanguageInternal.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959057f(jetbrains.mps.baseLanguage.logging.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590402(jetbrains.mps.baseLanguage.strings.structure)" version="9" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <maxImportIndex value="17" />
  <import index="14" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1231680781312">
    <property name="name" value="Sandbox" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231680781313" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1231680781314">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1231680781315" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1231680781316" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1231680781317">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235556483035">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235556483036">
            <property name="name" value="tuple" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TupleType" id="1235556483037">
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556488132">
                <property name="name" value="first" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235556488837" />
              </node>
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556489932">
                <property name="name" value="second" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1188338037704648612" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.TupleExpression" id="1235556511596">
              <node role="item" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1235556514159">
                <property name="value" value="1" />
              </node>
              <node role="item" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1235556515055">
                <property name="value" value="second" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235556496249">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235556496250">
            <link role="variableDeclaration" targetNodeId="1235556483036" resolveInfo="tuple" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1237395879145">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237395879146">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1237395879147" />
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1237395884846">
            <property name="value" value="23" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237395879149">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1237395882405" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1237396320926">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237396320927">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1237396320928" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237396320929">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1237396322368" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1237396323683">
              <property name="value" value="23" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1237396332765">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1237396332940">
              <property name="value" value="10" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237396325621">
              <link role="variableDeclaration" targetNodeId="1237396320929" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1237396334708">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237396334709">
              <link role="variableDeclaration" targetNodeId="1237396320929" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237458893388">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237458893389">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1237458893390" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.Expression" id="1237458893391" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement" id="1237458152228">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237458152229">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="1237458152230" />
          </node>
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1237458152231">
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237458152232">
              <property name="name" value="e" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1237458195936">
                <link role="classifier" targetNodeId="14.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237458152234" />
          </node>
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1237458155094">
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237458155095">
              <property name="name" value="t" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1237458198718">
                <link role="classifier" targetNodeId="14.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237458155097" />
          </node>
          <node role="catchClause" type="jetbrains.mps.baseLanguage.structure.CatchClause" id="1237458183087">
            <node role="throwable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237458183088">
              <property name="name" value="abc" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1237458201829">
                <link role="classifier" targetNodeId="14.~Exception" resolveInfo="Exception" />
              </node>
            </node>
            <node role="catchBody" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237458183090" />
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1235556631841">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1235556631842" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1235556631843" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235556631844" />
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1235556638270">
      <property name="name" value="method" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235556653783" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1235556638272" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235556638273">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235556914773">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235556914774">
            <property name="name" value="t1" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TupleType" id="1235556914775">
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556916011">
                <property name="name" value="f" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235556916591" />
              </node>
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556918201">
                <property name="name" value="s" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1188338037704648615" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.TupleExpression" id="1235556923784">
              <node role="item" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1235556924035">
                <property name="value" value="1" />
              </node>
              <node role="item" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1235556924962">
                <property name="value" value="a" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235556929576">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235556929577">
            <property name="name" value="t2" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.TupleType" id="1235556929578">
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556932282">
                <property name="name" value="first" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235556932800" />
              </node>
              <node role="member" type="jetbrains.mps.baseLanguage.structure.TupleMember" id="1235556934504">
                <property name="name" value="second" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1188338037704648618" />
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235556939618">
              <link role="variableDeclaration" targetNodeId="1235556914774" resolveInfo="t1" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SingleLineComment" id="7376433222636453567" />
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.SingleLineComment" id="7376433222636453437" />
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235556943766">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235556943767">
            <link role="variableDeclaration" targetNodeId="1235556929577" resolveInfo="t2" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1237458909892">
    <property name="name" value="ABC1" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237458909893" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1237458909894">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237458909895" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237458909896" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237459575875">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237634384554">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1237634397461">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237634398605">
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237634398606">
                <link role="baseMethodDeclaration" targetNodeId="1237634370565" resolveInfo="methodWithVeryVeryVeryVeryVeryVeryLongName" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1237634398607" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1237634395190">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237634393796">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237634393797">
                  <link role="baseMethodDeclaration" targetNodeId="1237634370565" resolveInfo="methodWithVeryVeryVeryVeryVeryVeryLongName" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1237634393798" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237634396349">
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237634396350">
                  <link role="baseMethodDeclaration" targetNodeId="1237634370565" resolveInfo="methodWithVeryVeryVeryVeryVeryVeryLongName" />
                </node>
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ThisExpression" id="1237634396351" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237634384556" />
        </node>
      </node>
    </node>
    <node role="method" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" id="1237634370565">
      <property name="name" value="methodWithVeryVeryVeryVeryVeryVeryLongName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1237634387604" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237634370567" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237634370568">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1237634391246">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1237634391811">
            <property name="value" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1237561820390">
    <property name="name" value="ABC2" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237561820391" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1237561820392">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237561820393" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237561820394" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237561820395">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="3409542372145597538" />
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1237815529937">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237815529938">
            <property name="name" value="o" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1237815529939">
              <link role="classifier" targetNodeId="14.~Object" resolveInfo="Object" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1237815533473">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815547041">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815544895">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815542672">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815540964">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815539412">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815537672">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815535495">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237815534209">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237815533474">
                            <link role="variableDeclaration" targetNodeId="1237815529938" resolveInfo="o" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815534869">
                            <link role="baseMethodDeclaration" targetNodeId="14.~Object.toString():java.lang.String" resolveInfo="toString" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815537343">
                          <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815539098">
                        <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815540634">
                      <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815542327">
                    <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815544410">
                  <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815546243">
                <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237815548983">
              <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.Statement" id="3409542372145628907" />
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="3409542372145628909">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="3409542372145628910">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="3409542372145628911" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="3409542372145628913">
              <property name="value" value="23" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1237667178963">
    <property name="name" value="ABC3" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237667178964" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1237667178965">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237667178966" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237667178967" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237667178968">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1237667190598">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237667190599">
            <property name="name" value="veryVeryVeryVeryVeryVeryVeryVeryVeryVery1" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1237667190600" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1237667297351">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237667297352">
            <property name="name" value="veryVeryVeryVeryVeryVeryVeryVeryVeryVery2" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1237667297353" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1237667306575">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237667307578">
                <link role="variableDeclaration" targetNodeId="1237667190599" resolveInfo="veryVeryVeryVeryVeryVeryVeryVeryVeryVery1" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237667300792">
                <link role="variableDeclaration" targetNodeId="1237667190599" resolveInfo="veryVeryVeryVeryVeryVeryVeryVeryVeryVery1" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1237815811855">
    <property name="name" value="ABC4" />
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237815811856" />
    <node role="constructor" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" id="1237815811857">
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237815811858" />
      <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1237815811859" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237815811860">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1237819551415">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1237819551416">
            <property name="name" value="o" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1237819551417">
              <link role="classifier" targetNodeId="14.~Object" resolveInfo="Object" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1237819554123">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819592046">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819590510">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819580724">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819579172">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819557885">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819555692">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237819554422">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237819554124">
                          <link role="variableDeclaration" targetNodeId="1237819551416" resolveInfo="o" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819555238">
                          <link role="baseMethodDeclaration" targetNodeId="14.~Object.toString():java.lang.String" resolveInfo="toString" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819557603">
                        <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819559061">
                      <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819580504">
                    <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819581868">
                  <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819591686">
                <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237819596192">
              <link role="baseMethodDeclaration" targetNodeId="14.~String.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

