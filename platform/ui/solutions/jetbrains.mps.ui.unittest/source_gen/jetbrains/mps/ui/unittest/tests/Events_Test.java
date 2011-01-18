package jetbrains.mps.ui.unittest.tests;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ui.unittest.mockup.MockWidget;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.ui.unittest.mockup.MockEventHandler;
import jetbrains.mps.ui.unittest.mockup.MockEvent;
import junit.framework.Assert;

public class Events_Test extends UITestBase_Test {
  public void test_simpleEventHandling() throws Exception {
    final Wrappers._T<String> volatileValue = new Wrappers._T<String>("notset");
    MockWidget mw = new _FunctionTypes._return_P0_E0<MockWidget>() {
      public MockWidget invoke() {
        final MockWidget widget_m32u4c_a0a0a0a1a0a = new MockWidget();
        widget_m32u4c_a0a0a0a1a0a.setProp("id", "1234");
        widget_m32u4c_a0a0a0a1a0a.addEventHandler("foo", new MockEventHandler() {
          public void handle(MockWidget wdg, MockEvent event) {
            _FunctionTypes._void_P1_E0<? super MockEvent> h = new _FunctionTypes._void_P1_E0<<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.UndefinedType'!>>() {
              public void invoke(<!TextGen not found for 'jetbrains.mps.baseLanguage.structure.UndefinedType'!> event) {
                volatileValue.value = event.getProp("bar");
              }
            };
            h.invoke(event);
          }
        });
        return widget_m32u4c_a0a0a0a1a0a;
      }
    }.invoke();
    MockEvent evt = new MockEvent();
    evt.setProp("bar", "SET");
    Assert.assertEquals("notset", volatileValue.value);
    this.triggerEvent(mw, "foo", evt);
    Assert.assertEquals("SET", volatileValue.value);
  }
}
