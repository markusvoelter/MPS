package jetbrains.mps.lang.intentions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor.ConceptFunction_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.behavior.ConceptFunction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class QueryBlock_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6409_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCustom_6409_0(context, node);
  }

  private EditorCell createCollection_6409_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_6409_0");
    editorCell.addEditorCell(this.createCollection_6409_1(context, node));
    editorCell.addEditorCell(this.createComponent_6409_0(context, node));
    return editorCell;
  }

  private EditorCell createCollection_6409_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6409_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_6409_0(context, node, "type"));
    editorCell.addEditorCell(this.createConstant_6409_1(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_6409_0(context, node));
    return editorCell;
  }

  private EditorCell createComponent_6409_0(EditorContext context, SNode node) {
    AbstractCellProvider provider = new ConceptFunction_Component(node);
    EditorCell editorCell = provider.createEditorCell(context);
    return editorCell;
  }

  private EditorCell createConstant_6409_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6409_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      style.set(StyleAttributes.SELECTABLE, true);
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6409_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6409_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createCustom_6409_0(EditorContext context, SNode node) {
    AbstractCellProvider provider = this._cellProviderFactory_1240319640305(node, context);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("Custom_6409_0");
    return editorCell;
  }

  public AbstractCellProvider _cellProviderFactory_1240319640305(final SNode node, final EditorContext editorContext) {
    return new AbstractCellProvider() {

      public EditorCell createEditorCell(EditorContext editorContext) {
        EditorCell_Collection collection = EditorCell_Collection.createVertical(editorContext, node);
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Concept function help:"));
        if (SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription") != null) {
          collection.addEditorCell(new EditorCell_Constant(editorContext, node, SConceptPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "shortDescription")));
        }
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, ""));
        collection.addEditorCell(new EditorCell_Constant(editorContext, node, "Parameter help:"));
        for(SNode cfp : ConceptFunction_Behavior.call_getParameters_1213877374450(node)) {
          String alias = SPropertyOperations.getString(cfp, "alias");
          String description = SPropertyOperations.getString(cfp, "shortDescription");
          if (description == null) {
            description = "<no help. use short_description concept function property to create one>";
          }
          EditorCell_Constant message = new EditorCell_Constant(editorContext, node, alias + " : " + description);
          collection.addEditorCell(message);
        }
        return collection;
      }
    };
  }

  private EditorCell createRefNode_6409_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("paramType");
    provider.setNoTargetText("<no paramType>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(context);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

}
