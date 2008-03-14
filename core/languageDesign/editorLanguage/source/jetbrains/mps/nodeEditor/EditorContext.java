package jetbrains.mps.nodeEditor;

import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelEvent;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;

import java.util.*;


/**
 * Author: Sergey Dmitriev
 * Created Sep 14, 2003
 */
public class EditorContext {

  private AbstractEditorComponent myNodeEditorComponent;
  private SModelDescriptor myModelDescriptor;
  private IOperationContext myOperationContext;
  private EditorCell myContextCell;
  private java.util.List<SModelEvent> mySModelEvents = null;

  private ReferencedNodeContext myCurrentRefNodeContext;

  public EditorContext(AbstractEditorComponent editorComponent, SModel model, IOperationContext operationContext) {
    myNodeEditorComponent = editorComponent;
    myModelDescriptor = model == null ? null : model.getModelDescriptor();
    myOperationContext = operationContext;
  }

  public AbstractEditorComponent getNodeEditorComponent() {
    return myNodeEditorComponent;
  }

  public boolean isInspector() {
    return myNodeEditorComponent instanceof InspectorEditorComponent;
  }

  public EditorCell getSelectedCell() {
    return myNodeEditorComponent.getSelectedCell();
  }

  public IScope getScope() {
    return myOperationContext.getScope();
  }

  public SNode getSelectedNode() {
    return getSelectedCell().getSNode();
  }

