package jetbrains.mps.make.script.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Option extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.make.script.structure.Option";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PRESENTATION = "presentation";

  public Option(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(Option.NAME);
  }

  public void setName(String value) {
    this.setProperty(Option.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Option.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Option.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Option.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Option.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Option.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Option.VIRTUAL_PACKAGE, value);
  }

  public Text getPresentation() {
    return (Text) this.getChild(Text.class, Option.PRESENTATION);
  }

  public void setPresentation(Text node) {
    super.setChild(Option.PRESENTATION, node);
  }

  public static Option newInstance(SModel sm, boolean init) {
    return (Option) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.make.script.structure.Option", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Option newInstance(SModel sm) {
    return Option.newInstance(sm, false);
  }
}
