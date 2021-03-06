package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArgumentListReference extends ExternalOptionReference {
  public static final String concept = "jetbrains.mps.bash.structure.ArgumentListReference";
  public static final String WORDS = "words";

  public ArgumentListReference(SNode node) {
    super(node);
  }

  public int getWordsesCount() {
    return this.getChildCount(ArgumentListReference.WORDS);
  }

  public Iterator<GeneralizedWord> wordses() {
    return this.children(GeneralizedWord.class, ArgumentListReference.WORDS);
  }

  public List<GeneralizedWord> getWordses() {
    return this.getChildren(GeneralizedWord.class, ArgumentListReference.WORDS);
  }

  public void addWords(GeneralizedWord node) {
    this.addChild(ArgumentListReference.WORDS, node);
  }

  public void insertWords(GeneralizedWord prev, GeneralizedWord node) {
    this.insertChild(prev, ArgumentListReference.WORDS, node);
  }

  public static ArgumentListReference newInstance(SModel sm, boolean init) {
    return (ArgumentListReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ArgumentListReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArgumentListReference newInstance(SModel sm) {
    return ArgumentListReference.newInstance(sm, false);
  }
}
