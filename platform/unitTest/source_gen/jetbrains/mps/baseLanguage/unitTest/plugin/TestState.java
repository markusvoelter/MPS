package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import javax.swing.Icon;

public enum TestState {
  IN_PROGRESS("testInProgress1.png"),
  IGNORED("testIgnored.png"),
  FAILED("testFailed.png"),
  ERROR("testError.png"),
  PASSED("testPassed.png"),
  PAUSED("testPaused.png"),
  TERMINATED("testTerminated.png");

  private Icon icon;

  TestState(String iconName) {
  }

  public Icon getIcon() {
    return this.icon;
  }

}
