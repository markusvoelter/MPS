package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Property_HasValue_Simple extends SNodeOperation {
public    static final String concept = "jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple";
public    static final String VALUE = "value";

  public Property_HasValue_Simple(SNode node) {
    super(node);
  }

  public Expression getValue() {
    return (Expression)this.getChild(Property_HasValue_Simple.VALUE);
  }

  public void setValue(Expression node) {
    super.setChild(Property_HasValue_Simple.VALUE, node);
  }


  public static Property_HasValue_Simple newInstance(SModel sm, boolean init) {
    return (Property_HasValue_Simple)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Property_HasValue_Simple", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Property_HasValue_Simple newInstance(SModel sm) {
    return Property_HasValue_Simple.newInstance(sm, false);
  }

}
