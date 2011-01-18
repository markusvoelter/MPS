package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.structure.behavior.IConceptAspect_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.util.Condition;
import jetbrains.mps.smodel.Generator;

public class ConceptEditorHelper {
  public static List<SNode> getAvailableConceptAspects(SModel structureModel, SNode node) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode root : SModelOperations.getRoots(structureModel, "jetbrains.mps.lang.structure.structure.ConceptDeclaration")) {
      if (SConceptOperations.isSubConceptOf(root, "jetbrains.mps.lang.structure.structure.IConceptAspect") && SPropertyOperations.getBoolean(root, "rootable")) {
        SNode candidate = (SNode) root;
        if (IConceptAspect_Behavior.call_isApplicable_7839831476331657915(SNodeOperations.cast(SConceptOperations.createNewNode(NameUtil.nodeFQName(candidate), null), "jetbrains.mps.lang.structure.structure.IConceptAspect"), node)) {
          ListSequence.fromList(result).addElement(candidate);
        }
      }
    }
    return result;
  }

  public static List<SNode> getAvailableConceptAspects(LanguageAspect aspect, SNode node) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    Language language = GlobalScope.getInstance().getLanguage(aspect.getMainLanguage());
    SModel structureModel = language.getStructureModelDescriptor().getSModel();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(getAvailableConceptAspects(structureModel, node)));
    return result;
  }

  public static SNode createNewConceptAspectInstance(SNode applicableNode, SNode concept, SModel model) {
    SNode conceptAspect = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(concept), null);
    IConceptAspect_Behavior.call_setBaseConcept_6261424444345963020(conceptAspect, applicableNode);
    SModelOperations.addRootNode(model, conceptAspect);

    return conceptAspect;
  }

  public static SNode createNewConceptAspectInstance(LanguageAspect aspect, SNode applicableNode, SNode concept) {
    Language language = SModelUtil.getDeclaringLanguage(applicableNode);
    assert language != null : "Language shouldn't be null for " + applicableNode;

    SModelDescriptor md = aspect.get(language);
    if (md == null) {
      md = aspect.createNew(language);
    }
    return createNewConceptAspectInstance(applicableNode, concept, md.getSModel());
  }

  /*package*/ static List<SNode> sortRootsByConcept(List<SNode> roots, final SNode[] conceptOrder) {
    return ListSequence.fromList(roots).sort(new ISelector<SNode, Comparable<?>>() {
      public Comparable<?> select(SNode root) {
        int conceptIndex = Sequence.fromIterable(Sequence.fromArray(conceptOrder)).indexOf(SNodeOperations.getConceptDeclaration(root));
        return (conceptIndex == -1 ?
          conceptOrder.length :
          conceptIndex
        );
      }
    }, true).toListSequence();
  }

  public static class ModelCondition implements Condition<SModelDescriptor> {
    private Language myLanguage;
    private LanguageAspect myAspect;

    public ModelCondition(Language language, LanguageAspect aspect) {
      this.myLanguage = language;
      this.myAspect = aspect;
    }

    public boolean met(SModelDescriptor modelDescriptor) {
      return Language.getLanguageFor(modelDescriptor) == this.myLanguage && Language.getModelAspect(modelDescriptor) == this.myAspect;
    }
  }

  public static class GeneratorCondition implements Condition<SModelDescriptor> {
    private Language myLanguage;

    public GeneratorCondition(Language language) {
      this.myLanguage = language;
    }

    public boolean met(SModelDescriptor modelDescriptor) {
      for (Generator generator : ListSequence.fromList(this.myLanguage.getGenerators())) {
        if (generator.getOwnTemplateModels().contains(modelDescriptor)) {
          return true;
        }
      }
      return false;
    }
  }
}
