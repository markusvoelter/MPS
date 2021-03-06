package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class MacroReference_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_yfwtie_a(editorContext, node);
  }

  private EditorCell createCollection_yfwtie_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_yfwtie_a");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new MacroReference_Editor.MacroReference_component_cellMenu_a0a()}));
    if (renderingCondition_yfwtie_a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_yfwtie_a0(editorContext, node));
    }
    if (renderingCondition_yfwtie_a1a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_yfwtie_b0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createConstant_yfwtie_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "no macro");
    editorCell.setCellId("Constant_yfwtie_b0");
    PackagingStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new MacroReference_Editor.MacroReference_component_cellMenu_a0b0()}));
    return editorCell;
  }

  private EditorCell createProperty_yfwtie_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    PackagingStyles_StyleSheet.getVariable(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new MacroReference_Editor.MacroReference_component_cellMenu_a0a0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_yfwtie_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return StringUtils.isNotEmpty(SPropertyOperations.getString(node, "name"));
  }

  private static boolean renderingCondition_yfwtie_a1a(SNode node, EditorContext editorContext, IScope scope) {
    return StringUtils.isEmpty(SPropertyOperations.getString(node, "name"));
  }

  public static class MacroReference_component_cellMenu_a0a0 implements SubstituteInfoPart {
    private MacroReference_MenuComponent myComponent;

    public MacroReference_component_cellMenu_a0a0() {
      this.myComponent = new MacroReference_MenuComponent();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class MacroReference_component_cellMenu_a0b0 implements SubstituteInfoPart {
    private MacroReference_MenuComponent myComponent;

    public MacroReference_component_cellMenu_a0b0() {
      this.myComponent = new MacroReference_MenuComponent();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class MacroReference_component_cellMenu_a0a implements SubstituteInfoPart {
    private MacroReference_MenuComponent myComponent;

    public MacroReference_component_cellMenu_a0a() {
      this.myComponent = new MacroReference_MenuComponent();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }
}
