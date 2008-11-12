package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.actions.nodes.SetNodePackageAction;
import jetbrains.mps.workbench.actions.nodes.GoToConceptEditorDeclarationAction;
import jetbrains.mps.workbench.actions.nodes.CopyNodeAction;
import jetbrains.mps.workbench.actions.nodes.CopyNodeReferenceAction;
import jetbrains.mps.workbench.actions.nodes.PasteNodeAction;
import jetbrains.mps.workbench.actions.nodes.CutNodeAction;
import jetbrains.mps.workbench.actions.nodes.DeleteNodeAction;
import jetbrains.mps.workbench.actions.nodes.GoToEditorDeclarationAction;
import jetbrains.mps.workbench.actions.nodes.GoToRulesAction;
import jetbrains.mps.lang.generator.plugin.debug.actions.ShowGenerationTraceAction;
import jetbrains.mps.workbench.actions.nodes.FindSpecificNodeUsagesAction;
import jetbrains.mps.workbench.actions.nodes.FastFindUsagesNodeAction;

public class NodeActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NodeActions";
  public static final String LABEL_ID_structure = ID + "structure";

  public NodeActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new EditNode_Action());
      this.addSeparator();
      this.add(new SetNodePackageAction());
      this.addSeparator();
      this.add(new ExpandNode_Action());
      this.addSeparator();
      this.add(new GoToConceptEditorDeclarationAction());
      this.addSeparator();
      this.add(new CopyNodeAction());
      this.add(new CopyNodeReferenceAction());
      this.add(new PasteNodeAction());
      this.add(new CutNodeAction());
      this.add(new CloneRoot_Action());
      this.addSeparator();
      this.add(new DeleteNodeAction());
      this.addSeparator();
      this.add(new GoToConceptDeclaration_Action());
      this.add(new GoToEditorDeclarationAction());
      this.add(new GoToRulesAction());
      this.add(new ShowNodeInExplorer_Action());
      this.addSeparator();
      this.add(new ShowGenerationTraceAction());
      this.add(new ShowGenerationTraceback_Action());
      this.addSeparator();
      this.add(new FindSpecificNodeUsagesAction());
      this.add(new FastFindUsagesNodeAction());
      this.addSeparator();
      this.add(new ShowConceptInHierarchy_Action());
      this.addAnchor(NodeActions_ActionGroup.LABEL_ID_structure);
      this.add(new ShowClassInHierarchy_Action());
      this.addSeparator();
      this.add(new ShowErrorMessage_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
