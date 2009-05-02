package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class NodeMacro_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myNodeMacro_postfix3474_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3474_1(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_3474_0(context, node);
  }

  public EditorCell createCollection_3474_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3474_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_3474_0(context, node, "< abstract node macro >"));
    editorCell.addEditorCell(this.createConstant_3474_1(context, node, ""));
    editorCell.addEditorCell(this.createCollection_3474_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3474_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3474_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_3474_2(context, node, "$$"));
    editorCell.addEditorCell(this.createComponent_3474_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3474_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3474_2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_3474_3(context, node, "mapping label"));
    editorCell.addEditorCell(this.createConstant_3474_4(context, node, ":"));
    editorCell.addEditorCell(this.createRefCell_3474_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3474_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3474_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (renderingCondition3474_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_3474_2(context, node));
    }
    return editorCell;
  }

  public EditorCell createComponent_3474_0(EditorContext context, SNode node) {
    if (this.myNodeMacro_postfix3474_0 == null) {
      this.myNodeMacro_postfix3474_0 = new NodeMacro_postfix(node);
    }
    EditorCell editorCell = this.myNodeMacro_postfix3474_0.createEditorCell(context);
    setupBasic_Component_3474_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_3474_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3474_0(editorCell, node, context);
    setupLabel_Constant_3474_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3474_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3474_1(editorCell, node, context);
    setupLabel_Constant_3474_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3474_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3474_2(editorCell, node, context);
    setupLabel_Constant_3474_2(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new NodeMacro_Editor.NodeMacro_Editor_replaceWith_NodeMacro_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_3474_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3474_3(editorCell, node, context);
    setupLabel_Constant_3474_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3474_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3474_4(editorCell, node, context);
    setupLabel_Constant_3474_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_3474_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new NodeMacro_Editor._Inline3474_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_3474_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_3474_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_3474_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("mappingLabel");
    provider.setNoTargetText("<no label>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_3474_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3474_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3474_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_3474_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3474_0");
  }

  private static void setupBasic_Constant_3474_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3474_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_3474_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3474_1");
  }

  private static void setupBasic_Constant_3474_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3474_2");
    Styles_StyleSheet.getMacroStart(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
        }
      };
      inlineStyle.apply(editorCell);
    }
    MacroSymbol_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Collection_3474_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3474_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_3474_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3474_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_3474_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3474_4");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_RefCell_3474_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_3474_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3474_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3474_3");
  }

  private static void setupLabel_Constant_3474_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3474_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3474_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3474_3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3474_4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_3474_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition3474_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "mappingLabel", false) != null;
  }

  public static class _Inline3474_0 extends AbstractCellProvider {

    public _Inline3474_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_3474_1(context, node);
    }

    public EditorCell createProperty_3474_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_3474_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_3474_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_3474_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_3474_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_3474_0(EditorCell editorCell, SNode node, EditorContext context) {
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

    private static void setupLabel_Property_3474_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class NodeMacro_Editor_replaceWith_NodeMacro_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public NodeMacro_Editor_replaceWith_NodeMacro_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.generator.structure.NodeMacro";
    }

}

}
