package jetbrains.mps.ide.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.ModelValidator;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.project.IModule;

public class ModelPropertiesChecker extends SpecificChecker {
  public ModelPropertiesChecker() {
  }

  public List<SearchResult<ModelCheckerIssue>> checkModel(SModel model, ProgressContext progressContext, IOperationContext operationContext) {
    progressContext.getProgressIndicator().setText("Checking " + SModelOperations.getModelName(model) + " model properties...");
    progressContext.getProgressIndicator().setText2("");

    List<SearchResult<ModelCheckerIssue>> results = ListSequence.fromList(new ArrayList<SearchResult<ModelCheckerIssue>>());

    SModelDescriptor modelDescriptor = model.getModelDescriptor();
    IScope scope = check_t4d01o_a0g0a(check_t4d01o_a0a6a0(modelDescriptor));
    if (scope != null) {
      List<String> errors = new ModelValidator(modelDescriptor.getSModel()).validate(scope);
      if (!(ListSequence.fromList(errors).isEmpty())) {
        String extraMessage = ListSequence.fromList(errors).getElement(0);
        if (ListSequence.fromList(errors).count() == 2) {
          extraMessage += "; " + ListSequence.fromList(errors).getElement(1);
        } else if (ListSequence.fromList(errors).count() > 2) {
          extraMessage += "; ...";
        }
        ListSequence.fromList(results).addElement(ModelCheckerIssue.getSearchResultForModel(model, SModelOperations.getModelName(model) + ": " + NameUtil.formatNumericalString(ListSequence.fromList(errors).count(), "unresolved dependency") + " (" + extraMessage + "; see model properties)", null, ModelChecker.SEVERITY_ERROR, "Model properties"));
      }
    }
    return results;
  }

  private static IScope check_t4d01o_a0g0a(IModule p) {
    if (null == p) {
      return null;
    }
    return p.getScope();
  }

  private static IModule check_t4d01o_a0a6a0(SModelDescriptor p) {
    if (null == p) {
      return null;
    }
    return p.getModule();
  }
}
