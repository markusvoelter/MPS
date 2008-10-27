package jetbrains.mps.lang.typesystem.runtime;

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.CopyUtil;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.pattern.ConceptMatchingPattern;
import jetbrains.mps.lang.typesystem.structure.RuntimeTypeVariable;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 16.04.2007
 * Time: 13:26:18
 * To change this template use File | Settings | File Templates.
 */
public class HUtil {

  public static SNode copyIfNecessary (SNode node) {
     if ( node != null && (node . getParent (  ) != null || node.isRoot())) {
       SNode copy = CopyUtil.copy(node, new HashMap<SNode, SNode>(), true);
       return copy;
     } else {
        return node ;
     }
  }

  public static SNode copyIfNecessary ( SNode node, TypeCheckingContext typeCheckingContext) {
     if ( node != null && (node . getParent (  ) != null || node.isRoot())) {
       SNode copy = CopyUtil.copy(node, new HashMap<SNode, SNode>(), true);
       if (BaseAdapter.isInstance(copy, RuntimeTypeVariable.class)) {
         typeCheckingContext.registerTypeVariable(copy);
       }
       return copy;
     } else {
        return node ;
     }
  }

  public static IMatchingPattern createMatchingPatternByConceptFQName(final String conceptFQName) {
    return new ConceptMatchingPattern(conceptFQName);
  }

}
