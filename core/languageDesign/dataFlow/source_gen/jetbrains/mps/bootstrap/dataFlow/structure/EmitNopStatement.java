package jetbrains.mps.bootstrap.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EmitNopStatement extends EmitStatement {
  public static final String concept = "jetbrains.mps.bootstrap.dataFlow.structure.EmitNopStatement";

  public  EmitNopStatement(SNode node) {
    super(node);
  }

  public static EmitNopStatement newInstance(SModel sm, boolean init) {
    return (EmitNopStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.dataFlow.structure.EmitNopStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EmitNopStatement newInstance(SModel sm) {
    return EmitNopStatement.newInstance(sm, false);
  }

}
