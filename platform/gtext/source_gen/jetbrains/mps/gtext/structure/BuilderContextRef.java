package jetbrains.mps.gtext.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BuilderContextRef extends Expression implements GTextConcept {
  public static final String concept = "jetbrains.mps.gtext.structure.BuilderContextRef";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public BuilderContextRef(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BuilderContextRef.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BuilderContextRef.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BuilderContextRef.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BuilderContextRef.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BuilderContextRef.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BuilderContextRef.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(BuilderContextRef._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, BuilderContextRef._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, BuilderContextRef._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(BuilderContextRef._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, BuilderContextRef._$ATTRIBUTE, node);
  }

  public static BuilderContextRef newInstance(SModel sm, boolean init) {
    return (BuilderContextRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.gtext.structure.BuilderContextRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BuilderContextRef newInstance(SModel sm) {
    return BuilderContextRef.newInstance(sm, false);
  }
}
