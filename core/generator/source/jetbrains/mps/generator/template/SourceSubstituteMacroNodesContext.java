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
package jetbrains.mps.generator.template;

import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;

public class SourceSubstituteMacroNodesContext extends TemplateQueryContextWithMacro {
  private final SNode myRule;
  private final SNodePointer myRulePointer;

  /**
   * actually this parameter is passed not only to 'sourceNodesQuery' in macros but also to similar queries in rules
   */
  public SourceSubstituteMacroNodesContext(SNode node, SNode ruleNode, SNode macroNode, @NotNull TemplateContext context, ITemplateGenerator generator) {
    super(node, macroNode, context, generator);
    myRule = ruleNode;
    myRulePointer = null;
  }

  public SourceSubstituteMacroNodesContext(SNode node, SNodePointer ruleNode, @NotNull SNodePointer macroNode, @NotNull TemplateContext context, @NotNull ITemplateGenerator generator) {
    super(node, macroNode, context, generator);
    myRule = null;
    myRulePointer = ruleNode;
  }

  public SNode getRuleNodeForLogging() {
    return myRule != null ? myRule :
      myRulePointer != null ? myRulePointer.getNode() : null;
  }
}
