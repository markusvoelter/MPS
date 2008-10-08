package jetbrains.mps.smodel;

import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.util.Condition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.List;

/**
 * Igor Alshannikov
 * Date: Mar 5, 2007
 */
public interface INodeAdapter {
  @NotNull
  SNode getNode();

  String getDebugText();

  String getName();

  String getShortConceptName();

  SModel getModel();

  String getId();

  String getAlias();

  INodeAdapter getParent();

  <BA extends INodeAdapter> BA findParent(Class<BA> cls);

  <BA extends INodeAdapter> BA getParent(Class<BA> cls);

  <BA extends INodeAdapter> BA getParent(Class<BA> cls, boolean checkThis);

  INodeAdapter findParent(Condition<INodeAdapter> ba);

  INodeAdapter findFirstParent(Class[] classes);

  <T extends INodeAdapter> List<T> findParents(Class<T> aClass);

  AbstractConceptDeclaration getConceptDeclarationAdapter();

  void replaceChild(INodeAdapter oldChild, INodeAdapter newChild);

  INodeAdapter getContainingRoot();

  @NotNull
  <E extends INodeAdapter> List<E> getDescendants(Class<E> cls);

  @NotNull
  <E extends INodeAdapter> List<E> getDescendants();

  @NotNull
  <E extends INodeAdapter> List<E> getDescendants(Condition<INodeAdapter> condition);

  void delete();

  void addNextSibling(INodeAdapter a);

  void addPrevSibling(INodeAdapter a);

  boolean hasConceptProperty(String propertyName);

  String getConceptProperty(String propertyName);

  String getProperty(@NotNull String propertyName);

  void setProperty(@NotNull String propertyName, String propertyValue);

  void removeChild(@NotNull INodeAdapter child);

  void addChild(@NotNull String role,
                @NotNull INodeAdapter child);

  void insertChild(@Nullable INodeAdapter anchorChild,
                   @NotNull String role,
                   @NotNull INodeAdapter child,
                   boolean insertBefore);

  void insertChild(@Nullable INodeAdapter anchorChild,
                   @NotNull String role,
                   @NotNull INodeAdapter child);

  int getChildCount(@NotNull String role);

  List<INodeAdapter> getChildren();

  @NotNull
    <N extends INodeAdapter> List<N> getChildren(Class<N> cls);

  <T extends INodeAdapter> List<T> getChildren(@NotNull String role);

  <T extends INodeAdapter> Iterator<T> children(@NotNull String role);

  List<INodeAdapter> getAllAttributes();

  @Nullable
  INodeAdapter getAttribute(String role);

  @NotNull
  List<? extends INodeAdapter> getAttributes(String role);

  void setAttribute(String role, INodeAdapter attribute);

  void addAttribute(String role, INodeAdapter attribute);

  INodeAdapter getPropertyAttribute(String role, String propertyName);

  @NotNull
  List<? extends INodeAdapter> getPropertyAttributes(String role, String propertyName);

  void setPropertyAttribute(String role, String propertyName, INodeAdapter propertyAttribute);

  void addPropertyAttribute(String role, String propertyName, INodeAdapter propertyAttribute);

  INodeAdapter getLinkAttribute(String role, String propertyName);

  void setLinkAttribute(String role, String propertyName, INodeAdapter propertyAttribute);

  void addLinkAttribute(String role, String propertyName, INodeAdapter propertyAttribute);

  List<? extends INodeAdapter> getLinkAttributes(String role, String linkRole);

  String getRole_();

  Object getUserObject(@NotNull Object key);

  void removeUserObject(@NotNull Object key);

  void putUserObject(@NotNull Object key, @Nullable Object value);

  boolean isRoot();

  List<SNode> getConceptLinkTargets(String linkName, boolean lookupHierarchy);

  String getConceptFQName();
}
