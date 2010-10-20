package jetbrains.mps.nanoc.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.debug.api.DebugInfoManager;
import jetbrains.mps.util.Mapper2;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.AbstractMPSBreakpoint;
import jetbrains.mps.nanoc.debug.breakpoints.GDBBreakpoint;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.debug.api.BreakpointManagerComponent;

public class DebugInfoProvider_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private static Logger LOG = Logger.getLogger(DebugInfoProvider_CustomApplicationPlugin.class);

  public DebugInfoProvider_CustomApplicationPlugin() {
  }

  public void doInit() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    manager.addConceptBreakpointCreator("jetbrains.mps.nanoc.structure.CStatement", new Mapper2<SNode, Project, AbstractMPSBreakpoint>() {
      public AbstractMPSBreakpoint value(SNode debuggableNode, Project project) {
        return new GDBBreakpoint(new SNodePointer(debuggableNode), project);
      }
    });
    BreakpointManagerComponent.notifyDebuggableConceptsAdded();
  }

  public void doDispose() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    manager.removeConceptBreakpointCreator("jetbrains.mps.nanoc.structure.CStatement");
  }
}
