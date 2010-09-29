/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.generator.impl.cache;

import jetbrains.mps.generator.TransientSModel;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.InternUtil;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Evgeny Gryaznov, Sep 22, 2010
 */
public class TransientModelPersistence {

  private static final int VERSION = 1;
  private static final String LOCAL = "$local$";

  private final String myModelReference;

  public TransientModelPersistence(@NotNull String modelReference) {
    myModelReference = modelReference;
  }

  public void saveModel(SModel sourceModel, ModelOutputStream os) throws IOException {
    os.writeInt(VERSION);
    os.writeString(sourceModel.getSModelReference().toString());
    saveNodes(sourceModel.getRoots(), os);
  }

  public SModel loadModel(ModelInputStream is) throws IOException, ClassNotFoundException {
    int version = is.readInt();
    if (version != VERSION) {
      return null;
    }

    String modelReference = is.readString();
    SModel m = new TransientSModel(SModelReference.fromString(modelReference));
    m.setLoading(true);
    List<SNode> roots = loadNodes(m, is);
    for (SNode root : roots) {
      m.addRoot(root);
    }
    return m;
  }

  private void saveNodes(Collection<SNode> nodes, ModelOutputStream os) throws IOException {
    os.writeInt(nodes.size());
    for (SNode n : nodes) {
      saveNode(n, os);
    }
  }

  private List<SNode> loadNodes(SModel model, ModelInputStream is) throws IOException, ClassNotFoundException {
    int size = is.readInt();
    List<SNode> nodes = new ArrayList<SNode>(size);
    for (int i = 0; i < size; i++) {
      nodes.add(loadNode(model, is));
    }
    return nodes;
  }

  private SNode loadNode(SModel model, ModelInputStream is) throws ClassNotFoundException, IOException {
    String conceptFqName = is.readString();
    String nodeId = is.readString();
    String nodeRole = is.readString();
    if (is.readByte() != '{') {
      throw new IOException("bad stream, no '{'");
    }

    SNode node = new SNode(model, conceptFqName, true);
    node.setRoleInParent(nodeRole);
    node.setId(SNodeId.fromString(nodeId));

    int properties = is.readInt();
    for (; properties > 0; properties--) {
      String key = is.readString();
      String value = is.readString();
      node.setProperty(InternUtil.intern(key), InternUtil.intern(value), false);
    }

    int references = is.readInt();
    for (; references > 0; references--) {
      int kind = is.readInt();
      String targetNodeId = kind == 1 ? is.readString() : null;

      String role = is.readString();
      String targetModelRef = is.readString();
      if(targetModelRef != null && LOCAL.equals(targetModelRef)) {
        targetModelRef = myModelReference;
      }
      String resolveInfo = is.readString();
      if (kind == 1) {
        node.addReference(
          new StaticReference(
            role,
            node,
            targetModelRef != null ? SModelReference.fromString(targetModelRef) : null,
            targetNodeId != null ? SNodeId.fromString(targetNodeId) : null,
            resolveInfo));
      } else if (kind == 2) {
        node.addReference(
          new DynamicReference(
            role,
            node,
            SModelReference.fromString(targetModelRef),
            resolveInfo));
      } else {
        throw new IOException("unknown reference type");
      }
    }

    List<SNode> children = loadNodes(model, is);
    for (SNode child : children) {
      String role = child.getRole_();
      assert role != null;
      node.addChild(role, child);
    }

    if (is.readByte() != '}') {
      throw new IOException("bad stream, no '}'");
    }
    return node;
  }

  private void saveNode(SNode node, ModelOutputStream os) throws IOException {
    os.writeString(node.getConceptFqName());
    os.writeString(node.getId());
    os.writeString(node.getRole_());
    os.writeByte('{');

    Map<String, String> properties = node.getProperties();
    os.writeInt(properties.size());
    for (Entry<String, String> entry : properties.entrySet()) {
      os.writeString(entry.getKey());
      os.writeString(entry.getValue());
    }

    Collection<SReference> refs = node.getReferencesIterable();
    os.writeInt(refs.size());
    for (SReference reference : refs) {
      SModelReference targetModelReference = reference.getTargetSModelReference();
      if (reference instanceof StaticReference) {
        os.writeInt(1);
        SNodeId targetId = reference.getTargetNodeId();
        os.writeString(targetId != null ? targetId.toString() : null);
      } else if (reference instanceof DynamicReference) {
        os.writeInt(2);
      } else {
        throw new IOException("cannot store reference: " + reference.toString());
      }
      os.writeString(reference.getRole());
      String targetModelRef = targetModelReference != null ? targetModelReference.toString() : null;
      os.writeString(targetModelRef != null && targetModelRef.equals(myModelReference) ? LOCAL : targetModelRef);
      os.writeString(reference.getResolveInfo());
    }

    saveNodes(node.getChildren(), os);
    os.writeByte('}');
  }
}
