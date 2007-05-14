<?xml version="1.0" encoding="UTF-8"?>
<model name="ypath.constraints">
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang" />
  <maxImportIndex value="5" />
  <import index="1" modelUID="ypath.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="3" modelUID="java.lang@java_stub" />
  <import index="4" modelUID="ypath.structure@java_stub" />
  <import index="5" modelUID="ypath.actions" />
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178187486791">
    <link role="concept" targetNodeId="1.1168428529658" />
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178187486792">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178187486793" />
    </node>
    <node role="properties" type="jetbrains.mps.bootstrap.constraintsLanguage.NodePropertyConstraint" id="1177410539875">
      <link role="applicableProperty" targetNodeId="2.1169194664001" />
      <node role="propertyGetter" type="jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_PropertyGetter" id="1177410564083">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1177410564084">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1177410566712">
            <node role="expression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177410604041">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177410610438">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.PlusExpression" id="1177410627193">
                  <node role="rightExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1177410628736">
                    <property name="value" value="&gt;" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1177410624987">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1177410619631">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1177410617037" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1177410622226">
                        <link role="link" targetNodeId="1.1168428551640" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1177410625981">
                      <link role="property" targetNodeId="2.1169194664001" />
                    </node>
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.baseLanguage.StringLiteral" id="1177410605286">
                  <property name="value" value="&lt;" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1177410596275">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.PropertyGetter_FunctionParm_node" id="1177410594249" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SConceptPropertyAccess" id="1177410602022">
                  <link role="conceptProperty" targetNodeId="2.1137473891462" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptBehavior" id="1178980575228">
    <link role="concept" targetNodeId="1.1168524996431" />
    <node role="method" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration" id="1178980580496">
      <property name="name" value="getAxisInternalValue" />
      <node role="returnType" type="jetbrains.mps.baseLanguage.ClassifierType" id="1178980592515">
        <link role="classifier" extResolveInfo="3.[Classifier]String" />
      </node>
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178980580498">
        <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1179162060943">
          <node role="expression" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179162096634">
            <link role="baseMethodDeclaration" targetNodeId="5.1179161831408" />
            <link role="classConcept" targetNodeId="5.1179161788761" />
            <node role="actualArgument" type="jetbrains.mps.baseLanguage.StaticMethodCall" id="1179162097775">
              <link role="classConcept" extResolveInfo="4.[Classifier]TraversalAxis" />
              <link role="baseMethodDeclaration" extResolveInfo="4.static method ([Classifier]TraversalAxis).([StaticMethodDeclaration]parseValue((jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [String])) : (jetbrains.mps.baseLanguage.types.classifier/jetbrains.mps.baseLanguage.types.classifier [TraversalAxis]))" />
              <node role="actualArgument" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1179162112662">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.constraintsLanguage.ThisNodeExpression" id="1179162097777" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SPropertyAccess" id="1179162114235">
                  <link role="property" targetNodeId="1.1168527174196" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="constructor" type="jetbrains.mps.bootstrap.constraintsLanguage.ConceptConstructorDeclaration" id="1178980575229">
      <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1178980575230" />
    </node>
  </node>
</model>

