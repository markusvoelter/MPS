package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.EditorsPane;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.helgins.inference.NodeTypesComponent;
import jetbrains.mps.helgins.inference.NodeTypesComponentsRepository;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import java.util.Set;
import jetbrains.mps.util.Pair;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelUID;
import jetbrains.mps.ide.IEditor;
import jetbrains.mps.ide.navigation.NavigationActionProcessor;
import jetbrains.mps.ide.navigation.EditorNavigationCommand;
import jetbrains.mps.helgins.uiActions.MyMenu;
import jetbrains.mps.nodeEditor.EditorCell;
import java.awt.Component;

public class ShowRulesWhichAffectNodeType_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(ShowRulesWhichAffectNodeType_Action.class);

  private SNode node;
  private IOperationContext operationContext;
  private EditorsPane editorsPane;
  private MPSProject project;
  private boolean isAlwaysVisible = false;

  public ShowRulesWhichAffectNodeType_Action(MPSProject project) {
    super(project, "Show Rules Which Affect Node's Type");
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl shift T";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      this.setEnabled(true);
      this.setVisible(true);
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        SNode node = context.getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
        return false;
      }
      this.operationContext = context.getOperationContext();
      if (this.operationContext == null) {
        return false;
      }
      this.editorsPane = context.get(EditorsPane.class);
      if (this.editorsPane == null) {
        return false;
      }
      {
        MPSProject project = null;
        if (context.getOperationContext() != null) {
          project = context.getOperationContext().getProject();
        }
        this.project = project;
      }
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        NodeTypesComponent component = NodeTypesComponentsRepository.getInstance().getNodeTypesComponent(SNodeOperations.getContainingRoot(this.node));
        if (component == null) {
          return;
        }
        Set<Pair<String, String>> rulesIds = component.getRulesWhichAffectNodeType(this.node);
        if (rulesIds == null) {
          return;
        }
        List<SNode> rules = new ArrayList<SNode>();
        for(Pair<String, String> ruleId : rulesIds) {
          SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString(ruleId.o1));
          if (modelDescriptor == null) {
            continue;
          }
          SNode rule = modelDescriptor.getSModel().getNodeById(ruleId.o2);
          if (rule != null) {
            rules.add(rule);
          }
        }
        IEditor currentEditor = context.get(IEditor.class);
        // single rule
        if (rules.size() == 1) {
          NavigationActionProcessor.getInstance().executeNavigationAction(new EditorNavigationCommand(rules.get(0), currentEditor, this.editorsPane), this.project);
          return;
        }
        // multiple rules
        MyMenu m = new MyMenu(rules, this.operationContext);
        int x = 0;
        int y = 0;
        EditorCell cell = context.get(EditorCell.class);
        if (cell != null) {
          x = cell.getX();
          y = cell.getY();
        }
        Component invoker;
        if (currentEditor == null) {
          invoker = context.getFrame();
        } else
        {
          invoker = currentEditor.getCurrentEditorComponent();
        }
        m.show(invoker, x, y);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowRulesWhichAffectNodeType", t);
    }
  }

}
