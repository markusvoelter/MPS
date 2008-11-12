package jetbrains.mps.typesystem.inference.util;

import jetbrains.mps.lang.pattern.util.MatchingUtil;
import jetbrains.mps.typesystem.inference.IWrapper;
import jetbrains.mps.util.misc.hash.*;
import jetbrains.mps.util.misc.hash.HashSet;

import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.Collection;


/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 29.08.2007
 * Time: 16:50:09
 * To change this template use File | Settings | File Templates.
 */
public class StructuralWrapperMap<T> implements Map<IWrapper, T> {
  private Map<IWrapperWrapper, IWrapperWrapper> myMap = new HashMap<IWrapperWrapper, IWrapperWrapper>();
  private Map<IWrapper, T> myWrapperMap = new HashMap<IWrapper,T>();
  private Map<IWrapper, IWrapper> myRepresentatorMap = new HashMap<IWrapper, IWrapper>();
  private Set<IWrapper> myAbsent = new HashSet<IWrapper>();

  public int size() {
    return myMap.size();
  }

  public boolean isEmpty() {
    return myMap.isEmpty();
  }

  public boolean containsValue(Object value) {
    return myMap.containsValue(value);
  }

  public void putAll(Map<? extends IWrapper, ? extends T> t) {
    throw new UnsupportedOperationException();
  }

  public Set<IWrapper> keySet() {
    return Collections.unmodifiableSet(myWrapperMap.keySet());
  }

  public void clear() {
    myMap.clear();
    myWrapperMap.clear();
    myAbsent.clear();
  }

  public Collection<T> values() {
    return myWrapperMap.values();
  }

  public Set<Entry<IWrapper, T>> entrySet() {
    throw new UnsupportedOperationException();
  }

  public T get(Object key) {
    IWrapper w = (IWrapper) key;
    IWrapper representator = myRepresentatorMap.get(w);
    if (representator != null) {
      return myWrapperMap.get(representator);
    }

    if (myAbsent.contains(w)) {
      return null;
    }

    IWrapperWrapper wrapper = myMap.get(new IWrapperWrapper(w));
    if (wrapper == null) {
      myAbsent.add(w);
      return null;
    } else {
      myRepresentatorMap.put(w, wrapper.getWrapper());
      return myWrapperMap.get(wrapper.getWrapper());
    }
  }

  public T put(IWrapper keyWrapper, T value) {
    IWrapperWrapper wrapper = new IWrapperWrapper(keyWrapper);
    myMap.put(wrapper, wrapper);
    myRepresentatorMap.put(keyWrapper,  keyWrapper);
    T result = myWrapperMap.put(keyWrapper, value);
    invalidateCache();
    return result;
   }

  public T remove(Object key) {
    if (!(key instanceof IWrapper)) return null;
    myMap.remove((IWrapperWrapper) key);
    T result = myWrapperMap.remove(((IWrapperWrapper) key).getWrapper());
    invalidateCache();
    return result;
  }

  public boolean containsKey(Object key) {
    if (!(key instanceof IWrapper)) return false;
    return myMap.containsKey(new IWrapperWrapper((IWrapper) key));
  }

  private void invalidateCache() {
    myAbsent.clear();
  }
}
