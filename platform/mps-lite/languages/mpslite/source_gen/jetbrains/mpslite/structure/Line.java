package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class Line extends BaseConcept {
  public static String LINE_PART = "linePart";

  public  Line(SNode node) {
    super(node);
  }

  public static Line newInstance(SModel sm, boolean init) {
    return (Line)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.Line", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Line newInstance(SModel sm) {
    return Line.newInstance(sm, false);
  }


  public int getLinePartsCount() {
    return this.getChildCount(Line.LINE_PART);
  }

  public Iterator<LinePart> lineParts() {
    return this.children(Line.LINE_PART);
  }

  public List<LinePart> getLineParts() {
    return this.getChildren(Line.LINE_PART);
  }

  public void addLinePart(LinePart node) {
    this.addChild(Line.LINE_PART, node);
  }

  public void insertLinePart(LinePart prev, LinePart node) {
    this.insertChild(prev, Line.LINE_PART, node);
  }

}