  public SModel getModel() {
    return myModelDescriptor.getSModel();
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public void resetModelEvents() {
    mySModelEvents = null;
  }

  public void setModelEvents(List<SModelEvent> modelEvents) {
    mySModelEvents = modelEvents;
  }

  private EditorCell createNodeCell(java.util.List<SModelEvent> events, ReferencedNodeContext refContext) {
    return myOperationContext.getComponent(EditorManager.class).createEditorCell(this, events, refContext);
  }

  private EditorCell createNodeCellInAir(EditorManager editorManager, ReferencedNodeContext referencedNodeContext) {
    return editorManager.createEditorCell(this, null, referencedNodeContext);
  }

  public EditorCell createRootCell(SNode node, java.util.List<SModelEvent> events) {
    mySModelEvents = events;
    initializeRefContext(node);
    EditorCell result = myOperationContext.getComponent(EditorManager.class).createRootCell(this, node, events);
    resetCurrentRefContext();
    mySModelEvents = null;
    return result;
  }

  public EditorCell createInspectedCell(SNode node, java.util.List<SModelEvent> events) {
    mySModelEvents = events;
    initializeRefContext(node);
    EditorCell result = myOperationContext.getComponent(EditorManager.class).createInspectedCell(this, node, events);
    resetCurrentRefContext();
    mySModelEvents = null;
    return result;
  }

  private void initializeRefContext(SNode rootNode) {
    myCurrentRefNodeContext = ReferencedNodeContext.createNodeContext(rootNode);
  }

  private void resetCurrentRefContext() {
    myCurrentRefNodeContext = null;
  }

  public EditorCell createNodeCell(SNode node) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(node);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.sameContextButAnotherNode(node);
    EditorCell nodeCell = createNodeCell(mySModelEvents, myCurrentRefNodeContext);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public EditorCell createNodeCellInAir(SNode node, EditorManager editorManager) {
    ReferencedNodeContext referencedNodeContext = ReferencedNodeContext.createNodeContext(node);
    EditorCell nodeCell = createNodeCellInAir(editorManager, referencedNodeContext);
    return nodeCell;
  }

  public EditorCell createReferentCell(SNode sourceNode, SNode targetNode, String role) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(targetNode);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.contextWithOneMoreReference(targetNode, sourceNode, role);
    EditorCell nodeCell = createNodeCell(mySModelEvents, myCurrentRefNodeContext);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public EditorCell createReferentCell(AbstractCellProvider inlineComponent, SNode sourceNode, SNode targetNode, String role) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(targetNode);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.contextWithOneMoreReference(targetNode, sourceNode, role);
    EditorCell nodeCell = inlineComponent.createEditorCell(this);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public Object createMemento() {
    return new Memento(this);
  }

  public boolean isMementoApplicable(Object o) {
    if (o instanceof Memento) {
      return myNodeEditorComponent == ((Memento) o).myNodeEditor;
    }
    return false;
  }

  public void selectLater(final SNode node) {
    CommandProcessor.instance().invokeLater(new Runnable() {
      public void run() {
        getNodeEditorComponent().selectNode(node);
      }
    });
  }

  public void selectBeforeLater(final SNode node) {
    CommandProcessor.instance().invokeLater(new Runnable() {
      public void run() {
        getNodeEditorComponent().selectNode(node);
        EditorCell cell = getNodeEditorComponent().getSelectedCell();

        if (cell instanceof EditorCell_Label) {
          EditorCell_Label label = (EditorCell_Label) cell;
          label.getTextLine().home();
        }
      }
    });
  }

  public void selectAfterLater(final SNode node) {
    CommandProcessor.instance().invokeLater(new Runnable() {
      public void run() {
        getNodeEditorComponent().selectNode(node);
        EditorCell cell = getNodeEditorComponent().getSelectedCell();

        if (cell instanceof EditorCell_Label) {
          EditorCell_Label label = (EditorCell_Label) cell;
          label.getTextLine().end();
        }

      }
    });
  }

  public void selectLaterWRTFocusPolicy(final SNode node) {
    selectLaterWRTFocusPolicy(node, true);
  }

  public void selectLaterWRTFocusPolicy(final SNode node, final boolean force) {
    CommandProcessor.instance().invokeLater(new Runnable() {
      public void run() {
        if (!force && getNodeEditorComponent().getSelectedNode() == node) {
          return;
        }

        EditorCell cell = getNodeEditorComponent().findNodeCell(node);
        if (cell != null) {
          getNodeEditorComponent().changeSelectionWRTFocusPolicy(cell);
        }
      }
    });
  }



  public void selectAndSetCaretLater(final SNode node, final int position) {
    CommandProcessor.instance().invokeLater(new Runnable() {
      public void run() {
        getNodeEditorComponent().selectNode(node);
        EditorCell selectedCell = getNodeEditorComponent().getSelectedCell();
        setCaretPosition(selectedCell, position);
      }

      private int setCaretPosition(EditorCell editorCell, int position) {
        int newPosition = position;
        if (editorCell instanceof EditorCell_Label) {
          EditorCell_Label editorCell_label = (EditorCell_Label) editorCell;
          newPosition = position - editorCell_label.getTextLine().getText().length();
          if (newPosition < 0) {
            getNodeEditorComponent().changeSelection(editorCell);
            editorCell_label.getTextLine().setCaretPosition(position);
          }
        } else if (editorCell instanceof EditorCell_Collection) {
          EditorCell_Collection editorCell_iterable = (EditorCell_Collection) editorCell;
          for (EditorCell subEditorCell: editorCell_iterable) {
            newPosition = setCaretPosition(subEditorCell, newPosition);
            if (newPosition < 0) {
              break;
            }
          }
        }
        return newPosition;
      }      
    });
  }

  public boolean setMemento(Object o) {
    if (o instanceof Memento) {
      final Memento memento = (Memento) o;
      if (myNodeEditorComponent == memento.myNodeEditor) {
        if (memento.myCellInfo != null) {
          CommandProcessor.instance().executeLightweightCommand(new Runnable() {
            public void run() {
              EditorCell cellToSelect = memento.myCellInfo.findCell(myNodeEditorComponent);
              myNodeEditorComponent.changeSelection(cellToSelect);
              myNodeEditorComponent.setSelectedStackFromMemento(memento.mySelectedStack);
              for (CellInfo collectionInfo : memento.myCollectionsWithEnabledBraces) {
                EditorCell collection = collectionInfo.findCell(myNodeEditorComponent);
                if (!(collection instanceof EditorCell_Collection)) continue;
                ((EditorCell_Collection)collection).enableBraces();
              }
              for (CellInfo collectionInfo : memento.myFolded) {
                EditorCell collection = collectionInfo.findCell(myNodeEditorComponent);
                if (!(collection instanceof EditorCell_Collection)) continue;
                ((EditorCell_Collection)collection).fold(true);
              }
              EditorCell deepestSelectedCell = myNodeEditorComponent.getDeepestSelectedCell();
              if (deepestSelectedCell != null) {
                deepestSelectedCell.setCaretX(memento.myCaretX);
              }
            }
          });
        }
        CommandProcessor.instance().invokeNowOrLater(new Runnable() {
          public void run() {
            myNodeEditorComponent.relayout();
          }
        });
        return true;
      }
    }
    return false;
  }

  public void setContextCell(EditorCell cell) {
    myContextCell = cell;
  }

  public EditorCell getContextCell() {
    if (myContextCell == null) return getNodeEditorComponent().getSelectedCell();
    return myContextCell;
  }

  public EditorCell createRoleAttributeCell(Class attributeClass, EditorCell cellWithRole, SNode roleAttribute) {
    if (myCurrentRefNodeContext != null)  {
      if (attributeClass != jetbrains.mps.annotations.structure.LinkAttributeConcept.class && myCurrentRefNodeContext.hasRoles()) return cellWithRole;
    }
    return myOperationContext.getComponent(EditorManager.class).doCreateRoleAttributeCell(attributeClass, cellWithRole, this, roleAttribute);
  }

  public List<SNode> getSelectedNodes() {
    return myNodeEditorComponent.getSelectedNodes();
  }

  private static class Memento {
    private AbstractEditorComponent myNodeEditor;
   // private Point selectionPosition;
    private CellInfo myCellInfo;
    private Stack<CellInfo> mySelectedStack = new Stack<CellInfo>();
    private List<CellInfo> myCollectionsWithEnabledBraces = new ArrayList<CellInfo>();
    private Set<CellInfo> myFolded = new HashSet<CellInfo>();
    private Integer myCaretX;

    public Memento(EditorContext context) {
      myNodeEditor = context.getNodeEditorComponent();
      EditorCell selectedCell = myNodeEditor.getSelectedCell();
      EditorCell deepestSelectedCell = myNodeEditor.getDeepestSelectedCell();
      if (selectedCell != null) {
    //    selectionPosition = new Point(selectedCell.getX(), selectedCell.getY());
        if (deepestSelectedCell != null) myCaretX = deepestSelectedCell.getCaretX();
        if (deepestSelectedCell instanceof EditorCell_Label && deepestSelectedCell.isErrorState()) {
        }
        myCellInfo = selectedCell.getCellInfo();
        mySelectedStack = myNodeEditor.getSelectedStackForMemento();

        for (EditorCell foldedCell : myNodeEditor.getFoldedCells()) {
          myFolded.add(foldedCell.getCellInfo());
        }
        for (EditorCell bracesEnabledCell : myNodeEditor.getBracesEnabledCells()) {
          myCollectionsWithEnabledBraces.add(bracesEnabledCell.getCellInfo());
        }
      }
    }

    public boolean equals(Object object) {
      if (object == this) return true;
      if (object.hashCode() == this.hashCode()) return true;
      if (object instanceof EditorContext) {
        return ((EditorContext) object).createMemento().equals(this);
      }
      return false;
    }

    public int hashCode() {
      return myNodeEditor.hashCode() +
              (myCellInfo != null ? myCellInfo.hashCode() : 0) +
              (myCaretX != null ? myCaretX.hashCode() : 0);
    }
  } // private static class Memento
}
