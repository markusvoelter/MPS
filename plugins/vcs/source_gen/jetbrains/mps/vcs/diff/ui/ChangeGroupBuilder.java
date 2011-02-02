package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import jetbrains.mps.vcs.diff.MergeContext;
import jetbrains.mps.vcs.diff.changes.ChangeSet;
import java.util.List;
import java.util.Map;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.util.DisjointSets;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import java.util.Set;

public class ChangeGroupBuilder {
  private MergeContext myMergeContext;
  private ChangeSet myChangeSet;
  private DiffEditorComponent myLeftEditorComponent;
  private DiffEditorComponent myRightEditorComponent;
  private List<ChangeGroup> myChangeGroups = null;

  public ChangeGroupBuilder(MergeContext mergeContext, ChangeSet changeSet, DiffEditorComponent leftEditorComponent, DiffEditorComponent rightEditorComponent) {
    myMergeContext = mergeContext;
    myChangeSet = changeSet;
    myLeftEditorComponent = leftEditorComponent;
    myRightEditorComponent = rightEditorComponent;
  }

  private void calculateChangeGroups() {
    final Map<ModelChange, Integer> leftStarts = MapSequence.fromMap(new HashMap<ModelChange, Integer>());
    final Map<ModelChange, Integer> leftEnds = MapSequence.fromMap(new HashMap<ModelChange, Integer>());
    final Map<ModelChange, Integer> rightStarts = MapSequence.fromMap(new HashMap<ModelChange, Integer>());
    final Map<ModelChange, Integer> rightEnds = MapSequence.fromMap(new HashMap<ModelChange, Integer>());
    for (ModelChange change : ListSequence.fromList(myChangeSet.getModelChanges())) {
      ChangeEditorMessage leftMessage = myLeftEditorComponent.getMessageForChange(change);
      ChangeEditorMessage rightMessage = myRightEditorComponent.getMessageForChange(change);

      assert leftMessage == null && rightMessage == null || leftMessage != null && rightMessage != null;
      if (leftMessage == null) {
        continue;
      }

      MapSequence.fromMap(leftStarts).put(change, leftMessage.getStart(myLeftEditorComponent));
      MapSequence.fromMap(leftEnds).put(change, MapSequence.fromMap(leftStarts).get(change) + leftMessage.getHeight(myLeftEditorComponent));
      MapSequence.fromMap(rightStarts).put(change, rightMessage.getStart(myRightEditorComponent));
      MapSequence.fromMap(rightEnds).put(change, MapSequence.fromMap(rightStarts).get(change) + rightMessage.getHeight(myRightEditorComponent));
    }
    DisjointSets<ModelChange> ds = new DisjointSets<ModelChange>(MapSequence.fromMap(leftStarts).keySet());
    for (ModelChange a : SetSequence.fromSet(MapSequence.fromMap(leftStarts).keySet())) {
      for (ModelChange b : SetSequence.fromSet(MapSequence.fromMap(leftStarts).keySet())) {
        if (!(MapSequence.fromMap(leftEnds).get(a) - 1 < MapSequence.fromMap(leftStarts).get(b) || MapSequence.fromMap(leftEnds).get(b) - 1 < MapSequence.fromMap(leftStarts).get(a))) {
          ds.unite(a, b);
        }
        if (!(MapSequence.fromMap(rightEnds).get(a) - 1 < MapSequence.fromMap(rightStarts).get(b) || MapSequence.fromMap(rightEnds).get(b) - 1 < MapSequence.fromMap(rightStarts).get(a))) {
          ds.unite(a, b);
        }
      }
    }
    myChangeGroups = ListSequence.fromListWithValues(new ArrayList<ChangeGroup>(), Sequence.fromIterable(ds.getSets()).<ChangeGroup>select(new ISelector<Set<ModelChange>, ChangeGroup>() {
      public ChangeGroup select(Set<ModelChange> s) {
        return new ChangeGroup(leftStarts, leftEnds, rightStarts, rightEnds, SetSequence.fromSet(s).toListSequence(), myMergeContext);
      }
    }));
    myChangeGroups = ListSequence.fromList(myChangeGroups).sort(new ISelector<ChangeGroup, Comparable<?>>() {
      public Comparable<?> select(ChangeGroup g) {
        return g.getLeftStart();
      }
    }, true).toListSequence();
  }

  public List<ChangeGroup> getChangeGroups() {
    if (myChangeGroups == null) {
      calculateChangeGroups();
    }
    return myChangeGroups;
  }

  public DiffEditorComponent getLeftEditorComponent() {
    return myLeftEditorComponent;
  }

  public DiffEditorComponent getRightEditorComponent() {
    return myRightEditorComponent;
  }
}
