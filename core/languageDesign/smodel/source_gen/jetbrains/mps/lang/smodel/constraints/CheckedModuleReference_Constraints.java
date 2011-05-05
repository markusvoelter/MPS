package jetbrains.mps.lang.smodel.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.ConstraintsDataHolder;
import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.smodel.constraints.INodePropertyGetter;
import java.util.HashMap;
import jetbrains.mps.smodel.constraints.BaseNodePropertyGetter;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.constraints.INodePropertySetter;
import jetbrains.mps.smodel.constraints.BaseNodePropertySetter;
import jetbrains.mps.smodel.constraints.INodePropertyValidator;
import jetbrains.mps.smodel.constraints.BaseNodePropertyValidator;
import jetbrains.mps.smodel.constraints.INodeReferentSetEventHandler;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;

public class CheckedModuleReference_Constraints extends ConstraintsDataHolder {
  public CheckedModuleReference_Constraints() {
  }

  public String getAlternativeIcon(SNode node) {
    return null;
  }

  public boolean isAlternativeIcon() {
    return false;
  }

  public String getConceptFqName() {
    return "jetbrains.mps.lang.smodel.structure.CheckedModuleReference";
  }

  public String getDefaultConcreteConceptFqName() {
    return "jetbrains.mps.lang.smodel.structure.CheckedModuleReference";
  }

  public Map<String, INodePropertyGetter> getNodePropertyGetters() {
    HashMap<String, INodePropertyGetter> result = new HashMap<String, INodePropertyGetter>();
    result.put("moduleId", new BaseNodePropertyGetter() {
      public Object execPropertyGet(SNode node, String propertyName, IScope scope) {
        String original = SPropertyOperations.getString(node, "moduleId");
        if (StringUtils.isEmpty(original)) {
          return original;
        }
        ModuleReference moduleReference = ModuleReference.fromString(original);
        IModule module = MPSModuleRepository.getInstance().getModule(moduleReference);
        return (module != null ?
          module.getModuleFqName() :
          moduleReference.getModuleFqName()
        );
      }
    });
    return result;
  }

  public Map<String, INodePropertySetter> getNodePropertySetters() {
    HashMap<String, INodePropertySetter> result = new HashMap<String, INodePropertySetter>();
    result.put("moduleId", new BaseNodePropertySetter() {
      public void execPropertySet(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
        IModule module = MPSModuleRepository.getInstance().getModuleByUID((SPropertyOperations.getString(propertyValue)));
        SPropertyOperations.set(node, "moduleId", module.getModuleReference().toString());
      }
    });
    return result;
  }

  public Map<String, INodePropertyValidator> getNodePropertyValidators() {
    HashMap<String, INodePropertyValidator> result = new HashMap<String, INodePropertyValidator>();
    result.put("moduleId", new BaseNodePropertyValidator() {
      public boolean checkPropertyValue(final SNode node, final String propertyName, final String propertyValue, final IScope scope) {
        IModule module = MPSModuleRepository.getInstance().getModuleByUID((SPropertyOperations.getString(propertyValue)));
        return module != null;
      }
    });
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
