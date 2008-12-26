/*
 * Copyright 2003-2008 JetBrains s.r.o.
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
package jetbrains.mps.workbench.actions.language;

import com.intellij.ide.DataManager;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.dialogs.MessageDialog;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.projectLanguage.structure.GeneratorDescriptor;
import jetbrains.mps.projectLanguage.structure.LanguageDescriptor;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.action.ActionEventData;

import java.awt.Frame;
import java.util.List;

public class DeleteGeneratorHelper {
  public static void deleteGenerator(Project project, Language sourceLanguage, Generator generator, GeneratorDescriptor generatorDescriptor, boolean safeDelete, boolean deleteFiles) {
    if (safeDelete) {
      safeDelete(project, sourceLanguage, generator, generatorDescriptor, deleteFiles);
    } else {
      delete(sourceLanguage, generatorDescriptor, deleteFiles);
    }
  }

  public static void delete(Language sourceLanguage, GeneratorDescriptor generatorDescriptor, boolean deleteFiles) {
    LanguageDescriptor languageDescriptor = sourceLanguage.getLanguageDescriptor();
    generatorDescriptor.delete();
    sourceLanguage.setLanguageDescriptor(languageDescriptor);
    sourceLanguage.save();
  }

  private static void safeDelete(final Project project, Language sourceLanguage, final Generator generator, GeneratorDescriptor generatorDescriptor, boolean deleteFiles) {
    SearchQuery searchQuery = new SearchQuery(generator, GlobalScope.getInstance());
    SearchResults results = FindUtils.getSearchResults(ActionEventData.createProgressIndicator(), searchQuery, new DependentGeneratorsFinder());
    if (!results.getSearchResults().isEmpty()) {
      Frame frame = MPSDataKeys.FRAME.getData(DataManager.getInstance().getDataContext());
      StringBuilder report = new StringBuilder();
      report.append("Can't delete generator ").append(generator.getModuleFqName()).append(".\n");
      report.append("The following generators depend on it:\n\n");
      for (SearchResult result : (List<SearchResult>) results.getSearchResults()) {
        Generator g = (Generator) result.getObject();
        report.append(g.getModuleFqName()).append("\n");
      }

      new MessageDialog(frame, report.toString());
      return;
    }

    LanguageDescriptor languageDescriptor = sourceLanguage.getLanguageDescriptor();
    generator.getGeneratorDescriptor().delete();
    sourceLanguage.setLanguageDescriptor(languageDescriptor);
    if (deleteFiles) {
      //todo
    }
    sourceLanguage.save();
  }
}

