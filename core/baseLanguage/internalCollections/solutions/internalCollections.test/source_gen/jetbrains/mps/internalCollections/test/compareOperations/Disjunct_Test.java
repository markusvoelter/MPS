package jetbrains.mps.internalCollections.test.compareOperations;

/*Generated by MPS */

import jetbrains.mps.internalCollections.test.closures.Util_Test;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Arrays;

public class Disjunct_Test extends Util_Test {

  public void test_disjunctionMethod() throws Exception {
    Sequence<Integer> input = Sequence.fromArray(1, 2, 3, 3, 3);
    Sequence<Integer> test = input.disjunction(Sequence.fromArray(1, 2, 2, 3, 3, 4));
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(2, 3, 4), test);
  }

  public void test_discjunctOperation() throws Exception {
    Iterable<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4);
    Iterable<Integer> test = Sequence.fromIterable(input).disjunction(Sequence.fromIterable(Arrays.asList(1, 2, 4, 4, 5)));
    this.assertIterableEqualsIgnoreOrder(Arrays.asList(2, 3, 5), test);
  }

  public void test_disjunctionEquivalence() throws Exception {
    Iterable<String> a = Arrays.asList("X", "W", "Z", "Y", "X", "Z", "X", "Y", "W");
    Iterable<String> b = Arrays.asList("V", "X", "V", "Z", "Z", "Z", "Y");
    this.assertIterableEqualsIgnoreOrder(Sequence.fromIterable(a).disjunction(Sequence.fromIterable(b)), Sequence.fromIterable(a).union(Sequence.fromIterable(b)).substract(Sequence.fromIterable(a).intersect(Sequence.fromIterable(b))));
    this.assertIterableEqualsIgnoreOrder(Sequence.fromIterable(a).disjunction(Sequence.fromIterable(b)), Sequence.fromIterable(a).substract(Sequence.fromIterable(b)).union(Sequence.fromIterable(b).substract(Sequence.fromIterable(a))));
  }

}
