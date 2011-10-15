package jetbrains.mps.make.generator;

/*Generated by MPS */

import org.junit.runner.RunWith;
import org.jmock.integration.junit4.JMock;
import jetbrains.mps.make.unittest.MockTestCase;
import jetbrains.mps.make.facet.IFacetManifest;
import org.junit.Test;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.script.IProgress;
import org.jmock.Expectations;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IScriptController;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.facet.IFacet;
import junit.framework.Assert;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.progress.EmptyProgressMonitor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.unittest.Mockups;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.jmock.api.Action;
import org.jmock.api.Invocation;
import jetbrains.mps.make.script.IPropertiesPool;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.internal.make.runtime.script.LoggingProgressStrategy;
import org.junit.Before;
import java.lang.reflect.Constructor;
import org.junit.After;
import jetbrains.mps.make.facet.FacetRegistry;

@RunWith(JMock.class)
public class Generator_Test extends MockTestCase {
  private IFacetManifest manifest;

  @Test
  public void test_buildScript() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    final IProgress pstub = context.mock(IProgress.class);
    context.checking(new Expectations() {
      {
        exactly(1).of(pstub).beginWork(with(equal("Script")), with(equal(1020)), with(any(Integer.class)));
        exactly(1).of(pstub).beginWork(with(equal(new ITarget.Name("Generator_.Configure").toString())), with(equal(1000)), with(equal(10)));
        exactly(1).of(pstub).beginWork(with(equal(new ITarget.Name("Generator_.Generate").toString())), with(equal(1000)), with(equal(1000)));
        exactly(1).of(pstub).beginWork(with(equal(new ITarget.Name("Maker_.Make").toString())), with(equal(1000)), with(equal(10)));

        exactly(1).of(pstub).beginWork(with(equal("GENERATE")), with(same(100)), with(any(Integer.class)));
        atMost(1).of(pstub).advanceWork(with(equal("GENERATE")), with(same(50)));
        exactly(1).of(pstub).finishWork(with(equal("GENERATE")));

        atMost(3).of(pstub).advanceWork(with(equal("Script")), with(same(1)));
        exactly(1).of(pstub).finishWork(with(equal(new ITarget.Name("Maker_.Make").toString())));
        exactly(1).of(pstub).finishWork(with(equal(new ITarget.Name("Generator_.Generate").toString())));
        exactly(1).of(pstub).finishWork(with(equal(new ITarget.Name("Generator_.Configure").toString())));
        exactly(1).of(pstub).finishWork(with(equal("Script")));
        allowing(pstub).workLeft();
        will(returnValue(Integer.MAX_VALUE));
      }
    });

