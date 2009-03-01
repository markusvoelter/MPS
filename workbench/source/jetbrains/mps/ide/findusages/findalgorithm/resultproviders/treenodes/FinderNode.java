/*
 * Copyright 2003-2009 JetBrains s.r.o.
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
package jetbrains.mps.ide.findusages.findalgorithm.resultproviders.treenodes;

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.ide.findusages.CantLoadSomethingException;
import jetbrains.mps.ide.findusages.CantSaveSomethingException;
import jetbrains.mps.ide.findusages.findalgorithm.finders.IFinder;
import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.ide.findusages.model.SearchQuery;
import jetbrains.mps.ide.findusages.model.SearchResults;
import jetbrains.mps.ide.progress.TaskProgressSettings;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.Language;
import org.jdom.Element;

public class FinderNode extends BaseLeaf {
  private static final String FINDER = "finder";
  private static final String CLASS_NAME = "class_name";

  private static final Logger LOG = Logger.getLogger(FinderNode.class);

  private IFinder myFinder;

  public FinderNode() {

  }

  public FinderNode(IFinder finder) {
    myFinder = finder;
  }

  public String getTaskName() {
    if (myFinder instanceof GeneratedFinder) {
      return ((GeneratedFinder) myFinder).getDescription();
    } else {
      return myFinder.getClass().getName();
    }
  }

  public String getTaskKind() {
    return "finder";
  }

  public SearchResults doGetResults(final SearchQuery query, final ProgressIndicator indicator) {
    indicator.setText(getTaskName() + " started");
    //indicator.startLeafTask(getTaskName(), getTaskKind());
    final SearchResults results = ModelAccess.instance().runReadAction(new Computable<SearchResults>() {
      public SearchResults compute() {
        try {
          return myFinder.find(query, indicator);
        } catch (Throwable t) {
          LOG.error(t.getMessage(), t);
          return new SearchResults();
        }
      }
    });
    //indicator.finishTask();
    indicator.setText(getTaskName() + " finished");

    return results;
  }

  public long getEstimatedTime(IScope scope) {
    return TaskProgressSettings.getInstance().getEstimatedTimeMillis(getTaskName());
  }

  public void write(Element element, MPSProject project) throws CantSaveSomethingException {
    super.write(element, project);
    Element finderXML = new Element(FINDER);
    finderXML.setAttribute(CLASS_NAME, myFinder.getClass().getName());
    element.addContent(finderXML);
  }

  public void read(Element element, MPSProject project) throws CantLoadSomethingException {
    super.read(element, project);
    Element finderXML = element.getChild(FINDER);
    String finderName = finderXML.getAttribute(CLASS_NAME).getValue();
    try {
      Class finderClass = null;
      for (Language l : project.getProjectLanguages()) {
        finderClass = l.getClass(finderName);
        if (finderClass != null) break;
      }
      if (finderClass == null) {
        try {
          finderClass = Class.forName(finderName);
        } catch (ClassNotFoundException e) {
          finderClass = null;
        }
      }
      if (finderClass != null) {
        myFinder = (IFinder) finderClass.newInstance();
      } else {
        throw new CantLoadSomethingException("Can't find finder class " + finderName);
      }
    } catch (Throwable t) {
      throw new CantLoadSomethingException("Can't find or read finder " + finderName, t);
    }
  }
}
