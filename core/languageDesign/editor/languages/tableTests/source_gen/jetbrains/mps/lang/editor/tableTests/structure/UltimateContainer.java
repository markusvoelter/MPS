package jetbrains.mps.lang.editor.tableTests.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UltimateContainer extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.editor.tableTests.structure.UltimateContainer";
  public static final String STATE_MACHINES = "stateMachines";
  public static final String TABLES = "tables";
  public static final String MATRIXES = "matrixes";

  public UltimateContainer(SNode node) {
    super(node);
  }

  public int getStateMachinesesCount() {
    return this.getChildCount(UltimateContainer.STATE_MACHINES);
  }

  public Iterator<StateMachine> stateMachineses() {
    return this.children(StateMachine.class, UltimateContainer.STATE_MACHINES);
  }

  public List<StateMachine> getStateMachineses() {
    return this.getChildren(StateMachine.class, UltimateContainer.STATE_MACHINES);
  }

  public void addStateMachines(StateMachine node) {
    this.addChild(UltimateContainer.STATE_MACHINES, node);
  }

  public void insertStateMachines(StateMachine prev, StateMachine node) {
    this.insertChild(prev, UltimateContainer.STATE_MACHINES, node);
  }

  public int getTablesesCount() {
    return this.getChildCount(UltimateContainer.TABLES);
  }

  public Iterator<Table> tableses() {
    return this.children(Table.class, UltimateContainer.TABLES);
  }

  public List<Table> getTableses() {
    return this.getChildren(Table.class, UltimateContainer.TABLES);
  }

  public void addTables(Table node) {
    this.addChild(UltimateContainer.TABLES, node);
  }

  public void insertTables(Table prev, Table node) {
    this.insertChild(prev, UltimateContainer.TABLES, node);
  }

  public int getMatrixesesCount() {
    return this.getChildCount(UltimateContainer.MATRIXES);
  }

  public Iterator<Matrix> matrixeses() {
    return this.children(Matrix.class, UltimateContainer.MATRIXES);
  }

  public List<Matrix> getMatrixeses() {
    return this.getChildren(Matrix.class, UltimateContainer.MATRIXES);
  }

  public void addMatrixes(Matrix node) {
    this.addChild(UltimateContainer.MATRIXES, node);
  }

  public void insertMatrixes(Matrix prev, Matrix node) {
    this.insertChild(prev, UltimateContainer.MATRIXES, node);
  }

  public static UltimateContainer newInstance(SModel sm, boolean init) {
    return (UltimateContainer) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.tableTests.structure.UltimateContainer", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UltimateContainer newInstance(SModel sm) {
    return UltimateContainer.newInstance(sm, false);
  }
}
