package jetbrains.mps.baseLanguage.execution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.debug.api.DebugInfoManager;
import jetbrains.mps.util.Mapper2;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.breakpoints.ILocationBreakpoint;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.debug.api.DebuggerNotPresentException;

public class DebugInfoProvider_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  protected static Log log = LogFactory.getLog(DebugInfoProvider_CustomApplicationPlugin.class);

  public DebugInfoProvider_CustomApplicationPlugin() {
  }

  public void doInit() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    {
      Mapper2<SNode, Project, ILocationBreakpoint> creator = new Mapper2<SNode, Project, ILocationBreakpoint>() {
        public ILocationBreakpoint value(SNode debuggableNode, Project project) {
          try {
            return Debuggers.getInstance().getDebuggerByNameSafe("Java").createBreakpoint(debuggableNode, "JAVA_LINE_BREAKPOINT", project);
          } catch (DebuggerNotPresentException e) {
            if (log.isWarnEnabled()) {
              log.warn("Exception while creating breakpoint for node" + debuggableNode, e);
            }
            return null;
          }

        }
      };
      manager.addConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.Statement", creator);
    }
    {
      Mapper2<SNode, Project, ILocationBreakpoint> creator = new Mapper2<SNode, Project, ILocationBreakpoint>() {
        public ILocationBreakpoint value(SNode debuggableNode, Project project) {
          try {
            return Debuggers.getInstance().getDebuggerByNameSafe("Java").createBreakpoint(debuggableNode, "JAVA_FIELD_BREAKPOINT", project);
          } catch (DebuggerNotPresentException e) {
            if (log.isWarnEnabled()) {
              log.warn("Exception while creating breakpoint for node" + debuggableNode, e);
            }
            return null;
          }

        }
      };
      manager.addConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.FieldDeclaration", creator);
      manager.addConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration", creator);
    }
  }

  public void doDispose() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    manager.removeConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.Statement");
    manager.removeConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.FieldDeclaration");
    manager.removeConceptBreakpointCreator("jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
  }
}
