package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.xmlInternal.structure.Comment;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EntityLine extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.EntityLine";
  public static final String ENTITY_DECLARATION = "entityDeclaration";
  public static final String COMMENT = "comment";

  public EntityLine(SNode node) {
    super(node);
  }

  public EntityDeclaration getEntityDeclaration() {
    return (EntityDeclaration) this.getChild(EntityDeclaration.class, EntityLine.ENTITY_DECLARATION);
  }

  public void setEntityDeclaration(EntityDeclaration node) {
    super.setChild(EntityLine.ENTITY_DECLARATION, node);
  }

  public Comment getComment() {
    return (Comment) this.getChild(Comment.class, EntityLine.COMMENT);
  }

  public void setComment(Comment node) {
    super.setChild(EntityLine.COMMENT, node);
  }

  public static EntityLine newInstance(SModel sm, boolean init) {
    return (EntityLine) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.EntityLine", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EntityLine newInstance(SModel sm) {
    return EntityLine.newInstance(sm, false);
  }
}
