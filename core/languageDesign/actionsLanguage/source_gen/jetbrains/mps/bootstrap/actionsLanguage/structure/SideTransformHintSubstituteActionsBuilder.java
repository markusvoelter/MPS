package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SideTransformHintSubstituteActionsBuilder extends BaseConcept {
  public static final String concept = "jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformHintSubstituteActionsBuilder";
  public static String DESCRIPTION = "description";
  public static String TRANSFORM_TAG = "transformTag";
  public static String SIDE = "side";
  public static String APPLICABLE_CONCEPT = "applicableConcept";
  public static String PRECONDITION = "precondition";
  public static String COMMON_INITIALIZER = "commonInitializer";
  public static String PART = "part";
  public static String VARIABLE = "variable";

  public SideTransformHintSubstituteActionsBuilder(SNode node) {
    super(node);
  }

  public String getDescription() {
    return this.getProperty(SideTransformHintSubstituteActionsBuilder.DESCRIPTION);
  }

  public void setDescription(String value) {
    this.setProperty(SideTransformHintSubstituteActionsBuilder.DESCRIPTION, value);
  }

  public SideTransformTag getTransformTag() {
    String value = super.getProperty(SideTransformHintSubstituteActionsBuilder.TRANSFORM_TAG);
    return SideTransformTag.parseValue(value);
  }

  public void setTransformTag(SideTransformTag value) {
    super.setProperty(SideTransformHintSubstituteActionsBuilder.TRANSFORM_TAG, value.getValueAsString());
  }

  public Side getSide() {
    String value = super.getProperty(SideTransformHintSubstituteActionsBuilder.SIDE);
    return Side.parseValue(value);
  }

  public void setSide(Side value) {
    super.setProperty(SideTransformHintSubstituteActionsBuilder.SIDE, value.getValueAsString());
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration)this.getReferent(SideTransformHintSubstituteActionsBuilder.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(SideTransformHintSubstituteActionsBuilder.APPLICABLE_CONCEPT, node);
  }

  public SideTransformHintSubstitutePreconditionFunction getPrecondition() {
    return (SideTransformHintSubstitutePreconditionFunction)this.getChild(SideTransformHintSubstituteActionsBuilder.PRECONDITION);
  }

  public void setPrecondition(SideTransformHintSubstitutePreconditionFunction node) {
    super.setChild(SideTransformHintSubstituteActionsBuilder.PRECONDITION, node);
  }

  public QueryFunction_ST_CommonInitializer getCommonInitializer() {
    return (QueryFunction_ST_CommonInitializer)this.getChild(SideTransformHintSubstituteActionsBuilder.COMMON_INITIALIZER);
  }

  public void setCommonInitializer(QueryFunction_ST_CommonInitializer node) {
    super.setChild(SideTransformHintSubstituteActionsBuilder.COMMON_INITIALIZER, node);
  }

  public int getPartsCount() {
    return this.getChildCount(SideTransformHintSubstituteActionsBuilder.PART);
  }

  public Iterator<MenuBuilderPart> parts() {
    return this.children(SideTransformHintSubstituteActionsBuilder.PART);
  }

  public List<MenuBuilderPart> getParts() {
    return this.getChildren(SideTransformHintSubstituteActionsBuilder.PART);
  }

  public void addPart(MenuBuilderPart node) {
    this.addChild(SideTransformHintSubstituteActionsBuilder.PART, node);
  }

  public void insertPart(MenuBuilderPart prev, MenuBuilderPart node) {
    this.insertChild(prev, SideTransformHintSubstituteActionsBuilder.PART, node);
  }

  public int getVariablesCount() {
    return this.getChildCount(SideTransformHintSubstituteActionsBuilder.VARIABLE);
  }

  public Iterator<SideTransformVariableDeclaration> variables() {
    return this.children(SideTransformHintSubstituteActionsBuilder.VARIABLE);
  }

  public List<SideTransformVariableDeclaration> getVariables() {
    return this.getChildren(SideTransformHintSubstituteActionsBuilder.VARIABLE);
  }

  public void addVariable(SideTransformVariableDeclaration node) {
    this.addChild(SideTransformHintSubstituteActionsBuilder.VARIABLE, node);
  }

  public void insertVariable(SideTransformVariableDeclaration prev, SideTransformVariableDeclaration node) {
    this.insertChild(prev, SideTransformHintSubstituteActionsBuilder.VARIABLE, node);
  }


  public static SideTransformHintSubstituteActionsBuilder newInstance(SModel sm, boolean init) {
    return (SideTransformHintSubstituteActionsBuilder)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.structure.SideTransformHintSubstituteActionsBuilder", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SideTransformHintSubstituteActionsBuilder newInstance(SModel sm) {
    return SideTransformHintSubstituteActionsBuilder.newInstance(sm, false);
  }

}
