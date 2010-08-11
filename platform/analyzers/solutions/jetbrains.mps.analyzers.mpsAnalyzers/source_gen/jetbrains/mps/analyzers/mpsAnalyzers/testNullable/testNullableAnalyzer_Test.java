package jetbrains.mps.analyzers.mpsAnalyzers.testNullable;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.test.behavior.NodeOperation_Behavior;

@MPSLaunch
public class testNullableAnalyzer_Test extends BaseTransformationTest {
  @Test
  public void testDot() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:3cb515b9-4069-45fc-8f0a-1dc50acbaef5(jetbrains.mps.analyzers.mpsAnalyzers.testNullable)");
    this.runTest("jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test$TestBody", "testDot", true);
  }

  @Test
  public void testAnnotationField() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:3cb515b9-4069-45fc-8f0a-1dc50acbaef5(jetbrains.mps.analyzers.mpsAnalyzers.testNullable)");
    this.runTest("jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test$TestBody", "testAnnotationField", true);
  }

  @Test
  public void testWhile() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:3cb515b9-4069-45fc-8f0a-1dc50acbaef5(jetbrains.mps.analyzers.mpsAnalyzers.testNullable)");
    this.runTest("jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test$TestBody", "testWhile", true);
  }

  @Test
  public void testWrite() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:3cb515b9-4069-45fc-8f0a-1dc50acbaef5(jetbrains.mps.analyzers.mpsAnalyzers.testNullable)");
    this.runTest("jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test$TestBody", "testWrite", true);
  }

  @Test
  public void testAnnotationParam() throws Throwable {
    this.initTest("${mps_home}/core/languageDesign/pattern/pattern.mpr", "r:3cb515b9-4069-45fc-8f0a-1dc50acbaef5(jetbrains.mps.analyzers.mpsAnalyzers.testNullable)");
    this.runTest("jetbrains.mps.analyzers.mpsAnalyzers.testNullable.testNullableAnalyzer_Test$TestBody", "testAnnotationParam", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void testDot() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("4178994379565906745"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("680562289607955732"));
    }

    public void testAnnotationField() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("7801926404027344353"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("680562289607955767"));
    }

    public void testWhile() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("7801926404027346022"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("680562289607978368"));
    }

    public void testWrite() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("4352355327610854434"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("4036797860728703733"));
    }

    public void testAnnotationParam() throws Exception {
      SNode operation = SNodeOperations.cast(this.getRealNodeById("7801926404027346025"), "jetbrains.mps.lang.test.structure.NodeOperation");
      NodeOperation_Behavior.call_perform_1215601182156(operation, this.getRealNodeById("680562289607955864"));
    }
  }
}
