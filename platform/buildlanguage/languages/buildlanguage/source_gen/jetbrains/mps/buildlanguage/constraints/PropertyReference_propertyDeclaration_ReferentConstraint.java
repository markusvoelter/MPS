package jetbrains.mps.buildlanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.constraints.IModelConstraints;
import jetbrains.mps.smodel.constraints.INodeReferentSearchScopeProvider;
import jetbrains.mps.smodel.constraints.ModelConstraintsManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.ReferentConstraintContext;
import jetbrains.mps.smodel.search.ISearchScope;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.smodel.search.SimpleSearchScope;

public class PropertyReference_propertyDeclaration_ReferentConstraint implements IModelConstraints, INodeReferentSearchScopeProvider {

  public  PropertyReference_propertyDeclaration_ReferentConstraint() {
  }

  public void registerSelf(ModelConstraintsManager manager) {
    manager.registerNodeReferentSearchScopeProvider("jetbrains.mps.buildlanguage.structure.PropertyReference", "propertyDeclaration", this);
  }

  public void unRegisterSelf(ModelConstraintsManager manager) {
    manager.unRegisterNodeReferentSearchScopeProvider("jetbrains.mps.buildlanguage.structure.PropertyReference", "propertyDeclaration");
  }

  public boolean canCreateNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    return true;
  }

  public ISearchScope createNodeReferentSearchScope(final IOperationContext operationContext, final ReferentConstraintContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    {
      ICursor<SNode> _zCursor19 = CursorFactory.createCursor(SNodeOperations.getAncestors(_context.getEnclosingNode(), "jetbrains.mps.buildlanguage.structure.IPropertyHolder", true));
      try {
        while(_zCursor19.moveToNext()) {
          SNode holder = _zCursor19.getCurrent();
          ListOperations.addAllElements(result, IPropertyHolder_Behavior.call_getProperties_1200425502495(holder));
        }
      } finally {
        _zCursor19.release();
      }
    }
    return new SimpleSearchScope(result);
  }

  public String getNodeReferentSearchScopeDescription() {
    return "<no description>";
  }

}
