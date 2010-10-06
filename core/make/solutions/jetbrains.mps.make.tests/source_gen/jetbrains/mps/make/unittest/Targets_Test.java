package jetbrains.mps.make.unittest;

/*Generated by MPS */

import jetbrains.mps.make.runtime.script.TargetRange;
import jetbrains.mps.make.runtime.ITarget;
import junit.framework.Assert;
import jetbrains.mps.make.runtime.script.NoSuchTargetException;
import org.jmock.Expectations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import java.util.List;

public class Targets_Test extends MockTestCase {
  public void test_missing() throws Exception {
    TargetRange tr = new TargetRange();
    try {
      tr.getTarget(new ITarget.Name("none"));
      Assert.fail();
    } catch (NoSuchTargetException e) {
      // expected exception 
    }
  }

  public void test_extended() throws Exception {
    TargetRange tr = new TargetRange();
    final ITarget foo = Mockups.target(context, "foo", new ITarget.Name("foo"));
    context.checking(new Expectations() {
      {
        atLeast(1).of(foo).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("bar")})));
      }
    });
    Mockups.allowing(context, foo);
    tr.addTarget(foo);
    Assert.assertTrue(tr.hasTarget(new ITarget.Name("foo")));
    final ITarget foo2 = Mockups.target(context, "foo2", new ITarget.Name("foo"));
    context.checking(new Expectations() {
      {
        atLeast(1).of(foo2).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("baz")})));
      }
    });
    Mockups.allowing(context, foo2);
    tr.addTarget(foo2);
    Assert.assertTrue(tr.hasTarget(new ITarget.Name("foo")));
    ITarget trg = tr.getTarget(new ITarget.Name("foo"));
    Assert.assertNotNull(trg);
    Assert.assertTrue(Sequence.fromIterable(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("bar"), new ITarget.Name("baz")})).disjunction(Sequence.fromIterable(trg.before())).isEmpty());
    Assert.assertFalse(tr.hasCycles());
    tr.sortedTargets();
    Assert.assertSame(trg, Sequence.fromIterable(tr.sortedTargets()).first());
  }

  public void test_available() throws Exception {
    TargetRange tr = new TargetRange();
    final ITarget make = Mockups.target(context, "make", new ITarget.Name("make"));
    Mockups.allowing(context, make);
    tr.addTarget(make);

    final ITarget gen = Mockups.target(context, "gen", new ITarget.Name("gen"));
    final ITarget text = Mockups.target(context, "text", new ITarget.Name("text"));
    context.checking(new Expectations() {
      {
        atLeast(1).of(text).after();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("gen")})));
        atLeast(1).of(text).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        atLeast(1).of(gen).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
      }
    });
    Mockups.allowing(context, gen);
    Mockups.allowing(context, text);

    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), gen, text));
    Assert.assertTrue(tr.hasTarget(new ITarget.Name("gen")));
    Assert.assertTrue(tr.hasTarget(new ITarget.Name("text")));
    List<ITarget> expected = ListSequence.fromListAndArray(new ArrayList<ITarget>(), gen, text, make);
    for (ITarget t : Sequence.fromIterable(tr.sortedTargets())) {
      Assert.assertSame(ListSequence.fromList(expected).removeElementAt(0), t);
    }
  }

  public void test_cycles() throws Exception {
    TargetRange tr = new TargetRange();
    final ITarget make = Mockups.target(context, "make", new ITarget.Name("make"));
    context.checking(new Expectations() {
      {
        atLeast(1).of(make).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
      }
    });
    Mockups.allowing(context, make);
    tr.addTarget(make);

    Assert.assertTrue(tr.hasCycles());
    Assert.assertSame(make.getName(), ListSequence.fromList(ListSequence.fromList(tr.cycles()).first()).first());
  }
}
