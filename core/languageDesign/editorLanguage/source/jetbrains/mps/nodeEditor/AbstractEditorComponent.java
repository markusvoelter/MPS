package jetbrains.mps.nodeEditor;

import com.intellij.openapi.actionSystem.DataProvider;
import jetbrains.mps.bootstrap.helgins.plugin.GoToTypeErrorRuleUtil;
import jetbrains.mps.bootstrap.helgins.plugin.GoToTypeErrorRule_Action;
import jetbrains.mps.helgins.inference.IErrorReporter;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.ide.EditorsPane;
import jetbrains.mps.ide.IDEProjectFrame;
import jetbrains.mps.ide.SystemInfo;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.action.*;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.nodes.GoByFirstReferenceAction;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.command.undo.UndoManager;
import jetbrains.mps.ide.findusages.view.UsagesView;
import jetbrains.mps.ide.findusages.view.UsagesViewTool;
import jetbrains.mps.ide.navigation.FocusPolicyUtil;
import jetbrains.mps.ide.navigation.HistoryItem;
import jetbrains.mps.ide.navigation.IHistoryItem;
import jetbrains.mps.ide.ui.CellSpeedSearch;
import jetbrains.mps.ide.ui.JMultiLineToolTip;
import jetbrains.mps.ide.ui.MPSErrorDialog;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.intentions.IntentionsManager;
import jetbrains.mps.intentions.IntentionsMenu;
import jetbrains.mps.intentions.LightBulbMenu;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.cellMenu.INodeSubstituteInfo;
import jetbrains.mps.nodeEditor.folding.CellAction_FoldAll;
import jetbrains.mps.nodeEditor.folding.CellAction_FoldCell;
import jetbrains.mps.nodeEditor.folding.CellAction_UnfoldAll;
import jetbrains.mps.nodeEditor.folding.CellAction_UnfoldCell;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.event.*;
import jetbrains.mps.util.*;
import jetbrains.mps.util.annotation.UseCarefully;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;


/**
 * Author: Sergey Dmitriev
 * Created Sep 14, 2003
 */
public abstract class AbstractEditorComponent extends JComponent implements Scrollable, IActionDataProvider, IEditorComponent, DataProvider {
  private static final Logger LOG = Logger.getLogger(AbstractEditorComponent.class);
  public static final String EDITOR_POPUP_MENU_ACTIONS = EditorPopup_ActionGroup.ID;
  public static final String EDITOR_POPUP_MENU_ACTIONS_INTERNAL = EditorInternal_ActionGroup.ID;
  private static final long INTENTION_SHOW_DELAY = 700;

  static void turnOnAliasingIfPossible(Graphics2D g) {
    if (EditorSettings.getInstance().isUseAntialiasing()) {
      g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
      g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    }
  }

  private Set<MPSAction> myMPSActionsWithShortcuts = new HashSet<MPSAction>();
  private WeakHashMap<EditorCell, Set<SNode>> myCellsToNodesToDependOnMap = new WeakHashMap<EditorCell, Set<SNode>>();

  private WeakHashMap<SNode, WeakReference<EditorCell>> myNodesToBigCellsMap = new WeakHashMap<SNode, WeakReference<EditorCell>>();
  private WeakHashMap<ReferencedNodeContext, WeakReference<EditorCell>> myRefNodeContextsToBigCellsMap = new WeakHashMap<ReferencedNodeContext, WeakReference<EditorCell>>();

  private WeakHashMap<EditorCell, Set<SNodePointer>> myCellsToRefTargetsToDependOnMap = new WeakHashMap<EditorCell, Set<SNodePointer>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell_Property>> myNodePropertiesAccessedCleanlyToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell_Property>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>> myNodePropertiesAccessedDirtilyToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>>();
  private HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>> myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap = new HashMap<Pair<SNodePointer, String>, WeakSet<EditorCell>>();

  private Set<EditorCell> myFoldedCells = new HashSet<EditorCell>();
  private Set<EditorCell> myBracesEnabledCells = new HashSet<EditorCell>();

  private IEditorMessageOwner myMessageOwner = new IEditorMessageOwner() {
  };

  private EditorSettingsListener mySettingsListener = new EditorSettingsListener() {
    public void settingsChanged() {
      rebuildEditorContent();
    }
  };

  private boolean myHasLastCaretX = false;
  private int myLastCaretX;
  private boolean myReadOnly = false;

  private JScrollPane myScrollPane;
  private JComponent myContainer;

  protected EditorCell myRootCell;
  protected EditorCell mySelectedCell;
  private static final int MIN_SHIFT_X = 30;
  private static final int ADDITIONAL_SHIFT_X = 10;
  private int myShiftX = MIN_SHIFT_X + ADDITIONAL_SHIFT_X;
  private int myShiftY = 10;

  private NodeRangeSelection myNodeRangeSelection;

  private Stack<EditorCell> mySelectedStack = new Stack<EditorCell>();
  private Stack<IKeyboardHandler> myKbdHandlersStack;
  private HashMap<String, EditorCellAction> myActionMap;

  private NodeSubstituteChooser myNodeSubstituteChooser;
  private HashMap myUserDataMap = new HashMap();

  private MyModelListener myModelListener = new MyModelListener();
  private MySimpleModelListener mySimpleModelListener = new MySimpleModelListener();
  private Set<SModelDescriptor> myModelDescriptorsWithListener = new HashSet<SModelDescriptor>();

  private List<ICellSelectionListener> mySelectionListeners = new LinkedList<ICellSelectionListener>();
  private PropertyChangeListener myFocusListener;
  private NodeHighlightManager myHighlightManager = new NodeHighlightManager(this);

  private IOperationContext myOperationContext;

  private MessagesGutter myMessagesGutter = new MessagesGutter(this);
  private LeftEditorHighlighter myLeftHighlighter;
  protected SNodePointer myNodePointer;
  private EditorContext myEditorContext;
  private List<RebuildListener> myRebuildListeners;
  private List<CellSynchronizationWithModelListener> myCellSynchronizationListeners = new ArrayList<CellSynchronizationWithModelListener>();
  private CellInfo myRecentlySelectedCellInfo = null;
  private final IEditorMessageOwner myOwner = new IEditorMessageOwner() {
  };

  private Map<KeyStroke, MPSActionProxy> myActionProxies = new HashMap<KeyStroke, MPSActionProxy>();
  private CellSpeedSearch myCellSpeedSearch;
  private AbstractAction myShowIntentionsAction;
  private Point myLightBulbLocation = new Point();
  private LightBulbMenu myLightBulb;
  private Thread myShowIntentionsThread = new Thread();

  public AbstractEditorComponent(IOperationContext operationContext) {
    this(operationContext, false);
  }

