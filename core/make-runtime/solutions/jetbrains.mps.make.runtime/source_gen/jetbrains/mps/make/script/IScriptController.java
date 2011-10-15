package jetbrains.mps.make.script;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.progress.ProgressMonitor;

public interface IScriptController {
  public void runConfigWithMonitor(_FunctionTypes._void_P1_E0<? super IConfigMonitor> code);
  public void runJobWithMonitor(_FunctionTypes._void_P1_E0<? super IJobMonitor> code);
  @Deprecated
  public void setup(IPropertiesPool ppool);
  public void setup(IPropertiesPool pp, Iterable<ITarget> toExecute, Iterable<? extends IResource> input);
  public void useMonitor(ProgressMonitor monitor);
  public static class Stub implements IScriptController {
    private IConfigMonitor cmon;
    private IJobMonitor jmon;

    public Stub(IConfigMonitor cmon, IJobMonitor jmon) {
      this.cmon = cmon;
      this.jmon = jmon;
    }

    public Stub() {
      this.cmon = new IConfigMonitor.Stub();
      this.jmon = new IJobMonitor.Stub();
    }

    public void runJobWithMonitor(_FunctionTypes._void_P1_E0<? super IJobMonitor> code) {
      code.invoke(jmon);
    }

    public void runConfigWithMonitor(_FunctionTypes._void_P1_E0<? super IConfigMonitor> code) {
      code.invoke(cmon);
    }

    public void setup(IPropertiesPool ppool) {
    }

    public void setup(IPropertiesPool pp, Iterable<ITarget> toExecute, Iterable<? extends IResource> input) {
      setup(pp);
    }

    public void useMonitor(ProgressMonitor monitor) {
    }
  }

}
