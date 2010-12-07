package jetbrains.mps.make.generator;

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
import jetbrains.mps.make.script.IConfigMonitor;

public class TextGen_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("TextGen");

  public TextGen_Facet() {
    ListSequence.fromList(targets).addElement(new TextGen_Facet.Target_21gswx_a());
  }

  public Iterable<ITarget> targets() {
    return targets;
  }

  public Iterable<IFacet.Name> optional() {
    return null;
  }

  public Iterable<IFacet.Name> required() {
    return Sequence.fromArray(new IFacet.Name[]{new IFacet.Name("Maker")});
  }

  public Iterable<IFacet.Name> extended() {
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_21gswx_a implements ITarget {
    private ITarget.Name name = new ITarget.Name("ConditionallyGenerate");

    public Target_21gswx_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(final Iterable<IResource> input, final IJobMonitor monitor, final IParametersPool pool) {
          Iterable<IResource> _output_21gswx_a0a = null;
          switch (0) {
            case 0:
            default:
              return new IResult.SUCCESS(_output_21gswx_a0a);
          }
        }
      };
    }

    public IConfig createConfig() {
      return new IConfig() {
        public boolean configure(final IConfigMonitor cmonitor, final IParametersPool pool) {
          switch (0) {
            case 0:
              switch (cmonitor.<Bar_Option>relayQuery(new Askfoo_Query())) {
                case GOAHEAD_21gswx_a0a0a:
                  return true;
                case NOWAY_21gswx_b0a0a:
                  return false;
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
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("Make")});
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
