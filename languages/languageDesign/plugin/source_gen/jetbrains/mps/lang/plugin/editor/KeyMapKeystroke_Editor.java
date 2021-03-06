package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.nodeEditor.EditorCellKeyMap;

public class KeyMapKeystroke_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_paq7mh_a(editorContext, node);
  }

  private EditorCell createCollection_paq7mh_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_paq7mh_a");
    editorCell.addEditorCell(this.createConstant_paq7mh_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_paq7mh_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_paq7mh_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_paq7mh_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_paq7mh_e0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_paq7mh_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_paq7mh_g0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_paq7mh_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<");
    editorCell.setCellId("Constant_paq7mh_a0");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.MATCHING_LABEL, "mod");
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_paq7mh_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_paq7mh_c0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.MATCHING_LABEL, "mod");
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_paq7mh_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "+");
    editorCell.setCellId("Constant_paq7mh_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_paq7mh_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<");
    editorCell.setCellId("Constant_paq7mh_e0");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.MATCHING_LABEL, "keycode");
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_paq7mh_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ">");
    editorCell.setCellId("Constant_paq7mh_g0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.MATCHING_LABEL, "keycode");
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_paq7mh_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("modifiers");
    provider.setNoTargetText("any");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_modifiers");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    }
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new KeyMapKeystroke_Editor.KeyMapKeystroke_modifiers_cellMenu_a0b0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_paq7mh_f0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("keycode");
    provider.setNoTargetText("<keycode>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_keycode");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    }
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new KeyMapKeystroke_Editor.KeyMapKeystroke_keycode_cellMenu_a0f0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class KeyMapKeystroke_modifiers_cellMenu_a0b0 extends AbstractCellMenuPart_PropertyValues {
    public KeyMapKeystroke_modifiers_cellMenu_a0b0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<String>(), EditorCellKeyMap.KEY_MODIFIERS_NONE, EditorCellKeyMap.KEY_MODIFIERS_CTRL, EditorCellKeyMap.KEY_MODIFIERS_ALT, EditorCellKeyMap.KEY_MODIFIERS_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_ALT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_CTRL_ALT_SHIFT, EditorCellKeyMap.KEY_MODIFIERS_ALT_SHIFT);
    }
  }

  public static class KeyMapKeystroke_keycode_cellMenu_a0f0 extends AbstractCellMenuPart_PropertyValues {
    public KeyMapKeystroke_keycode_cellMenu_a0f0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      List<String> keycodes = ListSequence.fromListAndArray(new ArrayList<String>(), EditorCellKeyMap.KEY_CODE_DIGIT, EditorCellKeyMap.KEY_CODE_LETTER, EditorCellKeyMap.KEY_CODE_LETTER_OR_DIGIT, EditorCellKeyMap.KEY_CODE_SPACE, EditorCellKeyMap.KEY_CODE_CHAR);
      ListSequence.fromList(keycodes).addSequence(ListSequence.fromList(EditorCellKeyMap.getVirtualKeycodes()));
      return keycodes;
    }
  }
}
