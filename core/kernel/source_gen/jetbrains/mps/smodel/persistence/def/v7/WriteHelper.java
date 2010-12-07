package jetbrains.mps.smodel.persistence.def.v7;

/*Generated by MPS */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModelReference;
import java.util.Map;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.StaticReference;

public class WriteHelper {
  public static final char MODEL_SEPARATOR_CHAR = '.';
  public static final char VERSION_SEPARATOR_CHAR = ':';
  public static final String DYNAMIC_REFERENCE_ID = "^";
  private static final int HASH_BASE = 10 + 26;
  private static final int HASH_SIZE = HASH_BASE * HASH_BASE * HASH_BASE * HASH_BASE;
  protected static Log log = LogFactory.getLog(WriteHelper.class);

  private SModelReference myModelRef;
  private Map<SModelReference, String> myModelIndex;
  private Set<Integer> myUsedIndexes;

  public WriteHelper(SModelReference modelRef) {
    myModelIndex = MapSequence.fromMap(new HashMap<SModelReference, String>());
    myUsedIndexes = SetSequence.fromSet(new HashSet<Integer>());
    myModelRef = modelRef;
  }

  public void addModelReference(@NotNull SModelReference model) {
    int hash = (model.hashCode() % HASH_SIZE + HASH_SIZE) % HASH_SIZE;
    while (SetSequence.fromSet(myUsedIndexes).contains(hash)) {
      hash = (hash + 1) % HASH_SIZE;
    }
    SetSequence.fromSet(myUsedIndexes).addElement(hash);
    MapSequence.fromMap(myModelIndex).put(model, Integer.toString(hash, HASH_BASE));
  }

  public String getImportIndex(@NotNull SModelReference model) {
    return MapSequence.fromMap(myModelIndex).get(model);
  }

  @NotNull
  private String genReferenceString(@NotNull SModelReference ref, @NotNull String text) {
    String index = MapSequence.fromMap(myModelIndex).get(ref);
    if (index == null) {
      if (log.isErrorEnabled()) {
        log.error("model " + ref + " not found in index");
      }
      return encode(text);
    }
    StringBuilder result = new StringBuilder();
    if (!(ref.equals(myModelRef))) {
      result.append(index).append(MODEL_SEPARATOR_CHAR);
    }
    return result.append(encode(text)).toString();
  }

  @NotNull
  private String genConceptReferenceString(@Nullable SNode concept, @NotNull String fqName) {
    // return fqName prefixed with "." if we can't find model or name of concept 
    String name = SPropertyOperations.getString(concept, "name");
    if (name == null) {
      return MODEL_SEPARATOR_CHAR + fqName;
    }
    String index = MapSequence.fromMap(myModelIndex).get(SNodeOperations.getModel(concept).getSModelReference());
    if (index == null) {
      return MODEL_SEPARATOR_CHAR + fqName;
    }
    return new StringBuilder().append(index).append(MODEL_SEPARATOR_CHAR).append(name).toString();
  }

  @NotNull
  public String genReferenceId(@NotNull SModelReference ref, @NotNull SNodeId nodeId) {
    return genReferenceString(ref, nodeId.toString());
  }

  @NotNull
  public String genReferenceId(@NotNull SNode node) {
    return genReferenceId(SNodeOperations.getModel(node).getSModelReference(), node.getSNodeId());
  }

  @Nullable
  public String genReferenceId(@Nullable BaseAdapter adapter) {
    return (adapter == null ?
      null :
      genReferenceId(adapter.getNode())
    );
  }

  public String genType(@NotNull SNode node) {
    return genConceptReferenceString(SNodeOperations.getConceptDeclaration(node), node.getConceptFqName());
  }

  public String genTypeId(@NotNull SNode node) {
    SNode concept = SNodeOperations.getConceptDeclaration(node);
    return ((concept == null) ?
      null :
      genReferenceId(concept)
    );
  }

  public String genRole(@NotNull SNode node) {
    return node.getRole_();
  }

  public String genRole(@NotNull SReference ref) {
    return SLinkOperations.getRole(ref);
  }

  public String genRoleId(@NotNull SNode node) {
    return genReferenceId(node.getRoleLink());
  }

  public String genRoleId(@NotNull SReference ref) {
    return genReferenceId(SLinkOperations.findLinkDeclaration(ref));
  }

  public String genName(@NotNull SNode node, @NotNull String prop) {
    return prop;
  }

  public String genNameId(@NotNull SNode node, @NotNull String prop) {
    return genReferenceId(node.getPropertyDeclaration(prop));
  }

  public String genTarget(@NotNull SReference ref) {
    String target = (ref instanceof StaticReference ?
      String.valueOf(ref.getTargetNodeId()) :
      DYNAMIC_REFERENCE_ID
    );
    SModelReference targetModel = ref.getTargetSModelReference();
    return (targetModel == null ?
      target :
      genReferenceString(targetModel, target)
    );
  }

  public static String encode(String s) {
    return s.replace("%", "%p").replace(":", "%c").replace(".", "%d");
  }

  public static String decode(String s) {
    return s.replace("%d", ".").replace("%c", ":").replace("%p", "%");
  }
}
