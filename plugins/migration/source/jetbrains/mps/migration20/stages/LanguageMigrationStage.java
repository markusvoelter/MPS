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
package jetbrains.mps.migration20.stages;

import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.project.Project;
import jetbrains.mps.ide.findusages.model.IResultProvider;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResult;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.findusages.view.FindUtils;
import jetbrains.mps.ide.script.plugin.migrationtool.MigrationScriptFinder;
import jetbrains.mps.ide.script.plugin.migrationtool.MigrationScriptUtil;
import jetbrains.mps.lang.script.runtime.AbstractMigrationRefactoring;
import jetbrains.mps.migration20.NameCondition;
import jetbrains.mps.migration20.stages.MigrationStage;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.ProjectOperationContext;
import jetbrains.mps.project.ProjectScope;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.smodel.search.IsInstanceCondition;
import jetbrains.mps.util.ConditionalIterable;

import java.util.ArrayList;
import java.util.List;

public class LanguageMigrationStage implements MigrationStage {
  public String title() {
    return "Language migrations";
  }

  public void execute(MPSProject p) {
    List<SNodePointer> scripts = new ArrayList<SNodePointer>();
    for (Language l : p.getProjectModules(Language.class)) {
      EditableSModelDescriptor smd = LanguageAspect.SCRIPTS.get(l);
      if (smd == null) continue;
      Iterable<SNode> scriptNodes = new ConditionalIterable<SNode>(smd.getSModel().roots(), new IsInstanceCondition("jetbrains.mps.lang.script.MigrationScript"));
      for (SNode mn : scriptNodes) {
        scripts.add(new SNodePointer(mn));
      }
    }
    executeScripts(p.getProject(), scripts);
  }

  public boolean needsCommand() {
    return true;
  }

  public boolean needsRestart() {
    return true;
  }

  public String messageBefore() {
    return null;
  }

  public String messageAfter() {
    return null;
  }

  private static void executeScripts(Project project, List<SNodePointer> scripts) {
    SearchQuery query = new SearchQuery(project.getComponent(ProjectScope.class));
    MigrationScriptFinder finder = new MigrationScriptFinder(scripts, ProjectOperationContext.get(project));
    IResultProvider provider = FindUtils.makeProvider(finder);
    SearchResults<SNode> results = FindUtils.getSearchResults(new EmptyProgressIndicator(), query, provider);

    for (SearchResult<SNode> aliveIncludedResult : results.getAliveResults()) {
      SNode node = aliveIncludedResult.getObject();
      AbstractMigrationRefactoring migrationRefactoring = finder.getRefactoring(aliveIncludedResult);
      MigrationScriptUtil.performRefactoring(node, migrationRefactoring);
    }
  }


}
