package jetbrains.mps.ide.actions.model;

import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.generator.JavaNameUtil;
import jetbrains.mps.ide.IDEProjectFrame;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.ide.action.ActionGroup;
import jetbrains.mps.ide.action.MPSAction;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.smodel.presentation.NodePresentationUtil;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Kostik
 */
public class CreateRootNodeGroup extends ActionGroup {

  public CreateRootNodeGroup() {
    super("Create Root Node");
  }

  public void update(ActionContext context) {
    clear();
    SModelDescriptor modelDescriptor = context.get(SModelDescriptor.class);
    IDEProjectFrame ide = context.get(IDEProjectFrame.class);
    IOperationContext operationContext = context.get(IOperationContext.class);

    List<Language> modelLanguages = modelDescriptor == null ? new ArrayList<Language>(): modelDescriptor.getSModel().getLanguages(operationContext.getScope());
    if (modelLanguages.size() == 0) {
      add(new MPSAction("<NO LANGUAGES>") {
        public void execute(@NotNull ActionContext c) {
        }
      });
    }

    for (final Language language : modelLanguages) {
      ActionGroup langRootsGroup = new ActionGroup(language.getNamespace()) {
        public Icon getIcon() {
          return IconManager.getIconFor(language.getNamespace());
        }
      };

      for (ConceptDeclaration conceptDeclaration : (List<ConceptDeclaration>) (List) BaseAdapter.toNodes(language.getConceptDeclarations())) {
        if (conceptDeclaration.getRootable()) {
          String nodeClassName = JavaNameUtil.className(conceptDeclaration);
          try {
            Class<? extends SNode> nodeClass = (Class<? extends SNode>) Class.forName(nodeClassName, true, ClassLoaderManager.getInstance().getClassLoader());
            langRootsGroup.add(newRootNodeAction(new SNodeProxy(conceptDeclaration), nodeClass, modelDescriptor, ide));
          } catch (ClassNotFoundException e) {
            langRootsGroup.add(new MPSAction("class not found: " + nodeClassName) {
              public void execute(@NotNull ActionContext c) {
              }
            });
          }
        }
      }

      if (langRootsGroup.getElements().size() > 0) {
        this.add(langRootsGroup);
      }
    }

    setVisible(context.hasOneSelectedItem());
  }

  private MPSAction newRootNodeAction(final SNodeProxy nodeConcept, final Class<? extends SNode> nodeClass, final SModelDescriptor modelDescriptor, final IDEProjectFrame ide) {
    return new MPSAction(NodePresentationUtil.matchingText(nodeConcept.getNode())) {
      public Icon getIcon() {
        return IconManager.getIconFor(nodeClass);
      }

      public boolean executeInsideCommand() {
        return false;
      }

      public void execute(@NotNull final ActionContext context) {
        final SNode[] node = new SNode[1];

        CommandProcessor.instance().executeCommand(new Runnable() {
          public void run() {
            node[0] = NodeFactoryManager.createNode((jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration) nodeConcept.getNode().getAdapter(), null, null, modelDescriptor.getSModel(), context.getScope());
            modelDescriptor.getSModel().addRoot(node[0]);
          }
        });

        ide.getProjectPane().selectNode(node[0], context.get(IOperationContext.class));
        ide.getProjectPane().openEditor();
      }
    };
  }

}
