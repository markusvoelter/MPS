package jetbrains.mps.lang.core.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.util.NameUtil;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class SetExportAnnotation_Intention extends BaseIntention implements Intention {
  private SNode myParameter;

  public SetExportAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
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
    return ((this.myParameter == null) ?
      "Remove @export() Annotation" :
      "Set " + SConceptPropertyOperations.getString(SNodeOperations.castConcept(this.myParameter, "jetbrains.mps.lang.core.structure.ExportScope"), "alias") + " Annotation"
    );
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return node.isRoot();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNodeOperations.deleteNode(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScope"))));
    if ((this.myParameter != null)) {
      AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScope")), SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(this.myParameter), null));
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.core.intentions";
  }

  private static List<SNode> parameter(final SNode node, final EditorContext editorContext) {
    SNode[] all = {null ,SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScopeModule") ,SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScopePublic") ,SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScopeNamespace")};
    return Sequence.fromIterable(Sequence.fromArray(all)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return it != SNodeOperations.getConceptDeclaration(AttributeOperations.getAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.core.structure.ExportScope"))));
      }
    }).toListSequence();
  }

  public static List<Intention> instances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = ListSequence.fromList(new ArrayList<Intention>());
    List<SNode> paramList = parameter(node, editorContext);
    if (paramList != null) {
      for (SNode param : paramList) {
        SetExportAnnotation_Intention intention = new SetExportAnnotation_Intention();
        intention.myParameter = param;
        ListSequence.fromList(list).addElement(intention);
      }
    }
    return list;
  }
}
