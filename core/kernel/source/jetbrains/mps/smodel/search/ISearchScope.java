package jetbrains.mps.smodel.search;

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Igor Alshannikov
 * Jan 19, 2006
 */
public interface ISearchScope {
  @NotNull
  List<SNode> getNodes(Condition<SNode> condition);

  @NotNull
  List<INodeAdapter> getAdapters(Condition<INodeAdapter> condition);

  @NotNull
  <T extends INodeAdapter> List<T> getAdapters(Class<T> adapterClass);

  @Nullable
  SNode findNode(Condition<SNode> condition);

  @Nullable
  INodeAdapter findAdapter(Condition<INodeAdapter> condition);

  @NotNull
  List<SNode> getNodes();

  IReferenceInfoResolver getReferenceInfoResolver(SNode referenceNode, AbstractConceptDeclaration targetConcept);
}
