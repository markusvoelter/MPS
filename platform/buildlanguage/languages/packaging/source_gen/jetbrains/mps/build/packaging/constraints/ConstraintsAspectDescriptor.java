package jetbrains.mps.build.packaging.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.structure.DescriptorProvider;
import jetbrains.mps.smodel.structure.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.structure.DataHolderConstraintsDescriptor;
import jetbrains.mps.smodel.structure.EmptyConstraintsDataHolder;

public class ConstraintsAspectDescriptor extends DescriptorProvider<ConstraintsDescriptor> {
  private static String[] stringSwitchCases_2qnle6_a0a0a = new String[]{"jetbrains.mps.build.packaging.structure.AbstractProjectComponent", "jetbrains.mps.build.packaging.structure.Antcall", "jetbrains.mps.build.packaging.structure.BaseDirPath", "jetbrains.mps.build.packaging.structure.Block", "jetbrains.mps.build.packaging.structure.BlockReference", "jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference", "jetbrains.mps.build.packaging.structure.ComponentsList", "jetbrains.mps.build.packaging.structure.CompositePathComponent", "jetbrains.mps.build.packaging.structure.CompositeString", "jetbrains.mps.build.packaging.structure.Configuration", "jetbrains.mps.build.packaging.structure.ConfigurationReference", "jetbrains.mps.build.packaging.structure.Copy", "jetbrains.mps.build.packaging.structure.Delete", "jetbrains.mps.build.packaging.structure.Echo", "jetbrains.mps.build.packaging.structure.File", "jetbrains.mps.build.packaging.structure.FileExistsCondition", "jetbrains.mps.build.packaging.structure.Folder", "jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent", "jetbrains.mps.build.packaging.structure.ICompositeComponent", "jetbrains.mps.build.packaging.structure.ICondition", "jetbrains.mps.build.packaging.structure.ILayoutComponent", "jetbrains.mps.build.packaging.structure.IMacroHolder", "jetbrains.mps.build.packaging.structure.INotBuildableComponent", "jetbrains.mps.build.packaging.structure.IPath", "jetbrains.mps.build.packaging.structure.IStringExpression", "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent", "jetbrains.mps.build.packaging.structure.IVariableHolder", "jetbrains.mps.build.packaging.structure.Jar", "jetbrains.mps.build.packaging.structure.Layout", "jetbrains.mps.build.packaging.structure.MPSLayoutConfigurationReferencePropertyValueExpression", "jetbrains.mps.build.packaging.structure.Macro", "jetbrains.mps.build.packaging.structure.MacroReference", "jetbrains.mps.build.packaging.structure.Manifest", "jetbrains.mps.build.packaging.structure.ManifestAttribute", "jetbrains.mps.build.packaging.structure.Module", "jetbrains.mps.build.packaging.structure.ModuleCycle", "jetbrains.mps.build.packaging.structure.ModuleCycleReference", "jetbrains.mps.build.packaging.structure.NewModuleReference", "jetbrains.mps.build.packaging.structure.NonExistingPath", "jetbrains.mps.build.packaging.structure.NotCondition", "jetbrains.mps.build.packaging.structure.Pair", "jetbrains.mps.build.packaging.structure.Path", "jetbrains.mps.build.packaging.structure.PathComponent", "jetbrains.mps.build.packaging.structure.PathHolder", "jetbrains.mps.build.packaging.structure.Plugin", "jetbrains.mps.build.packaging.structure.PostProcessingTask", "jetbrains.mps.build.packaging.structure.PropertiesImport", "jetbrains.mps.build.packaging.structure.PropertyFileImport", "jetbrains.mps.build.packaging.structure.PropertyNodeImport", "jetbrains.mps.build.packaging.structure.Replace", "jetbrains.mps.build.packaging.structure.SimpleString", "jetbrains.mps.build.packaging.structure.Space", "jetbrains.mps.build.packaging.structure.Variable", "jetbrains.mps.build.packaging.structure.VariableReference", "jetbrains.mps.build.packaging.structure.Zip"};

  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0a, fqName)) {
      case 28:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Layout"));
      case 20:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ILayoutComponent"));
      case 0:
        return new DataHolderConstraintsDescriptor(new AbstractProjectComponent_Constraints());
      case 14:
        return new DataHolderConstraintsDescriptor(new File_Constraints());
      case 27:
        return new DataHolderConstraintsDescriptor(new Jar_Constraints());
      case 16:
        return new DataHolderConstraintsDescriptor(new Folder_Constraints());
      case 34:
        return new DataHolderConstraintsDescriptor(new Module_Constraints());
      case 18:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ICompositeComponent"));
      case 11:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Copy"));
      case 54:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Zip"));
      case 9:
        return new DataHolderConstraintsDescriptor(new Configuration_Constraints());
      case 10:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ConfigurationReference"));
      case 12:
        return new DataHolderConstraintsDescriptor(new Delete_Constraints());
      case 45:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PostProcessingTask"));
      case 43:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PathHolder"));
      case 13:
        return new DataHolderConstraintsDescriptor(new Echo_Constraints());
      case 52:
        return new DataHolderConstraintsDescriptor(new Variable_Constraints());
      case 50:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.SimpleString"));
      case 24:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.IStringExpression"));
      case 53:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.VariableReference"));
      case 8:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.CompositeString"));
      case 1:
        return new DataHolderConstraintsDescriptor(new Antcall_Constraints());
      case 5:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.BuildLanguageTargetReference"));
      case 49:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Replace"));
      case 40:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Pair"));
      case 35:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ModuleCycle"));
      case 37:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.NewModuleReference"));
      case 30:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Macro"));
      case 41:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Path"));
      case 42:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PathComponent"));
      case 7:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.CompositePathComponent"));
      case 31:
        return new DataHolderConstraintsDescriptor(new MacroReference_Constraints());
      case 2:
        return new DataHolderConstraintsDescriptor(new BaseDirPath_Constraints());
      case 29:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.MPSLayoutConfigurationReferencePropertyValueExpression"));
      case 19:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ICondition"));
      case 15:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.FileExistsCondition"));
      case 39:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.NotCondition"));
      case 38:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.NonExistingPath"));
      case 23:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.IPath"));
      case 51:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Space"));
      case 26:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.IVariableHolder"));
      case 21:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.IMacroHolder"));
      case 17:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.IAbstractCompositeComponent"));
      case 32:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Manifest"));
      case 33:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ManifestAttribute"));
      case 6:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ComponentsList"));
      case 25:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"));
      case 22:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.INotBuildableComponent"));
      case 46:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PropertiesImport"));
      case 48:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PropertyNodeImport"));
      case 47:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.PropertyFileImport"));
      case 4:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.BlockReference"));
      case 3:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.Block"));
      case 36:
        return new DataHolderConstraintsDescriptor(new EmptyConstraintsDataHolder("jetbrains.mps.build.packaging.structure.ModuleCycleReference"));
      case 44:
        return new DataHolderConstraintsDescriptor(new Plugin_Constraints());
      default:
        return null;
    }
  }
}
