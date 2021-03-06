package jetbrains.mps.baseLanguage.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.lang.test.runtime.TypeSystemCheckUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

@MPSLaunch
public class RollBacksNewTypeSystem_Test extends BaseTransformationTest {
  @Test
  public void test_GenerationMode() throws Throwable {
    this.initTest("${mps_home}/MPS.mpr", "r:00000000-0000-4000-0000-011c895902c7(jetbrains.mps.baseLanguage.test)");
    this.runTest("jetbrains.mps.baseLanguage.test.RollBacksNewTypeSystem_Test$TestBody", "test_GenerationMode", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_GenerationMode() throws Exception {
      this.addNodeById("5210914756411638024");
      TypeSystemCheckUtil.checkRollBacks(SNodeOperations.cast(this.getNodeById("5210914756411638027"), "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration"));
    }
  }
}
