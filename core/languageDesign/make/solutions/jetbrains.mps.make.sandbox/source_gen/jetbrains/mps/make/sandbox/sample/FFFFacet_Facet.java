package jetbrains.mps.make.sandbox.sample;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IJobMonitor;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IConfig;

public class FFFFacet_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("FFFFacet");

  public FFFFacet_Facet() {
    ListSequence.fromList(targets).addElement(new FFFFacet_Facet.Target_chixuw_a());
    ListSequence.fromList(targets).addElement(new FFFFacet_Facet.Target_chixuw_b());
    ListSequence.fromList(targets).addElement(new FFFFacet_Facet.Target_chixuw_c());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("GenerateSpecial")});
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate")});
  }

  public Iterable<IFacet.Name> extended() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Generate")});
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_chixuw_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("QQQ");

    public Target_chixuw_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_chixuw_a0a = null;
          switch (0) {
            case 0:
              pool.parameters(new ITarget.Name("GenerateSpecialTarget"), GenerateSpecial_Facet.Target_i03q2a_a.Variables.class).bar(42);
              _output_chixuw_a0a = Sequence.fromIterable(_output_chixuw_a0a).concat(Sequence.fromIterable(Sequence.<IResource>singleton(null)));
              return new IResult.SUCCESS(_output_chixuw_a0a);
            default:
              return new IResult.SUCCESS(_output_chixuw_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
    }

    public Iterable<ITarget.Name> notAfter() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("GenerateSpecialTarget")});
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

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_chixuw_b implements ITarget {
    private ITarget.Name name = new ITarget.Name("qweqwe");

    public Target_chixuw_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_chixuw_a0b = null;
          switch (0) {
            case 0:

              monitor.currentProgress().beginWork("ASDF", 10, monitor.currentProgress().workLeft());
              monitor.currentProgress().advanceWork("ASDF", 10);
              monitor.currentProgress().finishWork("ASDF");

            default:
              return new IResult.SUCCESS(_output_chixuw_a0b);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
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

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }

  public static class Target_chixuw_c implements ITarget {
    private ITarget.Name name = new ITarget.Name("Nanana");

    public Target_chixuw_c() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_chixuw_a0c = null;
          switch (0) {
            case 0:
            default:
              return new IResult.SUCCESS(_output_chixuw_a0c);
          }
        }
      };
    }

    public IConfig createConfig() {
      return null;
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

    public Class<? extends IResource> expectedResources() {
      return null;
    }

    public <T> T createParameters(Class<T> cls) {
      return null;
    }
  }
}
