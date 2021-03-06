package jetbrains.mps.baseLanguage.collections.samples.java_collections;

/*Generated by MPS */

import java.util.LinkedList;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.Sequence;

/*package*/ class Main_javaIterable_as_sequence {
  /*package*/ static void main(String[] args) {
    Iterable<Integer> javaIterable = new LinkedList<Integer>();
    for (int i = 0; i < 5; i++) {
      ((List<Integer>) javaIterable).add(i);
    }
    System.out.println("java-iterable as sequence");
    Iterable<Integer> sequence = javaIterable;
    for (Integer n : Sequence.fromIterable(sequence)) {
      System.out.println(n);
    }
  }
}
