package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.bootstrap.structureLanguage.structure.Cardinality;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.LinkDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.ISubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_PropertyPostfixHints;
import jetbrains.mps.util.NameUtil;

public class LinkDeclaration_Editor extends DefaultNodeEditor {

  private static void setupBasic_TargetReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197832374770");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_RoleCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1084189569972");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_SourceCardinalityCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1084205682782");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CellModel_ModelAccess(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1084205682785");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1164661317302");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_SpecializedLinkReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1164661343825");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_RowCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1164661317301");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1084189569970");
    editorCell.setDrawBorder(true);
  }

  private static void setupLabel_TargetReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RoleCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_SourceCardinalityCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_CellModel_ModelAccess(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
    editorCell.getTextLine().setTextBackgroundColor(Color.lightGray);
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_SpecializedLinkReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean _QueryFunction_NodeCondition_1146605728892(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "specializedLink", false) == null;
  }

  public static boolean _QueryFunction_NodeCondition_1146606011485(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "specializedLink", false) != null;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }

  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    LinkDeclaration_Editor.setupBasic_RowCell1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "specializes:"));
    editorCell.addEditorCell(this.createSpecializedLinkReferenceCell(context, node));
    return editorCell;
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    LinkDeclaration_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createTargetReferenceCell(context, node));
    editorCell.addEditorCell(this.createRoleCell(context, node));
    if(LinkDeclaration_Editor._QueryFunction_NodeCondition_1146605728892(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createSourceCardinalityCell(context, node));
    }
    if(LinkDeclaration_Editor._QueryFunction_NodeCondition_1146606011485(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCellModel_ModelAccess(context, node));
    }
    editorCell.addEditorCell(this.createRowCell1(context, node));
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    LinkDeclaration_Editor.setupBasic_ConstantCell(editorCell, node, context);
    LinkDeclaration_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createCellModel_ModelAccess(EditorContext context, SNode node) {
    ModelAccessor modelAccessor = this._modelAcessorFactory_1084205682785(context, node);
    EditorCell_Property editorCell = EditorCell_Property.create(context, modelAccessor, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    LinkDeclaration_Editor.setupBasic_CellModel_ModelAccess(editorCell, node, context);
    LinkDeclaration_Editor.setupLabel_CellModel_ModelAccess(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public ModelAccessor _modelAcessorFactory_1084205682785(final EditorContext editorContext, final SNode node) {
    return new ModelAccessor() {

      public String getText() {
        Cardinality cardinality = SModelUtil_new.getGenuineLinkSourceCardinality(((LinkDeclaration)SNodeOperations.getAdapter(node)));
        return cardinality.getName();
      }

      public void setText(String text) {
      }

      public boolean isValidText(String text) {
        return true;
      }

    };
  }

  public EditorCell createTargetReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new LinkDeclaration_Editor._Inline3());
    EditorCell editorCell = provider.createEditorCell(context);
    LinkDeclaration_Editor.setupBasic_TargetReferenceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LinkDeclaration_Editor.setupLabel_TargetReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createTargetReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("target");
    provider.setNoTargetText("<no target>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createTargetReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRoleCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    LinkDeclaration_Editor.setupBasic_RoleCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LinkDeclaration_Editor.setupLabel_RoleCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new LinkDeclaration_Editor.LinkDeclaration_role_postfixCellMenu()}));
    return editorCell;
  }

  public EditorCell createRoleCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("role");
    provider.setNoTargetText("<no role>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRoleCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createSourceCardinalityCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    LinkDeclaration_Editor.setupBasic_SourceCardinalityCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LinkDeclaration_Editor.setupLabel_SourceCardinalityCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new ISubstituteInfoPart[]{new LinkDeclaration_Editor.LinkDeclaration_sourceCardinality_cellMenu()}));
    return editorCell;
  }

  public EditorCell createSourceCardinalityCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("sourceCardinality");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createSourceCardinalityCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createSpecializedLinkReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new LinkDeclaration_Editor._Inline4());
    EditorCell editorCell = provider.createEditorCell(context);
    LinkDeclaration_Editor.setupBasic_SpecializedLinkReferenceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LinkDeclaration_Editor.setupLabel_SpecializedLinkReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createSpecializedLinkReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("specializedLink");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createSpecializedLinkReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline3 extends AbstractCellProvider {

    public  _Inline3() {
      super();
    }

    private static void setupBasic_NameCell(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1197832374772");
      editorCell.setDrawBorder(false);
    }

    private static void setupLabel_NameCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createNameCell(context, node);
    }

    public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      LinkDeclaration_Editor._Inline3.setupBasic_NameCell(editorCell, node, context);
      if(editorCell instanceof EditorCell_Label) {
        LinkDeclaration_Editor._Inline3.setupLabel_NameCell((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createNameCell(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createNameCellinternal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if(attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class _Inline4 extends AbstractCellProvider {

    public  _Inline4() {
      super();
    }

    private static void setupBasic_RoleCell(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1164661343827");
      editorCell.setDrawBorder(false);
    }

    private static void setupLabel_RoleCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createRoleCell(context, node);
    }

    public EditorCell createRoleCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      LinkDeclaration_Editor._Inline4.setupBasic_RoleCell(editorCell, node, context);
      if(editorCell instanceof EditorCell_Label) {
        LinkDeclaration_Editor._Inline4.setupLabel_RoleCell((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createRoleCell(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("role");
      provider.setNoTargetText("");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createRoleCellinternal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if(attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}
  public static class LinkDeclaration_sourceCardinality_cellMenu extends AbstractCellMenuPart_PropertyValues {

    public  LinkDeclaration_sourceCardinality_cellMenu() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      List<String> result = ListOperations.<String>createList();
      if(SPropertyOperations.hasValue(node, "metaClass", "aggregation", null)) {
        for(Cardinality c : Cardinality.getConstants()) {
          ListOperations.addElement(result, c.getValueAsString());
        }
      } else
      {
        ListOperations.addElement(result, Cardinality._0__1.getValueAsString());
        ListOperations.addElement(result, Cardinality._1.getValueAsString());
      }
      return result;
    }

}
  public static class LinkDeclaration_role_postfixCellMenu extends AbstractCellMenuPart_PropertyPostfixHints {

    public  LinkDeclaration_role_postfixCellMenu() {
    }

    public List<String> getPostfixes(SNode node, IScope scope, IOperationContext operationContext) {
      List<String> postfixes = ListOperations.<String>createList();
      if((SLinkOperations.getTarget(node, "target", false) != null)) {
        String name = NameUtil.decapitalize(SPropertyOperations.getString(SLinkOperations.getTarget(node, "target", false), "name"));
        ListOperations.addAllElements(postfixes, NameUtil.splitByCamels(name));
      }
      return postfixes;
    }

}

}
