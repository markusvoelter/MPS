package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.List;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.ide.findusages.model.SearchResult;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.util.TimePresentationUtil;

public class ModelChecker implements IProgressIndicatorAdapter {
  public static final String CATEGORY_ERROR = "Errors";
  public static final String CATEGORY_WARNING = "Warnings";
  public static final String CATEGORY_INFO = "Infos";

  private SearchResults<ModelCheckerIssue> myResults = new SearchResults<ModelCheckerIssue>();
  private boolean myCancelled = false;
  private IOperationContext myOperationContext;
  private ProgressContext myProgressContext;

  public ModelChecker(IOperationContext myOperationContext, ProgressContext myProgressContext) {
    this.myOperationContext = myOperationContext;
    this.myProgressContext = myProgressContext;
  }

  public void checkModel(final SModelDescriptor modelDescriptor) {
    final List<SpecificChecker> specificCheckers = ModelCheckerSettings.getInstance().getSpecificCheckers();

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SModel model = modelDescriptor.getSModel();

        ModelChecker.this.myResults = new SearchResults<ModelCheckerIssue>();
        for (SpecificChecker specificChecker : ListSequence.fromList(specificCheckers)) {
          List<SearchResult<ModelCheckerIssue>> specificCheckerResults = specificChecker.checkModel(model, ModelChecker.this, ModelChecker.this.myOperationContext);
          ModelChecker.this.myResults.getSearchResults().addAll(specificCheckerResults);
          if (ModelChecker.this.myProgressContext.getProgressIndicator().isCanceled()) {
            break;
          }
        }
      }
    });
    this.myCancelled = !(this.myProgressContext.getProgressIndicator().isCanceled());
  }

  public SearchResults<ModelCheckerIssue> getSearchResults() {
    return this.myResults;
  }

  public boolean isCancelled() {
    return this.myCancelled;
  }

  public IOperationContext getOperationContext() {
    return this.myOperationContext;
  }

  public boolean checkAndUpdateIndicator(String text) {
    ProgressIndicator indicator = this.myProgressContext.getProgressIndicator();
    long estimatedTime = this.myProgressContext.getEstimatedTime();
    // Return false if operation was cancelled 
    if (indicator.isCanceled()) {
      return false;
    }

    long elapsedTime = System.currentTimeMillis() - this.myProgressContext.getStartTime();
    String estimatedTimeString = TimePresentationUtil.timeIntervalStringPresentation(estimatedTime);
    String elapsedTimeString = TimePresentationUtil.timeIntervalStringPresentation(elapsedTime);
    indicator.setText(text);
    indicator.setText2("Estimated time: " + estimatedTimeString + ", elapsed time: " + elapsedTimeString);
    if (elapsedTime < estimatedTime) {
      indicator.setIndeterminate(false);
      indicator.setFraction(elapsedTime * 1.0 / estimatedTime);
    } else {
      indicator.setIndeterminate(true);
    }
    return true;
  }
}
