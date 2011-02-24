package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseVariableReference;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RefactoringFieldReference extends BaseVariableReference implements RefactoringArgumentReference {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.RefactoringFieldReference";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public RefactoringFieldReference(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(RefactoringFieldReference.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(RefactoringFieldReference.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(RefactoringFieldReference.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(RefactoringFieldReference.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(RefactoringFieldReference.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(RefactoringFieldReference.VIRTUAL_PACKAGE, value);
  }

  public RefactoringField getRefactoringField() {
    return this.ensureAdapter(RefactoringField.class, "baseVariableDeclaration", this.getBaseVariableDeclaration());
  }

  public void setRefactoringField(RefactoringField node) {
    this.setBaseVariableDeclaration(node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(RefactoringFieldReference._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, RefactoringFieldReference._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, RefactoringFieldReference._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(RefactoringFieldReference._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, RefactoringFieldReference._$ATTRIBUTE, node);
  }

  public static RefactoringFieldReference newInstance(SModel sm, boolean init) {
    return (RefactoringFieldReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.RefactoringFieldReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RefactoringFieldReference newInstance(SModel sm) {
    return RefactoringFieldReference.newInstance(sm, false);
  }
}
