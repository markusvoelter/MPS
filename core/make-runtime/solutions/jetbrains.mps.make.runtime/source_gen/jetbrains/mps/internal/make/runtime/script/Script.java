package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import jetbrains.mps.make.script.IScript;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.facet.ITarget;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IMonitors;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.make.script.IJob;
import java.util.Collections;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;

public class Script implements IScript {
  private static Logger LOG = Logger.getLogger(Script.class);

  private ITarget.Name defaultTargetName;
  private TargetRange targetRange;
  private List<ValidationError> errors = ListSequence.fromList(new ArrayList<ValidationError>());
  private boolean validated = false;
  private _FunctionTypes._void_P1_E0<? super IParametersPool> init;
  private IMonitors monitors;

  public Script(TargetRange targetRange, ITarget.Name defaultTargetName) {
    this.targetRange = targetRange;
    this.defaultTargetName = defaultTargetName;
  }

  public void setInit(_FunctionTypes._void_P1_E0<? super IParametersPool> init) {
    this.init = init;
  }

  public void setMonitors(IMonitors mons) {
    this.monitors = mons;
  }

  public void validate() {
    ListSequence.fromList(errors).clear();
    if (!(targetRange.hasTarget(defaultTargetName))) {
      LOG.error("unknown default target: " + defaultTargetName);
      error(defaultTargetName, "unknown default target: " + defaultTargetName);
    }
    if (targetRange.hasCycles()) {
      LOG.error("cycle(s) detected: " + targetRange.cycles());
      error(this, "cycle(s) detected: " + targetRange.cycles());
    }
    validated = true;
  }

  public void invalidate() {
    this.validated = false;
  }

  public boolean isValid() {
    return validated && ListSequence.fromList(errors).isEmpty();
  }

  public Iterable<ITarget> allTargets() {
    return targetRange.sortedTargets();
  }

  public ITarget defaultTarget() {
    ITarget trg = targetRange.getTarget(defaultTargetName);
    if (trg == null) {
      LOG.error("no such target: " + defaultTargetName);
    }
    return trg;
  }

  private void error(Object o, String message) {
    ListSequence.fromList(this.errors).addElement(new ValidationError(o, message));
  }

  public IResult execute(final Iterable<? extends IResource> scriptInput) {
    validate();
    if (!(isValid())) {
      LOG.error("attempt to execute invalid script");
      throw new IllegalStateException("invalid script");
    }
    LOG.info("Beginning to execute script");
    final CompositeResult results = new CompositeResult();
    final Script.ParametersPool pool = new Script.ParametersPool();
    LOG.info("Initializing");
    if (init != null) {
      init.invoke(pool);
    }
    IMonitors mons = monitors;
    if (mons == null) {
      mons = new Script.Monitors();
    }
    final Iterable<ITarget> toExecute = targetRange.targetAndSortedPrecursors(defaultTargetName);
    mons.runConfigWithMonitor(new _FunctionTypes._void_P1_E0<IConfigMonitor>() {
      public void invoke(IConfigMonitor cmon) {
        for (ITarget trg : Sequence.fromIterable(toExecute)) {
          LOG.info("Configuring " + trg.getName());
          IConfig cfg = trg.createConfig();
          if (cfg != null && !(cfg.configure(cmon, pool))) {
            LOG.info("Configuration failed");
            results.addResult(trg.getName(), new IResult.FAILURE(null));
            return;
          }
        }
      }
    });
    if (!(results.isSucessful())) {
      return results;
    }
    mons.runJobWithMonitor(new _FunctionTypes._void_P1_E0<IJobMonitor>() {
      public void invoke(IJobMonitor monit) {
        for (ITarget trg : Sequence.fromIterable(toExecute)) {
          LOG.info("Executing " + trg.getName());
          Iterable<ITarget> impre = targetRange.immediatePrecursors(trg.getName());
          Iterable<IResource> input = (Iterable<IResource>) ((Sequence.fromIterable(impre).isEmpty() ?
            scriptInput :
            Sequence.fromIterable(impre).<IResult>select(new ISelector<ITarget, IResult>() {
              public IResult select(ITarget t) {
                return results.getResult(t.getName());
              }
            }).<IResource>translate(new ITranslator2<IResult, IResource>() {
              public Iterable<IResource> translate(IResult r) {
                return r.output();
              }
            }).distinct().toListSequence()
          ));
          LOG.info("Input: " + input);
          if (trg.requiresInput()) {
            if (Sequence.fromIterable(input).isEmpty()) {
              LOG.info("No input. Stopping");
              results.addResult(trg.getName(), new IResult.FAILURE(null));
              return;
            }
            // TODO: check for appropriate input class 
          }
          IJob job = trg.createJob();
          IResult jr = job.execute(input, monit, pool);
          if (!(trg.producesOutput())) {
            // ignore the output 
            jr = new Script.SubsOutputResult(jr, (trg.requiresInput() ?
              null :
              input
            ));
          }
          results.addResult(trg.getName(), jr);
          if (!(jr.isSucessful()) || monit.pleaseStop()) {
            LOG.info((jr.isSucessful() ?
              "Stop requested" :
              "Execution failed"
            ));
            return;
          }
        }
      }
    });
    LOG.info("Finished executing script");
    return results;
  }

  public IResult execute() {
    return execute(Sequence.fromIterable(Collections.<IResource>emptyList()));
  }

  public class ParametersPool implements IParametersPool {
    private Map<ITarget.Name, Object> cache = MapSequence.fromMap(new HashMap<ITarget.Name, Object>());

    public ParametersPool() {
    }

    public <T> T parameters(ITarget.Name target, Class<T> cls) {
      if (!(MapSequence.fromMap(cache).containsKey(target))) {
        T vars = targetRange.getTarget(target).createParameters(cls);
        MapSequence.fromMap(cache).put(target, vars);
      }
      return cls.cast(MapSequence.fromMap(cache).get(target));
    }
  }

  private class Monitors implements IMonitors {
    public Monitors() {
    }

    public void runJobWithMonitor(_FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
      code.invoke(new IJobMonitor.Stub());
    }

    public void runConfigWithMonitor(_FunctionTypes._void_P1_E0<? super IConfigMonitor> code) {
      code.invoke(new IConfigMonitor.Stub());
    }
  }

  private static class SubsOutputResult implements IResult {
    private IResult result;
    private Iterable<? extends IResource> output;

    public SubsOutputResult(IResult result, Iterable<? extends IResource> output) {
      this.result = result;
      this.output = output;
    }

    @SuppressWarnings(value = {"unchecked"})
    public Iterable<IResource> output() {
      return (Iterable<IResource>) output;
    }

    public boolean isSucessful() {
      return result.isSucessful();
    }
  }
}
