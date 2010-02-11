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
package jetbrains.mps.ide.findusages.findalgorithm.finders;

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.holders.IHolder;
import jetbrains.mps.ide.findusages.model.holders.NodeHolder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IInterfacedFinder;
import jetbrains.mps.ide.findusages.FindersManager;
import jetbrains.mps.ide.findusages.view.optionseditor.FindUsagesDialog;
import jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationHelper;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

import java.util.*;

public abstract class GeneratedFinder implements IInterfacedFinder {
  private static final Logger LOG = Logger.getLogger(GeneratedFinder.class);

  public boolean isApplicable(SNode node) {
    return true;
  }

  public boolean isVisible(SNode node) {
    return true;
  }

  public String getLongDescription() {
    return "";
  }

  public SNode getNodeToNavigate() {
    final SNode[] finderNode = new SNode[]{null};

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        finderNode[0] = FindersManager.getInstance().getNodeByFinder(GeneratedFinder.this);
      }
    });

    return finderNode[0];
  }

  public boolean canNavigate() {
    return true;
  }

  protected abstract void doFind(SNode node, IScope scope, List<SNode> _results, ProgressIndicator indicator);

  public void getSearchedNodes(SNode node, IScope scope, List<SNode> _results) {
    _results.add(node);
  }

  public String getNodeCategory(SNode node) {
    return "Uncategorized";
  }

  public SearchResults<SNode> find(SearchQuery query, ProgressIndicator indicator) {
    SearchResults<SNode> results = new SearchResults<SNode>();
    IHolder holder = query.getObjectHolder();
    assert holder instanceof NodeHolder;
    SNode node = ((NodeHolder) holder).getObject();
    boolean rightConcept = node.isInstanceOfConcept(getConcept());
    if (!(rightConcept)) {
      LOG.error(
        "Trying to use finder that is not applicable to the concept. Returning empty results." +
          "[finder: \"" + this.getDescription() + "\"; " +
          "concept: " + node.getConceptFqName(),
        new Exception()
      );
    } else {
      boolean isApplicable = this.isApplicable(node);
      if (!(isApplicable)) {
        LOG.error(
          "Trying to use finder that is not applicable to the node. Returning empty results." +
            "[finder: \"" + this.getDescription() + "\"; " +
            "node: " + node.toString(),
          new Exception()
        );
      } else {
        List<SNode> resSN = new ArrayList<SNode>();
        getSearchedNodes(node, query.getScope(), resSN);
        for (SNode resnode : resSN) {
          results.getSearchedNodes().add(resnode);
        }

        List<SNode> res = new ArrayList<SNode>();
        doFind(node, query.getScope(), res, indicator);
        Collections.sort(res, getComparator());
        for (SNode resnode : res) {
          results.getSearchResults().add(new SearchResult<SNode>(resnode, getNodeCategory(resnode)));
        }
      }
    }
    return results;
  }

  private Comparator<SNode> getComparator() {
    return new Comparator<SNode>() {
      private boolean fromSameCollection(SNode node1, SNode node2) {
        return EqualUtil.equals(node1.getRole_(), node2.getRole_());
      }

      private int compareWithoutEditor(SNode ancestor, SNode node1, SNode node2) {
        Integer index1 = ancestor.getIndexOfChild(node1);
        Integer index2 = ancestor.getIndexOfChild(node2);
        return index1 - index2;
      }

      private int compareWithEditor(SNode root, SNode node1, SNode node2) {
        AbstractConceptDeclaration conceptDeclaration = root.getConceptDeclarationAdapter();
        SModel structureModel = conceptDeclaration.getModel();
        Language language = (Language) structureModel.getModelDescriptor().getModule();
        SModel editorModel = language.getEditorModelDescriptor().getSModel();
        ConceptEditorDeclaration conceptEditorDeclaration = GoToEditorDeclarationHelper.findEditorDeclaration(editorModel, conceptDeclaration);
        return 0;
      }

      public int compare(SNode o1, SNode o2) {
        if (!EqualUtil.equals(o1.getContainingRoot(), o2.getContainingRoot())) {
          return 0;
        }
        List<SNode> anc1 = o1.getAncestors(true);
        List<SNode> anc2 = o2.getAncestors(true);
        for (int i1 = 0; i1 < anc1.size(); i1++) {
          if (i1 == 0) continue;
          for (int i2 = 0; i2 < anc2.size(); i2++) {
            if (i2 == 0) continue;
            if (EqualUtil.equals(anc1.get(i1), anc2.get(i2))) {
              SNode ancestor = anc1.get(i1);
              SNode node1 = anc1.get(i1 - 1);
              SNode node2 = anc2.get(i2 - 1);
              if (fromSameCollection(node1, node2)) {
                return compareWithoutEditor(ancestor, node1, node2);
              } else {
                return compareWithEditor(node1.getContainingRoot(), node1, node2);
              }
            }
          }
        }
        return 0;
      }
    };
  }

}
