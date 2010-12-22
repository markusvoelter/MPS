package jetbrains.mps.make.unittest;

/*Generated by MPS */

import org.junit.runner.RunWith;
import org.jmock.integration.junit4.JMock;
import org.junit.Test;
import jetbrains.mps.internal.make.runtime.script.LoggingProgressStrategy;
import org.jmock.Expectations;
import jetbrains.mps.make.script.IProgress;

@RunWith(JMock.class)
public class LogReporting_Test extends MockTestCase {
  @Test
  public void test_basic() throws Exception {
    final LoggingProgressStrategy.Log logger = context.mock(LoggingProgressStrategy.Log.class);
    context.checking(new Expectations() {
      {
        oneOf(logger).info(with(equal("\u221e/Top -- started")));
        oneOf(logger).info(with(equal("\u221e -- done 1%")));
        oneOf(logger).info(with(equal("\u221e/Top -- done 30%")));
        oneOf(logger).info(with(equal("\u221e/Top/Mid -- started")));
        oneOf(logger).info(with(equal("\u221e -- done 1%")));
        oneOf(logger).info(with(equal("\u221e/Top -- done 40%")));
        oneOf(logger).info(with(equal("\u221e/Top/Mid -- done 20%")));
        oneOf(logger).info(with(equal("\u221e/Top/Mid -- finished")));
        oneOf(logger).info(with(equal("\u221e/Top/Bot -- started")));
        oneOf(logger).info(with(equal("\u221e -- done 1%")));
        oneOf(logger).info(with(equal("\u221e/Top -- done 90%")));
        oneOf(logger).info(with(equal("\u221e/Top/Bot -- done 50%")));
        oneOf(logger).info(with(equal("\u221e -- done 1%")));
        oneOf(logger).info(with(equal("\u221e/Top -- done 100%")));
        oneOf(logger).info(with(equal("\u221e/Top/Bot -- done 100%")));
        oneOf(logger).info(with(equal("\u221e/Top -- finished")));
      }
    });
    LoggingProgressStrategy strat = new LoggingProgressStrategy(logger);
    IProgress pro = strat.currentProgress();
    pro.beginWork("Top", 10, 1000);
    pro.doneWork("Top", 3);
    pro.beginWork("Mid", 10, 5);
    pro.doneWork("Mid", 2);
    pro.finishWork("Mid");
    pro.beginWork("Bot", 10, 10);
    pro.doneWork("Bot", 5);
    pro.doneWork("Bot", 5);
    pro.finishWork("Top");
  }
}
