package jetbrains.mps.lang.quotation.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;

public class Antiquotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2990_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_2990_1(context, node);
  }

  public EditorCell createCollection_2990_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_2990_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2990_0(context, node, "%("));
    editorCell.addEditorCell(this.createRefNode_2990_1(context, node));
    editorCell.addEditorCell(this.createConstant_2990_1(context, node, ")%"));
    return editorCell;
  }

  public EditorCell createCollection_2990_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_2990_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2990_2(context, node, "node antiquotation "));
    editorCell.addEditorCell(this.createConstant_2990_3(context, node, ""));
    editorCell.addEditorCell(this.createConstant_2990_4(context, node, "attributed node concept:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_2990_1(context, node));
    editorCell.addEditorCell(this.createConstant_2990_5(context, node, "attributed node role in parent:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_2990_0(context, node));
    return editorCell;
  }

  public EditorCell createConstant_2990_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2990_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2990_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2990_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2990_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2990_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2990_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_2990_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode parent = SNodeOperations.getParent(node);
        if ((parent != null)) {
          return parent.getRole_();
        } else
        {
          return "";
        }
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_2990_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_2990_1(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        SNode parent = SNodeOperations.getParent(node);
        if ((SNodeOperations.getParent(node) != null)) {
          return SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getParent(node)), "name");
        } else
        {
          return "";
        }
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_2990_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNode_2990_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2990_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2990_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<expr>");
    EditorCell cellWithRole = this.createRefNode_2990_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_2990_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2990_0");
  }

  private static void setupBasic_Constant_2990_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return Antiquotation_Editor._StyleParameter_QueryFunction_1214399678591((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
  }

  private static void setupBasic_RefNode_2990_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_2990_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return Antiquotation_Editor._StyleParameter_QueryFunction_1214399678097((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
  }

  private static void setupBasic_Collection_2990_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2990_1");
  }

  private static void setupBasic_Constant_2990_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_2990_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_2990_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_4");
  }

  private static void setupBasic_Constant_2990_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2990_5");
  }

  private static void setupBasic_ReadOnlyModelAccessor_2990_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_2990_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_ReadOnlyModelAccessor_2990_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_2990_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  public static Color _StyleParameter_QueryFunction_1214399678097(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  public static Color _StyleParameter_QueryFunction_1214399678591(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

}
