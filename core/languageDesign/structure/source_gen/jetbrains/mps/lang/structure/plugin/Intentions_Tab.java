package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.tabbedEditor.BaseMultiTab;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.LanguageAspect;
import java.util.List;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class Intentions_Tab extends BaseMultiTab {
  public Intentions_Tab(SNode baseNode) {
    super(baseNode);
    ConceptEditorHelper.addMultitabbedListener(Intentions_Tab.this, LanguageAspect.INTENTIONS, false);
  }

  public String getTitle() {
    return "Intentions";
  }

  public Character getShortcutChar() {
    return 'I';
  }

  public String getNullText() {
    return "No Intentions.";
  }

  public boolean canCreate() {
    return false;
  }

  public List<SNode> getNodes(SNode node) {
    return AbstractConceptDeclaration_Behavior.call_findConceptAspectCollection_1567570417158062208(node, ConceptEditorHelper.getScope(Intentions_Tab.this), LanguageAspect.INTENTIONS);
  }

  public String getTabTextForNode(SNode node) {
    if (node.getName() != null) {
      return node.getName();
    } else {
      return node.toString();
    }
  }

  public List<SNode> getAvailableConcepts(final SNode node) {
    return ConceptEditorHelper.getAvailableConceptAspects(LanguageAspect.INTENTIONS, node);
  }

  public SNode createNode(final SNode node, final boolean ask, final SNode concept) {
    return ConceptEditorHelper.createNewConceptAspectInstance(LanguageAspect.INTENTIONS, node, concept, Intentions_Tab.this);
  }
}
