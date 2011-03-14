<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:a0983393-0813-40ae-b2fa-3d40356087e3(jetbrains.mps.stubs.util)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <language namespace="fd392034-7849-419d-9071-12563d152375(jetbrains.mps.baseLanguage.closures)" />
  <language namespace="443f4c36-fcf5-4eb6-9500-8d06ed259e3e(jetbrains.mps.baseLanguage.classifiers)" />
  <language namespace="ef703a71-a5a3-42af-b53c-ddced816ad5c(jetbrains.mps.lang.stubs)" />
  <languageAspect modelUID="r:a0983393-0813-40ae-b2fa-3d40356087e3(jetbrains.mps.stubs.util)" version="-1" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <languageAspect modelUID="r:dfdf3542-dbcf-43df-870a-3c3504b3c840(jetbrains.mps.baseLanguage.collections.custom)" version="-1" />
  <languageAspect modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project(jetbrains.mps.project@java_stub)" version="-1" />
  <maxImportIndex value="24" />
  <import index="10" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(java.io@java_stub)" version="-1" />
  <import index="11" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(java.lang@java_stub)" version="-1" />
  <import index="13" modelUID="f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang.reflect(java.lang.reflect@java_stub)" version="-1" />
  <import index="19" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.vfs(jetbrains.mps.vfs@java_stub)" version="-1" />
  <import index="20" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.reloading(jetbrains.mps.reloading@java_stub)" version="-1" />
  <import index="21" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="22" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.smodel.persistence(jetbrains.mps.smodel.persistence@java_stub)" version="-1" />
  <import index="23" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.stubs(jetbrains.mps.stubs@java_stub)" version="-1" />
  <import index="24" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project.structure.modules(jetbrains.mps.project.structure.modules@java_stub)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="740251325273382988">
    <property name="name:3" value="PathItem" />
    <property name="abstractClass:3" value="true" />
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="740251325273382989">
      <property name="name:3" value="asFile" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273382990">
        <property name="name:3" value="ifile" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273382991">
          <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273382992">
        <link role="classifier:3" targetNodeId="10.~File" resolveInfo="File" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273382993" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273382994">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273382995">
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="740251325273382996">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273382997">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273382998">
                <link role="classConcept:3" targetNodeId="19.~FileSystem" resolveInfo="FileSystem" />
                <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getInstance():jetbrains.mps.vfs.FileSystem" resolveInfo="getInstance" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273382999">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.isPackaged(jetbrains.mps.vfs.IFile):boolean" resolveInfo="isPackaged" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383000">
                  <link role="variableDeclaration:3" targetNodeId="740251325273382990" resolveInfo="ifile" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383001">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383002">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383003">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383004">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~File.&lt;init&gt;(java.lang.String)" resolveInfo="File" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383005">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383006">
                      <link role="variableDeclaration:3" targetNodeId="740251325273382990" resolveInfo="ifile" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383007">
                      <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getAbsolutePath():java.lang.String" resolveInfo="getAbsolutePath" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383008">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383009">
            <property name="name:3" value="os" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383010">
              <link role="classifier:3" targetNodeId="10.~OutputStream" resolveInfo="OutputStream" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383011" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383012">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383013">
            <property name="name:3" value="is" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383014">
              <link role="classifier:3" targetNodeId="10.~InputStream" resolveInfo="InputStream" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383015" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryStatement:3" id="740251325273383016">
          <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="740251325273383017">
            <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383018">
              <property name="name:3" value="ex" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383019">
                <link role="classifier:3" targetNodeId="10.~IOException" resolveInfo="IOException" />
              </node>
            </node>
            <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383020">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="740251325273383021">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383022">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383023">
                    <link role="baseMethodDeclaration:3" targetNodeId="11.~RuntimeException.&lt;init&gt;(java.lang.Throwable)" resolveInfo="RuntimeException" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383024">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383018" resolveInfo="ex" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383025">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383026">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383027">
                <property name="name:3" value="tmpFile" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383028">
                  <link role="classifier:3" targetNodeId="10.~File" resolveInfo="File" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273383029">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~File.createTempFile(java.lang.String,java.lang.String):java.io.File" resolveInfo="createTempFile" />
                  <link role="classConcept:3" targetNodeId="10.~File" resolveInfo="File" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383030">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383031">
                      <link role="variableDeclaration:3" targetNodeId="740251325273382990" resolveInfo="ifile" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383032">
                      <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getName():java.lang.String" resolveInfo="getName" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383033">
                    <property name="value:3" value="tmp" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383034">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383035">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383036">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383027" resolveInfo="tmpFile" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383037">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~File.deleteOnExit():void" resolveInfo="deleteOnExit" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383038">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383039">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383040">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383041">
                    <link role="baseMethodDeclaration:3" targetNodeId="10.~BufferedInputStream.&lt;init&gt;(java.io.InputStream)" resolveInfo="BufferedInputStream" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383042">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383043">
                        <link role="variableDeclaration:3" targetNodeId="740251325273382990" resolveInfo="ifile" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383044">
                        <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.openInputStream():java.io.InputStream" resolveInfo="openInputStream" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383045">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383013" resolveInfo="is" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383046">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383047">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383048">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383049">
                    <link role="baseMethodDeclaration:3" targetNodeId="10.~BufferedOutputStream.&lt;init&gt;(java.io.OutputStream)" resolveInfo="BufferedOutputStream" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383050">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383051">
                        <link role="baseMethodDeclaration:3" targetNodeId="10.~FileOutputStream.&lt;init&gt;(java.io.File)" resolveInfo="FileOutputStream" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383052">
                          <link role="variableDeclaration:3" targetNodeId="740251325273383027" resolveInfo="tmpFile" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383053">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383009" resolveInfo="os" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383054">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383055">
                <property name="name:3" value="c" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="740251325273383056" />
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.WhileStatement:3" id="740251325273383057">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="740251325273383058">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="740251325273383059">
                  <property name="value:3" value="-1" />
                </node>
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="740251325273383060">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383061">
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383062">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383063">
                        <link role="variableDeclaration:3" targetNodeId="740251325273383013" resolveInfo="is" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383064">
                        <link role="baseMethodDeclaration:3" targetNodeId="10.~InputStream.read():int" resolveInfo="read" />
                      </node>
                    </node>
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383065">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383055" resolveInfo="c" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383066">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383067">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383068">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383069">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383009" resolveInfo="os" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383070">
                      <link role="baseMethodDeclaration:3" targetNodeId="10.~OutputStream.write(int):void" resolveInfo="write" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383071">
                        <link role="variableDeclaration:3" targetNodeId="740251325273383055" resolveInfo="c" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383072">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383073">
                <link role="variableDeclaration:3" targetNodeId="740251325273383027" resolveInfo="tmpFile" />
              </node>
            </node>
          </node>
          <node role="finallyBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383074">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="740251325273383075">
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383076">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383077">
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="740251325273383078">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383079" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383080">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383013" resolveInfo="is" />
                    </node>
                  </node>
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383081">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383082">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383083">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383084">
                          <link role="variableDeclaration:3" targetNodeId="740251325273383013" resolveInfo="is" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383085">
                          <link role="baseMethodDeclaration:3" targetNodeId="10.~InputStream.close():void" resolveInfo="close" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="740251325273383086">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383087">
                  <property name="name:3" value="ignore" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383088">
                    <link role="classifier:3" targetNodeId="10.~IOException" resolveInfo="IOException" />
                  </node>
                </node>
                <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383089" />
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="740251325273383090">
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383091">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383092">
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="740251325273383093">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383094" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383095">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383009" resolveInfo="os" />
                    </node>
                  </node>
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383096">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383097">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383098">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383099">
                          <link role="variableDeclaration:3" targetNodeId="740251325273383009" resolveInfo="os" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383100">
                          <link role="baseMethodDeclaration:3" targetNodeId="10.~OutputStream.close():void" resolveInfo="close" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="740251325273383101">
                <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383102">
                  <property name="name:3" value="ignore" />
                  <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383103">
                    <link role="classifier:3" targetNodeId="10.~IOException" resolveInfo="IOException" />
                  </node>
                </node>
                <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383104" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="740251325273383105">
      <property name="name:3" value="EMPTY_LIST" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273383106" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383107">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383108" />
      </node>
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383109">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit:7" id="740251325273383110">
          <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383111" />
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="740251325273383112">
      <property name="name:3" value="file" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273383113" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383114">
        <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383115">
      <property name="name:3" value="subpackages" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383116">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383117" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383118" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383119">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383120">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383121">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383122">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="740251325273383123">
                <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                <link role="variableDeclaration:3" targetNodeId="740251325273383105" resolveInfo="EMPTY_LIST" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="740251325273383124">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383125">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383126">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383127">
                  <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383128" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383129">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.exists():boolean" resolveInfo="exists" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383130">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383131">
            <property name="name:3" value="fld" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="988445697422238759">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383133">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383134" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383135">
                <link role="baseMethodDeclaration:3" targetNodeId="740251325273383324" resolveInfo="packageToFile" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383136">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383116" resolveInfo="pkg" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383137">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383138">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383139">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="740251325273383140">
                <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                <link role="variableDeclaration:3" targetNodeId="740251325273383105" resolveInfo="EMPTY_LIST" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383141">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383142" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383143">
              <link role="variableDeclaration:3" targetNodeId="740251325273383131" resolveInfo="fld" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383144">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383145">
            <property name="name:3" value="lst" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383146">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383147">
                <link role="variableDeclaration:3" targetNodeId="740251325273383131" resolveInfo="fld" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383148">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.list():java.util.List" resolveInfo="list" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383149">
              <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383150">
                <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383151">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383152">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383153">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383154">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383155">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383145" resolveInfo="lst" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.WhereOperation:7" id="740251325273383156">
                  <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="740251325273383157">
                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383158">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383159">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383160">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383161">
                            <link role="variableDeclaration:3" targetNodeId="740251325273383163" resolveInfo="f" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383162">
                            <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.isDirectory():boolean" resolveInfo="isDirectory" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="740251325273383163">
                      <property name="name:7" value="f" />
                      <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="740251325273383164" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.SelectOperation:7" id="740251325273383165">
                <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="740251325273383166">
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383167">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383168">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383169">
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383170">
                          <link role="baseMethodDeclaration:3" targetNodeId="740251325273383399" resolveInfo="compose" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383171">
                            <link role="variableDeclaration:3" targetNodeId="740251325273383116" resolveInfo="pkg" />
                          </node>
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383172">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383173">
                              <link role="variableDeclaration:3" targetNodeId="740251325273383176" resolveInfo="dir" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383174">
                              <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getName():java.lang.String" resolveInfo="getName" />
                            </node>
                          </node>
                        </node>
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383175" />
                      </node>
                    </node>
                  </node>
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="740251325273383176">
                    <property name="name:7" value="dir" />
                    <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="740251325273383177" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.ToListOperation:7" id="740251325273383178" />
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383179">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383180" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383181">
      <property name="name:3" value="resources" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383182" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383183">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383184">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383185">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383186">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="740251325273383187">
                <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                <link role="variableDeclaration:3" targetNodeId="740251325273383105" resolveInfo="EMPTY_LIST" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="740251325273383188">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383189">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383190">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383191">
                  <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383192" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383193">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.exists():boolean" resolveInfo="exists" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383194">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383195">
            <property name="name:3" value="fld" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383196">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383197">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383198" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383199">
                <link role="baseMethodDeclaration:3" targetNodeId="740251325273383324" resolveInfo="packageToFile" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383200">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383236" resolveInfo="pkg" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383201">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383202">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383203">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="740251325273383204">
                <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                <link role="variableDeclaration:3" targetNodeId="740251325273383105" resolveInfo="EMPTY_LIST" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383205">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383206" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383207">
              <link role="variableDeclaration:3" targetNodeId="740251325273383195" resolveInfo="fld" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383208">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383209">
            <property name="name:3" value="lst" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383210">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383211">
                <link role="variableDeclaration:3" targetNodeId="740251325273383195" resolveInfo="fld" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383212">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.list(jetbrains.mps.vfs.IFileNameFilter):java.util.List" resolveInfo="list" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383213">
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3919891163767927585">
                    <link role="baseMethodDeclaration:3" targetNodeId="3919891163767927581" resolveInfo="filter" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3919891163767927612">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383236" resolveInfo="pkg" />
                    </node>
                  </node>
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383215" />
                </node>
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383216">
              <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383217">
                <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383218">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383219">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383220">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383221">
                <link role="variableDeclaration:3" targetNodeId="740251325273383209" resolveInfo="lst" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.SelectOperation:7" id="740251325273383222">
                <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="740251325273383223">
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383224">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383225">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="740251325273383226">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383227">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383228">
                            <link role="variableDeclaration:3" targetNodeId="740251325273383231" resolveInfo="f" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383229">
                            <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getName():java.lang.String" resolveInfo="getName" />
                          </node>
                        </node>
                        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383230" />
                      </node>
                    </node>
                  </node>
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="740251325273383231">
                    <property name="name:7" value="f" />
                    <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="740251325273383232" />
                  </node>
                </node>
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.ToListOperation:7" id="740251325273383233" />
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383234">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383235" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383236">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383237" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383238">
      <property name="name:3" value="openResource" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383239">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383240" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383241">
        <property name="name:3" value="resName" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383242" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383243">
        <link role="classifier:3" targetNodeId="10.~InputStream" resolveInfo="InputStream" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383244" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383245">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383246">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383247">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="740251325273383248">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383249">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383250">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~IOException.&lt;init&gt;()" resolveInfo="IOException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="740251325273383251">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383252">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383253">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383254">
                  <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383255" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383256">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.exists():boolean" resolveInfo="exists" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383257">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383258">
            <property name="name:3" value="fld" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383259">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383260">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383261" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383262">
                <link role="baseMethodDeclaration:3" targetNodeId="740251325273383324" resolveInfo="packageToFile" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383263">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383239" resolveInfo="pkg" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383264">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383265">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="740251325273383266">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383267">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383268">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~IOException.&lt;init&gt;()" resolveInfo="IOException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383269">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383270" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383271">
              <link role="variableDeclaration:3" targetNodeId="740251325273383258" resolveInfo="fld" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383272">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383273">
            <property name="name:3" value="lst" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383274">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383275">
                <link role="variableDeclaration:3" targetNodeId="740251325273383258" resolveInfo="fld" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383276">
                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.list():java.util.List" resolveInfo="list" />
              </node>
            </node>
            <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383277">
              <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383278">
                <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383279">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383280">
            <property name="name:3" value="file" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383281">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383282">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383283">
                <link role="variableDeclaration:3" targetNodeId="740251325273383273" resolveInfo="lst" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation:7" id="740251325273383284">
                <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="740251325273383285">
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383286">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383287">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="740251325273383288">
                        <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotExpression:3" id="740251325273383289">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383290">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383291">
                              <link role="variableDeclaration:3" targetNodeId="740251325273383299" resolveInfo="f" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383292">
                              <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.isDirectory():boolean" resolveInfo="isDirectory" />
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383293">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383294">
                            <link role="variableDeclaration:3" targetNodeId="740251325273383241" resolveInfo="resName" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383295">
                            <link role="baseMethodDeclaration:3" targetNodeId="11.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383296">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383297">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383299" resolveInfo="f" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383298">
                                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getName():java.lang.String" resolveInfo="getName" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="740251325273383299">
                    <property name="name:7" value="f" />
                    <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="740251325273383300" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383301">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383302">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="740251325273383303">
              <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273383304">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273383305">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~IOException.&lt;init&gt;()" resolveInfo="IOException" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383306">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383307" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383308">
              <link role="variableDeclaration:3" targetNodeId="740251325273383280" resolveInfo="file" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383309">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383310">
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383311">
              <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.openInputStream():java.io.InputStream" resolveInfo="openInputStream" />
            </node>
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383312">
              <link role="variableDeclaration:3" targetNodeId="740251325273383280" resolveInfo="file" />
            </node>
          </node>
        </node>
      </node>
      <node role="throwsItem:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383313">
        <link role="classifier:3" targetNodeId="10.~IOException" resolveInfo="IOException" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="3919891163767927502">
      <property name="name:3" value="accepResource" />
      <property name="isAbstract:3" value="true" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="3919891163767927506" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3919891163767927504" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.ProtectedVisibility:3" id="3919891163767927505" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3919891163767927507">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="3919891163767927508" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3919891163767927509">
        <property name="name:3" value="res" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="3919891163767927511" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383318">
      <property name="name:3" value="baseName" />
      <property name="isAbstract:3" value="true" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383319">
        <property name="name:3" value="res" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383320" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383321" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383322" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383323" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383324">
      <property name="name:3" value="packageToFile" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273383325" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383326">
        <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383327">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383328" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383329">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383330">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383331">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383332">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383333">
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383334">
                  <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
                </node>
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383335" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383336">
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383337">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383338">
                <link role="variableDeclaration:3" targetNodeId="740251325273383327" resolveInfo="pkg" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383339">
                <link role="baseMethodDeclaration:3" targetNodeId="11.~String.length():int" resolveInfo="length" />
              </node>
            </node>
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="740251325273383340">
              <property name="value:3" value="0" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383341">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383342">
            <property name="name:3" value="fld" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383343">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383344">
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383345">
                <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
              </node>
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383346" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="740251325273383347">
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383348">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383349">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383350">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ContinueStatement:3" id="740251325273383351" />
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383352">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383353">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383354">
                    <link role="variableDeclaration:3" targetNodeId="740251325273383391" resolveInfo="p" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383355">
                    <link role="baseMethodDeclaration:3" targetNodeId="11.~String.length():int" resolveInfo="length" />
                  </node>
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="740251325273383356">
                  <property name="value:3" value="0" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383357">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383358">
                <property name="name:3" value="lst" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383359">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383360">
                    <link role="variableDeclaration:3" targetNodeId="740251325273383342" resolveInfo="fld" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383361">
                    <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.list():java.util.List" resolveInfo="list" />
                  </node>
                </node>
                <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="740251325273383362">
                  <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383363">
                    <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383364">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383365">
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383366">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383342" resolveInfo="fld" />
                </node>
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383367">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383368">
                    <link role="variableDeclaration:3" targetNodeId="740251325273383358" resolveInfo="lst" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation:7" id="740251325273383369">
                    <node role="closure:7" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="740251325273383370">
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383371">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383372">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="740251325273383373">
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383374">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383375">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383383" resolveInfo="f" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383376">
                                <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.isDirectory():boolean" resolveInfo="isDirectory" />
                              </node>
                            </node>
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383377">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383378">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383391" resolveInfo="p" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383379">
                                <link role="baseMethodDeclaration:3" targetNodeId="11.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383380">
                                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383381">
                                    <link role="variableDeclaration:3" targetNodeId="740251325273383383" resolveInfo="f" />
                                  </node>
                                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383382">
                                    <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getName():java.lang.String" resolveInfo="getName" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="parameter:3" type="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration:7" id="740251325273383383">
                        <property name="name:7" value="f" />
                        <node role="type:7" type="jetbrains.mps.baseLanguage.structure.UndefinedType:3" id="740251325273383384" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383385">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383386">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.BreakStatement:3" id="740251325273383387" />
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383388">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383389" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383390">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383342" resolveInfo="fld" />
                </node>
              </node>
            </node>
          </node>
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383391">
            <property name="name:3" value="p" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383392" />
          </node>
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383393">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383394">
              <link role="variableDeclaration:3" targetNodeId="740251325273383327" resolveInfo="pkg" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383395">
              <link role="baseMethodDeclaration:3" targetNodeId="11.~String.split(java.lang.String):java.lang.String[]" resolveInfo="split" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383396">
                <property name="value:3" value="\\." />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273383397">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383398">
            <link role="variableDeclaration:3" targetNodeId="740251325273383342" resolveInfo="fld" />
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383399">
      <property name="name:3" value="compose" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273383400" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383401">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383402">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="740251325273383403">
            <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273383404">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383405">
                <link role="variableDeclaration:3" targetNodeId="740251325273383418" resolveInfo="name" />
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273383406">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383407">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383416" resolveInfo="pkg" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383408">
                  <property name="value:3" value="." />
                </node>
              </node>
            </node>
            <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383409">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="740251325273383410">
                <property name="value:3" value="0" />
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383411">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383412">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383416" resolveInfo="pkg" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383413">
                  <link role="baseMethodDeclaration:3" targetNodeId="11.~String.length():int" resolveInfo="length" />
                </node>
              </node>
            </node>
            <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383414">
              <link role="variableDeclaration:3" targetNodeId="740251325273383418" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383415" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383416">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383417" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383418">
        <property name="name:3" value="name" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383419" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273383420">
      <property name="name:3" value="isJar" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383421" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383422">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383423">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.OrExpression:3" id="740251325273383424">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383425">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383426">
                <link role="variableDeclaration:3" targetNodeId="740251325273383434" resolveInfo="path" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383427">
                <link role="baseMethodDeclaration:3" targetNodeId="11.~String.endsWith(java.lang.String):boolean" resolveInfo="endsWith" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383428">
                  <property name="value:3" value=".JAR" />
                </node>
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383429">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383430">
                <link role="variableDeclaration:3" targetNodeId="740251325273383434" resolveInfo="path" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383431">
                <link role="baseMethodDeclaration:3" targetNodeId="11.~String.endsWith(java.lang.String):boolean" resolveInfo="endsWith" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383432">
                  <property name="value:3" value=".jar" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.BooleanType:3" id="740251325273383433" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383434">
        <property name="name:3" value="path" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383435" />
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383436" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="740251325273383437">
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273383438">
        <property name="name:3" value="path" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383439" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="740251325273383440" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383441" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383442">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383443">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383444">
            <property name="name:3" value="container" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383445">
              <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383446" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="740251325273383447">
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383448">
            <property name="name:3" value="p" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383449" />
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383450">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273383451">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383452">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383453">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383454">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383455">
                      <link role="variableDeclaration:3" targetNodeId="740251325273383444" resolveInfo="container" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383456">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273383457">
                        <link role="classConcept:3" targetNodeId="19.~FileSystem" resolveInfo="FileSystem" />
                        <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getInstance():jetbrains.mps.vfs.FileSystem" resolveInfo="getInstance" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383458">
                        <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getFileByPath(java.lang.String):jetbrains.mps.vfs.IFile" resolveInfo="getFileByPath" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression:3" id="740251325273383459">
                          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273383460">
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383461">
                              <property name="value:3" value="!/" />
                            </node>
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383462">
                              <link role="variableDeclaration:3" targetNodeId="740251325273383448" resolveInfo="p" />
                            </node>
                          </node>
                          <node role="ifFalse:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383463">
                            <link role="variableDeclaration:3" targetNodeId="740251325273383448" resolveInfo="p" />
                          </node>
                          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383464">
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383465">
                              <link role="baseMethodDeclaration:3" targetNodeId="740251325273383420" resolveInfo="isJar" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383466">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383448" resolveInfo="p" />
                              </node>
                            </node>
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383467" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273383468">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383469" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383470">
                  <link role="variableDeclaration:3" targetNodeId="740251325273383444" resolveInfo="container" />
                </node>
              </node>
              <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="740251325273383471">
                <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383472">
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273383473">
                    <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273383474">
                      <property name="name:3" value="cf" />
                      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383475">
                        <link role="classifier:3" targetNodeId="10.~File" resolveInfo="File" />
                      </node>
                      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticMethodCall:3" id="740251325273383476">
                        <link role="baseMethodDeclaration:3" targetNodeId="740251325273382989" resolveInfo="asFile" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383477">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273383478">
                            <link role="classConcept:3" targetNodeId="19.~FileSystem" resolveInfo="FileSystem" />
                            <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getInstance():jetbrains.mps.vfs.FileSystem" resolveInfo="getInstance" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383479">
                            <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getFileByPath(java.lang.String):jetbrains.mps.vfs.IFile" resolveInfo="getFileByPath" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273383480">
                              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383481">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383448" resolveInfo="p" />
                              </node>
                              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383482">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383483">
                                  <link role="variableDeclaration:3" targetNodeId="740251325273383444" resolveInfo="container" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383484">
                                  <link role="baseMethodDeclaration:3" targetNodeId="19.~IFile.getAbsolutePath():java.lang.String" resolveInfo="getAbsolutePath" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SingleLineComment:3" id="740251325273383485">
                    <node role="commentPart:3" type="jetbrains.mps.baseLanguage.structure.TextCommentPart:3" id="740251325273383486">
                      <property name="text:3" value="'!' would have been added by JarFileEntryFile" />
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383487">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383488">
                      <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383489">
                        <link role="variableDeclaration:3" targetNodeId="740251325273383444" resolveInfo="container" />
                      </node>
                      <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383490">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273383491">
                          <link role="classConcept:3" targetNodeId="19.~FileSystem" resolveInfo="FileSystem" />
                          <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getInstance():jetbrains.mps.vfs.FileSystem" resolveInfo="getInstance" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383492">
                          <link role="baseMethodDeclaration:3" targetNodeId="19.~FileSystem.getFileByPath(java.lang.String):jetbrains.mps.vfs.IFile" resolveInfo="getFileByPath" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273383493">
                            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383494">
                              <property name="value:3" value="!/" />
                            </node>
                            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383495">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383496">
                                <link role="variableDeclaration:3" targetNodeId="740251325273383474" resolveInfo="cf" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383497">
                                <link role="baseMethodDeclaration:3" targetNodeId="10.~File.getPath():java.lang.String" resolveInfo="getPath" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SingleLineComment:3" id="740251325273383498">
                    <node role="commentPart:3" type="jetbrains.mps.baseLanguage.structure.TextCommentPart:3" id="740251325273383499">
                      <property name="text:3" value="can't simply pass a file, must be a path with a '!' at the end" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383500">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273383501">
              <link role="variableDeclaration:3" targetNodeId="740251325273383438" resolveInfo="path" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273383502">
              <link role="baseMethodDeclaration:3" targetNodeId="11.~String.split(java.lang.String):java.lang.String[]" resolveInfo="split" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273383503">
                <property name="value:3" value="!" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273383504">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273383505">
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273383506">
              <link role="variableDeclaration:3" targetNodeId="740251325273383444" resolveInfo="container" />
            </node>
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273383507">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273383508" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273383509">
                <link role="fieldDeclaration:3" targetNodeId="740251325273383112" resolveInfo="file" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="3919891163767927581">
      <property name="name:3" value="filter" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3919891163767927606">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="3919891163767927608" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3919891163767927582">
        <link role="classifier:3" targetNodeId="19.~IFileNameFilter" resolveInfo="IFileNameFilter" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="3919891163767927583" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3919891163767927584">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3919891163767927590">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral:3" id="3919891163767927591">
            <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3919891163767927592">
              <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3919891163767927599">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="3919891163767927600">
                  <link role="baseMethodDeclaration:3" targetNodeId="3919891163767927502" resolveInfo="accepResource" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3919891163767927609">
                    <link role="variableDeclaration:3" targetNodeId="3919891163767927606" resolveInfo="pkg" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3919891163767927611">
                    <link role="variableDeclaration:3" targetNodeId="3919891163767927596" resolveInfo="name" />
                  </node>
                </node>
              </node>
            </node>
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3919891163767927593">
              <property name="name:3" value="parent" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3919891163767927595">
                <link role="classifier:3" targetNodeId="19.~IFile" resolveInfo="IFile" />
              </node>
            </node>
            <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3919891163767927596">
              <property name="name:3" value="name" />
              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="3919891163767927598" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="2" modelUID="r:dfdf3542-dbcf-43df-870a-3c3504b3c840(jetbrains.mps.baseLanguage.collections.custom)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="740251325273383510">
    <property name="name:3" value="PathItemsReloadableCache" />
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="740251325273389489">
      <property name="name:3" value="cache" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273389490" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.MapType:7" id="740251325273389495">
        <node role="keyType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273389496" />
        <node role="valueType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273389497">
          <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
        </node>
      </node>
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273389499" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273389475">
      <property name="name:3" value="getPathItem" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273389480">
        <property name="name:3" value="path" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273394413" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273389477" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273389478">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SynchronizedStatement:3" id="740251325273394302">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394305" />
          <node role="block:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394304">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273394307">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394308">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394309">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394310">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273394311">
                      <link role="classConcept:3" targetNodeId="20.~ClassLoaderManager" resolveInfo="ClassLoaderManager" />
                      <link role="baseMethodDeclaration:3" targetNodeId="20.~ClassLoaderManager.getInstance():jetbrains.mps.reloading.ClassLoaderManager" resolveInfo="getInstance" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273394312">
                      <link role="baseMethodDeclaration:3" targetNodeId="20.~ClassLoaderManager.addReloadHandler(jetbrains.mps.reloading.ReloadListener):void" resolveInfo="addReloadHandler" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273394313">
                        <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="740251325273394314">
                          <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="740251325273394315">
                            <link role="classifier:3" targetNodeId="20.~ReloadAdapter" resolveInfo="ReloadAdapter" />
                            <link role="baseMethodDeclaration:3" targetNodeId="20.~ReloadAdapter.&lt;init&gt;()" resolveInfo="ReloadAdapter" />
                            <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273394316" />
                            <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273394317">
                              <property name="name:3" value="onReload" />
                              <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273394318" />
                              <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="740251325273394319" />
                              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394320">
                                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SynchronizedStatement:3" id="740251325273394321">
                                  <node role="block:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394322">
                                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394323">
                                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394324">
                                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394385">
                                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394380">
                                            <link role="classConcept:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
                                          </node>
                                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273394389">
                                            <link role="fieldDeclaration:3" targetNodeId="740251325273389489" resolveInfo="cache" />
                                          </node>
                                        </node>
                                        <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.MapClearOperation:7" id="740251325273394326" />
                                      </node>
                                    </node>
                                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394327">
                                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394328">
                                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273394329" />
                                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394392">
                                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394391">
                                            <link role="classConcept:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
                                          </node>
                                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273394396">
                                            <link role="fieldDeclaration:3" targetNodeId="740251325273389489" resolveInfo="cache" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394378">
                                    <link role="classConcept:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
                                  </node>
                                </node>
                                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394332">
                                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394333">
                                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273394334">
                                      <link role="classConcept:3" targetNodeId="20.~ClassLoaderManager" resolveInfo="ClassLoaderManager" />
                                      <link role="baseMethodDeclaration:3" targetNodeId="20.~ClassLoaderManager.getInstance():jetbrains.mps.reloading.ClassLoaderManager" resolveInfo="getInstance" />
                                    </node>
                                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273394335">
                                      <link role="baseMethodDeclaration:3" targetNodeId="20.~ClassLoaderManager.removeReloadHandler(jetbrains.mps.reloading.ReloadListener):void" resolveInfo="removeReloadHandler" />
                                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394336" />
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
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394398">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394405">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394400">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394399" />
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273394404">
                        <link role="fieldDeclaration:3" targetNodeId="740251325273389489" resolveInfo="cache" />
                      </node>
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273394408">
                      <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.HashMapCreator:7" id="740251325273394409">
                        <node role="keyType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273394410" />
                        <node role="valueType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394411">
                          <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273394344">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273394345" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273394376">
                  <link role="variableDeclaration:3" targetNodeId="740251325273389489" resolveInfo="cache" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273394349">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273394350">
                <property name="name:3" value="pi" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394351">
                  <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.collections.structure.MapElement:7" id="740251325273394352">
                  <node role="key:7" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394414">
                    <link role="variableDeclaration:3" targetNodeId="740251325273389480" resolveInfo="path" />
                  </node>
                  <node role="map:7" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273394412">
                    <link role="variableDeclaration:3" targetNodeId="740251325273389489" resolveInfo="cache" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273394356">
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394357">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.TryCatchStatement:3" id="740251325273394536">
                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394537">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394543">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394703">
                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394706">
                          <link role="variableDeclaration:3" targetNodeId="740251325273394350" resolveInfo="pi" />
                        </node>
                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394545">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394713">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273394544">
                              <link role="variableDeclaration:3" targetNodeId="740251325273394510" resolveInfo="pathItemClass" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273394717">
                              <link role="baseMethodDeclaration:3" targetNodeId="11.~Class.getDeclaredConstructor(java.lang.Class...):java.lang.reflect.Constructor" resolveInfo="getDeclaredConstructor" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression:3" id="740251325273394720">
                                <link role="classifier:3" targetNodeId="11.~String" resolveInfo="String" />
                              </node>
                            </node>
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273394689">
                            <link role="baseMethodDeclaration:3" targetNodeId="13.~Constructor.newInstance(java.lang.Object...):java.lang.Object" resolveInfo="newInstance" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394691">
                              <link role="variableDeclaration:3" targetNodeId="740251325273389480" resolveInfo="path" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="catchClause:3" type="jetbrains.mps.baseLanguage.structure.CatchClause:3" id="740251325273394539">
                    <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273394540">
                      <property name="name:3" value="checked" />
                      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394721">
                        <link role="classifier:3" targetNodeId="11.~Exception" resolveInfo="Exception" />
                      </node>
                    </node>
                    <node role="catchBody:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394542">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ThrowStatement:3" id="740251325273403328">
                        <node role="throwable:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273403330">
                          <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273405198">
                            <link role="baseMethodDeclaration:3" targetNodeId="11.~NullPointerException.&lt;init&gt;(java.lang.String)" resolveInfo="NullPointerException" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273405202">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273405201">
                                <link role="variableDeclaration:3" targetNodeId="740251325273394540" resolveInfo="checked" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273405206">
                                <link role="baseMethodDeclaration:3" targetNodeId="11.~Throwable.getMessage():java.lang.String" resolveInfo="getMessage" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394364">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394365">
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394366">
                      <link role="variableDeclaration:3" targetNodeId="740251325273394350" resolveInfo="pi" />
                    </node>
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.collections.structure.MapElement:7" id="740251325273394367">
                      <node role="key:7" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394368">
                        <link role="variableDeclaration:3" targetNodeId="740251325273389480" resolveInfo="path" />
                      </node>
                      <node role="map:7" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="740251325273394373">
                        <link role="variableDeclaration:3" targetNodeId="740251325273383585" resolveInfo="Cache" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273394370">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273394371" />
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394372">
                  <link role="variableDeclaration:3" targetNodeId="740251325273394350" resolveInfo="pi" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273394374">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394375">
                <link role="variableDeclaration:3" targetNodeId="740251325273394350" resolveInfo="pi" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273389479">
        <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="740251325273389482">
      <property name="name:3" value="getInstance" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273389484" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273389485">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273394449">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273394450">
            <property name="name:3" value="inst" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394451">
              <link role="classifier:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.collections.structure.MapElement:7" id="740251325273394452">
              <node role="key:7" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394496">
                <link role="variableDeclaration:3" targetNodeId="740251325273394492" resolveInfo="cls" />
              </node>
              <node role="map:7" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="740251325273394454">
                <link role="variableDeclaration:3" targetNodeId="740251325273394416" resolveInfo="Instances" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273394456">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394457">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SynchronizedStatement:3" id="740251325273394465">
              <node role="block:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394467">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394472">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394474">
                    <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394473">
                      <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
                    </node>
                    <node role="rValue:3" type="jetbrains.mps.baseLanguage.collections.structure.MapElement:7" id="740251325273394478">
                      <node role="key:7" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394497">
                        <link role="variableDeclaration:3" targetNodeId="740251325273394492" resolveInfo="cls" />
                      </node>
                      <node role="map:7" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="740251325273394477">
                        <link role="variableDeclaration:3" targetNodeId="740251325273394416" resolveInfo="Instances" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273394483">
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273394484">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394498">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394500">
                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273394503">
                          <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273394504">
                            <link role="baseMethodDeclaration:3" targetNodeId="740251325273383592" resolveInfo="PathItemsReloadableCache" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394520">
                              <link role="variableDeclaration:3" targetNodeId="740251325273394492" resolveInfo="cls" />
                            </node>
                          </node>
                        </node>
                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394499">
                          <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394522">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394528">
                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394531">
                          <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
                        </node>
                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.collections.structure.MapElement:7" id="740251325273394524">
                          <node role="map:7" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="740251325273394523">
                            <link role="variableDeclaration:3" targetNodeId="740251325273394416" resolveInfo="Instances" />
                          </node>
                          <node role="key:7" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394527">
                            <link role="variableDeclaration:3" targetNodeId="740251325273394492" resolveInfo="cls" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273394488">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273394491" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394487">
                      <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference:3" id="740251325273394471">
                <link role="variableDeclaration:3" targetNodeId="740251325273394416" resolveInfo="Instances" />
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.EqualsExpression:3" id="740251325273394461">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273394464" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394460">
              <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394533">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273394534">
            <link role="variableDeclaration:3" targetNodeId="740251325273394450" resolveInfo="inst" />
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273389486">
        <link role="classifier:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273394492">
        <property name="name:3" value="cls" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394493">
          <link role="classifier:3" targetNodeId="11.~Class" resolveInfo="Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="740251325273405208">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273405210">
              <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="740251325273383585">
      <property name="name:3" value="Cache" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273383586" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.MapType:7" id="740251325273383587">
        <node role="keyType:7" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273383588" />
        <node role="valueType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273383589">
          <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
        </node>
      </node>
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273383590" />
    </node>
    <node role="staticField:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration:3" id="740251325273394416">
      <property name="name:3" value="Instances" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273394417" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.MapType:7" id="740251325273394419">
        <node role="valueType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394427">
          <link role="classifier:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
        </node>
        <node role="keyType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394426">
          <link role="classifier:3" targetNodeId="11.~Object" resolveInfo="Object" />
        </node>
      </node>
      <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273394428">
        <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.CustomMapCreator:7" id="740251325273394429">
          <link role="containerDeclaration:7" targetNodeId="2v.4498918741262375224" resolveInfo="weakHashMap" />
          <node role="keyType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394430">
            <link role="classifier:3" targetNodeId="11.~Object" resolveInfo="Object" />
          </node>
          <node role="valueType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394431">
            <link role="classifier:3" targetNodeId="740251325273383510" resolveInfo="PathItemsReloadableCache" />
          </node>
        </node>
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273383591" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="740251325273383592">
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273394505">
        <property name="name:3" value="cls" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394507">
          <link role="classifier:3" targetNodeId="11.~Class" resolveInfo="Class" />
          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="740251325273394697">
            <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394699">
              <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
            </node>
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="740251325273383593" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273394415" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273383595">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273394514">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273394515">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273394516">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273394517" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273394518">
                <link role="fieldDeclaration:3" targetNodeId="740251325273394510" resolveInfo="cls" />
              </node>
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273394519">
              <link role="variableDeclaration:3" targetNodeId="740251325273394505" resolveInfo="cls" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="740251325273394510">
      <property name="name:3" value="pathItemClass" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273394511" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394512">
        <link role="classifier:3" targetNodeId="11.~Class" resolveInfo="Class" />
        <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.UpperBoundType:3" id="740251325273394693">
          <node role="bound:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273394695">
            <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <visible index="3" modelUID="f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.project(MPS.Classpath/jetbrains.mps.project@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="740251325273418613">
    <property name="name:3" value="StubModelDescriptors" />
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="740251325273470799">
      <property name="name:3" value="stubStereotype" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273470800" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273470802" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="740251325273470738">
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273470742">
        <property name="name:3" value="stereotype" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273470744" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6093929675701331554">
        <property name="name:3" value="mrm" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6093929675701331555">
          <link role="classifier:3" targetNodeId="22.~IModelRootManager" resolveInfo="IModelRootManager" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6093929675701331556">
        <property name="name:3" value="loc" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6093929675701331557">
          <link role="classifier:3" targetNodeId="23.~StubLocation" resolveInfo="StubLocation" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.Type:3" id="740251325273470739" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273470740">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273470803">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="740251325273470810">
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273470813">
              <link role="variableDeclaration:3" targetNodeId="740251325273470742" resolveInfo="stereotype" />
            </node>
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273470805">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="740251325273470804" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="740251325273470809">
                <link role="fieldDeclaration:3" targetNodeId="740251325273470799" resolveInfo="stereotype" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6093929675701331561">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6093929675701331562">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6093929675701331563">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6093929675701331564" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6093929675701331565">
                <link role="fieldDeclaration:3" targetNodeId="6093929675701331558" resolveInfo="mrm" />
              </node>
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701331566">
              <link role="variableDeclaration:3" targetNodeId="6093929675701331554" resolveInfo="mrm" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="6093929675701331570">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="6093929675701331571">
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6093929675701331572">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="6093929675701331573" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="6093929675701331574">
                <link role="fieldDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="loc" />
              </node>
            </node>
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701331575">
              <link role="variableDeclaration:3" targetNodeId="6093929675701331556" resolveInfo="loc" />
            </node>
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273470741" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273470745">
      <property name="name:3" value="getDescriptors" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273470756">
        <property name="name:3" value="getPathItem" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="740251325273470757">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273470758" />
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273470759">
            <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
          </node>
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273470747">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273470766">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273470767">
            <property name="name:3" value="result" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.SetType:7" id="740251325273470768">
              <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273470769">
                <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
              </node>
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273470770">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.HashSetCreator:7" id="740251325273470771">
                <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273470772">
                  <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273470790">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="740251325273470791">
            <link role="baseMethodDeclaration:3" targetNodeId="740251325273418933" resolveInfo="collectDescriptors" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6093929675701342147">
              <link role="variableDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="stubLoc" />
            </node>
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273470796">
              <link role="variableDeclaration:3" targetNodeId="740251325273470756" resolveInfo="getPathItem" />
            </node>
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273470798">
              <link role="variableDeclaration:3" targetNodeId="740251325273470767" resolveInfo="result" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="740251325273470787">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273470788">
            <link role="variableDeclaration:3" targetNodeId="740251325273470767" resolveInfo="result" />
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273470748" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.collections.structure.SetType:7" id="740251325273470749">
        <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273470751">
          <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273418933">
      <property name="name:3" value="collectDescriptors" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="6093929675701331590">
        <property name="name:3" value="loc" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="6093929675701331591">
          <link role="classifier:3" targetNodeId="23.~StubLocation" resolveInfo="StubLocation" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273418942">
        <property name="name:3" value="getPathItem" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.closures.structure.FunctionType:3" id="740251325273418943">
          <node role="parameterType:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273418944" />
          <node role="resultType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418945">
            <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273418946">
        <property name="name:3" value="result" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.SetType:7" id="740251325273418947">
          <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418948">
            <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
          </node>
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="740251325273418937" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418935">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418957">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418958">
            <property name="name:3" value="pkg" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418959">
              <link role="classifier:3" targetNodeId="11.~String" resolveInfo="String" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273418960">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701332915">
                <link role="variableDeclaration:3" targetNodeId="6093929675701331590" resolveInfo="loc" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273418962">
                <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getPrefix():java.lang.String" resolveInfo="getPrefix" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418963">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418964">
            <property name="name:3" value="pi" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418965">
              <link role="classifier:3" targetNodeId="740251325273382988" resolveInfo="PathItem" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.closures.structure.CompactInvokeFunctionExpression:3" id="740251325273418966">
              <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273418967">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701332916">
                  <link role="variableDeclaration:3" targetNodeId="6093929675701331590" resolveInfo="loc" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273418969">
                  <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getPath():java.lang.String" resolveInfo="getPath" />
                </node>
              </node>
              <node role="function:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273418970">
                <link role="variableDeclaration:3" targetNodeId="740251325273418942" resolveInfo="getPathItem" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement:7" id="740251325273418971">
          <node role="variable:7" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable:7" id="740251325273418972">
            <property name="name:7" value="subpkg" />
          </node>
          <node role="body:7" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418973">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273418974">
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273418975">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273418976">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273418977">
                    <link role="variableDeclaration:3" targetNodeId="740251325273418964" resolveInfo="pi" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273418978">
                    <link role="baseMethodDeclaration:3" targetNodeId="740251325273383181" resolveInfo="resources" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="740251325273418979">
                      <link role="variable:7" targetNodeId="740251325273418972" resolveInfo="subpkg" />
                    </node>
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation:7" id="740251325273418980" />
              </node>
              <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418981">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418982">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418983">
                    <property name="name:3" value="smref" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="988445697422239560">
                      <link role="classifier:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="740251325273470718">
                      <link role="baseMethodDeclaration:3" targetNodeId="740251325273418901" resolveInfo="smodelRefWithId" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="740251325273470719">
                        <link role="variable:7" targetNodeId="740251325273418972" resolveInfo="subpkg" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418989">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418990">
                    <property name="name:3" value="smref2" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418991">
                      <link role="classifier:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="740251325273470721">
                      <link role="baseMethodDeclaration:3" targetNodeId="740251325273418885" resolveInfo="smodelRefWithFqName" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="740251325273470722">
                        <link role="variable:7" targetNodeId="740251325273418972" resolveInfo="subpkg" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418996">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418997">
                    <property name="name:3" value="descById" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418998">
                      <link role="classifier:3" targetNodeId="21.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273418999">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273419000">
                        <link role="classConcept:3" targetNodeId="21.~SModelRepository" resolveInfo="SModelRepository" />
                        <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273419001">
                        <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getModelDescriptor(jetbrains.mps.smodel.SModelReference):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419002">
                          <link role="variableDeclaration:3" targetNodeId="740251325273418983" resolveInfo="smref" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273419003">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273419004">
                    <property name="name:3" value="descByFqName" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273419005">
                      <link role="classifier:3" targetNodeId="21.~SModelDescriptor" resolveInfo="SModelDescriptor" />
                    </node>
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419006">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273419007">
                        <link role="classConcept:3" targetNodeId="21.~SModelRepository" resolveInfo="SModelRepository" />
                        <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273419008">
                        <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getModelDescriptor(jetbrains.mps.smodel.SModelReference):jetbrains.mps.smodel.SModelDescriptor" resolveInfo="getModelDescriptor" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419009">
                          <link role="variableDeclaration:3" targetNodeId="740251325273418990" resolveInfo="smref2" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="740251325273419010">
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273419011">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273419012">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419013">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273419014">
                          <link role="classConcept:3" targetNodeId="21.~SModelRepository" resolveInfo="SModelRepository" />
                          <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273419015">
                          <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.addOwnerForDescriptor(jetbrains.mps.smodel.SModelDescriptor,jetbrains.mps.smodel.ModelOwner):void" resolveInfo="addOwnerForDescriptor" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419016">
                            <link role="variableDeclaration:3" targetNodeId="740251325273419004" resolveInfo="descByFqName" />
                          </node>
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419017">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701332917">
                              <link role="variableDeclaration:3" targetNodeId="6093929675701331590" resolveInfo="loc" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273419019">
                              <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273419020">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419021">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273419022">
                          <link role="variableDeclaration:3" targetNodeId="740251325273418946" resolveInfo="result" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation:7" id="740251325273419023">
                          <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="740251325273419024">
                            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="740251325273419025">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419026">
                                <link role="variableDeclaration:3" targetNodeId="740251325273419004" resolveInfo="descByFqName" />
                              </node>
                              <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273419027">
                                <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.AndExpression:3" id="740251325273419028">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="740251325273419029">
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273419030" />
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419031">
                        <link role="variableDeclaration:3" targetNodeId="740251325273419004" resolveInfo="descByFqName" />
                      </node>
                    </node>
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="740251325273419032">
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419033">
                        <link role="variableDeclaration:3" targetNodeId="740251325273418997" resolveInfo="descById" />
                      </node>
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273419034" />
                    </node>
                  </node>
                  <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="740251325273419035">
                    <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273419036">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273419037">
                        <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273419038">
                          <property name="name:3" value="desc" />
                          <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273419039">
                            <link role="classifier:3" targetNodeId="23.~BaseStubModelDescriptor" resolveInfo="BaseStubModelDescriptor" />
                          </node>
                          <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273419040">
                            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273419041">
                              <link role="baseMethodDeclaration:3" targetNodeId="23.~BaseStubModelDescriptor.&lt;init&gt;(jetbrains.mps.smodel.persistence.IModelRootManager,jetbrains.mps.vfs.IFile,jetbrains.mps.smodel.SModelReference)" resolveInfo="BaseStubModelDescriptor" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6093929675701331579">
                                <link role="variableDeclaration:3" targetNodeId="6093929675701331558" resolveInfo="mrm" />
                              </node>
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="740251325273419043" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419044">
                                <link role="variableDeclaration:3" targetNodeId="740251325273418983" resolveInfo="smref" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2873909182446917964">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2873909182446917965">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="2873909182446917966">
                            <link role="classConcept:3" targetNodeId="21.~SModelRepository" resolveInfo="SModelRepository" />
                            <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.getInstance():jetbrains.mps.smodel.SModelRepository" resolveInfo="getInstance" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2873909182446917967">
                            <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelRepository.registerModelDescriptor(jetbrains.mps.smodel.SModelDescriptor,jetbrains.mps.smodel.ModelOwner):void" resolveInfo="registerModelDescriptor" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2873909182446917972">
                              <link role="variableDeclaration:3" targetNodeId="740251325273419038" resolveInfo="desc" />
                            </node>
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2873909182446917969">
                              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701332918">
                                <link role="variableDeclaration:3" targetNodeId="6093929675701331590" resolveInfo="loc" />
                              </node>
                              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2873909182446917971">
                                <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273419045">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419046">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273419047">
                            <link role="variableDeclaration:3" targetNodeId="740251325273418946" resolveInfo="result" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddSetElementOperation:7" id="740251325273419048">
                            <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419049">
                              <link role="variableDeclaration:3" targetNodeId="740251325273419038" resolveInfo="desc" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273470724">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="740251325273470725">
                <link role="baseMethodDeclaration:3" targetNodeId="740251325273418933" resolveInfo="collectDescriptors" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273470727">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273470728">
                    <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.&lt;init&gt;(java.lang.String,java.lang.String,jetbrains.mps.project.IModule)" resolveInfo="StubLocation" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273470729">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="6093929675701331582">
                        <link role="variableDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="loc" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273470731">
                        <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getPath():java.lang.String" resolveInfo="getPath" />
                      </node>
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="740251325273470732">
                      <link role="variable:7" targetNodeId="740251325273418972" resolveInfo="subpkg" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273470733">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="6093929675701332919">
                        <link role="variableDeclaration:3" targetNodeId="6093929675701331590" resolveInfo="loc" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273470735">
                        <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273470736">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418942" resolveInfo="getPathItem" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273470737">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418946" resolveInfo="result" />
                </node>
              </node>
            </node>
          </node>
          <node role="inputSequence:7" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="740251325273419066">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419067">
              <link role="variableDeclaration:3" targetNodeId="740251325273418964" resolveInfo="pi" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="740251325273419068">
              <link role="baseMethodDeclaration:3" targetNodeId="740251325273383115" resolveInfo="subpackages" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273419069">
                <link role="variableDeclaration:3" targetNodeId="740251325273418958" resolveInfo="pkg" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="740251325273470824" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273418901">
      <property name="name:3" value="smodelRefWithId" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273418907">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273418909" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418906">
        <link role="classifier:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418903">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418915">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418916">
            <property name="name:3" value="fqname" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418917">
              <link role="classifier:3" targetNodeId="21.~SModelFqName" resolveInfo="SModelFqName" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273418918">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273418919">
                <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelFqName.&lt;init&gt;(java.lang.String,java.lang.String,java.lang.String)" resolveInfo="SModelFqName" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3820102184366751535">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3820102184366751530">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="3820102184366751529">
                      <link role="variableDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="stubLoc" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3820102184366751534">
                      <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModuleRef():jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="getModuleRef" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3820102184366751539">
                    <link role="baseMethodDeclaration:3" targetNodeId="24.~ModuleReference.getModuleFqName():java.lang.String" resolveInfo="getModuleFqName" />
                  </node>
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273418920">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418907" resolveInfo="pkg" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273470822">
                  <link role="variableDeclaration:3" targetNodeId="740251325273470799" resolveInfo="stereotype" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418922">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418923">
            <property name="name:3" value="modelId" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418924">
              <link role="classifier:3" targetNodeId="21.~SModelId" resolveInfo="SModelId" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273418925">
              <link role="classConcept:3" targetNodeId="21.~SModelId" resolveInfo="SModelId" />
              <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelId.foreign(java.lang.String,java.lang.String,java.lang.String):jetbrains.mps.smodel.SModelId" resolveInfo="foreign" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273470821">
                <link role="variableDeclaration:3" targetNodeId="740251325273470799" resolveInfo="stereotype" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4695844298098174060">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4695844298098173374">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4695844298098173375">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="4695844298098173376">
                      <link role="variableDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="stubLoc" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4695844298098173377">
                      <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModuleRef():jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="getModuleRef" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4695844298098173379">
                    <link role="baseMethodDeclaration:3" targetNodeId="24.~ModuleReference.getModuleId():jetbrains.mps.project.ModuleId" resolveInfo="getModuleId" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4695844298098174064">
                  <link role="baseMethodDeclaration:3" targetNodeId="3v.~ModuleId.toString():java.lang.String" resolveInfo="toString" />
                </node>
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273418927">
                <link role="variableDeclaration:3" targetNodeId="740251325273418907" resolveInfo="pkg" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273418928">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273418929">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273418930">
              <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelReference.&lt;init&gt;(jetbrains.mps.smodel.SModelFqName,jetbrains.mps.smodel.SModelId)" resolveInfo="SModelReference" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273418931">
                <link role="variableDeclaration:3" targetNodeId="740251325273418916" resolveInfo="fqname" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273418932">
                <link role="variableDeclaration:3" targetNodeId="740251325273418923" resolveInfo="modelId" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273471241" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273418885">
      <property name="name:3" value="smodelRefWithFqName" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273418890">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273418892" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418889">
        <link role="classifier:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418887">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273418893">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273418894">
            <link role="classConcept:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
            <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelReference.fromString(java.lang.String):jetbrains.mps.smodel.SModelReference" resolveInfo="fromString" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273470814">
              <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="740251325273470817">
                <link role="variableDeclaration:3" targetNodeId="740251325273470799" resolveInfo="stereotype" />
              </node>
              <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="740251325273418896">
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="740251325273418897">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418890" resolveInfo="pkg" />
                </node>
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273418898">
                  <property name="value:3" value="@" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273471242" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="740251325273418851">
      <property name="name:3" value="javaStubRef" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="740251325273418856">
        <property name="name:3" value="pkg" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="740251325273418858" />
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418855">
        <link role="classifier:3" targetNodeId="21.~SModelReference" resolveInfo="SModelReference" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="740251325273418853">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4040479201457808482">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4040479201457808483">
            <property name="name:3" value="mr" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="988445697422240613">
              <link role="classifier:3" targetNodeId="24.~ModuleReference" resolveInfo="ModuleReference" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457808485">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457808486">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457808487">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="4040479201457808488" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation:3" id="4040479201457808489">
                    <link role="fieldDeclaration:3" targetNodeId="6093929675701331567" resolveInfo="stubLoc" />
                  </node>
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4040479201457808490">
                  <link role="baseMethodDeclaration:3" targetNodeId="23.~StubLocation.getModule():jetbrains.mps.project.IModule" resolveInfo="getModule" />
                </node>
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4040479201457808491">
                <link role="baseMethodDeclaration:3" targetNodeId="3v.~IModule.getModuleFor(java.lang.String,java.lang.String):jetbrains.mps.project.structure.modules.ModuleReference" resolveInfo="getModuleFor" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4040479201457808492">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418856" resolveInfo="pkg" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4040479201457808493">
                  <property name="value:3" value="java" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4040479201457822581">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4040479201457822582">
            <property name="name:3" value="mfq" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="4040479201457822583" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4040479201457822584">
              <property name="value:3" value="MPS.Classpath" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4040479201457822597">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4040479201457822598">
            <property name="name:3" value="muid" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.StringType:3" id="4040479201457822599" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="4040479201457822600">
              <property name="value:3" value="37a3367b-1fb2-44d8-aa6b-18075e74e003" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4040479201457822550">
          <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4040479201457822551">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4040479201457822586">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4040479201457822588">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457822592">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822591">
                    <link role="variableDeclaration:3" targetNodeId="4040479201457808483" resolveInfo="mr" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4040479201457822596">
                    <link role="baseMethodDeclaration:3" targetNodeId="24.~ModuleReference.getModuleFqName():java.lang.String" resolveInfo="getModuleFqName" />
                  </node>
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822587">
                  <link role="variableDeclaration:3" targetNodeId="4040479201457822582" resolveInfo="mfq" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4040479201457822603">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4040479201457822605">
                <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457822614">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4040479201457822609">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822608">
                      <link role="variableDeclaration:3" targetNodeId="4040479201457808483" resolveInfo="mr" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4040479201457822613">
                      <link role="baseMethodDeclaration:3" targetNodeId="24.~ModuleReference.getModuleId():jetbrains.mps.project.ModuleId" resolveInfo="getModuleId" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4040479201457822618">
                    <link role="baseMethodDeclaration:3" targetNodeId="3v.~ModuleId.toString():java.lang.String" resolveInfo="toString" />
                  </node>
                </node>
                <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822604">
                  <link role="variableDeclaration:3" targetNodeId="4040479201457822598" resolveInfo="muid" />
                </node>
              </node>
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="4040479201457822555">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="4040479201457822558" />
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822554">
              <link role="variableDeclaration:3" targetNodeId="4040479201457808483" resolveInfo="mr" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418862">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418863">
            <property name="name:3" value="stereo" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418864">
              <link role="classifier:3" targetNodeId="11.~String" resolveInfo="String" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="740251325273418865">
              <link role="classConcept:3" targetNodeId="21.~SModelStereotype" resolveInfo="SModelStereotype" />
              <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelStereotype.getStubStereotypeForId(java.lang.String):java.lang.String" resolveInfo="getStubStereotypeForId" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="740251325273418866">
                <property name="value:3" value="java" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418867">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418868">
            <property name="name:3" value="fqname" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418869">
              <link role="classifier:3" targetNodeId="21.~SModelFqName" resolveInfo="SModelFqName" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4040479201457822561">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="4040479201457822562">
                <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelFqName.&lt;init&gt;(java.lang.String,java.lang.String,java.lang.String)" resolveInfo="SModelFqName" />
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822585">
                  <link role="variableDeclaration:3" targetNodeId="4040479201457822582" resolveInfo="mfq" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4040479201457822564">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418856" resolveInfo="pkg" />
                </node>
                <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822565">
                  <link role="variableDeclaration:3" targetNodeId="740251325273418863" resolveInfo="stereo" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="740251325273418874">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="740251325273418875">
            <property name="name:3" value="modelId" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="740251325273418876">
              <link role="classifier:3" targetNodeId="21.~SModelId" resolveInfo="SModelId" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="4040479201457822572">
              <link role="classConcept:3" targetNodeId="21.~SModelId" resolveInfo="SModelId" />
              <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelId.foreign(java.lang.String,java.lang.String,java.lang.String):jetbrains.mps.smodel.SModelId" resolveInfo="foreign" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822573">
                <link role="variableDeclaration:3" targetNodeId="740251325273418863" resolveInfo="stereo" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4040479201457822601">
                <link role="variableDeclaration:3" targetNodeId="4040479201457822598" resolveInfo="muid" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4040479201457822575">
                <link role="variableDeclaration:3" targetNodeId="740251325273418856" resolveInfo="pkg" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="740251325273418880">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="740251325273418881">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="740251325273418882">
              <link role="baseMethodDeclaration:3" targetNodeId="21.~SModelReference.&lt;init&gt;(jetbrains.mps.smodel.SModelFqName,jetbrains.mps.smodel.SModelId)" resolveInfo="SModelReference" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273418883">
                <link role="variableDeclaration:3" targetNodeId="740251325273418868" resolveInfo="fqname" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="740251325273418884">
                <link role="variableDeclaration:3" targetNodeId="740251325273418875" resolveInfo="modelId" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273471243" />
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="740251325273418614" />
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6093929675701331558">
      <property name="name:3" value="mrm" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6093929675701331559" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="988445697422240087">
        <link role="classifier:3" targetNodeId="22.~IModelRootManager" resolveInfo="IModelRootManager" />
      </node>
    </node>
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="6093929675701331567">
      <property name="name:3" value="stubLoc" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="6093929675701331568" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="988445697422240612">
        <link role="classifier:3" targetNodeId="23.~StubLocation" resolveInfo="StubLocation" />
      </node>
    </node>
  </node>
</model>

