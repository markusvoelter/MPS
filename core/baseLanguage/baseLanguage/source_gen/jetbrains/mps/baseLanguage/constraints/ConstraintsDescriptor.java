package jetbrains.mps.baseLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;

public class ConstraintsDescriptor implements IModelConstraints {

  private List<IModelConstraints> myConstraints = new ArrayList<IModelConstraints>();

  public ConstraintsDescriptor() {
    this.myConstraints.add(new AnonymousClass_name_PropertyConstraint());
    this.myConstraints.add(new Classifier_nestedName_PropertyConstraint());
    this.myConstraints.add(new Classifier_resolveInfo_PropertyConstraint());
    this.myConstraints.add(new Classifier_shortDescription_PropertyConstraint());
    this.myConstraints.add(new Property_alias_PropertyConstraint());
    this.myConstraints.add(new Property_name_PropertyConstraint());
    this.myConstraints.add(new LocalVariableDeclaration_shortDescription_PropertyConstraint());
    this.myConstraints.add(new ConstructorDeclaration_name_PropertyConstraint());
    this.myConstraints.add(new ConstructorDeclaration_nestedName_PropertyConstraint());
    this.myConstraints.add(new ConstructorDeclaration_resolveInfo_PropertyConstraint());
    this.myConstraints.add(new ClassifierMember_shortDescription_PropertyConstraint());
    this.myConstraints.add(new IValidIdentifier_name_PropertyConstraint());
    this.myConstraints.add(new ClosureParameterReference_closureParameter_ReferentConstraint());
    this.myConstraints.add(new StaticMethodCall_staticMethodDeclaration_ReferentConstraint());
    this.myConstraints.add(new LocalVariableReference_localVariableDeclaration_ReferentConstraint());
    this.myConstraints.add(new ClassCreator_constructorDeclaration_ReferentConstraint());
    this.myConstraints.add(new TypeVariableReference_typeVariableDeclaration_ReferentConstraint());
    this.myConstraints.add(new ThisExpression_classConcept_ReferentConstraint());
    this.myConstraints.add(new SuperConstructorInvocation_constructorDeclaration_ReferentConstraint());
    this.myConstraints.add(new StaticFieldReference_staticFieldDeclaration_ReferentConstraint());
    this.myConstraints.add(new SuperMethodCall_instanceMethodDeclaration_ReferentConstraint());
    this.myConstraints.add(new ThisConstructorInvocation_constructorDeclaration_ReferentConstraint());
    this.myConstraints.add(new EnumConstantReference_enumConstantDeclaration_ReferentConstraint());
    this.myConstraints.add(new ParameterReference_parameterDeclaration_ReferentConstraint());
    this.myConstraints.add(new InstanceMethodCallOperation_instanceMethodDeclaration_ReferentConstraint());
    this.myConstraints.add(new AnnotationInstanceValue_key_ReferentConstraint());
    this.myConstraints.add(new LocalStaticFieldReference_staticFieldDeclaration_ReferentConstraint());
    this.myConstraints.add(new LocalStaticMethodCall_staticMethodDeclaration_ReferentConstraint());
    this.myConstraints.add(new PropertyReference_property_ReferentConstraint());
    this.myConstraints.add(new FieldReferenceOperation_fieldDeclaration_ReferentConstraint());
    this.myConstraints.add(new TupleMemberAccessOperation_member_ReferentConstraint());
    this.myConstraints.add(new VarVariableReference_declaration_ReferentConstraint());
    this.myConstraints.add(new TupleMember_declaration_ReferentConstraint());
    this.myConstraints.add(new Annotation_DefaultSearchScope());
    this.myConstraints.add(new Classifier_DefaultSearchScope());
    this.myConstraints.add(new Interface_DefaultSearchScope());
    this.myConstraints.add(new ClassConcept_DefaultSearchScope());
  }

  public void unRegisterSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.unRegisterSelf(p0);
    }
  }

  public void registerSelf(ModelConstraintsManager p0) {
    for(IModelConstraints c : this.myConstraints) {
      c.registerSelf(p0);
    }
  }

}
