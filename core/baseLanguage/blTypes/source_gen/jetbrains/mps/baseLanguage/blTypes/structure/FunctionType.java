package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FunctionType extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.blTypes.structure.FunctionType";
  public static String RESULT = "result";
  public static String PARAM = "param";

  public FunctionType(SNode node) {
    super(node);
  }

  public BaseConcept getResult() {
    return (BaseConcept)this.getChild(FunctionType.RESULT);
  }

  public void setResult(BaseConcept node) {
    super.setChild(FunctionType.RESULT, node);
  }

  public int getParamsCount() {
    return this.getChildCount(FunctionType.PARAM);
  }

  public Iterator<BaseConcept> params() {
    return this.children(FunctionType.PARAM);
  }

  public List<BaseConcept> getParams() {
    return this.getChildren(FunctionType.PARAM);
  }

  public void addParam(BaseConcept node) {
    this.addChild(FunctionType.PARAM, node);
  }

  public void insertParam(BaseConcept prev, BaseConcept node) {
    this.insertChild(prev, FunctionType.PARAM, node);
  }


  public static FunctionType newInstance(SModel sm, boolean init) {
    return (FunctionType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.structure.FunctionType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FunctionType newInstance(SModel sm) {
    return FunctionType.newInstance(sm, false);
  }

}
