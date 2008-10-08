package jetbrains.mps.ide.scriptLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MigrationScriptPart_Instance extends BaseConcept {
  public static final String concept = "jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance";
  public static String DESCRIPTION = "description";
  public static String AFFECTED_INSTANCE_CONCEPT = "affectedInstanceConcept";
  public static String AFFECTED_INSTANCE_PREDICATE = "affectedInstancePredicate";
  public static String AFFECTED_INSTANCE_UPDATER = "affectedInstanceUpdater";

  public MigrationScriptPart_Instance(SNode node) {
    super(node);
  }

  public String getDescription() {
    return this.getProperty(MigrationScriptPart_Instance.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(MigrationScriptPart_Instance.DESCRIPTION, value);
  }

  public AbstractConceptDeclaration getAffectedInstanceConcept() {
    return (AbstractConceptDeclaration)this.getReferent(MigrationScriptPart_Instance.AFFECTED_INSTANCE_CONCEPT);
  }

  public void setAffectedInstanceConcept(AbstractConceptDeclaration node) {
    super.setReferent(MigrationScriptPart_Instance.AFFECTED_INSTANCE_CONCEPT, node);
  }

  public MigrationScriptPart_Instance_Predicate getAffectedInstancePredicate() {
    return (MigrationScriptPart_Instance_Predicate)this.getChild(MigrationScriptPart_Instance.AFFECTED_INSTANCE_PREDICATE);
  }

  public void setAffectedInstancePredicate(MigrationScriptPart_Instance_Predicate node) {
    super.setChild(MigrationScriptPart_Instance.AFFECTED_INSTANCE_PREDICATE, node);
  }

  public MigrationScriptPart_Instance_Updater getAffectedInstanceUpdater() {
    return (MigrationScriptPart_Instance_Updater)this.getChild(MigrationScriptPart_Instance.AFFECTED_INSTANCE_UPDATER);
  }

  public void setAffectedInstanceUpdater(MigrationScriptPart_Instance_Updater node) {
    super.setChild(MigrationScriptPart_Instance.AFFECTED_INSTANCE_UPDATER, node);
  }


  public static MigrationScriptPart_Instance newInstance(SModel sm, boolean init) {
    return (MigrationScriptPart_Instance)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.scriptLanguage.structure.MigrationScriptPart_Instance", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MigrationScriptPart_Instance newInstance(SModel sm) {
    return MigrationScriptPart_Instance.newInstance(sm, false);
  }

}
