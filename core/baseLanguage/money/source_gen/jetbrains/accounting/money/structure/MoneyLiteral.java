package jetbrains.accounting.money.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MoneyLiteral extends Expression {
  public static final String concept = "jetbrains.accounting.money.structure.MoneyLiteral";
  public static String CURRENCY = "currency";
  public static String AMOUNT = "amount";

  public MoneyLiteral(SNode node) {
    super(node);
  }

  public static MoneyLiteral newInstance(SModel sm, boolean init) {
    return (MoneyLiteral) SModelUtil_new.instantiateConceptDeclaration("jetbrains.accounting.money.structure.MoneyLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MoneyLiteral newInstance(SModel sm) {
    return MoneyLiteral.newInstance(sm, false);
  }


  public String getCurrency() {
    return this.getProperty(MoneyLiteral.CURRENCY);
  }

  public void setCurrency(String value) {
    this.setProperty(MoneyLiteral.CURRENCY, value);
  }

  public String getAmount() {
    return this.getProperty(MoneyLiteral.AMOUNT);
  }

  public void setAmount(String value) {
    this.setProperty(MoneyLiteral.AMOUNT, value);
  }

}
