package jetbrains.mps.baseLanguage.closures.typesystem;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadAdapter;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class RulesUtil_Closures {
  /*package*/ static List<SNode> ourInterfaces;

  public static List<SNode> getInterfaces() {
    if (ourInterfaces == null) {
      ourInterfaces = SModelOperations.getNodes(SNodeOperations.getModel(SLinkOperations.getTarget(new RulesUtil_Closures.QuotationClass_6hhi7_a0a0a0a0a0a().createNode(), "classifier", false)), "jetbrains.mps.baseLanguage.structure.Interface");
      ClassLoaderManager.getInstance().addReloadHandler(new ReloadAdapter() {
        public void invalidateCaches() {
          RulesUtil_Closures.ourInterfaces = null;
          ClassLoaderManager.getInstance().removeReloadHandler(this);
        }
      });
    }
    return ourInterfaces;
  }

  public static class QuotationClass_6hhi7_a0a0a0a0a0a {
    public QuotationClass_6hhi7_a0a0a0a0a0a() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassifierType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classifier", quotedNode1_2, SModelReference.fromString("f:java_stub#jetbrains.mps.baseLanguage.closures.runtime(jetbrains.mps.baseLanguage.closures.runtime@java_stub)"), SNodeId.fromString("~FunctionTypes")));
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
