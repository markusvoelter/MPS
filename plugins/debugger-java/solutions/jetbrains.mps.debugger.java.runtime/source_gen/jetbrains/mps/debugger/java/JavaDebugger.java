package jetbrains.mps.debugger.java;

/*Generated by MPS */

import jetbrains.mps.debug.api.AbstractDebugger;
import com.intellij.openapi.components.ApplicationComponent;
import jetbrains.mps.debug.api.Debuggers;
import jetbrains.mps.debug.api.breakpoints.BreakpointProvidersManager;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.api.AbstractDebugSessionCreator;
import com.intellij.openapi.project.Project;
import jetbrains.mps.debugger.java.runtime.VmCreator;
import jetbrains.mps.debug.api.breakpoints.IBreakpointsProvider;
import jetbrains.mps.debugger.java.runtime.evaluation.transform.TransformatorBuilderImpl;
import jetbrains.mps.debugger.java.runtime.proxies.ValueUtilImpl;
import jetbrains.mps.debug.evaluation.proxies.MirrorUtilImpl;
import jetbrains.mps.debug.evaluation.proxies.MirrorUtil;
import jetbrains.mps.debug.evaluation.transform.TransformatorBuilder;
import jetbrains.mps.debug.runtime.java.programState.proxies.ValueUtil;

public class JavaDebugger extends AbstractDebugger implements ApplicationComponent {
  private final JavaBreakpointsProvider myJavaBreakpointsProvider = new JavaBreakpointsProvider();

  public JavaDebugger(Debuggers debuggers, BreakpointProvidersManager breakpointsProviderManager) {
    super("Java", debuggers, breakpointsProviderManager);
  }

  @NotNull
  @Override
  public AbstractDebugSessionCreator createDebugSessionCreator(@NotNull Project project) {
    return new VmCreator(project);
  }

  @NotNull
  @Override
  public IBreakpointsProvider getBreakpointsProvider() {
    return myJavaBreakpointsProvider;
  }

  @NotNull
  @Override
  public String getComponentName() {
    return getName() + " Debugger";
  }

  @Override
  public void initComponent() {
    super.init();
    myJavaBreakpointsProvider.init();
    new TransformatorBuilderImpl().init();
    new ValueUtilImpl().init();
    new MirrorUtilImpl().init();
  }

  @Override
  public void disposeComponent() {
    MirrorUtil.getInstance().dispose();
    TransformatorBuilder.getInstance().dispose();
    ValueUtil.getInstance().dispose();
    myJavaBreakpointsProvider.dispose();
    super.dispose();
  }
}
