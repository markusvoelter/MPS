package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.generator.structure.Generator_Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.IModule;
import java.util.List;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.lang.generator.structure.MappingConfiguration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import javax.swing.SwingUtilities;

public class AttachMappingLabel_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    //  attach new or exiting label to node in template.
    //  if node is annotated with macro or template fragment, then label is added to macro or TF,
    //  otherwise new labeled MAP_SRC macro is created.
    return "Attach Mapping Label";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(BaseConcept_Behavior.call_isInTemplates_1213877396627(node))) {
      return false;
    }
    //  not an element form generator language
    if (node.getNodeLanguage() == Generator_Language.get()) {
      return false;
    }
    //  not inside macro
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.AbstractMacro", false, false) != null) {
      return false;
    }
    //  in root template - ok
    if (SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true) != null) {
      return true;
    }
    //  in in-line template - ok
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence", false, false) != null) {
      return true;
    }
    //  in template fragment - ok
    if (SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(node), "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      return ListSequence.fromList(SNodeOperations.getAncestors(node, null, true)).findFirst(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, AttributesRolesUtil.childRoleFromAttributeRole("templateFragment"), true) != null;
        }

      }) != null;
    }
    return false;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final IOperationContext operationContext = editorContext.getOperationContext();
    IModule module = operationContext.getModule();
    List<SNode> mappings;
    if (module instanceof Generator) {
      List<MappingConfiguration> ownMappings = ((Generator)module).getOwnMappings();
      mappings = (List<SNode>)BaseAdapter.toNodes(ownMappings);
    } else
    {
      mappings = SModelOperations.getRoots(SNodeOperations.getModel(node), "jetbrains.mps.lang.generator.structure.MappingConfiguration");
    }
    final List<String> existingLabels = ListSequence.fromList(mappings).translate(new ITranslator2 <SNode, String>() {

      public Iterable<String> translate(final SNode it) {
        return new Iterable <String>() {

          public Iterator<String> iterator() {
            return new YieldingIterator <String>() {

              private int __CP__ = 0;
              private SNode _2_label;
              private Iterator<SNode> _2_label_it;

              protected boolean moveToNext() {
__loop__:
                do {
__switch__:
                  switch (this.__CP__) {
                    case -1:
                      assert false : "Internal error";
                      return false;
                    case 2:
                      this._2_label_it = ListSequence.fromList(SLinkOperations.getTargets(it, "mappingLabel", true)).iterator();
                    case 3:
                      if (!(this._2_label_it.hasNext())) {
                        this.__CP__ = 1;
                        break;
                      }
                      this._2_label = this._2_label_it.next();
                      this.__CP__ = 4;
                      break;
                    case 5:
                      this.__CP__ = 3;
                      this.yield(SPropertyOperations.getString(this._2_label, "name"));
                      return true;
                    case 0:
                      this.__CP__ = 2;
                      break;
                    case 4:
                      this.__CP__ = 5;
                      break;
                    default:
                      break __loop__;
                  }
                } while(true);
                return false;
              }

            };
          }

        };
      }

    }).toListSequence();
    SwingUtilities.invokeLater(new Runnable() {

      public void run() {
        AttachMappingLabelDialog dialog = new AttachMappingLabelDialog(node, existingLabels, operationContext.getMainFrame(), editorContext);
        dialog.showDialog();
      }

    });
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

}
