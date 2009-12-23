package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbstractFollowingCommandList extends BaseConcept {
  public static final String concept = "jetbrains.mps.bash.structure.AbstractFollowingCommandList";

  public AbstractFollowingCommandList(SNode node) {
    super(node);
  }

  public static AbstractFollowingCommandList newInstance(SModel sm, boolean init) {
    return (AbstractFollowingCommandList) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.AbstractFollowingCommandList", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractFollowingCommandList newInstance(SModel sm) {
    return AbstractFollowingCommandList.newInstance(sm, false);
  }
}
