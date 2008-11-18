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
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.EnumMeasure;

public class Antiquotation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1196350915489(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1196350915501(context, node);
  }

  public EditorCell createCollection1196350915489(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11963509154891196350915489(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196350915490(context, node, "%("));
    editorCell.addEditorCell(this.createRefNode1196350915495(context, node));
    editorCell.addEditorCell(this.createConstant1196350915496(context, node, ")%"));
    return editorCell;
  }

  public EditorCell createCollection1196350915501(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11963509155011196350915501(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196350915502(context, node, "node antiquotation "));
    editorCell.addEditorCell(this.createConstant1196350915503(context, node, ""));
    editorCell.addEditorCell(this.createCollection1196350915504(context, node));
    editorCell.addEditorCell(this.createCollection1196350915541(context, node));
    return editorCell;
  }

  public EditorCell createCollection1196350915504(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11963509155041196350915504(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196350915505(context, node, "attributed node concept:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062536560(context, node));
    return editorCell;
  }

  public EditorCell createCollection1196350915541(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11963509155411196350915541(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1196350915542(context, node, "attributed node role in parent:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor1226062535313(context, node));
    return editorCell;
  }

  public EditorCell createConstant1196350915490(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509154901196350915490(editorCell, node, context);
    setupLabel_Constant_1196350915490_1196350915490(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196350915496(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509154961196350915496(editorCell, node, context);
    setupLabel_Constant_1196350915496_1196350915496(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196350915502(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509155021196350915502(editorCell, node, context);
    setupLabel_Constant_1196350915502_1196350915502(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196350915503(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509155031196350915503(editorCell, node, context);
    setupLabel_Constant_1196350915503_1196350915503(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196350915505(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509155051196350915505(editorCell, node, context);
    setupLabel_Constant_1196350915505_1196350915505(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1196350915542(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11963509155421196350915542(editorCell, node, context);
    setupLabel_Constant_1196350915542_1196350915542(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062535313(final EditorContext context, final SNode node) {
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
        return s.equals(this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625353131226062535313(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062535313_1226062535313(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor1226062536560(final EditorContext context, final SNode node) {
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
        return s.equals(this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_12260625365601226062536560(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_1226062536560_1226062536560(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefNode1196350915495_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_expression1196350915495(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_expression_1196350915495((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1196350915495(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<expr>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1196350915495_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11963509154891196350915489(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196350915489");
  }

  private static void setupBasic_Constant_11963509154901196350915490(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915490");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

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
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_expression1196350915495(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11963509154961196350915496(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915496");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

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
          this.set(StyleAttributes.FIRST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, EnumMeasure.spaces));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11963509155011196350915501(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196350915501");
  }

  private static void setupBasic_Constant_11963509155021196350915502(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915502");
  }

  private static void setupBasic_Constant_11963509155031196350915503(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915503");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11963509155041196350915504(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196350915504");
  }

  private static void setupBasic_Constant_11963509155051196350915505(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915505");
  }

  private static void setupBasic_Collection_11963509155411196350915541(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1196350915541");
  }

  private static void setupBasic_Constant_11963509155421196350915542(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1196350915542");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625353131226062535313(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062535313");
  }

  private static void setupBasic_ReadOnlyModelAccessor_12260625365601226062536560(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_1226062536560");
  }

  private static void setupLabel_Constant_1196350915490_1196350915490(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_expression_1196350915495(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196350915496_1196350915496(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196350915502_1196350915502(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196350915503_1196350915503(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196350915505_1196350915505(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1196350915542_1196350915542(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062535313_1226062535313(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_1226062536560_1226062536560(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static Color _StyleParameter_QueryFunction_1214399678097(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

  public static Color _StyleParameter_QueryFunction_1214399678591(SNode node, EditorContext editorContext) {
    return Colors.BROWN;
  }

}
