package jetbrains.mps.ide.scriptLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MigrationScriptPart_Instance_Predicate extends ConceptFunction {

  public  MigrationScriptPart_Instance_Predicate(SNode node) {
    super(node);
  }

  public static MigrationScriptPart_Instance_Predicate newInstance(SModel sm, boolean init) {
    return (MigrationScriptPart_Instance_Predicate)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.scriptLanguage.MigrationScriptPart_Instance_Predicate", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static MigrationScriptPart_Instance_Predicate newInstance(SModel sm) {
    return MigrationScriptPart_Instance_Predicate.newInstance(sm, false);
  }
}
