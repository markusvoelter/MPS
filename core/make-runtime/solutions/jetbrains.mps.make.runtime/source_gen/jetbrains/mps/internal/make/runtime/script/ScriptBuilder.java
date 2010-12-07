package jetbrains.mps.internal.make.runtime.script;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import java.util.Map;
import jetbrains.mps.make.facet.IFacet;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import java.util.Set;
import jetbrains.mps.make.facet.ITarget;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.make.resources.ResourcePool;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.make.script.IParametersPool;
import jetbrains.mps.make.script.IMonitors;
import jetbrains.mps.make.facet.FacetRegistry;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.make.script.IScript;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.internal.collections.runtime.IMapping;
import jetbrains.mps.internal.make.runtime.util.GraphAnalyzer;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class ScriptBuilder {
  private static Logger LOG = Logger.getLogger(ScriptBuilder.class);

  private Map<IFacet.Name, IFacet> facetsView = MapSequence.fromMap(new HashMap<IFacet.Name, IFacet>());
  private Set<ITarget.Name> requestedTargets = SetSequence.fromSet(new HashSet<ITarget.Name>());
  private ITarget.Name defaultTarget;
  private ResourcePool pool;
  private List<ValidationError> errors = ListSequence.fromList(new ArrayList<ValidationError>());
  private _FunctionTypes._void_P1_E0<? super IParametersPool> init;
  private IMonitors mons;

  public ScriptBuilder() {
  }

  public ScriptBuilder withFacet(IFacet.Name facetName) {
    IFacet fct = FacetRegistry.getInstance().lookup(facetName);
    if (fct != null) {
      MapSequence.fromMap(facetsView).put(facetName, fct);
    } else {
      String msg = "facet not found: " + facetName;
      LOG.error(msg);
      error(facetName, msg);
    }
    return this;
  }

  public ScriptBuilder withFacets(IFacet.Name... facetNames) {
    return withFacets(Sequence.fromArray(facetNames));
  }

  public ScriptBuilder withFacets(Iterable<IFacet.Name> facetNames) {
    for (IFacet.Name fn : Sequence.fromIterable(facetNames)) {
      IFacet fct = FacetRegistry.getInstance().lookup(fn);
      if (fct != null) {
        MapSequence.fromMap(facetsView).put(fn, fct);
      } else {
        String msg = "facet not found: " + fn;
        LOG.error(msg);
        error(fn, msg);
      }
    }
    return this;
  }

  public ScriptBuilder withAuxTarget(ITarget.Name targetName) {
    SetSequence.fromSet(requestedTargets).addElement(targetName);
    return this;
  }

  public ScriptBuilder withTarget(ITarget.Name targetName) {
    SetSequence.fromSet(requestedTargets).addElement(targetName);
    this.defaultTarget = targetName;
    return this;
  }

  public ScriptBuilder withResources(ResourcePool pool) {
    this.pool = pool;
    return this;
  }

  public ScriptBuilder withInit(_FunctionTypes._void_P1_E0<? super IParametersPool> init) {
    this.init = init;
    return this;
  }

  public ScriptBuilder withMonitors(IMonitors mons) {
    this.mons = mons;
    return this;
  }

  public IScript toScript() {
    if (ListSequence.fromList(errors).isNotEmpty()) {
      return new InvalidScript(errors);
    }
    final Map<IFacet.Name, ScriptBuilder.FacetRefs> refs = MapSequence.fromMap(new HashMap<IFacet.Name, ScriptBuilder.FacetRefs>());
    this.collectRefs(refs);
    if (ListSequence.fromList(errors).isNotEmpty()) {
      return new InvalidScript(errors);
    }
    Iterable<IFacet.Name> sortedFacets = this.toposortByExtended(refs);
    if (ListSequence.fromList(errors).isNotEmpty()) {
      return new InvalidScript(errors);
    }
    TargetRange tr = new TargetRange();
    this.collectTargets(sortedFacets, tr);
    if (ListSequence.fromList(errors).isNotEmpty()) {
      return new InvalidScript(errors);
    }
    Script sc = new Script(tr, defaultTarget, init, mons);
    sc.validate();
    return sc;
  }

  private void collectTargets(Iterable<IFacet.Name> sortedFacets, TargetRange tr) {
    List<ITarget> allTargets = ListSequence.fromList(Sequence.fromIterable(sortedFacets).<ITarget>translate(new ITranslator2<IFacet.Name, ITarget>() {
      public Iterable<ITarget> translate(IFacet.Name fname) {
        return MapSequence.fromMap(facetsView).get(fname).targets();
      }
    }).toListSequence()).reversedList();
    for (ITarget trg : ListSequence.fromList(allTargets)) {
      if (SetSequence.fromSet(requestedTargets).contains(trg.getName()) || trg.getName().equals(defaultTarget)) {
        tr.addTarget(trg);
      }
    }
    if (defaultTarget != null && !(tr.hasTarget(defaultTarget))) {
      LOG.error("target not found: " + defaultTarget);
      error(defaultTarget, "target not found: " + defaultTarget);
    }
    for (ITarget.Name tn : SetSequence.fromSet(requestedTargets)) {
      if (!(tr.hasTarget(tn))) {
        LOG.error("target not found: " + tn);
        error(defaultTarget, "target not found: " + tn);
      }
    }
    if (ListSequence.fromList(errors).isNotEmpty()) {
      return;
    }
    tr.addRelated(Sequence.fromIterable(MapSequence.fromMap(facetsView).values()).<ITarget>translate(new ITranslator2<IFacet, ITarget>() {
      public Iterable<ITarget> translate(IFacet fct) {
        return fct.targets();
      }
    }));
  }

  private void collectRefs(final Map<IFacet.Name, ScriptBuilder.FacetRefs> refs) {
    for (IFacet fct : Sequence.fromIterable(MapSequence.fromMap(facetsView).values())) {
      ScriptBuilder.FacetRefs facetRefs = new ScriptBuilder.FacetRefs();
      this.collectRequired(fct, fct.extended(), facetRefs.extended);
      this.collectRequired(fct, fct.required(), facetRefs.required);
      this.collectOptional(fct, fct.optional(), facetRefs.optional);
      MapSequence.fromMap(refs).put(fct.getName(), facetRefs);
    }
  }

  private Iterable<IFacet.Name> toposortByExtended(final Map<IFacet.Name, ScriptBuilder.FacetRefs> refs) {
    for (IMapping<IFacet.Name, ScriptBuilder.FacetRefs> m : SetSequence.fromSet(MapSequence.fromMap(refs).mappingsSet())) {
      IFacet fct = MapSequence.fromMap(facetsView).get(m.key());
      for (IFacet ex : ListSequence.fromList(m.value().extended)) {
        ListSequence.fromList(MapSequence.fromMap(refs).get(ex.getName()).extendedBy).addElement(fct);
      }
    }
    GraphAnalyzer<IFacet.Name> ga = new GraphAnalyzer<IFacet.Name>() {
      @Override
      public Iterable<IFacet.Name> forwardEdges(IFacet.Name v) {
        return ListSequence.fromList(MapSequence.fromMap(refs).get(v).extendedBy).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
          public IFacet.Name select(IFacet f) {
            return f.getName();
          }
        });
      }

      @Override
      public Iterable<IFacet.Name> backwardEdges(IFacet.Name v) {
        return ListSequence.fromList(MapSequence.fromMap(refs).get(v).extended).<IFacet.Name>select(new ISelector<IFacet, IFacet.Name>() {
          public IFacet.Name select(IFacet f) {
            return f.getName();
          }
        });
      }

      @Override
      public Iterable<IFacet.Name> vertices() {
        return MapSequence.fromMap(refs).keySet();
      }
    };
    for (List<IFacet.Name> cyc : ListSequence.fromList(ga.findCycles())) {
      LOG.error("found cycle: " + cyc);
      error(null, "found cycle: " + cyc);
    }
    return ga.topologicalSort();
  }

  private void collectRequired(IFacet fct, Iterable<IFacet.Name> facets, List<IFacet> required) {
    for (IFacet.Name req : Sequence.fromIterable(facets)) {
      IFacet f = MapSequence.fromMap(facetsView).get(req);
      if (f == null) {
        String msg = "not found required facet: " + req;
        LOG.error(msg);
        error(fct.getName(), msg);
      } else {
        ListSequence.fromList(required).addElement(f);
      }
    }
  }

  private void collectOptional(IFacet fct, Iterable<IFacet.Name> facets, List<IFacet> optional) {
    for (IFacet.Name opt : Sequence.fromIterable(facets)) {
      IFacet f = MapSequence.fromMap(facetsView).get(opt);
      if (f == null) {
        String msg = "not found optional facet: " + opt;
        LOG.debug(msg);
      } else {
        ListSequence.fromList(optional).addElement(f);
      }
    }
  }

  private void error(Object o, String message) {
    ListSequence.fromList(this.errors).addElement(new ValidationError(o, message));
  }

  private void clearErrors() {
    ListSequence.fromList(this.errors).clear();
  }

  private static class FacetRefs {
    private List<IFacet> extended = ListSequence.fromList(new ArrayList<IFacet>());
    private List<IFacet> extendedBy = ListSequence.fromList(new ArrayList<IFacet>());
    private List<IFacet> required = ListSequence.fromList(new ArrayList<IFacet>());
    private List<IFacet> optional = ListSequence.fromList(new ArrayList<IFacet>());

    public FacetRefs() {
    }
  }
}
