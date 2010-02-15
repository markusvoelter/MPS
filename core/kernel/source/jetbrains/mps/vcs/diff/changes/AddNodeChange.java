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
package jetbrains.mps.vcs.diff.changes;

import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeId;

import java.util.List;
import java.util.Arrays;

public class AddNodeChange extends NewNodeChange {

  private SNodeId myPreviousNode;
  private String myPreviousRole;

  private boolean mySubstitution; // This field is used for ChangesManager

  public AddNodeChange(String conceptFqName, SNodeId nodeId, String role, SNodeId parentId,
                       SNodeId prevNode, String prevRole, boolean substitution) {
    super(conceptFqName, nodeId, role, parentId);
    myPreviousNode = prevNode;
    myPreviousRole = prevRole;
    mySubstitution = substitution;
  }

  public AddNodeChange(String conceptFqName, SNodeId nodeId, String role, SNodeId parentId,
                       SNodeId prevNode, String prevRole) {
    this(conceptFqName, nodeId, role, parentId, prevNode, prevRole, false);
  }

  public SNodeId getPreviousNode() {
    return myPreviousNode;
  }

  public String toString() {
    return "add node " + getAffectedNodeId() + " in role " + getNodeRole() + " before " + getPreviousNode()
      + (mySubstitution ? " (substituted)" : "");
  }

  public boolean apply(SModel m) {
    SNode parent = m.getNodeById(getNodeParent());
    if (parent == null) {
      return false;
    }

    SNodeId prevNode = getPreviousNode();
    SNode prev = null;
    if (prevNode != null) {
      prev = m.getNodeById(prevNode);
    } else {
      if (myPreviousRole != null) {
        List<SNode> children = parent.getChildren(myPreviousRole);
        if (children.size() > 0) {
          prev = children.get(children.size() - 1);
        }
      }
    }

    SNode n = SModelUtil_new.instantiateConceptDeclaration(getConceptFqName(), m, GlobalScope.getInstance(), false);
    assert n != null;
    n.setId(getAffectedNodeId());

    parent.insertChild(prev, getNodeRole(), n);
    return true;
  }

  @Override
  public List<SNodeId> getDependencies() {
    return Arrays.asList(getNodeParent(), getPreviousNode());
  }

  public boolean isSubstitution() {
    return mySubstitution;
  }
}
