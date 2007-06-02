package jetbrains.mps.baseLanguage.blTypes.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.NamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.blTypes.structure.PrimitiveTypeRef;
import java.util.List;

public class PrimitiveTypeDescriptor extends NamedConcept {
  public static String EXTENDS = "extends";

  public  PrimitiveTypeDescriptor(SNode node) {
    super(node);
  }

  public static PrimitiveTypeDescriptor newInstance(SModel sm, boolean init) {
    return (PrimitiveTypeDescriptor)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.blTypes.PrimitiveTypeDescriptor", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static PrimitiveTypeDescriptor newInstance(SModel sm) {
    return PrimitiveTypeDescriptor.newInstance(sm, false);
  }

  public int getExtendsesCount() {
    return this.getChildCount(PrimitiveTypeDescriptor.EXTENDS);
  }
  public Iterator<PrimitiveTypeRef> extendses() {
    return this.children(PrimitiveTypeDescriptor.EXTENDS);
  }
  public List<PrimitiveTypeRef> getExtendses() {
    return this.getChildren(PrimitiveTypeDescriptor.EXTENDS);
  }
  public void addExtends(PrimitiveTypeRef node) {
    this.addChild(PrimitiveTypeDescriptor.EXTENDS, node);
  }
  public void insertExtends(PrimitiveTypeRef prev, PrimitiveTypeRef node) {
    this.insertChild(prev, PrimitiveTypeDescriptor.EXTENDS, node);
  }
}
