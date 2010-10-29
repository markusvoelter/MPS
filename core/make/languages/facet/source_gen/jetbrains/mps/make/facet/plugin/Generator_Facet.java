package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.facet.IFacet;
import java.util.List;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.make.script.IJob;
import jetbrains.mps.make.script.IResult;
import jetbrains.mps.make.resources.IResource;
import jetbrains.mps.make.script.IMonitor;
import jetbrains.mps.ide.generator.GenerationSettings;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class Generator_Facet implements IFacet {
  private List<ITarget> targets = ListSequence.fromList(new ArrayList<ITarget>());
  private IFacet.Name name = new IFacet.Name("Generator");

  public Generator_Facet() {
    ListSequence.fromList(targets).addElement(new Generator_Facet.Target_ixz87t_a());
    ListSequence.fromList(targets).addElement(new Generator_Facet.Target_ixz87t_b());
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
    return null;
  }

  public IFacet.Name getName() {
    return this.name;
  }

  public static class Target_ixz87t_a implements ITarget<Object> {
    private ITarget.Name name = new ITarget.Name("ConfigureGenerator");

    public Target_ixz87t_a() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(Iterable<IResource> input, IMonitor monitor) {
          Iterable<IResource> _output_ixz87t_a0a = null;
          switch (0) {
            case 0:
              GenerationSettings settings = GenerationSettings.getInstance();
              if (settings.isSaveTransientModels()) {
                System.out.println("Configuring...");
                switch (monitor.<SaveTransient_Option>relayQuery(new SaveTransientModels_Query())) {
                  case SAVE_ixz87t_a0a0a:
                    System.out.println("Yes");
                    break;
                  case DONT_SAVE_ixz87t_b0a0a:
                    System.out.println("No");
                    break;
                  case BUGGER_OFF_ixz87t_c0a0a:
                    System.out.println("Piss off");
                    break;
                  default:
                    return new IResult.FAILURE(_output_ixz87t_a0a);
                }
                return new IResult.SUCCESS(_output_ixz87t_a0a);
              }
            default:
              return new IResult.SUCCESS(_output_ixz87t_a0a);
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

    public Object createVariables() {
      return null;
    }
  }

  public static class Target_ixz87t_b implements ITarget<Object> {
    private ITarget.Name name = new ITarget.Name("GenerateFiles");

    public Target_ixz87t_b() {
    }

    public IJob createJob() {
      return new IJob() {
        public IResult execute(Iterable<IResource> input, IMonitor monitor) {
          Iterable<IResource> _output_ixz87t_a0b = null;
          switch (0) {
            case 0:
              System.out.println("Generating....");
            default:
              return new IResult.SUCCESS(_output_ixz87t_a0b);
          }
        }
      };
    }

    public Iterable<ITarget.Name> notAfter() {
      return null;
    }

    public Iterable<ITarget.Name> after() {
      return Sequence.fromArray(new ITarget.Name[]{new ITarget.Name("ConfigureGenerator")});
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

    public Object createVariables() {
      return null;
    }
  }
}
