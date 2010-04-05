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
package jetbrains.mps.refactoring.framework.tests;

import jetbrains.mps.lang.structure.scripts.RenameLink;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.refactoring.framework.RefactoringContext;
import jetbrains.mps.refactoring.framework.OldRefactoringAdapter;
import jetbrains.mps.smodel.*;

public class RenameLinkRefactoringTester_Hierarchy implements IRefactoringTester {
  public boolean testRefactoring(final MPSProject project,
                                 final SModelDescriptor sandbox1,
                                 final SModelDescriptor sandbox2,
                                 final Language testRefactoringLanguage,
                                 final Language testRefactoringTargetLanguage) {
    System.err.println("preparing arguments for refactoring");
    RenameLink renameLink = new RenameLink();
    final RefactoringContext refactoringContext = new RefactoringContext(OldRefactoringAdapter.createAdapterFor(renameLink));
    refactoringContext.setCurrentOperationContext(ProjectOperationContext.get(project.getProject()));
    final String newLinkName = "goodConcept";
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SModelDescriptor structureModelDescriptor = testRefactoringTargetLanguage.getStructureModelDescriptor();
        SNode node = structureModelDescriptor.getSModel().getRootByName("AbstractGoodConcept");
        ConceptDeclaration concept = (ConceptDeclaration) BaseAdapter.fromNode(node);
        SNode link = concept.getLinkDeclarations().get(0).getNode();
        refactoringContext.setSelectedMPSProject(project);
        refactoringContext.setSelectedNode(link);
        refactoringContext.setSelectedModel(structureModelDescriptor);
        refactoringContext.setParameter(RenameLink.newName, newLinkName);
      }
    });


    System.err.println("executing a refactoring");
    new RefactoringProcessor().doExecuteInTest(refactoringContext);

    final boolean[] result = new boolean[]{false};
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        ModelAccess.instance().runReadAction(new Runnable() {
          public void run() {
            try {
              System.err.println("checking a model");
              if (sandbox1.isInitialized()) {
                System.err.println("test environment is invalid: model sandbox1 is already initialized, should be not");
                result[0] = false;
                return;
              }
              SModel sModel = sandbox1.getSModel();
              SNode root = sModel.getRoots().get(0);
              result[0] = (root.getChildren(newLinkName).size() == 4);
            } catch (Throwable t) {
              t.printStackTrace();
              result[0] = false;
            }
          }
        });
      }
    });
    return result[0];
  }
}
