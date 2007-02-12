<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.util">
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="19" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.smodelLanguage@java_stub" />
  <import index="4" modelUID="java.lang@java_stub" />
  <import index="5" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" />
  <import index="9" modelUID="jetbrains.mps.bootstrap.structureLanguage@java_stub" />
  <import index="10" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="11" modelUID="jetbrains.mps.generator.template@java_stub" />
  <import index="12" modelUID="jetbrains.mps.typesystem@java_stub" />
  <import index="13" modelUID="jetbrains.mps.baseLanguage.types@java_stub" />
  <import index="19" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure@java_stub" />
  <node type="jetbrains.mps.baseLanguage.ClassConcept" id="1168968323635">
    <property name="name" value="QueriesUtil" />
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168968334480">
      <property name="name" value="opGetParent_reduceDefault" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168968338921" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168968334482">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1168968630547">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1168968630548">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168968630550">
              <link role="classifier" extResolveInfo="4.[Classifier]Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1168968584618">
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil_new).([StaticMethodDeclaration]findNodeOperationParameter((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171244851265">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171244853253" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1168968620254">
                  <link role="variableDeclaration" targetNodeId="1168968445647" resolveInfo="op" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1168968609576">
                <link role="classifier" extResolveInfo="19.[Classifier]OperationParm_Concept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1168968665241">
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1168968836667">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168968675682">
              <link role="variableDeclaration" targetNodeId="1168968630548" resolveInfo="parm" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1168968679218" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1168968665243">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168968839965">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1168968842264">
                <property name="value" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1168968847798">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1168968848972">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168968847799">
              <link role="variableDeclaration" targetNodeId="1168968630548" resolveInfo="parm" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1168968856837">
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil_new).([StaticMethodDeclaration]findNodeOperationParameter((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171244938481">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171244939922" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1168968856839">
                  <link role="variableDeclaration" targetNodeId="1168968445647" resolveInfo="op" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1168968856841">
                <link role="classifier" extResolveInfo="19.[Classifier]OperationParm_ConceptList" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168968918836">
          <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1168968923089">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1168968925827" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168968921869">
              <link role="variableDeclaration" targetNodeId="1168968630548" resolveInfo="parm" />
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168968445647">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168968445648">
          <link role="concept" targetNodeId="1.1139613262185" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168969209239">
      <property name="name" value="opGetParent_reduceWhereConceptInList" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168969209240" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168969209241">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1168969209242">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1168969209243">
            <property name="name" value="parm" />
            <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168969209244">
              <link role="classifier" extResolveInfo="4.[Classifier]Object" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1168969209245">
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil_new).([StaticMethodDeclaration]findNodeOperationParameter((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171245192136">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171245192546" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1168969209247">
                  <link role="variableDeclaration" targetNodeId="1168969209269" resolveInfo="op" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1168969209249">
                <link role="classifier" extResolveInfo="19.[Classifier]OperationParm_Concept" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1168969209250">
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1168969209251">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168969209252">
              <link role="variableDeclaration" targetNodeId="1168969209243" resolveInfo="parm" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1168969209253" />
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1168969209254">
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168969209255">
              <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1168969227538" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1168969209257">
          <node role="expression" type="jetbrains.mps.baseLanguage.AssignmentExpression" id="1168969209258">
            <node role="lValue" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168969209259">
              <link role="variableDeclaration" targetNodeId="1168969209243" resolveInfo="parm" />
            </node>
            <node role="rValue" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1168969209260">
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil_new" />
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil_new).([StaticMethodDeclaration]findNodeOperationParameter((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Class])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [Object]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1171245238906">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_GetAdapterOperation" id="1171245240018" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1168969209262">
                  <link role="variableDeclaration" targetNodeId="1168969209269" resolveInfo="op" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.ClassifierClassExpression" id="1168969209264">
                <link role="classifier" extResolveInfo="19.[Classifier]OperationParm_ConceptList" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168969209265">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1168969229697">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1168969209268">
              <link role="variableDeclaration" targetNodeId="1168969209243" resolveInfo="parm" />
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1168969209267" />
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168969209269">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168969209270">
          <link role="concept" targetNodeId="1.1139613262185" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168976201873">
      <property name="name" value="isPropertyAccess_simple" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168976206048" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168976201875">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170463133396">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170463133397">
            <property name="name" value="prop" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170463133398">
              <link role="concept" targetNodeId="5.1071489288299" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463133399">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170463380083">
                <link role="variableDeclaration" targetNodeId="1168976230987" resolveInfo="op" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170463133402">
                <link role="link" targetNodeId="1.1138056395725" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170463133403">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170463133404">
            <property name="name" value="datatype" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170463133405">
              <link role="concept" targetNodeId="5.1082978164218" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463133406">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463133407">
                <link role="variableDeclaration" targetNodeId="1170463133397" resolveInfo="prop" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170463133408">
                <link role="link" targetNodeId="5.1082985295845" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170463133409">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1170463133410">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463133411">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463133412">
                <link role="variableDeclaration" targetNodeId="1170463133404" resolveInfo="datatype" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1170463133413">
                <link role="concept" targetNodeId="5.1082978164219" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168976230987">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168976279491">
          <link role="concept" targetNodeId="1.1138056022639" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168976514329">
      <property name="name" value="isPropertyAccess_enum_notNullDefaultValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168976553825">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168976553826">
          <link role="concept" targetNodeId="1.1138056022639" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168976517738" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168976514331">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170463736160">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170463736161">
            <property name="name" value="prop" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170463736162">
              <link role="concept" targetNodeId="5.1071489288299" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463736163">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170463746066">
                <link role="variableDeclaration" targetNodeId="1168976553825" resolveInfo="op" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170463736166">
                <link role="link" targetNodeId="1.1138056395725" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170463736167">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170463736168">
            <property name="name" value="datatype" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170463736169">
              <link role="concept" targetNodeId="5.1082978164218" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463736170">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463736171">
                <link role="variableDeclaration" targetNodeId="1170463736161" resolveInfo="prop" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170463736172">
                <link role="link" targetNodeId="5.1082985295845" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170463736173">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170463736174">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170463736175">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170463736176">
                <property name="name" value="defMember" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170463736177">
                  <link role="concept" targetNodeId="5.1083171877298" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170463736178">
                  <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]DataTypeUtil).([StaticMethodDeclaration]getDefaultMember((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationDataTypeDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationMemberDeclaration]))" />
                  <link role="classConcept" extResolveInfo="7.[Classifier]DataTypeUtil" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170463736179">
                    <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463736180">
                      <link role="variableDeclaration" targetNodeId="1170463736168" resolveInfo="datatype" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170463736181">
                      <link role="classifier" extResolveInfo="9.[Classifier]EnumerationDataTypeDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170463736182">
              <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170463736183">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170463736184" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463736185">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463736186">
                    <link role="variableDeclaration" targetNodeId="1170463736176" resolveInfo="defMember" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170463736187">
                    <link role="property" targetNodeId="5.1083923523171" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170463736188">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170463736189">
              <link role="variableDeclaration" targetNodeId="1170463736168" resolveInfo="datatype" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1170463736190">
              <link role="concept" targetNodeId="5.1082978164219" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170463781755">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1170463784617" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168977078010">
      <property name="name" value="isPropertyAccess_enum_nullDefaultValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168977078011">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168977078012">
          <link role="concept" targetNodeId="1.1138056022639" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168977078013" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168977078014">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170464177704">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170464177705">
            <property name="name" value="prop" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170464177706">
              <link role="concept" targetNodeId="5.1071489288299" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170464177707">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170464188236">
                <link role="variableDeclaration" targetNodeId="1168977078011" resolveInfo="op" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170464177710">
                <link role="link" targetNodeId="1.1138056395725" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170464177711">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170464177712">
            <property name="name" value="datatype" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170464177713">
              <link role="concept" targetNodeId="5.1082978164218" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170464177714">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170464177715">
                <link role="variableDeclaration" targetNodeId="1170464177705" resolveInfo="prop" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170464177716">
                <link role="link" targetNodeId="5.1082985295845" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170464177717">
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170464177718">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170464177719">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170464177720">
                <property name="name" value="defMember" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170464177721">
                  <link role="concept" targetNodeId="5.1083171877298" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170464177722">
                  <link role="classConcept" extResolveInfo="7.[Classifier]DataTypeUtil" />
                  <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]DataTypeUtil).([StaticMethodDeclaration]getDefaultMember((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationDataTypeDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationMemberDeclaration]))" />
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170464177723">
                    <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170464177724">
                      <link role="variableDeclaration" targetNodeId="1170464177712" resolveInfo="datatype" />
                    </node>
                    <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170464177725">
                      <link role="classifier" extResolveInfo="9.[Classifier]EnumerationDataTypeDeclaration" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170464177726">
              <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1170464177727">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170464177728">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170464177729">
                    <link role="variableDeclaration" targetNodeId="1170464177720" resolveInfo="defMember" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170464177730">
                    <link role="property" targetNodeId="5.1083923523171" />
                  </node>
                </node>
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170464177731" />
              </node>
            </node>
          </node>
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170464177732">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170464177733">
              <link role="variableDeclaration" targetNodeId="1170464177712" resolveInfo="datatype" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1170464177734">
              <link role="concept" targetNodeId="5.1082978164219" />
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170464225522">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1170464225523" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168977771366">
      <property name="name" value="isProperty_set_stringValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168977819430">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168977819431">
          <link role="concept" targetNodeId="1.1138661924179" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168977998746">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168978021902">
          <link role="classifier" extResolveInfo="11.[Classifier]ITemplateGenerator" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168977775921" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168977771368">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170701985948">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170701985949">
            <property name="name" value="value" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170701985950">
              <link role="concept" targetNodeId="10.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170701985951">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170701985952">
                <link role="variableDeclaration" targetNodeId="1168977819430" resolveInfo="op" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170701985953">
                <link role="link" targetNodeId="1.1138662048170" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170701985954">
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170701985955">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170701985956" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985957">
              <link role="variableDeclaration" targetNodeId="1170701985949" resolveInfo="value" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170701985958">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170701985959">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170701985960">
                <property name="name" value="typechecker" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170701985961">
                  <link role="classifier" extResolveInfo="12.[Classifier]ITypeChecker" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170701985962">
                  <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170701985963">
                    <link role="variableDeclaration" targetNodeId="1168977998746" resolveInfo="generator" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170701985964">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170701985965">
                <property name="name" value="value_type" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170701985966">
                  <link role="classifier" extResolveInfo="12.[Classifier]ITypeObject" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170701985967">
                  <link role="baseMethodDeclaration" extResolveInfo="12.method ([Classifier]ITypeChecker).([InstanceMethodDeclaration]getNodeType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985968">
                    <link role="variableDeclaration" targetNodeId="1170701985960" resolveInfo="typechecker" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985969">
                    <link role="variableDeclaration" targetNodeId="1170701985949" resolveInfo="value" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170701985970">
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170701985971">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170701985972" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985973">
                  <link role="variableDeclaration" targetNodeId="1170701985965" resolveInfo="value_type" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170701985974">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170701985975">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170701985976">
                    <link role="classConcept" extResolveInfo="13.[Classifier]BaseLanguageTypesUtil" />
                    <link role="baseMethodDeclaration" extResolveInfo="13.static method ([Classifier]BaseLanguageTypesUtil).([StaticMethodDeclaration]isAssignableToClassifier_type((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985977">
                      <link role="variableDeclaration" targetNodeId="1170701985965" resolveInfo="value_type" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1170701985978">
                      <property name="value" value="java.lang.String" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170701985979">
                      <link role="variableDeclaration" targetNodeId="1170701985960" resolveInfo="typechecker" />
                    </node>
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170701985980">
                      <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                      <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170701985981">
                        <link role="variableDeclaration" targetNodeId="1168977998746" resolveInfo="generator" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168977842419">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1168977842420" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168978712427">
      <property name="name" value="isProperty_set_notStringValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168978712428">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168978712429">
          <link role="concept" targetNodeId="1.1138661924179" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168978712430">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168978712431">
          <link role="classifier" extResolveInfo="11.[Classifier]ITemplateGenerator" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168978712432" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168978712433">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702143162">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702143163">
            <property name="name" value="value" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170702143164">
              <link role="concept" targetNodeId="10.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170702143165">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702167201">
                <link role="variableDeclaration" targetNodeId="1168978712428" resolveInfo="op" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1170702143168">
                <link role="link" targetNodeId="1.1138662048170" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170702143169">
          <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170702143170">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170702143171" />
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143172">
              <link role="variableDeclaration" targetNodeId="1170702143163" resolveInfo="value" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170702143173">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702143174">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702143175">
                <property name="name" value="typechecker" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702143176">
                  <link role="classifier" extResolveInfo="12.[Classifier]ITypeChecker" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170702143177">
                  <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702143178">
                    <link role="variableDeclaration" targetNodeId="1168978712430" resolveInfo="generator" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702143179">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702143180">
                <property name="name" value="value_type" />
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702143181">
                  <link role="classifier" extResolveInfo="12.[Classifier]ITypeObject" />
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170702143182">
                  <link role="baseMethodDeclaration" extResolveInfo="12.method ([Classifier]ITypeChecker).([InstanceMethodDeclaration]getNodeType((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNode])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]))" />
                  <node role="instance" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143183">
                    <link role="variableDeclaration" targetNodeId="1170702143175" resolveInfo="typechecker" />
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143184">
                    <link role="variableDeclaration" targetNodeId="1170702143163" resolveInfo="value" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1170702143185">
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170702143186">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170702143187" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143188">
                  <link role="variableDeclaration" targetNodeId="1170702143180" resolveInfo="value_type" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1170702143189">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170702143190">
                  <node role="expression" type="jetbrains.mps.baseLanguage.NotExpression" id="1170702143191">
                    <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170702143192">
                      <link role="baseMethodDeclaration" extResolveInfo="13.static method ([Classifier]BaseLanguageTypesUtil).([StaticMethodDeclaration]isAssignableToClassifier_type((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeObject]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope])) : (jetbrains.mps.baseLanguage.types.boolean/jetbrains.mps.baseLanguage.types.boolean))" />
                      <link role="classConcept" extResolveInfo="13.[Classifier]BaseLanguageTypesUtil" />
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143193">
                        <link role="variableDeclaration" targetNodeId="1170702143180" resolveInfo="value_type" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.StringLiteral" id="1170702143194">
                        <property name="value" value="java.lang.String" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702143195">
                        <link role="variableDeclaration" targetNodeId="1170702143175" resolveInfo="typechecker" />
                      </node>
                      <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170702143196">
                        <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getScope() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [IScope]))" />
                        <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702143197">
                          <link role="variableDeclaration" targetNodeId="1168978712430" resolveInfo="generator" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1168978712480">
          <node role="expression" type="jetbrains.mps.baseLanguage.BooleanConstant" id="1168978712481" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168979165563">
      <property name="name" value="isProperty_hasValueEnum_notNullDefaultValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168979234216">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168979234217">
          <link role="concept" targetNodeId="1.1146171026731" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168979379803">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168979379804">
          <link role="classifier" extResolveInfo="11.[Classifier]ITemplateGenerator" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168979172347" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168979165565">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702261821">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702261822">
            <property name="name" value="datatype" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170702261823">
              <link role="concept" targetNodeId="5.1082978164219" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170702261824">
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil).([StaticMethodDeclaration]getDatatypeFromLeftExpression_Property((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [DataTypeDeclaration]))" />
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170702261825">
                <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702286236">
                  <link role="variableDeclaration" targetNodeId="1168979234216" resolveInfo="op" />
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702261827">
                  <link role="classifier" extResolveInfo="2.[Classifier]SNodeOperation" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170702261828">
                <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702261829">
                  <link role="variableDeclaration" targetNodeId="1168979379803" resolveInfo="generator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702261830">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702261831">
            <property name="name" value="defMember" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170702261832">
              <link role="concept" targetNodeId="5.1083171877298" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170702261833">
              <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]DataTypeUtil).([StaticMethodDeclaration]getDefaultMember((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationDataTypeDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationMemberDeclaration]))" />
              <link role="classConcept" extResolveInfo="7.[Classifier]DataTypeUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170702261834">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702261835">
                  <link role="variableDeclaration" targetNodeId="1170702261822" resolveInfo="datatype" />
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702261836">
                  <link role="classifier" extResolveInfo="9.[Classifier]EnumerationDataTypeDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170702261837">
          <node role="expression" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1170702261838">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170702261839" />
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170702261840">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702261841">
                <link role="variableDeclaration" targetNodeId="1170702261831" resolveInfo="defMember" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170702261842">
                <link role="property" targetNodeId="5.1083923523171" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1168979519274">
      <property name="name" value="isProperty_hasValueEnum_nullDefaultValue" />
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168979519275">
        <property name="name" value="op" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1168979519276">
          <link role="concept" targetNodeId="1.1146171026731" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1168979519277">
        <property name="name" value="generator" />
        <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1168979519278">
          <link role="classifier" extResolveInfo="11.[Classifier]ITemplateGenerator" />
        </node>
      </node>
      <node role="returnType" type="jetbrains.mps.baseLanguage.BooleanType" id="1168979519279" />
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1168979519280">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702390203">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702390204">
            <property name="name" value="datatype" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170702390205">
              <link role="concept" targetNodeId="5.1082978164219" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170702390206">
              <link role="baseMethodDeclaration" extResolveInfo="2.static method ([Classifier]SModelLanguageUtil).([StaticMethodDeclaration]getDatatypeFromLeftExpression_Property((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [SNodeOperation]), (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [DataTypeDeclaration]))" />
              <link role="classConcept" extResolveInfo="2.[Classifier]SModelLanguageUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170702390207">
                <node role="expression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702860570">
                  <link role="variableDeclaration" targetNodeId="1168979519275" resolveInfo="op" />
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702390209">
                  <link role="classifier" extResolveInfo="2.[Classifier]SNodeOperation" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.InstanceMethodCall" id="1170702390210">
                <link role="baseMethodDeclaration" extResolveInfo="11.method ([Classifier]ITemplateGenerator).([InstanceMethodDeclaration]getTypeChecker() : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [ITypeChecker]))" />
                <node role="instance" type="jetbrains.mps.baseLanguage.ParameterReference" id="1170702390211">
                  <link role="variableDeclaration" targetNodeId="1168979519277" resolveInfo="generator" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1170702390212">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1170702390213">
            <property name="name" value="defMember" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1170702390214">
              <link role="concept" targetNodeId="5.1083171877298" />
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1170702390215">
              <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]DataTypeUtil).([StaticMethodDeclaration]getDefaultMember((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationDataTypeDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [EnumerationMemberDeclaration]))" />
              <link role="classConcept" extResolveInfo="7.[Classifier]DataTypeUtil" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1170702390216">
                <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702390217">
                  <link role="variableDeclaration" targetNodeId="1170702390204" resolveInfo="datatype" />
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1170702390218">
                  <link role="classifier" extResolveInfo="9.[Classifier]EnumerationDataTypeDeclaration" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1170702390219">
          <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1170702390220">
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1170702390221">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1170702390222">
                <link role="variableDeclaration" targetNodeId="1170702390213" resolveInfo="defMember" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1170702390223">
                <link role="property" targetNodeId="5.1083923523171" />
              </node>
            </node>
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1170702390224" />
          </node>
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1169051763393">
      <property name="name" value="linkOpExpression_genuineLink" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169053611344">
        <link role="concept" targetNodeId="5.1071489288298" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1169051763395">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169051965194">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169051965195">
            <property name="name" value="leftExpr" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169051965197">
              <link role="concept" targetNodeId="10.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169051950879">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1169051949597">
                <link role="variableDeclaration" targetNodeId="1169051895265" resolveInfo="expr" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169051954974">
                <link role="link" targetNodeId="1.1138056667223" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1169051980090">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169051984062">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169051982202">
              <link role="variableDeclaration" targetNodeId="1169051965195" resolveInfo="leftExpr" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1169051987423">
              <link role="concept" targetNodeId="1.1138055978872" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1169051980092">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169052113820">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169052113837">
                <property name="name" value="op" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169052113839">
                  <link role="concept" targetNodeId="1.1138411891628" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169052034082">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1169052054770">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169052032815">
                      <link role="variableDeclaration" targetNodeId="1169051965195" resolveInfo="leftExpr" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169052099382">
                    <link role="link" targetNodeId="1.1138411864174" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169053380533">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169053380534">
                <property name="name" value="link" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169053380536">
                  <link role="concept" targetNodeId="5.1071489288298" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169053366360">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1169053342702">
                    <link role="concept" targetNodeId="1.1138056143562" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169053341358">
                      <link role="variableDeclaration" targetNodeId="1169052113837" resolveInfo="op" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169053369251">
                    <link role="link" targetNodeId="1.1138056516764" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1169053405945">
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1169053411824">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1169053483327" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169053408745">
                  <link role="variableDeclaration" targetNodeId="1169053380534" resolveInfo="link" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1169053405947">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1169053494062">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1169053515143">
                    <link role="classConcept" extResolveInfo="7.[Classifier]SModelUtil" />
                    <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]SModelUtil).([StaticMethodDeclaration]getGenuineLinkDeclaration((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration]))" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1169053525634">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169053525635">
                        <link role="variableDeclaration" targetNodeId="1169053380534" resolveInfo="link" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1169053525636">
                        <link role="classifier" extResolveInfo="9.[Classifier]LinkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1169053568700">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1169053571749" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1169051895265">
        <property name="name" value="expr" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169051895266">
          <link role="concept" targetNodeId="1.1138055978872" />
        </node>
      </node>
    </node>
    <node role="staticMethod" type="jetbrains.mps.baseLanguage.StaticMethodDeclaration" id="1169057553830">
      <property name="name" value="linkListOpExpression_genuineLink" />
      <node role="returnType" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169057553831">
        <link role="concept" targetNodeId="5.1071489288298" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1169057553832">
        <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169057553833">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169057553834">
            <property name="name" value="leftExpr" />
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169057553835">
              <link role="concept" targetNodeId="10.1068431790191" />
            </node>
            <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169057553836">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.ParameterReference" id="1169057553837">
                <link role="variableDeclaration" targetNodeId="1169057553870" resolveInfo="expr" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169057553838">
                <link role="link" targetNodeId="1.1138056667223" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1169057553839">
          <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169057553840">
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169057553841">
              <link role="variableDeclaration" targetNodeId="1169057553834" resolveInfo="leftExpr" />
            </node>
            <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_IsInstanceOfOperation" id="1169057553842">
              <link role="concept" targetNodeId="1.1138055978872" />
            </node>
          </node>
          <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1169057553843">
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169057553844">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169057553845">
                <property name="name" value="op" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169057553846">
                  <link role="concept" targetNodeId="1.1138411891628" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169057553847">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1169057553848">
                    <link role="concept" targetNodeId="1.1138055978872" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169057553849">
                      <link role="variableDeclaration" targetNodeId="1169057553834" resolveInfo="leftExpr" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169057553850">
                    <link role="link" targetNodeId="1.1138411864174" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.LocalVariableDeclarationStatement" id="1169057553851">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.LocalVariableDeclaration" id="1169057553852">
                <property name="name" value="link" />
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169057553853">
                  <link role="concept" targetNodeId="5.1071489288298" />
                </node>
                <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1169057553854">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeTypeCastExpression" id="1169057553855">
                    <link role="concept" targetNodeId="1.1138056282393" />
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169057553856">
                      <link role="variableDeclaration" targetNodeId="1169057553845" resolveInfo="op" />
                    </node>
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1169057591163">
                    <link role="link" targetNodeId="1.1138056546658" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.IfStatement" id="1169057553858">
              <node role="condition" type="jetbrains.mps.baseLanguage.NotEqualsExpression" id="1169057553859">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1169057553860" />
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169057553861">
                  <link role="variableDeclaration" targetNodeId="1169057553852" resolveInfo="link" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.StatementList" id="1169057553862">
                <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1169057553863">
                  <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1169057553864">
                    <link role="baseMethodDeclaration" extResolveInfo="7.static method ([Classifier]SModelUtil).([StaticMethodDeclaration]getGenuineLinkDeclaration((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [LinkDeclaration]))" />
                    <link role="classConcept" extResolveInfo="7.[Classifier]SModelUtil" />
                    <node role="actualArgument" type="jetbrains.mps.baseLanguage.CastExpression" id="1169057553865">
                      <node role="expression" type="jetbrains.mps.baseLanguage.LocalVariableReference" id="1169057553866">
                        <link role="variableDeclaration" targetNodeId="1169057553852" resolveInfo="link" />
                      </node>
                      <node role="type" type="jetbrains.mps.baseLanguage.ClassifierType" id="1169057553867">
                        <link role="classifier" extResolveInfo="9.[Classifier]LinkDeclaration" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1169057553868">
          <node role="expression" type="jetbrains.mps.baseLanguage.NullLiteral" id="1169057553869" />
        </node>
      </node>
      <node role="parameter" type="jetbrains.mps.baseLanguage.ParameterDeclaration" id="1169057553870">
        <property name="name" value="expr" />
        <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeType" id="1169057553871">
          <link role="concept" targetNodeId="1.1138055978872" />
        </node>
      </node>
    </node>
  </node>
</model>

