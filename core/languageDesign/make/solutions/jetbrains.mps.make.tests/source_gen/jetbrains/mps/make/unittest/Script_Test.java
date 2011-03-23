package jetbrains.mps.make.unittest;

/*Generated by MPS */

import org.junit.runner.RunWith;
import org.jmock.integration.junit4.JMock;
import org.junit.Test;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import junit.framework.AssertionFailedError;
import jetbrains.mps.make.facet.ITarget;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.script.IParametersPool;
import junit.framework.Assert;

@RunWith(JMock.class)
public class Script_Test extends MockTestCase {
  @Test
  public void test_init() throws Exception {
    IScript.Stub stub = new IScript.Stub() {
      public IResult execute(Iterable<? extends IResource> input) {
        throw new AssertionFailedError();
      }

      public Iterable<ITarget> allTargets() {
        throw new AssertionFailedError();
      }

      public ITarget finalTarget() {
        throw new AssertionFailedError();
      }

      public boolean isValid() {
        throw new AssertionFailedError();
      }
    };
    final List<String> res = ListSequence.fromList(new ArrayList<String>());
    IScript.StubBoss boss = new IScript.StubBoss(stub) {
      @Override
      public void init(IParametersPool ppool) {
        ListSequence.fromList(res).addElement("boss");
        super.init(ppool);
      }
    };
    stub.init(null);
    Assert.assertEquals(ListSequence.fromListAndArray(new ArrayList<String>(), "boss"), res);
    new IScript.StubBoss(boss) {
      @Override
      public void init(IParametersPool ppool) {
        ListSequence.fromList(res).addElement("bossboss");
        super.init(ppool);
      }
    };
    stub.init(null);
    Assert.assertEquals(ListSequence.fromListAndArray(new ArrayList<String>(), "boss", "boss", "bossboss"), res);
    return;
  }
}
