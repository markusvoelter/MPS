package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Enum extends BaseConcept {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.Enum";
  public static final String CLNK_Type = "type";
  public static final String CONSTANTS = "constants";

  public Enum(SNode node) {
    super(node);
  }

  public int getConstantsesCount() {
    return this.getChildCount(Enum.CONSTANTS);
  }

  public Iterator<PropertyValueExpression> constantses() {
    return this.children(PropertyValueExpression.class, Enum.CONSTANTS);
  }

  public List<PropertyValueExpression> getConstantses() {
    return this.getChildren(PropertyValueExpression.class, Enum.CONSTANTS);
  }

  public void addConstants(PropertyValueExpression node) {
    this.addChild(Enum.CONSTANTS, node);
  }

  public void insertConstants(PropertyValueExpression prev, PropertyValueExpression node) {
    this.insertChild(prev, Enum.CONSTANTS, node);
  }

  public static Enum newInstance(SModel sm, boolean init) {
    return (Enum) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.Enum", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Enum newInstance(SModel sm) {
    return Enum.newInstance(sm, false);
  }
}
