package jetbrains.mps.debug.evaluation.proxies;

/*Generated by MPS */

import com.sun.jdi.ClassType;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ThreadReference;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.debug.evaluation.InvalidEvaluatedExpressionException;
import com.sun.jdi.Field;
import jetbrains.mps.debug.evaluation.EvaluationUtils;
import com.sun.jdi.Value;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.debug.evaluation.EvaluationException;
import com.sun.jdi.Method;
import com.sun.jdi.InvocationException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;

/*package*/ class ObjectValueProxy extends ValueProxy implements IObjectValueProxy {
  private ClassType myReferenceType;

  public ObjectValueProxy(ObjectReference v, ThreadReference threadReference) {
    super(v, threadReference);
    myReferenceType = (ClassType) v.referenceType();
  }

  @NotNull
  private ObjectReference getObjectValue() {
    return (ObjectReference) myValue;
  }

  @NotNull
  public IValueProxy getFieldValue(String fieldName) throws InvalidEvaluatedExpressionException {
    ObjectReference value = getObjectValue();
    Field f = EvaluationUtils.findField(myReferenceType, fieldName);
    Value result = value.getValue(f);
    return MirrorUtil.getInstance().getValueProxy(result, myThreadReference);
  }

  public List<IValueProxy> getFieldValues() {
    List<Field> fields = EvaluationUtils.findFields(myReferenceType);
    List<IValueProxy> fieldValues = new ArrayList<IValueProxy>();
    for (Field field : fields) {
      fieldValues.add(MirrorUtil.getInstance().getValueProxy(getObjectValue().getValue(field), myThreadReference));
    }
    return fieldValues;
  }

  @Override
  public IValueProxy invokeMethod(String name, String jniSignature, Object... args) throws EvaluationException {
    ClassType classType = myReferenceType;
    int options = 0;
    return invoke(name, jniSignature, classType, options, args);
  }

  @Override
  public IValueProxy invokeSuperMethod(String name, String jniSignature, Object... args) throws EvaluationException {
    ClassType classType = myReferenceType;
    ClassType superclass = classType.superclass();
    if (superclass == null) {
      throw new InvalidEvaluatedExpressionException("Can't invoke super method: class " + classType.name() + " has no superclasses.");
    }
    int options = ObjectReference.INVOKE_NONVIRTUAL;
    return invoke(name, jniSignature, superclass, options, args);
  }

  @Override
  public boolean isInstanceOf(String typename) throws EvaluationException {
    return EvaluationUtils.isInstanceOf(myReferenceType, typename, myThreadReference.virtualMachine());
  }

  protected IValueProxy invoke(String name, String jniSignature, ClassType classType, final int options, Object[] args) throws EvaluationException {
    // TODO merge with Evaluator methods invocation 
    final Method method = classType.concreteMethodByName(name, jniSignature);
    if (method == null) {
      throw new InvalidEvaluatedExpressionException("Concrete method " + name + " with signature " + jniSignature + " not found in " + classType + ".");
    }
    final List<Value> argValues = MirrorUtil.getInstance().getValues(myThreadReference, args);
    return EvaluationUtils.handleInvocationExceptions(new EvaluationUtils.ThreadInvocatable<IValueProxy>(myThreadReference) {
      @Override
      public IValueProxy invoke() throws InvocationException, InvalidTypeException, ClassNotLoadedException, IncompatibleThreadStateException {
        Value result = getObjectValue().invokeMethod(myThreadReference, method, argValues, options);
        return MirrorUtil.getInstance().getValueProxy(result, myThreadReference);
      }
    });
  }

  @Override
  public boolean javaEquals(IValueProxy proxy) {
    return myValue.equals(proxy.getJDIValue());
  }
}
