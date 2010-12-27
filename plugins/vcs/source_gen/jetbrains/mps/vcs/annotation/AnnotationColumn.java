package jetbrains.mps.vcs.annotation;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.leftHighlighter.AbstractLeftColumn;
import java.awt.Color;
import java.awt.Font;
import jetbrains.mps.nodeEditor.EditorSettings;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import com.intellij.openapi.vcs.annotate.FileAnnotation;
import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import com.intellij.openapi.vcs.history.VcsFileRevision;
import com.intellij.openapi.vcs.annotate.LineAnnotationAspect;
import com.intellij.openapi.vcs.AbstractVcs;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.persistence.lines.LineContent;
import jetbrains.mps.vcs.diff.changes.Change;
import java.util.Set;
import jetbrains.mps.nodeEditor.leftHighlighter.LeftEditorHighlighter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import com.intellij.openapi.vcs.actions.AnnotationColors;
import jetbrains.mps.vcs.changesmanager.ChangesManager;
import jetbrains.mps.vcs.changesmanager.ModelChangesManager;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.vcs.diff.changes.SetPropertyChange;
import jetbrains.mps.smodel.persistence.lines.PropertyLineContent;
import jetbrains.mps.vcs.diff.changes.SetReferenceChange;
import jetbrains.mps.smodel.persistence.lines.ReferenceLineContent;
import jetbrains.mps.smodel.persistence.lines.NodeLineContent;
import java.awt.Graphics;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Graphics2D;
import jetbrains.mps.smodel.ModelAccess;
import java.awt.FontMetrics;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.messageTargets.CellFinder;
import java.util.Collections;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import com.intellij.openapi.vcs.annotate.LineAnnotationAspectAdapter;
import javax.swing.JPopupMenu;
import com.intellij.openapi.actionSystem.AnAction;
import jetbrains.mps.workbench.action.BaseAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Separator;
import com.intellij.openapi.ide.CopyPasteManager;
import com.intellij.openapi.vcs.history.TextTransferrable;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import javax.swing.SwingUtilities;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vcs.FilePath;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vcs.versionBrowser.CommittedChangeList;
import com.intellij.openapi.vcs.annotate.AnnotationListener;
import jetbrains.mps.vcs.changesmanager.ChangeListener;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.vcs.changes.BackgroundFromStartOption;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.vcs.CommittedChangesProvider;
import com.intellij.openapi.vcs.FilePathImpl;
import com.intellij.openapi.vcs.ui.VcsBalloonProblemNotifier;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.vcs.changes.ChangesUtil;
import java.io.File;
import com.intellij.openapi.vcs.changes.ContentRevision;
import jetbrains.mps.vcs.plugin.VcsActionsHelper;
import javax.swing.JFrame;
import com.intellij.openapi.wm.WindowManager;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.vcs.diff.ui.ModelDifferenceDialog;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.diff.ui.RootDifferenceDialog;
import com.intellij.openapi.vcs.VcsException;

public class AnnotationColumn extends AbstractLeftColumn {
  private static final Color ANNOTATION_COLOR = new Color(0, 0, 128);

  private Font myFont = EditorSettings.getInstance().getDefaultEditorFont();
  private List<AnnotationAspectSubcolumn> myAspectSubcolumns = ListSequence.fromList(new ArrayList<AnnotationAspectSubcolumn>());
  private List<Integer> myPseudoLinesY;
  private List<Integer> myPseudoLinesToFileLines;
  private int mySubcolumnInterval;
  private Map<String, Color> myAuthorsToColors = MapSequence.fromMap(new HashMap<String, Color>());
  private FileAnnotation myFileAnnotation;
  private Map<VcsRevisionNumber, VcsFileRevision> myRevisionNumberToRevision = MapSequence.fromMap(new HashMap<VcsRevisionNumber, VcsFileRevision>());
  private LineAnnotationAspect myAuthorAnnotationAspect;
  private AbstractVcs myVcs;
  private VirtualFile myModelVirtualFile;
  private SModelDescriptor myModelDescriptor;
  private List<LineContent> myFileLineToContent;
  private Map<Change, LineContent> myChangesToLineContents = MapSequence.fromMap(new HashMap<Change, LineContent>());
  private Set<Integer> myCurrentPseudoLines = null;
  private final Object myCurrentPseudoLinesLock = new Object();
  private VcsRevisionRange myRevisionRange;
  private ViewActionGroup myViewActionGroup;
  private AnnotationColumn.MyChangeListener myChangeListener = new AnnotationColumn.MyChangeListener();
  private AnnotationColumn.MyAnnotationListener myAnnotationListener = new AnnotationColumn.MyAnnotationListener();
  private boolean myShowAdditionalInfo = false;

