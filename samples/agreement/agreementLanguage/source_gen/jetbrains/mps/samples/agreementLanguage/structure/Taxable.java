package jetbrains.mps.samples.agreementLanguage.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;

public enum Taxable {
  taxable("TAXABLE", true),
  tax_free("TAXFREE", false);

  private String myName;
  private boolean myValue;

  Taxable(String name, boolean value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return "" + this.myValue;
  }

  public boolean getValue() {
    return this.myValue;
  }


  public static List<Taxable> getConstants() {
    List<Taxable> list = ListSequence.fromList(new LinkedList<Taxable>());
    ListSequence.fromList(list).addElement(Taxable.taxable);
    ListSequence.fromList(list).addElement(Taxable.tax_free);
    return list;
  }

  public static Taxable getDefault() {
    return Taxable.taxable;
  }

  public static Taxable parseValue(String value) {
    if (value == null) {
      return Taxable.getDefault();
    }
    if (value.equals(Taxable.taxable.getValueAsString())) {
      return Taxable.taxable;
    }
    if (value.equals(Taxable.tax_free.getValueAsString())) {
      return Taxable.tax_free;
    }
    return Taxable.getDefault();
  }

}
