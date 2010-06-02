package jetbrains.mps.ui.plugin;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.LinkedList;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.smodel.Language;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class Variants {
  private static List<_FunctionTypes._void_P1_E0<? super Variants>> REGS = ListSequence.fromList(new LinkedList<_FunctionTypes._void_P1_E0<? super Variants>>());
  private static Variants INSTANCE = null;
  private static boolean DISPOSED = false;

  private List<Tuples._2<String, Language>> variantLanguages = ListSequence.fromList(new ArrayList<Tuples._2<String, Language>>());

  /*package*/ Variants() {
    synchronized (Variants.class) {
      INSTANCE = this;
    }
  }

  public void addVariant(String var, Language lang) {
    ListSequence.fromList(variantLanguages).addElement(MultiTuple.<String,Language>from(var, lang));
  }

  private void runRegistrations(List<_FunctionTypes._void_P1_E0<? super Variants>> regs) {
    while (ListSequence.fromList(regs).isNotEmpty()) {
      ListSequence.fromList(regs).removeElementAt(0).invoke(this);
    }
  }

  /*package*/ void init() {
    synchronized (Variants.class) {
      runRegistrations(REGS);
    }
  }

  /*package*/ void dispose() {
    ListSequence.fromList(variantLanguages).clear();
    synchronized (Variants.class) {
      INSTANCE = null;
    }
  }

  public static Iterable<String> availableVariants() {
    return ListSequence.fromList(getInstance().variantLanguages).select(new ISelector<Tuples._2<String, Language>, String>() {
      public String select(Tuples._2<String, Language> t) {
        return t._0();
      }
    });
  }

  public static Language languageToGenerate(final String variant) {
    return ListSequence.fromList(getInstance().variantLanguages).findFirst(new IWhereFilter<Tuples._2<String, Language>>() {
      public boolean accept(Tuples._2<String, Language> t) {
        return t._0().equals(variant);
      }
    })._1();
  }

  public static void register(_FunctionTypes._void_P1_E0<? super Variants> regBlock) {
    ListSequence.fromList(REGS).addElement(regBlock);
    synchronized (Variants.class) {
      if (INSTANCE != null) {
        INSTANCE.runRegistrations(REGS);
      }
    }
  }

  /*package*/ static Variants getInstance() {
    if (INSTANCE == null) {
      throw new IllegalStateException("Not initialized");
    }
    return INSTANCE;
  }

  /*package*/ static boolean isInitialized() {
    return INSTANCE != null;
  }
}
