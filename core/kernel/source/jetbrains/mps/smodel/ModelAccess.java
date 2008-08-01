package jetbrains.mps.smodel;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.command.CommandProcessor;
import com.intellij.openapi.command.UndoConfirmationPolicy;
import com.intellij.openapi.util.Computable;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorWithContinuation;
import jetbrains.mps.ide.ThreadUtils;

import javax.swing.SwingUtilities;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// We access IDEA locking mechanism here in order to prevent different way of acquiring locks

// We always first acquire IDEA's lock and only then acquire MPS's lock
public class ModelAccess {
  private static final ModelAccess ourInstance = new ModelAccess();

  private ReentrantReadWriteLock myReadWriteLock = new ReentrantReadWriteLock();
  private EDTReadExecutor myEDTExecutor = new EDTReadExecutor();

  public static ModelAccess instance() {
    return ourInstance;
  }

  private ModelAccess() {
  }

  private boolean allowSharedRead() {
    return false;
  }

  private Lock getReadLock() {
    if (allowSharedRead()) {
      return myReadWriteLock.readLock();
    } else {
      return myReadWriteLock.writeLock();
    }
  }

  private Lock getWriteLock() {
    return myReadWriteLock.writeLock();
  }

  public void runReadAction(final Runnable r) {
    runReadAction(new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    });
  }

  public void runWriteAction(final Runnable r) {
    runWriteAction(new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    });
  }

  public <T> T runReadAction(final Computable<T> c) {
    return ApplicationManager.getApplication().runReadAction(new Computable<T>() {
      public T compute() {
        getReadLock().lock();
        try {
          return c.compute();
        } finally {
          getReadLock().unlock();
        }
      }
    });
  }

  public <T> T runWriteAction(final Computable<T> c) {
    Computable<T> computable = new Computable<T>() {
      public T compute() {
        getWriteLock().lock();
        try {
          return c.compute();
        } finally {
          getWriteLock().unlock();
        }
      }
    };
    if (ThreadUtils.isEventDispatchThread()) {
      return ApplicationManager.getApplication().runWriteAction(computable);
    } else {
      return ApplicationManager.getApplication().runReadAction(computable);
    }
  }

  public void runReadInEDT(Runnable r) {
    myEDTExecutor.invokeReadInEDT(r);
  }

  public void runCommandInEDT(Runnable r) {
    myEDTExecutor.invokeCommandInEDT(r);
  }

  public boolean tryRead(final Runnable r) {
    return ApplicationManager.getApplication().runReadAction(new Computable<Boolean>() {
      public Boolean compute() {
        if (getReadLock().tryLock()) {
          try {
            r.run();
          } finally {
            getReadLock().unlock();
          }
          return true;
        } else {
          return false;
        }
      }
    });
  }

  public boolean tryWrite(final Runnable r) {
    return ApplicationManager.getApplication().runWriteAction(new Computable<Boolean>() {
      public Boolean compute() {
        if (getWriteLock().tryLock()) {
          try {
            r.run();
          } finally {
            getWriteLock().unlock();
          }
          return true;
        } else {
          return false;
        }
      }
    });
  }

  public boolean tryCommand(final Runnable r) {
    final boolean[] res = new boolean[]{false};
    ApplicationManager.getApplication().runWriteAction(new Runnable() {
      public void run() {
        executeCommand(new Runnable() {
          public void run() {
            if (getWriteLock().tryLock()) {
              try {
                r.run();
              } finally {
                getWriteLock().unlock();
              }
              res[0] = true;
            }
          }
        });
      }
    });
    return res[0];
  }

  public <T> T tryRead(Computable<T> c) {
    if (getReadLock().tryLock()) {
      try {
        return c.compute();
      } finally {
        getReadLock().unlock();
      }
    } else {
      return null;
    }
  }

  public <T> T tryWrite(Computable<T> c) {
    if (getWriteLock().tryLock()) {
      try {
        return c.compute();
      } finally {
        getWriteLock().unlock();
      }
    } else {
      return null;
    }
  }

  public boolean canRead() {
    if (allowSharedRead()) {
      return true; //todo find a way to check read access
    } else {
      return canWrite();
    }
  }

  public boolean canWrite() {
    return myReadWriteLock.isWriteLockedByCurrentThread();
  }

  public void checkReadAccess() {
    if (!canRead()) {
      throw new IllegalStateException();
    }
  }

  public void checkWriteAccess() {
    if (!canWrite()) {
      throw new IllegalStateException();
    }
  }

  public void executeCommand(Runnable r) {
    CommandProcessor.getInstance().executeCommand(null, r, "name", null, UndoConfirmationPolicy.DO_NOT_REQUEST_CONFIRMATION);
  }

  public <T> T runWriteActionInCommand(final Computable<T> c) {
    return runWriteActionInCommand(c, null, UndoConfirmationPolicy.DO_NOT_REQUEST_CONFIRMATION);
  }

  public <T> T runWriteActionInCommand(final Computable<T> c, final String name, final UndoConfirmationPolicy policy) {
    return runWriteAction(new Computable<T>() {
      public T compute() {
        final Object[] result = new Object[1];
        CommandProcessor.getInstance().executeCommand(null, new Runnable() {
          public void run() {
            result[0] = c.compute();
          }
        }, name, null, policy);
        return (T) result[0];
      }
    });
  }

  public void runWriteActionInCommand(final Runnable r) {
    runWriteActionInCommand(r, null, UndoConfirmationPolicy.DO_NOT_REQUEST_CONFIRMATION);
  }

  public void runWriteActionInCommand(final Runnable r, String name, UndoConfirmationPolicy policy) {
    runWriteActionInCommand(new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    }, name, policy);
  }

  public void runWriteActionInCommandAsync(final Runnable r) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        runWriteActionInCommand(r);
      }
    });
  }

  static void assertLegalRead(SNode node) {
    if (!ModelAccess.instance().canRead()) {
      if (Thread.currentThread() instanceof CursorWithContinuation) {
        return;
      }

      throw new IllegalModelAccessError("You can read model only inside read actions.l");
    }
  }
}
