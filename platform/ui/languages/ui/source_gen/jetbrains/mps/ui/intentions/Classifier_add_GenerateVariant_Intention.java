package jetbrains.mps.ui.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.ui.modeling.plugin.Variants;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class Classifier_add_GenerateVariant_Intention extends BaseIntention implements Intention {
  private String myParameter;

  public Classifier_add_GenerateVariant_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Classifier";
  }

  public boolean isParameterized() {
    return true;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Generation Variant: " + this.myParameter;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final SNode gv = SLinkOperations.getTarget(new Classifier_add_GenerateVariant_Intention.QuotationClass_iyz6y8_a0a0a0f().createNode(), "classifier", false);
    SNode ann = ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode ann) {
        return SLinkOperations.getTarget(ann, "annotation", false) == gv;
      }
    });
    if ((ann == null)) {
      ann = ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).addElement(new Classifier_add_GenerateVariant_Intention.QuotationClass_iyz6y8_a0a0a0a2a5().createNode());
    }
    ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.as(SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getTargets(ann, "value", true)).first(), "value", true), "jetbrains.mps.baseLanguage.structure.ArrayLiteral"), "item", true)).addElement(new Classifier_add_GenerateVariant_Intention.QuotationClass_iyz6y8_a0a0d0f().createNode(this.myParameter));
    ModuleReference moduleRef = Variants.languageToGenerate(this.myParameter).getModuleReference();
    SNodeOperations.getModel(node).addEngagedOnGenerationLanguage(moduleRef);
  }

  public String getLocationString() {
    return "jetbrains.mps.ui.intentions";
  }

  private static List<String> parameter(final SNode node, final EditorContext editorContext) {
    final SNode gv = SLinkOperations.getTarget(new Classifier_add_GenerateVariant_Intention.QuotationClass_iyz6y8_a0a0a0a().createNode(), "classifier", false);
    Iterable<String> setgv = ListSequence.fromList(SLinkOperations.getTargets(ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).findFirst(new IWhereFilter<SNode>() {
      public boolean accept(SNode ann) {
        return SLinkOperations.getTarget(ann, "annotation", false) == gv;
      }
    }), "value", true)).translate(new ITranslator2<SNode, SNode>() {
      public Iterable<SNode> translate(SNode av) {
        return SLinkOperations.getTargets(SNodeOperations.as(SLinkOperations.getTarget(av, "value", true), "jetbrains.mps.baseLanguage.structure.ArrayLiteral"), "item", true);
      }
    }).select(new ISelector<SNode, String>() {
      public String select(SNode it) {
        return SPropertyOperations.getString(SNodeOperations.as(it, "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value");
      }
    });
    return Sequence.fromIterable(Variants.availableVariants()).subtract(Sequence.fromIterable(setgv)).toListSequence();
  }

  public static List<Intention> instances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    List<String> paramList = parameter(node, editorContext);
    if (paramList != null) {
      for (String param : paramList) {
        Classifier_add_GenerateVariant_Intention intention = new Classifier_add_GenerateVariant_Intention();
        intention.myParameter = param;
        ListSequence.fromList(list).addElement(intention);
      }
    }
    return list;
  }

  public static class QuotationClass_iyz6y8_a0a0a0a {
    public QuotationClass_iyz6y8_a0a0a0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:36693452-2637-4608-8caa-ab32ee7c1be3(jetbrains.mps.ui.multiplexing)"), SNodeId.fromString("8590671622324268192")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_iyz6y8_a0a0a0f {
    public QuotationClass_iyz6y8_a0a0a0f() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("r:36693452-2637-4608-8caa-ab32ee7c1be3(jetbrains.mps.ui.multiplexing)"), SNodeId.fromString("8590671622324268192")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_iyz6y8_a0a0a0a2a5 {
    public QuotationClass_iyz6y8_a0a0a0a2a5() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstance", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        quotedNode1_4.addReference(SReference.create("annotation", quotedNode1_4, SModelReference.fromString("r:36693452-2637-4608-8caa-ab32ee7c1be3(jetbrains.mps.ui.multiplexing)"), SNodeId.fromString("8590671622324268192")));
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnnotationInstanceValue", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          quotedNode1_5.addReference(SReference.create("key", quotedNode1_5, SModelReference.fromString("r:36693452-2637-4608-8caa-ab32ee7c1be3(jetbrains.mps.ui.multiplexing)"), SNodeId.fromString("8590671622324287920")));
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayLiteral", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
            SNode quotedNode1_6 = quotedNode_3;
            quotedNode_2.addChild("value", quotedNode1_6);
          }
          quotedNode_1.addChild("value", quotedNode1_5);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }

  public static class QuotationClass_iyz6y8_a0a0d0f {
    public QuotationClass_iyz6y8_a0a0d0f() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", TypeChecker.getInstance().getRuntimeTypesModel(), GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setProperty("value", (String) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
