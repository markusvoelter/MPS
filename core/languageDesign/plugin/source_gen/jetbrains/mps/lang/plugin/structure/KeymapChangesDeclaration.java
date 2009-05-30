package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

import java.util.Iterator;
import java.util.List;

public class KeymapChangesDeclaration extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.KeymapChangesDeclaration";
  public static final String KEYMAP = "keymap";
  public static final String SHORTCUT_CHANGE = "shortcutChange";

  public KeymapChangesDeclaration(SNode node) {
    super(node);
  }

  public Keymap getKeymap() {
    String value = super.getProperty(KeymapChangesDeclaration.KEYMAP);
    return Keymap.parseValue(value);
  }

  public void setKeymap(Keymap value) {
    super.setProperty(KeymapChangesDeclaration.KEYMAP, value.getValueAsString());
  }

  public int getShortcutChangesCount() {
    return this.getChildCount(KeymapChangesDeclaration.SHORTCUT_CHANGE);
  }

  public Iterator<ShortcutChange> shortcutChanges() {
    return this.children(ShortcutChange.class, KeymapChangesDeclaration.SHORTCUT_CHANGE);
  }

  public List<ShortcutChange> getShortcutChanges() {
    return this.getChildren(ShortcutChange.class, KeymapChangesDeclaration.SHORTCUT_CHANGE);
  }

  public void addShortcutChange(ShortcutChange node) {
    this.addChild(KeymapChangesDeclaration.SHORTCUT_CHANGE, node);
  }

  public void insertShortcutChange(ShortcutChange prev, ShortcutChange node) {
    this.insertChild(prev, KeymapChangesDeclaration.SHORTCUT_CHANGE, node);
  }


  public static KeymapChangesDeclaration newInstance(SModel sm, boolean init) {
    return (KeymapChangesDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.KeymapChangesDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static KeymapChangesDeclaration newInstance(SModel sm) {
    return KeymapChangesDeclaration.newInstance(sm, false);
  }

}
