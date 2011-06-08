package jetbrains.mps.refactoring;

/*Generated by MPS */

import jetbrains.mps.smodel.SModel;
import java.util.Map;
import jetbrains.mps.smodel.SNodePointer;
import java.util.List;
import jetbrains.mps.smodel.StaticReference;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.util.Pair;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.DynamicReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.HackSNodeUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.persistence.RoleIdsComponent;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import java.util.ArrayList;

public class ModelLinkMap {
  private SModel myModel;
  private Map<SNodePointer, List<StaticReference>> myTargetMap = MapSequence.fromMap(new HashMap<SNodePointer, List<StaticReference>>());
  private Map<SNodePointer, List<SNode>> myNodeTypeMap = MapSequence.fromMap(new HashMap<SNodePointer, List<SNode>>());
  private Map<SNodePointer, List<SNode>> myNodeRoleMap = MapSequence.fromMap(new HashMap<SNodePointer, List<SNode>>());
  private Map<SNodePointer, List<SReference>> myRefRoleMap = MapSequence.fromMap(new HashMap<SNodePointer, List<SReference>>());
  private Map<SNodePointer, List<Pair<SNode, String>>> myPropNameMap = MapSequence.fromMap(new HashMap<SNodePointer, List<Pair<SNode, String>>>());
  private Map<SModelReference, List<DynamicReference>> myDynRefMap = MapSequence.fromMap(new HashMap<SModelReference, List<DynamicReference>>());

  public ModelLinkMap(SModel model) {
    myModel = model;
  }

  public ModelLinkMap build() {
    // build map based on already loaded model 
    for (SNode node : myModel.nodes()) {
      addRoleLocation(ptr(node.getRoleLink()), node);
      addTypeLocation(ptr(SNodeOperations.getConceptDeclaration(node)), node);
      for (String prop : SetSequence.fromSet(node.getPropertyNames())) {
        addNameLocation(ptr(node.getPropertyDeclaration(prop)), node, prop);
      }
      for (SReference ref : Sequence.fromIterable(SNodeOperations.getReferences(node))) {
        addRoleLocation(ptr(SLinkOperations.findLinkDeclaration(ref)), ref);
        if ((SReference) ref instanceof StaticReference) {
          addTargetLocation(ptr(SLinkOperations.getTargetNode(ref)), (StaticReference) (SReference) ref);
        } else {
          addDynamicReference(ref.getTargetSModelReference(), (DynamicReference) (SReference) ref);
        }
      }
    }
    return this;
  }

  public void addTargetLocation(SNodePointer ptr, StaticReference ref) {
    addValue(myTargetMap, ptr, ref);
  }

  public void addTypeLocation(SNodePointer ptr, SNode node) {
    addValue(myNodeTypeMap, ptr, node);
  }

  public void addRoleLocation(SNodePointer ptr, SNode node) {
    addValue(myNodeRoleMap, ptr, node);
  }

  public void addRoleLocation(SNodePointer ptr, SReference ref) {
    addValue(myRefRoleMap, ptr, ref);
  }

  public void addNameLocation(SNodePointer ptr, SNode node, String name) {
    addValue(myPropNameMap, ptr, new Pair<SNode, String>(node, name));
  }

  public void addDynamicReference(SModelReference model, DynamicReference ref) {
    addValue(myDynRefMap, model, ref);
  }