  public AnnotationColumn(LeftEditorHighlighter leftEditorHighlighter, SNode root, FileAnnotation fileAnnotation, AbstractVcs vcs, VirtualFile modelVirtualFile) {
    super(leftEditorHighlighter);
    Set<SNodeId> descendantIds = SetSequence.fromSetWithValues(new HashSet<SNodeId>(), ListSequence.fromList(SNodeOperations.getDescendants(root, null, true, new String[]{})).<SNodeId>select(new ISelector<SNode, SNodeId>() {
      public SNodeId select(SNode n) {
        return n.getSNodeId();
      }
    }));
    final SModel model = SNodeOperations.getModel(root);
    myFileAnnotation = fileAnnotation;
    for (VcsFileRevision rev : ListSequence.fromList(fileAnnotation.getRevisions())) {
      MapSequence.fromMap(myRevisionNumberToRevision).put(rev.getRevisionNumber(), rev);
    }
    myFileLineToContent = ModelPersistence.getLineToContentMap(myFileAnnotation.getAnnotatedContent());
    if (myFileLineToContent == null) {
      return;
    }
    myFileAnnotation.addListener(myAnnotationListener);
    myAuthorAnnotationAspect = Sequence.fromIterable(Sequence.fromArray(myFileAnnotation.getAspects())).findFirst(new IWhereFilter<LineAnnotationAspect>() {
      public boolean accept(LineAnnotationAspect a) {
        return LineAnnotationAspect.AUTHOR.equals(a.getId());
      }
    });
    Map<SNodeId, Integer> nodeIdToFileLine = MapSequence.fromMap(new HashMap<SNodeId, Integer>());
    for (int line = 0; line < ListSequence.fromList(myFileLineToContent).count(); line++) {
      SNode node = null;
      SNodeId id = check_5mnya_a0b0k0a(ListSequence.fromList(myFileLineToContent).getElement(line));
      if (id != null && SetSequence.fromSet(descendantIds).contains(id)) {
        node = model.getNodeById(id);
      }
      if (node == null) {
        continue;
      }
      if (MapSequence.fromMap(nodeIdToFileLine).containsKey(id)) {
        MapSequence.fromMap(nodeIdToFileLine).put(id, getFileLineWithMaxRevision(MapSequence.fromMap(nodeIdToFileLine).get(id), line));
      } else {
        MapSequence.fromMap(nodeIdToFileLine).put(id, line);
      }
    }
    ListSequence.fromList(myAspectSubcolumns).addSequence(Sequence.fromIterable(Sequence.fromArray(fileAnnotation.getAspects())).<AnnotationAspectSubcolumn>select(new ISelector<LineAnnotationAspect, AnnotationAspectSubcolumn>() {
      public AnnotationAspectSubcolumn select(LineAnnotationAspect a) {
        return new AnnotationAspectSubcolumn(AnnotationColumn.this, a);
      }
    }));
    ListSequence.fromList(myAspectSubcolumns).addElement(new CommitNumberSubcolumn(this, myFileAnnotation));
    for (VcsFileRevision revision : ListSequence.fromList(myFileAnnotation.getRevisions())) {
      String author = revision.getAuthor();
      if (!(MapSequence.fromMap(myAuthorsToColors).containsKey(author))) {
        MapSequence.fromMap(myAuthorsToColors).put(author, AnnotationColors.BG_COLORS[MapSequence.fromMap(myAuthorsToColors).count() % AnnotationColors.BG_COLORS.length]);
      }
    }
    myViewActionGroup = new ViewActionGroup(this, myAspectSubcolumns);
    myRevisionRange = new VcsRevisionRange(this, myFileAnnotation);
    ListSequence.fromList(myAspectSubcolumns).addElement(new HighlightRevisionSubcolumn(this, myRevisionRange));
    myModelVirtualFile = modelVirtualFile;
    myModelDescriptor = model.getModelDescriptor();
    myVcs = vcs;
    final ChangesManager changesManager = ChangesManager.getInstance(getProject());
    changesManager.getCommandQueue().runTask(new Runnable() {
      public void run() {
        ModelChangesManager modelChangesManager = changesManager.getModelChangesManager(model);
        ListSequence.fromList(modelChangesManager.getChangeList()).visitAll(new IVisitor<Change>() {
          public void visit(Change ch) {
            saveChange(ch);
          }
        });
        modelChangesManager.addChangeListener(myChangeListener);
      }
    });
  }

