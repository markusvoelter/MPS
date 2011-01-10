package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tabbedEditor.BaseMultiTab;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class Refactorings_Tab extends BaseMultiTab {
  public Refactorings_Tab(SNode baseNode) {
    super(baseNode);
    ConceptEditorHelper.addMultitabbedListener(Refactorings_Tab.this, LanguageAspect.REFACTORINGS, false);
  }

  public String getTitle() {
    return "Refactorings";
  }

  public Character getShortcutChar() {
    return 'R';
  }

  public String getNullText() {
    return "No Refactorings.";
  }

  public boolean canCreate() {
    return false;
  }

  public List<SNode> getNodes(SNode node) {
    return AbstractConceptDeclaration_Behavior.call_findConceptAspectCollection_1567570417158062208(node, ConceptEditorHelper.getScope(Refactorings_Tab.this), LanguageAspect.REFACTORINGS);
  }

  public String getTabTextForNode(SNode node) {
    if (node.getName() != null) {
      return node.getName();
    } else {
      return node.toString();
    }
  }

  public List<SNode> getAvailableConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.REFACTORINGS, node);
  }

  public SNode createNode(final SNode node, final boolean ask, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.REFACTORINGS, node, concept, Refactorings_Tab.this);
  }
}
