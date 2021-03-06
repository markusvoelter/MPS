package jetbrains.mps.execution.impl.configurations;

/*Generated by MPS */

import com.intellij.openapi.components.ProjectComponent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.plugins.PluginReloader;
import jetbrains.mps.plugins.PluginReloadingListener;
import jetbrains.mps.ide.IdeMain;
import org.jdom.Element;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.execution.ExecutionManager;
import com.intellij.execution.ui.RunContentManagerImpl;
import com.intellij.execution.ui.RunContentDescriptor;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.execution.impl.RunManagerImpl;
import com.intellij.execution.RunManagerEx;
import com.intellij.execution.impl.ProjectRunConfigurationManager;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.openapi.extensions.Extensions;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.jdom.transform.JDOMSource;
import org.jdom.transform.JDOMResult;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.TransformerException;

public class RunConfigurationsStateManager implements ProjectComponent {
  protected static Log log = LogFactory.getLog(RunConfigurationsStateManager.class);

  private final Project myProject;
  private final PluginReloader myPluginReloader;
  private final PluginReloadingListener myPluginReloadingListener = new PluginReloadingListener() {
    public void afterPluginsLoaded() {
      if (IdeMain.getTestMode() != IdeMain.TestMode.NO_TEST) {
        return;
      }
      initRunConfigurations();
    }

    public void beforePluginsDisposed() {
      if (IdeMain.getTestMode() != IdeMain.TestMode.NO_TEST) {
        return;
      }
      disposeRunConfigurations();
    }
  };
  private Element myState = null;
  private Element mySharedState = null;

  public RunConfigurationsStateManager(Project project, PluginReloader pluginReloader) {
    myProject = project;
    myPluginReloader = pluginReloader;
  }

  public void projectOpened() {
  }

  public void projectClosed() {
  }

  public void initRunConfigurations() {
    if (myProject.isDisposed()) {
      return;
    }
    getRunManager().initializeConfigurationTypes(RunConfigurationsStateManager.getConfigurationTypes());
    RunConfiguration[] runConfigurations = getRunManager().getAllConfigurations();
    if (runConfigurations != null && runConfigurations.length > 0) {
      if (log.isErrorEnabled()) {
        log.error("Already has loaded configurations. We do not want to owerwrite them.");
      }
    } else {
      if (myState != null) {
        try {
          getRunManager().readExternal(myState);
        } catch (InvalidDataException e) {
          if (log.isErrorEnabled()) {
            log.error("", e);
          }
        }
      }
      if (mySharedState != null) {
        try {
          getSharedConfigurationManager().readExternal(mySharedState);
        } catch (InvalidDataException e) {
          if (log.isErrorEnabled()) {
            log.error("", e);
          }
        }
      }
    }
    reInitializeManagers();
  }

  public void disposeRunConfigurations() {
    assert !(myProject.isDisposed());
    ExecutionManager executionManager = myProject.getComponent(ExecutionManager.class);
    RunContentManagerImpl contentManager = (RunContentManagerImpl) executionManager.getContentManager();
    for (RunContentDescriptor d : contentManager.getAllDescriptors()) {
      if (d.getAttachedContent() == null) {
        if (log.isWarnEnabled()) {
          log.warn("Attached content of descriptor " + d.getDisplayName() + " is null.");
        }
      } else
      if (d.getAttachedContent().getManager() == null) {
        if (log.isWarnEnabled()) {
          log.warn("Manager of attached content of descriptor " + d.getDisplayName() + " is null.");
        }
      } else {
        d.getAttachedContent().getManager().removeAllContents(true);
      }
    }
    Element newState = new Element("root");
    try {
      getRunManager().writeExternal(newState);
      myState = newState;
    } catch (WriteExternalException e) {
      if (log.isErrorEnabled()) {
        log.error("", e);
      }
    }
    mySharedState = getSharedConfigurationManager().getState();
    getRunManager().clearAll();
  }

  private RunManagerImpl getRunManager() {
    return (RunManagerImpl) RunManagerEx.getInstanceEx(myProject);
  }

  private ProjectRunConfigurationManager getSharedConfigurationManager() {
    return myProject.getComponent(ProjectRunConfigurationManager.class);
  }

  private void reInitializeManagers() {
    Element newState = new Element("root");
    Element newSharedState = new Element("root");
    try {
      // save 
      getRunManager().writeExternal(newState);
      getSharedConfigurationManager().writeExternal(newSharedState);

      // migrate 
      newState = migrateConfigurations(newState);
      newSharedState = migrateConfigurations(newSharedState);

      // read 
      getRunManager().readExternal(newState);
      getSharedConfigurationManager().readExternal(newSharedState);
    } catch (WriteExternalException wee) {
      if (log.isErrorEnabled()) {
        log.error("", wee);
      }
    } catch (InvalidDataException ide) {
      if (log.isErrorEnabled()) {
        log.error("", ide);
      }
    }
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPS Run Configs Manager";
  }

  public void initComponent() {
    myPluginReloader.addReloadingListener(myPluginReloadingListener);
  }

  public void disposeComponent() {
    myPluginReloader.removeReloadingListener(myPluginReloadingListener);
  }

  public static ConfigurationType[] getConfigurationTypes() {
    final ConfigurationType[] configurationTypes = Extensions.getExtensions(ConfigurationType.CONFIGURATION_TYPE_EP);
    final List<ConfigurationType> result = new ArrayList<ConfigurationType>();
    Set<String> uniqTypes = new HashSet<String>();
    for (ConfigurationType type : configurationTypes) {
      if (!(uniqTypes.contains(type.getClass().getName()))) {
        result.add(type);
        uniqTypes.add(type.getClass().getName());
      }
    }
    return result.toArray(new ConfigurationType[result.size()]);
  }

  public static Element migrateConfigurations(Element state) {
    return RunConfigurationsStateManager.migrateConfigurations(RunConfigurationsStateManager.migrateConfigurations(state, "java.transform.xml"), "junit.transform.xml");
  }

  private static Element migrateConfigurations(Element state, String string) throws TransformerFactoryConfigurationError {
    JDOMSource source = new JDOMSource(state);
    JDOMResult result = new JDOMResult();

    try {
      Transformer transformer = TransformerFactory.newInstance().newTransformer(new StreamSource(RunConfigurationsStateManager.class.getResourceAsStream(string)));
      transformer.transform(source, result);
      List transformResult = result.getResult();
      if (transformResult.size() == 1) {
        return (Element) transformResult.get(0);
      }
    } catch (TransformerException e) {
      if (log.isErrorEnabled()) {
        log.error("Cant transform", e);
      }
    }

    return state;
  }

  public static RunConfigurationsStateManager getInstance(Project project) {
    return project.getComponent(RunConfigurationsStateManager.class);
  }
}