    final IScriptController mons = new IScriptController.Stub(new IConfigMonitor.Stub(), new IJobMonitor.Stub(pstub));
    IScript scr = scb.withFacetName(new IFacet.Name("Maker_")).withFacetName(new IFacet.Name("Generator_")).withFinalTarget(new ITarget.Name("Maker_.Make")).toScript();
    Assert.assertTrue(scr.isValid());
    ITarget dt = scr.finalTarget();
    Assert.assertNotNull(dt);
    Assert.assertEquals(new ITarget.Name("Maker_.Make"), dt.getName());
    IResult res = scr.execute(mons, null, new EmptyProgressMonitor());
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Test
  public void test_queryOk() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    final IScriptController mons = Mockups.monitors(context, "mons");
    final IConfigMonitor cmon = context.mock(IConfigMonitor.class);
    context.checking(new Expectations() {
      {
        final Object[] cfg = new Object[1];
        exactly(1).of(mons).runConfigWithMonitor((_FunctionTypes._void_P1_E0<? super IConfigMonitor>) with(new BaseMatcher<Object>() {
          public boolean matches(Object o) {
            cfg[0] = o;
            return true;
          }

          public void describeTo(Description p0) {
          }
        }));
        will(new Action() {
          public Object invoke(Invocation invocation) throws Throwable {
            ((_FunctionTypes._void_P1_E0<? super IConfigMonitor>) cfg[0]).invoke(cmon);
            return null;
          }

          public void describeTo(Description description) {
          }
        });
        exactly(1).of(mons).setup(with(aNonNull(IPropertiesPool.class)), with(aNonNull(Iterable.class)), with(any(Iterable.class)));

        final IQuery[] query = new IQuery[1];
        exactly(1).of(cmon).relayQuery(with(new BaseMatcher<IQuery>() {
          public boolean matches(Object o) {
            if (o instanceof IQuery) {
              query[0] = (IQuery) o;
              return true;
            }
            return false;
          }

          public void describeTo(Description p0) {
          }
        }));
        will(new Action() {
          public Object invoke(Invocation invocation) throws Throwable {
            return Sequence.fromIterable(query[0].options()).first();
          }

          public void describeTo(Description description) {
          }
        });
      }
    });
    Mockups.allowing(context, mons);
    IScript scr = scb.withFacetName(new IFacet.Name("Maker_")).withFacetName(new IFacet.Name("Generator_")).withFacetName(new IFacet.Name("TextGen_")).withFinalTarget(new ITarget.Name("Maker_.Make")).toScript();
    Assert.assertTrue(scr.isValid());
    ITarget dt = scr.finalTarget();
    Assert.assertNotNull(dt);
    Assert.assertEquals(new ITarget.Name("Maker_.Make"), dt.getName());
    IResult res = scr.execute(mons, null, new EmptyProgressMonitor());
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Test
  public void test_queryStop() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    final IScriptController mons = Mockups.monitors(context, "mons");
    final IConfigMonitor cmon = context.mock(IConfigMonitor.class);
    context.checking(new Expectations() {
      {
        final Object[] cfg = new Object[1];
        exactly(1).of(mons).runConfigWithMonitor((_FunctionTypes._void_P1_E0<? super IConfigMonitor>) with(new BaseMatcher<Object>() {
          public boolean matches(Object o) {
            cfg[0] = o;
            return true;
          }

          public void describeTo(Description p0) {
          }
        }));
        will(new Action() {
          public Object invoke(Invocation invocation) throws Throwable {
            ((_FunctionTypes._void_P1_E0<? super IConfigMonitor>) cfg[0]).invoke(cmon);
            return null;
          }

          public void describeTo(Description description) {
          }
        });
        exactly(1).of(mons).setup(with(aNonNull(IPropertiesPool.class)), with(aNonNull(Iterable.class)), with(any(Iterable.class)));
        exactly(1).of(cmon).reportFeedback(with(aNonNull(IFeedback.class)));

        final IQuery[] query = new IQuery[1];
        exactly(1).of(cmon).relayQuery(with(new BaseMatcher<IQuery>() {
          public boolean matches(Object o) {
            if (o instanceof IQuery) {
              query[0] = (IQuery) o;
              return true;
            }
            return false;
          }

          public void describeTo(Description p0) {
          }
        }));
        will(new Action() {
          public Object invoke(Invocation invocation) throws Throwable {
            return Sequence.fromIterable(query[0].options()).last();
          }

          public void describeTo(Description description) {
          }
        });
      }
    });
    Mockups.allowing(context, mons);

    IScript scr = scb.withFacetName(new IFacet.Name("Maker_")).withFacetName(new IFacet.Name("Generator_")).withFacetName(new IFacet.Name("TextGen_")).withFinalTarget(new ITarget.Name("Maker_.Make")).toScript();

