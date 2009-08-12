package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cells.EditorCell_Image;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.structure.editor.EditorUtil;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.nodeEditor.BlockCells;
import javax.swing.JComponent;

public class RunConfigurationTypeDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7369_7(context, node);
  }

  public EditorCell createAlternation_7369_0(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = RunConfigurationTypeDeclaration_Editor.renderingCondition7369_0(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_7369_6(context, node);
    } else
    {
      editorCell = this.createConstant_7369_4(context, node, "<no icon>");
    }
    return editorCell;
  }

  public EditorCell createCollection_7369_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_0");
    editorCell.addEditorCell(this.createConstant_7369_0(context, node, "run configuration type"));
    editorCell.addEditorCell(this.createProperty_7369_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7369_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_7369_1");
    editorCell.addEditorCell(this.createCollection_7369_2(context, node));
    editorCell.addEditorCell(this.createConstant_7369_5(context, node, ""));
    return editorCell;
  }

  public EditorCell createCollection_7369_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_7369_2");
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_7369_3(context, node));
    editorCell.addEditorCell(this.createCollection_7369_4(context, node));
    editorCell.addEditorCell(this.createCollection_7369_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7369_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_7369_1(context, node, "caption:"));
    editorCell.addEditorCell(this.createProperty_7369_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7369_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_7369_2(context, node, "description:"));
    editorCell.addEditorCell(this.createProperty_7369_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7369_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_7369_3(context, node, "icon:"));
    editorCell.addEditorCell(this.createAlternation_7369_0(context, node));
    editorCell.addEditorCell(EditorCell_Component.createComponentCell(context, node, RunConfigurationTypeDeclaration_Editor._QueryFunction_JComponent_3710678335995461392(node, context), "_3710678335995461391"));
    return editorCell;
  }

  public EditorCell createCollection_7369_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createImage_7369_0(context, node));
    editorCell.addEditorCell(this.createProperty_7369_7(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7369_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setCellId("Collection_7369_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_7369_8(context, node));
    editorCell.addEditorCell(this.createCollection_7369_9(context, node));
    if (renderingCondition7369_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_7369_7(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection_7369_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_7369_0(context, node));
    if (renderingCondition7369_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_7369_6(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection_7369_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_7369_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell7369_0(context, node));
    editorCell.addEditorCell(this.createCollection_7369_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_7369_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_1");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_2");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_6");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7369_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_7369_7");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createImage_7369_0(EditorContext context, SNode node) {
    EditorCell_Image editorCell;
    editorCell = EditorCell_Image.createImageCell(context, node, _image_provider_3710678335995461381(node, context));
    editorCell.setCellId("Image_7369_0");
    editorCell.setDescent(0);
    return editorCell;
  }

  public EditorCell createIndentCell7369_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty_7369_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_name");
    BaseLanguageStyle_StyleSheet.getClassName(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7369_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_7369_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7369_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_caption");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7369_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("caption");
    provider.setNoTargetText("<no caption>");
    EditorCell cellWithRole = this.createProperty_7369_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7369_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_description");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7369_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_7369_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7369_6_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_iconPath");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7369_7(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("iconPath");
    provider.setNoTargetText("<no iconPath>");
    EditorCell cellWithRole = this.createProperty_7369_6_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  public static String _image_provider_3710678335995461381(SNode node, EditorContext editorContext) {
    return SPropertyOperations.getString(node, "iconPath");
  }

  public static boolean renderingCondition7369_0(SNode node, EditorContext editorContext, IScope scope) {
    String path = null;
    IModule module = EditorUtil.findAnchorModule(node);
    if (module != null) {
      path = MacrosUtil.expandPath(SPropertyOperations.getString(node, "iconPath"), module.getModuleUID());
    }
    return path != null && FileSystem.getFile(path).exists();
  }

  public static boolean renderingCondition7369_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition7369_2(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static JComponent _QueryFunction_JComponent_3710678335995461392(SNode node, EditorContext editorContext) {
    return EditorUtil.createSelectIconButton(node, "iconPath", editorContext);
  }

}
