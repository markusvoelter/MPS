package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CaseCommand extends AbstractCommand implements ICompoundCommand {
  public static final String concept = "jetbrains.mps.bash.structure.CaseCommand";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String WORD = "word";
  public static final String CLAUSES = "clauses";

  public CaseCommand(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CaseCommand.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CaseCommand.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CaseCommand.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CaseCommand.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CaseCommand.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CaseCommand.VIRTUAL_PACKAGE, value);
  }

  public GeneralizedWord getWord() {
    return (GeneralizedWord) this.getChild(GeneralizedWord.class, CaseCommand.WORD);
  }

  public void setWord(GeneralizedWord node) {
    super.setChild(CaseCommand.WORD, node);
  }

  public int getClausesesCount() {
    return this.getChildCount(CaseCommand.CLAUSES);
  }

  public Iterator<CaseClause> clauseses() {
    return this.children(CaseClause.class, CaseCommand.CLAUSES);
  }

  public List<CaseClause> getClauseses() {
    return this.getChildren(CaseClause.class, CaseCommand.CLAUSES);
  }

  public void addClauses(CaseClause node) {
    this.addChild(CaseCommand.CLAUSES, node);
  }

  public void insertClauses(CaseClause prev, CaseClause node) {
    this.insertChild(prev, CaseCommand.CLAUSES, node);
  }

  public static CaseCommand newInstance(SModel sm, boolean init) {
    return (CaseCommand) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.CaseCommand", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CaseCommand newInstance(SModel sm) {
    return CaseCommand.newInstance(sm, false);
  }
}
