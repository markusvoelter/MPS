package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_ModelAccess extends CellModel_AbstractLabel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_ModelAccess";
  public static final String NULL_TEXT = "nullText";
  public static final String MODEL_ACESSOR = "modelAcessor";

  public CellModel_ModelAccess(SNode node) {
    super(node);
  }

  public String getNullText() {
    return this.getProperty(CellModel_ModelAccess.NULL_TEXT);
  }

  public void setNullText(String value) {
    this.setProperty(CellModel_ModelAccess.NULL_TEXT, value);
  }

  public ModelAccessor getModelAcessor() {
    return (ModelAccessor) this.getChild(ModelAccessor.class, CellModel_ModelAccess.MODEL_ACESSOR);
  }

  public void setModelAcessor(ModelAccessor node) {
    super.setChild(CellModel_ModelAccess.MODEL_ACESSOR, node);
  }

  public static CellModel_ModelAccess newInstance(SModel sm, boolean init) {
    return (CellModel_ModelAccess) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_ModelAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_ModelAccess newInstance(SModel sm) {
    return CellModel_ModelAccess.newInstance(sm, false);
  }
}
