package jetbrains.mps.baseLanguage.dates.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import org.joda.time.DateTimeZone;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class TimeZoneIDExpression_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_dukjzk_a(editorContext, node);
  }

  private EditorCell createCollection_dukjzk_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_dukjzk_a");
    editorCell.addEditorCell(this.createProperty_dukjzk_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createProperty_dukjzk_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("timezone_id");
    provider.setNoTargetText("<no timezone_id>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_timezone_id");
    Dates_StyleSheet.getDateProperty(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new TimeZoneIDExpression_Editor.TimeZoneIDExpression_timezone_id_cellMenu_a0a0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class TimeZoneIDExpression_timezone_id_cellMenu_a0a0 extends AbstractCellMenuPart_PropertyValues {
    public TimeZoneIDExpression_timezone_id_cellMenu_a0a0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      DateTimeZone.getAvailableIDs();
      List<String> result = ListSequence.fromList(new ArrayList<String>());
      for (Object id : DateTimeZone.getAvailableIDs()) {
        ListSequence.fromList(result).addElement(String.valueOf(id));
      }
      return result;
    }
  }
}
