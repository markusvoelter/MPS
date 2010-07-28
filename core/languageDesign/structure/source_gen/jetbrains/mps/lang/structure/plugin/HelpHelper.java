package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.smodel.Generator;
import com.intellij.ide.BrowserUtil;

public class HelpHelper {
  public static HelpHelper.HelpType getDefaultHelpFor(IModule contextModule, SModelDescriptor contextModel, SNode node) {
    if (helpForNodeIsAvailable(node)) {
      return HelpHelper.HelpType.NODE;
    }
    if (helpForRootIsAvailable(node)) {
      return HelpHelper.HelpType.ROOT_NODE;
    }
    if (helpForAspectIsAvailable(contextModule, contextModel)) {
      return HelpHelper.HelpType.ASPECT;
    }
    return null;
  }

  public static void showHelpFor(IModule contextModule, SModelDescriptor contextModel, SNode node) {
    HelpHelper.HelpType defaultHelp = getDefaultHelpFor(contextModule, contextModel, node);
    if (defaultHelp == HelpHelper.HelpType.NODE) {
      HelpHelper.showHelpForNode(node);
    } else if (defaultHelp == HelpHelper.HelpType.ROOT_NODE) {
      HelpHelper.showHelpForRoot(node);
    } else if (defaultHelp == HelpHelper.HelpType.ASPECT) {
      HelpHelper.showHelpForAspect(contextModule, contextModel);
    }
  }

  public static boolean helpForNodeIsAvailable(SNode node) {
    if ((node == null)) {
      return false;
    }
    return StringUtils.isNotEmpty(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "helpURL"));
  }

  public static boolean helpForRootIsAvailable(SNode node) {
    if ((node == null)) {
      return false;
    }
    return StringUtils.isNotEmpty(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getContainingRoot(node)), "helpURL"));
  }

  public static boolean helpForAspectIsAvailable(IModule module, SModelDescriptor model) {
    if (model == null || module == null) {
      return false;
    }
    if (module instanceof Language) {
      Language language = ((Language) module);
      LanguageAspect aspect = language.getAspectForModel(model);
      if (aspect == null) {
        return false;
      }
      return aspect.getHelpURL() != null && !(aspect.getHelpURL().equals(""));
    } else {
      return module instanceof Generator;
    }
  }

  public static void showHelpForAspect(IModule contextModule, SModelDescriptor contextModel) {
    if (contextModule instanceof Language) {
      Language language = ((Language) contextModule);
      LanguageAspect aspect = language.getAspectForModel(contextModel);
      BrowserUtil.launchBrowser(aspect.getHelpURL());
    } else {
      BrowserUtil.launchBrowser("http://www.jetbrains.net/confluence/display/MPSD1/Generator#Generator-aboutgenerator");
    }
  }

  public static void showHelpForRoot(SNode node) {
    BrowserUtil.launchBrowser(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(SNodeOperations.getContainingRoot(node)), "helpURL"));
  }

  public static void showHelpForNode(SNode node) {
    BrowserUtil.launchBrowser(SPropertyOperations.getString(SNodeOperations.getConceptDeclaration(node), "helpURL"));
  }

  public static   enum HelpType {
    NODE("node"),
    ROOT_NODE("root"),
    ASPECT("aspect");

    private String myName;

    HelpType(String name) {
      this.myName = name;
    }

    public String getName() {
      return this.myName;
    }
  }
}
