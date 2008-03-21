package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.cfg.CFGBuilder;
import jetbrains.mps.cfg.BasicBlock;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.cfg.IControlFlowGraph;
import java.util.Set;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_BaseMethodDeclaration_UnreachableStatements_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public  check_BaseMethodDeclaration_UnreachableStatements_NonTypesystemRule() {
  }

  public void applyRule(final SNode baseMethodDeclaration) {
    CFGBuilder cfgBuilder = new CFGBuilder(baseMethodDeclaration);
    for(BasicBlock basicBlock : cfgBuilder.getUnreachableBasicBlocks()) {
      if (!(basicBlock.isFake())) {
        TypeChecker.getInstance().reportTypeError(basicBlock.getSourceNode(), "unreachable statement", "jetbrains.mps.baseLanguage.helgins", "1196169269696");
      }
    }
    if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(baseMethodDeclaration, "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType")) && !(SNodeOperations.isInstanceOf(baseMethodDeclaration, "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"))) {
      IControlFlowGraph controlFlowGraph = cfgBuilder.getControlFlowGraph();
      Set<BasicBlock> lastBlocks = RulesFunctions_BaseLanguage.findLastBlocks(controlFlowGraph);
      for(BasicBlock basicBlock : lastBlocks) {
        SNode node = basicBlock.getSourceNode();
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ReturnStatement")) && !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"))) {
          TypeChecker.getInstance().reportTypeError(basicBlock.getSourceNode(), "function should return a value", "jetbrains.mps.baseLanguage.helgins", "1196175172960");
        }
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
