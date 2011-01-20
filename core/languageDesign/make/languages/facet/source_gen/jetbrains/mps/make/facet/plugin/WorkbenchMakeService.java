package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.make.IResourceProvider;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IProgress;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.internal.make.runtime.script.LoggingFeedbackStrategy;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.make.script.IMonitors;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import com.intellij.ide.IdeEventQueue;
import jetbrains.mps.smodel.ModelAccess;
import com.intellij.openapi.progress.Progressive;
import jetbrains.mps.internal.make.runtime.backports.JobMonitorProgressIndicator;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;
import jetbrains.mps.make.facet.ITarget;

public class WorkbenchMakeService implements IMakeService {
  private IOperationContext context;
  private boolean cleanMake;

  public WorkbenchMakeService(IOperationContext context, boolean cleanMake) {
    this.context = context;
    this.cleanMake = cleanMake;
  }

  public void make(IScript script, IResourceProvider resourceProvider) {
  }

  private IScript completeScript(IScript scr) {
    final ProgressIndicatorProgressStrategy progStrat = new ProgressIndicatorProgressStrategy();
    final IJobMonitor jmon = new IJobMonitor() {
      public boolean stopRequested() {
        return (progStrat.getProgressIndicator() != null ?
          progStrat.getProgressIndicator().isCanceled() :
          false
        );
      }

      public IProgress currentProgress() {
        return progStrat.currentProgress();
      }

      public void reportFeedback(IFeedback fdbk) {
        new LoggingFeedbackStrategy().reportFeedback(fdbk);
      }
    };
    final IConfigMonitor cmon = new IConfigMonitor() {
      public <T extends IOption> T relayQuery(IQuery<T> query) {
        return new UIQueryRelayStrategy().relayQuery(query, WorkbenchMakeService.this.context);
      }
    };

    final Wrappers._T<ProgressIndicator> pind = new Wrappers._T<ProgressIndicator>(null);
    final IMonitors mons = new IMonitors.Stub(cmon, jmon) {
      @Override
      public void runJobWithMonitor(final _FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
        IdeEventQueue.getInstance().flushQueue();
        ModelAccess.instance().runWriteActionWithProgressSynchronously(new Progressive() {
          public void run(ProgressIndicator realInd) {
            progStrat.setProgressIndicator(realInd);
            pind.value = new JobMonitorProgressIndicator(jmon);
            code.invoke(jmon);
          }
        }, (cleanMake ?
          "Rebuild" :
          "Make"
        ), true, WorkbenchMakeService.this.context.getProject());
      }
    };

    final _FunctionTypes._return_P0_E0<? extends ProgressIndicator> pindGet = new _FunctionTypes._return_P0_E0<ProgressIndicator>() {
      public ProgressIndicator invoke() {
        return pind.value;
      }
    };
    final _FunctionTypes._void_P1_E0<? super IParametersPool> init = new _FunctionTypes._void_P1_E0<IParametersPool>() {
      public void invoke(IParametersPool pool) {
        Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>> vars = (Tuples._4<Project, IOperationContext, Boolean, _FunctionTypes._return_P0_E0<? extends ProgressIndicator>>) pool.parameters(new ITarget.Name("checkParameters"), Object.class);
        vars._0(WorkbenchMakeService.this.context.getProject());
        vars._1(WorkbenchMakeService.this.context);
        vars._2(WorkbenchMakeService.this.cleanMake);
        vars._3(pindGet);
      }
    };
    return new IScript.StubBoss(scr) {
      @Override
      public void init(IParametersPool ppool) {
        init.invoke(ppool);
      }

      @Override
      public IMonitors monitors() {
        return mons;
      }
    };
  }
}
