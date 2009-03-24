package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.ConstructorDeclaration;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Type;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ClassCreator extends jetbrains.mps.baseLanguage.structure.AbstractCreator implements jetbrains.mps.baseLanguage.structure.IMethodCall {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ClassCreator";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String BASE_METHOD_DECLARATION = "baseMethodDeclaration";
  public static final String TYPE_PARAMETER = "typeParameter";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public ClassCreator(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ClassCreator.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ClassCreator.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ClassCreator.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ClassCreator.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ClassCreator.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ClassCreator.VIRTUAL_PACKAGE, value);
  }

  public jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration getBaseMethodDeclaration() {
    return (jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration)this.getReferent(BaseMethodDeclaration.class, ClassCreator.BASE_METHOD_DECLARATION);
  }

  public void setBaseMethodDeclaration(jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration node) {
    super.setReferent(ClassCreator.BASE_METHOD_DECLARATION, node);
  }

  public jetbrains.mps.baseLanguage.structure.ConstructorDeclaration getConstructorDeclaration() {
    return this.ensureAdapter(ConstructorDeclaration.class, "baseMethodDeclaration", this.getBaseMethodDeclaration());
  }

  public void setConstructorDeclaration(jetbrains.mps.baseLanguage.structure.ConstructorDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(ClassCreator.TYPE_PARAMETER);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.Type> typeParameters() {
    return this.children(Type.class, ClassCreator.TYPE_PARAMETER);
  }

  public List<jetbrains.mps.baseLanguage.structure.Type> getTypeParameters() {
    return this.getChildren(Type.class, ClassCreator.TYPE_PARAMETER);
  }

  public void addTypeParameter(jetbrains.mps.baseLanguage.structure.Type node) {
    this.addChild(ClassCreator.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(jetbrains.mps.baseLanguage.structure.Type prev, jetbrains.mps.baseLanguage.structure.Type node) {
    this.insertChild(prev, ClassCreator.TYPE_PARAMETER, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(ClassCreator.ACTUAL_ARGUMENT);
  }

  public Iterator<jetbrains.mps.baseLanguage.structure.Expression> actualArguments() {
    return this.children(Expression.class, ClassCreator.ACTUAL_ARGUMENT);
  }

  public List<jetbrains.mps.baseLanguage.structure.Expression> getActualArguments() {
    return this.getChildren(Expression.class, ClassCreator.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(jetbrains.mps.baseLanguage.structure.Expression node) {
    this.addChild(ClassCreator.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(jetbrains.mps.baseLanguage.structure.Expression prev, jetbrains.mps.baseLanguage.structure.Expression node) {
    this.insertChild(prev, ClassCreator.ACTUAL_ARGUMENT, node);
  }


  public static ClassCreator newInstance(SModel sm, boolean init) {
    return (ClassCreator)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ClassCreator", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ClassCreator newInstance(SModel sm) {
    return ClassCreator.newInstance(sm, false);
  }

}
