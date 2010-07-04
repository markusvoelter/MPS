package jetbrains.mps.baseLanguage.collections.plugin;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.java.programState.proxies.ValueWrapperFactory;

public class CustomViewersDescriptor extends jetbrains.mps.debug.runtime.java.programState.proxies.CustomViewersDescriptor {
  public CustomViewersDescriptor() {
    {
      ValueWrapperFactory factory = new ListViewer_Factory();
      myValueWrapperFactories.add(factory);
    }
    {
      ValueWrapperFactory factory = new MapViewer_Factory();
      myValueWrapperFactories.add(factory);
    }
    {
      ValueWrapperFactory factory = new MapEntryViewer_Factory();
      myValueWrapperFactories.add(factory);
    }
    {
      ValueWrapperFactory factory = new SequentialListViewer_Factory();
      myValueWrapperFactories.add(factory);
    }
    {
      ValueWrapperFactory factory = new SetViewer_Factory();
      myValueWrapperFactories.add(factory);
    }
  }
}
