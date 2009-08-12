package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.plugin.behavior.ActionParameter_Behavior;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class ActionDataParameterDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myActionParameter_NameCellComponent6715_0;
  /* package */AbstractCellProvider myActionParameter_Hint6715_0;
  /* package */AbstractCellProvider myActionParameter_IsOptional6715_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6715_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent_6715_1(context, node);
  }

  public EditorCell createCollection_6715_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6715_0");
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_6715_0(context, node));
    editorCell.addEditorCell(this.createComponent_6715_0(context, node));
    editorCell.addEditorCell(this.createConstant_6715_0(context, node, "key:"));
    editorCell.addEditorCell(this.createRefCell_6715_0(context, node));
    editorCell.addEditorCell(this.createComponent_6715_2(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6715_0(EditorContext context, SNode node) {
    if (this.myActionParameter_NameCellComponent6715_0 == null) {
      this.myActionParameter_NameCellComponent6715_0 = new ActionParameter_NameCellComponent(node);
    }
    EditorCell editorCell = this.myActionParameter_NameCellComponent6715_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6715_1(EditorContext context, SNode node) {
    if (this.myActionParameter_Hint6715_0 == null) {
      this.myActionParameter_Hint6715_0 = new ActionParameter_Hint(node);
    }
    EditorCell editorCell = this.myActionParameter_Hint6715_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6715_2(EditorContext context, SNode node) {
    if (this.myActionParameter_IsOptional6715_0 == null) {
      this.myActionParameter_IsOptional6715_0 = new ActionParameter_IsOptional(node);
    }
    EditorCell editorCell = this.myActionParameter_IsOptional6715_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConstant_6715_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_6715_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_6715_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return BaseConcept_Behavior.call_getPresentation_1213877396640(ActionParameter_Behavior.call_getType_1171743928471337193(node));
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_6715_0");
    return editorCell;
  }

  public EditorCell createRefCell_6715_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("key");
    provider.setNoTargetText("<no key>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new ActionDataParameterDeclaration_Editor._Inline6715_0());
    editorCell = provider.createEditorCell(context);
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

  public static class _Inline6715_0 extends AbstractCellProvider {

    public _Inline6715_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_6715_0(context, node);
    }

    public EditorCell createProperty_6715_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(context);
      editorCell.setCellId("property_name");
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

}
