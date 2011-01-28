package jetbrains.mps.make.unittest;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.make.runtime.script.Script;
import jetbrains.mps.internal.make.runtime.script.TargetRange;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IResult;
import junit.framework.Assert;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JMock;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

@RunWith(JMock.class)
public class Execute_Test extends MockTestCase {
  @Test
  public void test_single() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    Mockups.allowing(context, make);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult res = sc.execute();
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertNotNull(res.output());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Test
  public void test_resources() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final ITarget res = Mockups.target(context, "res");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult result = Mockups.result(context, "result", true);
    context.checking(new Expectations() {
      {
        atLeast(1).of(res).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        atLeast(1).of(res).producesOutput();
        will(returnValue(true));
        exactly(1).of(res).createJob();
        will(returnValue(Mockups.job(context, "resjob", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return result;
          }
        })));
        atLeast(1).of(result).output();
        will(onConsecutiveCalls(returnValue(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)), returnValue(null)));

        atLeast(1).of(make).requiresInput();
        will(returnValue(true));
        exactly(1).of(make).createJob();
        IJob makejob = new IJob() {
          public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pp) {
            Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(input)).isEmpty());
            return result;
          }
        };
        will(returnValue(makejob));
      }
    });
    Mockups.allowing(context, res);
    Mockups.allowing(context, make);
    Mockups.allowing(context, result);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);
    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), res));

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute();
    Assert.assertNotNull(r);
    Assert.assertTrue(r.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(r.output()).isEmpty());
  }

  @Test
  public void test_inputResources() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult result = Mockups.result(context, "result", true);
    context.checking(new Expectations() {
      {
        atLeast(1).of(make).requiresInput();
        will(returnValue(true));
        exactly(1).of(make).createJob();
        IJob makejob = new IJob() {
          public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pp) {
            Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(input)).isEmpty());
            return result;
          }
        };
        will(returnValue(makejob));
      }
    });
    Mockups.allowing(context, make);
    Mockups.allowing(context, result);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB));
    Assert.assertNotNull(r);
    Assert.assertTrue(r.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(r.output()).isEmpty());
  }

  @Test
  public void test_transpResources() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final ITarget nop = Mockups.target(context, "nop");
    final ITarget res = Mockups.target(context, "res");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult result = Mockups.result(context, "result", true);
    context.checking(new Expectations() {
      {
        atLeast(1).of(res).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        exactly(1).of(res).createJob();
        will(returnValue(Mockups.job(context, "resjob", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return result;
          }
        })));
        atLeast(1).of(res).producesOutput();
        will(returnValue(true));
        atLeast(1).of(result).output();
        will(returnValue(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)));

        atLeast(1).of(nop).before();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("make"))));
        atLeast(1).of(nop).after();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("res"))));

        atLeast(1).of(make).requiresInput();
        will(returnValue(true));
        exactly(1).of(make).createJob();
        IJob makejob = new IJob() {
          public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pp) {
            Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(input)).isEmpty());
            return result;
          }
        };
        will(returnValue(makejob));

      }
    });
    Mockups.allowing(context, res);
    Mockups.allowing(context, nop);
    Mockups.allowing(context, make);
    Mockups.allowing(context, result);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);
    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), res, nop));

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute();
    Assert.assertNotNull(r);
    Assert.assertTrue(r.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(r.output()).isEmpty());
  }

  @Test
  public void test_noDuplicateResources() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final ITarget nop = Mockups.target(context, "nop");
    final ITarget nop2 = Mockups.target(context, "nop2");
    final ITarget dup = Mockups.target(context, "dup");
    final ITarget res = Mockups.target(context, "res");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult result = Mockups.result(context, "result", true);
    context.checking(new Expectations() {
      {
        atLeast(1).of(res).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        exactly(1).of(res).createJob();
        will(returnValue(Mockups.job(context, "resjob", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return result;
          }
        })));
        atLeast(1).of(res).producesOutput();
        will(returnValue(true));
        atLeast(1).of(result).output();
        will(returnValue(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)));

        atLeast(1).of(nop).before();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("make"))));
        atLeast(1).of(nop).after();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("res"))));

        atLeast(1).of(nop2).before();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("make"))));
        atLeast(1).of(nop2).after();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("res"))));

        atLeast(1).of(dup).before();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("make"))));
        atLeast(1).of(dup).after();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("res"))));
        exactly(1).of(dup).createJob();
        will(returnValue(Mockups.job(context, "resjob2", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return result;
          }
        })));
        atLeast(1).of(dup).producesOutput();
        will(returnValue(true));

        atLeast(1).of(make).requiresInput();
        will(returnValue(true));
        exactly(1).of(make).createJob();
        IJob makejob = new IJob() {
          public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pp) {
            Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(input)).isEmpty());
            return result;
          }
        };
        will(returnValue(makejob));
      }
    });
    Mockups.allowing(context, res);
    Mockups.allowing(context, nop);
    Mockups.allowing(context, nop2);
    Mockups.allowing(context, dup);
    Mockups.allowing(context, make);
    Mockups.allowing(context, result);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);
    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), res, nop, nop2, dup));

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute();
    Assert.assertNotNull(r);
    Assert.assertTrue(r.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(r.output()).isEmpty());
  }

  @Test
  public void test_resultResources() throws Exception {
    final ITarget nop = Mockups.target(context, "nop");
    final ITarget res = Mockups.target(context, "res");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult result = Mockups.result(context, "result", true);
    context.checking(new Expectations() {
      {
        exactly(1).of(res).createJob();
        will(returnValue(Mockups.job(context, "resjob", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return result;
          }
        })));
        atLeast(1).of(res).producesOutput();
        will(returnValue(true));
        atLeast(1).of(result).output();
        will(returnValue(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)));

        atLeast(1).of(nop).after();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("res"))));

      }
    });
    Mockups.allowing(context, res);
    Mockups.allowing(context, nop);
    Mockups.allowing(context, result);

    TargetRange tr = new TargetRange();
    tr.addTarget(nop);
    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), res));

    Script sc = new Script(tr, new ITarget.Name("nop"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute();
    Assert.assertNotNull(r);
    Assert.assertTrue(r.isSucessful());
    Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(r.output())).isEmpty());
  }

  @Test
  public void test_fail() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final ITarget gen = Mockups.target(context, "gen");
    final ITarget res = Mockups.target(context, "res");
    final IResource resA = Mockups.resource(context, "resA");
    final IResource resB = Mockups.resource(context, "resB");
    final IResult okresult = Mockups.result(context, "okresult", true);
    final IResult failresult = Mockups.result(context, "failresult", false);
    context.checking(new Expectations() {
      {
        atLeast(1).of(res).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        atLeast(1).of(res).producesOutput();
        will(returnValue(true));
        exactly(1).of(res).createJob();
        will(returnValue(Mockups.job(context, "resjob", new _FunctionTypes._return_P0_E0<IResult>() {
          public IResult invoke() {
            return okresult;
          }
        })));
        atLeast(1).of(okresult).output();
        will(returnValue(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)));

        atLeast(1).of(gen).before();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("make")})));
        atLeast(1).of(gen).after();
        will(returnValue(Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("res")})));
        atLeast(1).of(gen).requiresInput();
        will(returnValue(true));
        IJob genjob = new IJob() {
          public IResult execute(Iterable<IResource> input, IJobMonitor mon, IParametersPool pp) {
            Assert.assertTrue(ListSequence.fromList(ListSequence.fromListAndArray(new ArrayList<IResource>(), resA, resB)).disjunction(Sequence.fromIterable(input)).isEmpty());
            return failresult;
          }
        };
        exactly(1).of(gen).createJob();
        will(returnValue(genjob));

        never(make).createJob();
      }
    });
    Mockups.allowing(context, res);
    Mockups.allowing(context, gen);
    Mockups.allowing(context, make);
    Mockups.allowing(context, okresult);
    Mockups.allowing(context, failresult);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);
    tr.addRelated(ListSequence.fromListAndArray(new ArrayList<ITarget>(), gen, res));

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult r = sc.execute();
    Assert.assertNotNull(r);
    Assert.assertFalse(r.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(r.output()).isEmpty());
  }

  @Test
  public void test_variables() throws Exception {
    final ITarget make = Mockups.target(context, "make");
    final ITarget config = Mockups.target(context, "config");
    final IJobMonitor monit = Mockups.monitor(context, "mon");
    final String[] vars = new String[1];
    context.checking(new Expectations() {
      {
        atLeast(1).of(config).before();
        will(returnValue(Sequence.<ITarget.Name>singleton(new ITarget.Name("make"))));
        exactly(1).of(config).createJob();
        IJob cj = new IJob() {
          public IResult execute(Iterable<IResource> res, IJobMonitor mon, IParametersPool pool) {
            String[] arr = pool.parameters(new ITarget.Name("make"), (new String[0]).getClass());
            arr[0] = "BARFOO";
            return new IResult.SUCCESS(res);
          }
        };
        will(returnValue(cj));

        exactly(1).of(make).createParameters(with(aNonNull(Class.class)));
        will(returnValue(vars));
        exactly(1).of(make).createJob();
        IJob mj = new IJob() {
          public IResult execute(Iterable<IResource> res, IJobMonitor mon, IParametersPool pool) {
            String[] arr = pool.parameters(new ITarget.Name("make"), (new String[0]).getClass());
            Assert.assertEquals("BARFOO", arr[0]);
            arr[0] = "FUBAR";
            return new IResult.SUCCESS(res);
          }
        };
        will(returnValue(mj));
      }
    });
    Mockups.allowing(context, make);
    Mockups.allowing(context, config);

    TargetRange tr = new TargetRange();
    tr.addTarget(make);
    tr.addTarget(config);

    Script sc = new Script(tr, new ITarget.Name("make"));
    sc.validate();
    Assert.assertTrue(sc.isValid());

    IResult res = sc.execute();
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
    Assert.assertNotNull(res.output());
    Assert.assertEquals("FUBAR", vars[0]);
  }
}
