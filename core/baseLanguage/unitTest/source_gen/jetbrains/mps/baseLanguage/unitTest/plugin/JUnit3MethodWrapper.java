package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.baseLanguage.behavior.BaseMethodDeclaration_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class JUnit3MethodWrapper extends AbstractTestWrapper<SNode> {
  public JUnit3MethodWrapper(SNode method) {
    super(method);
  }

  public boolean isTestCase() {
    return false;
  }

  @Nullable
  @Override
  public ITestNodeWrapper getTestCase() {
    SNode clazz = SNodeOperations.getAncestor(myNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
    if ((clazz != null)) {
      return new JUnit3TestWrapper(clazz);
    }
    return null;
  }

  public static boolean isTestMethod(@NotNull SNode method) {
    return !(BaseMethodDeclaration_Behavior.call_isAbstract_1232982539764(method)) && (SLinkOperations.getTarget(method, "visibility", true) != null) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, "visibility", true), "jetbrains.mps.baseLanguage.structure.PublicVisibility") && (SPropertyOperations.getString(method, "name") != null) && SPropertyOperations.getString(method, "name").startsWith("test");
  }
}
