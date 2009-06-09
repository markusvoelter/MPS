package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DisposeEditorBlock extends ConceptFunction {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.DisposeEditorBlock";

  public DisposeEditorBlock(SNode node) {
    super(node);
  }

  public static DisposeEditorBlock newInstance(SModel sm, boolean init) {
    return (DisposeEditorBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.DisposeEditorBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DisposeEditorBlock newInstance(SModel sm) {
    return DisposeEditorBlock.newInstance(sm, false);
  }

}
