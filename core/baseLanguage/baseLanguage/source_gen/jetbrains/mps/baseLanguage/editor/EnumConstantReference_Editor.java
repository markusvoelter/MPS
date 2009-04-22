package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModel;

public class EnumConstantReference_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0362_0(context, node);
  }

  public EditorCell createCollection_0362_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_0362_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefCell_0362_3(context, node));
    editorCell.addEditorCell(this.createConstant_0362_0(context, node, "."));
    editorCell.addEditorCell(this.createRefCell_0362_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_0362_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0362_0(editorCell, node, context);
    setupLabel_Constant_0362_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_0362_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new EnumConstantReference_Editor._Inline0362_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_0362_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_0362_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new EnumConstantReference_Editor.EnumConstantReference_customReplace_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefCell_0362_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("enumConstantDeclaration");
    provider.setNoTargetText("<no enumConstantDeclaration>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_0362_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_0362_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new EnumConstantReference_Editor._Inline0362_1());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_0362_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefCell_0362_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_0362_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("enumClass");
    provider.setNoTargetText("<no enum>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell_0362_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0362_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0362_0");
  }

  private static void setupBasic_Constant_0362_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0362_0");
    BaseLanguageStyle_StyleSheet.getDot(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefCell_0362_0(EditorCell editorCell, SNode node, EditorContext context) {
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.FIRST_EDITABLE_CELL);
    }
  }

  private static void setupBasic_RefCell_0362_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_0362_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_0362_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefCell_0362_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline0362_0 extends AbstractCellProvider {

    public _Inline0362_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_0362_1(context, node);
    }

    public EditorCell createProperty_0362_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_0362_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_0362_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_0362_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_0362_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_0362_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
            this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
          }
        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Property_0362_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class _Inline0362_1 extends AbstractCellProvider {

    public _Inline0362_1() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_0362_3(context, node);
    }

    public EditorCell createProperty_0362_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_0362_1(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_Property_0362_1((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_0362_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty_0362_2_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_0362_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name_1");
    }

    private static void setupLabel_Property_0362_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class EnumConstantReference_customReplace_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_Group {

    public EnumConstantReference_customReplace_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_parameterObjects(SLinkOperations.getTarget(node, "enumClass", false), node);
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return this.createReplacementNode_impl((SNode)parameterObject, node, model, scope, operationContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_createNewNode(SLinkOperations.getTarget(node, "enumClass", false), parameterObject, node);
    }

    public boolean isReferentPresentation() {
      return true;
    }

}

}
