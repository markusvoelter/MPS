package jetbrains.mps.plugins.pluginparts.runconfigs;

/*Generated by MPS */

import com.intellij.execution.junit.RuntimeConfigurationProducer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import com.intellij.execution.actions.ConfigurationContext;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.Location;
import com.intellij.execution.configurations.RunConfiguration;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import com.intellij.execution.impl.RunnerAndConfigurationSettingsImpl;
import com.intellij.execution.impl.RunManagerImpl;
import org.apache.commons.lang.ObjectUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NonNls;
import jetbrains.mps.internal.collections.runtime.Sequence;

public abstract class BaseConfigCreator<T> extends RuntimeConfigurationProducer {
  protected static Log log = LogFactory.getLog(BaseConfigCreator.class);

  private PsiElement mySourceElement;
  @Nullable
  private ConfigurationContext myContext;

  public BaseConfigCreator(ConfigurationType configurationType, String factoryClassName) {
    super(BaseConfigCreator.findFactory(configurationType, factoryClassName));
  }

  public BaseConfigCreator(ConfigurationFactory configurationFactory) {
    super(configurationFactory);
  }

  public void setSourceElement(PsiElement sourceElement) {
    mySourceElement = sourceElement;
  }

  public PsiElement getSourceElement() {
    return mySourceElement;
  }

  @Nullable
  protected ConfigurationContext getContext() {
    return myContext;
  }

  protected RunnerAndConfigurationSettings createConfigurationByElement(Location location, ConfigurationContext context) {
    myContext = context;
    if (!((location instanceof MPSLocation))) {
      return null;
    }
    MPSLocation mpsLocation = (MPSLocation) location;
    final MPSPsiElement psiElement = mpsLocation.getPsiElement();
    RunConfiguration config = ModelAccess.instance().runReadAction(new Computable<RunConfiguration>() {
      public RunConfiguration compute() {
        Object mpsItem = psiElement.getMPSItem();
        if (mpsItem == null) {
          return null;
        }
        if (!(isApplicable(mpsItem))) {
          return null;
        }
        return doCreateConfiguration((T) psiElement.getMPSItem());
      }
    });
    if (config == null) {
      return null;
    }
    return new RunnerAndConfigurationSettingsImpl(RunManagerImpl.getInstanceImpl(location.getProject()), config, false);
  }

  protected abstract RunConfiguration doCreateConfiguration(T node);

  protected abstract boolean isApplicable(Object element);

  public int compareTo(Object o) {
    return RuntimeConfigurationProducer.PREFERED;
  }

  public int hashCode() {
    return ((myContext == null ?
      0 :
      myContext.hashCode()
    )) + 10 * ((mySourceElement == null ?
      0 :
      mySourceElement.hashCode()
    )) + 20 * getClass().getName().hashCode();
  }

  public boolean equals(Object obj) {
    if (obj == null || !((obj instanceof BaseConfigCreator))) {
      return false;
    }
    BaseConfigCreator configCreator = (BaseConfigCreator) obj;
    return ObjectUtils.equals(configCreator.myContext, myContext) && ObjectUtils.equals(configCreator.mySourceElement, mySourceElement) && ObjectUtils.equals(configCreator.getClass().getName(), getClass().getName());
  }

  @NotNull
  protected static ConfigurationFactory findFactory(ConfigurationType configurationType, @NonNls String configurationFactoryClassName) {
    for (ConfigurationFactory factory : Sequence.fromIterable(Sequence.fromArray(configurationType.getConfigurationFactories()))) {
      if (factory.getClass().getName().equals(configurationFactoryClassName)) {
        return factory;
      }
    }
    if (log.isWarnEnabled()) {
      log.warn("Cound not find configuration factory for " + configurationFactoryClassName + " in type " + configurationType.getDisplayName() + ".");
    }
    return configurationType.getConfigurationFactories()[0];
  }
}
