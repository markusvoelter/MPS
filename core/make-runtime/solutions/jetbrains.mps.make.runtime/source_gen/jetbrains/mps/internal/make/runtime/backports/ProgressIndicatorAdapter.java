package jetbrains.mps.internal.make.runtime.backports;

/*Generated by MPS */

import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProcessCanceledException;
import com.intellij.openapi.application.ModalityState;

public class ProgressIndicatorAdapter implements ProgressIndicator {
  private ProgressIndicator ind;

  public ProgressIndicatorAdapter(ProgressIndicator ind) {
    this.ind = ind;
  }

  public void checkCanceled() throws ProcessCanceledException {
  }

  public void setIndeterminate(boolean b) {
  }

  public boolean isIndeterminate() {
    return false;
  }

  public void setModalityProgress(ProgressIndicator indicator) {
  }

  public ModalityState getModalityState() {
    return null;
  }

  public boolean isModal() {
    return false;
  }

  public void finishNonCancelableSection() {
  }

  public void startNonCancelableSection() {
  }

  public void popState() {
  }

  public void pushState() {
  }

  public void setFraction(double d) {
  }

  public double getFraction() {
    return 0.;
  }

  public String getText2() {
    return null;
  }

  public void setText2(String string) {
  }

  public String getText() {
    return null;
  }

  public void setText(String string) {
  }

  public boolean isCanceled() {
    return false;
  }

  public void cancel() {
  }

  public boolean isRunning() {
    return false;
  }

  public void stop() {
  }

  public void start() {
  }
}
