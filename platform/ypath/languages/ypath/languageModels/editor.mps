<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.ypath.editor">
  <persistence version="1" />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <language namespace="jetbrains.mps.bootstrap.constraintsLanguage" />
  <maxImportIndex value="37" />
  <import index="1" modelUID="jetbrains.mps.ypath.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.core.structure" version="-1" />
  <import index="5" modelUID="jetbrains.mps.baseLanguage.structure" version="-1" />
  <import index="29" modelUID="jetbrains.mps.ypath.structure@java_stub" version="-1" />
  <import index="32" modelUID="jetbrains.mps.ypath.constraints" version="-1" />
  <import index="33" modelUID="java.lang@java_stub" version="-1" />
  <import index="34" modelUID="jetbrains.mps.ypath.actions" version="-1" />
  <import index="35" modelUID="jetbrains.mps.baseLanguage.constraints" version="-1" />
  <import index="36" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <import index="37" modelUID="jetbrains.mps.ypath.runtime@java_stub" version="-1" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168428570720">
    <link role="conceptDeclaration" targetNodeId="1.1168428529658" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168428575144">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168428576716">
        <property name="drawBorder" value="false" />
        <property name="text" value="treepath&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168428587974">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;type&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1168428551640" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168428593813">
        <property name="drawBorder" value="false" />
        <property name="text" value="&gt;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168428691893">
    <link role="conceptDeclaration" targetNodeId="1.1168428649324" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168428739492">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168428744598">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1168428725556" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168428749595">
        <property name="drawBorder" value="false" />
        <property name="text" value="&gt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="textFgColor" value="blue" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168428754196">
        <property name="drawBorder" value="false" />
        <property name="drawBrackets" value="true" />
        <link role="relationDeclaration" targetNodeId="5.1137022507850" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168429856102">
    <link role="conceptDeclaration" targetNodeId="1.1168428603688" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168429858540">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component" id="1179306250318">
        <link role="editorComponent" targetNodeId="1179305743047" resolveInfo="TreePath_component" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168429871419">
        <property name="drawBorder" value="false" />
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168429937123">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1179298507919" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168429940849">
        <property name="drawBorder" value="false" />
        <property name="text" value="," />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168429945365">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1179298620994" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168429951094">
        <property name="drawBorder" value="false" />
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168468715502">
    <link role="conceptDeclaration" targetNodeId="1.1168468602533" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168468719961">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168468723210">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1168468622494" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1168903839814">
        <property name="vertical" value="true" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168904615910">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1168904428877">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1168904428878">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1168904436718">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1168904584434">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1168904552863">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1168904551923" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1168904579317">
                    <link role="link" targetNodeId="1.1168468622494" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1168904595732">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177626176032">
                    <link role="conceptDeclaration" targetNodeId="1.1168890168054" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168904626189">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168468733994">
        <property name="drawBorder" value="false" />
        <property name="attractsFocus" value="1" />
        <link role="relationDeclaration" targetNodeId="1.1168468671991" />
        <link role="actionMap" targetNodeId="1169042401237" resolveInfo="TreePathOperationExpression_DELETE" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168513814882">
    <link role="conceptDeclaration" targetNodeId="1.1168513806633" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168513817830">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168513819592">
        <property name="drawBorder" value="false" />
        <property name="text" value="from(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168526891335">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1168526996090" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168527027799">
        <property name="drawBorder" value="false" />
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168525025375">
    <link role="conceptDeclaration" targetNodeId="1.1168524996431" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178981885128">
      <property name="vertical" value="false" />
      <property name="selectable" value="false" />
      <link role="keyMap" targetNodeId="1184147435258" resolveInfo="keymap_IterateOperation" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ModelAccess" id="1178981885129">
        <property name="editable" value="false" />
        <node role="modelAcessor" type="jetbrains.mps.bootstrap.editorLanguage.structure.ModelAccessor" id="1178981885130">
          <node role="getter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Getter" id="1178981885131">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178981885132">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1178981885133">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179418761159">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1178981885135" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179418761162">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1178980580496" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="validator" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Validator" id="1178981885142">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1178981885143">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179163084123">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179163112125">
                  <link role="baseMethodDeclaration" targetNodeId="33.~String.equals(java.lang.Object):boolean" resolveInfo="equals" />
                  <node role="instance" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179418761538">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1179163112127" />
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1179418761541">
                      <link role="conceptMethodDeclaration" targetNodeId="32.1178980580496" />
                    </node>
                  </node>
                  <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_text" id="1179163112128" />
                </node>
              </node>
            </node>
          </node>
          <node role="setter" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_ModelAccess_Setter" id="1179161691338">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179161691339" />
          </node>
        </node>
        <node role="menuDescriptor" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuDescriptor" id="1179163333675">
          <node role="cellMenuPart" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Group" id="1179163334884">
            <property name="presentation" value="custom" />
            <node role="parametersFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_Query" id="1179163334885">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179163334886">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179163334887">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1179163334888">
                    <link role="classConcept" targetNodeId="29.~TraversalAxis" resolveInfo="TraversalAxis" />
                    <link role="baseMethodDeclaration" targetNodeId="29.~TraversalAxis.getConstants():java.util.List" resolveInfo="getConstants" />
                  </node>
                </node>
              </node>
            </node>
            <node role="handlerFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Generic_Group_Handler" id="1179163334889">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179163334890">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179163334891">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179163334892">
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179163334893">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_Abstract_editedNode" id="1179163334894" />
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1179163334895">
                        <link role="property" targetNodeId="1.1168527174196" />
                      </node>
                    </node>
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1179163334896">
                      <node role="value" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179163334897">
                        <link role="baseMethodDeclaration" targetNodeId="29.~TraversalAxis.getValue():java.lang.String" resolveInfo="getValue" />
                        <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_parameterObject" id="1179163334898" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="parameterObjectType" type="jetbrains.mps.baseLanguage.structure.ClassifierType" id="1192555611270">
              <link role="classifier" targetNodeId="37.~TraversalAxis" resolveInfo="TraversalAxis" />
            </node>
            <node role="matchingTextFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_MatchingText" id="1179163334900">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179163334901">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179163334902">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall" id="1179163334903">
                    <link role="classConcept" targetNodeId="34.1179161788761" />
                    <link role="baseMethodDeclaration" targetNodeId="34.1179161831408" />
                    <node role="actualArgument" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_parameterObject" id="1179163334904" />
                  </node>
                </node>
              </node>
            </node>
            <node role="descriptionTextFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_DescriptionText" id="1179163334905">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179163334906">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179163334907">
                  <node role="expression" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCall" id="1179163334908">
                    <link role="baseMethodDeclaration" targetNodeId="29.~TraversalAxis.getName():java.lang.String" resolveInfo="getName" />
                    <node role="instance" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellMenuPart_AbstractGroup_parameterObject" id="1179163334909" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1184097745865">
        <property name="vertical" value="true" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184097777346">
          <property name="text" value="!" />
        </node>
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184097745867">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184097745868">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184097765889">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184147553581">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184147555073">
                  <link role="property" targetNodeId="1.1184147405254" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184147552430" />
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184097790446">
          <property name="vertical" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184097796290">
            <property name="text" value="(" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1184148227201">
            <property name="noTargetText" value="*" />
            <link role="relationDeclaration" targetNodeId="1.1184147586245" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1184148227202">
              <link role="conceptDeclaration" targetNodeId="1.1184066209434" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184148231079">
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184764917105">
            <property name="text" value="/" />
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184764924426">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184764924427">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184764925837">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184764929475">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1184764931792">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1184764934682">
                        <link role="conceptDeclaration" targetNodeId="1.1184659060758" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184764926404">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184764928682">
                        <link role="link" targetNodeId="1.1184147586245" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184764925838" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184776090885">
            <link role="relationDeclaration" targetNodeId="1.1184776023529" />
            <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184776110519">
              <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184776110520">
                <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184776111429">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184776111430">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1184776111431">
                      <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1184776111432">
                        <link role="conceptDeclaration" targetNodeId="1.1184659060758" />
                      </node>
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184776111433">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1184776111434">
                        <link role="link" targetNodeId="1.1184147586245" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184776111435" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184097827075">
            <property name="text" value=")" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168527770204">
    <link role="conceptDeclaration" targetNodeId="1.1168527701993" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168527775058">
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168527776800">
        <property name="drawBorder" value="false" />
        <property name="text" value="[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168527781288">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1168527754706" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168527786673">
        <property name="drawBorder" value="false" />
        <property name="text" value="]" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168881569258">
    <link role="conceptDeclaration" targetNodeId="1.1168879975004" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168881575107">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168881589538">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1178557917289">
          <link role="relationDeclaration" targetNodeId="5.1178549979242" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Component" id="1179306260545">
          <link role="editorComponent" targetNodeId="1179305743047" resolveInfo="TreePath_component" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1168883918114">
          <property name="drawBorder" value="false" />
          <property name="attractsFocus" value="1" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168883926824">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168881613589">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178971936966">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971936967">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178971953695">
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193143456734">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143484713">
              <property name="text" value="obsolete {" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143510811" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193143603127">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143609964">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143612718">
              <property name="text" value="/* this section is deprecated */" />
              <property name="textFgColor" value="lightGray" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143672154" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193143518359">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143549560">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143518360">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="parent:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193143518361">
              <property name="drawBorder" value="false" />
              <property name="noTargetText" value="&lt;&lt; ... &gt;&gt;" />
              <link role="relationDeclaration" targetNodeId="1.1179298507919" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143518362">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193143518363">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143559189">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143518364">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="children:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193143518365">
              <property name="drawBorder" value="false" />
              <property name="noTargetText" value="&lt;&lt; ... &gt;&gt;" />
              <link role="relationDeclaration" targetNodeId="1.1179298620994" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143524858" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193143498179">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193143501937">
              <property name="text" value="}" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984114">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981070403">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981071681">
              <property name="text" value="features {" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981145356" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981081500">
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981081501">
              <property name="selectable" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1183981085225">
              <property name="vertical" value="true" />
              <property name="separatorText" value=" " />
              <link role="relationDeclaration" targetNodeId="1.1183980376561" />
              <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981085226">
                <property name="text" value="&lt;&lt;features&gt;&gt;" />
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981149071" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981105660">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981106897">
              <property name="text" value="}" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183980638244" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178971984115">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984117">
              <property name="drawBorder" value="false" />
              <property name="text" value="nodekinds {" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984118">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178971984119">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984121">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1178971984122">
              <property name="drawBorder" value="false" />
              <property name="vertical" value="true" />
              <property name="separatorText" value=" " />
              <link role="relationDeclaration" targetNodeId="1.1172240749936" />
              <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984123">
                <property name="drawBorder" value="false" />
                <property name="text" value="&lt;&lt; node kinds &gt;&gt;" />
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984124">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1178971984125">
            <property name="drawBorder" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178971984127">
              <property name="selectable" value="false" />
              <property name="drawBorder" value="false" />
              <property name="text" value="}" />
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1168883515937">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1168890305747">
    <link role="conceptDeclaration" targetNodeId="1.1168890168054" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1168890312650">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1168890321048">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1168890213786" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179154436783">
        <property name="selectable" value="false" />
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1179154439722">
        <link role="relationDeclaration" targetNodeId="1.1168890235188" />
        <link role="actionMap" targetNodeId="1179164666211" resolveInfo="TreePathAdapterExpression_DELETE" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1179154439723">
          <link role="conceptDeclaration" targetNodeId="1.1168879975004" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1179154457900">
            <property name="editable" value="false" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMapDeclaration" id="1169042401237">
    <property name="name" value="TreePathOperationExpression_DELETE" />
    <link role="applicableConcept" targetNodeId="1.1168468602533" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMapItem" id="1169042484808">
      <property name="description" value="Smart delete" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_ExecuteFunction" id="1169042484809">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1169042484810">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1169042510265">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1169042511204">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_FunctionParm_selectedNode" id="1169042510266" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1169042515173">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1169042520725">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_FunctionParm_selectedNode" id="1169042519830" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1169042523459">
                    <link role="link" targetNodeId="1.1168468622494" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1172240672869">
    <link role="conceptDeclaration" targetNodeId="1.1172240563057" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175163068113">
      <property name="vertical" value="true" />
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175163075424">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175163080496">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175163087458">
          <property name="drawBorder" value="false" />
          <link role="relationDeclaration" targetNodeId="1.1172240613817" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175257373859">
          <property name="drawBorder" value="false" />
          <property name="text" value=" {" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178972590638">
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175163112230">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175163114066">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1175163130774">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="true" />
          <property name="separatorText" value=" " />
          <link role="relationDeclaration" targetNodeId="1.1175162866857" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175163136901">
            <property name="drawBorder" value="false" />
            <property name="text" value="&lt;&lt; properties &gt;&gt;" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1178972554678">
        <property name="drawBorder" value="false" />
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1172242763064">
    <link role="conceptDeclaration" targetNodeId="1.1172242735136" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1172242766645">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1172242769001">
        <property name="drawBorder" value="false" />
        <property name="text" value="[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1175165292597">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="attractsFocus" value="1" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175165335007">
          <property name="drawBorder" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175165339571">
            <property name="drawBorder" value="false" />
            <property name="text" value="deprecated" />
            <property name="selectable" value="false" />
            <property name="textFgColor" value="red" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1175165391444">
            <property name="drawBorder" value="false" />
            <link role="relationDeclaration" targetNodeId="1.1172242802393" />
            <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1175165391445">
              <link role="conceptDeclaration" targetNodeId="1.1172240563057" />
              <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175165391446">
                <property name="noTargetText" value="&lt;&lt; kind &gt;&gt;" />
                <property name="readOnly" value="true" />
                <link role="relationDeclaration" targetNodeId="2.1169194664001" />
              </node>
            </node>
          </node>
        </node>
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1175165292599">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1175165292600">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1175165318361">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" id="1175165327253">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NullLiteral" id="1175165328617" />
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175165322791">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1175165321326" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1175165326026">
                    <link role="link" targetNodeId="1.1172242802393" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175166625464">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
          <property name="attractsFocus" value="0" />
          <link role="relationDeclaration" targetNodeId="1.1175165403535" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1172242949605">
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <property name="drawBorder" value="false" />
        <property name="attractsFocus" value="0" />
        <property name="text" value="]" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175161115264">
    <link role="conceptDeclaration" targetNodeId="1.1175160940972" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175161147613">
      <property name="drawBorder" value="false" />
      <link role="keyMap" targetNodeId="1175878011400" resolveInfo="keymap_TreeNodeKindProperty" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1175877896714">
        <property name="vertical" value="true" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175877925790">
          <property name="drawBorder" value="false" />
          <property name="text" value=" default" />
          <property name="fontStyle" value="BOLD" />
          <property name="selectable" value="false" />
          <property name="textFgColor" value="DARK_MAGENTA" />
        </node>
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1175877896716">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1175877896717">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ReturnStatement" id="1175877912073">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175877918825">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1175877913201" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1175877920324">
                  <link role="property" targetNodeId="1.1175877871677" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175877967658">
          <property name="selectable" value="false" />
          <property name="drawBorder" value="false" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175161161310">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        <link role="keyMap" targetNodeId="1175878011400" resolveInfo="keymap_TreeNodeKindProperty" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175161216688">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175161221950">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1175160966691" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175165546638">
    <link role="conceptDeclaration" targetNodeId="1.1175165417012" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175167690330">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1175256342830">
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="kind?" />
        <property name="attractsFocus" value="2" />
        <link role="relationDeclaration" targetNodeId="1.1175167444487" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1175256342831">
          <link role="conceptDeclaration" targetNodeId="1.1172240563057" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175256342832">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175169829267">
    <link role="conceptDeclaration" targetNodeId="1.1175169769579" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175169841526">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175170079264">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175169854239">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="kind?" />
        <link role="relationDeclaration" targetNodeId="1.1175165403535" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175169869324">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1175169875861">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="property?" />
        <property name="attractsFocus" value="1" />
        <link role="relationDeclaration" targetNodeId="1.1175169795791" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1175169875862">
          <link role="conceptDeclaration" targetNodeId="1.1175160940972" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1175169884783">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175169899009">
        <property name="selectable" value="false" />
        <property name="drawBorder" value="false" />
        <property name="text" value=":" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175170041978">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1175170018451" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175170085297">
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <property name="drawBorder" value="false" />
        <property name="text" value="]" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1175878011400">
    <property name="name" value="keymap_TreeNodeKindProperty" />
    <link role="applicableConcept" targetNodeId="1.1175160940972" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1175878042761">
      <property name="description" value="Make this property default" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1175878042762">
        <property name="keycode" value="VK_D" />
        <property name="modifiers" value="ctrl" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1175878042763">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1175878042764">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1175878105610">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1175878105611">
              <property name="name" value="treepath" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1175878105612">
                <link role="concept" targetNodeId="1.1168879975004" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878163037">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1175878151443" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1175878167812">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1175878171391">
                    <link role="concept" targetNodeId="1.1168879975004" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1175878250425">
            <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878265805">
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1175878263181">
                <link role="variableDeclaration" targetNodeId="1175878105611" resolveInfo="treepath" />
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetDescendantsOperation" id="1175878268694" />
            </node>
            <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1175878250427">
              <property name="name" value="desc" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1175878253215" />
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1175878250429">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.IfStatement" id="1175878300093">
                <node role="condition" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878306913">
                  <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1175878302081">
                    <link role="variableDeclaration" targetNodeId="1175878250427" resolveInfo="desc" />
                  </node>
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1175878308253">
                    <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1177626176206">
                      <link role="conceptDeclaration" targetNodeId="1.1175160940972" />
                    </node>
                  </node>
                </node>
                <node role="ifTrue" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1175878300095">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1175878674276">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878685190">
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878681988">
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1175878675146">
                          <link role="concept" targetNodeId="1.1175160940972" />
                          <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1175878674277">
                            <link role="variableDeclaration" targetNodeId="1175878250427" resolveInfo="desc" />
                          </node>
                        </node>
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1175878683040">
                          <link role="property" targetNodeId="1.1175877871677" />
                        </node>
                      </node>
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1175878685842">
                        <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1175878687758" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1175878700774">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878708541">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1175878702457">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1175878700775" />
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1175878704327">
                  <link role="property" targetNodeId="1.1175877871677" />
                </node>
              </node>
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1175878709501">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1175878711284">
                  <property name="value" value="true" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1175879264396">
    <link role="conceptDeclaration" targetNodeId="1.1175879071372" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1175879269464">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175879269465">
        <property name="drawBorder" value="false" />
        <property name="text" value="[[" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1175879269472">
        <property name="drawBorder" value="false" />
        <property name="attractsFocus" value="1" />
        <link role="relationDeclaration" targetNodeId="1.1175170018451" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1175879269473">
        <property name="rightTransformAnchorTag" value="default_RTransform" />
        <property name="drawBorder" value="false" />
        <property name="text" value="]]" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMapDeclaration" id="1179164666211">
    <property name="name" value="TreePathAdapterExpression_DELETE" />
    <link role="applicableConcept" targetNodeId="1.1168890168054" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMapItem" id="1179164691978">
      <property name="description" value="Delete adapter" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_ExecuteFunction" id="1179164691979">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1179164691980">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1179164710026">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179164711778">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_FunctionParm_selectedNode" id="1179164710027" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation" id="1179164713404">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1179164716282">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellActionMap_FunctionParm_selectedNode" id="1179164715062" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1179164717799">
                    <link role="link" targetNodeId="1.1168890213786" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.EditorComponentDeclaration" id="1179305743047">
    <property name="name" value="TreePath_component" />
    <link role="conceptDeclaration" targetNodeId="1.1179235924605" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1179306198078">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1179306204982">
        <link role="relationDeclaration" targetNodeId="1.1179235945873" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1179571857869">
    <link role="conceptDeclaration" targetNodeId="1.1179571785614" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1179571859980">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1179571861967">
        <property name="editable" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179571870250">
        <property name="text" value="&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1179571874690">
        <link role="relationDeclaration" targetNodeId="1.1179571818225" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179571877879">
        <property name="text" value="&gt;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1179740291108">
    <link role="conceptDeclaration" targetNodeId="1.1179740189248" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1179740294081">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1179740310923">
        <property name="editable" value="false" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179740379380">
        <property name="selectable" value="false" />
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1179740382822">
        <link role="relationDeclaration" targetNodeId="1.1179740217128" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1179740382823">
          <link role="conceptDeclaration" targetNodeId="1.1168879975004" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1179740391081">
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179740395133">
        <property name="selectable" value="false" />
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1179740398231">
        <link role="relationDeclaration" targetNodeId="1.1179740244195" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1179740398232">
          <link role="conceptDeclaration" targetNodeId="1.1172240563057" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1179740402221">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1179740407727">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180007630819">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180007382905" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007634743">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007637291">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180007668540">
          <property name="text" value="case" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1180007672369">
          <link role="relationDeclaration" targetNodeId="1.1180007405188" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1180007672370">
            <link role="conceptDeclaration" targetNodeId="1.1172240563057" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1180007677028">
              <link role="relationDeclaration" targetNodeId="2.1169194664001" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024234914">
          <property name="layoutConstraint" value="punctuation" />
          <property name="selectable" value="false" />
          <property name="text" value=":" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007706121">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180007706122">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024254200">
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180024254201">
            <link role="relationDeclaration" targetNodeId="1.1180024059811" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024258689">
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024266598">
              <property name="text" value="break" />
              <property name="textFgColor" value="DARK_BLUE" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024273789">
              <property name="layoutConstraint" value="punctuation" />
              <property name="text" value=";" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180007820089">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180007571027" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007831153">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007832765">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180007847938">
          <property name="text" value="default" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180007922074">
          <property name="selectable" value="false" />
          <property name="layoutConstraint" value="punctuation" />
          <property name="text" value=":" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180007870523">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180007870524">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024149687">
          <property name="vertical" value="true" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180024149688">
            <link role="relationDeclaration" targetNodeId="1.1180024059811" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024166179">
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024166180">
              <property name="text" value="break" />
              <property name="textFgColor" value="DARK_BLUE" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024168761">
              <property name="layoutConstraint" value="punctuation" />
              <property name="text" value=";" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180007931716">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180006635472" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180008008594">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180008011627">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180009069615">
          <property name="text" value="visit" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180025208549">
          <link role="relationDeclaration" targetNodeId="1.1168428725556" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180025214675">
          <property name="text" value="in" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180009074148">
          <link role="relationDeclaration" targetNodeId="1.1180009041864" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180025146801">
          <link role="relationDeclaration" targetNodeId="1.1180025154301" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180008022725">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180008048697">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180008048698">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180024998253">
          <link role="relationDeclaration" targetNodeId="5.1137022507850" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180008035898">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180010049943">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180007355512" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Error" id="1180010067930">
      <property name="text" value="select case" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180010561182">
    <link role="conceptDeclaration" targetNodeId="1.1168428709096" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1180010566277">
      <property name="fontStyle" value="ITALIC" />
      <property name="textFgColor" value="DARK_BLUE" />
      <link role="relationDeclaration" targetNodeId="2.1169194664001" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180011189625">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180011113930" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180014178115">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1180014178116">
        <property name="editable" value="false" />
        <property name="textFgColor" value="DARK_BLUE" />
        <link role="relationDeclaration" targetNodeId="2.1137473891462" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180014183119">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180014193419">
          <property name="text" value="(" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1180014198298">
          <property name="vertical" value="false" />
          <property name="separatorText" value="," />
          <link role="relationDeclaration" targetNodeId="1.1180014148583" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180014219471">
            <property name="text" value="&lt;no arguments&gt;" />
            <property name="textFgColor" value="lightGray" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180014195577">
          <property name="text" value=")" />
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1180014893122">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1180014893123">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1180014896424">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" id="1180015482839">
                <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.IntegerConstant" id="1180015486803">
                  <property name="value" value="0" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180014922654">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation" id="1180014923991" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180025725099">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess" id="1180025727425">
                      <link role="link" targetNodeId="1.1180025054224" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180014917805">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1180025723790">
                        <link role="link" targetNodeId="1.1180025154301" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1180014912621">
                        <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1180014914908">
                          <link role="conceptMethodDeclaration" targetNodeId="32.1180014794484" />
                        </node>
                        <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1180014909099" />
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
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180013809829">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180013705438" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180013815315">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180013818192">
        <link role="relationDeclaration" targetNodeId="5.1068431790188" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1180013823179">
        <link role="relationDeclaration" targetNodeId="5.1083152972671" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180013858259">
        <property name="selectable" value="false" />
        <property name="text" value="=" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180013893713">
        <link role="relationDeclaration" targetNodeId="5.1068431790190" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180023904914">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180023776692" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024000481">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024000482">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024000483">
          <property name="text" value="switch" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180024000484">
          <link role="relationDeclaration" targetNodeId="1.1180023956589" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024000485">
          <property name="text" value="kind" />
          <property name="textFgColor" value="DARK_BLUE" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024000486">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180024006715">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024006716">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1180024016002">
          <property name="vertical" value="true" />
          <link role="relationDeclaration" targetNodeId="1.1180023812423" />
          <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024026536">
            <property name="text" value="&lt;no cases&gt;" />
            <property name="textFgColor" value="lightGray" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180024003666">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180024974146">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180024940230" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1180024976538">
      <link role="relationDeclaration" targetNodeId="1.1180024958680" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1180025075860">
    <property name="package" value="treeOperation.visit" />
    <link role="conceptDeclaration" targetNodeId="1.1180025029823" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1180025114325">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180025118096">
        <property name="text" value="(" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList" id="1180025114326">
        <property name="vertical" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1180025054224" />
        <node role="emptyCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180025114327">
          <property name="text" value="&lt;no parameters&gt;" />
          <property name="textFgColor" value="lightGray" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1180025122113">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1183979884557">
    <property name="package" value="treePath.features" />
    <link role="conceptDeclaration" targetNodeId="1.1183978481785" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183979890826">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184094990160">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="keyMap" targetNodeId="1184080799528" resolveInfo="keymap_ListFeature" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184094998085">
          <property name="text" value="default" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184095005831">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184095005832">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184095008153">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184095008708">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184095009795">
                    <link role="property" targetNodeId="1.1184094715536" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184095008154" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184095024055">
          <property name="noTargetText" value="?name?" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981709027">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981709028">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981719504">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1183981724904">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1183981724905">
              <property name="text" value="writable:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1183981724906">
              <link role="relationDeclaration" targetNodeId="1.1184066216986" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606826304">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606827237">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1184606832576">
              <property name="vertical" value="true" />
              <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832577">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832578">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832579">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832580">
                    <link role="relationDeclaration" targetNodeId="1.1183979776626" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832581">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832582">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832583">
                    <link role="relationDeclaration" targetNodeId="1.1183979799057" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832584">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832585">
                    <property name="text" value="set" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832586">
                    <link role="relationDeclaration" targetNodeId="1.1183979813837" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832587">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832588">
                    <property name="text" value="insert" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832589">
                    <link role="relationDeclaration" targetNodeId="1.1183979833129" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832590">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832591">
                    <property name="text" value="delete" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832592">
                    <link role="relationDeclaration" targetNodeId="1.1183979849670" />
                  </node>
                </node>
              </node>
              <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184606832593">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184606832594">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184606832595">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184606832596">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184606832597">
                        <link role="property" targetNodeId="1.1184066216986" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184606832598" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832599">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832600">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832601">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832602">
                    <link role="relationDeclaration" targetNodeId="1.1183979776626" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606832603">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606832604">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606832605">
                    <link role="relationDeclaration" targetNodeId="1.1183979799057" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1184066566379">
    <property name="package" value="treePath.features" />
    <link role="conceptDeclaration" targetNodeId="1.1184066481897" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184066575803">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184095094786">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="keyMap" targetNodeId="1184094836392" resolveInfo="keymap_SequenceFeature" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184095096391">
          <property name="text" value="default" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184095100888">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184095100889">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184095102949">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184095102987">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184095104320">
                    <link role="property" targetNodeId="1.1184094715536" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184095102950" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184095840184">
          <property name="noTargetText" value="?name?" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184066575805">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184066575806">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184066575807">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184066575808">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184066575809">
              <property name="text" value="writable:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184066575810">
              <link role="relationDeclaration" targetNodeId="1.1184066216986" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606863603">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606864888">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1184606870944">
              <property name="vertical" value="true" />
              <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870945">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870946">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870947">
                    <property name="text" value="sequence" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870948">
                    <link role="relationDeclaration" targetNodeId="1.1184066514754" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870949">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870950">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870952">
                    <link role="relationDeclaration" targetNodeId="1.1183979799057" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870953">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870954">
                    <property name="text" value="add" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870955">
                    <link role="relationDeclaration" targetNodeId="1.1184066542561" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870956">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870957">
                    <property name="text" value="remove" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870958">
                    <link role="relationDeclaration" targetNodeId="1.1184066550942" />
                  </node>
                </node>
              </node>
              <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184606870959">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184606870960">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184606870961">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184606870962">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184606870963">
                        <link role="property" targetNodeId="1.1184066216986" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184606870964" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870965">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870966">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870967">
                    <property name="text" value="sequence" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870968">
                    <link role="relationDeclaration" targetNodeId="1.1184066514754" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184606870969">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184606870970">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184606870971">
                    <link role="relationDeclaration" targetNodeId="1.1183979799057" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1184080799528">
    <property name="name" value="keymap_ListFeature" />
    <link role="applicableConcept" targetNodeId="1.1183978481785" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1184081015511">
      <property name="description" value="make this feature the default" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1184081015512">
        <property name="modifiers" value="alt" />
        <property name="keycode" value="VK_D" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1184096763455">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184096763456">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184096763457">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184096763458">
              <property name="name" value="tp" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184096763459">
                <link role="concept" targetNodeId="1.1179235924605" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096763460">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184096763461">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184096763462">
                    <link role="concept" targetNodeId="1.1179235924605" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184096763463" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184096763464">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184096763465">
              <property name="name" value="isDefault" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184096763466" />
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096763467">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184096763468">
                  <link role="property" targetNodeId="1.1175877871677" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184096763469">
                  <link role="concept" targetNodeId="1.1184066209434" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184096763470" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1184096763471">
            <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184096763472">
              <property name="name" value="fe" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184096763473">
                <link role="concept" targetNodeId="1.1184066209434" />
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184096763474">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184096763475">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096763476">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1184096763477">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184096763478">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1184096763479">
                        <node role="rightExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184096763480" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096763481">
                          <link role="variableDeclaration" targetNodeId="1184096763472" resolveInfo="fe" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1184096763482">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096763483">
                          <link role="variableDeclaration" targetNodeId="1184096763465" resolveInfo="isDefault" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096763484">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184096763485">
                      <link role="property" targetNodeId="1.1175877871677" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096763486">
                      <link role="variableDeclaration" targetNodeId="1184096763472" resolveInfo="fe" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096763487">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList" id="1184096763488">
                <link role="link" targetNodeId="1.1183980376561" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096763489">
                <link role="variableDeclaration" targetNodeId="1184096763458" resolveInfo="tp" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1184094836392">
    <property name="name" value="keymap_SequenceFeature" />
    <link role="applicableConcept" targetNodeId="1.1184066481897" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1184094850309">
      <property name="description" value="make this feature the dafault" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1184094850310">
        <property name="modifiers" value="alt" />
        <property name="keycode" value="VK_D" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1184094897416">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184094897417">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184094897418">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184094897419">
              <property name="name" value="tp" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184094897420">
                <link role="concept" targetNodeId="1.1179235924605" />
              </node>
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184094897421">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation" id="1184094897422">
                  <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.structure.OperationParm_Concept" id="1184094897423">
                    <link role="concept" targetNodeId="1.1179235924605" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184094897424" />
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" id="1184096663519">
            <node role="localVariableDeclaration" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184096663520">
              <property name="name" value="isDefault" />
              <node role="type" type="jetbrains.mps.baseLanguage.structure.BooleanType" id="1184096663521" />
              <node role="initializer" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184096675610">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184096676546">
                  <link role="property" targetNodeId="1.1184094715536" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression" id="1184096671593">
                  <link role="concept" targetNodeId="1.1184066209434" />
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184096671505" />
                </node>
              </node>
            </node>
          </node>
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ForeachStatement" id="1184094897425">
            <node role="variable" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" id="1184094897426">
              <property name="name" value="fe" />
              <node role="type" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType" id="1184094897427">
                <link role="concept" targetNodeId="1.1184066209434" />
              </node>
            </node>
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184094897428">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184095322185">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184095326586">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1184095327527">
                    <node role="value" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1184096707333">
                      <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.EqualsExpression" id="1184096745921">
                        <node role="rightExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184096747092" />
                        <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096744727">
                          <link role="variableDeclaration" targetNodeId="1184094897426" resolveInfo="fe" />
                        </node>
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1184096694722">
                        <node role="expression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184096696620">
                          <link role="variableDeclaration" targetNodeId="1184096663520" resolveInfo="isDefault" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184095323264">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184095324580">
                      <link role="property" targetNodeId="1.1184094715536" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184095322186">
                      <link role="variableDeclaration" targetNodeId="1184094897426" resolveInfo="fe" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="iterable" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184094897438">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccessAsList" id="1184094897439">
                <link role="link" targetNodeId="1.1183980376561" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference" id="1184094897440">
                <link role="variableDeclaration" targetNodeId="1184094897419" resolveInfo="tp" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1184147435258">
    <property name="name" value="keymap_IterateOperation" />
    <link role="applicableConcept" targetNodeId="1.1168524996431" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1184147454297">
      <property name="description" value="trigger using the default feature" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1184147454298">
        <property name="modifiers" value="alt" />
        <property name="keycode" value="VK_D" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1184147454299">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184147454300">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184147481168">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184147486318">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1184147487116">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1184147489655">
                  <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184147493523">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184147495485">
                      <link role="property" targetNodeId="1.1184147405254" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184147491736" />
                  </node>
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184147481958">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184147485201">
                  <link role="property" targetNodeId="1.1184147405254" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1184147481169" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1184657730977">
    <property name="package" value="treePath.features" />
    <link role="conceptDeclaration" targetNodeId="1.1184657361043" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752771">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752772">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="keyMap" targetNodeId="1184080799528" resolveInfo="keymap_ListFeature" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184657752773">
          <property name="text" value="default" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184657752774">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184657752775">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184657752776">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184657752777">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184657752778">
                    <link role="property" targetNodeId="1.1184094715536" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184657752779" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184657752780">
          <property name="noTargetText" value="?name?" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752781">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184657752782">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752783">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184761012557">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184761012558">
              <property name="text" value="parameter:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184761012559">
              <link role="relationDeclaration" targetNodeId="1.1184659264134" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752787">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752789">
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184761020959">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184761020960">
                  <property name="text" value="query:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184761020961">
                  <link role="relationDeclaration" targetNodeId="1.1184659272196" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184657752796">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184657752797">
                  <property name="text" value="target type:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184657752798">
                  <link role="relationDeclaration" targetNodeId="1.1184659278821" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185010336037">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185010336038">
                  <property name="text" value="toString:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1185010336039">
                  <link role="relationDeclaration" targetNodeId="1.1184659752377" />
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760986417">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760986418">
              <property name="text" value="writable:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184760986419">
              <link role="relationDeclaration" targetNodeId="1.1184066216986" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993240">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993241">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1184760993242">
              <property name="vertical" value="true" />
              <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993243">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993244">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993245">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993246">
                    <link role="relationDeclaration" targetNodeId="1.1184657381450" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993247">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993248">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993249">
                    <link role="relationDeclaration" targetNodeId="1.1184658795224" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993250">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993251">
                    <property name="text" value="set" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993252">
                    <link role="relationDeclaration" targetNodeId="1.1184658800469" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993253">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993254">
                    <property name="text" value="insert" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993255">
                    <link role="relationDeclaration" targetNodeId="1.1184658807708" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993256">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993257">
                    <property name="text" value="delete" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993258">
                    <link role="relationDeclaration" targetNodeId="1.1184658813022" />
                  </node>
                </node>
              </node>
              <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184760993259">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184760993260">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184760993261">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184760993262">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184760993263">
                        <link role="property" targetNodeId="1.1184066216986" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184760993264" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993265">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993266">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993267">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993268">
                    <link role="relationDeclaration" targetNodeId="1.1184657381450" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760993269">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760993270">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760993271">
                    <link role="relationDeclaration" targetNodeId="1.1184658795224" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1184659126273">
    <property name="package" value="treePath.features" />
    <link role="conceptDeclaration" targetNodeId="1.1184658874084" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128455">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128456">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="keyMap" targetNodeId="1184094836392" resolveInfo="keymap_SequenceFeature" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184659128457">
          <property name="text" value="default" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184659128458">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184659128459">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184659128460">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184659128461">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184659128462">
                    <link role="property" targetNodeId="1.1184094715536" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184659128463" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184659128464">
          <property name="noTargetText" value="?name?" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128465">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184659128466">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128467">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760434587">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760436768">
              <property name="text" value="parameter:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760460780">
              <link role="relationDeclaration" targetNodeId="1.1184659264134" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128471">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760487992">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659128473">
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <property name="usesBraces" value="false" />
              <property name="drawBrackets" value="true" />
              <property name="bracketsColor" value="lightGray" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760470471">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760471634">
                  <property name="text" value="query:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760477353">
                  <link role="relationDeclaration" targetNodeId="1.1184659272196" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1185010384070">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1185010384071">
                  <property name="text" value="target type:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1185010384072">
                  <link role="relationDeclaration" targetNodeId="1.1184659278821" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184659729332">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184659736114">
                  <property name="text" value="toString:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184659839743">
                  <link role="relationDeclaration" targetNodeId="1.1184659752377" />
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760335312">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760335313">
              <property name="text" value="writable:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184760335314">
              <link role="relationDeclaration" targetNodeId="1.1184066216986" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348028">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348029">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1184760348030">
              <property name="vertical" value="true" />
              <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348031">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348032">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348033">
                    <property name="text" value="sequence" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348034">
                    <link role="relationDeclaration" targetNodeId="1.1184658913029" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348035">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348036">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348037">
                    <link role="relationDeclaration" targetNodeId="1.1184658929081" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348038">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348039">
                    <property name="text" value="add" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348040">
                    <link role="relationDeclaration" targetNodeId="1.1184658934565" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348041">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348042">
                    <property name="text" value="remove" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348043">
                    <link role="relationDeclaration" targetNodeId="1.1184658938633" />
                  </node>
                </node>
              </node>
              <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1184760348044">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1184760348045">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1184760348046">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1184760348047">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1184760348048">
                        <link role="property" targetNodeId="1.1184066216986" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1184760348049" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348050">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348051">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348052">
                    <property name="text" value="sequence" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348053">
                    <link role="relationDeclaration" targetNodeId="1.1184658913029" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1184760348054">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1184760348055">
                    <property name="text" value="size" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1184760348056">
                    <link role="relationDeclaration" targetNodeId="1.1184658929081" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1184776130290">
    <property name="package" value="treeOperation.traverse" />
    <link role="conceptDeclaration" targetNodeId="1.1184768155075" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1184776135508">
      <property name="editable" value="false" />
      <link role="relationDeclaration" targetNodeId="2.1169194664001" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1190799198273">
    <property name="package" value="treePath.features" />
    <link role="conceptDeclaration" targetNodeId="1.1190798501119" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200431">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200432">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <link role="keyMap" targetNodeId="1184080799528" resolveInfo="keymap_ListFeature" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200433">
          <property name="text" value="default" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1190799200434">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190799200435">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190799200436">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190799200437">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1190799200438">
                    <link role="property" targetNodeId="1.1184094715536" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1190799200439" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1190799200440">
          <property name="noTargetText" value="?name?" />
          <link role="relationDeclaration" targetNodeId="2.1169194664001" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200441">
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200442">
          <property name="selectable" value="false" />
          <property name="text" value="  " />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200443">
          <property name="vertical" value="true" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200444">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200445">
              <property name="text" value="parameter:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200446">
              <link role="relationDeclaration" targetNodeId="1.1184659264134" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200447">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200448">
              <property name="vertical" value="true" />
              <property name="selectable" value="false" />
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200449">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200450">
                  <property name="text" value="query:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200451">
                  <link role="relationDeclaration" targetNodeId="1.1184659272196" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200452">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200453">
                  <property name="text" value="target type:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200454">
                  <link role="relationDeclaration" targetNodeId="1.1184659278821" />
                </node>
              </node>
              <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200455">
                <property name="vertical" value="false" />
                <property name="selectable" value="false" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200456">
                  <property name="text" value="toString:" />
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200457">
                  <link role="relationDeclaration" targetNodeId="1.1184659752377" />
                </node>
              </node>
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1193058640306">
            <property name="selectable" value="false" />
            <property name="vertical" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1193058645436">
              <property name="text" value="isSingle:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1193058653700">
              <link role="relationDeclaration" targetNodeId="1.1193057911192" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200458">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200459">
              <property name="text" value="writable:" />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1190799200460">
              <link role="relationDeclaration" targetNodeId="1.1184066216986" />
            </node>
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200461">
            <property name="vertical" value="false" />
            <property name="selectable" value="false" />
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200462">
              <property name="text" value="  " />
            </node>
            <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1190799200463">
              <property name="vertical" value="true" />
              <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200464">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200465">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200466">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200467">
                    <link role="relationDeclaration" targetNodeId="1.1192877073256" />
                  </node>
                </node>
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194537575784">
                  <property name="selectable" value="false" />
                  <property name="vertical" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194545399662">
                    <property name="text" value="set" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194545402787">
                    <link role="relationDeclaration" targetNodeId="1.1194545216305" />
                  </node>
                </node>
              </node>
              <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1190799200480">
                <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1190799200481">
                  <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1190799200482">
                    <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1190799200483">
                      <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1190799200484">
                        <link role="property" targetNodeId="1.1184066216986" />
                      </node>
                      <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1190799200485" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200486">
                <property name="vertical" value="true" />
                <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1190799200487">
                  <property name="vertical" value="false" />
                  <property name="selectable" value="false" />
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1190799200488">
                    <property name="text" value="get" />
                  </node>
                  <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1190799200489">
                    <link role="relationDeclaration" targetNodeId="1.1192877073256" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194013272267">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194013204484" resolveInfo="WritePath" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194013275984">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194013282712">
        <property name="noTargetText" value="&lt;treepath&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194013242049" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194427884219">
        <property name="text" value="@" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1194013803402">
        <property name="noTargetText" value="&lt;feature&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194013217171" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1194013803403">
          <link role="conceptDeclaration" targetNodeId="1.1184066209434" resolveInfo="IFeature" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194179559496">
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1169194664001" resolveInfo="name" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194179567405">
        <property name="text" value="/" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194180507770">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194180507771">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194180510831">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194180515510">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1194180519984">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1194180523675">
                    <link role="conceptDeclaration" targetNodeId="1.1184659060758" resolveInfo="IParamFeature" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194180512905">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1194180515234">
                    <link role="link" targetNodeId="1.1194013217171" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194180510832" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194180569121">
        <property name="noTargetText" value="&lt;param&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194180532459" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194436973064">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194436973065">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194436982607">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194436982608">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation" id="1194436982609">
                  <node role="conceptArgument" type="jetbrains.mps.bootstrap.smodelLanguage.structure.RefConcept_Reference" id="1194436982610">
                    <link role="conceptDeclaration" targetNodeId="1.1184659060758" resolveInfo="IParamFeature" />
                  </node>
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194436982611">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess" id="1194436982612">
                    <link role="link" targetNodeId="1.1194013217171" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194436982613" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194187744953">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194183816448" resolveInfo="InsertWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194187748028">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1194427557568">
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194427533744">
        <property name="noTargetText" value="&lt;expression&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194187847981" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194427535944">
        <property name="text" value="INTO" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194187755321">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194435317030">
        <property name="noTargetText" value="&lt;location&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194433340048" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432115838">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194188123728">
    <link role="conceptDeclaration" targetNodeId="1.1194182910610" resolveInfo="WritePathType" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194188126518">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194188127484">
        <property name="text" value="writepath&lt;" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194188651021">
        <link role="relationDeclaration" targetNodeId="1.1194188619952" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194369413434">
        <property name="text" value="," />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194369416786">
        <link role="relationDeclaration" targetNodeId="1.1194357856748" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194427454981">
        <property name="text" value="&gt;" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194432075163">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194432051248" resolveInfo="AppendWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194432077526">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1194432091620">
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432095606">
        <link role="relationDeclaration" targetNodeId="1.1194187847981" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432098743">
        <property name="text" value="TO" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432102198">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432121501">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194432151122">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194432127816" resolveInfo="PrependWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194432153808">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1194432161210">
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432164282">
        <link role="relationDeclaration" targetNodeId="1.1194187847981" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432170087">
        <property name="text" value="TO" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432173514">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432175203">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194432527678">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194432506089" resolveInfo="RemoveWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194432530240">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1194432534740">
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432537906">
        <link role="relationDeclaration" targetNodeId="1.1194187847981" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432540360">
        <property name="text" value="FROM" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194432545603">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194432547125">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194436150358">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194435898264" resolveInfo="ElementAnchor" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194436153601">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194436154821">
        <property name="vertical" value="true" />
        <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194436157169">
          <property name="text" value="BEFORE" />
        </node>
        <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194436154823">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194436154824">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194436198252">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194436198737">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194436199967">
                  <link role="property" targetNodeId="1.1194436178465" resolveInfo="before" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194436198253" />
              </node>
            </node>
          </node>
        </node>
        <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194436160141">
          <property name="text" value="AFTER" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194436165627">
        <link role="relationDeclaration" targetNodeId="1.1194700181003" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194437146711">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194435322566" resolveInfo="IndexAnchor" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194437149801">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194437150993">
        <property name="text" value="AT" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194437155764">
        <link role="relationDeclaration" targetNodeId="1.1194700181003" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194457527545">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194437702626" resolveInfo="RemoveAtWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194457531551">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1194457539060">
        <link role="relationDeclaration" targetNodeId="2.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194457542482">
        <property name="noTargetText" value="&lt;location&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1194457485556" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194457552865">
        <property name="text" value="FROM" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194457558197">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194457560539">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194609178455">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194568360537" resolveInfo="IndexRange" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609180984">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194717948766">
        <property name="text" value="*INVALID RANGE*" />
        <property name="textFgColor" value="red" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718025451">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718025452">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718031447">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194718031448">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718033111">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718034286">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716627634" resolveInfo="isValid" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718032769" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194718473952">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194718482370">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194628720593" resolveInfo="keymap_Range_IncludeStart" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718482371">
            <property name="text" value="[" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718482372">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718482373">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718482374">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194718482375">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718482376">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718482377">
                      <link role="property" targetNodeId="1.1194609145210" resolveInfo="includes_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718482378" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718482379">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718482380">
                      <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718482381" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718482382">
            <property name="text" value="(" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194718482393">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194629263586" resolveInfo="keymap_Range_SetStart" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194718482394">
            <link role="relationDeclaration" targetNodeId="1.1194568581597" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718482395">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718482396">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718482397">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718482398">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718482399">
                    <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718482400" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718482401">
            <property name="text" value="-" />
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718496572">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718496573">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718497515">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1194718497516">
                <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718497517">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718497518">
                    <link role="property" targetNodeId="1.1194609145210" resolveInfo="includes_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718497519" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718497520">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718497521">
                    <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718497522" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194718625826">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718656411">
          <property name="text" value="]" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718665226">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718665227">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718667331">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194718675810">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718678166">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718682347">
                      <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718677297" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718668143">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718673465">
                      <link role="conceptMethodDeclaration" targetNodeId="32.1194716995764" resolveInfo="isSingleselection" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718667332" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718731395">
          <property name="text" value=".." />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718735372">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718735373">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718740488">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718740953">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718742836">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716132256" resolveInfo="isSelection" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718740489" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718754682">
          <property name="text" value="|" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718761237">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718761238">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718762866">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718763256">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718765672">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716377388" resolveInfo="isInsertionPoint" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718762867" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718770021">
          <property name="text" value="[" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718779218">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718779219">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718780348">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194718785006">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718786389">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718787960">
                      <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718785818" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718780677">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718782120">
                      <link role="conceptMethodDeclaration" targetNodeId="32.1194716995764" resolveInfo="isSingleselection" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718780349" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718629342">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718629343">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718631135">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718631455">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194718633304">
                  <link role="conceptMethodDeclaration" targetNodeId="32.1194716627634" resolveInfo="isValid" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718631136" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194718517362">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194718523710">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194629573748" resolveInfo="keymap_Range_SetEnd" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194718523711">
            <link role="relationDeclaration" targetNodeId="1.1194568638768" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718523712">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718523713">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718523714">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718523715">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718523716">
                    <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718523717" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718523718">
            <property name="text" value="-" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194718523729">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194628996018" resolveInfo="keymap_Range_IncludeEnd" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718523730">
            <property name="text" value="]" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718523731">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718523732">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718523733">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194718523734">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718523735">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718523736">
                      <link role="property" targetNodeId="1.1194609145937" resolveInfo="includes_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718523737" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718523738">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718523739">
                      <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718523740" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194718523741">
            <property name="text" value=")" />
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194718535504">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194718535505">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194718536602">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1194718536603">
                <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718536604">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718536605">
                    <link role="property" targetNodeId="1.1194609145937" resolveInfo="includes_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718536606" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194718536607">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194718536608">
                    <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194718536609" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609294294">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609296584">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609298314">
          <property name="text" value="has start:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609338520">
          <link role="relationDeclaration" targetNodeId="1.1194609143713" resolveInfo="set_start" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609346351">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609347894">
          <property name="text" value="has end:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609353586">
          <link role="relationDeclaration" targetNodeId="1.1194609144501" resolveInfo="set_end" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609359854">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609361512">
          <property name="text" value="includes start:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609372525">
          <link role="relationDeclaration" targetNodeId="1.1194609145210" resolveInfo="including_start" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609378349">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609379963">
          <property name="text" value="includes end:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609386862">
          <link role="relationDeclaration" targetNodeId="1.1194609145937" resolveInfo="including_end" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194609524468">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194568850581" resolveInfo="RelativeRange" />
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609525944">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609525945">
        <property name="vertical" value="false" />
        <property name="selectable" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609525946">
          <property name="text" value="has start:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609525947">
          <link role="relationDeclaration" targetNodeId="1.1194609143713" resolveInfo="set_start" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609525948">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609525949">
          <property name="text" value="has end:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609525950">
          <link role="relationDeclaration" targetNodeId="1.1194609144501" resolveInfo="set_end" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609525951">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609525952">
          <property name="text" value="includes start:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609525953">
          <link role="relationDeclaration" targetNodeId="1.1194609145210" resolveInfo="including_start" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194609525954">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194609525955">
          <property name="text" value="includes end:" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1194609525956">
          <link role="relationDeclaration" targetNodeId="1.1194609145937" resolveInfo="including_end" />
        </node>
      </node>
    </node>
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194719066464">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066465">
        <property name="text" value="*INVALID RANGE*" />
        <property name="textFgColor" value="red" />
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066466">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066467">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066468">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194719066469">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066470">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066471">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716627634" resolveInfo="isValid" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066472" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194719066473">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194719066474">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194628720593" resolveInfo="keymap_Range_IncludeStart" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066475">
            <property name="text" value="[" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066476">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066477">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066478">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194719066479">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066480">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066481">
                      <link role="property" targetNodeId="1.1194609145210" resolveInfo="includes_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066482" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066483">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066484">
                      <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066485" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066486">
            <property name="text" value="(" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194719066487">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194629263586" resolveInfo="keymap_Range_SetStart" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194719066488">
            <link role="relationDeclaration" targetNodeId="1.1194568866390" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066489">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066490">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066491">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066492">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066493">
                    <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066494" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066495">
            <property name="text" value="-" />
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066496">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066497">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066498">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1194719066499">
                <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066500">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066501">
                    <link role="property" targetNodeId="1.1194609145210" resolveInfo="includes_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066502" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066503">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066504">
                    <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066505" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194719066506">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066507">
          <property name="text" value="]" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066508">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066509">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066510">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194719066511">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066512">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066513">
                      <link role="property" targetNodeId="1.1194609143713" resolveInfo="has_start" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066514" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066515">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066516">
                      <link role="conceptMethodDeclaration" targetNodeId="32.1194716995764" resolveInfo="isSingleselection" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066517" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066518">
          <property name="text" value=".." />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066519">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066520">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066521">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066522">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066523">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716132256" resolveInfo="isSelection" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066524" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066525">
          <property name="text" value="|" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066526">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066527">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066528">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066529">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066530">
                    <link role="conceptMethodDeclaration" targetNodeId="32.1194716377388" resolveInfo="isInsertionPoint" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066531" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066532">
          <property name="text" value="[" />
          <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066533">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066534">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066535">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194719066536">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066537">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066538">
                      <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066539" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066540">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066541">
                      <link role="conceptMethodDeclaration" targetNodeId="32.1194716995764" resolveInfo="isSingleselection" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066542" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066543">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066544">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066545">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066546">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ConceptMethodCall" id="1194719066547">
                  <link role="conceptMethodDeclaration" targetNodeId="32.1194716627634" resolveInfo="isValid" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066548" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194719066549">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194719066550">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194629573748" resolveInfo="keymap_Range_SetEnd" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194719066551">
            <link role="relationDeclaration" targetNodeId="1.1194568884925" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066552">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066553">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066554">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066555">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066556">
                    <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066557" />
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066558">
            <property name="text" value="-" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Alternation" id="1194719066559">
          <property name="vertical" value="true" />
          <link role="keyMap" targetNodeId="1194628996018" resolveInfo="keymap_Range_IncludeEnd" />
          <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066560">
            <property name="text" value="]" />
          </node>
          <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066561">
            <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066562">
              <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066563">
                <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194719066564">
                  <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066565">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066566">
                      <link role="property" targetNodeId="1.1194609145937" resolveInfo="includes_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066567" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066568">
                    <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066569">
                      <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                    </node>
                    <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066570" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194719066571">
            <property name="text" value=")" />
          </node>
        </node>
        <node role="renderingCondition" type="jetbrains.mps.bootstrap.editorLanguage.structure.QueryFunction_NodeCondition" id="1194719066572">
          <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194719066573">
            <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194719066574">
              <node role="expression" type="jetbrains.mps.baseLanguage.structure.OrExpression" id="1194719066575">
                <node role="rightExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066576">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066577">
                    <link role="property" targetNodeId="1.1194609145937" resolveInfo="includes_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066578" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194719066579">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194719066580">
                    <link role="property" targetNodeId="1.1194609144501" resolveInfo="has_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_node" id="1194719066581" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194616655885">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194616547141" resolveInfo="IsWithinRangeExpression" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194616658010">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194616697846">
        <link role="relationDeclaration" targetNodeId="1.1194616616051" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194616700010">
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194616703704">
        <property name="text" value="isWithinRange (" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194620342889">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194621252645">
    <property name="package" value="writePath" />
    <link role="conceptDeclaration" targetNodeId="1.1194621189019" resolveInfo="RangeWritePathStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194621255072">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194621259280">
        <property name="text" value="REPLACE" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194621343629">
        <link role="relationDeclaration" targetNodeId="1.1194621275686" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194621346300">
        <property name="text" value="IN" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194621263007">
        <link role="relationDeclaration" targetNodeId="1.1194183840736" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194621351028">
        <property name="text" value="WITH" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194621398313">
        <link role="relationDeclaration" targetNodeId="1.1194187847981" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194622746048">
        <property name="text" value=";" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1194628720593">
    <property name="package" value="writePath.range" />
    <property name="name" value="keymap_Range_IncludeStart" />
    <link role="applicableConcept" targetNodeId="1.1194568341931" resolveInfo="IRange" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194628744299">
      <property name="description" value="excluding start" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194628744300">
        <property name="keycode" value="VK_LEFT_PARENTHESIS" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194628744301">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194628744302">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194628793561">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628797737">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194628798908">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194628800216">
                  <property name="value" value="false" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628793994">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194628797376">
                  <link role="property" targetNodeId="1.1194609145210" resolveInfo="including_start" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194628793562" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194628755717">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194628755718">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194628763672">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628764270">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194628772835">
                <link role="property" targetNodeId="1.1194609145210" resolveInfo="including_start" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194628763673" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194628803899">
      <property name="description" value="including start" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194628803900">
        <property name="keycode" value="VK_OPEN_BRACKET" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194628803901">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194628803902">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194628935104">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628938731">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194628939815">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194628942008">
                  <property name="value" value="true" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628935526">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194628938457">
                  <link role="property" targetNodeId="1.1194609145210" resolveInfo="including_start" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194628935105" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194628898859">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194628898860">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194628902120">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194628927414">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194628929526">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628931195">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194628932994">
                    <link role="property" targetNodeId="1.1194609145210" resolveInfo="including_start" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194628930725" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194628902736">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194628906564">
                  <link role="property" targetNodeId="1.1194609143713" resolveInfo="set_start" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194628902121" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1194628996018">
    <property name="package" value="writePath.range" />
    <property name="name" value="keymap_Range_IncludeEnd" />
    <link role="applicableConcept" targetNodeId="1.1194568341931" resolveInfo="IRange" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194629007813">
      <property name="description" value="excliding end" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194629007814">
        <property name="keycode" value="VK_RIGHT_PARENTHESIS" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194629007815">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629007816">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629027791">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629030065">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194629030970">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194629032068">
                  <property name="value" value="false" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629028103">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629029741">
                  <link role="property" targetNodeId="1.1194609145937" resolveInfo="including_end" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629027793" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194629018185">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629018186">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629021321">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629021808">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629025448">
                <link role="property" targetNodeId="1.1194609145937" resolveInfo="including_end" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629021322" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194629035801">
      <property name="description" value="including end" />
      <property name="showInPopup" value="true" />
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194629035802">
        <property name="keycode" value="VK_CLOSE_BRACKET" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194629035803">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629035804">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629058393">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629060962">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194629062365">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194629065220">
                  <property name="value" value="true" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629058799">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629060565">
                  <link role="property" targetNodeId="1.1194609145937" resolveInfo="including_end" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629058394" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194629046406">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629046407">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629049370">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.AndExpression" id="1194629052474">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194629053714">
                <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629055124">
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629056742">
                    <link role="property" targetNodeId="1.1194609145937" resolveInfo="including_end" />
                  </node>
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629054862" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629049950">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629051080">
                  <link role="property" targetNodeId="1.1194609144501" resolveInfo="set_end" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629049371" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1194629263586">
    <property name="package" value="writePath.range" />
    <property name="name" value="keymap_Range_SetStart" />
    <link role="applicableConcept" targetNodeId="1.1194568341931" resolveInfo="IRange" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194629306070">
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194629306071">
        <property name="keycode" value="VK_ENTER" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194629306072">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629306073">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629524018">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629526398">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194629527373">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194629528742">
                  <property name="value" value="true" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629524348">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629526055">
                  <link role="property" targetNodeId="1.1194609143713" resolveInfo="set_start" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629524019" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194629507754">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629507755">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629518085">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194629518086">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629519657">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629521483">
                  <link role="property" targetNodeId="1.1194609143713" resolveInfo="set_start" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629519222" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapDeclaration" id="1194629573748">
    <property name="package" value="writePath.range" />
    <property name="name" value="keymap_Range_SetEnd" />
    <link role="applicableConcept" targetNodeId="1.1194568341931" resolveInfo="IRange" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapItem" id="1194629586281">
      <node role="keystroke" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMapKeystroke" id="1194629586282">
        <property name="keycode" value="VK_ENTER" />
      </node>
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_ExecuteFunction" id="1194629586283">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629586284">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629604810">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629606900">
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.Property_SetOperation" id="1194629607449">
                <node role="value" type="jetbrains.mps.baseLanguage.structure.BooleanConstant" id="1194629609032">
                  <property name="value" value="true" />
                </node>
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629605181">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629606368">
                  <link role="property" targetNodeId="1.1194609144501" resolveInfo="set_end" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629604811" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="isApplicableFunction" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_IsApplicableFunction" id="1194629595360">
        <node role="body" type="jetbrains.mps.baseLanguage.structure.StatementList" id="1194629595361">
          <node role="statement" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement" id="1194629599016">
            <node role="expression" type="jetbrains.mps.baseLanguage.structure.NotExpression" id="1194629599017">
              <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperationExpression" id="1194629601422">
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.structure.SPropertyAccess" id="1194629602706">
                  <link role="property" targetNodeId="1.1194609144501" resolveInfo="set_end" />
                </node>
                <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNode" id="1194629600035" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194796533655">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194796453748" resolveInfo="IsAtInsertionPointExpression" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194796535741">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194796535742">
        <link role="relationDeclaration" targetNodeId="1.1194616616051" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796535743">
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796535744">
        <property name="text" value="isAtInsertionPoint (" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796535746">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1194796753227">
    <property name="package" value="writePath.range" />
    <link role="conceptDeclaration" targetNodeId="1.1194796699421" resolveInfo="NextElementExpression" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1194796767111">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194796767112">
        <link role="relationDeclaration" targetNodeId="1.1194616616051" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796767113">
        <property name="text" value="." />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796767114">
        <property name="text" value="next (" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1194796789403">
        <link role="relationDeclaration" targetNodeId="1.1194796776200" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1194796767115">
        <property name="text" value=")" />
      </node>
    </node>
  </node>
</model>

