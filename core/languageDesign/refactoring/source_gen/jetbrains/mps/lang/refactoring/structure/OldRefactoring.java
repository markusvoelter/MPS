package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.editor.structure.CellKeyMapKeystroke;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.lang.core.structure.Attribute;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OldRefactoring extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.OldRefactoring";
  public static final String USER_FRIENDLY_NAME = "userFriendlyName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ONE_TARGET_ONLY = "oneTargetOnly";
  public static final String REFACTOR_IMMEDIATELY_IF_NO_USAGES = "refactorImmediatelyIfNoUsages";
  public static final String REFACTORING_TARGET_KIND = "refactoringTargetKind";
  public static final String APPLICABLE_CONCEPT = "applicableConcept";
  public static final String OVERRIDES = "overrides";
  public static final String KEYSTROKE = "keystroke";
  public static final String IS_APPLICABLE_CLAUSE = "isApplicableClause";
  public static final String IS_APPLICABLE_TO_MODEL_CLAUSE = "isApplicableToModelClause";
  public static final String AFFECTED_NODES_CLAUSE = "affectedNodesClause";
  public static final String DO_REFACTOR_CLAUSE = "doRefactorClause";
  public static final String GET_MODELS_TO_GENERATE_CLAUSE = "getModelsToGenerateClause";
  public static final String GET_MODELS_TO_UPDATE_CLAUSE = "getModelsToUpdateClause";
  public static final String NODES_TO_OPEN_CLAUSE = "nodesToOpenClause";
  public static final String UPDATE_MODEL_CLAUSE = "updateModelClause";
  public static final String ARGUMENTS = "arguments";
  public static final String INTERNAL_ARGUMENTS = "internalArguments";
  public static final String _$ATTRIBUTE = "_$attribute";

  public OldRefactoring(SNode node) {
    super(node);
  }

  public String getUserFriendlyName() {
    return this.getProperty(OldRefactoring.USER_FRIENDLY_NAME);
  }

  public void setUserFriendlyName(String value) {
    this.setProperty(OldRefactoring.USER_FRIENDLY_NAME, value);
  }

  public String getName() {
    return this.getProperty(OldRefactoring.NAME);
  }

  public void setName(String value) {
    this.setProperty(OldRefactoring.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(OldRefactoring.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(OldRefactoring.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(OldRefactoring.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(OldRefactoring.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(OldRefactoring.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(OldRefactoring.VIRTUAL_PACKAGE, value);
  }

  public boolean getOneTargetOnly() {
    return this.getBooleanProperty(OldRefactoring.ONE_TARGET_ONLY);
  }

  public void setOneTargetOnly(boolean value) {
    this.setBooleanProperty(OldRefactoring.ONE_TARGET_ONLY, value);
  }

  public boolean getRefactorImmediatelyIfNoUsages() {
    return this.getBooleanProperty(OldRefactoring.REFACTOR_IMMEDIATELY_IF_NO_USAGES);
  }

  public void setRefactorImmediatelyIfNoUsages(boolean value) {
    this.setBooleanProperty(OldRefactoring.REFACTOR_IMMEDIATELY_IF_NO_USAGES, value);
  }

  public RefactoringTargetKind_Enum getRefactoringTargetKind() {
    String value = super.getProperty(OldRefactoring.REFACTORING_TARGET_KIND);
    return RefactoringTargetKind_Enum.parseValue(value);
  }

  public void setRefactoringTargetKind(RefactoringTargetKind_Enum value) {
    super.setProperty(OldRefactoring.REFACTORING_TARGET_KIND, value.getValueAsString());
  }

  public AbstractConceptDeclaration getApplicableConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, OldRefactoring.APPLICABLE_CONCEPT);
  }

  public void setApplicableConcept(AbstractConceptDeclaration node) {
    super.setReferent(OldRefactoring.APPLICABLE_CONCEPT, node);
  }

  public OldRefactoring getOverrides() {
    return (OldRefactoring) this.getReferent(OldRefactoring.class, OldRefactoring.OVERRIDES);
  }

  public void setOverrides(OldRefactoring node) {
    super.setReferent(OldRefactoring.OVERRIDES, node);
  }

  public CellKeyMapKeystroke getKeystroke() {
    return (CellKeyMapKeystroke) this.getChild(CellKeyMapKeystroke.class, OldRefactoring.KEYSTROKE);
  }

  public void setKeystroke(CellKeyMapKeystroke node) {
    super.setChild(OldRefactoring.KEYSTROKE, node);
  }

  public IsApplicableClause getIsApplicableClause() {
    return (IsApplicableClause) this.getChild(IsApplicableClause.class, OldRefactoring.IS_APPLICABLE_CLAUSE);
  }

  public void setIsApplicableClause(IsApplicableClause node) {
    super.setChild(OldRefactoring.IS_APPLICABLE_CLAUSE, node);
  }

  public IsApplicableToModelClause getIsApplicableToModelClause() {
    return (IsApplicableToModelClause) this.getChild(IsApplicableToModelClause.class, OldRefactoring.IS_APPLICABLE_TO_MODEL_CLAUSE);
  }

  public void setIsApplicableToModelClause(IsApplicableToModelClause node) {
    super.setChild(OldRefactoring.IS_APPLICABLE_TO_MODEL_CLAUSE, node);
  }

  public AffectedNodesClause getAffectedNodesClause() {
    return (AffectedNodesClause) this.getChild(AffectedNodesClause.class, OldRefactoring.AFFECTED_NODES_CLAUSE);
  }

  public void setAffectedNodesClause(AffectedNodesClause node) {
    super.setChild(OldRefactoring.AFFECTED_NODES_CLAUSE, node);
  }

  public DoRefactorClause getDoRefactorClause() {
    return (DoRefactorClause) this.getChild(DoRefactorClause.class, OldRefactoring.DO_REFACTOR_CLAUSE);
  }

  public void setDoRefactorClause(DoRefactorClause node) {
    super.setChild(OldRefactoring.DO_REFACTOR_CLAUSE, node);
  }

  public GetModelsToGenerateClause getGetModelsToGenerateClause() {
    return (GetModelsToGenerateClause) this.getChild(GetModelsToGenerateClause.class, OldRefactoring.GET_MODELS_TO_GENERATE_CLAUSE);
  }

  public void setGetModelsToGenerateClause(GetModelsToGenerateClause node) {
    super.setChild(OldRefactoring.GET_MODELS_TO_GENERATE_CLAUSE, node);
  }

  public GetModelsToUpdateClause getGetModelsToUpdateClause() {
    return (GetModelsToUpdateClause) this.getChild(GetModelsToUpdateClause.class, OldRefactoring.GET_MODELS_TO_UPDATE_CLAUSE);
  }

  public void setGetModelsToUpdateClause(GetModelsToUpdateClause node) {
    super.setChild(OldRefactoring.GET_MODELS_TO_UPDATE_CLAUSE, node);
  }

  public NodesToOpenClause getNodesToOpenClause() {
    return (NodesToOpenClause) this.getChild(NodesToOpenClause.class, OldRefactoring.NODES_TO_OPEN_CLAUSE);
  }

  public void setNodesToOpenClause(NodesToOpenClause node) {
    super.setChild(OldRefactoring.NODES_TO_OPEN_CLAUSE, node);
  }

  public UpdateModelClause getUpdateModelClause() {
    return (UpdateModelClause) this.getChild(UpdateModelClause.class, OldRefactoring.UPDATE_MODEL_CLAUSE);
  }

  public void setUpdateModelClause(UpdateModelClause node) {
    super.setChild(OldRefactoring.UPDATE_MODEL_CLAUSE, node);
  }

  public int getArgumentsesCount() {
    return this.getChildCount(OldRefactoring.ARGUMENTS);
  }

  public Iterator<RequiredUserEnteredArgument> argumentses() {
    return this.children(RequiredUserEnteredArgument.class, OldRefactoring.ARGUMENTS);
  }

  public List<RequiredUserEnteredArgument> getArgumentses() {
    return this.getChildren(RequiredUserEnteredArgument.class, OldRefactoring.ARGUMENTS);
  }

  public void addArguments(RequiredUserEnteredArgument node) {
    this.addChild(OldRefactoring.ARGUMENTS, node);
  }

  public void insertArguments(RequiredUserEnteredArgument prev, RequiredUserEnteredArgument node) {
    this.insertChild(prev, OldRefactoring.ARGUMENTS, node);
  }

  public int getInternalArgumentsesCount() {
    return this.getChildCount(OldRefactoring.INTERNAL_ARGUMENTS);
  }

  public Iterator<RequiredAdditionalArgument> internalArgumentses() {
    return this.children(RequiredAdditionalArgument.class, OldRefactoring.INTERNAL_ARGUMENTS);
  }

  public List<RequiredAdditionalArgument> getInternalArgumentses() {
    return this.getChildren(RequiredAdditionalArgument.class, OldRefactoring.INTERNAL_ARGUMENTS);
  }

  public void addInternalArguments(RequiredAdditionalArgument node) {
    this.addChild(OldRefactoring.INTERNAL_ARGUMENTS, node);
  }

  public void insertInternalArguments(RequiredAdditionalArgument prev, RequiredAdditionalArgument node) {
    this.insertChild(prev, OldRefactoring.INTERNAL_ARGUMENTS, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(OldRefactoring._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, OldRefactoring._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, OldRefactoring._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(OldRefactoring._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, OldRefactoring._$ATTRIBUTE, node);
  }

  public static OldRefactoring newInstance(SModel sm, boolean init) {
    return (OldRefactoring) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.OldRefactoring", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OldRefactoring newInstance(SModel sm) {
    return OldRefactoring.newInstance(sm, false);
  }
}
