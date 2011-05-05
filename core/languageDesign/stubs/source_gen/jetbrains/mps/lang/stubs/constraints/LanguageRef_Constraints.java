package jetbrains.mps.lang.stubs.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.IScope;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.project.ModuleId;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;

public class LanguageRef_Constraints extends ConstraintsDataHolder {
  public LanguageRef_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.stubs.structure.LanguageRef";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.stubs.structure.LanguageRef";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("languageFqName", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        if (StringUtils.isEmpty(SPropertyOperations.getString(node, "languageId"))) {
          return null;
        }

        ModuleId moduleId = ModuleId.fromString(SPropertyOperations.getString(node, "languageId"));
        if (moduleId == null) {
          return null;
        }

        IModule module = MPSModuleRepository.getInstance().getModuleById(moduleId);
        if (module == null) {
          return moduleId.toString();
        }

        return module.getModuleFqName();
      }
    });
    return result;
  }

  public Map<String, INodePropertySetter> getNodePropertySetters() {
    HashMap<String, INodePropertySetter> result = new HashMap<String, INodePropertySetter>();
    return result;
  }

  public Map<String, INodePropertyValidator> getNodePropertyValidators() {
    HashMap<String, INodePropertyValidator> result = new HashMap<String, INodePropertyValidator>();
    return result;
  }

  public Map<String, INodeReferentSetEventHandler> getNodeReferentSetEventHandlers() {
    HashMap<String, INodeReferentSetEventHandler> result = new HashMap<String, INodeReferentSetEventHandler>();
    return result;
  }

  public Map<String, INodeReferentSearchScopeProvider> getNodeNonDefaultSearchScopeProviders() {
    HashMap<String, INodeReferentSearchScopeProvider> result = new HashMap<String, INodeReferentSearchScopeProvider>();
    return result;
  }
}
