package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.ScriptBuilder;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.ide.messages.MessagesViewTool;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.ide.actions.ModelCheckerTool_Tool;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.make.runtime.backports.ProgressIndicatorProgressStrategy;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IProgress;
import jetbrains.mps.make.script.IFeedback;
import jetbrains.mps.internal.make.runtime.script.LoggingFeedbackStrategy;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.make.script.IOption;
import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.make.runtime.script.UIQueryRelayStrategy;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.make.script.IMonitors;
import com.intellij.ide.IdeEventQueue;
import com.intellij.openapi.progress.Progressive;
import jetbrains.mps.internal.make.runtime.backports.JobMonitorProgressIndicator;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import com.intellij.openapi.project.Project;

public class MakeActionImpl {
  private IOperationContext context;
  private MakeActionParameters params;
  private boolean cleanMake;

  public MakeActionImpl(IOperationContext context, MakeActionParameters params, boolean cleanMake) {
    this.context = context;
    this.params = params;
    this.cleanMake = cleanMake;
  }

  public void executeAction() {
    final Iterable<? extends IResource> inputRes = params.collectInput(!(this.cleanMake));

    ScriptBuilder scb = new ScriptBuilder();
    scb = scb.withFacets(new IFacet.Name("Generate"), new IFacet.Name("TextGen"), new IFacet.Name("JavaCompile"), new IFacet.Name("Make")).withTarget(new ITarget.Name("make"));

    final IScript scr = this.completeScript(scb.toScript());

    if (!(scr.isValid())) {
      context.getProject().getComponent(MessagesViewTool.class).add(new Message(MessageKind.ERROR, (cleanMake ?
        "Rebuild" :
        "Make"
      ) + " failed. Invalid script."));
      return;
    }

    // save all before launching the script 
    ModelAccess.instance().runWriteActionInCommand(new Runnable() {
      public void run() {
        SModelRepository.getInstance().saveAll();
      }
    });

    final Wrappers._T<IResult> res = new Wrappers._T<IResult>();

    ModelCheckerTool_Tool mct = this.context.getProject().getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class);
    if (mct.checkModelsBeforeGenerationIfNeeded(this.context, Sequence.fromIterable(this.selectModels(inputRes)).toListSequence(), new Runnable() {
      public void run() {
        res.value = scr.execute(inputRes);
      }
    })) {
      //  this is insanity! really call this _again_? 
      new _FunctionTypes._return_P0_E0<IResult>() {
        public IResult invoke() {
          return res.value = scr.execute(inputRes);
        }
      }.invoke();
    }

    if (!(res.value.isSucessful())) {
      context.getProject().getComponent(MessagesViewTool.class).add(new Message(MessageKind.ERROR, (cleanMake ?
        "Rebuild" :
        "Make"
      ) + " failed. See previous messages for details."));
    }
  }

  private Iterable<SModelDescriptor> selectModels(Iterable<? extends IResource> inputRes) {
    return Sequence.fromIterable(inputRes).<SModelDescriptor>translate(new ITranslator2<IResource, SModelDescriptor>() {
      public Iterable<SModelDescriptor> translate(IResource it) {
        return ((MResource) it).models();
      }
    });
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
        return new UIQueryRelayStrategy().relayQuery(query, MakeActionImpl.this.context);
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
        ), true, MakeActionImpl.this.context.getProject());
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
        vars._0(MakeActionImpl.this.context.getProject());
        vars._1(MakeActionImpl.this.context);
        vars._2(MakeActionImpl.this.cleanMake);
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
