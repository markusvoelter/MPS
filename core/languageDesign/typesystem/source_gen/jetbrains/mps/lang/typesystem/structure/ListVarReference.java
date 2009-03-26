package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.typesystem.structure.ListVarDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListVarReference extends jetbrains.mps.baseLanguage.structure.Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.ListVarReference";
  public static final String LIST_VAR_DECLARATION = "listVarDeclaration";

  public ListVarReference(SNode node) {
    super(node);
  }

  public jetbrains.mps.lang.typesystem.structure.ListVarDeclaration getListVarDeclaration() {
    return (jetbrains.mps.lang.typesystem.structure.ListVarDeclaration)this.getReferent(ListVarDeclaration.class, ListVarReference.LIST_VAR_DECLARATION);
  }

  public void setListVarDeclaration(jetbrains.mps.lang.typesystem.structure.ListVarDeclaration node) {
    super.setReferent(ListVarReference.LIST_VAR_DECLARATION, node);
  }


  public static ListVarReference newInstance(SModel sm, boolean init) {
    return (ListVarReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.ListVarReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListVarReference newInstance(SModel sm) {
    return ListVarReference.newInstance(sm, false);
  }

}
