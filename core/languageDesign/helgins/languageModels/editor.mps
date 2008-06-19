<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.helgins.editor">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.editorLanguage.constraints" version="21" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="83" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="21" />
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="6" />
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <languageAspect modelUID="jetbrains.mps.bootstrap.constraintsLanguage.structure" version="1" />
  <languageAspect modelUID="jetbrains.mps.closures.structure" version="0" />
  <languageAspect modelUID="jetbrains.mps.patterns.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.structureLanguage.constraints" version="11" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.sharedConcepts.constraints" version="0" />
  <languageAspect modelUID="jetbrains.mps.bootstrap.helgins.constraints" version="17" />
  <languageAspect modelUID="jetbrains.mps.closures.constraints" version="2" />
  <languageAspect modelUID="jetbrains.mps.core.constraints" version="2" />
  <maxImportIndex value="28" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.helgins.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="4" modelUID="jetbrains.mps.nodeEditor@java_stub" version="-1" />
  <import index="5" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure@java_stub" version="-1" />
  <import index="6" modelUID="java.lang@java_stub" version="-1" />
  <import index="7" modelUID="jetbrains.mps.smodel@java_stub" version="-1" />
  <import index="8" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="10" modelUID="jetbrains.mps.annotations.structure" version="-1" />
  <import index="12" modelUID="jetbrains.mps.bootstrap.helgins.structure@java_stub" version="-1" />
  <import index="19" modelUID="jetbrains.mps.patterns.structure" version="-1" />
  <import index="20" modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  <import index="21" modelUID="java.awt@java_stub" version="-1" />
  <import index="22" modelUID="jetbrains.mps.core.structure@java_stub" version="-1" />
  <import index="23" modelUID="jetbrains.mps.smodel.action@java_stub" version="-1" />
  <import index="24" modelUID="jetbrains.mps.core.constraints" version="2" />
  <import index="25" modelUID="jetbrains.mps.util@java_stub" version="-1" />
  <import index="26" modelUID="jetbrains.mps.core.editor" version="0" />
  <import index="27" modelUID="jetbrains.mps.baseLanguage.editor" version="-1" />
  <import index="28" modelUID="jetbrains.mps.bootstrap.intentionsLanguage.structure" version="-1" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174643003920">
    <link role="conceptDeclaration" targetNodeId="1.1174642900584" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174643009469">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174643011893">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174642936809" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174643015145">
        <property name="text" value="as" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174643021631">
        <property name="fontStyle" value="ITALIC" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174643042913">
    <link role="conceptDeclaration" targetNodeId="1.1174642788531" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174643053649">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174646659904">
        <property name="text" value="concept" />
        <property name="drawBorder" value="false" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243382874">
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174643056495">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174642800329" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174643056496">
          <link role="conceptDeclaration" targetNodeId="8.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174643059857">
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="textFgColor" value="DARK_MAGENTA" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174647110880">
        <property name="text" value="as" />
        <property name="drawBorder" value="false" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174647124944">
        <property name="fontStyle" value="ITALIC" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1183469103385">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyPostfixHints" id="1183469123152">
            <node role="postfixesFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyPostfixHints_GetPostfixes" id="1183469123153">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469123154">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183469177520">
                  <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183469177521">
                    <property name="name" value="result" />
                    <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1183469177522">
                      <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183469181042">
                        <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183469272253">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469272254">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183469401108">
                      <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183469401109">
                        <property name="name" value="name" />
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183469401110">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183469414172">
                          <link role="baseMethodDeclaration" targetNodeId="25.~NameUtil.decapitalize(java.lang.String):java.lang.String" resolveInfo="decapitalize" />
                          <link role="classConcept" targetNodeId="25.~NameUtil" resolveInfo="NameUtil" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227909675">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227907176">
                              <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1183469416150" />
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469416149">
                                <link role="link" targetNodeId="1.1174642800329" />
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183469425724">
                              <link role="property" targetNodeId="2.1169194664001" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469342502">
                      <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1183469343662">
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469342503">
                          <link role="variableDeclaration" targetNodeId="1183469177521" resolveInfo="result" />
                        </node>
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1183469344733">
                          <link role="classConcept" targetNodeId="25.~NameUtil" resolveInfo="NameUtil" />
                          <link role="baseMethodDeclaration" targetNodeId="25.~NameUtil.splitByCamels(java.lang.String):java.util.List" resolveInfo="splitByCamels" />
                          <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469401111">
                            <link role="variableDeclaration" targetNodeId="1183469401109" resolveInfo="name" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1183469290862">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1183469312761">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1183469315157" />
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227926872">
                        <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227918397">
                          <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1183469294602" />
                          <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469298238">
                            <link role="link" targetNodeId="1.1174642800329" />
                          </node>
                        </node>
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183469300936">
                          <link role="property" targetNodeId="2.1169194664001" />
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227848854">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942855">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1183469279322" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469284801">
                          <link role="link" targetNodeId="1.1174642800329" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1183469287640" />
                    </node>
                  </node>
                  <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1183469318555">
                    <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469318556">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469321701">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression" id="1183469324065">
                          <node role="rValue" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1183469326976">
                            <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1183469328153">
                              <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183469331019">
                                <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                              </node>
                            </node>
                          </node>
                          <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469321702">
                            <link role="variableDeclaration" targetNodeId="1183469177521" resolveInfo="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469334198">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469334199">
                    <link role="variableDeclaration" targetNodeId="1183469177521" resolveInfo="result" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174643207657">
    <link role="conceptDeclaration" targetNodeId="1.1174643105530" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174643213528">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174643213529">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174643213530">
          <property name="editable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="text" value="rule" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174643213531">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1183469466668">
            <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues" id="1183469471357">
              <node role="valuesFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues_GetValues" id="1183469471358">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469471359">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183469480802">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183469480803">
                      <property name="name" value="result" />
                      <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1183469480804">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183469483824">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1183469495419">
                        <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1183469497157">
                          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1183469499352">
                            <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183469488128">
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469488129">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1183469577809">
                        <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1183469577810">
                          <property name="name" value="concept" />
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1183469577811">
                            <link role="concept" targetNodeId="8.1071489090640" />
                          </node>
                          <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227942951">
                            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1183469565809">
                              <link role="concept" targetNodeId="1.1174642788531" />
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227945763">
                                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1183469559102" />
                                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469563173">
                                  <link role="link" targetNodeId="1.1174648101952" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469575009">
                              <link role="link" targetNodeId="1.1174642800329" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1183469580818">
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1183469580819">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469605813">
                            <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1183469615917">
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1183469618436">
                                <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1183469631483">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227905175">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469637365">
                                      <link role="variableDeclaration" targetNodeId="1183469577810" resolveInfo="concept" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183469640005">
                                      <link role="property" targetNodeId="2.1169194664001" />
                                    </node>
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183469623721">
                                    <property name="value" value="typeof_" />
                                  </node>
                                </node>
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469611221">
                                <link role="variableDeclaration" targetNodeId="1183469480803" resolveInfo="result" />
                              </node>
                            </node>
                          </node>
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469643736">
                            <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1183469644867">
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1183469646607">
                                <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1183469654252">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227831233">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469656308">
                                      <link role="variableDeclaration" targetNodeId="1183469577810" resolveInfo="concept" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183469658624">
                                      <link role="property" targetNodeId="2.1169194664001" />
                                    </node>
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1183469649660">
                                    <property name="value" value="check_" />
                                  </node>
                                </node>
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469643737">
                                <link role="variableDeclaration" targetNodeId="1183469480803" resolveInfo="result" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1183469587526">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1183469595946">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1183469597530" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227944918">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469591485">
                                <link role="variableDeclaration" targetNodeId="1183469577810" resolveInfo="concept" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1183469593886">
                                <link role="property" targetNodeId="2.1169194664001" />
                              </node>
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227910247">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469582824">
                              <link role="variableDeclaration" targetNodeId="1183469577810" resolveInfo="concept" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1183469586148" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227957205">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227941178">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1183469507683" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1183469510272">
                          <link role="link" targetNodeId="1.1174648101952" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1183469513627">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1183469542709">
                          <link role="conceptDeclaration" targetNodeId="1.1174642788531" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1183469609217">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1183469609218">
                      <link role="variableDeclaration" targetNodeId="1183469480803" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243462905">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759887">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243762874">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759888">
          <property name="selectable" value="false" />
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759889">
            <property name="vertical" value="false" />
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759890">
              <property name="text" value="applicable" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759891">
              <property name="editable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="for" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198243759892">
              <property name="drawBorder" value="false" />
              <property name="attractsFocus" value="2" />
              <link role="relationDeclaration" targetNodeId="1.1174648101952" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759893">
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759894">
              <property name="text" value="overrides" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1198243759895">
              <link role="relationDeclaration" targetNodeId="1.1195213689297" resolveInfo="overrides" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212574473111">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212574484191">
              <property name="text" value="child type restrictions" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1212574508146">
              <property name="vertical" value="true" />
              <link role="relationDeclaration" targetNodeId="1.1212574183907" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759896">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="text" value=" " />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759897">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759898">
              <property name="editable" value="false" />
              <property name="text" value="do" />
              <property name="drawBorder" value="false" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759899">
              <property name="text" value="{" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243759900">
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759901">
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198243759902">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1195213635060" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243759903">
            <property name="editable" value="false" />
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243472845">
        <property name="text" value="}" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193744398081">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193744398988">
        <property name="text" value="user-defined dependencies(advanced):" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1193744398989">
        <property name="vertical" value="true" />
        <property name="gridLayout" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1193733919555" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174650485278">
    <link role="conceptDeclaration" targetNodeId="1.1174650418652" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174650488858">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1174650432090" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174650488859">
        <link role="conceptDeclaration" targetNodeId="1.1174642743670" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174650491174">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="ITALIC" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174657544132">
    <link role="conceptDeclaration" targetNodeId="1.1174657487114" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174657546993">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174657548745">
        <property name="textFgColor" value="query" />
        <property name="text" value="TYPEOF" />
        <property name="drawBorder" value="false" />
        <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_Color" id="1195144572322">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195144572323">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195144609520">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227880143">
                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1195144643237" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195144667296">
                  <link role="property" targetNodeId="1.1195058053095" resolveInfo="skipDependencyOnCurrent" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195144609522">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195144692280">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1195144695018">
                    <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
                    <link role="variableDeclaration" targetNodeId="21.~Color.GRAY" resolveInfo="GRAY" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1195144672550">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195144672551">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1195144673677">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1195144714682">
                      <link role="classifier" targetNodeId="4.~MPSColors" resolveInfo="MPSColors" />
                      <link role="variableDeclaration" targetNodeId="4.~MPSColors.DARK_GREEN" resolveInfo="DARK_GREEN" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175611212120">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174657554356">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174657509053" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175611215388">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1195058080144">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1195058084382">
        <property name="text" value="skip dependency on current:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1195058080145">
        <link role="relationDeclaration" targetNodeId="1.1195058053095" resolveInfo="addDependencyOnCurrent" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174664104035">
    <link role="conceptDeclaration" targetNodeId="1.1174660718586" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174664105912">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174664105913">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783413" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1174664114276">
        <property name="drawBorder" value="false" />
        <property name="textFgColor" value="query" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1174664145542">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1174664147918">
            <link role="replacementConcept" targetNodeId="1.1174660718586" />
          </node>
        </node>
        <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_Color" id="1206359795157">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206359795158">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1206359825472">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1206359825473">
                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1206359825474" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1206359830967">
                  <link role="property" targetNodeId="1.1206359757216" resolveInfo="checkOnly" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206359825476">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206359825477">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1206359825478">
                    <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
                    <link role="variableDeclaration" targetNodeId="21.~Color.GRAY" resolveInfo="GRAY" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1206359825479">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1206359825480">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1206359825481">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1206359825482">
                      <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
                      <link role="variableDeclaration" targetNodeId="21.~Color.BLACK" resolveInfo="BLACK" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174664105915">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783414" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174664105916">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component" id="1212056578920">
      <link role="editorComponent" targetNodeId="1212056578907" resolveInfo="AbstractEquationInspector" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174665604584">
    <link role="conceptDeclaration" targetNodeId="1.1174665551739" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174665612097">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174665614457">
        <property name="text" value="var" />
        <property name="drawBorder" value="false" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174665627186">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174665653489">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174666290275">
    <link role="conceptDeclaration" targetNodeId="1.1174666260556" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174666294979">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1174666276259" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174666294980">
        <link role="conceptDeclaration" targetNodeId="1.1174665551739" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174666297138">
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174913634157">
    <link role="conceptDeclaration" targetNodeId="1.1174913569543" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174913637237">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174913642958">
        <property name="text" value="judgement match" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174913663382">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174913589936" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174913668524">
        <property name="text" value="with" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1174913693620">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174913577997" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174913703684">
        <property name="text" value="=" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174913712233">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174913619594" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174913832562">
    <link role="conceptDeclaration" targetNodeId="1.1174913798044" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1174913840470">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174913842284">
        <property name="text" value="judgements" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1174913847364">
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1174913854382">
        <property name="vertical" value="true" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174913808889" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174990259011">
    <link role="conceptDeclaration" targetNodeId="1.1174989799417" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174990265997">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1174989822012" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174990265998">
        <link role="conceptDeclaration" targetNodeId="19.1136720037781" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174990269469">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="BOLD_ITALIC" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174990292220">
    <link role="conceptDeclaration" targetNodeId="1.1174989777619" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174990298112">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1174989841903" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174990298113">
        <link role="conceptDeclaration" targetNodeId="19.1137418540378" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174990300162">
          <property name="textFgColor" value="DARK_GREEN" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="BOLD" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1174990323632">
    <link role="conceptDeclaration" targetNodeId="1.1174989242422" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1174990327274">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1174989274720" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1174990327275">
        <link role="conceptDeclaration" targetNodeId="19.1136720037779" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1174990329402">
          <property name="textFgColor" value="DARK_GREEN" />
          <property name="readOnly" value="true" />
          <property name="fontStyle" value="BOLD" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175147712666">
    <link role="conceptDeclaration" targetNodeId="1.1175147670730" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175147714476">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175147714477">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175147714478">
          <property name="editable" value="false" />
          <property name="text" value="subtyping" />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243854491">
          <property name="text" value="rule" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175147714479">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243858337">
          <property name="text" value="{" />
          <property name="selectable" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243869687">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243871721">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243875549">
          <property name="selectable" value="false" />
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243875826">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243875827">
              <property name="drawBorder" value="false" />
              <property name="text" value="weak" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243920500">
              <property name="text" value="=" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1198243875828">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1175607673137" resolveInfo="isWeak" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243875817">
            <property name="vertical" value="false" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243875818">
              <property name="editable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="applicable" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243894221">
              <property name="text" value="for" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198243875819">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1174648101952" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243875820">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243909542">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243909543">
              <property name="text" value="rule" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243911030">
              <property name="text" value="{" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198243875822">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243875823">
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198243875824">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1175147624276" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243875825">
            <property name="editable" value="false" />
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198243861558">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175496210097">
    <link role="conceptDeclaration" targetNodeId="1.1175496148685" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175496213287">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1196780008705">
        <property name="text" value="!" />
        <property name="selectable" value="false" />
        <property name="textFgColor" value="red" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175496216836">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="GIVETYPE" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175519380362">
        <property name="text" value="(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175496229572">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1175496171063" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175519384020">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175496245699">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="TO" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175496250217">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1175496179767" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175496799986">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175517966228">
    <link role="conceptDeclaration" targetNodeId="1.1175517767210" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175517968839">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175517970856">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="ERROR" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175517983013">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;error string&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1175517851849" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175517986109">
        <property name="text" value="-&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175517990173">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;node to highlight&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1175517865066" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175518052514">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210773187492">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210773247720">
        <property name="text" value="intention to fix an error(optional)" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210784741834">
        <property name="noTargetText" value="&lt;no intention&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1210784718411" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175518078638">
    <link role="conceptDeclaration" targetNodeId="1.1175517400280" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175518082889">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175518084610">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="ASSERT" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175518093442">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1175517761460" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175518098600">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="text" value="REPORT_ERROR" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175518108070">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;error string&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1175517851849" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175518115931">
        <property name="text" value="-&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175518122026">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;node to highlight&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1175517865066" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175518125090">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175594923155">
    <link role="conceptDeclaration" targetNodeId="1.1175594888091" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175594925954">
      <property name="text" value="typechecker" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176543989297">
    <link role="conceptDeclaration" targetNodeId="1.1176543928247" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176543992252">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176543998552">
        <property name="text" value="isSubtype(" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1177407850739">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1177407855849">
            <link role="replacementConcept" targetNodeId="1.1176543928247" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176544005866">
        <link role="relationDeclaration" targetNodeId="1.1176543945045" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176544008680">
        <property name="text" value=":&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176544012573">
        <link role="relationDeclaration" targetNodeId="1.1176543950311" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176544016091">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176544315456">
    <link role="conceptDeclaration" targetNodeId="1.1176544042499" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176544322411">
      <property name="text" value="type" />
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component" id="1176544407635">
      <link role="editorComponent" targetNodeId="1176544346178" resolveInfo="_NotInRules_Component" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.EditorComponentDeclaration" id="1176544346178">
    <property name="name" value="_NotInRules_Component" />
    <link role="conceptDeclaration" targetNodeId="2.1133920641626" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176544384333">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176544388226">
        <property name="text" value="do not use in rules" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176544395384">
        <property name="text" value="use in queries only" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176547907356">
    <link role="conceptDeclaration" targetNodeId="1.1176547843728" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176547910436">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176547913156">
        <link role="relationDeclaration" targetNodeId="1.1176547881822" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176547916471">
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176547925817">
        <link role="relationDeclaration" targetNodeId="1.1176547896901" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176547981553">
    <link role="conceptDeclaration" targetNodeId="1.1176547808367" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176547986555">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176548000091">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176548000092">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="foreach" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176548004531">
          <property name="text" value="(" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1176548009689">
          <property name="separatorText" value=";" />
          <link role="relationDeclaration" targetNodeId="1.1176547942567" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176548017457">
          <property name="text" value=") {" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176548036430">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176548036431">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176548041823">
          <link role="relationDeclaration" targetNodeId="20.1154032183016" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176548046138">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176558936502">
    <link role="conceptDeclaration" targetNodeId="1.1176558773329" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176558940332">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176558946460">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558946461">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="coerce" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558952494">
          <property name="text" value="(" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176558961668">
          <link role="relationDeclaration" targetNodeId="1.1176558919376" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558964107">
          <property name="text" value=":&lt;" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176558972609">
          <link role="relationDeclaration" targetNodeId="1.1176558876970" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558976001">
          <property name="text" value=") {" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1176558983661">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558985116">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1176558995383">
          <link role="relationDeclaration" targetNodeId="1.1176558868203" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1176558998791">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept" id="1176893712697">
    <property name="name" value="Colors" />
    <node role="staticField" type="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" id="1176893715917">
      <property name="name" value="BROWN" />
      <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1176893963697">
        <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
      </node>
      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1176893742238">
        <link role="baseMethodDeclaration" targetNodeId="21.~Color.&lt;init&gt;(int,int,int)" resolveInfo="Color" />
        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1176893785509">
          <property name="value" value="200" />
        </node>
        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1176893789870">
          <property name="value" value="150" />
        </node>
        <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1176893791481">
          <property name="value" value="0" />
        </node>
      </node>
    </node>
    <node role="visibility" type="jetbrains.mps.baseLanguage.structure.PublicVisibility" id="1178550081238" />
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1176905448397">
    <link role="conceptDeclaration" targetNodeId="1.1174642743670" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1176905455508">
      <property name="text" value="&lt;condition&gt;" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1177068562050">
    <link role="conceptDeclaration" targetNodeId="1.1177068340529" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177068566614">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177068570382">
        <property name="text" value="immediateSupertypes(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177068577728">
        <link role="relationDeclaration" targetNodeId="1.1177068475017" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177068580230">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1177406340412">
    <link role="conceptDeclaration" targetNodeId="1.1177406296561" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177406341885">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177406341886">
        <property name="text" value="isStrongSubtype(" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1177407881709">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1177408239632">
            <link role="replacementConcept" targetNodeId="1.1176543928247" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177406341887">
        <link role="relationDeclaration" targetNodeId="1.1176543945045" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177406341888">
        <property name="text" value=":&lt;&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177406341889">
        <link role="relationDeclaration" targetNodeId="1.1176543950311" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177406341890">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1177514449897">
    <link role="conceptDeclaration" targetNodeId="1.1177514343197" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177514452383">
      <property name="name" value="statementBox" />
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177514752404">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177514755928">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="match" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177514769274">
          <link role="relationDeclaration" targetNodeId="1.1177514369598" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177514772276">
          <property name="textFgColor" value="DARK_BLUE" />
          <property name="text" value="with" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515195746">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515199263">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1177515385057">
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1177514347409" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515332636">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515336930">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515332637">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515332638">
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515332640">
              <property name="textFgColor" value="DARK_BLUE" />
              <property name="text" value="default" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515332641">
              <property name="text" value="-&gt; {" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515332642">
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515358791">
              <property name="text" value="  " />
              <property name="selectable" value="false" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177515332644">
              <link role="relationDeclaration" targetNodeId="1.1177514345236" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515332645">
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515332647">
              <property name="text" value="}" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1177514914281">
    <link role="conceptDeclaration" targetNodeId="1.1177514840044" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515022781">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515022782">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177515022783">
          <link role="relationDeclaration" targetNodeId="1.1177514849858" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515022784">
          <property name="text" value="-&gt; {" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1177515041176">
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515043210">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1177515046446">
          <link role="relationDeclaration" targetNodeId="1.1177514864202" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1177515050918">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1178870987809">
    <link role="conceptDeclaration" targetNodeId="1.1178870617262" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178870989473">
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178870989474">
        <property name="text" value="coerce" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1178879252450">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1178879258086">
            <link role="replacementConcept" targetNodeId="1.1178870617262" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178870989475">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1178870989476">
        <link role="relationDeclaration" targetNodeId="1.1176558919376" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178870989477">
        <property name="text" value=":&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1178870989478">
        <link role="relationDeclaration" targetNodeId="1.1176558876970" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178870989479">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1178871551806">
    <link role="conceptDeclaration" targetNodeId="1.1178871491133" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178871557633">
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178871557634">
        <property name="text" value="coerceStrong" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1178879288682">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1178879298074">
            <link role="replacementConcept" targetNodeId="1.1178870617262" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178871557635">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1178871557636">
        <link role="relationDeclaration" targetNodeId="1.1176558919376" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178871557637">
        <property name="text" value=":&lt;&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1178871557638">
        <link role="relationDeclaration" targetNodeId="1.1176558876970" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178871557639">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1179479566870">
    <link role="conceptDeclaration" targetNodeId="1.1179479408386" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1179479609824">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179479627170">
        <property name="text" value="JOIN (" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1179479667160">
        <property name="vertical" value="false" />
        <property name="separatorText" value="|" />
        <link role="relationDeclaration" targetNodeId="1.1179479418730" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206015396370">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1182937430143">
    <link role="conceptDeclaration" targetNodeId="1.1182937366968" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1182937435473">
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="1182951941449" resolveInfo="RemoveHelginsJudgement" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182937438866">
        <property name="textBgColor" value="magenta" />
        <property name="text" value="[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_AttributedNodeCell" id="1182952122881" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182937453338">
        <property name="textBgColor" value="magenta" />
        <property name="text" value="]" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182937456731">
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182937536374">
        <property name="textBgColor" value="green" />
        <property name="text" value="[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1182937540001">
        <link role="relationDeclaration" targetNodeId="1.1182937420689" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182937542831">
        <property name="textBgColor" value="green" />
        <property name="text" value="]" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1182938003682">
    <link role="conceptDeclaration" targetNodeId="1.1182937959055" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1182938010356">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1182938015436">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182938025297">
          <property name="text" value="test suite" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1182938047190">
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1182938076817">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1182938097476">
        <property name="vertical" value="true" />
        <link role="relationDeclaration" targetNodeId="1.1182937980212" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1182950942270">
    <property name="name" value="AddHelginsJudgement" />
    <property name="everyModel" value="true" />
    <link role="applicableConcept" targetNodeId="2.1133920641626" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1182951006983">
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1182951006984">
        <property name="keycode" value="VK_J" />
        <property name="modifiers" value="ctrl+alt+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1182951006985">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182951006986">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182951714864">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182951721555">
              <link role="baseMethodDeclaration" targetNodeId="12.~HelginsJudgement_AnnotationLink.setHelginsJudgement(jetbrains.mps.core.structure.BaseConcept,jetbrains.mps.bootstrap.helgins.structure.HelginsJudgement):void" resolveInfo="setHelginsJudgement" />
              <link role="classConcept" targetNodeId="12.~HelginsJudgement_AnnotationLink" resolveInfo="HelginsJudgement_AnnotationLink" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721325">
                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1182951726246" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182951782146" />
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721784">
                <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908812">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227837968">
                    <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1182951744006" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation" id="1182951745910" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation" id="1182951751319">
                    <link role="concept" targetNodeId="1.1182937366968" />
                  </node>
                </node>
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182951773714" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1182951013269">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182951013270">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182951022352">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1182951049472">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227905258">
                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1182951049475" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1182951053197">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1182951057342">
                    <link role="conceptDeclaration" targetNodeId="1.1182937366968" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1182951941449">
    <property name="name" value="RemoveHelginsJudgement" />
    <link role="applicableConcept" targetNodeId="1.1182937366968" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1182951956122">
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1182951956123">
        <property name="keycode" value="VK_J" />
        <property name="modifiers" value="ctrl+alt+shift" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1182951956124">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1182951956125">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1182951964284">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1182952038392">
              <link role="baseMethodDeclaration" targetNodeId="12.~HelginsJudgement_AnnotationLink.setHelginsJudgement(jetbrains.mps.core.structure.BaseConcept,jetbrains.mps.bootstrap.helgins.structure.HelginsJudgement):void" resolveInfo="setHelginsJudgement" />
              <link role="classConcept" targetNodeId="12.~HelginsJudgement_AnnotationLink" resolveInfo="HelginsJudgement_AnnotationLink" />
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1182952058936">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204672721670">
                  <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227914505">
                    <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1182952058941" />
                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation" id="1182952058940" />
                  </node>
                  <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAdapterOperation" id="1182952058938" />
                </node>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1182952072240">
                  <link role="classifier" targetNodeId="22.~BaseConcept" resolveInfo="BaseConcept" />
                </node>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1182952044035" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1185788720441">
    <link role="conceptDeclaration" targetNodeId="1.1185788614172" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185788725255">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185788729585">
        <property name="textFgColor" value="DARK_GREEN" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1185788737962">
        <link role="relationDeclaration" targetNodeId="1.1185788644032" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185802004578">
      <property name="text" value="NORMAL TYPE CLAUSE" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1185805103747">
    <link role="conceptDeclaration" targetNodeId="1.1185805035213" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185805108468">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185805111329">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185805116753">
          <property name="text" value="WHEN CONCRETE" />
          <property name="textFgColor" value="DARK_GREEN" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185805125474">
          <property name="text" value="(" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1185805131335">
          <link role="relationDeclaration" targetNodeId="1.1185805056450" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1205762043713">
          <property name="text" value="as" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1205762295902">
          <link role="relationDeclaration" targetNodeId="1.1205761991995" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185805133322">
          <property name="text" value=") {" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185805147153">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185805148498">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1185805153735">
          <link role="relationDeclaration" targetNodeId="1.1185805047793" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185805156893">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1188473558532">
    <link role="conceptDeclaration" targetNodeId="1.1188473524530" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188473560034">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188473560035">
        <property name="text" value="MEET (" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1188473560036">
        <property name="vertical" value="false" />
        <property name="separatorText" value="&amp;" />
        <link role="relationDeclaration" targetNodeId="1.1188473537547" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1202228508657">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1188813215375">
    <link role="conceptDeclaration" targetNodeId="1.1188811367543" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188813217737">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188813217738">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217739">
          <property name="editable" value="false" />
          <property name="text" value="comparison rule " />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1188813217740">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217741">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="text" value=" " />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188813217742">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217743">
          <property name="editable" value="false" />
          <property name="text" value="applicable for " />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1188813217744">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1174648101952" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188820789308">
          <property name="text" value="," />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1188820797560">
          <link role="relationDeclaration" targetNodeId="1.1188820750135" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217745">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="text" value=" " />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201607970982">
        <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellLayout_Flow" id="1201607970983" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201607970984">
          <property name="editable" value="false" />
          <property name="text" value="rule" />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201607970985">
          <property name="editable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188813217747">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217748">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1188813217749">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1175147624276" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1188813217750">
        <property name="editable" value="false" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1188813217751">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201607929194">
          <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellLayout_Flow" id="1201607929195" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201607929196">
            <property name="text" value="weak" />
            <property name="drawBorder" value="false" />
            <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201607929197">
            <property name="text" value="=" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1188813217753">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1175607673137" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1193663082499">
    <link role="conceptDeclaration" targetNodeId="1.1174658326157" resolveInfo="CreateEquationStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193663097813">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193663097814">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783413" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1193663097815">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1193663097816">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1193663097817">
            <link role="replacementConcept" targetNodeId="1.1174660718586" resolveInfo="AbstractEquationStatement" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193663097818">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783414" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663097819">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193663110445">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193663110446">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663110447">
          <property name="text" value="node to check =" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193663110448">
          <property name="noTargetText" value="&lt;auto&gt;" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1174662598553" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193663110449">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663110450">
          <property name="text" value="error string =" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193663110451">
          <link role="relationDeclaration" targetNodeId="1.1180447237840" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663139848">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663144396">
        <property name="text" value="advanced:" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193663118797">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193663123158">
          <property name="text" value="direction =" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1193663158383">
          <link role="relationDeclaration" targetNodeId="1.1193662477920" resolveInfo="direction" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1193734047905">
    <link role="conceptDeclaration" targetNodeId="1.1193733698246" resolveInfo="Dependency" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1207648211850">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1207648211851">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207648211852">
          <property name="text" value="target concept:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1207648211853">
          <link role="relationDeclaration" targetNodeId="1.1193733730717" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1207648211854">
            <link role="conceptDeclaration" targetNodeId="8.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1207648211855">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207648211856">
          <property name="text" value=" find source:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1207648211857">
          <link role="relationDeclaration" targetNodeId="1.1193733727481" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1207648229378">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207648233896">
          <property name="text" value="source concept(optional):" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1207648246932">
          <property name="noTargetText" value="&lt;auto&gt;" />
          <link role="relationDeclaration" targetNodeId="1.1207648185033" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1207648246933">
            <link role="conceptDeclaration" targetNodeId="8.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1207648250873">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1195214383471">
    <link role="conceptDeclaration" targetNodeId="1.1195214364922" resolveInfo="NonTypesystemRule" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1195214394145">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1195214394146">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1195214394147">
          <property name="editable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="text" value="non" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242106122">
          <property name="text" value="type" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242108312">
          <property name="text" value="system" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242110455">
          <property name="text" value="rule" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1195214394148">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
          <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1195214394149">
            <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues" id="1195214394150">
              <node role="valuesFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_PropertyValues_GetValues" id="1195214394151">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195214394152">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195214394153">
                    <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195214394154">
                      <property name="name" value="result" />
                      <node role="type" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListType" id="1195214394155">
                        <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1195214394156">
                          <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                        </node>
                      </node>
                      <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression" id="1195214394157">
                        <node role="creator" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ListCreatorWithInit" id="1195214394158">
                          <node role="elementType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1195214394159">
                            <link role="classifier" targetNodeId="6.~String" resolveInfo="String" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195214394160">
                    <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195214394161">
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1195214394162">
                        <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1195214394163">
                          <property name="name" value="concept" />
                          <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1195214394164">
                            <link role="concept" targetNodeId="8.1071489090640" resolveInfo="ConceptDeclaration" />
                          </node>
                          <node role="initializer" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227934241">
                            <node role="operand" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1195214394167">
                              <link role="concept" targetNodeId="1.1174642788531" resolveInfo="ConceptReference" />
                              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227944858">
                                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1195214394170" />
                                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195214394169">
                                  <link role="link" targetNodeId="1.1174648101952" />
                                </node>
                              </node>
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195214394166">
                              <link role="link" targetNodeId="1.1174642800329" />
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1195214394171">
                        <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1195214394172">
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195214394173">
                            <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1195214394174">
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1195214394176">
                                <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1195214394177">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227832749">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394180">
                                      <link role="variableDeclaration" targetNodeId="1195214394163" resolveInfo="concept" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195214394179">
                                      <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
                                    </node>
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195214394181">
                                    <property name="value" value="typeof_" />
                                  </node>
                                </node>
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394175">
                                <link role="variableDeclaration" targetNodeId="1195214394154" resolveInfo="result" />
                              </node>
                            </node>
                          </node>
                          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195214394182">
                            <node role="expression" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression" id="1195214394183">
                              <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation" id="1195214394185">
                                <node role="argument" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1195214394186">
                                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227880029">
                                    <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394189">
                                      <link role="variableDeclaration" targetNodeId="1195214394163" resolveInfo="concept" />
                                    </node>
                                    <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195214394188">
                                      <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
                                    </node>
                                  </node>
                                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1195214394190">
                                    <property name="value" value="check_" />
                                  </node>
                                </node>
                              </node>
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394184">
                                <link role="variableDeclaration" targetNodeId="1195214394154" resolveInfo="result" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1195214394191">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1195214394192">
                            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1195214394193" />
                            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227908475">
                              <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394196">
                                <link role="variableDeclaration" targetNodeId="1195214394163" resolveInfo="concept" />
                              </node>
                              <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1195214394195">
                                <link role="property" targetNodeId="2.1169194664001" resolveInfo="name" />
                              </node>
                            </node>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227892571">
                            <node role="operand" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394199">
                              <link role="variableDeclaration" targetNodeId="1195214394163" resolveInfo="concept" />
                            </node>
                            <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsNotNullOperation" id="1195214394198" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227851083">
                      <node role="operand" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1204227899644">
                        <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1195214394205" />
                        <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1195214394204">
                          <link role="link" targetNodeId="1.1174648101952" />
                        </node>
                      </node>
                      <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1195214394201">
                        <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1195214394202">
                          <link role="conceptDeclaration" targetNodeId="1.1174642788531" resolveInfo="ConceptReference" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1195214394206">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1195214394207">
                      <link role="variableDeclaration" targetNodeId="1195214394154" resolveInfo="result" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242165437">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242177973">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242180288">
          <property name="text" value="  " />
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242185288">
          <property name="selectable" value="false" />
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242185697">
            <property name="vertical" value="false" />
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242185698">
              <property name="editable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="applicable" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242221914">
              <property name="text" value="for" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198242185699">
              <property name="drawBorder" value="false" />
              <property name="attractsFocus" value="2" />
              <link role="relationDeclaration" targetNodeId="1.1174648101952" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242185700">
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242185701">
              <property name="text" value="overrides" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1198242185702">
              <link role="relationDeclaration" targetNodeId="1.1195213689297" resolveInfo="overrides" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242185703">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <property name="text" value=" " />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242245493">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242249168">
              <property name="text" value="do" />
              <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242245494">
              <property name="editable" value="false" />
              <property name="text" value="{" />
              <property name="drawBorder" value="false" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1198242185705">
            <property name="drawBorder" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242185706">
              <property name="drawBorder" value="false" />
              <property name="selectable" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1198242185707">
              <property name="drawBorder" value="false" />
              <link role="relationDeclaration" targetNodeId="1.1195213635060" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242185708">
            <property name="editable" value="false" />
            <property name="text" value="}" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1198242332213">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1197936731292">
    <link role="conceptDeclaration" targetNodeId="1.1185788561607" resolveInfo="TypeClause" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1197936734497">
      <property name="text" value="type clause" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1201607811701">
    <link role="conceptDeclaration" targetNodeId="1.1201607707634" resolveInfo="EliminationRule" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201608009612">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201608009613">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009614">
          <property name="editable" value="false" />
          <property name="text" value="replacement rule " />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1201608009615">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009616">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="text" value=" " />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201608009617">
        <property name="vertical" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009618">
          <property name="editable" value="false" />
          <property name="text" value="applicable for " />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1201608009619">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1174648101952" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009620">
          <property name="text" value="&lt;:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1201608009621">
          <link role="relationDeclaration" targetNodeId="1.1201607798918" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009622">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
        <property name="text" value=" " />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201608009623">
        <node role="cellLayout" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellLayout_Flow" id="1201608009624" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009625">
          <property name="editable" value="false" />
          <property name="text" value="rule" />
          <property name="drawBorder" value="false" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009626">
          <property name="editable" value="false" />
          <property name="text" value="{" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1201608009627">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009628">
          <property name="drawBorder" value="false" />
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1201608009629">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1175147624276" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201608009630">
        <property name="editable" value="false" />
        <property name="text" value="}" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1201618326424">
    <link role="conceptDeclaration" targetNodeId="1.1201618299781" resolveInfo="ErrorInfoExpression" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1201618328692">
      <property name="text" value="equationInfo" />
      <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1203432632960">
    <link role="conceptDeclaration" targetNodeId="1.1203432538703" resolveInfo="ListVarDeclaration" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203432636915">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203432640230">
        <property name="text" value="list_var" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1203432645201">
        <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203432647562">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1203432759338">
    <link role="conceptDeclaration" targetNodeId="1.1203432734351" resolveInfo="ListVarReference" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1203432771309">
      <link role="relationDeclaration" targetNodeId="1.1203432751071" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1203432771310">
        <link role="conceptDeclaration" targetNodeId="1.1203432538703" resolveInfo="ListVarDeclaration" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1203432777530">
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1203525179882">
    <link role="conceptDeclaration" targetNodeId="1.1203525107398" resolveInfo="VariableProviderItem" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203525184479">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203525186857">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203525190923">
          <property name="text" value="applicable concept" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1203525197801">
          <link role="relationDeclaration" targetNodeId="1.1203525134302" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1203525197802">
            <link role="conceptDeclaration" targetNodeId="8.1071489090640" resolveInfo="ConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1203525199930">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1203525209137">
        <link role="relationDeclaration" targetNodeId="1.1203525118638" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1203525315896">
    <link role="conceptDeclaration" targetNodeId="1.1203524059255" resolveInfo="VariableProviders" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203525318742">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203525339049">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203525339050">
          <property name="text" value="variable providers" />
          <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203525349789">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1203525361216">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Indent" id="1203525361217">
          <property name="selectable" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1203525367940">
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1203525303344" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1203525371536">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1205762226590">
    <link role="conceptDeclaration" targetNodeId="1.1205762105978" resolveInfo="WhenConcreteVariableDeclaration" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1205762236138">
      <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
      <link role="styleClass" targetNodeId="27.1198596033801" resolveInfo="LocalVariable" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1205762719474">
    <link role="conceptDeclaration" targetNodeId="1.1205762656241" resolveInfo="WhenConcreteVariableReference" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1205762743622">
      <link role="relationDeclaration" targetNodeId="1.1205762683928" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1205762743623">
        <link role="conceptDeclaration" targetNodeId="1.1205762105978" resolveInfo="WhenConcreteVariableDeclaration" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1205762746782">
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1207055586167">
    <link role="conceptDeclaration" targetNodeId="1.1207055528241" resolveInfo="WarningStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1207055587763">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207055587764">
        <property name="textFgColor" value="DARK_GREEN" />
        <property name="drawBorder" value="false" />
        <property name="text" value="WARNING" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1207055587765">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;error string&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1207055552304" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207055587766">
        <property name="text" value="-&gt;" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1207055587767">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;node to highlight&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1207055552305" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1207055587768">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210839954269">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210839954270">
        <property name="text" value="intention to fix an error(optional)" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210839954271">
        <property name="noTargetText" value="&lt;no intention&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1210839909256" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1210784521404">
    <link role="conceptDeclaration" targetNodeId="1.1210784285454" resolveInfo="HelginsIntention" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210784541907">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1210784545487">
        <link role="relationDeclaration" targetNodeId="1.1210784371269" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1210784545488">
          <link role="conceptDeclaration" targetNodeId="28.1192794744107" resolveInfo="IntentionDeclaration" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1210784570133">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210784572698">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1210784579325">
        <link role="relationDeclaration" targetNodeId="1.1210784493590" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210784583436">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1210784598250">
    <link role="conceptDeclaration" targetNodeId="1.1210784384552" resolveInfo="HelginsIntentionArgument" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1210784602439">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1210784607113">
        <link role="relationDeclaration" targetNodeId="1.1210784426618" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1210784607114">
          <link role="conceptDeclaration" targetNodeId="28.1210781279743" resolveInfo="IntentionArgument" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1210784610460">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
            <link role="styleClass" targetNodeId="27.1198595398954" resolveInfo="Field" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1210784623369">
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1210784655987">
        <link role="relationDeclaration" targetNodeId="1.1210784642750" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.EditorComponentDeclaration" id="1212056578907">
    <property name="name" value="AbstractEquationInspector" />
    <link role="conceptDeclaration" targetNodeId="1.1174660718586" resolveInfo="AbstractEquationStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056578909">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056578910">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056578911">
          <property name="text" value="node to check =" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1212056578912">
          <property name="noTargetText" value="&lt;auto&gt;" />
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1174662598553" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056578913">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056578914">
          <property name="text" value="error string =" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1212056578915">
          <link role="relationDeclaration" targetNodeId="1.1180447237840" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056578916">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056578917">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056578918">
          <property name="text" value="check only" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212056578919">
          <link role="relationDeclaration" targetNodeId="1.1206359757216" resolveInfo="checkOnly" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1212056593859">
    <link role="conceptDeclaration" targetNodeId="1.1212056081426" resolveInfo="AbstractInequationStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056631968">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1212056631969">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783413" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1212056631970">
        <property name="drawBorder" value="false" />
        <property name="textFgColor" value="query" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1212056631971">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_ReplaceNode_CustomNodeConcept" id="1212056631972">
            <link role="replacementConcept" targetNodeId="1.1174660718586" resolveInfo="AbstractEquationStatement" />
          </node>
        </node>
        <node role="cellForegroundFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_Color" id="1212056631973">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212056631974">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1212056631975">
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.DotExpression" id="1212056631976">
                <node role="operand" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1212056631977" />
                <node role="operation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1212056631978">
                  <link role="property" targetNodeId="1.1206359757216" resolveInfo="checkOnly" />
                </node>
              </node>
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212056631979">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1212056631980">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1212056631981">
                    <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
                    <link role="variableDeclaration" targetNodeId="21.~Color.GRAY" resolveInfo="GRAY" />
                  </node>
                </node>
              </node>
              <node role="ifFalseStatement" type="jetbrains.mps.baseLanguage.structure.BlockStatement" id="1212056631982">
                <node role="statements" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1212056631983">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1212056631984">
                    <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference" id="1212056631985">
                      <link role="classifier" targetNodeId="21.~Color" resolveInfo="Color" />
                      <link role="variableDeclaration" targetNodeId="21.~Color.BLACK" resolveInfo="BLACK" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_NonEmptyProperty" id="1212056656052">
        <property name="fontSize" value="8" />
        <link role="relationDeclaration" targetNodeId="1.1212056105818" resolveInfo="inequationPriority" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1212056631986">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1174660783414" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056631987">
        <property name="text" value=";" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056663037">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component" id="1212056663038">
        <link role="editorComponent" targetNodeId="1212056578907" resolveInfo="AbstractEquationInspector" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212056674822">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212056682592">
          <property name="text" value="priority:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212056680433">
          <link role="relationDeclaration" targetNodeId="1.1212056105818" resolveInfo="inequationPriority" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1212573766896">
    <link role="conceptDeclaration" targetNodeId="1.1212573344738" resolveInfo="ChildTypeRestriction" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1212573805776">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212573843999">
        <property name="text" value="TYPEOF" />
        <property name="textFgColor" value="DARK_GREEN" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212573848564">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212573870101">
        <property name="text" value="this" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212573863818">
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1212575851420">
        <link role="relationDeclaration" targetNodeId="1.1212575801821" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1212575851421">
          <link role="conceptDeclaration" targetNodeId="8.1071489288298" resolveInfo="LinkDeclaration" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212575856814">
            <property name="readOnly" value="true" />
            <property name="fontStyle" value="ITALIC" />
            <link role="relationDeclaration" targetNodeId="8.1071599776563" resolveInfo="role" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212573858331">
        <property name="text" value=")" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1212671242541">
        <property name="text" value="as" />
        <link role="styleClass" targetNodeId="27.1186415544875" resolveInfo="KeyWord" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212671248638">
        <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212573934882">
        <property name="fontStyle" value="BOLD" />
        <link role="relationDeclaration" targetNodeId="1.1212573745114" resolveInfo="restrictionKind" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1212574031164">
        <link role="relationDeclaration" targetNodeId="1.1212573461488" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1212763693115">
    <link role="conceptDeclaration" targetNodeId="1.1212763614690" resolveInfo="ChildTypeRestrictionReference" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1212763726768">
      <link role="relationDeclaration" targetNodeId="1.1212763674348" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1212763726769">
        <link role="conceptDeclaration" targetNodeId="1.1212573344738" resolveInfo="ChildTypeRestriction" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1212763729005">
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
        </node>
      </node>
    </node>
  </node>
</model>

