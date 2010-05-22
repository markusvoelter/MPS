package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.debug.DebugInfoManager;
import jetbrains.mps.util.Mapper2;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debug.api.AbstractMPSBreakpoint;
import jetbrains.mps.debug.runtime.MPSBreakpoint;
import jetbrains.mps.util.Mapper;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.behavior.AnonymousClass_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.debug.api.BreakpointManagerComponent;

public class DebugInfoInitializer_CustomApplicationPlugin extends BaseCustomApplicationPlugin {
  private static Logger LOG = Logger.getLogger(DebugInfoInitializer_CustomApplicationPlugin.class);

  public DebugInfoInitializer_CustomApplicationPlugin() {
  }

  public void doInit() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    manager.addDebuggableConcept("jetbrains.mps.baseLanguage.structure.Statement", new Mapper2<SNode, Project, AbstractMPSBreakpoint>() {
      public AbstractMPSBreakpoint value(SNode debuggableNode, Project project) {
        return new MPSBreakpoint(debuggableNode, project);
      }
    });
    manager.addDebuggableConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration", new Mapper2<SNode, Project, AbstractMPSBreakpoint>() {
      public AbstractMPSBreakpoint value(SNode debuggableNode, Project project) {
        return new MPSBreakpoint(debuggableNode, project);
      }
    });
    manager.addDebuggableConcept("jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration", new Mapper2<SNode, Project, AbstractMPSBreakpoint>() {
      public AbstractMPSBreakpoint value(SNode debuggableNode, Project project) {
        return new MPSBreakpoint(debuggableNode, project);
      }
    });
    manager.addDebuggableConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", new Mapper2<SNode, Project, AbstractMPSBreakpoint>() {
      public AbstractMPSBreakpoint value(SNode debuggableNode, Project project) {
        return new MPSBreakpoint(debuggableNode, project);
      }
    });
    manager.addScopeConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration", new Mapper<SNode, List<SNode>>() {
      public List<SNode> value(SNode scopeNode) {
        return SLinkOperations.getTargets(scopeNode, "parameter", true);
      }
    });
    manager.addScopeConcept("jetbrains.mps.baseLanguage.structure.StatementList", new Mapper<SNode, List<SNode>>() {
      public List<SNode> value(SNode scopeNode) {
        List<SNode> result = new ArrayList<SNode>();
        for (SNode statement : SLinkOperations.getTargets(scopeNode, "statement", true)) {
          if (SNodeOperations.isInstanceOf(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
            ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(statement, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement"), "localVariableDeclaration", true));
          }
        }
        return result;
      }
    });
    manager.addScopeConcept("jetbrains.mps.baseLanguage.structure.ForeachStatement", new Mapper<SNode, List<SNode>>() {
      public List<SNode> value(SNode scopeNode) {
        return ListSequence.fromListAndArray(new ArrayList<SNode>(), SLinkOperations.getTarget(scopeNode, "variable", true));
      }
    });
    manager.addScopeConcept("jetbrains.mps.baseLanguage.structure.ForStatement", new Mapper<SNode, List<SNode>>() {
      public List<SNode> value(SNode scopeNode) {
        return ListSequence.fromListAndArray(new ArrayList<SNode>(), SLinkOperations.getTarget(scopeNode, "variable", true));
      }
    });
    manager.addUnitConcept("jetbrains.mps.baseLanguage.structure.AnonymousClass", new Mapper<SNode, String>() {
      public String value(SNode unitNode) {
        return AnonymousClass_Behavior.call_getJavaName_2977939203456914071(unitNode);
      }
    });
    manager.addUnitConcept("jetbrains.mps.baseLanguage.structure.Interface", new Mapper<SNode, String>() {
      public String value(SNode unitNode) {
        return INamedConcept_Behavior.call_getFqName_1213877404258(unitNode);
      }
    });
    manager.addUnitConcept("jetbrains.mps.baseLanguage.structure.ClassConcept", new Mapper<SNode, String>() {
      public String value(SNode unitNode) {
        return INamedConcept_Behavior.call_getFqName_1213877404258(unitNode);
      }
    });
    BreakpointManagerComponent.notifyDebuggableConceptsAdded();
  }

  public void doDispose() {
    DebugInfoManager manager = DebugInfoManager.getInstance();
    manager.removeDebuggableConcept("jetbrains.mps.baseLanguage.structure.Statement");
    manager.removeDebuggableConcept("jetbrains.mps.baseLanguage.structure.FieldDeclaration");
    manager.removeDebuggableConcept("jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration");
    manager.removeDebuggableConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.StatementList");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.ForeachStatement");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.ForStatement");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.AnonymousClass");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.Interface");
    manager.removeScopeConcept("jetbrains.mps.baseLanguage.structure.ClassConcept");
  }
}
