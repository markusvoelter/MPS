package jetbrains.mps.ide.scriptLanguage.plugin.migrationtool;

import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.findUsages.FindUsagesManager;
import jetbrains.mps.ide.findusages.findalgorithm.finders.BaseFinder;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.scriptLanguage.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.ide.scriptLanguage.runtime.BaseMigrationScript;
import jetbrains.mps.ide.scriptLanguage.structure.MigrationScript;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.refactoring.IRefactoring;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;

import java.util.*;

import org.apache.commons.collections.map.IdentityMap;

/**
 * Igor Alshannikov
 * Jun 18, 2008
 */
public class MigrationScriptFinder extends BaseFinder {
  private static final Logger LOG = Logger.getLogger(MigrationScriptFinder.class);

  private List<SNodePointer> myScripts = new ArrayList<SNodePointer>();
  private IOperationContext myContext;

  private Map<SearchResult<SNode>, AbstractMigrationRefactoring> myMigrationBySearchResult = new IdentityHashMap<SearchResult<SNode>, AbstractMigrationRefactoring>();

  public MigrationScriptFinder(List<SNodePointer> scripts, IOperationContext context) {
    myScripts = scripts;
    myContext = context;
  }

  public SearchResults find(SearchQuery query, ProgressIndicator indicator) {
    SearchResults<SNode> results = new SearchResults<SNode>();
    IScope queryScope = query.getScope();

    List<AbstractMigrationRefactoring> migrationRefactorings = new ArrayList<AbstractMigrationRefactoring>();
    List<BaseMigrationScript> scriptInstances = MigrationScriptUtil.getScriptInstances(myScripts, myContext);
    for (BaseMigrationScript scriptInstance : scriptInstances) {
      List<IRefactoring> refactorings = scriptInstance.getRefactorings();
      for (IRefactoring refactoring : refactorings) {
        migrationRefactorings.add((AbstractMigrationRefactoring) refactoring);
      }
    }

    indicator.setText("Searching applicable nodes");
//    int count = 1;
    for (AbstractMigrationRefactoring migrationRefactoring : migrationRefactorings) {
      if (indicator.isCanceled()) {
        break;
      }
//      int donePers = Math.min(100, (int) (((float) (count++) / migrationRefactorings.size()) * 100));
//      if (donePers > 0) indicator.setText("searching models " + donePers + "%");
      indicator.setText2(migrationRefactoring.getName());
      Set<SNode> instances = FindUsagesManager.getInstance().findInstances(MigrationScriptUtil.getApplicableConcept(migrationRefactoring), queryScope, null, false);
      for (SNode instance : instances) {
        if (MigrationScriptUtil.isApplicableRefactoring(instance, migrationRefactoring)) {
          String category = migrationRefactoring.getAdditionalInfo();
          SearchResult<SNode> result = new SearchResult<SNode>(instance, category);
          myMigrationBySearchResult.put(result, migrationRefactoring);
          results.getSearchResults().add(result);
        }
      }
    }
    indicator.setText("Searching applicable nodes " + (indicator.isCanceled() ? "canceled" : "finished"));
    indicator.setText2("");

    return results;
  }

  public AbstractMigrationRefactoring getRefactoring(SearchResult<SNode> searchResult) {
    return myMigrationBySearchResult.get(searchResult);
  }
}
