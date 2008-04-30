package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ImportProject extends BaseConcept {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.ImportProject";
  public static String PROJECT = "project";

  public ImportProject(SNode node) {
    super(node);
  }

  public static ImportProject newInstance(SModel sm, boolean init) {
    return (ImportProject)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.ImportProject", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ImportProject newInstance(SModel sm) {
    return ImportProject.newInstance(sm, false);
  }


  public Project getProject() {
    return (Project)this.getReferent(ImportProject.PROJECT);
  }

  public void setProject(Project node) {
    super.setReferent(ImportProject.PROJECT, node);
  }

}