  public boolean moveNode(SNodePointer oldPtr, final SNodePointer newPtr) {
    boolean res = false;
    res |= move(myTargetMap, oldPtr, newPtr, new _FunctionTypes._void_P1_E0<StaticReference>() {
      public void invoke(StaticReference ref) {
        ref.setTargetSModelReference(newPtr.getModelReference());
        ref.setTargetNodeId(newPtr.getNodeId());
      }
    });
    res |= move(myNodeTypeMap, oldPtr, newPtr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode node) {
        String modelName = newPtr.getModelReference().getLongName();
        String name = NameUtil.shortNameFromLongName(node.getConceptFqName());
        HackSNodeUtil.setConceptFqName(node, NameUtil.longNameFromNamespaceAndShortName(modelName, name));
      }
    });
    move(myNodeRoleMap, oldPtr, newPtr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode n) {
        // do nothing 
      }
    });
    move(myRefRoleMap, oldPtr, newPtr, new _FunctionTypes._void_P1_E0<SReference>() {
      public void invoke(SReference r) {
        // do nothing 
      }
    });
    move(myPropNameMap, oldPtr, newPtr, new _FunctionTypes._void_P1_E0<Pair<SNode, String>>() {
      public void invoke(Pair<SNode, String> p) {
        // do nothing 
      }
    });
    return res;
  }

  public boolean deleteNode(SNodePointer ptr) {
    boolean res = false;
    res |= delete(myNodeTypeMap, ptr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode node) {
        SNodeOperations.deleteNode(node);
      }
    });
    res |= delete(myNodeRoleMap, ptr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode node) {
        SNodeOperations.deleteNode(node);
      }
    });
    res |= delete(myRefRoleMap, ptr, new _FunctionTypes._void_P1_E0<SReference>() {
      public void invoke(SReference ref) {
        ref.getSourceNode().removeReference(ref);
      }
    });
    res |= delete(myPropNameMap, ptr, new _FunctionTypes._void_P1_E0<Pair<SNode, String>>() {
      public void invoke(Pair<SNode, String> prop) {
        prop.o1.setProperty(prop.o2, null, false);
      }
    });
    return res;
  }

  public boolean setName(SNodePointer ptr, final String name) {
    boolean res = false;
    res |= setProp(myNodeTypeMap, ptr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode node) {
        String modelName = NameUtil.namespaceFromConceptFQName(node.getConceptFqName());
        HackSNodeUtil.setConceptFqName(node, NameUtil.conceptFQNameFromNamespaceAndShortName(modelName, name));
      }
    });
    res |= setProp(myPropNameMap, ptr, new _FunctionTypes._void_P1_E0<Pair<SNode, String>>() {
      public void invoke(Pair<SNode, String> prop) {
        // todo: rename correspondent property attribute role 
        String value = prop.o1.getPersistentProperty(prop.o2);
        prop.o1.setProperty(prop.o2, null, false);
        prop.o2 = name;
        prop.o1.setProperty(name, value, false);
      }
    });
    return res;
  }

  public boolean setRole(SNodePointer ptr, final String role) {
    // todo: rename correspondent link attribute roles 
    boolean res = false;
    res |= setProp(myNodeRoleMap, ptr, new _FunctionTypes._void_P1_E0<SNode>() {
      public void invoke(SNode node) {
        node.setRoleInParent(role);
      }
    });
    res |= setProp(myRefRoleMap, ptr, new _FunctionTypes._void_P1_E0<SReference>() {
      public void invoke(SReference ref) {
        ref.setRole(role);
      }
    });
    return res;
  }

  public boolean updateModelReference(SModelReference model, SModelReference newModel) {
    for (SModel.ImportElement element : ListSequence.fromList(myModel.importedModels())) {
    }
    return false;
  }

  public void fillRoleIdsComponent() {
    if (RoleIdsComponent.isEnabled()) {
      for (SModel.ImportElement i : ListSequence.fromList(myModel.getAdditionalModelVersions())) {
        RoleIdsComponent.modelVersionRead(i);
      }
      for (SNodePointer ptr : SetSequence.fromSet(MapSequence.fromMap(myNodeRoleMap).keySet())) {
        final SNodeId roleId = ptr.getNodeId();
        ListSequence.fromList(MapSequence.fromMap(myNodeRoleMap).get(ptr)).visitAll(new IVisitor<SNode>() {
          public void visit(SNode n) {
            RoleIdsComponent.nodeRoleRead(n, roleId);
          }
        });
      }
      for (SNodePointer ptr : SetSequence.fromSet(MapSequence.fromMap(myNodeTypeMap).keySet())) {
        final SNodeId conceptId = ptr.getNodeId();
        ListSequence.fromList(MapSequence.fromMap(myNodeTypeMap).get(ptr)).visitAll(new IVisitor<SNode>() {
          public void visit(SNode n) {
            RoleIdsComponent.conceptRead(n, conceptId);
          }
        });
      }
      for (SNodePointer ptr : SetSequence.fromSet(MapSequence.fromMap(myRefRoleMap).keySet())) {
        final SNodeId roleId = ptr.getNodeId();
        ListSequence.fromList(MapSequence.fromMap(myRefRoleMap).get(ptr)).visitAll(new IVisitor<SReference>() {
          public void visit(SReference r) {
            RoleIdsComponent.referenceRoleRead(r, roleId);
          }
        });
      }
      for (SNodePointer ptr : SetSequence.fromSet(MapSequence.fromMap(myPropNameMap).keySet())) {
        final SNodeId propId = ptr.getNodeId();
        ListSequence.fromList(MapSequence.fromMap(myPropNameMap).get(ptr)).visitAll(new IVisitor<Pair<SNode, String>>() {
          public void visit(Pair<SNode, String> nP) {
            RoleIdsComponent.propertyNameRead(nP.o1, nP.o2, propId);
          }
        });
      }
    }
  }

  private static <K, T> void addValue(Map<K, List<T>> map, K key, T value) {
    if (value == null) {
      return;
    }
    List<T> list = MapSequence.fromMap(map).get(key);
    if (list == null) {
      MapSequence.fromMap(map).put(key, list = ListSequence.fromList(new ArrayList<T>()));
    }
    ListSequence.fromList(list).addElement(value);
  }

  private static <T> boolean move(Map<SNodePointer, List<T>> map, SNodePointer ptr, SNodePointer newPtr, final _FunctionTypes._void_P1_E0<? super T> f) {
    List<T> list = map.remove(ptr);
    if (list == null) {
      return false;
    }
    ListSequence.fromList(list).visitAll(new IVisitor<T>() {
      public void visit(T it) {
        f.invoke(it);
      }
    });
    MapSequence.fromMap(map).put(newPtr, list);
    return true;
  }

  private static <T> boolean delete(Map<SNodePointer, List<T>> map, SNodePointer ptr, final _FunctionTypes._void_P1_E0<? super T> f) {
    List<T> list = map.remove(ptr);
    if (list == null) {
      return false;
    }
    ListSequence.fromList(list).visitAll(new IVisitor<T>() {
      public void visit(T it) {
        f.invoke(it);
      }
    });
    return true;
  }

  private static <T> boolean setProp(Map<SNodePointer, List<T>> map, SNodePointer ptr, final _FunctionTypes._void_P1_E0<? super T> f) {
    List<T> list = MapSequence.fromMap(map).get(ptr);
    if (list == null) {
      return false;
    }
    ListSequence.fromList(list).visitAll(new IVisitor<T>() {
      public void visit(T it) {
        f.invoke(it);
      }
    });
    return true;
  }

  private static SNodePointer ptr(SNode node) {
    return ((node == null) ?
      null :
      new SNodePointer(node)
    );
  }
}
