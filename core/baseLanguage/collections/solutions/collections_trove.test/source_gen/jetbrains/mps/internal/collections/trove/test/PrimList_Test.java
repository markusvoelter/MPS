package jetbrains.mps.internal.collections.trove.test;

/*Generated by MPS */

import junit.framework.TestCase;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TByteArrayListDecorator;
import gnu.trove.TByteArrayList;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TDoubleArrayListDecorator;
import gnu.trove.TDoubleArrayList;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TFloatArrayListDecorator;
import gnu.trove.TFloatArrayList;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TIntArrayListDecorator;
import gnu.trove.TIntArrayList;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TLongArrayListDecorator;
import gnu.trove.TLongArrayList;
import jetbrains.mps.baseLanguage.collections.trove.runtime.TShortArrayListDecorator;
import gnu.trove.TShortArrayList;
import junit.framework.Assert;
import java.util.ArrayList;
import java.lang.management.MemoryMXBean;
import java.lang.management.ManagementFactory;

public class PrimList_Test extends TestCase {
  public void test_primLists() throws Exception {
    List<Byte> lb = ListSequence.fromListAndArray(new TByteArrayListDecorator(new TByteArrayList()), (byte)13);
    List<Double> ld = ListSequence.fromList(new TDoubleArrayListDecorator(new TDoubleArrayList()));
    List<Float> lf = ListSequence.fromList(new TFloatArrayListDecorator(new TFloatArrayList()));
    List<Integer> li = ListSequence.fromList(new TIntArrayListDecorator(new TIntArrayList()));
    List<Long> ll = ListSequence.fromList(new TLongArrayListDecorator(new TLongArrayList()));
    List<Short> ls = ListSequence.fromList(new TShortArrayListDecorator(new TShortArrayList()));
    Assert.assertNotNull(lb);
    Assert.assertNotNull(ld);
    Assert.assertNotNull(lf);
    Assert.assertNotNull(li);
    Assert.assertNotNull(ll);
    Assert.assertNotNull(ls);
  }

  public void test_byteList() throws Exception {
    List<Byte> lb = ListSequence.fromList(new TByteArrayListDecorator(new TByteArrayList()));
    ListSequence.fromList(lb).addElement((byte)0);
    ListSequence.fromList(lb).addElement((byte)-1);
    ListSequence.fromList(lb).addElement((byte)256);
    Assert.assertSame(3, ListSequence.fromList(lb).count());
    Assert.assertSame(ListSequence.fromList(lb).getElement(0), ListSequence.fromList(lb).getElement(2));
  }

  public void test_intList() throws Exception {
    List<Integer> liPrim = ListSequence.fromList(new TIntArrayListDecorator(new TIntArrayList()));
    List<Integer> liBox = ListSequence.fromList(new ArrayList<Integer>());
    long mem1 = this.getUsedMem();
    for (int i = 100000; i < 200000; i++) {
      ListSequence.fromList(liPrim).addElement(i);
    }
    long mem2 = this.getUsedMem();
    Assert.assertEquals((int)100000, (int)ListSequence.fromList(liPrim).count());
    ListSequence.fromList(liPrim).clear();
    long mem3 = this.getUsedMem();
    for (int i = 200000; i < 300000; i++) {
      ListSequence.fromList(liBox).addElement(i);
    }
    long mem4 = this.getUsedMem();
    Assert.assertTrue(3 * (mem2 - mem1) < (mem4 - mem3));
    Assert.assertEquals((int)100000, (int)ListSequence.fromList(liBox).count());
  }

  private long getUsedMem() {
    System.gc();
    System.gc();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    System.gc();
    MemoryMXBean bean = ManagementFactory.getMemoryMXBean();
    /*
      System.out.println("HEAP -------> " + bean.getHeapMemoryUsage().toString());
    */
    return bean.getHeapMemoryUsage().getUsed();
  }
}
