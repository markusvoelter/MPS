package jetbrains.mps.ypath.runtime.internal;

/*Generated by MPS */

import jetbrains.mps.ypath.runtime.ITreeTraversal;
import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ChildrenTreeTraversal<T> extends AbstractChainTreeTraversal<T> implements ITreeTraversal<T> {
  public ChildrenTreeTraversal(ITreeTraversal<T> source, IFeatureDescriptor<T> feature) {
    super(source, feature);
  }

  public Iterator<T> iterator() {
    return new ChildrenTreeTraversal.ChildrenIterator(getSourceTraversal().iterator());
  }

  private class ChildrenIterator implements Iterator<T> {
    private final Iterator<T> sourceIterator;
    private Iterator<T> childrenIterator = null;
    private T nextNode = null;
    private boolean hasNextNode = false;

    private ChildrenIterator(Iterator<T> source) {
      sourceIterator = source;
      moveToNext();
    }

    private void moveToNext() {
      nextNode = null;
      hasNextNode = false;
      while ((childrenIterator == null || !(childrenIterator.hasNext())) && sourceIterator.hasNext()) {
        childrenIterator = null;
        T node = sourceIterator.next();
        childrenIterator = getDirectContents(node).iterator();
      }
      if (childrenIterator != null && childrenIterator.hasNext()) {
        nextNode = childrenIterator.next();
        hasNextNode = true;
      }
    }

    public boolean hasNext() {
      return hasNextNode;
    }

    public T next() {
      if (!(hasNextNode)) {
        throw new NoSuchElementException();
      }
      T tmp = nextNode;
      moveToNext();
      return tmp;
    }

    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
