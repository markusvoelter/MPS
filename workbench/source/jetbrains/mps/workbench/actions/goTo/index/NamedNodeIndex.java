/*
 * Copyright 2003-2011 JetBrains s.r.o.
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
package jetbrains.mps.workbench.actions.goTo.index;

import com.intellij.util.indexing.ID;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodeUtil;
import jetbrains.mps.util.Condition;
import jetbrains.mps.util.ConditionalIterable;
import jetbrains.mps.workbench.actions.goTo.index.descriptor.BaseSNodeDescriptor;
import org.jetbrains.annotations.NonNls;

import java.util.ArrayList;
import java.util.List;

public class NamedNodeIndex extends BaseSNodeDescriptorIndex {
  @NonNls
  public static final ID<Integer, List<BaseSNodeDescriptor>> NAME = ID.create("NamedNodeIndex");

  public ID<Integer, List<BaseSNodeDescriptor>> getName() {
    return NAME;
  }

  public Iterable<SNode> getRootsToIterate(SModel model) {
    return new ConditionalIterable<SNode>(model.nodes(), new SNodeCondition());
  }

  private static class SNodeCondition implements Condition<SNode> {
    public boolean met(SNode node) {
      return node.isRoot() || node.getPersistentProperty(SNodeUtil.property_INamedConcept_name) != null;
    }
  }
}
