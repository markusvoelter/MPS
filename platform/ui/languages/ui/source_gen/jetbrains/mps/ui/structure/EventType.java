package jetbrains.mps.ui.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ui.modeling.structure.Event;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EventType extends Type {
  public static final String concept = "jetbrains.mps.ui.structure.EventType";
  public static final String EVENT = "event";

  public EventType(SNode node) {
    super(node);
  }

  public Event getEvent() {
    return (Event) this.getReferent(Event.class, EventType.EVENT);
  }

  public void setEvent(Event node) {
    super.setReferent(EventType.EVENT, node);
  }

  public static EventType newInstance(SModel sm, boolean init) {
    return (EventType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.structure.EventType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EventType newInstance(SModel sm) {
    return EventType.newInstance(sm, false);
  }
}
