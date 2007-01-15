<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.smodelLanguage.editor">
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage" />
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage" />
  <maxImportIndex value="6" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" />
  <import index="2" modelUID="jetbrains.mps.core.structure" />
  <import index="3" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" />
  <import index="4" modelUID="jetbrains.mps.baseLanguage.structure" />
  <import index="5" modelUID="jetbrains.mps.baseLanguage.editor" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063451695">
    <link role="conceptDeclaration" targetNodeId="1.1138056022639" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412409274">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no property&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056395725" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412409275">
        <link role="conceptDeclaration" targetNodeId="3.1071489288299" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412409276">
          <property name="textFgColor" value="darkGray" />
          <property name="fontStyle" value="ITALIC" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="2.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063757082">
    <link role="conceptDeclaration" targetNodeId="1.1138055978872" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138063769790">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <link role="keyMap" targetNodeId="5.1081427357000" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138063769791">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138056667223" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138063769792">
        <property name="text" value="." />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138412455559">
        <property name="attractsFocus" value="1" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138411864174" />
        <link role="actionMap" targetNodeId="1140123519849" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063852256">
    <link role="conceptDeclaration" targetNodeId="1.1138056143562" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412329756">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no link&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056516764" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412329757">
        <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412329758">
          <property name="textFgColor" value="darkGray" />
          <property name="fontStyle" value="ITALIC" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="3.1071599776563" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138063886704">
    <link role="conceptDeclaration" targetNodeId="1.1138056282393" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138412361312">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no link&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1138056546658" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138412361313">
        <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138412361314">
          <property name="textFgColor" value="darkGray" />
          <property name="fontStyle" value="ITALIC" />
          <property name="drawBorder" value="false" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="3.1071599776563" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138405893950">
    <link role="conceptDeclaration" targetNodeId="1.1138055754698" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138405907970">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138405916830">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="snode" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138406005691">
        <property name="text" value="&lt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1138406014241">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138405853777" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1138406014240">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1138406019759">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138406102625">
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138412002490">
    <link role="conceptDeclaration" targetNodeId="1.1138411891628" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Error" id="1138412005946">
      <property name="text" value="&lt;choose operaion&gt;" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138661965229">
    <link role="conceptDeclaration" targetNodeId="1.1138661924179" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1138661974653">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138661978216">
        <property name="editable" value="true" />
        <property name="text" value="set (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1138662130034">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1138662048170" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1138662136645">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138676397914">
    <link role="conceptDeclaration" targetNodeId="1.1138676077309" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1146158256146">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146158270588">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="text" value="&lt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1146158258594">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1138676095763" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1146158258595">
          <link role="conceptDeclaration" targetNodeId="3.1083171877298" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1146158258596">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="fontStyle" value="BOLD" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no ext value&gt;" />
            <link role="relationDeclaration" targetNodeId="3.1083923523172" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146158355984">
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="text" value="&gt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1138757943608">
    <link role="conceptDeclaration" targetNodeId="1.1138757581985" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139880110903">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139880110904">
        <property name="editable" value="true" />
        <property name="text" value="set new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139880110905">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;default&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139880128956" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139880110906">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139880110907">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139880110908">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139184505217">
    <link role="conceptDeclaration" targetNodeId="1.1139184414036" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139877768037">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139877769323">
        <property name="editable" value="true" />
        <property name="text" value="add new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139877775154">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;default&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139877738879" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139877775153">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139877785578">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139877793189">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139616285308">
    <link role="conceptDeclaration" targetNodeId="1.1139613262185" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1144105522780">
      <property name="drawBorder" value="false" />
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144105535520">
        <property name="editable" value="true" />
        <property name="text" value="parent" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144105628958">
        <property name="drawBorder" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144105631509">
          <property name="editable" value="true" />
          <property name="text" value="parent" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1144105636839">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1144105329976" />
        </node>
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146258619668">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146258619669">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146258621780">
            <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1146258637521">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1146258949345">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258632972">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258625251">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1146258623766" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1146258629737">
                    <link role="link" targetNodeId="1.1144104376918" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1146258635536" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node role="inspectedCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154554723148">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154554752665">
        <property name="textFgColor" value="blue" />
        <property name="textBgColor" value="lightGray" />
        <property name="text" value="The 'parent' operation" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154554851745">
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154554923434">
        <property name="text" value="Returns parent node (if no parameters)" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154554988764">
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154554991970">
        <property name="text" value="Optional parameters:" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154555018347">
        <property name="drawBorder" value="false" />
        <property name="vertical" value="true" />
        <property name="selectable" value="false" />
        <property name="gridLayout" value="true" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154555049677">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555068240">
            <property name="text" value="root" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555089681">
            <property name="text" value="get top ancestor" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154555230665">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555230666">
            <property name="text" value="concept" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555230667">
            <property name="text" value="get ancestor which is instance of concept" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154555322515">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555322516">
            <property name="text" value="concept in" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555322517">
            <property name="text" value="get ancestor which is instance of one of concepts" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154555175641">
          <property name="drawBorder" value="false" />
          <property name="vertical" value="false" />
          <property name="selectable" value="false" />
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555175642">
            <property name="text" value="+" />
            <property name="drawBorder" value="false" />
          </node>
          <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154555175643">
            <property name="text" value="return current node if it meets the requirements" />
            <property name="fontStyle" value="PLAIN" />
            <property name="drawBorder" value="false" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139621561609">
    <link role="conceptDeclaration" targetNodeId="1.1139621453865" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139621567253">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139621579911">
        <property name="editable" value="true" />
        <property name="text" value="isInstanceOf(" />
        <property name="fontStyle" value="PLAIN" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139621610101">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139621517231" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139621610100">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139621618369">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139621663918">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139859062995">
    <link role="conceptDeclaration" targetNodeId="1.1139858892567" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139859068528">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139859072592">
        <property name="editable" value="true" />
        <property name="text" value="new next-sibling (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139859121222">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139858951584" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139859121221">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139859127630">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139859097547">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139868014682">
    <link role="conceptDeclaration" targetNodeId="1.1139867745658" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139868035538">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139868035539">
        <property name="editable" value="true" />
        <property name="text" value="replace with new (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1139868035540">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1139867957129" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1139868035541">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1139868035542">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139868035543">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1139870425549">
    <link role="conceptDeclaration" targetNodeId="1.1139870260207" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1139870427663">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139870427664">
        <property name="editable" value="true" />
        <property name="text" value="add (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1139870441857">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1139870427668">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140029629081">
    <link role="conceptDeclaration" targetNodeId="1.1140029532506" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140029629082">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140029629083">
        <property name="editable" value="true" />
        <property name="text" value="insert first (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140029629084">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140029629085">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140123519849">
    <property name="name" value="SNodeOperationExpression_Operation_Actions" />
    <link role="applicableConcept" targetNodeId="1.1138055978872" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140123561975">
      <property name="description" value="replace operation expression with left expression" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140123561977">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140123562104">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140143244848">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140143247163">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140143244849" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140143253429">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140143258604">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140143256963" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140143262730">
                    <link role="link" targetNodeId="1.1138056667223" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140129701012">
    <link role="conceptDeclaration" targetNodeId="1.1140129518788" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140129710123">
      <property name="editable" value="true" />
      <property name="text" value="delete" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140131924706">
    <link role="conceptDeclaration" targetNodeId="1.1140131837776" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140131934568">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140131934569">
        <property name="editable" value="true" />
        <property name="text" value="replace with (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140131934570">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1139870362308" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140131934571">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140133705633">
    <link role="conceptDeclaration" targetNodeId="1.1140133623887" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140133705634">
      <property name="editable" value="true" />
      <property name="text" value="delete" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140138174990">
    <link role="conceptDeclaration" targetNodeId="1.1140137987495" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140138178976">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140138184899">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1140138123956" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140138199073">
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1140138237889">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1140138128738" />
        <link role="actionMap" targetNodeId="1140139667693" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1140138237888">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1140138242844">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1140139667693">
    <property name="name" value="SNodeTypeCastExpression_Concept_Actions" />
    <link role="applicableConcept" targetNodeId="1.1140137987495" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1140139769225">
      <property name="description" value="replace type case with left expression" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1140139769227">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1140139769245">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1140139883561">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140139885751">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140139883562" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1140139898486">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1140139907020">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1140139905394" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1140139909459">
                    <link role="link" targetNodeId="1.1140138123956" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1140725455179">
    <link role="conceptDeclaration" targetNodeId="1.1140725362528" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1140725455180">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140725455181">
        <property name="editable" value="true" />
        <property name="text" value="set (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1140725455182">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1140725362529" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1140725455183">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143221124295">
    <link role="conceptDeclaration" targetNodeId="1.1143221076066" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1143221124296">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143221124297">
        <property name="editable" value="true" />
        <property name="text" value="new prev-sibling (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1143221124298">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1143221076069" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1143221124299">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1143221124300">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143221124301">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143224155410">
    <link role="conceptDeclaration" targetNodeId="1.1143224066846" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1143224155411">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143224155412">
        <property name="editable" value="true" />
        <property name="text" value="add next-sibling (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1143224155413">
        <property name="attractsFocus" value="1" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1143224066849" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143224155414">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143224196790">
    <link role="conceptDeclaration" targetNodeId="1.1143224127713" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1143224196791">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143224196792">
        <property name="editable" value="true" />
        <property name="text" value="add prev-sibling (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1143224196793">
        <property name="attractsFocus" value="1" />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1143224127716" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143224196794">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143226136623">
    <link role="conceptDeclaration" targetNodeId="1.1143226024141" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143226143282">
      <property name="editable" value="true" />
      <property name="textFgColor" value="DARK_BLUE" />
      <property name="text" value="smodel" />
      <property name="fontStyle" value="BOLD" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143234307768">
    <link role="conceptDeclaration" targetNodeId="1.1143234257716" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143234307769">
      <property name="editable" value="true" />
      <property name="text" value="model" />
      <property name="attractsFocus" value="1" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143235366830">
    <link role="conceptDeclaration" targetNodeId="1.1143235216708" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1143235366831">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143235366832">
        <property name="editable" value="true" />
        <property name="text" value="new node (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1143235366833">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1143235391024" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1143235366834">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1143235366835">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143235366836">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143512939910">
    <link role="conceptDeclaration" targetNodeId="1.1143511969223" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143512939911">
      <property name="editable" value="true" />
      <property name="text" value="prev-sibling" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1143512964459">
    <link role="conceptDeclaration" targetNodeId="1.1143512015885" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1143512964460">
      <property name="editable" value="true" />
      <property name="text" value="next-sibling" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144100785515">
    <link role="conceptDeclaration" targetNodeId="1.1144100743722" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_ConceptProperty" id="1146258034223">
      <property name="textFgColor" value="DARK_MAGENTA" />
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="choose parameter" />
      <link role="relationDeclaration" targetNodeId="2.1137473891462" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144102054139">
    <link role="conceptDeclaration" targetNodeId="1.1144101972840" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144102070906">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144102074314">
        <property name="textFgColor" value="lightGray" />
        <property name="text" value="concept=" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144102087113">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;choose concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1144102028966" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144102087114">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144102099303">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.EditorComponentDeclaration" id="1144105329976">
    <property name="name" value="OperationParameters_Component" />
    <link role="conceptDeclaration" targetNodeId="1.1138411891628" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144105389978">
      <property name="drawBorder" value="false" />
      <property name="vertical" value="false" />
      <property name="selectable" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144105389979">
        <property name="textFgColor" value="lightGray" />
        <property name="text" value="&lt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1144105389980">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <property name="vertical" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1144104376918" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144105389981">
        <property name="textFgColor" value="lightGray" />
        <property name="text" value="&gt;" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144146335908">
    <link role="conceptDeclaration" targetNodeId="1.1144146199828" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144146355879">
      <property name="text" value="copy" />
      <property name="attractsFocus" value="1" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1144195442138">
    <link role="conceptDeclaration" targetNodeId="1.1144195091934" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1144195449093">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144195458203">
        <property name="text" value="isRole(" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144195585868">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;concept of parent&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1144195362400" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144195585869">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144195593746">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;concept has no name&gt;" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144198123372">
        <property name="text" value=":" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1144198126876">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;role&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1144195396777" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1144198126877">
          <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1144198126878">
            <property name="textFgColor" value="darkGray" />
            <property name="fontStyle" value="ITALIC" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;link has no role&gt;" />
            <link role="relationDeclaration" targetNodeId="3.1071599776563" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1144195656233">
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145383231438">
    <link role="conceptDeclaration" targetNodeId="1.1145383075378" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145383245679">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145383245680">
        <property name="editable" value="true" />
        <property name="textFgColor" value="DARK_BLUE" />
        <property name="text" value="snodes" />
        <property name="fontStyle" value="BOLD" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145383245681">
        <property name="text" value="&lt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1145383273157">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1145383142433" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1145383273158">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1145383277050">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <property name="noTargetText" value="&lt;no name&gt;" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145383245687">
        <property name="text" value="&gt;" />
        <property name="drawBorder" value="false" />
        <property name="selectable" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145404650449">
    <link role="conceptDeclaration" targetNodeId="1.1145404486709" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145404664303">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1145404664304">
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1140138123956" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145404664305">
        <property name="editable" value="false" />
        <property name="textFgColor" value="DARK_MAGENTA" />
        <property name="text" value="/" />
        <property name="drawBorder" value="false" />
        <link role="actionMap" targetNodeId="1145407825538" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapDeclaration" id="1145407825538">
    <property name="name" value="SemanticDowncastExpression_Symbol_Actions" />
    <link role="applicableConcept" targetNodeId="1.1145404486709" />
    <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMapItem" id="1145407863898">
      <property name="description" value="remove semantic downcast" />
      <property name="actionId" value="delete_action_id" />
      <node role="executeFunction" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_ExecuteFunction" id="1145407863899">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1145407863900">
          <node role="statement" type="jetbrains.mps.baseLanguage.ExpressionStatement" id="1145407914432">
            <node role="expression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145407915778">
              <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1145407914433" />
              <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.Node_ReplaceWithAnotherOperation" id="1145407919732">
                <node role="parameter" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1145407926048">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.CellActionMap_FunctionParm_selectedNode" id="1145407924265" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkAccess" id="1145407933627">
                    <link role="link" targetNodeId="1.1145404616321" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145468780047">
    <link role="conceptDeclaration" targetNodeId="1.1145468686058" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145468793690">
      <property name="editable" value="true" />
      <property name="text" value="count" />
      <property name="drawBorder" value="false" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145567617432">
    <link role="conceptDeclaration" targetNodeId="1.1145567426890" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1145567624652">
      <property name="drawBorder" value="false" />
      <link role="relationDeclaration" targetNodeId="1.1145567471833" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145570883802">
    <link role="conceptDeclaration" targetNodeId="1.1145570846907" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1145571027556">
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145571027557">
        <property name="editable" value="true" />
        <property name="text" value="next-siblings" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145571027558">
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145571027559">
          <property name="editable" value="true" />
          <property name="text" value="next-siblings" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1145571027560">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1144105329976" />
        </node>
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146258668392">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146258668393">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146258669512">
            <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1146258669513">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1146258957268">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258669515">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258669516">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1146258669517" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1146258669518">
                    <link role="link" targetNodeId="1.1144104376918" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1146258669519" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145572859518">
    <link role="conceptDeclaration" targetNodeId="1.1145572800087" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1145572861644">
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145572861645">
        <property name="editable" value="true" />
        <property name="text" value="prev-siblings" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145572861646">
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145572861647">
          <property name="editable" value="true" />
          <property name="text" value="prev-siblings" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1145572861648">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1144105329976" />
        </node>
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146258693208">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146258693209">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146258695171">
            <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1146258695172">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1146258932249">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258695174">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258695175">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1146258695176" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1146258695177">
                    <link role="link" targetNodeId="1.1144104376918" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1146258695178" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145573389679">
    <link role="conceptDeclaration" targetNodeId="1.1145573345940" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Alternation" id="1145573795271">
      <node role="ifTrueCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145573795272">
        <property name="editable" value="true" />
        <property name="text" value="siblings" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="ifFalseCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1145573795273">
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1145573795274">
          <property name="editable" value="true" />
          <property name="text" value="siblings" />
          <property name="drawBorder" value="false" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Component" id="1145573795275">
          <property name="drawBorder" value="false" />
          <link role="editorComponent" targetNodeId="1144105329976" />
        </node>
      </node>
      <node role="alternationCondition" type="jetbrains.mps.bootstrap.editorLanguage.QueryFunction_NodeCondition" id="1146258729757">
        <node role="body" type="jetbrains.mps.baseLanguage.StatementList" id="1146258729758">
          <node role="statement" type="jetbrains.mps.baseLanguage.ReturnStatement" id="1146258730877">
            <node role="expression" type="jetbrains.mps.baseLanguage.EqualsExpression" id="1146258730878">
              <node role="rightExpression" type="jetbrains.mps.baseLanguage.IntegerConstant" id="1146258942266">
                <property name="value" value="0" />
              </node>
              <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258730880">
                <node role="leftExpression" type="jetbrains.mps.bootstrap.smodelLanguage.SNodeOperationExpression" id="1146258730881">
                  <node role="leftExpression" type="jetbrains.mps.bootstrap.editorLanguage.NodeCondition_FunctionParm_node" id="1146258730882" />
                  <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.SLinkListAccess" id="1146258730883">
                    <link role="link" targetNodeId="1.1144104376918" />
                  </node>
                </node>
                <node role="nodeOperation" type="jetbrains.mps.bootstrap.smodelLanguage.LinkList_GetCountOperation" id="1146258730884" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1145994905462">
    <link role="conceptDeclaration" targetNodeId="1.1145994841052" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1145994913699">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;no concept property&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1145994841055" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1145994913700">
        <link role="conceptDeclaration" targetNodeId="3.1105725006687" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1145994918311">
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="fontStyle" value="ITALIC" />
          <property name="readOnly" value="true" />
          <property name="noTargetText" value="&lt;no name&gt;" />
          <link role="relationDeclaration" targetNodeId="2.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1146171168303">
    <link role="conceptDeclaration" targetNodeId="1.1146171026731" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1146171170036">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146171170037">
        <property name="editable" value="true" />
        <property name="text" value="is (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1146171170038">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1146171026732" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146171170039">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1146253594169">
    <link role="conceptDeclaration" targetNodeId="1.1146253292180" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1146253646906">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146253646907">
        <property name="editable" value="true" />
        <property name="text" value="is (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNode" id="1146253646908">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no value&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1146253292181" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1146253646909">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1154547032019">
    <link role="conceptDeclaration" targetNodeId="1.1154546950173" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1154547037209">
      <property name="drawBorder" value="false" />
      <property name="noTargetText" value="&lt;choose concept&gt;" />
      <link role="relationDeclaration" targetNodeId="1.1154546997487" />
      <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1154547037210">
        <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
        <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1154547041930">
          <property name="textFgColor" value="DARK_MAGENTA" />
          <property name="readOnly" value="true" />
          <link role="relationDeclaration" targetNodeId="2.1078489098626" />
        </node>
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1154547191760">
    <link role="conceptDeclaration" targetNodeId="1.1154546920561" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1154547198372">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154547202185">
        <property name="textFgColor" value="lightGray" />
        <property name="text" value="concept in:[" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefNodeList" id="1154547221297">
        <property name="separatorText" value="," />
        <property name="drawBorder" value="false" />
        <link role="relationDeclaration" targetNodeId="1.1154546920563" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1154547244033">
        <property name="textFgColor" value="lightGray" />
        <property name="text" value="]" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1166648591078">
    <link role="conceptDeclaration" targetNodeId="1.1166648550386" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1166648602698">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166648602699">
        <property name="editable" value="true" />
        <property name="text" value="new root node (" />
        <property name="drawBorder" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1166648602700">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no concept&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1166648550387" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1166648602701">
          <link role="conceptDeclaration" targetNodeId="3.1071489090640" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1166648602702">
            <property name="textFgColor" value="DARK_MAGENTA" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="2.1078489098626" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1166648602703">
        <property name="editable" value="true" />
        <property name="text" value=")" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.ConceptEditorDeclaration" id="1168901099262">
    <link role="conceptDeclaration" targetNodeId="1.1168901043992" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Collection" id="1168901118565">
      <property name="drawBorder" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_RefCell" id="1168901122685">
        <property name="drawBorder" value="false" />
        <property name="noTargetText" value="&lt;no link&gt;" />
        <link role="relationDeclaration" targetNodeId="1.1138056546658" />
        <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.InlineEditorComponent" id="1168901122686">
          <link role="conceptDeclaration" targetNodeId="3.1071489288298" />
          <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Property" id="1168901122687">
            <property name="textFgColor" value="darkGray" />
            <property name="fontStyle" value="ITALIC" />
            <property name="drawBorder" value="false" />
            <property name="readOnly" value="true" />
            <link role="relationDeclaration" targetNodeId="3.1071599776563" />
          </node>
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.CellModel_Constant" id="1168901133423">
        <property name="layoutConstraint" value="punctuation" />
        <property name="textFgColor" value="darkGray" />
        <property name="text" value="/list" />
        <property name="fontStyle" value="ITALIC" />
        <property name="drawBorder" value="false" />
      </node>
    </node>
  </node>
</model>

