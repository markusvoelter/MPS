package jetbrains.mps.make.facet.plugin;

/*Generated by MPS */

import jetbrains.mps.make.script.IQuery;
import jetbrains.mps.internal.collections.runtime.Sequence;

public class SaveTransientModels_Query implements IQuery<SaveTransient_Option> {
  private IQuery.Name name = new IQuery.Name("SaveTransientModels");

  public SaveTransientModels_Query() {
  }

  public IQuery.Name getName() {
    return name;
  }

  public String getText() {
    return "Save transient models?";
  }

  public Iterable<SaveTransient_Option> options() {
    return Sequence.fromIterable(Sequence.fromArray(SaveTransient_Option.class.getEnumConstants())).cut(1);
  }

  public SaveTransient_Option voidOption() {
    return Sequence.fromIterable(Sequence.fromArray(SaveTransient_Option.class.getEnumConstants())).last();
  }
}
