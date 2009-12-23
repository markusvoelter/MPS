package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class HereDocumentRedirection extends Redirection {
  public static final String concept = "jetbrains.mps.bash.structure.HereDocumentRedirection";
  public static final String STRIPTABS = "striptabs";
  public static final String WORD = "word";
  public static final String HEREDOCUMENT = "heredocument";
  public static final String DELIMITER = "delimiter";

  public HereDocumentRedirection(SNode node) {
    super(node);
  }

  public boolean getStriptabs() {
    return this.getBooleanProperty(HereDocumentRedirection.STRIPTABS);
  }

  public void setStriptabs(boolean value) {
    this.setBooleanProperty(HereDocumentRedirection.STRIPTABS, value);
  }

  public SimpleWord getWord() {
    return (SimpleWord) this.getChild(SimpleWord.class, HereDocumentRedirection.WORD);
  }

  public void setWord(SimpleWord node) {
    super.setChild(HereDocumentRedirection.WORD, node);
  }

  public GeneralizedWord getHeredocument() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, HereDocumentRedirection.HEREDOCUMENT);
  }

  public void setHeredocument(GeneralizedWord node) {
    super.setChild(HereDocumentRedirection.HEREDOCUMENT, node);
  }

  public SimpleWord getDelimiter() {
    return (SimpleWord) this.getChild(SimpleWord.class, HereDocumentRedirection.DELIMITER);
  }

  public void setDelimiter(SimpleWord node) {
    super.setChild(HereDocumentRedirection.DELIMITER, node);
  }

  public static HereDocumentRedirection newInstance(SModel sm, boolean init) {
    return (HereDocumentRedirection) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.HereDocumentRedirection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static HereDocumentRedirection newInstance(SModel sm) {
    return HereDocumentRedirection.newInstance(sm, false);
  }
}
