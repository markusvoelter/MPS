package jetbrains.mps.debug.api;

/*Generated by MPS */


public interface SessionChangeListener {
  public void stateChanged(AbstractDebugSession session);
  public void paused(AbstractDebugSession session);
  public void resumed(AbstractDebugSession session);
  public void muted(AbstractDebugSession session);
}
