package jetbrains.mps.smodel;

import jetbrains.mps.projectLanguage.structure.Model;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.ide.BootstrapLanguagesManager;
import jetbrains.mps.ide.BootstrapModule;

import java.util.List;
import java.util.ArrayList;

public enum LanguageAspect {
  STRUCTURE("structure") {
    protected List<String> getModelsToImport(Language l) {
      return CollectionUtil.asList();
    }

    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.STRUCTURE.getUID());
    }
  },

  EDITOR("editor") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.EDITOR.getUID());
    }
  },

  ACTIONS("actions") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.ACTIONS.getUID());
    }
  },

  CONSTRAINTS("constraints") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.CONSTRAINTS.getUID());
    }
  },

  HELGINS_TYPESYSTEM("helgins") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.HELGINS.getUID());
    }
  },

  SCRIPTS("scripts") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.IDESCRIPT.getUID());
    }
  },

  DOCUMENTATION("documentation") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList("jetbrains.mps.booksLanguage");
    }
  },

  INTENTIONS("intentions") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.INTENTION.getUID());
    }
  },

  FIND_USAGES("findUsages") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.FIND_USAGES.getUID());
    }
  },

  PLUGIN("plugin") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.PLUGIN.getUID());
    }
  },

  CFA("cfa") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.CFA.getUID());
    }
  },

  DATA_FLOW("Data Flow") {
    protected List<String> getLanguagesToImport(Language l) {
      return CollectionUtil.asList(BootstrapModule.DATA_FLOW.getUID());
    }
  };

  private String myName;

  LanguageAspect(String name) {
    myName = name;
  }

  public SModelDescriptor get(Language l) {
    return SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString(l.getNamespace() + "." + myName));
  }

  public String getName() {
    return myName;
  }

  public SModelDescriptor createNew(Language l) {
    return createNew(l, true);
  }

  public SModelDescriptor createNew(Language l, boolean saveDescriptor) {
    assert get(l) == null;

    SModel sm = l.getLanguageDescriptor().getModel();

    SModelDescriptor model = l.createModel(getModuleUID(l), l.getModelRoots().get(0));

    for (String lang : getAllLanguagesToImport(l)) {
      model.getSModel().addLanguage(lang);
    }

    for (String modelUID : getModelsToImport(l)) {
      model.getSModel().addImportedModel(SModelUID.fromString(modelUID));
    }

    model.getSModel().addImportedModel(l.getStructureModelDescriptor().getModelUID());

    model.save();

    if (saveDescriptor) {
      Model m = Model.newInstance(sm);
      m.setName(model.getModelUID().toString());

      l.setLanguageDescriptor(l.getLanguageDescriptor());

      l.save();
    }

    return model;
  }

  public List<String> getAllLanguagesToImport(Language l) {
    List<String> result = new ArrayList<String>(getLanguagesToImport(l));
    result.addAll(getLanguagesToImport(l));
    result.add(BootstrapModule.COLLECTIONS.getUID());
    result.add(BootstrapModule.SMODEL.getUID());
    result.add(BootstrapModule.BASE_LANGUAGE.getUID());
    return result;
  }

  protected List<String> getLanguagesToImport(Language l) {
    return CollectionUtil.asList();
  }

  protected List<String> getModelsToImport(Language l) {
    return CollectionUtil.asList(
      l.getStructureModelDescriptor().getModelUID().toString()
    );
  }

  private SModelUID getModuleUID(Language l) {
    return new SModelUID(l.getNamespace() + "." + getName(), "");
  }
}
