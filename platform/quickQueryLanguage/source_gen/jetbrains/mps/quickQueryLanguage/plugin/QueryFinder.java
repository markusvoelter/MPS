package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.quickQueryLanguage.runtime.Query;
import jetbrains.mps.lang.structure.findUsages.ConceptInstances_Finder;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.ide.findusages.view.FindUtils;
import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import org.jdom.Element;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;

public class QueryFinder extends BaseFinder {

  private BaseFinder myBaseFinder;
  private Query myQuery;

  public QueryFinder(Query query) {
    this.myBaseFinder = new ConceptInstances_Finder();
    this.myQuery = query;
  }

  public SearchResults find(SearchQuery searchQuery, ProgressIndicator indicator) {
    BaseFinder[] finders = new BaseFinder[1];
    finders[0] = this.myBaseFinder;
    SearchResults instances = FindUtils.getSearchResults(indicator, searchQuery, finders);
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

  public void write(Element element, MPSProject project) throws CantSaveSomethingException {
    this.myBaseFinder.write(element, project);
  }

  public void read(Element element, MPSProject project) throws CantLoadSomethingException {
    this.myBaseFinder.read(element, project);
  }

}
