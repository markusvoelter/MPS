package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FontSizeStyleClassItem extends StyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.FontSizeStyleClassItem";
  public static final String VALUE = "value";
  public static final String QUERY = "query";

  public FontSizeStyleClassItem(SNode node) {
    super(node);
  }

  public int getValue() {
    return this.getIntegerProperty(FontSizeStyleClassItem.VALUE);
  }

  public void setValue(int value) {
    this.setIntegerProperty(FontSizeStyleClassItem.VALUE, value);
  }

  public QueryFunction_Integer getQuery() {
    return (QueryFunction_Integer) this.getChild(QueryFunction_Integer.class, FontSizeStyleClassItem.QUERY);
  }

  public void setQuery(QueryFunction_Integer node) {
    super.setChild(FontSizeStyleClassItem.QUERY, node);
  }

  public static FontSizeStyleClassItem newInstance(SModel sm, boolean init) {
    return (FontSizeStyleClassItem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.FontSizeStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FontSizeStyleClassItem newInstance(SModel sm) {
    return FontSizeStyleClassItem.newInstance(sm, false);
  }
}
