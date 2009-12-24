package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.xmlInternal.structure.Comment;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EntityBlock extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.EntityBlock";
  public static final String COMMENT = "comment";
  public static final String ENTITY_LINE = "entityLine";

  public EntityBlock(SNode node) {
    super(node);
  }

  public Comment getComment() {
    return (Comment) this.getChild(Comment.class, EntityBlock.COMMENT);
  }

  public void setComment(Comment node) {
    super.setChild(EntityBlock.COMMENT, node);
  }

  public int getEntityLinesCount() {
    return this.getChildCount(EntityBlock.ENTITY_LINE);
  }

  public Iterator<EntityLine> entityLines() {
    return this.children(EntityLine.class, EntityBlock.ENTITY_LINE);
  }

  public List<EntityLine> getEntityLines() {
    return this.getChildren(EntityLine.class, EntityBlock.ENTITY_LINE);
  }

  public void addEntityLine(EntityLine node) {
    this.addChild(EntityBlock.ENTITY_LINE, node);
  }

  public void insertEntityLine(EntityLine prev, EntityLine node) {
    this.insertChild(prev, EntityBlock.ENTITY_LINE, node);
  }

  public static EntityBlock newInstance(SModel sm, boolean init) {
    return (EntityBlock) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.EntityBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EntityBlock newInstance(SModel sm) {
    return EntityBlock.newInstance(sm, false);
  }
}
