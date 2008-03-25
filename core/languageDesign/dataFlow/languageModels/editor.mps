<?xml version="1.0" encoding="UTF-8"?>
<model name="jetbrains.mps.bootstrap.dataFlow.editor">
  <persistence version="1" />
  <refactoringHistory />
  <language namespace="jetbrains.mps.bootstrap.editorLanguage" />
  <language namespace="jetbrains.mps.baseLanguage.ext.collections.lang">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.ext.collections.lang.structure" version="1" />
  </language>
  <language namespace="jetbrains.mps.bootstrap.smodelLanguage">
    <languageAspect modelUID="jetbrains.mps.bootstrap.smodelLanguage.structure" version="0" />
  </language>
  <language namespace="jetbrains.mps.baseLanguage">
    <languageAspect modelUID="jetbrains.mps.baseLanguage.structure" version="0" />
  </language>
  <maxImportIndex value="2" />
  <import index="1" modelUID="jetbrains.mps.bootstrap.dataFlow.structure" version="-1" />
  <import index="2" modelUID="jetbrains.mps.bootstrap.structureLanguage.structure" version="-1" />
  <visible index="2" modelUID="jetbrains.mps.baseLanguage.editor" />
  <visible index="3" modelUID="jetbrains.mps.core.structure" />
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206442125570">
    <link role="conceptDeclaration" targetNodeId="1.1206442055221" resolveInfo="DataBuilder" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206442128494">
      <property name="vertical" value="true" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206442822168">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442823514">
          <property name="text" value="data" />
          <link role="styleClass" targetNodeId="2v.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442825063">
          <property name="text" value="flow" />
          <link role="styleClass" targetNodeId="2v.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442826799">
          <property name="text" value="builder" />
          <link role="styleClass" targetNodeId="2v.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442830067">
          <property name="text" value="for" />
          <link role="styleClass" targetNodeId="2v.1186415544875" resolveInfo="KeyWord" />
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefCell" id="1206442833851">
          <link role="relationDeclaration" targetNodeId="1.1206442096288" />
          <node role="editorComponent" type="jetbrains.mps.bootstrap.editorLanguage.structure.InlineEditorComponent" id="1206442833852">
            <link role="conceptDeclaration" targetNodeId="2.1169125787135" resolveInfo="AbstractConceptDeclaration" />
            <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Property" id="1206442834510">
              <property name="readOnly" value="true" />
              <link role="relationDeclaration" targetNodeId="3v.1169194664001" resolveInfo="name" />
            </node>
          </node>
        </node>
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442864088">
          <property name="text" value="{" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442838669">
        <property name="selectable" value="false" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206442852410">
        <property name="selectable" value="false" />
        <property name="vertical" value="false" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Indent" id="1206442853240" />
        <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1206442854883">
          <link role="relationDeclaration" targetNodeId="1.1206442812839" />
        </node>
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206442866871">
        <property name="text" value="}" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206443680940">
    <property name="package" value="Instructions" />
    <link role="conceptDeclaration" targetNodeId="1.1206443660532" resolveInfo="EmitNopStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206443683005">
      <property name="text" value="nop" />
      <link role="styleClass" targetNodeId="1206443699820" resolveInfo="instruction" />
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.StyleSheet" id="1206443695631">
    <property name="name" value="DataFlow" />
    <node role="styleClass" type="jetbrains.mps.bootstrap.editorLanguage.structure.StyleSheetClass" id="1206443699820">
      <property name="name" value="Instruction" />
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.ForegroundColorStyleSheetItem" id="1206443703414">
        <property name="color" value="DARK_MAGENTA" />
      </node>
    </node>
    <node role="styleClass" type="jetbrains.mps.bootstrap.editorLanguage.structure.StyleSheetClass" id="1206444940926">
      <property name="name" value="Position" />
      <node role="item" type="jetbrains.mps.bootstrap.editorLanguage.structure.ForegroundColorStyleSheetItem" id="1206444944224">
        <property name="color" value="blue" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206444686645">
    <property name="package" value="Instructions.Variable" />
    <link role="conceptDeclaration" targetNodeId="1.1206444622344" resolveInfo="EmitVariableStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206444688631">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1206444690133">
        <link role="relationDeclaration" targetNodeId="3v.1137473891462" resolveInfo="alias" />
        <link role="styleClass" targetNodeId="1206443699820" resolveInfo="Instruction" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1206444691354">
        <link role="relationDeclaration" targetNodeId="1.1206444629799" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206444931655">
    <property name="package" value="Positions" />
    <link role="conceptDeclaration" targetNodeId="1.1206444910183" resolveInfo="RelativePosition" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206444934251">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1206444935206">
        <link role="styleClass" targetNodeId="1206444940926" resolveInfo="Position" />
        <link role="relationDeclaration" targetNodeId="3v.1137473891462" resolveInfo="alias" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1206444961726">
        <link role="relationDeclaration" targetNodeId="1.1206444923842" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206445207940">
    <property name="package" value="Instructions.Jump" />
    <link role="conceptDeclaration" targetNodeId="1.1206445181593" resolveInfo="EmitJumpStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206445209770">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_ConceptProperty" id="1206445210819">
        <link role="relationDeclaration" targetNodeId="3v.1137473891462" resolveInfo="alias" />
        <link role="styleClass" targetNodeId="1206443699820" resolveInfo="Instruction" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1206445217024">
        <link role="relationDeclaration" targetNodeId="1.1206445193860" />
      </node>
    </node>
  </node>
  <node type="jetbrains.mps.bootstrap.editorLanguage.structure.ConceptEditorDeclaration" id="1206454086084">
    <property name="package" value="Instructions" />
    <link role="conceptDeclaration" targetNodeId="1.1206454052847" resolveInfo="EmitCodeForStatement" />
    <node role="cellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Collection" id="1206454089274">
      <property name="vertical" value="false" />
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206454090057">
        <property name="text" value="code" />
        <link role="styleClass" targetNodeId="1206443699820" resolveInfo="Instruction" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_Constant" id="1206454091449">
        <property name="text" value="for" />
        <link role="styleClass" targetNodeId="1206443699820" resolveInfo="Instruction" />
      </node>
      <node role="childCellModel" type="jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNode" id="1206454092905">
        <link role="relationDeclaration" targetNodeId="1.1206454079161" />
      </node>
    </node>
  </node>
</model>

