package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StubCellRendererInfo extends BaseConcept {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.StubCellRendererInfo";
  public static String CELL_RENDERER_SETTER = "cellRendererSetter";

  public StubCellRendererInfo(SNode node) {
    super(node);
  }

  public InstanceMethodDeclaration getCellRendererSetter() {
    return (InstanceMethodDeclaration)this.getReferent(StubCellRendererInfo.CELL_RENDERER_SETTER);
  }

  public void setCellRendererSetter(InstanceMethodDeclaration node) {
    super.setReferent(StubCellRendererInfo.CELL_RENDERER_SETTER, node);
  }


  public static StubCellRendererInfo newInstance(SModel sm, boolean init) {
    return (StubCellRendererInfo)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.StubCellRendererInfo", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StubCellRendererInfo newInstance(SModel sm) {
    return StubCellRendererInfo.newInstance(sm, false);
  }

}
