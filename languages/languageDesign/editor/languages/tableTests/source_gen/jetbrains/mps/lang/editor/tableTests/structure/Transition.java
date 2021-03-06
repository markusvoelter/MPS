package jetbrains.mps.lang.editor.tableTests.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Transition extends AbstractStateMachineElement {
  public static final String concept = "jetbrains.mps.lang.editor.tableTests.structure.Transition";
  public static final String CONDITION = "condition";
  public static final String FROM_STATE = "fromState";
  public static final String TO_STATE = "toState";
  public static final String TRIGGER = "trigger";

  public Transition(SNode node) {
    super(node);
  }

  public String getCondition() {
    return this.getProperty(Transition.CONDITION);
  }

  public void setCondition(String value) {
    this.setProperty(Transition.CONDITION, value);
  }

  public StateReference getFromState() {
    return (StateReference) this.getChild(StateReference.class, Transition.FROM_STATE);
  }

  public void setFromState(StateReference node) {
    super.setChild(Transition.FROM_STATE, node);
  }

  public StateReference getToState() {
    return (StateReference) this.getChild(StateReference.class, Transition.TO_STATE);
  }

  public void setToState(StateReference node) {
    super.setChild(Transition.TO_STATE, node);
  }

  public EventReference getTrigger() {
    return (EventReference) this.getChild(EventReference.class, Transition.TRIGGER);
  }

  public void setTrigger(EventReference node) {
    super.setChild(Transition.TRIGGER, node);
  }

  public static Transition newInstance(SModel sm, boolean init) {
    return (Transition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.tableTests.structure.Transition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Transition newInstance(SModel sm) {
    return Transition.newInstance(sm, false);
  }
}
