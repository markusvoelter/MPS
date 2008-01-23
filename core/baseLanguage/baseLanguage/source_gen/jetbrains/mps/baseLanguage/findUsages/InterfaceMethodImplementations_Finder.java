package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.smodel.SNodePointer;

import java.util.List;

import jetbrains.mps.ide.findusages.model.result.SearchResult;

import java.util.ArrayList;

import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;

import java.util.Set;
import java.util.HashSet;

import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.baseLanguage.constraints.Type_Behavior;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;

public class InterfaceMethodImplementations_Finder extends BaseFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.InterfaceMethodImplementations_Finder");

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration";
  }

  public String getDescription() {
    return "Interface Method Implementations";
  }

  public boolean isApplicable(SNode node) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface") && SNodeOperations.hasRole(node, "jetbrains.mps.baseLanguage.structure.Interface", "method");
  }

  public boolean isVisible() {
    return true;
  }

  public SearchResults find(SearchQuery searchQuery) {
    SearchResults global_results = new SearchResults();
    {
      SNode searchedNode = (SNode) searchQuery.getNode();
      global_results.getSearchedNodePointers().add(new SNodePointer(searchedNode));
      List<SearchResult> implementors = new ArrayList<SearchResult>();
      try {
        BaseFinder finder_10 = (BaseFinder) Class.forName("jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder").newInstance();
        // TODO: check for right concept
        boolean rightConcept = true;
        if (!(rightConcept)) {
          InterfaceMethodImplementations_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + finder_10.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
        } else {
          boolean isApplicable = finder_10.isApplicable(SNodeOperations.getParent(searchedNode, null, false, false));
          if (!(isApplicable)) {
            InterfaceMethodImplementations_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + finder_10.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
          } else {
            SearchResults results_10 = finder_10.find(new SearchQuery(SNodeOperations.getParent(searchedNode, null, false, false), searchQuery.getScope()));
            for (SearchResult result : results_10.getSearchResults()) {
              implementors.add(result);
            }
          }
        }
      } catch (Throwable t) {
        InterfaceMethodImplementations_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.ImplementingClasses_Finder" + "\"  Message:" + t.getMessage());
      }
      // null
      List<SearchResult> implementorsAndAncestorsList = new ArrayList<SearchResult>();
      {
        ICursor<SearchResult> _zCursor6 = CursorFactory.createCursor(implementors);
        try {
          while (_zCursor6.moveToNext()) {
            SearchResult implementor = _zCursor6.getCurrent();
            {
              implementorsAndAncestorsList.add(implementor);
              SNode implementorNode = implementor.getNode();
              try {
                BaseFinder finder_11 = (BaseFinder) Class.forName("jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder").newInstance();
                // TODO: check for right concept
                boolean rightConcept = true;
                if (!(rightConcept)) {
                  InterfaceMethodImplementations_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + finder_11.getDescription() + "\" ; concept: " + searchQuery.getNodePointer().getNode().getConceptFqName());
                } else {
                  boolean isApplicable = finder_11.isApplicable(implementorNode);
                  if (!(isApplicable)) {
                    InterfaceMethodImplementations_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + finder_11.getDescription() + "\" ; node: " + searchQuery.getNodePointer().getNode().toString());
                  } else {
                    SearchResults results_11 = finder_11.find(new SearchQuery(implementorNode, searchQuery.getScope()));
                    for (SearchResult result : results_11.getSearchResults()) {
                      implementorsAndAncestorsList.add(result);
                    }
                  }
                }
              } catch (Throwable t) {
                InterfaceMethodImplementations_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.ClassAncestors_Finder" + "\"  Message:" + t.getMessage());
              }
            }
          }
        } finally {
          _zCursor6.release();
        }
      }
      // null
      Set<SNode> implementorsAndAncestorsNodes = new HashSet<SNode>();
      {
        ICursor<SearchResult> _zCursor7 = CursorFactory.createCursor(implementorsAndAncestorsList);
        try {
          while (_zCursor7.moveToNext()) {
            SearchResult implementorOrAncestor = _zCursor7.getCurrent();
            implementorsAndAncestorsNodes.add((SNode) implementorOrAncestor.getNode());
          }
        } finally {
          _zCursor7.release();
        }
      }
      // null
      {
        ICursor<SNode> _zCursor8 = CursorFactory.createCursor(implementorsAndAncestorsNodes);
        try {
          while (_zCursor8.moveToNext()) {
            SNode classNode = _zCursor8.getCurrent();
            {
              ICursor<SNode> _zCursor9 = CursorFactory.createCursor(SLinkOperations.getTargets(classNode, "method", true));
              try {
                while (_zCursor9.moveToNext()) {
                  SNode sMethod = _zCursor9.getCurrent();
                  if (SPropertyOperations.getString(sMethod, "name").equals(SPropertyOperations.getString(searchedNode, "name")) && SLinkOperations.getCount(sMethod, "parameter") == SLinkOperations.getCount(searchedNode, "parameter")) {
                    boolean same = true;
                    for (int i = 0; i < SLinkOperations.getCount(sMethod, "parameter"); i = i + 1) {
                      String searchedParamType = Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(ListOperations.getElement(SLinkOperations.getTargets(searchedNode, "parameter", true), i), "type", true));
                      String foundParamType = Type_Behavior.call_getErasureSignature_1199318924019(SLinkOperations.getTarget(ListOperations.getElement(SLinkOperations.getTargets(sMethod, "parameter", true), i), "type", true));
                      if (!(foundParamType.equals(searchedParamType))) {
                        same = false;
                      }
                    }
                    if (same) {
                      global_results.getSearchResults().add(new SearchResult(new SNodePointer(sMethod), "Method Implementation"));
                    }
                  }
                }
              } finally {
                _zCursor9.release();
              }
            }
          }
        } finally {
          _zCursor8.release();
        }
      }
    }
    return global_results;
  }

}
