package jetbrains.mps.make.sandbox.sample;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.resources.IPropertiesPersistence;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.resources.IPropertiesAccessor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IConfig;
import jetbrains.mps.make.script.IConfigMonitor;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;

public class GenerateSpecial_Facet extends IFacet.Stub {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("GenerateSpecial");

  public GenerateSpecial_Facet() {
    ListSequence.fromList(targets).addElement(new GenerateSpecial_Facet.Target_GenerateSpecialTarget());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return null;
  }

  public Iterable<IFacet.Name> extended() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate")});
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public IPropertiesPersistence propertiesPersistence() {
    return new GenerateSpecial_Facet.TargetProperties();
  }

  public static class Target_GenerateSpecialTarget implements ITarget {
    private static Class<? extends IResource>[] EXPECTED_INPUT = (Class<? extends IResource>[]) new Class[]{};
    private static Class<? extends IResource>[] EXPECTED_OUTPUT = (Class<? extends IResource>[]) new Class[]{};

    private ITarget.Name name = new ITarget.Name("GenerateSpecial.GenerateSpecialTarget");

    public Target_GenerateSpecialTarget() {
    }

    public IJob createJob() {
      return new IJob.Stub() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IPropertiesAccessor pa, final IParametersPool pool) {
          Iterable<IResource> _output_i03q2a_a0a = null;
          switch (0) {
            case 0:
              pa.properties().parameters(Target_GenerateSpecialTarget.this.getName(), GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class).foo("asdasdsd");
              pa.properties().parameters(Target_GenerateSpecialTarget.this.getName(), GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class).FooFoo();
              return new IResult.SUCCESS(_output_i03q2a_a0a);
            default:
              return new IResult.SUCCESS(_output_i03q2a_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return new IConfig.Stub() {
        @Override
        public boolean configure(final IConfigMonitor cmonitor, final IPropertiesAccessor pa, final IParametersPool pool) {
          switch (0) {
            case 0:
              switch (cmonitor.<what_Option>relayQuery(new DOH_Query())) {
                case ABORT_i03q2a_a0a0a:
                  pa.properties().parameters(Target_GenerateSpecialTarget.this.getName(), GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class).baz(false);
                  break;
                case IGNORE_i03q2a_c0a0a:
                  pa.properties().parameters(Target_GenerateSpecialTarget.this.getName(), GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class).baz(false);
                  break;
                case RETRY_i03q2a_b0a0a:
                  pa.properties().parameters(Target_GenerateSpecialTarget.this.getName(), GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class).baz(true);
                  break;
                default:
              }
            default:
              return true;
          }
        }
      };
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return null;
    }

    public Iterable<ITarget.Name> notBefore() {
      return null;
    }

    public Iterable<ITarget.Name> before() {
      return null;
    }

    public ITarget.Name getName() {
      return name;
    }

    public boolean requiresInput() {
      return true;
    }

    public boolean producesOutput() {
      return true;
    }

    public Iterable<Class<? extends IResource>> expectedInput() {
      return Sequence.fromArray(EXPECTED_INPUT);
    }

    public Iterable<Class<? extends IResource>> expectedOutput() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return cls.cast(new Variables());
    }

    public <T> T createParameters(Class<T> cls, T copyFrom) {
      T t = createParameters(cls);
      if (t != null) {
        ((Tuples._6) t).assign((Tuples._6) copyFrom);
      }
      return t;
    }

    public static class Variables extends MultiTuple._6<String, Integer, Boolean, String, Integer, Boolean> {
      public Variables() {
        super();
      }

      public Variables(String foo, Integer bar, Boolean baz, String FooFoo, Integer BarBar, Boolean BazBaz) {
        super(foo, bar, baz, FooFoo, BarBar, BazBaz);
      }

      public String foo(String value) {
        return super._0(value);
      }

      public Integer bar(Integer value) {
        return super._1(value);
      }

      public Boolean baz(Boolean value) {
        return super._2(value);
      }

      public String FooFoo(String value) {
        return super._3(value);
      }

      public Integer BarBar(Integer value) {
        return super._4(value);
      }

      public Boolean BazBaz(Boolean value) {
        return super._5(value);
      }

      public String foo() {
        return super._0();
      }

      public Integer bar() {
        return super._1();
      }

      public Boolean baz() {
        return super._2();
      }

      public String FooFoo() {
        return super._3();
      }

      public Integer BarBar() {
        return super._4();
      }

      public Boolean BazBaz() {
        return super._5();
      }

      @SuppressWarnings(value = "unchecked")
      public GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables assignFrom(Tuples._6<String, Integer, Boolean, String, Integer, Boolean> from) {
        return (GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables) super.assign(from);
      }
    }
  }

  public static class TargetProperties implements IPropertiesPersistence {
    public TargetProperties() {
    }

    public void storeValues(Map<String, String> store, IParametersPool properties) {
      {
        ITarget.Name name = new ITarget.Name("GenerateSpecial.GenerateSpecialTarget");
        if (properties.hasProperties(name)) {
          GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables props = properties.parameters(name, GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class);
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.foo", String.valueOf(props.foo()));
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.bar", String.valueOf((int) props.bar()));
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.baz", String.valueOf((boolean) props.baz()));
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.FooFoo", String.valueOf(props.FooFoo()));
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.BarBar", String.valueOf(props.BarBar()));
          MapSequence.fromMap(store).put("GenerateSpecial.GenerateSpecialTarget.BazBaz", String.valueOf(props.BazBaz()));
        }
      }
    }

    public void loadValues(Map<String, String> store, IParametersPool properties) {
      try {
        {
          ITarget.Name name = new ITarget.Name("GenerateSpecial.GenerateSpecialTarget");
          if (MapSequence.fromMap(store).containsKey("GenerateSpecial.GenerateSpecialTarget.GenerateSpecialTarget")) {
            GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables props = properties.parameters(name, GenerateSpecial_Facet.Target_GenerateSpecialTarget.Variables.class);
            String key = "GenerateSpecial.GenerateSpecialTarget.GenerateSpecialTarget";
            props.foo(String.valueOf(MapSequence.fromMap(store).get(key)));
            props.bar(Integer.valueOf(MapSequence.fromMap(store).get(key)));
            props.baz(Boolean.valueOf(MapSequence.fromMap(store).get(key)));
            props.FooFoo(String.valueOf(MapSequence.fromMap(store).get(key)));
            props.BarBar(Integer.valueOf(MapSequence.fromMap(store).get(key)));
            props.BazBaz(Boolean.valueOf(MapSequence.fromMap(store).get(key)));
          }
        }
      } catch (RuntimeException re) {
      }
    }
  }
}