    Assert.assertTrue(scr.isValid());
    ITarget dt = scr.finalTarget();
    Assert.assertNotNull(dt);
    Assert.assertEquals(new ITarget.Name("Maker_.Make"), dt.getName());
    IResult res = scr.execute(mons, null, new EmptyProgressMonitor());
    Assert.assertNotNull(res);
    Assert.assertFalse(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Test
  public void test_progress() throws Exception {
    ScriptBuilder scb = new ScriptBuilder();
    final IProgress pstub = context.mock(IProgress.class);
    context.checking(new Expectations() {
      {
        exactly(1).of(pstub).beginWork(with(equal("Script")), with(same(20)), with(any(Integer.class)));
        exactly(1).of(pstub).beginWork(with(equal(new ITarget.Name("Worker_.work").toString())), with(equal(1000)), with(equal(10)));
        exactly(1).of(pstub).beginWork(with(equal(new ITarget.Name("Maker_.Make").toString())), with(equal(1000)), with(equal(10)));


        org.jmock.Sequence seq = context.sequence("sequence");
        exactly(1).of(pstub).beginWork(with(equal("WORK")), with(same(100)), with(any(Integer.class)));
        inSequence(seq);
        atMost(1).of(pstub).advanceWork(with(equal("WORK")), with(same(50)));
        inSequence(seq);
        exactly(1).of(pstub).beginWork(with(equal("WORKWORK")), with(same(10)), with(any(Integer.class)));
        inSequence(seq);
        atMost(1).of(pstub).advanceWork(with(equal("WORKWORK")), with(same(5)));
        inSequence(seq);
        atMost(1).of(pstub).advanceWork(with(equal("WORKWORK")), with(same(5)));
        inSequence(seq);
        exactly(1).of(pstub).finishWork(with(equal("WORKWORK")));
        inSequence(seq);
        exactly(1).of(pstub).finishWork(with(equal("WORK")));
        inSequence(seq);

        atMost(2).of(pstub).advanceWork(with(equal("Script")), with(same(1)));
        exactly(1).of(pstub).finishWork(with(equal(new ITarget.Name("Maker_.Make").toString())));
        exactly(1).of(pstub).finishWork(with(equal(new ITarget.Name("Worker_.work").toString())));
        exactly(1).of(pstub).finishWork(with(equal("Script")));

        allowing(pstub).workLeft();
        will(returnValue(Integer.MAX_VALUE));
      }
    });

    final IScriptController mons = new IScriptController.Stub(new IConfigMonitor.Stub(), new IJobMonitor.Stub(pstub));
    IScript scr = scb.withFacetName(new IFacet.Name("Maker_")).withFacetName(new IFacet.Name("Worker_")).withFinalTarget(new ITarget.Name("Maker_.Make")).toScript();

    Assert.assertTrue(scr.isValid());
    ITarget dt = scr.finalTarget();
    Assert.assertNotNull(dt);
    Assert.assertEquals(new ITarget.Name("Maker_.Make"), dt.getName());
    IResult res = scr.execute(mons, null, new EmptyProgressMonitor());
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Test
  public void test_logProgress() throws Exception {
    final LoggingProgressStrategy.Log logger = context.mock(LoggingProgressStrategy.Log.class);
    context.checking(new Expectations() {
      {
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- started")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- done 50%")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK/WORKWORK -- started")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- done 62%")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK/WORKWORK -- done 50%")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- done 74%")));
        exactly(2).of(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK/WORKWORK -- done 100%")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK/WORKWORK -- finished")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- done 100%")));
        oneOf(logger).info(with(equal("\u221e/Script/" + new ITarget.Name("Worker_.work") + "/WORK -- finished")));

        allowing(logger).info(with(new BaseMatcher<String>() {
          public boolean matches(Object s) {
            return !(((String) s).matches(".*WORK -- .*"));
          }

          public void describeTo(Description p0) {
          }
        }));
      }
    });
    final LoggingProgressStrategy strat = new LoggingProgressStrategy(logger);
    ScriptBuilder scb = new ScriptBuilder();
    IJobMonitor.Stub jmon = new IJobMonitor.Stub(null) {
      @Override
      public IProgress currentProgress() {
        return strat.currentProgress();
      }
    };

    final IScriptController mons = new IScriptController.Stub(new IConfigMonitor.Stub(), jmon);
    IScript scr = scb.withFacetName(new IFacet.Name("Maker_")).withFacetName(new IFacet.Name("Worker_")).withFinalTarget(new ITarget.Name("Maker_.Make")).toScript();
    Assert.assertTrue(scr.isValid());
    ITarget dt = scr.finalTarget();
    Assert.assertNotNull(dt);
    Assert.assertEquals(new ITarget.Name("Maker_.Make"), dt.getName());
    IResult res = scr.execute(mons, null, new EmptyProgressMonitor());
    Assert.assertNotNull(res);
    Assert.assertTrue(res.isSucessful());
    Assert.assertTrue(Sequence.fromIterable(res.output()).isEmpty());
  }

  @Before
  public void setUp() throws Exception {
    Class<?> mf = Class.forName(Generator_Test.class.getPackage().getName() + ".FacetManifest");
    Constructor<?> ctor = mf.getConstructor();
    Object inst = ctor.newInstance();
    this.manifest = (IFacetManifest) inst;
    registerFacets(manifest);
  }

  @After
  public void tearDown() throws Exception {
    unregisterFacets(manifest);
  }

  private void registerFacets(IFacetManifest fm) {
    for (IFacet fct : fm.facets()) {
      FacetRegistry.getInstance().register(fct);
    }
  }

  private void unregisterFacets(IFacetManifest fm) {
    for (IFacet fct : fm.facets()) {
      FacetRegistry.getInstance().unregister(fct);
    }
  }
}
