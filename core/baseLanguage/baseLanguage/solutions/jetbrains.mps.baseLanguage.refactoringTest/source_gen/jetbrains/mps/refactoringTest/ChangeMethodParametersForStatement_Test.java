package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoringParameters;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.plugin.MethodParameter;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.plugin.ExtractMethodFabric;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

public class ChangeMethodParametersForStatement_Test extends BaseTransformationTest {

  @Test()
  public void test_changeMethodParametersForStatement() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest(this.getClass().getCanonicalName() + "$TestBody", "test_changeMethodParametersForStatement", true);
  }

  public static class TestBody extends BaseTestBody {

    public void test_changeMethodParametersForStatement() throws Exception {
      this.addNodeById("1230052406554");
      this.addNodeById("1230052406581");
      {
        SNode c_ref = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LocalVariableReference", null);
        SLinkOperations.setTarget(c_ref, "variableDeclaration", this.getNodeById("1230052406612"), false);
        SNodeOperations.replaceWithAnother(this.getNodeById("1230052406630"), c_ref);
        ExtractMethodRefactoringParameters params = new ExtractMethodRefactoringParameters(ListSequence.<SNode>fromArray(this.getNodeById("1230052406572")));
        params.getParameters().get(0).setSelected(false);
        MethodParameter p2 = params.getParameters().get(1);
        MethodParameter p1 = params.getParameters().get(2);
        params.getParameters().set(1, p1);
        params.getParameters().set(2, p2);
        p1.setName("p1");
        p2.setName("p2");
        params.setName("foo");
        ExtractMethodRefactoring ref = ExtractMethodFabric.createRefactoring(params);
        ref.doRefactor();
        Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.<SNode>fromArray(this.getNodeById("1230052406555")), ListSequence.<SNode>fromArray(this.getNodeById("1230052406582"))));
      }
    }

}

}