  private void saveChange(Change ch) {
    if (ch instanceof SetPropertyChange) {
      MapSequence.fromMap(myChangesToLineContents).put(ch, new PropertyLineContent(ch.getAffectedNodeId(), ((SetPropertyChange) ch).getProperty()));
    } else if (ch instanceof SetReferenceChange) {
      MapSequence.fromMap(myChangesToLineContents).put(ch, new ReferenceLineContent(ch.getAffectedNodeId(), ((SetReferenceChange) ch).getRole()));
    } else if (ch.getAffectedNodeId() != null) {
      MapSequence.fromMap(myChangesToLineContents).put(ch, new NodeLineContent(ch.getAffectedNodeId()));
    }
  }

  private void assureCurrentPseudoLinesCalculated() {
    if (myCurrentPseudoLines == null) {
      myCurrentPseudoLines = SetSequence.fromSet(new HashSet<Integer>());
      for (LineContent lineContent : Sequence.fromIterable(MapSequence.fromMap(myChangesToLineContents).values())) {
        SetSequence.fromSet(myCurrentPseudoLines).addSequence(Sequence.fromIterable(getPseudoLinesForContent(lineContent)));
      }
    }
  }

  public String getName() {
    return "Annotations";
  }

  public void paint(final Graphics graphics) {
    graphics.setFont(myFont);
    EditorComponent.turnOnAliasingIfPossible((Graphics2D) graphics);
    final Map<AnnotationAspectSubcolumn, Integer> subcolumnToX = MapSequence.fromMap(new HashMap<AnnotationAspectSubcolumn, Integer>());
    int x = 1;
    for (AnnotationAspectSubcolumn subcolumn : ListSequence.fromList(myAspectSubcolumns)) {
      MapSequence.fromMap(subcolumnToX).put(subcolumn, x);
      if (subcolumn.isEnabled() || myShowAdditionalInfo) {
        x += subcolumn.getWidth() + mySubcolumnInterval;
      }
    }
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        synchronized (myCurrentPseudoLinesLock) {
          assureCurrentPseudoLinesCalculated();
          for (int pseudoLine = 0; pseudoLine < ListSequence.fromList(myPseudoLinesY).count(); pseudoLine++) {
            if (SetSequence.fromSet(myCurrentPseudoLines).contains(pseudoLine)) {
              continue;
            }

            int fileLine = ListSequence.fromList(myPseudoLinesToFileLines).getElement(pseudoLine);
            int height = (pseudoLine == ListSequence.fromList(myPseudoLinesY).count() - 1 ?
              getEditorComponent().getHeight() - ListSequence.fromList(myPseudoLinesY).last() :
              ListSequence.fromList(myPseudoLinesY).getElement(pseudoLine + 1) - ListSequence.fromList(myPseudoLinesY).getElement(pseudoLine)
            );
            if (myAuthorAnnotationAspect != null && ViewAction.isSet(ViewAction.COLORS)) {
              String author = myAuthorAnnotationAspect.getValue(fileLine);
              graphics.setColor(MapSequence.fromMap(myAuthorsToColors).get(author));
              graphics.fillRect(0, ListSequence.fromList(myPseudoLinesY).getElement(pseudoLine), getWidth(), height);
            }

            graphics.setColor(ANNOTATION_COLOR);
            if (myRevisionRange.isFileLineHighlighted(fileLine)) {
              graphics.setFont(myFont.deriveFont(Font.BOLD));
            } else {
              graphics.setFont(myFont);
            }
            FontMetrics metrics = graphics.getFontMetrics();
            if (height < metrics.getHeight()) {
              continue;
            }
            for (AnnotationAspectSubcolumn subcolumn : ListSequence.fromList(myAspectSubcolumns).where(new IWhereFilter<AnnotationAspectSubcolumn>() {
              public boolean accept(AnnotationAspectSubcolumn s) {
                return myShowAdditionalInfo || s.isEnabled();
              }
            })) {
              String text = subcolumn.getTextForFileLine(fileLine);
              int textX = MapSequence.fromMap(subcolumnToX).get(subcolumn);
              if (subcolumn.isRightAligned()) {
                textX += subcolumn.getWidth() - metrics.stringWidth(text);
              }
              graphics.drawString(text, textX, metrics.getAscent() + ListSequence.fromList(myPseudoLinesY).getElement(pseudoLine));
            }
          }
        }
      }
    });
  }

  public int getWidth() {
    return ListSequence.fromList(myAspectSubcolumns).<Integer>select(new ISelector<AnnotationAspectSubcolumn, Integer>() {
      public Integer select(AnnotationAspectSubcolumn s) {
        return (s.isEnabled() || myShowAdditionalInfo ?
          s.getWidth() :
          0
        );
      }
    }).reduceLeft(new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer a, Integer b) {
        return a + mySubcolumnInterval + b;
      }
    }) + 1 + mySubcolumnInterval / 2;
  }

  @Nullable
  private EditorCell findCellForContent(@Nullable LineContent content) {
    if (content == null) {
      return null;
    }
    EditorComponent editor = getEditorComponent();
    SNode editedNode = editor.getEditedNode();
    SNode node = editedNode.getModel().getNodeById(content.getNodeId());
    if (node == null || !(node.isDescendantOf(editedNode, true))) {
      return null;
    }

    if (content instanceof NodeLineContent) {
      return editor.getBigValidCellForNode(node);
    } else if (content instanceof PropertyLineContent) {
      return CellFinder.getCellForProperty(editor, node, ((PropertyLineContent) content).getName());
    } else if (content instanceof ReferenceLineContent) {
      return CellFinder.getCellForReference(editor, node, ((ReferenceLineContent) content).getRole());
    } else {
      return null;
    }

  }

  private Iterable<Integer> getPseudoLinesForContent(@Nullable LineContent content) {
    EditorCell cell = findCellForContent(content);
    if (cell == null) {
      return Sequence.fromIterable(Collections.<Integer>emptyList());
    }
    final int startPseudoLine = Collections.binarySearch(myPseudoLinesY, cell.getY());
    final Wrappers._int endPseudoLine = new Wrappers._int(Collections.binarySearch(myPseudoLinesY, cell.getY() + cell.getHeight()));
    if (endPseudoLine.value < 0) {
      endPseudoLine.value = -endPseudoLine.value - 1;
    }
    return new _FunctionTypes._return_P0_E0<Iterable<Integer>>() {
      public Iterable<Integer> invoke() {
        return new Iterable<Integer>() {
          public Iterator<Integer> iterator() {
            return new YieldingIterator<Integer>() {
              private int __CP__ = 0;
              private int _2_pseudoLine;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_pseudoLine = startPseudoLine;
                    case 3:
                      if (!(_2_pseudoLine < endPseudoLine.value)) {
                        this.__CP__ = 1;
                        break;
                      }
                      this.__CP__ = 4;
                      break;
                    case 5:
                      _2_pseudoLine++;
                      this.__CP__ = 3;
                      break;
                    case 6:
                      this.__CP__ = 5;
                      this.yield(_2_pseudoLine);
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 6;
                      break;
                    default:
                      break __loop__;
                  }
                } while (true);
                return false;
              }
            };
          }
        };
      }
    }.invoke();
  }

  public void relayout() {
    EditorComponent editor = getEditorComponent();
    if (editor == null || editor.isDisposed() || editor.getGraphics() == null) {
      return;
    }
    Iterable<EditorCell> nonTrivialCells = Sequence.fromIterable(EditorUtils.getCellDescendants(editor.getRootCell())).where(new IWhereFilter<EditorCell>() {
      public boolean accept(EditorCell cell) {
        return cell.getWidth() * cell.getHeight() != 0;
      }
    });
    Set<Integer> yCoordinatesSet = SetSequence.fromSetWithValues(new HashSet<Integer>(), Sequence.fromIterable(nonTrivialCells).<Integer>select(new ISelector<EditorCell, Integer>() {
      public Integer select(EditorCell cell) {
        return cell.getY();
      }
    }));
    myPseudoLinesY = SetSequence.fromSet(yCoordinatesSet).sort(new ISelector<Integer, Comparable<?>>() {
      public Comparable<?> select(Integer y) {
        return y;
      }
    }, true).toListSequence();
    myPseudoLinesToFileLines = ListSequence.fromList(new ArrayList<Integer>());
    ListSequence.fromList(myPseudoLinesY).visitAll(new IVisitor<Integer>() {
      public void visit(Integer t) {
        ListSequence.fromList(myPseudoLinesToFileLines).addElement(-1);
      }
    });
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (int fileLine = 0; fileLine < ListSequence.fromList(myFileLineToContent).count(); fileLine++) {
          for (int pseudoLine : Sequence.fromIterable(getPseudoLinesForContent(ListSequence.fromList(myFileLineToContent).getElement(fileLine)))) {
            int currentFileLine = ListSequence.fromList(myPseudoLinesToFileLines).getElement(pseudoLine);
            ListSequence.fromList(myPseudoLinesToFileLines).setElement(pseudoLine, getFileLineWithMaxRevision(currentFileLine, fileLine));
          }
        }
      }
    });
    FontMetrics metrics = editor.getGraphics().getFontMetrics(myFont);
    for (AnnotationAspectSubcolumn aspectSubcolumn : ListSequence.fromList(myAspectSubcolumns)) {
      aspectSubcolumn.computeWidth(metrics, myPseudoLinesToFileLines);
    }
    mySubcolumnInterval = metrics.stringWidth(" ");
  }

  @Override
  public String getTooltipText(MouseEvent event) {
    int fileLine = findFileLineByY(event.getY());
    if (fileLine == -1) {
      return null;
    } else {
      return myFileAnnotation.getToolTip(fileLine);
    }
  }

  @Nullable
  @Override
  public Cursor getCursor(MouseEvent event) {
    return (findFileLineByY(event.getY()) == -1 ?
      null :
      new Cursor(Cursor.HAND_CURSOR)
    );
  }

  @Override
  public void mousePressed(MouseEvent event) {
    if (event.getButton() == MouseEvent.BUTTON1 && event.getID() == MouseEvent.MOUSE_RELEASED) {
      event.consume();
      int fileLine = findFileLineByY(event.getY());
      ((LineAnnotationAspectAdapter) myFileAnnotation.getAspects()[0]).doAction(fileLine);
    } else {
      super.mousePressed(event);
    }
  }

  @Override
  public void dispose() {
    myFileAnnotation.removeListener(myAnnotationListener);
    myFileAnnotation.dispose();
    final ChangesManager changesManager = ChangesManager.getInstance(getProject());
    changesManager.getCommandQueue().runTask(new Runnable() {
      public void run() {
        changesManager.getModelChangesManager(myModelDescriptor).removeChangeListener(myChangeListener);
      }
    });
  }

  public void close() {
    getLeftEditorHighlighter().removeLeftColumn(this);
    dispose();
  }

  private int findPseudoLineByY(int y) {
    int pseudoLine = Collections.binarySearch(myPseudoLinesY, y);
    if (pseudoLine < 0) {
      pseudoLine = -pseudoLine - 2;
    }
    if (pseudoLine < 0 || pseudoLine >= ListSequence.fromList(myPseudoLinesToFileLines).count()) {
      return -1;
    }
    return pseudoLine;
  }

  private int findFileLineByY(int y) {
    int pseudoLine = findPseudoLineByY(y);
    if (pseudoLine == -1) {
      return -1;
    } else {
      synchronized (myCurrentPseudoLinesLock) {
        if (SetSequence.fromSet(myCurrentPseudoLines).contains(pseudoLine)) {
          return -1;
        }
      }
      return ListSequence.fromList(myPseudoLinesToFileLines).getElement(pseudoLine);
    }
  }

  @Override
  public JPopupMenu getPopupMenu(MouseEvent event) {
    List<AnAction> actions = ListSequence.fromList(new ArrayList<AnAction>());
    final int fileLine = findFileLineByY(event.getY());
    ListSequence.fromList(actions).addElement(new BaseAction("Close Annotations") {
      protected void doExecute(AnActionEvent e, Map<String, Object> _params) {
        close();
      }
    });
    ListSequence.fromList(actions).addElement(Separator.getInstance());
    ListSequence.fromList(actions).addElement(myViewActionGroup);
    if (fileLine != -1) {
      ListSequence.fromList(actions).addElement(new AnnotationColumn.ShowDiffFromAnnotationAction(fileLine));
      ListSequence.fromList(actions).addElement(new BaseAction("Copy revision number") {
        protected void doExecute(AnActionEvent e, Map<String, Object> params) {
          String asString = myFileAnnotation.getLineRevisionNumber(fileLine).asString();
          CopyPasteManager.getInstance().setContents(new TextTransferrable(asString, asString));
        }
      });
    }
    ListSequence.fromList(actions).addElement(Separator.getInstance());
    ListSequence.fromList(actions).addElement(myRevisionRange);
    ListSequence.fromList(actions).addElement(new ShowAdditionalInfoAction(this));

    DefaultActionGroup actionGroup = ActionUtils.groupFromActions(ListSequence.fromList(actions).toGenericArray(AnAction.class));
    return ActionManager.getInstance().createActionPopupMenu(ActionPlaces.UNKNOWN, actionGroup).getComponent();
  }

  private int getFileLineWithMaxRevision(int a, int b) {
    if (b == -1) {
      return a;
    }
    if (a == -1) {
      return b;
    }
    VcsRevisionNumber aRevision = myFileAnnotation.getLineRevisionNumber(a);
    VcsRevisionNumber bRevision = myFileAnnotation.getLineRevisionNumber(b);
    if (bRevision == null) {
      return a;
    }
    if (aRevision == null) {
      return b;
    }
    int c = aRevision.compareTo(bRevision);
    if (MapSequence.fromMap(myRevisionNumberToRevision).get(aRevision) != null && MapSequence.fromMap(myRevisionNumberToRevision).get(bRevision) != null) {
      c = MapSequence.fromMap(myRevisionNumberToRevision).get(aRevision).getRevisionDate().compareTo(MapSequence.fromMap(myRevisionNumberToRevision).get(bRevision).getRevisionDate());
    }
    if (c < 0) {
      return b;
    }
    return a;
  }

  public void invalidateLayout() {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        getLeftEditorHighlighter().relayout(false);
      }
    });
  }

  public boolean isShowAdditionalInfo() {
    return myShowAdditionalInfo;
  }

  public void setShowAdditionalInfo(boolean showAdditionalInfo) {
    myShowAdditionalInfo = showAdditionalInfo;
    invalidateLayout();
  }

  public List<VcsFileRevision> getRevisions() {
    return myFileAnnotation.getRevisions();
  }

  public Project getProject() {
    return myVcs.getProject();
  }

  private static SNodeId check_5mnya_a0b0k0a(LineContent p) {
    if (null == p) {
      return null;
    }
    return p.getNodeId();
  }

  private static FilePath check_5mnya_a0a2a2a0a0a0a1a1a0c(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getSecond();
  }

  private static FilePath check_5mnya_a0a0c0c0a0a0a0b0b0a2(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getSecond();
  }

  private static CommittedChangeList check_5mnya_a0d0c0a0a0a0b0b0a2(Pair<CommittedChangeList, FilePath> p) {
    if (null == p) {
      return null;
    }
    return p.getFirst();
  }

  private static SNodeId check_5mnya_a0a0a91a8a2a0a0a0a1a1a0c(LineContent p) {
    if (null == p) {
      return null;
    }
    return p.getNodeId();
  }

  private class MyAnnotationListener implements AnnotationListener {
    public MyAnnotationListener() {
    }

    public void onAnnotationChanged() {
      final EditorComponent editor = getEditorComponent();
      close();
      ModelAccess.instance().runReadInEDT(new Runnable() {
        public void run() {
          AnnotationHelper.annotate(editor);
        }
      });
    }
  }

  private class MyChangeListener extends ChangeListener.ChangeAdapter {
    public MyChangeListener() {
    }

    public void changeUpdateFinished() {
      synchronized (myCurrentPseudoLinesLock) {
        myCurrentPseudoLines = null;
      }
    }

    public void changeUpdateStarted() {
      synchronized (myCurrentPseudoLinesLock) {
        myCurrentPseudoLines = null;
      }
    }

    public void changeRemoved(@NotNull Change change, @NotNull SModel model) {
      MapSequence.fromMap(myChangesToLineContents).removeKey(change);
    }

    public void changeAdded(@NotNull Change change, @NotNull SModel model) {
      saveChange(change);
    }
  }

  private class ShowDiffFromAnnotationAction extends AnAction {
    private int myFileLine;

    public ShowDiffFromAnnotationAction(int fileLine) {
      super("Show Diff");
      myFileLine = fileLine;
    }

    public void actionPerformed(AnActionEvent event) {
      final VcsRevisionNumber revisionNumber = myFileAnnotation.getLineRevisionNumber(myFileLine);
      if (revisionNumber != null) {
        final Project project = getProject();
        ProgressManager.getInstance().run(new Task.Backgroundable(project, "Loading revision " + revisionNumber.asString() + " contents", true, BackgroundFromStartOption.getInstance()) {
          public void run(@NotNull ProgressIndicator pi) {
            CommittedChangesProvider provider = myVcs.getCommittedChangesProvider();

            try {
              Pair<CommittedChangeList, FilePath> pair = null;
              if (provider != null) {
                pair = provider.getOneList(myModelVirtualFile, revisionNumber);
              }
              FilePath targetPath = (check_5mnya_a0a0c0c0a0a0a0b0b0a2(pair) == null ?
                new FilePathImpl(myModelVirtualFile) :
                check_5mnya_a0a2a2a0a0a0a1a1a0c(pair)
              );
              CommittedChangeList cl = check_5mnya_a0d0c0a0a0a0b0b0a2(pair);
              if (cl == null) {
                VcsBalloonProblemNotifier.showOverChangesView(project, "Cannot load data for showing diff", MessageType.ERROR);
                return;
              }
              List<com.intellij.openapi.vcs.changes.Change> changes = Sequence.fromIterable(((Iterable<com.intellij.openapi.vcs.changes.Change>) cl.getChanges())).sort(new ISelector<com.intellij.openapi.vcs.changes.Change, Comparable<?>>() {
                public Comparable<?> select(com.intellij.openapi.vcs.changes.Change c) {
                  return ChangesUtil.getFilePath(c).getName().toLowerCase();
                }
              }, true).toListSequence();
              final File ioFile = targetPath.getIOFile();
              com.intellij.openapi.vcs.changes.Change change = ListSequence.fromList(changes).findFirst(new IWhereFilter<com.intellij.openapi.vcs.changes.Change>() {
                public boolean accept(com.intellij.openapi.vcs.changes.Change c) {
                  return c.getAfterRevision() != null && c.getAfterRevision().getFile().getIOFile().equals(ioFile);
                }
              });
              if (change != null) {
                final String name = ioFile.getName();
                change = ListSequence.fromList(changes).findFirst(new IWhereFilter<com.intellij.openapi.vcs.changes.Change>() {
                  public boolean accept(com.intellij.openapi.vcs.changes.Change c) {
                    return c.getAfterRevision() != null && c.getAfterRevision().getFile().getName().equals(name);
                  }
                });

                ContentRevision before = change.getBeforeRevision();
                ContentRevision after = change.getAfterRevision();

                if (pi.isCanceled()) {
                  return;
                }
                pi.setText("Loading model before change");

                final Wrappers._T<SModel> beforeModel = new Wrappers._T<SModel>();
                if (before == null) {
                  beforeModel.value = new SModel(myModelDescriptor.getSModelReference());
                } else {
                  beforeModel.value = VcsActionsHelper.loadModel(before.getContent(), myModelDescriptor);
                }

                if (pi.isCanceled()) {
                  return;
                }

                pi.setText("Loading model after change");
                assert after != null;
                final SModel afterModel = VcsActionsHelper.loadModel(after.getContent(), myModelDescriptor);

                final Wrappers._T<SNode> node = new Wrappers._T<SNode>();
                ModelAccess.instance().runReadAction(new _Adapters._return_P0_E0_to_Runnable_adapter(new _FunctionTypes._return_P0_E0<SNode>() {
                  public SNode invoke() {
                    SNodeId nodeId = check_5mnya_a0a0a91a8a2a0a0a0a1a1a0c(ListSequence.fromList(myFileLineToContent).getElement(myFileLine));
                    node.value = afterModel.getNodeById(nodeId);
                    if ((node.value == null)) {
                      node.value = beforeModel.value.getNodeById(nodeId);
                    }
                    return node.value = SNodeOperations.getContainingRoot(node.value);

                  }
                }));

                final JFrame frame = WindowManager.getInstance().getFrame(project);
                final ModuleContext operationContext = new ModuleContext(myModelDescriptor.getModule(), project);
                final String beforeRevNumber = (before == null ?
                  "<no revision>" :
                  before.getRevisionNumber().asString()
                );
                final String afterRevNumber = after.getRevisionNumber().asString();
                if (node.value == null) {
                  ModelAccess.instance().runReadInEDT(new Runnable() {
                    public void run() {
                      final ModelDifferenceDialog dialog = new ModelDifferenceDialog(operationContext, frame, beforeModel.value, afterModel, "Model Difference", false, new String[]{beforeRevNumber, afterRevNumber});
                      ApplicationManager.getApplication().invokeLater(new Runnable() {
                        public void run() {
                          dialog.showDialog();
                        }
                      });
                    }
                  });

                } else {
                  ModelAccess.instance().runReadInEDT(new Runnable() {
                    public void run() {
                      final RootDifferenceDialog dialog = new RootDifferenceDialog(frame, afterModel, beforeModel.value, false, false);
                      dialog.init(operationContext, node.value, afterRevNumber, beforeRevNumber);
                      ApplicationManager.getApplication().invokeLater(new Runnable() {
                        public void run() {
                          dialog.showDialog();
                        }
                      });
                    }
                  });
                }
              }
            } catch (final VcsException ve) {
              ApplicationManager.getApplication().invokeLater(new Runnable() {
                public void run() {
                  VcsBalloonProblemNotifier.showOverChangesView(project, "Cannot show diff: " + ve.getMessage(), MessageType.ERROR);
                }
              });
            }
          }
        });
      }
    }
  }
}
