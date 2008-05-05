package jetbrains.mps.ide.command;

import jetbrains.mps.logging.Logger;

import javax.swing.SwingUtilities;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class EDTLightweighCommandExecutor extends Thread {
  private static final long MAX_TIME = 100;

  private static final Logger LOG = Logger.getLogger(EDTLightweighCommandExecutor.class); 

  private final Object myLock = new Object();
  private Queue<Runnable> myToExecute = new LinkedList<Runnable>();

  public EDTLightweighCommandExecutor() {
    setDaemon(true);
    start();
  }

  public void run() {
    try {
      while (true) {
        Thread.sleep(100);
        process();
      }
    } catch (Exception e) {
      LOG.error(e);                
    }
  }

  public void invokeInEDT(Runnable r) {
    synchronized (myLock) {
      myToExecute.add(r);
    }
  }

  private Runnable getToExecute() {
    synchronized (myLock) {
      if (myToExecute.isEmpty()) return null;
      return myToExecute.remove();
    }
  }

  private void process() {
    synchronized (myLock) {
      if (myToExecute.isEmpty()) {
        return;
      }      
    }

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        CommandProcessor.instance().tryToExecuteLightweightCommand(new Runnable() {
          public void run() {
            long start = System.currentTimeMillis();
            while (true) {
              if (System.currentTimeMillis() - start > MAX_TIME) break;
              Runnable command = getToExecute();
              if (command == null) break;
              command.run();
            }
          }
        });
      }
    });
  }  
}
