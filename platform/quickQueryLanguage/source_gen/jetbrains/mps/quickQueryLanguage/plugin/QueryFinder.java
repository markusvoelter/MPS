package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;

public class QueryFinder extends BaseFinder {

  private Query myQuery;

  public QueryFinder(Query query) {
    this.myQuery = query;
  }

  public SearchResults find(SearchQuery searchQuery, ProgressIndicator indicator) {
    SearchResults instances = FindUtils.getSearchResults(indicator, searchQuery, new ConceptInstances_Finder());
    List<SearchResult<SNode>> instancesList;
    instancesList = instances.getSearchResults();
    Iterator<SearchResult<SNode>> it = instancesList.iterator();
    while (it.hasNext()) {
      SearchResult<SNode> current = it.next();
      try {
        if (!(this.myQuery.isSatisfies(current.getObject()))) {
          it.remove();
        }
      } catch (Throwable t) {
      }
    }
    return new SearchResults(instances.getSearchedNodes(), instancesList);
  }

}
