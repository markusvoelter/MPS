/*
 * Created Jan 15, 2007 at 1:45:08 PM
 */
package jetbrains.mps.ypath.runtime.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jetbrains.mps.ypath.runtime.IFeatureDescriptor;
import jetbrains.mps.ypath.runtime.ITreeTraversal;



/**
 * @author fyodor
 */
public class ParentTreeTraversal<T> extends AbstractChainTreeTraversal<T> implements ITreeTraversal<T> {
    
    public ParentTreeTraversal (ITreeTraversal<T> source) {
        super (source);
    }
    
    public ParentTreeTraversal (ITreeTraversal<T> source, IFeatureDescriptor<T> fd) {
        super (source, fd);
    }

    public Iterator<T> iterator() {
        return new ParentsIterator(getSourceTraversal().iterator());
    }
    
    private class ParentsIterator implements Iterator<T> {
        
        private final Iterator<T> sourceIterator;
        private Iterator<T> currentParentsIterator = null;
        private T nextNode = null;
        private boolean hasNextNode = false;

        private ParentsIterator (Iterator<T> source) {
            this.sourceIterator = source;
            moveToNext();
        }
        
        private void moveToNext() {
            this.nextNode = null;
            this.hasNextNode = false;
            
            while ((currentParentsIterator == null || !currentParentsIterator.hasNext()) &&
                    sourceIterator.hasNext()) 
            {
                this.currentParentsIterator = null;
                T node = sourceIterator.next();
                this.currentParentsIterator = getOppositeContents(node).iterator();
            }
            
            if (currentParentsIterator != null && currentParentsIterator.hasNext()) {
                this.nextNode = currentParentsIterator.next();
                this.hasNextNode = true;
            }
        }

        public boolean hasNext() {
            return hasNextNode;
        }
        
        public T next() {
            if (!hasNextNode) {
                throw new NoSuchElementException ();
            }
            T tmp = nextNode;
            moveToNext();
            return tmp;
        }
        
        public void remove() {
            throw new UnsupportedOperationException ();
        }
        
    }

}
