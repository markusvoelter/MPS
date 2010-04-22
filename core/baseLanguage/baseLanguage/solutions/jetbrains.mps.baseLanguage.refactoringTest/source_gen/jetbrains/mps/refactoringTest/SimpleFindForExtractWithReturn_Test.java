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
public class SimpleFindForExtractWithReturn_Test extends BaseTransformationTest {
  @Test
  public void test_SimpleFindForExtractWithReturnTest() throws Throwable {
    this.initTest("${mps_home}/core/baseLanguage/baseLanguage/baseLanguage.mpr", "r:4dc6ffb5-4bbb-4773-b0b7-e52989ceb56f(jetbrains.mps.refactoringTest)");
    this.runTest("jetbrains.mps.refactoringTest.SimpleFindForExtractWithReturn_Test$TestBody", "test_SimpleFindForExtractWithReturnTest", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_SimpleFindForExtractWithReturnTest() throws Exception {
      this.addNodeById("1998477585418805538");
      this.addNodeById("1998477585418805601");
      ExtractMethodRefactoringParameters params = ExtractMethodFactory.createParameters(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1998477585418805553"), "jetbrains.mps.baseLanguage.structure.IfStatement")));
      params.setName("ret");
      ExtractMethodRefactoring ref = ExtractMethodFactory.createRefactoring(params);
      SNode res = ref.doRefactor();
      for (MethodMatch match : ListSequence.fromList(ref.getMatches())) {
        ExtractMethodRefactoring matchRef = ExtractMethodFactory.createRefactoring(ExtractMethodFactory.createParameters(match.getNodes()));
        matchRef.replaceMatch(match, res);
      }
      Assert.assertEquals(null, NodesMatcher.matchNodes(ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1998477585418805539"), "jetbrains.mps.baseLanguage.structure.ClassConcept")), ListSequence.fromListAndArray(new ArrayList<SNode>(), SNodeOperations.cast(this.getNodeById("1998477585418805637"), "jetbrains.mps.baseLanguage.structure.ClassConcept"))));
    }
  }
}
