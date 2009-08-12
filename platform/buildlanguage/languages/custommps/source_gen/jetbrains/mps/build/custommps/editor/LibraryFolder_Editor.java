package jetbrains.mps.build.custommps.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.build.packaging.editor.IncludeExcludeEditorComponent;
import jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent;
import jetbrains.mps.build.packaging.editor.IncludeExcludeInInspector;
import jetbrains.mps.build.packaging.editor.CompositecomponentEntriesEditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.build.packaging.editor.PackagingStyles_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;

public class LibraryFolder_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIncludeExcludeEditorComponent6803_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent6803_0;
  /* package */AbstractCellProvider myIncludeExcludeInInspector6803_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent6803_1;
  /* package */AbstractCellProvider myCompositecomponentEntriesEditorComponent6803_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6803_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_6803_2(context, node);
  }

  public EditorCell createCollection_6803_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6803_0");
    editorCell.addEditorCell(this.createCollection_6803_1(context, node));
    editorCell.addEditorCell(this.createComponent_6803_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6803_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6803_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConceptProperty_6803_1(context, node));
    editorCell.addEditorCell(this.createRefNode_6803_5(context, node));
    editorCell.addEditorCell(this.createConstant_6803_1(context, node, "in folder"));
    editorCell.addEditorCell(this.createRefNode_6803_1(context, node));
    editorCell.addEditorCell(this.createConstant_6803_0(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode_6803_3(context, node));
    editorCell.addEditorCell(this.createComponent_6803_0(context, node));
    editorCell.addEditorCell(this.createComponent_6803_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6803_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6803_2");
    editorCell.addEditorCell(this.createComponent_6803_2(context, node));
    editorCell.addEditorCell(this.createComponent_6803_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6803_0(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent6803_0 == null) {
      this.myIncludeExcludeEditorComponent6803_0 = new IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent6803_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6803_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent6803_0 == null) {
      this.myConfigurationReferencesEditorComponent6803_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent6803_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6803_2(EditorContext context, SNode node) {
    if (this.myIncludeExcludeInInspector6803_0 == null) {
      this.myIncludeExcludeInInspector6803_0 = new IncludeExcludeInInspector(node);
    }
    EditorCell editorCell = this.myIncludeExcludeInInspector6803_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6803_3(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent6803_1 == null) {
      this.myConfigurationReferencesEditorComponent6803_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent6803_1.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6803_4(EditorContext context, SNode node) {
    if (this.myCompositecomponentEntriesEditorComponent6803_0 == null) {
      this.myCompositecomponentEntriesEditorComponent6803_0 = new CompositecomponentEntriesEditorComponent(node);
    }
    EditorCell editorCell = this.myCompositecomponentEntriesEditorComponent6803_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_6803_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6803_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_6803_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6803_1");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_6803_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_6803_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_6803_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_6803_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6803_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    EditorCell cellWithRole = this.createRefNode_6803_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_6803_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6803_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    EditorCell cellWithRole = this.createRefNode_6803_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_6803_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6803_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("libraryName");
    provider.setNoTargetText("<no libraryName>");
    EditorCell cellWithRole = this.createRefNode_6803_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
