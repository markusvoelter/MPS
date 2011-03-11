package jetbrains.mps.vcs.diff.ui;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.vcs.diff.changes.ModelChange;
import jetbrains.mps.vcs.diff.changes.ChangeType;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.vcs.diff.MergeContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class ChangeGroup {
  private int myLeftStart;
  private int myLeftEnd;
  private int myRightStart;
  private int myRightEnd;
  private List<ModelChange> myChanges;
  private ChangeType myChangeType;
  private boolean myConflicted;

  public ChangeGroup(final Map<ModelChange, Integer> leftStarts, final Map<ModelChange, Integer> leftEnds, final Map<ModelChange, Integer> rightStarts, final Map<ModelChange, Integer> rightEnds, List<ModelChange> changes, @Nullable final MergeContext mergeContext) {
    myLeftStart = ListSequence.fromList(changes).<Integer>select(new ISelector<ModelChange, Integer>() {
      public Integer select(ModelChange ch) {
        return MapSequence.fromMap(leftStarts).get(ch);
      }
    }).reduceLeft(new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer a, Integer b) {
        return Math.min(a, b);
      }
    });
    myLeftEnd = ListSequence.fromList(changes).<Integer>select(new ISelector<ModelChange, Integer>() {
      public Integer select(ModelChange ch) {
        return MapSequence.fromMap(leftEnds).get(ch);
      }
    }).reduceLeft(new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer a, Integer b) {
        return Math.max(a, b);
      }
    });
    myRightStart = ListSequence.fromList(changes).<Integer>select(new ISelector<ModelChange, Integer>() {
      public Integer select(ModelChange ch) {
        return MapSequence.fromMap(rightStarts).get(ch);
      }
    }).reduceLeft(new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer a, Integer b) {
        return Math.min(a, b);
      }
    });
    myRightEnd = ListSequence.fromList(changes).<Integer>select(new ISelector<ModelChange, Integer>() {
      public Integer select(ModelChange ch) {
        return MapSequence.fromMap(rightEnds).get(ch);
      }
    }).reduceLeft(new ILeftCombinator<Integer, Integer>() {
      public Integer combine(Integer a, Integer b) {
        return Math.max(a, b);
      }
    });

    myChanges = changes;
    myChangeType = ListSequence.fromList(changes).<ChangeType>select(new ISelector<ModelChange, ChangeType>() {
      public ChangeType select(ModelChange ch) {
        return ch.getType();
      }
    }).reduceLeft(new ILeftCombinator<ChangeType, ChangeType>() {
      public ChangeType combine(ChangeType a, ChangeType b) {
        return (a == b ?
          a :
          ChangeType.CHANGE
        );
      }
    });
    myConflicted = mergeContext != null && ListSequence.fromList(changes).any(new IWhereFilter<ModelChange>() {
      public boolean accept(ModelChange ch) {
        return Sequence.fromIterable(mergeContext.getConflictedWith(ch)).isNotEmpty();
      }
    });
  }

  public int getLeftStart() {
    return myLeftStart;
  }

  public int getLeftEnd() {
    return myLeftEnd;
  }

  public int getRightStart() {
    return myRightStart;
  }

  public int getRightEnd() {
    return myRightEnd;
  }

  public int getStart(boolean left) {
    return (left ?
      myLeftStart :
      myRightStart
    );
  }

  public int getEnd(boolean left) {
    return (left ?
      myLeftEnd :
      myRightEnd
    );
  }

  public List<ModelChange> getChanges() {
    return myChanges;
  }

  public ChangeType getChangeType() {
    return myChangeType;
  }

  public boolean isConflicted() {
    return myConflicted;
  }
}
