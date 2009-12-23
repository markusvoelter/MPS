package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class WordExpression extends ArithmeticExpression {
  public static final String concept = "jetbrains.mps.bash.structure.WordExpression";
  public static final String CPR_Sign = "sign";
  public static final String WORD = "word";

  public WordExpression(SNode node) {
    super(node);
  }

  public GeneralizedWord getWord() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, WordExpression.WORD);
  }

  public void setWord(GeneralizedWord node) {
    super.setChild(WordExpression.WORD, node);
  }

  public static WordExpression newInstance(SModel sm, boolean init) {
    return (WordExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.WordExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static WordExpression newInstance(SModel sm) {
    return WordExpression.newInstance(sm, false);
  }
}
