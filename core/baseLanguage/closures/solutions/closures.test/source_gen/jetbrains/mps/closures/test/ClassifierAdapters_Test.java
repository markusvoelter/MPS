package jetbrains.mps.closures.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.closures.runtime.FunctionTypes;
import junit.framework.Assert;

public class ClassifierAdapters_Test extends TestCase {

  public void test_interfaceAsFunctionType() throws Exception {
    Worker wrk = new Worker() {

      public String doWork(Integer d) {
        return "Done: " + Integer.valueOf(d);
      }

    };
    FunctionTypes._R_from_T<? extends String, ? super Integer> ft = new _Adapters.Worker_to__R_from_T_adapter(wrk);
    Assert.assertEquals("Done: 1234", ft.invoke(1234));
  }

  public void test_functionTypeAsInterface() throws Exception {
    // TODO fix when MPS-772 is fixed 
    FunctionTypes._R_from_T<? extends String, ? super Integer> cls = new FunctionTypes._R_from_T <String, Integer>() {

      public String invoke(Integer foo) {
        return "Done: ";
      }

    };
    Worker wrk = new _Adapters._R_from_T_to_Worker_adapter(cls);
    Assert.assertEquals("Done: 4321", wrk.doWork(4321));
  }

}
