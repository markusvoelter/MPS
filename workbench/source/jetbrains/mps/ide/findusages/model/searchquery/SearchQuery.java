package jetbrains.mps.ide.findusages.model.searchquery;

import jetbrains.mps.ide.components.ComponentsUtil;
import jetbrains.mps.ide.findusages.view.ContainerInnerPartClassNotFoundException;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.project.AbstractModule.ModuleScope;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.MPSProject.ProjectScope;
import jetbrains.mps.smodel.*;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

public class SearchQuery {
  private static final String NODE = "node";
  private static final String SCOPE = "scope";
  private static final String SCOPE_TYPE = "scope_type";

  private static final String SCOPE_TYPE_GLOBAL = "global_scope";
  private static final String SCOPE_TYPE_PROJECT = "project_scope";
  private static final String SCOPE_TYPE_MODULE = "module_scope";
  private static final String SCOPE_TYPE_MODEL = "model_scope";

  private static final String MODULE_ID = "module_id";
  private static final String MODEL_ID = "model_id";

  private SNodePointer myNodePointer;
  private IScope myScope;

  private transient Runnable myAction;

  public SearchQuery(@NotNull SNodePointer nodePointer, IScope scope) {
    myNodePointer = nodePointer;
    myScope = scope;
  }

  public SearchQuery(@NotNull SNodePointer nodePointer, IScope scope, Runnable action) {
    myNodePointer = nodePointer;
    myScope = scope;
    myAction = action;
  }

  public SearchQuery(SNode node, IScope scope) {
    this(new SNodePointer(node), scope);
  }

  public SearchQuery(Element element, MPSProject project) throws ContainerInnerPartClassNotFoundException {
    read(element, project);
  }

  public SNodePointer getNodePointer() {
    return myNodePointer;
  }

  public SNode getNode() {
    return myNodePointer.getNode();
  }

  public IScope getScope() {
    return myScope;
  }

  public Runnable getAction() {
    return myAction;
  }

  public void write(Element element, MPSProject project) {
    Element scopeXML = new Element(SCOPE);
    if (myScope instanceof GlobalScope) {
      scopeXML.setAttribute(SCOPE_TYPE, SCOPE_TYPE_GLOBAL);
    } else if (myScope instanceof ProjectScope) {
      scopeXML.setAttribute(SCOPE_TYPE, SCOPE_TYPE_PROJECT);
    } else if (myScope instanceof ModuleScope) {
      scopeXML.setAttribute(SCOPE_TYPE, SCOPE_TYPE_MODULE);
      scopeXML.setAttribute(MODULE_ID, ((AbstractModule) ((ModuleScope) myScope).getModelOwner()).getModuleUID());
    } else if (myScope instanceof ModelScope) {
      scopeXML.setAttribute(SCOPE_TYPE, SCOPE_TYPE_MODEL);
      scopeXML.setAttribute(MODEL_ID, ((ModelScope) myScope).getModelDescriptor().getModelUID().toString());
    } else {
      throw new RuntimeException("unsupported scope " + myScope.getClass());
    }
    element.addContent(scopeXML);

    if (myNodePointer.getNode() != null) {
      Element nodeXML = new Element(NODE);
      nodeXML.addContent(ComponentsUtil.nodeToElement(myNodePointer.getNode()));
      element.addContent(nodeXML);
    }
  }

  public void read(Element element, MPSProject project) throws ContainerInnerPartClassNotFoundException {
    Element scopeXML = element.getChild(SCOPE);
    String scopeType = scopeXML.getAttribute(SCOPE_TYPE).getValue();
    if (scopeType.equals(SCOPE_TYPE_GLOBAL)) {
      myScope = GlobalScope.getInstance();
    } else if (scopeType.equals(SCOPE_TYPE_PROJECT)) {
      myScope = project.getScope();
    } else if (scopeType.equals(SCOPE_TYPE_MODULE)) {
      String moduleUID = scopeXML.getAttribute(MODULE_ID).getValue();
      myScope = null;
      for (IModule module : project.getModules()) {
        if (module.getModuleUID().equals(moduleUID)) {
          myScope = module.getScope();
        }
      }
      if (myScope == null) {
        throw new ContainerInnerPartClassNotFoundException("module scope not found for module  " + moduleUID);
      }
    } else if (scopeType.equals(SCOPE_TYPE_MODEL)) {
      String modelUID = scopeXML.getAttribute(MODEL_ID).getValue();
      SModelDescriptor sModelDescriptor = project.getScope().getModelDescriptor(SModelUID.fromString(modelUID));
      if (sModelDescriptor == null) {
        throw new ContainerInnerPartClassNotFoundException("model scope not found for model  " + modelUID);
      }
      myScope = new ModelScope(project.getScope(), sModelDescriptor);
    }

    Element nodeXML = element.getChild(NODE);
    SNode node;
    if (nodeXML == null) {
      node = null;
    } else {
      node = ComponentsUtil.nodeFromElement((Element) nodeXML.getChildren().get(0));
    }
    if (node == null) {
      throw new ContainerInnerPartClassNotFoundException("node not found");
    }
    myNodePointer = new SNodePointer(node);
  }
}
