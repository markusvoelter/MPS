package jetbrains.mps.ide.scriptLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import java.util.List;

public class MigrationScript extends BaseConcept implements INamedConcept {
  public static String TITLE = "title";
  public static String NAME = "name";
  public static String PART = "part";

  public  MigrationScript(SNode node) {
    super(node);
  }

  public static MigrationScript newInstance(SModel sm, boolean init) {
    return (MigrationScript)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.scriptLanguage.MigrationScript", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MigrationScript newInstance(SModel sm) {
    return MigrationScript.newInstance(sm, false);
  }


  public String getTitle() {
    return this.getProperty(MigrationScript.TITLE);
  }

  public void setTitle(String value) {
    this.setProperty(MigrationScript.TITLE, value);
  }

  public String getName() {
    return this.getProperty(MigrationScript.NAME);
  }

  public void setName(String value) {
    this.setProperty(MigrationScript.NAME, value);
  }

  public int getPartsCount() {
    return this.getChildCount(MigrationScript.PART);
  }

  public Iterator<MigrationScriptPart_Instance> parts() {
    return this.children(MigrationScript.PART);
  }

  public List<MigrationScriptPart_Instance> getParts() {
    return this.getChildren(MigrationScript.PART);
  }

  public void addPart(MigrationScriptPart_Instance node) {
    this.addChild(MigrationScript.PART, node);
  }

  public void insertPart(MigrationScriptPart_Instance prev, MigrationScriptPart_Instance node) {
    this.insertChild(prev, MigrationScript.PART, node);
  }

}
