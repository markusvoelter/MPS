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

public class ArrayCreatorWithInitializer extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer";
  public static final String COMPONENT_TYPE = "componentType";
  public static final String INIT_VALUE = "initValue";

  public ArrayCreatorWithInitializer(SNode node) {
    super(node);
  }

  public INodeAdapter getComponentType() {
    return (INodeAdapter)this.getChild(, ArrayCreatorWithInitializer.COMPONENT_TYPE);
  }

  public void setComponentType(INodeAdapter node) {
    super.setChild(ArrayCreatorWithInitializer.COMPONENT_TYPE, node);
  }

  public int getInitValuesCount() {
    return this.getChildCount(ArrayCreatorWithInitializer.INIT_VALUE);
  }

  public Iterator<INodeAdapter> initValues() {
    return this.children(, ArrayCreatorWithInitializer.INIT_VALUE);
  }

  public List<INodeAdapter> getInitValues() {
    return this.getChildren(, ArrayCreatorWithInitializer.INIT_VALUE);
  }

  public void addInitValue(INodeAdapter node) {
    this.addChild(ArrayCreatorWithInitializer.INIT_VALUE, node);
  }

  public void insertInitValue(INodeAdapter prev, INodeAdapter node) {
    this.insertChild(prev, ArrayCreatorWithInitializer.INIT_VALUE, node);
  }


  public static ArrayCreatorWithInitializer newInstance(SModel sm, boolean init) {
    return (ArrayCreatorWithInitializer)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayCreatorWithInitializer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayCreatorWithInitializer newInstance(SModel sm) {
    return ArrayCreatorWithInitializer.newInstance(sm, false);
  }

}
