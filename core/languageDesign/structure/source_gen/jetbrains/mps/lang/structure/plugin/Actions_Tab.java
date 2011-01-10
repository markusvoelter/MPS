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
package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tabbedEditor.BaseMultiTab;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class Actions_Tab extends BaseMultiTab {
  public Actions_Tab(SNode baseNode) {
    super(baseNode);
    ConceptEditorHelper.addMultitabbedListener(Actions_Tab.this, LanguageAspect.ACTIONS, true);
  }

  public String getTitle() {
    return "Actions";
  }

  public Character getShortcutChar() {
    return 'A';
  }

  public String getNullText() {
    return "No Actions";
  }

  public boolean canCreate() {
    return false;
  }

  public List<SNode> getNodes(SNode node) {
    return AbstractConceptDeclaration_Behavior.call_findConceptAspectCollection_1567570417158062208(node, ConceptEditorHelper.getScope(Actions_Tab.this), LanguageAspect.ACTIONS);
  }

  public String getTabTextForNode(SNode node) {
    if (node.getName() != null) {
      return node.getName();
    } else {
      return node.toString();
    }
  }

  public List<SNode> getAvailableConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.ACTIONS, node);
  }

  public SNode createNode(final SNode node, final boolean ask, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.ACTIONS, node, concept, Actions_Tab.this);
  }
}
