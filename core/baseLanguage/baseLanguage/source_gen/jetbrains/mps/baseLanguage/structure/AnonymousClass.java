package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.INodeAdapter;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AnonymousClass extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.AnonymousClass";
  public static final String CLASSIFIER = "classifier";
  public static final String PARAMETER = "parameter";
  public static final String TYPE_PARAMETER = "typeParameter";

  public AnonymousClass(SNode node) {
    super(node);
  }

  public INodeAdapter getClassifier() {
    return (INodeAdapter)this.getReferent(, AnonymousClass.CLASSIFIER);
  }

  public void setClassifier(INodeAdapter node) {
    super.setReferent(AnonymousClass.CLASSIFIER, node);
  }

  public int getParametersCount() {
    return this.getChildCount(AnonymousClass.PARAMETER);
  }

  public Iterator<INodeAdapter> parameters() {
    return this.children(, AnonymousClass.PARAMETER);
  }

  public List<INodeAdapter> getParameters() {
    return this.getChildren(, AnonymousClass.PARAMETER);
  }

  public void addParameter(INodeAdapter node) {
    this.addChild(AnonymousClass.PARAMETER, node);
  }

  public void insertParameter(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, AnonymousClass.PARAMETER, node);
  }

  public int getTypeParametersCount() {
    return this.getChildCount(AnonymousClass.TYPE_PARAMETER);
  }

  public Iterator<INodeAdapter> typeParameters() {
    return this.children(, AnonymousClass.TYPE_PARAMETER);
  }

  public List<INodeAdapter> getTypeParameters() {
    return this.getChildren(, AnonymousClass.TYPE_PARAMETER);
  }

  public void addTypeParameter(INodeAdapter node) {
    this.addChild(AnonymousClass.TYPE_PARAMETER, node);
  }

  public void insertTypeParameter(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, AnonymousClass.TYPE_PARAMETER, node);
  }


  public static AnonymousClass newInstance(SModel sm, boolean init) {
    return (AnonymousClass)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.AnonymousClass", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AnonymousClass newInstance(SModel sm) {
    return AnonymousClass.newInstance(sm, false);
  }

}
