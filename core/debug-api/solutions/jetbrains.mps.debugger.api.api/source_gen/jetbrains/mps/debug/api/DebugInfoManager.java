package jetbrains.mps.debug.api;

/*Generated by MPS */

import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.logging.Logger;
import java.util.Map;
import jetbrains.mps.util.Mapper2;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.traceInfo.DebugInfo;
import jetbrains.mps.generator.traceInfo.TraceInfoCache;
import jetbrains.mps.traceInfo.TraceablePositionInfo;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import com.intellij.openapi.application.ApplicationManager;

public class DebugInfoManager implements ApplicationComponent {
  private static Logger LOG = Logger.getLogger(DebugInfoManager.class);

  private final Map<String, Mapper2<SNode, Project, ILocationBreakpoint>> myDebuggableConcepts = new HashMap<String, Mapper2<SNode, Project, ILocationBreakpoint>>();

  public DebugInfoManager() {
  }

  @NotNull
  public String getComponentName() {
    return "Debug Info Manager";
  }

  public void addConceptBreakpointCreator(String fqName, Mapper2<SNode, Project, ILocationBreakpoint> breakpointCreator) {
    myDebuggableConcepts.put(fqName, breakpointCreator);
  }

  public void removeConceptBreakpointCreator(String fqName) {
    myDebuggableConcepts.remove(fqName);
  }

  public boolean isDebuggableNode(@Nullable SNode node) {
    if (node == null) {
      return false;
    }
    for (String concept : myDebuggableConcepts.keySet()) {
      if (SNodeOperations.isInstanceOf(node, concept)) {
        return true;
      }
    }
    return false;
  }

  private ILocationBreakpoint createBreakpoint(String concept, SNode node, Project project) {
    Mapper2<SNode, Project, ILocationBreakpoint> mapper2 = myDebuggableConcepts.get(concept);
    if (mapper2 == null) {
      LOG.warning("Could not create breakpoint for node " + node);
      return null;
    }
    return mapper2.value(node, project);
  }

  @Nullable
  public ILocationBreakpoint createBreakpoint(SNode node, Project project) {
    for (String concept : myDebuggableConcepts.keySet()) {
      if (SNodeOperations.isInstanceOf(node, concept)) {
        return createBreakpoint(concept, node, project);
      }
    }
    DebugInfo debugInfo = TraceInfoCache.getInstance().get(node.getModel().getModelDescriptor());
    if (debugInfo != null) {
      TraceablePositionInfo position = debugInfo.getPositionForNode(node.getId());
      if (position != null) {
        String conceptFqName = position.getConceptFqName();
        if (conceptFqName == null) {
          return null;
        }
        List<SNode> superConcepts = SConceptOperations.getAllSuperConcepts(SConceptOperations.findConceptDeclaration(conceptFqName), true);
        for (SNode superConcept : superConcepts) {
          String superConceptFqName = NameUtil.nodeFQName(superConcept);
          if (myDebuggableConcepts.keySet().contains(superConceptFqName)) {
            return createBreakpoint(superConceptFqName, node, project);
          }
        }
      }
    }
    return null;
  }

  public void initComponent() {
  }

  public void disposeComponent() {
  }

  public static DebugInfoManager getInstance() {
    return ApplicationManager.getApplication().getComponent(DebugInfoManager.class);
  }
}