  public AbstractEditorComponent(final IOperationContext operationContext, boolean showErrorsGutter) {
    myOperationContext = operationContext;

    setBackground(Color.white);

    setFocusTraversalPolicyProvider(true);
    setFocusCycleRoot(true);
    setFocusTraversalPolicy(new FocusTraversalPolicy() {
      public Component getComponentAfter(Container aContainer, Component aComponent) {
        executeComponentAction(EditorCellAction.NEXT);
        return aContainer;
      }

      public Component getComponentBefore(Container aContainer, Component aComponent) {
        executeComponentAction(EditorCellAction.PREV);
        return aContainer;
      }

      public Component getFirstComponent(Container aContainer) {
        return aContainer;
      }

      public Component getLastComponent(Container aContainer) {
        return aContainer;
      }

      public Component getDefaultComponent(Container aContainer) {
        return aContainer;
      }
    });
    setFocusTraversalKeysEnabled(false);

    setDoubleBuffered(true);
    myScrollPane = new JScrollPane();
    myScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    myScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    myScrollPane.setViewportView(this);
    //    myScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    //    myScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    myContainer = new JPanel();
    myContainer.setMinimumSize(new Dimension(0, 0));
    myContainer.setLayout(new BorderLayout());
    myContainer.add(myScrollPane, BorderLayout.CENTER);

    myScrollPane.setBorder(new LineBorder(Color.LIGHT_GRAY));

    if (showErrorsGutter) {
      myContainer.add(myMessagesGutter, BorderLayout.EAST);
    }

    myNodeSubstituteChooser = new NodeSubstituteChooser(this);
    myNodeRangeSelection = new NodeRangeSelection(this);

    // --- keyboard handling ---
    myKbdHandlersStack = new Stack<IKeyboardHandler>();
    myKbdHandlersStack.push(new EditorComponentKeyboardHandler());

    // --- init action map --
    myActionMap = new HashMap<String, EditorCellAction>();
    // -- navigation
    myActionMap.put(EditorCellAction.LEFT, new NodeEditorActions.LEFT());
    myActionMap.put(EditorCellAction.RIGHT, new NodeEditorActions.RIGHT());
    myActionMap.put(EditorCellAction.UP, new NodeEditorActions.UP());
    myActionMap.put(EditorCellAction.DOWN, new NodeEditorActions.DOWN());
    myActionMap.put(EditorCellAction.NEXT, new NodeEditorActions.NEXT());
    myActionMap.put(EditorCellAction.PREV, new NodeEditorActions.PREV());
    myActionMap.put(EditorCellAction.LEFT_SPECIAL, new NodeEditorActions.LEFT());
    myActionMap.put(EditorCellAction.RIGHT_SPECIAL, new NodeEditorActions.RIGHT());
    myActionMap.put(EditorCellAction.UP_SPECIAL, new NodeEditorActions.UP_SPECIAL());
    myActionMap.put(EditorCellAction.DOWN_SPECIAL, new NodeEditorActions.DOWN_SPECIAL());
    myActionMap.put(EditorCellAction.CTRL_HOME, new NodeEditorActions.CTRL_HOME());
    myActionMap.put(EditorCellAction.CTRL_END, new NodeEditorActions.CTRL_END());
    myActionMap.put(EditorCellAction.HOME, new NodeEditorActions.HOME());
    myActionMap.put(EditorCellAction.END, new NodeEditorActions.END());
    myActionMap.put(EditorCellAction.PAGE_DOWN, new NodeEditorActions.PAGE_DOWN());
    myActionMap.put(EditorCellAction.PAGE_UP, new NodeEditorActions.PAGE_UP());
    // ----
    myActionMap.put(EditorCellAction.COPY, new CellAction_CopyNode());
    myActionMap.put(EditorCellAction.CUT, new CellAction_CutNode());
    myActionMap.put(EditorCellAction.PASTE, new CellAction_PasteNode());
    myActionMap.put(EditorCellAction.PASTE_BEFORE, new CellAction_PasteNodeRelative(true));
    myActionMap.put(EditorCellAction.PASTE_AFTER, new CellAction_PasteNodeRelative(false));
    // ----
    myActionMap.put(EditorCellAction.FOLD, new CellAction_FoldCell());
    myActionMap.put(EditorCellAction.UNFOLD, new CellAction_UnfoldCell());
    myActionMap.put(EditorCellAction.FOLD_ALL, new CellAction_FoldAll());
    myActionMap.put(EditorCellAction.UNFOLD_ALL, new CellAction_UnfoldAll());

    updateMPSActionsWithKeyStrokes();

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        EditorCell cell = getSelectedCell();
        if (cell == null) return;
        if (cell.getSNode() == null) return;
        Frame frame = (Frame) SwingUtilities.getRoot(AbstractEditorComponent.this);
        Point point = new Point(cell.getX() + cell.getWidth(), cell.getY());
        SwingUtilities.convertPointToScreen(point, AbstractEditorComponent.this);

        new NodeInformationDialog(frame, point, cell.getSNode()).setVisible(true);
      }
    }, KeyStroke.getKeyStroke("control Q"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        if (!getHighlightManager().clearForOwner(myOwner)) {
          onEscape();
        }
      }
    }, KeyStroke.getKeyStroke("ESCAPE"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        moveCurrentUp();
      }
    }, KeyStroke.getKeyStroke("alt UP"), WHEN_FOCUSED);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        moveCurrentDown();
      }
    }, KeyStroke.getKeyStroke("alt DOWN"), WHEN_FOCUSED);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextErrorCell(false);
      }
    }, KeyStroke.getKeyStroke("F2"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextErrorCell(true);
      }
    }, KeyStroke.getKeyStroke("shift F2"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextHighlightedCell(false);
      }
    }, KeyStroke.getKeyStroke("F3"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        goToNextHighlightedCell(true);
      }
    }, KeyStroke.getKeyStroke("shift F3"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        EditorCell cell = getSelectedCell();
        if (cell == null) return;
        showPopupMenu(cell.getX(), cell.getY());
      }
    }, KeyStroke.getKeyStroke("CONTEXT_MENU"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        UsagesViewTool usagesViewTool = operationContext.getProject().getComponent(UsagesViewTool.class);
        assert usagesViewTool != null;
        UsagesView usagesView = usagesViewTool.getCurrentView();
        if (usagesView != null) usagesView.goToPrevious();
      }
    }, KeyStroke.getKeyStroke("control alt UP"), WHEN_FOCUSED);

    registerKeyboardAction(new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        UsagesViewTool usagesViewTool = operationContext.getProject().getComponent(UsagesViewTool.class);
        assert usagesViewTool != null;
        UsagesView usagesView = usagesViewTool.getCurrentView();
        if (usagesView != null) usagesView.goToNext();
      }
    }, KeyStroke.getKeyStroke("control alt DOWN"), WHEN_FOCUSED);

    myLightBulb = new LightBulbMenu() {
      public void activate() {
        showIntentionsMenu();
      }
    };

    myScrollPane.getViewport().addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        adjustLightBulbLocation();
      }
    });

    myShowIntentionsAction = new AbstractAction() {
      public void actionPerformed(ActionEvent e) {
        //setEnabled(false);
        CommandProcessor.instance().executeLightweightCommand(new Runnable() {
          public void run() {
            if (!getEditedNode().getModel().isNotEditable()) {
              showIntentionsMenu();
            }
          }
        });
      }
    };
    registerKeyboardAction(myShowIntentionsAction, KeyStroke.getKeyStroke("alt ENTER"), WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    addMouseListener(new MouseAdapter() {
      public void mousePressed(final MouseEvent e) {
        if (e.isPopupTrigger()) {
          processPopupMenu(e);
        } else {
          processMousePressed(e);
        }
      }

      public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
          processPopupMenu(e);
        }
        super.mouseReleased(e);
      }
    });

    myCellSpeedSearch = new CellSpeedSearch(this);
    addKeyListener(new KeyAdapter() {
      public void keyPressed(final KeyEvent e) {
        processKeyPressed(e);
      }

      public void keyReleased(final KeyEvent e) {
        processKeyReleased(e);
      }
    });

    myRebuildListeners = new ArrayList<RebuildListener>();
    myLeftHighlighter = new LeftEditorHighlighter(this);

    addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        EditorCell selectedCell = getSelectedCell();
        if (selectedCell == null) {
          EditorCell rootCell = getRootCell();
          if (rootCell instanceof EditorCell_Collection) {
            EditorCell focusPolicyCell = FocusPolicyUtil.findCellToSelectDueToFocusPolicy(rootCell);
            EditorCell toSelect;
            if (focusPolicyCell == null || (focusPolicyCell == rootCell && !focusPolicyCell.hasFocusPolicy())) {
              toSelect = EditorUtil.findFirstEditableCell(rootCell);
            } else {
              toSelect = focusPolicyCell;
            }
            if (toSelect == null) toSelect = rootCell;
            changeSelection(toSelect);
            repaint();
            return;
          }
          if (rootCell != null && rootCell.isSelectable()) {
            changeSelection(rootCell);
          }
        }
        repaint();
      }

      public void focusLost(FocusEvent e) {
        repaint();
        if (myNodeSubstituteChooser.getWindow() != null &&
          (myNodeSubstituteChooser.getWindow().isAncestorOf(e.getOppositeComponent()) || myNodeSubstituteChooser.getWindow() == e.getOppositeComponent()))
          return;
        myNodeSubstituteChooser.setVisible(false);
      }
    });

    addCellSelectionListener(new ICellSelectionListener() {
      public void selectionChanged(AbstractEditorComponent editor, EditorCell oldSelection, EditorCell newSelection) {
        myShowIntentionsThread.interrupt();

        hideLightBulb();
        myShowIntentionsAction.setEnabled(false);

        myShowIntentionsThread = new Thread("Intentions") {
          public void run() {
            try {
              final boolean[] enabledPresent = new boolean[1];
              final boolean[] availablePresent = new boolean[1];
              CommandProcessor.instance().executeLightweightCommand(new Runnable() {
                public void run() {
                  enabledPresent[0] = !getEnabledIntentions().isEmpty();
                  availablePresent[0] = !getAvailableIntentions().isEmpty();
                }
              });

              CommandProcessor.instance().executeLightweightCommandInEDT(new Runnable() {
                public void run() {
                  if (getSelectedCell() != null) {
                    adjustLightBulbLocation();
                    myShowIntentionsAction.setEnabled(availablePresent[0]);
                  } else {
                    myShowIntentionsAction.setEnabled(false);
                  }
                }
              });

              Thread.sleep(INTENTION_SHOW_DELAY);

              CommandProcessor.instance().executeLightweightCommandInEDT(new Runnable() {
                public void run() {
                  if (getSelectedCell() != null) {
                    setLightBulbVisibility(enabledPresent[0]);
                  } else {
                    hideLightBulb();
                  }
                }
              });
            } catch (InterruptedException e) {

            }
          }
        };
        myShowIntentionsThread.start();
      }
    });

    ToolTipManager.sharedInstance().registerComponent(this);
    CaretBlinker.getInstance().registerEditor(this);
    addRebuildListener(UndoManager.instance().rebuildListener());
  }

  protected void onEscape() {
  }

  public SNode getSelectedNode() {
    if (getSelectedCell() == null) {
      return null;
    }
    return getSelectedCell().getSNode();
  }


  public List<SNode> getSelectedNodes() {
    return CommandProcessor.instance().executeLightweightCommand(new Calculable<List<SNode>>() {
      public List<SNode> calculate() {
        if (getNodeRangeSelection().isActive()) {
          return getNodeRangeSelection().getNodes();
        } else {
          List<SNode> result = new ArrayList<SNode>();
          if (getSelectedNode() != null) {
            result.add(getSelectedNode());
          }
          return result;
        }
      }
    });
  }

  private Set<Intention> getAvailableIntentions() {
    final Set<Intention> result = new LinkedHashSet<Intention>();
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        SNode node = getSelectedNode();
        EditorContext editorContext = getEditorContext();
        if (node != null && editorContext != null) {
          result.addAll(IntentionsManager.getInstance().getAvailableIntentions(node, editorContext));
        }
      }
    });
    return result;
  }

  private Set<Intention> getEnabledIntentions() {
    final Set<Intention> result = new LinkedHashSet<Intention>();
    SNode node = getSelectedNode();
    EditorContext editorContext = getEditorContext();
    if (node != null && editorContext != null) {
      result.addAll(IntentionsManager.getInstance().getEnabledAvailableIntentions(node, editorContext));
    }
    return result;
  }

  private void updateMPSActionsWithKeyStrokes() {
    updateMPSActionsWithKeyStrokes(null);
  }

  private void updateMPSActionsWithKeyStrokes(@Nullable ActionContext actionContext) {
    myActionProxies.clear();
    for (MPSAction a : myMPSActionsWithShortcuts) {
      KeyStroke keyStroke = KeyStroke.getKeyStroke(a.getKeyStroke());
      if (keyStroke != null) {
        unregisterKeyboardAction(keyStroke);
      }
    }
    myMPSActionsWithShortcuts.clear();
    ActionGroup group = ActionManager.instance().getGroup(EDITOR_POPUP_MENU_ACTIONS);
    registerKeyStrokes(group, actionContext);
  }

  public IEditorMessageOwner getHighlightMessagesOwner() {
    return myOwner;
  }

  private void registerKeyStrokes(ActionGroup group, @Nullable ActionContext actionContext) {
    if (group != null) {
      for (ActionGroupElement e : group.getElements()) {
        if (e instanceof MPSAction) {
          MPSAction action = (MPSAction) e;
          if (action.hasKeystroke()) {
            registerNodeAction(action);
            myMPSActionsWithShortcuts.add(action);
          }
        }
        if (e instanceof ActionGroup) {
          try {
            if (actionContext != null) {
              e.update(actionContext);
            }
            registerKeyStrokes((ActionGroup) e, actionContext);
          } catch (Throwable t) {
            LOG.error(t);
          }
        }

        if (e instanceof GroupToElementsAdapter) {
          GroupToElementsAdapter adapter = (GroupToElementsAdapter) e;
          registerKeyStrokes(adapter.getGroup(), actionContext);
        }
      }
    }
  }

  private void moveCurrentUp() {
    new IntelligentNodeMover(getEditorContext(), getSelectedNodes(), false).move();
  }

  private void moveCurrentDown() {
    new IntelligentNodeMover(getEditorContext(), getSelectedNodes(), true).move();
  }

  private void goToNextErrorCell(boolean backwards) {
    new CellNavigator(this) {
      boolean isSuitableCell(EditorCell cell) {
        if (cell.hasErrorMessages()) {
          return true;
        }
        return false;

      }
    }.goToNextCell(backwards);
  }

  private void goToNextHighlightedCell(boolean backwards) {
    new CellNavigator(this) {
      boolean isSuitableCell(EditorCell cell) {
        for (IEditorMessage m : getHighlightManager().getMessagesFor(cell.getSNode())) {
          if (m.getOwner() == getHighlightMessagesOwner()) {
            return true;
          }
        }
        return false;
      }
    }.goToNextCell(backwards);
  }

  public SNode getEditedNode() {
    if (myNodePointer != null) {
      return myNodePointer.getNode();
    }
    return null;
  }

  public SNodePointer getEditedNodePointer() {
    return myNodePointer;
  }

  public String getToolTipText(final MouseEvent event) {
    return CommandProcessor.instance().tryToExecuteLightweightCommand(new Calculable<String>() {
      public String calculate() {
        EditorCell cell = myRootCell.findCell(event.getX(), event.getY());
        if (cell == null) {
          return null;
        }
        SNode node = cell.getSNode();
        while (node != null) {
          final IErrorReporter herror = TypeChecker.getInstance().getTypeErrorDontCheck(node);
          if (herror != null) {
            return herror.reportError();
          }
          node = node.getParent();
        }

        return null;
      }
    });
  }

  public void showMessageTooltip() {
    try {
      //todo this is a hack but I don't know other way to show tooltip programatically
      //probably we should create our own tooltip facility instead
      EditorCell cell = getSelectedCell();
      if (cell == null) {
        return;
      }

      ToolTipManager toolTipManager = ToolTipManager.sharedInstance();

      Field showImmediatelyField = toolTipManager.getClass().getDeclaredField("showImmediately");
      showImmediatelyField.setAccessible(true);
      showImmediatelyField.set(toolTipManager, true);

      toolTipManager.mouseMoved(new MouseEvent(
        this,
        Event.MOUSE_MOVE, 0, 0,
        cell.getX(), cell.getY(), 0, false));
    } catch (Exception e) {
      LOG.error(e);
    }
  }

  public void hideMessageToolTip() {
    try {
      //todo this is a hack but I don't know other way to show tooltip programatically
      ToolTipManager toolTipManager = ToolTipManager.sharedInstance();
      toolTipManager.mousePressed(new MouseEvent(
        this,
        Event.MOUSE_MOVE, 0, 0,
        0, 0, 0, false));
    } catch (Exception e) {
      LOG.error(e);
    }

  }

  public void editNode(SNode node, IOperationContext operationContext) {
    if (operationContext == null) {
      LOG.errorWithTrace("Opening editor with null context");
    }
    setOperationContext(operationContext);
    editNode(node);
  }

  protected void editNode(final SNode node) {
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        IOperationContext operationContext = getOperationContext();
        myNodePointer = new SNodePointer(node);
        SModel model = node == null ? null : node.getModel();
        setEditorContext(new EditorContext(AbstractEditorComponent.this, model, operationContext));
        rebuildEditorContent();
      }
    });
  }

  public MessagesGutter getMessagesGutter() {
    return myMessagesGutter;
  }

  public LeftEditorHighlighter getLeftEditorHighlighter() {
    return myLeftHighlighter;
  }

  public void updateMessages() {
    myRootCell.updateMessages();
    getExternalComponent().repaint();
  }

  public JToolTip createToolTip() {
    JMultiLineToolTip toolTip = new JMultiLineToolTip();
    toolTip.setFont(new TextLine("aaa", this).getFont());
    return toolTip;
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public void setOperationContext(IOperationContext operationContext) {
    myOperationContext = operationContext;
  }

  public void addNotify() {
    super.addNotify();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addPropertyChangeListener("focusOwner", myFocusListener = new PropertyChangeListener() {
      public void propertyChange(PropertyChangeEvent evt) {
        Component focusOwner = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (AbstractEditorComponent.this.isAncestorOf(focusOwner)) {
          Component current = focusOwner;
          while (current.getParent() != AbstractEditorComponent.this) {
            current = current.getParent();
          }
          selectComponentCell(current);
        }
      }
    });
    EditorSettings.getInstance().addEditorSettingsListener(mySettingsListener);
  }

  public void removeNotify() {
    EditorSettings.getInstance().removeEditorSettingsListener(mySettingsListener);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().removePropertyChangeListener("focusOwner", myFocusListener);
    myHighlightManager.dispose();
    super.removeNotify();
  }

  protected void registerNodeAction(MPSAction action) {
    for (String keyStroke : action.getKeyStrokes()) {
      registerNodeAction(action, keyStroke);
    }
  }

  protected AbstractAction registerNodeAction(final MPSAction action, String keyStroke) {
    KeyStroke stroke = KeyStroke.getKeyStroke(keyStroke);
    if (stroke != null) {
      if (!myActionProxies.containsKey(stroke)) {
        AbstractEditorComponent.MPSActionProxy proxy = new MPSActionProxy();
        myActionProxies.put(stroke, proxy);
        registerKeyboardAction(proxy, stroke, WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
      }
      AbstractEditorComponent.MPSActionProxy proxy = myActionProxies.get(stroke);
      proxy.add(action);
      return proxy;
    }
    return null;
  }

  private EditorCell_Component findCellForComponent(Component component, EditorCell root) {
    if (root instanceof EditorCell_Component && ((EditorCell_Component) root).getComponent() == component) {
      return (EditorCell_Component) root;
    }

    if (root instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) root;
      for (EditorCell cell : collection) {
        EditorCell_Component result = findCellForComponent(component, cell);
        if (result != null) return result;
      }
    }

    return null;
  }

  private void processPopupMenu(final MouseEvent e) {
    EditorCell selectedCell = getSelectedCell();
    if (selectedCell != null) {
      CommandProcessor.instance().executeLightweightCommand(new Runnable() {
        public void run() {
          showPopupMenu(e);
        }
      });
    }
  }

  private void showPopupMenu(MouseEvent e) {
    showPopupMenu(e.getX(), e.getY());
  }

  private void showPopupMenu(int x, int y) {
    ActionGroup group = ActionManager.instance().getGroup(EDITOR_POPUP_MENU_ACTIONS);
    if (group == null) return;

    ActionContext context = createActionContext();

    if (context == null) return;
    JPopupMenu popupMenu = new JPopupMenu();
    group.add(popupMenu, context);

    EditorCell cell = getSelectedCell();
    { // keymaps
      final EditorContext editorContext = createEditorContextForActions();
      List<EditorCellKeyMapAction> actions = new ArrayList<EditorCellKeyMapAction>();
      for (EditorCellKeyMapAction action : KeyMapUtil.getRegisteredActions(cell, editorContext)) {
        try {
          if (action.isShownInPopupMenu() && action.canExecute(null, editorContext)) {
            actions.add(action);
          }
        } catch (Throwable t) {
          LOG.error(t);
        }
      }
      if (!actions.isEmpty()) popupMenu.addSeparator();

      JMenu keyMapActions = new JMenu("KeyMap Actions");
      keyMapActions.setBorder(null);
      keyMapActions.setIcon(MPSAction.EMPTY_ICON);

      for (final EditorCellKeyMapAction action : actions) {
        MPSAction mpsAction = new MPSAction("" + action.getDescriptionText()) {
          private EditorCellKeyMapAction myAction = action;

          @NotNull
          public String getKeyStroke() {
            return action.getKeyStroke();
          }

          public void doExecute(@NotNull ActionContext context) {
            myAction.execute(null, editorContext);
          }
        };
        mpsAction.add(keyMapActions, context);
      }

      popupMenu.add(keyMapActions);
    } // ~keymaps

    popupMenu.show(AbstractEditorComponent.this, x, y);
  }

  private ActionContext createActionContext() {
    return CommandProcessor.instance().executeLightweightCommand(new Calculable<ActionContext>() {
      public ActionContext calculate() {
        ActionContext context = new ActionContext(getOperationContext());
        EditorCell cell_ = getSelectedCell();
        if (cell_ != null) {
          final SNode selectedNode = cell_.getSNode();
          if (selectedNode != null) {
            EditorContext editorContext_ = createEditorContextForActions();
            List<SNode> selectedNodes = myNodeRangeSelection.getNodes();
            if (selectedNodes.size() == 0) {
              selectedNodes.add(selectedNode);
            }
            context.put(SNode.class, selectedNode);
            context.put(List.class, selectedNodes);
            context.put(EditorContext.class, editorContext_);
            context.put(EditorCell.class, cell_);
          }
        }
        return context;
      }
    });
  }

  private EditorContext createEditorContextForActions() {
    final EditorContext editorContext = new EditorContext(this, null, getOperationContext());
    return editorContext;
  }

  private void selectComponentCell(Component component) {
    EditorCell_Component cell = findCellForComponent(component, myRootCell);
    if (cell == null) return;
    changeSelection(cell);
  }

  public JComponent getExternalComponent() {
    return myContainer;
  }

  public EditorContext getEditorContext() {
    return myEditorContext;
  }

  public abstract EditorCell createRootCell();

  public void setFolded(EditorCell cell, boolean folded) {
    if (folded) {
      myFoldedCells.add(cell);
    } else {
      myFoldedCells.remove(cell);
    }
  }

  public Set<EditorCell> getFoldedCells() {
    return new HashSet<EditorCell>(myFoldedCells);
  }

  public void setBracesEnabled(EditorCell cell, boolean enabled) {
    if (enabled) {
      myBracesEnabledCells.add(cell);
    } else {
      myBracesEnabledCells.remove(cell);
    }
  }

  public Set<EditorCell> getBracesEnabledCells() {
    return new HashSet<EditorCell>(myBracesEnabledCells);
  }

  public void dispose() {
    removeOurListener();
    clearCaches();

    setEditorContext(null);

    if (myNodeSubstituteChooser != null) {
      myNodeSubstituteChooser.dispose();
    }
  }

  private void addOurListener(SModelDescriptor sm) {
    if (sm.hasSModelCommandListener(myModelListener)) return;
    sm.addModelCommandListener(myModelListener);
    sm.addModelListener(mySimpleModelListener);
    myModelDescriptorsWithListener.add(sm);
  }

  private void removeOurListener() {
    for (SModelDescriptor sm : myModelDescriptorsWithListener) {
      sm.removeModelCommandListener(myModelListener);
      sm.removeModelListener(mySimpleModelListener);
    }
    myModelDescriptorsWithListener.clear();
  }

  private void clearCaches() {
    myCellsToNodesToDependOnMap.clear();
    myCellsToRefTargetsToDependOnMap.clear();
    myNodesToBigCellsMap.clear();
    myRefNodeContextsToBigCellsMap.clear();
    myNodePropertiesAccessedCleanlyToDependentCellsMap.clear();
    myNodePropertiesAccessedDirtilyToDependentCellsMap.clear();
    myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.clear();
  }

  private void setRootCell(EditorCell rootCell) {
    removeOurListener();

    myRootCell = rootCell;
    doRelayout(false);

    Set<SNode> nodesWhichEditorDependsOn = myCellsToNodesToDependOnMap.get(myRootCell);
    if (nodesWhichEditorDependsOn != null) {
      for (SNode node : nodesWhichEditorDependsOn) {
        SModelDescriptor modelDescriptor = node.getModel().getModelDescriptor();
        if (modelDescriptor != null) {
          addOurListener(modelDescriptor);
        }
      }
    }

    Set<SNodePointer> refTargetsWhichEditorDependsOn = myCellsToRefTargetsToDependOnMap.get(myRootCell);
    if (refTargetsWhichEditorDependsOn != null) {
      Set<SNodePointer> nodeProxiesToDelete = new HashSet<SNodePointer>();
      for (SNodePointer nodeProxy : refTargetsWhichEditorDependsOn) {
        SModelDescriptor model = nodeProxy.getModel();
        if (model == null) {
          nodeProxiesToDelete.add(nodeProxy);
          continue;
        }
        addOurListener(model);
      }
      refTargetsWhichEditorDependsOn.removeAll(nodeProxiesToDelete);
    }


    revalidate();
    repaint();
  }

  public EditorCell getRootCell() {
    return myRootCell;
  }

  public NodeHighlightManager getHighlightManager() {
    return myHighlightManager;
  }

  public String getActionType(KeyEvent keyEvent, EditorContext editorContext) {
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && keyEvent.getModifiers() == 0) {
      return EditorCellAction.LEFT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && keyEvent.getModifiers() == 0) {
      return EditorCellAction.RIGHT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_UP && keyEvent.getModifiers() == 0) {
      return EditorCellAction.UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN && keyEvent.getModifiers() == 0) {
      return EditorCellAction.DOWN;
    }
    if (!SystemInfo.isMac && keyEvent.getKeyCode() == KeyEvent.VK_INSERT && keyEvent.getModifiers() == 0) {
      return EditorCellAction.INSERT_BEFORE;
    }
    if (SystemInfo.isMac && keyEvent.getKeyCode() == KeyEvent.VK_ENTER && keyEvent.getModifiers() == KeyEvent.SHIFT_MASK) {
      return EditorCellAction.INSERT_BEFORE;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.INSERT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.LEFT_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.RIGHT_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_UP && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.UP_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_W && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.UP_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.DOWN_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_W && keyEvent.isControlDown() && keyEvent.isShiftDown() && !keyEvent.isAltDown()) {
      return EditorCellAction.DOWN_SPECIAL;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_HOME && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.CTRL_HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_END && keyEvent.isControlDown() && !(keyEvent.isShiftDown() || keyEvent.isAltDown())) {
      return EditorCellAction.CTRL_END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_HOME && keyEvent.getModifiers() == 0) {
      return EditorCellAction.HOME;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_END && keyEvent.getModifiers() == 0) {
      return EditorCellAction.END;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_PAGE_DOWN && keyEvent.getModifiers() == 0) {
      return EditorCellAction.PAGE_DOWN;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_PAGE_UP && keyEvent.getModifiers() == 0) {
      return EditorCellAction.PAGE_UP;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_TAB && keyEvent.getModifiers() == 0) {
      return EditorCellAction.NEXT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_TAB && keyEvent.isShiftDown() && !(keyEvent.isControlDown() || keyEvent.isAltDown())) {
      return EditorCellAction.PREV;
    }

    // ---
    if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE && keyEvent.getModifiers() == 0) {
      EditorCell selectedCell = editorContext.getNodeEditorComponent().getSelectedCell();
      if (!(selectedCell instanceof EditorCell_Label)) {
        return EditorCellAction.RIGHT_TRANSFORM;
      }
      EditorCell_Label labelCell = (EditorCell_Label) selectedCell;
      if (!labelCell.isEditable()) {
        return EditorCellAction.RIGHT_TRANSFORM;
      }

      // caret at the end of text ?
      String text = labelCell.getText();
      int caretPosition = labelCell.getTextLine().getCaretPosition();
      //System.out.println("text:" + text + " len:" + text.length() + "caret at:" + caretPosition);
      if (caretPosition == text.length()) {
        return EditorCellAction.RIGHT_TRANSFORM;
      }
    }


    if (keyEvent.getKeyCode() == KeyEvent.VK_DELETE && keyEvent.isControlDown()) {
      return EditorCellAction.DELETE;
    }

    if ((keyEvent.getKeyCode() == KeyEvent.VK_DELETE || keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE)
      && keyEvent.getModifiers() == 0) {
      // editable label and no text
      EditorCell selectedCell = editorContext.getNodeEditorComponent().getSelectedCell();
      if (selectedCell instanceof EditorCell_Label) {
        if (((EditorCell_Label) selectedCell).getText().length() == 0) {
          return EditorCellAction.DELETE;
        }
      }
    }

    if (keyEvent.getKeyCode() == KeyEvent.VK_ADD && keyEvent.isControlDown()) {
      if (keyEvent.isShiftDown()) {
        return EditorCellAction.UNFOLD_ALL;
      } else {
        return EditorCellAction.UNFOLD;
      }
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_SUBTRACT && keyEvent.isControlDown()) {
      if (keyEvent.isShiftDown()) {
        return EditorCellAction.FOLD_ALL;
      } else {
        return EditorCellAction.FOLD;
      }
    }

    // ---
    if (keyEvent.getKeyCode() == KeyEvent.VK_C && keyEvent.isControlDown() && !keyEvent.isShiftDown()) {
      return EditorCellAction.COPY;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_X && keyEvent.isControlDown()) {
      return EditorCellAction.CUT;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_V && keyEvent.isControlDown()) {
      if (keyEvent.isShiftDown() && !keyEvent.isAltDown()) {
        return EditorCellAction.PASTE_BEFORE;
      } else if (!keyEvent.isShiftDown() && keyEvent.isAltDown()) {
        return EditorCellAction.PASTE_AFTER;
      }
      return EditorCellAction.PASTE;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_INSERT && keyEvent.isControlDown()) {
      return EditorCellAction.COPY;
    }
    if (keyEvent.getKeyCode() == KeyEvent.VK_INSERT && keyEvent.isShiftDown()) {
      return EditorCellAction.PASTE;
    }


    return null;
  }

  boolean executeComponentAction(String actionType) {
    if (actionType == null) {
      return false;
    }
    EditorCellAction action = myActionMap.get(actionType);
    if (action != null && action.canExecute(getEditorContext())) {
      action.execute(getEditorContext());
      return true;
    }
    return false;
  }

  public void relayout() {
    doRelayout(true);
    revalidate();
    repaint();
    myMessagesGutter.repaint();
  }

  public void revalidateAndRepaint(boolean updateFolding) {
    myLeftHighlighter.relayout(updateFolding);
    repaint();
  }

  private void doRelayout(boolean updateFolding) {
    myRootCell.setX(myShiftX);
    myRootCell.setY(myShiftY);
    myRootCell.relayout();
    myLeftHighlighter.setWidth(myShiftX - ADDITIONAL_SHIFT_X);
    myLeftHighlighter.relayout(updateFolding);
  }


  public void leftHighlightCell(EditorCell cell, Color c) {
    myLeftHighlighter.highlight(cell, c);
  }

  public void leftUnhighlightCell(EditorCell cell) {
    myLeftHighlighter.unHighlight(cell);
  }

  public void selectNode(final SNode node) {
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        EditorCell nodeCell = findNodeCell(node);
        if (nodeCell != null) {
          changeSelection(nodeCell);
        }
      }
    });
  }


  public void selectRefCell(SReference reference) {
    SNode sourceNode = reference.getSourceNode();
    String role = reference.getRole();
    EditorCell cell;
    if (role == null) cell = findNodeCell(sourceNode);
    else {
      cell = findNodeCellWithRole(sourceNode, role);
      if (cell == null) cell = findNodeCell(sourceNode);
    }
    if (cell == null) {
      return;
    }
    changeSelectionWRTFocusPolicy(cell);
  }

  public void selectFirstEditableCellOf(final SNode node) {
    EditorCell cell = findNodeCell(node);
    EditorCell editable = EditorUtil.findEditableCell(cell);
    if (editable == null) {
      changeSelection(cell);
    } else {
      changeSelection(editable);
    }
  }

  public EditorCell findNodeCell(SNode node) {
    return findNodeCell(node, false);
  }

  public EditorCell findNodeCell(final SNode node, boolean biggest) {
    if (myRootCell == null) return null;
    if (myRootCell.getSNode() == node) {
      return myRootCell;
    }
    if (node == null || !(myRootCell instanceof EditorCell_Collection)) {
      return null;
    }
    if (!biggest) {
      WeakReference<EditorCell> weakReference = myRefNodeContextsToBigCellsMap.get(ReferencedNodeContext.createNodeContext(node));
      EditorCell foundCell = null;
      if (weakReference != null) {
        foundCell = weakReference.get();
      }
      if (foundCell != null) return foundCell;
    }
    EditorCell_Collection cellCollection = (EditorCell_Collection) myRootCell;
    class SelectNodeCondition extends NodeCondition {
      public void checkLeafCell(EditorCell editorCell) {
        checkNotLeafCell(editorCell);
      }

      public boolean checkNotLeafCell(EditorCell editorCell) {
        if (editorCell.getSNode() == node) {
          setFoundCell(editorCell);
          setToStop(true);
        }
        return true;
      }
    }
    SelectNodeCondition condition = new SelectNodeCondition();
    cellCollection.iterateTreeUntilCondition(condition, true);
    return condition.getFoundCell();
  }

  public EditorCell findNodeCell(final SNode node, String id) {
    EditorCell rootCell = findNodeCell(node);
    if (rootCell == null) return null;
    return findCellWithId(rootCell, id);
  }

  public EditorCell findNodeCellWithRole(SNode node, String role) {
    EditorCell rootCell = findNodeCell(node);
    if (rootCell == null) return null;
    return findNodeCellWithRole(rootCell, role, node);
  }

  private EditorCell findNodeCellWithRole(EditorCell rootCell, String role, SNode node) {
    if (role == null) return null;
    if (role.equals(EditorUtil.getCellRole(rootCell)) && node == rootCell.getSNode()) {
      return rootCell;
    }
    if (rootCell instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) rootCell;
      for (EditorCell child : collection) {
        EditorCell result = findNodeCellWithRole(child, role, node);
        if (result != null) return result;
      }
    }
    return null;
  }

  public EditorCell findNodeCell(final SNode node, String id, int number) {
    EditorCell rootCell = findNodeCell(node);
    if (rootCell == null) return null;
    return findCellWithIdAndNumber(rootCell, id, number);
  }

  public EditorCell findCellWithId(final EditorCell root, String id) {
    if (id == null) return null;
    if (id.equals(root.getUserObject(EditorCell.CELL_ID))) return root;
    if (root instanceof EditorCell_Collection) {
      return findCellWithIdInCollection((EditorCell_Collection) root, id);
    }
    return null;
  }

  public EditorCell findCellWithId(String id, SNode node) {
    EditorCell bigCell = getBigCellForNode(node);

    if (bigCell == null) {
      return null;
    }

    return findCellWithIdWithingBigCell(bigCell, id, node);
  }

  private EditorCell findCellWithIdWithingBigCell(EditorCell root, String id, SNode node) {
    if (id == null) {
      return null;
    }

    if (id.equals(root.getUserObject(EditorCell.CELL_ID))) {
      return root;
    }

    if (root instanceof EditorCell_Collection) {
      for (EditorCell child : ((EditorCell_Collection) root)) {
        if (child.getSNode() == node) {
          EditorCell result = findCellWithIdWithingBigCell(child, id, node);
          if (result != null) {
            return result;
          }
        }
      }
    }

    return null;
  }

  public EditorCell findCellWithIdInCollection(EditorCell_Collection collection, String id) {
    if (collection != null) {
      for (EditorCell child : collection) {
        EditorCell result = findCellWithId(child, id);
        if (result != null) return result;
      }
    }
    return null;
  }

  private EditorCell findCellWithIdAndNumber(final EditorCell root, String id, int number) {
    if (id == null) return null;
    if (id.equals(root.getUserObject(EditorCell.CELL_ID)) && ((Integer) number).equals(root.getUserObject(EditorCell.NUMBER)))
      return root;
    if (root instanceof EditorCell_Collection) {
      EditorCell_Collection collection = (EditorCell_Collection) root;
      for (EditorCell child : collection) {
        EditorCell result = findCellWithIdAndNumber(child, id, number);
        if (result != null) return result;
      }
    }
    return null;
  }

  public EditorCell findFirstSelectableCell() {
    return EditorUtil.findFirstSelectableCell(myRootCell);
  }

  public EditorCell findLastSelectableCell() {
    return EditorUtil.findLastSelectableCell(myRootCell);
  }

  public EditorCell findNextSelectableCell(final EditorCell cell) {
    return findNextSelectableOrEditableCell(cell, false);
  }

  public EditorCell findNextSelectableOrEditableCell(final EditorCell cell, final boolean editable) {
    return findNextCellWhichMeetsCondition(cell, new Condition<EditorCell>() {
      public boolean met(EditorCell editorCell) {
        if (editable) {
          return editorCell instanceof EditorCell_Label && ((EditorCell_Label) editorCell).isEditable();
        } else {
          return true;
        }
      }
    });
  }

  public EditorCell findNextCellWhichMeetsCondition(final EditorCell cell, final Condition<EditorCell> condition) {
    if (!(myRootCell instanceof EditorCell_Collection)) {
      return null;
    }
    EditorCell_Collection cellCollection = (EditorCell_Collection) myRootCell;
    class SelectNodeCondition extends NodeCondition {
      private boolean myToStart = false;

      public boolean checkNotLeafCell(EditorCell editorCell) {
        if (editorCell == cell) {
          myToStart = true;
          return false;
        }
        if (myToStart && editorCell.isSelectable() && condition.met(editorCell)) {
          setFoundCell(editorCell);
          setToStop(true);
        }
        return true;
      }

      public void checkLeafCell(EditorCell editorCell) {
        if (editorCell == cell) {
          myToStart = true;
          return;
        }

        if (myToStart && editorCell.isSelectable() && condition.met(editorCell)) {
          setFoundCell(editorCell);
          setToStop(true);
        }
      }
    }
    SelectNodeCondition selectNodeCondition = new SelectNodeCondition();
    cellCollection.iterateTreeUntilCondition(selectNodeCondition);
    return selectNodeCondition.getFoundCell();
  }

  public EditorCell findPrevSelectableCell(final EditorCell cell) {
    return findPrevSelectableOrEditableCell(cell, false);
  }

  public EditorCell findPrevSelectableOrEditableCell(final EditorCell cell, final boolean editable) {
    return findPrevCellWhichMeetsCondition(cell, new Condition<EditorCell>() {
      public boolean met(EditorCell editorCell) {
        if (editable) {
          return editorCell instanceof EditorCell_Label && ((EditorCell_Label) editorCell).isEditable();
        } else {
          return true;
        }
      }
    });
  }

  public EditorCell findPrevCellWhichMeetsCondition(final EditorCell cell, final Condition<EditorCell> editorCellCondition) {
    if (!(myRootCell instanceof EditorCell_Collection)) {
      return null;
    }
    EditorCell_Collection cellCollection = (EditorCell_Collection) myRootCell;
    class SelectNodeCondition extends NodeCondition {
      public boolean checkNotLeafCell(EditorCell editorCell) {
        boolean goodCell = editorCellCondition.met(editorCell);
        if (editorCell == cell) {
          setToStop(true);
        } else if (goodCell && editorCell.isSelectable() /*&& editorCell.getParent() == cell.getParent()*/) {
          setFoundCell(editorCell);
        }
        return true;
      }

      public void checkLeafCell(EditorCell editorCell) {
        boolean goodCell = editorCellCondition.met(editorCell);
        if (editorCell == cell) {
          setToStop(true);
        } else if (goodCell && editorCell.isSelectable()) {
          setFoundCell(editorCell);
        }
      }
    }
    SelectNodeCondition condition = new SelectNodeCondition();
    cellCollection.iterateTreeUntilCondition(condition);
    return condition.getFoundCell();
  }

  public void rebuildEditorContent() {
    clearCaches();
    clearUserData();
    updateMPSActionsWithKeyStrokes();
    rebuildEditorContent(null);
  }

  public void rebuildEditorContent(final List<SModelEvent> events) {
    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        CommandProcessor.instance().executeLightweightCommand(new Runnable() {
          public void run() {
            //i.e. we are disposed. it's too late to rebuild
            if (getEditorContext() == null) {
              return;
            }

            removeAll();

            runSwapCellsActions(new Runnable() {
              public void run() {
                setRootCell(createRootCell(events));
              }
            });

            for (JComponent component : myRootCell.getSwingComponents()) {
              AbstractEditorComponent.this.add(component);
            }

            for (RebuildListener listener : myRebuildListeners) {
              listener.editorRebuilt(AbstractEditorComponent.this);
            }
          }
        });
      }
    });
  }

  public void addRebuildListener(RebuildListener listener) {
    myRebuildListeners.add(listener);
  }

  public void removeRebuildListener(RebuildListener listener) {
    myRebuildListeners.remove(listener);
  }

  public void addSynchronizationListener(CellSynchronizationWithModelListener listener) {
    myCellSynchronizationListeners.add(listener);
  }

  public void removeSynchronizationListener(CellSynchronizationWithModelListener listener) {
    myCellSynchronizationListeners.remove(listener);
  }

  private void fireCellSynchronized(EditorCell cell) {
    for (CellSynchronizationWithModelListener listener : myCellSynchronizationListeners) {
      listener.cellSynchronizedWithModel(cell);
    }
  }

  public EditorCell findNearestCell(int x, int y) {
    EditorCell cell = myRootCell.findCell(x, y);
    if (cell == null) {
      cell = myRootCell.findNearestCell(x, y, true);
      if (cell == null) {
        cell = myRootCell.findNearestCell(x, y, false);
      }
    }
    return cell;
  }

  private void processMousePressed(MouseEvent mouseEvent) {
    requestFocus();
    processCoordSelection(mouseEvent);


    if (mouseEvent.getButton() == MouseEvent.BUTTON2) {
      goByFirstReference();
    }

    if (mouseEvent.isControlDown()) {
      if (mouseEvent.isAltDown()) {
        showCellError();
      } else {
        goByFirstReference();
      }
    }
  }

  private void goByFirstReference() {
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        new GoByFirstReferenceAction().doExecute(createActionContext());
      }
    });
  }

  private void showCellError() {
    if (getSelectedCell() != null) {
      CommandProcessor.instance().executeLightweightCommand(new Runnable() {
        public void run() {
          SNode selectedNode = getSelectedCell().getSNode();
          while (selectedNode != null) {
            final IErrorReporter herror = TypeChecker.getInstance().getTypeErrorDontCheck(selectedNode);
            if (herror != null) {
              SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                  String s = herror.reportError();
                  final MPSErrorDialog dialog = new MPSErrorDialog(myOperationContext.getMainFrame(), s, "TYPESYSTEM ERROR", false);
                  JButton button = new JButton(new AbstractAction("Go To Rule") {
                    public void actionPerformed(ActionEvent e) {
                      CommandProcessor.instance().executeLightweightCommand(new Runnable() {
                        public void run() {
                          GoToTypeErrorRuleUtil.goToTypeErrorRule(myOperationContext, herror, GoToTypeErrorRule_Action.LOG);
                          dialog.dispose();
                        }
                      });
                    }
                  });
                  dialog.addButton(button);
                  dialog.initializeUI();
                  dialog.setVisible(true);
                }
              });
              return;
            }
            selectedNode = selectedNode.getParent();
          }
        }
      });

    }
  }

  private void processCoordSelection(MouseEvent mouseEvent) {
    if (mouseEvent.getButton() != MouseEvent.BUTTON1 && mouseEvent.getButton() != MouseEvent.BUTTON2) return;
    EditorCell newSelectedCell = myRootCell.findCell(mouseEvent.getX(), mouseEvent.getY());
    if (newSelectedCell == null || !newSelectedCell.isSelectable()) {
      newSelectedCell = myRootCell.findNearestCell(mouseEvent.getX(), mouseEvent.getY(), true);
    }
    if (newSelectedCell != null && newSelectedCell.isSelectable()) {
      changeSelection(newSelectedCell, true, false);
      mySelectedCell.processMousePressed(mouseEvent);
      revalidateAndRepaint(false);
    }
  }

  public void clearSelectionStack() {
    mySelectedStack.clear();
  }

  public void pushSelection(EditorCell cell) {
    mySelectedStack.push(cell);
  }

  public EditorCell popSelection() {
    if (!mySelectedStack.isEmpty()) {
      return mySelectedStack.pop();
    }
    return null;
  }

  public EditorCell peekSelection() {
    if (!mySelectedStack.isEmpty()) {
      return mySelectedStack.peek();
    }
    return null;
  }

  public Stack<EditorCell> getSelectionStackCopy() {
    return (Stack<EditorCell>) mySelectedStack.clone();
  }

  public boolean selectionStackContains(EditorCell cell) {
    return mySelectedStack.contains(cell);
  }

  public void changeSelection(EditorCell newSelectedCell) {
    changeSelection(newSelectedCell, true);
  }

  void changeSelection(EditorCell newSelectedCell, boolean resetLastCaretX) {
    changeSelection(newSelectedCell, resetLastCaretX, true);
  }

  void changeSelection(EditorCell newSelectedCell, boolean resetLastCaretX, boolean scroll) {
    clearSelectionStack();
    Stack<EditorCell_Collection> foldedParents = new Stack<EditorCell_Collection>();
    if (newSelectedCell != null) {
      for (EditorCell_Collection collection : CollectionUtil.iteratorAsIterable(newSelectedCell.parents())) {
        if (collection.isFolded()) {
          foldedParents.push(collection);
        }
      }
      boolean toRelayout = !foldedParents.isEmpty();
      while (!foldedParents.isEmpty()) {
        EditorCell_Collection collection = foldedParents.pop();
        collection.unfold(true);
      }
      if (toRelayout) relayout();
    }
    setSelectionDontClearStack(newSelectedCell, resetLastCaretX, scroll);
  }

  @UseCarefully
  public void setSelectionDontClearStack(EditorCell newSelectedCell, boolean resetLastCaretX) {
    setSelectionDontClearStack(newSelectedCell, resetLastCaretX, true);
  }

  @UseCarefully
  public void setSelectionDontClearStack(EditorCell newSelectedCell, boolean resetLastCaretX, boolean scrollToCell) {
    if (resetLastCaretX) {
      resetLastCaretX();
    }

    if (newSelectedCell == mySelectedCell) {
      return;
    }
    myNodeSubstituteChooser.setVisible(false);
    myNodeRangeSelection.deactivate();

    EditorCell oldSelection = mySelectedCell;
    if (mySelectedCell != null) {
      mySelectedCell.setSelected(false);
    }
    mySelectedCell = newSelectedCell;
    if (mySelectedCell != null) {
      mySelectedCell.setSelected(true);
    }
    if (mySelectedCell != null) {
      if (scrollToCell) {
        scrollToCell(newSelectedCell);
      }
    }
    repaint();

    fireCellSelectionChanged(oldSelection, newSelectedCell);
  }

  public void scrollToNode(SNode node) {
    EditorCell cell = findNodeCell(node);
    if (cell != null) {
      scrollToCell(cell);
    }
  }

  public void ensureSelectionVisible() {
    if (getSelectedCell() == null) {
      return;
    }
    scrollToCell(getSelectedCell());
  }

  public void scrollToCell(EditorCell cell) {
    if (getVisibleRect().isEmpty()) {
      return;
    }

    EditorCell largestVerticalBigCell = cell;

    int viewportWidth = myScrollPane.getViewport().getWidth();

    int x0;
    int width;

    if (cell instanceof EditorCell_Label) {
      EditorCell_Label cellLabel = (EditorCell_Label) cell;
      int caretX = cellLabel.getCaretX();
      int charWidth = cellLabel.getCharWidth();
      width = 4 * charWidth;
      x0 = caretX - 2 * charWidth;
    } else if (getDeepestSelectedCell() instanceof EditorCell_Label && cell.getWidth() > viewportWidth) {
      EditorCell_Label cellLabel = (EditorCell_Label) getDeepestSelectedCell();
      int caretX = cellLabel.getCaretX();
      int charWidth = cellLabel.getCharWidth();
      x0 = Math.max(cell.getX(), caretX + 2 * charWidth - viewportWidth);
      width = viewportWidth;
    } else {
      x0 = cell.getX();
      width = cell.getWidth();
    }

    Rectangle visibleRect = getVisibleRect();
    Rectangle rectangle = new Rectangle(x0, visibleRect.y, width, visibleRect.height);
    if (!rectangle.isEmpty()) {
      boolean adjustHorizontally = !visibleRect.contains(rectangle);
      if (adjustHorizontally) {
        int x1 = Math.max(0, x0 + width - viewportWidth);
        scrollRectToVisible(
          expandRectangleOneLine(
            new Rectangle(
              x1, largestVerticalBigCell.getY(),
              x0 - x1 + width, largestVerticalBigCell.getHeight()
            )));
      } else {
        scrollRectToVisible(
          expandRectangleOneLine(
            new Rectangle(
              x0, largestVerticalBigCell.getY(),
              width, largestVerticalBigCell.getHeight()
            )));
      }
    }
  }

  private Rectangle expandRectangleOneLine(Rectangle r) {
    Font defaultFont = EditorSettings.getInstance().getDefaultEditorFont();
    FontMetrics fontMetrics = getFontMetrics(defaultFont);
    int height = fontMetrics.getHeight();
    Rectangle rectangle = new Rectangle(r.x, r.y - height, r.width, r.height + 2 * height);
    return rectangle;
  }

  public void addCellSelectionListener(ICellSelectionListener l) {
    mySelectionListeners.add(l);
  }

  public void removeCellSelectionListener(ICellSelectionListener l) {
    mySelectionListeners.remove(l);
  }

  protected void fireCellSelectionChanged(EditorCell oldSelection, EditorCell newSelection) {
    for (ICellSelectionListener cellSelectionListener : mySelectionListeners) {
      try {
        cellSelectionListener.selectionChanged(this, oldSelection, newSelection);
      } catch (Exception e) {
        LOG.error(e);
      }
    }
  }

  protected void paintComponent(Graphics gg) {
    Graphics2D g = (Graphics2D) gg;

    turnOnAliasingIfPossible(g);

    g.setColor(getBackground());
    Rectangle bounds = g.getClipBounds();


    g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    myLeftHighlighter.paint(g);
    if (myRootCell != null) {
      myRootCell.paint(g);
    }
  }

  protected void paintChildren(Graphics g) {
    super.paintChildren(g);
    if (mySelectedCell instanceof EditorCell_Component) ((EditorCell_Component) mySelectedCell).paintSelection(g);
  }

  public Dimension getPreferredSize() {
    JViewport viewport = myScrollPane.getViewport();
    Rectangle viewRect = viewport.getViewRect();
    if (myRootCell == null) {
      return new Dimension(viewRect.width, viewRect.height);
    }
    return new Dimension(Math.max(viewRect.width, myRootCell.getWidth() + myShiftX + 10),
      Math.max(viewRect.height, myRootCell.getHeight() + myShiftY + 10));
  }

  public Dimension getPreferredScrollableViewportSize() {
    return getPreferredSize();
  }

  public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
    if (orientation == SwingConstants.VERTICAL) {
      return 20;
    } else { // if orientation == SwingConstants.HORIZONTAL
      return 20;
    }
  }

  public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
    return visibleRect.height;
  }

  public boolean getScrollableTracksViewportWidth() {
    return false;
  }

  public boolean getScrollableTracksViewportHeight() {
    return false;
  }

  public EditorCell getDeepestSelectedCell() {
    if (mySelectedStack.isEmpty()) return mySelectedCell;
    return mySelectedStack.get(0);
  }

  public EditorCell getSelectedCell() {
    return mySelectedCell;
  }

  public IKeyboardHandler peekKeyboardHandler() {
    return myKbdHandlersStack.peek();
  }

  public IKeyboardHandler popKeyboardHandler() {
    return myKbdHandlersStack.pop();
  }

  public void pushKeyboardHandler(IKeyboardHandler kbdHandler) {
    myKbdHandlersStack.push(kbdHandler);
  }

  public Object getUserData(Object key) {
    return myUserDataMap.get(key);
  }

  public void putUserData(Object key, Object data) {
    myUserDataMap.put(key, data);
  }

  public void clearUserData() {
    myUserDataMap.clear();
  }

  // ---- keyboard handling ---

  public void sendKeyEvent(KeyEvent keyEvent) {
    if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {
      processKeyPressed(keyEvent);
    } else if (keyEvent.getID() == KeyEvent.KEY_RELEASED) {
      processKeyReleased(keyEvent);
    }
  }

  public void processKeyReleased(KeyEvent keyEvent) {
    peekKeyboardHandler().processKeyReleased(getEditorContext(), keyEvent);
    revalidateAndRepaint(false);
  }

  public void processKeyPressed(final KeyEvent keyEvent) {
    if (keyEvent.isConsumed()) return;

    // hardcoded undo/redo action
    if (keyEvent.getKeyCode() == KeyEvent.VK_Z && keyEvent.isControlDown()) {
      if (keyEvent.isShiftDown()) {
        if (UndoManager.instance().isRedoAvailable()) {
          UndoManager.instance().redo(getEditorContext());
        }
      } else {
        if (UndoManager.instance().isUndoAvailable()) {
          UndoManager.instance().undo(getEditorContext());
        }
      }
      keyEvent.consume();
      return;
    }

    //ctrl-alt-arrows
    if (keyEvent.isControlDown() && keyEvent.isAltDown()) {
      if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
        getEditorOpener().openPrevEditorInHistory(myOperationContext);
        keyEvent.consume();
        return;
      }

      if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
        getEditorOpener().openNextEditorInHistory(myOperationContext);
        keyEvent.consume();
        return;
      }
    }

    // hardcoded "update" action
    if (keyEvent.getKeyCode() == KeyEvent.VK_F5 && keyEvent.getModifiers() == 0) {
      CommandProcessor.instance().tryToExecuteLightweightCommand(new Runnable() {
        public void run() {
          SNode sNode = getRootCell().getSNode();
          if (sNode == null) {
            return;
          }
          Highlighter highlighter = getOperationContext().getComponent(Highlighter.class);
          if (highlighter != null) {
            highlighter.resetCheckedState(AbstractEditorComponent.this);
          }
          TypeChecker.getInstance().checkRoot(sNode.getContainingRoot(), true);
          rebuildEditorContent();
        }
      });
      keyEvent.consume();
      return;
    }

    if (keyEvent.getKeyCode() == KeyEvent.VK_F11 && keyEvent.getModifiers() == 0) {
      relayout();
      keyEvent.consume();
      return;
    }

    // all other processing should be performed inside command
    CommandProcessor.instance().executeCommand(getEditorContext(), new Runnable() {
      public void run() {
        updateMPSActionsWithKeyStrokes(createActionContext());
        EditorContext editorContext = getEditorContext();
        if (editorContext == null) {
          return; //i.e. editor is disposed
        }

        if (peekKeyboardHandler().processKeyPressed(editorContext, keyEvent)) {
          keyEvent.consume();
        }
      }
    });
    revalidateAndRepaint(false);
  }

  boolean activateNodeSubstituteChooser(EditorCell editorCell, boolean resetPattern) {
    if (myNodeSubstituteChooser.isVisible()) {
      return true;
    }

    // try to obtain substitute info
    INodeSubstituteInfo substituteInfo = null;
    if (editorCell != null) {
      substituteInfo = editorCell.getSubstituteInfo();
    }

    return activateNodeSubstituteChooser(editorCell, substituteInfo, resetPattern);
  }

  public boolean activateNodeSubstituteChooser(EditorCell editorCell, INodeSubstituteInfo substituteInfo, boolean resetPattern) {
    if (substituteInfo == null) {
      return false;
    }

    // do substitute...
    LOG.debug("substitute info : " + substituteInfo);
    NodeSubstitutePatternEditor patternEditor = editorCell.createSubstitutePatternEditor();
    if (resetPattern) {
      patternEditor.setCaretPosition(0);
    }
    String pattern = patternEditor.getPattern();
    boolean trySubstituteNow =
      !patternEditor.getText().equals(substituteInfo.getOriginalText()) || // user changed text or cell has no text
        pattern.equals(patternEditor.getText()); // caret at the end

    // 1st - try to do substitution with current pattern (id cursor at the end of text)
    if (trySubstituteNow) {
      List<INodeSubstituteAction> matchingActions = substituteInfo.getMatchingActions(pattern, false);
      if (matchingActions.size() == 1 && pattern.length() > 0) {
        EditorUtil.substituteNode(matchingActions.get(0), pattern, this.getEditorContext());
        return true;
      }
    }

    myNodeSubstituteChooser.setNodeSubstituteInfo(substituteInfo);
    myNodeSubstituteChooser.setPatternEditor(patternEditor);
    myNodeSubstituteChooser.setLocationRelative(editorCell);
    myNodeSubstituteChooser.setVisible(true);
    return true;
  }

  public void paint(Graphics g) {
    super.paint(g);
    if (myNodeRangeSelection.isActive()) {
      myNodeRangeSelection.paint(g);
    }
  }

  public NodeRangeSelection getNodeRangeSelection() {
    return myNodeRangeSelection;
  }

  // last caret X
  boolean hasLastCaretX() {
    return myHasLastCaretX;
  }

  int getLastCaretX() {
    return myLastCaretX;
  }

  void resetLastCaretX() {
    myHasLastCaretX = false;
  }

  void saveLastCaretX(int lastCaretX) {
    myLastCaretX = lastCaretX;
    myHasLastCaretX = true;
  }

  public void addCellDependentOnNodeProperty(EditorCell_Property cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell_Property> dependentCells = myNodePropertiesAccessedCleanlyToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell_Property>();
      myNodePropertiesAccessedCleanlyToDependentCellsMap.put(pair, dependentCells);
    }
    dependentCells.add(cell);
  }

  public void addCellDependentOnNodePropertyWhichWasAccessedDirtily(EditorCell cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell> dependentCells = myNodePropertiesAccessedDirtilyToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell>();
      myNodePropertiesAccessedDirtilyToDependentCellsMap.put(pair, dependentCells);
    }
    dependentCells.add(cell);
  }


  public void addCellDependentOnNodePropertyWhichExistenceWasChecked(EditorCell cell, Pair<SNodePointer, String> pair) {
    WeakSet<EditorCell> dependentCells = myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.get(pair);
    if (dependentCells == null) {
      dependentCells = new WeakSet<EditorCell>();
      myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.put(pair, dependentCells);
    }
    dependentCells.add(cell);
  }


  public void putCellAndNodesToDependOn(EditorCell cell, Set<SNode> nodes, Set<SNodePointer> refTargets) {
    myCellsToNodesToDependOnMap.put(cell, nodes);
    myCellsToRefTargetsToDependOnMap.put(cell, refTargets);
  }

  public Set<SNode> getCopyOfNodesCellDependsOn(EditorCell cell) {
    Set<SNode> nodes = myCellsToNodesToDependOnMap.get(cell);
    if (nodes == null) return null;
    return new HashSet<SNode>(nodes);
  }

  public Set<SNodePointer> getCopyOfRefTargetsCellDependsOn(EditorCell cell) {
    Set<SNodePointer> nodeProxies = myCellsToRefTargetsToDependOnMap.get(cell);
    if (nodeProxies == null) return null;
    return new HashSet<SNodePointer>(nodeProxies);
  }

  public boolean doesCellDependOnNode(EditorCell cell, SNode node) {
    if ((cell == null) && node != null) return true;
    Set<SNode> sNodes = myCellsToNodesToDependOnMap.get(cell);
    Set<SNodePointer> nodeProxies = myCellsToRefTargetsToDependOnMap.get(cell);
    return ((sNodes != null) && (sNodes.contains(node))) || ((nodeProxies != null && nodeProxies.contains(new SNodePointer(node))));
  }

  public void clearNodesCellDependsOn(EditorCell cell, EditorManager editorManager) {
    if (editorManager == EditorManager.getInstanceFromContext(myOperationContext)) {
      myCellsToNodesToDependOnMap.remove(cell);
      myCellsToRefTargetsToDependOnMap.remove(cell);
    }
  }

  void registerAsBigCell(EditorCell cell, ReferencedNodeContext refContext, EditorManager manager) {
    if (manager == EditorManager.getInstanceFromContext(myOperationContext)) {
      myRefNodeContextsToBigCellsMap.put(refContext, new WeakReference<EditorCell>(cell));
      myNodesToBigCellsMap.put(cell.getSNode(), new WeakReference<EditorCell>(cell));
    }
  }

  EditorCell getBigCellForRefContext(ReferencedNodeContext refContext) {
    WeakReference<EditorCell> weakReference = myRefNodeContextsToBigCellsMap.get(refContext);
    if (weakReference == null) return null;
    return weakReference.get();
  }

  EditorCell getBigCellForNode(SNode node) {
    WeakReference<EditorCell> weakReference = myNodesToBigCellsMap.get(node);
    if (weakReference == null) return null;
    return weakReference.get();
  }

  public EditorCell getBigValidCellForNode(SNode node) {
    EditorCell result = getBigCellForNode(node);
    if (isValid(result)) return result;
    return null;
  }

  public boolean isValid(EditorCell cell) {
    if (cell == myRootCell) return true;
    if (cell == null) return false;
    if (cell.getParent() == null) return false;
    return isValid(cell.getParent());
  }

  public IHistoryItem getHistoryItemFromEditor() {
    return new HistoryItem(this, this.mySelectedCell, getSelectedStackForMemento());
  }

  public void setSelectedStackFromMemento(Stack<CellInfo> mementoSelectedStack) {
    mySelectedStack.clear();
    Stack<EditorCell> temp = new Stack<EditorCell>();

    for (int i = mementoSelectedStack.size() - 1; i >= 0; i--) {
      CellInfo cellInfo = mementoSelectedStack.get(i);
      EditorCell cell = cellInfo.findCell(this);
      if (cell == null) break;
      temp.push(cell);
    }
    while (temp.size() > 0) {
      mySelectedStack.push(temp.pop());
    }
  }

  /*package*/ Stack<CellInfo> getSelectedStackForMemento() {
    Stack<CellInfo> result = new Stack<CellInfo>();
    for (EditorCell cell : mySelectedStack) {
      if (cell != null) result.push(cell.getCellInfo());
    }
    return result;
  }


  public EditorCell changeSelectionWRTFocusPolicy(EditorCell cell) {
    EditorCell focusPolicyCell = FocusPolicyUtil.findCellToSelectDueToFocusPolicy(cell);
    EditorCell toSelect;
    if (focusPolicyCell == null || (focusPolicyCell == cell && !focusPolicyCell.hasFocusPolicy())) {
      toSelect = EditorUtil.findErrorOrEditableCell(cell);
      if (toSelect == null) {
        toSelect = EditorUtil.findFirstSelectableCell(cell);
      }
    } else {
      toSelect = focusPolicyCell;
    }
    if (toSelect == null) toSelect = cell;
    changeSelection(toSelect);

    if (toSelect instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) toSelect;
      if (label.getDefaultCaretPosition() != null) {
        if (label.getDefaultCaretPosition() == CaretPosition.FIRST) {
          label.getTextLine().home();
        }
        if (label.getDefaultCaretPosition() == CaretPosition.LAST) {
          label.getTextLine().end();
        }
      } else if (!toSelect.isErrorState()) {
        label.getTextLine().end();
      }
    }

    return toSelect;
  }

  protected void setEditorContext(EditorContext editorContext) {
    myEditorContext = editorContext;
  }

  private void runSwapCellsActions(Runnable action) {
    if (mySelectedCell != null) myRecentlySelectedCellInfo = mySelectedCell.getCellInfo();
    Object memento = null;
    if (getEditorContext() != null) {
      memento = getEditorContext().createMemento();
    }
    myFoldedCells.clear();
    myBracesEnabledCells.clear();
    action.run();
    if (getEditorContext() != null) {
      getEditorContext().setMemento(memento);
    }
    myRecentlySelectedCellInfo = null;
  }

  //to access selected cell info during rebuild
  /*package*/ CellInfo getRecentlySelectedCellInfo() {
    return myRecentlySelectedCellInfo;
  }

  public boolean isReadOnly() {
    return myReadOnly;
  }

  public void setReadOnly(boolean readOnly) {
    myReadOnly = readOnly;
  }

  public <T> T get(Class<T> cls) {
    if (getEditorContext() == null) {
      return null; //i.e editor is disposed
    }


    if (cls == SNode.class) return (T) getRootCell().getSNode();
    if (cls == SModelDescriptor.class && get(SNode.class) != null) {
      return CommandProcessor.instance().executeLightweightCommand(new Calculable<T>() {
        public T calculate() {
          return (T) get(SNode.class).getModel().getModelDescriptor();
        }
      });
    }
    if (cls == IOperationContext.class) return (T) getOperationContext();
    if (cls == AbstractEditorComponent.class) return (T) this;
    if (cls == EditorContext.class) return (T) getEditorContext();
    return null;
  }

  @Nullable
  public Object getData(@NonNls String dataId) {
    if (dataId.equals(MPSDataKeys.SNODE.getName())) {
      return getRootCell().getSNode();
    }

    if (dataId.equals(MPSDataKeys.SMODEL_DESCRIPTOR.getName())) {
      return CommandProcessor.instance().executeLightweightCommand(new Calculable() {
        public Object calculate() {
          return getRootCell().getSNode().getModel().getModelDescriptor();
        }
      });      
    }

    if (dataId.equals(MPSDataKeys.OPERATION_CONTEXT.getName())) {
      return getOperationContext();
    }

    return null;
  }

  public IEditorOpener getEditorOpener() {
    return getOperationContext().getComponent(EditorsPane.class);
  }

  private void showIntentionsMenu() {
    EditorCell cell = getSelectedCell();

    IntentionsMenu intentionsMenu = new IntentionsMenu(myOperationContext.getComponent(IDEProjectFrame.class));

    intentionsMenu.init(cell.getSNode(), getEditorContext(), getAvailableIntentions());

    intentionsMenu.addPopupMenuListener(new PopupMenuListener() {
      public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        //setLightBulbVisibility(false);
      }

      public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        CommandProcessor.instance().executeLightweightCommandInEDT(new Runnable() {
          public void run() {
            setLightBulbVisibility(!getEnabledIntentions().isEmpty());
          }
        });
      }

      public void popupMenuCanceled(PopupMenuEvent e) {
        CommandProcessor.instance().executeLightweightCommandInEDT(new Runnable() {
          public void run() {
            setLightBulbVisibility(!getEnabledIntentions().isEmpty());
          }
        });
      }
    });

    EditorCell bigCell = getBigCellForNode(cell.getSNode());
    assert bigCell != null : "selected cell mustn't be null";

    Point loc = getIntentionsMenuLocation(bigCell, intentionsMenu);
    intentionsMenu.show(this, loc.x, loc.y);
  }

  private void setLightBulbVisibility(final boolean value) {
    CommandProcessor.instance().executeLightweightCommand(new Runnable() {
      public void run() {
        if (value) {
          Set<Intention> enabledIntentions = getEnabledIntentions();
          if ((!enabledIntentions.isEmpty()) && (!getEditedNode().getModel().isNotEditable())) {
            boolean showError = false;
            for (Intention intention : enabledIntentions) {
              if (intention.isErrorIntention()) {
                showError = true;
              }
            }
            showLightBulb(showError);
          }
        } else {
          hideLightBulb();
        }
      }
    });
  }

  private void adjustLightBulbLocation() {
    EditorCell selectedCell = getSelectedCell();
    if (selectedCell == null) return;

    Point p = getLightBulbLocation(selectedCell);

    myLightBulbLocation.setLocation(p);

    myLightBulb.setLocation(myLightBulbLocation);
  }

  private void showLightBulb(boolean showError) {
    myLightBulb.setError(showError);
    add(myLightBulb);
    myLightBulb.setLocation(myLightBulbLocation);
    repaint();
  }

  private void hideLightBulb() {
    remove(myLightBulb);
  }

  @NotNull
  private Point getInsertedPosition(@NotNull Rectangle parentView, @NotNull Dimension childDim, @NotNull Point preferredLoc) {
    Point p = new Point(preferredLoc);

    p.x = Math.max(p.x, parentView.x + 2);
    p.y = Math.max(p.y, parentView.y + 2);

    p.x = Math.min(p.x, parentView.x + parentView.width - 2 - childDim.width);
    p.y = Math.min(p.y, parentView.y + parentView.height - 2 - childDim.height);

    return p;
  }

  @NotNull
  private Point getLightBulbLocation(@NotNull EditorCell selectedCell) {
    EditorCell bigCell = getBigCellForNode(selectedCell.getSNode());
    if (bigCell != null) selectedCell = bigCell;

    int x = getRootCell().getX() - ADDITIONAL_SHIFT_X - myLightBulb.getWidth() - 6;
    int y = selectedCell.getY();

    Rectangle viewRect = myScrollPane.getViewport().getViewRect();
    return getInsertedPosition(viewRect, myLightBulb.getPreferredSize(), new Point(x, y));
  }

  @NotNull
  private Point getIntentionsMenuLocation(@NotNull EditorCell selectedCell, @NotNull IntentionsMenu menu) {
    Point point = getLightBulbLocation(selectedCell);
    point.x = selectedCell.getX();
    point.y += myLightBulb.getHeight();
    Rectangle viewRect = myScrollPane.getViewport().getViewRect();
    return getInsertedPosition(viewRect, menu.getPreferredSize(), point);
  }

  private class MyModelListener implements SModelCommandListener {
    public void eventsHappenedInCommand(List<SModelEvent> events) {
      if (EventUtil.isDetachedOnlyChange(events)) {
        return;
      }

      if (!EventUtil.isDramaticalChange(events)) {
        if (EventUtil.isPropertyChange(events)) {
          String propertyName = ((SModelPropertyEvent) events.get(0)).getPropertyName();
          SNodePointer nodeProxy = new SNodePointer(((SModelPropertyEvent) events.get(0)).getNode());
          Pair<SNodePointer, String> pair = new Pair<SNodePointer, String>(nodeProxy, propertyName);
          Set<EditorCell_Property> editorCell_properties = myNodePropertiesAccessedCleanlyToDependentCellsMap.get(pair);
          Set<EditorCell> editorCells = myNodePropertiesAccessedDirtilyToDependentCellsMap.get(pair);
          Set<EditorCell> editorCellsDependentOnExistence = myNodePropertiesWhichExistenceWasCheckedToDependentCellsMap.get(pair);
          if (editorCellsDependentOnExistence != null) {
            if (EventUtil.isPropertyAddedOrRemoved(events.get(0))) {
              rebuildEditorContent(events);
            } else {
              for (EditorCell cell : editorCellsDependentOnExistence) {
                cell.synchronizeViewWithModel();
                fireCellSynchronized(cell);
              }
              if (editorCell_properties != null) {
                for (EditorCell cell : editorCell_properties) {
                  cell.synchronizeViewWithModel();
                  fireCellSynchronized(cell);
                }
              }
              relayout();
            }
            return;
          }
          if (editorCells != null) {
            rebuildEditorContent(events);
          } else if (editorCell_properties != null) {
            for (EditorCell_Property cell : editorCell_properties) {
              cell.synchronizeViewWithModel();
              fireCellSynchronized(cell);
            }
            relayout();
          }
        } else {
          rebuildEditorContent(events);
        }
      } else {// "dramatical" change
        rebuildEditorContent(events);


        if (!hasFocus() && !myLightBulb.isVisible()) {
          return;
        }

        updateSelection(events);
      }
    }


    private void updateSelection(List<SModelEvent> events) {
      SModelEvent lastAdd = null;
      SModelEvent lastRemove = null;

      List<SNode> childAddedEventNodes = new ArrayList<SNode>();

      for (SModelEvent e : events) {
        if (e instanceof SModelChildEvent) {
          SModelChildEvent ce = (SModelChildEvent) e;
          if (ce.getParent().getAncestors(true).contains(getEditedNode())) {
            if (ce.isAdded()) {
              lastAdd = ce;
              childAddedEventNodes.add(ce.getChild());
            }
            if (ce.isRemoved()) lastRemove = ce;
          }
        }

        if (e instanceof SModelReferenceEvent) {
          SModelReferenceEvent re = (SModelReferenceEvent) e;
          if (re.isAdded()) lastAdd = re;
          if (re.isRemoved()) lastRemove = re;
        }
      }

      if (lastAdd != null) {
        if (lastAdd instanceof SModelChildEvent) {
          List<NodesParetoFrontier.NodeBox> frontier = NodesParetoFrontier.findParetoFrontier(childAddedEventNodes);
          SNode addedChild = frontier.get(frontier.size() - 1).getNode();
          EditorCell cell = findNodeCell(addedChild);
          if (cell != null) {
            changeSelectionWRTFocusPolicy(cell);
          }
          return;
        } else //noinspection ConstantConditions
          if (lastAdd instanceof SModelReferenceEvent) {
            SModelReferenceEvent re = (SModelReferenceEvent) lastAdd;
            selectRefCell(re.getReference());
            return;
          } else {
            //
          }
      }

      if (lastRemove != null) {
        if (lastRemove instanceof SModelChildEvent) {
          SModelChildEvent ce = (SModelChildEvent) lastRemove;
          int index = ce.getChildIndex();
          String role = ce.getChildRole();
          SNode parent = ce.getParent();

          if (parent.getChildCount() > index) {
            SNode child = parent.getChildAt(index);
            if (role.equals(child.getRole_())) {
              EditorCell cell = findNodeCell(child);
              if (cell != null) {
                changeSelectionWRTFocusPolicy(cell);
              }
              return;
            }
          }

          if (index != 0) {
            SNode child = parent.getChildAt(index - 1);
            if (role.equals(child.getRole_())) {
              EditorCell cell = findNodeCell(child);
              if (cell != null) {
                changeSelectionWRTFocusPolicy(cell);
              }
              return;
            }
          }


          EditorCell nullCell = findNodeCellWithRole(parent, role);
          if (nullCell == null) {
            EditorCell cell = findNodeCell(parent);
            if (cell != null) {
              changeSelectionWRTFocusPolicy(cell);
            }
          } else {
            changeSelectionWRTFocusPolicy(nullCell);
          }

          return;
        }

        //noinspection ConstantConditions
        if (lastRemove instanceof SModelReferenceEvent) {
          SModelReferenceEvent re = (SModelReferenceEvent) lastRemove;
          SReference ref = re.getReference();
          SNode sourceNode = ref.getSourceNode();
          String role = ref.getRole();
          EditorCell nullCell = findNodeCellWithRole(sourceNode, role);
          if (nullCell == null) {
            EditorCell cell = findNodeCell(sourceNode);
            if (cell != null) {
              changeSelectionWRTFocusPolicy(cell);
            }
          } else {
            changeSelectionWRTFocusPolicy(nullCell);
          }
        }
      }
    }
  }

  private class MySimpleModelListener extends SModelAdapter {
    public void modelReloaded(SModelDescriptor sm) {
      CommandProcessor.instance().invokeLater(new Runnable() {
        public void run() {
          rebuildEditorContent();
        }
      });
    }
  }

  public static interface RebuildListener {
    public void editorRebuilt(AbstractEditorComponent editor);
  }

  public static interface CellSynchronizationWithModelListener {
    public void cellSynchronizedWithModel(EditorCell cell);
  }

  private class MPSActionProxy extends AbstractAction {
    private List<MPSAction> myActions = new ArrayList<MPSAction>();

    public void add(MPSAction a) {
      myActions.add(a);
    }

    public void actionPerformed(ActionEvent e) {
      for (final MPSAction action : myActions) {
        if (mySelectedCell != null && mySelectedCell.getSNode() != null) {
          final ActionContext context = createActionContext();
          action.update(context);
          if (!action.isVisible() || !action.isEnabled()) {
            continue;
          }

          action.execute(context);
          return;
        }
      }

    }
  }
}
