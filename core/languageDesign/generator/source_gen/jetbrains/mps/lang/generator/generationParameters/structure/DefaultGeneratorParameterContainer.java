package jetbrains.mps.lang.generator.generationParameters.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DefaultGeneratorParameterContainer extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.generator.generationParameters.structure.DefaultGeneratorParameterContainer";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PARAMETERS = "parameters";

  public DefaultGeneratorParameterContainer(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(DefaultGeneratorParameterContainer.NAME);
  }

  public void setName(String value) {
    this.setProperty(DefaultGeneratorParameterContainer.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DefaultGeneratorParameterContainer.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DefaultGeneratorParameterContainer.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DefaultGeneratorParameterContainer.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DefaultGeneratorParameterContainer.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DefaultGeneratorParameterContainer.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DefaultGeneratorParameterContainer.VIRTUAL_PACKAGE, value);
  }

  public int getParametersesCount() {
    return this.getChildCount(DefaultGeneratorParameterContainer.PARAMETERS);
  }

  public Iterator<DefaultGeneratorParameter> parameterses() {
    return this.children(DefaultGeneratorParameter.class, DefaultGeneratorParameterContainer.PARAMETERS);
  }

  public List<DefaultGeneratorParameter> getParameterses() {
    return this.getChildren(DefaultGeneratorParameter.class, DefaultGeneratorParameterContainer.PARAMETERS);
  }

  public void addParameters(DefaultGeneratorParameter node) {
    this.addChild(DefaultGeneratorParameterContainer.PARAMETERS, node);
  }

  public void insertParameters(DefaultGeneratorParameter prev, DefaultGeneratorParameter node) {
    this.insertChild(prev, DefaultGeneratorParameterContainer.PARAMETERS, node);
  }

  public static DefaultGeneratorParameterContainer newInstance(SModel sm, boolean init) {
    return (DefaultGeneratorParameterContainer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.generationParameters.structure.DefaultGeneratorParameterContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DefaultGeneratorParameterContainer newInstance(SModel sm) {
    return DefaultGeneratorParameterContainer.newInstance(sm, false);
  }
}
