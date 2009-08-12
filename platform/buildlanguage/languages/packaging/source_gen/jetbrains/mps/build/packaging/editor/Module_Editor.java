package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.build.packaging.behavior.Module_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Module_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent6816_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent6816_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6816_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent_6816_0(context, node);
  }

  public EditorCell createCollection_6816_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_6816_0");
    editorCell.addKeyMap(new Module_KeyMap());
    editorCell.addEditorCell(this.createConceptProperty_6816_1(context, node));
    editorCell.addEditorCell(this.createProperty_6816_1(context, node));
    editorCell.addEditorCell(this.createComponent_6816_1(context, node));
    return editorCell;
  }

  public EditorCell createComponent_6816_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent6816_0 == null) {
      this.myConfigurationReferencesEditorComponent6816_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent6816_0.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createComponent_6816_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent6816_1 == null) {
      this.myConfigurationReferencesEditorComponent6816_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent6816_1.createEditorCell(context);
    return editorCell;
  }

  public EditorCell createConceptProperty_6816_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_6816_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_6816_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_6816_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_name");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new Module_Editor.Module_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createProperty_6816_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(true);
    EditorCell cellWithRole = this.createProperty_6816_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class Module_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Group {

    public Module_generic_cellMenu0() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return Module_Behavior.getAllAvailableModules_1222444746697();
    }

    public void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      this.handleAction_impl((IModule)parameterObject, node, model, scope, operationContext);
    }

    public void handleAction_impl(IModule parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "id", parameterObject.getModuleId().toString());
      SPropertyOperations.set(node, "name", parameterObject.getModuleReference().getModuleFqName());
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((IModule)parameterObject);
    }

    public String getMatchingText_internal(IModule parameterObject) {
      return parameterObject.getModuleReference().getModuleFqName();
    }

}

}
