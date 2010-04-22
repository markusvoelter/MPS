package jetbrains.mps.refactoringTest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoringParameters;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.ExtractMethodRefactoring;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.MethodMatch;
import junit.framework.Assert;
import jetbrains.mps.lang.test.matcher.NodesMatcher;

@MPSLaunch
public class SimpleFindForExtractFromManyStatements_Test extends BaseTransformationTest {
  @Test
  public void test_SimpleFindForExtractFromManyStatementsTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.SimpleFindForExtractFromManyStatements_Test$TestBody", "test_SimpleFindForExtractFromManyStatementsTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_SimpleFindForExtractFromManyStatementsTest() throws Exception {
      this.addNodeById("7793057097608406464");
      this.addNodeById("7793057097608416301");
      ExtractMethodRefactoringParameters params = ExtractMethodFactory.createParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7793057097608406470"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), SNodeOperations.cast(this.getNodeById("7793057097608406474"), "jetbrains.mps.baseLanguage.structure.ExpressionStatement")));
      params.setName("printTwo");
      ExtractMethodRefactoring ref = ExtractMethodFactory.createRefactoring(params);
      SNode res = ref.doRefactor();
      for (MethodMatch match : ListSequence.fromList(ref.getMatches())) {
        ExtractMethodRefactoring matchRef = ExtractMethodFactory.createRefactoring(ExtractMethodFactory.createParameters(match.getNodes()));
        matchRef.replaceMatch(match, res);
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7793057097608406465"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("7793057097608416325"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
