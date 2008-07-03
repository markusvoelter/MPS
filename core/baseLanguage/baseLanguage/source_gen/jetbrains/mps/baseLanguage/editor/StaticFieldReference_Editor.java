package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.PrimaryReferentMenuCellMenuPart;

public class StaticFieldReference_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell19365_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell19365_0");
  }

  private static void setupBasic_ConstantCell19365_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell19365_0");
    BaseLanguageStyle_StyleSheet.DOT.apply(editorCell);
  }

  private static void setupBasic_staticFieldDeclarationRefCell19365_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_staticFieldDeclarationRefCell19365_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_classifierRefCell19365_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_classifierRefCell19365_0");
    StaticFieldReference_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_ConstantCell19365_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_staticFieldDeclarationRefCell19365_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_classifierRefCell19365_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell19365_0(context, node);
  }

  public EditorCell create_CollectionCell19365_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell19365_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_classifierRefCell19365_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell19365_0(context, node, "."));
    editorCell.addEditorCell(this.create_staticFieldDeclarationRefCell19365_0(context, node));
    return editorCell;
  }

  public EditorCell create_ConstantCell19365_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell19365_0(editorCell, node, context);
    setupLabel_ConstantCell19365_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_staticFieldDeclarationRefCell19365_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticFieldReference_Editor._Inline2());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_staticFieldDeclarationRefCell19365_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_staticFieldDeclarationRefCell19365_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new StaticFieldReference_Editor.StaticFieldReference_staticFieldDeclaration_cellMenu(),new StaticFieldReference_Editor.StaticFieldReference_customReplace_cellMenu()}));
    return editorCell;
  }

  public EditorCell create_staticFieldDeclarationRefCell19365_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("staticFieldDeclaration");
    provider.setNoTargetText("<no static member>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_staticFieldDeclarationRefCell19365_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_classifierRefCell19365_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new StaticFieldReference_Editor._Inline11());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_classifierRefCell19365_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_classifierRefCell19365_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_classifierRefCell19365_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("classifier");
    provider.setNoTargetText("<no classifier>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_classifierRefCell19365_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline2 extends AbstractCellProvider {

    public _Inline2() {
      super();
    }

    private static void setupBasic_namePropertyCell19365_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell19365_0");
      BaseLanguageStyle_StyleSheet.STATIC_FIELD.apply(editorCell);
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell19365_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell19365_0(context, node);
    }

    public EditorCell create_namePropertyCell19365_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell19365_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell19365_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell19365_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell19365_0_internal(context, node, provider);
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
  public static class _Inline11 extends AbstractCellProvider {

    public _Inline11() {
      super();
    }

    private static void setupBasic_namePropertyCell19365_01(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell19365_01");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, 0.0);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_namePropertyCell19365_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell19365_01(context, node);
    }

    public EditorCell create_namePropertyCell19365_01_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell19365_01(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell19365_01((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell19365_01(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell19365_01_internal(context, node, provider);
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
  public static class StaticFieldReference_customReplace_cellMenu extends AbstractCellMenuPart_ReplaceNode_Group {

    public StaticFieldReference_customReplace_cellMenu() {
    }

    public List createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_StaticFieldReference_getParameterObjects(node);
    }

    public SNode createReplacementNode(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return this.createReplacementNode_impl((SNode)parameterObject, node, model, scope, operationContext);
    }

    public SNode createReplacementNode_impl(SNode parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      return QueriesUtil.replaceNodeMenu_StaticFieldReference_createReplacementNode(node, parameterObject);
    }

    public boolean isReferentPresentation() {
      return true;
    }

}
  public static class StaticFieldReference_staticFieldDeclaration_cellMenu extends PrimaryReferentMenuCellMenuPart {

    public StaticFieldReference_staticFieldDeclaration_cellMenu() {
    }
}

}
