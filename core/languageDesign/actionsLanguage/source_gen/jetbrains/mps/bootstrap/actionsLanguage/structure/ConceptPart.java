package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import java.util.List;

public class ConceptPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptPart";
  public static String CONCEPT = "concept";
  public static String PART = "part";

  public ConceptPart(SNode node) {
    super(node);
  }

  public static ConceptPart newInstance(SModel sm, boolean init) {
    return (ConceptPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.ConceptPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptPart newInstance(SModel sm) {
    return ConceptPart.newInstance(sm, false);
  }


  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(ConceptPart.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(ConceptPart.CONCEPT, node);
  }

  public int getPartsCount() {
    return this.getChildCount(ConceptPart.PART);
  }

  public Iterator<MenuPart> parts() {
    return this.children(ConceptPart.PART);
  }

  public List<MenuPart> getParts() {
    return this.getChildren(ConceptPart.PART);
  }

  public void addPart(MenuPart node) {
    this.addChild(ConceptPart.PART, node);
  }

  public void insertPart(MenuPart prev, MenuPart node) {
    this.insertChild(prev, ConceptPart.PART, node);
  }

}
