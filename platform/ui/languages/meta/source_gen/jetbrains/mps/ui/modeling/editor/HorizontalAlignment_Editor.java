package jetbrains.mps.ui.modeling.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class HorizontalAlignment_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_1tjmxy_a(editorContext, node);
  }

  private EditorCell createCollection_1tjmxy_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_1tjmxy_a");
    editorCell.addEditorCell(this.createCollection_1tjmxy_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_1tjmxy_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_1tjmxy_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    if (renderingCondition_1tjmxy_a0a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_1tjmxy_a0a(editorContext, node));
    }
    if (renderingCondition_1tjmxy_a1a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_1tjmxy_b0a(editorContext, node));
    }
    if (renderingCondition_1tjmxy_a2a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_1tjmxy_c0a(editorContext, node));
    }
    if (renderingCondition_1tjmxy_a3a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_1tjmxy_d0a(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createConstant_1tjmxy_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<- ");
    editorCell.setCellId("Constant_1tjmxy_a0a");
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new HorizontalAlignment_Editor.HorizontalAlignment_component_cellMenu_a0a0a()}));
    return editorCell;
  }

  private EditorCell createConstant_1tjmxy_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ->");
    editorCell.setCellId("Constant_1tjmxy_b0a");
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new HorizontalAlignment_Editor.HorizontalAlignment_component_cellMenu_a0b0a()}));
    return editorCell;
  }

  private EditorCell createConstant_1tjmxy_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " - ");
    editorCell.setCellId("Constant_1tjmxy_c0a");
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new HorizontalAlignment_Editor.HorizontalAlignment_component_cellMenu_a0c0a()}));
    return editorCell;
  }

  private EditorCell createConstant_1tjmxy_d0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<->");
    editorCell.setCellId("Constant_1tjmxy_d0a");
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new HorizontalAlignment_Editor.HorizontalAlignment_component_cellMenu_a0d0a()}));
    return editorCell;
  }

  private static boolean renderingCondition_1tjmxy_a0a0(SNode node, EditorContext editorContext, IScope scope) {
    return "LEFT".equals(SPropertyOperations.getString_def(node, "value", "LEFT"));
  }

  private static boolean renderingCondition_1tjmxy_a1a0(SNode node, EditorContext editorContext, IScope scope) {
    return "RIGHT".equals(SPropertyOperations.getString_def(node, "value", "LEFT"));
  }

  private static boolean renderingCondition_1tjmxy_a2a0(SNode node, EditorContext editorContext, IScope scope) {
    return "CENTER".equals(SPropertyOperations.getString_def(node, "value", "LEFT"));
  }

  private static boolean renderingCondition_1tjmxy_a3a0(SNode node, EditorContext editorContext, IScope scope) {
    return "FILL".equals(SPropertyOperations.getString_def(node, "value", "LEFT"));
  }

  public static class HorizontalAlignment_component_cellMenu_a0a0a implements SubstituteInfoPart {
    private HorizontalAlignment_Chooser myComponent;

    public HorizontalAlignment_component_cellMenu_a0a0a() {
      this.myComponent = new HorizontalAlignment_Chooser();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class HorizontalAlignment_component_cellMenu_a0b0a implements SubstituteInfoPart {
    private HorizontalAlignment_Chooser myComponent;

    public HorizontalAlignment_component_cellMenu_a0b0a() {
      this.myComponent = new HorizontalAlignment_Chooser();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class HorizontalAlignment_component_cellMenu_a0c0a implements SubstituteInfoPart {
    private HorizontalAlignment_Chooser myComponent;

    public HorizontalAlignment_component_cellMenu_a0c0a() {
      this.myComponent = new HorizontalAlignment_Chooser();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class HorizontalAlignment_component_cellMenu_a0d0a implements SubstituteInfoPart {
    private HorizontalAlignment_Chooser myComponent;

    public HorizontalAlignment_component_cellMenu_a0d0a() {
      this.myComponent = new HorizontalAlignment_Chooser();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }
}
