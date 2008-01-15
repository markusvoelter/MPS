<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.baseLanguage.findUsages">
  <persistence version="1"/>
  <refactoringHistory/>
  <language namespace="jetbrains.mps.bootstrap.findUsagesLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.actions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.constraints" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.helgins" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.findUsagesLanguage.structure" version="-1"/>
  </language>
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.helgins" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.intentions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.constraints" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.actions" version="-1"/>
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.helgins" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.intentions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.scripts" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.constraints" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.actions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="-1"/>
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.intentions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.scripts" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.helgins" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.constraints" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.actions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.baseLanguage.findUsages" version="-1"/>
  </language>
  <language namespace="jetbrains.mps.quotation">
    <languageAspect modelUID="jetbrains.mps.quotation.helgins" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.quotation.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.quotation.structure" version="-1"/>
  </language>
  <language namespace="jetbrains.mps.core">
    <languageAspect modelUID="jetbrains.mps.core.constraints" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.core.editor" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.core.actions" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.core.scripts" version="-1"/>
    <languageAspect modelUID="jetbrains.mps.core.structure" version="-1"/>
  </language>
  <maxImportIndex value="10"/>
  <import index="1" modelUID="jetbrains.mps.baseLanguage.structure" version="-1"/>
  <import index="2" modelUID="jetbrains.mps.findUsages@java_stub" version="-1"/>
  <import index="3" modelUID="jetbrains.mps.ide.findusages.model.searchquery@java_stub" version="-1"/>
  <import index="4" modelUID="jetbrains.mps.smodel@java_stub" version="-1"/>
  <import index="5" modelUID="jetbrains.mps.bootstrap.structureLanguage.findUsages" version="-1"/>
  <import index="6" modelUID="jetbrains.mps.ide.findusages.model.result@java_stub" version="-1"/>
  <import index="7" modelUID="java.util@java_stub" version="-1"/>
  <import index="8" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="-1"/>
  <import index="9" modelUID="jetbrains.mps.baseLanguage.constraints" version="-1"/>
  <import index="10" modelUID="java.lang@java_stub" version="-1"/>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200309609796">
    <property name="name" value="OverridingInstanceMethods"/>
    <property name="description" value="Overriding Methods"/>
    <link role="forConcept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200309609797">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200309609798">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310113213">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1200310113214">
            <property name="value" value="true"/>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200309609799">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200309609800">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200398497777">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200398497778">
            <property name="name" value="searchedNode"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200398497779">
              <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200398497780">
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200398497781">
                <link role="concept" targetNodeId="1.1068580123165" resolveInfo="InstanceMethodDeclaration"/>
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200398497782">
                <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200398497783">
                  <link role="baseMethodDeclaration"
                        targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                        resolveInfo="getNodePointer"/>
                  <node role="instance"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                        id="1200398497784"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200398497785">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200398497786">
            <link role="variableDeclaration" targetNodeId="1200398497778" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200398497787"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200413055054">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200413055055">
            <property name="name" value="nodes"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200413055056">
              <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200413088620">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200413088621">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200413088622">
                  <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200413094921">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200413094922">
            <property name="name" value="results"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413094923">
              <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413103894">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200413109881">
              <link role="baseMethodDeclaration" targetNodeId="7.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413116836">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ExecuteFinderStatement"
              id="1200413120853">
          <link role="finder" targetNodeId="1200310473077" resolveInfo="DerivedClasses"/>
          <node role="nodes" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200413132278">
            <link role="variableDeclaration" targetNodeId="1200413055055" resolveInfo="nodes"/>
          </node>
          <node role="results" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200413136436">
            <link role="variableDeclaration" targetNodeId="1200413094922" resolveInfo="results"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200413052067"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
              id="1200413446949">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                id="1200413446950">
            <property name="name" value="result"/>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                id="1200413467563">
            <link role="variableDeclaration" targetNodeId="1200413094922" resolveInfo="results"/>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413446952">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200413488720">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200413488721">
                <property name="name" value="classNode"/>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200413488722">
                  <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200413513201">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"
                        id="1200413513202">
                    <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200413514064">
                    <link role="baseMethodDeclaration"
                          targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode"/>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200413514065">
                      <link role="baseMethodDeclaration"
                            targetNodeId="6.~SearchResult.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                            resolveInfo="getNodePointer"/>
                      <node role="instance"
                            type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                            id="1200413514066">
                        <link role="variable" targetNodeId="1200413446950" resolveInfo="result"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
                  id="1200413471959">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                    id="1200413471960">
                <property name="name" value="sMethod"/>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413471961">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200413471962">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1200413471963">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression"
                          id="1200413471964">
                      <node role="rightExpression"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413471965">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                              id="1200413471966"/>
                        <node role="leftExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413471967">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                id="1200413471968">
                            <link role="link" targetNodeId="1.1068580123134"/>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                id="1200413471969">
                            <link role="variableDeclaration" targetNodeId="1200398497778" resolveInfo="searchedNode"/>
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413471970">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                              id="1200413471971"/>
                        <node role="leftExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413471972">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                id="1200413471973">
                            <link role="link" targetNodeId="1.1068580123134"/>
                          </node>
                          <node role="leftExpression"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                id="1200413471974">
                            <link role="variable" targetNodeId="1200413471960" resolveInfo="sMethod"/>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200413471975">
                      <link role="baseMethodDeclaration" targetNodeId="10.~String.equals(java.lang.Object):boolean"
                            resolveInfo="equals"/>
                      <node role="instance"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413471976">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess"
                              id="1200413526900">
                          <link role="property" targetNodeId="1.1083152972672" resolveInfo="name"/>
                        </node>
                        <node role="leftExpression"
                              type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                              id="1200413471978">
                          <link role="variable" targetNodeId="1200413471960" resolveInfo="sMethod"/>
                        </node>
                      </node>
                      <node role="actualArgument"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413471979">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess"
                              id="1200413528198">
                          <link role="property" targetNodeId="1.1083152972672" resolveInfo="name"/>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413471981">
                          <link role="variableDeclaration" targetNodeId="1200398497778" resolveInfo="searchedNode"/>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413471982">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                          id="1200413471983">
                      <node role="localVariableDeclaration"
                            type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413471984">
                        <property name="name" value="same"/>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1200413471985"/>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant"
                              id="1200413471986">
                          <property name="value" value="true"/>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1200413471987">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413471988">
                        <node role="statement"
                              type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                              id="1200413471989">
                          <node role="localVariableDeclaration"
                                type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413471990">
                            <property name="name" value="searchedParamType"/>
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                                  id="1200413471991">
                              <link role="classifier" targetNodeId="10.~String" resolveInfo="String"/>
                            </node>
                            <node role="initializer"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                  id="1200413471992">
                              <node role="nodeOperation"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall"
                                    id="1200413471993">
                                <link role="conceptMethodDeclaration" targetNodeId="9.1199318924019"
                                      resolveInfo="getErasureSignature"/>
                              </node>
                              <node role="leftExpression"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                    id="1200413471994">
                                <node role="leftExpression"
                                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                      id="1200413471995">
                                  <node role="leftExpression"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                        id="1200413471996">
                                    <node role="leftExpression"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413471997">
                                      <link role="variableDeclaration" targetNodeId="1200398497778"
                                            resolveInfo="searchedNode"/>
                                    </node>
                                    <node role="nodeOperation"
                                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                          id="1200413471998">
                                      <link role="link" targetNodeId="1.1068580123134"/>
                                    </node>
                                  </node>
                                  <node role="operation"
                                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation"
                                        id="1200413471999">
                                    <node role="argument"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413472000">
                                      <link role="variableDeclaration" targetNodeId="1200413472025" resolveInfo="i"/>
                                    </node>
                                  </node>
                                </node>
                                <node role="nodeOperation"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess"
                                      id="1200413472001">
                                  <link role="link" targetNodeId="1.1068431790188"/>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement"
                              type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                              id="1200413472002">
                          <node role="localVariableDeclaration"
                                type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413472003">
                            <property name="name" value="foundParamType"/>
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                                  id="1200413472004">
                              <link role="classifier" targetNodeId="10.~String" resolveInfo="String"/>
                            </node>
                            <node role="initializer"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                  id="1200413472005">
                              <node role="nodeOperation"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall"
                                    id="1200413472006">
                                <link role="conceptMethodDeclaration" targetNodeId="9.1199318924019"
                                      resolveInfo="getErasureSignature"/>
                              </node>
                              <node role="leftExpression"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                    id="1200413472007">
                                <node role="leftExpression"
                                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                      id="1200413472008">
                                  <node role="leftExpression"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                        id="1200413472009">
                                    <node role="leftExpression"
                                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                          id="1200413472010">
                                      <link role="variable" targetNodeId="1200413471960" resolveInfo="sMethod"/>
                                    </node>
                                    <node role="nodeOperation"
                                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                          id="1200413472011">
                                      <link role="link" targetNodeId="1.1068580123134"/>
                                    </node>
                                  </node>
                                  <node role="operation"
                                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation"
                                        id="1200413472012">
                                    <node role="argument"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413472013">
                                      <link role="variableDeclaration" targetNodeId="1200413472025" resolveInfo="i"/>
                                    </node>
                                  </node>
                                </node>
                                <node role="nodeOperation"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess"
                                      id="1200413472014">
                                  <link role="link" targetNodeId="1.1068431790188"/>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement"
                              id="1200413472015">
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList"
                                id="1200413472016">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement"
                                  id="1200413472017">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                                    id="1200413472018">
                                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant"
                                      id="1200413472019">
                                  <property name="value" value="false"/>
                                </node>
                                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                      id="1200413472020">
                                  <link role="variableDeclaration" targetNodeId="1200413471984" resolveInfo="same"/>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression"
                                id="1200413472021">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                                  id="1200413472022">
                              <link role="baseMethodDeclaration"
                                    targetNodeId="10.~String.equals(java.lang.Object):boolean" resolveInfo="equals"/>
                              <node role="actualArgument"
                                    type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                    id="1200413472023">
                                <link role="variableDeclaration" targetNodeId="1200413471990"
                                      resolveInfo="searchedParamType"/>
                              </node>
                              <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                    id="1200413472024">
                                <link role="variableDeclaration" targetNodeId="1200413472003"
                                      resolveInfo="foundParamType"/>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                            id="1200413472025">
                        <property name="name" value="i"/>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1200413472026"/>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant"
                              id="1200413472027">
                          <property name="value" value="0"/>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression"
                            id="1200413472028">
                        <node role="rightExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413472029">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                                id="1200413472030"/>
                          <node role="leftExpression"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                id="1200413472031">
                            <node role="nodeOperation"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                  id="1200413472032">
                              <link role="link" targetNodeId="1.1068580123134"/>
                            </node>
                            <node role="leftExpression"
                                  type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                  id="1200413472033">
                              <link role="variable" targetNodeId="1200413471960" resolveInfo="sMethod"/>
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413472034">
                          <link role="variableDeclaration" targetNodeId="1200413472025" resolveInfo="i"/>
                        </node>
                      </node>
                      <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                            id="1200413472035">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                              id="1200413472036">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant"
                                id="1200413472037">
                            <property name="value" value="1"/>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                id="1200413472038">
                            <link role="variableDeclaration" targetNodeId="1200413472025" resolveInfo="i"/>
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413472039">
                          <link role="variableDeclaration" targetNodeId="1200413472025" resolveInfo="i"/>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200413472040">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413472041">
                        <node role="statement"
                              type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                              id="1200413472042">
                          <node role="foundNode"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                id="1200413472043">
                            <link role="variable" targetNodeId="1200413471960" resolveInfo="sMethod"/>
                          </node>
                          <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                                id="1200413472044">
                            <property name="value" value="Overriding Methods"/>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200413472045">
                        <link role="variableDeclaration" targetNodeId="1200413471984" resolveInfo="same"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputSequence"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200413520302">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200413524211">
                  <link role="link" targetNodeId="1.1107880067339"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200413519504">
                  <link role="variableDeclaration" targetNodeId="1200413488721" resolveInfo="classNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310058924">
    <property name="name" value="OverridingStaticMethods"/>
    <property name="description" value="Overriding Methods"/>
    <link role="forConcept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310058925">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310058926">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310100929">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1200310100930">
            <property name="value" value="true"/>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310058927">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310058928">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200397244988">
          <property name="value" value="TODO: Quadratish , no gut"/>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200397244989">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200397244990">
            <property name="name" value="searchedNode"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200397370819">
              <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200397397321">
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200397397322">
                <link role="concept" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration"/>
              </node>
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200397398277">
                <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200397398278">
                  <link role="baseMethodDeclaration"
                        targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                        resolveInfo="getNodePointer"/>
                  <node role="instance"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                        id="1200397398279"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200397244995">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200397244996">
            <link role="variableDeclaration" targetNodeId="1200397244990" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200397244997"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200413545177">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200413545178">
            <property name="name" value="nodes"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200413545179">
              <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200413545180">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200413545181">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200413545182">
                  <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200413545183">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200413545184">
            <property name="name" value="results"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413545185">
              <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413545186">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200413545187">
              <link role="baseMethodDeclaration" targetNodeId="7.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200413545188">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ExecuteFinderStatement"
              id="1200413545189">
          <link role="finder" targetNodeId="1200310473077" resolveInfo="DerivedClasses"/>
          <node role="nodes" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200413545190">
            <link role="variableDeclaration" targetNodeId="1200413545178" resolveInfo="nodes"/>
          </node>
          <node role="results" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200413545191">
            <link role="variableDeclaration" targetNodeId="1200413545184" resolveInfo="results"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200413545192"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
              id="1200413545193">
          <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                id="1200413545194">
            <property name="name" value="result"/>
          </node>
          <node role="inputSequence" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                id="1200413545195">
            <link role="variableDeclaration" targetNodeId="1200413545184" resolveInfo="results"/>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413545196">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200413545197">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200413545198">
                <property name="name" value="classNode"/>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200413545199">
                  <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200413545200">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"
                        id="1200413545201">
                    <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200413545202">
                    <link role="baseMethodDeclaration"
                          targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode" resolveInfo="getNode"/>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200413545203">
                      <link role="baseMethodDeclaration"
                            targetNodeId="6.~SearchResult.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                            resolveInfo="getNodePointer"/>
                      <node role="instance"
                            type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                            id="1200413545204">
                        <link role="variable" targetNodeId="1200413545194" resolveInfo="result"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachStatement"
                  id="1200413545205">
              <node role="variable" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariable"
                    id="1200413545206">
                <property name="name" value="sMethod"/>
              </node>
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413545207">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200413545208">
                  <node role="condition" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1200413545209">
                    <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression"
                          id="1200413545210">
                      <node role="rightExpression"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413545211">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                              id="1200413545212"/>
                        <node role="leftExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413545213">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                id="1200413545214">
                            <link role="link" targetNodeId="1.1068580123134"/>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                id="1200413545215">
                            <link role="variableDeclaration" targetNodeId="1200397244990" resolveInfo="searchedNode"/>
                          </node>
                        </node>
                      </node>
                      <node role="leftExpression"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413545216">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                              id="1200413545217"/>
                        <node role="leftExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413545218">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                id="1200413545219">
                            <link role="link" targetNodeId="1.1068580123134"/>
                          </node>
                          <node role="leftExpression"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                id="1200413545220">
                            <link role="variable" targetNodeId="1200413545206" resolveInfo="sMethod"/>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200413545221">
                      <link role="baseMethodDeclaration" targetNodeId="10.~String.equals(java.lang.Object):boolean"
                            resolveInfo="equals"/>
                      <node role="instance"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413545222">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess"
                              id="1200413561609">
                          <link role="property" targetNodeId="1.1083152972672" resolveInfo="name"/>
                        </node>
                        <node role="leftExpression"
                              type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                              id="1200413545224">
                          <link role="variable" targetNodeId="1200413545206" resolveInfo="sMethod"/>
                        </node>
                      </node>
                      <node role="actualArgument"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200413545225">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess"
                              id="1200413558686">
                          <link role="property" targetNodeId="1.1083152972672" resolveInfo="name"/>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413545227">
                          <link role="variableDeclaration" targetNodeId="1200397244990" resolveInfo="searchedNode"/>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413545228">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                          id="1200413545229">
                      <node role="localVariableDeclaration"
                            type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413545230">
                        <property name="name" value="same"/>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1200413545231"/>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.BooleanConstant"
                              id="1200413545232">
                          <property name="value" value="true"/>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForStatement" id="1200413545233">
                      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413545234">
                        <node role="statement"
                              type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                              id="1200413545235">
                          <node role="localVariableDeclaration"
                                type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413545236">
                            <property name="name" value="searchedParamType"/>
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                                  id="1200413545237">
                              <link role="classifier" targetNodeId="10.~String" resolveInfo="String"/>
                            </node>
                            <node role="initializer"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                  id="1200413545238">
                              <node role="nodeOperation"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall"
                                    id="1200413545239">
                                <link role="conceptMethodDeclaration" targetNodeId="9.1199318924019"
                                      resolveInfo="getErasureSignature"/>
                              </node>
                              <node role="leftExpression"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                    id="1200413545240">
                                <node role="leftExpression"
                                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                      id="1200413545241">
                                  <node role="leftExpression"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                        id="1200413545242">
                                    <node role="leftExpression"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413545243">
                                      <link role="variableDeclaration" targetNodeId="1200397244990"
                                            resolveInfo="searchedNode"/>
                                    </node>
                                    <node role="nodeOperation"
                                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                          id="1200413545244">
                                      <link role="link" targetNodeId="1.1068580123134"/>
                                    </node>
                                  </node>
                                  <node role="operation"
                                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation"
                                        id="1200413545245">
                                    <node role="argument"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413545246">
                                      <link role="variableDeclaration" targetNodeId="1200413545271" resolveInfo="i"/>
                                    </node>
                                  </node>
                                </node>
                                <node role="nodeOperation"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess"
                                      id="1200413545247">
                                  <link role="link" targetNodeId="1.1068431790188"/>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement"
                              type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                              id="1200413545248">
                          <node role="localVariableDeclaration"
                                type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200413545249">
                            <property name="name" value="foundParamType"/>
                            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType"
                                  id="1200413545250">
                              <link role="classifier" targetNodeId="10.~String" resolveInfo="String"/>
                            </node>
                            <node role="initializer"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                  id="1200413545251">
                              <node role="nodeOperation"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall"
                                    id="1200413545252">
                                <link role="conceptMethodDeclaration" targetNodeId="9.1199318924019"
                                      resolveInfo="getErasureSignature"/>
                              </node>
                              <node role="leftExpression"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                    id="1200413545253">
                                <node role="leftExpression"
                                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                      id="1200413545254">
                                  <node role="leftExpression"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                        id="1200413545255">
                                    <node role="leftExpression"
                                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                          id="1200413545256">
                                      <link role="variable" targetNodeId="1200413545206" resolveInfo="sMethod"/>
                                    </node>
                                    <node role="nodeOperation"
                                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                          id="1200413545257">
                                      <link role="link" targetNodeId="1.1068580123134"/>
                                    </node>
                                  </node>
                                  <node role="operation"
                                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetElementOperation"
                                        id="1200413545258">
                                    <node role="argument"
                                          type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                          id="1200413545259">
                                      <link role="variableDeclaration" targetNodeId="1200413545271" resolveInfo="i"/>
                                    </node>
                                  </node>
                                </node>
                                <node role="nodeOperation"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess"
                                      id="1200413545260">
                                  <link role="link" targetNodeId="1.1068431790188"/>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement"
                              id="1200413545261">
                          <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList"
                                id="1200413545262">
                            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement"
                                  id="1200413545263">
                              <node role="expression" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                                    id="1200413545264">
                                <node role="rValue" type="jetbrains.mps.baseLanguage.structure.BooleanConstant"
                                      id="1200413545265">
                                  <property name="value" value="false"/>
                                </node>
                                <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                      id="1200413545266">
                                  <link role="variableDeclaration" targetNodeId="1200413545230" resolveInfo="same"/>
                                </node>
                              </node>
                            </node>
                          </node>
                          <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotExpression"
                                id="1200413545267">
                            <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                                  id="1200413545268">
                              <link role="baseMethodDeclaration"
                                    targetNodeId="10.~String.equals(java.lang.Object):boolean" resolveInfo="equals"/>
                              <node role="actualArgument"
                                    type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                    id="1200413545269">
                                <link role="variableDeclaration" targetNodeId="1200413545236"
                                      resolveInfo="searchedParamType"/>
                              </node>
                              <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                    id="1200413545270">
                                <link role="variableDeclaration" targetNodeId="1200413545249"
                                      resolveInfo="foundParamType"/>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                            id="1200413545271">
                        <property name="name" value="i"/>
                        <node role="type" type="jetbrains.mps.baseLanguage.structure.IntegerType" id="1200413545272"/>
                        <node role="initializer" type="jetbrains.mps.baseLanguage.structure.IntegerConstant"
                              id="1200413545273">
                          <property name="value" value="0"/>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.LessThanExpression"
                            id="1200413545274">
                        <node role="rightExpression"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                              id="1200413545275">
                          <node role="nodeOperation"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                                id="1200413545276"/>
                          <node role="leftExpression"
                                type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                id="1200413545277">
                            <node role="nodeOperation"
                                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                                  id="1200413545278">
                              <link role="link" targetNodeId="1.1068580123134"/>
                            </node>
                            <node role="leftExpression"
                                  type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                  id="1200413545279">
                              <link role="variable" targetNodeId="1200413545206" resolveInfo="sMethod"/>
                            </node>
                          </node>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413545280">
                          <link role="variableDeclaration" targetNodeId="1200413545271" resolveInfo="i"/>
                        </node>
                      </node>
                      <node role="iteration" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression"
                            id="1200413545281">
                        <node role="rValue" type="jetbrains.mps.baseLanguage.structure.PlusExpression"
                              id="1200413545282">
                          <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant"
                                id="1200413545283">
                            <property name="value" value="1"/>
                          </node>
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                id="1200413545284">
                            <link role="variableDeclaration" targetNodeId="1200413545271" resolveInfo="i"/>
                          </node>
                        </node>
                        <node role="lValue" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200413545285">
                          <link role="variableDeclaration" targetNodeId="1200413545271" resolveInfo="i"/>
                        </node>
                      </node>
                    </node>
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200413545286">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200413545287">
                        <node role="statement"
                              type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                              id="1200413545288">
                          <node role="foundNode"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.ForEachVariableReference"
                                id="1200413545289">
                            <link role="variable" targetNodeId="1200413545206" resolveInfo="sMethod"/>
                          </node>
                          <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                                id="1200413545290">
                            <property name="value" value="Overriding Methods"/>
                          </node>
                        </node>
                      </node>
                      <node role="condition" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200413545291">
                        <link role="variableDeclaration" targetNodeId="1200413545230" resolveInfo="same"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="inputSequence"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200413545292">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200413554591">
                  <link role="link" targetNodeId="1.1070462273904"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200413545294">
                  <link role="variableDeclaration" targetNodeId="1200413545198" resolveInfo="classNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310248824">
    <property name="name" value="ImplementingClasses"/>
    <property name="description" value="Implementing Classes"/>
    <link role="forConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310248825">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310248826">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310311367">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1200310311368">
            <property name="value" value="true"/>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310248827">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310248828">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200316282202">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200316282203">
            <property name="name" value="searchedNode"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200316282204">
              <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200316282205">
              <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                    resolveInfo="getNode"/>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200316282206">
                <link role="baseMethodDeclaration"
                      targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                      resolveInfo="getNodePointer"/>
                <node role="instance"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                      id="1200316282207"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200316282208">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200316282209">
            <link role="variableDeclaration" targetNodeId="1200316282203" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200316282210"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200411664690">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200411664691">
            <property name="name" value="nodes"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200411664692">
              <link role="elementConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200411670382">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200411670383">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200411670384">
                  <link role="elementConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200411695012">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200411695013">
            <property name="name" value="results"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200411695014">
              <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200411704329">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200411709924">
              <link role="baseMethodDeclaration" targetNodeId="7.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200411765692">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ExecuteFinderStatement"
              id="1200411641733">
          <link role="finder" targetNodeId="1200310287391" resolveInfo="DerivedInterfaces"/>
          <node role="nodes" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200411690682">
            <link role="variableDeclaration" targetNodeId="1200411664691" resolveInfo="nodes"/>
          </node>
          <node role="results" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200411769350">
            <link role="variableDeclaration" targetNodeId="1200411695013" resolveInfo="results"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200411797741"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200412856853">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200412856854">
            <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
                  id="1200412867845">
              <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200412870582">
                <link role="variableDeclaration" targetNodeId="1200412856857" resolveInfo="node"/>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200412864376">
            <link role="variableDeclaration" targetNodeId="1200411664691" resolveInfo="nodes"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200412856857">
            <property name="name" value="node"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200412858812">
              <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200411794356">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200411794357">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200412892398">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200412892399">
                <property name="name" value="node"/>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200412892400"/>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                      id="1200412912830">
                  <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                        resolveInfo="getNode"/>
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200412910624">
                    <link role="baseMethodDeclaration"
                          targetNodeId="6.~SearchResult.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                          resolveInfo="getNodePointer"/>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200412908090">
                      <link role="variableDeclaration" targetNodeId="1200411794380" resolveInfo="result"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200411794363">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200411794364">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200411794365">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200411794366">
                    <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                          id="1200411794367">
                      <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200412920318">
                        <link role="variableDeclaration" targetNodeId="1200412892399" resolveInfo="node"/>
                      </node>
                      <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral"
                            id="1200411794369">
                        <property name="value" value="Implementing Classes"/>
                      </node>
                    </node>
                  </node>
                  <node role="condition"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                        id="1200411794370">
                    <node role="nodeOperation"
                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation"
                          id="1200411794371">
                      <link role="linkInParent" targetNodeId="1.1095933932569"/>
                      <link role="conceptOfParent" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200412918832">
                      <link role="variableDeclaration" targetNodeId="1200412892399" resolveInfo="node"/>
                    </node>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                    id="1200411794373">
                <node role="nodeOperation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                      id="1200411794374">
                  <node role="conceptArgument"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1200411794375">
                    <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                  </node>
                </node>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                      id="1200411794376">
                  <node role="nodeOperation"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation"
                        id="1200411794377"/>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1200412917456">
                    <link role="variableDeclaration" targetNodeId="1200412892399" resolveInfo="node"/>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200412884240">
            <link role="variableDeclaration" targetNodeId="1200411695013" resolveInfo="results"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200411794380">
            <property name="name" value="result"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200412876567">
              <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310287391">
    <property name="name" value="DerivedInterfaces"/>
    <property name="description" value="Derived Interfaces"/>
    <link role="forConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310287392">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310287393">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310306084">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1200310306085">
            <property name="value" value="true"/>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310287394">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310287395">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200312743882">
          <property name="value" value="TODO: Quadratish , no gut"/>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200312141642">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200312141643">
            <property name="name" value="searchedNode"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200312141644">
              <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200312151069">
              <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                    resolveInfo="getNode"/>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200312151070">
                <link role="baseMethodDeclaration"
                      targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                      resolveInfo="getNodePointer"/>
                <node role="instance"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                      id="1200312151071"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200311639384">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200312155478">
            <link role="variableDeclaration" targetNodeId="1200312141643" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200312196519"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200311863792">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200311863793">
            <property name="name" value="derived"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200311863794">
              <link role="elementConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200311924665">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200311924666">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200311924667">
                  <link role="elementConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200312097785">
          <node role="expression"
                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                id="1200312099116">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation"
                  id="1200312100447">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200312174934">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200312174935">
                  <link role="variableDeclaration" targetNodeId="1200312141643" resolveInfo="searchedNode"/>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200312181547">
                  <link role="concept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1200312097786">
              <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200312199458"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1200312247963">
          <node role="condition"
                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                id="1200312252311">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation"
                  id="1200312259548"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1200312250841">
              <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200312247965">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200312291058">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200312291059">
                <property name="name" value="resRefs"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200312291060">
                  <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200312291061">
                    <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                      id="1200312291062">
                  <link role="baseMethodDeclaration"
                        targetNodeId="2.~FindUsagesManager.findUsages(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.IScope):java.util.Set"
                        resolveInfo="findUsages"/>
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1200312291063">
                    <link role="classConcept" targetNodeId="2.~FindUsagesManager" resolveInfo="FindUsagesManager"/>
                    <link role="baseMethodDeclaration"
                          targetNodeId="2.~FindUsagesManager.getInstance():jetbrains.mps.findUsages.FindUsagesManager"
                          resolveInfo="getInstance"/>
                  </node>
                  <node role="actualArgument"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200312309366">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200312311182"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200312308131">
                      <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200312291067">
                    <link role="baseMethodDeclaration"
                          targetNodeId="3.~SearchQuery.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope"/>
                    <node role="instance"
                          type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                          id="1200312291068"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200312291069">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200312291070">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                      id="1200312291071">
                  <node role="localVariableDeclaration"
                        type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200312291072">
                    <property name="name" value="node"/>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"
                          id="1200312291073"/>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200312291074">
                      <link role="baseMethodDeclaration"
                            targetNodeId="4.~SReference.getSourceNode():jetbrains.mps.smodel.SNode"
                            resolveInfo="getSourceNode"/>
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200312291075">
                        <link role="variableDeclaration" targetNodeId="1200312291096" resolveInfo="reference"/>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200312291076">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200312291077">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200312291078">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200312291079">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement"
                              id="1200312291080">
                          <node role="expression"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                id="1200312291081">
                            <node role="operation"
                                  type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation"
                                  id="1200312291082">
                              <node role="argument"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression"
                                    id="1200312291083">
                                <link role="concept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                                <node role="leftExpression"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                      id="1200313754325">
                                  <node role="nodeOperation"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation"
                                        id="1200313757109"/>
                                  <node role="leftExpression"
                                        type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                        id="1200312291084">
                                    <link role="variableDeclaration" targetNodeId="1200312291072" resolveInfo="node"/>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression"
                                  type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200312291085">
                              <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200312291086">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation"
                              id="1200312291087">
                          <link role="linkInParent" targetNodeId="1.1107797138135"/>
                          <link role="conceptOfParent" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200312291088">
                          <link role="variableDeclaration" targetNodeId="1200312291072" resolveInfo="node"/>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                        id="1200312291089">
                    <node role="nodeOperation"
                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                          id="1200312291090">
                      <node role="conceptArgument"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference"
                            id="1200312291091">
                        <link role="conceptDeclaration" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
                      </node>
                    </node>
                    <node role="leftExpression"
                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                          id="1200312291092">
                      <node role="nodeOperation"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation"
                            id="1200312291093"/>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200312291094">
                        <link role="variableDeclaration" targetNodeId="1200312291072" resolveInfo="node"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200312291095">
                <link role="variableDeclaration" targetNodeId="1200312291059" resolveInfo="resRefs"/>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200312291096">
                <property name="name" value="reference"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200312291097">
                  <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200312349592">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200312349593">
                <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                      id="1200313985373">
                  <node role="foundNode"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200313989033">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200313989974"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200313987485">
                      <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                    </node>
                  </node>
                  <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1200313997084">
                    <property name="value" value="Derived Interfaces"/>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200312358320">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200312362449">
                  <link role="variableDeclaration" targetNodeId="1200312141643" resolveInfo="searchedNode"/>
                </node>
                <node role="leftExpression"
                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                      id="1200312355223">
                  <node role="operation"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                        id="1200312356772"/>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1200312354628">
                    <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200312717697">
              <node role="expression"
                    type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                    id="1200312719480">
                <node role="operation"
                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.RemoveElementOperation"
                      id="1200312729186">
                  <node role="argument"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200312734798">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200312735192"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200312732563">
                      <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200312717698">
                  <link role="variableDeclaration" targetNodeId="1200311863793" resolveInfo="derived"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310376244">
    <property name="name" value="InterfaceMethodsUsages"/>
    <property name="description" value="Methods Usages"/>
    <property name="package" value="Incomplete"/>
    <link role="forConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310376245">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310376246">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310777831">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200310790781">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1200310792784">
              <property name="value" value="0"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                  id="1200310787340">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                    id="1200310789280"/>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310778677">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200310781133">
                  <link role="link" targetNodeId="1.1107880067339"/>
                </node>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                      id="1200310777832"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310376247">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310376248"/>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310405546">
    <property name="name" value="InterfaceFieldsUsage"/>
    <property name="description" value="Fields Usages"/>
    <property name="package" value="Incomplete"/>
    <link role="forConcept" targetNodeId="1.1107796713796" resolveInfo="Interface"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310405547">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310405548">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310747426">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200310770249">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1200310772986">
              <property name="value" value="0"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                  id="1200310766995">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                    id="1200310768966"/>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310748225">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200310763853">
                  <link role="link" targetNodeId="1.1128555889557"/>
                </node>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                      id="1200310747427"/>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310405549">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310405550"/>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310422801">
    <property name="name" value="ClassFieldsUsages"/>
    <property name="description" value="Fields Usages (this class)"/>
    <link role="forConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310422802">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310422803">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310692488">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200310711220">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1200310713270">
              <property name="value" value="0"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1200310853500">
              <node role="rightExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310863258">
                <node role="nodeOperation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                      id="1200310866308"/>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                      id="1200310856551">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                        id="1200310859101">
                    <link role="link" targetNodeId="1.1128555889557"/>
                  </node>
                  <node role="leftExpression"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                        id="1200310855488"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310707419">
                <node role="nodeOperation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                      id="1200310709828"/>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                      id="1200310693474">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                        id="1200310700102">
                    <link role="link" targetNodeId="1.1068390468199"/>
                  </node>
                  <node role="leftExpression"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                        id="1200310692489"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310422804">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310422805">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200316851009">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200316851010">
            <property name="name" value="searchedNode"/>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200316903271">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200316930812">
                <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200316926980">
                  <link role="baseMethodDeclaration"
                        targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                        resolveInfo="getNodePointer"/>
                  <node role="instance"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                        id="1200316903272"/>
                </node>
              </node>
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200316909321">
                <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200316893583">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200316709653">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200316863063">
            <link role="variableDeclaration" targetNodeId="1200316851010" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200317068256"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200316732161">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200316732162">
            <property name="name" value="fields"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317169744">
              <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317173449">
                <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200317179576">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashSet.&lt;init&gt;()" resolveInfo="HashSet"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317206266">
                <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200317229287">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200317235759">
            <link role="baseMethodDeclaration" targetNodeId="7.~Set.addAll(java.util.Collection):boolean"
                  resolveInfo="addAll"/>
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200317229288">
              <link role="variableDeclaration" targetNodeId="1200316732162" resolveInfo="fields"/>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200317277001">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317281707">
                <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317286662">
                  <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                    id="1200317287632">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200317287633">
                  <link role="link" targetNodeId="1.1128555889557"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200317905287">
                  <link role="variableDeclaration" targetNodeId="1200316851010" resolveInfo="searchedNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200317291791">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200317291792">
            <link role="baseMethodDeclaration" targetNodeId="7.~Set.addAll(java.util.Collection):boolean"
                  resolveInfo="addAll"/>
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200317291793">
              <link role="variableDeclaration" targetNodeId="1200316732162" resolveInfo="fields"/>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200317291794">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317291795">
                <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317291796">
                  <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                    id="1200317291797">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200317912524">
                  <link role="link" targetNodeId="1.1068390468199"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200317908648">
                  <link role="variableDeclaration" targetNodeId="1200316851010" resolveInfo="searchedNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200317065879"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200317090495">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200317090496">
            <property name="name" value="resRefs"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317090497">
              <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317090498">
                <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200317090499">
              <link role="baseMethodDeclaration"
                    targetNodeId="2.~FindUsagesManager.findUsages(java.util.Set,jetbrains.mps.smodel.IScope,jetbrains.mps.ide.progress.IAdaptiveProgressMonitor):java.util.Set"
                    resolveInfo="findUsages"/>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1200317090500">
                <link role="classConcept" targetNodeId="2.~FindUsagesManager" resolveInfo="FindUsagesManager"/>
                <link role="baseMethodDeclaration"
                      targetNodeId="2.~FindUsagesManager.getInstance():jetbrains.mps.findUsages.FindUsagesManager"
                      resolveInfo="getInstance"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200317132507">
                <link role="variableDeclaration" targetNodeId="1200316732162" resolveInfo="fields"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                    id="1200317090504">
                <link role="baseMethodDeclaration" targetNodeId="3.~SearchQuery.getScope():jetbrains.mps.smodel.IScope"
                      resolveInfo="getScope"/>
                <node role="instance"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                      id="1200317090505"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1200317144634"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200317090506">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200317090507">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200317090508">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200317090509">
                <property name="name" value="node"/>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200317090510">
                  <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference"/>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200317598280">
                  <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"
                        id="1200317598281">
                    <link role="concept" targetNodeId="1.1068498886296" resolveInfo="VariableReference"/>
                  </node>
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200317598908">
                    <link role="baseMethodDeclaration"
                          targetNodeId="4.~SReference.getSourceNode():jetbrains.mps.smodel.SNode"
                          resolveInfo="getSourceNode"/>
                    <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200317598909">
                      <link role="variableDeclaration" targetNodeId="1200317090535" resolveInfo="reference"/>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                  id="1200317899628">
              <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200317899629">
                <link role="variableDeclaration" targetNodeId="1200317090509" resolveInfo="node"/>
              </node>
              <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1200317899630">
                <property name="value" value="Field Usagses"/>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200317090534">
            <link role="variableDeclaration" targetNodeId="1200317090496" resolveInfo="resRefs"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200317090535">
            <property name="name" value="reference"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200317090536">
              <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310438009">
    <property name="name" value="ClassMethodsUsages"/>
    <property name="description" value="Methods Usages (this class)"/>
    <link role="forConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310438010">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310723661">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310725365">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200310736391">
            <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1200310738613">
              <property name="value" value="0"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.PlusExpression" id="1200310835488">
              <node role="rightExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310846887">
                <node role="nodeOperation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                      id="1200310848609"/>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                      id="1200310839352">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                        id="1200310842324">
                    <link role="link" targetNodeId="1.1070462273904"/>
                  </node>
                  <node role="leftExpression"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                        id="1200310838007"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200310730809">
                <node role="nodeOperation"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation"
                      id="1200310734734"/>
                <node role="leftExpression"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                      id="1200310726227">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                        id="1200310728745">
                    <link role="link" targetNodeId="1.1107880067339"/>
                  </node>
                  <node role="leftExpression"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                        id="1200310725366"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310438012">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310438013">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200405552147">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200405552148">
            <property name="name" value="searchedNode"/>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200405552149">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405552150">
                <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405552151">
                  <link role="baseMethodDeclaration"
                        targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                        resolveInfo="getNodePointer"/>
                  <node role="instance"
                        type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                        id="1200405552152"/>
                </node>
              </node>
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200405552153">
                <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
              </node>
            </node>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200405552154">
              <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200405552155">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200405552156">
            <link role="variableDeclaration" targetNodeId="1200405552148" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200405552157"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200405552158">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200405552159">
            <property name="name" value="methods"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552160">
              <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552161">
                <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200405552162">
              <link role="baseMethodDeclaration" targetNodeId="7.~HashSet.&lt;init&gt;()" resolveInfo="HashSet"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552163">
                <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200405552164">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405552165">
            <link role="baseMethodDeclaration" targetNodeId="7.~Set.addAll(java.util.Collection):boolean"
                  resolveInfo="addAll"/>
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200405552166">
              <link role="variableDeclaration" targetNodeId="1200405552159" resolveInfo="fields"/>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200405552167">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552168">
                <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552169">
                  <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                    id="1200405552170">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200405581541">
                  <link role="link" targetNodeId="1.1070462273904"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200405552172">
                  <link role="variableDeclaration" targetNodeId="1200405552148" resolveInfo="searchedNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200405552173">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405552174">
            <link role="baseMethodDeclaration" targetNodeId="7.~Set.addAll(java.util.Collection):boolean"
                  resolveInfo="addAll"/>
            <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200405552175">
              <link role="variableDeclaration" targetNodeId="1200405552159" resolveInfo="fields"/>
            </node>
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200405552176">
              <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552177">
                <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
                <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552178">
                  <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
                </node>
              </node>
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                    id="1200405552179">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess"
                      id="1200405585604">
                  <link role="link" targetNodeId="1.1107880067339"/>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200405552181">
                  <link role="variableDeclaration" targetNodeId="1200405552148" resolveInfo="searchedNode"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200405552182"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200405552183">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200405552184">
            <property name="name" value="resRefs"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552185">
              <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552186">
                <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405552187">
              <link role="baseMethodDeclaration"
                    targetNodeId="2.~FindUsagesManager.findUsages(java.util.Set,jetbrains.mps.smodel.IScope,jetbrains.mps.ide.progress.IAdaptiveProgressMonitor):java.util.Set"
                    resolveInfo="findUsages"/>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1200405552188">
                <link role="classConcept" targetNodeId="2.~FindUsagesManager" resolveInfo="FindUsagesManager"/>
                <link role="baseMethodDeclaration"
                      targetNodeId="2.~FindUsagesManager.getInstance():jetbrains.mps.findUsages.FindUsagesManager"
                      resolveInfo="getInstance"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200405552189">
                <link role="variableDeclaration" targetNodeId="1200405552159" resolveInfo="fields"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                    id="1200405552190">
                <link role="baseMethodDeclaration" targetNodeId="3.~SearchQuery.getScope():jetbrains.mps.smodel.IScope"
                      resolveInfo="getScope"/>
                <node role="instance"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                      id="1200405552191"/>
              </node>
              <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1200405552192"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200405552193">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200405552194">
            <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                  id="1200405552202">
              <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1200405552204">
                <property name="value" value="Field Usagses"/>
              </node>
              <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200405611715">
                <link role="baseMethodDeclaration"
                      targetNodeId="4.~SReference.getSourceNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getSourceNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200405611716">
                  <link role="variableDeclaration" targetNodeId="1200405552206" resolveInfo="reference"/>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200405552205">
            <link role="variableDeclaration" targetNodeId="1200405552184" resolveInfo="resRefs"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200405552206">
            <property name="name" value="reference"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200405552207">
              <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200310473077">
    <property name="name" value="DerivedClasses"/>
    <property name="description" value="Derived Classes"/>
    <link role="forConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200310473078">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310473079">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200310878309">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1200310878310">
            <property name="value" value="true"/>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200310473080">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200310473081">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200315820125">
          <property name="value" value="TODO: Quadratish , no gut"/>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200315820126">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200315820127">
            <property name="name" value="searchedNode"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200315820128">
              <link role="classifier" targetNodeId="4.~SNode" resolveInfo="SNode"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200315820129">
              <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                    resolveInfo="getNode"/>
              <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200315820130">
                <link role="baseMethodDeclaration"
                      targetNodeId="3.~SearchQuery.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                      resolveInfo="getNodePointer"/>
                <node role="instance"
                      type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                      id="1200315820131"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
              id="1200315820132">
          <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200315820133">
            <link role="variableDeclaration" targetNodeId="1200315820127" resolveInfo="searchedNode"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200315820134"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200315820135">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200315820136">
            <property name="name" value="derived"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200315820137">
              <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200315820138">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200315820139">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200315820140">
                  <link role="elementConcept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200315820141">
          <node role="expression"
                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                id="1200315820142">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation"
                  id="1200315820143">
              <node role="argument" type="jetbrains.mps.baseLanguage.structure.CastExpression" id="1200315820144">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200315820145">
                  <link role="variableDeclaration" targetNodeId="1200315820127" resolveInfo="searchedNode"/>
                </node>
                <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200315820146">
                  <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                </node>
              </node>
            </node>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1200315820147">
              <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.RemarkStatement" id="1200315820148"/>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.WhileStatement" id="1200315820149">
          <node role="condition"
                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                id="1200315820150">
            <node role="operation" type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.IsNotEmptyOperation"
                  id="1200315820151"/>
            <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                  id="1200315820152">
              <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
            </node>
          </node>
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200315820153">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                  id="1200315820154">
              <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200315820155">
                <property name="name" value="resRefs"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200315820156">
                  <link role="classifier" targetNodeId="7.~Set" resolveInfo="Set"/>
                  <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200315820157">
                    <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
                  </node>
                </node>
                <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                      id="1200315820158">
                  <link role="baseMethodDeclaration"
                        targetNodeId="2.~FindUsagesManager.findUsages(jetbrains.mps.smodel.SNode,jetbrains.mps.smodel.IScope):java.util.Set"
                        resolveInfo="findUsages"/>
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1200315820159">
                    <link role="classConcept" targetNodeId="2.~FindUsagesManager" resolveInfo="FindUsagesManager"/>
                    <link role="baseMethodDeclaration"
                          targetNodeId="2.~FindUsagesManager.getInstance():jetbrains.mps.findUsages.FindUsagesManager"
                          resolveInfo="getInstance"/>
                  </node>
                  <node role="actualArgument"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200315820160">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200315820161"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200315820162">
                      <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                        id="1200315820163">
                    <link role="baseMethodDeclaration"
                          targetNodeId="3.~SearchQuery.getScope():jetbrains.mps.smodel.IScope" resolveInfo="getScope"/>
                    <node role="instance"
                          type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_SearchQuery"
                          id="1200315820164"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200315820165">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200315820166">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
                      id="1200315820167">
                  <node role="localVariableDeclaration"
                        type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200315820168">
                    <property name="name" value="node"/>
                    <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType"
                          id="1200315820169"/>
                    <node role="initializer" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall"
                          id="1200315820170">
                      <link role="baseMethodDeclaration"
                            targetNodeId="4.~SReference.getSourceNode():jetbrains.mps.smodel.SNode"
                            resolveInfo="getSourceNode"/>
                      <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200315820171">
                        <link role="variableDeclaration" targetNodeId="1200315820194" resolveInfo="reference"/>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200315820172">
                  <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200315820173">
                    <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200315820174">
                      <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200315820175">
                        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement"
                              id="1200315820176">
                          <node role="expression"
                                type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                                id="1200315820177">
                            <node role="operation"
                                  type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.AddElementOperation"
                                  id="1200315820178">
                              <node role="argument"
                                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression"
                                    id="1200315820179">
                                <link role="concept" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                                <node role="leftExpression"
                                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                                      id="1200315820180">
                                  <node role="nodeOperation"
                                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation"
                                        id="1200315820181"/>
                                  <node role="leftExpression"
                                        type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                                        id="1200315820182">
                                    <link role="variableDeclaration" targetNodeId="1200315820168" resolveInfo="node"/>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node role="leftExpression"
                                  type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200315820183">
                              <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node role="condition"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                            id="1200315820184">
                        <node role="nodeOperation"
                              type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation"
                              id="1200315820185">
                          <link role="conceptOfParent" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                          <link role="linkInParent" targetNodeId="1.1165602531693"/>
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                              id="1200315820186">
                          <link role="variableDeclaration" targetNodeId="1200315820168" resolveInfo="node"/>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition"
                        type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                        id="1200315820187">
                    <node role="nodeOperation"
                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                          id="1200315820188">
                      <node role="conceptArgument"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference"
                            id="1200315865767">
                        <link role="conceptDeclaration" targetNodeId="1.1068390468198" resolveInfo="ClassConcept"/>
                      </node>
                    </node>
                    <node role="leftExpression"
                          type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                          id="1200315820190">
                      <node role="nodeOperation"
                            type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation"
                            id="1200315820191"/>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                            id="1200315820192">
                        <link role="variableDeclaration" targetNodeId="1200315820168" resolveInfo="node"/>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200315820193">
                <link role="variableDeclaration" targetNodeId="1200315820155" resolveInfo="resRefs"/>
              </node>
              <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                    id="1200315820194">
                <property name="name" value="reference"/>
                <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200315820195">
                  <link role="classifier" targetNodeId="4.~SReference" resolveInfo="SReference"/>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1200315820196">
              <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200315820197">
                <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                      id="1200315820198">
                  <node role="foundNode"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200315820199">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200315820200"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200315820201">
                      <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                    </node>
                  </node>
                  <node role="category" type="jetbrains.mps.baseLanguage.structure.StringLiteral" id="1200315820202">
                    <property name="value" value="Derived Classes"/>
                  </node>
                </node>
              </node>
              <node role="condition" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1200315820203">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200315820204">
                  <link role="variableDeclaration" targetNodeId="1200315820127" resolveInfo="searchedNode"/>
                </node>
                <node role="leftExpression"
                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                      id="1200315820205">
                  <node role="operation"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                        id="1200315820206"/>
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1200315820207">
                    <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200315820208">
              <node role="expression"
                    type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                    id="1200315820209">
                <node role="operation"
                      type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.RemoveElementOperation"
                      id="1200315820210">
                  <node role="argument"
                        type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.SequenceOperationExpression"
                        id="1200315820211">
                    <node role="operation"
                          type="jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation"
                          id="1200315820212"/>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                          id="1200315820213">
                      <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200315820214">
                  <link role="variableDeclaration" targetNodeId="1200315820136" resolveInfo="derived"/>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200317943493">
    <property name="name" value="FieldUsages"/>
    <property name="package" value="Incomplete"/>
    <property name="description" value="Field Usages"/>
    <link role="forConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200317943494">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200317943495">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200317975139">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1200317994240">
            <node role="rightExpression"
                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200317997572">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                    id="1200317999763">
                <node role="conceptArgument"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1200318010515">
                  <link role="conceptDeclaration" targetNodeId="1.1068390468200" resolveInfo="FieldDeclaration"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                    id="1200317996728"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                  id="1200317976078">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                    id="1200317983284">
                <node role="conceptArgument"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1200317991317">
                  <link role="conceptDeclaration" targetNodeId="1.1070462154015" resolveInfo="StaticFieldDeclaration"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                    id="1200317975140"/>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200317943496">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200317943497">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200407922015">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200407922016">
            <property name="name" value="nodes"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType" id="1200407922017"/>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression"
                  id="1200407945457">
              <node role="creator" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator"
                    id="1200407945458">
                <node role="createdType" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListType"
                      id="1200407945459"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"
              id="1200407961324">
          <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"
                id="1200407961325">
            <property name="name" value="myresults"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200407961326">
              <link role="classifier" targetNodeId="7.~List" resolveInfo="List"/>
              <node role="parameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200407983063">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
            <node role="initializer" type="jetbrains.mps.baseLanguage.structure.NewExpression" id="1200407990283">
              <link role="baseMethodDeclaration" targetNodeId="7.~ArrayList.&lt;init&gt;()" resolveInfo="ArrayList"/>
              <node role="typeParameter" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200408006629">
                <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
              </node>
            </node>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ExecuteFinderStatement"
              id="1200407883058">
          <link role="finder" targetNodeId="1200310422801" resolveInfo="ClassFieldsUsages"/>
          <node role="nodes" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200408011302">
            <link role="variableDeclaration" targetNodeId="1200407922016" resolveInfo="nodes"/>
          </node>
          <node role="results" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200408014600">
            <link role="variableDeclaration" targetNodeId="1200407961325" resolveInfo="results"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200408022336">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200408022337">
            <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.NodeStatement"
                  id="1200408038594">
              <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                    id="1200408042065">
                <link role="variableDeclaration" targetNodeId="1200408022340" resolveInfo="node"/>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200408032968">
            <link role="variableDeclaration" targetNodeId="1200407922016" resolveInfo="nodes"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200408022340">
            <property name="name" value="node"/>
            <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1200408026202"/>
          </node>
        </node>
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1200408044567">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200408044568">
            <node role="statement" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ResultStatement"
                  id="1200408058888">
              <node role="foundNode" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200408073102">
                <link role="baseMethodDeclaration" targetNodeId="4.~SNodePointer.getNode():jetbrains.mps.smodel.SNode"
                      resolveInfo="getNode"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200408069411">
                  <link role="baseMethodDeclaration"
                        targetNodeId="6.~SearchResult.getNodePointer():jetbrains.mps.smodel.SNodePointer"
                        resolveInfo="getNodePointer"/>
                  <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                        id="1200408061984">
                    <link role="variableDeclaration" targetNodeId="1200408044571" resolveInfo="result"/>
                  </node>
                </node>
              </node>
              <node role="category" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1200408079762">
                <link role="baseMethodDeclaration" targetNodeId="6.~SearchResult.getCategory():java.lang.String"
                      resolveInfo="getCategory"/>
                <node role="instance" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference"
                      id="1200408076415">
                  <link role="variableDeclaration" targetNodeId="1200408044571" resolveInfo="result"/>
                </node>
              </node>
            </node>
          </node>
          <node role="iterable" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1200408054449">
            <link role="variableDeclaration" targetNodeId="1200407961325" resolveInfo="results"/>
          </node>
          <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1200408044571">
            <property name="name" value="result"/>
            <node role="type" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1200408049057">
              <link role="classifier" targetNodeId="6.~SearchResult" resolveInfo="SearchResult"/>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FinderDeclaration" id="1200405628545">
    <property name="name" value="MethodUsages"/>
    <property name="package" value="Incomplete"/>
    <property name="description" value="Method Usages"/>
    <link role="forConcept" targetNodeId="1.1068431474542" resolveInfo="VariableDeclaration"/>
    <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.IsApplicableBlock"
          id="1200405628546">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200405628547">
        <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1200405628548">
          <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1200405628549">
            <node role="rightExpression"
                  type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1200405628550">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                    id="1200405628551">
                <node role="conceptArgument"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1200405672530">
                  <link role="conceptDeclaration" targetNodeId="1.1068390468204" resolveInfo="MethodDeclaration"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                    id="1200405628553"/>
            </node>
            <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression"
                  id="1200405628554">
              <node role="nodeOperation"
                    type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation"
                    id="1200405628555">
                <node role="conceptArgument"
                      type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1200405668169">
                  <link role="conceptDeclaration" targetNodeId="1.1081236700938" resolveInfo="StaticMethodDeclaration"/>
                </node>
              </node>
              <node role="leftExpression"
                    type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.ConceptFunctionParameter_node"
                    id="1200405628557"/>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="findFunction" type="jetbrains.mps.bootstrap.findUsagesLanguage.structure.FindBlock" id="1200405628558">
      <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1200405628559"/>
    </node>
  </node>
</model>

