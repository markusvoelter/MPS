package jetbrains.mps.build.ant.util;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import javax.swing.SwingUtilities;

public class ThreadUtils {
  private static final Logger LOG = Logger.getLogger(ThreadUtils.class);

  public ThreadUtils() {
  }

  public static boolean runInUIThreadAndWait(Runnable r) {
    if (SwingUtilities.isEventDispatchThread()) {
      try {
        r.run();
      } catch (Exception e) {
        LOG.error(e);
        return false;
      }
    } else {
      try {
        SwingUtilities.invokeAndWait(r);
      } catch (Exception e) {
        LOG.error(e);
        return false;
      }
    }
    return true;
  }

  public static void runInUIThreadNoWait(Runnable r) {
    if (SwingUtilities.isEventDispatchThread()) {
      r.run();
    } else {
      try {
        SwingUtilities.invokeLater(r);
      } catch (Exception e) {
        LOG.error(e);
      }
    }
  }

  /**
   * * use ModelAccess.instance().isInEDT()
   * * @return
   */
  @Deprecated
  public static boolean isEventDispatchThread() {
    return SwingUtilities.isEventDispatchThread();
  }

  public static void assertEDT() {
    if (!(ThreadUtils.isEventDispatchThread())) {
      LOG.error(new IllegalStateException("must be called from EDT"));
    }
  }
}
