package jetbrains.mps.make.sandbox.sample;

/*Generated by MPS */

import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class DOH_Query implements IQuery<what_Option> {
  private IQuery.Name name = new IQuery.Name("DOH");

  public DOH_Query() {
  }

  public IQuery.Name getName() {
    return name;
  }

  public String getText() {
    return "Whoops...";
  }

  public Iterable<what_Option> options() {
    return Sequence.fromArray(what_Option.class.getEnumConstants());
  }
}
