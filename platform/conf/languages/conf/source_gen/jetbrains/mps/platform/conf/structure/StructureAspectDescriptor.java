package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.StructureDescriptor;
import java.util.Arrays;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.List;
import java.util.HashSet;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import java.util.Collections;

public class StructureAspectDescriptor extends DescriptorProvider<StructureDescriptor> {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.Action", "jetbrains.mps.platform.conf.structure.ActionReference", "jetbrains.mps.platform.conf.structure.Actions", "jetbrains.mps.platform.conf.structure.BeanExtension", "jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", "jetbrains.mps.platform.conf.structure.BeanExtensionPoint", "jetbrains.mps.platform.conf.structure.Component", "jetbrains.mps.platform.conf.structure.ComponentRoot", "jetbrains.mps.platform.conf.structure.Components", "jetbrains.mps.platform.conf.structure.ComponentsRoot", "jetbrains.mps.platform.conf.structure.ConfigurationXmlDocument", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.ExtensionPoints", "jetbrains.mps.platform.conf.structure.Extensions", "jetbrains.mps.platform.conf.structure.Group", "jetbrains.mps.platform.conf.structure.GroupReference", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IActionItem", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationElementFragment", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment", "jetbrains.mps.platform.conf.structure.IPluginConfigurationFragment", "jetbrains.mps.platform.conf.structure.IdeaPluginRoot", "jetbrains.mps.platform.conf.structure.IdeaVersion", "jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", "jetbrains.mps.platform.conf.structure.InterfaceExtension", "jetbrains.mps.platform.conf.structure.KeyboardShortcut", "jetbrains.mps.platform.conf.structure.MouseShortcut", "jetbrains.mps.platform.conf.structure.Plugin", "jetbrains.mps.platform.conf.structure.PluginDependency", "jetbrains.mps.platform.conf.structure.PluginDetails", "jetbrains.mps.platform.conf.structure.PluginHelpset", "jetbrains.mps.platform.conf.structure.PluginVendor", "jetbrains.mps.platform.conf.structure.RootRoot", "jetbrains.mps.platform.conf.structure.Separator", "jetbrains.mps.platform.conf.structure.Service", "jetbrains.mps.platform.conf.structure.Shortcut", "jetbrains.mps.platform.conf.structure.XInclude"};

  public StructureAspectDescriptor() {
  }

  public StructureDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.AbstractAction", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.lang.core.structure.IResolveInfo"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 1:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Action", new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IActionItem", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 2:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ActionReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 3:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Actions", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 4:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtension", new String[]{"jetbrains.mps.platform.conf.structure.Extension"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 5:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 6:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.BeanExtensionPoint", new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint"}, new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 7:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Component", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 8:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ComponentRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 9:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Components", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.HasLevel"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 10:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ComponentsRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 11:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlDocument", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 12:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 13:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 14:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Extension", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 15:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ExtensionPoint", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo", "jetbrains.mps.platform.conf.structure.IConfigurationElement"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 16:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.ExtensionPoints", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 17:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Extensions", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 18:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Group", new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction"}, new String[]{"jetbrains.mps.platform.conf.structure.AbstractAction", "jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 19:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.GroupReference", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 20:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.HasLevel", new String[]{}, new String[]{}, new String[]{});
      case 21:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IActionItem", new String[]{}, new String[]{}, new String[]{});
      case 22:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfiguration", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case 23:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationElement", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case 24:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationElementFragment", new String[]{}, new String[]{}, new String[]{});
      case 25:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IConfigurationFragment", new String[]{}, new String[]{}, new String[]{});
      case 26:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment", new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{});
      case 27:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IPluginConfigurationFragment", new String[]{}, new String[]{}, new String[]{});
      case 28:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IdeaPluginRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 29:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IdeaVersion", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 30:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.IntefaceExtensionPoint", new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint"}, new String[]{"jetbrains.mps.platform.conf.structure.ExtensionPoint", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 31:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.InterfaceExtension", new String[]{"jetbrains.mps.platform.conf.structure.Extension"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 32:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.KeyboardShortcut", new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 33:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.MouseShortcut", new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.platform.conf.structure.Shortcut"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 34:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Plugin", new String[]{"jetbrains.mps.platform.conf.structure.IdeaPluginRoot", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IdeaPluginRoot"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept", "jetbrains.mps.lang.core.structure.IResolveInfo"});
      case 35:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginDependency", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 36:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginDetails", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 37:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginHelpset", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 38:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.PluginVendor", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept"});
      case 39:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.RootRoot", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.ConfigurationXmlRootNode", "jetbrains.mps.platform.conf.structure.IConfiguration", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 40:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Separator", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.platform.conf.structure.IActionItem"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 41:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Service", new String[]{"jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.HasLevel"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.Extension", "jetbrains.mps.platform.conf.structure.HasLevel", "jetbrains.mps.platform.conf.structure.IConfigurationElement", "jetbrains.mps.platform.conf.structure.IConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 42:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.Shortcut", new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"}, new String[]{}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      case 43:
        return new StructureAspectDescriptor.DataBasedStructureDescriptor("jetbrains.mps.platform.conf.structure.XInclude", new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment"}, new String[]{"jetbrains.mps.platform.conf.structure.ConfigurationXmlNode", "jetbrains.mps.platform.conf.structure.IConfigurationFragment", "jetbrains.mps.platform.conf.structure.IExternalConfigurationFragment"}, new String[]{"jetbrains.mps.lang.core.structure.BaseConcept"});
      default:
        return null;
    }
  }

  public static class DataBasedStructureDescriptor extends StructureDescriptor {
    private ImmutableList<String> parents;
    private Set<String> ancestors;

    public DataBasedStructureDescriptor(String fqName, String[] parents, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      this.parents = ImmutableList.copyOf(parents);
      this.ancestors = getAncestors(fqName, ancestorsInLanguage, ancestorsNotInLanguage);
    }

    public Set<String> getAncestorsNames() {
      return ancestors;
    }

    public boolean isAssignableTo(String toConceptFqName) {
      return ancestors.contains(toConceptFqName);
    }

    public List<String> getParentsNames() {
      return parents;
    }

    private static Set<String> getAncestors(String conceptFqName, String[] ancestorsInLanguage, String[] ancestorsNotInLanguage) {
      Set<String> result = new HashSet(ancestorsInLanguage.length + 1);

      result.add(conceptFqName);
      for (String ancestor : ancestorsInLanguage) {
        result.add(ancestor);
      }

      ConceptRegistry registry = ConceptRegistry.getInstance();
      for (String parent : ancestorsNotInLanguage) {
        if (!(result.contains(parent))) {
          result.addAll(registry.getStructureDescriptor(parent).getAncestorsNames());
        }
      }

      return Collections.unmodifiableSet(result);
    }
  }
}
