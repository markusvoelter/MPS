package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Image;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.smodel.IScope;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.plugin.behavior.IconResource_Behavior;
import javax.swing.JComponent;
import jetbrains.mps.ide.EditorUtil;

public class IconResource_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_79r3b6_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createProperty_79r3b6_a(editorContext, node);
  }

  private EditorCell createAlternation_79r3b6_a0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = IconResource_Editor.renderingCondition_79r3b6_a0a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_79r3b6_a0a(editorContext, node);
    } else {
      editorCell = this.createAlternation_79r3b6_a0a(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createAlternation_79r3b6_a0a(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = IconResource_Editor.renderingCondition_79r3b6_a0a0(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_79r3b6_a0a0(editorContext, node);
    } else {
      editorCell = this.createConstant_79r3b6_a0a0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createCollection_79r3b6_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_79r3b6_a");
    editorCell.addEditorCell(this.createAlternation_79r3b6_a0(editorContext, node));
    editorCell.addEditorCell(this.createJComponent_79r3b6_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_79r3b6_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_79r3b6_a0a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createImage_79r3b6_a0a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_79r3b6_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<no icon>");
    editorCell.setCellId("Constant_79r3b6_a0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_79r3b6_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<invalid path>");
    editorCell.setCellId("Constant_79r3b6_a0a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createImage_79r3b6_a0a0a(final EditorContext editorContext, final SNode node) {
    EditorCell_Image editorCell;
    editorCell = EditorCell_Image.createImageCell(editorContext, node, new _FunctionTypes._return_P0_E0<String>() {
      public String invoke() {
        return SPropertyOperations.getString(node, "path");
      }
    }.invoke());
    editorCell.setCellId("Image_79r3b6_a0a0a");
    editorCell.setDescent(0);
    return editorCell;
  }

  private EditorCell createJComponent_79r3b6_b0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = EditorCell_Component.createComponentCell(editorContext, node, IconResource_Editor._QueryFunction_JComponent_79r3b6_a1a(node, editorContext), "_79r3b6_b0");
    editorCell.setCellId("JComponent_79r3b6_b0");
    return editorCell;
  }

  private EditorCell createProperty_79r3b6_a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("path");
    provider.setNoTargetText("<no path>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_path");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return IconResource_Editor._StyleParameter_QueryFunction_79r3b6_a0a((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_79r3b6_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return StringUtils.isEmpty(SPropertyOperations.getString(node, "path"));
  }

  private static boolean renderingCondition_79r3b6_a0a0(SNode node, EditorContext editorContext, IScope scope) {
    return IconResource_Behavior.call_isValid_4076419548984269320(node);
  }

  private static JComponent _QueryFunction_JComponent_79r3b6_a1a(final SNode node, final EditorContext editorContext) {
    return EditorUtil.createSelectIconButton(node, "path", editorContext);
  }

  private static Color _StyleParameter_QueryFunction_79r3b6_a0a(SNode node, EditorContext editorContext) {
    return (IconResource_Behavior.call_isValid_4076419548984269320(node) ?
      Color.BLACK :
      Color.RED
    );
  }
}
