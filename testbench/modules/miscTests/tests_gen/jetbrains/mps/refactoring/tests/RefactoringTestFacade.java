package jetbrains.mps.refactoring.tests;

/*Generated by MPS */

import jetbrains.mps.ide.refactoring.RefactoringFacade;
import jetbrains.mps.refactoring.framework.RefactoringContext;

/*package*/ class RefactoringTestFacade extends RefactoringFacade {
  /*package*/ RefactoringTestFacade() {
  }

  public void doExecuteInTest(RefactoringContext refactoringContext) {
    try {
      // generation switched off temporary 
      refactoringContext.setDoesGenerateModels(false);
      super.doExecute(refactoringContext);
    } catch (Throwable t) {
      RefactoringFacade.LOG.error(t);
    }
  }
}
