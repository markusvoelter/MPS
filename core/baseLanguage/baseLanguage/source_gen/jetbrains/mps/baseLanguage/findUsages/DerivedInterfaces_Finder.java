package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.smodel.SNodePointer;

import java.util.List;
import java.util.ArrayList;

import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.ide.findusages.model.result.SearchResult;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;

public class DerivedInterfaces_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.DerivedInterfaces_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Derived Interfaces";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Interface";
  }

  public boolean isApplicable(SNode node) {
    return true;
  }

  public void doFind(SNode node, IScope scope, SearchResults results) {
    results.getSearchedNodePointers().add(new SNodePointer(node));
    // null
    List<SNode> derived = new ArrayList<SNode>();
    ListOperations.addElement(derived, node);
    // null
    int passed = 0;
    while (SequenceOperations.getSize(derived) != passed) {
      SNode passingNode = ListOperations.getElement(derived, passed);
      for (SNode nodeUsage : this.executejetbrainsMpsBootstrapStructureLanguageFindUsagesNodeUsages_Finder(passingNode, scope)) {
        if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(nodeUsage, null, false, false), "jetbrains.mps.baseLanguage.structure.Interface")) {
          if (SNodeOperations.hasRole(nodeUsage, "jetbrains.mps.baseLanguage.structure.Interface", "extendedInterface")) {
            ListOperations.addElement(derived, SNodeOperations.getParent(nodeUsage, null, false, false));
          }
        }
      }
      if (passingNode != node) {
        results.getSearchResults().add(new SearchResult(new SNodePointer(passingNode), "Derived Interfaces"));
      }
      passed = passed + 1;
    }
  }

  public List<SNode> executejetbrainsMpsBootstrapStructureLanguageFindUsagesNodeUsages_Finder(SNode node, IScope scope) {
    List<SNode> result = new ArrayList<SNode>();
    try {
      GeneratedFinder finder = (GeneratedFinder) Class.forName("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder").newInstance();
      {
        ICursor<SearchResult> _zCursor23 = CursorFactory.createCursor(finder.find(new SearchQuery(node, scope)).getSearchResults());
        try {
          while (_zCursor23.moveToNext()) {
            SearchResult searchResult = _zCursor23.getCurrent();
            ListOperations.addElement(result, searchResult.getNode());
          }
        } finally {
          _zCursor23.release();
        }
      }
    } catch (Throwable t) {
      DerivedInterfaces_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder" + "\"  Message:" + t.getMessage());
    }
    return result;
  }

}
