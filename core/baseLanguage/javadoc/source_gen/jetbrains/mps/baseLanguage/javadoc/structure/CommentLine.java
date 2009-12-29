package jetbrains.mps.baseLanguage.javadoc.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CommentLine extends BaseConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.javadoc.structure.CommentLine";
  public static final String PART = "part";

  public CommentLine(SNode node) {
    super(node);
  }

  public int getPartsCount() {
    return this.getChildCount(CommentLine.PART);
  }

  public Iterator<CommentLinePart> parts() {
    return this.children(CommentLinePart.class, CommentLine.PART);
  }

  public List<CommentLinePart> getParts() {
    return this.getChildren(CommentLinePart.class, CommentLine.PART);
  }

  public void addPart(CommentLinePart node) {
    this.addChild(CommentLine.PART, node);
  }

  public void insertPart(CommentLinePart prev, CommentLinePart node) {
    this.insertChild(prev, CommentLine.PART, node);
  }

  public static CommentLine newInstance(SModel sm, boolean init) {
    return (CommentLine) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.javadoc.structure.CommentLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CommentLine newInstance(SModel sm) {
    return CommentLine.newInstance(sm, false);
  }
}
