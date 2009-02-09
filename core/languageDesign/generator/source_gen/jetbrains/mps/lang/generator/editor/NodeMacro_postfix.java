package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.lang.generator.structure.NodeMacro_AnnotationLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class NodeMacro_postfix extends AbstractCellProvider {

  public NodeMacro_postfix(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_9824_0(context, node);
  }

  public EditorCell createCollection_9824_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9824_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition9824_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_9824_1(context, node));
    }
    if (renderingCondition9824_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_9824_1(context, node));
    }
    editorCell.addEditorCell(this.createAttributedNodeCell_9824_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9824_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9824_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_9824_0(context, node, "bad role:"));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_9824_0(context, node));
    return editorCell;
  }

  public EditorCell createConstant_9824_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9824_0(editorCell, node, context);
    setupLabel_Constant_9824_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createReadOnlyModelAccessor_9824_0(final EditorContext context, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(context, new ModelAccessor() {

      public String getText() {
        return node.getRole_();
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }

    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    setupBasic_ReadOnlyModelAccessor_9824_0(editorCell, node, context);
    setupLabel_ReadOnlyModelAccessor_9824_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createAttributedNodeCell_9824_0(EditorContext context, SNode node) {
    IOperationContext opContext = context.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    setupBasic_AttributedNodeCell_9824_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRefCell_9824_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new NodeMacro_postfix._Inline9824_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_9824_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_9824_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_9824_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("mappingLabel");
    provider.setNoTargetText("<no mappingLabel>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_9824_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9824_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_9824_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9824_1");
  }

  private static void setupBasic_Constant_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9824_0");
  }

  private static void setupBasic_AttributedNodeCell_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
    Styles_StyleSheet.getNodeUnderMacro(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefCell_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ReadOnlyModelAccessor_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("ReadOnlyModelAccessor_9824_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_9824_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_9824_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ReadOnlyModelAccessor_9824_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition9824_0(SNode node, EditorContext editorContext, IScope scope) {
    String actualRole = node.getRole_();
    String expectedRole = AttributesRolesUtil.childRoleFromAttributeRole(NodeMacro_AnnotationLink.NODE_MACRO);
    return !(actualRole.equals(expectedRole));
  }

  public static boolean renderingCondition9824_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "mappingLabel", false) != null;
  }

  public static class _Inline9824_0 extends AbstractCellProvider {

    public _Inline9824_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_9824_1(context, node);
    }

    public EditorCell createProperty_9824_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_9824_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_9824_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_9824_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_9824_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_9824_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.orange);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Property_9824_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
