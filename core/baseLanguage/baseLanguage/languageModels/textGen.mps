<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:c6eeedda-084d-4659-9c4d-80b7768f2bb2(jetbrains.mps.baseLanguage.textGen)">
  <persistence version="3" />
  <refactoringHistory />
  <language namespace="b83431fe-5c8f-40bc-8a36-65e25f4dd253(jetbrains.mps.lang.textGen)" />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="7a5dda62-9140-4668-ab76-d5ed1746f2b2(jetbrains.mps.lang.typesystem)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ae(jetbrains.mps.lang.typesystem.constraints)" version="17" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902b4(jetbrains.mps.lang.typesystem.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959034b(jetbrains.mps.lang.quotation.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959033d(jetbrains.mps.lang.annotations.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590340(jetbrains.mps.lang.pattern.constraints)" version="2" />
  <languageAspect modelUID="r:de0d3c0c-d049-41cf-bbf9-a920ba513cd3(jetbrains.mps.lang.textGen.structure)" version="11" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895903ac(jetbrains.mps.baseLanguageInternal.structure)" version="1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590345(jetbrains.mps.lang.pattern.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959057f(jetbrains.mps.baseLanguage.logging.structure)" version="0" />
  <devkit namespace="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  <maxImportIndex value="10" />
  <import index="1" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="1" />
  <import index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#jetbrains.mps.generator(jetbrains.mps.generator@java_stub)" version="-1" />
  <import index="6" modelUID="f:java_stub#jetbrains.mps.textGen(jetbrains.mps.textGen@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.baseLanguage(jetbrains.mps.baseLanguage@java_stub)" version="-1" />
  <import index="8" modelUID="f:java_stub#jetbrains.mps.typesystem.inference(jetbrains.mps.typesystem.inference@java_stub)" version="-1" />
  <import index="10" modelUID="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" version="-1" />
  <visible index="2" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" />
  <visible index="3" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
  <node type="jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration" id="1234796104060">
    <property name="name" value="BaseLanguageTextGen" />
    <property name="package" value="lang" />
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1234799495933">
      <property name="name" value="getImportedNames" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234799495935">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1234799552342">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234799552343">
            <property name="name" value="importedNames" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386036405">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744025" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1234806854762">
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386037810">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744037" />
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234806854765">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1234806854766" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1234806854767">
                  <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.getUserObject(java.lang.Object):java.lang.Object" resolveInfo="getUserObject" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237811610393">
                    <property name="value" value="IMPORT" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234799801340">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234799801341">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234799890683">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1234799901937">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1234799903174">
                  <node role="creator" type="jetbrains.mps.baseLanguage.collections.structure.HashSetCreator" id="1237974124948">
                    <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744043" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234799890684">
                  <link role="variableDeclaration" targetNodeId="1234799552343" resolveInfo="importedNames" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234799918993">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234799919542">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1234799918994" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1234799922093">
                  <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.putUserObject(java.lang.Object,java.lang.Object):void" resolveInfo="putUserObject" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237811615805">
                    <property name="value" value="IMPORT" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234799933237">
                    <link role="variableDeclaration" targetNodeId="1234799552343" resolveInfo="importedNames" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1234799811084">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1234799812712" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234799804391">
              <link role="variableDeclaration" targetNodeId="1234799552343" resolveInfo="importedNames" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1234799936145">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234799941694">
            <link role="variableDeclaration" targetNodeId="1234799552343" resolveInfo="importedNames" />
          </node>
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386035943">
        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744031" />
      </node>
    </node>
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1234796511838">
      <property name="name" value="getPackageName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744023" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234796511840">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1234796545766">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237811244791">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237811235066">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237811228995">
                <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="1237811227913">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237811226568">
                    <link role="variableDeclaration" targetNodeId="1234796535889" resolveInfo="cls" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237811234407">
                  <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.getModel():jetbrains.mps.smodel.SModel" resolveInfo="getModel" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237811243570">
                <link role="baseMethodDeclaration" targetNodeId="2v.~SModel.getSModelReference():jetbrains.mps.smodel.SModelReference" resolveInfo="getSModelReference" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237811246999">
              <link role="baseMethodDeclaration" targetNodeId="2v.~SModelReference.getLongName():java.lang.String" resolveInfo="getLongName" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234796535889">
        <property name="name" value="cls" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234796535890">
          <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
        </node>
      </node>
    </node>
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1236686501608">
      <property name="name" value="appendClsName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1236686601495" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686501610">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502836">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236686502837">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1236686502838" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686622906">
              <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502840">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.FoundErrorOperation" id="1237473887359">
              <node role="text" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237473889063">
                <property name="value" value="class name is NULL" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991653">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991655">
                <property name="value" value="???" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236686502845" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502846">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502847">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.FoundErrorOperation" id="1237473916163">
              <node role="text" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237473917008">
                <property name="value" value="class name not contain '@'" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236686502850">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502851">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686630273">
                <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502853">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.contains(java.lang.CharSequence):boolean" resolveInfo="contains" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502854">
                  <property name="value" value="@" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502855">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686555175">
                <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502857">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.contains(java.lang.CharSequence):boolean" resolveInfo="contains" />
                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502858">
                  <property name="value" value="@" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236686502859">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502860">
            <property name="name" value="importedFqName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744064" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236686502862">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502863">
            <property name="name" value="importedShortName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744066" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression" id="1236686502865">
              <node role="array" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502866">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686636259">
                  <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502868">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.split(java.lang.String):java.lang.String[]" resolveInfo="split" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502869">
                    <property name="value" value="\\." />
                  </node>
                </node>
              </node>
              <node role="index" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236686502870">
                <property name="value" value="0" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502871">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502872">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502873">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236686502874">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502877">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502878">
                    <link role="variableDeclaration" targetNodeId="1236686502863" resolveInfo="importedShortName" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502875">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686564349">
                      <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502879">
                      <property name="value" value="." />
                    </node>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502880">
                  <link role="variableDeclaration" targetNodeId="1236686502860" resolveInfo="importedFqName" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1236686502881">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236686502882">
              <property name="value" value="0" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502883">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686560520">
                <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502885">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1236686502886">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502887">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502888">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236686502889">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502890">
                    <link role="variableDeclaration" targetNodeId="1236686502863" resolveInfo="importedShortName" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502891">
                    <link role="variableDeclaration" targetNodeId="1236686502860" resolveInfo="importedFqName" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236686502892">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502893">
            <property name="name" value="importedNames" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386036926">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744068" />
            </node>
            <node role="initializer" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236686502896">
              <link role="function" targetNodeId="1234799495933" resolveInfo="getImportedNames" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502897">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502898">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993421">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993423">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686639839">
                  <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236686502901" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502902">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502903">
              <link role="variableDeclaration" targetNodeId="1236686502893" resolveInfo="importedNames" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" id="1239010899764">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1239010899765">
                <link role="variableDeclaration" targetNodeId="1236686502860" resolveInfo="importedFqName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1236686502906">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502907">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502908">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502909">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236686502910">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502911">
                    <property name="name" value="fqName" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744055" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502913">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502914">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502915">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236686502916">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502918">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686645981">
                            <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502917">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686572070">
                              <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502920">
                              <property name="value" value="." />
                            </node>
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502922">
                          <link role="variableDeclaration" targetNodeId="1236686502911" resolveInfo="fqName" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1236686502923">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236686502924">
                      <property name="value" value="0" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502925">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686568459">
                        <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502927">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1236686502928">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502929">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502930">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236686502931">
                          <node role="rValue" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686649388">
                            <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
                          </node>
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502933">
                            <link role="variableDeclaration" targetNodeId="1236686502911" resolveInfo="fqName" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993312">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993314">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502935">
                      <link role="variableDeclaration" targetNodeId="1236686502911" resolveInfo="fqName" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236686502936" />
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502937">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502938">
                  <link role="variableDeclaration" targetNodeId="1236686502863" resolveInfo="importedShortName" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502939">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1236686502940">
                    <link role="classConcept" targetNodeId="5.~JavaNameUtil" resolveInfo="JavaNameUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="5.~JavaNameUtil.shortName(java.lang.String):java.lang.String" resolveInfo="shortName" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502941">
                      <link role="variableDeclaration" targetNodeId="1236686502943" resolveInfo="importedName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502942">
            <link role="variableDeclaration" targetNodeId="1236686502893" resolveInfo="importedNames" />
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502943">
            <property name="name" value="importedName" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744057" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502945">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502946">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502947">
              <link role="variableDeclaration" targetNodeId="1236686502893" resolveInfo="importedNames" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation" id="1239010900877">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1239010900878">
                <link role="variableDeclaration" targetNodeId="1236686502860" resolveInfo="importedFqName" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236686502950">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236686502951">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236686502952">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236686502953">
                <property name="name" value="currPartId" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1236686502954" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502955">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1236686502956" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502957">
                    <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.selectPart(int):int" resolveInfo="selectPart" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1236686502958">
                      <link role="classifier" targetNodeId="6.~TextGenBuffer" resolveInfo="TextGenBuffer" />
                      <link role="variableDeclaration" targetNodeId="6.~TextGenBuffer.TOP" resolveInfo="TOP" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992243">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992245" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992246">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502962">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502963">
                    <property name="value" value=";" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236686502961">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236686502965">
                      <property name="value" value="import " />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502964">
                      <link role="variableDeclaration" targetNodeId="1236686502860" resolveInfo="importedFqName" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686502966">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686502967">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1236686502968" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236686502969">
                  <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.selectPart(int):int" resolveInfo="selectPart" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236686502970">
                    <link role="variableDeclaration" targetNodeId="1236686502953" resolveInfo="currPartId" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1240313538677">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1240313538678">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240313538679">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1240313538680">
                  <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1240313538681">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240313538682">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1240313538683" />
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1240313538684">
                      <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.getUserObject(java.lang.Object):java.lang.Object" resolveInfo="getUserObject" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1240313538685">
                        <property name="value" value="PACKAGE_NAME" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240313538686">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1240313538687">
                  <link role="variableDeclaration" targetNodeId="1236686542697" resolveInfo="packageName" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1240313538688">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1240313538689">
                    <property name="value" value="java.lang" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992745">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992747">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686653311">
              <link role="variableDeclaration" targetNodeId="1236686605887" resolveInfo="className" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236686542697">
        <property name="name" value="packageName" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744063" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236686605887">
        <property name="name" value="className" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744061" />
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234796165248">
      <property name="name" value="typeParameters" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234796165249" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234796165250">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234796271792">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234796271793">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992096">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992098">
                <property name="value" value="&lt;" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992099">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236253075176">
                  <link role="variableDeclaration" targetNodeId="1234796235322" resolveInfo="types" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992100">
                <property name="value" value="&gt;" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234796279305">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234796278148">
              <link role="variableDeclaration" targetNodeId="1234796235322" resolveInfo="types" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234796280809" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234796235322">
        <property name="name" value="types" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="1234796239761">
          <link role="elementConcept" targetNodeId="1.1068431790189" resolveInfo="Type" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234796367381">
      <property name="name" value="arguments" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234796367382" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234796367383">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991789">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991791">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991792">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253140157">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236253139624">
                <link role="variableDeclaration" targetNodeId="1234796391819" resolveInfo="methodCall" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253142525">
                <link role="link" targetNodeId="1.1068499141038" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991793">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234796391819">
        <property name="name" value="methodCall" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234796391820">
          <link role="concept" targetNodeId="1.1204053956946" resolveInfo="IMethodCall" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="8170689402424596661">
      <property name="name" value="newLine" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="8170689402424596662" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8170689402424596663">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="8170689402424596666">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="8170689402424596669">
            <link role="variableDeclaration" targetNodeId="8170689402424596664" resolveInfo="need" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8170689402424596668">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="8170689402424596670">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="8170689402424596672" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="8170689402424596664">
        <property name="name" value="need" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="8170689402424596665" />
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234800115760">
      <property name="name" value="annotations" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234800115761" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234800115762">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992904">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992906">
            <property name="withSeparator" value="false" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253110714">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236253110009">
                <link role="variableDeclaration" targetNodeId="1234800132387" resolveInfo="annotable" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253114913">
                <link role="link" targetNodeId="1.1188208488637" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234800132387">
        <property name="name" value="annotable" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234800132388">
          <link role="concept" targetNodeId="1.1188208481402" resolveInfo="HasAnnotation" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234800177954">
      <property name="name" value="visibility" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234800177955" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234800177956">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234800208613">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234800210804">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234800210428">
              <link role="variableDeclaration" targetNodeId="1234800196471" resolveInfo="v" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="1234800213292" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234800208615">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993145">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993147">
                <property name="value" value="/*package*/ " />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1234800229030">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234800229031">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992789">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992791">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234800238955">
                    <link role="variableDeclaration" targetNodeId="1234800196471" resolveInfo="v" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234800196471">
        <property name="name" value="v" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234800196472">
          <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234800248318">
      <property name="name" value="visibilityWithIndent" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234800248319" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234800248320">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237470523007" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981674352">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981677526">
            <link role="function" targetNodeId="1234800177954" resolveInfo="visibility" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237981677527">
              <link role="variableDeclaration" targetNodeId="1234800272413" resolveInfo="v" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234800272413">
        <property name="name" value="v" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234800272414">
          <link role="concept" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234802562412">
      <property name="name" value="classifierName" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234802562413" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234802562414">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234802790296">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234802798175">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234802796331">
              <link role="variableDeclaration" targetNodeId="1234802716768" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="1234802800195" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234802790298">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.FoundErrorOperation" id="1234802804852" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993142">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993144">
                <property name="value" value="???" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1234802818797" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236686673329">
          <node role="expression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236686673330">
            <link role="function" targetNodeId="1236686501608" resolveInfo="appendClsName" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236686682706">
              <link role="function" targetNodeId="1234796511838" resolveInfo="getPackageName" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686682707">
                <link role="variableDeclaration" targetNodeId="1234802716768" resolveInfo="node" />
              </node>
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236686686476">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236686686037">
                <link role="variableDeclaration" targetNodeId="1234802716768" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236686688824">
                <link role="property" targetNodeId="1.1211504562189" resolveInfo="nestedName" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234802716768">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234802716769">
          <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1235584330956">
      <property name="name" value="variableDeclaration" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1235584330957" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235584330958">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235584347319">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235584347320">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1235584361180">
              <link role="variableDeclaration" targetNodeId="1235584352224" resolveInfo="node" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235584347322">
              <link role="property" targetNodeId="1.1176718929932" resolveInfo="isFinal" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235584347323">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992979">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992981">
                <property name="value" value="final " />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992205">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992207">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235584347327">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1235584365915">
                <link role="variableDeclaration" targetNodeId="1235584352224" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235584374012">
                <link role="link" targetNodeId="1.1068431790188" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992208">
            <property name="value" value=" " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992209">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182711741">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236182709365">
                <link role="variableDeclaration" targetNodeId="1235584352224" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236182713183">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237559180671">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237559180672">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559189546">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237559199064">
                <property name="value" value=" = " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237559199065">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237559199066">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237559199067">
                    <link role="variableDeclaration" targetNodeId="1235584352224" resolveInfo="node" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237559199068">
                    <link role="link" targetNodeId="1.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237559184916">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237559182098">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237559181691">
                <link role="variableDeclaration" targetNodeId="1235584352224" resolveInfo="node" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237559184368">
                <link role="link" targetNodeId="1.1068431790190" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237559187154" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1235584352224">
        <property name="name" value="node" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235584352225">
          <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234799968946">
      <property name="name" value="fileHeader" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234799968947" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234799968948">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1234802252233">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234802252234">
            <property name="name" value="names" />
            <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386036336">
              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744053" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1234872041387">
              <node role="type" type="jetbrains.mps.baseLanguage.collections.structure.SetType" id="1237386038169">
                <node role="elementType" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744051" />
              </node>
              <node role="expression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1234872041390">
                <link role="function" targetNodeId="1234799495933" resolveInfo="getImportedNames" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234802267507">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234802279665">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234802267508">
              <link role="variableDeclaration" targetNodeId="1234802252234" resolveInfo="names" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation" id="1237386078698">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1237386078700">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237386078701">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237386078702">
                    <link role="variableDeclaration" targetNodeId="1234799980340" resolveInfo="cls" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237386078703">
                    <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1237386078699">
                  <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1237386078705">
                    <link role="function" targetNodeId="1234796511838" resolveInfo="getPackageName" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237386078706">
                      <link role="variableDeclaration" targetNodeId="1234799980340" resolveInfo="cls" />
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237386078704">
                    <property name="value" value="." />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234802320752">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234802320753">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1234802367545">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234802367546">
                <property name="name" value="wasPart" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1234802367547" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234802376722">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1234802376128" />
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1234802380008">
                    <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.selectPart(int):int" resolveInfo="selectPart" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1234802385134">
                      <link role="classifier" targetNodeId="6.~TextGenBuffer" resolveInfo="TextGenBuffer" />
                      <link role="variableDeclaration" targetNodeId="6.~TextGenBuffer.TOP" resolveInfo="TOP" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992405">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992407">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1234802432458">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1234802433290">
                    <property name="value" value=";" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1234802419703">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1234802412139">
                      <property name="value" value="package " />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1234802427863">
                      <link role="function" targetNodeId="1234796511838" resolveInfo="getPackageName" />
                      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234802429395">
                        <link role="variableDeclaration" targetNodeId="1234799980340" resolveInfo="cls" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992408" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992424" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992425">
                <property name="value" value="/*Generated by MPS */" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992426" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234802506258">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234802506947">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.BufferParameter" id="1234802506259" />
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1234802508764">
                  <link role="baseMethodDeclaration" targetNodeId="6.~TextGenBuffer.selectPart(int):int" resolveInfo="selectPart" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234802511140">
                    <link role="variableDeclaration" targetNodeId="1234802367546" resolveInfo="wasPart" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237802520760">
            <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="1237802519805">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237802514816">
                <link role="variableDeclaration" targetNodeId="1234799980340" resolveInfo="cls" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237802523124">
              <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.isRoot():boolean" resolveInfo="isRoot" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234799980340">
        <property name="name" value="cls" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234799980341">
          <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1235571124825">
      <property name="name" value="methodCall" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1235571157487">
        <property name="name" value="methodCall" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235571164458">
          <link role="concept" targetNodeId="1.1204053956946" resolveInfo="IMethodCall" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1235571124826" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235571124827">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992342">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463992344">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235571177601">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1235571177006">
                <link role="variableDeclaration" targetNodeId="1235571157487" resolveInfo="methodCall" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237803959208">
                <link role="link" targetNodeId="1.1068499141037" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981664771">
            <link role="function" targetNodeId="1234796367381" resolveInfo="arguments" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237981664772">
              <link role="variableDeclaration" targetNodeId="1235571157487" resolveInfo="methodCall" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1237310744896">
      <property name="name" value="clsName" />
      <property name="isDeprecated" value="false" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1237310744897" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237310744898">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1237310761482">
          <node role="expression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1237310761483">
            <link role="function" targetNodeId="1236686501608" resolveInfo="appendClsName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237310782833">
              <link role="variableDeclaration" targetNodeId="1237310766734" resolveInfo="pack" />
            </node>
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1237310785178">
              <link role="variableDeclaration" targetNodeId="1237310768908" resolveInfo="className" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1237310766734">
        <property name="name" value="pack" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744050" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1237310768908">
        <property name="name" value="className" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744049" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234803609335">
    <link role="conceptDeclaration" targetNodeId="1.1080120340718" resolveInfo="AndExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234803609336">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234803609337">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993282">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993284">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234803642499">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234803641091" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234803644442">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993285">
            <property name="value" value=" &amp;&amp; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993286">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182620131">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182619692" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182621588">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234886608901">
    <link role="conceptDeclaration" targetNodeId="1.1188206331916" resolveInfo="Annotation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234886608902">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234886608903">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981627363">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981630365">
            <link role="function" targetNodeId="1234799968946" resolveInfo="fileHeader" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981630366" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981635055">
            <link role="function" targetNodeId="1234800177954" resolveInfo="visibility" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981635056">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981635057" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981635058">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234886665653">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234886665654">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993064">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993066">
                <property name="value" value="static " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1234886704333">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237816229079">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="1237816226983">
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237816129315" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237816231114">
                <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.isRoot():boolean" resolveInfo="isRoot" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993152">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237464808470">
            <property name="value" value="@interface " />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993154">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1234886760168">
              <link role="baseMethodDeclaration" targetNodeId="5.~JavaNameUtil.shortName(java.lang.String):java.lang.String" resolveInfo="shortName" />
              <link role="classConcept" targetNodeId="5.~JavaNameUtil" resolveInfo="JavaNameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234886765530">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234886764294" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234886766815">
                  <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993155">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="5821783483711598024">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5821783483711598025">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5821783483711598026">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5821783483711598027">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="5821783483711598028">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="5821783483711598029" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="5821783483711598030">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5821783483711598031">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="5821783483711598032" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="5821783483711598033">
                        <link role="link" targetNodeId="1.1188206594042" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5821783483711598034">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="5821783483711598035">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="5821783483711598036" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="5821783483711598037">
                    <link role="link" targetNodeId="1.1188206594042" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="5821783483711598038" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation" id="1236167741692" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556201087">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556231872">
            <property name="value" value="}" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237556231873" />
        </node>
      </node>
    </node>
    <node role="extension" type="jetbrains.mps.lang.textGen.structure.ExtensionDeclaration" id="2341412953773654322">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2341412953773654323">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="2341412953773654324">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="2341412953773654325">
            <property name="value" value="java" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234886915639">
    <link role="conceptDeclaration" targetNodeId="1.1188207840427" resolveInfo="AnnotationInstance" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234886915640">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234886915641">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1234886980347">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234886980348">
            <property name="name" value="oneLine" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1234886980349" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1234887008213">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887014628">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887010483">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234887010060" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1234887013956" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1234887016382">
                  <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1234887022088">
                    <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234886999753">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234886994310">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234886987805" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1234886995017" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1234887002866">
                  <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1234887006337">
                    <link role="conceptDeclaration" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234887058328">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887058329">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992897">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992899">
                <property name="value" value="@" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234887061411">
            <link role="variableDeclaration" targetNodeId="1234886980348" resolveInfo="oneLine" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1234887069368">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887069369">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237464747723">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237464750616">
                  <property name="value" value="@" />
                  <property name="withIndent" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992387">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981610518">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981610519">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981610520" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981610521">
                <link role="link" targetNodeId="1.1188208074048" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292340161418">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292340161419">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292340161433">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292340161435">
                <property name="value" value="(" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="3408882292340161436">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292340161437">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3408882292340161438" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292340161439">
                    <link role="link" targetNodeId="1.1188214630783" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292340161440">
                <property name="value" value=")" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292340161428">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292340161423">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3408882292340161422" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292340161427">
                <link role="link" targetNodeId="1.1188214630783" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292340161432" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234887283005">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887283006">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992768">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992770">
                <property name="value" value=" " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234887285056">
            <link role="variableDeclaration" targetNodeId="1234886980348" resolveInfo="oneLine" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1234887295295">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887295296">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991973">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991975" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234887379769">
    <link role="conceptDeclaration" targetNodeId="1.1188214482800" resolveInfo="AnnotationInstanceExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234887379770">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887379771">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992462">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992464">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887410198">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234887408291" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234887414327">
                <link role="link" targetNodeId="1.1188214506790" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234887419578">
    <link role="conceptDeclaration" targetNodeId="1.1188214545140" resolveInfo="AnnotationInstanceValue" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234887419579">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887419580">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991698">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991700">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887467132">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887467133">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234887467134" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234887467135">
                  <link role="link" targetNodeId="1.1188214555875" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234887467136">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991701">
            <property name="value" value=" = " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991702">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182638133">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182637757" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182642653">
                <link role="link" targetNodeId="1.1188214607812" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234887488963">
    <link role="conceptDeclaration" targetNodeId="1.1188206574119" resolveInfo="AnnotationMethodDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234887488964">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887488965">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556329188">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237556330987" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237464771196" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556315549">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237556316036">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556316037">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556316038" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556316039">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556316040">
            <property name="value" value=" " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237556316041">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556316042">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556316043" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237556316044">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556316045">
            <property name="value" value="()" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="5821783483711598043">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234887555845">
    <link role="conceptDeclaration" targetNodeId="1.1170345865475" resolveInfo="AnonymousClass" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234887555846">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887555847">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981649232">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981652313">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981652314">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981652315" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981652316">
                <link role="link" targetNodeId="1.1170346070688" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234887935308">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234887935309">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992778">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992780">
                <property name="value" value="&lt;" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992781">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236252809171">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236252807583" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236252811500">
                    <link role="link" targetNodeId="1.1201186121363" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992782">
                <property name="value" value="&gt;" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887944209">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234887939673">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234887937406" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234887942271">
                <link role="link" targetNodeId="1.1201186121363" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234887952769" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992061">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992063">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992064">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236193117324">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236193116901" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236193118781">
                <link role="link" targetNodeId="1.1170346101385" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992065">
            <property name="value" value=")" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237556530963">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237556530964">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556546051">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556559084">
                <property name="value" value=" extends " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237556559085">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556559086">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556559087" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556559088">
                    <link role="link" targetNodeId="1.1165602531693" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556540208">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556537031">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556535561" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556539160">
                <link role="link" targetNodeId="1.1165602531693" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237556543347" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234888280364">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234888280365">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993024">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993026">
                <property name="value" value=" implements " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993027">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236252949032">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236252948623" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236252951047">
                    <link role="link" targetNodeId="1.1095933932569" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888294421">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888284041">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234888283493" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234888285045">
                <link role="link" targetNodeId="1.1095933932569" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234888299879" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556583903">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556585655">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236684883345">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236684883346">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339892042">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="3408882292339892044">
                <link role="function" targetNodeId="3408882292339891837" resolveInfo="body" />
                <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3408882292339892045" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237464833068">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237464835992">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234888787417">
    <link role="conceptDeclaration" targetNodeId="1.1182160077978" resolveInfo="AnonymousClassCreator" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234888787418">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234888787419">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991703">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991705">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888805939">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234888805407" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234888807037">
                <link role="link" targetNodeId="1.1182160096073" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234888829413">
    <link role="conceptDeclaration" targetNodeId="1.1173175405605" resolveInfo="ArrayAccessExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234888829414">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234888829415">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993012">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993014">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888842373">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234888841778" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234888843846">
                <link role="link" targetNodeId="1.1173175590490" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993015">
            <property name="value" value="[" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993016">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182865841">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182865465" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182872176">
                <link role="link" targetNodeId="1.1173175577737" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993017">
            <property name="value" value="]" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234888870976">
    <link role="conceptDeclaration" targetNodeId="1.1184950988562" resolveInfo="ArrayCreator" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234888870977">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234888870978">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991777">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991779">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888883326">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234888882809" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234888884846">
                <link role="link" targetNodeId="1.1184951007469" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991780">
            <property name="withSeparator" value="false" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253035556">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253035148" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253037094">
                <link role="link" targetNodeId="1.1184952969026" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234888916067">
    <link role="conceptDeclaration" targetNodeId="1.1154542696413" resolveInfo="ArrayCreatorWithInitializer" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234888916068">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234888916069">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992578">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992580">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234888932368">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234888930555" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234888933622">
                <link role="link" targetNodeId="1.1154542793668" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992581">
            <property name="value" value="[]{" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992582">
            <property name="separator" value="," />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236252990853">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236252990508" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236252998246">
                <link role="link" targetNodeId="1.1154542803372" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992583">
            <property name="value" value="}" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234889016866">
    <link role="conceptDeclaration" targetNodeId="1.1208890769693" resolveInfo="ArrayLengthOperation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234889016867">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234889016868">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993243">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993245">
            <property name="value" value="length" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234889037948">
    <link role="conceptDeclaration" targetNodeId="1.1188220165133" resolveInfo="ArrayLiteral" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234889037949">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234889037950">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993099">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993101">
            <property name="value" value="{" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993102">
            <property name="separator" value=" ," />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253050363">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253050018" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253053208">
                <link role="link" targetNodeId="1.1188220173759" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993103">
            <property name="value" value="}" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890240213">
    <link role="conceptDeclaration" targetNodeId="1.1070534760951" resolveInfo="ArrayType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890240214">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890240215">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992656">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992658">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890251250">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890250781" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890253676">
                <link role="link" targetNodeId="1.1070534760952" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992659">
            <property name="value" value="[]" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890261494">
    <link role="conceptDeclaration" targetNodeId="1.1160998861373" resolveInfo="AssertStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890261495">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890261496">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556661627">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237556663676" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237556670304" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993358">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993361">
            <property name="value" value="assert " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993362">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182917486">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182917141" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182919600">
                <link role="link" targetNodeId="1.1160998896846" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237556713214">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237556713215">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237556721260">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237556721621">
                <property name="value" value=" : " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237556721622">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556721623">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556721624" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556721625">
                    <link role="link" targetNodeId="1.1160998916832" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556716755">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556714765">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556714389" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556716238">
                <link role="link" targetNodeId="1.1160998916832" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237556718415" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559065852">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237559067213">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890331123">
    <link role="conceptDeclaration" targetNodeId="1.1068498886294" resolveInfo="AssignmentExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890331124">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890331125">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992573">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992575">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890350864">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890350317" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890360230">
                <link role="link" targetNodeId="1.1068498886295" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992576">
            <property name="value" value=" = " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992577">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182950268">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182949142" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182952147">
                <link role="link" targetNodeId="1.1068498886297" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890392776">
    <link role="conceptDeclaration" targetNodeId="1.1224500764161" resolveInfo="BitwiseAndExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890392777">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890392778">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992019">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992021">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890405392">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890404907" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890406584">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992022">
            <property name="value" value=" &amp; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992023">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182965324">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182964557" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182967031">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890432474">
    <link role="conceptDeclaration" targetNodeId="1.1225894555487" resolveInfo="BitwiseNotExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890432475">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890432476">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992165">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992167">
            <property name="value" value="~(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992168">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182977990">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182975596" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182979057">
                <link role="link" targetNodeId="1.1225894555490" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992169">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890471522">
    <link role="conceptDeclaration" targetNodeId="1.1224500790866" resolveInfo="BitwiseOrExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890471523">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890471524">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993271">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993273">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890484857">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890484387" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890485908">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993274">
            <property name="value" value=" | " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993275">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236182996690">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236182996267" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236182999210">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890501829">
    <link role="conceptDeclaration" targetNodeId="1.1224500799915" resolveInfo="BitwiseXorExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890501830">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890501831">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993229">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993231">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890533039">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890532585" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890535387">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993232">
            <property name="value" value=" ^ " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993233">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183013715">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183013354" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183015891">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890557996">
    <link role="conceptDeclaration" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890557997">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890557998">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1234890590734">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234890590735">
            <property name="name" value="needBrackets" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1234890590736" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1234890599098">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890602116">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890602117">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890639556">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890639557">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1234890653275">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890653276">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890679564">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890679565">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234890695265">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1234890697439">
                            <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1234890698911">
                              <property name="value" value="true" />
                            </node>
                            <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234890695266">
                              <link role="variableDeclaration" targetNodeId="1234890590735" resolveInfo="needBrackets" />
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1234890702507" />
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890682460">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234890681522">
                          <link role="variableDeclaration" targetNodeId="1234890653279" resolveInfo="statement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1234890687528">
                          <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1234890692483">
                            <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890673242">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890661590">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890661257" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890662689">
                        <link role="link" targetNodeId="1.1082485599096" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234890674435">
                      <link role="link" targetNodeId="1.1068581517665" />
                    </node>
                  </node>
                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1234890653279">
                    <property name="name" value="statement" />
                    <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234890655267">
                      <link role="concept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890646316">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890643436">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890643060" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890645378">
                    <link role="link" targetNodeId="1.1082485599096" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1234890647945" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1234890616008">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890626736">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890621872">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890621355" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1234890625579" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1234890627943">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1234890633977">
                  <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890607641">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890604574">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890604198" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1234890605703" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1234890609161">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1234890614335">
                  <link role="conceptDeclaration" targetNodeId="1.1082485599095" resolveInfo="BlockStatement" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1234890709868">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890709869">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1234890720401">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1234890722544">
                  <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1234890724266">
                    <property name="value" value="true" />
                  </node>
                  <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234890720402">
                    <link role="variableDeclaration" targetNodeId="1234890590735" resolveInfo="needBrackets" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890729799">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890729800">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="8170689402424448744">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8170689402424448745">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993048">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465027866">
                    <property name="value" value=" {" />
                    <property name="withIndent" value="false" />
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8170689402424448762">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8170689402424448763">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="8170689402424448764" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="8170689402424448765" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="8170689402424448766">
                  <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="8170689402424448767">
                    <link role="conceptDeclaration" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="8170689402424543988">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8170689402424543989">
                  <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="8170689402424448768">
                    <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="8170689402424448770" />
                    <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="8170689402424543981">
                      <property name="value" value="{" />
                      <property name="withIndent" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.IncreaseDepthOperation" id="1234890755282" />
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234890735788">
            <link role="variableDeclaration" targetNodeId="1234890590735" resolveInfo="needBrackets" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237556767648">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237556767649">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992156">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992158">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890775865">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890775504" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234890776978">
                    <link role="link" targetNodeId="1.1082485599096" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556773236">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237556769840">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237556769402" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237556772641">
                <link role="link" targetNodeId="1.1082485599096" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237556775724" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890779262">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890779263">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation" id="1234890784548" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992159">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992161" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465009708">
                <property name="value" value="}" />
                <property name="withIndent" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1234890781313">
            <link role="variableDeclaration" targetNodeId="1234890590735" resolveInfo="needBrackets" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890802087">
    <link role="conceptDeclaration" targetNodeId="1.1068580123137" resolveInfo="BooleanConstant" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890802088">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890802089">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993188">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993190">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1237554363625">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237554364800">
                <property name="value" value="" />
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890818566">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890818206" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234890819961">
                  <link role="property" targetNodeId="1.1068580123138" resolveInfo="value" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890826228">
    <link role="conceptDeclaration" targetNodeId="1.1070534644030" resolveInfo="BooleanType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890826229">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890826230">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992162">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992164">
            <property name="value" value="boolean" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890841265">
    <link role="conceptDeclaration" targetNodeId="1.1081855346303" resolveInfo="BreakStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890841266">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890841267">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992683">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992685" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234890853443">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890853444">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992291">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465111311">
                <property name="value" value="break " />
                <property name="withIndent" value="true" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992293">
                <property name="withIndent" value="false" />
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890899920">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890899466" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234890900987">
                    <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992294">
                <property name="value" value=";" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890857656">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234890855495">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234890854993" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234890856670">
                <link role="property" targetNodeId="1.1199466066648" resolveInfo="label" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.IsNotEmptyOperation" id="1234890860989" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1234890913508">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890913509">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465047603">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465050371">
                  <property name="value" value="break;" />
                  <property name="withIndent" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890924622">
    <link role="conceptDeclaration" targetNodeId="1.1070534604311" resolveInfo="ByteType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890924623">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890924624">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992345">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992347">
            <property name="value" value="byte" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890940910">
    <link role="conceptDeclaration" targetNodeId="1.1070534934090" resolveInfo="CastExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890940911">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890940912">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992545">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992547">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992564">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183033099">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183032723" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183036480">
                <link role="link" targetNodeId="1.1070534934091" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992565">
            <property name="value" value=")" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992566">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183042718">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183041545" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183043754">
                <link role="link" targetNodeId="1.1070534934092" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234890997638">
    <link role="conceptDeclaration" targetNodeId="1.1164903280175" resolveInfo="CatchClause" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234890997639">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234890997640">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992173">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465146720">
            <property name="value" value="} catch (" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992175">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891034759">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891034242" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234891036825">
                <link role="link" targetNodeId="1.1164903359217" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992176">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236684911349">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236684911350">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992862">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992864">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891056946">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891056555" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234891059513">
                    <link role="link" targetNodeId="1.1164903359218" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234891066969">
    <link role="conceptDeclaration" targetNodeId="1.1200397529627" resolveInfo="CharConstant" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234891066970">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891066971">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992302">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992304">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1234891128642">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1234891129630">
                <property name="value" value="'" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1234891120368">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1234891117460">
                  <property name="value" value="'" />
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891122700">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891122214" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234891124798">
                    <link role="property" targetNodeId="1.1200397540847" resolveInfo="charConstant" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234891149163">
    <link role="conceptDeclaration" targetNodeId="1.1070534555686" resolveInfo="CharType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234891149164">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891149165">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993240">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993242">
            <property name="value" value="char" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="4" modelUID="r:00000000-0000-4000-0000-011c895902c0(jetbrains.mps.baseLanguage.behavior)" />
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234891178357">
    <property name="extention" value="java" />
    <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234891178358">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891178359">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981689982">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981692609">
            <link role="function" targetNodeId="1234799968946" resolveInfo="fileHeader" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981692610" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981699831">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981699832" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981704647">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981704648">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981704649" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981704650">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234891228501">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891228502">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992530">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992532">
                <property name="value" value="static " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="6160828558200601528">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6160828558200604833">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="6160828558200604832" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="6160828558200604837">
                <link role="baseMethodDeclaration" targetNodeId="4v.521412098689998668" resolveInfo="isStatic" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451604485">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="582575223451604482" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="6160828558200601527">
                <link role="baseMethodDeclaration" targetNodeId="4v.521412098689998677" resolveInfo="isInner" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234891263834">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891263835">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992775">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992777">
                <property name="value" value="abstract " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891272933">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891268104" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1234891275187">
              <link role="property" targetNodeId="1.1075300953594" resolveInfo="abstractClass" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991709">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991711">
            <property name="value" value="class " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991712">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183072562">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183072108" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236183075160">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982356409">
            <link role="function" targetNodeId="1234891360396" resolveInfo="typeDeclarations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982356410" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234891523790">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891523791">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991915">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991917">
                <property name="value" value=" extends " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991918">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183085210">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183084756" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183086839">
                    <link role="link" targetNodeId="1.1165602531693" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891527894">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891525655">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891525107" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1234891527065">
                <link role="link" targetNodeId="1.1165602531693" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1234891529648" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234891556382">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891556383">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992729">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992731">
                <property name="value" value=" implements " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992732">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253203256">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253202723" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253204763">
                    <link role="link" targetNodeId="1.1095933932569" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891561736">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891559840">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234891558667" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234891561016">
                <link role="link" targetNodeId="1.1095933932569" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234891563224" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557133060">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557134640">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236684958762">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236684958763">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339892038">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="3408882292339892040">
                <link role="function" targetNodeId="3408882292339891837" resolveInfo="body" />
                <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3408882292339892041" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="4122243921611764235">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4122243921611764236">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="4122243921611764655">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="4122243921611764657" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764641">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764650">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764645">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764644" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764649">
                  <link role="link" targetNodeId="1.1070462273904" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764654" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764627">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764613">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764599">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764585">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764571">
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764557">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764543">
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="4122243921611764529">
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764518">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764513">
                                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764502" />
                                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="4122243921611764517">
                                  <link role="link" targetNodeId="1.1221737886778" />
                                </node>
                              </node>
                              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="4122243921611764522" />
                            </node>
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764538">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764533">
                                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764532" />
                                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764537">
                                  <link role="link" targetNodeId="1.1068390468201" />
                                </node>
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764542" />
                            </node>
                          </node>
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764552">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764547">
                              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764546" />
                              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764551">
                                <link role="link" targetNodeId="1.1068390468199" />
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764556" />
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764566">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764561">
                            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764560" />
                            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="4122243921611764565">
                              <link role="link" targetNodeId="1.1206629658424" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="4122243921611764570" />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764580">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764575">
                          <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764574" />
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764579">
                            <link role="link" targetNodeId="1.1107880067339" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764584" />
                      </node>
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764594">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764589">
                        <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764588" />
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764593">
                          <link role="link" targetNodeId="1.1128555889557" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764598" />
                    </node>
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764608">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764603">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764602" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764607">
                        <link role="link" targetNodeId="1.1201374247313" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764612" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764622">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764617">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764616" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="4122243921611764621">
                      <link role="link" targetNodeId="1.1171626359898" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="4122243921611764626" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764636">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611764631">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611764630" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="4122243921611764635">
                    <link role="link" targetNodeId="1.1178616825527" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" id="4122243921611764640" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="5738719242364345184">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5738719242364345185">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="5738719242364345208">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="5738719242364345211">
                <property name="value" value="}" />
                <property name="withIndent" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="5738719242364345188">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451604501">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="582575223451604499">
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="582575223451604498" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="582575223451604505">
                <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.isRoot():boolean" resolveInfo="isRoot" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="5738719242364345212">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="5738719242364345213">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="5738719242364345214">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="5738719242364345216">
                  <property name="value" value="}" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561201529">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561210817" />
        </node>
      </node>
    </node>
    <node role="extension" type="jetbrains.mps.lang.textGen.structure.ExtensionDeclaration" id="2341412953773654310">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2341412953773654311">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="2341412953773654312">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="2341412953773654313">
            <property name="value" value="java" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration" id="1234891338660">
    <property name="name" value="GenericDeclarationTextGen2" />
    <property name="package" value="lang" />
    <link role="baseTextGen" targetNodeId="1234796104060" resolveInfo="BaseLangTextGen" />
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1234891360396">
      <property name="name" value="typeDeclarations" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1234891360397" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891360398">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234891385996">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891396568">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234891391828">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1234891389983">
                <link role="variableDeclaration" targetNodeId="1234891371446" resolveInfo="generic" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234891394520">
                <link role="link" targetNodeId="1.1109279881614" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234891401574" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234891385998">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992492">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992494">
                <property name="value" value="&lt;" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992495">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253527779">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236253527184">
                    <link role="variableDeclaration" targetNodeId="1234891371446" resolveInfo="generic" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253531066">
                    <link role="link" targetNodeId="1.1109279881614" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992496">
                <property name="value" value="&gt;" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1234891371446">
        <property name="name" value="generic" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1234891371447">
          <link role="concept" targetNodeId="1.1109279851642" resolveInfo="GenericDeclaration" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892337624">
    <link role="conceptDeclaration" targetNodeId="1.1212685548494" resolveInfo="ClassCreator" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892337625">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892337626">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981721418">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981734058">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981734059">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981734062" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1238059483286">
                <link role="link" targetNodeId="1.1212686240295" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981794010">
            <link role="function" targetNodeId="1234796165248" resolveInfo="typeParameters" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981794011">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981794012" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1237981794013">
                <link role="link" targetNodeId="1.1212687122400" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981800703">
            <link role="function" targetNodeId="1234796367381" resolveInfo="arguments" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981800704" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892420461">
    <link role="conceptDeclaration" targetNodeId="1.1116615150612" resolveInfo="ClassifierClassExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892420462">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892420463">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992726">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981817410">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981817411">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981817412" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981817413">
                <link role="link" targetNodeId="1.1116615189566" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992728">
            <property name="value" value=".class" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892447096">
    <link role="conceptDeclaration" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892447097">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892447098">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981829525">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981835183">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981835184">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981835185" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981835186">
                <link role="link" targetNodeId="1.1107535924139" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1234892466852">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892466853">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991894">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991896">
                <property name="value" value="&lt;" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991897">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253289699">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253289073" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253291204">
                    <link role="link" targetNodeId="1.1109201940907" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991898">
                <property name="value" value="&gt;" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234892475300">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234892471451">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234892470309" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1234892473799">
                <link role="link" targetNodeId="1.1109201940907" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1234892476663" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892549516">
    <link role="conceptDeclaration" targetNodeId="1.1177326519037" resolveInfo="CommentedStatementsBlock" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892549517">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892549518">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991875">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991878" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465305045">
            <property name="withIndent" value="true" />
            <property name="value" value="/*" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685002519">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685002520">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992267">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992269">
                <property name="withSeparator" value="false" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253306986">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253306609" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253308318">
                    <link role="link" targetNodeId="1.1177326540772" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465277993">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237559310796" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465284167">
            <property name="value" value="*/" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892777974">
    <link role="conceptDeclaration" targetNodeId="1.1107135704075" resolveInfo="ConceptFunctionParameter" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892777975">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892777976">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992427">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992429">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1234892807762">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1234892807136" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SConceptPropertyAccess" id="1234892814063">
                <link role="conceptProperty" targetNodeId="3v.1137473891462" resolveInfo="alias" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1234892820096">
    <link role="conceptDeclaration" targetNodeId="1.1145552977093" resolveInfo="GenericNewExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1234892820097">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1234892820098">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991924">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991926">
            <property name="value" value="new " />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235067585923">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067585924">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.FoundErrorOperation" id="1235067598648" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992936">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992938">
                <property name="value" value="???" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067593237">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067589650">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067587599" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235067591970">
                <link role="link" targetNodeId="1.1145553007750" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="1235067594631" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235067613248">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067613249">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992446">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992448">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235582108163">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067618550" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235582109838">
                      <link role="link" targetNodeId="1.1145553007750" />
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
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235067626785">
    <link role="conceptDeclaration" targetNodeId="1.1081506762703" resolveInfo="GreaterThanExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235067626786">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067626787">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993191">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993193">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067644620">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067643650" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235067645749">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993194">
            <property name="value" value=" &gt; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993195">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183393810">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183393418" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183395970">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235067670076">
    <link role="conceptDeclaration" targetNodeId="1.1153417849900" resolveInfo="GreaterThanOrEqualsExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235067670077">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067670078">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992584">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992586">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067687676">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067687097" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235067689946">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992587">
            <property name="value" value=" &gt;= " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992603">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183410491">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183409865" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183412417">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235067710648">
    <link role="conceptDeclaration" targetNodeId="1.1179360813171" resolveInfo="HexIntegerLiteral" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235067710649">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067710650">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991661">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991663">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1235067731025">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067734498">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067733888" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235067735846">
                  <link role="property" targetNodeId="1.1179360856892" resolveInfo="value" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1235067721716">
                <property name="value" value="0x" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235067749472">
    <link role="conceptDeclaration" targetNodeId="1.1068580123159" resolveInfo="IfStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235067749473">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235067749474">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558539834">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558541633" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465663398" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991865">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991868">
            <property name="value" value="if (" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991869">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183432634">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183432273" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183434841">
                <link role="link" targetNodeId="1.1068580123160" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991870">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685131813">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685131814">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992953">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992955">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235067815304">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235067814678" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235067821277">
                    <link role="link" targetNodeId="1.1068580123161" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558687965">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558688342" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558798246">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237558688343">
            <property name="withSeparator" value="false" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558688344">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558688345" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1237558688346">
                <link role="link" targetNodeId="1.1206060520071" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237558812873">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237558812874">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558814627">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558815035">
                <property name="value" value=" else" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237558815036">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558815037">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558815038" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558815039">
                    <link role="link" targetNodeId="1.1082485599094" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558877239">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558818682">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558818306" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558821202">
                <link role="link" targetNodeId="1.1082485599094" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237558879244" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068025775">
    <link role="conceptDeclaration" targetNodeId="1.1206629501431" resolveInfo="InstanceInitializer" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068025776">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068025777">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993043">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993045" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558889027">
            <property name="value" value="{" />
            <property name="withIndent" value="true" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685148176">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685148177">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992815">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992817">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068056930">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068056429" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235068058184">
                    <link role="link" targetNodeId="1.1206629521979" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465683358">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558911123" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465685485">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558913844" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068084774">
    <link role="conceptDeclaration" targetNodeId="1.1202948039474" resolveInfo="InstanceMethodCallOperation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068084775">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068084776">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981977290">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981979933">
            <link role="function" targetNodeId="1235571124825" resolveInfo="methodCall" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981979934" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068110028">
    <link role="conceptDeclaration" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068110029">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068110030">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560364567">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237560365757" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981989749">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981989750" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981996674">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981996675">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981996676" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981996677">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1240303515293">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1240303515294">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1240303527617">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1240303527618">
                <property name="value" value="final " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240303517960">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1240303517548" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1240303523771">
              <link role="property" targetNodeId="1.1181808852946" resolveInfo="isFinal" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235068169464">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068169465">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991706">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991708">
                <property name="value" value="abstract " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="6227066020986694413">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="6227066020986695250">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6227066020986695258">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="6227066020986695253">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="6227066020986695252" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="6227066020986695257" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="6227066020986695262">
                  <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="6227066020986695264">
                    <link role="conceptDeclaration" targetNodeId="1.1107796713796" resolveInfo="Interface" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068171813">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068171218" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235068176114">
                <link role="property" targetNodeId="1.1178608670077" resolveInfo="isAbstract" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992024">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982022992">
            <link role="function" targetNodeId="1234891360396" resolveInfo="typeDeclarations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982022993" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992027">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068209782">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068209265" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235068211317">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992028">
            <property name="value" value=" " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992029">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183458700">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183458012" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236183460001">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992030">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992031">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253560778">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253560386" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253565299">
                <link role="link" targetNodeId="1.1068580123134" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992032">
            <property name="value" value=")" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235068312728">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068312729">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992911">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992913">
                <property name="value" value=" throws " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992914">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253577445">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253577054" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253578809">
                    <link role="link" targetNodeId="1.1164879685961" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068321316">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068318405">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068317826" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235068320534">
                <link role="link" targetNodeId="1.1164879685961" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235068324695" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235068440590">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068440591">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992170">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992172">
                <property name="value" value=";" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="186788241848735159">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="186788241848735160">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="186788241848737297">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="186788241848737299" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="186788241848735163">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="186788241848737290">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="186788241848735166">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="186788241848735165" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="186788241848737289" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="186788241848737294">
                    <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="186788241848737296">
                      <link role="conceptDeclaration" targetNodeId="1.1107796713796" resolveInfo="Interface" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1235068450592">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068454299">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068453517" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235068456460">
                <link role="property" targetNodeId="1.1178608670077" resolveInfo="isAbstract" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068444101">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068442267">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068441751" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1235068443334" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235068445792">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235068448575">
                  <link role="conceptDeclaration" targetNodeId="1.1107796713796" resolveInfo="Interface" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235068466948">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068466949">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993008">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993010">
                  <property name="value" value=" {" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685158883">
                <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685158884">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235068481019">
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068481020">
                      <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992058">
                        <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992060">
                          <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068498304">
                            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068497896" />
                            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235068499854">
                              <link role="link" targetNodeId="1.1068580123135" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068490311">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068482728">
                        <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068482305" />
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235068488263">
                          <link role="link" targetNodeId="1.1068580123135" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1235068491815" />
                    </node>
                    <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235068503512">
                      <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068503513">
                        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991843">
                          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991861" />
                          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465727635">
                            <property name="value" value="throw new RuntimeException(\&quot;NOT IMPLEMENTED\&quot;);" />
                            <property name="withIndent" value="true" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465712161">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561337260" />
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465714242">
                  <property name="value" value="}" />
                  <property name="withIndent" value="true" />
                </node>
              </node>
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561365184">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561366545" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068603610">
    <link role="conceptDeclaration" targetNodeId="1.1081256982272" resolveInfo="InstanceOfExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068603611">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068603612">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992818">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992820">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068617210">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068616474" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235068618057">
                <link role="link" targetNodeId="1.1081256993304" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992821">
            <property name="value" value=" instanceof " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992822">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183489821">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183489445" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183491435">
                <link role="link" targetNodeId="1.1081256993305" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068647697">
    <link role="conceptDeclaration" targetNodeId="1.1068580320020" resolveInfo="IntegerConstant" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068647698">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068647699">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991647">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991649">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1235068661860">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235068664333">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235068663973" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235068665634">
                  <link role="property" targetNodeId="1.1068580320021" resolveInfo="value" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1235068658718">
                <property name="value" value="" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068672666">
    <link role="conceptDeclaration" targetNodeId="1.1070534370425" resolveInfo="IntegerType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068672667">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068672668">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991840">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991842">
            <property name="value" value="int" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235068684876">
    <link role="conceptDeclaration" targetNodeId="1.1107796713796" resolveInfo="Interface" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235068684877">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235068684878">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237982032621">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982034951">
            <link role="function" targetNodeId="1234799968946" resolveInfo="fileHeader" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982034952" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982039938">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982039939" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982046442">
            <link role="function" targetNodeId="1234800177954" resolveInfo="visibility" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982046443">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982046444" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237982046445">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235129780330">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235129780331">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993315">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993317">
                <property name="value" value="static " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1235129814293">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129814294">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129814295">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129814296">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235129814297" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" id="1235129814298" />
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Model_RootsOperation" id="1235129814299">
                  <link role="concept" targetNodeId="1.1107796713796" resolveInfo="Interface" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" id="1235129814300">
                <node role="argument" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235129814301" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993199">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465748965">
            <property name="value" value="interface " />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993201">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1235129854250">
              <link role="baseMethodDeclaration" targetNodeId="5.~JavaNameUtil.shortName(java.lang.String):java.lang.String" resolveInfo="shortName" />
              <link role="classConcept" targetNodeId="5.~JavaNameUtil" resolveInfo="JavaNameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129856705">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235129856063" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235129857768">
                  <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982057322">
            <link role="function" targetNodeId="1234891360396" resolveInfo="typeDeclarations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982057323" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235129879129">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235129879130">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993114">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993116">
                <property name="value" value=" extends " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993133">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253610937">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253610561" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253613316">
                    <link role="link" targetNodeId="1.1107797138135" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129884046">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235129881956">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235129881346" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235129883307">
                <link role="link" targetNodeId="1.1107797138135" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235129886118" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560448916">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237560450855">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685176652">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685176653">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992742">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992744">
                <property name="withSeparator" value="false" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253591637">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253591245" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253592985">
                    <link role="link" targetNodeId="1.1128555889557" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235130023142">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130023143">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339906254">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="3408882292339906257">
                    <link role="function" targetNodeId="8170689402424596661" resolveInfo="newLine" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339906258">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339906259">
                        <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3408882292339906260" />
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339906261">
                          <link role="link" targetNodeId="1.1128555889557" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339906262" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992177">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992179" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992180">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253599943">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253599551" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253601791">
                        <link role="link" targetNodeId="1.1107880067339" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130031858">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130029143">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130028613" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235130030671">
                    <link role="link" targetNodeId="1.1107880067339" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235130033770" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560455264">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="4122243921611746513" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="4122243921611777300">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4122243921611777301">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="4122243921611777316">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="4122243921611777318">
                <property name="value" value="}" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4122243921611777311">
            <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="4122243921611777309">
              <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4122243921611777304" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="4122243921611777315">
              <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.isRoot():boolean" resolveInfo="isRoot" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="4122243921611777319">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4122243921611777320">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="4122243921611777321">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="4122243921611777323">
                  <property name="value" value="}" />
                  <property name="withIndent" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="4122243921611777295">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="4122243921611777297" />
        </node>
      </node>
    </node>
    <node role="extension" type="jetbrains.mps.lang.textGen.structure.ExtensionDeclaration" id="2341412953773654318">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2341412953773654319">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="2341412953773654320">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="2341412953773654321">
            <property name="value" value="java" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130112612">
    <link role="conceptDeclaration" targetNodeId="1.1081506773034" resolveInfo="LessThanExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130112613">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130112614">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992251">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992253">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130126907">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130126417" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130129271">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992254">
            <property name="value" value=" &lt; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992255">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183501377">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183501001" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183503210">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130149678">
    <link role="conceptDeclaration" targetNodeId="1.1153422305557" resolveInfo="LessThanOrEqualsExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130149679">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130149680">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993246">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993248">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130162207">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130161749" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130163173">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993249">
            <property name="value" value=" &lt;= " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993265">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183517437">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183514855" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183518738">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130181120">
    <link role="conceptDeclaration" targetNodeId="1.1172008963197" resolveInfo="LocalStaticFieldReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130181121">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130181122">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993355">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463993357">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235568170276">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235568166352" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235568171921">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130213032">
    <link role="conceptDeclaration" targetNodeId="1.1172058436953" resolveInfo="LocalStaticMethodCall" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130213033">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130213034">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237982066731">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982069796">
            <link role="function" targetNodeId="1235571124825" resolveInfo="methodCall" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982069797" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130247219">
    <link role="conceptDeclaration" targetNodeId="1.1068581242864" resolveInfo="LocalVariableDeclarationStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130247220">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130247221">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560517491">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237560518571" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465779843" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991933">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991936">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130320290">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130319897" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130322681">
                <link role="link" targetNodeId="1.1068581242865" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991937">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130339063">
    <link role="conceptDeclaration" targetNodeId="1.1068581242867" resolveInfo="LongType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130339064">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130339065">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992497">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992499">
            <property name="value" value="long" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130354959">
    <link role="conceptDeclaration" targetNodeId="1.1171903862077" resolveInfo="LowerBoundType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130354960">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130354961">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992900">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992902">
            <property name="value" value="? super " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992903">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183537415">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183534742" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183539372">
                <link role="link" targetNodeId="1.1171903869531" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130393271">
    <link role="conceptDeclaration" targetNodeId="1.1215695201514" resolveInfo="MinusAssignmentExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130393272">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130393273">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992948">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992950">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130406561">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130405947" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130408606">
                <link role="link" targetNodeId="1.1068498886295" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992951">
            <property name="value" value=" -= " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992952">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183552815">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183552439" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183556053">
                <link role="link" targetNodeId="1.1068498886297" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130431827">
    <link role="conceptDeclaration" targetNodeId="1.1068581242869" resolveInfo="MinusExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130431828">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130431829">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991835">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991837">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130442117">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130441645" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130443377">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991838">
            <property name="value" value=" - " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991839">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183572657">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183572249" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183574458">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130467132">
    <link role="conceptDeclaration" targetNodeId="1.1092119917967" resolveInfo="MulExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130467133">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130467134">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991749">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991751">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130478474">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130477830" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130480221">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991752">
            <property name="value" value=" * " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991753">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183586400">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183586024" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183587889">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130500647">
    <link role="conceptDeclaration" targetNodeId="1.1073239437375" resolveInfo="NotEqualsExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130500648">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130500649">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992865">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992867">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130511817">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130510748" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130512763">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992868">
            <property name="value" value=" != " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992869">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183599238">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183598893" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183600789">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130548876">
    <link role="conceptDeclaration" targetNodeId="1.1081516740877" resolveInfo="NotExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130548877">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130548878">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993134">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993136">
            <property name="value" value="!(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993137">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183611405">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183611061" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183613253">
                <link role="link" targetNodeId="1.1081516765348" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993138">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130597164">
    <link role="conceptDeclaration" targetNodeId="1.1070534058343" resolveInfo="NullLiteral" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130597165">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130597166">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992299">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992301">
            <property name="value" value="null" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130615183">
    <link role="conceptDeclaration" targetNodeId="1.1080223426719" resolveInfo="OrExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130615184">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130615185">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992053">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992055">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130626051">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130625658" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130627291">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992056">
            <property name="value" value=" || " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992057">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183626026">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183625619" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183627280">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130646085">
    <link role="conceptDeclaration" targetNodeId="1.1068498886292" resolveInfo="ParameterDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130646086">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130646087">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237982140449">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982144279">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982144280" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982147032">
            <link role="function" targetNodeId="1235584330956" resolveInfo="variableDeclaration" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982147033" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130676607">
    <link role="conceptDeclaration" targetNodeId="1.1068581242874" resolveInfo="ParameterReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130676608">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130693731">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993234">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463993236">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235568234138">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1238085960484">
                <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235568237628" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1238085966579">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130699507">
    <link role="conceptDeclaration" targetNodeId="1.1079359253375" resolveInfo="ParenthesizedExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130699508">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130699509">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992622">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992624">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992625">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183638319">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183637974" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183639682">
                <link role="link" targetNodeId="1.1079359253376" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992626">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130739529">
    <link role="conceptDeclaration" targetNodeId="1.1215695189714" resolveInfo="PlusAssignmentExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130739530">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130739531">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992703">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992705">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130750866">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130750301" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130755017">
                <link role="link" targetNodeId="1.1068498886295" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992706">
            <property name="value" value=" += " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992707">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183652252">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183651892" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183653693">
                <link role="link" targetNodeId="1.1068498886297" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130778882">
    <link role="conceptDeclaration" targetNodeId="1.1068581242875" resolveInfo="PlusExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130778883">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130778884">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991794">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991796">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130789186">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130788637" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130791115">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991797">
            <property name="value" value=" + " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991798">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183662949">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183662635" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183666531">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130814902">
    <link role="conceptDeclaration" targetNodeId="1.1214918975462" resolveInfo="PostfixDecrementExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130814903">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130814904">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992215">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992217">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130829672">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130829124" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1239730680461">
                <link role="link" targetNodeId="1.1239714902950" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992218">
            <property name="value" value="-- " />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130845453">
    <link role="conceptDeclaration" targetNodeId="1.1214918800624" resolveInfo="PostfixIncrementExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130845454">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130845455">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991938">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991940">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130863470">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130862843" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1239730685621">
                <link role="link" targetNodeId="1.1239714902950" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991941">
            <property name="value" value="++ " />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130883519">
    <link role="conceptDeclaration" targetNodeId="1.1168622733562" resolveInfo="RemarkStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130883520">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130883521">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237465839623">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237465839624">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992823">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992825" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465789220">
                <property name="value" value="// " />
                <property name="withIndent" value="true" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237465859481">
                <property name="withIndent" value="false" />
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237465861406">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237465861077" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237465862707">
                    <link role="property" targetNodeId="1.1168623065899" resolveInfo="value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1237465847852">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1237465849480" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237465844441">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237465843502" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237465846976">
                <link role="property" targetNodeId="1.1168623065899" resolveInfo="value" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1237465868146">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237465868147">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465877695">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237465877696" />
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465877697">
                  <property name="value" value="// " />
                  <property name="withIndent" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130950225">
    <link role="conceptDeclaration" targetNodeId="1.1153422105332" resolveInfo="RemExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130950226">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130950227">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991769">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991771">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235130962689">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235130962188" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235130964163">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991772">
            <property name="value" value=" % " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991773">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183705088">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183704743" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183707170">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235130986968">
    <link role="conceptDeclaration" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235130986969">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235130986970">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991733">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991735" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991736">
            <property name="value" value="return" />
            <property name="withIndent" value="true" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237560592324">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237560592325">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560598558">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237560602779">
                <property name="value" value=" " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237560606265">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560607737">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237560607361" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237560608663">
                    <link role="link" targetNodeId="1.1068581517676" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560595553">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560593595">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237560593250" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237560595099">
                <link role="link" targetNodeId="1.1068581517676" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237560596760" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560626681">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237560627777">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131071246">
    <link role="conceptDeclaration" targetNodeId="1.1225892208569" resolveInfo="ShiftLeftExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131071247">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131071248">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992487">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992489">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131083586">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131083022" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235131085950">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992490">
            <property name="value" value=" &lt;&lt; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992491">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183724589">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183724260" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183728093">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131109350">
    <link role="conceptDeclaration" targetNodeId="1.1225892319711" resolveInfo="ShiftRightExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131109351">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131109352">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992943">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992945">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131119329">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131118765" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235131120677">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992946">
            <property name="value" value=" &gt;&gt; " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992947">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183745161">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183744785" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183762386">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131150614">
    <link role="conceptDeclaration" targetNodeId="1.1070533982221" resolveInfo="ShortType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131150615">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131150616">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991689">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991691">
            <property name="value" value="short" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131169199">
    <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131169200">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131169201">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992893">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992895" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992896">
            <property name="value" value="???" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131198738">
    <link role="conceptDeclaration" targetNodeId="1.1068580123136" resolveInfo="StatementList" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131198739">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131198740">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235131285423">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235131285424">
            <property name="name" value="size" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235131285425" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131294814">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131294815">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131294816" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235131294817">
                  <link role="link" targetNodeId="1.1068581517665" />
                </node>
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" id="1235131294818" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1235131230773">
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235131230774">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1235131232980" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1235131238279">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131230776">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235131415878">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235131415879">
                <property name="name" value="statement" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235131415880">
                  <link role="concept" targetNodeId="1.1068580123157" resolveInfo="Statement" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131448144">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131428471">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131424063">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131423701" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235131427154">
                        <link role="link" targetNodeId="1.1068581517665" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" id="1235131446591" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetElementOperation" id="1235131450155">
                    <node role="argument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235131453010">
                      <link role="variableDeclaration" targetNodeId="1235131230774" resolveInfo="i" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235131270716">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1235131309669">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1237804539860">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1237804539861">
                    <link role="classConcept" targetNodeId="7.~LastStatementUtil" resolveInfo="LastStatementUtil" />
                    <link role="baseMethodDeclaration" targetNodeId="7.~LastStatementUtil.canMakeReturnStatement(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.IScope):boolean" resolveInfo="canMakeReturnStatement" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237804539862">
                      <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1237804539863" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1237804554801">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1237804561760">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237804564497">
                      <link role="variableDeclaration" targetNodeId="1235131230774" resolveInfo="i" />
                    </node>
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1237804554802">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1237804554804">
                        <property name="value" value="1" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237804554803">
                        <link role="variableDeclaration" targetNodeId="1235131285424" resolveInfo="size" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131270718">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235583622098">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235583622099">
                    <property name="name" value="expressionStatement" />
                    <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235583622100">
                      <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1239490687912">
                      <link role="concept" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583737125">
                        <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235583748581">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235583748582">
                    <property name="name" value="returnStatement" />
                    <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235583748583">
                      <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1239812846996">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1239812839727">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1239812839728">
                          <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" id="1239812839729" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.Model_CreateNewNodeOperation" id="1239812852828">
                        <link role="concept" targetNodeId="1.1068581242878" resolveInfo="ReturnStatement" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235583910792">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235583910793">
                    <property name="name" value="expression" />
                    <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235583910794">
                      <link role="concept" targetNodeId="1.1068431790191" resolveInfo="Expression" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237805146311">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235583923563">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583921780">
                          <link role="variableDeclaration" targetNodeId="1235583622099" resolveInfo="expressionStatement" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235583926207">
                          <link role="link" targetNodeId="1.1068580123156" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_CopyOperation" id="1237805148351" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235583933506">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237805157889">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235583934087">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583933507">
                        <link role="variableDeclaration" targetNodeId="1235583622099" resolveInfo="expressionStatement" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237805157544">
                        <link role="link" targetNodeId="1.1068580123156" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation" id="1237805160487" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235583964415">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235583970157">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235583964995">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583964416">
                        <link role="variableDeclaration" targetNodeId="1235583748582" resolveInfo="returnStatement" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235583969656">
                        <link role="link" targetNodeId="1.1068581517676" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation" id="1235583972824">
                      <node role="linkTarget" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583975406">
                        <link role="variableDeclaration" targetNodeId="1235583910793" resolveInfo="expression" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235583981971">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1235583986911">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583988414">
                      <link role="variableDeclaration" targetNodeId="1235583748582" resolveInfo="returnStatement" />
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583981972">
                      <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991983">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991985">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235583996278">
                      <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1235584004124">
                  <property name="value" value="rollback changes" />
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235584018907">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237805275909">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235584019613">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235584018908">
                        <link role="variableDeclaration" targetNodeId="1235583748582" resolveInfo="returnStatement" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237805275518">
                        <link role="link" targetNodeId="1.1068581517676" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation" id="1237805280460" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235584033894">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235584036432">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235584034583">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235584033895">
                        <link role="variableDeclaration" targetNodeId="1235583622099" resolveInfo="expressionStatement" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235584035947">
                        <link role="link" targetNodeId="1.1068580123156" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Link_SetTargetOperation" id="1235584038124">
                      <node role="linkTarget" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235584040127">
                        <link role="variableDeclaration" targetNodeId="1235583910793" resolveInfo="expression" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235584044379">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235584044380">
                  <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992395">
                    <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992397">
                      <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235584048367">
                        <link role="variableDeclaration" targetNodeId="1235131415879" resolveInfo="statement" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1235131302091">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235131303285">
              <link role="variableDeclaration" targetNodeId="1235131285424" resolveInfo="size" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235131241327">
              <link role="variableDeclaration" targetNodeId="1235131230774" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1235131257016">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235131257017">
              <link role="variableDeclaration" targetNodeId="1235131230774" resolveInfo="i" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131598665">
    <link role="conceptDeclaration" targetNodeId="1.1070462154015" resolveInfo="StaticFieldDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131598666">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131598667">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560684186">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237560686016" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982160521">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982160522" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982164008">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982164009">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982164010" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237982164011">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237982170498">
            <property name="value" value="static " />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235581130435">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235581130436">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235581130437" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235581130438">
              <link role="property" targetNodeId="1.1176718929932" resolveInfo="isFinal" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235581130439">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992733">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992735">
                <property name="value" value="final " />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992646">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992650">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235581130443">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235581130444" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235581130445">
                <link role="link" targetNodeId="1.1068431790188" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992651">
            <property name="value" value=" " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992652">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183785523">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183785085" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236183786340">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237560834775">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237560834776">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560837404">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237560837656">
                <property name="value" value=" = " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237560837657">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560837658">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237560837659" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237560837660">
                    <link role="link" targetNodeId="1.1068431790190" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560841745">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237560840349">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237560839958" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237560841275">
                <link role="link" targetNodeId="1.1068431790190" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237560843811" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560852485">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237560853472">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131688885">
    <link role="conceptDeclaration" targetNodeId="1.1070533707846" resolveInfo="StaticFieldReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131688886">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131688887">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992353">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982191844">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982191845">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982191846" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237982191847">
                <link role="link" targetNodeId="1.1144433057691" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992355">
            <property name="value" value="." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463992356">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235568268307">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1238246384561">
                <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235568272251" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235568268312">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131758155">
    <link role="conceptDeclaration" targetNodeId="1.1081236700937" resolveInfo="StaticMethodCall" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131758156">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131758157">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992933">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982206911">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982206912">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982206913" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237982206914">
                <link role="link" targetNodeId="1.1144433194310" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992935">
            <property name="value" value="." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982211213">
            <link role="function" targetNodeId="1235571124825" resolveInfo="methodCall" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982211214" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235131802112">
    <link role="conceptDeclaration" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235131802113">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131802114">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561497661">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561498725" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982221904">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982221905" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982224891">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982224892">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982224893" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237982224894">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235131836958">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235131836959">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993237">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993239">
                <property name="value" value="static " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131857115">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131838887">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131838323" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1235131840252" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235131858699">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235131865177">
                <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992533">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982232522">
            <link role="function" targetNodeId="1234891360396" resolveInfo="typeDeclarations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982232523" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992536">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235131900930">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235131900085" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235131902481">
                <link role="link" targetNodeId="1.1068580123133" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992537">
            <property name="value" value=" " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992538">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183797025">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183796540" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1236183798779">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992539">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992540">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253645385">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253644993" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253646905">
                <link role="link" targetNodeId="1.1068580123134" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992541">
            <property name="value" value=")" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235132723689">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235132723690">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992362">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992364">
                <property name="value" value=" throws " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992365">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253632205">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253631813" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253633287">
                    <link role="link" targetNodeId="1.1164879685961" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235132729168">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235132725616">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235132725068" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235132728355">
                <link role="link" targetNodeId="1.1164879685961" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235132730938" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561559462">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237561560605">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685189233">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685189234">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235132797453">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235132797454">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993385">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993387">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235132813691">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235132813174" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235132815195">
                        <link role="link" targetNodeId="1.1068580123135" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235132805604">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235132802302">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235132801707" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235132803962">
                    <link role="link" targetNodeId="1.1068580123135" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1235132807655" />
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235132820727">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235132820728">
                  <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992339">
                    <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992341" />
                    <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465954397">
                      <property name="value" value="throw new RuntimeException(\&quot;NOT IMPLEMENTED\&quot;);" />
                      <property name="withIndent" value="true" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465938909">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561586576" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465941020">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561589265" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235132901797">
    <link role="conceptDeclaration" targetNodeId="1.1070475926800" resolveInfo="StringLiteral" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235132901798">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235132901799">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992679">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992681">
            <property name="value" value="\&quot;" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982255947">
            <link role="function" targetNodeId="1236013746483" resolveInfo="compilableString" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" id="1237982255948">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1237982255949">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1237982255950" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982255951">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982255952" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237982255953">
                    <link role="property" targetNodeId="1.1070475926801" resolveInfo="value" />
                  </node>
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1237982255954">
                <property name="value" value="" />
              </node>
              <node role="ifFalse" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237982255955">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982255956" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237982255957">
                  <link role="property" targetNodeId="1.1070475926801" resolveInfo="value" />
                </node>
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237982263943">
            <property name="value" value="\&quot;" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133002982">
    <link role="conceptDeclaration" targetNodeId="1.1225271177708" resolveInfo="StringType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133002983">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133002984">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992452">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992454">
            <property name="value" value="String" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133040740">
    <link role="conceptDeclaration" targetNodeId="1.1070475587102" resolveInfo="SuperConstructorInvocation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133040741">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133040742">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237560947761">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237560949201" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465973103" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993349">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993352">
            <property name="value" value="super(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993353">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253659461">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253659132" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1241539728280">
                <link role="link" targetNodeId="1.1068499141038" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993354">
            <property name="value" value=");" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133147898">
    <link role="conceptDeclaration" targetNodeId="1.1073063089578" resolveInfo="SuperMethodCall" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133147899">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133147900">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991692">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991694">
            <property name="value" value="super." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982279477">
            <link role="function" targetNodeId="1235571124825" resolveInfo="methodCall" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982279478" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133163324">
    <link role="conceptDeclaration" targetNodeId="1.1163670490218" resolveInfo="SwitchStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133163325">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133163326">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235133174000">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235133190241">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235133191682" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133178004">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133177441" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235133179649">
                <link role="property" targetNodeId="1.1201381395355" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133174002">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992366">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992368" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992385">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133203517">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133203109" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235133204911">
                    <link role="property" targetNodeId="1.1201381395355" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992386">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993415">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993417" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237561714733">
            <property name="value" value="switch (" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993418">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133250447">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133249992" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133251857">
                <link role="link" targetNodeId="1.1163670766145" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993419">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685251125">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685251126">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1235133293899">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133293900">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993054">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993056" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237466003485">
                    <property name="value" value="case " />
                    <property name="withIndent" value="true" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235133341981">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133341982">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235133400762">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235133400763">
                        <property name="name" value="enumConstant" />
                        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235133400764">
                          <link role="concept" targetNodeId="1.1083260308424" resolveInfo="EnumConstantReference" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1235133423975">
                          <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235133423976">
                            <link role="concept" targetNodeId="1.1083260308424" resolveInfo="EnumConstantReference" />
                          </node>
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133423977">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235133423978">
                              <link role="variableDeclaration" targetNodeId="1235133293903" resolveInfo="sc" />
                            </node>
                            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133423979">
                              <link role="link" targetNodeId="1.1163670677455" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992700">
                      <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992702">
                        <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133495753">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133495754">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235133495755">
                              <link role="variableDeclaration" targetNodeId="1235133400763" resolveInfo="enumConstant" />
                            </node>
                            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133495756">
                              <link role="link" targetNodeId="1.1083260308426" />
                            </node>
                          </node>
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235133495757">
                            <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133362913">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133360580">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235133360454">
                        <link role="variableDeclaration" targetNodeId="1235133293903" resolveInfo="sc" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133362177">
                        <link role="link" targetNodeId="1.1163670677455" />
                      </node>
                    </node>
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235133365729">
                      <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235133372262">
                        <link role="conceptDeclaration" targetNodeId="1.1083260308424" resolveInfo="EnumConstantReference" />
                      </node>
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235133501352">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133501353">
                      <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991976">
                        <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991978">
                          <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133509825">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235133509074">
                              <link role="variableDeclaration" targetNodeId="1235133293903" resolveInfo="sc" />
                            </node>
                            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133511610">
                              <link role="link" targetNodeId="1.1163670677455" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561670367">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237561671448">
                    <property name="value" value=":" />
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685236727">
                  <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685236728">
                    <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992050">
                      <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992052">
                        <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133541090">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235133539870">
                            <link role="variableDeclaration" targetNodeId="1235133293903" resolveInfo="sc" />
                          </node>
                          <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133543063">
                            <link role="link" targetNodeId="1.1163670683720" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133307684">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133307226" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235133311409">
                  <link role="link" targetNodeId="1.1163670772911" />
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235133293903">
                <property name="name" value="sc" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235133299970">
                  <link role="concept" targetNodeId="1.1163670641947" resolveInfo="SwitchCase" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993073">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993075" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237466021128">
                <property name="value" value="default:" />
                <property name="withIndent" value="true" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685222365">
              <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685222366">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993139">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993141">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133601483">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133601107" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133604831">
                        <link role="link" targetNodeId="1.1163670592366" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237466037661">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561639255" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237466039851">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133645843">
    <link role="conceptDeclaration" targetNodeId="1.1170075670744" resolveInfo="SynchronizedStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133645844">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133645845">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561763783">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561764863" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467671337" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992610">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992613">
            <property name="value" value="synchronized(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992614">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183818962">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183818632" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183819856">
                <link role="link" targetNodeId="1.1170075728144" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992615">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685272038">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685272039">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992288">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992290">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133744490">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133743958" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133750432">
                    <link role="link" targetNodeId="1.1170075736412" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467432650">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561778240" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467434652">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133778848">
    <link role="conceptDeclaration" targetNodeId="1.1163668896201" resolveInfo="TernaryOperatorExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133778849">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133778850">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993159">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993161">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993162">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183839705">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183839283" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183844479">
                <link role="link" targetNodeId="1.1163668914799" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993178">
            <property name="value" value=" ?" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993179" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685288182">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685288183">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467681184" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993326">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993328">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235133828274">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235133827460" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235133834294">
                    <link role="link" targetNodeId="1.1163668922816" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993329">
                <property name="value" value=" :" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993330" />
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467686452" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561858024">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237561858667">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237561858668">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237561858669" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237561858670">
                    <link role="link" targetNodeId="1.1163668934364" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561858671" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467689515">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467691767">
            <property name="value" value=")" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235133911716">
    <link role="conceptDeclaration" targetNodeId="1.1178893518978" resolveInfo="ThisConstructorInvocation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235133911717">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235133911718">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561931908">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561932973" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467712972" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991739">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991742">
            <property name="value" value="this(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991743">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253686228">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253685883" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1241541649707">
                <link role="link" targetNodeId="1.1068499141038" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991744">
            <property name="value" value=");" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235134015467">
    <link role="conceptDeclaration" targetNodeId="1.1070475354124" resolveInfo="ThisExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235134015468">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134015469">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235134021673">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134026401">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134023787">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134023255" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134025682">
                <link role="link" targetNodeId="1.1182955020723" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1235134034313" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134021675">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991785">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991787">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134060419">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134060420">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134060421" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134060422">
                      <link role="link" targetNodeId="1.1182955020723" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235134060423">
                    <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991788">
                <property name="value" value=".this" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235134074273">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134074274">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992689">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992691">
                  <property name="value" value="this" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235134113124">
    <link role="conceptDeclaration" targetNodeId="1.1164991038168" resolveInfo="ThrowStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235134113125">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134113126">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992617">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992619" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237561967915">
            <property name="value" value="throw " />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992620">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134138528">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134138168" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134140251">
                <link role="link" targetNodeId="1.1164991057263" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992621">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235134154741">
    <link role="conceptDeclaration" targetNodeId="1.1164879751025" resolveInfo="TryCatchStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235134154742">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134154743">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561998578">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561999799" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467741901" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993266">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993269">
            <property name="value" value="try {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685310016">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685310017">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992870">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992888">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134195543">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134195214" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134197500">
                    <link role="link" targetNodeId="1.1164879758292" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237562035286">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237562036288" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1235134216337">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134216338">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992305">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992307">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235134267042">
                  <link role="variableDeclaration" targetNodeId="1235134216341" resolveInfo="clause" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992308" />
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134259748">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134259181" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235134261692">
              <link role="link" targetNodeId="1.1164903496223" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235134216341">
            <property name="name" value="clause" />
            <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235134217454">
              <link role="concept" targetNodeId="1.1164903280175" resolveInfo="CatchClause" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467745966">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467747749">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235134292973">
    <link role="conceptDeclaration" targetNodeId="1.1153952380246" resolveInfo="TryStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235134292974">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134292975">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237562079483">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237562080594" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237467816247" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992736">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992739">
            <property name="value" value="try {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685335885">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685335886">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992604">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992606">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134331680">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134331320" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134332856">
                    <link role="link" targetNodeId="1.1153952416686" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237562115021">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237562116101" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1235134351094">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235134351095">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992889">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992891">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235134369950">
                  <link role="variableDeclaration" targetNodeId="1235134351098" resolveInfo="clause" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992892" />
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134360892">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134360153" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235134362554">
              <link role="link" targetNodeId="1.1164903700860" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235134351098">
            <property name="name" value="clause" />
            <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235134352399">
              <link role="concept" targetNodeId="1.1164903280175" resolveInfo="CatchClause" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467768442">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467772053">
            <property name="value" value="} finally {" />
            <property name="withIndent" value="true" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685325585">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685325586">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991774">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991776">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235134397694">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235134397100" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235134399245">
                    <link role="link" targetNodeId="1.1153952429843" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467799993">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237562097472" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467801995">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235148827560">
    <link role="conceptDeclaration" targetNodeId="1.1109279763828" resolveInfo="TypeVariableDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235148827561">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235148827562">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993111">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993113">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235148840675">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235148840049" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235148841773">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235148844946">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235148844947">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993225">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993227">
                <property name="value" value=" extends " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993228">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183890807">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183890415" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183893311">
                    <link role="link" targetNodeId="1.1214996921760" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1235149051221">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149051222">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993392">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993410">
                    <property name="value" value=" &amp; " />
                  </node>
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982293233">
                    <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
                    <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237982293234">
                      <link role="variableDeclaration" targetNodeId="1235149051225" resolveInfo="clsType" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149067786">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149067249" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235149071042">
                  <link role="link" targetNodeId="1.1215091156086" />
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235149051225">
                <property name="name" value="clsType" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235149053791">
                  <link role="concept" targetNodeId="1.1107535904670" resolveInfo="ClassifierType" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149024109">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149016260">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149015743" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235149021623">
                <link role="link" targetNodeId="1.1214996921760" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1235149025894" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149154430">
    <link role="conceptDeclaration" targetNodeId="1.1109283449304" resolveInfo="TypeVariableReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149154431">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149154432">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993018">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463993020">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235568299413">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235568298802" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235568301417">
                <link role="link" targetNodeId="1.1109283546497" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149177249">
    <link role="conceptDeclaration" targetNodeId="1.1171903916106" resolveInfo="UpperBoundType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149177250">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149177251">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993388">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993390">
            <property name="value" value="? extends " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993391">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183905064">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183904641" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183906678">
                <link role="link" targetNodeId="1.1171903916107" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149213342">
    <link role="conceptDeclaration" targetNodeId="1.1219920932475" resolveInfo="VariableArityType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149213343">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149213344">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992235">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992237">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149227802">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149227113" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235149229790">
                <link role="link" targetNodeId="1.1219921048460" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1240940920665">
            <property name="value" value="..." />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149266702">
    <link role="conceptDeclaration" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149266703">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149266704">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237982300767">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982304097">
            <link role="function" targetNodeId="1235584330956" resolveInfo="variableDeclaration" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982304098" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149361338">
    <link role="conceptDeclaration" targetNodeId="1.1177714083117" resolveInfo="VarType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149361339">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149361340">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235149433908">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235149433909">
            <property name="name" value="type" />
            <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235149433910" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235149450012" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149370732">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149375616">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149372470">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149372016" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1235149373771" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235149377198">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235149382528">
                <link role="conceptDeclaration" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149370734">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235149397110">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235149397111">
                <property name="name" value="parent" />
                <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235149397112">
                  <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                </node>
                <node role="initializer" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1239490689021">
                  <link role="concept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration" />
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149415106">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149415107" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1235149415108" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235149456544">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1235149458015">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149493340">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1235149492386">
                    <link role="baseMethodDeclaration" targetNodeId="8.~TypeChecker.getInstance():jetbrains.mps.typesystem.inference.TypeChecker" resolveInfo="getInstance" />
                    <link role="classConcept" targetNodeId="8.~TypeChecker" resolveInfo="TypeChecker" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1235149497045">
                    <link role="baseMethodDeclaration" targetNodeId="8.~TypeChecker.getTypeOf(jetbrains.mps.smodel.SNode):jetbrains.mps.smodel.SNode" resolveInfo="getTypeOf" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149503938">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235149503187">
                        <link role="variableDeclaration" targetNodeId="1235149397111" resolveInfo="parent" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235149506223">
                        <link role="link" targetNodeId="1.1068431790190" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235149456545">
                  <link role="variableDeclaration" targetNodeId="1235149433909" resolveInfo="type" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149512537">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149512538">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992500">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992502">
                <property name="value" value="???" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149515058">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235149514620">
              <link role="variableDeclaration" targetNodeId="1235149433909" resolveInfo="type" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" id="1235149517437" />
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235149524644">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149524645">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993276">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993278">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235149541029">
                    <link role="variableDeclaration" targetNodeId="1235149433909" resolveInfo="type" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149549592">
    <link role="conceptDeclaration" targetNodeId="1.1146644584814" resolveInfo="Visibility" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149549593">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149549594">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149563174">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149568631">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149568036" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235149570682">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235149574387">
                <link role="conceptDeclaration" targetNodeId="1.1146644623116" resolveInfo="PrivateVisibility" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149563176">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992660">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992662">
                <property name="value" value="private " />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149602565">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149602566">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993051">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993053">
                <property name="value" value="protected " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149605929">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149605444" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235149607871">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235149611467">
                <link role="conceptDeclaration" targetNodeId="1.1146644641414" resolveInfo="ProtectedVisibility" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149620316">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149620317">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993279">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993281">
                <property name="value" value="public " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149623164">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149622695" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1235149625028">
              <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1235149627749">
                <link role="conceptDeclaration" targetNodeId="1.1146644602865" resolveInfo="PublicVisibility" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149638269">
    <link role="conceptDeclaration" targetNodeId="1.1068581517677" resolveInfo="VoidType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149638270">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149638271">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991930">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991932">
            <property name="value" value="void" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149653150">
    <link role="conceptDeclaration" targetNodeId="1.1076505808687" resolveInfo="WhileStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149653151">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149653152">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235149664185">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235149670162">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235149671353" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149667236">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149666297" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235149668146">
                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149664187">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991919">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991921" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991922">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149679140">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149678546" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235149680519">
                    <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991923">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237561067723">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561068850" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237561074260" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991962">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991965">
            <property name="value" value="while (" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991966">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183925437">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183925077" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183927222">
                <link role="link" targetNodeId="1.1076505808688" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991967">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685346951">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685346952">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992786">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992788">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235149767603">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235149767164" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235149775453">
                    <link role="link" targetNodeId="1.1154032183016" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237467823609">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237561031845" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237467825267">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235149803040">
    <link role="conceptDeclaration" targetNodeId="1.1171903607971" resolveInfo="WildCardType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235149803041">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235149803042">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991823">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991825">
            <property name="value" value="?" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235567804739">
    <link role="conceptDeclaration" targetNodeId="1.1083260308424" resolveInfo="EnumConstantReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235567804740">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235567804741">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991969">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981903728">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981903729">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981903730" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981903731">
                <link role="link" targetNodeId="1.1144432896254" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991971">
            <property name="value" value="." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463991972">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235567904089">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235567903510" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235567908428">
                <link role="link" targetNodeId="1.1083260308426" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235567952587">
    <link role="conceptDeclaration" targetNodeId="1.1197029447546" resolveInfo="FieldReferenceOperation" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235567952588">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235567952589">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993070">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463993072">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235567973125">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235567972420" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235567974707">
                <link role="link" targetNodeId="1.1197029500499" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235570534877">
    <link role="conceptDeclaration" targetNodeId="1.1224575136086" resolveInfo="EnumValueOfExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235570534878">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235570534879">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992465">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981917796">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981917797">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981917798" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981917799">
                <link role="link" targetNodeId="1.1224575174120" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992467">
            <property name="value" value="." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992468">
            <property name="value" value="valueOf(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992469">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183251574">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183251198" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183253062">
                <link role="link" targetNodeId="1.1224575157853" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992470">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235570593532">
    <link role="conceptDeclaration" targetNodeId="1.1224573963862" resolveInfo="EnumValuesExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235570593533">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235570593534">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992686">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981932863">
            <link role="function" targetNodeId="1234802562412" resolveInfo="classifierName" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981932864">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981932865" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981932866">
                <link role="link" targetNodeId="1.1224573974191" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992688">
            <property name="value" value=".values()" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235587029406">
    <link role="conceptDeclaration" targetNodeId="1.1068581242866" resolveInfo="LocalVariableReference" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235587029407">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235587029408">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992128">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.InfoAppendPart" id="1237463992130">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235587052474">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1238086019218">
                <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference" />
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235587130503" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1238086031781">
                <link role="link" targetNodeId="1.1068581517664" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235588368122">
    <link role="conceptDeclaration" targetNodeId="1.1068580123155" resolveInfo="ExpressionStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235588368123">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235588368124">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558036615">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558038101" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465576913" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992312">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992315">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235588431063">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235588430593" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235588432551">
                <link role="link" targetNodeId="1.1068580123156" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992316">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235590065729">
    <link role="conceptDeclaration" targetNodeId="1.1197027756228" resolveInfo="DotExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235590065730">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235590065731">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992009">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992011">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235590100601">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235590099960" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235590103550">
                <link role="link" targetNodeId="1.1197027771414" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992012">
            <property name="value" value="." />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992013">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183182728">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183182336" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183184575">
                <link role="link" targetNodeId="1.1197027833540" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235739414982">
    <link role="conceptDeclaration" targetNodeId="1.1068580123140" resolveInfo="ConstructorDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235739414983">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235739414984">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1235739460494">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1235739460495">
            <property name="name" value="declaringClass" />
            <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="1235739460496">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
            </node>
            <node role="initializer" type="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" id="1239490689346">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739492496">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235739492497" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" id="1235739492498" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559370173">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237559371581" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981850063">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981850064" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237559395805">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237559395806">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981857363">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981860897">
                <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981860898">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981860899" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981860900">
                    <link role="link" targetNodeId="1.1178549979242" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1237559410520">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237559397435">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237565965442">
                <link role="variableDeclaration" targetNodeId="1235739460495" resolveInfo="declaringClass" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" id="1237559401095">
                <node role="conceptArgument" type="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" id="1237559403035">
                  <link role="conceptDeclaration" targetNodeId="1.1083245097125" resolveInfo="EnumClass" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1237559440267">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237559440268">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237559442737" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.AssertStatement" id="1237559513786">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1237559516930">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1237559517964" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237559515913">
              <link role="variableDeclaration" targetNodeId="1235739460495" resolveInfo="declaringClass" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991826">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991829">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739595233">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1235739592435">
                <link role="variableDeclaration" targetNodeId="1235739460495" resolveInfo="declaringClass" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235739596471">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991830">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991831">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253329647">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253329224" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253332053">
                <link role="link" targetNodeId="1.1068580123134" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991832">
            <property name="value" value=")" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235739684278">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235739684279">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993107">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993109">
                <property name="value" value=" throws " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993110">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253347035">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253346643" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253348524">
                    <link role="link" targetNodeId="1.1164879685961" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739693663">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739691143">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235739690063" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235739692694">
                <link role="link" targetNodeId="1.1164879685961" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235739695417" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559567031">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237559568283">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685024634">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685024635">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237557317973">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237557317974">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992131">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992133">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739814058">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235739813370" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235739815969">
                        <link role="link" targetNodeId="1.1068580123135" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557323291">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557320713">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237557319305" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237557322618">
                    <link role="link" targetNodeId="1.1068580123135" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237557324842" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465322986">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237559561857" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465326285">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235739850731">
    <link role="conceptDeclaration" targetNodeId="1.1082113931046" resolveInfo="ContinueStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235739850732">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235739850733">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992093">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992095" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235739864580">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235739864581">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993184">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465385844">
                <property name="value" value="continue " />
                <property name="withIndent" value="true" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993186">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739927728">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235739927227" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235739929388">
                    <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993187">
                <property name="value" value=";" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235739884620">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235739886170" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235739868507">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235739867413" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235739871496">
                <link role="property" targetNodeId="1.1199470060942" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235739939550">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235739939551">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465361666">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465365965">
                  <property name="value" value="continue;" />
                  <property name="withIndent" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740038236">
    <link role="conceptDeclaration" targetNodeId="1.1184952934362" resolveInfo="DimensionExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740038237">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740038238">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992357">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992359">
            <property name="value" value="[" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992360">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183122746">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183122338" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183125281">
                <link role="link" targetNodeId="1.1184953288404" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992361">
            <property name="value" value="]" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740077306">
    <link role="conceptDeclaration" targetNodeId="1.1095950406618" resolveInfo="DivExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740077307">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740077308">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991942">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991944">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740090360">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740089765" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235740095927">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991960">
            <property name="value" value=" / " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991961">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183143585">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183143146" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183145339">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740133835">
    <link role="conceptDeclaration" targetNodeId="1.1070534513062" resolveInfo="DoubleType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740133836">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740133837">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992137">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992139">
            <property name="value" value="double" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740153717">
    <link role="conceptDeclaration" targetNodeId="1.1177666668936" resolveInfo="DoWhileStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740153718">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740153719">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740162784">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235740167121">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235740168343" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740164569">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740164084" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235740166042">
                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740162786">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993307">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993309" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993310">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740176256">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740175802" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235740177901">
                    <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993311">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557509269">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237557510693" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465413942" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992398">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992401">
            <property name="value" value="do {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685045155">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685045156">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993092">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993094">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740224473">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740224112" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235740225883">
                    <link role="link" targetNodeId="1.1154032183016" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557565649">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237557566183" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557653895">
            <property name="value" value="} while(" />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237557566184">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557566185">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237557566186" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237557566187">
                <link role="link" targetNodeId="1.1177666688034" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557566188">
            <property name="value" value=");" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740434208">
    <link role="conceptDeclaration" targetNodeId="1.1206060495898" resolveInfo="ElsifClause" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740434209">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740434210">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993058">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993060">
            <property name="value" value=" else if (" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993061">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183193188">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183192812" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183195239">
                <link role="link" targetNodeId="1.1206060619838" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463993062">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685057721">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685057722">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993196">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463993198">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740493242">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740492710" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235740496948">
                    <link role="link" targetNodeId="1.1206060644605" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465448591">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237557773025" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465450718">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740524220">
    <link role="conceptDeclaration" targetNodeId="1.1083245097125" resolveInfo="EnumClass" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740524221">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740524222">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237981873433">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981876154">
            <link role="function" targetNodeId="1234799968946" resolveInfo="fileHeader" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981876155" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981881938">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981881939" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981890410">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237981890411">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981890412" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237981890413">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237802048168">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237802048169">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991815">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991817">
                <property name="value" value="static " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1237809284388">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237809284389">
              <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="1237809284390">
                <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237809284391" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1237809284392">
                <link role="baseMethodDeclaration" targetNodeId="2v.~SNode.isRoot():boolean" resolveInfo="isRoot" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992826">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465476128">
            <property name="value" value="enum " />
            <property name="withIndent" value="true" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992828">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1235740623791">
              <link role="baseMethodDeclaration" targetNodeId="5.~JavaNameUtil.shortName(java.lang.String):java.lang.String" resolveInfo="shortName" />
              <link role="classConcept" targetNodeId="5.~JavaNameUtil" resolveInfo="JavaNameUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740626652">
                <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740626183" />
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235740627875">
                  <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1235740635517">
          <property name="value" value="new" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237557836434">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237557836435">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557846558">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557857076">
                <property name="value" value=" extends " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237557857077">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557857078">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237557857079" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237557857080">
                    <link role="link" targetNodeId="1.1165602531693" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557841241">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237557839751">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237557837578" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237557840771">
                <link role="link" targetNodeId="1.1165602531693" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237557842651" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740714404">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740714405">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992982">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992984">
                <property name="value" value=" implements " />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992985">
                <property name="separator" value=", " />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253434880">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253434503" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253436103">
                    <link role="link" targetNodeId="1.1095933932569" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714428">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714429">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740714430" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235740714431">
                <link role="link" targetNodeId="1.1095933932569" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235740714432" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557908555">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557909386">
            <property name="value" value=" {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685075365">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685075366">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992692">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992694">
                <property name="separator" value="," />
                <property name="withSeparator" value="true" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253466738">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253466002" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253468118">
                    <link role="link" targetNodeId="1.1083245396908" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992695">
                <property name="value" value=";" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992696">
                <property name="withSeparator" value="false" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253400893">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253400516" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253403070">
                    <link role="link" targetNodeId="1.1128555889557" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740714456">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740714457">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991781">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463991783" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463991784">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253365201">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253364762" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253366299">
                        <link role="link" targetNodeId="1.1068390468199" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714468">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714469">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740714470" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235740714471">
                    <link role="link" targetNodeId="1.1068390468199" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235740714472" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740714473">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740714474">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463993287">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463993289" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463993290">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253421749">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253421373" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253424255">
                        <link role="link" targetNodeId="1.1068390468201" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714485">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714486">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740714487" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235740714488">
                    <link role="link" targetNodeId="1.1068390468201" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235740714489" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740714490">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740714491">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992907">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992909" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992910">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253413830">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253413438" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253415116">
                        <link role="link" targetNodeId="1.1107880067339" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714502">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714503">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740714504" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235740714505">
                    <link role="link" targetNodeId="1.1107880067339" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235740714506" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740714507">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740714508">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992295">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992297" />
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992298">
                    <property name="withSeparator" value="false" />
                    <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253374652">
                      <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253374260" />
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236253376626">
                        <link role="link" targetNodeId="1.1070462273904" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714519">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740714520">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740714521" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1235740714522">
                    <link role="link" targetNodeId="1.1070462273904" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="1235740714523" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237557925561">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237557926064">
            <property name="value" value="}" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237557926065" />
        </node>
      </node>
    </node>
    <node role="extension" type="jetbrains.mps.lang.textGen.structure.ExtensionDeclaration" id="2341412953773654314">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2341412953773654315">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="2341412953773654316">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="2341412953773654317">
            <property name="value" value="java" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235740896598">
    <link role="conceptDeclaration" targetNodeId="1.1083245299891" resolveInfo="EnumConstantDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235740896599">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740896600">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559715364">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237559716835" />
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235740939775">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740939776">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.FoundErrorOperation" id="1235740961278" />
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465528756">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465532383">
                <property name="value" value="???" />
                <property name="withIndent" value="true" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1235740955211">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235740956808" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235740942014">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235740941544" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235740943799">
                <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
              </node>
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1235740974940">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235740974941">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465553761">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237465555888">
                  <property name="withIndent" value="true" />
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237465560282">
                    <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237465559843" />
                    <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1237465561864">
                      <link role="property" targetNodeId="3v.1169194664001" resolveInfo="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992567">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992570">
            <property name="value" value="(" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="1237463992571">
            <property name="separator" value=", " />
            <property name="withSeparator" value="true" />
            <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236253500152">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236253499792" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="1236882449784">
                <link role="link" targetNodeId="1.1068499141038" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992572">
            <property name="value" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741062707">
    <link role="conceptDeclaration" targetNodeId="1.1068580123152" resolveInfo="EqualsExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741062708">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741062709">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992850">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992852">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741073135">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741072650" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235741074452">
                <link role="link" targetNodeId="1.1081773367580" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992853">
            <property name="value" value=" == " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992854">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183274695">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183274319" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183276371">
                <link role="link" targetNodeId="1.1081773367579" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741237980">
    <link role="conceptDeclaration" targetNodeId="1.1068390468200" resolveInfo="FieldDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741237981">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741237982">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237559735743">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237559737308" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237981943134">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237981943135" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1240305457772">
            <link role="function" targetNodeId="1234800248318" resolveInfo="visibilityWithIndent" />
            <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240305457773">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1240305457774" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1240305457775">
                <link role="link" targetNodeId="1.1178549979242" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1240305463723">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1240305463724">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1240305478724">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1240305492766">
                <property name="value" value="volatile " />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1240305467276">
            <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1240305466875" />
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1240305469783">
              <link role="property" targetNodeId="1.1240249534625" resolveInfo="isVolatile" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1240305392394">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1240305409357">
            <link role="function" targetNodeId="1235584330956" resolveInfo="variableDeclaration" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1240305409358" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1240305415847">
            <property name="value" value=";" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741309022">
    <link role="conceptDeclaration" targetNodeId="1.1111509017652" resolveInfo="FloatingPointConstant" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741309023">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741309024">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235741335073">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1235741346325">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235741347312" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741337578">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741337124" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741339066">
                <link role="property" targetNodeId="1.1113006610751" resolveInfo="value" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741335075">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1235741361611">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741364134">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741362051">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741361612" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741363727">
                    <link role="property" targetNodeId="1.1113006610751" resolveInfo="value" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Property_SetOperation" id="1235741366638">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1235741368078">
                    <property name="value" value="?.?f" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992607">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992609">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741378254">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741377894" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741379555">
                <link role="property" targetNodeId="1.1113006610751" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741389634">
    <link role="conceptDeclaration" targetNodeId="1.1070534436861" resolveInfo="FloatType" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741389635">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741389636">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992449">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992451">
            <property name="value" value="float" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741412435">
    <link role="conceptDeclaration" targetNodeId="1.1144226303539" resolveInfo="ForeachStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741412436">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741412437">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235741421671">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235741428055">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235741430339" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741424331">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741423502" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741426507">
                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741421673">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992014">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992016" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992017">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741438001">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741437625" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741439536">
                    <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992018">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558137199">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558138529" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465618735" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463991664">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991667">
            <property name="value" value="for (" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991668">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183335646">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183335286" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183336775">
                <link role="link" targetNodeId="1.1144230900587" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991669">
            <property name="value" value=" : " />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463991686">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236183342734">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1236183342358" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1236183343831">
                <link role="link" targetNodeId="1.1144226360166" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463991687">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685120028">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685120029">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992527">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992529">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741525248">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741524856" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235741526939">
                    <link role="link" targetNodeId="1.1154032183016" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465639440">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558177938" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465642146">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235741566211">
    <link role="conceptDeclaration" targetNodeId="1.1144231330558" resolveInfo="ForStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235741566212">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741566213">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1235741575245">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1235741579363">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1235741580881" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741577077">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741576498" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741578299">
                <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235741575247">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992503">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237463992505" />
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992506">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235741590527">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235741590151" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="1235741591984">
                    <link role="property" targetNodeId="1.1199465379613" resolveInfo="label" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992507">
                <property name="value" value=":" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558240534">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558241911" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IndentBufferOperation" id="1237465586931" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992101">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237463992104">
            <property name="value" value="for (" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237558271929">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237558271930">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558280897">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237558286446">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558286447">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558286448" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558286449">
                    <link role="link" targetNodeId="1.1144230900587" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558274939">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558273387">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558272980" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558274579">
                <link role="link" targetNodeId="1.1144230900587" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237558277975" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558307373">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558308547">
            <property name="value" value=" ; " />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237558316785">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237558316786">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558368537">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237558386352">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558386353">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558386354" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558386355">
                    <link role="link" targetNodeId="1.1144231399730" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558364423">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558318477">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558318086" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558363266">
                <link role="link" targetNodeId="1.1144231399730" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237558366255" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558391826">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558393281">
            <property name="value" value=" ; " />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1237558409988">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237558409989">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558419035">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237558423333">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558426743">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558425882" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558428325">
                    <link role="link" targetNodeId="1.1144231408325" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558413311">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237558411446">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237558411039" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237558412888">
                <link role="link" targetNodeId="1.1144231408325" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="1237558415346" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237558449874">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237558454829">
            <property name="value" value=") {" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="1236685099322">
          <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236685099323">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992627">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992629">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1235742827285">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1235742826909" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1235742829164">
                    <link role="link" targetNodeId="1.1154032183016" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237465597590">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237558469987" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237465601451">
            <property name="value" value="}" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1235743565312">
    <link role="conceptDeclaration" targetNodeId="1.1068581242863" resolveInfo="LocalVariableDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1235743565313">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1235743565314">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237982078940">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982081646">
            <link role="function" targetNodeId="1234800115760" resolveInfo="annotations" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982081647" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="1237982086258">
            <link role="function" targetNodeId="1235584330956" resolveInfo="variableDeclaration" />
            <node role="parameter" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237982086259" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration" id="1236013739107">
    <property name="package" value="lang" />
    <property name="name" value="StringTextGen" />
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1236013958676">
      <property name="name" value="isBadDoubleQuote" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1236013961336" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236013958678">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236013983077">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1236013999279">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" id="1236014004157">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236014010273">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1236014021398">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236014023542">
                    <property name="charConstant" value="\\" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014011871">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014011792">
                      <link role="variableDeclaration" targetNodeId="1236013974056" resolveInfo="s" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014013531">
                      <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.MinusExpression" id="1236014019300">
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014019366">
                          <property name="value" value="1" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014015736">
                          <link role="variableDeclaration" targetNodeId="1236013975026" resolveInfo="i" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236014007832">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014007674">
                    <link role="variableDeclaration" targetNodeId="1236013975026" resolveInfo="i" />
                  </node>
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014008757">
                    <property name="value" value="0" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236013991587">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236013986753">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013986298">
                  <link role="variableDeclaration" targetNodeId="1236013974056" resolveInfo="s" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236013988053">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013989711">
                    <link role="variableDeclaration" targetNodeId="1236013975026" resolveInfo="i" />
                  </node>
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236013992059">
                <property name="charConstant" value="&quot;" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236013974056">
        <property name="name" value="s" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236014328835" />
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236013975026">
        <property name="name" value="i" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1236013976497" />
      </node>
    </node>
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1236014304502">
      <property name="name" value="replaceNonAsciiSymbolsWithUnicodeSymbols" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236014307380" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014304504">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236014340226">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236014340227">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1236014340228">
              <link role="classifier" targetNodeId="2.~StringBuilder" resolveInfo="StringBuilder" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1236014348948">
              <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1236014348949">
                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1236014353279">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014353280">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236014372096">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014372097">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014392659">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014393036">
                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014392660">
                      <link role="variableDeclaration" targetNodeId="1236014340227" resolveInfo="result" />
                    </node>
                    <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014395712">
                      <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.Object):java.lang.StringBuilder" resolveInfo="append" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014397948">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014397557">
                          <link role="variableDeclaration" targetNodeId="1236014324036" resolveInfo="s" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014399827">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014401891">
                            <link role="variableDeclaration" targetNodeId="1236014353282" resolveInfo="i" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1236014380450">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014381406">
                  <property name="value" value="128" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014374226">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014373803">
                    <link role="variableDeclaration" targetNodeId="1236014324036" resolveInfo="s" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014376042">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014378105">
                      <link role="variableDeclaration" targetNodeId="1236014353282" resolveInfo="i" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1236014405157">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014405158">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014407550">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014416526">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014407926">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014407551">
                          <link role="variableDeclaration" targetNodeId="1236014340227" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014409118">
                          <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236014411869">
                            <property name="value" value="\\u" />
                          </node>
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014418139">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                        <node role="actualArgument" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236014506103">
                          <link role="function" targetNodeId="1236014421687" resolveInfo="paddedHex" />
                          <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014509761">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014509213">
                              <link role="variableDeclaration" targetNodeId="1236014324036" resolveInfo="s" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014510999">
                              <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014512563">
                                <link role="variableDeclaration" targetNodeId="1236014353282" resolveInfo="i" />
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
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236014353282">
            <property name="name" value="i" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1236014354612" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014358754">
              <property name="value" value="0" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1236014362225">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014365276">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014364275">
                <link role="variableDeclaration" targetNodeId="1236014324036" resolveInfo="s" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014366608">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014361193">
              <link role="variableDeclaration" targetNodeId="1236014353282" resolveInfo="i" />
            </node>
          </node>
          <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1236014368625">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014368626">
              <link role="variableDeclaration" targetNodeId="1236014353282" resolveInfo="i" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236014516361">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014519302">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014518910">
              <link role="variableDeclaration" targetNodeId="1236014340227" resolveInfo="result" />
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014522337">
              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236014324036">
        <property name="name" value="s" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236014324037" />
      </node>
    </node>
    <node role="function" type="jetbrains.mps.lang.textGen.structure.UtilityMethodDeclaration" id="1236014421687">
      <property name="name" value="paddedHex" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236014424549" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014421689">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236014437957">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236014437958">
            <property name="name" value="value" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236014437959" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1236014455778">
              <link role="baseMethodDeclaration" targetNodeId="2.~Integer.toString(int,int):java.lang.String" resolveInfo="toString" />
              <link role="classConcept" targetNodeId="2.~Integer" resolveInfo="Integer" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014455779">
                <link role="variableDeclaration" targetNodeId="1236014433706" resolveInfo="c" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014455780">
                <property name="value" value="16" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1236014463172">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1236014471024">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014471996">
              <property name="value" value="4" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014466316">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014465862">
                <link role="variableDeclaration" targetNodeId="1236014437958" resolveInfo="value" />
              </node>
              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014468789">
                <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
              </node>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014463174">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014474716">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236014477186">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1236014483737">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014486271">
                    <link role="variableDeclaration" targetNodeId="1236014437958" resolveInfo="value" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236014479814">
                    <property name="value" value="0" />
                  </node>
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014474717">
                  <link role="variableDeclaration" targetNodeId="1236014437958" resolveInfo="value" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1236014489163">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014491509">
            <link role="variableDeclaration" targetNodeId="1236014437958" resolveInfo="value" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236014433706">
        <property name="name" value="c" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.CharType" id="1236014433707" />
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="1236013746483">
      <property name="name" value="compilableString" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="1236013746484" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236013746485">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236013791614">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236013791615">
            <property name="name" value="result" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="4859441577819744073" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013811123">
              <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="str" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236013814844">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236013814845">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236013906425">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236013906426">
                <property name="name" value="needsEscaping" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1236013906427" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1236013918054">
                  <property name="value" value="false" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1236013924713">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236013924714">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236013947406">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236013947407">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014091202">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236014093657">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1236014095113">
                          <property name="value" value="true" />
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014091203">
                          <link role="variableDeclaration" targetNodeId="1236013906426" resolveInfo="needsEscaping" />
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.BreakStatement" id="1236014098147" />
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236014076422">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236014085526">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236014086857">
                        <property name="charConstant" value="\n" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014079723">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014079253">
                          <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
                        </node>
                        <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014081852">
                          <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014083681">
                            <link role="variableDeclaration" targetNodeId="1236013924716" resolveInfo="i" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236014059735">
                      <node role="leftExpression" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236014037778">
                        <link role="function" targetNodeId="1236013958676" resolveInfo="isBadDoubleQuote" />
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014053342">
                          <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                        </node>
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014056344">
                          <link role="variableDeclaration" targetNodeId="1236013924716" resolveInfo="i" />
                        </node>
                      </node>
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236014071277">
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014066552">
                          <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014065910">
                            <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
                          </node>
                          <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014067900">
                            <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014069573">
                              <link role="variableDeclaration" targetNodeId="1236013924716" resolveInfo="i" />
                            </node>
                          </node>
                        </node>
                        <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236014071639">
                          <property name="charConstant" value="\r" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236013924716">
                <property name="name" value="i" />
                <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1236013926483" />
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236013932064">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1236013936519">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236013938523">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013938381">
                    <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236013940511">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236013935440">
                  <link role="variableDeclaration" targetNodeId="1236013924716" resolveInfo="i" />
                </node>
              </node>
              <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1236013943217">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236013943218">
                  <link role="variableDeclaration" targetNodeId="1236013924716" resolveInfo="i" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236014102743">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014102744">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1236014109560">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236014109561">
                    <property name="name" value="stringBuilder" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1236014109562">
                      <link role="classifier" targetNodeId="2.~StringBuilder" resolveInfo="StringBuilder" />
                    </node>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1236014117659">
                      <node role="creator" type="jetbrains.mps.baseLanguage.structure.ClassCreator" id="1236014117660">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.&lt;init&gt;()" resolveInfo="StringBuilder" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1236014127616">
                  <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014127617">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1236014145887">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014145888">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014159724">
                          <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014160788">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014159725">
                              <link role="variableDeclaration" targetNodeId="1236014109561" resolveInfo="stringBuilder" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014163902">
                              <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236014164590">
                                <property name="value" value="\\\&quot;" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236014149954">
                        <link role="function" targetNodeId="1236013958676" resolveInfo="isBadDoubleQuote" />
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014151986">
                          <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                        </node>
                        <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014154223">
                          <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
                        </node>
                      </node>
                      <node role="elsifClauses" type="jetbrains.mps.baseLanguage.structure.ElsifClause" id="1236014181109">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236014194981">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236014195500">
                            <property name="charConstant" value="\r" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014187241">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014184752">
                              <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014188573">
                              <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014190886">
                                <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statementList" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014181111">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014220049">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014221394">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014220050">
                                <link role="variableDeclaration" targetNodeId="1236014109561" resolveInfo="stringBuilder" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014223149">
                                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236014223931">
                                  <property name="value" value="\\r" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="elsifClauses" type="jetbrains.mps.baseLanguage.structure.ElsifClause" id="1236014229854">
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1236014238942">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236014240008">
                            <property name="charConstant" value="\n" />
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014232264">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014231826">
                              <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
                            </node>
                            <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014233518">
                              <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014235129">
                                <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statementList" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014229856">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014245681">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014246073">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014245682">
                                <link role="variableDeclaration" targetNodeId="1236014109561" resolveInfo="stringBuilder" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014249203">
                                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.CharSequence):java.lang.StringBuilder" resolveInfo="append" />
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1236014250329">
                                  <property name="value" value="\\n" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1236014267033">
                        <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1236014267034">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014269317">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014269725">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014269318">
                                <link role="variableDeclaration" targetNodeId="1236014109561" resolveInfo="stringBuilder" />
                              </node>
                              <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014270963">
                                <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.append(java.lang.Object):java.lang.StringBuilder" resolveInfo="append" />
                                <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014274590">
                                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014274402">
                                    <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                                  </node>
                                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014276955">
                                    <link role="baseMethodDeclaration" targetNodeId="2.~String.charAt(int):char" resolveInfo="charAt" />
                                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014278206">
                                      <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
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
                  <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1236014127619">
                    <property name="name" value="i" />
                    <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1236014129340" />
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236014132482">
                      <property name="value" value="0" />
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression" id="1236014136812">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014138582">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236014138503">
                        <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014140492">
                        <link role="baseMethodDeclaration" targetNodeId="2.~String.length():int" resolveInfo="length" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014134983">
                      <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
                    </node>
                  </node>
                  <node role="iteration" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" id="1236014142604">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014142605">
                      <link role="variableDeclaration" targetNodeId="1236014127619" resolveInfo="i" />
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1236014283646">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1236014285319">
                    <node role="rValue" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236014287604">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014287150">
                        <link role="variableDeclaration" targetNodeId="1236014109561" resolveInfo="stringBuilder" />
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236014289530">
                        <link role="baseMethodDeclaration" targetNodeId="2.~StringBuilder.toString():java.lang.String" resolveInfo="toString" />
                      </node>
                    </node>
                    <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014283647">
                      <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1236014104372">
                <link role="variableDeclaration" targetNodeId="1236013906426" resolveInfo="needsEscaping" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236013890598">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" id="1236013901389">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236013902799">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236013893477">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013893304">
                  <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                </node>
                <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236013895278">
                  <link role="baseMethodDeclaration" targetNodeId="2.~String.indexOf(java.lang.String):int" resolveInfo="indexOf" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236013896935">
                    <property name="charConstant" value="\r" />
                  </node>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1236013875130">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" id="1236013847888">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236013847889">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013847890">
                    <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236013847891">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.indexOf(java.lang.String):int" resolveInfo="indexOf" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236013847892">
                      <property name="charConstant" value="&quot;" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236013849206">
                  <property name="value" value="0" />
                </node>
              </node>
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" id="1236013886750">
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1236013877697">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="1236013877211">
                    <link role="variableDeclaration" targetNodeId="1236013769299" resolveInfo="s" />
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="1236013880810">
                    <link role="baseMethodDeclaration" targetNodeId="2.~String.indexOf(java.lang.String):int" resolveInfo="indexOf" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CharConstant" id="1236013881499">
                      <property name="charConstant" value="\n" />
                    </node>
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1236013888269">
                  <property name="value" value="0" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237463992723">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237463992725">
            <node role="value" type="jetbrains.mps.lang.textGen.structure.UtilityMethodCall" id="1236014548685">
              <link role="function" targetNodeId="1236014304502" resolveInfo="replaceNonAsciiSymbolsWithUnicodeSymbols" />
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1237806121523">
                <link role="variableDeclaration" targetNodeId="1236013791615" resolveInfo="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="1236013769299">
        <property name="name" value="s" />
        <node role="type" type="jetbrains.mps.baseLanguage.structure.StringType" id="1236013769300" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1237807733680">
    <link role="conceptDeclaration" targetNodeId="1.1232461062092" resolveInfo="CommentedStatement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1237807733681">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1237807733682">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237807754606">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237807757233" />
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237807762408">
            <property name="value" value="/*" />
            <property name="withIndent" value="true" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.IncreaseDepthOperation" id="1237807769537" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237807773726">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1237807785150">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1237807787716">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1237807787293" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1237807790220">
                <link role="link" targetNodeId="1.1232461075566" />
              </node>
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="1237807793753" />
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation" id="1237807798021" />
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1237807819164">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1237807822978">
            <property name="value" value="*/" />
            <property name="withIndent" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1239710466732">
    <link role="conceptDeclaration" targetNodeId="1.1239709577448" resolveInfo="PrefixDecrementExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1239710466733">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1239710466734">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1239710517374">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1239710526634">
            <property name="value" value="--" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1239710544193">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1239710548102">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1239710547802" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1239730690421">
                <link role="link" targetNodeId="1.1239714902950" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="1239710558961">
    <link role="conceptDeclaration" targetNodeId="1.1239709250944" resolveInfo="PrefixIncrementExpression" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="1239710558962">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1239710558963">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="1239710626965">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="1239710632598">
            <property name="value" value="++" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="1239710639641">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1239710642368">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="1239710641978" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="1239730694926">
                <link role="link" targetNodeId="1.1239714902950" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="4269842503727610175">
    <link role="conceptDeclaration" targetNodeId="1.4269842503726207156" resolveInfo="LongLiteral" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="4269842503727610176">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="4269842503727610177">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="4269842503727782059">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="4269842503727782061">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="4269842503727782063">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="4269842503727782064" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="4269842503727782065">
                <link role="property" targetNodeId="1.4269842503726207157" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="3409542372145539379">
    <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="3409542372145539380">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3409542372145539381">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3409542372145553412">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3409542372145553413">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3409542372145553432">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3409542372145553960">
                <property name="value" value="/* error: statement w/o textGen:" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="3409542372145553966">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3409542372145553973">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3409542372145553968" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" id="3409542372145553977">
                    <link role="baseMethodDeclaration" targetNodeId="10.1213877396640" resolveInfo="getPresentation" />
                  </node>
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="3409542372145553979">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="3409542372145553981">
                  <property name="value" value=" */" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="3409542372145553425">
            <node role="rightExpression" type="jetbrains.mps.lang.smodel.structure.ConceptRefExpression" id="3409542372145553429">
              <link role="conceptDeclaration" targetNodeId="1.1068580123157" resolveInfo="Statement" />
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3409542372145553417">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="3409542372145553416" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_GetConceptOperation" id="3409542372145553421" />
            </node>
          </node>
          <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="3409542372145553956">
            <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3409542372145553957">
              <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3409542372145553408">
                <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="3409542372145553410" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="8064396509828214712">
    <link role="conceptDeclaration" targetNodeId="1.8064396509828172209" resolveInfo="UnaryMinus" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="8064396509828214713">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="8064396509828214714">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="8064396509828214715">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="8064396509828214717">
            <property name="value" value="-" />
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="8064396509828214719">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="8064396509828214722">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="8064396509828214721" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="358937142749530230">
                <link role="link" targetNodeId="1.1239714902950" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="764900287025024925">
    <link role="conceptDeclaration" targetNodeId="1.5279705229678483897" resolveInfo="FloatingPointFloatConstant" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="764900287025024926">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="764900287025024927">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="764900287025025938">
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="764900287025025939">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="764900287025025940" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="764900287025025941">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="764900287025025942" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="764900287025025943">
                <link role="property" targetNodeId="1.5279705229678483899" resolveInfo="value" />
              </node>
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="764900287025025944">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="764900287025025945">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="764900287025025946">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="764900287025025947">
                  <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="764900287025025948" />
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="764900287025025949">
                    <link role="property" targetNodeId="1.5279705229678483899" resolveInfo="value" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.lang.smodel.structure.Property_SetOperation" id="764900287025025950">
                  <node role="value" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="764900287025025951">
                    <property name="value" value="?.?f" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="764900287025025952">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="764900287025025953">
            <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="764900287025025954">
              <node role="operand" type="jetbrains.mps.lang.textGen.structure.NodeParameter" id="764900287025025955" />
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SPropertyAccess" id="764900287025025956">
                <link role="property" targetNodeId="1.5279705229678483899" resolveInfo="value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.ConceptTextGenDeclaration" id="6227066020986630956">
    <link role="conceptDeclaration" targetNodeId="1.4898614932449915862" resolveInfo="PlaceholderMethodDeclaration" />
    <node role="textGenBlock" type="jetbrains.mps.lang.textGen.structure.GenerateTextDeclaration" id="6227066020986630957">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="6227066020986630958">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="6227066020986645916">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="6227066020986645918" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.lang.textGen.structure.LanguageTextGenDeclaration" id="3408882292339889057">
    <property name="package" value="lang" />
    <property name="name" value="BaseClassConceptTextGen" />
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="3408882292339891837">
      <property name="name" value="body" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="3408882292339891838" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891839">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="3408882292339892015">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="3408882292339892016">
            <property name="name" value="needNewLine" />
            <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="3408882292339892017" />
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339892019">
              <property name="value" value="false" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891842">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891843">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891844">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="3408882292339891845">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891846">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892021">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339891848">
                    <link role="link" targetNodeId="1.1206629658424" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3500903625338922627">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3500903625338922629">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3500903625338922632">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3500903625338922628">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891853">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891854">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892020">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339891856">
                <link role="link" targetNodeId="1.1206629658424" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="3408882292339891857" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891858">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891859">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891860">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="2365107255602283881">
                <link role="function" targetNodeId="2365107255602283838" resolveInfo="collection" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2365107255602283883">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2365107255602283882">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="2365107255602283887">
                    <link role="link" targetNodeId="1.1128555889557" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3408882292339891865">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3408882292339891866">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339891867">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891868">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891869">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891870">
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891872">
                <link role="link" targetNodeId="1.1128555889557" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892022">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891873" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891874">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891875">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891876">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="2365107255602283890">
                <link role="function" targetNodeId="2365107255602283838" resolveInfo="collection" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2365107255602283892">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2365107255602283891">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="2365107255602283896">
                    <link role="link" targetNodeId="1.1068390468199" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3408882292339891883">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3408882292339891884">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339891885">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891886">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891887">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891888">
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891890">
                <link role="link" targetNodeId="1.1068390468199" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892024">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891891" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891892">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891893">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891894">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="2365107255602283874">
                <link role="function" targetNodeId="2365107255602283838" resolveInfo="collection" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="2365107255602283876">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2365107255602283875">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="2365107255602283880">
                    <link role="link" targetNodeId="1.1068390468201" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="4122243921611777340">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="4122243921611777342">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="4122243921611777345">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="4122243921611777341">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891905">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891906">
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891908">
                <link role="link" targetNodeId="1.1068390468201" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892026">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891909" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891910">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891911">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891912">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="3408882292339891915">
                <property name="withSeparator" value="false" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891916">
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891918">
                    <link role="link" targetNodeId="1.1107880067339" />
                  </node>
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892029">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3408882292339891919">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3408882292339891920">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339891921">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891922">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891923">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891924">
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891926">
                <link role="link" targetNodeId="1.1107880067339" />
              </node>
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892028">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891927" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891928">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891929">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891930">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="3408882292339891933">
                <property name="withSeparator" value="false" />
                <node role="list" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891934">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892031">
                    <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                  </node>
                  <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891936">
                    <link role="link" targetNodeId="1.1070462273904" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="4122243921611777332">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="4122243921611777334">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="4122243921611777337">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="4122243921611777333">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891941">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891942">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892030">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891944">
                <link role="link" targetNodeId="1.1070462273904" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891945" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891946">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891947">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891948">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="582575223451927417">
                <link role="function" targetNodeId="8170689402424596661" resolveInfo="newLine" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="582575223451927418">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="582575223451914844">
                <link role="function" targetNodeId="582575223451914811" resolveInfo="innerClassifiers" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="582575223451914845">
                  <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3408882292339891955">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3408882292339891956">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339891957">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891958">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891959">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891960">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892032">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="3408882292339891962">
                <link role="link" targetNodeId="1.1178616825527" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" id="3408882292339891963" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891964">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891965">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891966">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="3408882292339891967">
                <link role="function" targetNodeId="8170689402424596661" resolveInfo="newLine" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891968">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292339891969">
                <property name="withIndent" value="true" />
                <property name="value" value="static {" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="3408882292339891970">
              <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891971">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891972">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="3408882292339891973">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891974">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892035">
                        <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339891976">
                        <link role="link" targetNodeId="1.1171626359898" />
                      </node>
                    </node>
                  </node>
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="3408882292339891977" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891978">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292339891979">
                <property name="value" value="}" />
                <property name="withIndent" value="true" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="3408882292339891980" />
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="3408882292339891981">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="3408882292339891982">
                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="3408882292339891983">
                  <property name="value" value="true" />
                </node>
                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891984">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891985">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339891986">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892034">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339891988">
                <link role="link" targetNodeId="1.1171626359898" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="3408882292339891989" />
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="3408882292339891990">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891991">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891992">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.OperationCall" id="3408882292339891993">
                <link role="function" targetNodeId="8170689402424596661" resolveInfo="newLine" />
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="3408882292339891994">
                  <link role="variableDeclaration" targetNodeId="3408882292339892016" resolveInfo="needNewLine" />
                </node>
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292339891995">
                <property name="value" value="static {" />
                <property name="withIndent" value="true" />
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.WithIndentOperation" id="3408882292339891996">
              <node role="list" type="jetbrains.mps.baseLanguage.structure.StatementList" id="3408882292339891997">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339891998">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="3408882292339891999">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339892000">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339892001">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892037">
                          <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339892003">
                          <link role="link" targetNodeId="1.1221737886778" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339892004">
                        <link role="link" targetNodeId="1.1221737317278" />
                      </node>
                    </node>
                  </node>
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="3408882292339892005" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="3408882292339892006">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.ConstantStringAppendPart" id="3408882292339892007">
                <property name="value" value="}" />
                <property name="withIndent" value="true" />
              </node>
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="3408882292339892008" />
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339892009">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="3408882292339892010">
              <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="3408882292339892036">
                <link role="variableDeclaration" targetNodeId="3408882292339891840" resolveInfo="concept" />
              </node>
              <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkAccess" id="3408882292339892012">
                <link role="link" targetNodeId="1.1221737886778" />
              </node>
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" id="3408882292339892013" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="3408882292339891840">
        <property name="name" value="concept" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="3408882292339891841">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="582575223451914811">
      <property name="name" value="innerClassifiers" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="582575223451914812" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="582575223451914813">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="582575223451914816">
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451914833">
            <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="582575223451914828">
              <link role="variableDeclaration" targetNodeId="582575223451914814" resolveInfo="concept" />
            </node>
            <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="582575223451914839">
              <link role="link" targetNodeId="1.1178616825527" />
            </node>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="582575223451914818">
            <property name="name" value="classifier" />
            <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="582575223451914823">
              <link role="concept" targetNodeId="1.1107461130800" resolveInfo="Classifier" />
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="582575223451914820">
            <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="582575223451914846">
              <node role="part" type="jetbrains.mps.lang.textGen.structure.NodeAppendPart" id="582575223451914848">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="582575223451914850">
                  <link role="variableDeclaration" targetNodeId="582575223451914818" resolveInfo="classifier" />
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="582575223451914852">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="582575223451914853">
                <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="582575223451914907">
                  <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="582575223451914909" />
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="582575223451914896">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451914897">
                  <node role="operand" type="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" id="582575223451914898">
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="582575223451914899">
                      <link role="variableDeclaration" targetNodeId="582575223451914818" resolveInfo="classifier" />
                    </node>
                  </node>
                  <node role="operation" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" id="582575223451914900">
                    <link role="baseMethodDeclaration" targetNodeId="2.~Object.equals(java.lang.Object):boolean" resolveInfo="equals" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451914901">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="582575223451914902">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="582575223451914903">
                          <link role="variableDeclaration" targetNodeId="582575223451914814" resolveInfo="concept" />
                        </node>
                        <node role="operation" type="jetbrains.mps.lang.smodel.structure.SLinkListAccess" id="582575223451914904">
                          <link role="link" targetNodeId="1.1178616825527" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.baseLanguage.collections.structure.GetLastOperation" id="582575223451914905" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="582575223451914814">
        <property name="name" value="concept" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeType" id="582575223451914815">
          <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept" />
        </node>
      </node>
    </node>
    <node role="operation" type="jetbrains.mps.lang.textGen.structure.OperationDeclaration" id="2365107255602283838">
      <property name="name" value="collection" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.structure.VoidType" id="2365107255602283839" />
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="2365107255602283840">
        <node role="statement" type="jetbrains.mps.lang.textGen.structure.AppendOperation" id="2365107255602301567">
          <node role="part" type="jetbrains.mps.lang.textGen.structure.CollectionAppendPart" id="2365107255602301569">
            <node role="list" type="jetbrains.mps.baseLanguage.structure.ParameterReference" id="2365107255602301571">
              <link role="variableDeclaration" targetNodeId="2365107255602283841" resolveInfo="nodes" />
            </node>
          </node>
          <node role="part" type="jetbrains.mps.lang.textGen.structure.NewLineAppendPart" id="2365107255602301573" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" id="2365107255602283841">
        <property name="name" value="nodes" />
        <node role="type" type="jetbrains.mps.lang.smodel.structure.SNodeListType" id="2365107255602283842" />
      </node>
    </node>
  </node>
</model>

