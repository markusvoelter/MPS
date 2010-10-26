<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:b60215f1-3d3e-41cc-8321-723ef8eb59dd(jetbrains.mps.lang.editor.table.runtime)">
  <persistence version="4" />
  <refactoringHistory />
  <language namespace="f3061a53-9226-4cc5-a443-f952ceaf5816(jetbrains.mps.baseLanguage)" />
  <language namespace="7866978e-a0f0-4cc7-81bc-4d213d9375e1(jetbrains.mps.lang.smodel)" />
  <language namespace="83888646-71ce-4f1c-9c53-c54016f6ad4f(jetbrains.mps.baseLanguage.collections)" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902c1(jetbrains.mps.baseLanguage.constraints)" version="83" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902db(jetbrains.mps.baseLanguage.blTypes.constraints)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590283(jetbrains.mps.lang.core.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" version="16" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c895902fb(jetbrains.mps.lang.smodel.constraints)" version="21" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" version="2" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590338(jetbrains.mps.baseLanguage.closures.structure)" version="3" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c89590328(jetbrains.mps.baseLanguage.collections.constraints)" version="6" />
  <languageAspect modelUID="r:00000000-0000-4000-0000-011c8959032e(jetbrains.mps.baseLanguage.collections.structure)" version="7" />
  <maxImportIndex value="11" />
  <import index="1" modelUID="f:java_stub#jetbrains.mps.nodeEditor.cells(jetbrains.mps.nodeEditor.cells@java_stub)" version="-1" />
  <import index="2" modelUID="f:java_stub#jetbrains.mps.nodeEditor(jetbrains.mps.nodeEditor@java_stub)" version="-1" />
  <import index="3" modelUID="f:java_stub#jetbrains.mps.nodeEditor.cellProviders(jetbrains.mps.nodeEditor.cellProviders@java_stub)" version="-1" />
  <import index="4" modelUID="f:java_stub#java.util(java.util@java_stub)" version="-1" />
  <import index="5" modelUID="f:java_stub#jetbrains.mps.smodel(jetbrains.mps.smodel@java_stub)" version="-1" />
  <import index="6" modelUID="f:java_stub#jetbrains.mps.nodeEditor.style(jetbrains.mps.nodeEditor.style@java_stub)" version="-1" />
  <import index="7" modelUID="f:java_stub#jetbrains.mps.nodeEditor.cellLayout(jetbrains.mps.nodeEditor.cellLayout@java_stub)" version="-1" />
  <import index="8" modelUID="r:0f04043a-7bce-4bf7-9937-2897127cc0d3(jetbrains.mps.lang.editor.table.generator.template.main@generator)" version="-1" />
  <import index="9" modelUID="f:java_stub#java.io(java.io@java_stub)" version="-1" />
  <import index="10" modelUID="f:java_stub#java.awt(java.awt@java_stub)" version="-1" />
  <import index="11" modelUID="r:2af017c2-293f-4ebb-99f3-81e353b3d6e6(jetbrains.mps.editor.runtime)" version="-1" />
  <node type="jetbrains.mps.baseLanguage.structure.Interface:3" id="4490468428501048480">
    <property name="name:3" value="TableModel" />
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4490468428501082183">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getColumnsNumber" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4490468428501082187" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4490468428501082185" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4490468428501082186" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4490468428501082188">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getRowsNumber" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4490468428501082192" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4490468428501082190" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4490468428501082191" />
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4512669761906509885">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="deleteRow" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="4512669761906509886" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4512669761906509887" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4512669761906509888" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4512669761906509889">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4512669761906509890" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="4490468428501082193">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getValueAt" />
      <node role="returnType:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4490468428501082197" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4490468428501082195" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4490468428501082196" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4490468428501082198">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4490468428501082199" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4490468428501082200">
        <property name="name:3" value="column" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4490468428501082202" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="730733254587404185">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="createElement" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="730733254587404186" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="730733254587404187" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="730733254587404188" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="730733254587404189">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="730733254587404190" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="730733254587404191">
        <property name="name:3" value="column" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="730733254587404193" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="1920931981472541494">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="insertRow" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1920931981472541495" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1920931981472541496" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1920931981472541497" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="1920931981472561983">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="1920931981472561984" />
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4490468428501048481" />
  </node>
  <visible index="2" modelUID="f:java_stub#java.lang(java.lang@java_stub)" />
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="3031432740458708321">
    <property name="name:3" value="EditorCell_Table" />
    <node role="field:3" type="jetbrains.mps.baseLanguage.structure.FieldDeclaration:3" id="8514238689685497086">
      <property name="name:3" value="myModel" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="8514238689685497087" />
      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685497089">
        <link role="classifier:3" targetNodeId="4490468428501048480" resolveInfo="TableModel" />
      </node>
    </node>
    <node role="staticMethod:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration:3" id="4057456417884478684">
      <property name="name:3" value="createTable" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4057456417884537594">
        <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="4057456417884478686" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4057456417884478687">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="4057456417884478779">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500836">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="8514238689685500837">
              <link role="baseMethodDeclaration:3" targetNodeId="3031432740458868230" resolveInfo="EditorCell_Table" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8514238689685500838">
                <link role="variableDeclaration:3" targetNodeId="4057456417884532519" resolveInfo="editorContext" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8514238689685500839">
                <link role="variableDeclaration:3" targetNodeId="4057456417884532521" resolveInfo="node" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500840">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="8514238689685500841">
                  <link role="baseMethodDeclaration:3" targetNodeId="7.~CellLayout_Table.&lt;init&gt;()" resolveInfo="CellLayout_Table" />
                </node>
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8514238689685500842">
                <link role="variableDeclaration:3" targetNodeId="4057456417884532529" resolveInfo="model" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4057456417884532519">
        <property name="name:3" value="editorContext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4057456417884532520">
          <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4057456417884532521">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="4057456417884532525" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="4057456417884532529">
        <property name="name:3" value="model" />
        <property name="isFinal:3" value="true" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4057456417884532531">
          <link role="classifier:3" targetNodeId="4490468428501048480" resolveInfo="TableModel" />
        </node>
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3031432740458708322" />
    <node role="superclass:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3031432740458868129">
      <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
    </node>
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="3031432740458868230">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3031432740458868231" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3031432740458868232" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3031432740458868234">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation:3" id="3031432740458868235">
          <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.&lt;init&gt;(jetbrains.mps.nodeEditor.EditorContext,jetbrains.mps.smodel.SNode,jetbrains.mps.nodeEditor.cellLayout.CellLayout,jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler)" resolveInfo="EditorCell_Collection" />
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3031432740458868239">
            <link role="variableDeclaration:3" targetNodeId="3031432740458868236" resolveInfo="editorContext" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3031432740458868243">
            <link role="variableDeclaration:3" targetNodeId="3031432740458868240" resolveInfo="node" />
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="3380777353757943232">
            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="3380777353757943233">
              <link role="baseMethodDeclaration:3" targetNodeId="7.~CellLayout_Vertical.&lt;init&gt;()" resolveInfo="CellLayout_Vertical" />
            </node>
          </node>
          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="8514238689685495176" />
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3380777353757943235">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="3380777353757943236">
            <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.setGridLayout(boolean):void" resolveInfo="setGridLayout" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="3380777353757943237">
              <property name="value:3" value="true" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685497099">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="8514238689685497101">
            <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="8514238689685497104">
              <link role="variableDeclaration:3" targetNodeId="3031432740458868248" resolveInfo="model" />
            </node>
            <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685497100">
              <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685497135">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685497136">
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685497138">
              <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.setSelectable(boolean):void" resolveInfo="setSelectable" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.BooleanConstant:3" id="8514238689685497139">
                <property name="value:3" value="false" />
              </node>
            </node>
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="8514238689685497149" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685497140">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685497141">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685497142">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="8514238689685497150" />
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685497144">
                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getStyle():jetbrains.mps.nodeEditor.style.Style" resolveInfo="getStyle" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685497145">
              <link role="baseMethodDeclaration:3" targetNodeId="6.~Style.set(jetbrains.mps.nodeEditor.style.StyleAttribute,java.lang.Object):void" resolveInfo="set" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="8514238689685497146">
                <link role="classifier:3" targetNodeId="6.~StyleAttributes" resolveInfo="StyleAttributes" />
                <link role="variableDeclaration:3" targetNodeId="6.~StyleAttributes.TABLE_COMPONENT" resolveInfo="TABLE_COMPONENT" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="8514238689685497147">
                <link role="enumClass:3" targetNodeId="6.~TableComponent" resolveInfo="TableComponent" />
                <link role="enumConstantDeclaration:3" targetNodeId="6.~TableComponent.VERTICAL_COLLECTION" resolveInfo="VERTICAL_COLLECTION" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685497055">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685497056">
            <link role="baseMethodDeclaration:3" targetNodeId="8514238689685497051" resolveInfo="createChildrenCells" />
          </node>
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3031432740458868236">
        <property name="name:3" value="editorContext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3031432740458868238">
          <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3031432740458868240">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3031432740458868242">
          <link role="classifier:3" targetNodeId="5.~SNode" resolveInfo="SNode" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3031432740458868244">
        <property name="name:3" value="cellLayout" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3031432740458868246">
          <link role="classifier:3" targetNodeId="7.~CellLayout" resolveInfo="CellLayout" />
        </node>
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3031432740458868248">
        <property name="name:3" value="model" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685495177">
          <link role="classifier:3" targetNodeId="4490468428501048480" resolveInfo="TableModel" />
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8514238689685497051">
      <property name="name:3" value="createChildrenCells" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8514238689685497052" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685497053" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685497054">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForStatement:3" id="8514238689685500670">
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500671">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500672">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500673">
                <property name="name:3" value="rowCell" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500674">
                  <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500675">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="8514238689685500825" />
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500677">
                    <link role="baseMethodDeclaration:3" targetNodeId="8514238689685497151" resolveInfo="createRowCell" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500678">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500814" resolveInfo="row" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500679">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500680">
                <property name="name:3" value="finalRow" />
                <property name="isFinal:3" value="true" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="8514238689685500681" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500682">
                  <link role="variableDeclaration:3" targetNodeId="8514238689685500814" resolveInfo="row" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForStatement:3" id="8514238689685500683">
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500684">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500685">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500686">
                    <property name="name:3" value="finalColumn" />
                    <property name="isFinal:3" value="true" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="8514238689685500687" />
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500688">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500763" resolveInfo="column" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500689">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500690">
                    <property name="name:3" value="value" />
                    <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8514238689685500691" />
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500692">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500827">
                        <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500694">
                        <link role="baseMethodDeclaration:3" targetNodeId="4490468428501082193" resolveInfo="getValueAt" />
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500695">
                          <link role="variableDeclaration:3" targetNodeId="8514238689685500814" resolveInfo="row" />
                        </node>
                        <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500696">
                          <link role="variableDeclaration:3" targetNodeId="8514238689685500763" resolveInfo="column" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500697">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500698">
                    <property name="name:3" value="editorCell" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500699">
                      <link role="classifier:3" targetNodeId="1.~EditorCell" resolveInfo="EditorCell" />
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="8514238689685500700">
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500701">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500702">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="8514238689685500703">
                        <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500704">
                          <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                        </node>
                        <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500705">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500828">
                            <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolveInfo="getEditorContext" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500707">
                            <link role="baseMethodDeclaration:3" targetNodeId="2.~EditorContext.createNodeCell(jetbrains.mps.smodel.SNode):jetbrains.mps.nodeEditor.cells.EditorCell" resolveInfo="createNodeCell" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500708">
                              <link role="variableDeclaration:3" targetNodeId="8514238689685500690" resolveInfo="value" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500709">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500710">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500711">
                          <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500712">
                          <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.setAction(jetbrains.mps.nodeEditor.CellActionType,jetbrains.mps.nodeEditor.EditorCellAction):void" resolveInfo="setAction" />
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="8514238689685500713">
                            <link role="enumClass:3" targetNodeId="2.~CellActionType" resolveInfo="CellActionType" />
                            <link role="enumConstantDeclaration:3" targetNodeId="2.~CellActionType.DELETE" resolveInfo="DELETE" />
                          </node>
                          <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500714">
                            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="8514238689685500715">
                              <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="8514238689685500716">
                                <property name="nonStatic:3" value="true" />
                                <link role="baseMethodDeclaration:3" targetNodeId="2.~EditorCellAction.&lt;init&gt;()" resolveInfo="EditorCellAction" />
                                <link role="classifier:3" targetNodeId="2.~EditorCellAction" resolveInfo="EditorCellAction" />
                                <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500717" />
                                <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8514238689685500718">
                                  <property name="isAbstract:3" value="false" />
                                  <property name="name:3" value="execute" />
                                  <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500719" />
                                  <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8514238689685500720" />
                                  <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8514238689685500721">
                                    <property name="name:3" value="editorContext" />
                                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500722">
                                      <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
                                    </node>
                                  </node>
                                  <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500723" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.NotEqualsExpression:3" id="8514238689685500724">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="8514238689685500725" />
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500726">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500690" resolveInfo="value" />
                    </node>
                  </node>
                  <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="8514238689685500727">
                    <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500728">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500729">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="8514238689685500730">
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500731">
                            <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="8514238689685500732">
                              <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Constant.&lt;init&gt;(jetbrains.mps.nodeEditor.EditorContext,jetbrains.mps.smodel.SNode,java.lang.String)" resolveInfo="EditorCell_Constant" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500829">
                                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolveInfo="getEditorContext" />
                              </node>
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500830">
                                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getSNode():jetbrains.mps.smodel.SNode" resolveInfo="getSNode" />
                              </node>
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8514238689685500735">
                                <property name="value:3" value="" />
                              </node>
                            </node>
                          </node>
                          <node role="lValue:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500736">
                            <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                          </node>
                        </node>
                      </node>
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500737">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500738">
                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500739">
                            <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                          </node>
                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500740">
                            <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.setAction(jetbrains.mps.nodeEditor.CellActionType,jetbrains.mps.nodeEditor.EditorCellAction):void" resolveInfo="setAction" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="8514238689685500741">
                              <link role="enumClass:3" targetNodeId="2.~CellActionType" resolveInfo="CellActionType" />
                              <link role="enumConstantDeclaration:3" targetNodeId="2.~CellActionType.INSERT" resolveInfo="INSERT" />
                            </node>
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500742">
                              <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="8514238689685500743">
                                <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="8514238689685500744">
                                  <property name="nonStatic:3" value="true" />
                                  <link role="baseMethodDeclaration:3" targetNodeId="2.~EditorCellAction.&lt;init&gt;()" resolveInfo="EditorCellAction" />
                                  <link role="classifier:3" targetNodeId="2.~EditorCellAction" resolveInfo="EditorCellAction" />
                                  <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500745" />
                                  <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8514238689685500746">
                                    <property name="isAbstract:3" value="false" />
                                    <property name="name:3" value="execute" />
                                    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500747" />
                                    <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8514238689685500748" />
                                    <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8514238689685500749">
                                      <property name="name:3" value="editorContext" />
                                      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500750">
                                        <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
                                      </node>
                                    </node>
                                    <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500751">
                                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500752">
                                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500753">
                                          <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500831">
                                            <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
                                          </node>
                                          <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500755">
                                            <link role="baseMethodDeclaration:3" targetNodeId="730733254587404185" resolveInfo="createElement" />
                                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500756">
                                              <link role="variableDeclaration:3" targetNodeId="8514238689685500680" resolveInfo="finalRow" />
                                            </node>
                                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500757">
                                              <link role="variableDeclaration:3" targetNodeId="8514238689685500686" resolveInfo="finalColumn" />
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
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="327003329629484044">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="327003329629484046">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="327003329629484045">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="327003329629484147">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.setLeftGap(int):void" resolveInfo="setLeftGap" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="327003329629484148">
                        <property name="value:3" value="4" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="327003329629484150">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="327003329629484152">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="327003329629484151">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="327003329629484156">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.setRightGap(int):void" resolveInfo="setRightGap" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="327003329629484157">
                        <property name="value:3" value="4" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.Statement:3" id="7406306075318050272" />
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500758">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500759">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500760">
                      <link role="variableDeclaration:3" targetNodeId="8514238689685500673" resolveInfo="rowCell" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500761">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.addEditorCell(jetbrains.mps.nodeEditor.cells.EditorCell):void" resolveInfo="addEditorCell" />
                      <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500762">
                        <link role="variableDeclaration:3" targetNodeId="8514238689685500698" resolveInfo="editorCell" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500763">
                <property name="name:3" value="column" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="8514238689685500764" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="8514238689685500765">
                  <property name="value:3" value="0" />
                </node>
              </node>
              <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="8514238689685500766">
                <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500767">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500826">
                    <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500769">
                    <link role="baseMethodDeclaration:3" targetNodeId="4490468428501082183" resolveInfo="getColumnsNumber" />
                  </node>
                </node>
                <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500770">
                  <link role="variableDeclaration:3" targetNodeId="8514238689685500763" resolveInfo="column" />
                </node>
              </node>
              <node role="iteration:3" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression:3" id="8514238689685500771">
                <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500772">
                  <link role="variableDeclaration:3" targetNodeId="8514238689685500763" resolveInfo="column" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.Statement:3" id="8514238689685500773" />
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="8514238689685500774">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500775">
                <property name="name:3" value="lastCell" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500776">
                  <link role="classifier:3" targetNodeId="1.~EditorCell_Constant" resolveInfo="EditorCell_Constant" />
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500777">
                  <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="8514238689685500778">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Constant.&lt;init&gt;(jetbrains.mps.nodeEditor.EditorContext,jetbrains.mps.smodel.SNode,java.lang.String)" resolveInfo="EditorCell_Constant" />
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500832">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolveInfo="getEditorContext" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500833">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getSNode():jetbrains.mps.smodel.SNode" resolveInfo="getSNode" />
                    </node>
                    <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StringLiteral:3" id="8514238689685500781">
                      <property name="value:3" value="" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500782">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500783">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500784">
                  <link role="variableDeclaration:3" targetNodeId="8514238689685500775" resolveInfo="lastCell" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500785">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.setAction(jetbrains.mps.nodeEditor.CellActionType,jetbrains.mps.nodeEditor.EditorCellAction):void" resolveInfo="setAction" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="8514238689685500786">
                    <link role="enumClass:3" targetNodeId="2.~CellActionType" resolveInfo="CellActionType" />
                    <link role="enumConstantDeclaration:3" targetNodeId="2.~CellActionType.INSERT" resolveInfo="INSERT" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="8514238689685500787">
                    <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="8514238689685500788">
                      <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="8514238689685500789">
                        <property name="nonStatic:3" value="true" />
                        <link role="classifier:3" targetNodeId="2.~EditorCellAction" resolveInfo="EditorCellAction" />
                        <link role="baseMethodDeclaration:3" targetNodeId="2.~EditorCellAction.&lt;init&gt;()" resolveInfo="EditorCellAction" />
                        <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500790" />
                        <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8514238689685500791">
                          <property name="isAbstract:3" value="false" />
                          <property name="name:3" value="execute" />
                          <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8514238689685500792" />
                          <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="8514238689685500793" />
                          <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8514238689685500794">
                            <property name="name:3" value="p0" />
                            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8514238689685500795">
                              <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
                            </node>
                          </node>
                          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8514238689685500796">
                            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500797">
                              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500798">
                                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500834">
                                  <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
                                </node>
                                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500800">
                                  <link role="baseMethodDeclaration:3" targetNodeId="1920931981472541494" resolveInfo="insertRow" />
                                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="8514238689685500801">
                                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="8514238689685500802">
                                      <property name="value:3" value="1" />
                                    </node>
                                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500803">
                                      <link role="variableDeclaration:3" targetNodeId="8514238689685500680" resolveInfo="finalRow" />
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
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500804">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500805">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500806">
                  <link role="variableDeclaration:3" targetNodeId="8514238689685500673" resolveInfo="rowCell" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500807">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.addEditorCell(jetbrains.mps.nodeEditor.cells.EditorCell):void" resolveInfo="addEditorCell" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500808">
                    <link role="variableDeclaration:3" targetNodeId="8514238689685500775" resolveInfo="lastCell" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="8514238689685500809">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500810">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ThisExpression:3" id="8514238689685500835" />
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500812">
                  <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.addEditorCell(jetbrains.mps.nodeEditor.cells.EditorCell):void" resolveInfo="addEditorCell" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500813">
                    <link role="variableDeclaration:3" targetNodeId="8514238689685500673" resolveInfo="rowCell" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="8514238689685500814">
            <property name="name:3" value="row" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="8514238689685500815" />
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="8514238689685500816">
              <property name="value:3" value="0" />
            </node>
          </node>
          <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.LessThanExpression:3" id="8514238689685500817">
            <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="8514238689685500818">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500824">
                <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="8514238689685500820">
                <link role="baseMethodDeclaration:3" targetNodeId="4490468428501082188" resolveInfo="getRowsNumber" />
              </node>
            </node>
            <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500821">
              <link role="variableDeclaration:3" targetNodeId="8514238689685500814" resolveInfo="row" />
            </node>
          </node>
          <node role="iteration:3" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression:3" id="8514238689685500822">
            <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8514238689685500823">
              <link role="variableDeclaration:3" targetNodeId="8514238689685500814" resolveInfo="row" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="3031432740458869298">
      <property name="name:3" value="paint" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="3031432740458869299" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="3031432740458869300" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="3031432740458869301">
        <property name="name:3" value="graphics" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="3031432740458869302">
          <link role="classifier:3" targetNodeId="10.~Graphics" resolveInfo="Graphics" />
        </node>
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="3031432740458869303">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3031432740458869305">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.SuperMethodCall:3" id="3031432740458869306">
            <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.paint(java.awt.Graphics):void" resolveInfo="paint" />
            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3031432740458869307">
              <link role="variableDeclaration:3" targetNodeId="3031432740458869301" resolveInfo="graphics" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="3031432740458869309">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="3031432740458869311">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="3031432740458869310">
              <link role="variableDeclaration:3" targetNodeId="3031432740458869301" resolveInfo="graphics" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="3031432740458881232">
              <link role="baseMethodDeclaration:3" targetNodeId="10.~Graphics.setColor(java.awt.Color):void" resolveInfo="setColor" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="3031432740458895456">
                <link role="classifier:3" targetNodeId="10.~Color" resolveInfo="Color" />
                <link role="variableDeclaration:3" targetNodeId="10.~Color.GRAY" resolveInfo="GRAY" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4700713079889332470">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4700713079889332471">
            <property name="name:3" value="positions" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.collections.structure.ListType:7" id="4700713079889332472">
              <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4700713079889332474" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="4700713079889332476">
              <node role="creator:3" type="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit:7" id="4700713079889332477">
                <node role="elementType:7" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4700713079889332478" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4700713079889278695">
          <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4700713079889278696">
            <property name="name:3" value="row" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4700713079889311255">
              <link role="classifier:3" targetNodeId="1.~EditorCell" resolveInfo="EditorCell" />
            </node>
          </node>
          <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4700713079889278697">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="958712086144245575">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="958712086144245576">
                <property name="name:3" value="rowCells" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ArrayType:3" id="958712086144245577">
                  <node role="componentType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="958712086144245578">
                    <link role="classifier:3" targetNodeId="1.~EditorCell" resolveInfo="EditorCell" />
                  </node>
                </node>
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="958712086144245579">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression:3" id="958712086144245580">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.CastExpression:3" id="958712086144245581">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="958712086144245582">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                      </node>
                      <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="958712086144245583">
                        <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
                      </node>
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="958712086144245584">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.getCells():jetbrains.mps.nodeEditor.cells.EditorCell[]" resolveInfo="getCells" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4170393425911739068">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4170393425911739069">
                <property name="name:3" value="rowLastLine" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4170393425911739070" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739071">
                  <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ArrayAccessExpression:3" id="4170393425911739072">
                    <node role="index:3" type="jetbrains.mps.baseLanguage.structure.MinusExpression:3" id="4170393425911739073">
                      <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4170393425911739074">
                        <property name="value:3" value="1" />
                      </node>
                      <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739075">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739076">
                          <link role="variableDeclaration:3" targetNodeId="958712086144245576" resolveInfo="rowCells" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.ArrayLengthOperation:3" id="4170393425911739077" />
                      </node>
                    </node>
                    <node role="array:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739078">
                      <link role="variableDeclaration:3" targetNodeId="958712086144245576" resolveInfo="rowCells" />
                    </node>
                  </node>
                  <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739079">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getX():int" resolveInfo="getX" />
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4700713079889472809">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889472810">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4700713079889472811">
                  <link role="variableDeclaration:3" targetNodeId="3031432740458869301" resolveInfo="graphics" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4700713079889472812">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~Graphics.drawLine(int,int,int,int):void" resolveInfo="drawLine" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4700713079889472817">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getX():int" resolveInfo="getX" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889472825">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889472824">
                      <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4700713079889472829">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getY():int" resolveInfo="getY" />
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739080">
                    <link role="variableDeclaration:3" targetNodeId="4170393425911739069" resolveInfo="rowLastLine" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="6476231633105647828">
                    <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="6476231633105647829">
                      <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                    </node>
                    <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="6476231633105647830">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getY():int" resolveInfo="getY" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4170393425911739048">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739049">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4170393425911739050">
                  <link role="variableDeclaration:3" targetNodeId="3031432740458869301" resolveInfo="graphics" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739051">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~Graphics.drawLine(int,int,int,int):void" resolveInfo="drawLine" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4170393425911739052">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getX():int" resolveInfo="getX" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4170393425911739082">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739086">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739085">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739090">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getHeight():int" resolveInfo="getHeight" />
                      </node>
                    </node>
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739053">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739054">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739055">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getY():int" resolveInfo="getY" />
                      </node>
                    </node>
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739081">
                    <link role="variableDeclaration:3" targetNodeId="4170393425911739069" resolveInfo="rowLastLine" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="4170393425911739097">
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739065">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739066">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739067">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getY():int" resolveInfo="getY" />
                      </node>
                    </node>
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4170393425911739100">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4170393425911739101">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889278696" resolveInfo="row" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4170393425911739102">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getHeight():int" resolveInfo="getHeight" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4700713079889332480">
              <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4700713079889332481">
                <property name="name:3" value="index" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4700713079889332482" />
                <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.IntegerConstant:3" id="4700713079889332484">
                  <property name="value:3" value="0" />
                </node>
              </node>
            </node>
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ForeachStatement:3" id="4700713079889311257">
              <node role="variable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4700713079889311258">
                <property name="name:3" value="cell" />
                <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="4700713079889311262">
                  <link role="classifier:3" targetNodeId="1.~EditorCell" resolveInfo="EditorCell" />
                </node>
              </node>
              <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4700713079889311259">
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="4700713079889332500">
                  <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="4700713079889332501">
                    <property name="name:3" value="x" />
                    <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="4700713079889332502" />
                    <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889332503">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332504">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889311258" resolveInfo="cell" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4700713079889332505">
                        <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell.getX():int" resolveInfo="getX" />
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.IfStatement:3" id="4700713079889332491">
                  <node role="ifTrue:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4700713079889332492">
                    <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4700713079889332542">
                      <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889332544">
                        <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332543">
                          <link role="variableDeclaration:3" targetNodeId="4700713079889332471" resolveInfo="positions" />
                        </node>
                        <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation:7" id="4700713079889332548">
                          <node role="argument:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332552">
                            <link role="variableDeclaration:3" targetNodeId="4700713079889332501" resolveInfo="x" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node role="condition:3" type="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression:3" id="4700713079889332538">
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332541">
                      <link role="variableDeclaration:3" targetNodeId="4700713079889332481" resolveInfo="index" />
                    </node>
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889332508">
                      <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332507">
                        <link role="variableDeclaration:3" targetNodeId="4700713079889332471" resolveInfo="positions" />
                      </node>
                      <node role="operation:3" type="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation:7" id="4700713079889332512" />
                    </node>
                  </node>
                  <node role="ifFalseStatement:3" type="jetbrains.mps.baseLanguage.structure.BlockStatement:3" id="4700713079889332553">
                    <node role="statements:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4700713079889332554">
                      <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4700713079889332555">
                        <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.AssignmentExpression:3" id="4700713079889332560">
                          <node role="rValue:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="8696653781801422511">
                            <link role="classConcept:3" targetNodeId="2v.~Math" resolveInfo="Math" />
                            <link role="baseMethodDeclaration:3" targetNodeId="2v.~Math.min(int,int):int" resolveInfo="min" />
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8696653781801422512">
                              <link role="variableDeclaration:3" targetNodeId="4700713079889332501" resolveInfo="x" />
                            </node>
                            <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression:7" id="8696653781801422513">
                              <node role="index:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8696653781801422514">
                                <link role="variableDeclaration:3" targetNodeId="4700713079889332481" resolveInfo="index" />
                              </node>
                              <node role="list:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="8696653781801422515">
                                <link role="variableDeclaration:3" targetNodeId="4700713079889332471" resolveInfo="positions" />
                              </node>
                            </node>
                          </node>
                          <node role="lValue:3" type="jetbrains.mps.baseLanguage.collections.structure.ListElementAccessExpression:7" id="4700713079889332557">
                            <node role="index:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332563">
                              <link role="variableDeclaration:3" targetNodeId="4700713079889332481" resolveInfo="index" />
                            </node>
                            <node role="list:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332556">
                              <link role="variableDeclaration:3" targetNodeId="4700713079889332471" resolveInfo="positions" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4700713079889332486">
                  <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression:3" id="4700713079889332488">
                    <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332489">
                      <link role="variableDeclaration:3" targetNodeId="4700713079889332481" resolveInfo="index" />
                    </node>
                  </node>
                </node>
              </node>
              <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="958712086144245585">
                <link role="variableDeclaration:3" targetNodeId="958712086144245576" resolveInfo="editorCells" />
              </node>
            </node>
          </node>
          <node role="iterable:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4700713079889311256">
            <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.getCells():jetbrains.mps.nodeEditor.cells.EditorCell[]" resolveInfo="getCells" />
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement:7" id="4700713079889332572">
          <node role="variable:7" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable:7" id="4700713079889332573">
            <property name="name:7" value="x" />
          </node>
          <node role="inputSequence:7" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="4700713079889332576">
            <link role="variableDeclaration:3" targetNodeId="4700713079889332471" resolveInfo="positions" />
          </node>
          <node role="body:7" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="4700713079889332575">
            <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="4700713079889332577">
              <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="4700713079889332579">
                <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="4700713079889332578">
                  <link role="variableDeclaration:3" targetNodeId="3031432740458869301" resolveInfo="graphics" />
                </node>
                <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="4700713079889337501">
                  <link role="baseMethodDeclaration:3" targetNodeId="10.~Graphics.drawLine(int,int,int,int):void" resolveInfo="drawLine" />
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="4700713079889337502">
                    <link role="variable:7" targetNodeId="4700713079889332573" resolveInfo="x" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4700713079889337504">
                    <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getY():int" resolveInfo="getY" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference:7" id="6476231633105647838">
                    <link role="variable:7" targetNodeId="4700713079889332573" resolveInfo="x" />
                  </node>
                  <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.PlusExpression:3" id="6476231633105647834">
                    <node role="rightExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="4700713079889337508">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getHeight():int" resolveInfo="getHeight" />
                    </node>
                    <node role="leftExpression:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="6476231633105647837">
                      <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getY():int" resolveInfo="getY" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node role="annotation:3" type="jetbrains.mps.baseLanguage.structure.AnnotationInstance:3" id="3031432740458869304">
        <link role="annotation:3" targetNodeId="2v.~Override" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8514238689685497151">
      <property name="name:3" value="createRowCell" />
      <property name="isFinal:3" value="false" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2317844423961239055">
        <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2317844423961239052">
        <property name="name:3" value="row" />
        <property name="isFinal:3" value="true" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="2317844423961239058" />
      </node>
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2317844423961239060">
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement:3" id="2317844423961239061">
          <node role="localVariableDeclaration:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration:3" id="2317844423961239048">
            <property name="name:3" value="rowCell" />
            <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2317844423961239062">
              <link role="classifier:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
            </node>
            <node role="initializer:3" type="jetbrains.mps.baseLanguage.structure.StaticMethodCall:3" id="2317844423961239063">
              <link role="classConcept:3" targetNodeId="1.~EditorCell_Collection" resolveInfo="EditorCell_Collection" />
              <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.create(jetbrains.mps.nodeEditor.EditorContext,jetbrains.mps.smodel.SNode,jetbrains.mps.nodeEditor.cellLayout.CellLayout,jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler):jetbrains.mps.nodeEditor.cells.EditorCell_Collection" resolveInfo="create" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500569">
                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolveInfo="getEditorContext" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceMethodCall:3" id="8514238689685500567">
                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getSNode():jetbrains.mps.smodel.SNode" resolveInfo="getSNode" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="2317844423961239066">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.ClassCreator:3" id="2317844423961239067">
                  <link role="baseMethodDeclaration:3" targetNodeId="7.~CellLayout_Horizontal.&lt;init&gt;()" resolveInfo="CellLayout_Horizontal" />
                </node>
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.NullLiteral:3" id="2317844423961239068" />
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2317844423961239069">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2317844423961239070">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2317844423961239071">
              <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2317844423961239072">
                <link role="variableDeclaration:3" targetNodeId="2317844423961239048" resolveInfo="rowCell" />
              </node>
              <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2317844423961239073">
                <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Basic.getStyle():jetbrains.mps.nodeEditor.style.Style" resolveInfo="getStyle" />
              </node>
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2317844423961239074">
              <link role="baseMethodDeclaration:3" targetNodeId="6.~Style.set(jetbrains.mps.nodeEditor.style.StyleAttribute,java.lang.Object):void" resolveInfo="set" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.StaticFieldReference:3" id="2317844423961239075">
                <link role="classifier:3" targetNodeId="6.~StyleAttributes" resolveInfo="StyleAttributes" />
                <link role="variableDeclaration:3" targetNodeId="6.~StyleAttributes.TABLE_COMPONENT" resolveInfo="TABLE_COMPONENT" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="2317844423961239076">
                <link role="enumClass:3" targetNodeId="6.~TableComponent" resolveInfo="TableComponent" />
                <link role="enumConstantDeclaration:3" targetNodeId="6.~TableComponent.HORIZONTAL_COLLECTION" resolveInfo="HORIZONTAL_COLLECTION" />
              </node>
            </node>
          </node>
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2317844423961239077">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2317844423961239078">
            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2317844423961239079">
              <link role="variableDeclaration:3" targetNodeId="2317844423961239048" resolveInfo="rowCell" />
            </node>
            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2317844423961239080">
              <link role="baseMethodDeclaration:3" targetNodeId="1.~EditorCell_Collection.setAction(jetbrains.mps.nodeEditor.CellActionType,jetbrains.mps.nodeEditor.EditorCellAction):void" resolveInfo="setAction" />
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.EnumConstantReference:3" id="2317844423961239081">
                <link role="enumConstantDeclaration:3" targetNodeId="2.~CellActionType.DELETE" resolveInfo="DELETE" />
                <link role="enumClass:3" targetNodeId="2.~CellActionType" resolveInfo="CellActionType" />
              </node>
              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.GenericNewExpression:3" id="2317844423961239082">
                <node role="creator:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator:3" id="2317844423961239083">
                  <node role="cls:3" type="jetbrains.mps.baseLanguage.structure.AnonymousClass:3" id="2317844423961239084">
                    <property name="nonStatic:3" value="true" />
                    <link role="classifier:3" targetNodeId="2.~EditorCellAction" resolveInfo="EditorCellAction" />
                    <link role="baseMethodDeclaration:3" targetNodeId="2.~EditorCellAction.&lt;init&gt;()" resolveInfo="EditorCellAction" />
                    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2317844423961239085" />
                    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="2317844423961239086">
                      <property name="isAbstract:3" value="false" />
                      <property name="name:3" value="execute" />
                      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="2317844423961239087" />
                      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="2317844423961239088" />
                      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="2317844423961239089">
                        <property name="name:3" value="p0" />
                        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="2317844423961239090">
                          <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
                        </node>
                      </node>
                      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="2317844423961239091">
                        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ExpressionStatement:3" id="2317844423961239092">
                          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.DotExpression:3" id="2317844423961239093">
                            <node role="operand:3" type="jetbrains.mps.baseLanguage.structure.LocalInstanceFieldReference:3" id="8514238689685500568">
                              <link role="variableDeclaration:3" targetNodeId="8514238689685497086" resolveInfo="myModel" />
                            </node>
                            <node role="operation:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation:3" id="2317844423961239095">
                              <link role="baseMethodDeclaration:3" targetNodeId="4512669761906509885" resolveInfo="deleteRow" />
                              <node role="actualArgument:3" type="jetbrains.mps.baseLanguage.structure.ParameterReference:3" id="2317844423961239096">
                                <link role="variableDeclaration:3" targetNodeId="2317844423961239052" resolveInfo="finalRow" />
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
        </node>
        <node role="statement:3" type="jetbrains.mps.baseLanguage.structure.ReturnStatement:3" id="2317844423961239097">
          <node role="expression:3" type="jetbrains.mps.baseLanguage.structure.LocalVariableReference:3" id="2317844423961239098">
            <link role="variableDeclaration:3" targetNodeId="2317844423961239048" resolveInfo="rowCell" />
          </node>
        </node>
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PrivateVisibility:3" id="2317844423961239054" />
    </node>
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.Interface:3" id="8562016843455379013">
    <property name="name:3" value="TableModelCreator" />
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="8562016843455379015">
      <property name="isAbstract:3" value="true" />
      <property name="name:3" value="getTable" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8562016843455379019">
        <property name="name:3" value="node" />
        <node role="type:3" type="jetbrains.mps.lang.smodel.structure.SNodeType:16" id="8562016843455379021" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="8562016843455379022">
        <property name="name:3" value="editorContext" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8562016843455392241">
          <link role="classifier:3" targetNodeId="2.~EditorContext" resolveInfo="EditorContext" />
        </node>
      </node>
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="8562016843455411674">
        <link role="classifier:3" targetNodeId="4490468428501048480" resolveInfo="TableModel" />
      </node>
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8562016843455379017" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="8562016843455379018" />
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="8562016843455379014" />
  </node>
  <node type="jetbrains.mps.baseLanguage.structure.ClassConcept:3" id="730733254587404137">
    <property name="name:3" value="AbstractTableModel" />
    <property name="abstractClass:3" value="true" />
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="730733254587404175">
      <property name="isAbstract:3" value="false" />
      <property name="name:3" value="deleteRow" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="730733254587404176" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="730733254587404177" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="730733254587404178" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="730733254587404179">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="730733254587404180" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="730733254587404194">
      <property name="isAbstract:3" value="false" />
      <property name="name:3" value="createElement" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="730733254587404195" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="730733254587404196" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="730733254587404197" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="730733254587404198">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="730733254587404199" />
      </node>
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="730733254587404200">
        <property name="name:3" value="column" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="730733254587404201" />
      </node>
    </node>
    <node role="method:3" type="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration:3" id="1920931981472563171">
      <property name="isAbstract:3" value="false" />
      <property name="name:3" value="insertRow" />
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="1920931981472563172" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="1920931981472563173" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="1920931981472563174" />
      <node role="parameter:3" type="jetbrains.mps.baseLanguage.structure.ParameterDeclaration:3" id="1920931981472563175">
        <property name="name:3" value="row" />
        <node role="type:3" type="jetbrains.mps.baseLanguage.structure.IntegerType:3" id="1920931981472563176" />
      </node>
    </node>
    <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="730733254587404138" />
    <node role="constructor:3" type="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration:3" id="730733254587404139">
      <node role="returnType:3" type="jetbrains.mps.baseLanguage.structure.VoidType:3" id="730733254587404140" />
      <node role="visibility:3" type="jetbrains.mps.baseLanguage.structure.PublicVisibility:3" id="730733254587404141" />
      <node role="body:3" type="jetbrains.mps.baseLanguage.structure.StatementList:3" id="730733254587404142" />
    </node>
    <node role="implementedInterface:3" type="jetbrains.mps.baseLanguage.structure.ClassifierType:3" id="730733254587404174">
      <link role="classifier:3" targetNodeId="4490468428501048480" resolveInfo="TableModel" />
    </node>
  </node>
</model>

